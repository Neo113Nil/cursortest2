package com.ironsource;

/* loaded from: classes5.dex */
public final class Ue {
    public final com.ironsource.AbstractC3335vg a(com.ironsource.Se response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        com.ironsource.AbstractC3317ug a2 = a(response.d(), response.e());
        return a2 == null ? com.ironsource.AbstractC3335vg.b.f6788a : new com.ironsource.AbstractC3335vg.a(a2);
    }

    private final com.ironsource.AbstractC3317ug a(com.ironsource.P3 p3, com.ironsource.Gd gd) {
        com.ironsource.P3.a e = p3.e();
        if (e == null) {
            return null;
        }
        com.ironsource.AbstractC3317ug a2 = a(com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, gd.h(), e.h());
        if (a2 != null) {
            return a2;
        }
        com.ironsource.AbstractC3317ug a3 = a(com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL, gd.f(), e.f());
        if (a3 != null) {
            return a3;
        }
        com.ironsource.AbstractC3317ug a4 = a(com.unity3d.mediation.LevelPlay.AdFormat.BANNER, gd.e(), e.e());
        if (a4 != null) {
            return a4;
        }
        com.ironsource.AbstractC3317ug a5 = a(com.unity3d.mediation.LevelPlay.AdFormat.NATIVE_AD, gd.g(), e.g());
        if (a5 != null) {
            return a5;
        }
        return null;
    }

    private final com.ironsource.AbstractC3317ug a(com.unity3d.mediation.LevelPlay.AdFormat adFormat, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, com.ironsource.P3.a.InterfaceC0121a interfaceC0121a) {
        if (map == null) {
            return null;
        }
        java.util.Collection<? extends java.util.List<java.lang.String>> values = map.values();
        if (!(values instanceof java.util.Collection) || !values.isEmpty()) {
            java.util.Iterator<T> it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((java.util.List) it.next()).isEmpty()) {
                    if (interfaceC0121a != null) {
                        java.util.List<com.ironsource.P3.a.e> a2 = interfaceC0121a.a();
                        if (a2 == null) {
                            return new com.ironsource.AbstractC3317ug.b(adFormat);
                        }
                        if (a2.isEmpty()) {
                            return new com.ironsource.AbstractC3317ug.a(adFormat);
                        }
                    }
                }
            }
        }
        return null;
    }
}
