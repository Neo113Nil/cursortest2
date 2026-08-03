package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0793wa implements io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ze f7015a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Td f7016b;

    public C0793wa(io.appmetrica.analytics.impl.Ze ze, io.appmetrica.analytics.impl.Td td) {
        this.f7015a = ze;
        this.f7016b = td;
    }

    public final io.appmetrica.analytics.impl.Td a() {
        return this.f7016b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f7015a.a(this.f7016b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f7015a.a(this.f7016b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j2) {
        this.f7015a.b(this.f7016b, j2).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i2) {
        this.f7015a.b(this.f7016b, i2).b();
    }
}
