package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ey0 {

    /* JADX INFO: renamed from: c */
    public static final ey0 f2207c = new ey0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f2209b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final b90 f2208a = new b90(2);

    /* JADX INFO: renamed from: a */
    public final r51 m1525a(Class cls) {
        r51 r51VarM4547x;
        Class cls2;
        fe0.m1772a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f2209b;
        r51 r51Var = (r51) concurrentHashMap.get(cls);
        if (r51Var != null) {
            return r51Var;
        }
        b90 b90Var = this.f2208a;
        b90Var.getClass();
        Class cls3 = v51.f8095a;
        if (!s70.class.isAssignableFrom(cls) && (cls2 = v51.f8095a) != null && !cls2.isAssignableFrom(cls)) {
            C0270h1.m2190f("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            return null;
        }
        yz0 yz0VarMo3329a = ((vl0) b90Var.f793k).mo3329a(cls);
        if ((yz0VarMo3329a.f9553d & 2) == 2) {
            if (s70.class.isAssignableFrom(cls)) {
                r51VarM4547x = new uo0(v51.f8097c, AbstractC0857wy.f8720a, yz0VarMo3329a.f9550a);
            } else {
                pf1 pf1Var = v51.f8096b;
                C0783uy c0783uy = AbstractC0857wy.f8721b;
                if (c0783uy == null) {
                    C0270h1.m2191g("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                r51VarM4547x = new uo0(pf1Var, c0783uy, yz0VarMo3329a.f9550a);
            }
        } else if (s70.class.isAssignableFrom(cls)) {
            r51VarM4547x = AbstractC0024an.m292o(yz0VarMo3329a.m5856a()) != 1 ? so0.m4547x(yz0VarMo3329a, bs0.f973b, oi0.f5738b, v51.f8097c, AbstractC0857wy.f8720a, dm0.f1749b) : so0.m4547x(yz0VarMo3329a, bs0.f973b, oi0.f5738b, v51.f8097c, null, dm0.f1749b);
        } else if (AbstractC0024an.m292o(yz0VarMo3329a.m5856a()) != 1) {
            zr0 zr0Var = bs0.f972a;
            mi0 mi0Var = oi0.f5737a;
            pf1 pf1Var2 = v51.f8096b;
            C0783uy c0783uy2 = AbstractC0857wy.f8721b;
            if (c0783uy2 == null) {
                C0270h1.m2191g("Protobuf runtime is not correctly loaded.");
                return null;
            }
            r51VarM4547x = so0.m4547x(yz0VarMo3329a, zr0Var, mi0Var, pf1Var2, c0783uy2, dm0.f1748a);
        } else {
            r51VarM4547x = so0.m4547x(yz0VarMo3329a, bs0.f972a, oi0.f5737a, v51.f8096b, null, dm0.f1748a);
        }
        r51 r51Var2 = (r51) concurrentHashMap.putIfAbsent(cls, r51VarM4547x);
        return r51Var2 != null ? r51Var2 : r51VarM4547x;
    }
}
