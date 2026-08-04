package p155w1;

import com.flurry.android.marketing.FlurryMarketingOptions;
import com.flurry.android.marketing.core.FlurryMarketingCoreModule;
import com.flurry.android.marketing.messaging.notification.FlurryFCMNotification;

/* JADX INFO: renamed from: w1.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1002j1 implements L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FlurryMarketingOptions f17757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FlurryMarketingCoreModule f17758b;

    public void destroy() {
        String str = AbstractC1030q1.f17839a;
        FlurryFCMNotification.getInstance().removeNotificationListener("flurryMarketing");
        if (AbstractC1030q1.f17839a != null) {
            FlurryFCMNotification.getInstance().removeNotificationFilter(AbstractC1030q1.f17839a);
        }
        this.f17758b.destroy();
        this.f17758b = null;
    }
}
