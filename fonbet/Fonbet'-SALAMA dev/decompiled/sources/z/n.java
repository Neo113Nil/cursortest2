package z;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.utils.widget.MotionLabel;
import io.sentry.protocol.ViewHierarchyNode;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import u.C1613b;
import u.C1616e;
import y.C1794d;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public final View f18316b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18317c;
    public q4.d[] j;

    /* renamed from: k, reason: collision with root package name */
    public C1613b f18324k;

    /* renamed from: o, reason: collision with root package name */
    public int[] f18328o;

    /* renamed from: p, reason: collision with root package name */
    public double[] f18329p;

    /* renamed from: q, reason: collision with root package name */
    public double[] f18330q;

    /* renamed from: r, reason: collision with root package name */
    public String[] f18331r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f18332s;

    /* renamed from: x, reason: collision with root package name */
    public HashMap f18337x;

    /* renamed from: y, reason: collision with root package name */
    public HashMap f18338y;

    /* renamed from: z, reason: collision with root package name */
    public HashMap f18339z;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f18315a = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public boolean f18318d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f18319e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final w f18320f = new w();

    /* renamed from: g, reason: collision with root package name */
    public final w f18321g = new w();

    /* renamed from: h, reason: collision with root package name */
    public final l f18322h = new l();

    /* renamed from: i, reason: collision with root package name */
    public final l f18323i = new l();

    /* renamed from: l, reason: collision with root package name */
    public float f18325l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f18326m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f18327n = 1.0f;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f18333t = new float[4];

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f18334u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final float[] f18335v = new float[1];

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f18336w = new ArrayList();

    /* renamed from: A, reason: collision with root package name */
    public int f18308A = -1;

    /* renamed from: B, reason: collision with root package name */
    public int f18309B = -1;

    /* renamed from: C, reason: collision with root package name */
    public View f18310C = null;

    /* renamed from: D, reason: collision with root package name */
    public int f18311D = -1;

    /* renamed from: E, reason: collision with root package name */
    public float f18312E = Float.NaN;

    /* renamed from: F, reason: collision with root package name */
    public Interpolator f18313F = null;

    /* renamed from: G, reason: collision with root package name */
    public boolean f18314G = false;

    public n(View view) {
        this.f18316b = view;
        this.f18317c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof B.c) {
            ((B.c) layoutParams).getClass();
        }
    }

    public static void g(Rect rect, Rect rect2, int i7, int i8, int i9) {
        if (i7 == 1) {
            int i10 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i9 - ((rect.height() + i10) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i7 == 2) {
            int i11 = rect.left + rect.right;
            rect2.left = i8 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i11 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i7 == 3) {
            int i12 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i12 / 2);
            rect2.top = i9 - ((rect.height() + i12) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i7 != 4) {
            return;
        }
        int i13 = rect.left + rect.right;
        rect2.left = i8 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i13 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final void a(AbstractC1805c abstractC1805c) {
        this.f18336w.add(abstractC1805c);
    }

    public final float b(float[] fArr, float f7) {
        float f8 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f9 = this.f18327n;
            if (f9 != 1.0d) {
                float f10 = this.f18326m;
                if (f7 < f10) {
                    f7 = 0.0f;
                }
                if (f7 > f10 && f7 < 1.0d) {
                    f7 = Math.min((f7 - f10) * f9, 1.0f);
                }
            }
        }
        C1616e c1616e = this.f18320f.f18380a;
        Iterator it = this.f18334u.iterator();
        float f11 = Float.NaN;
        while (it.hasNext()) {
            w wVar = (w) it.next();
            C1616e c1616e2 = wVar.f18380a;
            if (c1616e2 != null) {
                float f12 = wVar.f18382c;
                if (f12 < f7) {
                    c1616e = c1616e2;
                    f8 = f12;
                } else if (Float.isNaN(f11)) {
                    f11 = wVar.f18382c;
                }
            }
        }
        if (c1616e != null) {
            float f13 = (Float.isNaN(f11) ? 1.0f : f11) - f8;
            double d7 = (f7 - f8) / f13;
            f7 = (((float) c1616e.a(d7)) * f13) + f8;
            if (fArr != null) {
                fArr[0] = (float) c1616e.b(d7);
            }
        }
        return f7;
    }

    public final void c(double d7, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.j[0].e(d7, dArr);
        this.j[0].h(d7, dArr2);
        float f7 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f18328o;
        w wVar = this.f18320f;
        float f8 = wVar.f18384e;
        float f9 = wVar.f18385f;
        float f10 = wVar.f18386x;
        float f11 = wVar.f18387y;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            float f15 = (float) dArr[i7];
            float f16 = (float) dArr2[i7];
            int i8 = iArr[i7];
            if (i8 == 1) {
                f8 = f15;
                f7 = f16;
            } else if (i8 == 2) {
                f9 = f15;
                f14 = f16;
            } else if (i8 == 3) {
                f10 = f15;
                f12 = f16;
            } else if (i8 == 4) {
                f11 = f15;
                f13 = f16;
            }
        }
        float f17 = 2.0f;
        float f18 = (f12 / 2.0f) + f7;
        float f19 = (f13 / 2.0f) + f14;
        n nVar = wVar.f18375D;
        if (nVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            nVar.c(d7, fArr3, fArr4);
            float f20 = fArr3[0];
            float f21 = fArr3[1];
            float f22 = fArr4[0];
            float f23 = fArr4[1];
            double d8 = f8;
            double d9 = f9;
            float sin = (float) (((Math.sin(d9) * d8) + f20) - (f10 / 2.0f));
            float cos = (float) ((f21 - (Math.cos(d9) * d8)) - (f11 / 2.0f));
            double d10 = f22;
            double d11 = f7;
            double d12 = f14;
            float cos2 = (float) ((Math.cos(d9) * d12) + (Math.sin(d9) * d11) + d10);
            f19 = (float) ((Math.sin(d9) * d12) + (f23 - (Math.cos(d9) * d11)));
            f8 = sin;
            f9 = cos;
            f18 = cos2;
            f17 = 2.0f;
        }
        fArr[0] = (f10 / f17) + f8 + 0.0f;
        fArr[1] = (f11 / f17) + f9 + 0.0f;
        fArr2[0] = f18;
        fArr2[1] = f19;
    }

    public final void d(float f7, float f8, float f9, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.f18335v;
        float b7 = b(fArr2, f7);
        q4.d[] dVarArr = this.j;
        int i7 = 0;
        if (dVarArr == null) {
            w wVar = this.f18321g;
            float f10 = wVar.f18384e;
            w wVar2 = this.f18320f;
            float f11 = f10 - wVar2.f18384e;
            float f12 = wVar.f18385f - wVar2.f18385f;
            float f13 = wVar.f18386x - wVar2.f18386x;
            float f14 = (wVar.f18387y - wVar2.f18387y) + f12;
            fArr[0] = ((f13 + f11) * f8) + ((1.0f - f8) * f11);
            fArr[1] = (f14 * f9) + ((1.0f - f9) * f12);
            return;
        }
        double d7 = b7;
        dVarArr[0].h(d7, this.f18330q);
        this.j[0].e(d7, this.f18329p);
        float f15 = fArr2[0];
        while (true) {
            dArr = this.f18330q;
            if (i7 >= dArr.length) {
                break;
            }
            dArr[i7] = dArr[i7] * f15;
            i7++;
        }
        C1613b c1613b = this.f18324k;
        if (c1613b == null) {
            int[] iArr = this.f18328o;
            double[] dArr2 = this.f18329p;
            this.f18320f.getClass();
            w.h(f8, f9, fArr, iArr, dArr, dArr2);
            return;
        }
        double[] dArr3 = this.f18329p;
        if (dArr3.length > 0) {
            c1613b.e(d7, dArr3);
            this.f18324k.h(d7, this.f18330q);
            int[] iArr2 = this.f18328o;
            double[] dArr4 = this.f18330q;
            double[] dArr5 = this.f18329p;
            this.f18320f.getClass();
            w.h(f8, f9, fArr, iArr2, dArr4, dArr5);
        }
    }

    public final boolean e(float f7, long j, View view, C1616e c1616e) {
        y.n nVar;
        boolean z4;
        float f8;
        int i7;
        boolean z7;
        double d7;
        float f9;
        w wVar;
        y.n nVar2;
        boolean z8;
        double d8;
        float f10;
        float f11;
        boolean z9;
        float f12;
        double d9;
        float f13;
        n nVar3 = this;
        View view2 = view;
        float b7 = nVar3.b(null, f7);
        int i8 = nVar3.f18311D;
        if (i8 != -1) {
            float f14 = 1.0f / i8;
            float floor = ((float) Math.floor(b7 / f14)) * f14;
            float f15 = (b7 % f14) / f14;
            if (!Float.isNaN(nVar3.f18312E)) {
                f15 = (f15 + nVar3.f18312E) % 1.0f;
            }
            Interpolator interpolator = nVar3.f18313F;
            b7 = ((interpolator != null ? interpolator.getInterpolation(f15) : ((double) f15) > 0.5d ? 1.0f : 0.0f) * f14) + floor;
        }
        float f16 = b7;
        HashMap hashMap = nVar3.f18338y;
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((y.k) it.next()).c(view2, f16);
            }
        }
        HashMap hashMap2 = nVar3.f18337x;
        if (hashMap2 != null) {
            nVar = null;
            z4 = false;
            for (y.p pVar : hashMap2.values()) {
                if (pVar instanceof y.n) {
                    nVar = (y.n) pVar;
                } else {
                    z4 |= pVar.b(f16, j, view, c1616e);
                }
            }
        } else {
            nVar = null;
            z4 = false;
        }
        q4.d[] dVarArr = nVar3.j;
        w wVar2 = nVar3.f18320f;
        if (dVarArr != null) {
            double d10 = f16;
            dVarArr[0].e(d10, nVar3.f18329p);
            nVar3.j[0].h(d10, nVar3.f18330q);
            C1613b c1613b = nVar3.f18324k;
            if (c1613b != null) {
                double[] dArr = nVar3.f18329p;
                if (dArr.length > 0) {
                    c1613b.e(d10, dArr);
                    nVar3.f18324k.h(d10, nVar3.f18330q);
                }
            }
            if (nVar3.f18314G) {
                d7 = d10;
                f9 = f16;
                wVar = wVar2;
                nVar2 = nVar;
                z8 = z4;
            } else {
                int[] iArr = nVar3.f18328o;
                double[] dArr2 = nVar3.f18329p;
                double[] dArr3 = nVar3.f18330q;
                boolean z10 = nVar3.f18318d;
                float f17 = wVar2.f18384e;
                float f18 = wVar2.f18385f;
                float f19 = wVar2.f18386x;
                float f20 = wVar2.f18387y;
                if (iArr.length != 0) {
                    f11 = f17;
                    if (wVar2.f18378G.length <= iArr[iArr.length - 1]) {
                        int i9 = iArr[iArr.length - 1] + 1;
                        wVar2.f18378G = new double[i9];
                        wVar2.f18379H = new double[i9];
                    }
                } else {
                    f11 = f17;
                }
                Arrays.fill(wVar2.f18378G, Double.NaN);
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    double[] dArr4 = wVar2.f18378G;
                    int i11 = iArr[i10];
                    dArr4[i11] = dArr2[i10];
                    wVar2.f18379H[i11] = dArr3[i10];
                }
                float f21 = Float.NaN;
                f9 = f16;
                nVar2 = nVar;
                float f22 = f20;
                float f23 = f11;
                float f24 = f18;
                float f25 = 0.0f;
                int i12 = 0;
                float f26 = 0.0f;
                float f27 = 0.0f;
                z8 = z4;
                float f28 = 0.0f;
                while (true) {
                    double[] dArr5 = wVar2.f18378G;
                    z9 = z10;
                    if (i12 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i12])) {
                        d9 = d10;
                        f13 = f21;
                    } else {
                        d9 = d10;
                        float f29 = (float) (Double.isNaN(wVar2.f18378G[i12]) ? 0.0d : wVar2.f18378G[i12] + 0.0d);
                        f13 = f21;
                        float f30 = (float) wVar2.f18379H[i12];
                        if (i12 == 1) {
                            f25 = f30;
                            f23 = f29;
                        } else if (i12 == 2) {
                            f28 = f30;
                            f24 = f29;
                        } else if (i12 == 3) {
                            f26 = f30;
                            f19 = f29;
                        } else if (i12 == 4) {
                            f27 = f30;
                            f22 = f29;
                        } else if (i12 == 5) {
                            f21 = f29;
                            i12++;
                            z10 = z9;
                            d10 = d9;
                        }
                    }
                    f21 = f13;
                    i12++;
                    z10 = z9;
                    d10 = d9;
                }
                d7 = d10;
                float f31 = f21;
                n nVar4 = wVar2.f18375D;
                if (nVar4 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    nVar4.c(d7, fArr, fArr2);
                    float f32 = fArr[0];
                    float f33 = fArr[1];
                    wVar = wVar2;
                    float f34 = fArr2[0];
                    float f35 = fArr2[1];
                    double d11 = f23;
                    double d12 = f24;
                    float sin = (float) (((Math.sin(d12) * d11) + f32) - (f19 / 2.0f));
                    f24 = (float) ((f33 - (Math.cos(d12) * d11)) - (f22 / 2.0f));
                    double d13 = f25;
                    double d14 = f28;
                    float cos = (float) ((Math.cos(d12) * d11 * d14) + (Math.sin(d12) * d13) + f34);
                    f12 = f19;
                    float sin2 = (float) ((Math.sin(d12) * d11 * d14) + (f35 - (Math.cos(d12) * d13)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = cos;
                        dArr3[1] = sin2;
                    }
                    if (Float.isNaN(f31)) {
                        view2 = view;
                    } else {
                        view2 = view;
                        view2.setRotation((float) (Math.toDegrees(Math.atan2(sin2, cos)) + f31));
                    }
                    f23 = sin;
                } else {
                    float f36 = f25;
                    f12 = f19;
                    wVar = wVar2;
                    if (!Float.isNaN(f31)) {
                        view2.setRotation((float) (Math.toDegrees(Math.atan2((f27 / 2.0f) + f28, (f26 / 2.0f) + f36)) + f31 + 0.0f));
                    }
                }
                if (view2 instanceof InterfaceC1804b) {
                    ((MotionLabel) ((InterfaceC1804b) view2)).b(f23, f24, f23 + f12, f22 + f24);
                } else {
                    float f37 = f23 + 0.5f;
                    int i13 = (int) f37;
                    float f38 = f24 + 0.5f;
                    int i14 = (int) f38;
                    int i15 = (int) (f37 + f12);
                    int i16 = (int) (f38 + f22);
                    int i17 = i15 - i13;
                    int i18 = i16 - i14;
                    if (i17 != view.getMeasuredWidth() || i18 != view.getMeasuredHeight() || z9) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                    }
                    view2.layout(i13, i14, i15, i16);
                }
                nVar3 = this;
                nVar3.f18318d = false;
            }
            if (nVar3.f18309B != -1) {
                if (nVar3.f18310C == null) {
                    nVar3.f18310C = ((View) view.getParent()).findViewById(nVar3.f18309B);
                }
                if (nVar3.f18310C != null) {
                    float bottom = (nVar3.f18310C.getBottom() + r1.getTop()) / 2.0f;
                    float right = (nVar3.f18310C.getRight() + nVar3.f18310C.getLeft()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view2.setPivotX(right - view.getLeft());
                        view2.setPivotY(bottom - view.getTop());
                    }
                }
            }
            HashMap hashMap3 = nVar3.f18338y;
            if (hashMap3 != null) {
                for (y.k kVar : hashMap3.values()) {
                    if (kVar instanceof y.i) {
                        double[] dArr6 = nVar3.f18330q;
                        if (dArr6.length > 1) {
                            f10 = f9;
                            view2.setRotation(((y.i) kVar).a(f10) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                            f9 = f10;
                        }
                    }
                    f10 = f9;
                    f9 = f10;
                }
            }
            f8 = f9;
            if (nVar2 != null) {
                double[] dArr7 = nVar3.f18330q;
                d8 = d7;
                i7 = 1;
                view2.setRotation(nVar2.a(f8, j, view, c1616e) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                z7 = z8 | nVar2.f18123d;
            } else {
                d8 = d7;
                i7 = 1;
                z7 = z8;
            }
            int i19 = i7;
            while (true) {
                q4.d[] dVarArr2 = nVar3.j;
                if (i19 >= dVarArr2.length) {
                    break;
                }
                q4.d dVar = dVarArr2[i19];
                float[] fArr3 = nVar3.f18333t;
                dVar.f(d8, fArr3);
                r6.a.d((B.a) wVar.f18376E.get(nVar3.f18331r[i19 - 1]), view2, fArr3);
                i19++;
            }
            l lVar = nVar3.f18322h;
            if (lVar.f18298b == 0) {
                if (f8 <= 0.0f) {
                    view2.setVisibility(lVar.f18299c);
                } else {
                    l lVar2 = nVar3.f18323i;
                    if (f8 >= 1.0f) {
                        view2.setVisibility(lVar2.f18299c);
                    } else if (lVar2.f18299c != lVar.f18299c) {
                        view2.setVisibility(0);
                    }
                }
            }
        } else {
            f8 = f16;
            boolean z11 = z4;
            i7 = 1;
            float f39 = wVar2.f18384e;
            w wVar3 = nVar3.f18321g;
            float f40 = ((wVar3.f18384e - f39) * f8) + f39;
            float f41 = wVar2.f18385f;
            float f42 = ((wVar3.f18385f - f41) * f8) + f41;
            float f43 = wVar2.f18386x;
            float f44 = wVar3.f18386x;
            float f45 = wVar2.f18387y;
            float f46 = wVar3.f18387y;
            float f47 = f40 + 0.5f;
            int i20 = (int) f47;
            float f48 = f42 + 0.5f;
            int i21 = (int) f48;
            int i22 = (int) (f47 + ((f44 - f43) * f8) + f43);
            int i23 = (int) (f48 + ((f46 - f45) * f8) + f45);
            int i24 = i22 - i20;
            int i25 = i23 - i21;
            if (f44 != f43 || f46 != f45 || nVar3.f18318d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i24, 1073741824), View.MeasureSpec.makeMeasureSpec(i25, 1073741824));
                nVar3.f18318d = false;
            }
            view2.layout(i20, i21, i22, i23);
            z7 = z11;
        }
        HashMap hashMap4 = nVar3.f18339z;
        if (hashMap4 != null) {
            for (y.f fVar : hashMap4.values()) {
                if (fVar instanceof C1794d) {
                    double[] dArr8 = nVar3.f18330q;
                    view2.setRotation(((C1794d) fVar).a(f8) + ((float) Math.toDegrees(Math.atan2(dArr8[i7], dArr8[0]))));
                } else {
                    fVar.d(view2, f8);
                }
            }
        }
        return z7;
    }

    public final void f(w wVar) {
        wVar.f((int) this.f18316b.getX(), (int) this.f18316b.getY(), this.f18316b.getWidth(), this.f18316b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:462:0x0e2d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0ea8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0e9f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v64, types: [y.h, y.k] */
    /* JADX WARN: Type inference failed for: r1v45, types: [y.o, y.p] */
    /* JADX WARN: Type inference failed for: r1v50, types: [y.p] */
    /* JADX WARN: Type inference failed for: r1v60, types: [y.m, y.p] */
    /* JADX WARN: Type inference failed for: r6v69, types: [y.j, y.k] */
    /* JADX WARN: Type inference failed for: r6v77, types: [y.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i7, long j, int i8) {
        ArrayList arrayList;
        HashSet hashSet;
        w wVar;
        String str;
        w wVar2;
        Object obj;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        HashMap hashMap;
        String str12;
        int i9;
        int i10;
        B.a aVar;
        String str13;
        HashSet hashSet2;
        Iterator it;
        HashMap hashMap2;
        String str14;
        char c3;
        char c4;
        y.l lVar;
        y.l lVar2;
        y.l lVar3;
        B.a aVar2;
        Iterator it2;
        int i11;
        Integer num;
        char c7;
        ArrayList arrayList2;
        HashSet hashSet3;
        Iterator it3;
        w wVar3;
        w wVar4;
        Object obj2;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        char c8;
        char c9;
        String str25;
        String str26;
        y.g gVar;
        y.g gVar2;
        B.a aVar3;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        ArrayList arrayList3;
        String str35;
        ArrayList arrayList4;
        w wVar5;
        n nVar;
        HashMap hashMap3;
        HashSet hashSet4;
        HashSet hashSet5;
        i iVar;
        float f7;
        int i12;
        float min;
        float f8;
        String str36 = "translationY";
        String str37 = "translationX";
        String str38 = "scaleY";
        String str39 = "scaleX";
        String str40 = "rotationY";
        String str41 = "rotationX";
        String str42 = "progress";
        String str43 = "transitionPathRotate";
        String str44 = "rotation";
        String str45 = ViewHierarchyNode.JsonKeys.ALPHA;
        new HashSet();
        HashSet hashSet6 = new HashSet();
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashMap hashMap4 = new HashMap();
        int i13 = this.f18308A;
        w wVar6 = this.f18320f;
        HashMap hashMap5 = hashMap4;
        if (i13 != -1) {
            wVar6.f18372A = i13;
        }
        l lVar4 = this.f18322h;
        float f9 = lVar4.f18297a;
        w wVar7 = wVar6;
        l lVar5 = this.f18323i;
        if (l.b(f9, lVar5.f18297a)) {
            hashSet7.add(ViewHierarchyNode.JsonKeys.ALPHA);
        }
        if (l.b(lVar4.f18300d, lVar5.f18300d)) {
            hashSet7.add("elevation");
        }
        int i14 = lVar4.f18299c;
        int i15 = lVar5.f18299c;
        Object obj3 = "elevation";
        if (i14 != i15 && lVar4.f18298b == 0 && (i14 == 0 || i15 == 0)) {
            hashSet7.add(ViewHierarchyNode.JsonKeys.ALPHA);
        }
        if (l.b(lVar4.f18301e, lVar5.f18301e)) {
            hashSet7.add("rotation");
        }
        if (!Float.isNaN(lVar4.f18294F) || !Float.isNaN(lVar5.f18294F)) {
            hashSet7.add("transitionPathRotate");
        }
        if (!Float.isNaN(lVar4.f18295G) || !Float.isNaN(lVar5.f18295G)) {
            hashSet7.add("progress");
        }
        if (l.b(lVar4.f18302f, lVar5.f18302f)) {
            hashSet7.add("rotationX");
        }
        if (l.b(lVar4.f18303x, lVar5.f18303x)) {
            hashSet7.add("rotationY");
        }
        if (l.b(lVar4.f18289A, lVar5.f18289A)) {
            hashSet7.add("transformPivotX");
        }
        if (l.b(lVar4.f18290B, lVar5.f18290B)) {
            hashSet7.add("transformPivotY");
        }
        if (l.b(lVar4.f18304y, lVar5.f18304y)) {
            hashSet7.add("scaleX");
        }
        if (l.b(lVar4.f18305z, lVar5.f18305z)) {
            hashSet7.add("scaleY");
        }
        if (l.b(lVar4.f18291C, lVar5.f18291C)) {
            hashSet7.add("translationX");
        }
        if (l.b(lVar4.f18292D, lVar5.f18292D)) {
            hashSet7.add("translationY");
        }
        if (l.b(lVar4.f18293E, lVar5.f18293E)) {
            hashSet7.add("translationZ");
        }
        n nVar2 = this;
        ArrayList arrayList5 = nVar2.f18336w;
        w wVar8 = nVar2.f18321g;
        ArrayList arrayList6 = nVar2.f18334u;
        if (arrayList5 != null) {
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                AbstractC1805c abstractC1805c = (AbstractC1805c) it4.next();
                String str46 = str41;
                if (abstractC1805c instanceof i) {
                    i iVar2 = (i) abstractC1805c;
                    w wVar9 = new w();
                    str31 = str40;
                    wVar9.f18381b = 0;
                    wVar9.f18388z = Float.NaN;
                    wVar9.f18372A = -1;
                    wVar9.f18373B = -1;
                    wVar9.f18374C = Float.NaN;
                    wVar9.f18375D = null;
                    wVar9.f18376E = new LinkedHashMap();
                    wVar9.f18377F = 0;
                    str28 = str37;
                    wVar9.f18378G = new double[18];
                    wVar9.f18379H = new double[18];
                    w wVar10 = wVar7;
                    str27 = str36;
                    if (wVar10.f18373B != -1) {
                        float f10 = iVar2.f18259a / 100.0f;
                        wVar9.f18382c = f10;
                        wVar9.f18381b = iVar2.f18284h;
                        wVar9.f18377F = iVar2.f18288m;
                        float f11 = Float.isNaN(iVar2.f18285i) ? f10 : iVar2.f18285i;
                        str32 = str42;
                        float f12 = Float.isNaN(iVar2.j) ? f10 : iVar2.j;
                        str30 = str39;
                        float f13 = wVar8.f18386x;
                        str29 = str38;
                        float f14 = wVar10.f18386x;
                        str34 = str44;
                        float f15 = wVar8.f18387y;
                        str33 = str43;
                        float f16 = wVar10.f18387y;
                        str35 = str45;
                        wVar9.f18383d = wVar9.f18382c;
                        wVar9.f18386x = (int) (((f13 - f14) * f11) + f14);
                        wVar9.f18387y = (int) (((f15 - f16) * f12) + f16);
                        int i16 = iVar2.f18288m;
                        if (i16 == 1) {
                            float f17 = Float.isNaN(iVar2.f18286k) ? f10 : iVar2.f18286k;
                            float f18 = wVar8.f18384e;
                            float f19 = wVar10.f18384e;
                            wVar9.f18384e = ((f18 - f19) * f17) + f19;
                            if (!Float.isNaN(iVar2.f18287l)) {
                                f10 = iVar2.f18287l;
                            }
                            float f20 = wVar8.f18385f;
                            float f21 = wVar10.f18385f;
                            wVar9.f18385f = ((f20 - f21) * f10) + f21;
                        } else if (i16 != 2) {
                            float f22 = Float.isNaN(iVar2.f18286k) ? f10 : iVar2.f18286k;
                            float f23 = wVar8.f18384e;
                            float f24 = wVar10.f18384e;
                            wVar9.f18384e = ((f23 - f24) * f22) + f24;
                            if (!Float.isNaN(iVar2.f18287l)) {
                                f10 = iVar2.f18287l;
                            }
                            float f25 = wVar8.f18385f;
                            float f26 = wVar10.f18385f;
                            wVar9.f18385f = ((f25 - f26) * f10) + f26;
                        } else {
                            if (Float.isNaN(iVar2.f18286k)) {
                                float f27 = wVar8.f18384e;
                                float f28 = wVar10.f18384e;
                                min = ((f27 - f28) * f10) + f28;
                            } else {
                                min = iVar2.f18286k * Math.min(f12, f11);
                            }
                            wVar9.f18384e = min;
                            if (Float.isNaN(iVar2.f18287l)) {
                                float f29 = wVar8.f18385f;
                                float f30 = wVar10.f18385f;
                                f8 = ((f29 - f30) * f10) + f30;
                            } else {
                                f8 = iVar2.f18287l;
                            }
                            wVar9.f18385f = f8;
                        }
                        wVar9.f18373B = wVar10.f18373B;
                        wVar9.f18380a = C1616e.d(iVar2.f18282f);
                        wVar9.f18372A = iVar2.f18283g;
                        wVar5 = wVar10;
                        arrayList3 = arrayList5;
                        iVar = iVar2;
                        arrayList4 = arrayList6;
                        hashSet5 = hashSet7;
                    } else {
                        str29 = str38;
                        str30 = str39;
                        str32 = str42;
                        str33 = str43;
                        str34 = str44;
                        str35 = str45;
                        int i17 = iVar2.f18288m;
                        if (i17 == 1) {
                            arrayList3 = arrayList5;
                            ArrayList arrayList7 = arrayList6;
                            hashSet5 = hashSet7;
                            float f31 = iVar2.f18259a / 100.0f;
                            wVar9.f18382c = f31;
                            wVar9.f18381b = iVar2.f18284h;
                            float f32 = Float.isNaN(iVar2.f18285i) ? f31 : iVar2.f18285i;
                            float f33 = Float.isNaN(iVar2.j) ? f31 : iVar2.j;
                            float f34 = wVar8.f18386x - wVar10.f18386x;
                            float f35 = wVar8.f18387y - wVar10.f18387y;
                            wVar9.f18383d = wVar9.f18382c;
                            if (!Float.isNaN(iVar2.f18286k)) {
                                f31 = iVar2.f18286k;
                            }
                            float f36 = wVar10.f18384e;
                            float f37 = wVar10.f18386x;
                            float f38 = wVar10.f18385f;
                            float f39 = wVar10.f18387y;
                            float f40 = ((wVar8.f18386x / 2.0f) + wVar8.f18384e) - ((f37 / 2.0f) + f36);
                            float f41 = ((wVar8.f18387y / 2.0f) + wVar8.f18385f) - ((f39 / 2.0f) + f38);
                            float f42 = f40 * f31;
                            float f43 = (f34 * f32) / 2.0f;
                            wVar9.f18384e = (int) ((f36 + f42) - f43);
                            float f44 = f31 * f41;
                            float f45 = (f35 * f33) / 2.0f;
                            wVar9.f18385f = (int) ((f38 + f44) - f45);
                            wVar9.f18386x = (int) (f37 + r5);
                            wVar9.f18387y = (int) (f39 + r8);
                            iVar = iVar2;
                            float f46 = Float.isNaN(iVar.f18287l) ? 0.0f : iVar.f18287l;
                            float f47 = (-f41) * f46;
                            float f48 = f40 * f46;
                            wVar9.f18377F = 1;
                            wVar5 = wVar10;
                            float f49 = (int) ((wVar5.f18384e + f42) - f43);
                            float f50 = (int) ((wVar5.f18385f + f44) - f45);
                            wVar9.f18384e = f49 + f47;
                            wVar9.f18385f = f50 + f48;
                            wVar9.f18373B = wVar9.f18373B;
                            wVar9.f18380a = C1616e.d(iVar.f18282f);
                            wVar9.f18372A = iVar.f18283g;
                            arrayList4 = arrayList7;
                        } else if (i17 != 2) {
                            float f51 = iVar2.f18259a / 100.0f;
                            wVar9.f18382c = f51;
                            wVar9.f18381b = iVar2.f18284h;
                            float f52 = Float.isNaN(iVar2.f18285i) ? f51 : iVar2.f18285i;
                            float f53 = Float.isNaN(iVar2.j) ? f51 : iVar2.j;
                            float f54 = wVar8.f18386x;
                            float f55 = wVar10.f18386x;
                            float f56 = f54 - f55;
                            float f57 = wVar8.f18387y;
                            float f58 = wVar10.f18387y;
                            float f59 = f57 - f58;
                            arrayList3 = arrayList5;
                            wVar9.f18383d = wVar9.f18382c;
                            float f60 = wVar10.f18384e;
                            hashSet5 = hashSet7;
                            float f61 = wVar10.f18385f;
                            float f62 = ((f54 / 2.0f) + wVar8.f18384e) - ((f55 / 2.0f) + f60);
                            float f63 = ((f57 / 2.0f) + wVar8.f18385f) - ((f58 / 2.0f) + f61);
                            float f64 = (f56 * f52) / 2.0f;
                            wVar9.f18384e = (int) (((f62 * f51) + f60) - f64);
                            float f65 = (f59 * f53) / 2.0f;
                            wVar9.f18385f = (int) (((f63 * f51) + f61) - f65);
                            wVar9.f18386x = (int) (f55 + r11);
                            wVar9.f18387y = (int) (f58 + r21);
                            float f66 = Float.isNaN(iVar2.f18286k) ? f51 : iVar2.f18286k;
                            float f67 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            if (!Float.isNaN(iVar2.f18287l)) {
                                f51 = iVar2.f18287l;
                            }
                            if (Float.isNaN(Float.NaN)) {
                                i12 = 0;
                                f7 = 0.0f;
                            } else {
                                f7 = Float.NaN;
                                i12 = 0;
                            }
                            wVar9.f18377F = i12;
                            wVar9.f18384e = (int) (((f7 * f63) + ((f66 * f62) + wVar10.f18384e)) - f64);
                            wVar9.f18385f = (int) (((f63 * f51) + ((f62 * f67) + wVar10.f18385f)) - f65);
                            wVar9.f18380a = C1616e.d(iVar2.f18282f);
                            wVar9.f18372A = iVar2.f18283g;
                            wVar5 = wVar10;
                            iVar = iVar2;
                            arrayList4 = arrayList6;
                        } else {
                            arrayList3 = arrayList5;
                            hashSet5 = hashSet7;
                            float f68 = iVar2.f18259a / 100.0f;
                            wVar9.f18382c = f68;
                            wVar9.f18381b = iVar2.f18284h;
                            float f69 = Float.isNaN(iVar2.f18285i) ? f68 : iVar2.f18285i;
                            float f70 = Float.isNaN(iVar2.j) ? f68 : iVar2.j;
                            float f71 = wVar8.f18386x;
                            float f72 = f71 - wVar10.f18386x;
                            float f73 = wVar8.f18387y;
                            float f74 = f73 - wVar10.f18387y;
                            wVar9.f18383d = wVar9.f18382c;
                            float f75 = wVar10.f18384e;
                            ArrayList arrayList8 = arrayList6;
                            float f76 = wVar10.f18385f;
                            float f77 = (f71 / 2.0f) + wVar8.f18384e;
                            float f78 = (f73 / 2.0f) + wVar8.f18385f;
                            float f79 = f72 * f69;
                            wVar9.f18384e = (int) ((((f77 - ((r5 / 2.0f) + f75)) * f68) + f75) - (f79 / 2.0f));
                            float f80 = f74 * f70;
                            wVar9.f18385f = (int) ((((f78 - ((r9 / 2.0f) + f76)) * f68) + f76) - (f80 / 2.0f));
                            wVar9.f18386x = (int) (r5 + f79);
                            wVar9.f18387y = (int) (r9 + f80);
                            wVar9.f18377F = 2;
                            if (!Float.isNaN(iVar2.f18286k)) {
                                wVar9.f18384e = (int) (iVar2.f18286k * ((int) (i7 - wVar9.f18386x)));
                            }
                            if (!Float.isNaN(iVar2.f18287l)) {
                                wVar9.f18385f = (int) (iVar2.f18287l * ((int) (i8 - wVar9.f18387y)));
                            }
                            wVar9.f18373B = wVar9.f18373B;
                            wVar9.f18380a = C1616e.d(iVar2.f18282f);
                            wVar9.f18372A = iVar2.f18283g;
                            iVar = iVar2;
                            arrayList4 = arrayList8;
                            wVar5 = wVar10;
                        }
                    }
                    int binarySearch = Collections.binarySearch(arrayList4, wVar9);
                    if (binarySearch == 0) {
                        Log.e("MotionController", " KeyPath position \"" + wVar9.f18383d + "\" outside of range");
                    }
                    arrayList4.add((-binarySearch) - 1, wVar9);
                    int i18 = iVar.f18281e;
                    if (i18 != -1) {
                        nVar = this;
                        nVar.f18319e = i18;
                    } else {
                        nVar = this;
                    }
                    hashMap3 = hashMap5;
                    hashSet4 = hashSet5;
                } else {
                    str27 = str36;
                    str28 = str37;
                    str29 = str38;
                    str30 = str39;
                    str31 = str40;
                    str32 = str42;
                    str33 = str43;
                    str34 = str44;
                    arrayList3 = arrayList5;
                    str35 = str45;
                    arrayList4 = arrayList6;
                    wVar5 = wVar7;
                    nVar = nVar2;
                    hashMap3 = hashMap5;
                    abstractC1805c.d(hashMap3);
                    hashSet4 = hashSet7;
                    abstractC1805c.b(hashSet4);
                }
                hashMap5 = hashMap3;
                arrayList6 = arrayList4;
                nVar2 = nVar;
                hashSet7 = hashSet4;
                wVar7 = wVar5;
                str41 = str46;
                str40 = str31;
                str37 = str28;
                str36 = str27;
                str42 = str32;
                str39 = str30;
                str38 = str29;
                str44 = str34;
                str43 = str33;
                str45 = str35;
                arrayList5 = arrayList3;
            }
        }
        String str47 = str36;
        String str48 = str37;
        String str49 = str38;
        String str50 = str39;
        String str51 = str40;
        String str52 = str41;
        String str53 = str42;
        String str54 = str43;
        String str55 = str44;
        ArrayList arrayList9 = arrayList5;
        String str56 = str45;
        ArrayList arrayList10 = arrayList6;
        HashSet hashSet9 = hashSet7;
        w wVar11 = wVar7;
        n nVar3 = nVar2;
        HashMap hashMap6 = hashMap5;
        String str57 = "CUSTOM,";
        String str58 = ",";
        if (hashSet9.isEmpty()) {
            arrayList = arrayList10;
            hashSet = hashSet9;
            wVar = wVar11;
            str = ",";
            wVar2 = wVar8;
            obj = obj3;
            str2 = str52;
            str3 = str51;
            str4 = str48;
            str5 = str47;
            str6 = str53;
            str7 = str50;
            str8 = str49;
            str9 = str55;
            str10 = str54;
            str11 = str56;
            hashMap = hashMap6;
            str12 = "CUSTOM,";
        } else {
            nVar3.f18338y = new HashMap();
            Iterator it5 = hashSet9.iterator();
            while (it5.hasNext()) {
                String str59 = (String) it5.next();
                if (!str59.startsWith(str57)) {
                    switch (str59.hashCode()) {
                        case -1249320806:
                            arrayList2 = arrayList10;
                            hashSet3 = hashSet9;
                            it3 = it5;
                            wVar3 = wVar11;
                            wVar4 = wVar8;
                            obj2 = obj3;
                            str15 = str52;
                            str16 = str51;
                            str17 = str48;
                            str18 = str47;
                            str19 = str53;
                            str20 = str50;
                            str21 = str49;
                            str22 = str55;
                            str23 = str54;
                            str24 = str56;
                            if (str59.equals(str15)) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -1249320805:
                            hashSet3 = hashSet9;
                            it3 = it5;
                            wVar3 = wVar11;
                            wVar4 = wVar8;
                            obj2 = obj3;
                            str16 = str51;
                            str17 = str48;
                            str18 = str47;
                            str19 = str53;
                            str20 = str50;
                            str21 = str49;
                            str22 = str55;
                            str23 = str54;
                            str24 = str56;
                            arrayList2 = arrayList10;
                            str15 = str52;
                            if (str59.equals(str16)) {
                                c8 = 1;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -1225497657:
                            hashSet3 = hashSet9;
                            it3 = it5;
                            wVar4 = wVar8;
                            obj2 = obj3;
                            str17 = str48;
                            str18 = str47;
                            str19 = str53;
                            str20 = str50;
                            str21 = str49;
                            str22 = str55;
                            str23 = str54;
                            str24 = str56;
                            arrayList2 = arrayList10;
                            if (str59.equals(str17)) {
                                wVar3 = wVar11;
                                str15 = str52;
                                str16 = str51;
                                c8 = 2;
                                break;
                            } else {
                                wVar3 = wVar11;
                                str15 = str52;
                                str16 = str51;
                                c8 = 65535;
                                break;
                            }
                        case -1225497656:
                            hashSet3 = hashSet9;
                            it3 = it5;
                            obj2 = obj3;
                            str18 = str47;
                            str19 = str53;
                            str20 = str50;
                            str21 = str49;
                            str22 = str55;
                            str23 = str54;
                            str24 = str56;
                            arrayList2 = arrayList10;
                            wVar3 = wVar11;
                            if (str59.equals(str18)) {
                                wVar4 = wVar8;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                c8 = 3;
                                break;
                            } else {
                                wVar4 = wVar8;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                c8 = 65535;
                                break;
                            }
                        case -1225497655:
                            hashSet3 = hashSet9;
                            it3 = it5;
                            obj2 = obj3;
                            str19 = str53;
                            str20 = str50;
                            str21 = str49;
                            str22 = str55;
                            str23 = str54;
                            str24 = str56;
                            arrayList2 = arrayList10;
                            wVar3 = wVar11;
                            wVar4 = wVar8;
                            str15 = str52;
                            str16 = str51;
                            str17 = str48;
                            if (str59.equals("translationZ")) {
                                str18 = str47;
                                c8 = 4;
                                break;
                            }
                            str18 = str47;
                            c8 = 65535;
                            break;
                        case -1001078227:
                            it3 = it5;
                            obj2 = obj3;
                            str19 = str53;
                            str20 = str50;
                            str21 = str49;
                            str22 = str55;
                            str23 = str54;
                            str24 = str56;
                            arrayList2 = arrayList10;
                            hashSet3 = hashSet9;
                            wVar3 = wVar11;
                            if (str59.equals(str19)) {
                                wVar4 = wVar8;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                str18 = str47;
                                c8 = 5;
                                break;
                            } else {
                                wVar4 = wVar8;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                str18 = str47;
                                c8 = 65535;
                                break;
                            }
                        case -908189618:
                            obj2 = obj3;
                            str20 = str50;
                            str21 = str49;
                            str22 = str55;
                            str23 = str54;
                            str24 = str56;
                            arrayList2 = arrayList10;
                            hashSet3 = hashSet9;
                            it3 = it5;
                            wVar3 = wVar11;
                            if (str59.equals(str20)) {
                                wVar4 = wVar8;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                str18 = str47;
                                str19 = str53;
                                c8 = 6;
                                break;
                            } else {
                                wVar4 = wVar8;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                str18 = str47;
                                str19 = str53;
                                c8 = 65535;
                                break;
                            }
                        case -908189617:
                            obj2 = obj3;
                            str21 = str49;
                            str22 = str55;
                            str23 = str54;
                            str24 = str56;
                            arrayList2 = arrayList10;
                            hashSet3 = hashSet9;
                            it3 = it5;
                            wVar3 = wVar11;
                            wVar4 = wVar8;
                            str15 = str52;
                            str16 = str51;
                            str17 = str48;
                            str18 = str47;
                            str19 = str53;
                            if (str59.equals(str21)) {
                                str20 = str50;
                                c8 = 7;
                                break;
                            } else {
                                str20 = str50;
                                c8 = 65535;
                                break;
                            }
                        case -797520672:
                            obj2 = obj3;
                            str22 = str55;
                            str23 = str54;
                            str24 = str56;
                            if (str59.equals("waveVariesBy")) {
                                arrayList2 = arrayList10;
                                hashSet3 = hashSet9;
                                it3 = it5;
                                wVar3 = wVar11;
                                wVar4 = wVar8;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                str18 = str47;
                                str19 = str53;
                                str20 = str50;
                                str21 = str49;
                                c8 = '\b';
                                break;
                            }
                            arrayList2 = arrayList10;
                            hashSet3 = hashSet9;
                            it3 = it5;
                            wVar3 = wVar11;
                            wVar4 = wVar8;
                            str15 = str52;
                            str16 = str51;
                            str17 = str48;
                            str18 = str47;
                            str19 = str53;
                            str20 = str50;
                            str21 = str49;
                            c8 = 65535;
                            break;
                        case -760884510:
                            obj2 = obj3;
                            str22 = str55;
                            str23 = str54;
                            str24 = str56;
                            if (str59.equals("transformPivotX")) {
                                arrayList2 = arrayList10;
                                hashSet3 = hashSet9;
                                it3 = it5;
                                wVar3 = wVar11;
                                wVar4 = wVar8;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                str18 = str47;
                                str19 = str53;
                                str20 = str50;
                                str21 = str49;
                                c8 = '\t';
                                break;
                            }
                            arrayList2 = arrayList10;
                            hashSet3 = hashSet9;
                            it3 = it5;
                            wVar3 = wVar11;
                            wVar4 = wVar8;
                            str15 = str52;
                            str16 = str51;
                            str17 = str48;
                            str18 = str47;
                            str19 = str53;
                            str20 = str50;
                            str21 = str49;
                            c8 = 65535;
                            break;
                        case -760884509:
                            obj2 = obj3;
                            str22 = str55;
                            str23 = str54;
                            str24 = str56;
                            if (str59.equals("transformPivotY")) {
                                c9 = '\n';
                                arrayList2 = arrayList10;
                                hashSet3 = hashSet9;
                                it3 = it5;
                                wVar3 = wVar11;
                                c8 = c9;
                                wVar4 = wVar8;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                str18 = str47;
                                str19 = str53;
                                str20 = str50;
                                str21 = str49;
                                break;
                            }
                            arrayList2 = arrayList10;
                            hashSet3 = hashSet9;
                            it3 = it5;
                            wVar3 = wVar11;
                            wVar4 = wVar8;
                            str15 = str52;
                            str16 = str51;
                            str17 = str48;
                            str18 = str47;
                            str19 = str53;
                            str20 = str50;
                            str21 = str49;
                            c8 = 65535;
                            break;
                        case -40300674:
                            obj2 = obj3;
                            str22 = str55;
                            str23 = str54;
                            str24 = str56;
                            if (str59.equals(str22)) {
                                c9 = 11;
                                arrayList2 = arrayList10;
                                hashSet3 = hashSet9;
                                it3 = it5;
                                wVar3 = wVar11;
                                c8 = c9;
                                wVar4 = wVar8;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                str18 = str47;
                                str19 = str53;
                                str20 = str50;
                                str21 = str49;
                                break;
                            }
                            arrayList2 = arrayList10;
                            hashSet3 = hashSet9;
                            it3 = it5;
                            wVar3 = wVar11;
                            wVar4 = wVar8;
                            str15 = str52;
                            str16 = str51;
                            str17 = str48;
                            str18 = str47;
                            str19 = str53;
                            str20 = str50;
                            str21 = str49;
                            c8 = 65535;
                            break;
                        case -4379043:
                            obj2 = obj3;
                            str23 = str54;
                            str24 = str56;
                            if (str59.equals(obj2)) {
                                arrayList2 = arrayList10;
                                hashSet3 = hashSet9;
                                it3 = it5;
                                wVar3 = wVar11;
                                c8 = '\f';
                                wVar4 = wVar8;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                str18 = str47;
                                str19 = str53;
                                str20 = str50;
                                str21 = str49;
                                str22 = str55;
                                break;
                            } else {
                                arrayList2 = arrayList10;
                                hashSet3 = hashSet9;
                                it3 = it5;
                                wVar3 = wVar11;
                                wVar4 = wVar8;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                str18 = str47;
                                str19 = str53;
                                str20 = str50;
                                str21 = str49;
                                str22 = str55;
                                c8 = 65535;
                                break;
                            }
                        case 37232917:
                            str23 = str54;
                            str24 = str56;
                            if (str59.equals(str23)) {
                                arrayList2 = arrayList10;
                                hashSet3 = hashSet9;
                                it3 = it5;
                                wVar3 = wVar11;
                                wVar4 = wVar8;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                str18 = str47;
                                str19 = str53;
                                str20 = str50;
                                str21 = str49;
                                str22 = str55;
                                Object obj4 = obj3;
                                c8 = '\r';
                                obj2 = obj4;
                                break;
                            } else {
                                arrayList2 = arrayList10;
                                hashSet3 = hashSet9;
                                it3 = it5;
                                wVar3 = wVar11;
                                wVar4 = wVar8;
                                obj2 = obj3;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                str18 = str47;
                                str19 = str53;
                                str20 = str50;
                                str21 = str49;
                                str22 = str55;
                                c8 = 65535;
                                break;
                            }
                        case 92909918:
                            str24 = str56;
                            if (str59.equals(str24)) {
                                arrayList2 = arrayList10;
                                hashSet3 = hashSet9;
                                it3 = it5;
                                wVar3 = wVar11;
                                wVar4 = wVar8;
                                obj2 = obj3;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                str18 = str47;
                                str19 = str53;
                                str20 = str50;
                                str21 = str49;
                                str22 = str55;
                                c8 = 14;
                                str23 = str54;
                                break;
                            } else {
                                arrayList2 = arrayList10;
                                hashSet3 = hashSet9;
                                it3 = it5;
                                wVar3 = wVar11;
                                wVar4 = wVar8;
                                obj2 = obj3;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                str18 = str47;
                                str19 = str53;
                                str20 = str50;
                                str21 = str49;
                                str22 = str55;
                                str23 = str54;
                                c8 = 65535;
                                break;
                            }
                        case 156108012:
                            if (str59.equals("waveOffset")) {
                                arrayList2 = arrayList10;
                                hashSet3 = hashSet9;
                                it3 = it5;
                                wVar3 = wVar11;
                                wVar4 = wVar8;
                                obj2 = obj3;
                                str15 = str52;
                                str16 = str51;
                                str17 = str48;
                                str18 = str47;
                                str19 = str53;
                                str20 = str50;
                                str21 = str49;
                                str22 = str55;
                                str23 = str54;
                                c8 = 15;
                                str24 = str56;
                                break;
                            }
                        default:
                            arrayList2 = arrayList10;
                            hashSet3 = hashSet9;
                            it3 = it5;
                            wVar3 = wVar11;
                            wVar4 = wVar8;
                            obj2 = obj3;
                            str15 = str52;
                            str16 = str51;
                            str17 = str48;
                            str18 = str47;
                            str19 = str53;
                            str20 = str50;
                            str21 = str49;
                            str22 = str55;
                            str23 = str54;
                            str24 = str56;
                            c8 = 65535;
                            break;
                    }
                    switch (c8) {
                        case 0:
                            str25 = str57;
                            str26 = str58;
                            gVar2 = new y.g(5);
                            break;
                        case 1:
                            str25 = str57;
                            str26 = str58;
                            gVar2 = new y.g(6);
                            break;
                        case 2:
                            str25 = str57;
                            str26 = str58;
                            gVar2 = new y.g(9);
                            break;
                        case 3:
                            str25 = str57;
                            str26 = str58;
                            gVar2 = new y.g(10);
                            break;
                        case 4:
                            str25 = str57;
                            str26 = str58;
                            gVar2 = new y.g(11);
                            break;
                        case 5:
                            str25 = str57;
                            str26 = str58;
                            ?? jVar = new y.j();
                            jVar.f18108f = false;
                            gVar2 = jVar;
                            break;
                        case 6:
                            str25 = str57;
                            str26 = str58;
                            gVar2 = new y.g(7);
                            break;
                        case 7:
                            str25 = str57;
                            str26 = str58;
                            gVar2 = new y.g(8);
                            break;
                        case '\b':
                            str25 = str57;
                            str26 = str58;
                            gVar2 = new y.g(0);
                            break;
                        case '\t':
                            str25 = str57;
                            str26 = str58;
                            gVar2 = new y.g(2);
                            break;
                        case '\n':
                            str25 = str57;
                            str26 = str58;
                            gVar2 = new y.g(3);
                            break;
                        case 11:
                            str25 = str57;
                            str26 = str58;
                            gVar2 = new y.g(4);
                            break;
                        case '\f':
                            str25 = str57;
                            str26 = str58;
                            gVar2 = new y.g(1);
                            break;
                        case '\r':
                            str25 = str57;
                            str26 = str58;
                            gVar2 = new y.i();
                            break;
                        case 14:
                            str25 = str57;
                            str26 = str58;
                            gVar = new y.g(0);
                            gVar2 = gVar;
                            break;
                        case 15:
                            str26 = str58;
                            str25 = str57;
                            gVar = new y.g(0);
                            gVar2 = gVar;
                            break;
                        default:
                            str25 = str57;
                            str26 = str58;
                            gVar2 = null;
                            break;
                    }
                } else {
                    SparseArray sparseArray = new SparseArray();
                    String str60 = str59.split(str58)[1];
                    Iterator it6 = arrayList9.iterator();
                    while (it6.hasNext()) {
                        AbstractC1805c abstractC1805c2 = (AbstractC1805c) it6.next();
                        HashMap hashMap7 = abstractC1805c2.f18262d;
                        if (hashMap7 != null && (aVar3 = (B.a) hashMap7.get(str60)) != null) {
                            sparseArray.append(abstractC1805c2.f18259a, aVar3);
                        }
                    }
                    ?? hVar = new y.h();
                    String str61 = str59.split(str58)[1];
                    hVar.f18106f = sparseArray;
                    arrayList2 = arrayList10;
                    hashSet3 = hashSet9;
                    it3 = it5;
                    wVar3 = wVar11;
                    str26 = str58;
                    wVar4 = wVar8;
                    obj2 = obj3;
                    str15 = str52;
                    str16 = str51;
                    str17 = str48;
                    str18 = str47;
                    str19 = str53;
                    str20 = str50;
                    str21 = str49;
                    str22 = str55;
                    str24 = str56;
                    str25 = str57;
                    gVar2 = hVar;
                    str23 = str54;
                }
                if (gVar2 != null) {
                    gVar2.f18113e = str59;
                    nVar3.f18338y.put(str59, gVar2);
                }
                str58 = str26;
                str52 = str15;
                str47 = str18;
                str53 = str19;
                str51 = str16;
                str56 = str24;
                str54 = str23;
                str55 = str22;
                str49 = str21;
                str48 = str17;
                str50 = str20;
                wVar8 = wVar4;
                wVar11 = wVar3;
                str57 = str25;
                arrayList10 = arrayList2;
                hashSet9 = hashSet3;
                it5 = it3;
                obj3 = obj2;
            }
            arrayList = arrayList10;
            hashSet = hashSet9;
            wVar = wVar11;
            str = str58;
            wVar2 = wVar8;
            obj = obj3;
            str2 = str52;
            str3 = str51;
            str4 = str48;
            str5 = str47;
            str6 = str53;
            str7 = str50;
            str8 = str49;
            str9 = str55;
            str10 = str54;
            str11 = str56;
            str12 = str57;
            if (arrayList9 != null) {
                Iterator it7 = arrayList9.iterator();
                while (it7.hasNext()) {
                    AbstractC1805c abstractC1805c3 = (AbstractC1805c) it7.next();
                    if (abstractC1805c3 instanceof C1807e) {
                        HashMap hashMap8 = nVar3.f18338y;
                        C1807e c1807e = (C1807e) abstractC1805c3;
                        c1807e.getClass();
                        for (String str62 : hashMap8.keySet()) {
                            Iterator it8 = it7;
                            HashMap hashMap9 = hashMap8;
                            y.k kVar = (y.k) hashMap8.get(str62);
                            if (kVar == null) {
                                it7 = it8;
                            } else {
                                HashMap hashMap10 = hashMap6;
                                if (!str62.startsWith("CUSTOM")) {
                                    switch (str62.hashCode()) {
                                        case -1249320806:
                                            if (str62.equals(str2)) {
                                                c7 = 0;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case -1249320805:
                                            if (str62.equals(str3)) {
                                                c7 = 1;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case -1225497657:
                                            if (str62.equals(str4)) {
                                                c7 = 2;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case -1225497656:
                                            if (str62.equals(str5)) {
                                                c7 = 3;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case -1225497655:
                                            if (str62.equals("translationZ")) {
                                                c7 = 4;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case -1001078227:
                                            if (str62.equals(str6)) {
                                                c7 = 5;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case -908189618:
                                            if (str62.equals(str7)) {
                                                c7 = 6;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case -908189617:
                                            if (str62.equals(str8)) {
                                                c7 = 7;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case -760884510:
                                            if (str62.equals("transformPivotX")) {
                                                c7 = '\b';
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case -760884509:
                                            if (str62.equals("transformPivotY")) {
                                                c7 = '\t';
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case -40300674:
                                            if (str62.equals(str9)) {
                                                c7 = '\n';
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case -4379043:
                                            if (str62.equals(obj)) {
                                                c7 = 11;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case 37232917:
                                            if (str62.equals(str10)) {
                                                c7 = '\f';
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case 92909918:
                                            if (str62.equals(str11)) {
                                                c7 = '\r';
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        default:
                                            c7 = 65535;
                                            break;
                                    }
                                    switch (c7) {
                                        case 0:
                                            if (!Float.isNaN(c1807e.f18268i)) {
                                                kVar.b(c1807e.f18268i, c1807e.f18259a);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            if (!Float.isNaN(c1807e.j)) {
                                                kVar.b(c1807e.j, c1807e.f18259a);
                                                break;
                                            }
                                            break;
                                        case 2:
                                            if (!Float.isNaN(c1807e.f18274p)) {
                                                kVar.b(c1807e.f18274p, c1807e.f18259a);
                                                break;
                                            }
                                            break;
                                        case 3:
                                            if (!Float.isNaN(c1807e.f18275q)) {
                                                kVar.b(c1807e.f18275q, c1807e.f18259a);
                                                break;
                                            }
                                            break;
                                        case 4:
                                            if (!Float.isNaN(c1807e.f18276r)) {
                                                kVar.b(c1807e.f18276r, c1807e.f18259a);
                                                break;
                                            }
                                            break;
                                        case 5:
                                            if (!Float.isNaN(c1807e.f18277s)) {
                                                kVar.b(c1807e.f18277s, c1807e.f18259a);
                                                break;
                                            }
                                            break;
                                        case 6:
                                            if (!Float.isNaN(c1807e.f18272n)) {
                                                kVar.b(c1807e.f18272n, c1807e.f18259a);
                                                break;
                                            }
                                            break;
                                        case 7:
                                            if (!Float.isNaN(c1807e.f18273o)) {
                                                kVar.b(c1807e.f18273o, c1807e.f18259a);
                                                break;
                                            }
                                            break;
                                        case '\b':
                                            if (!Float.isNaN(c1807e.f18268i)) {
                                                kVar.b(c1807e.f18269k, c1807e.f18259a);
                                                break;
                                            }
                                            break;
                                        case '\t':
                                            if (!Float.isNaN(c1807e.j)) {
                                                kVar.b(c1807e.f18270l, c1807e.f18259a);
                                                break;
                                            }
                                            break;
                                        case '\n':
                                            if (!Float.isNaN(c1807e.f18267h)) {
                                                kVar.b(c1807e.f18267h, c1807e.f18259a);
                                                break;
                                            }
                                            break;
                                        case 11:
                                            if (!Float.isNaN(c1807e.f18266g)) {
                                                kVar.b(c1807e.f18266g, c1807e.f18259a);
                                                break;
                                            }
                                            break;
                                        case '\f':
                                            if (!Float.isNaN(c1807e.f18271m)) {
                                                kVar.b(c1807e.f18271m, c1807e.f18259a);
                                                break;
                                            }
                                            break;
                                        case '\r':
                                            if (!Float.isNaN(c1807e.f18265f)) {
                                                kVar.b(c1807e.f18265f, c1807e.f18259a);
                                                break;
                                            }
                                            break;
                                    }
                                } else {
                                    B.a aVar4 = (B.a) c1807e.f18262d.get(str62.substring(7));
                                    if (aVar4 != null) {
                                        ((y.h) kVar).f18106f.append(c1807e.f18259a, aVar4);
                                    }
                                }
                                it7 = it8;
                                hashMap6 = hashMap10;
                            }
                            hashMap8 = hashMap9;
                        }
                    }
                    it7 = it7;
                    hashMap6 = hashMap6;
                }
            }
            HashMap hashMap11 = hashMap6;
            lVar4.a(0, nVar3.f18338y);
            lVar5.a(100, nVar3.f18338y);
            Iterator it9 = nVar3.f18338y.keySet().iterator();
            while (it9.hasNext()) {
                String str63 = (String) it9.next();
                HashMap hashMap12 = hashMap11;
                if (!hashMap12.containsKey(str63) || (num = (Integer) hashMap12.get(str63)) == null) {
                    it2 = it9;
                    i11 = 0;
                } else {
                    i11 = num.intValue();
                    it2 = it9;
                }
                y.k kVar2 = (y.k) nVar3.f18338y.get(str63);
                if (kVar2 != null) {
                    kVar2.d(i11);
                }
                it9 = it2;
                hashMap11 = hashMap12;
            }
            hashMap = hashMap11;
        }
        if (!hashSet6.isEmpty()) {
            if (nVar3.f18337x == null) {
                nVar3.f18337x = new HashMap();
            }
            Iterator it10 = hashSet6.iterator();
            while (it10.hasNext()) {
                String str64 = (String) it10.next();
                if (!nVar3.f18337x.containsKey(str64)) {
                    String str65 = str12;
                    if (str64.startsWith(str65)) {
                        it = it10;
                        SparseArray sparseArray2 = new SparseArray();
                        str12 = str65;
                        String str66 = str;
                        hashMap2 = hashMap;
                        String str67 = str64.split(str66)[1];
                        Iterator it11 = arrayList9.iterator();
                        while (it11.hasNext()) {
                            AbstractC1805c abstractC1805c4 = (AbstractC1805c) it11.next();
                            String str68 = str2;
                            HashMap hashMap13 = abstractC1805c4.f18262d;
                            if (hashMap13 != null && (aVar2 = (B.a) hashMap13.get(str67)) != null) {
                                sparseArray2.append(abstractC1805c4.f18259a, aVar2);
                            }
                            str2 = str68;
                        }
                        String str69 = str2;
                        ?? mVar = new y.m();
                        mVar.f18117i = new SparseArray();
                        mVar.f18115g = str64.split(str66)[1];
                        mVar.f18116h = sparseArray2;
                        str = str66;
                        str14 = str69;
                        lVar2 = mVar;
                    } else {
                        it = it10;
                        String str70 = str2;
                        hashMap2 = hashMap;
                        str12 = str65;
                        String str71 = str;
                        switch (str64.hashCode()) {
                            case -1249320806:
                                str14 = str70;
                                if (str64.equals(str14)) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1249320805:
                                if (str64.equals(str3)) {
                                    str14 = str70;
                                    c3 = 1;
                                    break;
                                }
                                str14 = str70;
                                c3 = 65535;
                                break;
                            case -1225497657:
                                if (str64.equals(str4)) {
                                    str14 = str70;
                                    c3 = 2;
                                    break;
                                }
                                str14 = str70;
                                c3 = 65535;
                                break;
                            case -1225497656:
                                if (str64.equals(str5)) {
                                    str14 = str70;
                                    c3 = 3;
                                    break;
                                }
                                str14 = str70;
                                c3 = 65535;
                                break;
                            case -1225497655:
                                if (str64.equals("translationZ")) {
                                    str14 = str70;
                                    c3 = 4;
                                    break;
                                }
                                str14 = str70;
                                c3 = 65535;
                                break;
                            case -1001078227:
                                if (str64.equals(str6)) {
                                    str14 = str70;
                                    c3 = 5;
                                    break;
                                }
                                str14 = str70;
                                c3 = 65535;
                                break;
                            case -908189618:
                                if (str64.equals(str7)) {
                                    str14 = str70;
                                    c3 = 6;
                                    break;
                                }
                                str14 = str70;
                                c3 = 65535;
                                break;
                            case -908189617:
                                if (str64.equals(str8)) {
                                    str14 = str70;
                                    c3 = 7;
                                    break;
                                }
                                str14 = str70;
                                c3 = 65535;
                                break;
                            case -40300674:
                                if (str64.equals(str9)) {
                                    str14 = str70;
                                    c3 = '\b';
                                    break;
                                }
                                str14 = str70;
                                c3 = 65535;
                                break;
                            case -4379043:
                                if (str64.equals(obj)) {
                                    str14 = str70;
                                    c3 = '\t';
                                    break;
                                }
                                str14 = str70;
                                c3 = 65535;
                                break;
                            case 37232917:
                                if (str64.equals(str10)) {
                                    c4 = '\n';
                                    c3 = c4;
                                    str14 = str70;
                                    break;
                                }
                                str14 = str70;
                                c3 = 65535;
                                break;
                            case 92909918:
                                if (str64.equals(str11)) {
                                    c4 = 11;
                                    c3 = c4;
                                    str14 = str70;
                                    break;
                                }
                                str14 = str70;
                                c3 = 65535;
                                break;
                            default:
                                str14 = str70;
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                lVar = new y.l(3);
                                str = str71;
                                lVar.f18124e = j;
                                lVar3 = lVar;
                                break;
                            case 1:
                                lVar = new y.l(4);
                                str = str71;
                                lVar.f18124e = j;
                                lVar3 = lVar;
                                break;
                            case 2:
                                lVar = new y.l(7);
                                str = str71;
                                lVar.f18124e = j;
                                lVar3 = lVar;
                                break;
                            case 3:
                                lVar = new y.l(8);
                                str = str71;
                                lVar.f18124e = j;
                                lVar3 = lVar;
                                break;
                            case 4:
                                lVar = new y.l(9);
                                str = str71;
                                lVar.f18124e = j;
                                lVar3 = lVar;
                                break;
                            case 5:
                                ?? oVar = new y.o();
                                oVar.f18119g = false;
                                lVar = oVar;
                                str = str71;
                                lVar.f18124e = j;
                                lVar3 = lVar;
                                break;
                            case 6:
                                lVar = new y.l(5);
                                str = str71;
                                lVar.f18124e = j;
                                lVar3 = lVar;
                                break;
                            case 7:
                                lVar = new y.l(6);
                                str = str71;
                                lVar.f18124e = j;
                                lVar3 = lVar;
                                break;
                            case '\b':
                                lVar = new y.l(2);
                                str = str71;
                                lVar.f18124e = j;
                                lVar3 = lVar;
                                break;
                            case '\t':
                                lVar = new y.l(1);
                                str = str71;
                                lVar.f18124e = j;
                                lVar3 = lVar;
                                break;
                            case '\n':
                                lVar = new y.n();
                                str = str71;
                                lVar.f18124e = j;
                                lVar3 = lVar;
                                break;
                            case 11:
                                lVar = new y.l(0);
                                str = str71;
                                lVar.f18124e = j;
                                lVar3 = lVar;
                                break;
                            default:
                                str = str71;
                                lVar2 = null;
                                break;
                        }
                        if (lVar3 != null) {
                            nVar3 = this;
                            str2 = str14;
                            hashMap = hashMap2;
                            it10 = it;
                        } else {
                            lVar3.f18121b = str64;
                            nVar3 = this;
                            String str72 = str14;
                            nVar3.f18337x.put(str64, lVar3);
                            it10 = it;
                            str2 = str72;
                            hashMap = hashMap2;
                        }
                    }
                    lVar3 = lVar2;
                    if (lVar3 != null) {
                    }
                }
            }
            HashMap hashMap14 = hashMap;
            if (arrayList9 != null) {
                Iterator it12 = arrayList9.iterator();
                while (it12.hasNext()) {
                }
            }
            for (String str73 : nVar3.f18337x.keySet()) {
                HashMap hashMap15 = hashMap14;
                ((y.p) nVar3.f18337x.get(str73)).c(hashMap15.containsKey(str73) ? ((Integer) hashMap15.get(str73)).intValue() : 0);
                hashMap14 = hashMap15;
            }
        }
        int size = arrayList.size();
        int i19 = size + 2;
        w[] wVarArr = new w[i19];
        wVarArr[0] = wVar;
        wVarArr[size + 1] = wVar2;
        if (arrayList.size() > 0 && nVar3.f18319e == -1) {
            nVar3.f18319e = 0;
        }
        Iterator it13 = arrayList.iterator();
        int i20 = 1;
        while (it13.hasNext()) {
            wVarArr[i20] = (w) it13.next();
            i20++;
        }
        HashSet hashSet10 = new HashSet();
        for (String str74 : wVar2.f18376E.keySet()) {
            w wVar12 = wVar;
            if (wVar12.f18376E.containsKey(str74)) {
                str13 = str12;
                hashSet2 = hashSet;
                if (!hashSet2.contains(str13 + str74)) {
                    hashSet10.add(str74);
                }
            } else {
                str13 = str12;
                hashSet2 = hashSet;
            }
            wVar = wVar12;
            str12 = str13;
            hashSet = hashSet2;
        }
        String[] strArr = (String[]) hashSet10.toArray(new String[0]);
        nVar3.f18331r = strArr;
        nVar3.f18332s = new int[strArr.length];
        int i21 = 0;
        while (true) {
            String[] strArr2 = nVar3.f18331r;
            if (i21 < strArr2.length) {
                String str75 = strArr2[i21];
                nVar3.f18332s[i21] = 0;
                int i22 = 0;
                while (true) {
                    if (i22 < i19) {
                        if (!wVarArr[i22].f18376E.containsKey(str75) || (aVar = (B.a) wVarArr[i22].f18376E.get(str75)) == null) {
                            i22++;
                        } else {
                            int[] iArr = nVar3.f18332s;
                            iArr[i21] = aVar.c() + iArr[i21];
                        }
                    }
                }
                i21++;
            } else {
                boolean z4 = wVarArr[0].f18372A != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                for (int i23 = 1; i23 < i19; i23++) {
                    w wVar13 = wVarArr[i23];
                    w wVar14 = wVarArr[i23 - 1];
                    boolean b7 = w.b(wVar13.f18384e, wVar14.f18384e);
                    boolean b8 = w.b(wVar13.f18385f, wVar14.f18385f);
                    zArr[0] = zArr[0] | w.b(wVar13.f18383d, wVar14.f18383d);
                    boolean z7 = b7 | b8 | z4;
                    zArr[1] = zArr[1] | z7;
                    zArr[2] = z7 | zArr[2];
                    zArr[3] = zArr[3] | w.b(wVar13.f18386x, wVar14.f18386x);
                    zArr[4] = w.b(wVar13.f18387y, wVar14.f18387y) | zArr[4];
                }
                int i24 = 0;
                for (int i25 = 1; i25 < length; i25++) {
                    if (zArr[i25]) {
                        i24++;
                    }
                }
                nVar3.f18328o = new int[i24];
                int max = Math.max(2, i24);
                nVar3.f18329p = new double[max];
                nVar3.f18330q = new double[max];
                int i26 = 1;
                int i27 = 0;
                while (i26 < length) {
                    if (zArr[i26]) {
                        i10 = 1;
                        nVar3.f18328o[i27] = i26;
                        i27++;
                    } else {
                        i10 = 1;
                    }
                    i26 += i10;
                }
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i19, nVar3.f18328o.length);
                double[] dArr2 = new double[i19];
                for (int i28 = 0; i28 < i19; i28++) {
                    w wVar15 = wVarArr[i28];
                    double[] dArr3 = dArr[i28];
                    int[] iArr2 = nVar3.f18328o;
                    int i29 = 6;
                    float[] fArr = {wVar15.f18383d, wVar15.f18384e, wVar15.f18385f, wVar15.f18386x, wVar15.f18387y, wVar15.f18388z};
                    int i30 = 0;
                    int i31 = 0;
                    while (i30 < iArr2.length) {
                        if (iArr2[i30] < i29) {
                            dArr3[i31] = fArr[r9];
                            i31++;
                        }
                        i30++;
                        i29 = 6;
                    }
                    dArr2[i28] = wVarArr[i28].f18382c;
                }
                int i32 = 0;
                while (true) {
                    int[] iArr3 = nVar3.f18328o;
                    if (i32 < iArr3.length) {
                        if (iArr3[i32] < 6) {
                            String i33 = e1.k.i(new StringBuilder(), w.f18371I[nVar3.f18328o[i32]], " [");
                            for (int i34 = 0; i34 < i19; i34++) {
                                StringBuilder c10 = t.e.c(i33);
                                c10.append(dArr[i34][i32]);
                                i33 = c10.toString();
                            }
                        }
                        i32++;
                    } else {
                        nVar3.j = new q4.d[nVar3.f18331r.length + 1];
                        int i35 = 0;
                        while (true) {
                            String[] strArr3 = nVar3.f18331r;
                            if (i35 >= strArr3.length) {
                                nVar3.j[0] = q4.d.c(nVar3.f18319e, dArr2, dArr);
                                if (wVarArr[0].f18372A != -1) {
                                    int[] iArr4 = new int[i19];
                                    double[] dArr4 = new double[i19];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i19, 2);
                                    for (int i36 = 0; i36 < i19; i36++) {
                                        iArr4[i36] = wVarArr[i36].f18372A;
                                        dArr4[i36] = r6.f18382c;
                                        double[] dArr6 = dArr5[i36];
                                        dArr6[0] = r6.f18384e;
                                        dArr6[1] = r6.f18385f;
                                    }
                                    nVar3.f18324k = new C1613b(iArr4, dArr4, dArr5);
                                }
                                nVar3.f18339z = new HashMap();
                                if (arrayList9 != null) {
                                    Iterator it14 = hashSet8.iterator();
                                    while (it14.hasNext()) {
                                        String str76 = (String) it14.next();
                                        y.f c11 = y.f.c(str76);
                                        if (c11 != null) {
                                            c11.f18103b = str76;
                                            nVar3.f18339z.put(str76, c11);
                                        }
                                    }
                                    Iterator it15 = arrayList9.iterator();
                                    while (it15.hasNext()) {
                                    }
                                    Iterator it16 = nVar3.f18339z.values().iterator();
                                    while (it16.hasNext()) {
                                        ((y.f) it16.next()).e();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str77 = strArr3[i35];
                            int i37 = 0;
                            int i38 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            while (i37 < i19) {
                                if (wVarArr[i37].f18376E.containsKey(str77)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i19];
                                        B.a aVar5 = (B.a) wVarArr[i37].f18376E.get(str77);
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i19, aVar5 == null ? 0 : aVar5.c());
                                    }
                                    w wVar16 = wVarArr[i37];
                                    dArr7[i38] = wVar16.f18382c;
                                    wVar16.d(str77, dArr8[i38]);
                                    i9 = 1;
                                    i38++;
                                } else {
                                    i9 = 1;
                                }
                                i37 += i9;
                            }
                            i35++;
                            nVar3.j[i35] = q4.d.c(nVar3.f18319e, Arrays.copyOf(dArr7, i38), (double[][]) Arrays.copyOf(dArr8, i38));
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        w wVar = this.f18320f;
        sb.append(wVar.f18384e);
        sb.append(" y: ");
        sb.append(wVar.f18385f);
        sb.append(" end: x: ");
        w wVar2 = this.f18321g;
        sb.append(wVar2.f18384e);
        sb.append(" y: ");
        sb.append(wVar2.f18385f);
        return sb.toString();
    }
}
