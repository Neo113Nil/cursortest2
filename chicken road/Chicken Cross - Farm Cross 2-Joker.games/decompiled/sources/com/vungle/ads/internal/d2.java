package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;

/* loaded from: classes7.dex */
public final class d2 extends t1 {
    public final /* synthetic */ ServiceLocator b;

    public d2(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.t1
    public final Object a() {
        Object a2;
        Object a3;
        ServiceLocator serviceLocator = this.b;
        Context context = serviceLocator.f11884a;
        a2 = serviceLocator.a(com.vungle.ads.internal.platform.f.class);
        a3 = this.b.a(FilePreferences.class);
        return new VungleApiClient(context, (com.vungle.ads.internal.platform.f) a2, (FilePreferences) a3);
    }
}
