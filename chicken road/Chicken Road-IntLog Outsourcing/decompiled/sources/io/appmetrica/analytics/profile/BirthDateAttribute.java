package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C0549bn;
import io.appmetrica.analytics.impl.C0573cl;
import io.appmetrica.analytics.impl.C0637f8;
import io.appmetrica.analytics.impl.C0663g8;
import io.appmetrica.analytics.impl.C1149z4;
import io.appmetrica.analytics.impl.Cl;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC0679go;
import io.appmetrica.analytics.impl.R2;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class BirthDateAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f9928a = new A6("appmetrica_birth_date", new C0663g8(), new Cl());

    public final UserProfileUpdate a(Calendar calendar, String str, R2 r22) {
        return new UserProfileUpdate(new C0549bn(this.f9928a.f6503c, new SimpleDateFormat(str).format(calendar.getTime()), new C0637f8(), new C0663g8(), r22));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withAge(int i2) {
        int i3 = Calendar.getInstance(Locale.US).get(1) - i2;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i3);
        return a(gregorianCalendar, "yyyy", new C1149z4(this.f9928a.f6502b));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withAgeIfUndefined(int i2) {
        int i3 = Calendar.getInstance(Locale.US).get(1) - i2;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i3);
        return a(gregorianCalendar, "yyyy", new C0573cl(this.f9928a.f6502b));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withBirthDate(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C1149z4(this.f9928a.f6502b));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withBirthDateIfUndefined(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C0573cl(this.f9928a.f6502b));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withValueReset() {
        return new UserProfileUpdate<>(new Gi(0, this.f9928a.f6503c, new C0663g8(), new Cl()));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withBirthDate(int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return a(gregorianCalendar, "yyyy", new C1149z4(this.f9928a.f6502b));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withBirthDateIfUndefined(int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return a(gregorianCalendar, "yyyy", new C0573cl(this.f9928a.f6502b));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withBirthDate(int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i3 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C1149z4(this.f9928a.f6502b));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withBirthDateIfUndefined(int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i3 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C0573cl(this.f9928a.f6502b));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withBirthDate(int i2, int i3, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i3 - 1);
        gregorianCalendar.set(5, i6);
        return a(gregorianCalendar, "yyyy-MM-dd", new C1149z4(this.f9928a.f6502b));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withBirthDateIfUndefined(int i2, int i3, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i3 - 1);
        gregorianCalendar.set(5, i6);
        return a(gregorianCalendar, "yyyy-MM-dd", new C0573cl(this.f9928a.f6502b));
    }
}
