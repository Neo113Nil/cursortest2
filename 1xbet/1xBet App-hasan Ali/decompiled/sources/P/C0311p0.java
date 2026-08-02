package P;

import i4.InterfaceC2015a;
import java.util.ArrayList;
import java.util.List;
import r.C2316B;
import r.C2321G;

/* renamed from: P.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311p0 implements InterfaceC2015a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0313q0 f4504k;

    public C0311p0(C0313q0 c0313q0) {
        this.f4504k = c0313q0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        C0313q0 c0313q0 = this.f4504k;
        C2321G c2321g = new C2321G(c0313q0.f4507a.size());
        ArrayList arrayList = c0313q0.f4507a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            V v4 = (V) arrayList.get(i);
            Object obj = v4.f4405b;
            int i5 = v4.f4404a;
            Object u5 = obj != null ? new U(Integer.valueOf(i5), v4.f4405b) : Integer.valueOf(i5);
            int f = c2321g.f(u5);
            boolean z3 = f < 0;
            Object obj2 = z3 ? null : c2321g.f18930c[f];
            if ((obj2 instanceof List) && (obj2 instanceof j4.a)) {
                boolean z5 = obj2 instanceof j4.c;
            }
            if (obj2 != null) {
                if (obj2 instanceof C2316B) {
                    C2316B c2316b = (C2316B) obj2;
                    c2316b.a(v4);
                    v4 = c2316b;
                } else {
                    Object[] objArr = r.L.f18953a;
                    C2316B c2316b2 = new C2316B(2);
                    c2316b2.a(obj2);
                    c2316b2.a(v4);
                    v4 = c2316b2;
                }
            }
            if (z3) {
                int i6 = ~f;
                c2321g.f18929b[i6] = u5;
                c2321g.f18930c[i6] = v4;
            } else {
                c2321g.f18930c[f] = v4;
            }
        }
        return new R.a(c2321g);
    }
}
