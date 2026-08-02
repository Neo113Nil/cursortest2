package O0;

import P.I;
import P.U;
import W5.AbstractC0486a1;
import android.animation.Animator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import w1.C1718l0;

/* loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* renamed from: K, reason: collision with root package name */
    public static final int[] f4863K = {2, 1, 3, 4};

    /* renamed from: L, reason: collision with root package name */
    public static final C1718l0 f4864L = new C1718l0(7);

    /* renamed from: M, reason: collision with root package name */
    public static final ThreadLocal f4865M = new ThreadLocal();

    /* renamed from: B, reason: collision with root package name */
    public ArrayList f4867B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayList f4868C;

    /* renamed from: a, reason: collision with root package name */
    public final String f4876a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f4877b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f4878c = -1;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f4879d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4880e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4881f = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public k1.g f4882x = new k1.g(6);

    /* renamed from: y, reason: collision with root package name */
    public k1.g f4883y = new k1.g(6);

    /* renamed from: z, reason: collision with root package name */
    public a f4884z = null;

    /* renamed from: A, reason: collision with root package name */
    public final int[] f4866A = f4863K;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f4869D = new ArrayList();

    /* renamed from: E, reason: collision with root package name */
    public int f4870E = 0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4871F = false;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4872G = false;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f4873H = null;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f4874I = new ArrayList();

    /* renamed from: J, reason: collision with root package name */
    public C1718l0 f4875J = f4864L;

    public static void b(k1.g gVar, View view, s sVar) {
        ((r.b) gVar.f14674a).put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) gVar.f14675b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = U.f5037a;
        String k7 = I.k(view);
        if (k7 != null) {
            r.b bVar = (r.b) gVar.f14677d;
            if (bVar.containsKey(k7)) {
                bVar.put(k7, null);
            } else {
                bVar.put(k7, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                r.f fVar = (r.f) gVar.f14676c;
                if (fVar.f15985a) {
                    fVar.b();
                }
                if (r.e.b(fVar.f15986b, fVar.f15988d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    fVar.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) fVar.c(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    fVar.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static r.b o() {
        ThreadLocal threadLocal = f4865M;
        r.b bVar = (r.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        r.b bVar2 = new r.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean t(s sVar, s sVar2, String str) {
        Object obj = sVar.f4894a.get(str);
        Object obj2 = sVar2.f4894a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(Interpolator interpolator) {
        this.f4879d = interpolator;
    }

    public void B(C1718l0 c1718l0) {
        if (c1718l0 == null) {
            this.f4875J = f4864L;
        } else {
            this.f4875J = c1718l0;
        }
    }

    public void D(long j) {
        this.f4877b = j;
    }

    public final void E() {
        if (this.f4870E == 0) {
            ArrayList arrayList = this.f4873H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4873H.clone();
                int size = arrayList2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((l) arrayList2.get(i7)).c(this);
                }
            }
            this.f4872G = false;
        }
        this.f4870E++;
    }

    public String F(String str) {
        StringBuilder c3 = t.e.c(str);
        c3.append(getClass().getSimpleName());
        c3.append("@");
        c3.append(Integer.toHexString(hashCode()));
        c3.append(": ");
        String sb = c3.toString();
        if (this.f4878c != -1) {
            sb = AbstractC0486a1.i(t.e.d(sb, "dur("), this.f4878c, ") ");
        }
        if (this.f4877b != -1) {
            sb = AbstractC0486a1.i(t.e.d(sb, "dly("), this.f4877b, ") ");
        }
        if (this.f4879d != null) {
            StringBuilder d7 = t.e.d(sb, "interp(");
            d7.append(this.f4879d);
            d7.append(") ");
            sb = d7.toString();
        }
        ArrayList arrayList = this.f4880e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4881f;
        if (size <= 0 && arrayList2.size() <= 0) {
            return sb;
        }
        String e7 = e1.k.e(sb, "tgts(");
        if (arrayList.size() > 0) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (i7 > 0) {
                    e7 = e1.k.e(e7, ", ");
                }
                StringBuilder c4 = t.e.c(e7);
                c4.append(arrayList.get(i7));
                e7 = c4.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                if (i8 > 0) {
                    e7 = e1.k.e(e7, ", ");
                }
                StringBuilder c7 = t.e.c(e7);
                c7.append(arrayList2.get(i8));
                e7 = c7.toString();
            }
        }
        return e1.k.e(e7, ")");
    }

    public void a(l lVar) {
        if (this.f4873H == null) {
            this.f4873H = new ArrayList();
        }
        this.f4873H.add(lVar);
    }

    public void c() {
        ArrayList arrayList = this.f4869D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.f4873H;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.f4873H.clone();
        int size2 = arrayList3.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((l) arrayList3.get(i7)).b();
        }
    }

    public abstract void d(s sVar);

    public final void e(View view, boolean z4) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            s sVar = new s(view);
            if (z4) {
                g(sVar);
            } else {
                d(sVar);
            }
            sVar.f4896c.add(this);
            f(sVar);
            if (z4) {
                b(this.f4882x, view, sVar);
            } else {
                b(this.f4883y, view, sVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                e(viewGroup.getChildAt(i7), z4);
            }
        }
    }

    public abstract void g(s sVar);

    public final void h(ViewGroup viewGroup, boolean z4) {
        i(z4);
        ArrayList arrayList = this.f4880e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4881f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z4);
            return;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i7)).intValue());
            if (findViewById != null) {
                s sVar = new s(findViewById);
                if (z4) {
                    g(sVar);
                } else {
                    d(sVar);
                }
                sVar.f4896c.add(this);
                f(sVar);
                if (z4) {
                    b(this.f4882x, findViewById, sVar);
                } else {
                    b(this.f4883y, findViewById, sVar);
                }
            }
        }
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            View view = (View) arrayList2.get(i8);
            s sVar2 = new s(view);
            if (z4) {
                g(sVar2);
            } else {
                d(sVar2);
            }
            sVar2.f4896c.add(this);
            f(sVar2);
            if (z4) {
                b(this.f4882x, view, sVar2);
            } else {
                b(this.f4883y, view, sVar2);
            }
        }
    }

    public final void i(boolean z4) {
        if (z4) {
            ((r.b) this.f4882x.f14674a).clear();
            ((SparseArray) this.f4882x.f14675b).clear();
            ((r.f) this.f4882x.f14676c).a();
        } else {
            ((r.b) this.f4883y.f14674a).clear();
            ((SparseArray) this.f4883y.f14675b).clear();
            ((r.f) this.f4883y.f14676c).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f4874I = new ArrayList();
            mVar.f4882x = new k1.g(6);
            mVar.f4883y = new k1.g(6);
            mVar.f4867B = null;
            mVar.f4868C = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, k1.g gVar, k1.g gVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator k7;
        int i7;
        View view;
        s sVar;
        Animator animator;
        r.b o7 = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            s sVar2 = (s) arrayList.get(i8);
            s sVar3 = (s) arrayList2.get(i8);
            s sVar4 = null;
            if (sVar2 != null && !sVar2.f4896c.contains(this)) {
                sVar2 = null;
            }
            if (sVar3 != null && !sVar3.f4896c.contains(this)) {
                sVar3 = null;
            }
            if (!(sVar2 == null && sVar3 == null) && ((sVar2 == null || sVar3 == null || r(sVar2, sVar3)) && (k7 = k(viewGroup, sVar2, sVar3)) != null)) {
                String str = this.f4876a;
                if (sVar3 != null) {
                    String[] p5 = p();
                    view = sVar3.f4895b;
                    if (p5 != null && p5.length > 0) {
                        sVar = new s(view);
                        s sVar5 = (s) ((r.b) gVar2.f14674a).getOrDefault(view, null);
                        i7 = size;
                        if (sVar5 != null) {
                            int i9 = 0;
                            while (i9 < p5.length) {
                                HashMap hashMap = sVar.f4894a;
                                String str2 = p5[i9];
                                hashMap.put(str2, sVar5.f4894a.get(str2));
                                i9++;
                                p5 = p5;
                            }
                        }
                        int i10 = o7.f16007c;
                        for (int i11 = 0; i11 < i10; i11++) {
                            animator = null;
                            k kVar = (k) o7.getOrDefault((Animator) o7.h(i11), null);
                            if (kVar.f4860c != null && kVar.f4858a == view && kVar.f4859b.equals(str) && kVar.f4860c.equals(sVar)) {
                                break;
                            }
                        }
                    } else {
                        i7 = size;
                        sVar = null;
                    }
                    animator = k7;
                    k7 = animator;
                    sVar4 = sVar;
                } else {
                    i7 = size;
                    view = sVar2.f4895b;
                }
                if (k7 != null) {
                    u uVar = t.f4897a;
                    z zVar = new z(viewGroup);
                    k kVar2 = new k();
                    kVar2.f4858a = view;
                    kVar2.f4859b = str;
                    kVar2.f4860c = sVar4;
                    kVar2.f4861d = zVar;
                    kVar2.f4862e = this;
                    o7.put(k7, kVar2);
                    this.f4874I.add(k7);
                }
            } else {
                i7 = size;
            }
            i8++;
            size = i7;
        }
        if (sparseIntArray.size() != 0) {
            for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
                Animator animator2 = (Animator) this.f4874I.get(sparseIntArray.keyAt(i12));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(i12) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i7 = this.f4870E - 1;
        this.f4870E = i7;
        if (i7 == 0) {
            ArrayList arrayList = this.f4873H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4873H.clone();
                int size = arrayList2.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((l) arrayList2.get(i8)).e(this);
                }
            }
            for (int i9 = 0; i9 < ((r.f) this.f4882x.f14676c).e(); i9++) {
                View view = (View) ((r.f) this.f4882x.f14676c).f(i9);
                if (view != null) {
                    WeakHashMap weakHashMap = U.f5037a;
                    view.setHasTransientState(false);
                }
            }
            for (int i10 = 0; i10 < ((r.f) this.f4883y.f14676c).e(); i10++) {
                View view2 = (View) ((r.f) this.f4883y.f14676c).f(i10);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = U.f5037a;
                    view2.setHasTransientState(false);
                }
            }
            this.f4872G = true;
        }
    }

    public final s n(View view, boolean z4) {
        a aVar = this.f4884z;
        if (aVar != null) {
            return aVar.n(view, z4);
        }
        ArrayList arrayList = z4 ? this.f4867B : this.f4868C;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            }
            s sVar = (s) arrayList.get(i7);
            if (sVar == null) {
                return null;
            }
            if (sVar.f4895b == view) {
                break;
            }
            i7++;
        }
        if (i7 >= 0) {
            return (s) (z4 ? this.f4868C : this.f4867B).get(i7);
        }
        return null;
    }

    public String[] p() {
        return null;
    }

    public final s q(View view, boolean z4) {
        a aVar = this.f4884z;
        if (aVar != null) {
            return aVar.q(view, z4);
        }
        return (s) ((r.b) (z4 ? this.f4882x : this.f4883y).f14674a).getOrDefault(view, null);
    }

    public boolean r(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] p5 = p();
        if (p5 == null) {
            Iterator it = sVar.f4894a.keySet().iterator();
            while (it.hasNext()) {
                if (t(sVar, sVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : p5) {
            if (!t(sVar, sVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean s(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f4880e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4881f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return F("");
    }

    public void u(ViewGroup viewGroup) {
        if (this.f4872G) {
            return;
        }
        ArrayList arrayList = this.f4869D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).pause();
        }
        ArrayList arrayList2 = this.f4873H;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f4873H.clone();
            int size2 = arrayList3.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ((l) arrayList3.get(i7)).a();
            }
        }
        this.f4871F = true;
    }

    public void v(l lVar) {
        ArrayList arrayList = this.f4873H;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(lVar);
        if (this.f4873H.size() == 0) {
            this.f4873H = null;
        }
    }

    public void w(View view) {
        if (this.f4871F) {
            if (!this.f4872G) {
                ArrayList arrayList = this.f4869D;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.f4873H;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f4873H.clone();
                    int size2 = arrayList3.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ((l) arrayList3.get(i7)).d();
                    }
                }
            }
            this.f4871F = false;
        }
    }

    public void x() {
        E();
        r.b o7 = o();
        Iterator it = this.f4874I.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (o7.containsKey(animator)) {
                E();
                if (animator != null) {
                    animator.addListener(new j(this, o7));
                    long j = this.f4878c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j3 = this.f4877b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    Interpolator interpolator = this.f4879d;
                    if (interpolator != null) {
                        animator.setInterpolator(interpolator);
                    }
                    animator.addListener(new H2.n(this, 1));
                    animator.start();
                }
            }
        }
        this.f4874I.clear();
        m();
    }

    public void y(long j) {
        this.f4878c = j;
    }

    public void C() {
    }

    public void f(s sVar) {
    }

    public void z(p3.f fVar) {
    }
}
