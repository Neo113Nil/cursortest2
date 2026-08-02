package O0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public m f4887a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f4888b;

    /* JADX WARN: Removed duplicated region for block: B:119:0x01e2 A[EDGE_INSN: B:119:0x01e2->B:120:0x01e2 BREAK  A[LOOP:1: B:17:0x0088->B:29:0x01da], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        m mVar;
        int i7;
        r.b bVar;
        r.b bVar2;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        k kVar;
        View view;
        s sVar;
        int i12;
        View view2;
        int i13 = 1;
        ViewGroup viewGroup = this.f4888b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = q.f4890b;
        ViewGroup viewGroup2 = this.f4888b;
        if (!arrayList2.remove(viewGroup2)) {
            return true;
        }
        r.b a2 = q.a();
        Long l7 = null;
        ArrayList arrayList3 = (ArrayList) a2.getOrDefault(viewGroup2, null);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            a2.put(viewGroup2, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            mVar = this.f4887a;
            arrayList3.add(mVar);
            mVar.a(new o(this, a2));
            i7 = 0;
            mVar.h(viewGroup2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).w(viewGroup2);
                }
            }
            mVar.f4867B = new ArrayList();
            mVar.f4868C = new ArrayList();
            k1.g gVar = mVar.f4882x;
            k1.g gVar2 = mVar.f4883y;
            bVar = new r.b((r.b) gVar.f14674a);
            bVar2 = new r.b((r.b) gVar2.f14674a);
            i8 = 0;
            while (true) {
                iArr = mVar.f4866A;
                if (i8 < iArr.length) {
                    break;
                }
                int i14 = iArr[i8];
                if (i14 == i13) {
                    for (int i15 = bVar.f16007c - i13; i15 >= 0; i15--) {
                        View view3 = (View) bVar.h(i15);
                        if (view3 != null && mVar.s(view3) && (sVar = (s) bVar2.remove(view3)) != null && mVar.s(sVar.f4895b)) {
                            mVar.f4867B.add((s) bVar.i(i15));
                            mVar.f4868C.add(sVar);
                        }
                    }
                } else if (i14 == 2) {
                    r.b bVar3 = (r.b) gVar.f14677d;
                    int i16 = bVar3.f16007c;
                    for (int i17 = 0; i17 < i16; i17++) {
                        View view4 = (View) bVar3.j(i17);
                        if (view4 != null && mVar.s(view4)) {
                            View view5 = (View) ((r.b) gVar2.f14677d).getOrDefault(bVar3.h(i17), null);
                            if (view5 != null && mVar.s(view5)) {
                                s sVar2 = (s) bVar.getOrDefault(view4, null);
                                s sVar3 = (s) bVar2.getOrDefault(view5, null);
                                if (sVar2 != null && sVar3 != null) {
                                    mVar.f4867B.add(sVar2);
                                    mVar.f4868C.add(sVar3);
                                    bVar.remove(view4);
                                    bVar2.remove(view5);
                                }
                            }
                        }
                    }
                } else if (i14 != 3) {
                    if (i14 == 4) {
                        r.f fVar = (r.f) gVar.f14676c;
                        int e7 = fVar.e();
                        int i18 = i7;
                        while (i18 < e7) {
                            View view6 = (View) fVar.f(i18);
                            if (view6 != null && mVar.s(view6)) {
                                if (fVar.f15985a) {
                                    fVar.b();
                                }
                                View view7 = (View) ((r.f) gVar2.f14676c).c(fVar.f15986b[i18], l7);
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
                                i13 = 1;
                            }
                            i18 += i13;
                            l7 = null;
                        }
                    }
                    i12 = i13;
                    i8 += i12;
                    i13 = i12;
                    i7 = 0;
                    l7 = null;
                } else {
                    SparseArray sparseArray = (SparseArray) gVar.f14675b;
                    SparseArray sparseArray2 = (SparseArray) gVar2.f14675b;
                    int size = sparseArray.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        View view8 = (View) sparseArray.valueAt(i19);
                        if (view8 != null && mVar.s(view8) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i19))) != null && mVar.s(view2)) {
                            s sVar6 = (s) bVar.getOrDefault(view8, null);
                            s sVar7 = (s) bVar2.getOrDefault(view2, null);
                            if (sVar6 != null && sVar7 != null) {
                                mVar.f4867B.add(sVar6);
                                mVar.f4868C.add(sVar7);
                                bVar.remove(view8);
                                bVar2.remove(view2);
                            }
                        }
                    }
                }
                i12 = 1;
                i8 += i12;
                i13 = i12;
                i7 = 0;
                l7 = null;
            }
            for (i9 = 0; i9 < bVar.f16007c; i9++) {
                s sVar8 = (s) bVar.j(i9);
                if (mVar.s(sVar8.f4895b)) {
                    mVar.f4867B.add(sVar8);
                    mVar.f4868C.add(null);
                }
            }
            for (i10 = 0; i10 < bVar2.f16007c; i10++) {
                s sVar9 = (s) bVar2.j(i10);
                if (mVar.s(sVar9.f4895b)) {
                    mVar.f4868C.add(sVar9);
                    mVar.f4867B.add(null);
                }
            }
            r.b o7 = m.o();
            int i20 = o7.f16007c;
            u uVar = t.f4897a;
            WindowId windowId = viewGroup2.getWindowId();
            for (i11 = i20 - 1; i11 >= 0; i11--) {
                Animator animator = (Animator) o7.h(i11);
                if (animator != null && (kVar = (k) o7.getOrDefault(animator, null)) != null && (view = kVar.f4858a) != null && kVar.f4861d.f4919a.equals(windowId)) {
                    s q7 = mVar.q(view, true);
                    s n2 = mVar.n(view, true);
                    if (q7 == null && n2 == null) {
                        n2 = (s) ((r.b) mVar.f4883y.f14674a).getOrDefault(view, null);
                    }
                    if ((q7 != null || n2 != null) && kVar.f4862e.r(kVar.f4860c, n2)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            o7.remove(animator);
                        }
                    }
                }
            }
            mVar.l(viewGroup2, mVar.f4882x, mVar.f4883y, mVar.f4867B, mVar.f4868C);
            mVar.x();
            return true;
        }
        arrayList = null;
        mVar = this.f4887a;
        arrayList3.add(mVar);
        mVar.a(new o(this, a2));
        i7 = 0;
        mVar.h(viewGroup2, false);
        if (arrayList != null) {
        }
        mVar.f4867B = new ArrayList();
        mVar.f4868C = new ArrayList();
        k1.g gVar3 = mVar.f4882x;
        k1.g gVar22 = mVar.f4883y;
        bVar = new r.b((r.b) gVar3.f14674a);
        bVar2 = new r.b((r.b) gVar22.f14674a);
        i8 = 0;
        while (true) {
            iArr = mVar.f4866A;
            if (i8 < iArr.length) {
            }
            i8 += i12;
            i13 = i12;
            i7 = 0;
            l7 = null;
        }
        while (i9 < bVar.f16007c) {
        }
        while (i10 < bVar2.f16007c) {
        }
        r.b o72 = m.o();
        int i202 = o72.f16007c;
        u uVar2 = t.f4897a;
        WindowId windowId2 = viewGroup2.getWindowId();
        while (i11 >= 0) {
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
