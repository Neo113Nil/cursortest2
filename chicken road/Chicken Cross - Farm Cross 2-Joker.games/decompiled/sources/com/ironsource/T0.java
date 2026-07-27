package com.ironsource;

import com.ironsource.E0;
import com.ironsource.J8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public class T0 extends C4577p0 {
    private final C4577p0 f;
    private final Q0 g;
    private InterfaceC4454i2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(C4577p0 adTools, AbstractC4720x0 adUnitData, E0.b level) {
        super(adTools, level);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f = adTools;
        Q0 a2 = Gf.a(adUnitData, adUnitData.e().c());
        Intrinsics.checkNotNullExpressionValue(a2, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.g = a2;
    }

    public final void a(InterfaceC4454i2 interfaceC4454i2) {
        this.h = interfaceC4454i2;
    }

    public final String e(String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        String c = com.ironsource.mediationsdk.d.b().c(serverData);
        Intrinsics.checkNotNullExpressionValue(c, "getInstance().getDynamic…romServerData(serverData)");
        return c;
    }

    public final Q0 h() {
        return this.g;
    }

    public final InterfaceC4454i2 i() {
        return this.h;
    }

    public final String j() {
        return com.ironsource.mediationsdk.p.g().f();
    }

    public final C4293aa k() {
        return Gf.a();
    }

    public final J8.a l() {
        return Ib.v.a().i();
    }

    public final void a(com.ironsource.environment.thread.a task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Hf.f7662a.b(task);
    }

    public final BaseAdAdapter<?, ?> a(C instanceData) {
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        return com.ironsource.mediationsdk.c.d().a(instanceData.v(), instanceData.i(), instanceData.j().b().b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(T0 adUnitTools, E0.b level) {
        super(adUnitTools, level);
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f = adUnitTools.f;
        this.g = adUnitTools.g;
        this.h = adUnitTools.h;
    }

    public final BaseAdAdapter<?, ?> a(NetworkSettings providerSettings, IronSource.a adFormat, UUID adId) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        return com.ironsource.mediationsdk.c.d().a(providerSettings, adFormat, adId);
    }

    public final String a(long j, String instanceName) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        String a2 = IronSourceUtils.a(j, instanceName);
        Intrinsics.checkNotNullExpressionValue(a2, "getTransId(timeStamp, instanceName)");
        return a2;
    }
}
