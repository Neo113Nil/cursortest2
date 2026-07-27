package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.qk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0934qk {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f9113a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9114b;

    public C0934qk() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f9113a = systemTimeProvider;
        this.f9114b = systemTimeProvider.currentTimeMillis();
    }
}
