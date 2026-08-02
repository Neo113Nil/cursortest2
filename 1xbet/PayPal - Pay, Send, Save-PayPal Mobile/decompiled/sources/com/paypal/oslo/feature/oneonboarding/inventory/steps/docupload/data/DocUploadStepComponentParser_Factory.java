package com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.data;

/* loaded from: classes13.dex */
public final class DocUploadStepComponentParser_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.data.DocUploadStepComponentParser> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> getHighSpeedVideoFpsRangesFor;

    private DocUploadStepComponentParser_Factory(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.data.DocUploadStepComponentParser get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.data.DocUploadStepComponentParser_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry> provider) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.data.DocUploadStepComponentParser_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.data.DocUploadStepComponentParser newInstance(com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry viewComponentParserRegistry) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.data.DocUploadStepComponentParser(viewComponentParserRegistry);
    }
}
