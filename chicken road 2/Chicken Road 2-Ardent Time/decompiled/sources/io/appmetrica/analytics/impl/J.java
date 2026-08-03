package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ze f4466a = io.appmetrica.analytics.impl.C0560na.k().y();

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle f4467b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle f4468c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle f4469d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle f4470e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle f4471f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle f4472g;

    public J(io.appmetrica.analytics.impl.C0365fm c0365fm) {
        io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle savableToggle = new io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle("advIdsFromClientApi", new io.appmetrica.analytics.impl.I(this));
        this.f4467b = savableToggle;
        io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle outerStateToggle = new io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle(false, "GAID-remote-config");
        this.f4468c = outerStateToggle;
        io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle outerStateToggle2 = new io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle(false, "HOAID-remote-config");
        this.f4469d = outerStateToggle2;
        this.f4470e = new io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle(i1.AbstractC0191j.H(savableToggle, outerStateToggle), "GAID");
        this.f4471f = new io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle(i1.AbstractC0191j.H(savableToggle, outerStateToggle2), "HOAID");
        this.f4472g = savableToggle;
        a(c0365fm);
    }

    public final void a(io.appmetrica.analytics.impl.C0365fm c0365fm) {
        boolean z2 = c0365fm.f5926p;
        boolean z3 = true;
        this.f4468c.update(!z2 || c0365fm.f5924n.f6325c);
        io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle outerStateToggle = this.f4469d;
        if (z2 && !c0365fm.f5924n.f6327e) {
            z3 = false;
        }
        outerStateToggle.update(z3);
    }

    public final io.appmetrica.analytics.impl.G a() {
        int i2;
        int i3 = 3;
        int i4 = 4;
        if (this.f4470e.getActualState()) {
            i2 = 1;
        } else if (this.f4467b.getActualState()) {
            i2 = !this.f4468c.getActualState() ? 3 : 4;
        } else {
            i2 = 2;
        }
        if (this.f4471f.getActualState()) {
            i3 = 1;
        } else if (!this.f4467b.getActualState()) {
            i3 = 2;
        } else if (this.f4469d.getActualState()) {
            i3 = 4;
        }
        if (this.f4472g.getActualState()) {
            i4 = 1;
        } else if (!this.f4467b.getActualState()) {
            i4 = 2;
        }
        return new io.appmetrica.analytics.impl.G(i2, i3, i4);
    }
}
