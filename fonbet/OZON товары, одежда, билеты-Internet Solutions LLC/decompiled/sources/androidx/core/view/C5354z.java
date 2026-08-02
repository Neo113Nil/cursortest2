package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.view.Y;

/* renamed from: androidx.core.view.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5354z {

    /* renamed from: a, reason: collision with root package name */
    private ViewParent f42386a;

    /* renamed from: b, reason: collision with root package name */
    private ViewParent f42387b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewGroup f42388c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f42389d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f42390e;

    public C5354z(@NonNull ViewGroup viewGroup) {
        this.f42388c = viewGroup;
    }

    private boolean f(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        ViewParent g10;
        int i16;
        int i17;
        int[] iArr3;
        int i18;
        int i19;
        int i21;
        int i22;
        if (this.f42389d && (g10 = g(i15)) != null) {
            if (i11 != 0 || i12 != 0 || i13 != 0 || i14 != 0) {
                ViewGroup viewGroup = this.f42388c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i16 = iArr[0];
                    i17 = iArr[1];
                } else {
                    i16 = 0;
                    i17 = 0;
                }
                if (iArr2 == null) {
                    if (this.f42390e == null) {
                        this.f42390e = new int[2];
                    }
                    int[] iArr4 = this.f42390e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                    i19 = i12;
                    i21 = i13;
                    i22 = i14;
                    i18 = i11;
                } else {
                    iArr3 = iArr2;
                    i18 = i11;
                    i19 = i12;
                    i21 = i13;
                    i22 = i14;
                }
                C5322i0.d(g10, viewGroup, i18, i19, i21, i22, i15, iArr3);
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i16;
                    iArr[1] = iArr[1] - i17;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    private ViewParent g(int i11) {
        if (i11 == 0) {
            return this.f42386a;
        }
        if (i11 != 1) {
            return null;
        }
        return this.f42387b;
    }

    public final boolean a(float f7, float f11, boolean z11) {
        ViewParent g10;
        if (!this.f42389d || (g10 = g(0)) == null) {
            return false;
        }
        return C5322i0.a(g10, this.f42388c, f7, f11, z11);
    }

    public final boolean b(float f7, float f11) {
        ViewParent g10;
        if (!this.f42389d || (g10 = g(0)) == null) {
            return false;
        }
        return C5322i0.b(g10, this.f42388c, f7, f11);
    }

    public final boolean c(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        ViewParent g10;
        int i14;
        int i15;
        if (this.f42389d && (g10 = g(i13)) != null) {
            if (i11 != 0 || i12 != 0) {
                ViewGroup viewGroup = this.f42388c;
                if (iArr2 != null) {
                    viewGroup.getLocationInWindow(iArr2);
                    i14 = iArr2[0];
                    i15 = iArr2[1];
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (iArr == null) {
                    if (this.f42390e == null) {
                        this.f42390e = new int[2];
                    }
                    iArr = this.f42390e;
                }
                int[] iArr3 = iArr;
                iArr3[0] = 0;
                iArr3[1] = 0;
                C5322i0.c(g10, viewGroup, i11, i12, iArr3, i13);
                if (iArr2 != null) {
                    viewGroup.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i14;
                    iArr2[1] = iArr2[1] - i15;
                }
                if (iArr3[0] != 0 || iArr3[1] != 0) {
                    return true;
                }
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final void d(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        f(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    public final boolean e(int i11, int i12, int i13, int i14, int[] iArr) {
        return f(i11, i12, i13, i14, iArr, 0, null);
    }

    public final boolean h(int i11) {
        return g(i11) != null;
    }

    public final boolean i() {
        return this.f42389d;
    }

    public final void j(boolean z11) {
        if (this.f42389d) {
            int i11 = Y.f42258g;
            Y.d.z(this.f42388c);
        }
        this.f42389d = z11;
    }

    public final boolean k(int i11, int i12) {
        if (h(i12)) {
            return true;
        }
        if (!this.f42389d) {
            return false;
        }
        ViewGroup viewGroup = this.f42388c;
        View view = viewGroup;
        for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
            if (C5322i0.f(parent, view, viewGroup, i11, i12)) {
                if (i12 == 0) {
                    this.f42386a = parent;
                } else if (i12 == 1) {
                    this.f42387b = parent;
                }
                C5322i0.e(parent, view, viewGroup, i11, i12);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public final void l(int i11) {
        ViewParent g10 = g(i11);
        if (g10 != null) {
            C5322i0.g(g10, this.f42388c, i11);
            if (i11 == 0) {
                this.f42386a = null;
            } else {
                if (i11 != 1) {
                    return;
                }
                this.f42387b = null;
            }
        }
    }
}
