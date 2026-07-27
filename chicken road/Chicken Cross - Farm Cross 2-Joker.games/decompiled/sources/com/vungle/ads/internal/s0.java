package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class s0 implements com.vungle.ads.internal.network.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f12115a;
    public final /* synthetic */ Context b;

    public s0(Context context, p2 p2Var) {
        this.f12115a = p2Var;
        this.b = context;
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(com.vungle.ads.internal.network.o oVar) {
        if (s1.a() == null) {
            this.f12115a.invoke(Boolean.FALSE);
            return;
        }
        if (oVar == null || !oVar.c() || oVar.a() == null) {
            new APIFailedStatusCodeError(com.iab.omid.library.vungle.internal.l.a("config API: ").append(oVar != null ? Integer.valueOf(oVar.b()) : null).toString()).logErrorNoReturnValue$vungle_ads_release();
            this.f12115a.invoke(Boolean.FALSE);
        } else {
            ConfigManager.INSTANCE.a(this.b, (com.vungle.ads.internal.model.w2) oVar.a(), q0.INIT_FRESH, new k2(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_INIT));
            this.f12115a.invoke(Boolean.TRUE);
        }
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(Throwable th) {
        if (s1.a() == null) {
            this.f12115a.invoke(Boolean.FALSE);
        } else {
            new NetworkUnreachable(com.iab.omid.library.vungle.internal.l.a("Error while fetching config: ").append(th != null ? th.getMessage() : null).toString()).logErrorNoReturnValue$vungle_ads_release();
            this.f12115a.invoke(Boolean.FALSE);
        }
    }
}
