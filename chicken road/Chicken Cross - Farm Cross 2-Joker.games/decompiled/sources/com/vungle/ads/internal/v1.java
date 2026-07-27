package com.vungle.ads.internal;

import com.vungle.ads.internal.util.PathProvider;

/* loaded from: classes7.dex */
public final class v1 extends t1 {
    public final /* synthetic */ ServiceLocator b;

    public v1(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.t1
    public final Object a() {
        return new PathProvider(this.b.f11884a);
    }
}
