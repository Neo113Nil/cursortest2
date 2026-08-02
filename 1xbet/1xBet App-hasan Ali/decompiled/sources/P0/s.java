package P0;

import K0.N;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import e2.C1930k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class s implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final C1930k f4666a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4667b;

    /* renamed from: c, reason: collision with root package name */
    public int f4668c;

    /* renamed from: d, reason: collision with root package name */
    public w f4669d;

    /* renamed from: e, reason: collision with root package name */
    public int f4670e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4671g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f4672h = true;

    public s(w wVar, C1930k c1930k, boolean z3) {
        this.f4666a = c1930k;
        this.f4667b = z3;
        this.f4669d = wVar;
    }

    public final void a(g gVar) {
        this.f4668c++;
        try {
            this.f4671g.add(gVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [i4.c, kotlin.jvm.internal.m] */
    public final boolean b() {
        int i = this.f4668c - 1;
        this.f4668c = i;
        if (i == 0) {
            ArrayList arrayList = this.f4671g;
            if (!arrayList.isEmpty()) {
                ((z) this.f4666a.f16910l).f4693e.c(X3.m.n0(arrayList));
                arrayList.clear();
            }
        }
        return this.f4668c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z3 = this.f4672h;
        if (!z3) {
            return z3;
        }
        this.f4668c++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z3 = this.f4672h;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f4671g.clear();
        this.f4668c = 0;
        this.f4672h = false;
        z zVar = (z) this.f4666a.f16910l;
        int size = zVar.i.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = zVar.i;
            if (kotlin.jvm.internal.l.a(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z3 = this.f4672h;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z3 = this.f4672h;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z3 = this.f4672h;
        return z3 ? this.f4667b : z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z3 = this.f4672h;
        if (z3) {
            a(new C0331a(String.valueOf(charSequence), i));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i5) {
        boolean z3 = this.f4672h;
        if (!z3) {
            return z3;
        }
        a(new C0335e(i, i5));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i5) {
        boolean z3 = this.f4672h;
        if (!z3) {
            return z3;
        }
        a(new f(i, i5));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z3 = this.f4672h;
        if (!z3) {
            return z3;
        }
        a(new i());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        w wVar = this.f4669d;
        return TextUtils.getCapsMode(wVar.f4679a.f2829l, N.e(wVar.f4680b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z3 = (i & 1) != 0;
        this.f = z3;
        if (z3) {
            this.f4670e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC2346c.F(this.f4669d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (N.b(this.f4669d.f4680b)) {
            return null;
        }
        return G4.d.w(this.f4669d).f2829l;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i5) {
        return G4.d.y(this.f4669d, i).f2829l;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i5) {
        return G4.d.z(this.f4669d, i).f2829l;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z3 = this.f4672h;
        if (z3) {
            z3 = false;
            switch (i) {
                case R.id.selectAll:
                    a(new v(0, this.f4669d.f4679a.f2829l.length()));
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
        boolean z3 = this.f4672h;
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
                ((z) this.f4666a.f16910l).f.c(new j(i5));
            }
            i5 = 1;
            ((z) this.f4666a.f16910l).f.c(new j(i5));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z3 = this.f4672h;
        if (z3) {
            return true;
        }
        return z3;
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
        boolean z7 = this.f4672h;
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
        C0333c c0333c = ((z) this.f4666a.f16910l).f4698l;
        synchronized (c0333c.f4632c) {
            try {
                c0333c.f = z3;
                c0333c.f4635g = z5;
                c0333c.f4636h = z8;
                c0333c.i = z6;
                if (z9) {
                    c0333c.f4634e = true;
                    if (c0333c.f4637j != null) {
                        c0333c.a();
                    }
                }
                c0333c.f4633d = z10;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [W3.e, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.f4672h;
        if (!z3) {
            return z3;
        }
        ((BaseInputConnection) ((z) this.f4666a.f16910l).f4696j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i5) {
        boolean z3 = this.f4672h;
        if (z3) {
            a(new t(i, i5));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z3 = this.f4672h;
        if (z3) {
            a(new u(String.valueOf(charSequence), i));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i5) {
        boolean z3 = this.f4672h;
        if (!z3) {
            return z3;
        }
        a(new v(i, i5));
        return true;
    }
}
