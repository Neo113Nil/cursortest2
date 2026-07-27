package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class G4 {

    /* renamed from: a, reason: collision with root package name */
    public final Mb f5977a;

    public G4() {
        this(C0878ua.k().l());
    }

    public static L4 a(E4 e4) {
        return new L4(new J4(e4), e4);
    }

    public G4(Mb mb) {
        this.f5977a = mb;
    }

    public final C0736on a(E4 e4, Em em) {
        C0736on c0736on = new C0736on(e4, new Ng(em));
        Mb mb = this.f5977a;
        synchronized (mb) {
            mb.f6283c.add(c0736on);
        }
        return c0736on;
    }
}
