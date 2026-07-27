package com.vungle.ads.internal;

/* loaded from: classes7.dex */
public final class c2 extends t1 {
    public final /* synthetic */ ServiceLocator b;

    public c2(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.t1
    public final Object a() {
        return new com.vungle.ads.internal.task.r((com.vungle.ads.internal.task.d) this.b.a(com.vungle.ads.internal.task.d.class), ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) this.b.a(com.vungle.ads.internal.executor.a.class))).c, new com.vungle.ads.internal.task.h());
    }
}
