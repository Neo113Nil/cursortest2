package E0;

import Q1.C3832a;
import Q1.C3839h;
import Q1.C3840i;
import Q1.C3845n;
import Q1.C3848q;
import Q1.InterfaceC3841j;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.c2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class InputConnectionC2944r0 implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2929j0 f7292a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7293b;

    /* renamed from: c, reason: collision with root package name */
    private final B0.O0 f7294c;

    /* renamed from: d, reason: collision with root package name */
    private final I0.W0 f7295d;

    /* renamed from: e, reason: collision with root package name */
    private final c2 f7296e;

    /* renamed from: f, reason: collision with root package name */
    private int f7297f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private Q1.K f7298g;

    /* renamed from: h, reason: collision with root package name */
    private int f7299h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7300i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ArrayList f7301j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private boolean f7302k = true;

    /* renamed from: E0.r0$a */
    static final class a extends AbstractC7737t implements Function1<InterfaceC3841j, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC3841j interfaceC3841j) {
            InputConnectionC2944r0.this.c(interfaceC3841j);
            return Unit.f71690a;
        }
    }

    public InputConnectionC2944r0(@NotNull Q1.K k11, @NotNull C2929j0 c2929j0, boolean z11, B0.O0 o02, I0.W0 w02, c2 c2Var) {
        this.f7292a = c2929j0;
        this.f7293b = z11;
        this.f7294c = o02;
        this.f7295d = w02;
        this.f7296e = c2Var;
        this.f7298g = k11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(InterfaceC3841j interfaceC3841j) {
        this.f7297f++;
        try {
            this.f7301j.add(interfaceC3841j);
        } finally {
            d();
        }
    }

    private final boolean d() {
        Function1 function1;
        int i11 = this.f7297f - 1;
        this.f7297f = i11;
        if (i11 == 0) {
            ArrayList arrayList = this.f7301j;
            if (!arrayList.isEmpty()) {
                ArrayList W02 = C7714v.W0(arrayList);
                function1 = this.f7292a.f7254a.f7266c;
                function1.invoke(W02);
                arrayList.clear();
            }
        }
        return this.f7297f > 0;
    }

    private final void e(int i11) {
        sendKeyEvent(new KeyEvent(0, i11));
        sendKeyEvent(new KeyEvent(1, i11));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z11 = this.f7302k;
        if (!z11) {
            return z11;
        }
        this.f7297f++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i11) {
        boolean z11 = this.f7302k;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        this.f7301j.clear();
        this.f7297f = 0;
        this.f7302k = false;
        C2935m0 c2935m0 = this.f7292a.f7254a;
        arrayList = c2935m0.f7273j;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2 = c2935m0.f7273j;
            if (Intrinsics.d(((WeakReference) arrayList2.get(i11)).get(), this)) {
                arrayList3 = c2935m0.f7273j;
                arrayList3.remove(i11);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z11 = this.f7302k;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(@NotNull InputContentInfo inputContentInfo, int i11, Bundle bundle) {
        boolean z11 = this.f7302k;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z11 = this.f7302k;
        return z11 ? this.f7293b : z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i11) {
        boolean z11 = this.f7302k;
        if (z11) {
            c(new C3832a(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i11, int i12) {
        boolean z11 = this.f7302k;
        if (!z11) {
            return z11;
        }
        c(new C3839h(i11, i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        boolean z11 = this.f7302k;
        if (!z11) {
            return z11;
        }
        c(new C3840i(i11, i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return d();
    }

    public final void f(@NotNull Q1.K k11) {
        this.f7298g = k11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z11 = this.f7302k;
        if (!z11) {
            return z11;
        }
        c(new C3845n());
        return true;
    }

    public final void g(@NotNull Q1.K k11, @NotNull C2913b0 c2913b0) {
        if (this.f7302k) {
            this.f7298g = k11;
            if (this.f7300i) {
                c2913b0.g(this.f7299h, C2946s0.a(k11));
            }
            K1.Q d11 = k11.d();
            int h11 = d11 != null ? K1.Q.h(d11.k()) : -1;
            K1.Q d12 = k11.d();
            c2913b0.h(K1.Q.h(k11.e()), K1.Q.g(k11.e()), h11, d12 != null ? K1.Q.g(d12.k()) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i11) {
        return TextUtils.getCapsMode(this.f7298g.f(), K1.Q.h(this.f7298g.e()), i11);
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i11) {
        boolean z11 = (i11 & 1) != 0;
        this.f7300i = z11;
        if (z11) {
            this.f7299h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return C2946s0.a(this.f7298g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i11) {
        if (K1.Q.e(this.f7298g.e())) {
            return null;
        }
        return Q1.L.a(this.f7298g).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public final CharSequence getTextAfterCursor(int i11, int i12) {
        return Q1.L.b(this.f7298g, i11).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public final CharSequence getTextBeforeCursor(int i11, int i12) {
        return Q1.L.c(this.f7298g, i11).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i11) {
        boolean z11 = this.f7302k;
        if (z11) {
            z11 = false;
            switch (i11) {
                case R.id.selectAll:
                    c(new Q1.J(0, this.f7298g.f().length()));
                    break;
                case R.id.cut:
                    e(277);
                    return false;
                case R.id.copy:
                    e(278);
                    return false;
                case R.id.paste:
                    e(279);
                    return false;
                default:
                    return false;
            }
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i11) {
        int i12;
        Function1 function1;
        boolean z11 = this.f7302k;
        if (z11) {
            z11 = true;
            if (i11 != 0) {
                switch (i11) {
                    case 2:
                        i12 = 2;
                        break;
                    case 3:
                        i12 = 3;
                        break;
                    case 4:
                        i12 = 4;
                        break;
                    case 5:
                        i12 = 6;
                        break;
                    case 6:
                        i12 = 7;
                        break;
                    case 7:
                        i12 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i11);
                        break;
                }
                function1 = this.f7292a.f7254a.f7267d;
                function1.invoke(C3848q.a(i12));
            }
            i12 = 1;
            function1 = this.f7292a.f7254a.f7267d;
            function1.invoke(C3848q.a(i12));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(@NotNull HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            C2932l c2932l = C2932l.f7259a;
            a aVar = new a();
            c2932l.a(this.f7294c, this.f7295d, handwritingGesture, this.f7296e, executor, intConsumer, aVar);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z11 = this.f7302k;
        if (z11) {
            return true;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(@NotNull PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C2932l.f7259a.b(this.f7294c, this.f7295d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z11) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        C2921f0 c2921f0;
        boolean z15 = this.f7302k;
        if (!z15) {
            return z15;
        }
        boolean z16 = false;
        boolean z17 = (i11 & 1) != 0;
        boolean z18 = (i11 & 2) != 0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            boolean z19 = (i11 & 16) != 0;
            boolean z21 = (i11 & 8) != 0;
            boolean z22 = (i11 & 4) != 0;
            if (i12 >= 34 && (i11 & 32) != 0) {
                z16 = true;
            }
            if (z19 || z21 || z22 || z16) {
                z14 = z16;
                z13 = z22;
                z12 = z21;
                z11 = z19;
            } else {
                z11 = true;
                z12 = true;
                if (i12 >= 34) {
                    z13 = true;
                } else {
                    z13 = true;
                    z14 = z16;
                }
            }
            c2921f0 = this.f7292a.f7254a.f7276m;
            c2921f0.b(z17, z18, z11, z12, z13, z14);
            return true;
        }
        z11 = true;
        z12 = true;
        z13 = false;
        z14 = z13;
        c2921f0 = this.f7292a.f7254a.f7276m;
        c2921f0.b(z17, z18, z11, z12, z13, z14);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(@NotNull KeyEvent keyEvent) {
        boolean z11 = this.f7302k;
        if (!z11) {
            return z11;
        }
        C2935m0.b(this.f7292a.f7254a).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i11, int i12) {
        boolean z11 = this.f7302k;
        if (z11) {
            c(new Q1.H(i11, i12));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i11) {
        boolean z11 = this.f7302k;
        if (z11) {
            c(new Q1.I(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i11, int i12) {
        boolean z11 = this.f7302k;
        if (!z11) {
            return z11;
        }
        c(new Q1.J(i11, i12));
        return true;
    }
}
