package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

/* loaded from: classes11.dex */
public final class PersonalInfoUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoContentProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> getHighSpeedVideoSizes;

    private PersonalInfoUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoContentProvider> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoContentProvider> provider2) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper newInstance(com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper applicationFailureUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoContentProvider personalInfoContentProvider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper(applicationFailureUiMapper, personalInfoContentProvider);
    }
}
