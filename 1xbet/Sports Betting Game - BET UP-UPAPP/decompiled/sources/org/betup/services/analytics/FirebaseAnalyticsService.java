package org.betup.services.analytics;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes2.dex */
public class FirebaseAnalyticsService {
    private final Context context;

    @Inject
    public FirebaseAnalyticsService(Context context) {
        this.context = context;
    }

    public void trackEvent(String eventName, Bundle args) {
        FirebaseAnalytics.getInstance(this.context).logEvent(eventName, args);
    }
}
