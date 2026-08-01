package com.vungle.ads.internal;

import com.vungle.ads.internal.util.PathProvider;

/* loaded from: classes7.dex */
public final class w1 extends t1 {
    public final /* synthetic */ ServiceLocator b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(ServiceLocator serviceLocator) {
        super(false);
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.t1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final com.vungle.ads.internal.downloader.i a() {
        return new com.vungle.ads.internal.downloader.i(((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) this.b.a(com.vungle.ads.internal.executor.a.class))).f, (PathProvider) this.b.a(PathProvider.class));
    }
}
