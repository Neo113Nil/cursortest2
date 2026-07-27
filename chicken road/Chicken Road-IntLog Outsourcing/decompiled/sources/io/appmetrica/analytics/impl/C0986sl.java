package io.appmetrica.analytics.impl;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import g4.AbstractC0467l;
import g4.C0471p;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.sl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0986sl {

    /* renamed from: a, reason: collision with root package name */
    public static final C0986sl f9265a = new C0986sl();

    private C0986sl() {
    }

    public static final List<C0831ml> a(Context context) {
        List<SubscriptionInfo> list = (List) SystemServiceUtils.accessSystemServiceByNameSafely(context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager", new Vo(1));
        if (list == null) {
            return C0471p.f5750a;
        }
        ArrayList arrayList = new ArrayList(AbstractC0467l.D0(list, 10));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer a6 = AndroidUtils.isApiAchieved(29) ? C1012tl.a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer b6 = AndroidUtils.isApiAchieved(29) ? C1012tl.b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C0831ml(a6, b6, z, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(SubscriptionManager subscriptionManager) {
        return subscriptionManager.getActiveSubscriptionInfoList();
    }
}
