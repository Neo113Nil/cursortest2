package io.flutter.plugin.editing;

import U.c;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import p121q5.u;
import p155w1.F0;
import p174z5.j;
import p174z5.n;
import p174z5.o;
import p174z5.p;
import p174z5.q;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputPlugin implements ListenableEditingState.EditingStateWatcher {
    private static final String TAG = "TextInputPlugin";
    private final AutofillManager afm;
    private SparseArray<n> autofillConfiguration;
    private n configuration;
    private ImeSyncDeferringInsetsCallback imeSyncCallback;
    private InputTarget inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
    private boolean isInputConnectionLocked;
    private Rect lastClientRect;
    private InputConnection lastInputConnection;
    private ListenableEditingState mEditable;
    private final InputMethodManager mImm;
    private q mLastKnownFrameworkTextEditingState;
    private boolean mRestartInputPending;
    private final View mView;
    private s platformViewsController;
    private r platformViewsController2;
    private final j scribeChannel;
    private final p174z5.s textInputChannel;

    public static class InputTarget {
        int id;
        Type type;

        public enum Type {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public InputTarget(Type type, int i7) {
            this.type = type;
            this.id = i7;
        }
    }

    public interface MinMax {
        void inspect(double d7, double d8);
    }

    public TextInputPlugin(View view, p174z5.s sVar, j jVar, s sVar2, r rVar) {
        this.mView = view;
        this.mEditable = new ListenableEditingState(null, view);
        this.mImm = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            this.afm = N.b.l(view.getContext().getSystemService(b.j()));
        } else {
            this.afm = null;
        }
        if (i7 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.imeSyncCallback = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.textInputChannel = sVar;
        sVar.f18532b = new p174z5.r() { // from class: io.flutter.plugin.editing.TextInputPlugin.1
            @Override // p174z5.r
            public void clearClient() {
                TextInputPlugin.this.clearTextInputClient();
            }

            @Override // p174z5.r
            public void finishAutofillContext(boolean z4) {
                if (Build.VERSION.SDK_INT < 26 || TextInputPlugin.this.afm == null) {
                    return;
                }
                if (z4) {
                    TextInputPlugin.this.afm.commit();
                } else {
                    TextInputPlugin.this.afm.cancel();
                }
            }

            @Override // p174z5.r
            public void hide() {
                if (TextInputPlugin.this.inputTarget.type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                    TextInputPlugin.this.notifyViewExited();
                } else {
                    TextInputPlugin textInputPlugin = TextInputPlugin.this;
                    textInputPlugin.hideTextInput(textInputPlugin.mView);
                }
            }

            @Override // p174z5.r
            public void requestAutofill() {
                TextInputPlugin.this.notifyViewEntered();
            }

            @Override // p174z5.r
            public void sendAppPrivateCommand(String str, Bundle bundle) {
                TextInputPlugin.this.sendTextInputAppPrivateCommand(str, bundle);
            }

            @Override // p174z5.r
            public void setClient(int i8, n nVar) {
                TextInputPlugin.this.setTextInputClient(i8, nVar);
            }

            @Override // p174z5.r
            public void setEditableSizeAndTransform(double d7, double d8, double[] dArr) {
                TextInputPlugin.this.saveEditableSizeAndTransform(d7, d8, dArr);
            }

            @Override // p174z5.r
            public void setEditingState(q qVar) {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.setTextInputEditingState(textInputPlugin.mView, qVar);
            }

            @Override // p174z5.r
            public void setPlatformViewClient(int i8, boolean z4) {
                TextInputPlugin.this.setPlatformViewTextInputClient(i8, z4);
            }

            @Override // p174z5.r
            public void show() {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.showTextInput(textInputPlugin.mView);
            }
        };
        sVar.f18531a.a("TextInputClient.requestExistingInputState", null, null);
        this.scribeChannel = jVar;
        this.platformViewsController = sVar2;
        sVar2.f14197f = this;
        this.platformViewsController2 = rVar;
        rVar.f14181f = this;
    }

    private static boolean composingChanged(q qVar, q qVar2) {
        int i7 = qVar.f18530e;
        int i8 = qVar.f18529d;
        int i9 = i7 - i8;
        int i10 = qVar2.f18530e;
        int i11 = qVar2.f18529d;
        if (i9 != i10 - i11) {
            return true;
        }
        for (int i12 = 0; i12 < i9; i12++) {
            if (qVar.f18526a.charAt(i12 + i8) != qVar2.f18526a.charAt(i12 + i11)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideTextInput(View view) {
        notifyViewExited();
        this.mImm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x006a  */
    /* JADX WARN: Code duplicated, block: B:54:0x006d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0071  */
    /* JADX WARN: Code duplicated, block: B:57:0x0074  */
    /* JADX WARN: Code duplicated, block: B:59:0x0078  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    private static int inputTypeFromTextInputType(o oVar, boolean z4, boolean z7, boolean z8, boolean z9, p pVar) {
        int i7;
        int i8;
        int i9 = oVar.f18518a;
        if (i9 == 2) {
            return 4;
        }
        if (i9 == 5) {
            int i10 = oVar.f18519b ? 4098 : 2;
            return oVar.f18520c ? i10 | 8192 : i10;
        }
        if (i9 == 6) {
            return 3;
        }
        if (i9 == 11) {
            return 0;
        }
        if (i9 == 7) {
            i7 = 131073;
        } else if (i9 == 8 || i9 == 13) {
            i7 = 33;
        } else if (i9 == 9 || i9 == 12) {
            i7 = 17;
        } else if (i9 == 10) {
            i7 = 145;
        } else if (i9 == 3) {
            i7 = 97;
        } else {
            i7 = i9 == 4 ? 113 : 1;
        }
        if (!z4) {
            if (z7) {
                i7 |= 32768;
            }
            i8 = z8 ? 524416 : 524432;
            if (pVar == p.CHARACTERS) {
                return i7 | 4096;
            }
            if (pVar == p.WORDS) {
                return i7 | 8192;
            }
            if (pVar == p.SENTENCES) {
                return i7 | 16384;
            }
            return i7;
        }
        i7 |= i8;
        if (pVar == p.CHARACTERS) {
            return i7 | 4096;
        }
        if (pVar == p.WORDS) {
            return i7 | 8192;
        }
        if (pVar == p.SENTENCES) {
            return i7 | 16384;
        }
        return i7;
    }

    private boolean needsAutofill() {
        return this.autofillConfiguration != null;
    }

    private void notifyValueChanged(String str) {
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
            return;
        }
        this.afm.notifyValueChanged(this.mView, ((String) this.configuration.j.f17379b).hashCode(), AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewEntered() {
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
            return;
        }
        String str = (String) this.configuration.j.f17379b;
        int[] iArr = new int[2];
        this.mView.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.lastClientRect);
        rect.offset(iArr[0], iArr[1]);
        this.afm.notifyViewEntered(this.mView, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewExited() {
        n nVar;
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || (nVar = this.configuration) == null || nVar.j == null || !needsAutofill()) {
            return;
        }
        this.afm.notifyViewExited(this.mView, ((String) this.configuration.j.f17379b).hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveEditableSizeAndTransform(double d7, double d8, final double[] dArr) {
        final double[] dArr2 = new double[4];
        final boolean z4 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d9 = dArr[12];
        double d10 = dArr[15];
        double d11 = d9 / d10;
        dArr2[1] = d11;
        dArr2[0] = d11;
        double d12 = dArr[13] / d10;
        dArr2[3] = d12;
        dArr2[2] = d12;
        MinMax minMax = new MinMax() { // from class: io.flutter.plugin.editing.TextInputPlugin.2
            @Override // io.flutter.plugin.editing.TextInputPlugin.MinMax
            public void inspect(double d13, double d14) {
                double d15 = 1.0d;
                if (!z4) {
                    double[] dArr3 = dArr;
                    d15 = 1.0d / (((dArr3[7] * d14) + (dArr3[3] * d13)) + dArr3[15]);
                }
                double[] dArr4 = dArr;
                double d16 = ((dArr4[4] * d14) + (dArr4[0] * d13) + dArr4[12]) * d15;
                double d17 = ((dArr4[5] * d14) + (dArr4[1] * d13) + dArr4[13]) * d15;
                double[] dArr5 = dArr2;
                if (d16 < dArr5[0]) {
                    dArr5[0] = d16;
                } else if (d16 > dArr5[1]) {
                    dArr5[1] = d16;
                }
                if (d17 < dArr5[2]) {
                    dArr5[2] = d17;
                } else if (d17 > dArr5[3]) {
                    dArr5[3] = d17;
                }
            }
        };
        minMax.inspect(d7, 0.0d);
        minMax.inspect(d7, d8);
        minMax.inspect(0.0d, d8);
        double d13 = this.mView.getContext().getResources().getDisplayMetrics().density;
        this.lastClientRect = new Rect((int) (dArr2[0] * d13), (int) (dArr2[2] * d13), (int) Math.ceil(dArr2[1] * d13), (int) Math.ceil(dArr2[3] * d13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformViewTextInputClient(int i7, boolean z4) {
        if (!z4) {
            this.inputTarget = new InputTarget(InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW, i7);
            this.lastInputConnection = null;
        } else {
            this.mView.requestFocus();
            this.inputTarget = new InputTarget(InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW, i7);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    private void updateAutofillConfigurationIfNeeded(n nVar) {
        F0 f7;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (nVar == null || (f7 = nVar.j) == null) {
            this.autofillConfiguration = null;
            return;
        }
        SparseArray<n> sparseArray = new SparseArray<>();
        this.autofillConfiguration = sparseArray;
        n[] nVarArr = nVar.f18517l;
        if (nVarArr == null) {
            sparseArray.put(((String) f7.f17379b).hashCode(), nVar);
            return;
        }
        for (n nVar2 : nVarArr) {
            F0 f8 = nVar2.j;
            if (f8 != null) {
                SparseArray<n> sparseArray2 = this.autofillConfiguration;
                String str = (String) f8.f17379b;
                sparseArray2.put(str.hashCode(), nVar2);
                this.afm.notifyValueChanged(this.mView, str.hashCode(), AutofillValue.forText(((q) f8.f17381d).f18526a));
            }
        }
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        n nVar;
        F0 f7;
        F0 f8;
        if (Build.VERSION.SDK_INT < 26 || (nVar = this.configuration) == null || this.autofillConfiguration == null || (f7 = nVar.j) == null) {
            return;
        }
        HashMap map = new HashMap();
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            n nVar2 = this.autofillConfiguration.get(sparseArray.keyAt(i7));
            if (nVar2 != null && (f8 = nVar2.j) != null) {
                String string = b.f(sparseArray.valueAt(i7)).getTextValue().toString();
                q qVar = new q(string, string.length(), string.length(), -1, -1);
                String str = (String) f7.f17379b;
                String str2 = (String) f8.f17379b;
                if (str2.equals(str)) {
                    this.mEditable.setEditingState(qVar);
                } else {
                    map.put(str2, qVar);
                }
            }
        }
        p174z5.s sVar = this.textInputChannel;
        int i8 = this.inputTarget.id;
        sVar.getClass();
        String.valueOf(map.size());
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            q qVar2 = (q) entry.getValue();
            map2.put((String) entry.getKey(), p174z5.s.a(qVar2.f18526a, qVar2.f18527b, qVar2.f18528c, -1, -1));
        }
        sVar.f18531a.a("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i8), map2), null);
    }

    public void clearPlatformViewClient(int i7) {
        InputTarget inputTarget = this.inputTarget;
        InputTarget.Type type = inputTarget.type;
        if ((type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW || type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) && inputTarget.id == i7) {
            this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
            notifyViewExited();
            this.mImm.hideSoftInputFromWindow(this.mView.getApplicationWindowToken(), 0);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    public void clearTextInputClient() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.mEditable.removeEditingStateListener(this);
        notifyViewExited();
        this.configuration = null;
        updateAutofillConfigurationIfNeeded(null);
        this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
    }

    public InputConnection createInputConnection(View view, u uVar, EditorInfo editorInfo) {
        int iIntValue;
        InputTarget inputTarget = this.inputTarget;
        InputTarget.Type type = inputTarget.type;
        if (type == InputTarget.Type.NO_TARGET) {
            this.lastInputConnection = null;
            return null;
        }
        if (type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.isInputConnectionLocked) {
                return this.lastInputConnection;
            }
            InputConnection inputConnectionOnCreateInputConnection = this.platformViewsController.b(inputTarget.id).onCreateInputConnection(editorInfo);
            this.lastInputConnection = inputConnectionOnCreateInputConnection;
            return inputConnectionOnCreateInputConnection;
        }
        n nVar = this.configuration;
        int iInputTypeFromTextInputType = inputTypeFromTextInputType(nVar.f18513g, nVar.f18507a, nVar.f18508b, nVar.f18509c, nVar.f18510d, nVar.f18512f);
        editorInfo.inputType = iInputTypeFromTextInputType;
        editorInfo.imeOptions = 33554432;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && !this.configuration.f18510d) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.configuration.f18514h;
        if (num == null) {
            iIntValue = (iInputTypeFromTextInputType & 131072) != 0 ? 1 : 6;
        } else {
            iIntValue = num.intValue();
        }
        n nVar2 = this.configuration;
        String str = nVar2.f18515i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = iIntValue;
        }
        editorInfo.imeOptions = iIntValue | editorInfo.imeOptions;
        String[] strArr = nVar2.f18516k;
        if (strArr != null) {
            c.a(editorInfo, strArr);
        }
        if (i7 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        InputConnectionAdaptor inputConnectionAdaptor = new InputConnectionAdaptor(view, this.inputTarget.id, this.textInputChannel, this.scribeChannel, uVar, this.mEditable, editorInfo);
        editorInfo.initialSelStart = this.mEditable.getSelectionStart();
        editorInfo.initialSelEnd = this.mEditable.getSelectionEnd();
        this.lastInputConnection = inputConnectionAdaptor;
        return inputConnectionAdaptor;
    }

    public void destroy() {
        this.platformViewsController.f14197f = null;
        this.platformViewsController2.f14181f = null;
        this.textInputChannel.f18532b = null;
        notifyViewExited();
        this.mEditable.removeEditingStateListener(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.imeSyncCallback;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r6 == r1.f18530e) goto L27;
     */
    @Override // io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void didChangeEditingState(boolean z4, boolean z7, boolean z8) {
        if (z4) {
            notifyValueChanged(this.mEditable.toString());
        }
        int selectionStart = this.mEditable.getSelectionStart();
        int selectionEnd = this.mEditable.getSelectionEnd();
        int composingStart = this.mEditable.getComposingStart();
        int composingEnd = this.mEditable.getComposingEnd();
        ArrayList<TextEditingDelta> arrayListExtractBatchTextEditingDeltas = this.mEditable.extractBatchTextEditingDeltas();
        if (this.mLastKnownFrameworkTextEditingState != null) {
            if (this.mEditable.toString().equals(this.mLastKnownFrameworkTextEditingState.f18526a)) {
                q qVar = this.mLastKnownFrameworkTextEditingState;
                if (selectionStart == qVar.f18527b) {
                    if (selectionEnd == qVar.f18528c) {
                        if (composingStart == qVar.f18529d) {
                        }
                    }
                }
            }
            this.mEditable.toString();
            if (this.configuration.f18511e) {
                p174z5.s sVar = this.textInputChannel;
                int i7 = this.inputTarget.id;
                sVar.getClass();
                arrayListExtractBatchTextEditingDeltas.size();
                HashMap map = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator<TextEditingDelta> it = arrayListExtractBatchTextEditingDeltas.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toJSON());
                }
                map.put("deltas", jSONArray);
                sVar.f18531a.a("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i7), map), null);
                this.mEditable.clearBatchDeltas();
            } else {
                p174z5.s sVar2 = this.textInputChannel;
                int i8 = this.inputTarget.id;
                String string = this.mEditable.toString();
                sVar2.getClass();
                sVar2.f18531a.a("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i8), p174z5.s.a(string, selectionStart, selectionEnd, composingStart, composingEnd)), null);
            }
            this.mLastKnownFrameworkTextEditingState = new q(this.mEditable.toString(), selectionStart, selectionEnd, composingStart, composingEnd);
            return;
        }
        this.mEditable.clearBatchDeltas();
    }

    public Editable getEditable() {
        return this.mEditable;
    }

    public ImeSyncDeferringInsetsCallback getImeSyncCallback() {
        return this.imeSyncCallback;
    }

    public InputMethodManager getInputMethodManager() {
        return this.mImm;
    }

    public InputConnection getLastInputConnection() {
        return this.lastInputConnection;
    }

    public boolean handleKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!getInputMethodManager().isAcceptingText() || (inputConnection = this.lastInputConnection) == null) {
            return false;
        }
        return inputConnection instanceof InputConnectionAdaptor ? ((InputConnectionAdaptor) inputConnection).handleKeyEvent(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void lockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = true;
        }
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i7) {
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !needsAutofill()) {
            return;
        }
        String str = (String) this.configuration.j.f17379b;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i8 = 0; i8 < this.autofillConfiguration.size(); i8++) {
            int iKeyAt = this.autofillConfiguration.keyAt(i8);
            F0 f7 = this.autofillConfiguration.valueAt(i8).j;
            if (f7 != null) {
                viewStructure.addChildCount(1);
                ViewStructure viewStructureNewChild = viewStructure.newChild(i8);
                viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                String[] strArr = (String[]) f7.f17380c;
                if (strArr.length > 0) {
                    viewStructureNewChild.setAutofillHints(strArr);
                }
                viewStructureNewChild.setAutofillType(1);
                viewStructureNewChild.setVisibility(0);
                String str2 = (String) f7.f17382e;
                if (str2 != null) {
                    viewStructureNewChild.setHint(str2);
                }
                if (str.hashCode() != iKeyAt || (rect = this.lastClientRect) == null) {
                    viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
                    viewStructureNewChild.setAutofillValue(AutofillValue.forText(((q) f7.f17381d).f18526a));
                } else {
                    viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.lastClientRect.height());
                    viewStructureNewChild.setAutofillValue(AutofillValue.forText(this.mEditable));
                }
            }
        }
    }

    public void sendTextInputAppPrivateCommand(String str, Bundle bundle) {
        this.mImm.sendAppPrivateCommand(this.mView, str, bundle);
    }

    public void setTextInputClient(int i7, n nVar) {
        notifyViewExited();
        this.configuration = nVar;
        this.inputTarget = new InputTarget(InputTarget.Type.FRAMEWORK_CLIENT, i7);
        this.mEditable.removeEditingStateListener(this);
        F0 f7 = nVar.j;
        this.mEditable = new ListenableEditingState(f7 != null ? (q) f7.f17381d : null, this.mView);
        updateAutofillConfigurationIfNeeded(nVar);
        this.mRestartInputPending = true;
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
        this.mEditable.addEditingStateListener(this);
    }

    public void setTextInputEditingState(View view, q qVar) {
        q qVar2;
        int i7;
        if (!this.mRestartInputPending && (qVar2 = this.mLastKnownFrameworkTextEditingState) != null && (i7 = qVar2.f18529d) >= 0 && qVar2.f18530e > i7) {
            this.mRestartInputPending = composingChanged(qVar2, qVar);
        }
        this.mLastKnownFrameworkTextEditingState = qVar;
        this.mEditable.setEditingState(qVar);
        if (this.mRestartInputPending) {
            this.mImm.restartInput(view);
            this.mRestartInputPending = false;
        }
    }

    public void showTextInput(View view) {
        n nVar = this.configuration;
        if (nVar != null && nVar.f18513g.f18518a == 11) {
            hideTextInput(view);
        } else {
            view.requestFocus();
            this.mImm.showSoftInput(view, 0);
        }
    }

    public void unlockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = false;
        }
    }
}
