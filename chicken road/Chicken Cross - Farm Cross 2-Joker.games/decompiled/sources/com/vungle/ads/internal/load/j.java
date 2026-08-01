package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.util.PathProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class j extends l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.d sdkExecutors, com.vungle.ads.internal.omsdk.c omInjector, com.vungle.ads.internal.downloader.n downloader, PathProvider pathProvider, b adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        Intrinsics.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        Intrinsics.checkNotNullParameter(omInjector, "omInjector");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
    }

    @Override // com.vungle.ads.internal.load.l
    public final com.vungle.ads.internal.network.m a(String placement, VungleAdSize vungleAdSize) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return h().a(placement, vungleAdSize, b().b());
    }

    @Override // com.vungle.ads.internal.load.l
    public final String l() {
        return "CSB";
    }

    @Override // com.vungle.ads.internal.load.i
    public final VungleError a(i0 adPayload) {
        Intrinsics.checkNotNullParameter(adPayload, "adPayload");
        VungleError a2 = super.a(adPayload);
        if (a2 != null) {
            return a2;
        }
        if (adPayload.m() == null) {
            return new AdResponseEmptyError("CSB response is missing from ad payload");
        }
        return null;
    }
}
