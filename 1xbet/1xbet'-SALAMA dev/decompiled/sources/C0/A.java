package C0;

import android.content.Context;
import android.graphics.Rect;
import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class A implements p064i5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1216f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f1217x;

    public A(int i7, int i8) {
        this.f1214d = new LinkedList();
        this.f1215e = new HashSet();
        this.f1216f = new HashSet();
        this.f1217x = new HashMap();
        this.f1213c = "Sqflite";
        this.f1211a = i7;
        this.f1212b = i8;
    }

    public static void h(p149v.f fVar, p149v.f fVar2) {
        p149v.e jVar;
        ArrayList<p149v.e> arrayList = fVar.f17009u0;
        HashMap map = new HashMap();
        map.put(fVar, fVar2);
        fVar2.f17009u0.clear();
        fVar2.g(fVar, map);
        for (p149v.e eVar : arrayList) {
            if (eVar instanceof p149v.a) {
                jVar = new p149v.a();
            } else if (eVar instanceof p149v.i) {
                jVar = new p149v.i();
            } else if (eVar instanceof p149v.h) {
                jVar = new p149v.h();
            } else if (eVar instanceof p149v.l) {
                jVar = new p149v.l();
            } else {
                jVar = eVar instanceof p149v.j ? new p149v.j() : new p149v.e();
            }
            fVar2.f17009u0.add(jVar);
            p149v.e eVar2 = jVar.f16944V;
            if (eVar2 != null) {
                ((p149v.f) eVar2).f17009u0.remove(jVar);
                jVar.D();
            }
            jVar.f16944V = fVar2;
            map.put(eVar, jVar);
        }
        for (p149v.e eVar3 : arrayList) {
            ((p149v.e) map.get(eVar3)).g(eVar3, map);
        }
    }

    public static p149v.e j(p149v.f fVar, View view) {
        if (fVar.f16963h0 == view) {
            return fVar;
        }
        ArrayList arrayList = fVar.f17009u0;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            p149v.e eVar = (p149v.e) arrayList.get(i7);
            if (eVar.f16963h0 == view) {
                return eVar;
            }
        }
        return null;
    }

    public void b(p048g4.i iVar) {
        if (((HashSet) this.f1214d).contains(iVar.f13212a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f1215e).add(iVar);
    }

    @Override // p064i5.g
    public synchronized void c(p064i5.e eVar) {
        ((LinkedList) this.f1214d).add(eVar);
        Iterator it = new HashSet((HashSet) this.f1215e).iterator();
        while (it.hasNext()) {
            o((p064i5.f) it.next());
        }
    }

    @Override // p064i5.g
    public synchronized void d() {
        try {
            for (p064i5.f fVar : (HashSet) this.f1215e) {
                synchronized (fVar) {
                    HandlerThread handlerThread = fVar.f14036c;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        fVar.f14036c = null;
                        fVar.f14037d = null;
                    }
                }
            }
            for (p064i5.f fVar2 : (HashSet) this.f1216f) {
                synchronized (fVar2) {
                    HandlerThread handlerThread2 = fVar2.f14036c;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        fVar2.f14036c = null;
                        fVar2.f14037d = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public p048g4.a e() {
        if (((p048g4.d) this.f1216f) != null) {
            return new p048g4.a((String) this.f1213c, new HashSet((HashSet) this.f1214d), new HashSet((HashSet) this.f1215e), this.f1211a, this.f1212b, (p048g4.d) this.f1216f, (HashSet) this.f1217x);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void f() {
        int i7;
        SparseArray sparseArray;
        int[] iArr;
        int i8;
        Interpolator interpolatorLoadInterpolator;
        MotionLayout motionLayout = (MotionLayout) this.f1217x;
        int childCount = motionLayout.getChildCount();
        motionLayout.f8854T.clear();
        SparseArray sparseArray2 = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = motionLayout.getChildAt(i9);
            p169z.n nVar = new p169z.n(childAt);
            int id = childAt.getId();
            iArr2[i9] = id;
            sparseArray2.put(id, nVar);
            motionLayout.f8854T.put(childAt, nVar);
        }
        int i10 = 0;
        while (i10 < childCount) {
            View childAt2 = motionLayout.getChildAt(i10);
            p169z.n nVar2 = (p169z.n) motionLayout.f8854T.get(childAt2);
            if (nVar2 == null) {
                i7 = childCount;
                sparseArray = sparseArray2;
                iArr = iArr2;
                i8 = i10;
            } else {
                if (((B.m) this.f1215e) != null) {
                    p149v.e eVarJ = j((p149v.f) this.f1213c, childAt2);
                    if (eVarJ != null) {
                        Rect rectJ = MotionLayout.j(motionLayout, eVarJ);
                        B.m mVar = (B.m) this.f1215e;
                        int width = motionLayout.getWidth();
                        int height = motionLayout.getHeight();
                        sparseArray = sparseArray2;
                        int i11 = mVar.f909c;
                        iArr = iArr2;
                        if (i11 != 0) {
                            p169z.n.g(rectJ, nVar2.f18321a, i11, width, height);
                        }
                        p169z.w wVar = nVar2.f18326f;
                        wVar.f18388c = 0.0f;
                        wVar.f18389d = 0.0f;
                        nVar2.f(wVar);
                        i7 = childCount;
                        i8 = i10;
                        wVar.f(rectJ.left, rectJ.top, rectJ.width(), rectJ.height());
                        B.h hVarH = mVar.h(nVar2.f18323c);
                        wVar.a(hVarH);
                        B.j jVar = hVarH.f800d;
                        nVar2.f18331l = jVar.f879g;
                        nVar2.f18328h.c(rectJ, mVar, i11, nVar2.f18323c);
                        nVar2.f18315B = hVarH.f802f.f899i;
                        nVar2.f18317D = jVar.j;
                        nVar2.f18318E = jVar.f881i;
                        Context context = nVar2.f18322b.getContext();
                        int i12 = jVar.f883l;
                        String str = jVar.f882k;
                        int i13 = jVar.f884m;
                        if (i12 == -2) {
                            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i13);
                        } else if (i12 == -1) {
                            interpolatorLoadInterpolator = new p169z.m(p143u.e.d(str), 0);
                        } else if (i12 == 0) {
                            interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                        } else if (i12 == 1) {
                            interpolatorLoadInterpolator = new AccelerateInterpolator();
                        } else if (i12 == 2) {
                            interpolatorLoadInterpolator = new DecelerateInterpolator();
                        } else if (i12 != 4) {
                            interpolatorLoadInterpolator = i12 != 5 ? null : new OvershootInterpolator();
                        } else {
                            interpolatorLoadInterpolator = new BounceInterpolator();
                        }
                        nVar2.f18319F = interpolatorLoadInterpolator;
                    } else {
                        i7 = childCount;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i8 = i10;
                        if (motionLayout.f8867g0 != 0) {
                            Log.e("MotionLayout", p115p6.c.d() + "no widget for  " + p115p6.c.g(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                } else {
                    i7 = childCount;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i8 = i10;
                }
                if (((B.m) this.f1216f) != null) {
                    p149v.e eVarJ2 = j((p149v.f) this.f1214d, childAt2);
                    if (eVarJ2 != null) {
                        Rect rectJ2 = MotionLayout.j(motionLayout, eVarJ2);
                        B.m mVar2 = (B.m) this.f1216f;
                        int width2 = motionLayout.getWidth();
                        int height2 = motionLayout.getHeight();
                        int i14 = mVar2.f909c;
                        if (i14 != 0) {
                            p169z.n.g(rectJ2, nVar2.f18321a, i14, width2, height2);
                            rectJ2 = nVar2.f18321a;
                        }
                        p169z.w wVar2 = nVar2.f18327g;
                        wVar2.f18388c = 1.0f;
                        wVar2.f18389d = 1.0f;
                        nVar2.f(wVar2);
                        wVar2.f(rectJ2.left, rectJ2.top, rectJ2.width(), rectJ2.height());
                        wVar2.a(mVar2.h(nVar2.f18323c));
                        nVar2.f18329i.c(rectJ2, mVar2, i14, nVar2.f18323c);
                    } else if (motionLayout.f8867g0 != 0) {
                        Log.e("MotionLayout", p115p6.c.d() + "no widget for  " + p115p6.c.g(childAt2) + " (" + childAt2.getClass().getName() + ")");
                    }
                }
            }
            i10 = i8 + 1;
            sparseArray2 = sparseArray;
            iArr2 = iArr;
            childCount = i7;
        }
        SparseArray sparseArray3 = sparseArray2;
        int[] iArr3 = iArr2;
        int i15 = childCount;
        int i16 = 0;
        while (i16 < i15) {
            SparseArray sparseArray4 = sparseArray3;
            p169z.n nVar3 = (p169z.n) sparseArray4.get(iArr3[i16]);
            int i17 = nVar3.f18326f.f18379B;
            if (i17 != -1) {
                p169z.n nVar4 = (p169z.n) sparseArray4.get(i17);
                nVar3.f18326f.l(nVar4, nVar4.f18326f);
                nVar3.f18327g.l(nVar4, nVar4.f18327g);
            }
            i16++;
            sparseArray3 = sparseArray4;
        }
    }

    public void g(int i7, int i8) {
        MotionLayout motionLayout = (MotionLayout) this.f1217x;
        int optimizationLevel = motionLayout.getOptimizationLevel();
        if (motionLayout.f8844O == motionLayout.getStartState()) {
            p149v.f fVar = (p149v.f) this.f1214d;
            B.m mVar = (B.m) this.f1216f;
            motionLayout.h(fVar, optimizationLevel, (mVar == null || mVar.f909c == 0) ? i7 : i8, (mVar == null || mVar.f909c == 0) ? i8 : i7);
            B.m mVar2 = (B.m) this.f1215e;
            if (mVar2 != null) {
                p149v.f fVar2 = (p149v.f) this.f1213c;
                int i9 = mVar2.f909c;
                int i10 = i9 == 0 ? i7 : i8;
                if (i9 == 0) {
                    i7 = i8;
                }
                motionLayout.h(fVar2, optimizationLevel, i10, i7);
                return;
            }
            return;
        }
        B.m mVar3 = (B.m) this.f1215e;
        if (mVar3 != null) {
            p149v.f fVar3 = (p149v.f) this.f1213c;
            int i11 = mVar3.f909c;
            motionLayout.h(fVar3, optimizationLevel, i11 == 0 ? i7 : i8, i11 == 0 ? i8 : i7);
        }
        p149v.f fVar4 = (p149v.f) this.f1214d;
        B.m mVar4 = (B.m) this.f1216f;
        int i12 = (mVar4 == null || mVar4.f909c == 0) ? i7 : i8;
        if (mVar4 == null || mVar4.f909c == 0) {
            i7 = i8;
        }
        motionLayout.h(fVar4, optimizationLevel, i12, i7);
    }

    public synchronized p064i5.e i(p064i5.f fVar) {
        p064i5.e eVar;
        p064i5.f fVar2;
        try {
            ListIterator listIterator = ((LinkedList) this.f1214d).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                eVar = (p064i5.e) listIterator.next();
                fVar2 = eVar.a() != null ? (p064i5.f) ((HashMap) this.f1217x).get(eVar.a()) : null;
                if (fVar2 == null) {
                    break;
                }
            } while (fVar2 != fVar);
            listIterator.remove();
            return eVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void k(B.m mVar, B.m mVar2) {
        this.f1215e = mVar;
        this.f1216f = mVar2;
        this.f1213c = new p149v.f();
        p149v.f fVar = new p149v.f();
        this.f1214d = fVar;
        p149v.f fVar2 = (p149v.f) this.f1213c;
        boolean z4 = MotionLayout.f8824Y0;
        MotionLayout motionLayout = (MotionLayout) this.f1217x;
        p149v.f fVar3 = motionLayout.f9009c;
        B.d dVar = fVar3.f17013y0;
        fVar2.f17013y0 = dVar;
        fVar2.f17011w0.f1622f = dVar;
        B.d dVar2 = fVar3.f17013y0;
        fVar.f17013y0 = dVar2;
        fVar.f17011w0.f1622f = dVar2;
        fVar2.f17009u0.clear();
        ((p149v.f) this.f1214d).f17009u0.clear();
        h(motionLayout.f9009c, (p149v.f) this.f1213c);
        h(motionLayout.f9009c, (p149v.f) this.f1214d);
        if (motionLayout.f8862a0 > 0.5d) {
            if (mVar != null) {
                m((p149v.f) this.f1213c, mVar);
            }
            m((p149v.f) this.f1214d, mVar2);
        } else {
            m((p149v.f) this.f1214d, mVar2);
            if (mVar != null) {
                m((p149v.f) this.f1213c, mVar);
            }
        }
        ((p149v.f) this.f1213c).f17014z0 = motionLayout.e();
        p149v.f fVar4 = (p149v.f) this.f1213c;
        fVar4.f17010v0.L(fVar4);
        ((p149v.f) this.f1214d).f17014z0 = motionLayout.e();
        p149v.f fVar5 = (p149v.f) this.f1214d;
        fVar5.f17010v0.L(fVar5);
        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
        if (layoutParams != null) {
            int i7 = layoutParams.width;
            p149v.d dVar3 = p149v.d.f16919b;
            if (i7 == -2) {
                ((p149v.f) this.f1213c).N(dVar3);
                ((p149v.f) this.f1214d).N(dVar3);
            }
            if (layoutParams.height == -2) {
                ((p149v.f) this.f1213c).O(dVar3);
                ((p149v.f) this.f1214d).O(dVar3);
            }
        }
    }

    public void l() {
        HashMap map;
        MotionLayout motionLayout = (MotionLayout) this.f1217x;
        int i7 = motionLayout.f8848Q;
        int i8 = motionLayout.f8850R;
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        motionLayout.f8833I0 = mode;
        motionLayout.f8835J0 = mode2;
        motionLayout.getOptimizationLevel();
        g(i7, i8);
        int i9 = 0;
        if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
            g(i7, i8);
            motionLayout.f8829E0 = ((p149v.f) this.f1213c).r();
            motionLayout.f8830F0 = ((p149v.f) this.f1213c).l();
            motionLayout.f8831G0 = ((p149v.f) this.f1214d).r();
            int iL = ((p149v.f) this.f1214d).l();
            motionLayout.f8832H0 = iL;
            motionLayout.f8828D0 = (motionLayout.f8829E0 == motionLayout.f8831G0 && motionLayout.f8830F0 == iL) ? false : true;
        }
        int i10 = motionLayout.f8829E0;
        int i11 = motionLayout.f8830F0;
        int i12 = motionLayout.f8833I0;
        if (i12 == Integer.MIN_VALUE || i12 == 0) {
            i10 = (int) ((motionLayout.f8837K0 * (motionLayout.f8831G0 - i10)) + i10);
        }
        int i13 = i10;
        int i14 = motionLayout.f8835J0;
        int i15 = (i14 == Integer.MIN_VALUE || i14 == 0) ? (int) ((motionLayout.f8837K0 * (motionLayout.f8832H0 - i11)) + i11) : i11;
        p149v.f fVar = (p149v.f) this.f1213c;
        motionLayout.g(i7, i8, i13, fVar.f17001I0 || ((p149v.f) this.f1214d).f17001I0, fVar.f17002J0 || ((p149v.f) this.f1214d).f17002J0, i15);
        int childCount = motionLayout.getChildCount();
        motionLayout.f8853S0.f();
        motionLayout.f8865e0 = true;
        SparseArray sparseArray = new SparseArray();
        int i16 = 0;
        while (true) {
            map = motionLayout.f8854T;
            if (i16 >= childCount) {
                break;
            }
            View childAt = motionLayout.getChildAt(i16);
            sparseArray.put(childAt.getId(), (p169z.n) map.get(childAt));
            i16++;
        }
        int width = motionLayout.getWidth();
        int height = motionLayout.getHeight();
        p169z.y yVar = motionLayout.f8834J.f18417c;
        int i17 = yVar != null ? yVar.f18412p : -1;
        if (i17 != -1) {
            for (int i18 = 0; i18 < childCount; i18++) {
                p169z.n nVar = (p169z.n) map.get(motionLayout.getChildAt(i18));
                if (nVar != null) {
                    nVar.f18314A = i17;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[map.size()];
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            p169z.n nVar2 = (p169z.n) map.get(motionLayout.getChildAt(i20));
            int i21 = nVar2.f18326f.f18379B;
            if (i21 != -1) {
                sparseBooleanArray.put(i21, true);
                iArr[i19] = nVar2.f18326f.f18379B;
                i19++;
            }
        }
        if (motionLayout.f8883w0 != null) {
            for (int i22 = 0; i22 < i19; i22++) {
                p169z.n nVar3 = (p169z.n) map.get(motionLayout.findViewById(iArr[i22]));
                if (nVar3 != null) {
                    motionLayout.f8834J.f(nVar3);
                }
            }
            Iterator it = motionLayout.f8883w0.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).r(motionLayout, map);
            }
            for (int i23 = 0; i23 < i19; i23++) {
                p169z.n nVar4 = (p169z.n) map.get(motionLayout.findViewById(iArr[i23]));
                if (nVar4 != null) {
                    nVar4.h(width, motionLayout.getNanoTime(), height);
                }
            }
        } else {
            for (int i24 = 0; i24 < i19; i24++) {
                p169z.n nVar5 = (p169z.n) map.get(motionLayout.findViewById(iArr[i24]));
                if (nVar5 != null) {
                    motionLayout.f8834J.f(nVar5);
                    nVar5.h(width, motionLayout.getNanoTime(), height);
                }
            }
        }
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt2 = motionLayout.getChildAt(i25);
            p169z.n nVar6 = (p169z.n) map.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && nVar6 != null) {
                motionLayout.f8834J.f(nVar6);
                nVar6.h(width, motionLayout.getNanoTime(), height);
            }
        }
        p169z.y yVar2 = motionLayout.f8834J.f18417c;
        float f7 = yVar2 != null ? yVar2.f18406i : 0.0f;
        if (f7 != 0.0f) {
            boolean z4 = ((double) f7) < 0.0d;
            float fAbs = Math.abs(f7);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i26 = 0; i26 < childCount; i26++) {
                p169z.n nVar7 = (p169z.n) map.get(motionLayout.getChildAt(i26));
                if (!Float.isNaN(nVar7.f18331l)) {
                    for (int i27 = 0; i27 < childCount; i27++) {
                        p169z.n nVar8 = (p169z.n) map.get(motionLayout.getChildAt(i27));
                        if (!Float.isNaN(nVar8.f18331l)) {
                            fMin = Math.min(fMin, nVar8.f18331l);
                            fMax = Math.max(fMax, nVar8.f18331l);
                        }
                    }
                    while (i9 < childCount) {
                        p169z.n nVar9 = (p169z.n) map.get(motionLayout.getChildAt(i9));
                        if (!Float.isNaN(nVar9.f18331l)) {
                            nVar9.f18333n = 1.0f / (1.0f - fAbs);
                            if (z4) {
                                nVar9.f18332m = fAbs - (((fMax - nVar9.f18331l) / (fMax - fMin)) * fAbs);
                            } else {
                                nVar9.f18332m = fAbs - (((nVar9.f18331l - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i9++;
                    }
                    return;
                }
                p169z.w wVar = nVar7.f18327g;
                float f8 = wVar.f18390e;
                float f9 = wVar.f18391f;
                float f10 = z4 ? f9 - f8 : f9 + f8;
                fMin2 = Math.min(fMin2, f10);
                fMax2 = Math.max(fMax2, f10);
            }
            while (i9 < childCount) {
                p169z.n nVar10 = (p169z.n) map.get(motionLayout.getChildAt(i9));
                p169z.w wVar2 = nVar10.f18327g;
                float f11 = wVar2.f18390e;
                float f12 = wVar2.f18391f;
                float f13 = z4 ? f12 - f11 : f12 + f11;
                nVar10.f18333n = 1.0f / (1.0f - fAbs);
                nVar10.f18332m = fAbs - (((f13 - fMin2) * fAbs) / (fMax2 - fMin2));
                i9++;
            }
        }
    }

    public void m(p149v.f fVar, B.m mVar) {
        B.h hVar;
        B.h hVar2;
        SparseArray sparseArray = new SparseArray();
        B.n nVar = new B.n();
        sparseArray.clear();
        sparseArray.put(0, fVar);
        Object obj = this.f1217x;
        MotionLayout motionLayout = (MotionLayout) obj;
        sparseArray.put(motionLayout.getId(), fVar);
        if (mVar != null && mVar.f909c != 0) {
            p149v.f fVar2 = (p149v.f) this.f1214d;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
            boolean z4 = MotionLayout.f8824Y0;
            motionLayout.h(fVar2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        for (p149v.e eVar : fVar.f17009u0) {
            eVar.f16966j0 = true;
            sparseArray.put(eVar.f16963h0.getId(), eVar);
        }
        for (p149v.e eVar2 : fVar.f17009u0) {
            View view = eVar2.f16963h0;
            int id = view.getId();
            HashMap map = mVar.f912f;
            if (map.containsKey(Integer.valueOf(id)) && (hVar2 = (B.h) map.get(Integer.valueOf(id))) != null) {
                hVar2.a(nVar);
            }
            eVar2.P(mVar.h(view.getId()).f801e.f836c);
            eVar2.M(mVar.h(view.getId()).f801e.f837d);
            if (view instanceof ConstraintHelper) {
                ConstraintHelper constraintHelper = (ConstraintHelper) view;
                int id2 = constraintHelper.getId();
                HashMap map2 = mVar.f912f;
                if (map2.containsKey(Integer.valueOf(id2)) && (hVar = (B.h) map2.get(Integer.valueOf(id2))) != null && (eVar2 instanceof p149v.j)) {
                    constraintHelper.l(hVar, (p149v.j) eVar2, nVar, sparseArray);
                }
                if (view instanceof Barrier) {
                    ((Barrier) view).q();
                }
            }
            nVar.resolveLayoutDirection(motionLayout.getLayoutDirection());
            boolean z7 = MotionLayout.f8824Y0;
            ((MotionLayout) obj).a(false, view, eVar2, nVar, sparseArray);
            if (mVar.h(view.getId()).f799c.f887c == 1) {
                eVar2.f16965i0 = view.getVisibility();
            } else {
                eVar2.f16965i0 = mVar.h(view.getId()).f799c.f886b;
            }
        }
        for (p149v.e eVar3 : fVar.f17009u0) {
            if (eVar3 instanceof p149v.m) {
                ConstraintHelper constraintHelper2 = (ConstraintHelper) eVar3.f16963h0;
                p149v.j jVar = (p149v.j) eVar3;
                constraintHelper2.p(jVar, sparseArray);
                p149v.m mVar2 = (p149v.m) jVar;
                for (int i7 = 0; i7 < mVar2.f17062v0; i7++) {
                    p149v.e eVar4 = mVar2.f17061u0[i7];
                    if (eVar4 != null) {
                        eVar4.f16929G = true;
                    }
                }
            }
        }
    }

    public void n(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.f1217x;
        if (i7 < 0 || i7 >= recyclerView.f9729o0.a()) {
            StringBuilder sbG = p150v0.a.g("Invalid item position ", i7, "(", i7, "). Item count:");
            sbG.append(recyclerView.f9729o0.a());
            sbG.append(recyclerView.h());
            throw new IndexOutOfBoundsException(sbG.toString());
        }
        C c3 = recyclerView.f9729o0;
        boolean z4 = c3.f1220c;
        ArrayList arrayList = (ArrayList) this.f1213c;
        if (arrayList.size() > 0) {
            throw p031e1.k.c(arrayList, 0);
        }
        ArrayList arrayList2 = (ArrayList) recyclerView.f9715d.f8078d;
        if (arrayList2.size() > 0) {
            RecyclerView.j((View) arrayList2.get(0));
            throw null;
        }
        ArrayList arrayList3 = (ArrayList) this.f1214d;
        if (arrayList3.size() > 0) {
            throw p031e1.k.c(arrayList3, 0);
        }
        int I7 = recyclerView.f9714c.I(i7, 0);
        if (I7 >= 0) {
            throw null;
        }
        StringBuilder sbG2 = p150v0.a.g("Inconsistency detected. Invalid item position ", i7, "(offset:", I7, ").state:");
        sbG2.append(c3.a());
        sbG2.append(recyclerView.h());
        throw new IndexOutOfBoundsException(sbG2.toString());
    }

    public synchronized void o(p064i5.f fVar) {
        try {
            p064i5.e eVarI = i(fVar);
            if (eVarI != null) {
                ((HashSet) this.f1216f).add(fVar);
                ((HashSet) this.f1215e).remove(fVar);
                if (eVarI.a() != null) {
                    ((HashMap) this.f1217x).put(eVarI.a(), fVar);
                }
                fVar.f14037d.post(new K5.a(18, fVar, eVarI));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void p() {
        u uVar = ((RecyclerView) this.f1217x).f9741z;
        this.f1212b = this.f1211a;
        ArrayList arrayList = (ArrayList) this.f1214d;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f1212b) {
            return;
        }
        if (arrayList.get(size) != null) {
            throw new ClassCastException();
        }
        int[] iArr = RecyclerView.f9685y0;
        throw null;
    }

    @Override // p064i5.g
    public synchronized void start() {
        for (int i7 = 0; i7 < this.f1211a; i7++) {
            p064i5.f fVar = new p064i5.f(((String) this.f1213c) + i7, this.f1212b);
            fVar.a(new K5.a(19, this, fVar));
            ((HashSet) this.f1215e).add(fVar);
        }
    }

    public A(Class cls, Class[] clsArr) {
        this.f1213c = null;
        HashSet hashSet = new HashSet();
        this.f1214d = hashSet;
        this.f1215e = new HashSet();
        this.f1211a = 0;
        this.f1212b = 0;
        this.f1217x = new HashSet();
        hashSet.add(p048g4.q.a(cls));
        for (Class cls2 : clsArr) {
            p113p3.f.l(cls2, "Null interface");
            ((HashSet) this.f1214d).add(p048g4.q.a(cls2));
        }
    }

    public A(p048g4.q qVar, p048g4.q[] qVarArr) {
        this.f1213c = null;
        HashSet hashSet = new HashSet();
        this.f1214d = hashSet;
        this.f1215e = new HashSet();
        this.f1211a = 0;
        this.f1212b = 0;
        this.f1217x = new HashSet();
        hashSet.add(qVar);
        for (p048g4.q qVar2 : qVarArr) {
            p113p3.f.l(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f1214d, qVarArr);
    }

    public A(Integer num, int i7, Boolean bool, Integer num2, int i8, Integer num3, Boolean bool2) {
        this.f1213c = num;
        this.f1211a = i7;
        this.f1214d = bool;
        this.f1215e = num2;
        this.f1212b = i8;
        this.f1216f = num3;
        this.f1217x = bool2;
    }

    public A(MotionLayout motionLayout) {
        this.f1217x = motionLayout;
        this.f1213c = new p149v.f();
        this.f1214d = new p149v.f();
        this.f1215e = null;
        this.f1216f = null;
    }

    public A(RecyclerView recyclerView) {
        this.f1217x = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1213c = arrayList;
        this.f1214d = new ArrayList();
        this.f1215e = Collections.unmodifiableList(arrayList);
        this.f1211a = 2;
        this.f1212b = 2;
    }
}
