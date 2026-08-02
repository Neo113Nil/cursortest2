package W3;

import B4.V;
import e3.C1023h;
import e6.C1054c;
import n1.C1450e;
import w1.C1718l0;
import w1.C1722m0;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f6718b = new i(new C1722m0(12));

    /* renamed from: c, reason: collision with root package name */
    public static final i f6719c = new i(new C1718l0(13));

    /* renamed from: a, reason: collision with root package name */
    public final h f6720a;

    static {
        new i(new V(14));
        new i(new C1722m0(13));
        new i(new V(13));
        new i(new C1054c(13));
        new i(new M4.e());
    }

    public i(j jVar) {
        if (N3.a.f4779b.get()) {
            this.f6720a = new u1.c(jVar, 11);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f6720a = new C1023h(jVar);
        } else {
            this.f6720a = new C1450e(jVar, 8);
        }
    }
}
