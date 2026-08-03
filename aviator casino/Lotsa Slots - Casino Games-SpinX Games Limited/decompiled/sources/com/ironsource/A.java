package com.ironsource;

/* loaded from: classes5.dex */
public final class A implements com.ironsource.InterfaceC3111j7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.L8 f5605a;

    public A(com.ironsource.L8 sessionDepthService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        this.f5605a = sessionDepthService;
    }

    @Override // com.ironsource.InterfaceC3111j7
    public void a(java.util.Map<java.lang.String, java.lang.Object> output) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(com.ironsource.M6.K0, java.lang.Integer.valueOf(this.f5605a.a(com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL)));
        output.put("interstitial", linkedHashMap);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        linkedHashMap2.put(com.ironsource.M6.K0, java.lang.Integer.valueOf(this.f5605a.a(com.unity3d.mediation.LevelPlay.AdFormat.REWARDED)));
        output.put(com.ironsource.M6.H0, linkedHashMap2);
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        linkedHashMap3.put(com.ironsource.M6.K0, java.lang.Integer.valueOf(this.f5605a.a(com.unity3d.mediation.LevelPlay.AdFormat.BANNER)));
        output.put("banner", linkedHashMap3);
        java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
        linkedHashMap4.put(com.ironsource.M6.K0, java.lang.Integer.valueOf(this.f5605a.a(com.unity3d.mediation.LevelPlay.AdFormat.NATIVE_AD)));
        output.put("nativeAd", linkedHashMap4);
    }
}
