package io.appmetrica.analytics.impl;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import e2.AbstractC0294i;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.sl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0837sl {

    /* renamed from: a, reason: collision with root package name */
    public static final C0837sl f8317a = new C0837sl();

    private C0837sl() {
    }

    public static final List<C0682ml> a(Context context) {
        List<SubscriptionInfo> list = (List) SystemServiceUtils.accessSystemServiceByNameSafely(context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager", new A0.r(14));
        if (list == null) {
            return e2.o.f4877a;
        }
        ArrayList arrayList = new ArrayList(AbstractC0294i.U(list));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer a3 = AndroidUtils.isApiAchieved(29) ? C0863tl.a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer b3 = AndroidUtils.isApiAchieved(29) ? C0863tl.b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z3 = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C0682ml(a3, b3, z3, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(SubscriptionManager subscriptionManager) {
        return subscriptionManager.getActiveSubscriptionInfoList();
    }
}
