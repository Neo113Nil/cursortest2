package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C0424cl;
import io.appmetrica.analytics.impl.C0675me;
import io.appmetrica.analytics.impl.C0846t4;
import io.appmetrica.analytics.impl.C0957xb;
import io.appmetrica.analytics.impl.C1000z4;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC0530go;
import io.appmetrica.analytics.impl.Nb;

/* loaded from: classes.dex */
public final class NumberAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f8954a;

    public NumberAttribute(String str, C0957xb c0957xb, Nb nb) {
        this.f8954a = new A6(str, c0957xb, nb);
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withValue(double d3) {
        return new UserProfileUpdate<>(new C0675me(this.f8954a.f5673c, d3, new C0957xb(), new C1000z4(new Nb(new C0846t4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withValueIfUndefined(double d3) {
        return new UserProfileUpdate<>(new C0675me(this.f8954a.f5673c, d3, new C0957xb(), new C0424cl(new Nb(new C0846t4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withValueReset() {
        return new UserProfileUpdate<>(new Gi(1, this.f8954a.f5673c, new C0957xb(), new Nb(new C0846t4(100))));
    }
}
