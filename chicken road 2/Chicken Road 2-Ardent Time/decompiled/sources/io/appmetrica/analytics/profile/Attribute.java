package io.appmetrica.analytics.profile;

/* loaded from: classes.dex */
public final class Attribute {
    public static io.appmetrica.analytics.profile.BirthDateAttribute birthDate() {
        return new io.appmetrica.analytics.profile.BirthDateAttribute();
    }

    public static io.appmetrica.analytics.profile.BooleanAttribute customBoolean(java.lang.String str) {
        return new io.appmetrica.analytics.profile.BooleanAttribute(str, new io.appmetrica.analytics.impl.C0639qb(), new io.appmetrica.analytics.impl.Gb(new io.appmetrica.analytics.impl.C0528m4(100)));
    }

    public static io.appmetrica.analytics.profile.CounterAttribute customCounter(java.lang.String str) {
        return new io.appmetrica.analytics.profile.CounterAttribute(str, new io.appmetrica.analytics.impl.C0639qb(), new io.appmetrica.analytics.impl.Gb(new io.appmetrica.analytics.impl.C0528m4(100)));
    }

    public static io.appmetrica.analytics.profile.NumberAttribute customNumber(java.lang.String str) {
        return new io.appmetrica.analytics.profile.NumberAttribute(str, new io.appmetrica.analytics.impl.C0639qb(), new io.appmetrica.analytics.impl.Gb(new io.appmetrica.analytics.impl.C0528m4(100)));
    }

    public static io.appmetrica.analytics.profile.StringAttribute customString(java.lang.String str) {
        return new io.appmetrica.analytics.profile.StringAttribute(str, new io.appmetrica.analytics.impl.Xm(200, "String attribute \"" + str + "\"", io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance()), new io.appmetrica.analytics.impl.C0639qb(), new io.appmetrica.analytics.impl.Gb(new io.appmetrica.analytics.impl.C0528m4(100)));
    }

    public static io.appmetrica.analytics.profile.FirstPartyDataEmailSha256Attribute emailHash() {
        return new io.appmetrica.analytics.profile.FirstPartyDataEmailSha256Attribute(new io.appmetrica.analytics.impl.Yk(new io.appmetrica.analytics.impl.C0765v8()));
    }

    public static io.appmetrica.analytics.profile.GenderAttribute gender() {
        return new io.appmetrica.analytics.profile.GenderAttribute();
    }

    public static io.appmetrica.analytics.profile.NameAttribute name() {
        return new io.appmetrica.analytics.profile.NameAttribute();
    }

    public static io.appmetrica.analytics.profile.NotificationsEnabledAttribute notificationsEnabled() {
        return new io.appmetrica.analytics.profile.NotificationsEnabledAttribute();
    }

    public static io.appmetrica.analytics.profile.FirstPartyDataPhoneSha256Attribute phoneHash() {
        return new io.appmetrica.analytics.profile.FirstPartyDataPhoneSha256Attribute(new io.appmetrica.analytics.impl.Yk(new io.appmetrica.analytics.impl.Be()));
    }

    public static io.appmetrica.analytics.profile.FirstPartyDataTelegramLoginSha256Attribute telegramLoginHash() {
        return new io.appmetrica.analytics.profile.FirstPartyDataTelegramLoginSha256Attribute(new io.appmetrica.analytics.impl.Yk(new io.appmetrica.analytics.impl.C0573nn()));
    }
}
