package org.betup.services.analytics;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class FirebaseAnalyticsService_Factory implements Factory<FirebaseAnalyticsService> {
    private final Provider<Context> contextProvider;

    public FirebaseAnalyticsService_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public FirebaseAnalyticsService get() {
        return new FirebaseAnalyticsService(this.contextProvider.get());
    }

    public static FirebaseAnalyticsService_Factory create(Provider<Context> contextProvider) {
        return new FirebaseAnalyticsService_Factory(contextProvider);
    }
}
