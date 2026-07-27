package com.vungle.ads.internal.load;

import com.vungle.ads.internal.network.VungleApiClient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final VungleApiClient f11943a;

    public m(VungleApiClient apiClient) {
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        this.f11943a = apiClient;
    }

    public final void a(String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.f11943a.d(adm);
    }
}
