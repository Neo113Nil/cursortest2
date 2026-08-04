package O0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p155w1.C1009l0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends m {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList f4829N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f4830O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f4831P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f4832Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f4833R;

    @Override // O0.m
    public final void A(Interpolator interpolator) {
        this.f4833R |= 1;
        ArrayList arrayList = this.f4829N;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((m) this.f4829N.get(i7)).A(interpolator);
            }
        }
        this.f4879d = interpolator;
    }

    @Override // O0.m
    public final void B(C1009l0 c1009l0) {
        super.B(c1009l0);
        this.f4833R |= 4;
        if (this.f4829N != null) {
            for (int i7 = 0; i7 < this.f4829N.size(); i7++) {
                ((m) this.f4829N.get(i7)).B(c1009l0);
            }
        }
    }

    @Override // O0.m
    public final void C() {
        this.f4833R |= 2;
        int size = this.f4829N.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((m) this.f4829N.get(i7)).C();
        }
    }

    @Override // O0.m
    public final void D(long j) {
        this.f4877b = j;
    }

    @Override // O0.m
    public final String F(String str) {
        String strF = super.F(str);
        for (int i7 = 0; i7 < this.f4829N.size(); i7++) {
            StringBuilder sbD = p136t.e.d(strF, "\n");
            sbD.append(((m) this.f4829N.get(i7)).F(str + "  "));
            strF = sbD.toString();
        }
        return strF;
    }

    public final void G(m mVar) {
        this.f4829N.add(mVar);
        mVar.f4884z = this;
        long j = this.f4878c;
        if (j >= 0) {
            mVar.y(j);
        }
        if ((this.f4833R & 1) != 0) {
            mVar.A(this.f4879d);
        }
        if ((this.f4833R & 2) != 0) {
            mVar.C();
        }
        if ((this.f4833R & 4) != 0) {
            mVar.B(this.f4875J);
        }
        if ((this.f4833R & 8) != 0) {
            mVar.z(null);
        }
    }

    @Override // O0.m
    public final void c() {
        super.c();
        int size = this.f4829N.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((m) this.f4829N.get(i7)).c();
        }
    }

    @Override // O0.m
    public final void d(s sVar) {
        if (s(sVar.f4895b)) {
            for (m mVar : this.f4829N) {
                if (mVar.s(sVar.f4895b)) {
                    mVar.d(sVar);
                    sVar.f4896c.add(mVar);
                }
            }
        }
    }

    @Override // O0.m
    public final void f(s sVar) {
        int size = this.f4829N.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((m) this.f4829N.get(i7)).f(sVar);
        }
    }

    @Override // O0.m
    public final void g(s sVar) {
        if (s(sVar.f4895b)) {
            for (m mVar : this.f4829N) {
                if (mVar.s(sVar.f4895b)) {
                    mVar.g(sVar);
                    sVar.f4896c.add(mVar);
                }
            }
        }
    }

    @Override // O0.m
    /* JADX INFO: renamed from: j */
    public final m clone() {
        a aVar = (a) super.clone();
        aVar.f4829N = new ArrayList();
        int size = this.f4829N.size();
        for (int i7 = 0; i7 < size; i7++) {
            m mVarClone = ((m) this.f4829N.get(i7)).clone();
            aVar.f4829N.add(mVarClone);
            mVarClone.f4884z = aVar;
        }
        return aVar;
    }

    @Override // O0.m
    public final void l(ViewGroup viewGroup, p072k1.g gVar, p072k1.g gVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f4877b;
        int size = this.f4829N.size();
        for (int i7 = 0; i7 < size; i7++) {
            m mVar = (m) this.f4829N.get(i7);
            if (j > 0 && (this.f4830O || i7 == 0)) {
                long j3 = mVar.f4877b;
                if (j3 > 0) {
                    mVar.D(j3 + j);
                } else {
                    mVar.D(j);
                }
            }
            mVar.l(viewGroup, gVar, gVar2, arrayList, arrayList2);
        }
    }

    @Override // O0.m
    public final void u(ViewGroup viewGroup) {
        super.u(viewGroup);
        int size = this.f4829N.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((m) this.f4829N.get(i7)).u(viewGroup);
        }
    }

    @Override // O0.m
    public final void w(View view) {
        super.w(view);
        int size = this.f4829N.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((m) this.f4829N.get(i7)).w(view);
        }
    }

    @Override // O0.m
    public final void x() {
        if (this.f4829N.isEmpty()) {
            E();
            m();
            return;
        }
        h hVar = new h();
        hVar.f4852b = this;
        Iterator it = this.f4829N.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(hVar);
        }
        this.f4831P = this.f4829N.size();
        if (this.f4830O) {
            Iterator it2 = this.f4829N.iterator();
            while (it2.hasNext()) {
                ((m) it2.next()).x();
            }
            return;
        }
        for (int i7 = 1; i7 < this.f4829N.size(); i7++) {
            ((m) this.f4829N.get(i7 - 1)).a(new h((m) this.f4829N.get(i7), 1));
        }
        m mVar = (m) this.f4829N.get(0);
        if (mVar != null) {
            mVar.x();
        }
    }

    @Override // O0.m
    public final void y(long j) {
        ArrayList arrayList;
        this.f4878c = j;
        if (j < 0 || (arrayList = this.f4829N) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((m) this.f4829N.get(i7)).y(j);
        }
    }

    @Override // O0.m
    public final void z(p113p3.f fVar) {
        this.f4833R |= 8;
        int size = this.f4829N.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((m) this.f4829N.get(i7)).z(fVar);
        }
    }
}
