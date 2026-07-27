package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0394bh extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final zo f7058b;

    public C0394bh(C0459e5 c0459e5) {
        this(c0459e5, c0459e5.u());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        C0459e5 c0459e5 = this.f6796a;
        if (this.f7058b.c()) {
            return false;
        }
        if (!this.f7058b.d()) {
            C0799r9 c0799r9 = c0459e5.f7205n;
            c0799r9.f8207c.b(W5.a(w5, EnumC0569ib.EVENT_TYPE_FIRST_ACTIVATION));
        }
        zo zoVar = this.f7058b;
        synchronized (zoVar) {
            Ao ao = zoVar.f8715a;
            ao.a(ao.a().put("first_event_done", true));
        }
        return false;
    }

    public C0394bh(C0459e5 c0459e5, zo zoVar) {
        super(c0459e5);
        this.f7058b = zoVar;
    }
}
