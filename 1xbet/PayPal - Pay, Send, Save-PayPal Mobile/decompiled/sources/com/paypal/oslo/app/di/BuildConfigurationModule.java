package com.paypal.oslo.app.di;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/app/di/BuildConfigurationModule;", "", "<init>", "()V", "", "provideApplicationBuildType", "()Ljava/lang/String;", "provideGoogleMapsApiKey", "provideDyScanApiKey", "provideGoogleWebClientId", "", "provideIsProductionFlavor", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class BuildConfigurationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.app.di.BuildConfigurationModule INSTANCE = new com.paypal.oslo.app.di.BuildConfigurationModule();

    @dagger.Provides
    public final boolean provideIsProductionFlavor() {
        return true;
    }

    private BuildConfigurationModule() {
    }

    @dagger.Provides
    public final java.lang.String provideApplicationBuildType() {
        return "release";
    }

    @dagger.Provides
    public final java.lang.String provideGoogleMapsApiKey() {
        return com.paypal.oslo.app.SecretsAccessor.INSTANCE.googleMapsApiKey();
    }

    @dagger.Provides
    public final java.lang.String provideDyScanApiKey() {
        return com.paypal.oslo.app.SecretsAccessor.INSTANCE.dyscanApiKey();
    }

    @dagger.Provides
    public final java.lang.String provideGoogleWebClientId() {
        return com.paypal.oslo.app.SecretsAccessor.INSTANCE.googleWebClientId();
    }
}
