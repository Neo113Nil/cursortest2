package com.paypal.oslo.feature.cryptocurrency.ui.celsius;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e8\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%R \u0010(\u001a\b\u0012\u0004\u0012\u00020$0'8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/CryptoCelsiusClaimCodeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rollover/CreateCryptoRolloverUseCase;", "createCryptoRolloverUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;", "checkCryptoProvisioningUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rollover/DateOfBirthFormatter;", "dateOfBirthFormatter", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rollover/CreateCryptoRolloverUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rollover/DateOfBirthFormatter;)V", "Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEvent;", "event", "", "handleEvent", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEvent;)V", "getHighSpeedVideoFpsRanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rollover/CreateCryptoRolloverUseCase;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rollover/DateOfBirthFormatter;", "getHighSpeedVideoSizes", "", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect;", "Lkotlinx/coroutines/channels/Channel;", "getInputFormats", "Lkotlinx/coroutines/flow/Flow;", "effect", "Lkotlinx/coroutines/flow/Flow;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoCelsiusClaimCodeViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.CreateCryptoRolloverUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect> getInputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.DateOfBirthFormatter getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState> uiState;

    @javax.inject.Inject
    public CryptoCelsiusClaimCodeViewModel(com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.CreateCryptoRolloverUseCase createCryptoRolloverUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioningUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.DateOfBirthFormatter dateOfBirthFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCryptoRolloverUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCryptoProvisioningUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirthFormatter, "");
        this.getHighSpeedVideoFpsRangesFor = createCryptoRolloverUseCase;
        this.Camera2StreamConfigurationMap = checkCryptoProvisioningUseCase;
        this.getHighSpeedVideoSizes = dateOfBirthFormatter;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState(null, null, false, false, false, false, false, false, false, false, false, false, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL, null));
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.getInputFormats = Channel$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect> getEffect() {
        return this.effect;
    }

    public final void handleEvent(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent event) {
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState value;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState copy;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState value2;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState copy2;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState value3;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState copy3;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState value4;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState copy4;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState value5;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState copy5;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState value6;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState copy6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.ClaimCodeChanged) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
            do {
                value6 = mutableStateFlow.getValue();
                copy6 = r4.copy((r26 & 1) != 0 ? r4.claimCode : ((com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.ClaimCodeChanged) event).getClaimCode(), (r26 & 2) != 0 ? r4.dateOfBirth : null, (r26 & 4) != 0 ? r4.showClaimCodeCoachTip : false, (r26 & 8) != 0 ? r4.showDateOfBirthCoachTip : false, (r26 & 16) != 0 ? r4.isProcessing : false, (r26 & 32) != 0 ? r4.showVerifyBuy : false, (r26 & 64) != 0 ? r4.showVerifySell : false, (r26 & 128) != 0 ? r4.showVerifyCryptoPro : false, (r26 & 256) != 0 ? r4.hasClaimCodeError : false, (r26 & 512) != 0 ? r4.hasDateOfBirthError : false, (r26 & 1024) != 0 ? r4.hasCodeInvalidatedError : false, (r26 & 2048) != 0 ? value6.hasInternalDeclineError : false);
            } while (!mutableStateFlow.compareAndSet(value6, copy6));
            return;
        }
        if (event instanceof com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.DateOfBirthChanged) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState> mutableStateFlow2 = this.getHighSpeedVideoFpsRanges;
            do {
                value5 = mutableStateFlow2.getValue();
                copy5 = r4.copy((r26 & 1) != 0 ? r4.claimCode : null, (r26 & 2) != 0 ? r4.dateOfBirth : ((com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.DateOfBirthChanged) event).getDateOfBirth(), (r26 & 4) != 0 ? r4.showClaimCodeCoachTip : false, (r26 & 8) != 0 ? r4.showDateOfBirthCoachTip : false, (r26 & 16) != 0 ? r4.isProcessing : false, (r26 & 32) != 0 ? r4.showVerifyBuy : false, (r26 & 64) != 0 ? r4.showVerifySell : false, (r26 & 128) != 0 ? r4.showVerifyCryptoPro : false, (r26 & 256) != 0 ? r4.hasClaimCodeError : false, (r26 & 512) != 0 ? r4.hasDateOfBirthError : false, (r26 & 1024) != 0 ? r4.hasCodeInvalidatedError : false, (r26 & 2048) != 0 ? value5.hasInternalDeclineError : false);
            } while (!mutableStateFlow2.compareAndSet(value5, copy5));
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.SubmitClicked.INSTANCE)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.CancelClicked.INSTANCE)) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel$navigateBack$1(this, null), 3, null);
                return;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.DownloadFormClicked.INSTANCE)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.TermsClicked.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.DistributionTermsClicked.INSTANCE)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.ContactStrettoClicked.INSTANCE)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.ClaimCodeInfoClicked.INSTANCE)) {
                            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState> mutableStateFlow3 = this.getHighSpeedVideoFpsRanges;
                            do {
                                value2 = mutableStateFlow3.getValue();
                                copy2 = r4.copy((r26 & 1) != 0 ? r4.claimCode : null, (r26 & 2) != 0 ? r4.dateOfBirth : null, (r26 & 4) != 0 ? r4.showClaimCodeCoachTip : !r4.getShowClaimCodeCoachTip(), (r26 & 8) != 0 ? r4.showDateOfBirthCoachTip : false, (r26 & 16) != 0 ? r4.isProcessing : false, (r26 & 32) != 0 ? r4.showVerifyBuy : false, (r26 & 64) != 0 ? r4.showVerifySell : false, (r26 & 128) != 0 ? r4.showVerifyCryptoPro : false, (r26 & 256) != 0 ? r4.hasClaimCodeError : false, (r26 & 512) != 0 ? r4.hasDateOfBirthError : false, (r26 & 1024) != 0 ? r4.hasCodeInvalidatedError : false, (r26 & 2048) != 0 ? value2.hasInternalDeclineError : false);
                            } while (!mutableStateFlow3.compareAndSet(value2, copy2));
                            return;
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.DateOfBirthInfoClicked.INSTANCE)) {
                            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState> mutableStateFlow4 = this.getHighSpeedVideoFpsRanges;
                            do {
                                value = mutableStateFlow4.getValue();
                                copy = r4.copy((r26 & 1) != 0 ? r4.claimCode : null, (r26 & 2) != 0 ? r4.dateOfBirth : null, (r26 & 4) != 0 ? r4.showClaimCodeCoachTip : false, (r26 & 8) != 0 ? r4.showDateOfBirthCoachTip : !r4.getShowDateOfBirthCoachTip(), (r26 & 16) != 0 ? r4.isProcessing : false, (r26 & 32) != 0 ? r4.showVerifyBuy : false, (r26 & 64) != 0 ? r4.showVerifySell : false, (r26 & 128) != 0 ? r4.showVerifyCryptoPro : false, (r26 & 256) != 0 ? r4.hasClaimCodeError : false, (r26 & 512) != 0 ? r4.hasDateOfBirthError : false, (r26 & 1024) != 0 ? r4.hasCodeInvalidatedError : false, (r26 & 2048) != 0 ? value.hasInternalDeclineError : false);
                            } while (!mutableStateFlow4.compareAndSet(value, copy));
                            return;
                        }
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.VerifyBuyNextClicked.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.VerifySellNextClicked.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.VerifyCryptoProNextClicked.INSTANCE)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent.ProvisioningCompleted.INSTANCE)) {
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel$handleEvent$5(this, null), 3, null);
                                return;
                            }
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (str == null) {
                            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getInputFormats.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.NavigateToErrorScreen.INSTANCE));
                            return;
                        } else {
                            this.getInputFormats.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.ShowProvisioningFlow(str));
                            return;
                        }
                    }
                    this.getInputFormats.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.OpenUrl(com.paypal.oslo.feature.cryptocurrency.ui.celsius.CelsiusUrlConstants.STRETTO_CONTACT_URL));
                    return;
                }
                this.getInputFormats.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.OpenUrl(com.paypal.oslo.feature.cryptocurrency.ui.celsius.CelsiusUrlConstants.PAYPAL_CRYPTO_CELSIUS_TERMS_URL));
                return;
            }
            this.getInputFormats.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.OpenUrl(com.paypal.oslo.feature.cryptocurrency.ui.celsius.CelsiusUrlConstants.CELSIUS_LIMIT_INCREASE_FORM_URL));
            return;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState value7 = this.getHighSpeedVideoFpsRanges.getValue();
        boolean isBlank = kotlin.text.StringsKt.isBlank(value7.getClaimCode());
        boolean z = this.getHighSpeedVideoSizes.format(value7.getDateOfBirth()) == null;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState> mutableStateFlow5 = this.getHighSpeedVideoFpsRanges;
        do {
            value3 = mutableStateFlow5.getValue();
            copy3 = r5.copy((r26 & 1) != 0 ? r5.claimCode : null, (r26 & 2) != 0 ? r5.dateOfBirth : null, (r26 & 4) != 0 ? r5.showClaimCodeCoachTip : false, (r26 & 8) != 0 ? r5.showDateOfBirthCoachTip : false, (r26 & 16) != 0 ? r5.isProcessing : false, (r26 & 32) != 0 ? r5.showVerifyBuy : false, (r26 & 64) != 0 ? r5.showVerifySell : false, (r26 & 128) != 0 ? r5.showVerifyCryptoPro : false, (r26 & 256) != 0 ? r5.hasClaimCodeError : isBlank, (r26 & 512) != 0 ? r5.hasDateOfBirthError : z, (r26 & 1024) != 0 ? r5.hasCodeInvalidatedError : false, (r26 & 2048) != 0 ? value3.hasInternalDeclineError : false);
        } while (!mutableStateFlow5.compareAndSet(value3, copy3));
        if (isBlank || z) {
            return;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState> mutableStateFlow6 = this.getHighSpeedVideoFpsRanges;
        do {
            value4 = mutableStateFlow6.getValue();
            copy4 = r5.copy((r26 & 1) != 0 ? r5.claimCode : null, (r26 & 2) != 0 ? r5.dateOfBirth : null, (r26 & 4) != 0 ? r5.showClaimCodeCoachTip : false, (r26 & 8) != 0 ? r5.showDateOfBirthCoachTip : false, (r26 & 16) != 0 ? r5.isProcessing : true, (r26 & 32) != 0 ? r5.showVerifyBuy : false, (r26 & 64) != 0 ? r5.showVerifySell : false, (r26 & 128) != 0 ? r5.showVerifyCryptoPro : false, (r26 & 256) != 0 ? r5.hasClaimCodeError : false, (r26 & 512) != 0 ? r5.hasDateOfBirthError : false, (r26 & 1024) != 0 ? r5.hasCodeInvalidatedError : false, (r26 & 2048) != 0 ? value4.hasInternalDeclineError : false);
        } while (!mutableStateFlow6.compareAndSet(value4, copy4));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel$submitClaimCode$2(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1 cryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1;
        int i;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState> mutableStateFlow;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState value;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState copy;
        com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult provisioningCheckResult;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState value2;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState copy2;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState value3;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState copy3;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState value4;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState copy4;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1) {
            cryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1 = (com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1) continuation;
            if ((cryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                cryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = cryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioningUseCase = this.Camera2StreamConfigurationMap;
                    java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability[]{com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.BUY_CRYPTO, com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.SELL_CRYPTO, com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.REDEEM_CRYPTO});
                    cryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1.Camera2StreamConfigurationMap = 1;
                    obj = checkCryptoProvisioningUseCase.invoke(listOf, cryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.Map map = (java.util.Map) obj;
                mutableStateFlow = this.getHighSpeedVideoFpsRanges;
                do {
                    value = mutableStateFlow.getValue();
                    copy = r4.copy((r26 & 1) != 0 ? r4.claimCode : null, (r26 & 2) != 0 ? r4.dateOfBirth : null, (r26 & 4) != 0 ? r4.showClaimCodeCoachTip : false, (r26 & 8) != 0 ? r4.showDateOfBirthCoachTip : false, (r26 & 16) != 0 ? r4.isProcessing : false, (r26 & 32) != 0 ? r4.showVerifyBuy : false, (r26 & 64) != 0 ? r4.showVerifySell : false, (r26 & 128) != 0 ? r4.showVerifyCryptoPro : false, (r26 & 256) != 0 ? r4.hasClaimCodeError : false, (r26 & 512) != 0 ? r4.hasDateOfBirthError : false, (r26 & 1024) != 0 ? r4.hasCodeInvalidatedError : false, (r26 & 2048) != 0 ? value.hasInternalDeclineError : false);
                } while (!mutableStateFlow.compareAndSet(value, copy));
                provisioningCheckResult = (com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult) map.get(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.BUY_CRYPTO);
                com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult provisioningCheckResult2 = (com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult) map.get(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.SELL_CRYPTO);
                com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult provisioningCheckResult3 = (com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult) map.get(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.REDEEM_CRYPTO);
                if (!(provisioningCheckResult instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning)) {
                    this.getHighResolutionOutputSizeshNQ4ISI = ((com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning) provisioningCheckResult).getCapability().getIntent();
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState> mutableStateFlow2 = this.getHighSpeedVideoFpsRanges;
                    do {
                        value4 = mutableStateFlow2.getValue();
                        copy4 = r5.copy((r26 & 1) != 0 ? r5.claimCode : null, (r26 & 2) != 0 ? r5.dateOfBirth : null, (r26 & 4) != 0 ? r5.showClaimCodeCoachTip : false, (r26 & 8) != 0 ? r5.showDateOfBirthCoachTip : false, (r26 & 16) != 0 ? r5.isProcessing : false, (r26 & 32) != 0 ? r5.showVerifyBuy : true, (r26 & 64) != 0 ? r5.showVerifySell : false, (r26 & 128) != 0 ? r5.showVerifyCryptoPro : false, (r26 & 256) != 0 ? r5.hasClaimCodeError : false, (r26 & 512) != 0 ? r5.hasDateOfBirthError : false, (r26 & 1024) != 0 ? r5.hasCodeInvalidatedError : false, (r26 & 2048) != 0 ? value4.hasInternalDeclineError : false);
                    } while (!mutableStateFlow2.compareAndSet(value4, copy4));
                } else {
                    boolean z = provisioningCheckResult instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ProceedWithOperation;
                    if (z && (provisioningCheckResult2 instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning)) {
                        this.getHighResolutionOutputSizeshNQ4ISI = ((com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning) provisioningCheckResult2).getCapability().getIntent();
                        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState> mutableStateFlow3 = this.getHighSpeedVideoFpsRanges;
                        do {
                            value3 = mutableStateFlow3.getValue();
                            copy3 = r5.copy((r26 & 1) != 0 ? r5.claimCode : null, (r26 & 2) != 0 ? r5.dateOfBirth : null, (r26 & 4) != 0 ? r5.showClaimCodeCoachTip : false, (r26 & 8) != 0 ? r5.showDateOfBirthCoachTip : false, (r26 & 16) != 0 ? r5.isProcessing : false, (r26 & 32) != 0 ? r5.showVerifyBuy : false, (r26 & 64) != 0 ? r5.showVerifySell : true, (r26 & 128) != 0 ? r5.showVerifyCryptoPro : false, (r26 & 256) != 0 ? r5.hasClaimCodeError : false, (r26 & 512) != 0 ? r5.hasDateOfBirthError : false, (r26 & 1024) != 0 ? r5.hasCodeInvalidatedError : false, (r26 & 2048) != 0 ? value3.hasInternalDeclineError : false);
                        } while (!mutableStateFlow3.compareAndSet(value3, copy3));
                    } else if (z && (provisioningCheckResult2 instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ProceedWithOperation) && (provisioningCheckResult3 instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning)) {
                        this.getHighResolutionOutputSizeshNQ4ISI = ((com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning) provisioningCheckResult3).getCapability().getIntent();
                        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState> mutableStateFlow4 = this.getHighSpeedVideoFpsRanges;
                        do {
                            value2 = mutableStateFlow4.getValue();
                            copy2 = r5.copy((r26 & 1) != 0 ? r5.claimCode : null, (r26 & 2) != 0 ? r5.dateOfBirth : null, (r26 & 4) != 0 ? r5.showClaimCodeCoachTip : false, (r26 & 8) != 0 ? r5.showDateOfBirthCoachTip : false, (r26 & 16) != 0 ? r5.isProcessing : false, (r26 & 32) != 0 ? r5.showVerifyBuy : false, (r26 & 64) != 0 ? r5.showVerifySell : false, (r26 & 128) != 0 ? r5.showVerifyCryptoPro : true, (r26 & 256) != 0 ? r5.hasClaimCodeError : false, (r26 & 512) != 0 ? r5.hasDateOfBirthError : false, (r26 & 1024) != 0 ? r5.hasCodeInvalidatedError : false, (r26 & 2048) != 0 ? value2.hasInternalDeclineError : false);
                        } while (!mutableStateFlow4.compareAndSet(value2, copy2));
                    } else if (z && (provisioningCheckResult2 instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ProceedWithOperation) && (provisioningCheckResult3 instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ProceedWithOperation)) {
                        kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getInputFormats.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.NavigateToSuccessScreen.INSTANCE));
                    } else {
                        kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getInputFormats.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.NavigateToErrorScreen.INSTANCE));
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        cryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1 = new com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1(this, continuation);
        java.lang.Object obj2 = cryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        java.util.Map map2 = (java.util.Map) obj2;
        mutableStateFlow = this.getHighSpeedVideoFpsRanges;
        do {
            value = mutableStateFlow.getValue();
            copy = r4.copy((r26 & 1) != 0 ? r4.claimCode : null, (r26 & 2) != 0 ? r4.dateOfBirth : null, (r26 & 4) != 0 ? r4.showClaimCodeCoachTip : false, (r26 & 8) != 0 ? r4.showDateOfBirthCoachTip : false, (r26 & 16) != 0 ? r4.isProcessing : false, (r26 & 32) != 0 ? r4.showVerifyBuy : false, (r26 & 64) != 0 ? r4.showVerifySell : false, (r26 & 128) != 0 ? r4.showVerifyCryptoPro : false, (r26 & 256) != 0 ? r4.hasClaimCodeError : false, (r26 & 512) != 0 ? r4.hasDateOfBirthError : false, (r26 & 1024) != 0 ? r4.hasCodeInvalidatedError : false, (r26 & 2048) != 0 ? value.hasInternalDeclineError : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        provisioningCheckResult = (com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult) map2.get(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.BUY_CRYPTO);
        com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult provisioningCheckResult22 = (com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult) map2.get(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.SELL_CRYPTO);
        com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult provisioningCheckResult32 = (com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult) map2.get(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.REDEEM_CRYPTO);
        if (!(provisioningCheckResult instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$handleOnboardingCompleted(com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel cryptoCelsiusClaimCodeViewModel, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState value;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState> mutableStateFlow = cryptoCelsiusClaimCodeViewModel.getHighSpeedVideoFpsRanges;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r26 & 1) != 0 ? r3.claimCode : null, (r26 & 2) != 0 ? r3.dateOfBirth : null, (r26 & 4) != 0 ? r3.showClaimCodeCoachTip : false, (r26 & 8) != 0 ? r3.showDateOfBirthCoachTip : false, (r26 & 16) != 0 ? r3.isProcessing : true, (r26 & 32) != 0 ? r3.showVerifyBuy : false, (r26 & 64) != 0 ? r3.showVerifySell : false, (r26 & 128) != 0 ? r3.showVerifyCryptoPro : false, (r26 & 256) != 0 ? r3.hasClaimCodeError : false, (r26 & 512) != 0 ? r3.hasDateOfBirthError : false, (r26 & 1024) != 0 ? r3.hasCodeInvalidatedError : false, (r26 & 2048) != 0 ? value.hasInternalDeclineError : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        java.lang.Object highSpeedVideoFpsRanges = cryptoCelsiusClaimCodeViewModel.getHighSpeedVideoFpsRanges(continuation);
        return highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges : kotlin.Unit.INSTANCE;
    }
}
