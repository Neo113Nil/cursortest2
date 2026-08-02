package com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui;

/* loaded from: classes13.dex */
public final class DocUploadViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> Camera2StreamConfigurationMap;

    private DocUploadViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewModel newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewModel(userStore);
    }
}
