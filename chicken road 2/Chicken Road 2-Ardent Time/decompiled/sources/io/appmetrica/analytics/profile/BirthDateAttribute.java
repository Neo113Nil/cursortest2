package io.appmetrica.analytics.profile;

/* loaded from: classes.dex */
public class BirthDateAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.impl.C0711t6 f7454a = new io.appmetrica.analytics.impl.C0711t6("appmetrica_birth_date", new io.appmetrica.analytics.impl.C0222a8(), new io.appmetrica.analytics.impl.C0856yl());

    public final io.appmetrica.analytics.profile.UserProfileUpdate a(java.util.Calendar calendar, java.lang.String str, io.appmetrica.analytics.impl.J2 j2) {
        return new io.appmetrica.analytics.profile.UserProfileUpdate(new io.appmetrica.analytics.impl.Ym(this.f7454a.f6845c, new java.text.SimpleDateFormat(str).format(calendar.getTime()), new io.appmetrica.analytics.impl.Z7(), new io.appmetrica.analytics.impl.C0222a8(), j2));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withAge(int i2) {
        int i3 = java.util.Calendar.getInstance(java.util.Locale.US).get(1) - i2;
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        gregorianCalendar.set(1, i3);
        return a(gregorianCalendar, "yyyy", new io.appmetrica.analytics.impl.C0683s4(this.f7454a.f6844b));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withAgeIfUndefined(int i2) {
        int i3 = java.util.Calendar.getInstance(java.util.Locale.US).get(1) - i2;
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        gregorianCalendar.set(1, i3);
        return a(gregorianCalendar, "yyyy", new io.appmetrica.analytics.impl.Xk(this.f7454a.f6844b));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withBirthDate(java.util.Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new io.appmetrica.analytics.impl.C0683s4(this.f7454a.f6844b));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withBirthDateIfUndefined(java.util.Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new io.appmetrica.analytics.impl.Xk(this.f7454a.f6844b));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withValueReset() {
        return new io.appmetrica.analytics.profile.UserProfileUpdate<>(new io.appmetrica.analytics.impl.Bi(0, this.f7454a.f6845c, new io.appmetrica.analytics.impl.C0222a8(), new io.appmetrica.analytics.impl.C0856yl()));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withBirthDate(int i2) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return a(gregorianCalendar, "yyyy", new io.appmetrica.analytics.impl.C0683s4(this.f7454a.f6844b));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withBirthDateIfUndefined(int i2) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return a(gregorianCalendar, "yyyy", new io.appmetrica.analytics.impl.Xk(this.f7454a.f6844b));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withBirthDate(int i2, int i3) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i3 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new io.appmetrica.analytics.impl.C0683s4(this.f7454a.f6844b));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withBirthDateIfUndefined(int i2, int i3) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i3 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new io.appmetrica.analytics.impl.Xk(this.f7454a.f6844b));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withBirthDate(int i2, int i3, int i4) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i3 - 1);
        gregorianCalendar.set(5, i4);
        return a(gregorianCalendar, "yyyy-MM-dd", new io.appmetrica.analytics.impl.C0683s4(this.f7454a.f6844b));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withBirthDateIfUndefined(int i2, int i3, int i4) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i3 - 1);
        gregorianCalendar.set(5, i4);
        return a(gregorianCalendar, "yyyy-MM-dd", new io.appmetrica.analytics.impl.Xk(this.f7454a.f6844b));
    }
}
