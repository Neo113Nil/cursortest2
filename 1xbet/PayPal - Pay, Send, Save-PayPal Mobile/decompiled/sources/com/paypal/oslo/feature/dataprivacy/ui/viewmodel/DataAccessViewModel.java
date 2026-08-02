package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0010J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0010J\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0010J\r\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010(R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010,R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020+0-8\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010,R \u00104\u001a\b\u0012\u0004\u0012\u0002020-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00101R\u001a\u00107\u001a\u0002068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b7\u00109"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/GetExistingRequestsUseCase;", "getExistingRequestsUseCase", "Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/DownloadFileUseCase;", "downloadFileUseCase", "Lcom/paypal/oslo/feature/dataprivacy/domain/util/FileSaver;", "fileSaver", "Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "restConfig", "Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyDynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/GetExistingRequestsUseCase;Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/DownloadFileUseCase;Lcom/paypal/oslo/feature/dataprivacy/domain/util/FileSaver;Lcom/paypal/oslo/core/network/rest/config/RestConfig;Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyDynamicConfiguration;)V", "", "fetchExistingRequests", "()V", "", "fileId", "downloadFile", "(Ljava/lang/String;)V", "Landroid/net/Uri;", "uri", "saveToUri", "(Landroid/net/Uri;)V", "retry", "resetState", "resetDownloadState", "getSmcAsyncUrl", "()Ljava/lang/String;", "getInputFormats", "Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/GetExistingRequestsUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/DownloadFileUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/dataprivacy/domain/util/FileSaver;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyDynamicConfiguration;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState;", "getOutputMinFrameDuration", "downloadState", "getDownloadState", "", "isNativeDownloadEnabled", "Z", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DataAccessViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState> downloadState;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState> getOutputMinFrameDuration;
    private final com.paypal.oslo.feature.dataprivacy.domain.usecase.DownloadFileUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState> getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.dataprivacy.domain.util.FileSaver getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.rest.config.RestConfig getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.dataprivacy.domain.usecase.GetExistingRequestsUseCase Camera2StreamConfigurationMap;
    private final boolean isNativeDownloadEnabled;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState> state;

    @javax.inject.Inject
    public DataAccessViewModel(com.paypal.oslo.feature.dataprivacy.domain.usecase.GetExistingRequestsUseCase getExistingRequestsUseCase, com.paypal.oslo.feature.dataprivacy.domain.usecase.DownloadFileUseCase downloadFileUseCase, com.paypal.oslo.feature.dataprivacy.domain.util.FileSaver fileSaver, com.paypal.oslo.core.network.rest.config.RestConfig restConfig, com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration dataPrivacyDynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getExistingRequestsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadFileUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSaver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPrivacyDynamicConfiguration, "");
        this.Camera2StreamConfigurationMap = getExistingRequestsUseCase;
        this.getHighSpeedVideoFpsRanges = downloadFileUseCase;
        this.getHighSpeedVideoFpsRangesFor = fileSaver;
        this.getHighSpeedVideoSizes = restConfig;
        this.getHighResolutionOutputSizeshNQ4ISI = dataPrivacyDynamicConfiguration;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Initial.INSTANCE);
        this.getInputFormats = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Idle.INSTANCE);
        this.getOutputMinFrameDuration = MutableStateFlow2;
        this.downloadState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        boolean isNativeDownloadEnabled = dataPrivacyDynamicConfiguration.isNativeDownloadEnabled();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "Native download feature gate", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isNativeDownloadEnabled", java.lang.Boolean.valueOf(isNativeDownloadEnabled))), null, 4, null);
        this.isNativeDownloadEnabled = isNativeDownloadEnabled;
        fetchExistingRequests();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState> getDownloadState() {
        return this.downloadState;
    }

    /* renamed from: isNativeDownloadEnabled, reason: from getter */
    public final boolean getIsNativeDownloadEnabled() {
        return this.isNativeDownloadEnabled;
    }

    public final void fetchExistingRequests() {
        this.getInputFormats.setValue(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Loading.INSTANCE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessViewModel$fetchExistingRequests$1(this, null), 3, null);
    }

    public final void downloadFile(java.lang.String fileId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileId, "");
        this.getOutputMinFrameDuration.setValue(new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Downloading(fileId));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessViewModel$downloadFile$1(this, fileId, null), 3, null);
    }

    public final void saveToUri(android.net.Uri uri) {
        com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Error error;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState value = this.getOutputMinFrameDuration.getValue();
        if (value instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.ReadyToSave) {
            boolean writeToUri = this.getHighSpeedVideoFpsRangesFor.writeToUri(uri, ((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.ReadyToSave) value).getBytes());
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState> mutableStateFlow = this.getOutputMinFrameDuration;
            if (writeToUri) {
                error = com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Saved.INSTANCE;
            } else {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "File save failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("uri", uri.toString())), null, null, 12, null);
                error = new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Error(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.DataNotFound.INSTANCE);
            }
            mutableStateFlow.setValue(error);
        }
    }

    public final void retry() {
        fetchExistingRequests();
    }

    public final void resetState() {
        this.getInputFormats.setValue(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Initial.INSTANCE);
    }

    public final void resetDownloadState() {
        this.getOutputMinFrameDuration.setValue(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Idle.INSTANCE);
    }

    public final java.lang.String getSmcAsyncUrl() {
        if (kotlin.text.StringsKt.startsWith$default(this.getHighSpeedVideoSizes.getBaseUrl(), "https://api-m.paypal.com", false, 2, (java.lang.Object) null)) {
            return com.paypal.oslo.feature.dataprivacy.shared.constants.DataPrivacyConstants.SMC_ASYNC_URL_PROD;
        }
        return com.paypal.oslo.feature.dataprivacy.shared.constants.DataPrivacyConstants.SMC_ASYNC_URL_STAGE;
    }
}
