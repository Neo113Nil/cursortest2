package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fy0 {

    /* JADX INFO: renamed from: c */
    public static final fy0 f2536c = new fy0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f2538b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final nu1 f2537a = new nu1(1);

    /* JADX INFO: renamed from: a */
    public final s51 m1907a(Class cls) {
        C0820vy c0820vy;
        s51 s51VarM4797w;
        Class cls2;
        ge0.m2031a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f2538b;
        s51 s51Var = (s51) concurrentHashMap.get(cls);
        if (s51Var != null) {
            return s51Var;
        }
        nu1 nu1Var = this.f2537a;
        nu1Var.getClass();
        Class cls3 = w51.f8434a;
        if (!t70.class.isAssignableFrom(cls) && (cls2 = w51.f8434a) != null && !cls2.isAssignableFrom(cls)) {
            C0270h1.m2190f("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        zz0 zz0VarMo3487a = ((wl0) nu1Var.f5551k).mo3487a(cls);
        if ((zz0VarMo3487a.f9992d & 2) == 2) {
            if (t70.class.isAssignableFrom(cls)) {
                s51VarM4797w = new vo0(w51.f8436c, AbstractC0894xy.f9104a, zz0VarMo3487a.f9989a);
            } else {
                qf1 qf1Var = w51.f8435b;
                C0820vy c0820vy2 = AbstractC0894xy.f9105b;
                if (c0820vy2 == null) {
                    C0270h1.m2191g("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                s51VarM4797w = new vo0(qf1Var, c0820vy2, zz0VarMo3487a.f9989a);
            }
        } else if (t70.class.isAssignableFrom(cls)) {
            as0 as0Var = cs0.f1447b;
            pi0 pi0Var = qi0.f6504b;
            qf1 qf1Var2 = w51.f8436c;
            C0820vy c0820vy3 = AbstractC0024an.m292o(zz0VarMo3487a.m6045a()) != 1 ? AbstractC0894xy.f9104a : null;
            cm0 cm0Var = em0.f2144b;
            if (!(zz0VarMo3487a instanceof zz0)) {
                int[] iArr = to0.f7541n;
                dd0.m1158c();
                return null;
            }
            s51VarM4797w = to0.m4797w(zz0VarMo3487a, as0Var, pi0Var, qf1Var2, c0820vy3, cm0Var);
        } else {
            as0 as0Var2 = cs0.f1446a;
            pi0 pi0Var2 = qi0.f6503a;
            qf1 qf1Var3 = w51.f8435b;
            if (AbstractC0024an.m292o(zz0VarMo3487a.m6045a()) != 1) {
                C0820vy c0820vy4 = AbstractC0894xy.f9105b;
                if (c0820vy4 == null) {
                    C0270h1.m2191g("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                c0820vy = c0820vy4;
            } else {
                c0820vy = null;
            }
            cm0 cm0Var2 = em0.f2143a;
            if (!(zz0VarMo3487a instanceof zz0)) {
                int[] iArr2 = to0.f7541n;
                dd0.m1158c();
                return null;
            }
            s51VarM4797w = to0.m4797w(zz0VarMo3487a, as0Var2, pi0Var2, qf1Var3, c0820vy, cm0Var2);
        }
        s51 s51Var2 = (s51) concurrentHashMap.putIfAbsent(cls, s51VarM4797w);
        return s51Var2 != null ? s51Var2 : s51VarM4797w;
    }
}
