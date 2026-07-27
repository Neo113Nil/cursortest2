package io.appmetrica.analytics.impl;

import g4.AbstractC0466k;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;

/* loaded from: classes.dex */
public final class Mn {

    /* renamed from: a, reason: collision with root package name */
    public final M3 f7159a;

    /* renamed from: b, reason: collision with root package name */
    public final Eo f7160b;

    /* renamed from: c, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f7161c;

    public Mn(Toggle toggle) {
        M3 m32 = new M3(C1027ua.k().z());
        this.f7159a = m32;
        Eo eo = new Eo();
        this.f7160b = eo;
        this.f7161c = new ConjunctiveCompositeThreadSafeToggle(AbstractC0466k.A0(m32, eo, toggle == null ? new xo() : toggle), "loc-def");
    }
}
