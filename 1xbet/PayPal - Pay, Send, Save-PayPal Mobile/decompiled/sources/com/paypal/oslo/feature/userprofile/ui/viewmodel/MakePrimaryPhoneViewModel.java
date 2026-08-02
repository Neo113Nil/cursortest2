package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/MakePrimaryPhoneViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/MakePrimaryPhoneUseCase;", "makePrimaryPhoneUseCase", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/usecase/MakePrimaryPhoneUseCase;)V", "", "phoneId", "", "makePrimaryPhone", "(Ljava/lang/String;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/MakePrimaryPhoneUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/StateFlow;", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "getHighSpeedVideoFpsRangesFor", "isSuccess", "getHighResolutionOutputSizeshNQ4ISI", "isError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MakePrimaryPhoneViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.userprofile.domain.usecase.MakePrimaryPhoneUseCase getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isError;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSuccess;

    @javax.inject.Inject
    public MakePrimaryPhoneViewModel(com.paypal.oslo.feature.userprofile.domain.usecase.MakePrimaryPhoneUseCase makePrimaryPhoneUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makePrimaryPhoneUseCase, "");
        this.getHighSpeedVideoSizes = makePrimaryPhoneUseCase;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.isLoading = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow2;
        this.isSuccess = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow3;
        this.isError = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return this.isLoading;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSuccess() {
        return this.isSuccess;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isError() {
        return this.isError;
    }

    public final void makePrimaryPhone(java.lang.String phoneId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneId, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryPhoneViewModel$makePrimaryPhone$1(this, phoneId, null), 3, null);
    }
}
