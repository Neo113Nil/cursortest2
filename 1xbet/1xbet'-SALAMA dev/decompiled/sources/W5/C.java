package W5;

import C0.RunnableC0085d;
import U5.EnumC0446m;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f6749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6750b;

    public InterfaceC0549w a(C0539s1 c0539s1) {
        U5.L l7 = ((Q0) this.f6750b).f6931B;
        if (((Q0) this.f6750b).f6939J.get()) {
            return ((Q0) this.f6750b).f6937H;
        }
        if (l7 == null) {
            ((Q0) this.f6750b).f6972p.execute(new RunnableC0085d(this, 17));
            return ((Q0) this.f6750b).f6937H;
        }
        InterfaceC0549w interfaceC0549wF = AbstractC0494d0.f(l7.a(c0539s1), Boolean.TRUE.equals(c0539s1.f7363a.f6479f));
        return interfaceC0549wF != null ? interfaceC0549wF : ((Q0) this.f6750b).f6937H;
    }

    public void b(EnumC0446m enumC0446m) {
        p113p3.f.k(enumC0446m, "newState");
        if (((EnumC0446m) this.f6749a) == enumC0446m || ((EnumC0446m) this.f6749a) == EnumC0446m.f6554e) {
            return;
        }
        this.f6749a = enumC0446m;
        if (((ArrayList) this.f6750b).isEmpty()) {
            return;
        }
        ArrayList<B> arrayList = (ArrayList) this.f6750b;
        this.f6750b = new ArrayList();
        for (B b7 : arrayList) {
            b7.f6746b.execute(b7.f6745a);
        }
    }
}
