package androidx.constraintlayout.motion.widget;

import B.e;
import B.h;
import B.m;
import C0.A;
import I4.j;
import P.C0350f;
import P.InterfaceC0363t;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
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
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import e1.k;
import io.sentry.cache.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p6.c;
import u.C1616e;
import u.i;
import u.l;
import v.C1654e;
import v.C1655f;
import w1.C1718l0;
import w1.L;
import y.C1791a;
import z.AbstractC1805c;
import z.B;
import z.C;
import z.C1803a;
import z.D;
import z.ViewOnTouchListenerC1802A;
import z.g;
import z.n;
import z.o;
import z.p;
import z.q;
import z.r;
import z.s;
import z.t;
import z.u;
import z.v;
import z.w;
import z.x;
import z.y;
import z.z;

/* loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements InterfaceC0363t {

    /* renamed from: Y0, reason: collision with root package name */
    public static boolean f8824Y0;

    /* renamed from: A0, reason: collision with root package name */
    public float f8825A0;

    /* renamed from: B0, reason: collision with root package name */
    public int f8826B0;

    /* renamed from: C0, reason: collision with root package name */
    public float f8827C0;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f8828D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f8829E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f8830F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f8831G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f8832H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f8833I0;

    /* renamed from: J, reason: collision with root package name */
    public z f8834J;

    /* renamed from: J0, reason: collision with root package name */
    public int f8835J0;

    /* renamed from: K, reason: collision with root package name */
    public o f8836K;

    /* renamed from: K0, reason: collision with root package name */
    public float f8837K0;

    /* renamed from: L, reason: collision with root package name */
    public Interpolator f8838L;

    /* renamed from: L0, reason: collision with root package name */
    public final C1616e f8839L0;

    /* renamed from: M, reason: collision with root package name */
    public float f8840M;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f8841M0;

    /* renamed from: N, reason: collision with root package name */
    public int f8842N;

    /* renamed from: N0, reason: collision with root package name */
    public t f8843N0;

    /* renamed from: O, reason: collision with root package name */
    public int f8844O;

    /* renamed from: O0, reason: collision with root package name */
    public f f8845O0;

    /* renamed from: P, reason: collision with root package name */
    public int f8846P;

    /* renamed from: P0, reason: collision with root package name */
    public final Rect f8847P0;

    /* renamed from: Q, reason: collision with root package name */
    public int f8848Q;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f8849Q0;

    /* renamed from: R, reason: collision with root package name */
    public int f8850R;

    /* renamed from: R0, reason: collision with root package name */
    public v f8851R0;

    /* renamed from: S, reason: collision with root package name */
    public boolean f8852S;

    /* renamed from: S0, reason: collision with root package name */
    public final A f8853S0;

    /* renamed from: T, reason: collision with root package name */
    public final HashMap f8854T;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f8855T0;

    /* renamed from: U, reason: collision with root package name */
    public long f8856U;

    /* renamed from: U0, reason: collision with root package name */
    public final RectF f8857U0;

    /* renamed from: V, reason: collision with root package name */
    public float f8858V;

    /* renamed from: V0, reason: collision with root package name */
    public View f8859V0;

    /* renamed from: W, reason: collision with root package name */
    public float f8860W;
    public Matrix W0;

    /* renamed from: X0, reason: collision with root package name */
    public final ArrayList f8861X0;

    /* renamed from: a0, reason: collision with root package name */
    public float f8862a0;

    /* renamed from: b0, reason: collision with root package name */
    public long f8863b0;
    public float c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f8864d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f8865e0;

    /* renamed from: f0, reason: collision with root package name */
    public u f8866f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f8867g0;

    /* renamed from: h0, reason: collision with root package name */
    public r f8868h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f8869i0;

    /* renamed from: j0, reason: collision with root package name */
    public final C1791a f8870j0;

    /* renamed from: k0, reason: collision with root package name */
    public final q f8871k0;

    /* renamed from: l0, reason: collision with root package name */
    public C1803a f8872l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f8873m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f8874n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f8875o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f8876p0;

    /* renamed from: q0, reason: collision with root package name */
    public float f8877q0;

    /* renamed from: r0, reason: collision with root package name */
    public long f8878r0;

    /* renamed from: s0, reason: collision with root package name */
    public float f8879s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f8880t0;

    /* renamed from: u0, reason: collision with root package name */
    public ArrayList f8881u0;

    /* renamed from: v0, reason: collision with root package name */
    public ArrayList f8882v0;

    /* renamed from: w0, reason: collision with root package name */
    public ArrayList f8883w0;

    /* renamed from: x0, reason: collision with root package name */
    public CopyOnWriteArrayList f8884x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f8885y0;

    /* renamed from: z0, reason: collision with root package name */
    public long f8886z0;

    public MotionLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        z zVar;
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
        C1791a c1791a = new C1791a();
        l lVar = new l();
        lVar.f16532k = false;
        c1791a.f18096a = lVar;
        c1791a.f18098c = lVar;
        this.f8870j0 = c1791a;
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
        this.f8839L0 = new C1616e(1);
        this.f8841M0 = false;
        this.f8845O0 = null;
        new HashMap();
        this.f8847P0 = new Rect();
        this.f8849Q0 = false;
        this.f8851R0 = v.f18366a;
        this.f8853S0 = new A(this);
        this.f8855T0 = false;
        this.f8857U0 = new RectF();
        this.f8859V0 = null;
        this.W0 = null;
        this.f8861X0 = new ArrayList();
        f8824Y0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, B.q.f946r);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z4 = true;
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 2) {
                    this.f8834J = new z(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f8844O = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.c0 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f8865e0 = true;
                } else if (index == 0) {
                    z4 = obtainStyledAttributes.getBoolean(index, z4);
                } else if (index == 5) {
                    if (this.f8867g0 == 0) {
                        this.f8867g0 = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f8867g0 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
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
                int h6 = zVar2.h();
                z zVar3 = this.f8834J;
                m b7 = zVar3.b(zVar3.h());
                String f7 = c.f(h6, getContext());
                int childCount = getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = getChildAt(i9);
                    int id = childAt.getId();
                    if (id == -1) {
                        StringBuilder k7 = k.k("CHECK: ", f7, " ALL VIEWS SHOULD HAVE ID's ");
                        k7.append(childAt.getClass().getName());
                        k7.append(" does not!");
                        Log.w("MotionLayout", k7.toString());
                    }
                    if (b7.i(id) == null) {
                        StringBuilder k8 = k.k("CHECK: ", f7, " NO CONSTRAINTS for ");
                        k8.append(c.g(childAt));
                        Log.w("MotionLayout", k8.toString());
                    }
                }
                Integer[] numArr = (Integer[]) b7.f912f.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i10 = 0; i10 < length; i10++) {
                    iArr[i10] = numArr[i10].intValue();
                }
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = iArr[i11];
                    String f8 = c.f(i12, getContext());
                    if (findViewById(iArr[i11]) == null) {
                        Log.w("MotionLayout", "CHECK: " + f7 + " NO View matches id " + f8);
                    }
                    if (b7.h(i12).f801e.f837d == -1) {
                        Log.w("MotionLayout", L.j("CHECK: ", f7, "(", f8, ") no LAYOUT_HEIGHT"));
                    }
                    if (b7.h(i12).f801e.f836c == -1) {
                        Log.w("MotionLayout", L.j("CHECK: ", f7, "(", f8, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                Iterator it = this.f8834J.f18412d.iterator();
                while (it.hasNext()) {
                    y yVar = (y) it.next();
                    if (yVar == this.f8834J.f18411c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (yVar.f18395d == yVar.f18394c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i13 = yVar.f18395d;
                    int i14 = yVar.f18394c;
                    String f9 = c.f(i13, getContext());
                    String f10 = c.f(i14, getContext());
                    if (sparseIntArray.get(i13) == i14) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + f9 + "->" + f10);
                    }
                    if (sparseIntArray2.get(i14) == i13) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + f9 + "->" + f10);
                    }
                    sparseIntArray.put(i13, i14);
                    sparseIntArray2.put(i14, i13);
                    if (this.f8834J.b(i13) == null) {
                        L.n(" no such constraintSetStart ", f9, "MotionLayout");
                    }
                    if (this.f8834J.b(i14) == null) {
                        L.n(" no such constraintSetEnd ", f9, "MotionLayout");
                    }
                }
            }
        }
        if (this.f8844O != -1 || (zVar = this.f8834J) == null) {
            return;
        }
        this.f8844O = zVar.h();
        this.f8842N = this.f8834J.h();
        y yVar2 = this.f8834J.f18411c;
        this.f8846P = yVar2 != null ? yVar2.f18394c : -1;
    }

    public static Rect j(MotionLayout motionLayout, C1654e c1654e) {
        motionLayout.getClass();
        int t7 = c1654e.t();
        Rect rect = motionLayout.f8847P0;
        rect.top = t7;
        rect.left = c1654e.s();
        rect.right = c1654e.r() + rect.left;
        rect.bottom = c1654e.l() + rect.top;
        return rect;
    }

    public final void A(int i7, m mVar) {
        z zVar = this.f8834J;
        if (zVar != null) {
            zVar.f18415g.put(i7, mVar);
        }
        this.f8853S0.k(this.f8834J.b(this.f8842N), this.f8834J.b(this.f8846P));
        u();
        if (this.f8844O == i7) {
            mVar.b(this);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x035c  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(android.graphics.Canvas r35) {
        /*
            Method dump skipped, instructions count: 1323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
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
        SparseArray sparseArray = zVar.f18415g;
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
        return zVar.f18412d;
    }

    public C1803a getDesignTool() {
        if (this.f8872l0 == null) {
            this.f8872l0 = new C1803a();
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
        MotionLayout motionLayout = tVar.f18365e;
        tVar.f18364d = motionLayout.f8846P;
        tVar.f18363c = motionLayout.f8842N;
        tVar.f18362b = motionLayout.getVelocity();
        tVar.f18361a = motionLayout.getProgress();
        t tVar2 = this.f8843N0;
        tVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", tVar2.f18361a);
        bundle.putFloat("motion.velocity", tVar2.f18362b);
        bundle.putInt("motion.StartState", tVar2.f18363c);
        bundle.putInt("motion.EndState", tVar2.f18364d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        if (this.f8834J != null) {
            this.f8858V = r0.c() / 1000.0f;
        }
        return (long) (this.f8858V * 1000.0f);
    }

    public float getVelocity() {
        return this.f8840M;
    }

    public final void k(float f7) {
        if (this.f8834J == null) {
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
        this.f8858V = r0.c() / 1000.0f;
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
                "button".equals(c.g(nVar.f18316b));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(boolean z4) {
        boolean z7;
        char c3;
        v vVar;
        int childCount;
        Interpolator interpolator;
        int i7;
        int i8;
        int i9;
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
            float signum = Math.signum(this.c0 - f7);
            long nanoTime = getNanoTime();
            o oVar = this.f8836K;
            float f8 = oVar == null ? (((nanoTime - this.f8863b0) * signum) * 1.0E-9f) / this.f8858V : 0.0f;
            float f9 = this.f8862a0 + f8;
            if (this.f8864d0) {
                f9 = this.c0;
            }
            if ((signum <= 0.0f || f9 < this.c0) && (signum > 0.0f || f9 > this.c0)) {
                z7 = false;
            } else {
                f9 = this.c0;
                this.f8865e0 = false;
                z7 = true;
            }
            this.f8862a0 = f9;
            this.f8860W = f9;
            this.f8863b0 = nanoTime;
            if (oVar == null || z7) {
                this.f8840M = f8;
            } else if (this.f8869i0) {
                float interpolation = oVar.getInterpolation((nanoTime - this.f8856U) * 1.0E-9f);
                o oVar2 = this.f8836K;
                C1791a c1791a = this.f8870j0;
                c3 = oVar2 == c1791a ? c1791a.f18098c.a() ? (char) 2 : (char) 1 : (char) 0;
                this.f8862a0 = interpolation;
                this.f8863b0 = nanoTime;
                o oVar3 = this.f8836K;
                if (oVar3 != null) {
                    float a2 = oVar3.a();
                    this.f8840M = a2;
                    if (Math.abs(a2) * this.f8858V <= 1.0E-5f && c3 == 2) {
                        this.f8865e0 = false;
                    }
                    if (a2 > 0.0f && interpolation >= 1.0f) {
                        this.f8862a0 = 1.0f;
                        this.f8865e0 = false;
                        interpolation = 1.0f;
                    }
                    if (a2 < 0.0f && interpolation <= 0.0f) {
                        this.f8862a0 = 0.0f;
                        this.f8865e0 = false;
                        f9 = 0.0f;
                        if (Math.abs(this.f8840M) > 1.0E-5f) {
                            setState(v.f18368c);
                        }
                        vVar = v.f18369d;
                        if (c3 != 1) {
                            if ((signum > 0.0f && f9 >= this.c0) || (signum <= 0.0f && f9 <= this.c0)) {
                                f9 = this.c0;
                                this.f8865e0 = false;
                            }
                            if (f9 >= 1.0f || f9 <= 0.0f) {
                                this.f8865e0 = false;
                                setState(vVar);
                            }
                        }
                        childCount = getChildCount();
                        this.f8880t0 = false;
                        long nanoTime2 = getNanoTime();
                        this.f8837K0 = f9;
                        Interpolator interpolator2 = this.f8838L;
                        float interpolation2 = interpolator2 == null ? f9 : interpolator2.getInterpolation(f9);
                        interpolator = this.f8838L;
                        if (interpolator != null) {
                            float interpolation3 = interpolator.getInterpolation((signum / this.f8858V) + f9);
                            this.f8840M = interpolation3;
                            this.f8840M = interpolation3 - this.f8838L.getInterpolation(f9);
                        }
                        i7 = 0;
                        while (i7 < childCount) {
                            View childAt = getChildAt(i7);
                            n nVar = (n) this.f8854T.get(childAt);
                            if (nVar != null) {
                                i9 = i7;
                                this.f8880t0 = nVar.e(interpolation2, nanoTime2, childAt, this.f8839L0) | this.f8880t0;
                            } else {
                                i9 = i7;
                            }
                            i7 = i9 + 1;
                        }
                        boolean z10 = (signum <= 0.0f && f9 >= this.c0) || (signum <= 0.0f && f9 <= this.c0);
                        if (!this.f8880t0 && !this.f8865e0 && z10) {
                            setState(vVar);
                        }
                        if (this.f8828D0) {
                            requestLayout();
                        }
                        this.f8880t0 = (!z10) | this.f8880t0;
                        if (f9 <= 0.0f || (i8 = this.f8842N) == -1 || this.f8844O == i8) {
                            z9 = false;
                        } else {
                            this.f8844O = i8;
                            this.f8834J.b(i8).a(this);
                            setState(vVar);
                            z9 = true;
                        }
                        if (f9 >= 1.0d) {
                            int i10 = this.f8844O;
                            int i11 = this.f8846P;
                            if (i10 != i11) {
                                this.f8844O = i11;
                                this.f8834J.b(i11).a(this);
                                setState(vVar);
                                z9 = true;
                            }
                        }
                        if (!this.f8880t0 || this.f8865e0) {
                            invalidate();
                        } else if ((signum > 0.0f && f9 == 1.0f) || (signum < 0.0f && f9 == 0.0f)) {
                            setState(vVar);
                        }
                        if (!this.f8880t0 && !this.f8865e0 && ((signum > 0.0f && f9 == 1.0f) || (signum < 0.0f && f9 == 0.0f))) {
                            s();
                        }
                    }
                }
                f9 = interpolation;
                if (Math.abs(this.f8840M) > 1.0E-5f) {
                }
                vVar = v.f18369d;
                if (c3 != 1) {
                }
                childCount = getChildCount();
                this.f8880t0 = false;
                long nanoTime22 = getNanoTime();
                this.f8837K0 = f9;
                Interpolator interpolator22 = this.f8838L;
                if (interpolator22 == null) {
                }
                interpolator = this.f8838L;
                if (interpolator != null) {
                }
                i7 = 0;
                while (i7 < childCount) {
                }
                if (signum <= 0.0f) {
                }
                if (!this.f8880t0) {
                    setState(vVar);
                }
                if (this.f8828D0) {
                }
                this.f8880t0 = (!z10) | this.f8880t0;
                if (f9 <= 0.0f) {
                }
                z9 = false;
                if (f9 >= 1.0d) {
                }
                if (this.f8880t0) {
                }
                invalidate();
                if (!this.f8880t0) {
                    s();
                }
            } else {
                float interpolation4 = oVar.getInterpolation(f9);
                o oVar4 = this.f8836K;
                if (oVar4 != null) {
                    this.f8840M = oVar4.a();
                } else {
                    this.f8840M = ((oVar4.getInterpolation(f9 + f8) - interpolation4) * signum) / f8;
                }
                f9 = interpolation4;
            }
            c3 = 0;
            if (Math.abs(this.f8840M) > 1.0E-5f) {
            }
            vVar = v.f18369d;
            if (c3 != 1) {
            }
            childCount = getChildCount();
            this.f8880t0 = false;
            long nanoTime222 = getNanoTime();
            this.f8837K0 = f9;
            Interpolator interpolator222 = this.f8838L;
            if (interpolator222 == null) {
            }
            interpolator = this.f8838L;
            if (interpolator != null) {
            }
            i7 = 0;
            while (i7 < childCount) {
            }
            if (signum <= 0.0f) {
            }
            if (!this.f8880t0) {
            }
            if (this.f8828D0) {
            }
            this.f8880t0 = (!z10) | this.f8880t0;
            if (f9 <= 0.0f) {
            }
            z9 = false;
            if (f9 >= 1.0d) {
            }
            if (this.f8880t0) {
            }
            invalidate();
            if (!this.f8880t0) {
            }
        }
        float f10 = this.f8862a0;
        if (f10 < 1.0f) {
            if (f10 <= 0.0f) {
                int i12 = this.f8844O;
                int i13 = this.f8842N;
                z8 = i12 == i13 ? z9 : true;
                this.f8844O = i13;
            }
            this.f8855T0 |= z9;
            if (z9 && !this.f8841M0) {
                requestLayout();
            }
            this.f8860W = this.f8862a0;
        }
        int i14 = this.f8844O;
        int i15 = this.f8846P;
        z8 = i14 == i15 ? z9 : true;
        this.f8844O = i15;
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
            int intValue = !arrayList.isEmpty() ? ((Integer) arrayList.get(arrayList.size() - 1)).intValue() : -1;
            int i7 = this.f8844O;
            if (intValue != i7 && i7 != -1) {
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
            m b7 = zVar.b(i7);
            z zVar2 = this.f8834J;
            int i8 = 0;
            loop0: while (true) {
                SparseArray sparseArray = zVar2.f18415g;
                if (i8 >= sparseArray.size()) {
                    break;
                }
                int keyAt = sparseArray.keyAt(i8);
                SparseIntArray sparseIntArray = zVar2.f18417i;
                int i9 = sparseIntArray.get(keyAt);
                int size = sparseIntArray.size();
                while (i9 > 0) {
                    if (i9 == keyAt) {
                        break loop0;
                    }
                    int i10 = size - 1;
                    if (size < 0) {
                        break loop0;
                    }
                    i9 = sparseIntArray.get(i9);
                    size = i10;
                }
                zVar2.m(keyAt, this);
                i8++;
            }
            Log.e("MotionScene", "Cannot be derived from yourself");
            ArrayList arrayList = this.f8883w0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((MotionHelper) it.next()).getClass();
                }
            }
            if (b7 != null) {
                b7.b(this);
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
        if (zVar3 == null || (yVar = zVar3.f18411c) == null || yVar.f18404n != 4) {
            return;
        }
        k(1.0f);
        this.f8845O0 = null;
        setState(v.f18367b);
        setState(v.f18368c);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00fb  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        B b7;
        int i7;
        RectF b8;
        MotionLayout motionLayout;
        int currentState;
        Iterator it;
        j jVar;
        D d7;
        boolean z4;
        int i8;
        Rect rect;
        float f7;
        char c3;
        Interpolator loadInterpolator;
        Interpolator accelerateDecelerateInterpolator;
        z zVar = this.f8834J;
        if (zVar == null || !this.f8852S) {
            return false;
        }
        j jVar2 = zVar.f18424q;
        if (jVar2 != null && (currentState = (motionLayout = (MotionLayout) jVar2.f3678b).getCurrentState()) != -1) {
            HashSet hashSet = (HashSet) jVar2.f3679c;
            ArrayList arrayList = (ArrayList) jVar2.f3680d;
            if (hashSet == null) {
                jVar2.f3679c = new HashSet();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    D d8 = (D) it2.next();
                    int childCount = motionLayout.getChildCount();
                    for (int i9 = 0; i9 < childCount; i9++) {
                        View childAt = motionLayout.getChildAt(i9);
                        if (d8.a(childAt)) {
                            childAt.getId();
                            ((HashSet) jVar2.f3679c).add(childAt);
                        }
                    }
                }
            }
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            Rect rect2 = new Rect();
            int action = motionEvent.getAction();
            ArrayList arrayList2 = (ArrayList) jVar2.f3681e;
            boolean z7 = true;
            int i10 = 2;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                Iterator it3 = ((ArrayList) jVar2.f3681e).iterator();
                while (it3.hasNext()) {
                    C c4 = (C) it3.next();
                    if (action != 1) {
                        if (action != 2) {
                            c4.getClass();
                        } else {
                            View view = c4.f18229c.f18316b;
                            Rect rect3 = c4.f18237l;
                            view.getHitRect(rect3);
                            if (!rect3.contains((int) x4, (int) y4) && !c4.f18234h) {
                                c4.b();
                            }
                        }
                    } else if (!c4.f18234h) {
                        c4.b();
                    }
                }
            }
            if (action == 0 || action == 1) {
                z zVar2 = motionLayout.f8834J;
                m b9 = zVar2 == null ? null : zVar2.b(currentState);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    D d9 = (D) it4.next();
                    int i11 = d9.f18240b;
                    if (i11 == z7) {
                        if (action != 0) {
                            z7 = z7;
                            y4 = y4;
                            jVar2 = jVar2;
                            action = action;
                            rect2 = rect2;
                            i10 = 2;
                        }
                        it = ((HashSet) jVar2.f3679c).iterator();
                        while (it.hasNext()) {
                            View view2 = (View) it.next();
                            if (d9.a(view2)) {
                                view2.getHitRect(rect2);
                                if (rect2.contains((int) x4, (int) y4)) {
                                    View[] viewArr = {view2};
                                    if (!d9.f18241c) {
                                        int i12 = d9.f18243e;
                                        g gVar = d9.f18244f;
                                        if (i12 == i10) {
                                            View view3 = viewArr[0];
                                            n nVar = new n(view3);
                                            w wVar = nVar.f18320f;
                                            wVar.f18382c = 0.0f;
                                            wVar.f18383d = 0.0f;
                                            nVar.f18314G = z7;
                                            int i13 = action;
                                            rect = rect2;
                                            wVar.f(view3.getX(), view3.getY(), view3.getWidth(), view3.getHeight());
                                            nVar.f18321g.f(view3.getX(), view3.getY(), view3.getWidth(), view3.getHeight());
                                            z.l lVar = nVar.f18322h;
                                            lVar.getClass();
                                            view3.getX();
                                            view3.getY();
                                            view3.getWidth();
                                            view3.getHeight();
                                            lVar.f18299c = view3.getVisibility();
                                            lVar.f18297a = view3.getVisibility() != 0 ? 0.0f : view3.getAlpha();
                                            lVar.f18300d = view3.getElevation();
                                            lVar.f18301e = view3.getRotation();
                                            lVar.f18302f = view3.getRotationX();
                                            lVar.f18303x = view3.getRotationY();
                                            lVar.f18304y = view3.getScaleX();
                                            lVar.f18305z = view3.getScaleY();
                                            lVar.f18289A = view3.getPivotX();
                                            lVar.f18290B = view3.getPivotY();
                                            lVar.f18291C = view3.getTranslationX();
                                            lVar.f18292D = view3.getTranslationY();
                                            lVar.f18293E = view3.getTranslationZ();
                                            z.l lVar2 = nVar.f18323i;
                                            lVar2.getClass();
                                            view3.getX();
                                            view3.getY();
                                            view3.getWidth();
                                            view3.getHeight();
                                            lVar2.f18299c = view3.getVisibility();
                                            lVar2.f18297a = view3.getVisibility() != 0 ? 0.0f : view3.getAlpha();
                                            lVar2.f18300d = view3.getElevation();
                                            lVar2.f18301e = view3.getRotation();
                                            lVar2.f18302f = view3.getRotationX();
                                            lVar2.f18303x = view3.getRotationY();
                                            lVar2.f18304y = view3.getScaleX();
                                            lVar2.f18305z = view3.getScaleY();
                                            lVar2.f18289A = view3.getPivotX();
                                            lVar2.f18290B = view3.getPivotY();
                                            lVar2.f18291C = view3.getTranslationX();
                                            lVar2.f18292D = view3.getTranslationY();
                                            lVar2.f18293E = view3.getTranslationZ();
                                            ArrayList arrayList3 = (ArrayList) gVar.f18279a.get(-1);
                                            if (arrayList3 != null) {
                                                nVar.f18336w.addAll(arrayList3);
                                            }
                                            nVar.h(motionLayout.getWidth(), System.nanoTime(), motionLayout.getHeight());
                                            int i14 = d9.f18246h;
                                            int i15 = d9.f18247i;
                                            int i16 = d9.f18240b;
                                            Context context = motionLayout.getContext();
                                            int i17 = d9.f18249l;
                                            if (i17 != -2) {
                                                if (i17 != -1) {
                                                    if (i17 == 0) {
                                                        accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
                                                    } else if (i17 == 1) {
                                                        accelerateDecelerateInterpolator = new AccelerateInterpolator();
                                                    } else if (i17 == 2) {
                                                        accelerateDecelerateInterpolator = new DecelerateInterpolator();
                                                    } else if (i17 == 4) {
                                                        accelerateDecelerateInterpolator = new BounceInterpolator();
                                                    } else if (i17 == 5) {
                                                        accelerateDecelerateInterpolator = new OvershootInterpolator();
                                                    } else if (i17 != 6) {
                                                        c3 = 2;
                                                        loadInterpolator = null;
                                                    } else {
                                                        accelerateDecelerateInterpolator = new AnticipateInterpolator();
                                                    }
                                                    loadInterpolator = accelerateDecelerateInterpolator;
                                                } else {
                                                    loadInterpolator = new z.m(C1616e.d(d9.f18250m), 2);
                                                }
                                                c3 = 2;
                                            } else {
                                                c3 = 2;
                                                loadInterpolator = AnimationUtils.loadInterpolator(context, d9.f18251n);
                                            }
                                            f7 = y4;
                                            j jVar3 = jVar2;
                                            jVar = jVar2;
                                            d7 = d9;
                                            z4 = true;
                                            i8 = i13;
                                            new C(jVar3, nVar, i14, i15, i16, loadInterpolator, d9.f18253p, d9.f18254q);
                                        } else {
                                            jVar = jVar2;
                                            d7 = d9;
                                            z4 = z7;
                                            i8 = action;
                                            rect = rect2;
                                            f7 = y4;
                                            h hVar = d7.f18245g;
                                            if (i12 == z4) {
                                                for (int i18 : motionLayout.getConstraintSetIds()) {
                                                    if (i18 != currentState) {
                                                        z zVar3 = motionLayout.f8834J;
                                                        h i19 = (zVar3 == null ? null : zVar3.b(i18)).i(viewArr[0].getId());
                                                        if (hVar != null) {
                                                            B.g gVar2 = hVar.f804h;
                                                            if (gVar2 != null) {
                                                                gVar2.e(i19);
                                                            }
                                                            i19.f803g.putAll(hVar.f803g);
                                                        }
                                                    }
                                                }
                                            }
                                            m mVar = new m();
                                            HashMap hashMap = mVar.f912f;
                                            hashMap.clear();
                                            for (Integer num : b9.f912f.keySet()) {
                                                h hVar2 = (h) b9.f912f.get(num);
                                                if (hVar2 != null) {
                                                    hashMap.put(num, hVar2.clone());
                                                }
                                            }
                                            h i20 = mVar.i(viewArr[0].getId());
                                            if (hVar != null) {
                                                B.g gVar3 = hVar.f804h;
                                                if (gVar3 != null) {
                                                    gVar3.e(i20);
                                                }
                                                i20.f803g.putAll(hVar.f803g);
                                            }
                                            motionLayout.A(currentState, mVar);
                                            motionLayout.A(R.id.view_transition, b9);
                                            motionLayout.w(R.id.view_transition);
                                            y yVar = new y(motionLayout.f8834J, currentState);
                                            View view4 = viewArr[0];
                                            int i21 = d7.f18246h;
                                            if (i21 != -1) {
                                                yVar.f18399h = Math.max(i21, 8);
                                            }
                                            yVar.f18406p = d7.f18242d;
                                            int i22 = d7.f18249l;
                                            String str = d7.f18250m;
                                            int i23 = d7.f18251n;
                                            yVar.f18396e = i22;
                                            yVar.f18397f = str;
                                            yVar.f18398g = i23;
                                            int id = view4.getId();
                                            if (gVar != null) {
                                                ArrayList arrayList4 = (ArrayList) gVar.f18279a.get(-1);
                                                g gVar4 = new g();
                                                gVar4.f18279a = new HashMap();
                                                Iterator it5 = arrayList4.iterator();
                                                while (it5.hasNext()) {
                                                    AbstractC1805c clone = ((AbstractC1805c) it5.next()).clone();
                                                    clone.f18260b = id;
                                                    gVar4.b(clone);
                                                }
                                                yVar.f18401k.add(gVar4);
                                            }
                                            motionLayout.setTransition(yVar);
                                            f fVar = new f(11, d7, viewArr);
                                            motionLayout.k(1.0f);
                                            motionLayout.f8845O0 = fVar;
                                        }
                                        d9 = d7;
                                        z7 = z4;
                                        y4 = f7;
                                        jVar2 = jVar;
                                        action = i8;
                                        rect2 = rect;
                                        i10 = 2;
                                    }
                                }
                                jVar = jVar2;
                                d7 = d9;
                                z4 = z7;
                                i8 = action;
                                rect = rect2;
                                f7 = y4;
                                d9 = d7;
                                z7 = z4;
                                y4 = f7;
                                jVar2 = jVar;
                                action = i8;
                                rect2 = rect;
                                i10 = 2;
                            }
                        }
                        z7 = z7;
                        y4 = y4;
                        jVar2 = jVar2;
                        action = action;
                        rect2 = rect2;
                        i10 = 2;
                    } else if (i11 == i10) {
                        if (action != z7) {
                            z7 = z7;
                            y4 = y4;
                            jVar2 = jVar2;
                            action = action;
                            rect2 = rect2;
                            i10 = 2;
                        }
                        it = ((HashSet) jVar2.f3679c).iterator();
                        while (it.hasNext()) {
                        }
                        z7 = z7;
                        y4 = y4;
                        jVar2 = jVar2;
                        action = action;
                        rect2 = rect2;
                        i10 = 2;
                    } else {
                        if (i11 == 3) {
                            if (action != 0) {
                            }
                            it = ((HashSet) jVar2.f3679c).iterator();
                            while (it.hasNext()) {
                            }
                        }
                        z7 = z7;
                        y4 = y4;
                        jVar2 = jVar2;
                        action = action;
                        rect2 = rect2;
                        i10 = 2;
                    }
                }
            }
        }
        y yVar2 = this.f8834J.f18411c;
        if (yVar2 != null && !yVar2.f18405o && (b7 = yVar2.f18402l) != null && ((motionEvent.getAction() != 0 || (b8 = b7.b(this, new RectF())) == null || b8.contains(motionEvent.getX(), motionEvent.getY())) && (i7 = b7.f18206e) != -1)) {
            View view5 = this.f8859V0;
            if (view5 == null || view5.getId() != i7) {
                this.f8859V0 = findViewById(i7);
            }
            if (this.f8859V0 != null) {
                RectF rectF = this.f8857U0;
                rectF.set(r1.getLeft(), this.f8859V0.getTop(), this.f8859V0.getRight(), this.f8859V0.getBottom());
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
        int h6 = this.f8834J.h();
        y yVar = this.f8834J.f18411c;
        int i9 = yVar == null ? -1 : yVar.f18394c;
        C1655f c1655f = this.f9009c;
        A a2 = this.f8853S0;
        if ((!z8 && h6 == a2.f1211a && i9 == a2.f1212b) || this.f8842N == -1) {
            if (z8) {
                super.onMeasure(i7, i8);
            }
            z4 = true;
        } else {
            super.onMeasure(i7, i8);
            a2.k(this.f8834J.b(h6), this.f8834J.b(i9));
            a2.l();
            a2.f1211a = h6;
            a2.f1212b = i9;
            z4 = false;
        }
        if (this.f8828D0 || z4) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int r7 = c1655f.r() + getPaddingRight() + getPaddingLeft();
            int l7 = c1655f.l() + paddingBottom;
            int i10 = this.f8833I0;
            if (i10 == Integer.MIN_VALUE || i10 == 0) {
                r7 = (int) ((this.f8837K0 * (this.f8831G0 - r1)) + this.f8829E0);
                requestLayout();
            }
            int i11 = this.f8835J0;
            if (i11 == Integer.MIN_VALUE || i11 == 0) {
                l7 = (int) ((this.f8837K0 * (this.f8832H0 - r2)) + this.f8830F0);
                requestLayout();
            }
            setMeasuredDimension(r7, l7);
        }
        float signum = Math.signum(this.c0 - this.f8862a0);
        long nanoTime = getNanoTime();
        o oVar = this.f8836K;
        float f7 = this.f8862a0 + (!(oVar instanceof C1791a) ? (((nanoTime - this.f8863b0) * signum) * 1.0E-9f) / this.f8858V : 0.0f);
        if (this.f8864d0) {
            f7 = this.c0;
        }
        if ((signum <= 0.0f || f7 < this.c0) && (signum > 0.0f || f7 > this.c0)) {
            z7 = false;
        } else {
            f7 = this.c0;
        }
        if (oVar != null && !z7) {
            f7 = this.f8869i0 ? oVar.getInterpolation((nanoTime - this.f8856U) * 1.0E-9f) : oVar.getInterpolation(f7);
        }
        if ((signum > 0.0f && f7 >= this.c0) || (signum <= 0.0f && f7 <= this.c0)) {
            f7 = this.c0;
        }
        this.f8837K0 = f7;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.f8838L;
        if (interpolator != null) {
            f7 = interpolator.getInterpolation(f7);
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            n nVar = (n) this.f8854T.get(childAt);
            if (nVar != null) {
                nVar.e(f7, nanoTime2, childAt, this.f8839L0);
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
        ?? r12;
        B b7;
        float f7;
        B b8;
        B b9;
        B b10;
        int i10;
        z zVar = this.f8834J;
        if (zVar == null || (yVar = zVar.f18411c) == null || (z4 = yVar.f18405o)) {
            return;
        }
        int i11 = -1;
        if (z4 || (b10 = yVar.f18402l) == null || (i10 = b10.f18206e) == -1 || view.getId() == i10) {
            y yVar2 = zVar.f18411c;
            if ((yVar2 == null || (b9 = yVar2.f18402l) == null) ? false : b9.f18221u) {
                B b11 = yVar.f18402l;
                if (b11 != null && (b11.f18223w & 4) != 0) {
                    i11 = i8;
                }
                float f8 = this.f8860W;
                if ((f8 == 1.0f || f8 == 0.0f) && view.canScrollVertically(i11)) {
                    return;
                }
            }
            B b12 = yVar.f18402l;
            if (b12 != null && (b12.f18223w & 1) != 0) {
                float f9 = i7;
                float f10 = i8;
                y yVar3 = zVar.f18411c;
                if (yVar3 == null || (b8 = yVar3.f18402l) == null) {
                    f7 = 0.0f;
                } else {
                    b8.f18218r.p(b8.f18205d, b8.f18218r.getProgress(), b8.f18209h, b8.f18208g, b8.f18214n);
                    float f11 = b8.f18211k;
                    float[] fArr = b8.f18214n;
                    if (f11 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f7 = (f9 * f11) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f7 = (f10 * b8.f18212l) / fArr[1];
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
            y yVar4 = zVar.f18411c;
            if (yVar4 != null && (b7 = yVar4.f18402l) != null) {
                MotionLayout motionLayout = b7.f18218r;
                float progress = motionLayout.getProgress();
                if (!b7.f18213m) {
                    b7.f18213m = true;
                    motionLayout.setProgress(progress);
                }
                b7.f18218r.p(b7.f18205d, progress, b7.f18209h, b7.f18208g, b7.f18214n);
                float f16 = b7.f18211k;
                float[] fArr2 = b7.f18214n;
                if (Math.abs((b7.f18212l * fArr2[1]) + (f16 * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f17 = b7.f18211k;
                float max = Math.max(Math.min(progress + (f17 != 0.0f ? (f14 * f17) / fArr2[0] : (f15 * b7.f18212l) / fArr2[1]), 1.0f), 0.0f);
                if (max != motionLayout.getProgress()) {
                    motionLayout.setProgress(max);
                }
            }
            if (f13 != this.f8860W) {
                iArr[0] = i7;
                r12 = 1;
                iArr[1] = i8;
            } else {
                r12 = 1;
            }
            m(false);
            if (iArr[0] == 0 && iArr[r12] == 0) {
                return;
            }
            this.f8875o0 = r12;
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
            boolean e7 = e();
            zVar.f18423p = e7;
            y yVar = zVar.f18411c;
            if (yVar == null || (b7 = yVar.f18402l) == null) {
                return;
            }
            b7.c(e7);
        }
    }

    @Override // P.InterfaceC0362s
    public final boolean onStartNestedScroll(View view, View view2, int i7, int i8) {
        y yVar;
        B b7;
        z zVar = this.f8834J;
        return (zVar == null || (yVar = zVar.f18411c) == null || (b7 = yVar.f18402l) == null || (b7.f18223w & 2) != 0) ? false : true;
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
            y yVar = zVar.f18411c;
            if (yVar == null || (b7 = yVar.f18402l) == null) {
                return;
            }
            b7.f18213m = false;
            MotionLayout motionLayout = b7.f18218r;
            float progress = motionLayout.getProgress();
            b7.f18218r.p(b7.f18205d, progress, b7.f18209h, b7.f18208g, b7.f18214n);
            float f10 = b7.f18211k;
            float[] fArr = b7.f18214n;
            float f11 = f10 != 0.0f ? (f8 * f10) / fArr[0] : (f9 * b7.f18212l) / fArr[1];
            if (!Float.isNaN(f11)) {
                progress += f11 / 3.0f;
            }
            if (progress != 0.0f) {
                boolean z4 = progress != 1.0f;
                int i8 = b7.f18204c;
                if ((i8 != 3) && z4) {
                    motionLayout.y(((double) progress) >= 0.5d ? 1.0f : 0.0f, f11, i8);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x07d5 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z zVar;
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
        float f8;
        int i9;
        char c10;
        y yVar;
        MotionEvent motionEvent2;
        RectF rectF;
        y yVar2;
        int i10;
        Iterator it;
        RectF rectF2;
        RectF rectF3;
        y yVar3;
        float f9;
        float f10;
        MotionLayout motionLayout = this;
        z zVar2 = motionLayout.f8834J;
        if (zVar2 == null || !motionLayout.f8852S || !zVar2.o()) {
            return super.onTouchEvent(motionEvent);
        }
        z zVar3 = motionLayout.f8834J;
        y yVar4 = zVar3.f18411c;
        if (yVar4 != null && yVar4.f18405o) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        RectF rectF4 = new RectF();
        s sVar3 = zVar3.f18422o;
        MotionLayout motionLayout2 = zVar3.f18409a;
        if (sVar3 == null) {
            motionLayout2.getClass();
            s sVar4 = s.f18359b;
            sVar4.f18360a = VelocityTracker.obtain();
            zVar3.f18422o = sVar4;
        }
        VelocityTracker velocityTracker = zVar3.f18422o.f18360a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (currentState != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                zVar3.f18425r = motionEvent.getRawX();
                zVar3.f18426s = motionEvent.getRawY();
                zVar3.f18419l = motionEvent;
                zVar3.f18420m = false;
                B b8 = zVar3.f18411c.f18402l;
                if (b8 != null) {
                    RectF a2 = b8.a(motionLayout2, rectF4);
                    if (a2 == null || a2.contains(zVar3.f18419l.getX(), zVar3.f18419l.getY())) {
                        RectF b9 = zVar3.f18411c.f18402l.b(motionLayout2, rectF4);
                        if (b9 == null || b9.contains(zVar3.f18419l.getX(), zVar3.f18419l.getY())) {
                            zVar3.f18421n = false;
                        } else {
                            zVar3.f18421n = true;
                        }
                        B b10 = zVar3.f18411c.f18402l;
                        float f11 = zVar3.f18425r;
                        float f12 = zVar3.f18426s;
                        b10.f18216p = f11;
                        b10.f18217q = f12;
                    } else {
                        zVar3.f18419l = null;
                        zVar3.f18420m = true;
                    }
                }
            } else if (action == 2 && !zVar3.f18420m) {
                float rawY = motionEvent.getRawY() - zVar3.f18426s;
                float rawX = motionEvent.getRawX() - zVar3.f18425r;
                if ((rawX != 0.0d || rawY != 0.0d) && (motionEvent2 = zVar3.f18419l) != null) {
                    if (currentState != -1) {
                        B.v vVar = zVar3.f18410b;
                        if (vVar == null || (i10 = vVar.p(currentState)) == -1) {
                            i10 = currentState;
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = zVar3.f18412d.iterator();
                        while (it2.hasNext()) {
                            y yVar5 = (y) it2.next();
                            if (yVar5.f18395d == i10 || yVar5.f18394c == i10) {
                                arrayList.add(yVar5);
                            }
                        }
                        RectF rectF5 = new RectF();
                        Iterator it3 = arrayList.iterator();
                        float f13 = 0.0f;
                        yVar2 = null;
                        while (it3.hasNext()) {
                            y yVar6 = (y) it3.next();
                            if (yVar6.f18405o) {
                                it = it3;
                            } else {
                                B b11 = yVar6.f18402l;
                                if (b11 != null) {
                                    b11.c(zVar3.f18423p);
                                    RectF b12 = yVar6.f18402l.b(motionLayout2, rectF5);
                                    if (b12 != null) {
                                        it = it3;
                                        if (!b12.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        }
                                    } else {
                                        it = it3;
                                    }
                                    RectF a4 = yVar6.f18402l.a(motionLayout2, rectF5);
                                    if (a4 == null || a4.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        B b13 = yVar6.f18402l;
                                        float f14 = (b13.f18212l * rawY) + (b13.f18211k * rawX);
                                        if (b13.j) {
                                            float x4 = motionEvent2.getX();
                                            yVar6.f18402l.getClass();
                                            float y4 = motionEvent2.getY();
                                            yVar6.f18402l.getClass();
                                            rectF3 = rectF5;
                                            f9 = rawY;
                                            f10 = rawX;
                                            yVar3 = yVar2;
                                            rectF2 = rectF4;
                                            f14 = ((float) (Math.atan2(rawY + r11, rawX + r5) - Math.atan2(x4 - 0.5f, y4 - 0.5f))) * 10.0f;
                                        } else {
                                            rectF2 = rectF4;
                                            rectF3 = rectF5;
                                            yVar3 = yVar2;
                                            f9 = rawY;
                                            f10 = rawX;
                                        }
                                        float f15 = f14 * (yVar6.f18394c == currentState ? -1.0f : 1.1f);
                                        if (f15 > f13) {
                                            f13 = f15;
                                            yVar2 = yVar6;
                                            it3 = it;
                                            rectF5 = rectF3;
                                            rawY = f9;
                                            rawX = f10;
                                            rectF4 = rectF2;
                                        }
                                    }
                                } else {
                                    rectF2 = rectF4;
                                    it = it3;
                                    rectF3 = rectF5;
                                    yVar3 = yVar2;
                                    f9 = rawY;
                                    f10 = rawX;
                                }
                                yVar2 = yVar3;
                                it3 = it;
                                rectF5 = rectF3;
                                rawY = f9;
                                rawX = f10;
                                rectF4 = rectF2;
                            }
                            it3 = it;
                        }
                        rectF = rectF4;
                    } else {
                        rectF = rectF4;
                        yVar2 = zVar3.f18411c;
                    }
                    if (yVar2 != null) {
                        motionLayout.setTransition(yVar2);
                        RectF b14 = zVar3.f18411c.f18402l.b(motionLayout2, rectF);
                        zVar3.f18421n = (b14 == null || b14.contains(zVar3.f18419l.getX(), zVar3.f18419l.getY())) ? false : true;
                        B b15 = zVar3.f18411c.f18402l;
                        float f16 = zVar3.f18425r;
                        float f17 = zVar3.f18426s;
                        b15.f18216p = f16;
                        b15.f18217q = f17;
                        b15.f18213m = false;
                    }
                }
            }
            yVar = motionLayout.f8834J.f18411c;
            if ((yVar.f18408r & 4) == 0) {
                return yVar.f18402l.f18213m;
            }
            return true;
        }
        if (!zVar3.f18420m) {
            y yVar7 = zVar3.f18411c;
            if (yVar7 == null || (b7 = yVar7.f18402l) == null || zVar3.f18421n) {
                zVar = zVar3;
            } else {
                s sVar5 = zVar3.f18422o;
                boolean z4 = b7.j;
                v vVar2 = v.f18369d;
                float[] fArr = b7.f18214n;
                MotionLayout motionLayout3 = b7.f18218r;
                if (z4) {
                    VelocityTracker velocityTracker2 = sVar5.f18360a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    int action2 = motionEvent.getAction();
                    if (action2 != 0) {
                        int[] iArr = b7.f18215o;
                        if (action2 != 1) {
                            if (action2 == 2) {
                                motionEvent.getRawY();
                                motionEvent.getRawX();
                                float width = motionLayout3.getWidth() / 2.0f;
                                float height = motionLayout3.getHeight() / 2.0f;
                                int i11 = b7.f18210i;
                                if (i11 != -1) {
                                    View findViewById = motionLayout3.findViewById(i11);
                                    motionLayout3.getLocationOnScreen(iArr);
                                    height = ((findViewById.getBottom() + findViewById.getTop()) / 2.0f) + iArr[1];
                                    width = iArr[0] + ((findViewById.getRight() + findViewById.getLeft()) / 2.0f);
                                } else {
                                    int i12 = b7.f18205d;
                                    if (i12 != -1) {
                                        if (motionLayout3.findViewById(((n) motionLayout3.f8854T.get(motionLayout3.findViewById(i12))).f18320f.f18373B) == null) {
                                            Log.e("TouchResponse", "could not find view to animate to");
                                        } else {
                                            motionLayout3.getLocationOnScreen(iArr);
                                            width = iArr[0] + ((r10.getRight() + r10.getLeft()) / 2.0f);
                                            height = iArr[1] + ((r10.getBottom() + r10.getTop()) / 2.0f);
                                        }
                                    }
                                }
                                float rawX2 = motionEvent.getRawX() - width;
                                float rawY2 = motionEvent.getRawY() - height;
                                float atan2 = (float) (((Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width) - Math.atan2(b7.f18217q - height, b7.f18216p - width)) * 180.0d) / 3.141592653589793d);
                                if (atan2 > 330.0f) {
                                    atan2 -= 360.0f;
                                } else if (atan2 < -330.0f) {
                                    atan2 += 360.0f;
                                }
                                if (Math.abs(atan2) > 0.01d || b7.f18213m) {
                                    float progress = motionLayout3.getProgress();
                                    if (!b7.f18213m) {
                                        b7.f18213m = true;
                                        motionLayout3.setProgress(progress);
                                    }
                                    int i13 = b7.f18205d;
                                    if (i13 != -1) {
                                        zVar = zVar3;
                                        b7.f18218r.p(i13, progress, b7.f18209h, b7.f18208g, b7.f18214n);
                                        c10 = 1;
                                        fArr[1] = (float) Math.toDegrees(fArr[1]);
                                    } else {
                                        zVar = zVar3;
                                        c10 = 1;
                                        fArr[1] = 360.0f;
                                    }
                                    float max = Math.max(Math.min(((atan2 * b7.f18222v) / fArr[c10]) + progress, 1.0f), 0.0f);
                                    float progress2 = motionLayout3.getProgress();
                                    if (max != progress2) {
                                        if (progress2 == 0.0f || progress2 == 1.0f) {
                                            motionLayout3.l();
                                        }
                                        motionLayout3.setProgress(max);
                                        VelocityTracker velocityTracker3 = sVar5.f18360a;
                                        if (velocityTracker3 != null) {
                                            velocityTracker3.computeCurrentVelocity(zzbbd.zzq.zzf);
                                        }
                                        VelocityTracker velocityTracker4 = sVar5.f18360a;
                                        float xVelocity = velocityTracker4 != null ? velocityTracker4.getXVelocity() : 0.0f;
                                        VelocityTracker velocityTracker5 = sVar5.f18360a;
                                        double yVelocity = velocityTracker5 != null ? velocityTracker5.getYVelocity() : 0.0f;
                                        double d7 = xVelocity;
                                        motionLayout3.f8840M = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity, d7) - r11) * Math.hypot(yVelocity, d7)) / Math.hypot(rawX2, rawY2)));
                                    } else {
                                        motionLayout3.f8840M = 0.0f;
                                    }
                                    b7.f18216p = motionEvent.getRawX();
                                    b7.f18217q = motionEvent.getRawY();
                                }
                            }
                            zVar = zVar3;
                        } else {
                            zVar = zVar3;
                            b7.f18213m = false;
                            VelocityTracker velocityTracker6 = sVar5.f18360a;
                            if (velocityTracker6 != null) {
                                velocityTracker6.computeCurrentVelocity(16);
                            }
                            VelocityTracker velocityTracker7 = sVar5.f18360a;
                            float xVelocity2 = velocityTracker7 != null ? velocityTracker7.getXVelocity() : 0.0f;
                            VelocityTracker velocityTracker8 = sVar5.f18360a;
                            float yVelocity2 = velocityTracker8 != null ? velocityTracker8.getYVelocity() : 0.0f;
                            float progress3 = motionLayout3.getProgress();
                            float width2 = motionLayout3.getWidth() / 2.0f;
                            float height2 = motionLayout3.getHeight() / 2.0f;
                            int i14 = b7.f18210i;
                            if (i14 != -1) {
                                View findViewById2 = motionLayout3.findViewById(i14);
                                motionLayout3.getLocationOnScreen(iArr);
                                right = iArr[0] + ((findViewById2.getRight() + findViewById2.getLeft()) / 2.0f);
                                f7 = iArr[1];
                                top = findViewById2.getTop();
                                bottom = findViewById2.getBottom();
                            } else {
                                int i15 = b7.f18205d;
                                if (i15 != -1) {
                                    View findViewById3 = motionLayout3.findViewById(((n) motionLayout3.f8854T.get(motionLayout3.findViewById(i15))).f18320f.f18373B);
                                    motionLayout3.getLocationOnScreen(iArr);
                                    right = iArr[0] + ((findViewById3.getRight() + findViewById3.getLeft()) / 2.0f);
                                    f7 = iArr[1];
                                    top = findViewById3.getTop();
                                    bottom = findViewById3.getBottom();
                                }
                                float rawX3 = motionEvent.getRawX() - width2;
                                double degrees = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX3));
                                i8 = b7.f18205d;
                                if (i8 == -1) {
                                    b7.f18218r.p(i8, progress3, b7.f18209h, b7.f18208g, b7.f18214n);
                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                } else {
                                    fArr[1] = 360.0f;
                                }
                                float degrees2 = ((float) (Math.toDegrees(Math.atan2(yVelocity2 + r5, xVelocity2 + rawX3)) - degrees)) * 62.5f;
                                f8 = Float.isNaN(degrees2) ? (((degrees2 * 3.0f) * b7.f18222v) / fArr[1]) + progress3 : progress3;
                                if (f8 == 0.0f && f8 != 1.0f && (i9 = b7.f18204c) != 3) {
                                    float f18 = (degrees2 * b7.f18222v) / fArr[1];
                                    float f19 = ((double) f8) < 0.5d ? 0.0f : 1.0f;
                                    if (i9 == 6) {
                                        if (progress3 + f18 < 0.0f) {
                                            f18 = Math.abs(f18);
                                        }
                                        f19 = 1.0f;
                                    }
                                    if (b7.f18204c == 7) {
                                        if (progress3 + f18 > 1.0f) {
                                            f18 = -Math.abs(f18);
                                        }
                                        f19 = 0.0f;
                                    }
                                    motionLayout3.y(f19, f18 * 3.0f, b7.f18204c);
                                    if (0.0f >= progress3 || 1.0f <= progress3) {
                                        motionLayout3.setState(vVar2);
                                    }
                                } else if (0.0f < f8 || 1.0f <= f8) {
                                    motionLayout3.setState(vVar2);
                                }
                            }
                            float f20 = right;
                            height2 = ((bottom + top) / 2.0f) + f7;
                            width2 = f20;
                            float rawX32 = motionEvent.getRawX() - width2;
                            double degrees3 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX32));
                            i8 = b7.f18205d;
                            if (i8 == -1) {
                            }
                            float degrees22 = ((float) (Math.toDegrees(Math.atan2(yVelocity2 + r5, xVelocity2 + rawX32)) - degrees3)) * 62.5f;
                            if (Float.isNaN(degrees22)) {
                            }
                            if (f8 == 0.0f) {
                            }
                            if (0.0f < f8) {
                            }
                            motionLayout3.setState(vVar2);
                        }
                    } else {
                        zVar = zVar3;
                        b7.f18216p = motionEvent.getRawX();
                        b7.f18217q = motionEvent.getRawY();
                        b7.f18213m = false;
                    }
                } else {
                    zVar = zVar3;
                    VelocityTracker velocityTracker9 = sVar5.f18360a;
                    if (velocityTracker9 != null) {
                        velocityTracker9.addMovement(motionEvent);
                    }
                    int action3 = motionEvent.getAction();
                    if (action3 == 0) {
                        b7.f18216p = motionEvent.getRawX();
                        b7.f18217q = motionEvent.getRawY();
                        b7.f18213m = false;
                    } else if (action3 == 1) {
                        b7.f18213m = false;
                        VelocityTracker velocityTracker10 = sVar5.f18360a;
                        if (velocityTracker10 != null) {
                            velocityTracker10.computeCurrentVelocity(zzbbd.zzq.zzf);
                        }
                        VelocityTracker velocityTracker11 = sVar5.f18360a;
                        float xVelocity3 = velocityTracker11 != null ? velocityTracker11.getXVelocity() : 0.0f;
                        VelocityTracker velocityTracker12 = sVar5.f18360a;
                        float yVelocity3 = velocityTracker12 != null ? velocityTracker12.getYVelocity() : 0.0f;
                        float progress4 = motionLayout3.getProgress();
                        int i16 = b7.f18205d;
                        if (i16 != -1) {
                            b7.f18218r.p(i16, progress4, b7.f18209h, b7.f18208g, b7.f18214n);
                            c4 = 0;
                            c3 = 1;
                        } else {
                            float min = Math.min(motionLayout3.getWidth(), motionLayout3.getHeight());
                            c3 = 1;
                            fArr[1] = b7.f18212l * min;
                            c4 = 0;
                            fArr[0] = min * b7.f18211k;
                        }
                        float f21 = b7.f18211k != 0.0f ? xVelocity3 / fArr[c4] : yVelocity3 / fArr[c3];
                        float f22 = !Float.isNaN(f21) ? (f21 / 3.0f) + progress4 : progress4;
                        if (f22 != 0.0f && f22 != 1.0f && (i7 = b7.f18204c) != 3) {
                            float f23 = ((double) f22) < 0.5d ? 0.0f : 1.0f;
                            if (i7 == 6) {
                                if (progress4 + f21 < 0.0f) {
                                    f21 = Math.abs(f21);
                                }
                                f23 = 1.0f;
                            }
                            if (b7.f18204c == 7) {
                                if (progress4 + f21 > 1.0f) {
                                    f21 = -Math.abs(f21);
                                }
                                f23 = 0.0f;
                            }
                            motionLayout3.y(f23, f21, b7.f18204c);
                            if (0.0f >= progress4 || 1.0f <= progress4) {
                                motionLayout3.setState(vVar2);
                            }
                        } else if (0.0f >= f22 || 1.0f <= f22) {
                            motionLayout3.setState(vVar2);
                        }
                    } else if (action3 == 2) {
                        float rawY3 = motionEvent.getRawY() - b7.f18217q;
                        float rawX4 = motionEvent.getRawX() - b7.f18216p;
                        if (Math.abs((b7.f18212l * rawY3) + (b7.f18211k * rawX4)) > b7.f18224x || b7.f18213m) {
                            float progress5 = motionLayout3.getProgress();
                            if (!b7.f18213m) {
                                b7.f18213m = true;
                                motionLayout3.setProgress(progress5);
                            }
                            int i17 = b7.f18205d;
                            if (i17 != -1) {
                                b7.f18218r.p(i17, progress5, b7.f18209h, b7.f18208g, b7.f18214n);
                                c8 = 0;
                                c7 = 1;
                            } else {
                                float min2 = Math.min(motionLayout3.getWidth(), motionLayout3.getHeight());
                                c7 = 1;
                                fArr[1] = b7.f18212l * min2;
                                c8 = 0;
                                fArr[0] = min2 * b7.f18211k;
                            }
                            if (Math.abs(((b7.f18212l * fArr[c7]) + (b7.f18211k * fArr[c8])) * b7.f18222v) < 0.01d) {
                                c9 = 0;
                                fArr[0] = 0.01f;
                                fArr[c7] = 0.01f;
                            } else {
                                c9 = 0;
                            }
                            float max2 = Math.max(Math.min(progress5 + (b7.f18211k != 0.0f ? rawX4 / fArr[c9] : rawY3 / fArr[c7]), 1.0f), 0.0f);
                            if (b7.f18204c == 6) {
                                max2 = Math.max(max2, 0.01f);
                            }
                            if (b7.f18204c == 7) {
                                max2 = Math.min(max2, 0.99f);
                            }
                            float progress6 = motionLayout3.getProgress();
                            if (max2 != progress6) {
                                if (progress6 == 0.0f || progress6 == 1.0f) {
                                    motionLayout3.l();
                                }
                                motionLayout3.setProgress(max2);
                                VelocityTracker velocityTracker13 = sVar5.f18360a;
                                if (velocityTracker13 != null) {
                                    velocityTracker13.computeCurrentVelocity(zzbbd.zzq.zzf);
                                }
                                VelocityTracker velocityTracker14 = sVar5.f18360a;
                                float xVelocity4 = velocityTracker14 != null ? velocityTracker14.getXVelocity() : 0.0f;
                                VelocityTracker velocityTracker15 = sVar5.f18360a;
                                motionLayout3.f8840M = b7.f18211k != 0.0f ? xVelocity4 / fArr[0] : (velocityTracker15 != null ? velocityTracker15.getYVelocity() : 0.0f) / fArr[1];
                            } else {
                                motionLayout3.f8840M = 0.0f;
                            }
                            b7.f18216p = motionEvent.getRawX();
                            b7.f18217q = motionEvent.getRawY();
                        }
                    }
                }
            }
            z zVar4 = zVar;
            zVar4.f18425r = motionEvent.getRawX();
            zVar4.f18426s = motionEvent.getRawY();
            if (motionEvent.getAction() != 1 || (sVar = zVar4.f18422o) == null) {
                motionLayout = this;
            } else {
                VelocityTracker velocityTracker16 = sVar.f18360a;
                if (velocityTracker16 != null) {
                    velocityTracker16.recycle();
                    sVar2 = null;
                    sVar.f18360a = null;
                } else {
                    sVar2 = null;
                }
                zVar4.f18422o = sVar2;
                motionLayout = this;
                int i18 = motionLayout.f8844O;
                if (i18 != -1) {
                    zVar4.a(i18, motionLayout);
                }
            }
        }
        yVar = motionLayout.f8834J.f18411c;
        if ((yVar.f18408r & 4) == 0) {
        }
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
        HashMap hashMap = this.f8854T;
        View b7 = b(i7);
        n nVar = (n) hashMap.get(b7);
        if (nVar == null) {
            L.l("WARNING could not find view id ", b7 == null ? k.d(i7, "") : b7.getContext().getResources().getResourceName(i7), "MotionLayout");
        } else {
            nVar.d(f7, f8, f9, fArr);
            b7.getY();
        }
    }

    public final y q(int i7) {
        Iterator it = this.f8834J.f18412d.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (yVar.f18392a == i7) {
                return yVar;
            }
        }
        return null;
    }

    public final boolean r(float f7, float f8, View view, MotionEvent motionEvent) {
        boolean z4;
        boolean onTouchEvent;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (r((r3.getLeft() + f7) - view.getScrollX(), (r3.getTop() + f8) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        if (!z4) {
            RectF rectF = this.f8857U0;
            rectF.set(f7, f8, (view.getRight() + f7) - view.getLeft(), (view.getBottom() + f8) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f9 = -f7;
                float f10 = -f8;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f9, f10);
                    onTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f9, -f10);
                } else {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(f9, f10);
                    if (this.W0 == null) {
                        this.W0 = new Matrix();
                    }
                    matrix.invert(this.W0);
                    obtain.transform(this.W0);
                    onTouchEvent = view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (onTouchEvent) {
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
        if (!this.f8828D0 && this.f8844O == -1 && (zVar = this.f8834J) != null && (yVar = zVar.f18411c) != null) {
            int i7 = yVar.f18407q;
            if (i7 == 0) {
                return;
            }
            if (i7 == 2) {
                int childCount = getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    ((n) this.f8854T.get(getChildAt(i8))).f18318d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public final void s() {
        y yVar;
        B b7;
        View view;
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
            ArrayList arrayList = zVar2.f18412d;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                y yVar2 = (y) it.next();
                if (yVar2.f18403m.size() > 0) {
                    Iterator it2 = yVar2.f18403m.iterator();
                    while (it2.hasNext()) {
                        ((x) it2.next()).b(this);
                    }
                }
            }
            ArrayList arrayList2 = zVar2.f18414f;
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                y yVar3 = (y) it3.next();
                if (yVar3.f18403m.size() > 0) {
                    Iterator it4 = yVar3.f18403m.iterator();
                    while (it4.hasNext()) {
                        ((x) it4.next()).b(this);
                    }
                }
            }
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                y yVar4 = (y) it5.next();
                if (yVar4.f18403m.size() > 0) {
                    Iterator it6 = yVar4.f18403m.iterator();
                    while (it6.hasNext()) {
                        ((x) it6.next()).a(this, i7, yVar4);
                    }
                }
            }
            Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                y yVar5 = (y) it7.next();
                if (yVar5.f18403m.size() > 0) {
                    Iterator it8 = yVar5.f18403m.iterator();
                    while (it8.hasNext()) {
                        ((x) it8.next()).a(this, i7, yVar5);
                    }
                }
            }
        }
        if (!this.f8834J.o() || (yVar = this.f8834J.f18411c) == null || (b7 = yVar.f18402l) == null) {
            return;
        }
        int i8 = b7.f18205d;
        if (i8 != -1) {
            MotionLayout motionLayout = b7.f18218r;
            view = motionLayout.findViewById(i8);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + c.f(b7.f18205d, motionLayout.getContext()));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new ViewOnTouchListenerC1802A());
            nestedScrollView.setOnScrollChangeListener(new C1718l0(29));
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
            setState(v.f18368c);
            Interpolator e7 = this.f8834J.e();
            if (e7 != null) {
                setProgress(e7.getInterpolation(f7));
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
            this.f8843N0.f18361a = f7;
            return;
        }
        v vVar = v.f18369d;
        v vVar2 = v.f18368c;
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
        boolean e7 = e();
        zVar.f18423p = e7;
        y yVar = zVar.f18411c;
        if (yVar != null && (b7 = yVar.f18402l) != null) {
            b7.c(e7);
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
        tVar.f18363c = i7;
        tVar.f18364d = i7;
    }

    public void setState(v vVar) {
        v vVar2 = v.f18369d;
        if (vVar == vVar2 && this.f8844O == -1) {
            return;
        }
        v vVar3 = this.f8851R0;
        this.f8851R0 = vVar;
        v vVar4 = v.f18368c;
        if (vVar3 == vVar4 && vVar == vVar4) {
            n();
        }
        int ordinal = vVar3.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 && vVar == vVar2) {
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
        if (this.f8834J != null) {
            y q7 = q(i7);
            this.f8842N = q7.f18395d;
            this.f8846P = q7.f18394c;
            if (!super.isAttachedToWindow()) {
                if (this.f8843N0 == null) {
                    this.f8843N0 = new t(this);
                }
                t tVar = this.f8843N0;
                tVar.f18363c = this.f8842N;
                tVar.f18364d = this.f8846P;
                return;
            }
            int i8 = this.f8844O;
            float f7 = i8 == this.f8842N ? 0.0f : i8 == this.f8846P ? 1.0f : Float.NaN;
            z zVar = this.f8834J;
            zVar.f18411c = q7;
            B b7 = q7.f18402l;
            if (b7 != null) {
                b7.c(zVar.f18423p);
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
        y yVar = zVar.f18411c;
        if (yVar != null) {
            yVar.f18399h = Math.max(i7, 8);
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
        tVar.f18361a = bundle.getFloat("motion.progress");
        tVar.f18362b = bundle.getFloat("motion.velocity");
        tVar.f18363c = bundle.getInt("motion.StartState");
        tVar.f18364d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.f8843N0.a();
        }
    }

    public final void t() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.f8866f0 == null && ((copyOnWriteArrayList = this.f8884x0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList arrayList = this.f8861X0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            u uVar = this.f8866f0;
            if (uVar != null) {
                uVar.a(num.intValue());
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f8884x0;
            if (copyOnWriteArrayList2 != null) {
                Iterator it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    ((u) it2.next()).a(num.intValue());
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
            tVar.f18361a = f7;
            tVar.f18362b = f8;
            return;
        }
        setProgress(f7);
        setState(v.f18368c);
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
        setState(v.f18367b);
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
            e eVar = (e) sparseArray.get(i7);
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
        e eVar2 = i7 == -1 ? (e) sparseArray.valueAt(0) : (e) sparseArray.get(i8);
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
            tVar.f18363c = i7;
            tVar.f18364d = i8;
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r18 != 7) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if ((((r17 * r5) - (((r2 * r5) * r5) / 2.0f)) + r1) > 1.0f) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        r2 = r15.f8862a0;
        r5 = r15.f8858V;
        r6 = r15.f8834J.g();
        r1 = r15.f8834J.f18411c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        r1 = r1.f18402l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        r7 = r1.f18219s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        r15.f8870j0.b(r2, r16, r17, r5, r6, r7);
        r15.f8840M = 0.0f;
        r1 = r15.f8844O;
        r15.c0 = r8;
        r15.f8844O = r1;
        r15.f8836K = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        r7 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        r1 = r15.f8862a0;
        r2 = r15.f8834J.g();
        r13.f18342a = r17;
        r13.f18343b = r1;
        r13.f18344c = r2;
        r15.f8836K = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if ((((((r2 * r3) * r3) / 2.0f) + (r17 * r3)) + r1) < 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(float f7, float f8, int i7) {
        B b7;
        B b8;
        B b9;
        B b10;
        B b11;
        B b12;
        B b13;
        float f9 = f7;
        if (this.f8834J == null || this.f8862a0 == f9) {
            return;
        }
        this.f8869i0 = true;
        this.f8856U = getNanoTime();
        float c3 = this.f8834J.c() / 1000.0f;
        this.f8858V = c3;
        this.c0 = f9;
        this.f8865e0 = true;
        C1791a c1791a = this.f8870j0;
        if (i7 != 0 && i7 != 1 && i7 != 2) {
            q qVar = this.f8871k0;
            if (i7 == 4) {
                float f10 = this.f8862a0;
                float g3 = this.f8834J.g();
                qVar.f18342a = f8;
                qVar.f18343b = f10;
                qVar.f18344c = g3;
                this.f8836K = qVar;
            } else if (i7 == 5) {
                float f11 = this.f8862a0;
                float g7 = this.f8834J.g();
                if (f8 > 0.0f) {
                    float f12 = f8 / g7;
                } else {
                    float f13 = (-f8) / g7;
                }
            } else if (i7 != 6) {
            }
            this.f8864d0 = false;
            this.f8856U = getNanoTime();
            invalidate();
        }
        if (i7 == 1 || i7 == 7) {
            f9 = 0.0f;
        } else if (i7 == 2 || i7 == 6) {
            f9 = 1.0f;
        }
        z zVar = this.f8834J;
        y yVar = zVar.f18411c;
        if (((yVar == null || (b13 = yVar.f18402l) == null) ? 0 : b13.f18201D) == 0) {
            float f14 = this.f8862a0;
            float g8 = zVar.g();
            y yVar2 = this.f8834J.f18411c;
            this.f8870j0.b(f14, f9, f8, c3, g8, (yVar2 == null || (b12 = yVar2.f18402l) == null) ? 0.0f : b12.f18219s);
        } else {
            float f15 = this.f8862a0;
            float f16 = (yVar == null || (b11 = yVar.f18402l) == null) ? 0.0f : b11.f18226z;
            float f17 = (yVar == null || (b10 = yVar.f18402l) == null) ? 0.0f : b10.f18198A;
            float f18 = (yVar == null || (b9 = yVar.f18402l) == null) ? 0.0f : b9.f18225y;
            float f19 = (yVar == null || (b8 = yVar.f18402l) == null) ? 0.0f : b8.f18199B;
            int i8 = (yVar == null || (b7 = yVar.f18402l) == null) ? 0 : b7.f18200C;
            if (c1791a.f18097b == null) {
                i iVar = new i();
                iVar.f16513a = 0.5d;
                iVar.f16521i = 0;
                c1791a.f18097b = iVar;
            }
            i iVar2 = c1791a.f18097b;
            c1791a.f18098c = iVar2;
            iVar2.f16515c = f9;
            iVar2.f16513a = f18;
            iVar2.f16517e = f15;
            iVar2.f16514b = f17;
            iVar2.f16519g = f16;
            iVar2.f16520h = f19;
            iVar2.f16521i = i8;
            iVar2.f16516d = 0.0f;
        }
        int i9 = this.f8844O;
        this.c0 = f9;
        this.f8844O = i9;
        this.f8836K = c1791a;
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
            this.f8843N0.f18364d = i7;
            return;
        }
        z zVar = this.f8834J;
        if (zVar != null && (vVar = zVar.f18410b) != null) {
            int i8 = this.f8844O;
            float f7 = -1;
            B.t tVar = (B.t) ((SparseArray) vVar.f966c).get(i7);
            if (tVar == null) {
                i8 = i7;
            } else {
                ArrayList arrayList = tVar.f957b;
                int i9 = tVar.f958c;
                if (f7 != -1.0f && f7 != -1.0f) {
                    Iterator it = arrayList.iterator();
                    B.u uVar = null;
                    while (true) {
                        if (it.hasNext()) {
                            B.u uVar2 = (B.u) it.next();
                            if (uVar2.a(f7, f7)) {
                                if (i8 == uVar2.f963e) {
                                    break;
                                } else {
                                    uVar = uVar2;
                                }
                            }
                        } else if (uVar != null) {
                            i8 = uVar.f963e;
                        }
                    }
                } else if (i9 != i8) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (i8 == ((B.u) it2.next()).f963e) {
                            break;
                        }
                    }
                    i8 = i9;
                }
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
        HashMap hashMap = this.f8854T;
        hashMap.clear();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            hashMap.put(childAt, new n(childAt));
            sparseArray.put(childAt.getId(), (n) hashMap.get(childAt));
        }
        this.f8865e0 = true;
        m b7 = this.f8834J.b(i7);
        A a2 = this.f8853S0;
        a2.k(null, b7);
        u();
        a2.f();
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            n nVar = (n) hashMap.get(childAt2);
            if (nVar != null) {
                w wVar = nVar.f18320f;
                wVar.f18382c = 0.0f;
                wVar.f18383d = 0.0f;
                wVar.f(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                z.l lVar = nVar.f18322h;
                lVar.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                lVar.f18299c = childAt2.getVisibility();
                lVar.f18297a = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                lVar.f18300d = childAt2.getElevation();
                lVar.f18301e = childAt2.getRotation();
                lVar.f18302f = childAt2.getRotationX();
                lVar.f18303x = childAt2.getRotationY();
                lVar.f18304y = childAt2.getScaleX();
                lVar.f18305z = childAt2.getScaleY();
                lVar.f18289A = childAt2.getPivotX();
                lVar.f18290B = childAt2.getPivotY();
                lVar.f18291C = childAt2.getTranslationX();
                lVar.f18292D = childAt2.getTranslationY();
                lVar.f18293E = childAt2.getTranslationZ();
            }
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f8883w0 != null) {
            for (int i13 = 0; i13 < childCount; i13++) {
                n nVar2 = (n) hashMap.get(getChildAt(i13));
                if (nVar2 != null) {
                    this.f8834J.f(nVar2);
                }
            }
            Iterator it3 = this.f8883w0.iterator();
            while (it3.hasNext()) {
                ((MotionHelper) it3.next()).r(this, hashMap);
            }
            for (int i14 = 0; i14 < childCount; i14++) {
                n nVar3 = (n) hashMap.get(getChildAt(i14));
                if (nVar3 != null) {
                    nVar3.h(width, getNanoTime(), height);
                }
            }
        } else {
            for (int i15 = 0; i15 < childCount; i15++) {
                n nVar4 = (n) hashMap.get(getChildAt(i15));
                if (nVar4 != null) {
                    this.f8834J.f(nVar4);
                    nVar4.h(width, getNanoTime(), height);
                }
            }
        }
        y yVar = this.f8834J.f18411c;
        float f8 = yVar != null ? yVar.f18400i : 0.0f;
        if (f8 != 0.0f) {
            float f9 = Float.MAX_VALUE;
            float f10 = -3.4028235E38f;
            for (int i16 = 0; i16 < childCount; i16++) {
                w wVar2 = ((n) hashMap.get(getChildAt(i16))).f18321g;
                float f11 = wVar2.f18385f + wVar2.f18384e;
                f9 = Math.min(f9, f11);
                f10 = Math.max(f10, f11);
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                n nVar5 = (n) hashMap.get(getChildAt(i17));
                w wVar3 = nVar5.f18321g;
                float f12 = wVar3.f18384e;
                float f13 = wVar3.f18385f;
                nVar5.f18327n = 1.0f / (1.0f - f8);
                nVar5.f18326m = f8 - ((((f12 + f13) - f9) * f8) / (f10 - f9));
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
        zVar.f18411c = yVar;
        if (yVar != null && (b7 = yVar.f18402l) != null) {
            b7.c(zVar.f18423p);
        }
        setState(v.f18367b);
        int i7 = this.f8844O;
        y yVar2 = this.f8834J.f18411c;
        if (i7 == (yVar2 == null ? -1 : yVar2.f18394c)) {
            this.f8862a0 = 1.0f;
            this.f8860W = 1.0f;
            this.c0 = 1.0f;
        } else {
            this.f8862a0 = 0.0f;
            this.f8860W = 0.0f;
            this.c0 = 0.0f;
        }
        this.f8863b0 = (yVar.f18408r & 1) != 0 ? -1L : getNanoTime();
        int h6 = this.f8834J.h();
        z zVar2 = this.f8834J;
        y yVar3 = zVar2.f18411c;
        int i8 = yVar3 != null ? yVar3.f18394c : -1;
        if (h6 == this.f8842N && i8 == this.f8846P) {
            return;
        }
        this.f8842N = h6;
        this.f8846P = i8;
        zVar2.n(h6, i8);
        m b8 = this.f8834J.b(this.f8842N);
        m b9 = this.f8834J.b(this.f8846P);
        A a2 = this.f8853S0;
        a2.k(b8, b9);
        int i9 = this.f8842N;
        int i10 = this.f8846P;
        a2.f1211a = i9;
        a2.f1212b = i10;
        a2.l();
        u();
    }
}
