package com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u001f\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00188\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\"\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020!0\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b\"\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/viewmodel/CardSharedViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetCardFormDataUseCase;", "getCardFormDataUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetFIMetadataUseCase;", "getFIMetadataUseCase", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetCardFormDataUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetFIMetadataUseCase;)V", "", "fiId", "", "loadCardFormData", "(Ljava/lang/String;)V", "loadFIMetadata", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetCardFormDataUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetFIMetadataUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/StateFlow;", "cardFormData", "Lkotlinx/coroutines/flow/StateFlow;", "getCardFormData", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;", "getHighSpeedVideoSizes", "fiMetadata", "getFiMetadata", "", "isCardFormDataLoading"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardSharedViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity> cardFormData;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity> fiMetadata;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.GetFIMetadataUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isCardFormDataLoading;

    @javax.inject.Inject
    public CardSharedViewModel(com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase getCardFormDataUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.GetFIMetadataUseCase getFIMetadataUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCardFormDataUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getFIMetadataUseCase, "");
        this.getHighSpeedVideoFpsRanges = getCardFormDataUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = getFIMetadataUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.cardFormData = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoSizes = MutableStateFlow2;
        this.fiMetadata = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow3;
        this.isCardFormDataLoading = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity> getCardFormData() {
        return this.cardFormData;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity> getFiMetadata() {
        return this.fiMetadata;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isCardFormDataLoading() {
        return this.isCardFormDataLoading;
    }

    public static /* synthetic */ void loadCardFormData$default(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        cardSharedViewModel.loadCardFormData(str);
    }

    public final void loadCardFormData(java.lang.String fiId) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel$loadCardFormData$1(this, fiId, null), 3, null);
    }

    public final void loadFIMetadata() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel$loadFIMetadata$1(this, null), 3, null);
    }
}
