package p155w1;

import com.flurry.android.marketing.messaging.notification.FlurryMessage;
import com.flurry.android.marketing.messaging.notification.FlurryNotificationFilterListener;
import com.google.firebase.messaging.RemoteMessage;

/* JADX INFO: renamed from: w1.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1022o1 implements FlurryNotificationFilterListener {
    @Override // com.flurry.android.marketing.messaging.notification.FlurryNotificationFilterListener
    public final /* synthetic */ void onNotificationReceived(Object obj) {
        FlurryMessage flurryMessageA = AbstractC1032r1.a((RemoteMessage) obj);
        if (flurryMessageA == null) {
            return;
        }
        boolean zN = AbstractC0998i1.n();
        if (!(AbstractC1006k1.a() != null ? AbstractC1006k1.a().onNotificationReceived(flurryMessageA) : false) && !zN) {
            AbstractC1030q1.g(AbstractC0998i1.o(), flurryMessageA);
        }
        AbstractC1006k1.d(flurryMessageA);
    }
}
