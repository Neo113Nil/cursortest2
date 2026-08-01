package com.vungle.ads.internal;

import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.PathProvider;

/* loaded from: classes7.dex */
public final class i2 extends t1 {
    public final /* synthetic */ ServiceLocator b;

    public i2(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.t1
    public final Object a() {
        return FilePreferences.d.a(((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) this.b.a(com.vungle.ads.internal.executor.a.class))).f11913a, (PathProvider) this.b.a(PathProvider.class), "settings_vungle");
    }
}
