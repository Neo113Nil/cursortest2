package com.ironsource;

/* renamed from: com.ironsource.jd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3117jd {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3312ub f6328a;
    private final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.ironsource.C3300u> b;

    public C3117jd(com.ironsource.C3312ub tools, java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.ironsource.C3300u> adFormatsConfigurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.f6328a = tools;
        this.b = adFormatsConfigurations;
    }

    private final void b(com.ironsource.J7.a aVar, java.lang.String str, com.unity3d.mediation.LevelPlay.AdFormat adFormat, com.ironsource.C3300u.d dVar) {
        com.ironsource.I3 i3 = com.ironsource.I3.Delivery;
        com.ironsource.M4 c = dVar.c();
        a(aVar.a(str, adFormat, i3, new com.ironsource.C3394z3(c != null ? java.lang.Boolean.valueOf(c.a()) : null, null, null, 6, null)), str, adFormat, i3);
    }

    private final void c(com.ironsource.J7.a aVar, java.lang.String str, com.unity3d.mediation.LevelPlay.AdFormat adFormat, com.ironsource.C3300u.d dVar) {
        com.ironsource.C2956ad e = dVar.e();
        if (e != null) {
            com.ironsource.I3 i3 = com.ironsource.I3.Pacing;
            a(aVar.a(str, adFormat, i3, new com.ironsource.C3394z3(e.a(), e.b(), com.ironsource.H3.Second)), str, adFormat, i3);
        }
    }

    public final void a(com.ironsource.J7.a cappingService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        for (java.util.Map.Entry<com.unity3d.mediation.LevelPlay.AdFormat, com.ironsource.C3300u> entry : this.b.entrySet()) {
            com.unity3d.mediation.LevelPlay.AdFormat key = entry.getKey();
            for (java.util.Map.Entry<java.lang.String, com.ironsource.C3300u.d> entry2 : entry.getValue().c().entrySet()) {
                java.lang.String key2 = entry2.getKey();
                com.ironsource.C3300u.d value = entry2.getValue();
                b(cappingService, key2, key, value);
                a(cappingService, key2, key, value);
                c(cappingService, key2, key, value);
            }
        }
    }

    private final void a(com.ironsource.J7.a aVar, java.lang.String str, com.unity3d.mediation.LevelPlay.AdFormat adFormat, com.ironsource.C3300u.d dVar) {
        com.ironsource.C3 b = dVar.b();
        if (b != null) {
            com.ironsource.I3 i3 = com.ironsource.I3.ShowCount;
            a(aVar.a(str, adFormat, i3, new com.ironsource.C3394z3(b.a(), b.b(), b.c())), str, adFormat, i3);
        }
    }

    private final void a(java.lang.Object obj, java.lang.String str, com.unity3d.mediation.LevelPlay.AdFormat adFormat, com.ironsource.I3 i3) {
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(obj);
        if (m10801exceptionOrNullimpl != null) {
            this.f6328a.a(str, adFormat, new com.ironsource.D3().a(i3), m10801exceptionOrNullimpl.getMessage());
        }
    }
}
