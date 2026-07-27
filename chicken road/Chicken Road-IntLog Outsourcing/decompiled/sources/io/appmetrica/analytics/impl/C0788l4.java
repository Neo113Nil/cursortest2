package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.l4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788l4 {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f8654a;

    public C0788l4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.f8654a.elapsedRealtime();
    }

    public C0788l4(SystemTimeProvider systemTimeProvider) {
        this.f8654a = systemTimeProvider;
    }
}
