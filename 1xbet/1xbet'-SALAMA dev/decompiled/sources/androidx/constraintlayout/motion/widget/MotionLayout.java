package androidx.constraintlayout.motion.widget;

import B.h;
import B.m;
import C0.A;
import I4.j;
import P.C0350f;
import P.InterfaceC0363t;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.helper.widget.MotionEffect;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.internal.ads.zzbbd;
import com.salamadev.nabilalawadi.kisaskoran.R;
import io.sentry.cache.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p031e1.k;
import p115p6.c;
import p143u.b;
import p143u.e;
import p143u.i;
import p143u.l;
import p155w1.C1009l0;
import p155w1.L;
import p165y.a;
import p169z.AbstractC1062c;
import p169z.B;
import p169z.C;
import p169z.C1060a;
import p169z.D;
import p169z.g;
import p169z.n;
import p169z.o;
import p169z.p;
import p169z.q;
import p169z.r;
import p169z.s;
import p169z.t;
import p169z.u;
import p169z.v;
import p169z.w;
import p169z.x;
import p169z.y;
import p169z.z;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements InterfaceC0363t {

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static boolean f8824Y0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public float f8825A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f8826B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public float f8827C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f8828D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f8829E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f8830F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f8831G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f8832H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f8833I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public z f8834J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f8835J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public o f8836K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public float f8837K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Interpolator f8838L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final e f8839L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f8840M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f8841M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f8842N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public t f8843N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f8844O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public f f8845O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f8846P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final Rect f8847P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f8848Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public boolean f8849Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f8850R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public v f8851R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f8852S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final A f8853S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final HashMap f8854T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public boolean f8855T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f8856U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public final RectF f8857U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f8858V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public View f8859V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float f8860W;
    public Matrix W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public final ArrayList f8861X0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f8862a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f8863b0;
    public float c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f8864d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f8865e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public u f8866f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f8867g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public r f8868h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f8869i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final a f8870j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final q f8871k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public C1060a f8872l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f8873m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f8874n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f8875o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f8876p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f8877q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long f8878r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f8879s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f8880t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ArrayList f8881u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ArrayList f8882v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList f8883w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public CopyOnWriteArrayList f8884x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f8885y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public long f8886z0;

    public MotionLayout(Context context, AttributeSet attributeSet, int i7) {
        z zVar;
        super(context, attributeSet, i7);
        this.f8838L = null;
        this.f8840M = 0.0f;
        this.f8842N = -1;
        this.f8844O = -1;
        this.f8846P = -1;
        this.f8848Q = 0;
        this.f8850R = 0;
        this.f8852S = true;
        this.f8854T = new HashMap();
        this.f8856U = 0L;
        this.f8858V = 1.0f;
        this.f8860W = 0.0f;
        this.f8862a0 = 0.0f;
        this.c0 = 0.0f;
        this.f8865e0 = false;
        this.f8867g0 = 0;
        this.f8869i0 = false;
        a aVar = new a();
        l lVar = new l();
        lVar.f16538k = false;
        aVar.f18102a = lVar;
        aVar.f18104c = lVar;
        this.f8870j0 = aVar;
        this.f8871k0 = new q(this);
        this.f8875o0 = false;
        this.f8880t0 = false;
        this.f8881u0 = null;
        this.f8882v0 = null;
        this.f8883w0 = null;
        this.f8884x0 = null;
        this.f8885y0 = 0;
        this.f8886z0 = -1L;
        this.f8825A0 = 0.0f;
        this.f8826B0 = 0;
        this.f8827C0 = 0.0f;
        this.f8828D0 = false;
        this.f8839L0 = new e(1);
        this.f8841M0 = false;
        this.f8845O0 = null;
        new HashMap();
        this.f8847P0 = new Rect();
        this.f8849Q0 = false;
        this.f8851R0 = v.f18372a;
        this.f8853S0 = new A(this);
        this.f8855T0 = false;
        this.f8857U0 = new RectF();
        this.f8859V0 = null;
        this.W0 = null;
        this.f8861X0 = new ArrayList();
        f8824Y0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, B.q.f946r);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z4 = true;
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == 2) {
                    this.f8834J = new z(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f8844O = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.c0 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f8865e0 = true;
                } else if (index == 0) {
                    z4 = typedArrayObtainStyledAttributes.getBoolean(index, z4);
                } else if (index == 5) {
                    if (this.f8867g0 == 0) {
                        this.f8867g0 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f8867g0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f8834J == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z4) {
                this.f8834J = null;
            }
        }
        if (this.f8867g0 != 0) {
            z zVar2 = this.f8834J;
            if (zVar2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int iH = zVar2.h();
                z zVar3 = this.f8834J;
                m mVarB = zVar3.b(zVar3.h());
                String strF = c.f(iH, getContext());
                int childCount = getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = getChildAt(i9);
                    int id = childAt.getId();
                    if (id == -1) {
                        StringBuilder sbK = k.k("CHECK: ", strF, " ALL VIEWS SHOULD HAVE ID's ");
                        sbK.append(childAt.getClass().getName());
                        sbK.append(" does not!");
                        Log.w("MotionLayout", sbK.toString());
                    }
                    if (mVarB.i(id) == null) {
                        StringBuilder sbK2 = k.k("CHECK: ", strF, " NO CONSTRAINTS for ");
                        sbK2.append(c.g(childAt));
                        Log.w("MotionLayout", sbK2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) mVarB.f912f.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i10 = 0; i10 < length; i10++) {
                    iArr[i10] = numArr[i10].intValue();
                }
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = iArr[i11];
                    String strF2 = c.f(i12, getContext());
                    if (findViewById(iArr[i11]) == null) {
                        Log.w("MotionLayout", "CHECK: " + strF + " NO View matches id " + strF2);
                    }
                    if (mVarB.h(i12).f801e.f837d == -1) {
                        Log.w("MotionLayout", L.j("CHECK: ", strF, "(", strF2, ") no LAYOUT_HEIGHT"));
                    }
                    if (mVarB.h(i12).f801e.f836c == -1) {
                        Log.w("MotionLayout", L.j("CHECK: ", strF, "(", strF2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                for (y yVar : this.f8834J.f18418d) {
                    if (yVar == this.f8834J.f18417c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (yVar.f18401d == yVar.f18400c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i13 = yVar.f18401d;
                    int i14 = yVar.f18400c;
                    String strF3 = c.f(i13, getContext());
                    String strF4 = c.f(i14, getContext());
                    if (sparseIntArray.get(i13) == i14) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strF3 + "->" + strF4);
                    }
                    if (sparseIntArray2.get(i14) == i13) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strF3 + "->" + strF4);
                    }
                    sparseIntArray.put(i13, i14);
                    sparseIntArray2.put(i14, i13);
                    if (this.f8834J.b(i13) == null) {
                        L.n(" no such constraintSetStart ", strF3, "MotionLayout");
                    }
                    if (this.f8834J.b(i14) == null) {
                        L.n(" no such constraintSetEnd ", strF3, "MotionLayout");
                    }
                }
            }
        }
        if (this.f8844O != -1 || (zVar = this.f8834J) == null) {
            return;
        }
        this.f8844O = zVar.h();
        this.f8842N = this.f8834J.h();
        y yVar2 = this.f8834J.f18417c;
        this.f8846P = yVar2 != null ? yVar2.f18400c : -1;
    }

    public static Rect j(MotionLayout motionLayout, p149v.e eVar) {
        motionLayout.getClass();
        int iT = eVar.t();
        Rect rect = motionLayout.f8847P0;
        rect.top = iT;
        rect.left = eVar.s();
        rect.right = eVar.r() + rect.left;
        rect.bottom = eVar.l() + rect.top;
        return rect;
    }

    public final void A(int i7, m mVar) {
        z zVar = this.f8834J;
        if (zVar != null) {
            zVar.f18421g.put(i7, mVar);
        }
        this.f8853S0.k(this.f8834J.b(this.f8842N), this.f8834J.b(this.f8846P));
        u();
        if (this.f8844O == i7) {
            mVar.b(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0314  */
    /* JADX WARN: Code duplicated, block: B:125:0x0322  */
    /* JADX WARN: Code duplicated, block: B:127:0x0328  */
    /* JADX WARN: Code duplicated, block: B:128:0x032c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0332  */
    /* JADX WARN: Code duplicated, block: B:134:0x033f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0345  */
    /* JADX WARN: Code duplicated, block: B:137:0x0348  */
    /* JADX WARN: Code duplicated, block: B:139:0x035c  */
    /* JADX WARN: Code duplicated, block: B:142:0x036c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0371  */
    /* JADX WARN: Code duplicated, block: B:147:0x038f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0399 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x039b  */
    /* JADX WARN: Code duplicated, block: B:151:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:153:0x03b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:209:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0336 A[SYNTHETIC] */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Iterator it;
        int i7;
        Canvas canvas2;
        int i8;
        int i9;
        int i10;
        int i11;
        w wVar;
        Paint paint;
        p165y.k kVar;
        float f7;
        double d7;
        e eVar;
        float f8;
        double d8;
        double dA;
        b bVar;
        int i12;
        p165y.k kVar2;
        double[] dArr;
        float f9;
        e eVar2;
        float f10;
        j jVar;
        ArrayList arrayList;
        Canvas canvas3 = canvas;
        ArrayList arrayList2 = this.f8883w0;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((MotionHelper) it2.next()).getClass();
            }
        }
        int i13 = 0;
        m(false);
        z zVar = this.f8834J;
        if (zVar != null && (jVar = zVar.f18430q) != null && (arrayList = (ArrayList) jVar.f3681e) != null) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((C) it3.next()).a();
            }
            ArrayList arrayList3 = (ArrayList) jVar.f3681e;
            ArrayList arrayList4 = (ArrayList) jVar.f3682f;
            arrayList3.removeAll(arrayList4);
            arrayList4.clear();
            if (((ArrayList) jVar.f3681e).isEmpty()) {
                jVar.f3681e = null;
            }
        }
        super.dispatchDraw(canvas);
        if (this.f8834J == null) {
            return;
        }
        int i14 = 1;
        if ((this.f8867g0 & 1) == 1 && !isInEditMode()) {
            this.f8885y0++;
            long nanoTime = getNanoTime();
            long j = this.f8886z0;
            if (j != -1) {
                long j3 = nanoTime - j;
                if (j3 > 200000000) {
                    this.f8825A0 = ((int) ((this.f8885y0 / (j3 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f8885y0 = 0;
                    this.f8886z0 = nanoTime;
                }
            } else {
                this.f8886z0 = nanoTime;
            }
            Paint paint2 = new Paint();
            paint2.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sbC = p136t.e.c(this.f8825A0 + " fps " + c.h(this.f8842N, this) + " -> ");
            sbC.append(c.h(this.f8846P, this));
            sbC.append(" (progress: ");
            sbC.append(progress);
            sbC.append(" ) state=");
            int i15 = this.f8844O;
            sbC.append(i15 == -1 ? "undefined" : c.h(i15, this));
            String string = sbC.toString();
            paint2.setColor(-16777216);
            canvas3.drawText(string, 11.0f, getHeight() - 29, paint2);
            paint2.setColor(-7864184);
            canvas3.drawText(string, 10.0f, getHeight() - 30, paint2);
        }
        if (this.f8867g0 > 1) {
            if (this.f8868h0 == null) {
                this.f8868h0 = new r(this);
            }
            r rVar = this.f8868h0;
            HashMap map = this.f8854T;
            int iC = this.f8834J.c();
            int i16 = this.f8867g0;
            rVar.getClass();
            if (map != null && map.size() != 0) {
                canvas.save();
                MotionLayout motionLayout = rVar.f18364n;
                boolean zIsInEditMode = motionLayout.isInEditMode();
                Paint paint3 = rVar.f18356e;
                if (!zIsInEditMode && (i16 & 1) == 2) {
                    String str = motionLayout.getContext().getResources().getResourceName(motionLayout.f8846P) + ":" + motionLayout.getProgress();
                    canvas3.drawText(str, 10.0f, motionLayout.getHeight() - 30, rVar.f18359h);
                    canvas3.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint3);
                }
                Iterator it4 = map.values().iterator();
                while (it4.hasNext()) {
                    n nVar = (n) it4.next();
                    int iMax = nVar.f18326f.f18387b;
                    ArrayList<w> arrayList5 = nVar.f18340u;
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        iMax = Math.max(iMax, ((w) it5.next()).f18387b);
                    }
                    int iMax2 = Math.max(iMax, nVar.f18327g.f18387b);
                    if (i16 > 0 && iMax2 == 0) {
                        iMax2 = i14;
                    }
                    if (iMax2 != 0) {
                        float[] fArr = rVar.f18354c;
                        if (fArr != null) {
                            double[] dArrI = nVar.j[i13].i();
                            int[] iArr = rVar.f18353b;
                            if (iArr != null) {
                                Iterator it6 = arrayList5.iterator();
                                int i17 = i13;
                                while (it6.hasNext()) {
                                    iArr[i17] = ((w) it6.next()).f18383F;
                                    i17++;
                                }
                            }
                            int i18 = i13;
                            int i19 = i18;
                            while (i18 < dArrI.length) {
                                nVar.j[i13].e(dArrI[i18], nVar.f18335p);
                                nVar.f18326f.c(dArrI[i18], nVar.f18334o, nVar.f18335p, fArr, i19);
                                i19 += 2;
                                i18++;
                                rVar = rVar;
                                it4 = it4;
                                i13 = 0;
                            }
                            it = it4;
                            i7 = i19 / 2;
                        } else {
                            it = it4;
                            i7 = 0;
                        }
                        rVar.f18361k = i7;
                        if (iMax2 >= 1) {
                            int i20 = iC / 16;
                            float[] fArr2 = rVar.f18352a;
                            if (fArr2 == null || fArr2.length != i20 * 2) {
                                rVar.f18352a = new float[i20 * 2];
                                rVar.f18355d = new Path();
                            }
                            int i21 = rVar.f18363m;
                            float f11 = i21;
                            canvas3.translate(f11, f11);
                            paint3.setColor(1996488704);
                            Paint paint4 = rVar.f18360i;
                            paint4.setColor(1996488704);
                            Paint paint5 = rVar.f18357f;
                            paint5.setColor(1996488704);
                            Paint paint6 = rVar.f18358g;
                            paint6.setColor(1996488704);
                            float[] fArr3 = rVar.f18352a;
                            i9 = iC;
                            float f12 = 1.0f / (i20 - 1);
                            HashMap map2 = nVar.f18344y;
                            i10 = i16;
                            p165y.k kVar3 = map2 == null ? null : (p165y.k) map2.get("translationX");
                            HashMap map3 = nVar.f18344y;
                            p165y.k kVar4 = map3 == null ? null : (p165y.k) map3.get("translationY");
                            HashMap map4 = nVar.f18345z;
                            p165y.f fVar = map4 == null ? null : (p165y.f) map4.get("translationX");
                            HashMap map5 = nVar.f18345z;
                            p165y.f fVar2 = map5 == null ? null : (p165y.f) map5.get("translationY");
                            int i22 = 0;
                            while (true) {
                                wVar = nVar.f18326f;
                                float f13 = Float.NaN;
                                paint = paint5;
                                if (i22 >= i20) {
                                    break;
                                }
                                float fMin = i22 * f12;
                                int i23 = i20;
                                float f14 = nVar.f18333n;
                                if (f14 != 1.0f) {
                                    f7 = f12;
                                    float f15 = nVar.f18332m;
                                    if (fMin < f15) {
                                        fMin = 0.0f;
                                    }
                                    kVar = kVar4;
                                    if (fMin > f15 && fMin < 1.0d) {
                                        fMin = Math.min((fMin - f15) * f14, 1.0f);
                                    }
                                    d7 = fMin;
                                    eVar = wVar.f18386a;
                                    f8 = 0.0f;
                                    for (w wVar2 : arrayList5) {
                                        double d9 = d7;
                                        eVar2 = wVar2.f18386a;
                                        if (eVar2 != null) {
                                            f10 = wVar2.f18388c;
                                            if (f10 < fMin) {
                                                eVar = eVar2;
                                                f8 = f10;
                                            } else if (Float.isNaN(f13)) {
                                                f13 = wVar2.f18388c;
                                            }
                                        }
                                        d7 = d9;
                                    }
                                    d8 = d7;
                                    if (eVar != null) {
                                        if (Float.isNaN(f13)) {
                                            f9 = 1.0f;
                                        } else {
                                            f9 = f13;
                                        }
                                        float f16 = f9 - f8;
                                        dA = (((float) eVar.a((fMin - f8) / f16)) * f16) + f8;
                                    } else {
                                        dA = d8;
                                    }
                                    nVar.j[0].e(dA, nVar.f18335p);
                                    bVar = nVar.f18330k;
                                    if (bVar != null) {
                                        dArr = nVar.f18335p;
                                        if (dArr.length > 0) {
                                            bVar.e(dA, dArr);
                                        }
                                    }
                                    i12 = i22 * 2;
                                    ArrayList arrayList6 = arrayList5;
                                    nVar.f18326f.c(dA, nVar.f18334o, nVar.f18335p, fArr3, i12);
                                    if (fVar != null) {
                                        fArr3[i12] = fVar.a(fMin) + fArr3[i12];
                                    } else if (kVar3 != null) {
                                        fArr3[i12] = kVar3.a(fMin) + fArr3[i12];
                                    }
                                    if (fVar2 != null) {
                                        int i24 = i12 + 1;
                                        fArr3[i24] = fVar2.a(fMin) + fArr3[i24];
                                    } else {
                                        if (kVar != null) {
                                            int i25 = i12 + 1;
                                            kVar2 = kVar;
                                            fArr3[i25] = kVar2.a(fMin) + fArr3[i25];
                                        }
                                        i22++;
                                        kVar4 = kVar2;
                                        paint5 = paint;
                                        i20 = i23;
                                        f12 = f7;
                                        arrayList5 = arrayList6;
                                    }
                                    kVar2 = kVar;
                                    i22++;
                                    kVar4 = kVar2;
                                    paint5 = paint;
                                    i20 = i23;
                                    f12 = f7;
                                    arrayList5 = arrayList6;
                                } else {
                                    kVar = kVar4;
                                    f7 = f12;
                                }
                                d7 = fMin;
                                eVar = wVar.f18386a;
                                f8 = 0.0f;
                                while (r15.hasNext()) {
                                    double d10 = d7;
                                    eVar2 = wVar2.f18386a;
                                    if (eVar2 != null) {
                                        f10 = wVar2.f18388c;
                                        if (f10 < fMin) {
                                            eVar = eVar2;
                                            f8 = f10;
                                        } else if (Float.isNaN(f13)) {
                                            f13 = wVar2.f18388c;
                                        }
                                    }
                                    d7 = d10;
                                }
                                d8 = d7;
                                if (eVar != null) {
                                    if (Float.isNaN(f13)) {
                                        f9 = 1.0f;
                                    } else {
                                        f9 = f13;
                                    }
                                    float f17 = f9 - f8;
                                    dA = (((float) eVar.a((fMin - f8) / f17)) * f17) + f8;
                                } else {
                                    dA = d8;
                                }
                                nVar.j[0].e(dA, nVar.f18335p);
                                bVar = nVar.f18330k;
                                if (bVar != null) {
                                    dArr = nVar.f18335p;
                                    if (dArr.length > 0) {
                                        bVar.e(dA, dArr);
                                    }
                                }
                                i12 = i22 * 2;
                                ArrayList arrayList7 = arrayList5;
                                nVar.f18326f.c(dA, nVar.f18334o, nVar.f18335p, fArr3, i12);
                                if (fVar != null) {
                                    fArr3[i12] = fVar.a(fMin) + fArr3[i12];
                                } else if (kVar3 != null) {
                                    fArr3[i12] = kVar3.a(fMin) + fArr3[i12];
                                }
                                if (fVar2 != null) {
                                    int i26 = i12 + 1;
                                    fArr3[i26] = fVar2.a(fMin) + fArr3[i26];
                                } else {
                                    if (kVar != null) {
                                        int i27 = i12 + 1;
                                        kVar2 = kVar;
                                        fArr3[i27] = kVar2.a(fMin) + fArr3[i27];
                                    }
                                    i22++;
                                    kVar4 = kVar2;
                                    paint5 = paint;
                                    i20 = i23;
                                    f12 = f7;
                                    arrayList5 = arrayList7;
                                }
                                kVar2 = kVar;
                                i22++;
                                kVar4 = kVar2;
                                paint5 = paint;
                                i20 = i23;
                                f12 = f7;
                                arrayList5 = arrayList7;
                            }
                            rVar.a(canvas, iMax2, rVar.f18361k, nVar);
                            paint3.setColor(-21965);
                            paint.setColor(-2067046);
                            paint4.setColor(-2067046);
                            paint6.setColor(-13391360);
                            float f18 = -i21;
                            canvas.translate(f18, f18);
                            rVar.a(canvas, iMax2, rVar.f18361k, nVar);
                            if (iMax2 == 5) {
                                rVar.f18355d.reset();
                                for (int i28 = 0; i28 <= 50; i28++) {
                                    nVar.j[0].e(nVar.b(null, i28 / 50), nVar.f18335p);
                                    int[] iArr2 = nVar.f18334o;
                                    double[] dArr2 = nVar.f18335p;
                                    float f19 = wVar.f18390e;
                                    float f20 = wVar.f18391f;
                                    float f21 = wVar.f18392x;
                                    float f22 = wVar.f18393y;
                                    float f23 = f21;
                                    float fCos = f20;
                                    float f24 = f19;
                                    for (int i29 = 0; i29 < iArr2.length; i29++) {
                                        float f25 = (float) dArr2[i29];
                                        int i30 = iArr2[i29];
                                        if (i30 == 1) {
                                            f24 = f25;
                                        } else if (i30 == 2) {
                                            fCos = f25;
                                        } else if (i30 == 3) {
                                            f23 = f25;
                                        } else if (i30 == 4) {
                                            f22 = f25;
                                        }
                                    }
                                    if (wVar.f18381D != null) {
                                        double d11 = 0.0f;
                                        double d12 = f24;
                                        double d13 = fCos;
                                        float fSin = (float) (((Math.sin(d13) * d12) + d11) - ((double) (f23 / 2.0f)));
                                        fCos = (float) ((d11 - (Math.cos(d13) * d12)) - ((double) (f22 / 2.0f)));
                                        f24 = fSin;
                                    }
                                    float f26 = f23 + f24;
                                    float f27 = f22 + fCos;
                                    Float.isNaN(Float.NaN);
                                    Float.isNaN(Float.NaN);
                                    float f28 = f24 + 0.0f;
                                    float f29 = fCos + 0.0f;
                                    float f30 = f26 + 0.0f;
                                    float f31 = f27 + 0.0f;
                                    float[] fArr4 = rVar.j;
                                    fArr4[0] = f28;
                                    fArr4[1] = f29;
                                    fArr4[2] = f30;
                                    fArr4[3] = f29;
                                    fArr4[4] = f30;
                                    fArr4[5] = f31;
                                    fArr4[6] = f28;
                                    fArr4[7] = f31;
                                    rVar.f18355d.moveTo(f28, f29);
                                    rVar.f18355d.lineTo(fArr4[2], fArr4[3]);
                                    rVar.f18355d.lineTo(fArr4[4], fArr4[5]);
                                    rVar.f18355d.lineTo(fArr4[6], fArr4[7]);
                                    rVar.f18355d.close();
                                }
                                i11 = 0;
                                i8 = 1;
                                paint3.setColor(1140850688);
                                canvas2 = canvas;
                                canvas2.translate(2.0f, 2.0f);
                                canvas2.drawPath(rVar.f18355d, paint3);
                                canvas2.translate(-2.0f, -2.0f);
                                paint3.setColor(-65536);
                                canvas2.drawPath(rVar.f18355d, paint3);
                            } else {
                                canvas2 = canvas;
                                i11 = 0;
                                i8 = 1;
                            }
                            canvas3 = canvas2;
                            i13 = i11;
                            i14 = i8;
                            iC = i9;
                            it4 = it;
                            i16 = i10;
                        } else {
                            canvas2 = canvas3;
                            i8 = 1;
                            i9 = iC;
                            i10 = i16;
                            i11 = 0;
                        }
                        canvas3 = canvas2;
                        i13 = i11;
                        i14 = i8;
                        iC = i9;
                        it4 = it;
                        i16 = i10;
                    }
                }
                canvas.restore();
            }
        }
        ArrayList arrayList8 = this.f8883w0;
        if (arrayList8 != null) {
            Iterator it7 = arrayList8.iterator();
            while (it7.hasNext()) {
                ((MotionHelper) it7.next()).getClass();
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void f(int i7) {
        this.f9000B = null;
    }

    public int[] getConstraintSetIds() {
        z zVar = this.f8834J;
        if (zVar == null) {
            return null;
        }
        SparseArray sparseArray = zVar.f18421g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = sparseArray.keyAt(i7);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f8844O;
    }

    public ArrayList<y> getDefinedTransitions() {
        z zVar = this.f8834J;
        if (zVar == null) {
            return null;
        }
        return zVar.f18418d;
    }

    public C1060a getDesignTool() {
        if (this.f8872l0 == null) {
            this.f8872l0 = new C1060a();
        }
        return this.f8872l0;
    }

    public int getEndState() {
        return this.f8846P;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f8862a0;
    }

    public z getScene() {
        return this.f8834J;
    }

    public int getStartState() {
        return this.f8842N;
    }

    public float getTargetPosition() {
        return this.c0;
    }

    public Bundle getTransitionState() {
        if (this.f8843N0 == null) {
            this.f8843N0 = new t(this);
        }
        t tVar = this.f8843N0;
        MotionLayout motionLayout = tVar.f18371e;
        tVar.f18370d = motionLayout.f8846P;
        tVar.f18369c = motionLayout.f8842N;
        tVar.f18368b = motionLayout.getVelocity();
        tVar.f18367a = motionLayout.getProgress();
        t tVar2 = this.f8843N0;
        tVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", tVar2.f18367a);
        bundle.putFloat("motion.velocity", tVar2.f18368b);
        bundle.putInt("motion.StartState", tVar2.f18369c);
        bundle.putInt("motion.EndState", tVar2.f18370d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        z zVar = this.f8834J;
        if (zVar != null) {
            this.f8858V = zVar.c() / 1000.0f;
        }
        return (long) (this.f8858V * 1000.0f);
    }

    public float getVelocity() {
        return this.f8840M;
    }

    public final void k(float f7) {
        z zVar = this.f8834J;
        if (zVar == null) {
            return;
        }
        float f8 = this.f8862a0;
        float f9 = this.f8860W;
        if (f8 != f9 && this.f8864d0) {
            this.f8862a0 = f9;
        }
        float f10 = this.f8862a0;
        if (f10 == f7) {
            return;
        }
        this.f8869i0 = false;
        this.c0 = f7;
        this.f8858V = zVar.c() / 1000.0f;
        setProgress(this.c0);
        this.f8836K = null;
        this.f8838L = this.f8834J.e();
        this.f8864d0 = false;
        this.f8856U = getNanoTime();
        this.f8865e0 = true;
        this.f8860W = f10;
        this.f8862a0 = f10;
        invalidate();
    }

    public final void l() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            n nVar = (n) this.f8854T.get(getChildAt(i7));
            if (nVar != null) {
                "button".equals(c.g(nVar.f18322b));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0186  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:127:0x01da  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:146:0x0214  */
    /* JADX WARN: Code duplicated, block: B:62:0x00db A[PHI: r3
      0x00db: PHI (r3v16 float) = (r3v15 float), (r3v17 float), (r3v17 float) binds: [B:47:0x00a9, B:58:0x00cf, B:60:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0106  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0142  */
    /* JADX WARN: Code duplicated, block: B:91:0x0144  */
    /* JADX WARN: Code duplicated, block: B:94:0x014c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0163  */
    /* JADX WARN: Code duplicated, block: B:99:0x0171  */
    public final void m(boolean z4) {
        boolean z7;
        char c3;
        v vVar;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i7;
        int i8;
        int i9;
        int i10;
        View childAt;
        n nVar;
        boolean z8;
        if (this.f8863b0 == -1) {
            this.f8863b0 = getNanoTime();
        }
        float f7 = this.f8862a0;
        if (f7 > 0.0f && f7 < 1.0f) {
            this.f8844O = -1;
        }
        boolean z9 = false;
        if (this.f8880t0 || (this.f8865e0 && (z4 || this.c0 != f7))) {
            float fSignum = Math.signum(this.c0 - f7);
            long nanoTime2 = getNanoTime();
            o oVar = this.f8836K;
            float f8 = oVar == null ? (((nanoTime2 - this.f8863b0) * fSignum) * 1.0E-9f) / this.f8858V : 0.0f;
            float f9 = this.f8862a0 + f8;
            if (this.f8864d0) {
                f9 = this.c0;
            }
            if ((fSignum <= 0.0f || f9 < this.c0) && (fSignum > 0.0f || f9 > this.c0)) {
                z7 = false;
            } else {
                f9 = this.c0;
                this.f8865e0 = false;
                z7 = true;
            }
            this.f8862a0 = f9;
            this.f8860W = f9;
            this.f8863b0 = nanoTime2;
            if (oVar == null || z7) {
                this.f8840M = f8;
            } else {
                if (this.f8869i0) {
                    float interpolation2 = oVar.getInterpolation((nanoTime2 - this.f8856U) * 1.0E-9f);
                    o oVar2 = this.f8836K;
                    a aVar = this.f8870j0;
                    c3 = oVar2 == aVar ? aVar.f18104c.a() ? (char) 2 : (char) 1 : (char) 0;
                    this.f8862a0 = interpolation2;
                    this.f8863b0 = nanoTime2;
                    o oVar3 = this.f8836K;
                    if (oVar3 != null) {
                        float fA = oVar3.a();
                        this.f8840M = fA;
                        if (Math.abs(fA) * this.f8858V <= 1.0E-5f && c3 == 2) {
                            this.f8865e0 = false;
                        }
                        if (fA > 0.0f && interpolation2 >= 1.0f) {
                            this.f8862a0 = 1.0f;
                            this.f8865e0 = false;
                            interpolation2 = 1.0f;
                        }
                        if (fA >= 0.0f || interpolation2 > 0.0f) {
                            f9 = interpolation2;
                        } else {
                            this.f8862a0 = 0.0f;
                            this.f8865e0 = false;
                            f9 = 0.0f;
                        }
                    } else {
                        f9 = interpolation2;
                    }
                } else {
                    float interpolation3 = oVar.getInterpolation(f9);
                    o oVar4 = this.f8836K;
                    if (oVar4 != null) {
                        this.f8840M = oVar4.a();
                    } else {
                        this.f8840M = ((oVar4.getInterpolation(f9 + f8) - interpolation3) * fSignum) / f8;
                    }
                    f9 = interpolation3;
                }
                if (Math.abs(this.f8840M) > 1.0E-5f) {
                    setState(v.f18374c);
                }
                vVar = v.f18375d;
                if (c3 != 1) {
                    if ((fSignum <= 0.0f && f9 >= this.c0) || (fSignum <= 0.0f && f9 <= this.c0)) {
                        f9 = this.c0;
                        this.f8865e0 = false;
                    }
                    if (f9 < 1.0f || f9 <= 0.0f) {
                        this.f8865e0 = false;
                        setState(vVar);
                    }
                }
                childCount = getChildCount();
                this.f8880t0 = false;
                nanoTime = getNanoTime();
                this.f8837K0 = f9;
                interpolator = this.f8838L;
                if (interpolator == null) {
                    interpolation = f9;
                } else {
                    interpolation = interpolator.getInterpolation(f9);
                }
                interpolator2 = this.f8838L;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.f8858V) + f9);
                    this.f8840M = interpolation4;
                    this.f8840M = interpolation4 - this.f8838L.getInterpolation(f9);
                }
                for (i7 = 0; i7 < childCount; i7++) {
                    childAt = getChildAt(i7);
                    nVar = (n) this.f8854T.get(childAt);
                    if (nVar != null) {
                        this.f8880t0 = nVar.e(interpolation, nanoTime, childAt, this.f8839L0) | this.f8880t0;
                    }
                }
                boolean z10 = (fSignum <= 0.0f && f9 >= this.c0) || (fSignum <= 0.0f && f9 <= this.c0);
                if (!this.f8880t0 && !this.f8865e0 && z10) {
                    setState(vVar);
                }
                if (this.f8828D0) {
                    requestLayout();
                }
                this.f8880t0 = (!z10) | this.f8880t0;
                if (f9 <= 0.0f || (i10 = this.f8842N) == -1 || this.f8844O == i10) {
                    z9 = false;
                } else {
                    this.f8844O = i10;
                    this.f8834J.b(i10).a(this);
                    setState(vVar);
                    z9 = true;
                }
                if (f9 >= 1.0d) {
                    i8 = this.f8844O;
                    i9 = this.f8846P;
                    if (i8 != i9) {
                        this.f8844O = i9;
                        this.f8834J.b(i9).a(this);
                        setState(vVar);
                        z9 = true;
                    }
                }
                if (!this.f8880t0 || this.f8865e0) {
                    invalidate();
                } else if ((fSignum > 0.0f && f9 == 1.0f) || (fSignum < 0.0f && f9 == 0.0f)) {
                    setState(vVar);
                }
                if (!this.f8880t0 && !this.f8865e0 && ((fSignum > 0.0f && f9 == 1.0f) || (fSignum < 0.0f && f9 == 0.0f))) {
                    s();
                }
            }
            c3 = 0;
            if (Math.abs(this.f8840M) > 1.0E-5f) {
                setState(v.f18374c);
            }
            vVar = v.f18375d;
            if (c3 != 1) {
                if (fSignum <= 0.0f) {
                    f9 = this.c0;
                    this.f8865e0 = false;
                } else {
                    f9 = this.c0;
                    this.f8865e0 = false;
                }
                if (f9 < 1.0f) {
                    this.f8865e0 = false;
                    setState(vVar);
                } else {
                    this.f8865e0 = false;
                    setState(vVar);
                }
            }
            childCount = getChildCount();
            this.f8880t0 = false;
            nanoTime = getNanoTime();
            this.f8837K0 = f9;
            interpolator = this.f8838L;
            if (interpolator == null) {
                interpolation = f9;
            } else {
                interpolation = interpolator.getInterpolation(f9);
            }
            interpolator2 = this.f8838L;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.f8858V) + f9);
                this.f8840M = interpolation5;
                this.f8840M = interpolation5 - this.f8838L.getInterpolation(f9);
            }
            while (i7 < childCount) {
                childAt = getChildAt(i7);
                nVar = (n) this.f8854T.get(childAt);
                if (nVar != null) {
                    this.f8880t0 = nVar.e(interpolation, nanoTime, childAt, this.f8839L0) | this.f8880t0;
                }
            }
            if (fSignum <= 0.0f) {
            }
            if (!this.f8880t0) {
                setState(vVar);
            }
            if (this.f8828D0) {
                requestLayout();
            }
            this.f8880t0 = (!z10) | this.f8880t0;
            if (f9 <= 0.0f) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (f9 >= 1.0d) {
                i8 = this.f8844O;
                i9 = this.f8846P;
                if (i8 != i9) {
                    this.f8844O = i9;
                    this.f8834J.b(i9).a(this);
                    setState(vVar);
                    z9 = true;
                }
            }
            if (this.f8880t0) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.f8880t0) {
                s();
            }
        }
        float f10 = this.f8862a0;
        if (f10 < 1.0f) {
            if (f10 <= 0.0f) {
                int i11 = this.f8844O;
                int i12 = this.f8842N;
                z8 = i11 == i12 ? z9 : true;
                this.f8844O = i12;
            }
            this.f8855T0 |= z9;
            if (z9 && !this.f8841M0) {
                requestLayout();
            }
            this.f8860W = this.f8862a0;
        }
        int i13 = this.f8844O;
        int i14 = this.f8846P;
        z8 = i13 == i14 ? z9 : true;
        this.f8844O = i14;
        z9 = z8;
        this.f8855T0 |= z9;
        if (z9) {
            requestLayout();
        }
        this.f8860W = this.f8862a0;
    }

    public final void n() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        if ((this.f8866f0 == null && ((copyOnWriteArrayList2 = this.f8884x0) == null || copyOnWriteArrayList2.isEmpty())) || this.f8827C0 == this.f8860W) {
            return;
        }
        if (this.f8826B0 != -1 && (copyOnWriteArrayList = this.f8884x0) != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((u) it.next()).getClass();
            }
        }
        this.f8826B0 = -1;
        this.f8827C0 = this.f8860W;
        CopyOnWriteArrayList copyOnWriteArrayList3 = this.f8884x0;
        if (copyOnWriteArrayList3 != null) {
            Iterator it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                ((u) it2.next()).getClass();
            }
        }
    }

    public final void o() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.f8866f0 != null || ((copyOnWriteArrayList = this.f8884x0) != null && !copyOnWriteArrayList.isEmpty())) && this.f8826B0 == -1) {
            this.f8826B0 = this.f8844O;
            ArrayList arrayList = this.f8861X0;
            int iIntValue = !arrayList.isEmpty() ? ((Integer) arrayList.get(arrayList.size() - 1)).intValue() : -1;
            int i7 = this.f8844O;
            if (iIntValue != i7 && i7 != -1) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        t();
        f fVar = this.f8845O0;
        if (fVar != null) {
            fVar.run();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        y yVar;
        int i7;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        z zVar = this.f8834J;
        if (zVar != null && (i7 = this.f8844O) != -1) {
            m mVarB = zVar.b(i7);
            z zVar2 = this.f8834J;
            int i8 = 0;
            loop0: while (true) {
                SparseArray sparseArray = zVar2.f18421g;
                if (i8 >= sparseArray.size()) {
                    break;
                }
                int iKeyAt = sparseArray.keyAt(i8);
                SparseIntArray sparseIntArray = zVar2.f18423i;
                int i9 = sparseIntArray.get(iKeyAt);
                int size = sparseIntArray.size();
                while (true) {
                    if (i9 > 0) {
                        if (i9 != iKeyAt) {
                            int i10 = size - 1;
                            if (size >= 0) {
                                i9 = sparseIntArray.get(i9);
                                size = i10;
                            }
                        }
                        Log.e("MotionScene", "Cannot be derived from yourself");
                        break loop0;
                    }
                    zVar2.m(iKeyAt, this);
                    i8++;
                }
            }
            ArrayList arrayList = this.f8883w0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((MotionHelper) it.next()).getClass();
                }
            }
            if (mVarB != null) {
                mVarB.b(this);
            }
            this.f8842N = this.f8844O;
        }
        s();
        t tVar = this.f8843N0;
        if (tVar != null) {
            if (this.f8849Q0) {
                post(new p(this, 1));
                return;
            } else {
                tVar.a();
                return;
            }
        }
        z zVar3 = this.f8834J;
        if (zVar3 == null || (yVar = zVar3.f18417c) == null || yVar.f18410n != 4) {
            return;
        }
        k(1.0f);
        this.f8845O0 = null;
        setState(v.f18373b);
        setState(v.f18374c);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0278  */
    /* JADX WARN: Code duplicated, block: B:102:0x027b  */
    /* JADX WARN: Code duplicated, block: B:103:0x027e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0286  */
    /* JADX WARN: Code duplicated, block: B:107:0x028c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0292  */
    /* JADX WARN: Code duplicated, block: B:109:0x0298  */
    /* JADX WARN: Code duplicated, block: B:110:0x029e  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:114:0x02da  */
    /* JADX WARN: Code duplicated, block: B:116:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:119:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:129:0x030d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0311  */
    /* JADX WARN: Code duplicated, block: B:137:0x0338  */
    /* JADX WARN: Code duplicated, block: B:143:0x035e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0362  */
    /* JADX WARN: Code duplicated, block: B:149:0x0387  */
    /* JADX WARN: Code duplicated, block: B:152:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:155:0x03c8 A[LOOP:7: B:153:0x03c2->B:155:0x03c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:209:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:71:0x0113  */
    /* JADX WARN: Code duplicated, block: B:74:0x011d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:78:0x0182  */
    /* JADX WARN: Code duplicated, block: B:79:0x0184  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x0242  */
    /* JADX WARN: Code duplicated, block: B:89:0x0267  */
    /* JADX WARN: Code duplicated, block: B:91:0x026a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x026c  */
    /* JADX WARN: Code duplicated, block: B:94:0x026f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0272  */
    /* JADX WARN: Code duplicated, block: B:98:0x0275  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        B b7;
        int i7;
        RectF rectFB;
        MotionLayout motionLayout;
        int currentState;
        D d7;
        boolean z4;
        int i8;
        View[] viewArr;
        int i9;
        g gVar;
        h hVar;
        HashMap map;
        h hVarI;
        y yVar;
        int i10;
        int id;
        g gVar2;
        Iterator it;
        B.g gVar3;
        h hVar2;
        int i11;
        z zVar;
        m mVarB;
        h hVarI2;
        B.g gVar4;
        View view;
        n nVar;
        float alpha;
        float alpha2;
        ArrayList arrayList;
        Context context;
        int i12;
        char c3;
        Interpolator interpolatorLoadInterpolator;
        Interpolator accelerateDecelerateInterpolator;
        z zVar2 = this.f8834J;
        if (zVar2 == null || !this.f8852S) {
            return false;
        }
        j jVar = zVar2.f18430q;
        if (jVar != null && (currentState = (motionLayout = (MotionLayout) jVar.f3678b).getCurrentState()) != -1) {
            HashSet hashSet = (HashSet) jVar.f3679c;
            ArrayList<D> arrayList2 = (ArrayList) jVar.f3680d;
            if (hashSet == null) {
                jVar.f3679c = new HashSet();
                for (D d8 : arrayList2) {
                    int childCount = motionLayout.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = motionLayout.getChildAt(i13);
                        if (d8.a(childAt)) {
                            childAt.getId();
                            ((HashSet) jVar.f3679c).add(childAt);
                        }
                    }
                }
            }
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList arrayList3 = (ArrayList) jVar.f3681e;
            boolean z7 = true;
            int i14 = 2;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (C c4 : (ArrayList) jVar.f3681e) {
                    if (action != 1) {
                        if (action != 2) {
                            c4.getClass();
                        } else {
                            View view2 = c4.f18235c.f18322b;
                            Rect rect2 = c4.f18243l;
                            view2.getHitRect(rect2);
                            if (!rect2.contains((int) x4, (int) y4) && !c4.f18240h) {
                                c4.b();
                            }
                        }
                    } else if (!c4.f18240h) {
                        c4.b();
                    }
                }
            }
            if (action == 0 || action == 1) {
                z zVar3 = motionLayout.f8834J;
                m mVarB2 = zVar3 == null ? null : zVar3.b(currentState);
                for (D d9 : arrayList2) {
                    int i15 = d9.f18246b;
                    if (i15 == z7) {
                        if (action == 0) {
                            for (View view3 : (HashSet) jVar.f3679c) {
                                if (d9.a(view3)) {
                                    view3.getHitRect(rect);
                                    if (rect.contains((int) x4, (int) y4)) {
                                        viewArr = new View[]{view3};
                                        if (d9.f18247c) {
                                            d7 = d9;
                                            z4 = z7;
                                            i8 = action;
                                        } else {
                                            i9 = d9.f18249e;
                                            gVar = d9.f18250f;
                                            if (i9 == i14) {
                                                view = viewArr[0];
                                                nVar = new n(view);
                                                w wVar = nVar.f18326f;
                                                wVar.f18388c = 0.0f;
                                                wVar.f18389d = 0.0f;
                                                nVar.f18320G = z7;
                                                int i16 = action;
                                                wVar.f(view.getX(), view.getY(), view.getWidth(), view.getHeight());
                                                nVar.f18327g.f(view.getX(), view.getY(), view.getWidth(), view.getHeight());
                                                p169z.l lVar = nVar.f18328h;
                                                lVar.getClass();
                                                view.getX();
                                                view.getY();
                                                view.getWidth();
                                                view.getHeight();
                                                lVar.f18305c = view.getVisibility();
                                                if (view.getVisibility() != 0) {
                                                    alpha = 0.0f;
                                                } else {
                                                    alpha = view.getAlpha();
                                                }
                                                lVar.f18303a = alpha;
                                                lVar.f18306d = view.getElevation();
                                                lVar.f18307e = view.getRotation();
                                                lVar.f18308f = view.getRotationX();
                                                lVar.f18309x = view.getRotationY();
                                                lVar.f18310y = view.getScaleX();
                                                lVar.f18311z = view.getScaleY();
                                                lVar.f18295A = view.getPivotX();
                                                lVar.f18296B = view.getPivotY();
                                                lVar.f18297C = view.getTranslationX();
                                                lVar.f18298D = view.getTranslationY();
                                                lVar.f18299E = view.getTranslationZ();
                                                p169z.l lVar2 = nVar.f18329i;
                                                lVar2.getClass();
                                                view.getX();
                                                view.getY();
                                                view.getWidth();
                                                view.getHeight();
                                                lVar2.f18305c = view.getVisibility();
                                                if (view.getVisibility() != 0) {
                                                    alpha2 = 0.0f;
                                                } else {
                                                    alpha2 = view.getAlpha();
                                                }
                                                lVar2.f18303a = alpha2;
                                                lVar2.f18306d = view.getElevation();
                                                lVar2.f18307e = view.getRotation();
                                                lVar2.f18308f = view.getRotationX();
                                                lVar2.f18309x = view.getRotationY();
                                                lVar2.f18310y = view.getScaleX();
                                                lVar2.f18311z = view.getScaleY();
                                                lVar2.f18295A = view.getPivotX();
                                                lVar2.f18296B = view.getPivotY();
                                                lVar2.f18297C = view.getTranslationX();
                                                lVar2.f18298D = view.getTranslationY();
                                                lVar2.f18299E = view.getTranslationZ();
                                                arrayList = (ArrayList) gVar.f18285a.get(-1);
                                                if (arrayList != null) {
                                                    nVar.f18342w.addAll(arrayList);
                                                }
                                                nVar.h(motionLayout.getWidth(), System.nanoTime(), motionLayout.getHeight());
                                                int i17 = d9.f18252h;
                                                int i18 = d9.f18253i;
                                                int i19 = d9.f18246b;
                                                context = motionLayout.getContext();
                                                i12 = d9.f18255l;
                                                if (i12 != -2) {
                                                    if (i12 != -1) {
                                                        if (i12 == 0) {
                                                            accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
                                                        } else if (i12 == 1) {
                                                            accelerateDecelerateInterpolator = new AccelerateInterpolator();
                                                        } else if (i12 == 2) {
                                                            accelerateDecelerateInterpolator = new DecelerateInterpolator();
                                                        } else if (i12 == 4) {
                                                            accelerateDecelerateInterpolator = new BounceInterpolator();
                                                        } else if (i12 == 5) {
                                                            accelerateDecelerateInterpolator = new OvershootInterpolator();
                                                        } else if (i12 != 6) {
                                                            c3 = 2;
                                                            interpolatorLoadInterpolator = null;
                                                        } else {
                                                            accelerateDecelerateInterpolator = new AnticipateInterpolator();
                                                        }
                                                        interpolatorLoadInterpolator = accelerateDecelerateInterpolator;
                                                    } else {
                                                        interpolatorLoadInterpolator = new p169z.m(e.d(d9.f18256m), 2);
                                                    }
                                                    c3 = 2;
                                                } else {
                                                    c3 = 2;
                                                    interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, d9.f18257n);
                                                }
                                                j jVar2 = jVar;
                                                d7 = d9;
                                                z4 = true;
                                                i8 = i16;
                                                new C(jVar2, nVar, i17, i18, i19, interpolatorLoadInterpolator, d9.f18259p, d9.f18260q);
                                            } else {
                                                d7 = d9;
                                                z4 = z7;
                                                i8 = action;
                                                hVar = d7.f18251g;
                                                if (i9 == z4) {
                                                    for (int i20 : motionLayout.getConstraintSetIds()) {
                                                        if (i20 != currentState) {
                                                            zVar = motionLayout.f8834J;
                                                            if (zVar == null) {
                                                                mVarB = null;
                                                            } else {
                                                                mVarB = zVar.b(i20);
                                                            }
                                                            hVarI2 = mVarB.i(viewArr[0].getId());
                                                            if (hVar != null) {
                                                                gVar4 = hVar.f804h;
                                                                if (gVar4 != null) {
                                                                    gVar4.e(hVarI2);
                                                                }
                                                                hVarI2.f803g.putAll(hVar.f803g);
                                                            }
                                                        }
                                                    }
                                                }
                                                m mVar = new m();
                                                map = mVar.f912f;
                                                map.clear();
                                                for (Integer num : mVarB2.f912f.keySet()) {
                                                    hVar2 = (h) mVarB2.f912f.get(num);
                                                    if (hVar2 != null) {
                                                        map.put(num, hVar2.clone());
                                                    }
                                                }
                                                hVarI = mVar.i(viewArr[0].getId());
                                                if (hVar != null) {
                                                    gVar3 = hVar.f804h;
                                                    if (gVar3 != null) {
                                                        gVar3.e(hVarI);
                                                    }
                                                    hVarI.f803g.putAll(hVar.f803g);
                                                }
                                                motionLayout.A(currentState, mVar);
                                                motionLayout.A(R.id.view_transition, mVarB2);
                                                motionLayout.w(R.id.view_transition);
                                                yVar = new y(motionLayout.f8834J, currentState);
                                                View view4 = viewArr[0];
                                                i10 = d7.f18252h;
                                                if (i10 != -1) {
                                                    yVar.f18405h = Math.max(i10, 8);
                                                }
                                                yVar.f18412p = d7.f18248d;
                                                int i21 = d7.f18255l;
                                                String str = d7.f18256m;
                                                int i22 = d7.f18257n;
                                                yVar.f18402e = i21;
                                                yVar.f18403f = str;
                                                yVar.f18404g = i22;
                                                id = view4.getId();
                                                if (gVar != null) {
                                                    ArrayList arrayList4 = (ArrayList) gVar.f18285a.get(-1);
                                                    gVar2 = new g();
                                                    gVar2.f18285a = new HashMap();
                                                    it = arrayList4.iterator();
                                                    while (it.hasNext()) {
                                                        AbstractC1062c abstractC1062cA = ((AbstractC1062c) it.next()).clone();
                                                        abstractC1062cA.f18266b = id;
                                                        gVar2.b(abstractC1062cA);
                                                    }
                                                    yVar.f18407k.add(gVar2);
                                                }
                                                motionLayout.setTransition(yVar);
                                                f fVar = new f(11, d7, viewArr);
                                                motionLayout.k(1.0f);
                                                motionLayout.f8845O0 = fVar;
                                            }
                                        }
                                    } else {
                                        d7 = d9;
                                        z4 = z7;
                                        i8 = action;
                                    }
                                    d9 = d7;
                                    z7 = z4;
                                    y4 = y4;
                                    jVar = jVar;
                                    action = i8;
                                    rect = rect;
                                    i14 = 2;
                                }
                            }
                        }
                    } else if (i15 == i14) {
                        if (action == z7) {
                            while (r18.hasNext()) {
                                if (d9.a(view3)) {
                                    view3.getHitRect(rect);
                                    if (rect.contains((int) x4, (int) y4)) {
                                        viewArr = new View[]{view3};
                                        if (d9.f18247c) {
                                            d7 = d9;
                                            z4 = z7;
                                            i8 = action;
                                        } else {
                                            i9 = d9.f18249e;
                                            gVar = d9.f18250f;
                                            if (i9 == i14) {
                                                view = viewArr[0];
                                                nVar = new n(view);
                                                w wVar2 = nVar.f18326f;
                                                wVar2.f18388c = 0.0f;
                                                wVar2.f18389d = 0.0f;
                                                nVar.f18320G = z7;
                                                int i110 = action;
                                                wVar2.f(view.getX(), view.getY(), view.getWidth(), view.getHeight());
                                                nVar.f18327g.f(view.getX(), view.getY(), view.getWidth(), view.getHeight());
                                                p169z.l lVar3 = nVar.f18328h;
                                                lVar3.getClass();
                                                view.getX();
                                                view.getY();
                                                view.getWidth();
                                                view.getHeight();
                                                lVar3.f18305c = view.getVisibility();
                                                if (view.getVisibility() != 0) {
                                                    alpha = 0.0f;
                                                } else {
                                                    alpha = view.getAlpha();
                                                }
                                                lVar3.f18303a = alpha;
                                                lVar3.f18306d = view.getElevation();
                                                lVar3.f18307e = view.getRotation();
                                                lVar3.f18308f = view.getRotationX();
                                                lVar3.f18309x = view.getRotationY();
                                                lVar3.f18310y = view.getScaleX();
                                                lVar3.f18311z = view.getScaleY();
                                                lVar3.f18295A = view.getPivotX();
                                                lVar3.f18296B = view.getPivotY();
                                                lVar3.f18297C = view.getTranslationX();
                                                lVar3.f18298D = view.getTranslationY();
                                                lVar3.f18299E = view.getTranslationZ();
                                                p169z.l lVar4 = nVar.f18329i;
                                                lVar4.getClass();
                                                view.getX();
                                                view.getY();
                                                view.getWidth();
                                                view.getHeight();
                                                lVar4.f18305c = view.getVisibility();
                                                if (view.getVisibility() != 0) {
                                                    alpha2 = 0.0f;
                                                } else {
                                                    alpha2 = view.getAlpha();
                                                }
                                                lVar4.f18303a = alpha2;
                                                lVar4.f18306d = view.getElevation();
                                                lVar4.f18307e = view.getRotation();
                                                lVar4.f18308f = view.getRotationX();
                                                lVar4.f18309x = view.getRotationY();
                                                lVar4.f18310y = view.getScaleX();
                                                lVar4.f18311z = view.getScaleY();
                                                lVar4.f18295A = view.getPivotX();
                                                lVar4.f18296B = view.getPivotY();
                                                lVar4.f18297C = view.getTranslationX();
                                                lVar4.f18298D = view.getTranslationY();
                                                lVar4.f18299E = view.getTranslationZ();
                                                arrayList = (ArrayList) gVar.f18285a.get(-1);
                                                if (arrayList != null) {
                                                    nVar.f18342w.addAll(arrayList);
                                                }
                                                nVar.h(motionLayout.getWidth(), System.nanoTime(), motionLayout.getHeight());
                                                int i111 = d9.f18252h;
                                                int i112 = d9.f18253i;
                                                int i113 = d9.f18246b;
                                                context = motionLayout.getContext();
                                                i12 = d9.f18255l;
                                                if (i12 != -2) {
                                                    if (i12 != -1) {
                                                        if (i12 == 0) {
                                                            accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
                                                        } else if (i12 == 1) {
                                                            accelerateDecelerateInterpolator = new AccelerateInterpolator();
                                                        } else if (i12 == 2) {
                                                            accelerateDecelerateInterpolator = new DecelerateInterpolator();
                                                        } else if (i12 == 4) {
                                                            accelerateDecelerateInterpolator = new BounceInterpolator();
                                                        } else if (i12 == 5) {
                                                            accelerateDecelerateInterpolator = new OvershootInterpolator();
                                                        } else if (i12 != 6) {
                                                            c3 = 2;
                                                            interpolatorLoadInterpolator = null;
                                                        } else {
                                                            accelerateDecelerateInterpolator = new AnticipateInterpolator();
                                                        }
                                                        interpolatorLoadInterpolator = accelerateDecelerateInterpolator;
                                                    } else {
                                                        interpolatorLoadInterpolator = new p169z.m(e.d(d9.f18256m), 2);
                                                    }
                                                    c3 = 2;
                                                } else {
                                                    c3 = 2;
                                                    interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, d9.f18257n);
                                                }
                                                j jVar3 = jVar;
                                                d7 = d9;
                                                z4 = true;
                                                i8 = i110;
                                                new C(jVar3, nVar, i111, i112, i113, interpolatorLoadInterpolator, d9.f18259p, d9.f18260q);
                                            } else {
                                                d7 = d9;
                                                z4 = z7;
                                                i8 = action;
                                                hVar = d7.f18251g;
                                                if (i9 == z4) {
                                                    while (i11 < r5.length) {
                                                        if (i20 != currentState) {
                                                            zVar = motionLayout.f8834J;
                                                            if (zVar == null) {
                                                                mVarB = null;
                                                            } else {
                                                                mVarB = zVar.b(i20);
                                                            }
                                                            hVarI2 = mVarB.i(viewArr[0].getId());
                                                            if (hVar != null) {
                                                                gVar4 = hVar.f804h;
                                                                if (gVar4 != null) {
                                                                    gVar4.e(hVarI2);
                                                                }
                                                                hVarI2.f803g.putAll(hVar.f803g);
                                                            }
                                                        }
                                                    }
                                                }
                                                m mVar2 = new m();
                                                map = mVar2.f912f;
                                                map.clear();
                                                while (r9.hasNext()) {
                                                    hVar2 = (h) mVarB2.f912f.get(num);
                                                    if (hVar2 != null) {
                                                        map.put(num, hVar2.clone());
                                                    }
                                                }
                                                hVarI = mVar2.i(viewArr[0].getId());
                                                if (hVar != null) {
                                                    gVar3 = hVar.f804h;
                                                    if (gVar3 != null) {
                                                        gVar3.e(hVarI);
                                                    }
                                                    hVarI.f803g.putAll(hVar.f803g);
                                                }
                                                motionLayout.A(currentState, mVar2);
                                                motionLayout.A(R.id.view_transition, mVarB2);
                                                motionLayout.w(R.id.view_transition);
                                                yVar = new y(motionLayout.f8834J, currentState);
                                                View view5 = viewArr[0];
                                                i10 = d7.f18252h;
                                                if (i10 != -1) {
                                                    yVar.f18405h = Math.max(i10, 8);
                                                }
                                                yVar.f18412p = d7.f18248d;
                                                int i23 = d7.f18255l;
                                                String str2 = d7.f18256m;
                                                int i24 = d7.f18257n;
                                                yVar.f18402e = i23;
                                                yVar.f18403f = str2;
                                                yVar.f18404g = i24;
                                                id = view5.getId();
                                                if (gVar != null) {
                                                    ArrayList arrayList5 = (ArrayList) gVar.f18285a.get(-1);
                                                    gVar2 = new g();
                                                    gVar2.f18285a = new HashMap();
                                                    it = arrayList5.iterator();
                                                    while (it.hasNext()) {
                                                        AbstractC1062c abstractC1062cA2 = ((AbstractC1062c) it.next()).clone();
                                                        abstractC1062cA2.f18266b = id;
                                                        gVar2.b(abstractC1062cA2);
                                                    }
                                                    yVar.f18407k.add(gVar2);
                                                }
                                                motionLayout.setTransition(yVar);
                                                f fVar2 = new f(11, d7, viewArr);
                                                motionLayout.k(1.0f);
                                                motionLayout.f8845O0 = fVar2;
                                            }
                                        }
                                    } else {
                                        d7 = d9;
                                        z4 = z7;
                                        i8 = action;
                                    }
                                    d9 = d7;
                                    z7 = z4;
                                    y4 = y4;
                                    jVar = jVar;
                                    action = i8;
                                    rect = rect;
                                    i14 = 2;
                                }
                            }
                        }
                    } else if (i15 == 3 && action == 0) {
                        while (r18.hasNext()) {
                            if (d9.a(view3)) {
                                view3.getHitRect(rect);
                                if (rect.contains((int) x4, (int) y4)) {
                                    viewArr = new View[]{view3};
                                    if (d9.f18247c) {
                                        d7 = d9;
                                        z4 = z7;
                                        i8 = action;
                                    } else {
                                        i9 = d9.f18249e;
                                        gVar = d9.f18250f;
                                        if (i9 == i14) {
                                            view = viewArr[0];
                                            nVar = new n(view);
                                            w wVar3 = nVar.f18326f;
                                            wVar3.f18388c = 0.0f;
                                            wVar3.f18389d = 0.0f;
                                            nVar.f18320G = z7;
                                            int i114 = action;
                                            wVar3.f(view.getX(), view.getY(), view.getWidth(), view.getHeight());
                                            nVar.f18327g.f(view.getX(), view.getY(), view.getWidth(), view.getHeight());
                                            p169z.l lVar5 = nVar.f18328h;
                                            lVar5.getClass();
                                            view.getX();
                                            view.getY();
                                            view.getWidth();
                                            view.getHeight();
                                            lVar5.f18305c = view.getVisibility();
                                            if (view.getVisibility() != 0) {
                                                alpha = 0.0f;
                                            } else {
                                                alpha = view.getAlpha();
                                            }
                                            lVar5.f18303a = alpha;
                                            lVar5.f18306d = view.getElevation();
                                            lVar5.f18307e = view.getRotation();
                                            lVar5.f18308f = view.getRotationX();
                                            lVar5.f18309x = view.getRotationY();
                                            lVar5.f18310y = view.getScaleX();
                                            lVar5.f18311z = view.getScaleY();
                                            lVar5.f18295A = view.getPivotX();
                                            lVar5.f18296B = view.getPivotY();
                                            lVar5.f18297C = view.getTranslationX();
                                            lVar5.f18298D = view.getTranslationY();
                                            lVar5.f18299E = view.getTranslationZ();
                                            p169z.l lVar6 = nVar.f18329i;
                                            lVar6.getClass();
                                            view.getX();
                                            view.getY();
                                            view.getWidth();
                                            view.getHeight();
                                            lVar6.f18305c = view.getVisibility();
                                            if (view.getVisibility() != 0) {
                                                alpha2 = 0.0f;
                                            } else {
                                                alpha2 = view.getAlpha();
                                            }
                                            lVar6.f18303a = alpha2;
                                            lVar6.f18306d = view.getElevation();
                                            lVar6.f18307e = view.getRotation();
                                            lVar6.f18308f = view.getRotationX();
                                            lVar6.f18309x = view.getRotationY();
                                            lVar6.f18310y = view.getScaleX();
                                            lVar6.f18311z = view.getScaleY();
                                            lVar6.f18295A = view.getPivotX();
                                            lVar6.f18296B = view.getPivotY();
                                            lVar6.f18297C = view.getTranslationX();
                                            lVar6.f18298D = view.getTranslationY();
                                            lVar6.f18299E = view.getTranslationZ();
                                            arrayList = (ArrayList) gVar.f18285a.get(-1);
                                            if (arrayList != null) {
                                                nVar.f18342w.addAll(arrayList);
                                            }
                                            nVar.h(motionLayout.getWidth(), System.nanoTime(), motionLayout.getHeight());
                                            int i115 = d9.f18252h;
                                            int i116 = d9.f18253i;
                                            int i117 = d9.f18246b;
                                            context = motionLayout.getContext();
                                            i12 = d9.f18255l;
                                            if (i12 != -2) {
                                                if (i12 != -1) {
                                                    if (i12 == 0) {
                                                        accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
                                                    } else if (i12 == 1) {
                                                        accelerateDecelerateInterpolator = new AccelerateInterpolator();
                                                    } else if (i12 == 2) {
                                                        accelerateDecelerateInterpolator = new DecelerateInterpolator();
                                                    } else if (i12 == 4) {
                                                        accelerateDecelerateInterpolator = new BounceInterpolator();
                                                    } else if (i12 == 5) {
                                                        accelerateDecelerateInterpolator = new OvershootInterpolator();
                                                    } else if (i12 != 6) {
                                                        c3 = 2;
                                                        interpolatorLoadInterpolator = null;
                                                    } else {
                                                        accelerateDecelerateInterpolator = new AnticipateInterpolator();
                                                    }
                                                    interpolatorLoadInterpolator = accelerateDecelerateInterpolator;
                                                } else {
                                                    interpolatorLoadInterpolator = new p169z.m(e.d(d9.f18256m), 2);
                                                }
                                                c3 = 2;
                                            } else {
                                                c3 = 2;
                                                interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, d9.f18257n);
                                            }
                                            j jVar4 = jVar;
                                            d7 = d9;
                                            z4 = true;
                                            i8 = i114;
                                            new C(jVar4, nVar, i115, i116, i117, interpolatorLoadInterpolator, d9.f18259p, d9.f18260q);
                                        } else {
                                            d7 = d9;
                                            z4 = z7;
                                            i8 = action;
                                            hVar = d7.f18251g;
                                            if (i9 == z4) {
                                                while (i11 < r5.length) {
                                                    if (i20 != currentState) {
                                                        zVar = motionLayout.f8834J;
                                                        if (zVar == null) {
                                                            mVarB = null;
                                                        } else {
                                                            mVarB = zVar.b(i20);
                                                        }
                                                        hVarI2 = mVarB.i(viewArr[0].getId());
                                                        if (hVar != null) {
                                                            gVar4 = hVar.f804h;
                                                            if (gVar4 != null) {
                                                                gVar4.e(hVarI2);
                                                            }
                                                            hVarI2.f803g.putAll(hVar.f803g);
                                                        }
                                                    }
                                                }
                                            }
                                            m mVar3 = new m();
                                            map = mVar3.f912f;
                                            map.clear();
                                            while (r9.hasNext()) {
                                                hVar2 = (h) mVarB2.f912f.get(num);
                                                if (hVar2 != null) {
                                                    map.put(num, hVar2.clone());
                                                }
                                            }
                                            hVarI = mVar3.i(viewArr[0].getId());
                                            if (hVar != null) {
                                                gVar3 = hVar.f804h;
                                                if (gVar3 != null) {
                                                    gVar3.e(hVarI);
                                                }
                                                hVarI.f803g.putAll(hVar.f803g);
                                            }
                                            motionLayout.A(currentState, mVar3);
                                            motionLayout.A(R.id.view_transition, mVarB2);
                                            motionLayout.w(R.id.view_transition);
                                            yVar = new y(motionLayout.f8834J, currentState);
                                            View view6 = viewArr[0];
                                            i10 = d7.f18252h;
                                            if (i10 != -1) {
                                                yVar.f18405h = Math.max(i10, 8);
                                            }
                                            yVar.f18412p = d7.f18248d;
                                            int i25 = d7.f18255l;
                                            String str3 = d7.f18256m;
                                            int i26 = d7.f18257n;
                                            yVar.f18402e = i25;
                                            yVar.f18403f = str3;
                                            yVar.f18404g = i26;
                                            id = view6.getId();
                                            if (gVar != null) {
                                                ArrayList arrayList6 = (ArrayList) gVar.f18285a.get(-1);
                                                gVar2 = new g();
                                                gVar2.f18285a = new HashMap();
                                                it = arrayList6.iterator();
                                                while (it.hasNext()) {
                                                    AbstractC1062c abstractC1062cA3 = ((AbstractC1062c) it.next()).clone();
                                                    abstractC1062cA3.f18266b = id;
                                                    gVar2.b(abstractC1062cA3);
                                                }
                                                yVar.f18407k.add(gVar2);
                                            }
                                            motionLayout.setTransition(yVar);
                                            f fVar3 = new f(11, d7, viewArr);
                                            motionLayout.k(1.0f);
                                            motionLayout.f8845O0 = fVar3;
                                        }
                                    }
                                } else {
                                    d7 = d9;
                                    z4 = z7;
                                    i8 = action;
                                }
                                d9 = d7;
                                z7 = z4;
                                y4 = y4;
                                jVar = jVar;
                                action = i8;
                                rect = rect;
                                i14 = 2;
                            }
                        }
                    }
                    z7 = z7;
                    y4 = y4;
                    jVar = jVar;
                    action = action;
                    rect = rect;
                    i14 = 2;
                }
            }
        }
        y yVar2 = this.f8834J.f18417c;
        if (yVar2 != null && !yVar2.f18411o && (b7 = yVar2.f18408l) != null && ((motionEvent.getAction() != 0 || (rectFB = b7.b(this, new RectF())) == null || rectFB.contains(motionEvent.getX(), motionEvent.getY())) && (i7 = b7.f18212e) != -1)) {
            View view7 = this.f8859V0;
            if (view7 == null || view7.getId() != i7) {
                this.f8859V0 = findViewById(i7);
            }
            View view8 = this.f8859V0;
            if (view8 != null) {
                RectF rectF = this.f8857U0;
                rectF.set(view8.getLeft(), this.f8859V0.getTop(), this.f8859V0.getRight(), this.f8859V0.getBottom());
                if (rectF.contains(motionEvent.getX(), motionEvent.getY()) && !r(this.f8859V0.getLeft(), this.f8859V0.getTop(), this.f8859V0, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        this.f8841M0 = true;
        try {
            if (this.f8834J == null) {
                super.onLayout(z4, i7, i8, i9, i10);
                return;
            }
            int i11 = i9 - i7;
            int i12 = i10 - i8;
            if (this.f8873m0 != i11 || this.f8874n0 != i12) {
                u();
                m(true);
            }
            this.f8873m0 = i11;
            this.f8874n0 = i12;
        } finally {
            this.f8841M0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        boolean z4;
        if (this.f8834J == null) {
            super.onMeasure(i7, i8);
            return;
        }
        boolean z7 = true;
        boolean z8 = (this.f8848Q == i7 && this.f8850R == i8) ? false : true;
        if (this.f8855T0) {
            this.f8855T0 = false;
            s();
            t();
            z8 = true;
        }
        if (this.f9014y) {
            z8 = true;
        }
        this.f8848Q = i7;
        this.f8850R = i8;
        int iH = this.f8834J.h();
        y yVar = this.f8834J.f18417c;
        int i9 = yVar == null ? -1 : yVar.f18400c;
        p149v.f fVar = this.f9009c;
        A a2 = this.f8853S0;
        if ((!z8 && iH == a2.f1211a && i9 == a2.f1212b) || this.f8842N == -1) {
            if (z8) {
                super.onMeasure(i7, i8);
            }
            z4 = true;
        } else {
            super.onMeasure(i7, i8);
            a2.k(this.f8834J.b(iH), this.f8834J.b(i9));
            a2.l();
            a2.f1211a = iH;
            a2.f1212b = i9;
            z4 = false;
        }
        if (this.f8828D0 || z4) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iR = fVar.r() + getPaddingRight() + getPaddingLeft();
            int iL = fVar.l() + paddingBottom;
            int i10 = this.f8833I0;
            if (i10 == Integer.MIN_VALUE || i10 == 0) {
                int i11 = this.f8829E0;
                iR = (int) ((this.f8837K0 * (this.f8831G0 - i11)) + i11);
                requestLayout();
            }
            int i12 = this.f8835J0;
            if (i12 == Integer.MIN_VALUE || i12 == 0) {
                int i13 = this.f8830F0;
                iL = (int) ((this.f8837K0 * (this.f8832H0 - i13)) + i13);
                requestLayout();
            }
            setMeasuredDimension(iR, iL);
        }
        float fSignum = Math.signum(this.c0 - this.f8862a0);
        long nanoTime = getNanoTime();
        o oVar = this.f8836K;
        float interpolation = this.f8862a0 + (!(oVar instanceof a) ? (((nanoTime - this.f8863b0) * fSignum) * 1.0E-9f) / this.f8858V : 0.0f);
        if (this.f8864d0) {
            interpolation = this.c0;
        }
        if ((fSignum <= 0.0f || interpolation < this.c0) && (fSignum > 0.0f || interpolation > this.c0)) {
            z7 = false;
        } else {
            interpolation = this.c0;
        }
        if (oVar != null && !z7) {
            interpolation = this.f8869i0 ? oVar.getInterpolation((nanoTime - this.f8856U) * 1.0E-9f) : oVar.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.c0) || (fSignum <= 0.0f && interpolation <= this.c0)) {
            interpolation = this.c0;
        }
        this.f8837K0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.f8838L;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            n nVar = (n) this.f8854T.get(childAt);
            if (nVar != null) {
                nVar.e(interpolation, nanoTime2, childAt, this.f8839L0);
            }
        }
        if (this.f8828D0) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f8, boolean z4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f8) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // P.InterfaceC0362s
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr, int i9) {
        y yVar;
        boolean z4;
        ?? r7;
        B b7;
        float f7;
        B b8;
        B b9;
        B b10;
        int i10;
        z zVar = this.f8834J;
        if (zVar == null || (yVar = zVar.f18417c) == null || (z4 = yVar.f18411o)) {
            return;
        }
        int i11 = -1;
        if (z4 || (b10 = yVar.f18408l) == null || (i10 = b10.f18212e) == -1 || view.getId() == i10) {
            y yVar2 = zVar.f18417c;
            if ((yVar2 == null || (b9 = yVar2.f18408l) == null) ? false : b9.f18227u) {
                B b11 = yVar.f18408l;
                if (b11 != null && (b11.f18229w & 4) != 0) {
                    i11 = i8;
                }
                float f8 = this.f8860W;
                if ((f8 == 1.0f || f8 == 0.0f) && view.canScrollVertically(i11)) {
                    return;
                }
            }
            B b12 = yVar.f18408l;
            if (b12 != null && (b12.f18229w & 1) != 0) {
                float f9 = i7;
                float f10 = i8;
                y yVar3 = zVar.f18417c;
                if (yVar3 == null || (b8 = yVar3.f18408l) == null) {
                    f7 = 0.0f;
                } else {
                    b8.f18224r.p(b8.f18211d, b8.f18224r.getProgress(), b8.f18215h, b8.f18214g, b8.f18220n);
                    float f11 = b8.f18217k;
                    float[] fArr = b8.f18220n;
                    if (f11 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f7 = (f9 * f11) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f7 = (f10 * b8.f18218l) / fArr[1];
                    }
                }
                float f12 = this.f8862a0;
                if ((f12 <= 0.0f && f7 < 0.0f) || (f12 >= 1.0f && f7 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new p((ViewGroup) view, 0));
                    return;
                }
            }
            float f13 = this.f8860W;
            long nanoTime = getNanoTime();
            float f14 = i7;
            this.f8876p0 = f14;
            float f15 = i8;
            this.f8877q0 = f15;
            this.f8879s0 = (float) ((nanoTime - this.f8878r0) * 1.0E-9d);
            this.f8878r0 = nanoTime;
            y yVar4 = zVar.f18417c;
            if (yVar4 != null && (b7 = yVar4.f18408l) != null) {
                MotionLayout motionLayout = b7.f18224r;
                float progress = motionLayout.getProgress();
                if (!b7.f18219m) {
                    b7.f18219m = true;
                    motionLayout.setProgress(progress);
                }
                b7.f18224r.p(b7.f18211d, progress, b7.f18215h, b7.f18214g, b7.f18220n);
                float f16 = b7.f18217k;
                float[] fArr2 = b7.f18220n;
                if (Math.abs((b7.f18218l * fArr2[1]) + (f16 * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f17 = b7.f18217k;
                float fMax = Math.max(Math.min(progress + (f17 != 0.0f ? (f14 * f17) / fArr2[0] : (f15 * b7.f18218l) / fArr2[1]), 1.0f), 0.0f);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f13 != this.f8860W) {
                iArr[0] = i7;
                r7 = 1;
                iArr[1] = i8;
            } else {
                r7 = 1;
            }
            m(false);
            if (iArr[0] == 0 && iArr[r7] == 0) {
                return;
            }
            this.f8875o0 = r7;
        }
    }

    @Override // P.InterfaceC0362s
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11) {
    }

    @Override // P.InterfaceC0362s
    public final void onNestedScrollAccepted(View view, View view2, int i7, int i8) {
        this.f8878r0 = getNanoTime();
        this.f8879s0 = 0.0f;
        this.f8876p0 = 0.0f;
        this.f8877q0 = 0.0f;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        B b7;
        z zVar = this.f8834J;
        if (zVar != null) {
            boolean zE = e();
            zVar.f18429p = zE;
            y yVar = zVar.f18417c;
            if (yVar == null || (b7 = yVar.f18408l) == null) {
                return;
            }
            b7.c(zE);
        }
    }

    @Override // P.InterfaceC0362s
    public final boolean onStartNestedScroll(View view, View view2, int i7, int i8) {
        y yVar;
        B b7;
        z zVar = this.f8834J;
        return (zVar == null || (yVar = zVar.f18417c) == null || (b7 = yVar.f18408l) == null || (b7.f18229w & 2) != 0) ? false : true;
    }

    @Override // P.InterfaceC0362s
    public final void onStopNestedScroll(View view, int i7) {
        B b7;
        z zVar = this.f8834J;
        if (zVar != null) {
            float f7 = this.f8879s0;
            if (f7 == 0.0f) {
                return;
            }
            float f8 = this.f8876p0 / f7;
            float f9 = this.f8877q0 / f7;
            y yVar = zVar.f18417c;
            if (yVar == null || (b7 = yVar.f18408l) == null) {
                return;
            }
            b7.f18219m = false;
            MotionLayout motionLayout = b7.f18224r;
            float progress = motionLayout.getProgress();
            b7.f18224r.p(b7.f18211d, progress, b7.f18215h, b7.f18214g, b7.f18220n);
            float f10 = b7.f18217k;
            float[] fArr = b7.f18220n;
            float f11 = f10 != 0.0f ? (f8 * f10) / fArr[0] : (f9 * b7.f18218l) / fArr[1];
            if (!Float.isNaN(f11)) {
                progress += f11 / 3.0f;
            }
            if (progress != 0.0f) {
                boolean z4 = progress != 1.0f;
                int i8 = b7.f18210c;
                if ((i8 != 3) && z4) {
                    motionLayout.y(((double) progress) >= 0.5d ? 1.0f : 0.0f, f11, i8);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x022a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0230  */
    /* JADX WARN: Code duplicated, block: B:115:0x0234  */
    /* JADX WARN: Code duplicated, block: B:130:0x0261  */
    /* JADX WARN: Code duplicated, block: B:198:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:199:0x04df  */
    /* JADX WARN: Code duplicated, block: B:202:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:204:0x0507  */
    /* JADX WARN: Code duplicated, block: B:232:0x0565  */
    /* JADX WARN: Code duplicated, block: B:234:0x056a  */
    /* JADX WARN: Code duplicated, block: B:236:0x0570  */
    /* JADX WARN: Code duplicated, block: B:356:0x0790  */
    /* JADX WARN: Code duplicated, block: B:359:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:368:0x07c4  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y yVar;
        s sVar;
        s sVar2;
        B b7;
        char c3;
        char c4;
        int i7;
        char c7;
        char c8;
        char c9;
        float right;
        float f7;
        int top;
        int bottom;
        int i8;
        float degrees;
        float f8;
        int i9;
        char c10;
        MotionEvent motionEvent2;
        RectF rectF;
        y yVar2;
        int iP;
        Iterator it;
        MotionLayout motionLayout = this;
        z zVar = motionLayout.f8834J;
        if (zVar == null || !motionLayout.f8852S || !zVar.o()) {
            return super.onTouchEvent(motionEvent);
        }
        z zVar2 = motionLayout.f8834J;
        y yVar3 = zVar2.f18417c;
        if (yVar3 != null && yVar3.f18411o) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        RectF rectF2 = new RectF();
        s sVar3 = zVar2.f18428o;
        MotionLayout motionLayout2 = zVar2.f18415a;
        if (sVar3 == null) {
            motionLayout2.getClass();
            s sVar4 = s.f18365b;
            sVar4.f18366a = VelocityTracker.obtain();
            zVar2.f18428o = sVar4;
        }
        VelocityTracker velocityTracker = zVar2.f18428o.f18366a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (currentState != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                zVar2.f18431r = motionEvent.getRawX();
                zVar2.f18432s = motionEvent.getRawY();
                zVar2.f18425l = motionEvent;
                zVar2.f18426m = false;
                B b8 = zVar2.f18417c.f18408l;
                if (b8 != null) {
                    RectF rectFA = b8.a(motionLayout2, rectF2);
                    if (rectFA == null || rectFA.contains(zVar2.f18425l.getX(), zVar2.f18425l.getY())) {
                        RectF rectFB = zVar2.f18417c.f18408l.b(motionLayout2, rectF2);
                        if (rectFB == null || rectFB.contains(zVar2.f18425l.getX(), zVar2.f18425l.getY())) {
                            zVar2.f18427n = false;
                        } else {
                            zVar2.f18427n = true;
                        }
                        B b9 = zVar2.f18417c.f18408l;
                        float f9 = zVar2.f18431r;
                        float f10 = zVar2.f18432s;
                        b9.f18222p = f9;
                        b9.f18223q = f10;
                    } else {
                        zVar2.f18425l = null;
                        zVar2.f18426m = true;
                    }
                }
            } else if (action == 2 && !zVar2.f18426m) {
                float rawY = motionEvent.getRawY() - zVar2.f18432s;
                float rawX = motionEvent.getRawX() - zVar2.f18431r;
                if ((rawX != 0.0d || rawY != 0.0d) && (motionEvent2 = zVar2.f18425l) != null) {
                    if (currentState != -1) {
                        B.v vVar = zVar2.f18416b;
                        if (vVar == null || (iP = vVar.p(currentState)) == -1) {
                            iP = currentState;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (y yVar4 : zVar2.f18418d) {
                            if (yVar4.f18401d == iP || yVar4.f18400c == iP) {
                                arrayList.add(yVar4);
                            }
                        }
                        RectF rectF3 = new RectF();
                        Iterator it2 = arrayList.iterator();
                        float f11 = 0.0f;
                        yVar2 = null;
                        while (it2.hasNext()) {
                            y yVar5 = (y) it2.next();
                            if (yVar5.f18411o) {
                                it = it2;
                            } else {
                                B b10 = yVar5.f18408l;
                                if (b10 != null) {
                                    b10.c(zVar2.f18429p);
                                    RectF rectFB2 = yVar5.f18408l.b(motionLayout2, rectF3);
                                    if (rectFB2 != null) {
                                        it = it2;
                                        if (!rectFB2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        }
                                    } else {
                                        it = it2;
                                    }
                                    RectF rectFA2 = yVar5.f18408l.a(motionLayout2, rectF3);
                                    if (rectFA2 == null || rectFA2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        B b11 = yVar5.f18408l;
                                        float fAtan2 = (b11.f18218l * rawY) + (b11.f18217k * rawX);
                                        if (b11.j) {
                                            float x4 = motionEvent2.getX();
                                            yVar5.f18408l.getClass();
                                            float f12 = x4 - 0.5f;
                                            float y4 = motionEvent2.getY();
                                            yVar5.f18408l.getClass();
                                            float f13 = y4 - 0.5f;
                                            fAtan2 = ((float) (Math.atan2(rawY + f13, rawX + f12) - Math.atan2(f12, f13))) * 10.0f;
                                        }
                                        float f14 = fAtan2 * (yVar5.f18400c == currentState ? -1.0f : 1.1f);
                                        if (f14 > f11) {
                                            f11 = f14;
                                            yVar2 = yVar5;
                                        }
                                        it2 = it;
                                        rectF3 = rectF3;
                                        rawY = rawY;
                                        rawX = rawX;
                                        rectF2 = rectF2;
                                    }
                                } else {
                                    rectF2 = rectF2;
                                    it = it2;
                                    rectF3 = rectF3;
                                    yVar2 = yVar2;
                                    rawY = rawY;
                                    rawX = rawX;
                                }
                                yVar2 = yVar2;
                                it2 = it;
                                rectF3 = rectF3;
                                rawY = rawY;
                                rawX = rawX;
                                rectF2 = rectF2;
                            }
                            it2 = it;
                        }
                        rectF = rectF2;
                    } else {
                        rectF = rectF2;
                        yVar2 = zVar2.f18417c;
                    }
                    if (yVar2 != null) {
                        motionLayout.setTransition(yVar2);
                        RectF rectFB3 = zVar2.f18417c.f18408l.b(motionLayout2, rectF);
                        zVar2.f18427n = (rectFB3 == null || rectFB3.contains(zVar2.f18425l.getX(), zVar2.f18425l.getY())) ? false : true;
                        B b12 = zVar2.f18417c.f18408l;
                        float f15 = zVar2.f18431r;
                        float f16 = zVar2.f18432s;
                        b12.f18222p = f15;
                        b12.f18223q = f16;
                        b12.f18219m = false;
                    }
                    if (!zVar2.f18426m) {
                        yVar = zVar2.f18417c;
                        if (yVar != null) {
                            zVar2 = zVar2;
                        } else {
                            zVar2 = zVar2;
                        }
                        z zVar3 = zVar2;
                        zVar3.f18431r = motionEvent.getRawX();
                        zVar3.f18432s = motionEvent.getRawY();
                        if (motionEvent.getAction() == 1) {
                            motionLayout = this;
                        } else {
                            motionLayout = this;
                        }
                    }
                }
            } else if (!zVar2.f18426m) {
                yVar = zVar2.f18417c;
                if (yVar != null) {
                    zVar2 = zVar2;
                } else {
                    zVar2 = zVar2;
                }
                z zVar4 = zVar2;
                zVar4.f18431r = motionEvent.getRawX();
                zVar4.f18432s = motionEvent.getRawY();
                if (motionEvent.getAction() == 1) {
                    motionLayout = this;
                } else {
                    motionLayout = this;
                }
            }
        } else if (!zVar2.f18426m) {
            yVar = zVar2.f18417c;
            if (yVar != null || (b7 = yVar.f18408l) == null || zVar2.f18427n) {
                zVar2 = zVar2;
            } else {
                s sVar5 = zVar2.f18428o;
                boolean z4 = b7.j;
                v vVar2 = v.f18375d;
                float[] fArr = b7.f18220n;
                MotionLayout motionLayout3 = b7.f18224r;
                if (z4) {
                    VelocityTracker velocityTracker2 = sVar5.f18366a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    int action2 = motionEvent.getAction();
                    if (action2 != 0) {
                        int[] iArr = b7.f18221o;
                        if (action2 == 1) {
                            zVar2 = zVar2;
                            b7.f18219m = false;
                            VelocityTracker velocityTracker3 = sVar5.f18366a;
                            if (velocityTracker3 != null) {
                                velocityTracker3.computeCurrentVelocity(16);
                            }
                            VelocityTracker velocityTracker4 = sVar5.f18366a;
                            float xVelocity = velocityTracker4 != null ? velocityTracker4.getXVelocity() : 0.0f;
                            VelocityTracker velocityTracker5 = sVar5.f18366a;
                            float yVelocity = velocityTracker5 != null ? velocityTracker5.getYVelocity() : 0.0f;
                            float progress = motionLayout3.getProgress();
                            float width = motionLayout3.getWidth() / 2.0f;
                            float height = motionLayout3.getHeight() / 2.0f;
                            int i10 = b7.f18216i;
                            if (i10 != -1) {
                                View viewFindViewById = motionLayout3.findViewById(i10);
                                motionLayout3.getLocationOnScreen(iArr);
                                right = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                f7 = iArr[1];
                                top = viewFindViewById.getTop();
                                bottom = viewFindViewById.getBottom();
                            } else {
                                int i11 = b7.f18211d;
                                if (i11 != -1) {
                                    View viewFindViewById2 = motionLayout3.findViewById(((n) motionLayout3.f8854T.get(motionLayout3.findViewById(i11))).f18326f.f18379B);
                                    motionLayout3.getLocationOnScreen(iArr);
                                    right = iArr[0] + ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f);
                                    f7 = iArr[1];
                                    top = viewFindViewById2.getTop();
                                    bottom = viewFindViewById2.getBottom();
                                } else {
                                    float rawX2 = motionEvent.getRawX() - width;
                                    float rawY2 = motionEvent.getRawY() - height;
                                    double degrees2 = Math.toDegrees(Math.atan2(rawY2, rawX2));
                                    i8 = b7.f18211d;
                                    if (i8 != -1) {
                                        b7.f18224r.p(i8, progress, b7.f18215h, b7.f18214g, b7.f18220n);
                                        fArr[1] = (float) Math.toDegrees(fArr[1]);
                                    } else {
                                        fArr[1] = 360.0f;
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity + rawY2, xVelocity + rawX2)) - degrees2)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                        f8 = progress;
                                    } else {
                                        f8 = (((degrees * 3.0f) * b7.f18228v) / fArr[1]) + progress;
                                    }
                                    if (f8 == 0.0f && f8 != 1.0f && (i9 = b7.f18210c) != 3) {
                                        float fAbs = (degrees * b7.f18228v) / fArr[1];
                                        float f17 = ((double) f8) < 0.5d ? 0.0f : 1.0f;
                                        if (i9 == 6) {
                                            if (progress + fAbs < 0.0f) {
                                                fAbs = Math.abs(fAbs);
                                            }
                                            f17 = 1.0f;
                                        }
                                        if (b7.f18210c == 7) {
                                            if (progress + fAbs > 1.0f) {
                                                fAbs = -Math.abs(fAbs);
                                            }
                                            f17 = 0.0f;
                                        }
                                        motionLayout3.y(f17, fAbs * 3.0f, b7.f18210c);
                                        if (0.0f >= progress || 1.0f <= progress) {
                                            motionLayout3.setState(vVar2);
                                        }
                                    } else if (0.0f < f8 || 1.0f <= f8) {
                                        motionLayout3.setState(vVar2);
                                    }
                                }
                            }
                            float f18 = right;
                            height = ((bottom + top) / 2.0f) + f7;
                            width = f18;
                            float rawX3 = motionEvent.getRawX() - width;
                            float rawY3 = motionEvent.getRawY() - height;
                            double degrees3 = Math.toDegrees(Math.atan2(rawY3, rawX3));
                            i8 = b7.f18211d;
                            if (i8 != -1) {
                                b7.f18224r.p(i8, progress, b7.f18215h, b7.f18214g, b7.f18220n);
                                fArr[1] = (float) Math.toDegrees(fArr[1]);
                            } else {
                                fArr[1] = 360.0f;
                            }
                            degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity + rawY3, xVelocity + rawX3)) - degrees3)) * 62.5f;
                            if (Float.isNaN(degrees)) {
                                f8 = (((degrees * 3.0f) * b7.f18228v) / fArr[1]) + progress;
                            } else {
                                f8 = progress;
                            }
                            if (f8 == 0.0f) {
                                if (0.0f < f8) {
                                    motionLayout3.setState(vVar2);
                                } else {
                                    motionLayout3.setState(vVar2);
                                }
                            } else if (0.0f < f8) {
                                motionLayout3.setState(vVar2);
                            } else {
                                motionLayout3.setState(vVar2);
                            }
                        } else if (action2 != 2) {
                            zVar2 = zVar2;
                        } else {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            float width2 = motionLayout3.getWidth() / 2.0f;
                            float height2 = motionLayout3.getHeight() / 2.0f;
                            int i12 = b7.f18216i;
                            if (i12 != -1) {
                                View viewFindViewById3 = motionLayout3.findViewById(i12);
                                motionLayout3.getLocationOnScreen(iArr);
                                float right2 = iArr[0] + ((viewFindViewById3.getRight() + viewFindViewById3.getLeft()) / 2.0f);
                                height2 = ((viewFindViewById3.getBottom() + viewFindViewById3.getTop()) / 2.0f) + iArr[1];
                                width2 = right2;
                            } else {
                                int i13 = b7.f18211d;
                                if (i13 != -1) {
                                    View viewFindViewById4 = motionLayout3.findViewById(((n) motionLayout3.f8854T.get(motionLayout3.findViewById(i13))).f18326f.f18379B);
                                    if (viewFindViewById4 == null) {
                                        Log.e("TouchResponse", "could not find view to animate to");
                                    } else {
                                        motionLayout3.getLocationOnScreen(iArr);
                                        width2 = iArr[0] + ((viewFindViewById4.getRight() + viewFindViewById4.getLeft()) / 2.0f);
                                        height2 = iArr[1] + ((viewFindViewById4.getBottom() + viewFindViewById4.getTop()) / 2.0f);
                                    }
                                }
                            }
                            float rawX4 = motionEvent.getRawX() - width2;
                            float rawY4 = motionEvent.getRawY() - height2;
                            double dAtan2 = Math.atan2(motionEvent.getRawY() - height2, motionEvent.getRawX() - width2);
                            float fAtan3 = (float) (((dAtan2 - Math.atan2(b7.f18223q - height2, b7.f18222p - width2)) * 180.0d) / 3.141592653589793d);
                            if (fAtan3 > 330.0f) {
                                fAtan3 -= 360.0f;
                            } else if (fAtan3 < -330.0f) {
                                fAtan3 += 360.0f;
                            }
                            if (Math.abs(fAtan3) > 0.01d || b7.f18219m) {
                                float progress2 = motionLayout3.getProgress();
                                if (!b7.f18219m) {
                                    b7.f18219m = true;
                                    motionLayout3.setProgress(progress2);
                                }
                                int i14 = b7.f18211d;
                                if (i14 != -1) {
                                    b7.f18224r.p(i14, progress2, b7.f18215h, b7.f18214g, b7.f18220n);
                                    c10 = 1;
                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                } else {
                                    c10 = 1;
                                    fArr[1] = 360.0f;
                                }
                                float fMax = Math.max(Math.min(((fAtan3 * b7.f18228v) / fArr[c10]) + progress2, 1.0f), 0.0f);
                                float progress3 = motionLayout3.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 == 0.0f || progress3 == 1.0f) {
                                        motionLayout3.l();
                                    }
                                    motionLayout3.setProgress(fMax);
                                    VelocityTracker velocityTracker6 = sVar5.f18366a;
                                    if (velocityTracker6 != null) {
                                        velocityTracker6.computeCurrentVelocity(zzbbd.zzq.zzf);
                                    }
                                    VelocityTracker velocityTracker7 = sVar5.f18366a;
                                    float xVelocity2 = velocityTracker7 != null ? velocityTracker7.getXVelocity() : 0.0f;
                                    VelocityTracker velocityTracker8 = sVar5.f18366a;
                                    double yVelocity2 = velocityTracker8 != null ? velocityTracker8.getYVelocity() : 0.0f;
                                    double d7 = xVelocity2;
                                    motionLayout3.f8840M = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity2, d7) - dAtan2) * Math.hypot(yVelocity2, d7)) / Math.hypot(rawX4, rawY4)));
                                } else {
                                    motionLayout3.f8840M = 0.0f;
                                }
                                b7.f18222p = motionEvent.getRawX();
                                b7.f18223q = motionEvent.getRawY();
                            } else {
                                zVar2 = zVar2;
                            }
                        }
                    } else {
                        zVar2 = zVar2;
                        b7.f18222p = motionEvent.getRawX();
                        b7.f18223q = motionEvent.getRawY();
                        b7.f18219m = false;
                    }
                } else {
                    zVar2 = zVar2;
                    VelocityTracker velocityTracker9 = sVar5.f18366a;
                    if (velocityTracker9 != null) {
                        velocityTracker9.addMovement(motionEvent);
                    }
                    int action3 = motionEvent.getAction();
                    if (action3 == 0) {
                        b7.f18222p = motionEvent.getRawX();
                        b7.f18223q = motionEvent.getRawY();
                        b7.f18219m = false;
                    } else if (action3 == 1) {
                        b7.f18219m = false;
                        VelocityTracker velocityTracker10 = sVar5.f18366a;
                        if (velocityTracker10 != null) {
                            velocityTracker10.computeCurrentVelocity(zzbbd.zzq.zzf);
                        }
                        VelocityTracker velocityTracker11 = sVar5.f18366a;
                        float xVelocity3 = velocityTracker11 != null ? velocityTracker11.getXVelocity() : 0.0f;
                        VelocityTracker velocityTracker12 = sVar5.f18366a;
                        float yVelocity3 = velocityTracker12 != null ? velocityTracker12.getYVelocity() : 0.0f;
                        float progress4 = motionLayout3.getProgress();
                        int i15 = b7.f18211d;
                        if (i15 != -1) {
                            b7.f18224r.p(i15, progress4, b7.f18215h, b7.f18214g, b7.f18220n);
                            c4 = 0;
                            c3 = 1;
                        } else {
                            float fMin = Math.min(motionLayout3.getWidth(), motionLayout3.getHeight());
                            c3 = 1;
                            fArr[1] = b7.f18218l * fMin;
                            c4 = 0;
                            fArr[0] = fMin * b7.f18217k;
                        }
                        float fAbs2 = b7.f18217k != 0.0f ? xVelocity3 / fArr[c4] : yVelocity3 / fArr[c3];
                        float f19 = !Float.isNaN(fAbs2) ? (fAbs2 / 3.0f) + progress4 : progress4;
                        if (f19 != 0.0f && f19 != 1.0f && (i7 = b7.f18210c) != 3) {
                            float f20 = ((double) f19) < 0.5d ? 0.0f : 1.0f;
                            if (i7 == 6) {
                                if (progress4 + fAbs2 < 0.0f) {
                                    fAbs2 = Math.abs(fAbs2);
                                }
                                f20 = 1.0f;
                            }
                            if (b7.f18210c == 7) {
                                if (progress4 + fAbs2 > 1.0f) {
                                    fAbs2 = -Math.abs(fAbs2);
                                }
                                f20 = 0.0f;
                            }
                            motionLayout3.y(f20, fAbs2, b7.f18210c);
                            if (0.0f >= progress4 || 1.0f <= progress4) {
                                motionLayout3.setState(vVar2);
                            }
                        } else if (0.0f >= f19 || 1.0f <= f19) {
                            motionLayout3.setState(vVar2);
                        }
                    } else if (action3 == 2) {
                        float rawY5 = motionEvent.getRawY() - b7.f18223q;
                        float rawX5 = motionEvent.getRawX() - b7.f18222p;
                        if (Math.abs((b7.f18218l * rawY5) + (b7.f18217k * rawX5)) > b7.f18230x || b7.f18219m) {
                            float progress5 = motionLayout3.getProgress();
                            if (!b7.f18219m) {
                                b7.f18219m = true;
                                motionLayout3.setProgress(progress5);
                            }
                            int i16 = b7.f18211d;
                            if (i16 != -1) {
                                b7.f18224r.p(i16, progress5, b7.f18215h, b7.f18214g, b7.f18220n);
                                c8 = 0;
                                c7 = 1;
                            } else {
                                float fMin2 = Math.min(motionLayout3.getWidth(), motionLayout3.getHeight());
                                c7 = 1;
                                fArr[1] = b7.f18218l * fMin2;
                                c8 = 0;
                                fArr[0] = fMin2 * b7.f18217k;
                            }
                            if (Math.abs(((b7.f18218l * fArr[c7]) + (b7.f18217k * fArr[c8])) * b7.f18228v) < 0.01d) {
                                c9 = 0;
                                fArr[0] = 0.01f;
                                fArr[c7] = 0.01f;
                            } else {
                                c9 = 0;
                            }
                            float fMax2 = Math.max(Math.min(progress5 + (b7.f18217k != 0.0f ? rawX5 / fArr[c9] : rawY5 / fArr[c7]), 1.0f), 0.0f);
                            if (b7.f18210c == 6) {
                                fMax2 = Math.max(fMax2, 0.01f);
                            }
                            if (b7.f18210c == 7) {
                                fMax2 = Math.min(fMax2, 0.99f);
                            }
                            float progress6 = motionLayout3.getProgress();
                            if (fMax2 != progress6) {
                                if (progress6 == 0.0f || progress6 == 1.0f) {
                                    motionLayout3.l();
                                }
                                motionLayout3.setProgress(fMax2);
                                VelocityTracker velocityTracker13 = sVar5.f18366a;
                                if (velocityTracker13 != null) {
                                    velocityTracker13.computeCurrentVelocity(zzbbd.zzq.zzf);
                                }
                                VelocityTracker velocityTracker14 = sVar5.f18366a;
                                float xVelocity4 = velocityTracker14 != null ? velocityTracker14.getXVelocity() : 0.0f;
                                VelocityTracker velocityTracker15 = sVar5.f18366a;
                                motionLayout3.f8840M = b7.f18217k != 0.0f ? xVelocity4 / fArr[0] : (velocityTracker15 != null ? velocityTracker15.getYVelocity() : 0.0f) / fArr[1];
                            } else {
                                motionLayout3.f8840M = 0.0f;
                            }
                            b7.f18222p = motionEvent.getRawX();
                            b7.f18223q = motionEvent.getRawY();
                        }
                    }
                }
            }
            z zVar5 = zVar2;
            zVar5.f18431r = motionEvent.getRawX();
            zVar5.f18432s = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 || (sVar = zVar5.f18428o) == null) {
                motionLayout = this;
            } else {
                VelocityTracker velocityTracker16 = sVar.f18366a;
                if (velocityTracker16 != null) {
                    velocityTracker16.recycle();
                    sVar2 = null;
                    sVar.f18366a = null;
                } else {
                    sVar2 = null;
                }
                zVar5.f18428o = sVar2;
                motionLayout = this;
                int i17 = motionLayout.f8844O;
                if (i17 != -1) {
                    zVar5.a(i17, motionLayout);
                }
            }
        }
        y yVar6 = motionLayout.f8834J.f18417c;
        if ((yVar6.f18414r & 4) != 0) {
            return yVar6.f18408l.f18219m;
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f8884x0 == null) {
                this.f8884x0 = new CopyOnWriteArrayList();
            }
            this.f8884x0.add(motionHelper);
            if (motionHelper.f8823z) {
                if (this.f8881u0 == null) {
                    this.f8881u0 = new ArrayList();
                }
                this.f8881u0.add(motionHelper);
            }
            if (motionHelper.f8820A) {
                if (this.f8882v0 == null) {
                    this.f8882v0 = new ArrayList();
                }
                this.f8882v0.add(motionHelper);
            }
            if (motionHelper instanceof MotionEffect) {
                if (this.f8883w0 == null) {
                    this.f8883w0 = new ArrayList();
                }
                this.f8883w0.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.f8881u0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f8882v0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p(int i7, float f7, float f8, float f9, float[] fArr) {
        HashMap map = this.f8854T;
        View viewB = b(i7);
        n nVar = (n) map.get(viewB);
        if (nVar == null) {
            L.l("WARNING could not find view id ", viewB == null ? k.d(i7, "") : viewB.getContext().getResources().getResourceName(i7), "MotionLayout");
        } else {
            nVar.d(f7, f8, f9, fArr);
            viewB.getY();
        }
    }

    public final y q(int i7) {
        for (y yVar : this.f8834J.f18418d) {
            if (yVar.f18398a == i7) {
                return yVar;
            }
        }
        return null;
    }

    public final boolean r(float f7, float f8, View view, MotionEvent motionEvent) {
        boolean z4;
        boolean zOnTouchEvent;
        if (!(view instanceof ViewGroup)) {
            z4 = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z4 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (r((childAt.getLeft() + f7) - view.getScrollX(), (childAt.getTop() + f8) - view.getScrollY(), childAt, motionEvent)) {
                z4 = true;
                break;
            }
            childCount--;
        }
        if (!z4) {
            RectF rectF = this.f8857U0;
            rectF.set(f7, f8, (view.getRight() + f7) - view.getLeft(), (view.getBottom() + f8) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f9 = -f7;
                float f10 = -f8;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f9, f10);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f9, -f10);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f9, f10);
                    if (this.W0 == null) {
                        this.W0 = new Matrix();
                    }
                    matrix.invert(this.W0);
                    motionEventObtain.transform(this.W0);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z4;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        z zVar;
        y yVar;
        if (!this.f8828D0 && this.f8844O == -1 && (zVar = this.f8834J) != null && (yVar = zVar.f18417c) != null) {
            int i7 = yVar.f18413q;
            if (i7 == 0) {
                return;
            }
            if (i7 == 2) {
                int childCount = getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    ((n) this.f8854T.get(getChildAt(i8))).f18324d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public final void s() {
        y yVar;
        B b7;
        View viewFindViewById;
        z zVar = this.f8834J;
        if (zVar == null) {
            return;
        }
        if (zVar.a(this.f8844O, this)) {
            requestLayout();
            return;
        }
        int i7 = this.f8844O;
        if (i7 != -1) {
            z zVar2 = this.f8834J;
            ArrayList<y> arrayList = zVar2.f18418d;
            for (y yVar2 : arrayList) {
                if (yVar2.f18409m.size() > 0) {
                    Iterator it = yVar2.f18409m.iterator();
                    while (it.hasNext()) {
                        ((x) it.next()).b(this);
                    }
                }
            }
            ArrayList<y> arrayList2 = zVar2.f18420f;
            for (y yVar3 : arrayList2) {
                if (yVar3.f18409m.size() > 0) {
                    Iterator it2 = yVar3.f18409m.iterator();
                    while (it2.hasNext()) {
                        ((x) it2.next()).b(this);
                    }
                }
            }
            for (y yVar4 : arrayList) {
                if (yVar4.f18409m.size() > 0) {
                    Iterator it3 = yVar4.f18409m.iterator();
                    while (it3.hasNext()) {
                        ((x) it3.next()).a(this, i7, yVar4);
                    }
                }
            }
            for (y yVar5 : arrayList2) {
                if (yVar5.f18409m.size() > 0) {
                    Iterator it4 = yVar5.f18409m.iterator();
                    while (it4.hasNext()) {
                        ((x) it4.next()).a(this, i7, yVar5);
                    }
                }
            }
        }
        if (!this.f8834J.o() || (yVar = this.f8834J.f18417c) == null || (b7 = yVar.f18408l) == null) {
            return;
        }
        int i8 = b7.f18211d;
        if (i8 != -1) {
            MotionLayout motionLayout = b7.f18224r;
            viewFindViewById = motionLayout.findViewById(i8);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + c.f(b7.f18211d, motionLayout.getContext()));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new p169z.A());
            nestedScrollView.setOnScrollChangeListener(new C1009l0(29));
        }
    }

    public void setDebugMode(int i7) {
        this.f8867g0 = i7;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z4) {
        this.f8849Q0 = z4;
    }

    public void setInteractionEnabled(boolean z4) {
        this.f8852S = z4;
    }

    public void setInterpolatedProgress(float f7) {
        if (this.f8834J != null) {
            setState(v.f18374c);
            Interpolator interpolatorE = this.f8834J.e();
            if (interpolatorE != null) {
                setProgress(interpolatorE.getInterpolation(f7));
                return;
            }
        }
        setProgress(f7);
    }

    public void setOnHide(float f7) {
        ArrayList arrayList = this.f8882v0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((MotionHelper) this.f8882v0.get(i7)).setProgress(f7);
            }
        }
    }

    public void setOnShow(float f7) {
        ArrayList arrayList = this.f8881u0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((MotionHelper) this.f8881u0.get(i7)).setProgress(f7);
            }
        }
    }

    public void setProgress(float f7) {
        if (f7 < 0.0f || f7 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            if (this.f8843N0 == null) {
                this.f8843N0 = new t(this);
            }
            this.f8843N0.f18367a = f7;
            return;
        }
        v vVar = v.f18375d;
        v vVar2 = v.f18374c;
        if (f7 <= 0.0f) {
            if (this.f8862a0 == 1.0f && this.f8844O == this.f8846P) {
                setState(vVar2);
            }
            this.f8844O = this.f8842N;
            if (this.f8862a0 == 0.0f) {
                setState(vVar);
            }
        } else if (f7 >= 1.0f) {
            if (this.f8862a0 == 0.0f && this.f8844O == this.f8842N) {
                setState(vVar2);
            }
            this.f8844O = this.f8846P;
            if (this.f8862a0 == 1.0f) {
                setState(vVar);
            }
        } else {
            this.f8844O = -1;
            setState(vVar2);
        }
        if (this.f8834J == null) {
            return;
        }
        this.f8864d0 = true;
        this.c0 = f7;
        this.f8860W = f7;
        this.f8863b0 = -1L;
        this.f8856U = -1L;
        this.f8836K = null;
        this.f8865e0 = true;
        invalidate();
    }

    public void setScene(z zVar) {
        B b7;
        this.f8834J = zVar;
        boolean zE = e();
        zVar.f18429p = zE;
        y yVar = zVar.f18417c;
        if (yVar != null && (b7 = yVar.f18408l) != null) {
            b7.c(zE);
        }
        u();
    }

    public void setStartState(int i7) {
        if (super.isAttachedToWindow()) {
            this.f8844O = i7;
            return;
        }
        if (this.f8843N0 == null) {
            this.f8843N0 = new t(this);
        }
        t tVar = this.f8843N0;
        tVar.f18369c = i7;
        tVar.f18370d = i7;
    }

    public void setState(v vVar) {
        v vVar2 = v.f18375d;
        if (vVar == vVar2 && this.f8844O == -1) {
            return;
        }
        v vVar3 = this.f8851R0;
        this.f8851R0 = vVar;
        v vVar4 = v.f18374c;
        if (vVar3 == vVar4 && vVar == vVar4) {
            n();
        }
        int iOrdinal = vVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && vVar == vVar2) {
                o();
                return;
            }
            return;
        }
        if (vVar == vVar4) {
            n();
        }
        if (vVar == vVar2) {
            o();
        }
    }

    public void setTransition(int i7) {
        float f7;
        if (this.f8834J != null) {
            y yVarQ = q(i7);
            this.f8842N = yVarQ.f18401d;
            this.f8846P = yVarQ.f18400c;
            if (!super.isAttachedToWindow()) {
                if (this.f8843N0 == null) {
                    this.f8843N0 = new t(this);
                }
                t tVar = this.f8843N0;
                tVar.f18369c = this.f8842N;
                tVar.f18370d = this.f8846P;
                return;
            }
            int i8 = this.f8844O;
            if (i8 == this.f8842N) {
                f7 = 0.0f;
            } else {
                f7 = i8 == this.f8846P ? 1.0f : Float.NaN;
            }
            z zVar = this.f8834J;
            zVar.f18417c = yVarQ;
            B b7 = yVarQ.f18408l;
            if (b7 != null) {
                b7.c(zVar.f18429p);
            }
            this.f8853S0.k(this.f8834J.b(this.f8842N), this.f8834J.b(this.f8846P));
            u();
            if (this.f8862a0 != f7) {
                if (f7 == 0.0f) {
                    l();
                    this.f8834J.b(this.f8842N).b(this);
                } else if (f7 == 1.0f) {
                    l();
                    this.f8834J.b(this.f8846P).b(this);
                }
            }
            this.f8862a0 = Float.isNaN(f7) ? 0.0f : f7;
            if (!Float.isNaN(f7)) {
                setProgress(f7);
                return;
            }
            Log.v("MotionLayout", c.d() + " transitionToStart ");
            k(0.0f);
        }
    }

    public void setTransitionDuration(int i7) {
        z zVar = this.f8834J;
        if (zVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        y yVar = zVar.f18417c;
        if (yVar != null) {
            yVar.f18405h = Math.max(i7, 8);
        } else {
            zVar.j = i7;
        }
    }

    public void setTransitionListener(u uVar) {
        this.f8866f0 = uVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f8843N0 == null) {
            this.f8843N0 = new t(this);
        }
        t tVar = this.f8843N0;
        tVar.getClass();
        tVar.f18367a = bundle.getFloat("motion.progress");
        tVar.f18368b = bundle.getFloat("motion.velocity");
        tVar.f18369c = bundle.getInt("motion.StartState");
        tVar.f18370d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.f8843N0.a();
        }
    }

    public final void t() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.f8866f0 == null && ((copyOnWriteArrayList = this.f8884x0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList<Integer> arrayList = this.f8861X0;
        for (Integer num : arrayList) {
            u uVar = this.f8866f0;
            if (uVar != null) {
                uVar.a(num.intValue());
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f8884x0;
            if (copyOnWriteArrayList2 != null) {
                Iterator it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).a(num.intValue());
                }
            }
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return c.f(this.f8842N, context) + "->" + c.f(this.f8846P, context) + " (pos:" + this.f8862a0 + " Dpos/Dt:" + this.f8840M;
    }

    public final void u() {
        this.f8853S0.l();
        invalidate();
    }

    public final void v(float f7, float f8) {
        if (!super.isAttachedToWindow()) {
            if (this.f8843N0 == null) {
                this.f8843N0 = new t(this);
            }
            t tVar = this.f8843N0;
            tVar.f18367a = f7;
            tVar.f18368b = f8;
            return;
        }
        setProgress(f7);
        setState(v.f18374c);
        this.f8840M = f8;
        if (f8 != 0.0f) {
            k(f8 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f7 == 0.0f || f7 == 1.0f) {
                return;
            }
            k(f7 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public final void w(int i7) {
        setState(v.f18373b);
        this.f8844O = i7;
        this.f8842N = -1;
        this.f8846P = -1;
        C0350f c0350f = this.f9000B;
        if (c0350f == null) {
            z zVar = this.f8834J;
            if (zVar != null) {
                zVar.b(i7).b(this);
                return;
            }
            return;
        }
        float f7 = -1;
        int i8 = c0350f.f5057c;
        SparseArray sparseArray = (SparseArray) c0350f.f5059e;
        int i9 = 0;
        ConstraintLayout constraintLayout = (ConstraintLayout) c0350f.f5056b;
        if (i8 != i7) {
            c0350f.f5057c = i7;
            B.e eVar = (B.e) sparseArray.get(i7);
            while (true) {
                ArrayList arrayList = eVar.f777b;
                if (i9 >= arrayList.size()) {
                    i9 = -1;
                    break;
                } else if (((B.f) arrayList.get(i9)).a(f7, f7)) {
                    break;
                } else {
                    i9++;
                }
            }
            ArrayList arrayList2 = eVar.f777b;
            m mVar = i9 == -1 ? eVar.f779d : ((B.f) arrayList2.get(i9)).f785f;
            if (i9 != -1) {
                int i10 = ((B.f) arrayList2.get(i9)).f784e;
            }
            if (mVar != null) {
                c0350f.f5058d = i9;
                mVar.b(constraintLayout);
                return;
            } else {
                Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i7 + ", dim =-1.0, -1.0");
                return;
            }
        }
        B.e eVar2 = i7 == -1 ? (B.e) sparseArray.valueAt(0) : (B.e) sparseArray.get(i8);
        int i11 = c0350f.f5058d;
        if (i11 == -1 || !((B.f) eVar2.f777b.get(i11)).a(f7, f7)) {
            while (true) {
                ArrayList arrayList3 = eVar2.f777b;
                if (i9 >= arrayList3.size()) {
                    i9 = -1;
                    break;
                } else if (((B.f) arrayList3.get(i9)).a(f7, f7)) {
                    break;
                } else {
                    i9++;
                }
            }
            if (c0350f.f5058d == i9) {
                return;
            }
            ArrayList arrayList4 = eVar2.f777b;
            m mVar2 = i9 == -1 ? null : ((B.f) arrayList4.get(i9)).f785f;
            if (i9 != -1) {
                int i12 = ((B.f) arrayList4.get(i9)).f784e;
            }
            if (mVar2 == null) {
                return;
            }
            c0350f.f5058d = i9;
            mVar2.b(constraintLayout);
        }
    }

    public final void x(int i7, int i8) {
        if (!super.isAttachedToWindow()) {
            if (this.f8843N0 == null) {
                this.f8843N0 = new t(this);
            }
            t tVar = this.f8843N0;
            tVar.f18369c = i7;
            tVar.f18370d = i8;
            return;
        }
        z zVar = this.f8834J;
        if (zVar != null) {
            this.f8842N = i7;
            this.f8846P = i8;
            zVar.n(i7, i8);
            this.f8853S0.k(this.f8834J.b(i7), this.f8834J.b(i8));
            u();
            this.f8862a0 = 0.0f;
            k(0.0f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x010a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0114  */
    /* JADX WARN: Code duplicated, block: B:71:0x011e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0128  */
    /* JADX WARN: Code duplicated, block: B:81:0x0132  */
    /* JADX WARN: Code duplicated, block: B:84:0x0137  */
    public final void y(float f7, float f8, int i7) {
        z zVar;
        y yVar;
        int i8;
        float f9;
        float f10;
        float f11;
        float f12;
        int i9;
        B b7;
        B b8;
        B b9;
        B b10;
        B b11;
        y yVar2;
        float f13;
        B b12;
        B b13;
        y yVar3;
        float f14;
        B b14;
        float f15 = f7;
        if (this.f8834J == null || this.f8862a0 == f15) {
            return;
        }
        this.f8869i0 = true;
        this.f8856U = getNanoTime();
        float fC = this.f8834J.c() / 1000.0f;
        this.f8858V = fC;
        this.c0 = f15;
        this.f8865e0 = true;
        a aVar = this.f8870j0;
        if (i7 == 0 || i7 == 1 || i7 == 2) {
            if (i7 != 1 || i7 == 7) {
                f15 = 0.0f;
            } else if (i7 == 2 || i7 == 6) {
                f15 = 1.0f;
            }
            zVar = this.f8834J;
            yVar = zVar.f18417c;
            if (yVar != null || (b13 = yVar.f18408l) == null) {
                i8 = 0;
            } else {
                i8 = b13.f18207D;
            }
            if (i8 == 0) {
                float f16 = this.f8862a0;
                float fG = zVar.g();
                yVar2 = this.f8834J.f18417c;
                if (yVar2 != null || (b12 = yVar2.f18408l) == null) {
                    f13 = 0.0f;
                } else {
                    f13 = b12.f18225s;
                }
                this.f8870j0.b(f16, f15, f8, fC, fG, f13);
            } else {
                float f17 = this.f8862a0;
                if (yVar != null || (b11 = yVar.f18408l) == null) {
                    f9 = 0.0f;
                } else {
                    f9 = b11.f18232z;
                }
                if (yVar != null || (b10 = yVar.f18408l) == null) {
                    f10 = 0.0f;
                } else {
                    f10 = b10.f18204A;
                }
                if (yVar != null || (b9 = yVar.f18408l) == null) {
                    f11 = 0.0f;
                } else {
                    f11 = b9.f18231y;
                }
                if (yVar != null || (b8 = yVar.f18408l) == null) {
                    f12 = 0.0f;
                } else {
                    f12 = b8.f18205B;
                }
                if (yVar != null || (b7 = yVar.f18408l) == null) {
                    i9 = 0;
                } else {
                    i9 = b7.f18206C;
                }
                if (aVar.f18103b == null) {
                    i iVar = new i();
                    iVar.f16519a = 0.5d;
                    iVar.f16527i = 0;
                    aVar.f18103b = iVar;
                }
                i iVar2 = aVar.f18103b;
                aVar.f18104c = iVar2;
                iVar2.f16521c = f15;
                iVar2.f16519a = f11;
                iVar2.f16523e = f17;
                iVar2.f16520b = f10;
                iVar2.f16525g = f9;
                iVar2.f16526h = f12;
                iVar2.f16527i = i9;
                iVar2.f16522d = 0.0f;
            }
            int i10 = this.f8844O;
            this.c0 = f15;
            this.f8844O = i10;
            this.f8836K = aVar;
        } else {
            q qVar = this.f8871k0;
            if (i7 == 4) {
                float f18 = this.f8862a0;
                float fG2 = this.f8834J.g();
                qVar.f18348a = f8;
                qVar.f18349b = f18;
                qVar.f18350c = fG2;
                this.f8836K = qVar;
            } else if (i7 == 5) {
                float f19 = this.f8862a0;
                float fG3 = this.f8834J.g();
                if (f8 > 0.0f) {
                    float f20 = f8 / fG3;
                    if (((f8 * f20) - (((fG3 * f20) * f20) / 2.0f)) + f19 > 1.0f) {
                        float f21 = this.f8862a0;
                        float fG4 = this.f8834J.g();
                        qVar.f18348a = f8;
                        qVar.f18349b = f21;
                        qVar.f18350c = fG4;
                        this.f8836K = qVar;
                    } else {
                        float f22 = this.f8862a0;
                        float f23 = this.f8858V;
                        float fG5 = this.f8834J.g();
                        yVar3 = this.f8834J.f18417c;
                        if (yVar3 != null || (b14 = yVar3.f18408l) == null) {
                            f14 = 0.0f;
                        } else {
                            f14 = b14.f18225s;
                        }
                        this.f8870j0.b(f22, f7, f8, f23, fG5, f14);
                        this.f8840M = 0.0f;
                        int i11 = this.f8844O;
                        this.c0 = f15;
                        this.f8844O = i11;
                        this.f8836K = aVar;
                    }
                } else {
                    float f24 = (-f8) / fG3;
                    if ((((fG3 * f24) * f24) / 2.0f) + (f8 * f24) + f19 < 0.0f) {
                        float f25 = this.f8862a0;
                        float fG6 = this.f8834J.g();
                        qVar.f18348a = f8;
                        qVar.f18349b = f25;
                        qVar.f18350c = fG6;
                        this.f8836K = qVar;
                    } else {
                        float f26 = this.f8862a0;
                        float f27 = this.f8858V;
                        float fG7 = this.f8834J.g();
                        yVar3 = this.f8834J.f18417c;
                        if (yVar3 != null) {
                            f14 = 0.0f;
                        } else {
                            f14 = 0.0f;
                        }
                        this.f8870j0.b(f26, f7, f8, f27, fG7, f14);
                        this.f8840M = 0.0f;
                        int i12 = this.f8844O;
                        this.c0 = f15;
                        this.f8844O = i12;
                        this.f8836K = aVar;
                    }
                }
            } else if (i7 == 6 || i7 == 7) {
                if (i7 != 1) {
                    f15 = 0.0f;
                } else {
                    f15 = 0.0f;
                }
                zVar = this.f8834J;
                yVar = zVar.f18417c;
                if (yVar != null) {
                    i8 = 0;
                } else {
                    i8 = 0;
                }
                if (i8 == 0) {
                    float f110 = this.f8862a0;
                    float fG8 = zVar.g();
                    yVar2 = this.f8834J.f18417c;
                    if (yVar2 != null) {
                        f13 = 0.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    this.f8870j0.b(f110, f15, f8, fC, fG8, f13);
                } else {
                    float f111 = this.f8862a0;
                    if (yVar != null) {
                        f9 = 0.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    if (yVar != null) {
                        f10 = 0.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    if (yVar != null) {
                        f11 = 0.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    if (yVar != null) {
                        f12 = 0.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    if (yVar != null) {
                        i9 = 0;
                    } else {
                        i9 = 0;
                    }
                    if (aVar.f18103b == null) {
                        i iVar3 = new i();
                        iVar3.f16519a = 0.5d;
                        iVar3.f16527i = 0;
                        aVar.f18103b = iVar3;
                    }
                    i iVar4 = aVar.f18103b;
                    aVar.f18104c = iVar4;
                    iVar4.f16521c = f15;
                    iVar4.f16519a = f11;
                    iVar4.f16523e = f111;
                    iVar4.f16520b = f10;
                    iVar4.f16525g = f9;
                    iVar4.f16526h = f12;
                    iVar4.f16527i = i9;
                    iVar4.f16522d = 0.0f;
                }
                int i13 = this.f8844O;
                this.c0 = f15;
                this.f8844O = i13;
                this.f8836K = aVar;
            }
        }
        this.f8864d0 = false;
        this.f8856U = getNanoTime();
        invalidate();
    }

    public final void z(int i7) {
        B.v vVar;
        if (!super.isAttachedToWindow()) {
            if (this.f8843N0 == null) {
                this.f8843N0 = new t(this);
            }
            this.f8843N0.f18370d = i7;
            return;
        }
        z zVar = this.f8834J;
        if (zVar != null && (vVar = zVar.f18416b) != null) {
            int i8 = this.f8844O;
            float f7 = -1;
            B.t tVar = (B.t) ((SparseArray) vVar.f966c).get(i7);
            if (tVar != null) {
                ArrayList arrayList = tVar.f957b;
                int i9 = tVar.f958c;
                if (f7 != -1.0f && f7 != -1.0f) {
                    Iterator it = arrayList.iterator();
                    B.u uVar = null;
                    while (true) {
                        if (!it.hasNext()) {
                            if (uVar != null) {
                                i8 = uVar.f963e;
                                break;
                            } else {
                                i8 = i9;
                                break;
                            }
                        }
                        B.u uVar2 = (B.u) it.next();
                        if (uVar2.a(f7, f7)) {
                            if (i8 == uVar2.f963e) {
                                break;
                            } else {
                                uVar = uVar2;
                            }
                        }
                    }
                } else if (i9 != i8) {
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            i8 = i9;
                            break;
                        }
                    } while (i8 != ((B.u) it2.next()).f963e);
                }
            } else {
                i8 = i7;
            }
            if (i8 != -1) {
                i7 = i8;
            }
        }
        int i10 = this.f8844O;
        if (i10 == i7) {
            return;
        }
        if (this.f8842N == i7) {
            k(0.0f);
            return;
        }
        if (this.f8846P == i7) {
            k(1.0f);
            return;
        }
        this.f8846P = i7;
        if (i10 != -1) {
            x(i10, i7);
            k(1.0f);
            this.f8862a0 = 0.0f;
            k(1.0f);
            this.f8845O0 = null;
            return;
        }
        this.f8869i0 = false;
        this.c0 = 1.0f;
        this.f8860W = 0.0f;
        this.f8862a0 = 0.0f;
        this.f8863b0 = getNanoTime();
        this.f8856U = getNanoTime();
        this.f8864d0 = false;
        this.f8836K = null;
        this.f8858V = this.f8834J.c() / 1000.0f;
        this.f8842N = -1;
        this.f8834J.n(-1, this.f8846P);
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        HashMap map = this.f8854T;
        map.clear();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            map.put(childAt, new n(childAt));
            sparseArray.put(childAt.getId(), (n) map.get(childAt));
        }
        this.f8865e0 = true;
        m mVarB = this.f8834J.b(i7);
        A a2 = this.f8853S0;
        a2.k(null, mVarB);
        u();
        a2.f();
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            n nVar = (n) map.get(childAt2);
            if (nVar != null) {
                w wVar = nVar.f18326f;
                wVar.f18388c = 0.0f;
                wVar.f18389d = 0.0f;
                wVar.f(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                p169z.l lVar = nVar.f18328h;
                lVar.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                lVar.f18305c = childAt2.getVisibility();
                lVar.f18303a = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                lVar.f18306d = childAt2.getElevation();
                lVar.f18307e = childAt2.getRotation();
                lVar.f18308f = childAt2.getRotationX();
                lVar.f18309x = childAt2.getRotationY();
                lVar.f18310y = childAt2.getScaleX();
                lVar.f18311z = childAt2.getScaleY();
                lVar.f18295A = childAt2.getPivotX();
                lVar.f18296B = childAt2.getPivotY();
                lVar.f18297C = childAt2.getTranslationX();
                lVar.f18298D = childAt2.getTranslationY();
                lVar.f18299E = childAt2.getTranslationZ();
            }
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f8883w0 != null) {
            for (int i13 = 0; i13 < childCount; i13++) {
                n nVar2 = (n) map.get(getChildAt(i13));
                if (nVar2 != null) {
                    this.f8834J.f(nVar2);
                }
            }
            Iterator it3 = this.f8883w0.iterator();
            while (it3.hasNext()) {
                ((MotionHelper) it3.next()).r(this, map);
            }
            for (int i14 = 0; i14 < childCount; i14++) {
                n nVar3 = (n) map.get(getChildAt(i14));
                if (nVar3 != null) {
                    nVar3.h(width, getNanoTime(), height);
                }
            }
        } else {
            for (int i15 = 0; i15 < childCount; i15++) {
                n nVar4 = (n) map.get(getChildAt(i15));
                if (nVar4 != null) {
                    this.f8834J.f(nVar4);
                    nVar4.h(width, getNanoTime(), height);
                }
            }
        }
        y yVar = this.f8834J.f18417c;
        float f8 = yVar != null ? yVar.f18406i : 0.0f;
        if (f8 != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i16 = 0; i16 < childCount; i16++) {
                w wVar2 = ((n) map.get(getChildAt(i16))).f18327g;
                float f9 = wVar2.f18391f + wVar2.f18390e;
                fMin = Math.min(fMin, f9);
                fMax = Math.max(fMax, f9);
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                n nVar5 = (n) map.get(getChildAt(i17));
                w wVar3 = nVar5.f18327g;
                float f10 = wVar3.f18390e;
                float f11 = wVar3.f18391f;
                nVar5.f18333n = 1.0f / (1.0f - f8);
                nVar5.f18332m = f8 - ((((f10 + f11) - fMin) * f8) / (fMax - fMin));
            }
        }
        this.f8860W = 0.0f;
        this.f8862a0 = 0.0f;
        this.f8865e0 = true;
        invalidate();
    }

    @Override // P.InterfaceC0363t
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        if (this.f8875o0 || i7 != 0 || i8 != 0) {
            iArr[0] = iArr[0] + i9;
            iArr[1] = iArr[1] + i10;
        }
        this.f8875o0 = false;
    }

    public void setTransition(y yVar) {
        B b7;
        z zVar = this.f8834J;
        zVar.f18417c = yVar;
        if (yVar != null && (b7 = yVar.f18408l) != null) {
            b7.c(zVar.f18429p);
        }
        setState(v.f18373b);
        int i7 = this.f8844O;
        y yVar2 = this.f8834J.f18417c;
        if (i7 == (yVar2 == null ? -1 : yVar2.f18400c)) {
            this.f8862a0 = 1.0f;
            this.f8860W = 1.0f;
            this.c0 = 1.0f;
        } else {
            this.f8862a0 = 0.0f;
            this.f8860W = 0.0f;
            this.c0 = 0.0f;
        }
        this.f8863b0 = (yVar.f18414r & 1) != 0 ? -1L : getNanoTime();
        int iH = this.f8834J.h();
        z zVar2 = this.f8834J;
        y yVar3 = zVar2.f18417c;
        int i8 = yVar3 != null ? yVar3.f18400c : -1;
        if (iH == this.f8842N && i8 == this.f8846P) {
            return;
        }
        this.f8842N = iH;
        this.f8846P = i8;
        zVar2.n(iH, i8);
        m mVarB = this.f8834J.b(this.f8842N);
        m mVarB2 = this.f8834J.b(this.f8846P);
        A a2 = this.f8853S0;
        a2.k(mVarB, mVarB2);
        int i9 = this.f8842N;
        int i10 = this.f8846P;
        a2.f1211a = i9;
        a2.f1212b = i10;
        a2.l();
        u();
    }
}
