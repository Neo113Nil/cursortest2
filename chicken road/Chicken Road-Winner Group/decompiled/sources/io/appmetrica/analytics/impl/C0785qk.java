package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.qk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0785qk {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f8170a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8171b;

    public C0785qk() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f8170a = systemTimeProvider;
        this.f8171b = systemTimeProvider.currentTimeMillis();
    }
}
