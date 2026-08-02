package Q1;

import Sc.InterfaceC3999a;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes8.dex */
public final class G implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final P f22819a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f22820b;

    /* renamed from: c, reason: collision with root package name */
    private int f22821c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private K f22822d;

    /* renamed from: e, reason: collision with root package name */
    private int f22823e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22824f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayList f22825g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private boolean f22826h = true;

    public G(@NotNull K k11, @NotNull P p11, boolean z11) {
        this.f22819a = p11;
        this.f22820b = z11;
        this.f22822d = k11;
    }

    private final void b(InterfaceC3841j interfaceC3841j) {
        this.f22821c++;
        try {
            this.f22825g.add(interfaceC3841j);
        } finally {
            c();
        }
    }

    private final boolean c() {
        Function1 function1;
        int i11 = this.f22821c - 1;
        this.f22821c = i11;
        if (i11 == 0) {
            ArrayList arrayList = this.f22825g;
            if (!arrayList.isEmpty()) {
                ArrayList W02 = C7714v.W0(arrayList);
                function1 = this.f22819a.f22858a.f22844e;
                function1.invoke(W02);
                arrayList.clear();
            }
        }
        return this.f22821c > 0;
    }

    private final void d(int i11) {
        sendKeyEvent(new KeyEvent(0, i11));
        sendKeyEvent(new KeyEvent(1, i11));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z11 = this.f22826h;
        if (!z11) {
            return z11;
        }
        this.f22821c++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i11) {
        boolean z11 = this.f22826h;
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
        this.f22825g.clear();
        this.f22821c = 0;
        this.f22826h = false;
        N n11 = this.f22819a.f22858a;
        arrayList = n11.f22848i;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2 = n11.f22848i;
            if (Intrinsics.d(((WeakReference) arrayList2.get(i11)).get(), this)) {
                arrayList3 = n11.f22848i;
                arrayList3.remove(i11);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z11 = this.f22826h;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(@NotNull InputContentInfo inputContentInfo, int i11, Bundle bundle) {
        boolean z11 = this.f22826h;
        if (z11) {
            return false;
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z11 = this.f22826h;
        return z11 ? this.f22820b : z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i11) {
        boolean z11 = this.f22826h;
        if (z11) {
            b(new C3832a(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i11, int i12) {
        boolean z11 = this.f22826h;
        if (!z11) {
            return z11;
        }
        b(new C3839h(i11, i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        boolean z11 = this.f22826h;
        if (!z11) {
            return z11;
        }
        b(new C3840i(i11, i12));
        return true;
    }

    public final void e(@NotNull K k11) {
        this.f22822d = k11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return c();
    }

    public final void f(@NotNull K k11, @NotNull C3850t c3850t) {
        if (this.f22826h) {
            this.f22822d = k11;
            if (this.f22824f) {
                c3850t.g(this.f22823e, C3851u.a(k11));
            }
            K1.Q d11 = k11.d();
            int h11 = d11 != null ? K1.Q.h(d11.k()) : -1;
            K1.Q d12 = k11.d();
            c3850t.h(K1.Q.h(k11.e()), K1.Q.g(k11.e()), h11, d12 != null ? K1.Q.g(d12.k()) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z11 = this.f22826h;
        if (!z11) {
            return z11;
        }
        b(new C3845n());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i11) {
        return TextUtils.getCapsMode(this.f22822d.f(), K1.Q.h(this.f22822d.e()), i11);
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i11) {
        boolean z11 = (i11 & 1) != 0;
        this.f22824f = z11;
        if (z11) {
            this.f22823e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return C3851u.a(this.f22822d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i11) {
        if (K1.Q.e(this.f22822d.e())) {
            return null;
        }
        return L.a(this.f22822d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public final CharSequence getTextAfterCursor(int i11, int i12) {
        return L.b(this.f22822d, i11).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public final CharSequence getTextBeforeCursor(int i11, int i12) {
        return L.c(this.f22822d, i11).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i11) {
        boolean z11 = this.f22826h;
        if (z11) {
            z11 = false;
            switch (i11) {
                case R.id.selectAll:
                    b(new J(0, this.f22822d.f().length()));
                    break;
                case R.id.cut:
                    d(277);
                    return false;
                case R.id.copy:
                    d(278);
                    return false;
                case R.id.paste:
                    d(279);
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
        boolean z11 = this.f22826h;
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
                function1 = this.f22819a.f22858a.f22845f;
                function1.invoke(C3848q.a(i12));
            }
            i12 = 1;
            function1 = this.f22819a.f22858a.f22845f;
            function1.invoke(C3848q.a(i12));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z11 = this.f22826h;
        if (z11) {
            return true;
        }
        return z11;
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
        C3836e c3836e;
        boolean z15 = this.f22826h;
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
            c3836e = this.f22819a.f22858a.f22851l;
            c3836e.b(z17, z18, z11, z12, z13, z14);
            return true;
        }
        z11 = true;
        z12 = true;
        z13 = false;
        z14 = z13;
        c3836e = this.f22819a.f22858a.f22851l;
        c3836e.b(z17, z18, z11, z12, z13, z14);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(@NotNull KeyEvent keyEvent) {
        boolean z11 = this.f22826h;
        if (!z11) {
            return z11;
        }
        N.j(this.f22819a.f22858a).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i11, int i12) {
        boolean z11 = this.f22826h;
        if (z11) {
            b(new H(i11, i12));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i11) {
        boolean z11 = this.f22826h;
        if (z11) {
            b(new I(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i11, int i12) {
        boolean z11 = this.f22826h;
        if (!z11) {
            return z11;
        }
        b(new J(i11, i12));
        return true;
    }
}
