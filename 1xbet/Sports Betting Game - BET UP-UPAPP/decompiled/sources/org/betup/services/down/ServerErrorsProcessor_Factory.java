package org.betup.services.down;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.services.analytics.AnalyticsService;

/* loaded from: classes2.dex */
public final class ServerErrorsProcessor_Factory implements Factory<ServerErrorsProcessor> {
    private final Provider<AnalyticsService> analyticsServiceProvider;

    public ServerErrorsProcessor_Factory(Provider<AnalyticsService> analyticsServiceProvider) {
        this.analyticsServiceProvider = analyticsServiceProvider;
    }

    @Override // javax.inject.Provider
    public ServerErrorsProcessor get() {
        return new ServerErrorsProcessor(this.analyticsServiceProvider.get());
    }

    public static ServerErrorsProcessor_Factory create(Provider<AnalyticsService> analyticsServiceProvider) {
        return new ServerErrorsProcessor_Factory(analyticsServiceProvider);
    }
}
