package com.ironsource;

/* loaded from: classes5.dex */
public class V0 extends com.ironsource.C3212p0 {
    private final com.ironsource.C3212p0 g;
    private final com.ironsource.S0 h;
    private com.ironsource.InterfaceC3124k2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(com.ironsource.C3212p0 adTools, com.ironsource.AbstractC3355x0 adUnitData, com.ironsource.F0.b level) {
        super(adTools, level);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
        this.g = adTools;
        com.ironsource.S0 a2 = com.ironsource.Ff.a(adUnitData, adUnitData.e().c());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.h = a2;
    }

    public final void a(com.ironsource.InterfaceC3124k2 interfaceC3124k2) {
        this.i = interfaceC3124k2;
    }

    public final void c(com.ironsource.AbstractRunnableC3136ke task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        com.ironsource.Gf.f5727a.b(task);
    }

    public final java.lang.String e(java.lang.String serverData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverData, "serverData");
        java.lang.String c = com.ironsource.mediationsdk.d.b().c(serverData);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c, "getInstance().getDynamic…romServerData(serverData)");
        return c;
    }

    public final com.ironsource.S0 h() {
        return this.h;
    }

    public final com.ironsource.InterfaceC3124k2 i() {
        return this.i;
    }

    public final java.lang.String j() {
        return com.ironsource.mediationsdk.p.h().g();
    }

    public final com.ironsource.C2953aa k() {
        return com.ironsource.Ff.a();
    }

    public final com.ironsource.L8.a l() {
        return com.ironsource.Jb.u.a().i();
    }

    public final com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> a(com.ironsource.C instanceData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        return com.ironsource.mediationsdk.c.b().a(instanceData.v(), instanceData.i(), instanceData.j().b().b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(com.ironsource.V0 adUnitTools, com.ironsource.F0.b level) {
        super(adUnitTools, level);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
        this.g = adUnitTools.g;
        this.h = adUnitTools.h;
        this.i = adUnitTools.i;
    }

    public final com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> a(com.ironsource.mediationsdk.model.NetworkSettings providerSettings, com.ironsource.mediationsdk.IronSource.a adFormat, java.util.UUID adId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        return com.ironsource.mediationsdk.c.b().a(providerSettings, adFormat, adId);
    }

    public final java.lang.String a(long j, java.lang.String instanceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        java.lang.String a2 = com.ironsource.mediationsdk.utils.IronSourceUtils.a(j, instanceName);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "getTransId(timeStamp, instanceName)");
        return a2;
    }
}
