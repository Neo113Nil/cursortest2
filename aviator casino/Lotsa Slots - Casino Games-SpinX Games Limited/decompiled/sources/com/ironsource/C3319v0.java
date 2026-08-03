package com.ironsource;

/* renamed from: com.ironsource.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3319v0 implements com.ironsource.F3 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3312ub f6769a;
    private final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.ironsource.C3300u> b;

    public C3319v0(com.ironsource.C3312ub tools, java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.ironsource.C3300u> adFormatsConfigurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.f6769a = tools;
        this.b = adFormatsConfigurations;
    }

    private final void b(com.ironsource.InterfaceC3219p7.a aVar, java.lang.String str, com.ironsource.C3300u.d dVar) {
        com.ironsource.C2956ad e = dVar.e();
        if (e != null) {
            com.ironsource.I3 i3 = com.ironsource.I3.Pacing;
            a(aVar.a(str, i3, new com.ironsource.C3394z3(e.a(), e.b(), e.c())), str, i3);
        }
    }

    @Override // com.ironsource.F3
    public void a(com.ironsource.InterfaceC3219p7.a cappingService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        java.util.Iterator<java.util.Map.Entry<com.unity3d.mediation.LevelPlay.AdFormat, com.ironsource.C3300u>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            for (java.util.Map.Entry<java.lang.String, com.ironsource.C3300u.d> entry : it.next().getValue().a().entrySet()) {
                java.lang.String key = entry.getKey();
                com.ironsource.C3300u.d value = entry.getValue();
                a(cappingService, key, value);
                b(cappingService, key, value);
            }
        }
    }

    private final void a(com.ironsource.InterfaceC3219p7.a aVar, java.lang.String str, com.ironsource.C3300u.d dVar) {
        com.ironsource.C3 b = dVar.b();
        if (b != null) {
            com.ironsource.I3 i3 = com.ironsource.I3.ShowCount;
            a(aVar.a(str, i3, new com.ironsource.C3394z3(b.a(), b.b(), b.c())), str, i3);
        }
    }

    private final void a(java.lang.Object obj, java.lang.String str, com.ironsource.I3 i3) {
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(obj);
        if (m10801exceptionOrNullimpl != null) {
            this.f6769a.a(str, new com.ironsource.D3().a(i3), m10801exceptionOrNullimpl.getMessage());
        }
    }
}
