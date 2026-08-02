package com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel;

/* loaded from: classes14.dex */
public final class FileUploadOptionsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsReducer> getHighSpeedVideoFpsRangesFor;

    private FileUploadOptionsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsReducer> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsReducer> provider) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel newInstance(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsReducer fileUploadOptionsReducer) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel(fileUploadOptionsReducer);
    }
}
