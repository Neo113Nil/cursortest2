package com.ironsource;

import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.t9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4657t9 implements InterfaceC4380e0<InterstitialAd> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4596q1 f8677a;
    private final Executor b;

    public C4657t9(InterfaceC4596q1 analytics, Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f8677a = analytics;
        this.b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC4380e0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterstitialAd a(J9 adInstance, W1 auctionDataReporter) {
        ConcurrentHashMap concurrentHashMap;
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        C4362d0 c4362d0 = new C4362d0(new Ac());
        InterfaceC4596q1 interfaceC4596q1 = this.f8677a;
        concurrentHashMap = C4675u9.f8700a;
        return new InterstitialAd(new C4693v9(adInstance, c4362d0, auctionDataReporter, interfaceC4596q1, null, null, null, null, concurrentHashMap, 240, null));
    }
}
