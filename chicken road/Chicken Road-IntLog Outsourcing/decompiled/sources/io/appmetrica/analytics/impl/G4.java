package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class G4 {

    /* renamed from: a, reason: collision with root package name */
    public final Mb f6822a;

    public G4() {
        this(C1027ua.k().l());
    }

    public static L4 a(E4 e42) {
        return new L4(new J4(e42), e42);
    }

    public G4(Mb mb) {
        this.f6822a = mb;
    }

    public final C0885on a(E4 e42, Em em) {
        C0885on c0885on = new C0885on(e42, new Ng(em));
        Mb mb = this.f6822a;
        synchronized (mb) {
            mb.f7139c.add(c0885on);
        }
        return c0885on;
    }
}
