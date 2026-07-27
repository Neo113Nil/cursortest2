package io.appmetrica.analytics.impl;

import e2.AbstractC0293h;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final C0469ef f6133a = C0878ua.k().z();

    /* renamed from: b, reason: collision with root package name */
    public final SavableToggle f6134b;

    /* renamed from: c, reason: collision with root package name */
    public final OuterStateToggle f6135c;

    /* renamed from: d, reason: collision with root package name */
    public final OuterStateToggle f6136d;

    /* renamed from: e, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f6137e;
    public final ConjunctiveCompositeThreadSafeToggle f;

    /* renamed from: g, reason: collision with root package name */
    public final SavableToggle f6138g;

    public J(C0605jm c0605jm) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new I(this));
        this.f6134b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.f6135c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.f6136d = outerStateToggle2;
        this.f6137e = new ConjunctiveCompositeThreadSafeToggle(AbstractC0293h.S(savableToggle, outerStateToggle), "GAID");
        this.f = new ConjunctiveCompositeThreadSafeToggle(AbstractC0293h.S(savableToggle, outerStateToggle2), "HOAID");
        this.f6138g = savableToggle;
        a(c0605jm);
    }

    public final void a(C0605jm c0605jm) {
        boolean z3 = c0605jm.f7656p;
        boolean z4 = true;
        this.f6135c.update(!z3 || c0605jm.f7654n.f8284c);
        OuterStateToggle outerStateToggle = this.f6136d;
        if (z3 && !c0605jm.f7654n.f8286e) {
            z4 = false;
        }
        outerStateToggle.update(z4);
    }

    public final G a() {
        int i3;
        int i4 = 3;
        int i5 = 4;
        if (this.f6137e.getActualState()) {
            i3 = 1;
        } else if (this.f6134b.getActualState()) {
            i3 = !this.f6135c.getActualState() ? 3 : 4;
        } else {
            i3 = 2;
        }
        if (this.f.getActualState()) {
            i4 = 1;
        } else if (!this.f6134b.getActualState()) {
            i4 = 2;
        } else if (this.f6136d.getActualState()) {
            i4 = 4;
        }
        if (this.f6138g.getActualState()) {
            i5 = 1;
        } else if (!this.f6134b.getActualState()) {
            i5 = 2;
        }
        return new G(i3, i4, i5);
    }
}
