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
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.recyclerview.widget.RecyclerView;
import g4.C1128a;
import g4.C1136i;
import g4.C1144q;
import g4.InterfaceC1131d;
import i5.C1283e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import u.C1616e;
import v.AbstractC1662m;
import v.C1650a;
import v.C1654e;
import v.C1655f;
import v.C1657h;
import v.C1658i;
import v.C1659j;
import v.C1661l;
import v.EnumC1653d;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class A implements i5.g {

    /* renamed from: a, reason: collision with root package name */
    public int f1211a;

    /* renamed from: b, reason: collision with root package name */
    public int f1212b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1213c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1214d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1215e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1216f;

    /* renamed from: x, reason: collision with root package name */
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

    public static void h(C1655f c1655f, C1655f c1655f2) {
        ArrayList arrayList = c1655f.f17003u0;
        HashMap hashMap = new HashMap();
        hashMap.put(c1655f, c1655f2);
        c1655f2.f17003u0.clear();
        c1655f2.g(c1655f, hashMap);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1654e c1654e = (C1654e) it.next();
            C1654e c1650a = c1654e instanceof C1650a ? new C1650a() : c1654e instanceof C1658i ? new C1658i() : c1654e instanceof C1657h ? new C1657h() : c1654e instanceof C1661l ? new C1661l() : c1654e instanceof C1659j ? new C1659j() : new C1654e();
            c1655f2.f17003u0.add(c1650a);
            C1654e c1654e2 = c1650a.f16938V;
            if (c1654e2 != null) {
                ((C1655f) c1654e2).f17003u0.remove(c1650a);
                c1650a.D();
            }
            c1650a.f16938V = c1655f2;
            hashMap.put(c1654e, c1650a);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1654e c1654e3 = (C1654e) it2.next();
            ((C1654e) hashMap.get(c1654e3)).g(c1654e3, hashMap);
        }
    }

    public static C1654e j(C1655f c1655f, View view) {
        if (c1655f.f16957h0 == view) {
            return c1655f;
        }
        ArrayList arrayList = c1655f.f17003u0;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1654e c1654e = (C1654e) arrayList.get(i7);
            if (c1654e.f16957h0 == view) {
                return c1654e;
            }
        }
        return null;
    }

    public void b(C1136i c1136i) {
        if (((HashSet) this.f1214d).contains(c1136i.f13206a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f1215e).add(c1136i);
    }

    @Override // i5.g
    public synchronized void c(C1283e c1283e) {
        ((LinkedList) this.f1214d).add(c1283e);
        Iterator it = new HashSet((HashSet) this.f1215e).iterator();
        while (it.hasNext()) {
            o((i5.f) it.next());
        }
    }

    @Override // i5.g
    public synchronized void d() {
        try {
            Iterator it = ((HashSet) this.f1215e).iterator();
            while (it.hasNext()) {
                i5.f fVar = (i5.f) it.next();
                synchronized (fVar) {
                    HandlerThread handlerThread = fVar.f14030c;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        fVar.f14030c = null;
                        fVar.f14031d = null;
                    }
                }
            }
            Iterator it2 = ((HashSet) this.f1216f).iterator();
            while (it2.hasNext()) {
                i5.f fVar2 = (i5.f) it2.next();
                synchronized (fVar2) {
                    HandlerThread handlerThread2 = fVar2.f14030c;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        fVar2.f14030c = null;
                        fVar2.f14031d = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C1128a e() {
        if (((InterfaceC1131d) this.f1216f) != null) {
            return new C1128a((String) this.f1213c, new HashSet((HashSet) this.f1214d), new HashSet((HashSet) this.f1215e), this.f1211a, this.f1212b, (InterfaceC1131d) this.f1216f, (HashSet) this.f1217x);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void f() {
        int i7;
        SparseArray sparseArray;
        int[] iArr;
        int i8;
        MotionLayout motionLayout = (MotionLayout) this.f1217x;
        int childCount = motionLayout.getChildCount();
        motionLayout.f8854T.clear();
        SparseArray sparseArray2 = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = motionLayout.getChildAt(i9);
            z.n nVar = new z.n(childAt);
            int id = childAt.getId();
            iArr2[i9] = id;
            sparseArray2.put(id, nVar);
            motionLayout.f8854T.put(childAt, nVar);
        }
        int i10 = 0;
        while (i10 < childCount) {
            View childAt2 = motionLayout.getChildAt(i10);
            z.n nVar2 = (z.n) motionLayout.f8854T.get(childAt2);
            if (nVar2 == null) {
                i7 = childCount;
                sparseArray = sparseArray2;
                iArr = iArr2;
                i8 = i10;
            } else {
                if (((B.m) this.f1215e) != null) {
                    C1654e j = j((C1655f) this.f1213c, childAt2);
                    if (j != null) {
                        Rect j3 = MotionLayout.j(motionLayout, j);
                        B.m mVar = (B.m) this.f1215e;
                        int width = motionLayout.getWidth();
                        int height = motionLayout.getHeight();
                        sparseArray = sparseArray2;
                        int i11 = mVar.f909c;
                        iArr = iArr2;
                        if (i11 != 0) {
                            z.n.g(j3, nVar2.f18315a, i11, width, height);
                        }
                        z.w wVar = nVar2.f18320f;
                        wVar.f18382c = 0.0f;
                        wVar.f18383d = 0.0f;
                        nVar2.f(wVar);
                        i7 = childCount;
                        i8 = i10;
                        wVar.f(j3.left, j3.top, j3.width(), j3.height());
                        B.h h6 = mVar.h(nVar2.f18317c);
                        wVar.a(h6);
                        B.j jVar = h6.f800d;
                        nVar2.f18325l = jVar.f879g;
                        nVar2.f18322h.c(j3, mVar, i11, nVar2.f18317c);
                        nVar2.f18309B = h6.f802f.f899i;
                        nVar2.f18311D = jVar.j;
                        nVar2.f18312E = jVar.f881i;
                        Context context = nVar2.f18316b.getContext();
                        int i12 = jVar.f883l;
                        nVar2.f18313F = i12 != -2 ? i12 != -1 ? i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 4 ? i12 != 5 ? null : new OvershootInterpolator() : new BounceInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator() : new z.m(C1616e.d(jVar.f882k), 0) : AnimationUtils.loadInterpolator(context, jVar.f884m);
                    } else {
                        i7 = childCount;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i8 = i10;
                        if (motionLayout.f8867g0 != 0) {
                            Log.e("MotionLayout", p6.c.d() + "no widget for  " + p6.c.g(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                } else {
                    i7 = childCount;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i8 = i10;
                }
                if (((B.m) this.f1216f) != null) {
                    C1654e j7 = j((C1655f) this.f1214d, childAt2);
                    if (j7 != null) {
                        Rect j8 = MotionLayout.j(motionLayout, j7);
                        B.m mVar2 = (B.m) this.f1216f;
                        int width2 = motionLayout.getWidth();
                        int height2 = motionLayout.getHeight();
                        int i13 = mVar2.f909c;
                        if (i13 != 0) {
                            z.n.g(j8, nVar2.f18315a, i13, width2, height2);
                            j8 = nVar2.f18315a;
                        }
                        z.w wVar2 = nVar2.f18321g;
                        wVar2.f18382c = 1.0f;
                        wVar2.f18383d = 1.0f;
                        nVar2.f(wVar2);
                        wVar2.f(j8.left, j8.top, j8.width(), j8.height());
                        wVar2.a(mVar2.h(nVar2.f18317c));
                        nVar2.f18323i.c(j8, mVar2, i13, nVar2.f18317c);
                    } else if (motionLayout.f8867g0 != 0) {
                        Log.e("MotionLayout", p6.c.d() + "no widget for  " + p6.c.g(childAt2) + " (" + childAt2.getClass().getName() + ")");
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
        int i14 = childCount;
        int i15 = 0;
        while (i15 < i14) {
            SparseArray sparseArray4 = sparseArray3;
            z.n nVar3 = (z.n) sparseArray4.get(iArr3[i15]);
            int i16 = nVar3.f18320f.f18373B;
            if (i16 != -1) {
                z.n nVar4 = (z.n) sparseArray4.get(i16);
                nVar3.f18320f.l(nVar4, nVar4.f18320f);
                nVar3.f18321g.l(nVar4, nVar4.f18321g);
            }
            i15++;
            sparseArray3 = sparseArray4;
        }
    }

    public void g(int i7, int i8) {
        MotionLayout motionLayout = (MotionLayout) this.f1217x;
        int optimizationLevel = motionLayout.getOptimizationLevel();
        if (motionLayout.f8844O == motionLayout.getStartState()) {
            C1655f c1655f = (C1655f) this.f1214d;
            B.m mVar = (B.m) this.f1216f;
            motionLayout.h(c1655f, optimizationLevel, (mVar == null || mVar.f909c == 0) ? i7 : i8, (mVar == null || mVar.f909c == 0) ? i8 : i7);
            B.m mVar2 = (B.m) this.f1215e;
            if (mVar2 != null) {
                C1655f c1655f2 = (C1655f) this.f1213c;
                int i9 = mVar2.f909c;
                int i10 = i9 == 0 ? i7 : i8;
                if (i9 == 0) {
                    i7 = i8;
                }
                motionLayout.h(c1655f2, optimizationLevel, i10, i7);
                return;
            }
            return;
        }
        B.m mVar3 = (B.m) this.f1215e;
        if (mVar3 != null) {
            C1655f c1655f3 = (C1655f) this.f1213c;
            int i11 = mVar3.f909c;
            motionLayout.h(c1655f3, optimizationLevel, i11 == 0 ? i7 : i8, i11 == 0 ? i8 : i7);
        }
        C1655f c1655f4 = (C1655f) this.f1214d;
        B.m mVar4 = (B.m) this.f1216f;
        int i12 = (mVar4 == null || mVar4.f909c == 0) ? i7 : i8;
        if (mVar4 == null || mVar4.f909c == 0) {
            i7 = i8;
        }
        motionLayout.h(c1655f4, optimizationLevel, i12, i7);
    }

    public synchronized C1283e i(i5.f fVar) {
        C1283e c1283e;
        i5.f fVar2;
        try {
            ListIterator listIterator = ((LinkedList) this.f1214d).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                c1283e = (C1283e) listIterator.next();
                fVar2 = c1283e.a() != null ? (i5.f) ((HashMap) this.f1217x).get(c1283e.a()) : null;
                if (fVar2 == null) {
                    break;
                }
            } while (fVar2 != fVar);
            listIterator.remove();
            return c1283e;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void k(B.m mVar, B.m mVar2) {
        this.f1215e = mVar;
        this.f1216f = mVar2;
        this.f1213c = new C1655f();
        C1655f c1655f = new C1655f();
        this.f1214d = c1655f;
        C1655f c1655f2 = (C1655f) this.f1213c;
        boolean z4 = MotionLayout.f8824Y0;
        MotionLayout motionLayout = (MotionLayout) this.f1217x;
        C1655f c1655f3 = motionLayout.f9009c;
        B.d dVar = c1655f3.f17007y0;
        c1655f2.f17007y0 = dVar;
        c1655f2.f17005w0.f1622f = dVar;
        B.d dVar2 = c1655f3.f17007y0;
        c1655f.f17007y0 = dVar2;
        c1655f.f17005w0.f1622f = dVar2;
        c1655f2.f17003u0.clear();
        ((C1655f) this.f1214d).f17003u0.clear();
        h(motionLayout.f9009c, (C1655f) this.f1213c);
        h(motionLayout.f9009c, (C1655f) this.f1214d);
        if (motionLayout.f8862a0 > 0.5d) {
            if (mVar != null) {
                m((C1655f) this.f1213c, mVar);
            }
            m((C1655f) this.f1214d, mVar2);
        } else {
            m((C1655f) this.f1214d, mVar2);
            if (mVar != null) {
                m((C1655f) this.f1213c, mVar);
            }
        }
        ((C1655f) this.f1213c).f17008z0 = motionLayout.e();
        C1655f c1655f4 = (C1655f) this.f1213c;
        c1655f4.f17004v0.L(c1655f4);
        ((C1655f) this.f1214d).f17008z0 = motionLayout.e();
        C1655f c1655f5 = (C1655f) this.f1214d;
        c1655f5.f17004v0.L(c1655f5);
        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
        if (layoutParams != null) {
            int i7 = layoutParams.width;
            EnumC1653d enumC1653d = EnumC1653d.f16913b;
            if (i7 == -2) {
                ((C1655f) this.f1213c).N(enumC1653d);
                ((C1655f) this.f1214d).N(enumC1653d);
            }
            if (layoutParams.height == -2) {
                ((C1655f) this.f1213c).O(enumC1653d);
                ((C1655f) this.f1214d).O(enumC1653d);
            }
        }
    }

    public void l() {
        HashMap hashMap;
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
            motionLayout.f8829E0 = ((C1655f) this.f1213c).r();
            motionLayout.f8830F0 = ((C1655f) this.f1213c).l();
            motionLayout.f8831G0 = ((C1655f) this.f1214d).r();
            int l7 = ((C1655f) this.f1214d).l();
            motionLayout.f8832H0 = l7;
            motionLayout.f8828D0 = (motionLayout.f8829E0 == motionLayout.f8831G0 && motionLayout.f8830F0 == l7) ? false : true;
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
        C1655f c1655f = (C1655f) this.f1213c;
        motionLayout.g(i7, i8, i13, c1655f.f16995I0 || ((C1655f) this.f1214d).f16995I0, c1655f.f16996J0 || ((C1655f) this.f1214d).f16996J0, i15);
        int childCount = motionLayout.getChildCount();
        motionLayout.f8853S0.f();
        motionLayout.f8865e0 = true;
        SparseArray sparseArray = new SparseArray();
        int i16 = 0;
        while (true) {
            hashMap = motionLayout.f8854T;
            if (i16 >= childCount) {
                break;
            }
            View childAt = motionLayout.getChildAt(i16);
            sparseArray.put(childAt.getId(), (z.n) hashMap.get(childAt));
            i16++;
        }
        int width = motionLayout.getWidth();
        int height = motionLayout.getHeight();
        z.y yVar = motionLayout.f8834J.f18411c;
        int i17 = yVar != null ? yVar.f18406p : -1;
        if (i17 != -1) {
            for (int i18 = 0; i18 < childCount; i18++) {
                z.n nVar = (z.n) hashMap.get(motionLayout.getChildAt(i18));
                if (nVar != null) {
                    nVar.f18308A = i17;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[hashMap.size()];
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            z.n nVar2 = (z.n) hashMap.get(motionLayout.getChildAt(i20));
            int i21 = nVar2.f18320f.f18373B;
            if (i21 != -1) {
                sparseBooleanArray.put(i21, true);
                iArr[i19] = nVar2.f18320f.f18373B;
                i19++;
            }
        }
        if (motionLayout.f8883w0 != null) {
            for (int i22 = 0; i22 < i19; i22++) {
                z.n nVar3 = (z.n) hashMap.get(motionLayout.findViewById(iArr[i22]));
                if (nVar3 != null) {
                    motionLayout.f8834J.f(nVar3);
                }
            }
            Iterator it = motionLayout.f8883w0.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).r(motionLayout, hashMap);
            }
            for (int i23 = 0; i23 < i19; i23++) {
                z.n nVar4 = (z.n) hashMap.get(motionLayout.findViewById(iArr[i23]));
                if (nVar4 != null) {
                    nVar4.h(width, motionLayout.getNanoTime(), height);
                }
            }
        } else {
            for (int i24 = 0; i24 < i19; i24++) {
                z.n nVar5 = (z.n) hashMap.get(motionLayout.findViewById(iArr[i24]));
                if (nVar5 != null) {
                    motionLayout.f8834J.f(nVar5);
                    nVar5.h(width, motionLayout.getNanoTime(), height);
                }
            }
        }
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt2 = motionLayout.getChildAt(i25);
            z.n nVar6 = (z.n) hashMap.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && nVar6 != null) {
                motionLayout.f8834J.f(nVar6);
                nVar6.h(width, motionLayout.getNanoTime(), height);
            }
        }
        z.y yVar2 = motionLayout.f8834J.f18411c;
        float f7 = yVar2 != null ? yVar2.f18400i : 0.0f;
        if (f7 != 0.0f) {
            boolean z4 = ((double) f7) < 0.0d;
            float abs = Math.abs(f7);
            float f8 = -3.4028235E38f;
            float f9 = Float.MAX_VALUE;
            float f10 = -3.4028235E38f;
            float f11 = Float.MAX_VALUE;
            for (int i26 = 0; i26 < childCount; i26++) {
                z.n nVar7 = (z.n) hashMap.get(motionLayout.getChildAt(i26));
                if (!Float.isNaN(nVar7.f18325l)) {
                    for (int i27 = 0; i27 < childCount; i27++) {
                        z.n nVar8 = (z.n) hashMap.get(motionLayout.getChildAt(i27));
                        if (!Float.isNaN(nVar8.f18325l)) {
                            f9 = Math.min(f9, nVar8.f18325l);
                            f8 = Math.max(f8, nVar8.f18325l);
                        }
                    }
                    while (i9 < childCount) {
                        z.n nVar9 = (z.n) hashMap.get(motionLayout.getChildAt(i9));
                        if (!Float.isNaN(nVar9.f18325l)) {
                            nVar9.f18327n = 1.0f / (1.0f - abs);
                            if (z4) {
                                nVar9.f18326m = abs - (((f8 - nVar9.f18325l) / (f8 - f9)) * abs);
                            } else {
                                nVar9.f18326m = abs - (((nVar9.f18325l - f9) * abs) / (f8 - f9));
                            }
                        }
                        i9++;
                    }
                    return;
                }
                z.w wVar = nVar7.f18321g;
                float f12 = wVar.f18384e;
                float f13 = wVar.f18385f;
                float f14 = z4 ? f13 - f12 : f13 + f12;
                f11 = Math.min(f11, f14);
                f10 = Math.max(f10, f14);
            }
            while (i9 < childCount) {
                z.n nVar10 = (z.n) hashMap.get(motionLayout.getChildAt(i9));
                z.w wVar2 = nVar10.f18321g;
                float f15 = wVar2.f18384e;
                float f16 = wVar2.f18385f;
                float f17 = z4 ? f16 - f15 : f16 + f15;
                nVar10.f18327n = 1.0f / (1.0f - abs);
                nVar10.f18326m = abs - (((f17 - f11) * abs) / (f10 - f11));
                i9++;
            }
        }
    }

    public void m(C1655f c1655f, B.m mVar) {
        B.h hVar;
        B.h hVar2;
        SparseArray sparseArray = new SparseArray();
        B.n nVar = new B.n();
        sparseArray.clear();
        sparseArray.put(0, c1655f);
        Object obj = this.f1217x;
        MotionLayout motionLayout = (MotionLayout) obj;
        sparseArray.put(motionLayout.getId(), c1655f);
        if (mVar != null && mVar.f909c != 0) {
            C1655f c1655f2 = (C1655f) this.f1214d;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
            boolean z4 = MotionLayout.f8824Y0;
            motionLayout.h(c1655f2, optimizationLevel, makeMeasureSpec, makeMeasureSpec2);
        }
        Iterator it = c1655f.f17003u0.iterator();
        while (it.hasNext()) {
            C1654e c1654e = (C1654e) it.next();
            c1654e.f16960j0 = true;
            sparseArray.put(c1654e.f16957h0.getId(), c1654e);
        }
        Iterator it2 = c1655f.f17003u0.iterator();
        while (it2.hasNext()) {
            C1654e c1654e2 = (C1654e) it2.next();
            View view = c1654e2.f16957h0;
            int id = view.getId();
            HashMap hashMap = mVar.f912f;
            if (hashMap.containsKey(Integer.valueOf(id)) && (hVar2 = (B.h) hashMap.get(Integer.valueOf(id))) != null) {
                hVar2.a(nVar);
            }
            c1654e2.P(mVar.h(view.getId()).f801e.f836c);
            c1654e2.M(mVar.h(view.getId()).f801e.f837d);
            if (view instanceof ConstraintHelper) {
                ConstraintHelper constraintHelper = (ConstraintHelper) view;
                int id2 = constraintHelper.getId();
                HashMap hashMap2 = mVar.f912f;
                if (hashMap2.containsKey(Integer.valueOf(id2)) && (hVar = (B.h) hashMap2.get(Integer.valueOf(id2))) != null && (c1654e2 instanceof C1659j)) {
                    constraintHelper.l(hVar, (C1659j) c1654e2, nVar, sparseArray);
                }
                if (view instanceof Barrier) {
                    ((Barrier) view).q();
                }
            }
            nVar.resolveLayoutDirection(motionLayout.getLayoutDirection());
            boolean z7 = MotionLayout.f8824Y0;
            ((MotionLayout) obj).a(false, view, c1654e2, nVar, sparseArray);
            if (mVar.h(view.getId()).f799c.f887c == 1) {
                c1654e2.f16959i0 = view.getVisibility();
            } else {
                c1654e2.f16959i0 = mVar.h(view.getId()).f799c.f886b;
            }
        }
        Iterator it3 = c1655f.f17003u0.iterator();
        while (it3.hasNext()) {
            C1654e c1654e3 = (C1654e) it3.next();
            if (c1654e3 instanceof AbstractC1662m) {
                ConstraintHelper constraintHelper2 = (ConstraintHelper) c1654e3.f16957h0;
                C1659j c1659j = (C1659j) c1654e3;
                constraintHelper2.p(c1659j, sparseArray);
                AbstractC1662m abstractC1662m = (AbstractC1662m) c1659j;
                for (int i7 = 0; i7 < abstractC1662m.f17056v0; i7++) {
                    C1654e c1654e4 = abstractC1662m.f17055u0[i7];
                    if (c1654e4 != null) {
                        c1654e4.f16923G = true;
                    }
                }
            }
        }
    }

    public void n(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.f1217x;
        if (i7 < 0 || i7 >= recyclerView.f9729o0.a()) {
            StringBuilder g3 = AbstractC1663a.g("Invalid item position ", i7, "(", i7, "). Item count:");
            g3.append(recyclerView.f9729o0.a());
            g3.append(recyclerView.h());
            throw new IndexOutOfBoundsException(g3.toString());
        }
        C c3 = recyclerView.f9729o0;
        boolean z4 = c3.f1220c;
        ArrayList arrayList = (ArrayList) this.f1213c;
        if (arrayList.size() > 0) {
            throw e1.k.c(arrayList, 0);
        }
        ArrayList arrayList2 = (ArrayList) recyclerView.f9715d.f8078d;
        if (arrayList2.size() > 0) {
            RecyclerView.j((View) arrayList2.get(0));
            throw null;
        }
        ArrayList arrayList3 = (ArrayList) this.f1214d;
        if (arrayList3.size() > 0) {
            throw e1.k.c(arrayList3, 0);
        }
        int I7 = recyclerView.f9714c.I(i7, 0);
        if (I7 >= 0) {
            throw null;
        }
        StringBuilder g7 = AbstractC1663a.g("Inconsistency detected. Invalid item position ", i7, "(offset:", I7, ").state:");
        g7.append(c3.a());
        g7.append(recyclerView.h());
        throw new IndexOutOfBoundsException(g7.toString());
    }

    public synchronized void o(i5.f fVar) {
        try {
            C1283e i7 = i(fVar);
            if (i7 != null) {
                ((HashSet) this.f1216f).add(fVar);
                ((HashSet) this.f1215e).remove(fVar);
                if (i7.a() != null) {
                    ((HashMap) this.f1217x).put(i7.a(), fVar);
                }
                fVar.f14031d.post(new K5.a(18, fVar, i7));
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

    @Override // i5.g
    public synchronized void start() {
        for (int i7 = 0; i7 < this.f1211a; i7++) {
            i5.f fVar = new i5.f(((String) this.f1213c) + i7, this.f1212b);
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
        hashSet.add(C1144q.a(cls));
        for (Class cls2 : clsArr) {
            p3.f.l(cls2, "Null interface");
            ((HashSet) this.f1214d).add(C1144q.a(cls2));
        }
    }

    public A(C1144q c1144q, C1144q[] c1144qArr) {
        this.f1213c = null;
        HashSet hashSet = new HashSet();
        this.f1214d = hashSet;
        this.f1215e = new HashSet();
        this.f1211a = 0;
        this.f1212b = 0;
        this.f1217x = new HashSet();
        hashSet.add(c1144q);
        for (C1144q c1144q2 : c1144qArr) {
            p3.f.l(c1144q2, "Null interface");
        }
        Collections.addAll((HashSet) this.f1214d, c1144qArr);
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
        this.f1213c = new C1655f();
        this.f1214d = new C1655f();
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
