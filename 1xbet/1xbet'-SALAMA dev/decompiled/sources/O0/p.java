package O0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f4887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f4888b;

    /* JADX WARN: Code duplicated, block: B:103:0x0208  */
    /* JADX WARN: Code duplicated, block: B:105:0x0216  */
    /* JADX WARN: Code duplicated, block: B:109:0x0234  */
    /* JADX WARN: Code duplicated, block: B:133:0x0293  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e2 A[EDGE_INSN: B:138:0x01e2->B:93:0x01e2 BREAK  A[LOOP:1: B:19:0x0088->B:92:0x01da], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[LOOP:0: B:15:0x0053->B:17:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:51:0x0107  */
    /* JADX WARN: Code duplicated, block: B:65:0x0152  */
    /* JADX WARN: Code duplicated, block: B:67:0x015b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f5  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        m mVar;
        int i7;
        p072k1.g gVar;
        p072k1.g gVar2;
        p122r.b bVar;
        p122r.b bVar2;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        p122r.b bVarO;
        int i11;
        Animator animator;
        k kVar;
        View view;
        s sVar;
        s sVar2;
        int i12;
        int i13;
        View view2;
        s sVar3;
        int i14;
        p122r.b bVar3;
        int i15;
        int i16;
        View view3;
        SparseArray sparseArray;
        int size;
        int i17;
        View view4;
        View view5;
        p122r.f fVar;
        int iE;
        int i18;
        View view6;
        Iterator it;
        int i19 = 1;
        ViewGroup viewGroup = this.f4888b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = q.f4890b;
        ViewGroup viewGroup2 = this.f4888b;
        if (!arrayList2.remove(viewGroup2)) {
            return true;
        }
        p122r.b bVarA = q.a();
        Long l7 = null;
        ArrayList arrayList3 = (ArrayList) bVarA.getOrDefault(viewGroup2, null);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            mVar = this.f4887a;
            arrayList3.add(mVar);
            mVar.a(new o(this, bVarA));
            i7 = 0;
            mVar.h(viewGroup2, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).w(viewGroup2);
                }
            }
            mVar.f4867B = new ArrayList();
            mVar.f4868C = new ArrayList();
            gVar = mVar.f4882x;
            gVar2 = mVar.f4883y;
            bVar = new p122r.b((p122r.b) gVar.f14680a);
            bVar2 = new p122r.b((p122r.b) gVar2.f14680a);
            i8 = 0;
            while (true) {
                iArr = mVar.f4866A;
                if (i8 < iArr.length) {
                    break;
                }
                i12 = iArr[i8];
                if (i12 != i19) {
                    for (i13 = bVar.f16013c - i19; i13 >= 0; i13--) {
                        view2 = (View) bVar.h(i13);
                        if (view2 == null && mVar.s(view2) && (sVar3 = (s) bVar2.remove(view2)) != null && mVar.s(sVar3.f4895b)) {
                            mVar.f4867B.add((s) bVar.i(i13));
                            mVar.f4868C.add(sVar3);
                        }
                    }
                } else if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            fVar = (p122r.f) gVar.f14682c;
                            iE = fVar.e();
                            i18 = i7;
                            while (i18 < iE) {
                                view6 = (View) fVar.f(i18);
                                if (view6 == null && mVar.s(view6)) {
                                    if (fVar.f15991a) {
                                        fVar.b();
                                    }
                                    View view7 = (View) ((p122r.f) gVar2.f14682c).c(fVar.f15992b[i18], l7);
                                    if (view7 != null && mVar.s(view7)) {
                                        s sVar4 = (s) bVar.getOrDefault(view6, l7);
                                        s sVar5 = (s) bVar2.getOrDefault(view7, l7);
                                        if (sVar4 != null && sVar5 != null) {
                                            mVar.f4867B.add(sVar4);
                                            mVar.f4868C.add(sVar5);
                                            bVar.remove(view6);
                                            bVar2.remove(view7);
                                        }
                                    }
                                    i19 = 1;
                                }
                                i18 += i19;
                                l7 = null;
                            }
                        }
                        i14 = i19;
                    } else {
                        sparseArray = (SparseArray) gVar.f14681b;
                        SparseArray sparseArray2 = (SparseArray) gVar2.f14681b;
                        size = sparseArray.size();
                        for (i17 = 0; i17 < size; i17++) {
                            view4 = (View) sparseArray.valueAt(i17);
                            if (view4 == null && mVar.s(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i17))) != null && mVar.s(view5)) {
                                s sVar6 = (s) bVar.getOrDefault(view4, null);
                                s sVar7 = (s) bVar2.getOrDefault(view5, null);
                                if (sVar6 != null && sVar7 != null) {
                                    mVar.f4867B.add(sVar6);
                                    mVar.f4868C.add(sVar7);
                                    bVar.remove(view4);
                                    bVar2.remove(view5);
                                }
                            }
                        }
                    }
                    i8 += i14;
                    i19 = i14;
                    i7 = 0;
                    l7 = null;
                } else {
                    bVar3 = (p122r.b) gVar.f14683d;
                    i15 = bVar3.f16013c;
                    for (i16 = 0; i16 < i15; i16++) {
                        view3 = (View) bVar3.j(i16);
                        if (view3 == null && mVar.s(view3)) {
                            View view8 = (View) ((p122r.b) gVar2.f14683d).getOrDefault(bVar3.h(i16), null);
                            if (view8 != null && mVar.s(view8)) {
                                s sVar8 = (s) bVar.getOrDefault(view3, null);
                                s sVar9 = (s) bVar2.getOrDefault(view8, null);
                                if (sVar8 != null && sVar9 != null) {
                                    mVar.f4867B.add(sVar8);
                                    mVar.f4868C.add(sVar9);
                                    bVar.remove(view3);
                                    bVar2.remove(view8);
                                }
                            }
                        }
                    }
                }
                i14 = 1;
                i8 += i14;
                i19 = i14;
                i7 = 0;
                l7 = null;
            }
            for (i9 = 0; i9 < bVar.f16013c; i9++) {
                sVar2 = (s) bVar.j(i9);
                if (mVar.s(sVar2.f4895b)) {
                    mVar.f4867B.add(sVar2);
                    mVar.f4868C.add(null);
                }
            }
            for (i10 = 0; i10 < bVar2.f16013c; i10++) {
                sVar = (s) bVar2.j(i10);
                if (mVar.s(sVar.f4895b)) {
                    mVar.f4868C.add(sVar);
                    mVar.f4867B.add(null);
                }
            }
            bVarO = m.o();
            int i20 = bVarO.f16013c;
            u uVar = t.f4897a;
            WindowId windowId = viewGroup2.getWindowId();
            for (i11 = i20 - 1; i11 >= 0; i11--) {
                animator = (Animator) bVarO.h(i11);
                if (animator == null && (kVar = (k) bVarO.getOrDefault(animator, null)) != null && (view = kVar.f4858a) != null && kVar.f4861d.f4919a.equals(windowId)) {
                    s sVarQ = mVar.q(view, true);
                    s sVarN = mVar.n(view, true);
                    if (sVarQ == null && sVarN == null) {
                        sVarN = (s) ((p122r.b) mVar.f4883y.f14680a).getOrDefault(view, null);
                    }
                    if ((sVarQ != null || sVarN != null) && kVar.f4862e.r(kVar.f4860c, sVarN)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            bVarO.remove(animator);
                        }
                    }
                }
            }
            mVar.l(viewGroup2, mVar.f4882x, mVar.f4883y, mVar.f4867B, mVar.f4868C);
            mVar.x();
            return true;
        }
        arrayList3 = new ArrayList();
        bVarA.put(viewGroup2, arrayList3);
        mVar = this.f4887a;
        arrayList3.add(mVar);
        mVar.a(new o(this, bVarA));
        i7 = 0;
        mVar.h(viewGroup2, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((m) it.next()).w(viewGroup2);
            }
        }
        mVar.f4867B = new ArrayList();
        mVar.f4868C = new ArrayList();
        gVar = mVar.f4882x;
        gVar2 = mVar.f4883y;
        bVar = new p122r.b((p122r.b) gVar.f14680a);
        bVar2 = new p122r.b((p122r.b) gVar2.f14680a);
        i8 = 0;
        while (true) {
            iArr = mVar.f4866A;
            if (i8 < iArr.length) {
                break;
                break;
            }
            i12 = iArr[i8];
            if (i12 != i19) {
                while (i13 >= 0) {
                    view2 = (View) bVar.h(i13);
                    if (view2 == null) {
                    }
                }
            } else if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 == 4) {
                        fVar = (p122r.f) gVar.f14682c;
                        iE = fVar.e();
                        i18 = i7;
                        while (i18 < iE) {
                            view6 = (View) fVar.f(i18);
                            if (view6 == null) {
                            }
                            i18 += i19;
                            l7 = null;
                        }
                    }
                    i14 = i19;
                } else {
                    sparseArray = (SparseArray) gVar.f14681b;
                    SparseArray sparseArray3 = (SparseArray) gVar2.f14681b;
                    size = sparseArray.size();
                    while (i17 < size) {
                        view4 = (View) sparseArray.valueAt(i17);
                        if (view4 == null) {
                        }
                    }
                }
                i8 += i14;
                i19 = i14;
                i7 = 0;
                l7 = null;
            } else {
                bVar3 = (p122r.b) gVar.f14683d;
                i15 = bVar3.f16013c;
                while (i16 < i15) {
                    view3 = (View) bVar3.j(i16);
                    if (view3 == null) {
                    }
                }
            }
            i14 = 1;
            i8 += i14;
            i19 = i14;
            i7 = 0;
            l7 = null;
        }
        while (i9 < bVar.f16013c) {
            sVar2 = (s) bVar.j(i9);
            if (mVar.s(sVar2.f4895b)) {
                mVar.f4867B.add(sVar2);
                mVar.f4868C.add(null);
            }
        }
        while (i10 < bVar2.f16013c) {
            sVar = (s) bVar2.j(i10);
            if (mVar.s(sVar.f4895b)) {
                mVar.f4868C.add(sVar);
                mVar.f4867B.add(null);
            }
        }
        bVarO = m.o();
        int i21 = bVarO.f16013c;
        u uVar2 = t.f4897a;
        WindowId windowId2 = viewGroup2.getWindowId();
        while (i11 >= 0) {
            animator = (Animator) bVarO.h(i11);
            if (animator == null) {
            }
        }
        mVar.l(viewGroup2, mVar.f4882x, mVar.f4883y, mVar.f4867B, mVar.f4868C);
        mVar.x();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f4888b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = q.f4890b;
        ViewGroup viewGroup2 = this.f4888b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) q.a().getOrDefault(viewGroup2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((m) it.next()).w(viewGroup2);
            }
        }
        this.f4887a.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
