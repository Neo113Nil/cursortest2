package E0;

import E0.C2924h;
import E0.F0;
import Q1.C3848q;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.w0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class InputConnectionC2954w0 implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2924h.d f7312a;

    /* renamed from: b, reason: collision with root package name */
    private int f7313b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final U0.b<Function1<I, Unit>> f7314c = new U0.b<>(new Function1[16]);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InputConnection f7315d;

    /* renamed from: E0.w0$a */
    static final class a extends AbstractC7737t implements Function1<I, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f7316b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7317c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, CharSequence charSequence) {
            super(1);
            this.f7316b = charSequence;
            this.f7317c = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(I i11) {
            H.a(i11, String.valueOf(this.f7316b), this.f7317c);
            return Unit.f71690a;
        }
    }

    /* renamed from: E0.w0$b */
    static final class b extends AbstractC7737t implements Function1<I, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7318b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7319c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, int i12) {
            super(1);
            this.f7318b = i11;
            this.f7319c = i12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(I i11) {
            I i12 = i11;
            int i13 = this.f7318b;
            int i14 = this.f7319c;
            if (i13 < 0 || i14 < 0) {
                throw new IllegalArgumentException(Cm.e.c("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i13, " and ", " respectively.", i14).toString());
            }
            int n11 = i12.n();
            int i15 = n11 + i14;
            if (((i14 ^ i15) & (n11 ^ i15)) < 0) {
                i15 = i12.l();
            }
            i12.d(i12.n(), Math.min(i15, i12.l()));
            int o11 = i12.o();
            int i16 = o11 - i13;
            if (((i13 ^ o11) & (o11 ^ i16)) < 0) {
                i16 = 0;
            }
            i12.d(Math.max(0, i16), i12.o());
            return Unit.f71690a;
        }
    }

    /* renamed from: E0.w0$c */
    static final class c extends AbstractC7737t implements Function1<I, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7320b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7321c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, int i12) {
            super(1);
            this.f7320b = i11;
            this.f7321c = i12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(I i11) {
            I i12 = i11;
            int i13 = this.f7320b;
            int i14 = this.f7321c;
            if (i13 < 0 || i14 < 0) {
                throw new IllegalArgumentException(Cm.e.c("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i13, " and ", " respectively.", i14).toString());
            }
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (i16 < i13) {
                    int i18 = i17 + 1;
                    if (i12.o() <= i18) {
                        i17 = i12.o();
                        break;
                    }
                    i17 = (Character.isHighSurrogate(i12.e((i12.o() - i18) + (-1))) && Character.isLowSurrogate(i12.e(i12.o() - i18))) ? i17 + 2 : i18;
                    i16++;
                } else {
                    break;
                }
            }
            int i19 = 0;
            while (true) {
                if (i15 >= i14) {
                    break;
                }
                int i21 = i19 + 1;
                if (i12.n() + i21 >= i12.l()) {
                    i19 = i12.l() - i12.n();
                    break;
                }
                i19 = (Character.isHighSurrogate(i12.e((i12.n() + i21) + (-1))) && Character.isLowSurrogate(i12.e(i12.n() + i21))) ? i19 + 2 : i21;
                i15++;
            }
            i12.d(i12.n(), i12.n() + i19);
            i12.d(i12.o() - i17, i12.o());
            return Unit.f71690a;
        }
    }

    /* renamed from: E0.w0$d */
    static final class d extends AbstractC7737t implements Function1<I, Unit> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(I i11) {
            I i12 = i11;
            U0.b bVar = InputConnectionC2954w0.this.f7314c;
            int m11 = bVar.m();
            if (m11 > 0) {
                Object[] l11 = bVar.l();
                int i13 = 0;
                do {
                    ((Function1) l11[i13]).invoke(i12);
                    i13++;
                } while (i13 < m11);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: E0.w0$e */
    static final class e extends AbstractC7737t implements Function1<I, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f7323b = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(I i11) {
            i11.c();
            return Unit.f71690a;
        }
    }

    /* renamed from: E0.w0$f */
    static final class f extends AbstractC7737t implements Function1<I, Unit> {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(I i11) {
            i11.t(0, InputConnectionC2954w0.d(InputConnectionC2954w0.this).length());
            return Unit.f71690a;
        }
    }

    /* renamed from: E0.w0$g */
    static final class g extends AbstractC7737t implements Function1<I, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7325b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7326c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i11, int i12) {
            super(1);
            this.f7325b = i11;
            this.f7326c = i12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(I i11) {
            I i12 = i11;
            if (i12.p()) {
                i12.c();
            }
            int e11 = kotlin.ranges.h.e(this.f7325b, 0, i12.l());
            int e12 = kotlin.ranges.h.e(this.f7326c, 0, i12.l());
            if (e11 != e12) {
                if (e11 < e12) {
                    i12.r(e11, e12);
                } else {
                    i12.r(e12, e11);
                }
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: E0.w0$h */
    static final class h extends AbstractC7737t implements Function1<I, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f7327b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7328c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i11, CharSequence charSequence) {
            super(1);
            this.f7327b = charSequence;
            this.f7328c = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(I i11) {
            I i12 = i11;
            String valueOf = String.valueOf(this.f7327b);
            if (i12.p()) {
                int i13 = i12.i();
                i12.q(i13, i12.h(), valueOf);
                if (valueOf.length() > 0) {
                    i12.r(i13, valueOf.length() + i13);
                }
            } else {
                int o11 = i12.o();
                i12.q(o11, i12.n(), valueOf);
                if (valueOf.length() > 0) {
                    i12.r(o11, valueOf.length() + o11);
                }
            }
            int j11 = i12.j();
            int i14 = this.f7328c;
            int e11 = kotlin.ranges.h.e(i14 > 0 ? (j11 + i14) - 1 : (j11 + i14) - valueOf.length(), 0, i12.l());
            i12.t(e11, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: E0.w0$i */
    static final class i extends AbstractC7737t implements Function1<I, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7329b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7330c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i11, int i12) {
            super(1);
            this.f7329b = i11;
            this.f7330c = i12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(I i11) {
            i11.t(this.f7329b, this.f7330c);
            return Unit.f71690a;
        }
    }

    public InputConnectionC2954w0(@NotNull C2924h.d dVar, @NotNull EditorInfo editorInfo) {
        this.f7312a = dVar;
        this.f7315d = B2.c.a(new C2956x0(this, false), editorInfo, new C2952v0(this));
    }

    public static final D0.a d(InputConnectionC2954w0 inputConnectionC2954w0) {
        return inputConnectionC2954w0.f7312a.f7241a.j();
    }

    private final void e(Function1<? super I, Unit> function1) {
        this.f7313b++;
        try {
            this.f7314c.b(function1);
        } finally {
            f();
        }
    }

    private final boolean f() {
        D0.e eVar;
        int i11 = this.f7313b - 1;
        this.f7313b = i11;
        if (i11 == 0) {
            U0.b<Function1<I, Unit>> bVar = this.f7314c;
            if (bVar.p()) {
                d dVar = new d();
                eVar = this.f7312a.f7241a.f7171a;
                G0.c cVar = G0.c.MergeIfPossible;
                eVar.d().f().b();
                dVar.invoke(eVar.d());
                D0.e.a(eVar, false, cVar);
                bVar.h();
            }
        }
        return this.f7313b > 0;
    }

    private final void g(int i11) {
        sendKeyEvent(new KeyEvent(0, i11));
        sendKeyEvent(new KeyEvent(1, i11));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f7313b++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i11) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f7314c.h();
        this.f7313b = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(@NotNull InputContentInfo inputContentInfo, int i11, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        return C2928j.f7253a.a(this.f7315d, inputContentInfo, i11, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i11) {
        Objects.toString(charSequence);
        e(new a(i11, charSequence));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i11, int i12) {
        e(new b(i11, i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        e(new c(i11, i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return f();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        e(e.f7323b);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i11) {
        c1 c1Var = this.f7312a.f7241a;
        return TextUtils.getCapsMode(c1Var.j(), K1.Q.h(c1Var.j().d()), i11);
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i11) {
        Objects.toString(extractedTextRequest);
        D0.a j11 = this.f7312a.f7241a.j();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = j11;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = j11.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = K1.Q.h(j11.d());
        extractedText.selectionEnd = K1.Q.g(j11.d());
        extractedText.flags = !kotlin.text.h.u(j11, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i11) {
        c1 c1Var = this.f7312a.f7241a;
        if (K1.Q.e(c1Var.j().d())) {
            return null;
        }
        D0.a j11 = c1Var.j();
        return j11.subSequence(K1.Q.h(j11.d()), K1.Q.g(j11.d())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public final CharSequence getTextAfterCursor(int i11, int i12) {
        D0.a j11 = this.f7312a.f7241a.j();
        return j11.subSequence(K1.Q.g(j11.d()), Math.min(K1.Q.g(j11.d()) + i11, j11.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public final CharSequence getTextBeforeCursor(int i11, int i12) {
        D0.a j11 = this.f7312a.f7241a.j();
        return j11.subSequence(Math.max(0, K1.Q.h(j11.d()) - i11), K1.Q.h(j11.d())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i11) {
        switch (i11) {
            case R.id.selectAll:
                e(new f());
                break;
            case R.id.cut:
                g(277);
                break;
            case R.id.copy:
                g(278);
                break;
            case R.id.paste:
                g(279);
                break;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performEditorAction(int i11) {
        int i12;
        Function1<C3848q, Unit> function1;
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
            }
            function1 = this.f7312a.f7243c;
            if (function1 != null) {
                ((F0.n.a.C0148a) function1).invoke(C3848q.a(i12));
            }
            return true;
        }
        i12 = 1;
        function1 = this.f7312a.f7243c;
        if (function1 != null) {
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(@NotNull HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        C2936n.f7277a.a(this.f7312a, handwritingGesture, executor, intConsumer);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return ((InputConnectionWrapper) this.f7315d).performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(@NotNull PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return C2936n.f7277a.b(this.f7312a, previewableHandwritingGesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z11) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i11) {
        this.f7312a.f7245e.d(i11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(@NotNull KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        this.f7312a.f7242b.sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i11, int i12) {
        e(new g(i11, i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i11) {
        Objects.toString(charSequence);
        e(new h(i11, charSequence));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i11, int i12) {
        e(new i(i11, i12));
        return true;
    }
}
