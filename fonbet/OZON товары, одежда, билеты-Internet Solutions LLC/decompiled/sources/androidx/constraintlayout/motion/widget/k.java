package androidx.constraintlayout.motion.widget;

import C.o0;
import Hj.C3143a;
import Ij.C3261b;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import h2.AbstractC6784b;
import h2.C6783a;
import h2.C6785c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import o2.C8632a;
import o2.c;
import o2.d;
import o2.e;
import p2.C8834a;
import p2.InterfaceC8835b;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: A, reason: collision with root package name */
    private h[] f41424A;

    /* renamed from: b, reason: collision with root package name */
    View f41433b;

    /* renamed from: c, reason: collision with root package name */
    int f41434c;

    /* renamed from: j, reason: collision with root package name */
    private AbstractC6784b[] f41441j;

    /* renamed from: k, reason: collision with root package name */
    private C6783a f41442k;

    /* renamed from: o, reason: collision with root package name */
    private int[] f41446o;

    /* renamed from: p, reason: collision with root package name */
    private double[] f41447p;

    /* renamed from: q, reason: collision with root package name */
    private double[] f41448q;

    /* renamed from: r, reason: collision with root package name */
    private String[] f41449r;

    /* renamed from: s, reason: collision with root package name */
    private int[] f41450s;

    /* renamed from: x, reason: collision with root package name */
    private HashMap<String, o2.e> f41455x;

    /* renamed from: y, reason: collision with root package name */
    private HashMap<String, o2.d> f41456y;

    /* renamed from: z, reason: collision with root package name */
    private HashMap<String, o2.c> f41457z;

    /* renamed from: a, reason: collision with root package name */
    Rect f41432a = new Rect();

    /* renamed from: d, reason: collision with root package name */
    boolean f41435d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f41436e = -1;

    /* renamed from: f, reason: collision with root package name */
    private l f41437f = new l();

    /* renamed from: g, reason: collision with root package name */
    private l f41438g = new l();

    /* renamed from: h, reason: collision with root package name */
    private i f41439h = new i();

    /* renamed from: i, reason: collision with root package name */
    private i f41440i = new i();

    /* renamed from: l, reason: collision with root package name */
    float f41443l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    float f41444m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    float f41445n = 1.0f;

    /* renamed from: t, reason: collision with root package name */
    private float[] f41451t = new float[4];

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<l> f41452u = new ArrayList<>();

    /* renamed from: v, reason: collision with root package name */
    private float[] f41453v = new float[1];

    /* renamed from: w, reason: collision with root package name */
    private ArrayList<a> f41454w = new ArrayList<>();

    /* renamed from: B, reason: collision with root package name */
    private int f41425B = -1;

    /* renamed from: C, reason: collision with root package name */
    private int f41426C = -1;

    /* renamed from: D, reason: collision with root package name */
    private View f41427D = null;

    /* renamed from: E, reason: collision with root package name */
    private int f41428E = -1;

    /* renamed from: F, reason: collision with root package name */
    private float f41429F = Float.NaN;

    /* renamed from: G, reason: collision with root package name */
    private Interpolator f41430G = null;

    /* renamed from: H, reason: collision with root package name */
    private boolean f41431H = false;

    k(View view) {
        this.f41433b = view;
        this.f41434c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).getClass();
        }
    }

    private float g(float f7, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f41445n;
            if (f12 != 1.0d) {
                float f13 = this.f41444m;
                if (f7 < f13) {
                    f7 = 0.0f;
                }
                if (f7 > f13 && f7 < 1.0d) {
                    f7 = Math.min((f7 - f13) * f12, 1.0f);
                }
            }
        }
        C6785c c6785c = this.f41437f.f41459a;
        Iterator<l> it = this.f41452u.iterator();
        float f14 = Float.NaN;
        while (it.hasNext()) {
            l next = it.next();
            C6785c c6785c2 = next.f41459a;
            if (c6785c2 != null) {
                float f15 = next.f41461c;
                if (f15 < f7) {
                    c6785c = c6785c2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = next.f41461c;
                }
            }
        }
        if (c6785c != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d11 = (f7 - f11) / f16;
            f7 = (((float) c6785c.a(d11)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) c6785c.b(d11);
            }
        }
        return f7;
    }

    private void p(l lVar) {
        lVar.e((int) this.f41433b.getX(), (int) this.f41433b.getY(), this.f41433b.getWidth(), this.f41433b.getHeight());
    }

    static void q(int i11, int i12, int i13, Rect rect, Rect rect2) {
        if (i11 == 1) {
            int i14 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i13 - ((rect.height() + i14) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i11 == 2) {
            int i15 = rect.left + rect.right;
            rect2.left = i12 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i15 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i11 == 3) {
            int i16 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i16 / 2);
            rect2.top = i13 - ((rect.height() + i16) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i11 != 4) {
            return;
        }
        int i17 = rect.left + rect.right;
        rect2.left = i12 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i17 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final void a(a aVar) {
        this.f41454w.add(aVar);
    }

    final void b(ArrayList<a> arrayList) {
        this.f41454w.addAll(arrayList);
    }

    final int c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] f7 = this.f41441j[0].f();
        if (iArr != null) {
            Iterator<l> it = this.f41452u.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                iArr[i11] = it.next().f41473o;
                i11++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < f7.length; i13++) {
            this.f41441j[0].c(f7[i13], this.f41447p);
            this.f41437f.d(f7[i13], this.f41446o, this.f41447p, fArr, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    final void d(float[] fArr, int i11) {
        int i12 = i11;
        float f7 = 1.0f;
        float f11 = 1.0f / (i12 - 1);
        HashMap<String, o2.d> hashMap = this.f41456y;
        o2.d dVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, o2.d> hashMap2 = this.f41456y;
        o2.d dVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, o2.c> hashMap3 = this.f41457z;
        o2.c cVar = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, o2.c> hashMap4 = this.f41457z;
        o2.c cVar2 = hashMap4 != null ? hashMap4.get("translationY") : null;
        int i13 = 0;
        while (i13 < i12) {
            float f12 = i13 * f11;
            float f13 = this.f41445n;
            float f14 = 0.0f;
            if (f13 != f7) {
                float f15 = this.f41444m;
                if (f12 < f15) {
                    f12 = 0.0f;
                }
                if (f12 > f15 && f12 < 1.0d) {
                    f12 = Math.min((f12 - f15) * f13, f7);
                }
            }
            double d11 = f12;
            C6785c c6785c = this.f41437f.f41459a;
            Iterator<l> it = this.f41452u.iterator();
            float f16 = Float.NaN;
            while (it.hasNext()) {
                l next = it.next();
                C6785c c6785c2 = next.f41459a;
                if (c6785c2 != null) {
                    float f17 = next.f41461c;
                    if (f17 < f12) {
                        f14 = f17;
                        c6785c = c6785c2;
                    } else if (Float.isNaN(f16)) {
                        f16 = next.f41461c;
                    }
                }
            }
            if (c6785c != null) {
                if (Float.isNaN(f16)) {
                    f16 = 1.0f;
                }
                d11 = (((float) c6785c.a((f12 - f14) / r16)) * (f16 - f14)) + f14;
            }
            this.f41441j[0].c(d11, this.f41447p);
            C6783a c6783a = this.f41442k;
            if (c6783a != null) {
                double[] dArr = this.f41447p;
                if (dArr.length > 0) {
                    c6783a.c(d11, dArr);
                }
            }
            int i14 = i13 * 2;
            this.f41437f.d(d11, this.f41446o, this.f41447p, fArr, i14);
            if (cVar != null) {
                fArr[i14] = cVar.a(f12) + fArr[i14];
            } else if (dVar != null) {
                fArr[i14] = dVar.a(f12) + fArr[i14];
            }
            if (cVar2 != null) {
                int i15 = i14 + 1;
                fArr[i15] = cVar2.a(f12) + fArr[i15];
            } else if (dVar2 != null) {
                int i16 = i14 + 1;
                fArr[i16] = dVar2.a(f12) + fArr[i16];
            }
            i13++;
            i12 = i11;
            f7 = 1.0f;
        }
    }

    final void e(float f7, float[] fArr) {
        float f11;
        boolean z11 = false;
        this.f41441j[0].c(g(f7, null), this.f41447p);
        int[] iArr = this.f41446o;
        double[] dArr = this.f41447p;
        l lVar = this.f41437f;
        float f12 = lVar.f41463e;
        float f13 = lVar.f41464f;
        float f14 = lVar.f41465g;
        float f15 = lVar.f41466h;
        int i11 = 0;
        while (i11 < iArr.length) {
            boolean z12 = z11;
            l lVar2 = lVar;
            float f16 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f12 = f16;
            } else if (i12 == 2) {
                f13 = f16;
            } else if (i12 == 3) {
                f14 = f16;
            } else if (i12 == 4) {
                f15 = f16;
            }
            i11++;
            z11 = z12;
            lVar = lVar2;
        }
        boolean z13 = z11;
        if (lVar.f41471m != null) {
            double d11 = 0.0f;
            double d12 = f12;
            double d13 = f13;
            f11 = 0.0f;
            float sin = (float) (((Math.sin(d13) * d12) + d11) - (f14 / 2.0f));
            f13 = (float) ((d11 - (Math.cos(d13) * d12)) - (f15 / 2.0f));
            f12 = sin;
        } else {
            f11 = 0.0f;
        }
        float f17 = f14 + f12;
        float f18 = f15 + f13;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        float f19 = f12 + f11;
        float f21 = f13 + f11;
        float f22 = f17 + f11;
        float f23 = f18 + f11;
        fArr[z13 ? 1 : 0] = f19;
        fArr[1] = f21;
        fArr[2] = f22;
        fArr[3] = f21;
        fArr[4] = f22;
        fArr[5] = f23;
        fArr[6] = f19;
        fArr[7] = f23;
    }

    final void f(boolean z11) {
        if (!"button".equals(C8834a.d(this.f41433b)) || this.f41424A == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            h[] hVarArr = this.f41424A;
            if (i11 >= hVarArr.length) {
                return;
            }
            hVarArr[i11].s(this.f41433b, z11 ? -100.0f : 100.0f);
            i11++;
        }
    }

    public final int h() {
        return this.f41437f.f41469k;
    }

    public final void i(double d11, float[] fArr, float[] fArr2) {
        float f7;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f41441j[0].c(d11, dArr);
        this.f41441j[0].e(d11, dArr2);
        float f11 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f41446o;
        l lVar = this.f41437f;
        float f12 = lVar.f41463e;
        float f13 = lVar.f41464f;
        float f14 = lVar.f41465g;
        float f15 = lVar.f41466h;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f19 = (float) dArr[i11];
            float f21 = (float) dArr2[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f12 = f19;
                f11 = f21;
            } else if (i12 == 2) {
                f13 = f19;
                f18 = f21;
            } else if (i12 == 3) {
                f14 = f19;
                f16 = f21;
            } else if (i12 == 4) {
                f15 = f19;
                f17 = f21;
            }
        }
        float f22 = (f16 / 2.0f) + f11;
        float f23 = (f17 / 2.0f) + f18;
        k kVar = lVar.f41471m;
        if (kVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            kVar.i(d11, fArr3, fArr4);
            float f24 = fArr3[0];
            float f25 = fArr3[1];
            float f26 = fArr4[0];
            float f27 = fArr4[1];
            double d12 = f12;
            double d13 = f13;
            float sin = (float) (((Math.sin(d13) * d12) + f24) - (f14 / 2.0f));
            float cos = (float) ((f25 - (Math.cos(d13) * d12)) - (f15 / 2.0f));
            double d14 = f11;
            f7 = 2.0f;
            double d15 = f18;
            float cos2 = (float) ((Math.cos(d13) * d15) + (Math.sin(d13) * d14) + f26);
            f23 = (float) ((Math.sin(d13) * d15) + (f27 - (Math.cos(d13) * d14)));
            f13 = cos;
            f12 = sin;
            f22 = cos2;
        } else {
            f7 = 2.0f;
        }
        fArr[0] = (f14 / f7) + f12 + 0.0f;
        fArr[1] = (f15 / f7) + f13 + 0.0f;
        fArr2[0] = f22;
        fArr2[1] = f23;
    }

    final void j(float f7, float f11, float f12, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.f41453v;
        float g10 = g(f7, fArr2);
        AbstractC6784b[] abstractC6784bArr = this.f41441j;
        int i11 = 0;
        if (abstractC6784bArr == null) {
            l lVar = this.f41438g;
            float f13 = lVar.f41463e;
            l lVar2 = this.f41437f;
            float f14 = f13 - lVar2.f41463e;
            float f15 = lVar.f41464f - lVar2.f41464f;
            float f16 = lVar.f41465g - lVar2.f41465g;
            float f17 = (lVar.f41466h - lVar2.f41466h) + f15;
            fArr[0] = ((f16 + f14) * f11) + ((1.0f - f11) * f14);
            fArr[1] = (f17 * f12) + ((1.0f - f12) * f15);
            return;
        }
        double d11 = g10;
        abstractC6784bArr[0].e(d11, this.f41448q);
        this.f41441j[0].c(d11, this.f41447p);
        float f18 = fArr2[0];
        while (true) {
            dArr = this.f41448q;
            if (i11 >= dArr.length) {
                break;
            }
            dArr[i11] = dArr[i11] * f18;
            i11++;
        }
        C6783a c6783a = this.f41442k;
        if (c6783a == null) {
            int[] iArr = this.f41446o;
            double[] dArr2 = this.f41447p;
            this.f41437f.getClass();
            l.f(f11, f12, fArr, iArr, dArr, dArr2);
            return;
        }
        double[] dArr3 = this.f41447p;
        if (dArr3.length > 0) {
            c6783a.c(d11, dArr3);
            this.f41442k.e(d11, this.f41448q);
            int[] iArr2 = this.f41446o;
            double[] dArr4 = this.f41448q;
            double[] dArr5 = this.f41447p;
            this.f41437f.getClass();
            l.f(f11, f12, fArr, iArr2, dArr4, dArr5);
        }
    }

    public final int k() {
        int i11 = this.f41437f.f41460b;
        Iterator<l> it = this.f41452u.iterator();
        while (it.hasNext()) {
            i11 = Math.max(i11, it.next().f41460b);
        }
        return Math.max(i11, this.f41438g.f41460b);
    }

    public final float l() {
        return this.f41438g.f41463e;
    }

    public final float m() {
        return this.f41438g.f41464f;
    }

    final void n(int i11) {
        this.f41452u.get(i11);
    }

    final boolean o(float f7, long j11, View view, h2.d dVar) {
        boolean z11;
        int i11;
        float f11;
        e.d dVar2;
        double d11;
        float f12;
        double d12;
        float f13;
        float f14;
        float f15;
        float f16;
        double[] dArr;
        View view2 = view;
        e.d dVar3 = null;
        float g10 = g(f7, null);
        int i12 = this.f41428E;
        if (i12 != -1) {
            float f17 = 1.0f / i12;
            float floor = ((float) Math.floor(g10 / f17)) * f17;
            float f18 = (g10 % f17) / f17;
            if (!Float.isNaN(this.f41429F)) {
                f18 = (f18 + this.f41429F) % 1.0f;
            }
            Interpolator interpolator = this.f41430G;
            g10 = ((interpolator != null ? interpolator.getInterpolation(f18) : ((double) f18) > 0.5d ? 1.0f : 0.0f) * f17) + floor;
        }
        float f19 = g10;
        HashMap<String, o2.d> hashMap = this.f41456y;
        if (hashMap != null) {
            Iterator<o2.d> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().g(view2, f19);
            }
        }
        HashMap<String, o2.e> hashMap2 = this.f41455x;
        if (hashMap2 != null) {
            e.d dVar4 = null;
            boolean z12 = false;
            for (o2.e eVar : hashMap2.values()) {
                if (eVar instanceof e.d) {
                    dVar4 = (e.d) eVar;
                } else {
                    View view3 = view2;
                    float f21 = f19;
                    boolean h11 = eVar.h(f21, j11, view3, dVar);
                    f19 = f21;
                    view2 = view3;
                    z12 |= h11;
                }
            }
            dVar3 = dVar4;
            z11 = z12;
        } else {
            z11 = false;
        }
        AbstractC6784b[] abstractC6784bArr = this.f41441j;
        l lVar = this.f41437f;
        if (abstractC6784bArr != null) {
            double d13 = f19;
            abstractC6784bArr[0].c(d13, this.f41447p);
            this.f41441j[0].e(d13, this.f41448q);
            C6783a c6783a = this.f41442k;
            if (c6783a != null) {
                double[] dArr2 = this.f41447p;
                f11 = 1.0f;
                if (dArr2.length > 0) {
                    c6783a.c(d13, dArr2);
                    this.f41442k.e(d13, this.f41448q);
                }
            } else {
                f11 = 1.0f;
            }
            if (this.f41431H) {
                dVar2 = dVar3;
                d11 = d13;
                f12 = 2.0f;
            } else {
                int[] iArr = this.f41446o;
                double[] dArr3 = this.f41447p;
                f12 = 2.0f;
                double[] dArr4 = this.f41448q;
                boolean z13 = this.f41435d;
                float f22 = lVar.f41463e;
                float f23 = lVar.f41464f;
                float f24 = lVar.f41465g;
                int i13 = 1;
                float f25 = lVar.f41466h;
                dVar2 = dVar3;
                if (iArr.length != 0) {
                    f13 = f25;
                    if (lVar.f41474p.length <= iArr[iArr.length - 1]) {
                        int i14 = iArr[iArr.length - 1] + 1;
                        lVar.f41474p = new double[i14];
                        lVar.f41475q = new double[i14];
                    }
                } else {
                    f13 = f25;
                }
                Arrays.fill(lVar.f41474p, Double.NaN);
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    double[] dArr5 = lVar.f41474p;
                    int i16 = iArr[i15];
                    dArr5[i16] = dArr3[i15];
                    lVar.f41475q[i16] = dArr4[i15];
                }
                float f26 = Float.NaN;
                int i17 = 0;
                float f27 = f23;
                float f28 = 0.0f;
                float f29 = 0.0f;
                float f31 = 0.0f;
                float f32 = 0.0f;
                while (true) {
                    double[] dArr6 = lVar.f41474p;
                    f14 = f24;
                    if (i17 >= dArr6.length) {
                        break;
                    }
                    if (Double.isNaN(dArr6[i17])) {
                        dArr = dArr4;
                    } else {
                        dArr = dArr4;
                        float f33 = (float) (Double.isNaN(lVar.f41474p[i17]) ? 0.0d : lVar.f41474p[i17] + 0.0d);
                        float f34 = (float) lVar.f41475q[i17];
                        if (i17 == i13) {
                            f29 = f34;
                            f22 = f33;
                        } else if (i17 == 2) {
                            f28 = f34;
                            f27 = f33;
                        } else if (i17 == 3) {
                            f31 = f34;
                            f14 = f33;
                        } else if (i17 == 4) {
                            f32 = f34;
                            f13 = f33;
                        } else if (i17 == 5) {
                            f26 = f33;
                        }
                    }
                    i17++;
                    dArr4 = dArr;
                    f24 = f14;
                    i13 = 1;
                }
                double[] dArr7 = dArr4;
                k kVar = lVar.f41471m;
                if (kVar != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    kVar.i(d13, fArr, fArr2);
                    float f35 = fArr[0];
                    float f36 = fArr[1];
                    float f37 = fArr2[0];
                    float f38 = fArr2[1];
                    d11 = d13;
                    double d14 = f22;
                    double d15 = f27;
                    f22 = (float) (((Math.sin(d15) * d14) + f35) - (f14 / 2.0f));
                    float cos = (float) ((f36 - (Math.cos(d15) * d14)) - (f13 / 2.0f));
                    double d16 = f29;
                    double d17 = f28;
                    float cos2 = (float) ((Math.cos(d15) * d14 * d17) + (Math.sin(d15) * d16) + f37);
                    float sin = (float) ((Math.sin(d15) * d14 * d17) + (f38 - (Math.cos(d15) * d16)));
                    if (dArr7.length >= 2) {
                        dArr7[0] = cos2;
                        dArr7[1] = sin;
                    }
                    if (!Float.isNaN(f26)) {
                        view2.setRotation((float) (Math.toDegrees(Math.atan2(sin, cos2)) + f26));
                    }
                    f16 = cos;
                } else {
                    d11 = d13;
                    if (Float.isNaN(f26)) {
                        f15 = f27;
                    } else {
                        double d18 = f26;
                        f15 = f27;
                        view2.setRotation((float) (Math.toDegrees(Math.atan2((f32 / 2.0f) + f28, (f31 / 2.0f) + f29)) + d18 + 0.0f));
                    }
                    f16 = f15;
                }
                if (view2 instanceof InterfaceC8835b) {
                    ((InterfaceC8835b) view2).a();
                } else {
                    float f39 = f22 + 0.5f;
                    int i18 = (int) f39;
                    float f41 = f16 + 0.5f;
                    int i19 = (int) f41;
                    int i21 = (int) (f39 + f14);
                    int i22 = (int) (f41 + f13);
                    int i23 = i21 - i18;
                    int i24 = i22 - i19;
                    if (i23 != view2.getMeasuredWidth() || i24 != view2.getMeasuredHeight() || z13) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i23, 1073741824), View.MeasureSpec.makeMeasureSpec(i24, 1073741824));
                    }
                    view2.layout(i18, i19, i21, i22);
                }
                this.f41435d = false;
            }
            if (this.f41426C != -1) {
                if (this.f41427D == null) {
                    this.f41427D = ((View) view2.getParent()).findViewById(this.f41426C);
                }
                if (this.f41427D != null) {
                    float bottom = (this.f41427D.getBottom() + r1.getTop()) / f12;
                    float right = (this.f41427D.getRight() + this.f41427D.getLeft()) / f12;
                    if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
                        view2.setPivotX(right - view2.getLeft());
                        view2.setPivotY(bottom - view2.getTop());
                    }
                }
            }
            HashMap<String, o2.d> hashMap3 = this.f41456y;
            if (hashMap3 != null) {
                for (o2.d dVar5 : hashMap3.values()) {
                    if (dVar5 instanceof d.C1308d) {
                        double[] dArr8 = this.f41448q;
                        if (dArr8.length > 1) {
                            view2.setRotation(((d.C1308d) dVar5).a(f19) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                        }
                    }
                }
            }
            if (dVar2 != null) {
                double[] dArr9 = this.f41448q;
                i11 = 1;
                d12 = d11;
                z11 |= dVar2.i(view2, dVar, f19, j11, dArr9[0], dArr9[1]);
            } else {
                d12 = d11;
                i11 = 1;
            }
            int i25 = i11;
            while (true) {
                AbstractC6784b[] abstractC6784bArr2 = this.f41441j;
                if (i25 >= abstractC6784bArr2.length) {
                    break;
                }
                AbstractC6784b abstractC6784b = abstractC6784bArr2[i25];
                float[] fArr3 = this.f41451t;
                abstractC6784b.d(d12, fArr3);
                C8632a.b(lVar.f41472n.get(this.f41449r[i25 - 1]), view2, fArr3);
                i25++;
            }
            i iVar = this.f41439h;
            if (iVar.f41407b == 0) {
                if (f19 <= 0.0f) {
                    view2.setVisibility(iVar.f41408c);
                } else {
                    i iVar2 = this.f41440i;
                    if (f19 >= f11) {
                        view2.setVisibility(iVar2.f41408c);
                    } else if (iVar2.f41408c != iVar.f41408c) {
                        view2.setVisibility(0);
                    }
                }
            }
            if (this.f41424A != null) {
                int i26 = 0;
                while (true) {
                    h[] hVarArr = this.f41424A;
                    if (i26 >= hVarArr.length) {
                        break;
                    }
                    hVarArr[i26].s(view2, f19);
                    i26++;
                }
            }
        } else {
            i11 = 1;
            float f42 = lVar.f41463e;
            l lVar2 = this.f41438g;
            float d19 = C3143a.d(lVar2.f41463e, f42, f19, f42);
            float f43 = lVar.f41464f;
            float d21 = C3143a.d(lVar2.f41464f, f43, f19, f43);
            float f44 = lVar.f41465g;
            float f45 = lVar2.f41465g;
            float d22 = C3143a.d(f45, f44, f19, f44);
            float f46 = lVar.f41466h;
            float f47 = lVar2.f41466h;
            float f48 = d19 + 0.5f;
            int i27 = (int) f48;
            float f49 = d21 + 0.5f;
            int i28 = (int) f49;
            int i29 = (int) (f48 + d22);
            int d23 = (int) (f49 + C3143a.d(f47, f46, f19, f46));
            int i31 = i29 - i27;
            int i32 = d23 - i28;
            if (f45 != f44 || f47 != f46 || this.f41435d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i31, 1073741824), View.MeasureSpec.makeMeasureSpec(i32, 1073741824));
                this.f41435d = false;
            }
            view2.layout(i27, i28, i29, d23);
        }
        HashMap<String, o2.c> hashMap4 = this.f41457z;
        if (hashMap4 != null) {
            for (o2.c cVar : hashMap4.values()) {
                if (cVar instanceof c.d) {
                    double[] dArr10 = this.f41448q;
                    view2.setRotation(((c.d) cVar).a(f19) + ((float) Math.toDegrees(Math.atan2(dArr10[i11], dArr10[0]))));
                } else {
                    cVar.h(view2, f19);
                }
            }
        }
        return z11;
    }

    final void r(View view) {
        l lVar = this.f41437f;
        lVar.f41461c = 0.0f;
        lVar.f41462d = 0.0f;
        this.f41431H = true;
        lVar.e(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f41438g.e(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f41439h.e(view);
        this.f41440i.e(view);
    }

    final void s(Rect rect, androidx.constraintlayout.widget.d dVar, int i11, int i12) {
        int i13 = dVar.f41703c;
        if (i13 != 0) {
            q(i13, i11, i12, rect, this.f41432a);
            rect = this.f41432a;
        }
        l lVar = this.f41438g;
        lVar.f41461c = 1.0f;
        lVar.f41462d = 1.0f;
        p(lVar);
        lVar.e(rect.left, rect.top, rect.width(), rect.height());
        lVar.a(dVar.L(this.f41434c));
        this.f41440i.d(rect, dVar, i13, this.f41434c);
    }

    public final void t(int i11) {
        this.f41425B = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(" start: x: ");
        l lVar = this.f41437f;
        sb2.append(lVar.f41463e);
        sb2.append(" y: ");
        sb2.append(lVar.f41464f);
        sb2.append(" end: x: ");
        l lVar2 = this.f41438g;
        sb2.append(lVar2.f41463e);
        sb2.append(" y: ");
        sb2.append(lVar2.f41464f);
        return sb2.toString();
    }

    final void u(View view) {
        l lVar = this.f41437f;
        lVar.f41461c = 0.0f;
        lVar.f41462d = 0.0f;
        lVar.e(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f41439h.e(view);
    }

    final void v(Rect rect, androidx.constraintlayout.widget.d dVar, int i11, int i12) {
        int i13 = dVar.f41703c;
        if (i13 != 0) {
            q(i13, i11, i12, rect, this.f41432a);
        }
        l lVar = this.f41437f;
        lVar.f41461c = 0.0f;
        lVar.f41462d = 0.0f;
        p(lVar);
        lVar.e(rect.left, rect.top, rect.width(), rect.height());
        d.a L11 = dVar.L(this.f41434c);
        lVar.a(L11);
        d.c cVar = L11.f41710d;
        this.f41443l = cVar.f41803g;
        this.f41439h.d(rect, dVar, i13, this.f41434c);
        this.f41426C = L11.f41712f.f41824i;
        this.f41428E = cVar.f41806j;
        this.f41429F = cVar.f41805i;
        Context context = this.f41433b.getContext();
        int i14 = cVar.f41808l;
        this.f41430G = i14 != -2 ? i14 != -1 ? i14 != 0 ? i14 != 1 ? i14 != 2 ? i14 != 4 ? i14 != 5 ? null : new OvershootInterpolator() : new BounceInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator() : new j(C6785c.c(cVar.f41807k)) : AnimationUtils.loadInterpolator(context, cVar.f41809m);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0470 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(int i11, int i12) {
        ArrayList arrayList;
        String[] strArr;
        Iterator<String> it;
        char c11;
        int i13;
        HashSet<String> hashSet;
        int i14;
        float[] fArr;
        HashSet<String> hashSet2;
        androidx.constraintlayout.widget.a aVar;
        o2.e g10;
        androidx.constraintlayout.widget.a aVar2;
        Integer num;
        Iterator<String> it2;
        o2.d f7;
        androidx.constraintlayout.widget.a aVar3;
        i iVar;
        ArrayList<a> arrayList2;
        int i15;
        float min;
        float f11;
        int i16 = 0;
        new HashSet();
        HashSet<String> hashSet3 = new HashSet<>();
        HashSet<String> hashSet4 = new HashSet<>();
        HashSet<String> hashSet5 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i17 = this.f41425B;
        l lVar = this.f41437f;
        int i18 = -1;
        if (i17 != -1) {
            lVar.f41468j = i17;
        }
        i iVar2 = this.f41439h;
        i iVar3 = this.f41440i;
        iVar2.c(iVar3, hashSet4);
        ArrayList<a> arrayList3 = this.f41454w;
        l lVar2 = this.f41438g;
        ArrayList<l> arrayList4 = this.f41452u;
        float f12 = Float.NaN;
        if (arrayList3 != null) {
            Iterator<a> it3 = arrayList3.iterator();
            ArrayList arrayList5 = null;
            while (it3.hasNext()) {
                a next = it3.next();
                if (next instanceof e) {
                    e eVar = (e) next;
                    l lVar3 = new l();
                    lVar3.f41460b = i16;
                    lVar3.f41467i = f12;
                    lVar3.f41468j = i18;
                    lVar3.f41469k = i18;
                    lVar3.f41470l = f12;
                    lVar3.f41471m = null;
                    lVar3.f41472n = new LinkedHashMap<>();
                    lVar3.f41473o = i16;
                    lVar3.f41474p = new double[18];
                    lVar3.f41475q = new double[18];
                    if (lVar.f41469k != i18) {
                        float f13 = eVar.f41314a / 100.0f;
                        lVar3.f41461c = f13;
                        lVar3.f41460b = eVar.f41358h;
                        lVar3.f41473o = eVar.f41365o;
                        float f14 = Float.isNaN(eVar.f41359i) ? f13 : eVar.f41359i;
                        float f15 = Float.isNaN(eVar.f41360j) ? f13 : eVar.f41360j;
                        arrayList2 = arrayList3;
                        float f16 = lVar2.f41465g - lVar.f41465g;
                        float f17 = lVar2.f41466h;
                        float f18 = lVar.f41466h;
                        lVar3.f41462d = lVar3.f41461c;
                        lVar3.f41465g = (int) ((f16 * f14) + r13);
                        lVar3.f41466h = (int) (((f17 - f18) * f15) + f18);
                        int i19 = eVar.f41365o;
                        iVar = iVar3;
                        if (i19 == 1) {
                            float f19 = Float.isNaN(eVar.f41361k) ? f13 : eVar.f41361k;
                            float f21 = lVar2.f41463e;
                            float f22 = lVar.f41463e;
                            lVar3.f41463e = C3143a.d(f21, f22, f19, f22);
                            if (!Float.isNaN(eVar.f41362l)) {
                                f13 = eVar.f41362l;
                            }
                            float f23 = lVar2.f41464f;
                            float f24 = lVar.f41464f;
                            lVar3.f41464f = C3143a.d(f23, f24, f13, f24);
                        } else if (i19 != 2) {
                            float f25 = Float.isNaN(eVar.f41361k) ? f13 : eVar.f41361k;
                            float f26 = lVar2.f41463e;
                            float f27 = lVar.f41463e;
                            lVar3.f41463e = C3143a.d(f26, f27, f25, f27);
                            if (!Float.isNaN(eVar.f41362l)) {
                                f13 = eVar.f41362l;
                            }
                            float f28 = lVar2.f41464f;
                            float f29 = lVar.f41464f;
                            lVar3.f41464f = C3143a.d(f28, f29, f13, f29);
                        } else {
                            if (Float.isNaN(eVar.f41361k)) {
                                float f31 = lVar2.f41463e;
                                float f32 = lVar.f41463e;
                                min = C3143a.d(f31, f32, f13, f32);
                            } else {
                                min = Math.min(f15, f14) * eVar.f41361k;
                            }
                            lVar3.f41463e = min;
                            if (Float.isNaN(eVar.f41362l)) {
                                float f33 = lVar2.f41464f;
                                float f34 = lVar.f41464f;
                                f11 = C3143a.d(f33, f34, f13, f34);
                            } else {
                                f11 = eVar.f41362l;
                            }
                            lVar3.f41464f = f11;
                        }
                        lVar3.f41469k = lVar.f41469k;
                        lVar3.f41459a = C6785c.c(eVar.f41356f);
                        lVar3.f41468j = eVar.f41357g;
                    } else {
                        iVar = iVar3;
                        arrayList2 = arrayList3;
                        int i21 = eVar.f41365o;
                        if (i21 == 1) {
                            float f35 = eVar.f41314a / 100.0f;
                            lVar3.f41461c = f35;
                            lVar3.f41460b = eVar.f41358h;
                            float f36 = Float.isNaN(eVar.f41359i) ? f35 : eVar.f41359i;
                            float f37 = Float.isNaN(eVar.f41360j) ? f35 : eVar.f41360j;
                            float f38 = lVar2.f41465g - lVar.f41465g;
                            float f39 = lVar2.f41466h - lVar.f41466h;
                            lVar3.f41462d = lVar3.f41461c;
                            if (!Float.isNaN(eVar.f41361k)) {
                                f35 = eVar.f41361k;
                            }
                            float f41 = (lVar.f41465g / 2.0f) + lVar.f41463e;
                            float f42 = lVar.f41464f;
                            float f43 = lVar.f41466h;
                            float f44 = ((lVar2.f41465g / 2.0f) + lVar2.f41463e) - f41;
                            float f45 = ((lVar2.f41466h / 2.0f) + lVar2.f41464f) - ((f43 / 2.0f) + f42);
                            float f46 = f44 * f35;
                            float f47 = (f36 * f38) / 2.0f;
                            lVar3.f41463e = (int) ((r2 + f46) - f47);
                            float f48 = f35 * f45;
                            float f49 = (f37 * f39) / 2.0f;
                            lVar3.f41464f = (int) ((f42 + f48) - f49);
                            lVar3.f41465g = (int) (r2 + r3);
                            lVar3.f41466h = (int) (f43 + r13);
                            float f51 = Float.isNaN(eVar.f41362l) ? 0.0f : eVar.f41362l;
                            float f52 = (-f45) * f51;
                            float f53 = f44 * f51;
                            lVar3.f41473o = 1;
                            float f54 = (int) ((lVar.f41463e + f46) - f47);
                            float f55 = (int) ((lVar.f41464f + f48) - f49);
                            lVar3.f41463e = f54 + f52;
                            lVar3.f41464f = f55 + f53;
                            lVar3.f41469k = lVar3.f41469k;
                            lVar3.f41459a = C6785c.c(eVar.f41356f);
                            lVar3.f41468j = eVar.f41357g;
                        } else if (i21 != 2) {
                            float f56 = eVar.f41314a / 100.0f;
                            lVar3.f41461c = f56;
                            lVar3.f41460b = eVar.f41358h;
                            float f57 = Float.isNaN(eVar.f41359i) ? f56 : eVar.f41359i;
                            float f58 = Float.isNaN(eVar.f41360j) ? f56 : eVar.f41360j;
                            float f59 = lVar2.f41465g;
                            float f61 = lVar.f41465g;
                            float f62 = f59 - f61;
                            float f63 = lVar2.f41466h;
                            float f64 = lVar.f41466h;
                            float f65 = f63 - f64;
                            lVar3.f41462d = lVar3.f41461c;
                            float f66 = (f61 / 2.0f) + lVar.f41463e;
                            float f67 = lVar.f41464f;
                            float f68 = ((f59 / 2.0f) + lVar2.f41463e) - f66;
                            float f69 = ((f63 / 2.0f) + lVar2.f41464f) - ((f64 / 2.0f) + f67);
                            float f71 = (f62 * f57) / 2.0f;
                            lVar3.f41463e = (int) (((f68 * f56) + r2) - f71);
                            float f72 = (f65 * f58) / 2.0f;
                            lVar3.f41464f = (int) (((f69 * f56) + f67) - f72);
                            lVar3.f41465g = (int) (f61 + r29);
                            lVar3.f41466h = (int) (f64 + r32);
                            float f73 = Float.isNaN(eVar.f41361k) ? f56 : eVar.f41361k;
                            float f74 = Float.isNaN(eVar.f41364n) ? 0.0f : eVar.f41364n;
                            float f75 = f73;
                            float f76 = Float.isNaN(eVar.f41362l) ? f56 : eVar.f41362l;
                            float f77 = Float.isNaN(eVar.f41363m) ? 0.0f : eVar.f41363m;
                            lVar3.f41473o = 0;
                            lVar3.f41463e = (int) (((f77 * f69) + ((f75 * f68) + lVar.f41463e)) - f71);
                            lVar3.f41464f = (int) (((f69 * f76) + ((f68 * f74) + lVar.f41464f)) - f72);
                            lVar3.f41459a = C6785c.c(eVar.f41356f);
                            lVar3.f41468j = eVar.f41357g;
                        } else {
                            float f78 = eVar.f41314a / 100.0f;
                            lVar3.f41461c = f78;
                            lVar3.f41460b = eVar.f41358h;
                            float f79 = Float.isNaN(eVar.f41359i) ? f78 : eVar.f41359i;
                            float f81 = Float.isNaN(eVar.f41360j) ? f78 : eVar.f41360j;
                            float f82 = lVar2.f41465g;
                            float f83 = lVar.f41465g;
                            float f84 = f82 - f83;
                            float f85 = lVar2.f41466h;
                            float f86 = lVar.f41466h;
                            float f87 = f85 - f86;
                            lVar3.f41462d = lVar3.f41461c;
                            float f88 = (f83 / 2.0f) + lVar.f41463e;
                            float f89 = lVar.f41464f;
                            float f91 = (f82 / 2.0f) + lVar2.f41463e;
                            float f92 = ((f85 / 2.0f) + lVar2.f41464f) - ((f86 / 2.0f) + f89);
                            float f93 = f84 * f79;
                            lVar3.f41463e = (int) ((((f91 - f88) * f78) + r2) - (f93 / 2.0f));
                            float f94 = f87 * f81;
                            lVar3.f41464f = (int) (((f92 * f78) + f89) - (f94 / 2.0f));
                            lVar3.f41465g = (int) (f83 + f93);
                            lVar3.f41466h = (int) (f86 + f94);
                            lVar3.f41473o = 2;
                            if (!Float.isNaN(eVar.f41361k)) {
                                lVar3.f41463e = (int) (eVar.f41361k * ((int) (i11 - lVar3.f41465g)));
                            }
                            if (!Float.isNaN(eVar.f41362l)) {
                                lVar3.f41464f = (int) (eVar.f41362l * ((int) (i12 - lVar3.f41466h)));
                            }
                            lVar3.f41469k = lVar3.f41469k;
                            lVar3.f41459a = C6785c.c(eVar.f41356f);
                            lVar3.f41468j = eVar.f41357g;
                        }
                        if (Collections.binarySearch(arrayList4, lVar3) == 0) {
                            Log.e("MotionController", " KeyPath position \"" + lVar3.f41462d + "\" outside of range");
                        }
                        arrayList4.add((-r2) - 1, lVar3);
                        i15 = eVar.f41367e;
                        if (i15 == -1) {
                            this.f41436e = i15;
                        }
                    }
                    if (Collections.binarySearch(arrayList4, lVar3) == 0) {
                    }
                    arrayList4.add((-r2) - 1, lVar3);
                    i15 = eVar.f41367e;
                    if (i15 == -1) {
                    }
                } else {
                    iVar = iVar3;
                    arrayList2 = arrayList3;
                    if (next instanceof c) {
                        next.d(hashSet5);
                    } else if (next instanceof g) {
                        next.d(hashSet3);
                    } else if (next instanceof h) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        ArrayList arrayList6 = arrayList5;
                        arrayList6.add((h) next);
                        arrayList5 = arrayList6;
                    } else {
                        next.f(hashMap);
                        next.d(hashSet4);
                    }
                }
                arrayList3 = arrayList2;
                iVar3 = iVar;
                i16 = 0;
                f12 = Float.NaN;
                i18 = -1;
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        i iVar4 = iVar3;
        ArrayList<a> arrayList7 = arrayList3;
        if (arrayList != null) {
            this.f41424A = (h[]) arrayList.toArray(new h[0]);
        }
        if (!hashSet4.isEmpty()) {
            this.f41456y = new HashMap<>();
            Iterator<String> it4 = hashSet4.iterator();
            while (it4.hasNext()) {
                String next2 = it4.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[1];
                    Iterator<a> it5 = arrayList7.iterator();
                    while (it5.hasNext()) {
                        a next3 = it5.next();
                        Iterator<String> it6 = it4;
                        HashMap<String, androidx.constraintlayout.widget.a> hashMap2 = next3.f41317d;
                        if (hashMap2 != null && (aVar3 = hashMap2.get(str)) != null) {
                            sparseArray.append(next3.f41314a, aVar3);
                        }
                        it4 = it6;
                    }
                    it2 = it4;
                    f7 = o2.d.e(next2, sparseArray);
                } else {
                    it2 = it4;
                    f7 = o2.d.f(next2);
                }
                if (f7 != null) {
                    f7.c(next2);
                    this.f41456y.put(next2, f7);
                }
                it4 = it2;
            }
            if (arrayList7 != null) {
                Iterator<a> it7 = arrayList7.iterator();
                while (it7.hasNext()) {
                    a next4 = it7.next();
                    if (next4 instanceof b) {
                        next4.a(this.f41456y);
                    }
                }
            }
            iVar2.a(this.f41456y, 0);
            iVar4.a(this.f41456y, 100);
            for (String str2 : this.f41456y.keySet()) {
                int intValue = (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) ? 0 : num.intValue();
                o2.d dVar = this.f41456y.get(str2);
                if (dVar != null) {
                    dVar.d(intValue);
                }
            }
        }
        if (!hashSet3.isEmpty()) {
            if (this.f41455x == null) {
                this.f41455x = new HashMap<>();
            }
            Iterator<String> it8 = hashSet3.iterator();
            while (it8.hasNext()) {
                String next5 = it8.next();
                if (!this.f41455x.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<a> it9 = arrayList7.iterator();
                        while (it9.hasNext()) {
                            a next6 = it9.next();
                            HashMap<String, androidx.constraintlayout.widget.a> hashMap3 = next6.f41317d;
                            if (hashMap3 != null && (aVar2 = hashMap3.get(str3)) != null) {
                                sparseArray2.append(next6.f41314a, aVar2);
                            }
                        }
                        g10 = o2.e.f(next5, sparseArray2);
                    } else {
                        g10 = o2.e.g(next5);
                    }
                    if (g10 != null) {
                        g10.c(next5);
                        this.f41455x.put(next5, g10);
                    }
                }
            }
            if (arrayList7 != null) {
                Iterator<a> it10 = arrayList7.iterator();
                while (it10.hasNext()) {
                    a next7 = it10.next();
                    if (next7 instanceof g) {
                        ((g) next7).M(this.f41455x);
                    }
                }
            }
            for (String str4 : this.f41455x.keySet()) {
                this.f41455x.get(str4).d(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        int size = arrayList4.size();
        int i22 = size + 2;
        l[] lVarArr = new l[i22];
        lVarArr[0] = lVar;
        lVarArr[size + 1] = lVar2;
        if (arrayList4.size() > 0 && this.f41436e == -1) {
            this.f41436e = 0;
        }
        Iterator<l> it11 = arrayList4.iterator();
        int i23 = 1;
        while (it11.hasNext()) {
            lVarArr[i23] = it11.next();
            i23++;
        }
        HashSet hashSet6 = new HashSet();
        for (String str5 : lVar2.f41472n.keySet()) {
            if (lVar.f41472n.containsKey(str5)) {
                if (!hashSet4.contains("CUSTOM," + str5)) {
                    hashSet6.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet6.toArray(new String[0]);
        this.f41449r = strArr2;
        this.f41450s = new int[strArr2.length];
        int i24 = 0;
        while (true) {
            strArr = this.f41449r;
            if (i24 >= strArr.length) {
                break;
            }
            String str6 = strArr[i24];
            this.f41450s[i24] = 0;
            int i25 = 0;
            while (true) {
                if (i25 >= i22) {
                    break;
                }
                if (lVarArr[i25].f41472n.containsKey(str6) && (aVar = lVarArr[i25].f41472n.get(str6)) != null) {
                    int[] iArr = this.f41450s;
                    iArr[i24] = aVar.g() + iArr[i24];
                    break;
                }
                i25++;
            }
            i24++;
        }
        boolean z11 = lVarArr[0].f41468j != -1;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i26 = 1; i26 < i22; i26++) {
            lVarArr[i26].c(lVarArr[i26 - 1], zArr, z11);
        }
        int i27 = 0;
        for (int i28 = 1; i28 < length; i28++) {
            if (zArr[i28]) {
                i27++;
            }
        }
        this.f41446o = new int[i27];
        int max = Math.max(2, i27);
        this.f41447p = new double[max];
        this.f41448q = new double[max];
        int i29 = 0;
        for (int i31 = 1; i31 < length; i31++) {
            if (zArr[i31]) {
                this.f41446o[i29] = i31;
                i29++;
            }
        }
        int[] iArr2 = {i22, this.f41446o.length};
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i22];
        int i32 = 0;
        while (i32 < i22) {
            l lVar4 = lVarArr[i32];
            double[] dArr3 = dArr[i32];
            int[] iArr3 = this.f41446o;
            l[] lVarArr2 = lVarArr;
            int i33 = i32;
            float[] fArr2 = {lVar4.f41462d, lVar4.f41463e, lVar4.f41464f, lVar4.f41465g, lVar4.f41466h, lVar4.f41467i};
            int i34 = 0;
            int i35 = 0;
            while (i34 < iArr3.length) {
                if (iArr3[i34] < 6) {
                    fArr = fArr2;
                    hashSet2 = hashSet5;
                    dArr3[i35] = fArr2[r12];
                    i35++;
                } else {
                    fArr = fArr2;
                    hashSet2 = hashSet5;
                }
                i34++;
                hashSet5 = hashSet2;
                fArr2 = fArr;
            }
            dArr2[i33] = lVarArr2[i33].f41461c;
            i32 = i33 + 1;
            hashSet5 = hashSet5;
            lVarArr = lVarArr2;
        }
        l[] lVarArr3 = lVarArr;
        HashSet<String> hashSet7 = hashSet5;
        int i36 = 0;
        while (true) {
            int[] iArr4 = this.f41446o;
            if (i36 >= iArr4.length) {
                break;
            }
            if (iArr4[i36] < 6) {
                String c12 = o0.c(new StringBuilder(), l.f41458r[this.f41446o[i36]], " [");
                for (int i37 = 0; i37 < i22; i37++) {
                    StringBuilder e11 = C3261b.e(c12);
                    e11.append(dArr[i37][i36]);
                    c12 = e11.toString();
                }
            }
            i36++;
        }
        this.f41441j = new AbstractC6784b[this.f41449r.length + 1];
        int i38 = 0;
        while (true) {
            String[] strArr3 = this.f41449r;
            if (i38 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i38];
            int i39 = 0;
            int i41 = 0;
            double[] dArr4 = null;
            double[][] dArr5 = null;
            while (i39 < i22) {
                if (lVarArr3[i39].f41472n.containsKey(str7)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i22];
                        androidx.constraintlayout.widget.a aVar4 = lVarArr3[i39].f41472n.get(str7);
                        dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i22, aVar4 == null ? 0 : aVar4.g());
                    }
                    l lVar5 = lVarArr3[i39];
                    hashSet = hashSet7;
                    dArr4[i41] = lVar5.f41461c;
                    double[] dArr6 = dArr5[i41];
                    androidx.constraintlayout.widget.a aVar5 = lVar5.f41472n.get(str7);
                    if (aVar5 == null) {
                        i13 = i38;
                        i14 = i22;
                    } else {
                        i13 = i38;
                        if (aVar5.g() == 1) {
                            i14 = i22;
                            dArr6[0] = aVar5.d();
                        } else {
                            i14 = i22;
                            int g11 = aVar5.g();
                            float[] fArr3 = new float[g11];
                            aVar5.e(fArr3);
                            int i42 = 0;
                            int i43 = 0;
                            while (i42 < g11) {
                                dArr6[i43] = fArr3[i42];
                                i42++;
                                i43++;
                                g11 = g11;
                                fArr3 = fArr3;
                            }
                        }
                    }
                    i41++;
                } else {
                    i13 = i38;
                    hashSet = hashSet7;
                    i14 = i22;
                }
                i39++;
                i22 = i14;
                i38 = i13;
                hashSet7 = hashSet;
            }
            int i44 = i38 + 1;
            this.f41441j[i44] = AbstractC6784b.a(this.f41436e, Arrays.copyOf(dArr4, i41), (double[][]) Arrays.copyOf(dArr5, i41));
            i38 = i44;
            i22 = i22;
            hashSet7 = hashSet7;
        }
        HashSet<String> hashSet8 = hashSet7;
        int i45 = i22;
        this.f41441j[0] = AbstractC6784b.a(this.f41436e, dArr2, dArr);
        if (lVarArr3[0].f41468j != -1) {
            int[] iArr5 = new int[i45];
            double[] dArr7 = new double[i45];
            double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, i45, 2);
            for (int i46 = 0; i46 < i45; i46++) {
                iArr5[i46] = lVarArr3[i46].f41468j;
                dArr7[i46] = r5.f41461c;
                double[] dArr9 = dArr8[i46];
                dArr9[0] = r5.f41463e;
                dArr9[1] = r5.f41464f;
            }
            this.f41442k = new C6783a(iArr5, dArr7, dArr8);
        }
        this.f41457z = new HashMap<>();
        if (arrayList7 != null) {
            Iterator<String> it12 = hashSet8.iterator();
            float f95 = Float.NaN;
            while (it12.hasNext()) {
                String next8 = it12.next();
                o2.c g12 = o2.c.g(next8);
                if (g12 != null) {
                    if (g12.f64654e == 1 && Float.isNaN(f95)) {
                        float[] fArr4 = new float[2];
                        float f96 = 1.0f / 99;
                        double d11 = 0.0d;
                        float f97 = 0.0f;
                        double d12 = 0.0d;
                        int i47 = 0;
                        while (i47 < 100) {
                            float f98 = i47 * f96;
                            double d13 = d11;
                            double d14 = f98;
                            C6785c c6785c = lVar.f41459a;
                            Iterator<l> it13 = arrayList4.iterator();
                            float f99 = 0.0f;
                            float f100 = Float.NaN;
                            while (it13.hasNext()) {
                                Iterator<String> it14 = it12;
                                l next9 = it13.next();
                                float[] fArr5 = fArr4;
                                C6785c c6785c2 = next9.f41459a;
                                if (c6785c2 != null) {
                                    float f101 = next9.f41461c;
                                    if (f101 < f98) {
                                        f99 = f101;
                                        c6785c = c6785c2;
                                    } else if (Float.isNaN(f100)) {
                                        f100 = next9.f41461c;
                                    }
                                }
                                it12 = it14;
                                fArr4 = fArr5;
                            }
                            Iterator<String> it15 = it12;
                            float[] fArr6 = fArr4;
                            if (c6785c != null) {
                                if (Float.isNaN(f100)) {
                                    f100 = 1.0f;
                                }
                                d14 = (((float) c6785c.a((f98 - f99) / r23)) * (f100 - f99)) + f99;
                            }
                            this.f41441j[0].c(d14, this.f41447p);
                            this.f41437f.d(d14, this.f41446o, this.f41447p, fArr6, 0);
                            if (i47 > 0) {
                                c11 = 0;
                                f97 = (float) (Math.hypot(d13 - fArr6[1], d12 - fArr6[0]) + f97);
                            } else {
                                c11 = 0;
                            }
                            d12 = fArr6[c11];
                            d11 = fArr6[1];
                            i47++;
                            it12 = it15;
                            fArr4 = fArr6;
                        }
                        it = it12;
                        f95 = f97;
                        g12.e(next8);
                        this.f41457z.put(next8, g12);
                        it12 = it;
                    }
                    it = it12;
                    g12.e(next8);
                    this.f41457z.put(next8, g12);
                    it12 = it;
                }
            }
            Iterator<a> it16 = arrayList7.iterator();
            while (it16.hasNext()) {
                a next10 = it16.next();
                if (next10 instanceof c) {
                    ((c) next10).R(this.f41457z);
                }
            }
            Iterator<o2.c> it17 = this.f41457z.values().iterator();
            while (it17.hasNext()) {
                it17.next().f();
            }
        }
    }

    public final void x(k kVar) {
        this.f41437f.g(kVar, kVar.f41437f);
        this.f41438g.g(kVar, kVar.f41438g);
    }
}
