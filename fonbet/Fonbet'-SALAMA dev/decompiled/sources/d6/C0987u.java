package d6;

import U5.AbstractC0438e;
import U5.N;
import U5.O;
import U5.P;
import U5.e0;
import U5.l0;
import W5.AbstractC0547v0;
import W5.Y1;
import W5.Z1;
import java.util.List;
import java.util.Map;
import w1.F0;

/* renamed from: d6.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0987u extends O {
    public static e0 f(Map map) {
        F0 f02;
        k1.g gVar;
        Integer num;
        Integer num2;
        Integer num3;
        Long i7 = AbstractC0547v0.i("interval", map);
        Long i8 = AbstractC0547v0.i("baseEjectionTime", map);
        Long i9 = AbstractC0547v0.i("maxEjectionTime", map);
        Integer f7 = AbstractC0547v0.f("maxEjectionPercentage", map);
        Long l7 = i7 != null ? i7 : 10000000000L;
        Long l8 = i8 != null ? i8 : 30000000000L;
        Long l9 = i9 != null ? i9 : 300000000000L;
        Integer num4 = f7 != null ? f7 : 10;
        Map g3 = AbstractC0547v0.g("successRateEjection", map);
        List list = null;
        if (g3 != null) {
            Integer f8 = AbstractC0547v0.f("stdevFactor", g3);
            Integer f9 = AbstractC0547v0.f("enforcementPercentage", g3);
            Integer f10 = AbstractC0547v0.f("minimumHosts", g3);
            Integer f11 = AbstractC0547v0.f("requestVolume", g3);
            Integer num5 = f8 != null ? f8 : 1900;
            if (f9 != null) {
                p3.f.e(f9.intValue() >= 0 && f9.intValue() <= 100);
                num = f9;
            } else {
                num = 100;
            }
            if (f10 != null) {
                p3.f.e(f10.intValue() >= 0);
                num2 = f10;
            } else {
                num2 = 5;
            }
            if (f11 != null) {
                p3.f.e(f11.intValue() >= 0);
                num3 = f11;
            } else {
                num3 = 100;
            }
            f02 = new F0(num5, num, num2, num3, 12);
        } else {
            f02 = null;
        }
        Map g7 = AbstractC0547v0.g("failurePercentageEjection", map);
        if (g7 != null) {
            Integer num6 = 85;
            Integer num7 = 100;
            Integer num8 = 5;
            Integer f12 = AbstractC0547v0.f("threshold", g7);
            Integer f13 = AbstractC0547v0.f("enforcementPercentage", g7);
            Integer f14 = AbstractC0547v0.f("minimumHosts", g7);
            Integer f15 = AbstractC0547v0.f("requestVolume", g7);
            if (f12 != null) {
                p3.f.e(f12.intValue() >= 0 && f12.intValue() <= 100);
                num6 = f12;
            }
            if (f13 != null) {
                p3.f.e(f13.intValue() >= 0 && f13.intValue() <= 100);
                num7 = f13;
            }
            if (f14 != null) {
                p3.f.e(f14.intValue() >= 0);
                num8 = f14;
            }
            if (f15 != null) {
                p3.f.e(f15.intValue() >= 0);
            } else {
                f15 = 50;
            }
            gVar = new k1.g(num6, num7, num8, f15);
        } else {
            gVar = null;
        }
        List c3 = AbstractC0547v0.c("childPolicy", map);
        if (c3 != null) {
            AbstractC0547v0.a(c3);
            list = c3;
        }
        List u4 = Z1.u(list);
        if (u4 == null || u4.isEmpty()) {
            return new e0(l0.f6543m.g("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        e0 t7 = Z1.t(u4, P.a());
        if (t7.f6492a != null) {
            return t7;
        }
        Y1 y12 = (Y1) t7.f6493b;
        p3.f.r(y12 != null);
        p3.f.r(y12 != null);
        return new e0(new C0981o(l7, l8, l9, num4, f02, gVar, y12));
    }

    @Override // U5.O
    public String a() {
        return "outlier_detection_experimental";
    }

    @Override // U5.O
    public int b() {
        return 5;
    }

    @Override // U5.O
    public boolean c() {
        return true;
    }

    @Override // U5.O
    public final N d(AbstractC0438e abstractC0438e) {
        return new C0986t(abstractC0438e);
    }

    @Override // U5.O
    public e0 e(Map map) {
        try {
            return f(map);
        } catch (RuntimeException e7) {
            return new e0(l0.f6544n.f(e7).g("Failed parsing configuration for " + a()));
        }
    }
}
