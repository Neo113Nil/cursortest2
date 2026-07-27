package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C0573cl;
import io.appmetrica.analytics.impl.C0824me;
import io.appmetrica.analytics.impl.C0995t4;
import io.appmetrica.analytics.impl.C1106xb;
import io.appmetrica.analytics.impl.C1149z4;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC0679go;
import io.appmetrica.analytics.impl.Nb;

/* loaded from: classes.dex */
public final class NumberAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f9934a;

    public NumberAttribute(String str, C1106xb c1106xb, Nb nb) {
        this.f9934a = new A6(str, c1106xb, nb);
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withValue(double d6) {
        return new UserProfileUpdate<>(new C0824me(this.f9934a.f6503c, d6, new C1106xb(), new C1149z4(new Nb(new C0995t4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withValueIfUndefined(double d6) {
        return new UserProfileUpdate<>(new C0824me(this.f9934a.f6503c, d6, new C1106xb(), new C0573cl(new Nb(new C0995t4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withValueReset() {
        return new UserProfileUpdate<>(new Gi(1, this.f9934a.f6503c, new C1106xb(), new Nb(new C0995t4(100))));
    }
}
