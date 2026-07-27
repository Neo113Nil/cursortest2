package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class A implements InterfaceC4423g7 {

    /* renamed from: a, reason: collision with root package name */
    private final J8 f7538a;

    public A(J8 sessionDepthService) {
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        this.f7538a = sessionDepthService;
    }

    @Override // com.ironsource.InterfaceC4423g7
    public void a(Map<String, Object> output) {
        Intrinsics.checkNotNullParameter(output, "output");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(L6.K0, Integer.valueOf(this.f7538a.a(LevelPlay.AdFormat.INTERSTITIAL)));
        output.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(L6.K0, Integer.valueOf(this.f7538a.a(LevelPlay.AdFormat.REWARDED)));
        output.put(L6.H0, linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(L6.K0, Integer.valueOf(this.f7538a.a(LevelPlay.AdFormat.BANNER)));
        output.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(L6.K0, Integer.valueOf(this.f7538a.a(LevelPlay.AdFormat.NATIVE_AD)));
        output.put("nativeAd", linkedHashMap4);
    }
}
