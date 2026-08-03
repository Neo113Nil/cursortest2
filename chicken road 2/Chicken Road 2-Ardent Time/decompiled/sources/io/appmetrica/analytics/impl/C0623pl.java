package io.appmetrica.analytics.impl;

@io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline
@android.annotation.TargetApi(io.appmetrica.analytics.impl.C0326e9.f5796I)
/* renamed from: io.appmetrica.analytics.impl.pl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623pl {

    /* renamed from: a, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.C0623pl f6662a = new io.appmetrica.analytics.impl.C0623pl();

    private C0623pl() {
    }

    public static final java.lang.Integer a(android.telephony.SubscriptionInfo subscriptionInfo) {
        java.lang.String mccString;
        mccString = subscriptionInfo.getMccString();
        return io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.intValueOf(mccString);
    }

    public static final java.lang.Integer b(android.telephony.SubscriptionInfo subscriptionInfo) {
        java.lang.String mncString;
        mncString = subscriptionInfo.getMncString();
        return io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.intValueOf(mncString);
    }
}
