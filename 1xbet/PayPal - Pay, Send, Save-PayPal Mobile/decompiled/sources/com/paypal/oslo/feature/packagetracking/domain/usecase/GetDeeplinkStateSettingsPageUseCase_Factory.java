package com.paypal.oslo.feature.packagetracking.domain.usecase;

/* loaded from: classes13.dex */
public final class GetDeeplinkStateSettingsPageUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.domain.usecase.GetDeeplinkStateSettingsPageUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.domain.usecase.GetDeeplinkStateSettingsPageUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.GetDeeplinkStateSettingsPageUseCase_Factory create() {
        return com.paypal.oslo.feature.packagetracking.domain.usecase.GetDeeplinkStateSettingsPageUseCase_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.GetDeeplinkStateSettingsPageUseCase newInstance() {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.GetDeeplinkStateSettingsPageUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.packagetracking.domain.usecase.GetDeeplinkStateSettingsPageUseCase_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.packagetracking.domain.usecase.GetDeeplinkStateSettingsPageUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
