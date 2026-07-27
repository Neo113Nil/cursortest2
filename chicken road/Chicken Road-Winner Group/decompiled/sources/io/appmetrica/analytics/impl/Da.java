package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;

/* loaded from: classes.dex */
public final class Da implements HostRetryInfoProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C0469ef f5843a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC0365ae f5844b;

    public Da(C0469ef c0469ef, EnumC0365ae enumC0365ae) {
        this.f5843a = c0469ef;
        this.f5844b = enumC0365ae;
    }

    public final EnumC0365ae a() {
        return this.f5844b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f5843a.a(this.f5844b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f5843a.a(this.f5844b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j3) {
        this.f5843a.b(this.f5844b, j3).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i3) {
        this.f5843a.b(this.f5844b, i3).b();
    }
}
