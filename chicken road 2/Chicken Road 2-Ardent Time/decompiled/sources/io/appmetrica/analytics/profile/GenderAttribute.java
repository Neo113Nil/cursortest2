package io.appmetrica.analytics.profile;

/* loaded from: classes.dex */
public class GenderAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.impl.C0711t6 f7463a = new io.appmetrica.analytics.impl.C0711t6("appmetrica_gender", new io.appmetrica.analytics.impl.C0222a8(), new io.appmetrica.analytics.impl.C0856yl());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f7465a;

        Gender(java.lang.String str) {
            this.f7465a = str;
        }

        public java.lang.String getStringValue() {
            return this.f7465a;
        }
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withValue(io.appmetrica.analytics.profile.GenderAttribute.Gender gender) {
        java.lang.String str = this.f7463a.f6845c;
        java.lang.String stringValue = gender.getStringValue();
        io.appmetrica.analytics.impl.Z7 z7 = new io.appmetrica.analytics.impl.Z7();
        io.appmetrica.analytics.impl.C0711t6 c0711t6 = this.f7463a;
        return new io.appmetrica.analytics.profile.UserProfileUpdate<>(new io.appmetrica.analytics.impl.Ym(str, stringValue, z7, c0711t6.f6843a, new io.appmetrica.analytics.impl.C0683s4(c0711t6.f6844b)));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withValueIfUndefined(io.appmetrica.analytics.profile.GenderAttribute.Gender gender) {
        java.lang.String str = this.f7463a.f6845c;
        java.lang.String stringValue = gender.getStringValue();
        io.appmetrica.analytics.impl.Z7 z7 = new io.appmetrica.analytics.impl.Z7();
        io.appmetrica.analytics.impl.C0711t6 c0711t6 = this.f7463a;
        return new io.appmetrica.analytics.profile.UserProfileUpdate<>(new io.appmetrica.analytics.impl.Ym(str, stringValue, z7, c0711t6.f6843a, new io.appmetrica.analytics.impl.Xk(c0711t6.f6844b)));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withValueReset() {
        io.appmetrica.analytics.impl.C0711t6 c0711t6 = this.f7463a;
        return new io.appmetrica.analytics.profile.UserProfileUpdate<>(new io.appmetrica.analytics.impl.Bi(0, c0711t6.f6845c, c0711t6.f6843a, c0711t6.f6844b));
    }
}
