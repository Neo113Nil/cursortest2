package P;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f5102a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f5103b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f5104c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5105d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f5106e;

    public r(ViewGroup viewGroup) {
        this.f5104c = viewGroup;
    }

    public final boolean a(float f7, float f8, boolean z4) {
        ViewParent e7;
        if (!this.f5105d || (e7 = e(0)) == null) {
            return false;
        }
        try {
            return Z.a(e7, this.f5104c, f7, f8, z4);
        } catch (AbstractMethodError e8) {
            Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedFling", e8);
            return false;
        }
    }

    public final boolean b(float f7, float f8) {
        ViewParent e7;
        if (!this.f5105d || (e7 = e(0)) == null) {
            return false;
        }
        try {
            return Z.b(e7, this.f5104c, f7, f8);
        } catch (AbstractMethodError e8) {
            Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedPreFling", e8);
            return false;
        }
    }

    public final boolean c(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        ViewParent e7;
        int i10;
        int i11;
        int[] iArr3;
        if (!this.f5105d || (e7 = e(i9)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f5104c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i10 = iArr2[0];
            i11 = iArr2[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr == null) {
            if (this.f5106e == null) {
                this.f5106e = new int[2];
            }
            iArr3 = this.f5106e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e7 instanceof InterfaceC0362s) {
            ((InterfaceC0362s) e7).onNestedPreScroll(viewGroup, i7, i8, iArr3, i9);
        } else if (i9 == 0) {
            try {
                Z.c(e7, viewGroup, i7, i8, iArr3);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedPreScroll", e8);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i10;
            iArr2[1] = iArr2[1] - i11;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        ViewParent e7;
        int i12;
        int i13;
        int[] iArr3;
        if (!this.f5105d || (e7 = e(i11)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f5104c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i12 = iArr[0];
            i13 = iArr[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr2 == null) {
            if (this.f5106e == null) {
                this.f5106e = new int[2];
            }
            int[] iArr4 = this.f5106e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (e7 instanceof InterfaceC0363t) {
            ((InterfaceC0363t) e7).onNestedScroll(viewGroup, i7, i8, i9, i10, i11, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i9;
            iArr3[1] = iArr3[1] + i10;
            if (e7 instanceof InterfaceC0362s) {
                ((InterfaceC0362s) e7).onNestedScroll(viewGroup, i7, i8, i9, i10, i11);
            } else if (i11 == 0) {
                try {
                    Z.d(e7, viewGroup, i7, i8, i9, i10);
                } catch (AbstractMethodError e8) {
                    Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedScroll", e8);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i12;
            iArr[1] = iArr[1] - i13;
        }
        return true;
    }

    public final ViewParent e(int i7) {
        if (i7 == 0) {
            return this.f5102a;
        }
        if (i7 != 1) {
            return null;
        }
        return this.f5103b;
    }

    public final boolean f(int i7) {
        return e(i7) != null;
    }

    public final boolean g(int i7, int i8) {
        boolean f7;
        if (f(i8)) {
            return true;
        }
        if (this.f5105d) {
            ViewGroup viewGroup = this.f5104c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z4 = parent instanceof InterfaceC0362s;
                if (z4) {
                    f7 = ((InterfaceC0362s) parent).onStartNestedScroll(view, viewGroup, i7, i8);
                } else {
                    if (i8 == 0) {
                        try {
                            f7 = Z.f(parent, view, viewGroup, i7);
                        } catch (AbstractMethodError e7) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e7);
                        }
                    }
                    f7 = false;
                }
                if (f7) {
                    if (i8 == 0) {
                        this.f5102a = parent;
                    } else if (i8 == 1) {
                        this.f5103b = parent;
                    }
                    if (z4) {
                        ((InterfaceC0362s) parent).onNestedScrollAccepted(view, viewGroup, i7, i8);
                    } else if (i8 == 0) {
                        try {
                            Z.e(parent, view, viewGroup, i7);
                        } catch (AbstractMethodError e8) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e8);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i7) {
        ViewParent e7 = e(i7);
        if (e7 != null) {
            boolean z4 = e7 instanceof InterfaceC0362s;
            ViewGroup viewGroup = this.f5104c;
            if (z4) {
                ((InterfaceC0362s) e7).onStopNestedScroll(viewGroup, i7);
            } else if (i7 == 0) {
                try {
                    Z.g(e7, viewGroup);
                } catch (AbstractMethodError e8) {
                    Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onStopNestedScroll", e8);
                }
            }
            if (i7 == 0) {
                this.f5102a = null;
            } else {
                if (i7 != 1) {
                    return;
                }
                this.f5103b = null;
            }
        }
    }
}
