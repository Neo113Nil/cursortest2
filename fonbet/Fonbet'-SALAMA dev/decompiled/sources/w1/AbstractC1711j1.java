package w1;

import com.flurry.android.marketing.FlurryMarketingOptions;
import com.flurry.android.marketing.core.FlurryMarketingCoreModule;
import com.flurry.android.marketing.messaging.notification.FlurryFCMNotification;

/* renamed from: w1.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1711j1 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    public FlurryMarketingOptions f17751a;

    /* renamed from: b, reason: collision with root package name */
    public FlurryMarketingCoreModule f17752b;

    public void destroy() {
        String str = AbstractC1739q1.f17833a;
        FlurryFCMNotification.getInstance().removeNotificationListener("flurryMarketing");
        if (AbstractC1739q1.f17833a != null) {
            FlurryFCMNotification.getInstance().removeNotificationFilter(AbstractC1739q1.f17833a);
        }
        this.f17752b.destroy();
        this.f17752b = null;
    }
}
