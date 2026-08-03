package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public abstract class n1 {
    public static java.lang.String a(java.lang.String str) {
        com.fyber.inneractive.sdk.config.l0 l0Var;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType2;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType3;
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        java.util.HashMap hashMap = iAConfigManager.f3582a;
        com.fyber.inneractive.sdk.config.q0 q0Var = (hashMap == null || !hashMap.containsKey(str)) ? null : (com.fyber.inneractive.sdk.config.q0) iAConfigManager.f3582a.get(str);
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType4 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER;
        if (q0Var == null) {
            return unitDisplayType4.name().toLowerCase(java.util.Locale.US);
        }
        for (int i = 0; i < q0Var.f3626a.size(); i++) {
            com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) q0Var.f3626a.get(i);
            if (r0Var != null && ((l0Var = r0Var.c) != null || r0Var.f != null || r0Var.e != null)) {
                if (l0Var == null || (unitDisplayType3 = l0Var.b) == null || unitDisplayType3.isDeprecated() || com.fyber.inneractive.sdk.config.enums.UnitDisplayType.DEFAULT == unitDisplayType3) {
                    com.fyber.inneractive.sdk.config.t0 t0Var = r0Var.f;
                    if (t0Var != null && (unitDisplayType2 = t0Var.j) != null && !unitDisplayType2.isDeprecated() && com.fyber.inneractive.sdk.config.enums.UnitDisplayType.DEFAULT != unitDisplayType2) {
                        unitDisplayType4 = r0Var.f.j;
                    } else if (r0Var.e != null && (unitDisplayType = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.NATIVE) != null && !unitDisplayType.isDeprecated() && com.fyber.inneractive.sdk.config.enums.UnitDisplayType.DEFAULT != unitDisplayType) {
                        r0Var.e.getClass();
                        unitDisplayType4 = unitDisplayType;
                    }
                } else {
                    unitDisplayType4 = r0Var.c.b;
                }
                if (com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT == unitDisplayType4) {
                    unitDisplayType4 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER;
                }
                if (com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED == unitDisplayType4 || com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL == unitDisplayType4 || com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER == unitDisplayType4 || com.fyber.inneractive.sdk.config.enums.UnitDisplayType.NATIVE == unitDisplayType4) {
                    return unitDisplayType4.name().toLowerCase(java.util.Locale.US);
                }
            }
        }
        return com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER.name().toLowerCase(java.util.Locale.US);
    }
}
