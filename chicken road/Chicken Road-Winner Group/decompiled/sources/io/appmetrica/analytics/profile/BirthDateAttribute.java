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
import io.appmetrica.analytics.impl.R2;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class BirthDateAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f8948a = new A6("appmetrica_birth_date", new C0514g8(), new Cl());

    public final UserProfileUpdate a(Calendar calendar, String str, R2 r22) {
        return new UserProfileUpdate(new C0400bn(this.f8948a.f5673c, new SimpleDateFormat(str).format(calendar.getTime()), new C0488f8(), new C0514g8(), r22));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withAge(int i3) {
        int i4 = Calendar.getInstance(Locale.US).get(1) - i3;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i4);
        return a(gregorianCalendar, "yyyy", new C1000z4(this.f8948a.f5672b));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withAgeIfUndefined(int i3) {
        int i4 = Calendar.getInstance(Locale.US).get(1) - i3;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i4);
        return a(gregorianCalendar, "yyyy", new C0424cl(this.f8948a.f5672b));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withBirthDate(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C1000z4(this.f8948a.f5672b));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withBirthDateIfUndefined(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C0424cl(this.f8948a.f5672b));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withValueReset() {
        return new UserProfileUpdate<>(new Gi(0, this.f8948a.f5673c, new C0514g8(), new Cl()));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withBirthDate(int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i3);
        return a(gregorianCalendar, "yyyy", new C1000z4(this.f8948a.f5672b));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withBirthDateIfUndefined(int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i3);
        return a(gregorianCalendar, "yyyy", new C0424cl(this.f8948a.f5672b));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withBirthDate(int i3, int i4) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i4 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C1000z4(this.f8948a.f5672b));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withBirthDateIfUndefined(int i3, int i4) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i4 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C0424cl(this.f8948a.f5672b));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withBirthDate(int i3, int i4, int i5) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i4 - 1);
        gregorianCalendar.set(5, i5);
        return a(gregorianCalendar, "yyyy-MM-dd", new C1000z4(this.f8948a.f5672b));
    }

    public UserProfileUpdate<? extends InterfaceC0530go> withBirthDateIfUndefined(int i3, int i4, int i5) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i4 - 1);
        gregorianCalendar.set(5, i5);
        return a(gregorianCalendar, "yyyy-MM-dd", new C0424cl(this.f8948a.f5672b));
    }
}
