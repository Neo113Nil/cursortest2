package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C0424cl;
import io.appmetrica.analytics.impl.C0483f3;
import io.appmetrica.analytics.impl.C1000z4;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC0530go;
import io.appmetrica.analytics.impl.InterfaceC0818s2;
import io.appmetrica.analytics.impl.InterfaceC0892uo;

/* loaded from: classes.dex */
public class BooleanAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f8949a;

    public BooleanAttribute(String str, InterfaceC0892uo interfaceC0892uo, InterfaceC0818s2 interfaceC0818s2) {
        this.f8949a = new A6(str, interfaceC0892uo, interfaceC0818s2);
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withValue(boolean z3) {
        A6 a6 = this.f8949a;
        return new UserProfileUpdate<>(new C0483f3(a6.f5673c, z3, a6.f5671a, new C1000z4(a6.f5672b)));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withValueIfUndefined(boolean z3) {
        A6 a6 = this.f8949a;
        return new UserProfileUpdate<>(new C0483f3(a6.f5673c, z3, a6.f5671a, new C0424cl(a6.f5672b)));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withValueReset() {
        A6 a6 = this.f8949a;
        return new UserProfileUpdate<>(new Gi(3, a6.f5673c, a6.f5671a, a6.f5672b));
    }
}
