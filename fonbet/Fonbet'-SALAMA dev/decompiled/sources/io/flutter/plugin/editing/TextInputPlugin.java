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
import io.flutter.plugin.editing.ListenableEditingState;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import q5.u;
import w1.F0;
import z5.C1828j;
import z5.n;
import z5.o;
import z5.p;
import z5.q;

/* loaded from: classes2.dex */
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
    private final C1828j scribeChannel;
    private final z5.s textInputChannel;

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

    public TextInputPlugin(View view, z5.s sVar, C1828j c1828j, s sVar2, r rVar) {
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
        sVar.f18526b = new z5.r() { // from class: io.flutter.plugin.editing.TextInputPlugin.1
            @Override // z5.r
            public void clearClient() {
                TextInputPlugin.this.clearTextInputClient();
            }

            @Override // z5.r
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

            @Override // z5.r
            public void hide() {
                if (TextInputPlugin.this.inputTarget.type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                    TextInputPlugin.this.notifyViewExited();
                } else {
                    TextInputPlugin textInputPlugin = TextInputPlugin.this;
                    textInputPlugin.hideTextInput(textInputPlugin.mView);
                }
            }

            @Override // z5.r
            public void requestAutofill() {
                TextInputPlugin.this.notifyViewEntered();
            }

            @Override // z5.r
            public void sendAppPrivateCommand(String str, Bundle bundle) {
                TextInputPlugin.this.sendTextInputAppPrivateCommand(str, bundle);
            }

            @Override // z5.r
            public void setClient(int i8, n nVar) {
                TextInputPlugin.this.setTextInputClient(i8, nVar);
            }

            @Override // z5.r
            public void setEditableSizeAndTransform(double d7, double d8, double[] dArr) {
                TextInputPlugin.this.saveEditableSizeAndTransform(d7, d8, dArr);
            }

            @Override // z5.r
            public void setEditingState(q qVar) {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.setTextInputEditingState(textInputPlugin.mView, qVar);
            }

            @Override // z5.r
            public void setPlatformViewClient(int i8, boolean z4) {
                TextInputPlugin.this.setPlatformViewTextInputClient(i8, z4);
            }

            @Override // z5.r
            public void show() {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.showTextInput(textInputPlugin.mView);
            }
        };
        sVar.f18525a.a("TextInputClient.requestExistingInputState", null, null);
        this.scribeChannel = c1828j;
        this.platformViewsController = sVar2;
        sVar2.f14191f = this;
        this.platformViewsController2 = rVar;
        rVar.f14175f = this;
    }

    private static boolean composingChanged(q qVar, q qVar2) {
        int i7 = qVar.f18524e;
        int i8 = qVar.f18523d;
        int i9 = i7 - i8;
        int i10 = qVar2.f18524e;
        int i11 = qVar2.f18523d;
        if (i9 != i10 - i11) {
            return true;
        }
        for (int i12 = 0; i12 < i9; i12++) {
            if (qVar.f18520a.charAt(i12 + i8) != qVar2.f18520a.charAt(i12 + i11)) {
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int inputTypeFromTextInputType(o oVar, boolean z4, boolean z7, boolean z8, boolean z9, p pVar) {
        int i7;
        int i8 = oVar.f18512a;
        if (i8 == 2) {
            return 4;
        }
        if (i8 == 5) {
            int i9 = oVar.f18513b ? 4098 : 2;
            return oVar.f18514c ? i9 | 8192 : i9;
        }
        if (i8 == 6) {
            return 3;
        }
        if (i8 == 11) {
            return 0;
        }
        int i10 = i8 == 7 ? 131073 : (i8 == 8 || i8 == 13) ? 33 : (i8 == 9 || i8 == 12) ? 17 : i8 == 10 ? 145 : i8 == 3 ? 97 : i8 == 4 ? 113 : 1;
        if (!z4) {
            if (z7) {
                i10 |= 32768;
            }
            i7 = z8 ? 524416 : 524432;
            return pVar != p.CHARACTERS ? i10 | 4096 : pVar == p.WORDS ? i10 | 8192 : pVar == p.SENTENCES ? i10 | 16384 : i10;
        }
        i10 |= i7;
        if (pVar != p.CHARACTERS) {
        }
    }

    private boolean needsAutofill() {
        return this.autofillConfiguration != null;
    }

    private void notifyValueChanged(String str) {
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
            return;
        }
        String str2 = (String) this.configuration.j.f17373b;
        AutofillManager autofillManager = this.afm;
        View view = this.mView;
        int hashCode = str2.hashCode();
        forText = AutofillValue.forText(str);
        autofillManager.notifyValueChanged(view, hashCode, forText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewEntered() {
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
            return;
        }
        String str = (String) this.configuration.j.f17373b;
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
        this.afm.notifyViewExited(this.mView, ((String) this.configuration.j.f17373b).hashCode());
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
        F0 f02;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (nVar == null || (f02 = nVar.j) == null) {
            this.autofillConfiguration = null;
            return;
        }
        SparseArray<n> sparseArray = new SparseArray<>();
        this.autofillConfiguration = sparseArray;
        n[] nVarArr = nVar.f18511l;
        if (nVarArr == null) {
            sparseArray.put(((String) f02.f17373b).hashCode(), nVar);
            return;
        }
        for (n nVar2 : nVarArr) {
            F0 f03 = nVar2.j;
            if (f03 != null) {
                SparseArray<n> sparseArray2 = this.autofillConfiguration;
                String str = (String) f03.f17373b;
                sparseArray2.put(str.hashCode(), nVar2);
                AutofillManager autofillManager = this.afm;
                View view = this.mView;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((q) f03.f17375d).f18520a);
                autofillManager.notifyValueChanged(view, hashCode, forText);
            }
        }
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        n nVar;
        F0 f02;
        F0 f03;
        CharSequence textValue;
        if (Build.VERSION.SDK_INT < 26 || (nVar = this.configuration) == null || this.autofillConfiguration == null || (f02 = nVar.j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            n nVar2 = this.autofillConfiguration.get(sparseArray.keyAt(i7));
            if (nVar2 != null && (f03 = nVar2.j) != null) {
                textValue = b.f(sparseArray.valueAt(i7)).getTextValue();
                String charSequence = textValue.toString();
                q qVar = new q(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                String str = (String) f02.f17373b;
                String str2 = (String) f03.f17373b;
                if (str2.equals(str)) {
                    this.mEditable.setEditingState(qVar);
                } else {
                    hashMap.put(str2, qVar);
                }
            }
        }
        z5.s sVar = this.textInputChannel;
        int i8 = this.inputTarget.id;
        sVar.getClass();
        String.valueOf(hashMap.size());
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            q qVar2 = (q) entry.getValue();
            hashMap2.put((String) entry.getKey(), z5.s.a(qVar2.f18520a, qVar2.f18521b, qVar2.f18522c, -1, -1));
        }
        sVar.f18525a.a("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i8), hashMap2), null);
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
            InputConnection onCreateInputConnection = this.platformViewsController.b(inputTarget.id).onCreateInputConnection(editorInfo);
            this.lastInputConnection = onCreateInputConnection;
            return onCreateInputConnection;
        }
        n nVar = this.configuration;
        int inputTypeFromTextInputType = inputTypeFromTextInputType(nVar.f18507g, nVar.f18501a, nVar.f18502b, nVar.f18503c, nVar.f18504d, nVar.f18506f);
        editorInfo.inputType = inputTypeFromTextInputType;
        editorInfo.imeOptions = 33554432;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && !this.configuration.f18504d) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.configuration.f18508h;
        int intValue = num == null ? (inputTypeFromTextInputType & 131072) != 0 ? 1 : 6 : num.intValue();
        n nVar2 = this.configuration;
        String str = nVar2.f18509i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        String[] strArr = nVar2.f18510k;
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
        this.platformViewsController.f14191f = null;
        this.platformViewsController2.f14175f = null;
        this.textInputChannel.f18526b = null;
        notifyViewExited();
        this.mEditable.removeEditingStateListener(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.imeSyncCallback;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r6 == r1.f18524e) goto L27;
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
        ArrayList<TextEditingDelta> extractBatchTextEditingDeltas = this.mEditable.extractBatchTextEditingDeltas();
        if (this.mLastKnownFrameworkTextEditingState != null) {
            if (this.mEditable.toString().equals(this.mLastKnownFrameworkTextEditingState.f18520a)) {
                q qVar = this.mLastKnownFrameworkTextEditingState;
                if (selectionStart == qVar.f18521b) {
                    if (selectionEnd == qVar.f18522c) {
                        if (composingStart == qVar.f18523d) {
                        }
                    }
                }
            }
            this.mEditable.toString();
            if (this.configuration.f18505e) {
                z5.s sVar = this.textInputChannel;
                int i7 = this.inputTarget.id;
                sVar.getClass();
                extractBatchTextEditingDeltas.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator<TextEditingDelta> it = extractBatchTextEditingDeltas.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toJSON());
                }
                hashMap.put("deltas", jSONArray);
                sVar.f18525a.a("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i7), hashMap), null);
                this.mEditable.clearBatchDeltas();
            } else {
                z5.s sVar2 = this.textInputChannel;
                int i8 = this.inputTarget.id;
                String listenableEditingState = this.mEditable.toString();
                sVar2.getClass();
                sVar2.f18525a.a("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i8), z5.s.a(listenableEditingState, selectionStart, selectionEnd, composingStart, composingEnd)), null);
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
        AutofillId autofillId;
        AutofillValue forText;
        Rect rect;
        AutofillValue forText2;
        if (Build.VERSION.SDK_INT < 26 || !needsAutofill()) {
            return;
        }
        String str = (String) this.configuration.j.f17373b;
        autofillId = viewStructure.getAutofillId();
        for (int i8 = 0; i8 < this.autofillConfiguration.size(); i8++) {
            int keyAt = this.autofillConfiguration.keyAt(i8);
            F0 f02 = this.autofillConfiguration.valueAt(i8).j;
            if (f02 != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i8);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = (String[]) f02.f17374c;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = (String) f02.f17376e;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = this.lastClientRect) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    forText = AutofillValue.forText(((q) f02.f17375d).f18520a);
                    newChild.setAutofillValue(forText);
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.lastClientRect.height());
                    forText2 = AutofillValue.forText(this.mEditable);
                    newChild.setAutofillValue(forText2);
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
        F0 f02 = nVar.j;
        this.mEditable = new ListenableEditingState(f02 != null ? (q) f02.f17375d : null, this.mView);
        updateAutofillConfigurationIfNeeded(nVar);
        this.mRestartInputPending = true;
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
        this.mEditable.addEditingStateListener(this);
    }

    public void setTextInputEditingState(View view, q qVar) {
        q qVar2;
        int i7;
        if (!this.mRestartInputPending && (qVar2 = this.mLastKnownFrameworkTextEditingState) != null && (i7 = qVar2.f18523d) >= 0 && qVar2.f18524e > i7) {
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
        if (nVar != null && nVar.f18507g.f18512a == 11) {
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
