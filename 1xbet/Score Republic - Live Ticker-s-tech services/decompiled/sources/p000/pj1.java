package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pj1 extends xj1 {

    /* JADX INFO: renamed from: m */
    public static boolean f6166m = false;

    /* JADX INFO: renamed from: n */
    public static Method f6167n;

    /* JADX INFO: renamed from: o */
    public static Class f6168o;

    /* JADX INFO: renamed from: p */
    public static Field f6169p;

    /* JADX INFO: renamed from: q */
    public static Field f6170q;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f6171c;

    /* JADX INFO: renamed from: d */
    public wd0[] f6172d;

    /* JADX INFO: renamed from: e */
    public wd0 f6173e;

    /* JADX INFO: renamed from: f */
    public ak1 f6174f;

    /* JADX INFO: renamed from: g */
    public wd0 f6175g;

    /* JADX INFO: renamed from: h */
    public int f6176h;

    /* JADX INFO: renamed from: i */
    public int f6177i;

    /* JADX INFO: renamed from: j */
    public int f6178j;

    /* JADX INFO: renamed from: k */
    public Rect[][] f6179k;

    /* JADX INFO: renamed from: l */
    public Rect[][] f6180l;

    public pj1(ak1 ak1Var, WindowInsets windowInsets) {
        super(ak1Var);
        this.f6173e = null;
        this.f6179k = new Rect[10][];
        this.f6180l = new Rect[10][];
        this.f6171c = windowInsets;
    }

    /* JADX INFO: renamed from: B */
    private wd0 m3923B(int i, boolean z) {
        wd0 wd0VarM5318a = wd0.f8514e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                wd0 wd0VarM3932C = m3932C(i2, z);
                wd0VarM5318a = wd0.m5318a(Math.max(wd0VarM5318a.f8515a, wd0VarM3932C.f8515a), Math.max(wd0VarM5318a.f8516b, wd0VarM3932C.f8516b), Math.max(wd0VarM5318a.f8517c, wd0VarM3932C.f8517c), Math.max(wd0VarM5318a.f8518d, wd0VarM3932C.f8518d));
            }
        }
        return wd0VarM5318a;
    }

    /* JADX INFO: renamed from: E */
    private wd0 m3924E() {
        ak1 ak1Var = this.f6174f;
        return ak1Var != null ? ak1Var.f229a.mo4103i() : wd0.f8514e;
    }

    /* JADX INFO: renamed from: F */
    private wd0 m3925F(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f6166m) {
            m3926G();
        }
        Method method = f6167n;
        if (method != null && f6168o != null && f6169p != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f6169p.get(f6170q.get(objInvoke));
                if (rect != null) {
                    return wd0.m5318a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    private static void m3926G() {
        try {
            f6167n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f6168o = cls;
            f6169p = cls.getDeclaredField("mVisibleInsets");
            f6170q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f6169p.setAccessible(true);
            f6170q.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f6166m = true;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m3927I(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    /* JADX INFO: renamed from: x */
    private C0150du m3928x(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f8975a.f229a.mo3941q()) {
            return C0150du.m1303a(point.x, point.y, true, 0, 0, 0, 0);
        }
        v31 v31VarM482a = AbstractC0038au.m482a(display, 0);
        v31 v31VarM482a2 = AbstractC0038au.m482a(display, 1);
        v31 v31VarM482a3 = AbstractC0038au.m482a(display, 2);
        v31 v31VarM482a4 = AbstractC0038au.m482a(display, 3);
        return C0150du.m1303a(point.x, point.y, false, v31VarM482a != null ? v31VarM482a.f8051b : 0, v31VarM482a2 != null ? v31VarM482a2.f8051b : 0, v31VarM482a3 != null ? v31VarM482a3.f8051b : 0, v31VarM482a4 != null ? v31VarM482a4.f8051b : 0);
    }

    /* JADX INFO: renamed from: y */
    private static List<Rect> m3929y(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[n80.m3495d(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    /* JADX INFO: renamed from: z */
    private Rect[] m3930z(wd0 wd0Var) {
        ArrayList arrayList = new ArrayList();
        int i = wd0Var.f8515a;
        int i2 = wd0Var.f8518d;
        int i3 = wd0Var.f8517c;
        int i4 = wd0Var.f8516b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, wd0Var.f8515a, this.f6177i));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.f6178j, i4));
        }
        if (i3 != 0) {
            int i5 = this.f6178j;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.f6177i));
        }
        if (i2 != 0) {
            int i6 = this.f6177i;
            arrayList.add(new Rect(0, i6 - i2, this.f6178j, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    /* JADX INFO: renamed from: A */
    public wd0 mo3931A(int i) {
        return m3923B(i, false);
    }

    /* JADX INFO: renamed from: C */
    public wd0 m3932C(int i, boolean z) {
        wd0 wd0VarMo4103i;
        int i2;
        wd0 wd0Var = wd0.f8514e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    wd0[] wd0VarArr = this.f6172d;
                    wd0VarMo4103i = wd0VarArr != null ? wd0VarArr[n80.m3495d(8)] : null;
                    if (wd0VarMo4103i != null) {
                        return wd0VarMo4103i;
                    }
                    wd0 wd0VarMo3938k = mo3938k();
                    wd0 wd0VarM3924E = m3924E();
                    int i3 = wd0VarMo3938k.f8518d;
                    if (i3 > wd0VarM3924E.f8518d) {
                        return wd0.m5318a(0, 0, 0, i3);
                    }
                    wd0 wd0Var2 = this.f6175g;
                    if (wd0Var2 != null && !wd0Var2.equals(wd0Var) && (i2 = this.f6175g.f8518d) > wd0VarM3924E.f8518d) {
                        return wd0.m5318a(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return mo4531j();
                    }
                    if (i == 32) {
                        return mo4530h();
                    }
                    if (i == 64) {
                        return mo4532l();
                    }
                    if (i == 128) {
                        ak1 ak1Var = this.f6174f;
                        C0075bu c0075buMo4359g = ak1Var != null ? ak1Var.f229a.mo4359g() : mo4359g();
                        if (c0075buMo4359g != null) {
                            DisplayCutout displayCutout = c0075buMo4359g.f986a;
                            return wd0.m5318a(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                        }
                    }
                }
            } else {
                if (z) {
                    wd0 wd0VarM3924E2 = m3924E();
                    wd0 wd0VarMo4103i2 = mo4103i();
                    return wd0.m5318a(Math.max(wd0VarM3924E2.f8515a, wd0VarMo4103i2.f8515a), 0, Math.max(wd0VarM3924E2.f8517c, wd0VarMo4103i2.f8517c), Math.max(wd0VarM3924E2.f8518d, wd0VarMo4103i2.f8518d));
                }
                if ((this.f6176h & 2) == 0) {
                    wd0 wd0VarMo3938k2 = mo3938k();
                    ak1 ak1Var2 = this.f6174f;
                    wd0VarMo4103i = ak1Var2 != null ? ak1Var2.f229a.mo4103i() : null;
                    int iMin = wd0VarMo3938k2.f8518d;
                    if (wd0VarMo4103i != null) {
                        iMin = Math.min(iMin, wd0VarMo4103i.f8518d);
                    }
                    return wd0.m5318a(wd0VarMo3938k2.f8515a, 0, wd0VarMo3938k2.f8517c, iMin);
                }
            }
        } else {
            if (z) {
                return wd0.m5318a(0, Math.max(m3924E().f8516b, mo3938k().f8516b), 0, 0);
            }
            if ((this.f6176h & 4) == 0) {
                return wd0.m5318a(0, mo3938k().f8516b, 0, 0);
            }
        }
        return wd0Var;
    }

    /* JADX INFO: renamed from: D */
    public wd0 mo3933D(int i) {
        return m3923B(i, true);
    }

    /* JADX INFO: renamed from: H */
    public void m3934H(wd0 wd0Var) {
        this.f6175g = wd0Var;
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: d */
    public void mo3935d(View view) {
        this.f6178j = view.getWidth();
        this.f6177i = view.getHeight();
        wd0 wd0VarM3925F = m3925F(view);
        if (wd0VarM3925F == null) {
            wd0VarM3925F = wd0.f8514e;
        }
        m3934H(wd0VarM3925F);
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: e */
    public List<Rect> mo3936e(int i) {
        return m3929y(this.f6179k, i);
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: f */
    public List<Rect> mo3937f(int i) {
        return m3929y(this.f6180l, i);
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: k */
    public final wd0 mo3938k() {
        if (this.f6173e == null) {
            WindowInsets windowInsets = this.f6171c;
            this.f6173e = wd0.m5318a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f6173e;
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: m */
    public void mo3939m(View view) {
        m3928x(view);
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: n */
    public void mo3940n() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iM3495d = n80.m3495d(i);
            this.f6179k[iM3495d] = m3930z(mo3931A(i));
            if (i != 8) {
                this.f6180l[iM3495d] = m3930z(mo3933D(i));
            }
        }
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: q */
    public boolean mo3941q() {
        return this.f6171c.isRound();
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: s */
    public void mo3943s(wd0[] wd0VarArr) {
        this.f6172d = wd0VarArr;
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: t */
    public void mo3944t(ak1 ak1Var) {
        this.f6174f = ak1Var;
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: u */
    public void mo3945u(int i) {
        this.f6176h = i;
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: v */
    public void mo3946v(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f6179k = (Rect[][]) rectArr.clone();
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: w */
    public void mo3947w(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f6180l = (Rect[][]) rectArr.clone();
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: r */
    public void mo3942r(C0150du c0150du) {
    }
}
