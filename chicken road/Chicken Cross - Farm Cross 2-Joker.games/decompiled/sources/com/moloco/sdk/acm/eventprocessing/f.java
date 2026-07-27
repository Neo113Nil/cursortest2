package com.moloco.sdk.acm.eventprocessing;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.services.i f10395a;
    public final long b;

    public f(com.moloco.sdk.acm.services.i timeProviderService, long j) {
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f10395a = timeProviderService;
        this.b = j;
    }

    public final boolean a(com.moloco.sdk.acm.db.b eventEntity) {
        Intrinsics.checkNotNullParameter(eventEntity, "eventEntity");
        return this.f10395a.invoke() - eventEntity.l() >= this.b * ((long) 1000);
    }
}
