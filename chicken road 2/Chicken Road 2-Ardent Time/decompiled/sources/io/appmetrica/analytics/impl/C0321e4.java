package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.e4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321e4 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider f5772a;

    public C0321e4() {
        this(new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider());
    }

    public final void a() {
        this.f5772a.elapsedRealtime();
    }

    public C0321e4(io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider systemTimeProvider) {
        this.f5772a = systemTimeProvider;
    }
}
