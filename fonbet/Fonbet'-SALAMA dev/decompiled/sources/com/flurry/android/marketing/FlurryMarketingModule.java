package com.flurry.android.marketing;

import android.content.Context;
import android.text.TextUtils;
import com.flurry.android.marketing.core.FlurryMarketingCoreModule;
import u1.b;
import u1.i;
import w1.AbstractC1706i0;
import w1.AbstractC1711j1;
import w1.AbstractC1715k1;
import w1.AbstractC1739q1;

/* loaded from: classes.dex */
public final class FlurryMarketingModule extends AbstractC1711j1 implements i {
    public static String VERSION_STRING = "!SDK-VERSION-STRING!:com.flurry.android:marketing:14.4.0";

    public FlurryMarketingModule(FlurryMarketingOptions flurryMarketingOptions) {
        this.f17751a = flurryMarketingOptions;
        if (flurryMarketingOptions == null) {
            throw new IllegalArgumentException("Must pass in valid FlurryMarketingOptions to initialize Flurry Marketing.");
        }
    }

    @Override // w1.L0
    public final void init(Context context) {
        try {
            Class.forName("com.google.firebase.messaging.RemoteMessage");
            FlurryMarketingOptions flurryMarketingOptions = this.f17751a;
            synchronized (AbstractC1715k1.class) {
                try {
                    AbstractC1715k1.f17760c = true;
                    if (!flurryMarketingOptions.isAutoIntegration()) {
                        flurryMarketingOptions.getToken();
                    }
                    AbstractC1715k1.f17758a = flurryMarketingOptions.getFlurryMessagingListener();
                    AbstractC1715k1.f17759b = flurryMarketingOptions.getFlurryMessagingHandler();
                    if (!TextUtils.isEmpty(flurryMarketingOptions.getNotificationChannelId())) {
                        AbstractC1715k1.f17761d = flurryMarketingOptions.getNotificationChannelId();
                    }
                    AbstractC1715k1.f17762e = flurryMarketingOptions.getDefaultNotificationIconResourceId();
                    AbstractC1715k1.f17763f = flurryMarketingOptions.getDefaultNotificationIconAccentColor();
                    AbstractC1739q1.e(flurryMarketingOptions.isAutoIntegration(), AbstractC1715k1.f17759b);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f17752b = new FlurryMarketingCoreModule(context);
            b.c("Flurry.PushEnabled", "true");
        } catch (ClassNotFoundException e7) {
            AbstractC1706i0.o(5, "Firebase messaging is not available: ".concat(String.valueOf(e7)));
        }
    }
}
