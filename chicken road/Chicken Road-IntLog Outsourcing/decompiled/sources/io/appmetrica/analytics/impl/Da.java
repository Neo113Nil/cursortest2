package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;

/* loaded from: classes.dex */
public final class Da implements HostRetryInfoProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C0618ef f6680a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC0514ae f6681b;

    public Da(C0618ef c0618ef, EnumC0514ae enumC0514ae) {
        this.f6680a = c0618ef;
        this.f6681b = enumC0514ae;
    }

    public final EnumC0514ae a() {
        return this.f6681b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f6680a.a(this.f6681b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f6680a.a(this.f6681b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j2) {
        this.f6680a.b(this.f6681b, j2).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i2) {
        this.f6680a.b(this.f6681b, i2).b();
    }
}
