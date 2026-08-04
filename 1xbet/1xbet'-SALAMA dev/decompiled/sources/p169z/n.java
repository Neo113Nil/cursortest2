package p169z;

import B.c;
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
import p120q4.d;
import p143u.b;
import p143u.e;
import p165y.f;
import p165y.g;
import p165y.h;
import p165y.i;
import p165y.j;
import p165y.k;
import p165y.l;
import p165y.m;
import p165y.o;
import p165y.p;
import r6.a;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f18322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18323c;
    public d[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f18330k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f18334o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double[] f18335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double[] f18336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String[] f18337r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f18338s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public HashMap f18343x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HashMap f18344y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public HashMap f18345z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f18321a = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18324d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18325e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f18326f = new w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f18327g = new w();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f18328h = new l();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f18329i = new l();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18331l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f18332m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f18333n = 1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f18339t = new float[4];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f18340u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f18341v = new float[1];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f18342w = new ArrayList();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f18314A = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f18315B = -1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f18316C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f18317D = -1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f18318E = Float.NaN;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Interpolator f18319F = null;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f18320G = false;

    public n(View view) {
        this.f18322b = view;
        this.f18323c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof c) {
            ((c) layoutParams).getClass();
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

    public final void a(AbstractC1062c abstractC1062c) {
        this.f18342w.add(abstractC1062c);
    }

    public final float b(float[] fArr, float f7) {
        float f8 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f9 = this.f18333n;
            if (f9 != 1.0d) {
                float f10 = this.f18332m;
                if (f7 < f10) {
                    f7 = 0.0f;
                }
                if (f7 > f10 && f7 < 1.0d) {
                    f7 = Math.min((f7 - f10) * f9, 1.0f);
                }
            }
        }
        e eVar = this.f18326f.f18386a;
        float f11 = Float.NaN;
        for (w wVar : this.f18340u) {
            e eVar2 = wVar.f18386a;
            if (eVar2 != null) {
                float f12 = wVar.f18388c;
                if (f12 < f7) {
                    eVar = eVar2;
                    f8 = f12;
                } else if (Float.isNaN(f11)) {
                    f11 = wVar.f18388c;
                }
            }
        }
        if (eVar != null) {
            float f13 = (Float.isNaN(f11) ? 1.0f : f11) - f8;
            double d7 = (f7 - f8) / f13;
            f7 = (((float) eVar.a(d7)) * f13) + f8;
            if (fArr != null) {
                fArr[0] = (float) eVar.b(d7);
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
        int[] iArr = this.f18334o;
        w wVar = this.f18326f;
        float f8 = wVar.f18390e;
        float f9 = wVar.f18391f;
        float f10 = wVar.f18392x;
        float f11 = wVar.f18393y;
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
        float fSin = (f13 / 2.0f) + f14;
        n nVar = wVar.f18381D;
        if (nVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            nVar.c(d7, fArr3, fArr4);
            float f19 = fArr3[0];
            float f20 = fArr3[1];
            float f21 = fArr4[0];
            float f22 = fArr4[1];
            double d8 = f8;
            double d9 = f9;
            float fSin2 = (float) (((Math.sin(d9) * d8) + ((double) f19)) - ((double) (f10 / 2.0f)));
            float fCos = (float) ((((double) f20) - (Math.cos(d9) * d8)) - ((double) (f11 / 2.0f)));
            double d10 = f21;
            double d11 = f7;
            double d12 = f14;
            float fCos2 = (float) ((Math.cos(d9) * d12) + (Math.sin(d9) * d11) + d10);
            fSin = (float) ((Math.sin(d9) * d12) + (((double) f22) - (Math.cos(d9) * d11)));
            f8 = fSin2;
            f9 = fCos;
            f18 = fCos2;
            f17 = 2.0f;
        }
        fArr[0] = (f10 / f17) + f8 + 0.0f;
        fArr[1] = (f11 / f17) + f9 + 0.0f;
        fArr2[0] = f18;
        fArr2[1] = fSin;
    }

    public final void d(float f7, float f8, float f9, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.f18341v;
        float fB = b(fArr2, f7);
        d[] dVarArr = this.j;
        int i7 = 0;
        if (dVarArr == null) {
            w wVar = this.f18327g;
            float f10 = wVar.f18390e;
            w wVar2 = this.f18326f;
            float f11 = f10 - wVar2.f18390e;
            float f12 = wVar.f18391f - wVar2.f18391f;
            float f13 = wVar.f18392x - wVar2.f18392x;
            float f14 = (wVar.f18393y - wVar2.f18393y) + f12;
            fArr[0] = ((f13 + f11) * f8) + ((1.0f - f8) * f11);
            fArr[1] = (f14 * f9) + ((1.0f - f9) * f12);
            return;
        }
        double d7 = fB;
        dVarArr[0].h(d7, this.f18336q);
        this.j[0].e(d7, this.f18335p);
        float f15 = fArr2[0];
        while (true) {
            dArr = this.f18336q;
            if (i7 >= dArr.length) {
                break;
            }
            dArr[i7] = dArr[i7] * ((double) f15);
            i7++;
        }
        b bVar = this.f18330k;
        if (bVar == null) {
            int[] iArr = this.f18334o;
            double[] dArr2 = this.f18335p;
            this.f18326f.getClass();
            w.h(f8, f9, fArr, iArr, dArr, dArr2);
            return;
        }
        double[] dArr3 = this.f18335p;
        if (dArr3.length > 0) {
            bVar.e(d7, dArr3);
            this.f18330k.h(d7, this.f18336q);
            int[] iArr2 = this.f18334o;
            double[] dArr4 = this.f18336q;
            double[] dArr5 = this.f18335p;
            this.f18326f.getClass();
            w.h(f8, f9, fArr, iArr2, dArr4, dArr5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0334  */
    public final boolean e(float f7, long j, View view, e eVar) {
        p165y.n nVar;
        boolean zB;
        float f8;
        int i7;
        boolean z4;
        double d7;
        w wVar;
        float f9;
        float f10;
        boolean z7;
        float f11;
        double d8;
        float f12;
        n nVar2 = this;
        View view2 = view;
        float fB = nVar2.b(null, f7);
        int i8 = nVar2.f18317D;
        if (i8 != -1) {
            float f13 = 1.0f / i8;
            float fFloor = ((float) Math.floor(fB / f13)) * f13;
            float f14 = (fB % f13) / f13;
            if (!Float.isNaN(nVar2.f18318E)) {
                f14 = (f14 + nVar2.f18318E) % 1.0f;
            }
            Interpolator interpolator = nVar2.f18319F;
            fB = ((interpolator != null ? interpolator.getInterpolation(f14) : ((double) f14) > 0.5d ? 1.0f : 0.0f) * f13) + fFloor;
        }
        float f15 = fB;
        HashMap map = nVar2.f18344y;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((k) it.next()).c(view2, f15);
            }
        }
        HashMap map2 = nVar2.f18343x;
        if (map2 != null) {
            nVar = null;
            zB = false;
            for (p pVar : map2.values()) {
                if (pVar instanceof p165y.n) {
                    nVar = (p165y.n) pVar;
                } else {
                    zB |= pVar.b(f15, j, view, eVar);
                }
            }
        } else {
            nVar = null;
            zB = false;
        }
        d[] dVarArr = nVar2.j;
        w wVar2 = nVar2.f18326f;
        if (dVarArr != null) {
            double d9 = f15;
            dVarArr[0].e(d9, nVar2.f18335p);
            nVar2.j[0].h(d9, nVar2.f18336q);
            b bVar = nVar2.f18330k;
            if (bVar != null) {
                double[] dArr = nVar2.f18335p;
                if (dArr.length > 0) {
                    bVar.e(d9, dArr);
                    nVar2.f18330k.h(d9, nVar2.f18336q);
                }
            }
            if (nVar2.f18320G) {
                d7 = d9;
                wVar = wVar2;
            } else {
                int[] iArr = nVar2.f18334o;
                double[] dArr2 = nVar2.f18335p;
                double[] dArr3 = nVar2.f18336q;
                boolean z8 = nVar2.f18324d;
                float f16 = wVar2.f18390e;
                float f17 = wVar2.f18391f;
                float f18 = wVar2.f18392x;
                float f19 = wVar2.f18393y;
                if (iArr.length != 0) {
                    f10 = f16;
                    if (wVar2.f18384G.length <= iArr[iArr.length - 1]) {
                        int i9 = iArr[iArr.length - 1] + 1;
                        wVar2.f18384G = new double[i9];
                        wVar2.f18385H = new double[i9];
                    }
                } else {
                    f10 = f16;
                }
                Arrays.fill(wVar2.f18384G, Double.NaN);
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    double[] dArr4 = wVar2.f18384G;
                    int i11 = iArr[i10];
                    dArr4[i11] = dArr2[i10];
                    wVar2.f18385H[i11] = dArr3[i10];
                }
                float f20 = Float.NaN;
                float f21 = f19;
                float f22 = f10;
                float fCos = f17;
                float f23 = 0.0f;
                int i12 = 0;
                float f24 = 0.0f;
                float f25 = 0.0f;
                float f26 = 0.0f;
                while (true) {
                    double[] dArr5 = wVar2.f18384G;
                    z7 = z8;
                    if (i12 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i12])) {
                        d8 = d9;
                        f12 = f20;
                    } else {
                        d8 = d9;
                        float f27 = (float) (Double.isNaN(wVar2.f18384G[i12]) ? 0.0d : wVar2.f18384G[i12] + 0.0d);
                        f12 = f20;
                        float f28 = (float) wVar2.f18385H[i12];
                        if (i12 == 1) {
                            f23 = f28;
                            f22 = f27;
                        } else if (i12 == 2) {
                            f26 = f28;
                            fCos = f27;
                        } else if (i12 == 3) {
                            f24 = f28;
                            f18 = f27;
                        } else if (i12 != 4) {
                            if (i12 == 5) {
                                f20 = f27;
                            }
                            i12++;
                            z8 = z7;
                            d9 = d8;
                        } else {
                            f25 = f28;
                            f21 = f27;
                        }
                    }
                    f20 = f12;
                    i12++;
                    z8 = z7;
                    d9 = d8;
                }
                d7 = d9;
                float f29 = f20;
                n nVar3 = wVar2.f18381D;
                if (nVar3 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    nVar3.c(d7, fArr, fArr2);
                    float f30 = fArr[0];
                    float f31 = fArr[1];
                    wVar = wVar2;
                    float f32 = fArr2[0];
                    float f33 = fArr2[1];
                    double d10 = f22;
                    double d11 = fCos;
                    float fSin = (float) (((Math.sin(d11) * d10) + ((double) f30)) - ((double) (f18 / 2.0f)));
                    fCos = (float) ((((double) f31) - (Math.cos(d11) * d10)) - ((double) (f21 / 2.0f)));
                    double d12 = f23;
                    double d13 = f26;
                    float fCos2 = (float) ((Math.cos(d11) * d10 * d13) + (Math.sin(d11) * d12) + ((double) f32));
                    f11 = f18;
                    float fSin2 = (float) ((Math.sin(d11) * d10 * d13) + (((double) f33) - (Math.cos(d11) * d12)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (Float.isNaN(f29)) {
                        view2 = view;
                    } else {
                        view2 = view;
                        view2.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + ((double) f29)));
                    }
                    f22 = fSin;
                } else {
                    float f34 = f23;
                    f11 = f18;
                    wVar = wVar2;
                    if (!Float.isNaN(f29)) {
                        view2.setRotation((float) (Math.toDegrees(Math.atan2((f25 / 2.0f) + f26, (f24 / 2.0f) + f34)) + ((double) f29) + ((double) 0.0f)));
                    }
                }
                if (view2 instanceof InterfaceC1061b) {
                    ((MotionLabel) ((InterfaceC1061b) view2)).b(f22, fCos, f22 + f11, f21 + fCos);
                } else {
                    float f35 = f22 + 0.5f;
                    int i13 = (int) f35;
                    float f36 = fCos + 0.5f;
                    int i14 = (int) f36;
                    int i15 = (int) (f35 + f11);
                    int i16 = (int) (f36 + f21);
                    int i17 = i15 - i13;
                    int i18 = i16 - i14;
                    if (i17 != view.getMeasuredWidth() || i18 != view.getMeasuredHeight() || z7) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                    }
                    view2.layout(i13, i14, i15, i16);
                }
                nVar2 = this;
                nVar2.f18324d = false;
            }
            if (nVar2.f18315B != -1) {
                if (nVar2.f18316C == null) {
                    nVar2.f18316C = ((View) view.getParent()).findViewById(nVar2.f18315B);
                }
                View view3 = nVar2.f18316C;
                if (view3 != null) {
                    float bottom = (nVar2.f18316C.getBottom() + view3.getTop()) / 2.0f;
                    float right = (nVar2.f18316C.getRight() + nVar2.f18316C.getLeft()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left = right - view.getLeft();
                        float top = bottom - view.getTop();
                        view2.setPivotX(left);
                        view2.setPivotY(top);
                    }
                }
            }
            HashMap map3 = nVar2.f18344y;
            if (map3 != null) {
                for (k kVar : map3.values()) {
                    if (kVar instanceof i) {
                        double[] dArr6 = nVar2.f18336q;
                        if (dArr6.length > 1) {
                            f9 = f15;
                            view2.setRotation(((i) kVar).a(f9) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        } else {
                            f9 = f15;
                        }
                    } else {
                        f9 = f15;
                    }
                    f15 = f9;
                }
            }
            f8 = f15;
            if (nVar != 0) {
                double[] dArr7 = nVar2.f18336q;
                i7 = 1;
                view2.setRotation(nVar.a(f8, j, view, eVar) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                z4 = zB | nVar.f18129d;
            } else {
                i7 = 1;
                z4 = zB;
            }
            int i19 = i7;
            while (true) {
                d[] dVarArr2 = nVar2.j;
                if (i19 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i19];
                float[] fArr3 = nVar2.f18339t;
                dVar.f(d7, fArr3);
                a.d((B.a) wVar.f18382E.get(nVar2.f18337r[i19 - 1]), view2, fArr3);
                i19++;
            }
            l lVar = nVar2.f18328h;
            if (lVar.f18304b == 0) {
                if (f8 <= 0.0f) {
                    view2.setVisibility(lVar.f18305c);
                } else {
                    l lVar2 = nVar2.f18329i;
                    if (f8 >= 1.0f) {
                        view2.setVisibility(lVar2.f18305c);
                    } else if (lVar2.f18305c != lVar.f18305c) {
                        view2.setVisibility(0);
                    }
                }
            }
        } else {
            f8 = f15;
            boolean z9 = zB;
            i7 = 1;
            float f37 = wVar2.f18390e;
            w wVar3 = nVar2.f18327g;
            float f38 = ((wVar3.f18390e - f37) * f8) + f37;
            float f39 = wVar2.f18391f;
            float f40 = ((wVar3.f18391f - f39) * f8) + f39;
            float f41 = wVar2.f18392x;
            float f42 = wVar3.f18392x;
            float f43 = wVar2.f18393y;
            float f44 = wVar3.f18393y;
            float f45 = f38 + 0.5f;
            int i20 = (int) f45;
            float f46 = f40 + 0.5f;
            int i21 = (int) f46;
            int i22 = (int) (f45 + ((f42 - f41) * f8) + f41);
            int i23 = (int) (f46 + ((f44 - f43) * f8) + f43);
            int i24 = i22 - i20;
            int i25 = i23 - i21;
            if (f42 != f41 || f44 != f43 || nVar2.f18324d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i24, 1073741824), View.MeasureSpec.makeMeasureSpec(i25, 1073741824));
                nVar2.f18324d = false;
            }
            view2.layout(i20, i21, i22, i23);
            z4 = z9;
        }
        HashMap map4 = nVar2.f18345z;
        if (map4 != null) {
            for (f fVar : map4.values()) {
                if (fVar instanceof p165y.d) {
                    double[] dArr8 = nVar2.f18336q;
                    view2.setRotation(((p165y.d) fVar).a(f8) + ((float) Math.toDegrees(Math.atan2(dArr8[i7], dArr8[0]))));
                } else {
                    fVar.d(view2, f8);
                }
            }
        }
        return z4;
    }

    public final void f(w wVar) {
        wVar.f((int) this.f18322b.getX(), (int) this.f18322b.getY(), this.f18322b.getWidth(), this.f18322b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:203:0x0627 A[PHI: r1 r3 r4 r5 r9 r10 r11 r12 r13 r14 r15 r20 r21 r28 r41 r45
      0x0627: PHI (r1v91 java.lang.String) = 
      (r1v67 java.lang.String)
      (r1v68 java.lang.String)
      (r1v70 java.lang.String)
      (r1v72 java.lang.String)
      (r1v74 java.lang.String)
      (r1v78 java.lang.String)
      (r1v79 java.lang.String)
      (r1v82 java.lang.String)
      (r1v85 java.lang.String)
      (r1v88 java.lang.String)
      (r1v92 java.lang.String)
     binds: [B:267:0x095b, B:263:0x0930, B:260:0x08fb, B:256:0x08c5, B:252:0x089d, B:244:0x0826, B:240:0x0802, B:236:0x07a8, B:219:0x06f6, B:210:0x0662, B:202:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r3v52 java.lang.String) = 
      (r3v29 java.lang.String)
      (r3v30 java.lang.String)
      (r3v31 java.lang.String)
      (r3v32 java.lang.String)
      (r3v36 java.lang.String)
      (r3v39 java.lang.String)
      (r3v40 java.lang.String)
      (r3v43 java.lang.String)
      (r3v46 java.lang.String)
      (r3v49 java.lang.String)
      (r3v53 java.lang.String)
     binds: [B:267:0x095b, B:263:0x0930, B:260:0x08fb, B:256:0x08c5, B:252:0x089d, B:244:0x0826, B:240:0x0802, B:236:0x07a8, B:219:0x06f6, B:210:0x0662, B:202:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r4v84 java.lang.String) = 
      (r4v63 java.lang.String)
      (r4v64 java.lang.String)
      (r4v65 java.lang.String)
      (r4v66 java.lang.String)
      (r4v68 java.lang.String)
      (r4v71 java.lang.String)
      (r4v72 java.lang.String)
      (r4v75 java.lang.String)
      (r4v78 java.lang.String)
      (r4v81 java.lang.String)
      (r4v85 java.lang.String)
     binds: [B:267:0x095b, B:263:0x0930, B:260:0x08fb, B:256:0x08c5, B:252:0x089d, B:244:0x0826, B:240:0x0802, B:236:0x07a8, B:219:0x06f6, B:210:0x0662, B:202:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r5v77 java.lang.String) = 
      (r5v53 java.lang.String)
      (r5v54 java.lang.String)
      (r5v56 java.lang.String)
      (r5v58 java.lang.String)
      (r5v60 java.lang.String)
      (r5v64 java.lang.String)
      (r5v65 java.lang.String)
      (r5v68 java.lang.String)
      (r5v71 java.lang.String)
      (r5v74 java.lang.String)
      (r5v78 java.lang.String)
     binds: [B:267:0x095b, B:263:0x0930, B:260:0x08fb, B:256:0x08c5, B:252:0x089d, B:244:0x0826, B:240:0x0802, B:236:0x07a8, B:219:0x06f6, B:210:0x0662, B:202:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r9v59 java.lang.String) = 
      (r9v35 java.lang.String)
      (r9v36 java.lang.String)
      (r9v37 java.lang.String)
      (r9v38 java.lang.String)
      (r9v40 java.lang.String)
      (r9v42 java.lang.String)
      (r9v43 java.lang.String)
      (r9v47 java.lang.String)
      (r9v51 java.lang.String)
      (r9v53 java.lang.String)
      (r9v60 java.lang.String)
     binds: [B:267:0x095b, B:263:0x0930, B:260:0x08fb, B:256:0x08c5, B:252:0x089d, B:244:0x0826, B:240:0x0802, B:236:0x07a8, B:219:0x06f6, B:210:0x0662, B:202:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r10v59 java.lang.String) = 
      (r10v35 java.lang.String)
      (r10v36 java.lang.String)
      (r10v37 java.lang.String)
      (r10v38 java.lang.String)
      (r10v40 java.lang.String)
      (r10v42 java.lang.String)
      (r10v43 java.lang.String)
      (r10v47 java.lang.String)
      (r10v51 java.lang.String)
      (r10v56 java.lang.String)
      (r10v60 java.lang.String)
     binds: [B:267:0x095b, B:263:0x0930, B:260:0x08fb, B:256:0x08c5, B:252:0x089d, B:244:0x0826, B:240:0x0802, B:236:0x07a8, B:219:0x06f6, B:210:0x0662, B:202:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r11v39 java.lang.Object) = 
      (r11v14 java.lang.Object)
      (r11v15 java.lang.Object)
      (r11v16 java.lang.Object)
      (r11v17 java.lang.Object)
      (r11v19 java.lang.Object)
      (r11v21 java.lang.Object)
      (r11v22 java.lang.Object)
      (r11v26 java.lang.Object)
      (r11v30 java.lang.Object)
      (r11v36 java.lang.Object)
      (r11v40 java.lang.Object)
     binds: [B:267:0x095b, B:263:0x0930, B:260:0x08fb, B:256:0x08c5, B:252:0x089d, B:244:0x0826, B:240:0x0802, B:236:0x07a8, B:219:0x06f6, B:210:0x0662, B:202:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r12v35 java.lang.String) = 
      (r12v11 java.lang.String)
      (r12v12 java.lang.String)
      (r12v13 java.lang.String)
      (r12v14 java.lang.String)
      (r12v16 java.lang.String)
      (r12v18 java.lang.String)
      (r12v19 java.lang.String)
      (r12v23 java.lang.String)
      (r12v29 java.lang.String)
      (r12v32 java.lang.String)
      (r12v36 java.lang.String)
     binds: [B:267:0x095b, B:263:0x0930, B:260:0x08fb, B:256:0x08c5, B:252:0x089d, B:244:0x0826, B:240:0x0802, B:236:0x07a8, B:219:0x06f6, B:210:0x0662, B:202:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r13v42 java.lang.String) = 
      (r13v12 java.lang.String)
      (r13v13 java.lang.String)
      (r13v14 java.lang.String)
      (r13v15 java.lang.String)
      (r13v17 java.lang.String)
      (r13v19 java.lang.String)
      (r13v20 java.lang.String)
      (r13v30 java.lang.String)
      (r13v36 java.lang.String)
      (r13v39 java.lang.String)
      (r13v43 java.lang.String)
     binds: [B:267:0x095b, B:263:0x0930, B:260:0x08fb, B:256:0x08c5, B:252:0x089d, B:244:0x0826, B:240:0x0802, B:236:0x07a8, B:219:0x06f6, B:210:0x0662, B:202:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r14v34 java.lang.String) = 
      (r14v11 java.lang.String)
      (r14v12 java.lang.String)
      (r14v13 java.lang.String)
      (r14v15 java.lang.String)
      (r14v17 java.lang.String)
      (r14v21 java.lang.String)
      (r14v22 java.lang.String)
      (r14v25 java.lang.String)
      (r14v28 java.lang.String)
      (r14v31 java.lang.String)
      (r14v35 java.lang.String)
     binds: [B:267:0x095b, B:263:0x0930, B:260:0x08fb, B:256:0x08c5, B:252:0x089d, B:244:0x0826, B:240:0x0802, B:236:0x07a8, B:219:0x06f6, B:210:0x0662, B:202:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r15v28 java.lang.String) = 
      (r15v6 java.lang.String)
      (r15v7 java.lang.String)
      (r15v8 java.lang.String)
      (r15v9 java.lang.String)
      (r15v11 java.lang.String)
      (r15v13 java.lang.String)
      (r15v16 java.lang.String)
      (r15v19 java.lang.String)
      (r15v22 java.lang.String)
      (r15v25 java.lang.String)
      (r15v29 java.lang.String)
     binds: [B:267:0x095b, B:263:0x0930, B:260:0x08fb, B:256:0x08c5, B:252:0x089d, B:244:0x0826, B:240:0x0802, B:236:0x07a8, B:219:0x06f6, B:210:0x0662, B:202:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r20v33 z.w) = 
      (r20v5 z.w)
      (r20v6 z.w)
      (r20v7 z.w)
      (r20v10 z.w)
      (r20v12 z.w)
      (r20v18 z.w)
      (r20v19 z.w)
      (r20v22 z.w)
      (r14v9 z.w)
      (r20v30 z.w)
      (r20v34 z.w)
     binds: [B:267:0x095b, B:263:0x0930, B:260:0x08fb, B:256:0x08c5, B:252:0x089d, B:244:0x0826, B:240:0x0802, B:236:0x07a8, B:219:0x06f6, B:210:0x0662, B:202:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r21v31 z.w) = 
      (r21v7 z.w)
      (r21v8 z.w)
      (r21v11 z.w)
      (r21v12 z.w)
      (r21v14 z.w)
      (r21v16 z.w)
      (r21v17 z.w)
      (r21v20 z.w)
      (r5v51 z.w)
      (r21v28 z.w)
      (r21v32 z.w)
     binds: [B:267:0x095b, B:263:0x0930, B:260:0x08fb, B:256:0x08c5, B:252:0x089d, B:244:0x0826, B:240:0x0802, B:236:0x07a8, B:219:0x06f6, B:210:0x0662, B:202:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r28v25 java.util.ArrayList) = 
      (r28v3 java.util.ArrayList)
      (r28v4 java.util.ArrayList)
      (r28v5 java.util.ArrayList)
      (r28v6 java.util.ArrayList)
      (r28v8 java.util.ArrayList)
      (r28v10 java.util.ArrayList)
      (r28v11 java.util.ArrayList)
      (r28v14 java.util.ArrayList)
      (r1v65 java.util.ArrayList)
      (r28v22 java.util.ArrayList)
      (r28v26 java.util.ArrayList)
     binds: [B:267:0x095b, B:263:0x0930, B:260:0x08fb, B:256:0x08c5, B:252:0x089d, B:244:0x0826, B:240:0x0802, B:236:0x07a8, B:219:0x06f6, B:210:0x0662, B:202:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r41v27 java.util.HashSet) = 
      (r41v5 java.util.HashSet)
      (r41v6 java.util.HashSet)
      (r41v7 java.util.HashSet)
      (r41v8 java.util.HashSet)
      (r41v10 java.util.HashSet)
      (r41v12 java.util.HashSet)
      (r41v13 java.util.HashSet)
      (r41v16 java.util.HashSet)
      (r3v27 java.util.HashSet)
      (r41v24 java.util.HashSet)
      (r41v28 java.util.HashSet)
     binds: [B:267:0x095b, B:263:0x0930, B:260:0x08fb, B:256:0x08c5, B:252:0x089d, B:244:0x0826, B:240:0x0802, B:236:0x07a8, B:219:0x06f6, B:210:0x0662, B:202:0x0607] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r45v32 java.util.Iterator) = 
      (r45v10 java.util.Iterator)
      (r45v11 java.util.Iterator)
      (r45v12 java.util.Iterator)
      (r45v13 java.util.Iterator)
      (r45v15 java.util.Iterator)
      (r45v17 java.util.Iterator)
      (r45v18 java.util.Iterator)
      (r45v21 java.util.Iterator)
      (r4v61 java.util.Iterator)
      (r45v29 java.util.Iterator)
      (r45v33 java.util.Iterator)
     binds: [B:267:0x095b, B:263:0x0930, B:260:0x08fb, B:256:0x08c5, B:252:0x089d, B:244:0x0826, B:240:0x0802, B:236:0x07a8, B:219:0x06f6, B:210:0x0662, B:202:0x0607] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:236:0x07a8 A[PHI: r9 r10 r11 r12
      0x07a8: PHI (r9v47 java.lang.String) = (r9v44 java.lang.String), (r9v45 java.lang.String), (r9v46 java.lang.String), (r9v49 java.lang.String) binds: [B:235:0x07a6, B:231:0x0779, B:226:0x0749, B:222:0x0734] A[DONT_GENERATE, DONT_INLINE]
      0x07a8: PHI (r10v47 java.lang.String) = (r10v44 java.lang.String), (r10v45 java.lang.String), (r10v46 java.lang.String), (r10v49 java.lang.String) binds: [B:235:0x07a6, B:231:0x0779, B:226:0x0749, B:222:0x0734] A[DONT_GENERATE, DONT_INLINE]
      0x07a8: PHI (r11v26 java.lang.Object) = (r11v23 java.lang.Object), (r11v24 java.lang.Object), (r11v25 java.lang.Object), (r11v28 java.lang.Object) binds: [B:235:0x07a6, B:231:0x0779, B:226:0x0749, B:222:0x0734] A[DONT_GENERATE, DONT_INLINE]
      0x07a8: PHI (r12v23 java.lang.String) = (r12v20 java.lang.String), (r12v21 java.lang.String), (r12v22 java.lang.String), (r12v25 java.lang.String) binds: [B:235:0x07a6, B:231:0x0779, B:226:0x0749, B:222:0x0734] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:314:0x0aec  */
    /* JADX WARN: Code duplicated, block: B:677:0x0ea8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x0e9f A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:508:0x0e2d. Please report as an issue. */
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
        HashMap map;
        String str12;
        int i9;
        int i10;
        B.a aVar;
        String str13;
        HashSet hashSet2;
        Iterator it;
        HashMap map2;
        String str14;
        byte b7;
        byte b8;
        p lVar;
        m mVar;
        p pVar;
        B.a aVar2;
        Integer num;
        byte b9;
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
        byte b10;
        byte b11;
        g gVar;
        k gVar2;
        B.a aVar3;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        ArrayList arrayList2;
        w wVar3;
        n nVar;
        HashMap map3;
        HashSet hashSet3;
        i iVar;
        float f7;
        int i11;
        float fMin;
        float f8;
        String str31 = "translationY";
        String str32 = "translationX";
        String str33 = "scaleY";
        String str34 = "scaleX";
        String str35 = "rotationY";
        String str36 = "rotationX";
        String str37 = "progress";
        String str38 = "transitionPathRotate";
        String str39 = "rotation";
        String str40 = ViewHierarchyNode.JsonKeys.ALPHA;
        new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet<String> hashSet6 = new HashSet();
        HashMap map4 = new HashMap();
        int i12 = this.f18314A;
        w wVar4 = this.f18326f;
        HashMap map5 = map4;
        if (i12 != -1) {
            wVar4.f18378A = i12;
        }
        l lVar2 = this.f18328h;
        float f9 = lVar2.f18303a;
        w wVar5 = wVar4;
        l lVar3 = this.f18329i;
        if (l.b(f9, lVar3.f18303a)) {
            hashSet5.add(ViewHierarchyNode.JsonKeys.ALPHA);
        }
        if (l.b(lVar2.f18306d, lVar3.f18306d)) {
            hashSet5.add("elevation");
        }
        int i13 = lVar2.f18305c;
        int i14 = lVar3.f18305c;
        Object obj3 = "elevation";
        if (i13 != i14 && lVar2.f18304b == 0 && (i13 == 0 || i14 == 0)) {
            hashSet5.add(ViewHierarchyNode.JsonKeys.ALPHA);
        }
        if (l.b(lVar2.f18307e, lVar3.f18307e)) {
            hashSet5.add("rotation");
        }
        if (!Float.isNaN(lVar2.f18300F) || !Float.isNaN(lVar3.f18300F)) {
            hashSet5.add("transitionPathRotate");
        }
        if (!Float.isNaN(lVar2.f18301G) || !Float.isNaN(lVar3.f18301G)) {
            hashSet5.add("progress");
        }
        if (l.b(lVar2.f18308f, lVar3.f18308f)) {
            hashSet5.add("rotationX");
        }
        if (l.b(lVar2.f18309x, lVar3.f18309x)) {
            hashSet5.add("rotationY");
        }
        if (l.b(lVar2.f18295A, lVar3.f18295A)) {
            hashSet5.add("transformPivotX");
        }
        if (l.b(lVar2.f18296B, lVar3.f18296B)) {
            hashSet5.add("transformPivotY");
        }
        if (l.b(lVar2.f18310y, lVar3.f18310y)) {
            hashSet5.add("scaleX");
        }
        if (l.b(lVar2.f18311z, lVar3.f18311z)) {
            hashSet5.add("scaleY");
        }
        if (l.b(lVar2.f18297C, lVar3.f18297C)) {
            hashSet5.add("translationX");
        }
        if (l.b(lVar2.f18298D, lVar3.f18298D)) {
            hashSet5.add("translationY");
        }
        if (l.b(lVar2.f18299E, lVar3.f18299E)) {
            hashSet5.add("translationZ");
        }
        n nVar2 = this;
        ArrayList<AbstractC1062c> arrayList3 = nVar2.f18342w;
        w wVar6 = nVar2.f18327g;
        ArrayList arrayList4 = nVar2.f18340u;
        if (arrayList3 != null) {
            for (AbstractC1062c abstractC1062c : arrayList3) {
                String str41 = str36;
                if (abstractC1062c instanceof i) {
                    i iVar2 = (i) abstractC1062c;
                    w wVar7 = new w();
                    wVar7.f18387b = 0;
                    wVar7.f18394z = Float.NaN;
                    wVar7.f18378A = -1;
                    wVar7.f18379B = -1;
                    wVar7.f18380C = Float.NaN;
                    wVar7.f18381D = null;
                    wVar7.f18382E = new LinkedHashMap();
                    wVar7.f18383F = 0;
                    wVar7.f18384G = new double[18];
                    wVar7.f18385H = new double[18];
                    w wVar8 = wVar5;
                    if (wVar8.f18379B != -1) {
                        float f10 = iVar2.f18265a / 100.0f;
                        wVar7.f18388c = f10;
                        wVar7.f18387b = iVar2.f18290h;
                        wVar7.f18383F = iVar2.f18294m;
                        float f11 = Float.isNaN(iVar2.f18291i) ? f10 : iVar2.f18291i;
                        str27 = str37;
                        float f12 = Float.isNaN(iVar2.j) ? f10 : iVar2.j;
                        str26 = str34;
                        float f13 = wVar6.f18392x;
                        str25 = str33;
                        float f14 = wVar8.f18392x;
                        str29 = str39;
                        float f15 = wVar6.f18393y;
                        str28 = str38;
                        float f16 = wVar8.f18393y;
                        str30 = str40;
                        wVar7.f18389d = wVar7.f18388c;
                        wVar7.f18392x = (int) (((f13 - f14) * f11) + f14);
                        wVar7.f18393y = (int) (((f15 - f16) * f12) + f16);
                        int i15 = iVar2.f18294m;
                        if (i15 == 1) {
                            float f17 = Float.isNaN(iVar2.f18292k) ? f10 : iVar2.f18292k;
                            float f18 = wVar6.f18390e;
                            float f19 = wVar8.f18390e;
                            wVar7.f18390e = ((f18 - f19) * f17) + f19;
                            if (!Float.isNaN(iVar2.f18293l)) {
                                f10 = iVar2.f18293l;
                            }
                            float f20 = wVar6.f18391f;
                            float f21 = wVar8.f18391f;
                            wVar7.f18391f = ((f20 - f21) * f10) + f21;
                        } else if (i15 != 2) {
                            float f22 = Float.isNaN(iVar2.f18292k) ? f10 : iVar2.f18292k;
                            float f23 = wVar6.f18390e;
                            float f24 = wVar8.f18390e;
                            wVar7.f18390e = ((f23 - f24) * f22) + f24;
                            if (!Float.isNaN(iVar2.f18293l)) {
                                f10 = iVar2.f18293l;
                            }
                            float f25 = wVar6.f18391f;
                            float f26 = wVar8.f18391f;
                            wVar7.f18391f = ((f25 - f26) * f10) + f26;
                        } else {
                            if (Float.isNaN(iVar2.f18292k)) {
                                float f27 = wVar6.f18390e;
                                float f28 = wVar8.f18390e;
                                fMin = ((f27 - f28) * f10) + f28;
                            } else {
                                fMin = iVar2.f18292k * Math.min(f12, f11);
                            }
                            wVar7.f18390e = fMin;
                            if (Float.isNaN(iVar2.f18293l)) {
                                float f29 = wVar6.f18391f;
                                float f30 = wVar8.f18391f;
                                f8 = ((f29 - f30) * f10) + f30;
                            } else {
                                f8 = iVar2.f18293l;
                            }
                            wVar7.f18391f = f8;
                        }
                        wVar7.f18379B = wVar8.f18379B;
                        wVar7.f18386a = e.d(iVar2.f18288f);
                        wVar7.f18378A = iVar2.f18289g;
                        wVar3 = wVar8;
                        iVar = iVar2;
                        arrayList2 = arrayList4;
                    } else {
                        str25 = str33;
                        str26 = str34;
                        str27 = str37;
                        str28 = str38;
                        str29 = str39;
                        str30 = str40;
                        int i16 = iVar2.f18294m;
                        if (i16 == 1) {
                            ArrayList arrayList5 = arrayList4;
                            float f31 = iVar2.f18265a / 100.0f;
                            wVar7.f18388c = f31;
                            wVar7.f18387b = iVar2.f18290h;
                            float f32 = Float.isNaN(iVar2.f18291i) ? f31 : iVar2.f18291i;
                            float f33 = Float.isNaN(iVar2.j) ? f31 : iVar2.j;
                            float f34 = wVar6.f18392x - wVar8.f18392x;
                            float f35 = wVar6.f18393y - wVar8.f18393y;
                            wVar7.f18389d = wVar7.f18388c;
                            if (!Float.isNaN(iVar2.f18292k)) {
                                f31 = iVar2.f18292k;
                            }
                            float f36 = wVar8.f18390e;
                            float f37 = wVar8.f18392x;
                            float f38 = wVar8.f18391f;
                            float f39 = wVar8.f18393y;
                            float f40 = ((wVar6.f18392x / 2.0f) + wVar6.f18390e) - ((f37 / 2.0f) + f36);
                            float f41 = ((wVar6.f18393y / 2.0f) + wVar6.f18391f) - ((f39 / 2.0f) + f38);
                            float f42 = f40 * f31;
                            float f43 = f34 * f32;
                            float f44 = f43 / 2.0f;
                            wVar7.f18390e = (int) ((f36 + f42) - f44);
                            float f45 = f31 * f41;
                            float f46 = f35 * f33;
                            float f47 = f46 / 2.0f;
                            wVar7.f18391f = (int) ((f38 + f45) - f47);
                            wVar7.f18392x = (int) (f37 + f43);
                            wVar7.f18393y = (int) (f39 + f46);
                            iVar = iVar2;
                            float f48 = Float.isNaN(iVar.f18293l) ? 0.0f : iVar.f18293l;
                            float f49 = (-f41) * f48;
                            float f50 = f40 * f48;
                            wVar7.f18383F = 1;
                            wVar3 = wVar8;
                            float f51 = (int) ((wVar3.f18390e + f42) - f44);
                            float f52 = (int) ((wVar3.f18391f + f45) - f47);
                            wVar7.f18390e = f51 + f49;
                            wVar7.f18391f = f52 + f50;
                            wVar7.f18379B = wVar7.f18379B;
                            wVar7.f18386a = e.d(iVar.f18288f);
                            wVar7.f18378A = iVar.f18289g;
                            arrayList2 = arrayList5;
                        } else if (i16 != 2) {
                            float f53 = iVar2.f18265a / 100.0f;
                            wVar7.f18388c = f53;
                            wVar7.f18387b = iVar2.f18290h;
                            float f54 = Float.isNaN(iVar2.f18291i) ? f53 : iVar2.f18291i;
                            float f55 = Float.isNaN(iVar2.j) ? f53 : iVar2.j;
                            float f56 = wVar6.f18392x;
                            float f57 = wVar8.f18392x;
                            float f58 = f56 - f57;
                            float f59 = wVar6.f18393y;
                            float f60 = wVar8.f18393y;
                            float f61 = f59 - f60;
                            wVar7.f18389d = wVar7.f18388c;
                            float f62 = wVar8.f18390e;
                            float f63 = wVar8.f18391f;
                            float f64 = ((f56 / 2.0f) + wVar6.f18390e) - ((f57 / 2.0f) + f62);
                            float f65 = ((f59 / 2.0f) + wVar6.f18391f) - ((f60 / 2.0f) + f63);
                            float f66 = f58 * f54;
                            float f67 = f66 / 2.0f;
                            wVar7.f18390e = (int) (((f64 * f53) + f62) - f67);
                            float f68 = f61 * f55;
                            float f69 = f68 / 2.0f;
                            wVar7.f18391f = (int) (((f65 * f53) + f63) - f69);
                            wVar7.f18392x = (int) (f57 + f66);
                            wVar7.f18393y = (int) (f60 + f68);
                            float f70 = Float.isNaN(iVar2.f18292k) ? f53 : iVar2.f18292k;
                            float f71 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            if (!Float.isNaN(iVar2.f18293l)) {
                                f53 = iVar2.f18293l;
                            }
                            if (Float.isNaN(Float.NaN)) {
                                i11 = 0;
                                f7 = 0.0f;
                            } else {
                                f7 = Float.NaN;
                                i11 = 0;
                            }
                            wVar7.f18383F = i11;
                            wVar7.f18390e = (int) (((f7 * f65) + ((f70 * f64) + wVar8.f18390e)) - f67);
                            wVar7.f18391f = (int) (((f65 * f53) + ((f64 * f71) + wVar8.f18391f)) - f69);
                            wVar7.f18386a = e.d(iVar2.f18288f);
                            wVar7.f18378A = iVar2.f18289g;
                            wVar3 = wVar8;
                            iVar = iVar2;
                            arrayList2 = arrayList4;
                        } else {
                            float f72 = iVar2.f18265a / 100.0f;
                            wVar7.f18388c = f72;
                            wVar7.f18387b = iVar2.f18290h;
                            float f73 = Float.isNaN(iVar2.f18291i) ? f72 : iVar2.f18291i;
                            float f74 = Float.isNaN(iVar2.j) ? f72 : iVar2.j;
                            float f75 = wVar6.f18392x;
                            float f76 = wVar8.f18392x;
                            float f77 = f75 - f76;
                            float f78 = wVar6.f18393y;
                            float f79 = wVar8.f18393y;
                            float f80 = f78 - f79;
                            wVar7.f18389d = wVar7.f18388c;
                            float f81 = wVar8.f18390e;
                            ArrayList arrayList6 = arrayList4;
                            float f82 = wVar8.f18391f;
                            float f83 = (f75 / 2.0f) + wVar6.f18390e;
                            float f84 = (f78 / 2.0f) + wVar6.f18391f;
                            float f85 = f77 * f73;
                            wVar7.f18390e = (int) ((((f83 - ((f76 / 2.0f) + f81)) * f72) + f81) - (f85 / 2.0f));
                            float f86 = f80 * f74;
                            wVar7.f18391f = (int) ((((f84 - ((f79 / 2.0f) + f82)) * f72) + f82) - (f86 / 2.0f));
                            wVar7.f18392x = (int) (f76 + f85);
                            wVar7.f18393y = (int) (f79 + f86);
                            wVar7.f18383F = 2;
                            if (!Float.isNaN(iVar2.f18292k)) {
                                wVar7.f18390e = (int) (iVar2.f18292k * ((int) (i7 - wVar7.f18392x)));
                            }
                            if (!Float.isNaN(iVar2.f18293l)) {
                                wVar7.f18391f = (int) (iVar2.f18293l * ((int) (i8 - wVar7.f18393y)));
                            }
                            wVar7.f18379B = wVar7.f18379B;
                            wVar7.f18386a = e.d(iVar2.f18288f);
                            wVar7.f18378A = iVar2.f18289g;
                            iVar = iVar2;
                            arrayList2 = arrayList6;
                            wVar3 = wVar8;
                        }
                    }
                    int iBinarySearch = Collections.binarySearch(arrayList2, wVar7);
                    if (iBinarySearch == 0) {
                        Log.e("MotionController", " KeyPath position \"" + wVar7.f18389d + "\" outside of range");
                    }
                    arrayList2.add((-iBinarySearch) - 1, wVar7);
                    int i17 = iVar.f18287e;
                    if (i17 != -1) {
                        nVar = this;
                        nVar.f18325e = i17;
                    } else {
                        nVar = this;
                    }
                    map3 = map5;
                    hashSet3 = hashSet5;
                } else {
                    str25 = str33;
                    str26 = str34;
                    str27 = str37;
                    str28 = str38;
                    str29 = str39;
                    arrayList3 = arrayList3;
                    str30 = str40;
                    arrayList2 = arrayList4;
                    wVar3 = wVar5;
                    nVar = nVar2;
                    map3 = map5;
                    abstractC1062c.d(map3);
                    hashSet3 = hashSet5;
                    abstractC1062c.b(hashSet3);
                }
                map5 = map3;
                arrayList4 = arrayList2;
                nVar2 = nVar;
                hashSet5 = hashSet3;
                wVar5 = wVar3;
                str36 = str41;
                str35 = str35;
                str32 = str32;
                str31 = str31;
                str37 = str27;
                str34 = str26;
                str33 = str25;
                str39 = str29;
                str38 = str28;
                str40 = str30;
                arrayList3 = arrayList3;
            }
        }
        String str42 = str31;
        String str43 = str32;
        String str44 = str33;
        String str45 = str34;
        String str46 = str35;
        String str47 = str36;
        String str48 = str37;
        String str49 = str38;
        String str50 = str39;
        ArrayList<AbstractC1062c> arrayList7 = arrayList3;
        String str51 = str40;
        ArrayList arrayList8 = arrayList4;
        HashSet hashSet7 = hashSet5;
        w wVar9 = wVar5;
        n nVar3 = nVar2;
        HashMap map6 = map5;
        String str52 = "CUSTOM,";
        String str53 = ",";
        if (hashSet7.isEmpty()) {
            arrayList = arrayList8;
            hashSet = hashSet7;
            wVar = wVar9;
            str = ",";
            wVar2 = wVar6;
            obj = obj3;
            str2 = str47;
            str3 = str46;
            str4 = str43;
            str5 = str42;
            str6 = str48;
            str7 = str45;
            str8 = str44;
            str9 = str50;
            str10 = str49;
            str11 = str51;
            map = map6;
            str12 = "CUSTOM,";
        } else {
            nVar3.f18344y = new HashMap();
            Iterator it2 = hashSet7.iterator();
            while (it2.hasNext()) {
                String str54 = (String) it2.next();
                if (!str54.startsWith(str52)) {
                    switch (str54.hashCode()) {
                        case -1249320806:
                            arrayList8 = arrayList8;
                            hashSet7 = hashSet7;
                            it2 = it2;
                            wVar9 = wVar9;
                            wVar6 = wVar6;
                            obj2 = obj3;
                            str15 = str47;
                            str16 = str46;
                            str17 = str43;
                            str18 = str42;
                            str19 = str48;
                            str20 = str45;
                            str21 = str44;
                            str22 = str50;
                            str23 = str49;
                            str24 = str51;
                            if (str54.equals(str15)) {
                                b10 = 0;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -1249320805:
                            hashSet7 = hashSet7;
                            it2 = it2;
                            wVar9 = wVar9;
                            wVar6 = wVar6;
                            obj2 = obj3;
                            str16 = str46;
                            str17 = str43;
                            str18 = str42;
                            str19 = str48;
                            str20 = str45;
                            str21 = str44;
                            str22 = str50;
                            str23 = str49;
                            str24 = str51;
                            arrayList8 = arrayList8;
                            str15 = str47;
                            if (str54.equals(str16)) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -1225497657:
                            hashSet7 = hashSet7;
                            it2 = it2;
                            wVar6 = wVar6;
                            obj2 = obj3;
                            str17 = str43;
                            str18 = str42;
                            str19 = str48;
                            str20 = str45;
                            str21 = str44;
                            str22 = str50;
                            str23 = str49;
                            str24 = str51;
                            arrayList8 = arrayList8;
                            if (str54.equals(str17)) {
                                wVar9 = wVar9;
                                str15 = str47;
                                str16 = str46;
                                b10 = 2;
                            } else {
                                wVar9 = wVar9;
                                str15 = str47;
                                str16 = str46;
                                b10 = -1;
                            }
                            break;
                        case -1225497656:
                            hashSet7 = hashSet7;
                            it2 = it2;
                            obj2 = obj3;
                            str18 = str42;
                            str19 = str48;
                            str20 = str45;
                            str21 = str44;
                            str22 = str50;
                            str23 = str49;
                            str24 = str51;
                            arrayList8 = arrayList8;
                            wVar9 = wVar9;
                            if (str54.equals(str18)) {
                                wVar6 = wVar6;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                b10 = 3;
                            } else {
                                wVar6 = wVar6;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                b10 = -1;
                            }
                            break;
                        case -1225497655:
                            hashSet7 = hashSet7;
                            it2 = it2;
                            obj2 = obj3;
                            str19 = str48;
                            str20 = str45;
                            str21 = str44;
                            str22 = str50;
                            str23 = str49;
                            str24 = str51;
                            arrayList8 = arrayList8;
                            wVar9 = wVar9;
                            wVar6 = wVar6;
                            str15 = str47;
                            str16 = str46;
                            str17 = str43;
                            if (str54.equals("translationZ")) {
                                str18 = str42;
                                b10 = 4;
                            } else {
                                str18 = str42;
                                b10 = -1;
                            }
                            break;
                        case -1001078227:
                            it2 = it2;
                            obj2 = obj3;
                            str19 = str48;
                            str20 = str45;
                            str21 = str44;
                            str22 = str50;
                            str23 = str49;
                            str24 = str51;
                            arrayList8 = arrayList8;
                            hashSet7 = hashSet7;
                            wVar9 = wVar9;
                            if (str54.equals(str19)) {
                                wVar6 = wVar6;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                b10 = 5;
                            } else {
                                wVar6 = wVar6;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                b10 = -1;
                            }
                            break;
                        case -908189618:
                            obj2 = obj3;
                            str20 = str45;
                            str21 = str44;
                            str22 = str50;
                            str23 = str49;
                            str24 = str51;
                            arrayList8 = arrayList8;
                            hashSet7 = hashSet7;
                            it2 = it2;
                            wVar9 = wVar9;
                            if (str54.equals(str20)) {
                                wVar6 = wVar6;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                str19 = str48;
                                b10 = 6;
                            } else {
                                wVar6 = wVar6;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                str19 = str48;
                                b10 = -1;
                            }
                            break;
                        case -908189617:
                            obj2 = obj3;
                            str21 = str44;
                            str22 = str50;
                            str23 = str49;
                            str24 = str51;
                            arrayList8 = arrayList8;
                            hashSet7 = hashSet7;
                            it2 = it2;
                            wVar9 = wVar9;
                            wVar6 = wVar6;
                            str15 = str47;
                            str16 = str46;
                            str17 = str43;
                            str18 = str42;
                            str19 = str48;
                            if (str54.equals(str21)) {
                                str20 = str45;
                                b10 = 7;
                            } else {
                                str20 = str45;
                                b10 = -1;
                            }
                            break;
                        case -797520672:
                            obj2 = obj3;
                            str22 = str50;
                            str23 = str49;
                            str24 = str51;
                            if (str54.equals("waveVariesBy")) {
                                arrayList8 = arrayList8;
                                hashSet7 = hashSet7;
                                it2 = it2;
                                wVar9 = wVar9;
                                wVar6 = wVar6;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                str19 = str48;
                                str20 = str45;
                                str21 = str44;
                                b10 = 8;
                            } else {
                                arrayList8 = arrayList8;
                                hashSet7 = hashSet7;
                                it2 = it2;
                                wVar9 = wVar9;
                                wVar6 = wVar6;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                str19 = str48;
                                str20 = str45;
                                str21 = str44;
                                b10 = -1;
                            }
                            break;
                        case -760884510:
                            obj2 = obj3;
                            str22 = str50;
                            str23 = str49;
                            str24 = str51;
                            if (str54.equals("transformPivotX")) {
                                arrayList8 = arrayList8;
                                hashSet7 = hashSet7;
                                it2 = it2;
                                wVar9 = wVar9;
                                wVar6 = wVar6;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                str19 = str48;
                                str20 = str45;
                                str21 = str44;
                                b10 = 9;
                            } else {
                                arrayList8 = arrayList8;
                                hashSet7 = hashSet7;
                                it2 = it2;
                                wVar9 = wVar9;
                                wVar6 = wVar6;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                str19 = str48;
                                str20 = str45;
                                str21 = str44;
                                b10 = -1;
                            }
                            break;
                        case -760884509:
                            obj2 = obj3;
                            str22 = str50;
                            str23 = str49;
                            str24 = str51;
                            if (str54.equals("transformPivotY")) {
                                b11 = 10;
                                arrayList8 = arrayList8;
                                hashSet7 = hashSet7;
                                it2 = it2;
                                wVar9 = wVar9;
                                b10 = b11;
                                wVar6 = wVar6;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                str19 = str48;
                                str20 = str45;
                                str21 = str44;
                            }
                            arrayList8 = arrayList8;
                            hashSet7 = hashSet7;
                            it2 = it2;
                            wVar9 = wVar9;
                            wVar6 = wVar6;
                            str15 = str47;
                            str16 = str46;
                            str17 = str43;
                            str18 = str42;
                            str19 = str48;
                            str20 = str45;
                            str21 = str44;
                            b10 = -1;
                            break;
                        case -40300674:
                            obj2 = obj3;
                            str22 = str50;
                            str23 = str49;
                            str24 = str51;
                            if (str54.equals(str22)) {
                                b11 = 11;
                                arrayList8 = arrayList8;
                                hashSet7 = hashSet7;
                                it2 = it2;
                                wVar9 = wVar9;
                                b10 = b11;
                                wVar6 = wVar6;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                str19 = str48;
                                str20 = str45;
                                str21 = str44;
                            }
                            arrayList8 = arrayList8;
                            hashSet7 = hashSet7;
                            it2 = it2;
                            wVar9 = wVar9;
                            wVar6 = wVar6;
                            str15 = str47;
                            str16 = str46;
                            str17 = str43;
                            str18 = str42;
                            str19 = str48;
                            str20 = str45;
                            str21 = str44;
                            b10 = -1;
                            break;
                        case -4379043:
                            obj2 = obj3;
                            str23 = str49;
                            str24 = str51;
                            if (str54.equals(obj2)) {
                                arrayList8 = arrayList8;
                                hashSet7 = hashSet7;
                                it2 = it2;
                                wVar9 = wVar9;
                                b10 = 12;
                                wVar6 = wVar6;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                str19 = str48;
                                str20 = str45;
                                str21 = str44;
                                str22 = str50;
                            } else {
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                str19 = str48;
                                str20 = str45;
                                str21 = str44;
                                str22 = str50;
                                b10 = -1;
                            }
                            break;
                        case 37232917:
                            str23 = str49;
                            str24 = str51;
                            if (str54.equals(str23)) {
                                arrayList8 = arrayList8;
                                hashSet7 = hashSet7;
                                it2 = it2;
                                wVar9 = wVar9;
                                wVar6 = wVar6;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                str19 = str48;
                                str20 = str45;
                                str21 = str44;
                                str22 = str50;
                                Object obj4 = obj3;
                                b10 = 13;
                                obj2 = obj4;
                            } else {
                                obj2 = obj3;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                str19 = str48;
                                str20 = str45;
                                str21 = str44;
                                str22 = str50;
                                b10 = -1;
                            }
                            break;
                        case 92909918:
                            str24 = str51;
                            if (str54.equals(str24)) {
                                arrayList8 = arrayList8;
                                hashSet7 = hashSet7;
                                it2 = it2;
                                wVar9 = wVar9;
                                wVar6 = wVar6;
                                obj2 = obj3;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                str19 = str48;
                                str20 = str45;
                                str21 = str44;
                                str22 = str50;
                                b10 = 14;
                                str23 = str49;
                            } else {
                                arrayList8 = arrayList8;
                                hashSet7 = hashSet7;
                                it2 = it2;
                                wVar9 = wVar9;
                                wVar6 = wVar6;
                                obj2 = obj3;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                str19 = str48;
                                str20 = str45;
                                str21 = str44;
                                str22 = str50;
                                str23 = str49;
                                b10 = -1;
                            }
                            break;
                        case 156108012:
                            if (str54.equals("waveOffset")) {
                                arrayList8 = arrayList8;
                                hashSet7 = hashSet7;
                                it2 = it2;
                                wVar9 = wVar9;
                                wVar6 = wVar6;
                                obj2 = obj3;
                                str15 = str47;
                                str16 = str46;
                                str17 = str43;
                                str18 = str42;
                                str19 = str48;
                                str20 = str45;
                                str21 = str44;
                                str22 = str50;
                                str23 = str49;
                                b10 = 15;
                                str24 = str51;
                                break;
                            }
                        default:
                            arrayList8 = arrayList8;
                            hashSet7 = hashSet7;
                            it2 = it2;
                            wVar9 = wVar9;
                            wVar6 = wVar6;
                            obj2 = obj3;
                            str15 = str47;
                            str16 = str46;
                            str17 = str43;
                            str18 = str42;
                            str19 = str48;
                            str20 = str45;
                            str21 = str44;
                            str22 = str50;
                            str23 = str49;
                            str24 = str51;
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        case 0:
                            str52 = str52;
                            str53 = str53;
                            gVar2 = new g(5);
                            break;
                        case 1:
                            str52 = str52;
                            str53 = str53;
                            gVar2 = new g(6);
                            break;
                        case 2:
                            str52 = str52;
                            str53 = str53;
                            gVar2 = new g(9);
                            break;
                        case 3:
                            str52 = str52;
                            str53 = str53;
                            gVar2 = new g(10);
                            break;
                        case 4:
                            str52 = str52;
                            str53 = str53;
                            gVar2 = new g(11);
                            break;
                        case 5:
                            str52 = str52;
                            str53 = str53;
                            j jVar = new j();
                            jVar.f18114f = false;
                            gVar2 = jVar;
                            break;
                        case 6:
                            str52 = str52;
                            str53 = str53;
                            gVar2 = new g(7);
                            break;
                        case 7:
                            str52 = str52;
                            str53 = str53;
                            gVar2 = new g(8);
                            break;
                        case 8:
                            str52 = str52;
                            str53 = str53;
                            gVar2 = new g(0);
                            break;
                        case 9:
                            str52 = str52;
                            str53 = str53;
                            gVar2 = new g(2);
                            break;
                        case 10:
                            str52 = str52;
                            str53 = str53;
                            gVar2 = new g(3);
                            break;
                        case 11:
                            str52 = str52;
                            str53 = str53;
                            gVar2 = new g(4);
                            break;
                        case 12:
                            str52 = str52;
                            str53 = str53;
                            gVar2 = new g(1);
                            break;
                        case 13:
                            str52 = str52;
                            str53 = str53;
                            gVar2 = new i();
                            break;
                        case 14:
                            gVar = new g(0);
                            gVar2 = gVar;
                            break;
                        case 15:
                            gVar = new g(0);
                            gVar2 = gVar;
                            break;
                        default:
                            str52 = str52;
                            str53 = str53;
                            gVar2 = null;
                            break;
                    }
                } else {
                    SparseArray sparseArray = new SparseArray();
                    String str55 = str54.split(str53)[1];
                    for (AbstractC1062c abstractC1062c2 : arrayList7) {
                        HashMap map7 = abstractC1062c2.f18268d;
                        if (map7 != null && (aVar3 = (B.a) map7.get(str55)) != null) {
                            sparseArray.append(abstractC1062c2.f18265a, aVar3);
                        }
                    }
                    h hVar = new h();
                    String str56 = str54.split(str53)[1];
                    hVar.f18112f = sparseArray;
                    arrayList8 = arrayList8;
                    hashSet7 = hashSet7;
                    it2 = it2;
                    wVar9 = wVar9;
                    str53 = str53;
                    wVar6 = wVar6;
                    obj2 = obj3;
                    str15 = str47;
                    str16 = str46;
                    str17 = str43;
                    str18 = str42;
                    str19 = str48;
                    str20 = str45;
                    str21 = str44;
                    str22 = str50;
                    str24 = str51;
                    str52 = str52;
                    gVar2 = hVar;
                    str23 = str49;
                }
                if (gVar2 != null) {
                    gVar2.f18119e = str54;
                    nVar3.f18344y.put(str54, gVar2);
                }
                str53 = str53;
                str47 = str15;
                str42 = str18;
                str48 = str19;
                str46 = str16;
                str51 = str24;
                str49 = str23;
                str50 = str22;
                str44 = str21;
                str43 = str17;
                str45 = str20;
                wVar6 = wVar6;
                wVar9 = wVar9;
                str52 = str52;
                arrayList8 = arrayList8;
                hashSet7 = hashSet7;
                it2 = it2;
                obj3 = obj2;
            }
            arrayList = arrayList8;
            hashSet = hashSet7;
            wVar = wVar9;
            str = str53;
            wVar2 = wVar6;
            obj = obj3;
            str2 = str47;
            str3 = str46;
            str4 = str43;
            str5 = str42;
            str6 = str48;
            str7 = str45;
            str8 = str44;
            str9 = str50;
            str10 = str49;
            str11 = str51;
            str12 = str52;
            if (arrayList7 != null) {
                Iterator it3 = arrayList7.iterator();
                while (it3.hasNext()) {
                    AbstractC1062c abstractC1062c3 = (AbstractC1062c) it3.next();
                    if (abstractC1062c3 instanceof C1064e) {
                        HashMap map8 = nVar3.f18344y;
                        C1064e c1064e = (C1064e) abstractC1062c3;
                        c1064e.getClass();
                        for (String str57 : map8.keySet()) {
                            it3 = it3;
                            HashMap map9 = map8;
                            k kVar = (k) map8.get(str57);
                            if (kVar != null) {
                                HashMap map10 = map6;
                                if (!str57.startsWith("CUSTOM")) {
                                    switch (str57.hashCode()) {
                                        case -1249320806:
                                            if (str57.equals(str2)) {
                                                b9 = 0;
                                            } else {
                                                b9 = -1;
                                            }
                                            break;
                                        case -1249320805:
                                            if (str57.equals(str3)) {
                                                b9 = 1;
                                            } else {
                                                b9 = -1;
                                            }
                                            break;
                                        case -1225497657:
                                            if (str57.equals(str4)) {
                                                b9 = 2;
                                            } else {
                                                b9 = -1;
                                            }
                                            break;
                                        case -1225497656:
                                            if (str57.equals(str5)) {
                                                b9 = 3;
                                            } else {
                                                b9 = -1;
                                            }
                                            break;
                                        case -1225497655:
                                            if (str57.equals("translationZ")) {
                                                b9 = 4;
                                            } else {
                                                b9 = -1;
                                            }
                                            break;
                                        case -1001078227:
                                            if (str57.equals(str6)) {
                                                b9 = 5;
                                            } else {
                                                b9 = -1;
                                            }
                                            break;
                                        case -908189618:
                                            if (str57.equals(str7)) {
                                                b9 = 6;
                                            } else {
                                                b9 = -1;
                                            }
                                            break;
                                        case -908189617:
                                            if (str57.equals(str8)) {
                                                b9 = 7;
                                            } else {
                                                b9 = -1;
                                            }
                                            break;
                                        case -760884510:
                                            if (str57.equals("transformPivotX")) {
                                                b9 = 8;
                                            } else {
                                                b9 = -1;
                                            }
                                            break;
                                        case -760884509:
                                            if (str57.equals("transformPivotY")) {
                                                b9 = 9;
                                            } else {
                                                b9 = -1;
                                            }
                                            break;
                                        case -40300674:
                                            if (str57.equals(str9)) {
                                                b9 = 10;
                                            } else {
                                                b9 = -1;
                                            }
                                            break;
                                        case -4379043:
                                            if (str57.equals(obj)) {
                                                b9 = 11;
                                            } else {
                                                b9 = -1;
                                            }
                                            break;
                                        case 37232917:
                                            if (str57.equals(str10)) {
                                                b9 = 12;
                                            } else {
                                                b9 = -1;
                                            }
                                            break;
                                        case 92909918:
                                            if (str57.equals(str11)) {
                                                b9 = 13;
                                            } else {
                                                b9 = -1;
                                            }
                                            break;
                                        default:
                                            b9 = -1;
                                            break;
                                    }
                                    switch (b9) {
                                        case 0:
                                            if (!Float.isNaN(c1064e.f18274i)) {
                                                kVar.b(c1064e.f18274i, c1064e.f18265a);
                                            }
                                            break;
                                        case 1:
                                            if (!Float.isNaN(c1064e.j)) {
                                                kVar.b(c1064e.j, c1064e.f18265a);
                                            }
                                            break;
                                        case 2:
                                            if (!Float.isNaN(c1064e.f18280p)) {
                                                kVar.b(c1064e.f18280p, c1064e.f18265a);
                                            }
                                            break;
                                        case 3:
                                            if (!Float.isNaN(c1064e.f18281q)) {
                                                kVar.b(c1064e.f18281q, c1064e.f18265a);
                                            }
                                            break;
                                        case 4:
                                            if (!Float.isNaN(c1064e.f18282r)) {
                                                kVar.b(c1064e.f18282r, c1064e.f18265a);
                                            }
                                            break;
                                        case 5:
                                            if (!Float.isNaN(c1064e.f18283s)) {
                                                kVar.b(c1064e.f18283s, c1064e.f18265a);
                                            }
                                            break;
                                        case 6:
                                            if (!Float.isNaN(c1064e.f18278n)) {
                                                kVar.b(c1064e.f18278n, c1064e.f18265a);
                                            }
                                            break;
                                        case 7:
                                            if (!Float.isNaN(c1064e.f18279o)) {
                                                kVar.b(c1064e.f18279o, c1064e.f18265a);
                                            }
                                            break;
                                        case 8:
                                            if (!Float.isNaN(c1064e.f18274i)) {
                                                kVar.b(c1064e.f18275k, c1064e.f18265a);
                                            }
                                            break;
                                        case 9:
                                            if (!Float.isNaN(c1064e.j)) {
                                                kVar.b(c1064e.f18276l, c1064e.f18265a);
                                            }
                                            break;
                                        case 10:
                                            if (!Float.isNaN(c1064e.f18273h)) {
                                                kVar.b(c1064e.f18273h, c1064e.f18265a);
                                            }
                                            break;
                                        case 11:
                                            if (!Float.isNaN(c1064e.f18272g)) {
                                                kVar.b(c1064e.f18272g, c1064e.f18265a);
                                            }
                                            break;
                                        case 12:
                                            if (!Float.isNaN(c1064e.f18277m)) {
                                                kVar.b(c1064e.f18277m, c1064e.f18265a);
                                            }
                                            break;
                                        case 13:
                                            if (!Float.isNaN(c1064e.f18271f)) {
                                                kVar.b(c1064e.f18271f, c1064e.f18265a);
                                            }
                                            break;
                                    }
                                } else {
                                    B.a aVar4 = (B.a) c1064e.f18268d.get(str57.substring(7));
                                    if (aVar4 != null) {
                                        ((h) kVar).f18112f.append(c1064e.f18265a, aVar4);
                                    }
                                }
                                map6 = map10;
                            }
                            map8 = map9;
                        }
                    }
                    it3 = it3;
                    map6 = map6;
                }
            }
            HashMap map11 = map6;
            lVar2.a(0, nVar3.f18344y);
            lVar3.a(100, nVar3.f18344y);
            Iterator it4 = nVar3.f18344y.keySet().iterator();
            while (it4.hasNext()) {
                String str58 = (String) it4.next();
                HashMap map12 = map11;
                int iIntValue = (!map12.containsKey(str58) || (num = (Integer) map12.get(str58)) == null) ? 0 : num.intValue();
                k kVar2 = (k) nVar3.f18344y.get(str58);
                if (kVar2 != null) {
                    kVar2.d(iIntValue);
                }
                it4 = it4;
                map11 = map12;
            }
            map = map11;
        }
        if (!hashSet4.isEmpty()) {
            if (nVar3.f18343x == null) {
                nVar3.f18343x = new HashMap();
            }
            Iterator it5 = hashSet4.iterator();
            while (it5.hasNext()) {
                String str59 = (String) it5.next();
                if (!nVar3.f18343x.containsKey(str59)) {
                    String str60 = str12;
                    if (str59.startsWith(str60)) {
                        it = it5;
                        SparseArray sparseArray2 = new SparseArray();
                        str12 = str60;
                        String str61 = str;
                        map2 = map;
                        String str62 = str59.split(str61)[1];
                        for (AbstractC1062c abstractC1062c4 : arrayList7) {
                            String str63 = str2;
                            HashMap map13 = abstractC1062c4.f18268d;
                            if (map13 != null && (aVar2 = (B.a) map13.get(str62)) != null) {
                                sparseArray2.append(abstractC1062c4.f18265a, aVar2);
                            }
                            str2 = str63;
                        }
                        String str64 = str2;
                        m mVar2 = new m();
                        mVar2.f18123i = new SparseArray();
                        mVar2.f18121g = str59.split(str61)[1];
                        mVar2.f18122h = sparseArray2;
                        str = str61;
                        str14 = str64;
                        mVar = mVar2;
                    } else {
                        it = it5;
                        String str65 = str2;
                        map2 = map;
                        str12 = str60;
                        String str66 = str;
                        switch (str59.hashCode()) {
                            case -1249320806:
                                str14 = str65;
                                b7 = str59.equals(str14) ? (byte) 0 : (byte) -1;
                                break;
                            case -1249320805:
                                if (str59.equals(str3)) {
                                    str14 = str65;
                                    b7 = 1;
                                } else {
                                    str14 = str65;
                                }
                                break;
                            case -1225497657:
                                if (str59.equals(str4)) {
                                    str14 = str65;
                                    b7 = 2;
                                } else {
                                    str14 = str65;
                                }
                                break;
                            case -1225497656:
                                if (str59.equals(str5)) {
                                    str14 = str65;
                                    b7 = 3;
                                } else {
                                    str14 = str65;
                                }
                                break;
                            case -1225497655:
                                if (str59.equals("translationZ")) {
                                    str14 = str65;
                                    b7 = 4;
                                } else {
                                    str14 = str65;
                                }
                                break;
                            case -1001078227:
                                if (str59.equals(str6)) {
                                    str14 = str65;
                                    b7 = 5;
                                } else {
                                    str14 = str65;
                                }
                                break;
                            case -908189618:
                                if (str59.equals(str7)) {
                                    str14 = str65;
                                    b7 = 6;
                                } else {
                                    str14 = str65;
                                }
                                break;
                            case -908189617:
                                if (str59.equals(str8)) {
                                    str14 = str65;
                                    b7 = 7;
                                } else {
                                    str14 = str65;
                                }
                                break;
                            case -40300674:
                                if (str59.equals(str9)) {
                                    str14 = str65;
                                    b7 = 8;
                                } else {
                                    str14 = str65;
                                }
                                break;
                            case -4379043:
                                if (str59.equals(obj)) {
                                    str14 = str65;
                                    b7 = 9;
                                } else {
                                    str14 = str65;
                                }
                                break;
                            case 37232917:
                                if (str59.equals(str10)) {
                                    b8 = 10;
                                    b7 = b8;
                                    str14 = str65;
                                } else {
                                    str14 = str65;
                                }
                                break;
                            case 92909918:
                                if (str59.equals(str11)) {
                                    b8 = 11;
                                    b7 = b8;
                                    str14 = str65;
                                } else {
                                    str14 = str65;
                                }
                                break;
                            default:
                                str14 = str65;
                                break;
                        }
                        switch (b7) {
                            case 0:
                                lVar = new l(3);
                                str = str66;
                                lVar.f18130e = j;
                                pVar = lVar;
                                break;
                            case 1:
                                lVar = new l(4);
                                str = str66;
                                lVar.f18130e = j;
                                pVar = lVar;
                                break;
                            case 2:
                                lVar = new l(7);
                                str = str66;
                                lVar.f18130e = j;
                                pVar = lVar;
                                break;
                            case 3:
                                lVar = new l(8);
                                str = str66;
                                lVar.f18130e = j;
                                pVar = lVar;
                                break;
                            case 4:
                                lVar = new l(9);
                                str = str66;
                                lVar.f18130e = j;
                                pVar = lVar;
                                break;
                            case 5:
                                o oVar = new o();
                                oVar.f18125g = false;
                                lVar = oVar;
                                str = str66;
                                lVar.f18130e = j;
                                pVar = lVar;
                                break;
                            case 6:
                                lVar = new l(5);
                                str = str66;
                                lVar.f18130e = j;
                                pVar = lVar;
                                break;
                            case 7:
                                lVar = new l(6);
                                str = str66;
                                lVar.f18130e = j;
                                pVar = lVar;
                                break;
                            case 8:
                                lVar = new l(2);
                                str = str66;
                                lVar.f18130e = j;
                                pVar = lVar;
                                break;
                            case 9:
                                lVar = new l(1);
                                str = str66;
                                lVar.f18130e = j;
                                pVar = lVar;
                                break;
                            case 10:
                                lVar = new p165y.n();
                                str = str66;
                                lVar.f18130e = j;
                                pVar = lVar;
                                break;
                            case 11:
                                lVar = new l(0);
                                str = str66;
                                lVar.f18130e = j;
                                pVar = lVar;
                                break;
                            default:
                                str = str66;
                                mVar = null;
                                break;
                        }
                        if (pVar == null) {
                            nVar3 = this;
                            str2 = str14;
                            map = map2;
                            it5 = it;
                        } else {
                            pVar.f18127b = str59;
                            nVar3 = this;
                            String str67 = str14;
                            nVar3.f18343x.put(str59, pVar);
                            it5 = it;
                            str2 = str67;
                            map = map2;
                        }
                    }
                    pVar = mVar;
                    if (pVar == null) {
                        nVar3 = this;
                        str2 = str14;
                        map = map2;
                        it5 = it;
                    } else {
                        pVar.f18127b = str59;
                        nVar3 = this;
                        String str68 = str14;
                        nVar3.f18343x.put(str59, pVar);
                        it5 = it;
                        str2 = str68;
                        map = map2;
                    }
                }
            }
            HashMap map14 = map;
            if (arrayList7 != null) {
                for (AbstractC1062c abstractC1062c5 : arrayList7) {
                }
            }
            for (String str69 : nVar3.f18343x.keySet()) {
                HashMap map15 = map14;
                ((p) nVar3.f18343x.get(str69)).c(map15.containsKey(str69) ? ((Integer) map15.get(str69)).intValue() : 0);
                map14 = map15;
            }
        }
        int size = arrayList.size();
        int i18 = size + 2;
        w[] wVarArr = new w[i18];
        wVarArr[0] = wVar;
        wVarArr[size + 1] = wVar2;
        if (arrayList.size() > 0 && nVar3.f18325e == -1) {
            nVar3.f18325e = 0;
        }
        Iterator it6 = arrayList.iterator();
        int i19 = 1;
        while (it6.hasNext()) {
            wVarArr[i19] = (w) it6.next();
            i19++;
        }
        HashSet hashSet8 = new HashSet();
        for (String str70 : wVar2.f18382E.keySet()) {
            w wVar10 = wVar;
            if (wVar10.f18382E.containsKey(str70)) {
                str13 = str12;
                hashSet2 = hashSet;
                if (!hashSet2.contains(str13 + str70)) {
                    hashSet8.add(str70);
                }
            } else {
                str13 = str12;
                hashSet2 = hashSet;
            }
            wVar = wVar10;
            str12 = str13;
            hashSet = hashSet2;
        }
        String[] strArr = (String[]) hashSet8.toArray(new String[0]);
        nVar3.f18337r = strArr;
        nVar3.f18338s = new int[strArr.length];
        int i20 = 0;
        while (true) {
            String[] strArr2 = nVar3.f18337r;
            if (i20 < strArr2.length) {
                String str71 = strArr2[i20];
                nVar3.f18338s[i20] = 0;
                for (int i21 = 0; i21 < i18; i21++) {
                    if (wVarArr[i21].f18382E.containsKey(str71) && (aVar = (B.a) wVarArr[i21].f18382E.get(str71)) != null) {
                        int[] iArr = nVar3.f18338s;
                        iArr[i20] = aVar.c() + iArr[i20];
                        i20++;
                    }
                }
                i20++;
            } else {
                boolean z4 = wVarArr[0].f18378A != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                for (int i22 = 1; i22 < i18; i22++) {
                    w wVar11 = wVarArr[i22];
                    w wVar12 = wVarArr[i22 - 1];
                    boolean zB = w.b(wVar11.f18390e, wVar12.f18390e);
                    boolean zB2 = w.b(wVar11.f18391f, wVar12.f18391f);
                    zArr[0] = zArr[0] | w.b(wVar11.f18389d, wVar12.f18389d);
                    boolean z7 = zB | zB2 | z4;
                    zArr[1] = zArr[1] | z7;
                    zArr[2] = z7 | zArr[2];
                    zArr[3] = zArr[3] | w.b(wVar11.f18392x, wVar12.f18392x);
                    zArr[4] = w.b(wVar11.f18393y, wVar12.f18393y) | zArr[4];
                }
                int i23 = 0;
                for (int i24 = 1; i24 < length; i24++) {
                    if (zArr[i24]) {
                        i23++;
                    }
                }
                nVar3.f18334o = new int[i23];
                int iMax = Math.max(2, i23);
                nVar3.f18335p = new double[iMax];
                nVar3.f18336q = new double[iMax];
                int i25 = 1;
                int i26 = 0;
                while (i25 < length) {
                    if (zArr[i25]) {
                        i10 = 1;
                        nVar3.f18334o[i26] = i25;
                        i26++;
                    } else {
                        i10 = 1;
                    }
                    i25 += i10;
                }
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i18, nVar3.f18334o.length);
                double[] dArr2 = new double[i18];
                for (int i27 = 0; i27 < i18; i27++) {
                    w wVar13 = wVarArr[i27];
                    double[] dArr3 = dArr[i27];
                    int[] iArr2 = nVar3.f18334o;
                    int i28 = 6;
                    float[] fArr = {wVar13.f18389d, wVar13.f18390e, wVar13.f18391f, wVar13.f18392x, wVar13.f18393y, wVar13.f18394z};
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < iArr2.length) {
                        int i31 = iArr2[i29];
                        if (i31 < i28) {
                            dArr3[i30] = fArr[i31];
                            i30++;
                        }
                        i29++;
                        i28 = 6;
                    }
                    dArr2[i27] = wVarArr[i27].f18388c;
                }
                int i32 = 0;
                while (true) {
                    int[] iArr3 = nVar3.f18334o;
                    if (i32 < iArr3.length) {
                        if (iArr3[i32] < 6) {
                            String strI = p031e1.k.i(new StringBuilder(), w.f18377I[nVar3.f18334o[i32]], " [");
                            for (int i33 = 0; i33 < i18; i33++) {
                                StringBuilder sbC = p136t.e.c(strI);
                                sbC.append(dArr[i33][i32]);
                                strI = sbC.toString();
                            }
                        }
                        i32++;
                    } else {
                        nVar3.j = new d[nVar3.f18337r.length + 1];
                        int i34 = 0;
                        while (true) {
                            String[] strArr3 = nVar3.f18337r;
                            if (i34 >= strArr3.length) {
                                nVar3.j[0] = d.c(nVar3.f18325e, dArr2, dArr);
                                if (wVarArr[0].f18378A != -1) {
                                    int[] iArr4 = new int[i18];
                                    double[] dArr4 = new double[i18];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i18, 2);
                                    for (int i35 = 0; i35 < i18; i35++) {
                                        w wVar14 = wVarArr[i35];
                                        iArr4[i35] = wVar14.f18378A;
                                        dArr4[i35] = wVar14.f18388c;
                                        double[] dArr6 = dArr5[i35];
                                        dArr6[0] = wVar14.f18390e;
                                        dArr6[1] = wVar14.f18391f;
                                    }
                                    nVar3.f18330k = new b(iArr4, dArr4, dArr5);
                                }
                                nVar3.f18345z = new HashMap();
                                if (arrayList7 != null) {
                                    for (String str72 : hashSet6) {
                                        f fVarC = f.c(str72);
                                        if (fVarC != null) {
                                            fVarC.f18109b = str72;
                                            nVar3.f18345z.put(str72, fVarC);
                                        }
                                    }
                                    for (AbstractC1062c abstractC1062c6 : arrayList7) {
                                    }
                                    Iterator it7 = nVar3.f18345z.values().iterator();
                                    while (it7.hasNext()) {
                                        ((f) it7.next()).e();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str73 = strArr3[i34];
                            int i36 = 0;
                            int i37 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            while (i36 < i18) {
                                if (wVarArr[i36].f18382E.containsKey(str73)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i18];
                                        B.a aVar5 = (B.a) wVarArr[i36].f18382E.get(str73);
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i18, aVar5 == null ? 0 : aVar5.c());
                                    }
                                    w wVar15 = wVarArr[i36];
                                    dArr7[i37] = wVar15.f18388c;
                                    wVar15.d(str73, dArr8[i37]);
                                    i9 = 1;
                                    i37++;
                                } else {
                                    i9 = 1;
                                }
                                i36 += i9;
                            }
                            i34++;
                            nVar3.j[i34] = d.c(nVar3.f18325e, Arrays.copyOf(dArr7, i37), (double[][]) Arrays.copyOf(dArr8, i37));
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        w wVar = this.f18326f;
        sb.append(wVar.f18390e);
        sb.append(" y: ");
        sb.append(wVar.f18391f);
        sb.append(" end: x: ");
        w wVar2 = this.f18327g;
        sb.append(wVar2.f18390e);
        sb.append(" y: ");
        sb.append(wVar2.f18391f);
        return sb.toString();
    }
}
