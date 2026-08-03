package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.mk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544mk {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider f6442a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6443b;

    public C0544mk() {
        io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider systemTimeProvider = new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider();
        this.f6442a = systemTimeProvider;
        this.f6443b = systemTimeProvider.currentTimeMillis();
    }
}
