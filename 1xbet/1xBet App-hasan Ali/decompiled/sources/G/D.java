package G;

import A0.J0;
import A0.q1;
import E.Z;
import I.O;
import K0.N;
import P0.C0331a;
import P0.C0335e;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class D implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final J0 f1700a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1701b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f1702c;

    /* renamed from: d, reason: collision with root package name */
    public final O f1703d;

    /* renamed from: e, reason: collision with root package name */
    public final q1 f1704e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public P0.w f1705g;

    /* renamed from: h, reason: collision with root package name */
    public int f1706h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1707j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f1708k = true;

    public D(P0.w wVar, J0 j02, boolean z3, Z z5, O o5, q1 q1Var) {
        this.f1700a = j02;
        this.f1701b = z3;
        this.f1702c = z5;
        this.f1703d = o5;
        this.f1704e = q1Var;
        this.f1705g = wVar;
    }

    public final void a(P0.g gVar) {
        this.f++;
        try {
            this.f1707j.add(gVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [i4.c, kotlin.jvm.internal.m] */
    public final boolean b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.f1707j;
            if (!arrayList.isEmpty()) {
                ((B) this.f1700a.f304k).f1690c.c(X3.m.n0(arrayList));
                arrayList.clear();
            }
        }
        return this.f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z3 = this.f1708k;
        if (!z3) {
            return z3;
        }
        this.f++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z3 = this.f1708k;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f1707j.clear();
        this.f = 0;
        this.f1708k = false;
        B b3 = (B) this.f1700a.f304k;
        int size = b3.f1695j.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = b3.f1695j;
            if (kotlin.jvm.internal.l.a(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z3 = this.f1708k;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z3 = this.f1708k;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z3 = this.f1708k;
        return z3 ? this.f1701b : z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z3 = this.f1708k;
        if (z3) {
            a(new C0331a(String.valueOf(charSequence), i));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i5) {
        boolean z3 = this.f1708k;
        if (!z3) {
            return z3;
        }
        a(new C0335e(i, i5));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i5) {
        boolean z3 = this.f1708k;
        if (!z3) {
            return z3;
        }
        a(new P0.f(i, i5));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z3 = this.f1708k;
        if (!z3) {
            return z3;
        }
        a(new P0.i());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        P0.w wVar = this.f1705g;
        return TextUtils.getCapsMode(wVar.f4679a.f2829l, N.e(wVar.f4680b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z3 = (i & 1) != 0;
        this.i = z3;
        if (z3) {
            this.f1706h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC2349a.k(this.f1705g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (N.b(this.f1705g.f4680b)) {
            return null;
        }
        return G4.d.w(this.f1705g).f2829l;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i5) {
        return G4.d.y(this.f1705g, i).f2829l;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i5) {
        return G4.d.z(this.f1705g, i).f2829l;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z3 = this.f1708k;
        if (z3) {
            z3 = false;
            switch (i) {
                case R.id.selectAll:
                    a(new P0.v(0, this.f1705g.f4679a.f2829l.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i5;
        boolean z3 = this.f1708k;
        if (z3) {
            z3 = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i5 = 2;
                        break;
                    case 3:
                        i5 = 3;
                        break;
                    case 4:
                        i5 = 4;
                        break;
                    case 5:
                        i5 = 6;
                        break;
                    case 6:
                        i5 = 7;
                        break;
                    case 7:
                        i5 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        break;
                }
                ((B) this.f1700a.f304k).f1691d.c(new P0.j(i5));
            }
            i5 = 1;
            ((B) this.f1700a.f304k).f1691d.c(new P0.j(i5));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            h hVar = h.f1734a;
            A.B b3 = new A.B(12, this);
            hVar.a(this.f1702c, this.f1703d, handwritingGesture, this.f1704e, executor, intConsumer, b3);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z3 = this.f1708k;
        if (z3) {
            return true;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return h.f1734a.b(this.f1702c, this.f1703d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z3) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z3;
        boolean z5;
        boolean z6;
        boolean z7 = this.f1708k;
        if (!z7) {
            return z7;
        }
        boolean z8 = false;
        boolean z9 = (i & 1) != 0;
        boolean z10 = (i & 2) != 0;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            z3 = (i & 16) != 0;
            z5 = (i & 8) != 0;
            boolean z11 = (i & 4) != 0;
            if (i5 >= 34 && (i & 32) != 0) {
                z8 = true;
            }
            if (z3 || z5 || z11 || z8) {
                z6 = z8;
                z8 = z11;
            } else if (i5 >= 34) {
                z6 = true;
                z8 = true;
                z3 = true;
                z5 = true;
            } else {
                z3 = true;
                z5 = true;
                z6 = z8;
                z8 = true;
            }
        } else {
            z3 = true;
            z5 = true;
            z6 = false;
        }
        y yVar = ((B) this.f1700a.f304k).f1698m;
        synchronized (yVar.f1760c) {
            try {
                yVar.f = z3;
                yVar.f1763g = z5;
                yVar.f1764h = z8;
                yVar.i = z6;
                if (z9) {
                    yVar.f1762e = true;
                    if (yVar.f1765j != null) {
                        yVar.a();
                    }
                }
                yVar.f1761d = z10;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [W3.e, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.f1708k;
        if (!z3) {
            return z3;
        }
        ((BaseInputConnection) ((B) this.f1700a.f304k).f1696k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i5) {
        boolean z3 = this.f1708k;
        if (z3) {
            a(new P0.t(i, i5));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z3 = this.f1708k;
        if (z3) {
            a(new P0.u(String.valueOf(charSequence), i));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i5) {
        boolean z3 = this.f1708k;
        if (!z3) {
            return z3;
        }
        a(new P0.v(i, i5));
        return true;
    }
}
