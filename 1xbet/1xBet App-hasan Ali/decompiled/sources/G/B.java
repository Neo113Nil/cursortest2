package G;

import A0.C0040k0;
import A0.J0;
import A0.q1;
import E.Z;
import I.O;
import K0.N;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final View f1688a;

    /* renamed from: b, reason: collision with root package name */
    public final v f1689b;

    /* renamed from: e, reason: collision with root package name */
    public Z f1692e;
    public O f;

    /* renamed from: g, reason: collision with root package name */
    public q1 f1693g;

    /* renamed from: l, reason: collision with root package name */
    public Rect f1697l;

    /* renamed from: m, reason: collision with root package name */
    public final y f1698m;

    /* renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.m f1690c = C0124a.f1710n;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.m f1691d = C0124a.f1711o;

    /* renamed from: h, reason: collision with root package name */
    public P0.w f1694h = new P0.w(4, N.f2801b, "");
    public P0.k i = P0.k.f4657g;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1695j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final Object f1696k = G4.d.D(W3.f.f6034k, new C0040k0(7, this));

    public B(View view, C0126c c0126c, v vVar) {
        this.f1688a = view;
        this.f1689b = vVar;
        this.f1698m = new y(c0126c, vVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D a(EditorInfo editorInfo) {
        int i;
        int i5;
        int i6;
        int i7;
        P0.w wVar = this.f1694h;
        String str = wVar.f4679a.f2829l;
        P0.k kVar = this.i;
        int i8 = kVar.f4662e;
        boolean z3 = kVar.f4658a;
        if (i8 != 1) {
            if (i8 == 0) {
                i = 1;
            } else if (i8 == 2) {
                i = 2;
            } else if (i8 == 6) {
                i = 5;
            } else if (i8 == 5) {
                i = 7;
            } else if (i8 == 3) {
                i = 3;
            } else if (i8 == 4) {
                i = 4;
            } else {
                if (i8 != 7) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                i = 6;
            }
            editorInfo.imeOptions = i;
            if (Build.VERSION.SDK_INT >= 24) {
            }
            i5 = kVar.f4661d;
            if (i5 != 1) {
            }
            i6 = 1;
            editorInfo.inputType = i6;
            if (!z3) {
            }
            i7 = editorInfo.inputType;
            if ((i7 & 1) == 1) {
            }
            int i9 = N.f2802c;
            long j5 = wVar.f4680b;
            editorInfo.initialSelStart = (int) (j5 >> 32);
            editorInfo.initialSelEnd = (int) (j5 & 4294967295L);
            AbstractC2346c.B(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (F.e.f1518a) {
            }
            AbstractC2346c.C(editorInfo, false);
            z zVar = A.f1687a;
            if (v1.k.d()) {
            }
            D d5 = new D(this.f1694h, new J0(this), this.i.f4660c, this.f1692e, this.f, this.f1693g);
            this.f1695j.add(new WeakReference(d5));
            return d5;
        }
        if (!z3) {
            i = 0;
            editorInfo.imeOptions = i;
            if (Build.VERSION.SDK_INT >= 24) {
                C.f1699a.a(editorInfo, kVar.f);
            }
            i5 = kVar.f4661d;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        i6 = 2;
                    } else if (i5 == 4) {
                        i6 = 3;
                    } else if (i5 == 5) {
                        i6 = 17;
                    } else if (i5 == 6) {
                        i6 = 33;
                    } else if (i5 == 7) {
                        i6 = 129;
                    } else if (i5 == 8) {
                        i6 = 18;
                    } else {
                        if (i5 != 9) {
                            throw new IllegalStateException("Invalid Keyboard Type");
                        }
                        i6 = 8194;
                    }
                    editorInfo.inputType = i6;
                    if (!z3 && (i6 & 1) == 1) {
                        editorInfo.inputType = i6 | 131072;
                        if (kVar.f4662e == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                    i7 = editorInfo.inputType;
                    if ((i7 & 1) == 1) {
                        int i10 = kVar.f4659b;
                        if (i10 == 1) {
                            editorInfo.inputType = i7 | 4096;
                        } else if (i10 == 2) {
                            editorInfo.inputType = i7 | 8192;
                        } else if (i10 == 3) {
                            editorInfo.inputType = i7 | 16384;
                        }
                        if (kVar.f4660c) {
                            editorInfo.inputType |= 32768;
                        }
                    }
                    int i92 = N.f2802c;
                    long j52 = wVar.f4680b;
                    editorInfo.initialSelStart = (int) (j52 >> 32);
                    editorInfo.initialSelEnd = (int) (j52 & 4294967295L);
                    AbstractC2346c.B(editorInfo, str);
                    editorInfo.imeOptions |= 33554432;
                    if (F.e.f1518a || i5 == 7 || i5 == 8) {
                        AbstractC2346c.C(editorInfo, false);
                    } else {
                        AbstractC2346c.C(editorInfo, true);
                        p.f1743a.a(editorInfo);
                    }
                    z zVar2 = A.f1687a;
                    if (v1.k.d()) {
                        v1.k.a().i(editorInfo);
                    }
                    D d52 = new D(this.f1694h, new J0(this), this.i.f4660c, this.f1692e, this.f, this.f1693g);
                    this.f1695j.add(new WeakReference(d52));
                    return d52;
                }
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            }
            i6 = 1;
            editorInfo.inputType = i6;
            if (!z3) {
                editorInfo.inputType = i6 | 131072;
                if (kVar.f4662e == 1) {
                }
            }
            i7 = editorInfo.inputType;
            if ((i7 & 1) == 1) {
            }
            int i922 = N.f2802c;
            long j522 = wVar.f4680b;
            editorInfo.initialSelStart = (int) (j522 >> 32);
            editorInfo.initialSelEnd = (int) (j522 & 4294967295L);
            AbstractC2346c.B(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (F.e.f1518a) {
            }
            AbstractC2346c.C(editorInfo, false);
            z zVar22 = A.f1687a;
            if (v1.k.d()) {
            }
            D d522 = new D(this.f1694h, new J0(this), this.i.f4660c, this.f1692e, this.f, this.f1693g);
            this.f1695j.add(new WeakReference(d522));
            return d522;
        }
        i = 6;
        editorInfo.imeOptions = i;
        if (Build.VERSION.SDK_INT >= 24) {
        }
        i5 = kVar.f4661d;
        if (i5 != 1) {
        }
        i6 = 1;
        editorInfo.inputType = i6;
        if (!z3) {
        }
        i7 = editorInfo.inputType;
        if ((i7 & 1) == 1) {
        }
        int i9222 = N.f2802c;
        long j5222 = wVar.f4680b;
        editorInfo.initialSelStart = (int) (j5222 >> 32);
        editorInfo.initialSelEnd = (int) (j5222 & 4294967295L);
        AbstractC2346c.B(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (F.e.f1518a) {
        }
        AbstractC2346c.C(editorInfo, false);
        z zVar222 = A.f1687a;
        if (v1.k.d()) {
        }
        D d5222 = new D(this.f1694h, new J0(this), this.i.f4660c, this.f1692e, this.f, this.f1693g);
        this.f1695j.add(new WeakReference(d5222));
        return d5222;
    }
}
