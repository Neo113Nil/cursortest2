package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper;

/* loaded from: classes11.dex */
public final class PlanSectionMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider> getHighSpeedVideoFpsRanges;

    private PlanSectionMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider> provider2) {
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper newInstance(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters planSnapshotConverters, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider payLaterHubContentProvider) {
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper(planSnapshotConverters, payLaterHubContentProvider);
    }
}
