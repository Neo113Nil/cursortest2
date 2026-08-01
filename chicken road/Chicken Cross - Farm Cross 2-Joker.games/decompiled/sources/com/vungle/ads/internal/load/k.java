package com.vungle.ads.internal.load;

import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AdRetryError;
import com.vungle.ads.internal.k2;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.j3;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class k implements com.vungle.ads.internal.network.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f11942a;
    public final /* synthetic */ j3 b;

    public k(l lVar, j3 j3Var) {
        this.f11942a = lVar;
        this.b = j3Var;
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(final com.vungle.ads.internal.network.o oVar) {
        final l lVar = this.f11942a;
        com.vungle.ads.internal.executor.j jVar = ((com.vungle.ads.internal.executor.d) lVar.c).b;
        final j3 j3Var = this.b;
        jVar.execute(new Runnable() { // from class: com.vungle.ads.internal.load.k$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                k.a(l.this, j3Var, oVar);
            }
        });
    }

    public static final void a(l this$0, j3 placement, com.vungle.ads.internal.network.o oVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(placement, "$placement");
        if (this$0.h().b(placement.b()) > 0) {
            this$0.a(new AdRetryError().setLogEntry$vungle_ads_release(this$0.e()).logError$vungle_ads_release());
            return;
        }
        if (oVar != null && !oVar.c()) {
            this$0.a(new APIFailedStatusCodeError(this$0.l() + " API: " + oVar.b()).setLogEntry$vungle_ads_release(this$0.e()).logError$vungle_ads_release());
            return;
        }
        i0 i0Var = oVar != null ? (i0) oVar.a() : null;
        if ((i0Var != null ? i0Var.c() : null) == null) {
            this$0.a(new AdResponseEmptyError(this$0.l() + " ad response is empty").setLogEntry$vungle_ads_release(this$0.e()).logError$vungle_ads_release());
        } else {
            this$0.a(i0Var, new k2(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_AD_LOAD));
        }
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(final Throwable th) {
        final l lVar = this.f11942a;
        ((com.vungle.ads.internal.executor.d) lVar.c).b.execute(new Runnable() { // from class: com.vungle.ads.internal.load.k$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                k.a(l.this, th);
            }
        });
    }

    public static final void a(l this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(l.a(this$0, th).setLogEntry$vungle_ads_release(this$0.e()).logError$vungle_ads_release());
    }
}
