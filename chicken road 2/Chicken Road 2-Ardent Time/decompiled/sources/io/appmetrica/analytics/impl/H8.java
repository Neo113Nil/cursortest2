package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class H8 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Dc f4373a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Dc f4374b;

    public H8() {
        this(new io.appmetrica.analytics.impl.V7(), new io.appmetrica.analytics.impl.L9(), new io.appmetrica.analytics.impl.C0239b());
    }

    public H8(io.appmetrica.analytics.impl.V7 v7, io.appmetrica.analytics.impl.L9 l9, io.appmetrica.analytics.impl.C0239b c0239b) {
        io.appmetrica.analytics.impl.Dc dc = new io.appmetrica.analytics.impl.Dc(v7);
        this.f4373a = dc;
        dc.a(io.appmetrica.analytics.impl.I8.NONE, v7);
        dc.a(io.appmetrica.analytics.impl.I8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, l9);
        dc.a(io.appmetrica.analytics.impl.I8.AES_VALUE_ENCRYPTION, c0239b);
        this.f4374b = new io.appmetrica.analytics.impl.Dc(v7);
    }
}
