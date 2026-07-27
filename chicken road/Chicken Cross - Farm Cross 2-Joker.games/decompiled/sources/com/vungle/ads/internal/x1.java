package com.vungle.ads.internal;

import com.vungle.ads.internal.util.PathProvider;

/* loaded from: classes7.dex */
public final class x1 extends t1 {
    public final /* synthetic */ ServiceLocator b;

    public x1(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.t1
    public final Object a() {
        Object a2;
        Object a3;
        a2 = this.b.a(com.vungle.ads.internal.executor.a.class);
        a3 = this.b.a(PathProvider.class);
        return new com.vungle.ads.internal.downloader.t((com.vungle.ads.internal.executor.a) a2, (PathProvider) a3);
    }
}
