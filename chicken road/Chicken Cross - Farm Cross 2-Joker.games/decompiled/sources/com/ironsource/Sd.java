package com.ironsource;

import com.unity3d.ironsourceads.rewarded.RewardedAd;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Sd implements InterfaceC4380e0<RewardedAd> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4596q1 f7897a;
    private final Executor b;

    public Sd(InterfaceC4596q1 analytics, Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f7897a = analytics;
        this.b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC4380e0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RewardedAd a(J9 adInstance, W1 auctionDataReporter) {
        ConcurrentHashMap concurrentHashMap;
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        C4362d0 c4362d0 = new C4362d0(new Ac());
        InterfaceC4596q1 interfaceC4596q1 = this.f7897a;
        concurrentHashMap = Td.f7914a;
        return new RewardedAd(new Vd(adInstance, c4362d0, auctionDataReporter, interfaceC4596q1, null, null, null, null, concurrentHashMap, 240, null));
    }
}
