package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001CBS\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b \u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010(R\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010&\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010,R\u0014\u0010#\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010*\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00105R\u001d\u00107\u001a\b\u0012\u0004\u0012\u000204068\u0007¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010=R \u0010?\u001a\b\u0012\u0004\u0012\u00020<0>8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryEditViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/GetBusinessInventoryItemsListUseCase;", "getBusinessInventoryItemsListUseCase", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/ItemLibraryEntityValidator;", "itemLibraryEntityValidator", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/AddItemUseCase;", "addItemUseCase", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveItemUseCase;", "saveItemUseCase", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/DeleteItemUseCase;", "deleteItemUseCase", "Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/GetBusinessInventoryTaxesUseCase;", "getTaxesUseCase", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SyncTaxOptionsUseCase;", "syncTaxesUseCase", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/GetCurrencyUseCase;", "getCurrencyUseCase", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FlowType;Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/GetBusinessInventoryItemsListUseCase;Lcom/paypal/oslo/feature/businessinventory/domain/validator/ItemLibraryEntityValidator;Lcom/paypal/oslo/feature/businessinventory/domain/usecase/AddItemUseCase;Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveItemUseCase;Lcom/paypal/oslo/feature/businessinventory/domain/usecase/DeleteItemUseCase;Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/GetBusinessInventoryTaxesUseCase;Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SyncTaxOptionsUseCase;Lcom/paypal/oslo/feature/businessinventory/domain/usecase/GetCurrencyUseCase;)V", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent;", "event", "Lkotlinx/coroutines/Job;", "handleEvent$business_inventory_prodRelease", "(Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent;)Lkotlinx/coroutines/Job;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FlowType;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/GetBusinessInventoryItemsListUseCase;", "Camera2StreamConfigurationMap", "getInputFormats", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/ItemLibraryEntityValidator;", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/AddItemUseCase;", "getHighSpeedVideoFpsRangesFor", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveItemUseCase;", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/DeleteItemUseCase;", "getOutputFormats", "Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/GetBusinessInventoryTaxesUseCase;", "getOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SyncTaxOptionsUseCase;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/GetCurrencyUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsUiEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "uiEffects", "Lkotlinx/coroutines/flow/SharedFlow;", "getUiEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessInventoryEditViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState> getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect> getOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteItemUseCase getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryItemsListUseCase Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.validator.ItemLibraryEntityValidator getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase getInputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryTaxesUseCase getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCase getOutputMinFrameDuration;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect> uiEffects;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryEditViewModel$Factory;", "", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryEditViewModel;", "create", "(Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FlowType;)Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryEditViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel create(com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType flowType);
    }

    @dagger.assisted.AssistedInject
    public BusinessInventoryEditViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType flowType, com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryItemsListUseCase getBusinessInventoryItemsListUseCase, com.paypal.oslo.feature.businessinventory.domain.validator.ItemLibraryEntityValidator itemLibraryEntityValidator, com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase addItemUseCase, com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase saveItemUseCase, com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteItemUseCase deleteItemUseCase, com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryTaxesUseCase getBusinessInventoryTaxesUseCase, com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCase syncTaxOptionsUseCase, com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase getCurrencyUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBusinessInventoryItemsListUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemLibraryEntityValidator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addItemUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saveItemUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteItemUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBusinessInventoryTaxesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncTaxOptionsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCurrencyUseCase, "");
        this.getHighSpeedVideoFpsRanges = flowType;
        this.Camera2StreamConfigurationMap = getBusinessInventoryItemsListUseCase;
        this.getHighSpeedVideoSizes = itemLibraryEntityValidator;
        this.getHighSpeedVideoFpsRangesFor = addItemUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = saveItemUseCase;
        this.getInputFormats = deleteItemUseCase;
        this.getHighSpeedVideoSizesFor = getBusinessInventoryTaxesUseCase;
        this.getOutputMinFrameDuration = syncTaxOptionsUseCase;
        this.getInputSizeshNQ4ISI = getCurrencyUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState.INSTANCE.m13038default(flowType));
        this.getOutputFormats = MutableStateFlow;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel = this;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(businessInventoryEditViewModel), null, null, new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.AnonymousClass1(null), 3, null);
        this.uiState = kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.onStart(MutableStateFlow, new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$uiState$1(this, null)), androidx.view.ViewModelKt.getViewModelScope(businessInventoryEditViewModel), kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 5000L, 0L, 2, null), com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState.INSTANCE.m13038default(flowType));
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getOutputSizeshNQ4ISI = MutableSharedFlow$default;
        this.uiEffects = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        if (r1 != r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$deleteItem(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel, com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$deleteItem$1 businessInventoryEditViewModel$deleteItem$1;
        int i;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState value;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState copy;
        com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem2;
        arrow.core.Either either;
        arrow.core.Either either2;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState value2;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState copy2;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$deleteItem$1) {
            businessInventoryEditViewModel$deleteItem$1 = (com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$deleteItem$1) continuation;
            if ((businessInventoryEditViewModel$deleteItem$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                businessInventoryEditViewModel$deleteItem$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = businessInventoryEditViewModel$deleteItem$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = businessInventoryEditViewModel$deleteItem$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState> mutableStateFlow = businessInventoryEditViewModel.getOutputFormats;
                    do {
                        value = mutableStateFlow.getValue();
                        copy = r7.copy((r18 & 1) != 0 ? r7.flowType : null, (r18 & 2) != 0 ? r7.taxOptions : null, (r18 & 4) != 0 ? r7.bannerError : null, (r18 & 8) != 0 ? r7.validationErrors : null, (r18 & 16) != 0 ? r7.loading : false, (r18 & 32) != 0 ? r7.saving : false, (r18 & 64) != 0 ? r7.deleting : true, (r18 & 128) != 0 ? value.currency : null);
                    } while (!mutableStateFlow.compareAndSet(value, copy));
                    com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteItemUseCase deleteItemUseCase = businessInventoryEditViewModel.getInputFormats;
                    businessInventoryEditViewModel$deleteItem$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(libraryItem);
                    businessInventoryEditViewModel$deleteItem$1.getHighSpeedVideoSizesFor = 1;
                    libraryItem2 = libraryItem;
                    obj = deleteItemUseCase.invoke(libraryItem2, businessInventoryEditViewModel$deleteItem$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = businessInventoryEditViewModel$deleteItem$1.getHighSpeedVideoSizes;
                        int i3 = businessInventoryEditViewModel$deleteItem$1.Camera2StreamConfigurationMap;
                        int i4 = businessInventoryEditViewModel$deleteItem$1.getHighResolutionOutputSizeshNQ4ISI;
                        either2 = (arrow.core.Either) businessInventoryEditViewModel$deleteItem$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        either = either2;
                        if (either.isLeft()) {
                            java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Either.Left) either).getValue();
                            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState> mutableStateFlow2 = businessInventoryEditViewModel.getOutputFormats;
                            do {
                                value2 = mutableStateFlow2.getValue();
                                copy2 = r3.copy((r18 & 1) != 0 ? r3.flowType : null, (r18 & 2) != 0 ? r3.taxOptions : null, (r18 & 4) != 0 ? r3.bannerError : com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteServiceException.INSTANCE, (r18 & 8) != 0 ? r3.validationErrors : null, (r18 & 16) != 0 ? r3.loading : false, (r18 & 32) != 0 ? r3.saving : false, (r18 & 64) != 0 ? r3.deleting : false, (r18 & 128) != 0 ? value2.currency : null);
                            } while (!mutableStateFlow2.compareAndSet(value2, copy2));
                            com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("BusinessInventoryEditViewModel failed to delete item", exc);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    libraryItem2 = (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) businessInventoryEditViewModel$deleteItem$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    kotlin.Unit unit = (kotlin.Unit) ((arrow.core.Either.Right) either).getValue();
                    kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect> mutableSharedFlow = businessInventoryEditViewModel.getOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBack navigateBack = com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBack.INSTANCE;
                    businessInventoryEditViewModel$deleteItem$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(libraryItem2);
                    businessInventoryEditViewModel$deleteItem$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    businessInventoryEditViewModel$deleteItem$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    businessInventoryEditViewModel$deleteItem$1.getOutputFormats = either;
                    businessInventoryEditViewModel$deleteItem$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    businessInventoryEditViewModel$deleteItem$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unit);
                    businessInventoryEditViewModel$deleteItem$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    businessInventoryEditViewModel$deleteItem$1.Camera2StreamConfigurationMap = 0;
                    businessInventoryEditViewModel$deleteItem$1.getHighSpeedVideoSizes = 0;
                    businessInventoryEditViewModel$deleteItem$1.getHighSpeedVideoSizesFor = 2;
                    if (mutableSharedFlow.emit(navigateBack, businessInventoryEditViewModel$deleteItem$1) != coroutine_suspended) {
                        either2 = either;
                        either = either2;
                    }
                    return coroutine_suspended;
                }
                if (either.isLeft()) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        businessInventoryEditViewModel$deleteItem$1 = new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$deleteItem$1(businessInventoryEditViewModel, continuation);
        java.lang.Object obj2 = businessInventoryEditViewModel$deleteItem$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = businessInventoryEditViewModel$deleteItem$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        if (either.isLeft()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01ac, code lost:
    
        if (r27.getHighResolutionOutputSizeshNQ4ISI(r5, r2) != r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0213, code lost:
    
        if (r27.getHighSpeedVideoFpsRanges(r6, r2) == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c8, code lost:
    
        if (r1 != r3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$validateAndSave(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel, com.paypal.oslo.feature.businessinventory.ui.edititem.FormData formData, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$validateAndSave$1 businessInventoryEditViewModel$validateAndSave$1;
        int i;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState value;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState copy;
        com.paypal.oslo.feature.businessinventory.ui.edititem.FormData formData2;
        com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType flowType;
        com.paypal.oslo.feature.businessinventory.domain.validator.UniquenessValidationSubject uniquenessValidationSubject;
        java.util.Set plus;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState value2;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState copy2;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$validateAndSave$1) {
            businessInventoryEditViewModel$validateAndSave$1 = (com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$validateAndSave$1) continuation;
            if ((businessInventoryEditViewModel$validateAndSave$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                businessInventoryEditViewModel$validateAndSave$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = businessInventoryEditViewModel$validateAndSave$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = businessInventoryEditViewModel$validateAndSave$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState> mutableStateFlow = businessInventoryEditViewModel.getOutputFormats;
                    do {
                        value = mutableStateFlow.getValue();
                        copy = r8.copy((r18 & 1) != 0 ? r8.flowType : null, (r18 & 2) != 0 ? r8.taxOptions : null, (r18 & 4) != 0 ? r8.bannerError : null, (r18 & 8) != 0 ? r8.validationErrors : kotlin.collections.SetsKt.emptySet(), (r18 & 16) != 0 ? r8.loading : false, (r18 & 32) != 0 ? r8.saving : true, (r18 & 64) != 0 ? r8.deleting : false, (r18 & 128) != 0 ? value.currency : null);
                    } while (!mutableStateFlow.compareAndSet(value, copy));
                    kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem>> invoke = businessInventoryEditViewModel.Camera2StreamConfigurationMap.invoke();
                    formData2 = formData;
                    businessInventoryEditViewModel$validateAndSave$1.getHighResolutionOutputSizeshNQ4ISI = formData2;
                    businessInventoryEditViewModel$validateAndSave$1.getOutputFormats = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.first(invoke, businessInventoryEditViewModel$validateAndSave$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    formData2 = (com.paypal.oslo.feature.businessinventory.ui.edititem.FormData) businessInventoryEditViewModel$validateAndSave$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem> list = (java.util.List) obj;
                flowType = businessInventoryEditViewModel.getHighSpeedVideoFpsRanges;
                if (flowType instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Create) {
                    if (!(flowType instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    uniquenessValidationSubject = new com.paypal.oslo.feature.businessinventory.domain.validator.UniquenessValidationSubject(((com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit) flowType).getLibraryItem().getId(), formData2.getName(), formData2.getPrice().getCurrencyCode());
                } else {
                    uniquenessValidationSubject = new com.paypal.oslo.feature.businessinventory.domain.validator.UniquenessValidationSubject(null, formData2.getName(), formData2.getPrice().getCurrencyCode());
                }
                java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError> validateUniqueness = businessInventoryEditViewModel.getHighSpeedVideoSizes.validateUniqueness(uniquenessValidationSubject, list);
                java.util.Set plus2 = kotlin.collections.SetsKt.plus((java.util.Set) businessInventoryEditViewModel.getHighSpeedVideoSizes.validateName(formData2.getName()), (java.lang.Iterable) validateUniqueness);
                java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.PriceError> validatePrice = businessInventoryEditViewModel.getHighSpeedVideoSizes.validatePrice(formData2.getPrice().getValue());
                java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError> validateDescription = businessInventoryEditViewModel.getHighSpeedVideoSizes.validateDescription(formData2.getDescription());
                plus = kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(plus2, (java.lang.Iterable) validatePrice), (java.lang.Iterable) validateDescription);
                if (!plus.isEmpty()) {
                    com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType flowType2 = businessInventoryEditViewModel.getHighSpeedVideoFpsRanges;
                    if (!(flowType2 instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Create)) {
                        if (!(flowType2 instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem copy$default = com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem.copy$default(((com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit) flowType2).getLibraryItem(), null, formData2.getName(), formData2.getPrice(), formData2.getTaxOption(), null, formData2.getDescription(), 17, null);
                        businessInventoryEditViewModel$validateAndSave$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formData2);
                        businessInventoryEditViewModel$validateAndSave$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                        businessInventoryEditViewModel$validateAndSave$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uniquenessValidationSubject);
                        businessInventoryEditViewModel$validateAndSave$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateUniqueness);
                        businessInventoryEditViewModel$validateAndSave$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plus2);
                        businessInventoryEditViewModel$validateAndSave$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validatePrice);
                        businessInventoryEditViewModel$validateAndSave$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateDescription);
                        businessInventoryEditViewModel$validateAndSave$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plus);
                        businessInventoryEditViewModel$validateAndSave$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(copy$default);
                        businessInventoryEditViewModel$validateAndSave$1.getOutputFormats = 3;
                    } else {
                        com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem = new com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem((java.lang.String) null, formData2.getName(), formData2.getPrice(), formData2.getTaxOption(), ((com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Create) flowType2).getItemType(), formData2.getDescription(), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                        businessInventoryEditViewModel$validateAndSave$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formData2);
                        businessInventoryEditViewModel$validateAndSave$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                        businessInventoryEditViewModel$validateAndSave$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uniquenessValidationSubject);
                        businessInventoryEditViewModel$validateAndSave$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateUniqueness);
                        businessInventoryEditViewModel$validateAndSave$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plus2);
                        businessInventoryEditViewModel$validateAndSave$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validatePrice);
                        businessInventoryEditViewModel$validateAndSave$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateDescription);
                        businessInventoryEditViewModel$validateAndSave$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plus);
                        businessInventoryEditViewModel$validateAndSave$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(libraryItem);
                        businessInventoryEditViewModel$validateAndSave$1.getOutputFormats = 2;
                    }
                    return coroutine_suspended;
                }
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState> mutableStateFlow2 = businessInventoryEditViewModel.getOutputFormats;
                do {
                    value2 = mutableStateFlow2.getValue();
                    copy2 = r16.copy((r18 & 1) != 0 ? r16.flowType : null, (r18 & 2) != 0 ? r16.taxOptions : null, (r18 & 4) != 0 ? r16.bannerError : plus.size() > 1 ? com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveItemValidationError.INSTANCE : null, (r18 & 8) != 0 ? r16.validationErrors : plus, (r18 & 16) != 0 ? r16.loading : false, (r18 & 32) != 0 ? r16.saving : false, (r18 & 64) != 0 ? r16.deleting : false, (r18 & 128) != 0 ? value2.currency : null);
                } while (!mutableStateFlow2.compareAndSet(value2, copy2));
                return kotlin.Unit.INSTANCE;
            }
        }
        businessInventoryEditViewModel$validateAndSave$1 = new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$validateAndSave$1(businessInventoryEditViewModel, continuation);
        java.lang.Object obj2 = businessInventoryEditViewModel$validateAndSave$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = businessInventoryEditViewModel$validateAndSave$1.getOutputFormats;
        if (i != 0) {
        }
        java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem> list2 = (java.util.List) obj2;
        flowType = businessInventoryEditViewModel.getHighSpeedVideoFpsRanges;
        if (flowType instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Create) {
        }
        java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.NameError> validateUniqueness2 = businessInventoryEditViewModel.getHighSpeedVideoSizes.validateUniqueness(uniquenessValidationSubject, list2);
        java.util.Set plus22 = kotlin.collections.SetsKt.plus((java.util.Set) businessInventoryEditViewModel.getHighSpeedVideoSizes.validateName(formData2.getName()), (java.lang.Iterable) validateUniqueness2);
        java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.PriceError> validatePrice2 = businessInventoryEditViewModel.getHighSpeedVideoSizes.validatePrice(formData2.getPrice().getValue());
        java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError.DescriptionError> validateDescription2 = businessInventoryEditViewModel.getHighSpeedVideoSizes.validateDescription(formData2.getDescription());
        plus = kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(plus22, (java.lang.Iterable) validatePrice2), (java.lang.Iterable) validateDescription2);
        if (!plus.isEmpty()) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$1", f = "BusinessInventoryEditViewModel.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, nl = {84}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption>> invoke = com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.this.getHighSpeedVideoSizesFor.invoke();
                final com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel = com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.this;
                this.Camera2StreamConfigurationMap = 1;
                if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.1.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object value;
                        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState copy;
                        java.util.List list = (java.util.List) obj2;
                        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.this.getOutputFormats;
                        do {
                            value = mutableStateFlow.getValue();
                            copy = r0.copy((r18 & 1) != 0 ? r0.flowType : null, (r18 & 2) != 0 ? r0.taxOptions : list, (r18 & 4) != 0 ? r0.bannerError : null, (r18 & 8) != 0 ? r0.validationErrors : null, (r18 & 16) != 0 ? r0.loading : false, (r18 & 32) != 0 ? r0.saving : false, (r18 & 64) != 0 ? r0.deleting : false, (r18 & 128) != 0 ? ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState) value).currency : null);
                        } while (!mutableStateFlow.compareAndSet(value, copy));
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect> getUiEffects() {
        return this.uiEffects;
    }

    public final kotlinx.coroutines.Job handleEvent$business_inventory_prodRelease(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent event) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$handleEvent$1(event, this, null), 3, null);
        return launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006a, code lost:
    
        if (r2 != r4) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$addItem$1 businessInventoryEditViewModel$addItem$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem2;
        arrow.core.Either either2;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState value;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveProductException saveProductException;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState copy;
        com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem3 = libraryItem;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$addItem$1) {
            businessInventoryEditViewModel$addItem$1 = (com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$addItem$1) continuation;
            if ((businessInventoryEditViewModel$addItem$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                businessInventoryEditViewModel$addItem$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = businessInventoryEditViewModel$addItem$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = businessInventoryEditViewModel$addItem$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase addItemUseCase = this.getHighSpeedVideoFpsRangesFor;
                    businessInventoryEditViewModel$addItem$1.getHighSpeedVideoFpsRangesFor = libraryItem3;
                    businessInventoryEditViewModel$addItem$1.getOutputMinFrameDuration = 1;
                    obj = addItemUseCase.invoke(libraryItem3, businessInventoryEditViewModel$addItem$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = businessInventoryEditViewModel$addItem$1.getHighSpeedVideoFpsRanges;
                        int i3 = businessInventoryEditViewModel$addItem$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i4 = businessInventoryEditViewModel$addItem$1.Camera2StreamConfigurationMap;
                        either2 = (arrow.core.Either) businessInventoryEditViewModel$addItem$1.getOutputFormats;
                        libraryItem2 = (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) businessInventoryEditViewModel$addItem$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        either = either2;
                        libraryItem3 = libraryItem2;
                        if (either.isLeft()) {
                            java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Either.Left) either).getValue();
                            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState> mutableStateFlow = this.getOutputFormats;
                            do {
                                value = mutableStateFlow.getValue();
                                com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState businessInventoryItemsEditState = value;
                                int i5 = com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.WhenMappings.$EnumSwitchMapping$0[libraryItem3.getType().ordinal()];
                                if (i5 == 1) {
                                    saveProductException = com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveProductException.INSTANCE;
                                } else {
                                    if (i5 != 2) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    saveProductException = com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveServiceException.INSTANCE;
                                }
                                copy = businessInventoryItemsEditState.copy((r18 & 1) != 0 ? businessInventoryItemsEditState.flowType : null, (r18 & 2) != 0 ? businessInventoryItemsEditState.taxOptions : null, (r18 & 4) != 0 ? businessInventoryItemsEditState.bannerError : saveProductException, (r18 & 8) != 0 ? businessInventoryItemsEditState.validationErrors : null, (r18 & 16) != 0 ? businessInventoryItemsEditState.loading : false, (r18 & 32) != 0 ? businessInventoryItemsEditState.saving : false, (r18 & 64) != 0 ? businessInventoryItemsEditState.deleting : false, (r18 & 128) != 0 ? businessInventoryItemsEditState.currency : null);
                            } while (!mutableStateFlow.compareAndSet(value, copy));
                            com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("BusinessInventoryEditViewModel failed to create item", exc);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    libraryItem3 = (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) businessInventoryEditViewModel$addItem$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem4 = (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) ((arrow.core.Either.Right) either).getValue();
                    kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect> mutableSharedFlow = this.getOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBackWithResult navigateBackWithResult = new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBackWithResult(libraryItem4);
                    businessInventoryEditViewModel$addItem$1.getHighSpeedVideoFpsRangesFor = libraryItem3;
                    businessInventoryEditViewModel$addItem$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    businessInventoryEditViewModel$addItem$1.getOutputFormats = either;
                    businessInventoryEditViewModel$addItem$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    businessInventoryEditViewModel$addItem$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(libraryItem4);
                    businessInventoryEditViewModel$addItem$1.Camera2StreamConfigurationMap = 0;
                    businessInventoryEditViewModel$addItem$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    businessInventoryEditViewModel$addItem$1.getHighSpeedVideoFpsRanges = 0;
                    businessInventoryEditViewModel$addItem$1.getOutputMinFrameDuration = 2;
                    if (mutableSharedFlow.emit(navigateBackWithResult, businessInventoryEditViewModel$addItem$1) != coroutine_suspended) {
                        libraryItem2 = libraryItem3;
                        either2 = either;
                        either = either2;
                        libraryItem3 = libraryItem2;
                    }
                    return coroutine_suspended;
                }
                if (either.isLeft()) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        businessInventoryEditViewModel$addItem$1 = new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$addItem$1(this, continuation);
        java.lang.Object obj2 = businessInventoryEditViewModel$addItem$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = businessInventoryEditViewModel$addItem$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        if (either.isLeft()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006e, code lost:
    
        if (r2 != r4) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$saveItem$1 businessInventoryEditViewModel$saveItem$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem2;
        arrow.core.Either either2;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState value;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveProductException saveProductException;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState copy;
        com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem3 = libraryItem;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$saveItem$1) {
            businessInventoryEditViewModel$saveItem$1 = (com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$saveItem$1) continuation;
            if ((businessInventoryEditViewModel$saveItem$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                businessInventoryEditViewModel$saveItem$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = businessInventoryEditViewModel$saveItem$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = businessInventoryEditViewModel$saveItem$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase saveItemUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    businessInventoryEditViewModel$saveItem$1.getHighSpeedVideoSizes = libraryItem3;
                    businessInventoryEditViewModel$saveItem$1.getOutputFormats = 1;
                    obj = saveItemUseCase.invoke(libraryItem3, businessInventoryEditViewModel$saveItem$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = businessInventoryEditViewModel$saveItem$1.Camera2StreamConfigurationMap;
                        int i3 = businessInventoryEditViewModel$saveItem$1.getHighSpeedVideoFpsRangesFor;
                        int i4 = businessInventoryEditViewModel$saveItem$1.getHighSpeedVideoFpsRanges;
                        either2 = (arrow.core.Either) businessInventoryEditViewModel$saveItem$1.getHighSpeedVideoSizesFor;
                        libraryItem2 = (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) businessInventoryEditViewModel$saveItem$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        either = either2;
                        libraryItem3 = libraryItem2;
                        if (either.isLeft()) {
                            java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Either.Left) either).getValue();
                            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState> mutableStateFlow = this.getOutputFormats;
                            do {
                                value = mutableStateFlow.getValue();
                                com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState businessInventoryItemsEditState = value;
                                int i5 = com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.WhenMappings.$EnumSwitchMapping$0[libraryItem3.getType().ordinal()];
                                if (i5 == 1) {
                                    saveProductException = com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveProductException.INSTANCE;
                                } else {
                                    if (i5 != 2) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    saveProductException = com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveServiceException.INSTANCE;
                                }
                                copy = businessInventoryItemsEditState.copy((r18 & 1) != 0 ? businessInventoryItemsEditState.flowType : null, (r18 & 2) != 0 ? businessInventoryItemsEditState.taxOptions : null, (r18 & 4) != 0 ? businessInventoryItemsEditState.bannerError : saveProductException, (r18 & 8) != 0 ? businessInventoryItemsEditState.validationErrors : null, (r18 & 16) != 0 ? businessInventoryItemsEditState.loading : false, (r18 & 32) != 0 ? businessInventoryItemsEditState.saving : false, (r18 & 64) != 0 ? businessInventoryItemsEditState.deleting : false, (r18 & 128) != 0 ? businessInventoryItemsEditState.currency : null);
                            } while (!mutableStateFlow.compareAndSet(value, copy));
                            com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("BusinessInventoryEditViewModel failed to update item", exc);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    libraryItem3 = (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) businessInventoryEditViewModel$saveItem$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    kotlin.Unit unit = (kotlin.Unit) ((arrow.core.Either.Right) either).getValue();
                    kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect> mutableSharedFlow = this.getOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBack navigateBack = com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBack.INSTANCE;
                    businessInventoryEditViewModel$saveItem$1.getHighSpeedVideoSizes = libraryItem3;
                    businessInventoryEditViewModel$saveItem$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    businessInventoryEditViewModel$saveItem$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    businessInventoryEditViewModel$saveItem$1.getHighSpeedVideoSizesFor = either;
                    businessInventoryEditViewModel$saveItem$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    businessInventoryEditViewModel$saveItem$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unit);
                    businessInventoryEditViewModel$saveItem$1.getHighSpeedVideoFpsRanges = 0;
                    businessInventoryEditViewModel$saveItem$1.getHighSpeedVideoFpsRangesFor = 0;
                    businessInventoryEditViewModel$saveItem$1.Camera2StreamConfigurationMap = 0;
                    businessInventoryEditViewModel$saveItem$1.getOutputFormats = 2;
                    if (mutableSharedFlow.emit(navigateBack, businessInventoryEditViewModel$saveItem$1) != coroutine_suspended) {
                        libraryItem2 = libraryItem3;
                        either2 = either;
                        either = either2;
                        libraryItem3 = libraryItem2;
                    }
                    return coroutine_suspended;
                }
                if (either.isLeft()) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        businessInventoryEditViewModel$saveItem$1 = new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$saveItem$1(this, continuation);
        java.lang.Object obj2 = businessInventoryEditViewModel$saveItem$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = businessInventoryEditViewModel$saveItem$1.getOutputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        if (either.isLeft()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.values().length];
            try {
                iArr[com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.PRODUCT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.SERVICE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
