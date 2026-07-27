package io.appmetrica.analytics.profile;

import B0.c;
import io.appmetrica.analytics.impl.C0374an;
import io.appmetrica.analytics.impl.C0846t4;
import io.appmetrica.analytics.impl.C0957xb;
import io.appmetrica.analytics.impl.Nb;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Attribute {
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    public static BooleanAttribute customBoolean(String str) {
        return new BooleanAttribute(str, new C0957xb(), new Nb(new C0846t4(100)));
    }

    public static CounterAttribute customCounter(String str) {
        return new CounterAttribute(str, new C0957xb(), new Nb(new C0846t4(100)));
    }

    public static NumberAttribute customNumber(String str) {
        return new NumberAttribute(str, new C0957xb(), new Nb(new C0846t4(100)));
    }

    public static StringAttribute customString(String str) {
        return new StringAttribute(str, new C0374an(200, c.k("String attribute \"", str, "\""), PublicLogger.getAnonymousInstance()), new C0957xb(), new Nb(new C0846t4(100)));
    }

    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    public static NameAttribute name() {
        return new NameAttribute();
    }

    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }
}
