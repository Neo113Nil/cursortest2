package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C1106xb;
import io.appmetrica.analytics.impl.InterfaceC0679go;
import io.appmetrica.analytics.impl.Nb;
import io.appmetrica.analytics.impl.X5;

/* loaded from: classes.dex */
public final class CounterAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f9930a;

    public CounterAttribute(String str, C1106xb c1106xb, Nb nb) {
        this.f9930a = new A6(str, c1106xb, nb);
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withDelta(double d6) {
        return new UserProfileUpdate<>(new X5(this.f9930a.f6503c, d6));
    }
}
