package com.paypal.oslo.core.appidentity.di;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/appidentity/di/SessionProviderModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/appidentity/data/SessionManager;", "provideOsloSessionManager", "()Lcom/paypal/oslo/core/appidentity/data/SessionManager;", "provideVeniceSessionManager", "Lcom/paypal/oslo/core/appidentity/data/SessionEditor;", "sessionEditor", "Lcom/paypal/oslo/core/appidentity/data/SessionReader;", "sessionReader", "Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener;", "provideVeniceListener", "(Lcom/paypal/oslo/core/appidentity/data/SessionEditor;Lcom/paypal/oslo/core/appidentity/data/SessionReader;)Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener;", "provideOsloListener"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class SessionProviderModule {
    public static final com.paypal.oslo.core.appidentity.di.SessionProviderModule INSTANCE = new com.paypal.oslo.core.appidentity.di.SessionProviderModule();

    private SessionProviderModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.appidentity.data.SessionManager provideOsloSessionManager() {
        return new com.paypal.oslo.core.appidentity.data.SessionManager();
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.appidentity.data.SessionManager provideVeniceSessionManager() {
        return new com.paypal.oslo.core.appidentity.data.SessionManager();
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.appidentity.data.SessionLifecycleListener provideVeniceListener(com.paypal.oslo.core.appidentity.data.SessionEditor sessionEditor, com.paypal.oslo.core.appidentity.data.SessionReader sessionReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionEditor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionReader, "");
        return new com.paypal.oslo.core.appidentity.data.RotatingSessionLifecycleListener(com.paypal.android.taptopay.domain.repository.payment.PPDCFIRequestResponseModelsKt.EXPERIENCE_CHANNEL_VENICE, 300000L, sessionEditor, sessionReader);
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.appidentity.data.SessionLifecycleListener provideOsloListener(com.paypal.oslo.core.appidentity.data.SessionEditor sessionEditor, com.paypal.oslo.core.appidentity.data.SessionReader sessionReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionEditor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionReader, "");
        return new com.paypal.oslo.core.appidentity.data.RotatingSessionLifecycleListener("OSLO", 1800000L, sessionEditor, sessionReader);
    }
}
