package com.flurry.android.marketing;

import android.content.Context;
import android.text.TextUtils;
import com.flurry.android.marketing.core.FlurryMarketingCoreModule;
import p145u1.b;
import p145u1.i;
import p155w1.AbstractC0997i0;
import p155w1.AbstractC1002j1;
import p155w1.AbstractC1006k1;
import p155w1.AbstractC1030q1;

/* JADX INFO: loaded from: classes.dex */
public final class FlurryMarketingModule extends AbstractC1002j1 implements i {
    public static String VERSION_STRING = "!SDK-VERSION-STRING!:com.flurry.android:marketing:14.4.0";

    public FlurryMarketingModule(FlurryMarketingOptions flurryMarketingOptions) {
        this.f17757a = flurryMarketingOptions;
        if (flurryMarketingOptions == null) {
            throw new IllegalArgumentException("Must pass in valid FlurryMarketingOptions to initialize Flurry Marketing.");
        }
    }

    @Override // p155w1.L0
    public final void init(Context context) {
        try {
            Class.forName("com.google.firebase.messaging.RemoteMessage");
            FlurryMarketingOptions flurryMarketingOptions = this.f17757a;
            synchronized (AbstractC1006k1.class) {
                try {
                    AbstractC1006k1.f17766c = true;
                    if (!flurryMarketingOptions.isAutoIntegration()) {
                        flurryMarketingOptions.getToken();
                    }
                    AbstractC1006k1.f17764a = flurryMarketingOptions.getFlurryMessagingListener();
                    AbstractC1006k1.f17765b = flurryMarketingOptions.getFlurryMessagingHandler();
                    if (!TextUtils.isEmpty(flurryMarketingOptions.getNotificationChannelId())) {
                        AbstractC1006k1.f17767d = flurryMarketingOptions.getNotificationChannelId();
                    }
                    AbstractC1006k1.f17768e = flurryMarketingOptions.getDefaultNotificationIconResourceId();
                    AbstractC1006k1.f17769f = flurryMarketingOptions.getDefaultNotificationIconAccentColor();
                    AbstractC1030q1.e(flurryMarketingOptions.isAutoIntegration(), AbstractC1006k1.f17765b);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f17758b = new FlurryMarketingCoreModule(context);
            b.c("Flurry.PushEnabled", "true");
        } catch (ClassNotFoundException e7) {
            AbstractC0997i0.o(5, "Firebase messaging is not available: ".concat(String.valueOf(e7)));
        }
    }
}
