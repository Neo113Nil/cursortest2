package W3;

import B4.V;
import p155w1.C1009l0;
import p155w1.C1013m0;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f6718b = new i(new C1013m0(12));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f6719c = new i(new C1009l0(13));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f6720a;

    static {
        new i(new V(14));
        new i(new C1013m0(13));
        new i(new V(13));
        new i(new p036e6.c(13));
        new i(new M4.e());
    }

    public i(j jVar) {
        if (N3.a.f4779b.get()) {
            this.f6720a = new p145u1.c(jVar, 11);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f6720a = new p033e3.h(jVar);
        } else {
            this.f6720a = new p096n1.e(jVar, 8);
        }
    }
}
