package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C0374an;
import io.appmetrica.analytics.impl.C0400bn;
import io.appmetrica.analytics.impl.C0424cl;
import io.appmetrica.analytics.impl.C1000z4;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC0530go;
import io.appmetrica.analytics.impl.InterfaceC0818s2;
import io.appmetrica.analytics.impl.InterfaceC0892uo;
import io.appmetrica.analytics.impl.Nn;

/* loaded from: classes.dex */
public class StringAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final Nn f8955a;

    /* renamed from: b, reason: collision with root package name */
    private final A6 f8956b;

    public StringAttribute(String str, C0374an c0374an, InterfaceC0892uo interfaceC0892uo, InterfaceC0818s2 interfaceC0818s2) {
        this.f8956b = new A6(str, interfaceC0892uo, interfaceC0818s2);
        this.f8955a = c0374an;
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withValue(String str) {
        A6 a6 = this.f8956b;
        return new UserProfileUpdate<>(new C0400bn(a6.f5673c, str, this.f8955a, a6.f5671a, new C1000z4(a6.f5672b)));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withValueIfUndefined(String str) {
        A6 a6 = this.f8956b;
        return new UserProfileUpdate<>(new C0400bn(a6.f5673c, str, this.f8955a, a6.f5671a, new C0424cl(a6.f5672b)));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withValueReset() {
        A6 a6 = this.f8956b;
        return new UserProfileUpdate<>(new Gi(0, a6.f5673c, a6.f5671a, a6.f5672b));
    }
}
