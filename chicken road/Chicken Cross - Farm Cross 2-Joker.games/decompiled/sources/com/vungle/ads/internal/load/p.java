package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.InvalidBidPayloadError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.k2;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.q0;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.r;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class p extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.d sdkExecutors, com.vungle.ads.internal.omsdk.c omInjector, com.vungle.ads.internal.downloader.n downloader, PathProvider pathProvider, b adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        Intrinsics.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        Intrinsics.checkNotNullParameter(omInjector, "omInjector");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
    }

    @Override // com.vungle.ads.internal.load.i
    public final void i() {
        com.vungle.ads.internal.model.i k;
        i0 i0Var = this.p;
        List list = (i0Var == null || (k = i0Var.k()) == null) ? null : k.q;
        if (list == null || !list.isEmpty()) {
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new o(d()));
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((r) lazy.getValue()).a(new com.vungle.ads.internal.network.p((String) it.next()).b("win-notification").a(e()).a(), false);
                }
            }
        }
    }

    @Override // com.vungle.ads.internal.load.i
    public final void k() {
        q0 a2 = b().a();
        if (a2 == null) {
            a(new InvalidBidPayloadError().setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release());
            return;
        }
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.s()) {
            try {
                String b = a2.b();
                boolean z = u.f12190a;
                t.a("RTA_DEBUGGER", String.valueOf(b));
                Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new n(d()));
                if (b != null) {
                    new m((VungleApiClient) lazy.getValue()).a(b);
                }
            } catch (Throwable unused) {
            }
        }
        i0 a3 = a2.a();
        Integer c = a2.c();
        if (c == null || c.intValue() != 2 || a3 == null) {
            a(new AdMarkupInvalidError("The ad response did not contain valid ad markup").setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release());
        } else {
            a(a3, new k2(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_ADM_LOAD));
        }
    }
}
