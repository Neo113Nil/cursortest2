package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C0400bn;
import io.appmetrica.analytics.impl.C0424cl;
import io.appmetrica.analytics.impl.C0488f8;
import io.appmetrica.analytics.impl.C0514g8;
import io.appmetrica.analytics.impl.C1000z4;
import io.appmetrica.analytics.impl.Cl;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC0530go;

/* loaded from: classes.dex */
public class GenderAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f8951a = new A6("appmetrica_gender", new C0514g8(), new Cl());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* renamed from: a, reason: collision with root package name */
        private final String f8953a;

        Gender(String str) {
            this.f8953a = str;
        }

        public String getStringValue() {
            return this.f8953a;
        }
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withValue(Gender gender) {
        String str = this.f8951a.f5673c;
        String stringValue = gender.getStringValue();
        C0488f8 c0488f8 = new C0488f8();
        A6 a6 = this.f8951a;
        return new UserProfileUpdate<>(new C0400bn(str, stringValue, c0488f8, a6.f5671a, new C1000z4(a6.f5672b)));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withValueIfUndefined(Gender gender) {
        String str = this.f8951a.f5673c;
        String stringValue = gender.getStringValue();
        C0488f8 c0488f8 = new C0488f8();
        A6 a6 = this.f8951a;
        return new UserProfileUpdate<>(new C0400bn(str, stringValue, c0488f8, a6.f5671a, new C0424cl(a6.f5672b)));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withValueReset() {
        A6 a6 = this.f8951a;
        return new UserProfileUpdate<>(new Gi(0, a6.f5673c, a6.f5671a, a6.f5672b));
    }
}
