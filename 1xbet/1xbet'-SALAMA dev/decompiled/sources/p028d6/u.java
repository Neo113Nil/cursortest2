package p028d6;

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
import p072k1.g;
import p113p3.f;
import p155w1.F0;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends O {
    public static e0 f(Map map) {
        F0 f7;
        g gVar;
        Integer num;
        Integer num2;
        Integer num3;
        Long lI = AbstractC0547v0.i("interval", map);
        Long lI2 = AbstractC0547v0.i("baseEjectionTime", map);
        Long lI3 = AbstractC0547v0.i("maxEjectionTime", map);
        Integer numF = AbstractC0547v0.f("maxEjectionPercentage", map);
        Long l7 = lI != null ? lI : 10000000000L;
        Long l8 = lI2 != null ? lI2 : 30000000000L;
        Long l9 = lI3 != null ? lI3 : 300000000000L;
        Integer num4 = numF != null ? numF : 10;
        Map mapG = AbstractC0547v0.g("successRateEjection", map);
        List list = null;
        if (mapG != null) {
            Integer numF2 = AbstractC0547v0.f("stdevFactor", mapG);
            Integer numF3 = AbstractC0547v0.f("enforcementPercentage", mapG);
            Integer numF4 = AbstractC0547v0.f("minimumHosts", mapG);
            Integer numF5 = AbstractC0547v0.f("requestVolume", mapG);
            Integer num5 = numF2 != null ? numF2 : 1900;
            if (numF3 != null) {
                f.e(numF3.intValue() >= 0 && numF3.intValue() <= 100);
                num = numF3;
            } else {
                num = 100;
            }
            if (numF4 != null) {
                f.e(numF4.intValue() >= 0);
                num2 = numF4;
            } else {
                num2 = 5;
            }
            if (numF5 != null) {
                f.e(numF5.intValue() >= 0);
                num3 = numF5;
            } else {
                num3 = 100;
            }
            f7 = new F0(num5, num, num2, num3, 12);
        } else {
            f7 = null;
        }
        Map mapG2 = AbstractC0547v0.g("failurePercentageEjection", map);
        if (mapG2 != null) {
            Integer num6 = 85;
            Integer num7 = 100;
            Integer num8 = 5;
            Integer numF6 = AbstractC0547v0.f("threshold", mapG2);
            Integer numF7 = AbstractC0547v0.f("enforcementPercentage", mapG2);
            Integer numF8 = AbstractC0547v0.f("minimumHosts", mapG2);
            Integer numF9 = AbstractC0547v0.f("requestVolume", mapG2);
            if (numF6 != null) {
                f.e(numF6.intValue() >= 0 && numF6.intValue() <= 100);
                num6 = numF6;
            }
            if (numF7 != null) {
                f.e(numF7.intValue() >= 0 && numF7.intValue() <= 100);
                num7 = numF7;
            }
            if (numF8 != null) {
                f.e(numF8.intValue() >= 0);
                num8 = numF8;
            }
            if (numF9 != null) {
                f.e(numF9.intValue() >= 0);
            } else {
                numF9 = 50;
            }
            gVar = new g(num6, num7, num8, numF9);
        } else {
            gVar = null;
        }
        List listC = AbstractC0547v0.c("childPolicy", map);
        if (listC != null) {
            AbstractC0547v0.a(listC);
            list = listC;
        }
        List listU = Z1.u(list);
        if (listU == null || listU.isEmpty()) {
            return new e0(l0.f6543m.g("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        e0 e0VarT = Z1.t(listU, P.a());
        if (e0VarT.f6492a != null) {
            return e0VarT;
        }
        Y1 y4 = (Y1) e0VarT.f6493b;
        f.r(y4 != null);
        f.r(y4 != null);
        return new e0(new o(l7, l8, l9, num4, f7, gVar, y4));
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
        return new t(abstractC0438e);
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
