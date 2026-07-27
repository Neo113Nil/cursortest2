package E;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: E.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039n {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f625a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f626b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f627c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f628d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f629e;

    public C0039n(ViewGroup viewGroup) {
        this.f627c = viewGroup;
    }

    public final boolean a(float f3, float f6, boolean z) {
        ViewParent e3;
        if (!this.f628d || (e3 = e(0)) == null) {
            return false;
        }
        try {
            return L.a(e3, this.f627c, f3, f6, z);
        } catch (AbstractMethodError e6) {
            Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedFling", e6);
            return false;
        }
    }

    public final boolean b(float f3, float f6) {
        ViewParent e3;
        if (!this.f628d || (e3 = e(0)) == null) {
            return false;
        }
        try {
            return L.b(e3, this.f627c, f3, f6);
        } catch (AbstractMethodError e6) {
            Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedPreFling", e6);
            return false;
        }
    }

    public final boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i6) {
        ViewParent e3;
        int i7;
        int i8;
        if (!this.f628d || (e3 = e(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f627c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i8 = iArr2[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr == null) {
            if (this.f629e == null) {
                this.f629e = new int[2];
            }
            iArr = this.f629e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (e3 instanceof InterfaceC0040o) {
            ((InterfaceC0040o) e3).d(i2, i3, iArr, i6);
        } else if (i6 == 0) {
            try {
                L.c(e3, viewGroup, i2, i3, iArr);
            } catch (AbstractMethodError e6) {
                Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedPreScroll", e6);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i8;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public final boolean d(int i2, int i3, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent e3;
        int i9;
        int i10;
        int[] iArr3;
        if (!this.f628d || (e3 = e(i8)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i6 == 0 && i7 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f627c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i9 = iArr[0];
            i10 = iArr[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            if (this.f629e == null) {
                this.f629e = new int[2];
            }
            int[] iArr4 = this.f629e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (e3 instanceof InterfaceC0041p) {
            ((InterfaceC0041p) e3).e(viewGroup, i2, i3, i6, i7, i8, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i6;
            iArr3[1] = iArr3[1] + i7;
            if (e3 instanceof InterfaceC0040o) {
                ((InterfaceC0040o) e3).b(viewGroup, i2, i3, i6, i7, i8);
            } else if (i8 == 0) {
                try {
                    L.d(e3, viewGroup, i2, i3, i6, i7);
                } catch (AbstractMethodError e6) {
                    Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedScroll", e6);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i9;
            iArr[1] = iArr[1] - i10;
        }
        return true;
    }

    public final ViewParent e(int i2) {
        if (i2 == 0) {
            return this.f625a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f626b;
    }

    public final boolean f(int i2) {
        return e(i2) != null;
    }

    public final boolean g(int i2, int i3) {
        boolean f3;
        if (f(i3)) {
            return true;
        }
        if (this.f628d) {
            ViewGroup viewGroup = this.f627c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z = parent instanceof InterfaceC0040o;
                if (z) {
                    f3 = ((InterfaceC0040o) parent).f(view, viewGroup, i2, i3);
                } else {
                    if (i3 == 0) {
                        try {
                            f3 = L.f(parent, view, viewGroup, i2);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e3);
                        }
                    }
                    f3 = false;
                }
                if (f3) {
                    if (i3 == 0) {
                        this.f625a = parent;
                    } else if (i3 == 1) {
                        this.f626b = parent;
                    }
                    if (z) {
                        ((InterfaceC0040o) parent).a(view, viewGroup, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            L.e(parent, view, viewGroup, i2);
                        } catch (AbstractMethodError e6) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e6);
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

    public final void h(int i2) {
        ViewParent e3 = e(i2);
        if (e3 != null) {
            boolean z = e3 instanceof InterfaceC0040o;
            ViewGroup viewGroup = this.f627c;
            if (z) {
                ((InterfaceC0040o) e3).c(viewGroup, i2);
            } else if (i2 == 0) {
                try {
                    L.g(e3, viewGroup);
                } catch (AbstractMethodError e6) {
                    Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onStopNestedScroll", e6);
                }
            }
            if (i2 == 0) {
                this.f625a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f626b = null;
            }
        }
    }
}
