package com.paypal.oslo.feature.identity.otplogin.generateotp.ui;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010!\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/usecase/OtpGenerationUseCase;", "useCase", "<init>", "(Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/usecase/OtpGenerationUseCase;)V", "", "publicCredential", "nonce", "adsChallengeId", "", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/PhoneChallengeInfo;", "phoneNumbers", "", "generateOTP", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "phone", "selectPhone", "(Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/PhoneChallengeInfo;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/usecase/OtpGenerationUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/sync/Mutex;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OtpGenerationViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState> state;

    @javax.inject.Inject
    public OtpGenerationViewModel(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase otpGenerationUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpGenerationUseCase, "");
        this.getHighSpeedVideoSizes = otpGenerationUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Idle.INSTANCE);
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.state = MutableStateFlow;
        this.Camera2StreamConfigurationMap = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState> getState() {
        return this.state;
    }

    public final void selectPhone(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo phone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "");
        if (!kotlin.text.StringsKt.isBlank(phone.getChallengeId())) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel$selectPhone$1(this, phone, null), 3, null);
        } else {
            this.getHighSpeedVideoFpsRanges.setValue(new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Error(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.EmptyChallengeId.INSTANCE));
        }
    }

    public final void generateOTP(java.lang.String publicCredential, java.lang.String nonce, java.lang.String adsChallengeId, java.util.List<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo> phoneNumbers) {
        com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.NoPhones noPhones;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adsChallengeId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumbers, "");
        if (kotlin.text.StringsKt.isBlank(publicCredential)) {
            noPhones = com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.EmptyCredential.INSTANCE;
        } else if (kotlin.text.StringsKt.isBlank(nonce)) {
            noPhones = com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.EmptyNonce.INSTANCE;
        } else if (kotlin.text.StringsKt.isBlank(adsChallengeId)) {
            noPhones = com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.EmptyAdsChallengeId.INSTANCE;
        } else {
            noPhones = phoneNumbers.isEmpty() ? com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.NoPhones.INSTANCE : null;
        }
        if (noPhones != null) {
            this.getHighSpeedVideoFpsRanges.setValue(new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Error(noPhones));
        } else {
            this.getHighSpeedVideoFpsRanges.setValue(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Loading.INSTANCE);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel$generateOTP$1(this, publicCredential, nonce, adsChallengeId, phoneNumbers, null), 3, null);
        }
    }
}
