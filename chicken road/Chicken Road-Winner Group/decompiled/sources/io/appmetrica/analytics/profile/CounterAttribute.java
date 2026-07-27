package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C0957xb;
import io.appmetrica.analytics.impl.InterfaceC0530go;
import io.appmetrica.analytics.impl.Nb;
import io.appmetrica.analytics.impl.X5;

/* loaded from: classes.dex */
public final class CounterAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f8950a;

    public CounterAttribute(String str, C0957xb c0957xb, Nb nb) {
        this.f8950a = new A6(str, c0957xb, nb);
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withDelta(double d3) {
        return new UserProfileUpdate<>(new X5(this.f8950a.f5673c, d3));
    }
}
