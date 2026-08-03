package io.appmetrica.analytics.impl;

@io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline
@android.annotation.TargetApi(23)
/* renamed from: io.appmetrica.analytics.impl.ol, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597ol {

    /* renamed from: a, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.C0597ol f6602a = new io.appmetrica.analytics.impl.C0597ol();

    private C0597ol() {
    }

    public static final java.util.List<io.appmetrica.analytics.impl.C0441il> a(android.content.Context context) {
        java.util.List<android.telephony.SubscriptionInfo> list = (java.util.List) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceByNameSafely(context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager", new H0.b(17));
        if (list == null) {
            return i1.C0199r.f3325a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(list));
        for (android.telephony.SubscriptionInfo subscriptionInfo : list) {
            java.lang.Integer a2 = io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(29) ? io.appmetrica.analytics.impl.C0623pl.a(subscriptionInfo) : java.lang.Integer.valueOf(subscriptionInfo.getMcc());
            java.lang.Integer b2 = io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(29) ? io.appmetrica.analytics.impl.C0623pl.b(subscriptionInfo) : java.lang.Integer.valueOf(subscriptionInfo.getMnc());
            boolean z2 = subscriptionInfo.getDataRoaming() == 1;
            java.lang.CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new io.appmetrica.analytics.impl.C0441il(a2, b2, z2, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List a(android.telephony.SubscriptionManager subscriptionManager) {
        return subscriptionManager.getActiveSubscriptionInfoList();
    }
}
