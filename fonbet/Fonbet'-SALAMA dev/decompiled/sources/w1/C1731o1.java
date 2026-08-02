package w1;

import com.flurry.android.marketing.messaging.notification.FlurryMessage;
import com.flurry.android.marketing.messaging.notification.FlurryNotificationFilterListener;
import com.google.firebase.messaging.RemoteMessage;

/* renamed from: w1.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1731o1 implements FlurryNotificationFilterListener {
    @Override // com.flurry.android.marketing.messaging.notification.FlurryNotificationFilterListener
    public final /* synthetic */ void onNotificationReceived(Object obj) {
        FlurryMessage a2 = AbstractC1741r1.a((RemoteMessage) obj);
        if (a2 == null) {
            return;
        }
        boolean n2 = AbstractC1707i1.n();
        if (!(AbstractC1715k1.a() != null ? AbstractC1715k1.a().onNotificationReceived(a2) : false) && !n2) {
            AbstractC1739q1.g(AbstractC1707i1.o(), a2);
        }
        AbstractC1715k1.d(a2);
    }
}
