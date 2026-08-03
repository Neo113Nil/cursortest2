package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219a5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5460a;

    public C0219a5(java.lang.String str) {
        this.f5460a = str;
    }

    public final io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger a() {
        return io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(this.f5460a);
    }
}
