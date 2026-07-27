package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class M8 {

    /* renamed from: a, reason: collision with root package name */
    public final Kc f6279a;

    /* renamed from: b, reason: collision with root package name */
    public final Kc f6280b;

    public M8() {
        this(new C0385b8(), new S9(), new C0376b());
    }

    public M8(C0385b8 c0385b8, S9 s9, C0376b c0376b) {
        Kc kc = new Kc(c0385b8);
        this.f6279a = kc;
        kc.a(N8.NONE, c0385b8);
        kc.a(N8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, s9);
        kc.a(N8.AES_VALUE_ENCRYPTION, c0376b);
        this.f6280b = new Kc(c0385b8);
    }
}
