package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001(B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b8\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020!0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/EditLineItemViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "lineItem", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;)V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate;", "update", "", "onFieldChange", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate;)V", "onDismissDiscardChangesDialog", "()V", "onBackClick", "", "validate", "()Z", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/EditLineItemUiState;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/EditLineItemUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/EditLineItemUiEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effects", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EditLineItemViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiEffect> effects;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiEffect> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/EditLineItemViewModel$Factory;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "lineItem", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/EditLineItemViewModel;", "create", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/EditLineItemViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem);
    }

    @dagger.assisted.AssistedInject
    public EditLineItemViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineItem, "");
        this.getHighSpeedVideoSizes = lineItem;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState access$toEditLineItemUiState = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModelKt.access$toEditLineItemUiState(lineItem);
        this.Camera2StreamConfigurationMap = access$toEditLineItemUiState;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(access$toEditLineItemUiState);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoFpsRangesFor = MutableSharedFlow$default;
        this.effects = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiEffect> getEffects() {
        return this.effects;
    }

    public final void onFieldChange(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate update) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(update, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        do {
            value = mutableStateFlow.getValue();
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState editLineItemUiState = value;
            if (!(update instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.Quantity)) {
                if (!(update instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.Description)) {
                    if (!(update instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountType)) {
                        if (!(update instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountAmount)) {
                            if (!(update instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountPercentage)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            copy = editLineItemUiState.copy((r32 & 1) != 0 ? editLineItemUiState.showDiscardChangesDialog : false, (r32 & 2) != 0 ? editLineItemUiState.catalogItemId : null, (r32 & 4) != 0 ? editLineItemUiState.itemName : null, (r32 & 8) != 0 ? editLineItemUiState.quantity : null, (r32 & 16) != 0 ? editLineItemUiState.price : null, (r32 & 32) != 0 ? editLineItemUiState.tax : null, (r32 & 64) != 0 ? editLineItemUiState.currencyCode : null, (r32 & 128) != 0 ? editLineItemUiState.description : null, (r32 & 256) != 0 ? editLineItemUiState.itemType : null, (r32 & 512) != 0 ? editLineItemUiState.discountType : null, (r32 & 1024) != 0 ? editLineItemUiState.discountAmount : null, (r32 & 2048) != 0 ? editLineItemUiState.discountPercentage : ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountPercentage) update).getValue(), (r32 & 4096) != 0 ? editLineItemUiState.quantityError : null, (r32 & 8192) != 0 ? editLineItemUiState.descriptionError : null, (r32 & 16384) != 0 ? editLineItemUiState.discountError : null);
                        } else {
                            copy = editLineItemUiState.copy((r32 & 1) != 0 ? editLineItemUiState.showDiscardChangesDialog : false, (r32 & 2) != 0 ? editLineItemUiState.catalogItemId : null, (r32 & 4) != 0 ? editLineItemUiState.itemName : null, (r32 & 8) != 0 ? editLineItemUiState.quantity : null, (r32 & 16) != 0 ? editLineItemUiState.price : null, (r32 & 32) != 0 ? editLineItemUiState.tax : null, (r32 & 64) != 0 ? editLineItemUiState.currencyCode : null, (r32 & 128) != 0 ? editLineItemUiState.description : null, (r32 & 256) != 0 ? editLineItemUiState.itemType : null, (r32 & 512) != 0 ? editLineItemUiState.discountType : null, (r32 & 1024) != 0 ? editLineItemUiState.discountAmount : ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountAmount) update).getValue(), (r32 & 2048) != 0 ? editLineItemUiState.discountPercentage : null, (r32 & 4096) != 0 ? editLineItemUiState.quantityError : null, (r32 & 8192) != 0 ? editLineItemUiState.descriptionError : null, (r32 & 16384) != 0 ? editLineItemUiState.discountError : null);
                        }
                    } else {
                        copy = editLineItemUiState.copy((r32 & 1) != 0 ? editLineItemUiState.showDiscardChangesDialog : false, (r32 & 2) != 0 ? editLineItemUiState.catalogItemId : null, (r32 & 4) != 0 ? editLineItemUiState.itemName : null, (r32 & 8) != 0 ? editLineItemUiState.quantity : null, (r32 & 16) != 0 ? editLineItemUiState.price : null, (r32 & 32) != 0 ? editLineItemUiState.tax : null, (r32 & 64) != 0 ? editLineItemUiState.currencyCode : null, (r32 & 128) != 0 ? editLineItemUiState.description : null, (r32 & 256) != 0 ? editLineItemUiState.itemType : null, (r32 & 512) != 0 ? editLineItemUiState.discountType : ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.DiscountType) update).getValue(), (r32 & 1024) != 0 ? editLineItemUiState.discountAmount : null, (r32 & 2048) != 0 ? editLineItemUiState.discountPercentage : null, (r32 & 4096) != 0 ? editLineItemUiState.quantityError : null, (r32 & 8192) != 0 ? editLineItemUiState.descriptionError : null, (r32 & 16384) != 0 ? editLineItemUiState.discountError : null);
                    }
                } else {
                    copy = editLineItemUiState.copy((r32 & 1) != 0 ? editLineItemUiState.showDiscardChangesDialog : false, (r32 & 2) != 0 ? editLineItemUiState.catalogItemId : null, (r32 & 4) != 0 ? editLineItemUiState.itemName : null, (r32 & 8) != 0 ? editLineItemUiState.quantity : null, (r32 & 16) != 0 ? editLineItemUiState.price : null, (r32 & 32) != 0 ? editLineItemUiState.tax : null, (r32 & 64) != 0 ? editLineItemUiState.currencyCode : null, (r32 & 128) != 0 ? editLineItemUiState.description : ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.Description) update).getValue(), (r32 & 256) != 0 ? editLineItemUiState.itemType : null, (r32 & 512) != 0 ? editLineItemUiState.discountType : null, (r32 & 1024) != 0 ? editLineItemUiState.discountAmount : null, (r32 & 2048) != 0 ? editLineItemUiState.discountPercentage : null, (r32 & 4096) != 0 ? editLineItemUiState.quantityError : null, (r32 & 8192) != 0 ? editLineItemUiState.descriptionError : null, (r32 & 16384) != 0 ? editLineItemUiState.discountError : null);
                }
            } else {
                copy = editLineItemUiState.copy((r32 & 1) != 0 ? editLineItemUiState.showDiscardChangesDialog : false, (r32 & 2) != 0 ? editLineItemUiState.catalogItemId : null, (r32 & 4) != 0 ? editLineItemUiState.itemName : null, (r32 & 8) != 0 ? editLineItemUiState.quantity : ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate.Quantity) update).getValue(), (r32 & 16) != 0 ? editLineItemUiState.price : null, (r32 & 32) != 0 ? editLineItemUiState.tax : null, (r32 & 64) != 0 ? editLineItemUiState.currencyCode : null, (r32 & 128) != 0 ? editLineItemUiState.description : null, (r32 & 256) != 0 ? editLineItemUiState.itemType : null, (r32 & 512) != 0 ? editLineItemUiState.discountType : null, (r32 & 1024) != 0 ? editLineItemUiState.discountAmount : null, (r32 & 2048) != 0 ? editLineItemUiState.discountPercentage : null, (r32 & 4096) != 0 ? editLineItemUiState.quantityError : null, (r32 & 8192) != 0 ? editLineItemUiState.descriptionError : null, (r32 & 16384) != 0 ? editLineItemUiState.discountError : null);
            }
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onDismissDiscardChangesDialog() {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r32 & 1) != 0 ? r3.showDiscardChangesDialog : false, (r32 & 2) != 0 ? r3.catalogItemId : null, (r32 & 4) != 0 ? r3.itemName : null, (r32 & 8) != 0 ? r3.quantity : null, (r32 & 16) != 0 ? r3.price : null, (r32 & 32) != 0 ? r3.tax : null, (r32 & 64) != 0 ? r3.currencyCode : null, (r32 & 128) != 0 ? r3.description : null, (r32 & 256) != 0 ? r3.itemType : null, (r32 & 512) != 0 ? r3.discountType : null, (r32 & 1024) != 0 ? r3.discountAmount : null, (r32 & 2048) != 0 ? r3.discountPercentage : null, (r32 & 4096) != 0 ? r3.quantityError : null, (r32 & 8192) != 0 ? r3.descriptionError : null, (r32 & 16384) != 0 ? value.discountError : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onBackClick() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel$onBackClick$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128 A[LOOP:0: B:53:0x00ef->B:55:0x0128, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f A[EDGE_INSN: B:56:0x011f->B:57:0x011f BREAK  A[LOOP:0: B:53:0x00ef->B:55:0x0128], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean validate() {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.QuantityError quantityError;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DescriptionError descriptionError;
        int i;
        boolean z;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState> mutableStateFlow;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState value;
        boolean z2;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState copy;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney asGetPaidMoney;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DescriptionError descriptionError2;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState value2 = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(value2.getQuantity());
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError discountError = null;
        if (bigDecimalOrNull == null || bigDecimalOrNull.compareTo(java.math.BigDecimal.ZERO) <= 0) {
            quantityError = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.QuantityError.Required;
        } else {
            quantityError = bigDecimalOrNull.compareTo(new java.math.BigDecimal(1000000)) > 0 ? com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.QuantityError.ExceedsMax : null;
        }
        java.lang.String description = value2.getDescription();
        if (description.length() != 0) {
            if (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.validation.ValidationUtilsKt.containsUrl(description)) {
                descriptionError2 = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DescriptionError.ContainsUrl;
            } else if (description.length() > 1000) {
                descriptionError2 = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DescriptionError.TooLong;
            }
            descriptionError = descriptionError2;
            i = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel.WhenMappings.$EnumSwitchMapping$0[value2.getDiscountType().ordinal()];
            z = true;
            if (i != 1) {
                if (i == 2) {
                    java.lang.String discountAmount = value2.getDiscountAmount();
                    if (kotlin.text.StringsKt.isBlank(discountAmount)) {
                        discountAmount = null;
                    }
                    if (discountAmount != null && (asGetPaidMoney = com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.asGetPaidMoney(discountAmount, value2.getCurrencyCode())) != null) {
                        if (asGetPaidMoney.getValue() <= 0) {
                            asGetPaidMoney = null;
                        }
                        if (asGetPaidMoney != null) {
                            java.lang.String price = value2.getPrice();
                            if (kotlin.text.StringsKt.isBlank(price)) {
                                price = null;
                            }
                            com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney asGetPaidMoney2 = price != null ? com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.asGetPaidMoney(price, value2.getCurrencyCode()) : null;
                            java.math.BigDecimal bigDecimalOrNull2 = kotlin.text.StringsKt.toBigDecimalOrNull(value2.getQuantity());
                            if (asGetPaidMoney2 != null && bigDecimalOrNull2 != null && asGetPaidMoney.compareTo(asGetPaidMoney2.times(bigDecimalOrNull2)) > 0) {
                                discountError = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError.ExceedsPrice;
                            }
                        }
                    }
                } else {
                    if (i != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    java.math.BigDecimal bigDecimalOrNull3 = kotlin.text.StringsKt.toBigDecimalOrNull(value2.getDiscountPercentage());
                    if (bigDecimalOrNull3 != null && bigDecimalOrNull3.compareTo(java.math.BigDecimal.ZERO) > 0 && bigDecimalOrNull3.compareTo(new java.math.BigDecimal(100)) > 0) {
                        discountError = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError.PercentageMax;
                    }
                }
            }
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
            while (true) {
                value = mutableStateFlow.getValue();
                z2 = z;
                copy = r4.copy((r32 & 1) != 0 ? r4.showDiscardChangesDialog : false, (r32 & 2) != 0 ? r4.catalogItemId : null, (r32 & 4) != 0 ? r4.itemName : null, (r32 & 8) != 0 ? r4.quantity : null, (r32 & 16) != 0 ? r4.price : null, (r32 & 32) != 0 ? r4.tax : null, (r32 & 64) != 0 ? r4.currencyCode : null, (r32 & 128) != 0 ? r4.description : null, (r32 & 256) != 0 ? r4.itemType : null, (r32 & 512) != 0 ? r4.discountType : null, (r32 & 1024) != 0 ? r4.discountAmount : null, (r32 & 2048) != 0 ? r4.discountPercentage : null, (r32 & 4096) != 0 ? r4.quantityError : quantityError, (r32 & 8192) != 0 ? r4.descriptionError : descriptionError, (r32 & 16384) != 0 ? value.discountError : discountError);
                if (!mutableStateFlow.compareAndSet(value, copy)) {
                    break;
                }
                z = z2;
            }
            if (quantityError != null && descriptionError == null && discountError == null) {
                return z2;
            }
            return false;
        }
        descriptionError = null;
        i = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel.WhenMappings.$EnumSwitchMapping$0[value2.getDiscountType().ordinal()];
        z = true;
        if (i != 1) {
        }
        mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        while (true) {
            value = mutableStateFlow.getValue();
            z2 = z;
            copy = r4.copy((r32 & 1) != 0 ? r4.showDiscardChangesDialog : false, (r32 & 2) != 0 ? r4.catalogItemId : null, (r32 & 4) != 0 ? r4.itemName : null, (r32 & 8) != 0 ? r4.quantity : null, (r32 & 16) != 0 ? r4.price : null, (r32 & 32) != 0 ? r4.tax : null, (r32 & 64) != 0 ? r4.currencyCode : null, (r32 & 128) != 0 ? r4.description : null, (r32 & 256) != 0 ? r4.itemType : null, (r32 & 512) != 0 ? r4.discountType : null, (r32 & 1024) != 0 ? r4.discountAmount : null, (r32 & 2048) != 0 ? r4.discountPercentage : null, (r32 & 4096) != 0 ? r4.quantityError : quantityError, (r32 & 8192) != 0 ? r4.descriptionError : descriptionError, (r32 & 16384) != 0 ? value.discountError : discountError);
            if (!mutableStateFlow.compareAndSet(value, copy)) {
            }
            z = z2;
        }
        return quantityError != null ? false : false;
    }

    public static final /* synthetic */ boolean access$hasChanges(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel editLineItemViewModel) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState copy;
        copy = r2.copy((r32 & 1) != 0 ? r2.showDiscardChangesDialog : false, (r32 & 2) != 0 ? r2.catalogItemId : null, (r32 & 4) != 0 ? r2.itemName : null, (r32 & 8) != 0 ? r2.quantity : null, (r32 & 16) != 0 ? r2.price : null, (r32 & 32) != 0 ? r2.tax : null, (r32 & 64) != 0 ? r2.currencyCode : null, (r32 & 128) != 0 ? r2.description : null, (r32 & 256) != 0 ? r2.itemType : null, (r32 & 512) != 0 ? r2.discountType : null, (r32 & 1024) != 0 ? r2.discountAmount : null, (r32 & 2048) != 0 ? r2.discountPercentage : null, (r32 & 4096) != 0 ? r2.quantityError : null, (r32 & 8192) != 0 ? r2.descriptionError : null, (r32 & 16384) != 0 ? editLineItemViewModel.getHighResolutionOutputSizeshNQ4ISI.getValue().discountError : null);
        return !kotlin.jvm.internal.Intrinsics.areEqual(copy, editLineItemViewModel.Camera2StreamConfigurationMap);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType.AMOUNT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType.PERCENTAGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
