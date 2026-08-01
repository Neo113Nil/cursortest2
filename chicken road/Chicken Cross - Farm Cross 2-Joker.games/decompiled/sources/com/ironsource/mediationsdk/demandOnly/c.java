package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C4457i5;
import com.ironsource.EnumC4707w5;
import com.ironsource.I9;
import com.ironsource.M4;
import com.ironsource.S2;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.demandOnly.i;
import com.ironsource.mediationsdk.demandOnly.o;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class c implements i.a {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, d> f8389a = new ConcurrentHashMap<>();
    private M4 b;

    public c(List<NetworkSettings> list, S2 s2, String str, String str2, M4 m4) {
        String d = IronSourceUtils.d();
        boolean k = s2.k();
        this.b = m4;
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(s2.d(), d));
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter a2 = com.ironsource.mediationsdk.c.d().a(networkSettings, networkSettings.getBannerSettings(), true);
                if (a2 != null) {
                    d dVar = new d(str, str2, networkSettings, s2.b(), a2, eVar);
                    dVar.a(k);
                    this.f8389a.put(dVar.l(), dVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        d dVar = this.f8389a.get(str);
        if (dVar != null) {
            dVar.a(iSDemandOnlyBannerLayout);
            return;
        }
        this.b.a(EnumC4707w5.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
        IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
        IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.getListener().a(str, buildNonExistentInstanceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        d dVar = this.f8389a.get(str);
        if (dVar == null) {
            this.b.a(EnumC4707w5.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
            IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
            IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
            iSDemandOnlyBannerLayout.getListener().a(str, buildNonExistentInstanceError);
            return;
        }
        dVar.a(iSDemandOnlyBannerLayout, new o.a(I9.b(C4457i5.b().c(), str2)));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public synchronized void a(String str) {
        d dVar = this.f8389a.get(str);
        if (dVar == null) {
            this.b.a(EnumC4707w5.BN_DO_INSTANCE_NOT_FOUND_IN_DESTROY, str);
            IronLog.API.error(ErrorBuilder.buildNonExistentInstanceError("Banner").getErrorMessage());
            return;
        }
        dVar.r();
    }
}
