package A0;

import java.util.List;
import r.AbstractC2333k;

/* renamed from: A0.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041k1 {

    /* renamed from: a, reason: collision with root package name */
    public final H0.j f526a;

    /* renamed from: b, reason: collision with root package name */
    public final r.w f527b;

    public C0041k1(H0.n nVar, AbstractC2333k abstractC2333k) {
        this.f526a = nVar.f2114d;
        this.f527b = new r.w(H0.n.j(4, nVar).size());
        List j5 = H0.n.j(4, nVar);
        int size = j5.size();
        for (int i = 0; i < size; i++) {
            H0.n nVar2 = (H0.n) j5.get(i);
            if (abstractC2333k.a(nVar2.f2116g)) {
                this.f527b.a(nVar2.f2116g);
            }
        }
    }
}
