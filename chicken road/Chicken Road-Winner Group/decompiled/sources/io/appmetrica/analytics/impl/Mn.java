package io.appmetrica.analytics.impl;

import e2.AbstractC0293h;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;

/* loaded from: classes.dex */
public final class Mn {

    /* renamed from: a, reason: collision with root package name */
    public final M3 f6302a;

    /* renamed from: b, reason: collision with root package name */
    public final Eo f6303b;

    /* renamed from: c, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f6304c;

    public Mn(Toggle toggle) {
        M3 m3 = new M3(C0878ua.k().z());
        this.f6302a = m3;
        Eo eo = new Eo();
        this.f6303b = eo;
        this.f6304c = new ConjunctiveCompositeThreadSafeToggle(AbstractC0293h.S(m3, eo, toggle == null ? new xo() : toggle), "loc-def");
    }
}
