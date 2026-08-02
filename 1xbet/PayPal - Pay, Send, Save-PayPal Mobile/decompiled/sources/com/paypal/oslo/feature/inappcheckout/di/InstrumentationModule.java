package com.paypal.oslo.feature.inappcheckout.di;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/di/InstrumentationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "session", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLoggerHelper;", "provideInAppCheckoutLoggerHelper", "(Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;)Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLoggerHelper;", "loggerHelper", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "provideInAppCheckoutLogger", "(Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLoggerHelper;)Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "Landroidx/lifecycle/Lifecycle;", "provideProcessLifecycle", "()Landroidx/lifecycle/Lifecycle;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "provideInAppCheckoutAnalyticsTracer", "(Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;)Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class InstrumentationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.di.InstrumentationModule INSTANCE = new com.paypal.oslo.feature.inappcheckout.di.InstrumentationModule();

    private InstrumentationModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper provideInAppCheckoutLoggerHelper(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession session) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        return new com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper(session);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger provideInAppCheckoutLogger(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession session, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper loggerHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerHelper, "");
        return new com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerImpl(session, loggerHelper, com.paypal.oslo.feature.inappcheckout.LoggerKt.log, com.paypal.oslo.feature.inappcheckout.AnalyticsTrackerKt.analyticsTracker);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final androidx.view.Lifecycle provideProcessLifecycle() {
        return androidx.view.ProcessLifecycleOwner.INSTANCE.get().getLifecycle();
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer provideInAppCheckoutAnalyticsTracer(com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        return new com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracerImpl(logger);
    }
}
