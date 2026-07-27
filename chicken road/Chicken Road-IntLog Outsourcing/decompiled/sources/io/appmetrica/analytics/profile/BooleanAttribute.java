package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C0573cl;
import io.appmetrica.analytics.impl.C0632f3;
import io.appmetrica.analytics.impl.C1149z4;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC0679go;
import io.appmetrica.analytics.impl.InterfaceC0967s2;
import io.appmetrica.analytics.impl.InterfaceC1041uo;

/* loaded from: classes.dex */
public class BooleanAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f9929a;

    public BooleanAttribute(String str, InterfaceC1041uo interfaceC1041uo, InterfaceC0967s2 interfaceC0967s2) {
        this.f9929a = new A6(str, interfaceC1041uo, interfaceC0967s2);
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withValue(boolean z) {
        A6 a6 = this.f9929a;
        return new UserProfileUpdate<>(new C0632f3(a6.f6503c, z, a6.f6501a, new C1149z4(a6.f6502b)));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withValueIfUndefined(boolean z) {
        A6 a6 = this.f9929a;
        return new UserProfileUpdate<>(new C0632f3(a6.f6503c, z, a6.f6501a, new C0573cl(a6.f6502b)));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withValueReset() {
        A6 a6 = this.f9929a;
        return new UserProfileUpdate<>(new Gi(3, a6.f6503c, a6.f6501a, a6.f6502b));
    }
}
