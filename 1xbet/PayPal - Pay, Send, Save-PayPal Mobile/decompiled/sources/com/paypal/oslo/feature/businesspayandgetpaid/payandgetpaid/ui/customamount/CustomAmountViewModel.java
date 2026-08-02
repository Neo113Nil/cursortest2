package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002=>B\u001d\b\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0,8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u0010)\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u00102R\u0016\u00101\u001a\u0004\u0018\u00010\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u00104R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00107R \u00109\u001a\b\u0012\u0004\u0012\u000206088\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/customamount/CustomAmountViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "itemToEdit", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;Lcom/paypal/oslo/core/userstore/UserStore;)V", "", "name", "", "onNameChange", "(Ljava/lang/String;)V", "amount", "onAmountChange", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Tax;", "tax", "onTaxSelected", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Tax;)V", "amountRequiredMessage", "nameNoLinksMessage", "nameTooLongMessage", "amountMustBePositiveMessage", "amountExceedsMaxMessage", "", "validateForm", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "defaultName", "createLineItem", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "onBackClick", "()V", "onDismissDiscardDialog", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "getItemToEdit", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/userstore/UserStore;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/customamount/CustomAmountUiEffect;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/SharedFlow;", "uiEffects", "Lkotlinx/coroutines/flow/SharedFlow;", "getUiEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Tax;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/customamount/CustomAmountViewModel$UiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Factory", "UiState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomAmountViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountUiEffect> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem itemToEdit;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountUiEffect> uiEffects;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/customamount/CustomAmountViewModel$Factory;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "itemToEdit", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/customamount/CustomAmountViewModel;", "create", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/customamount/CustomAmountViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem itemToEdit);
    }

    @dagger.assisted.AssistedInject
    public CustomAmountViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem, com.paypal.oslo.core.userstore.UserStore userStore) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney unitPrice;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.itemToEdit = lineItem;
        this.Camera2StreamConfigurationMap = userStore;
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountUiEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoFpsRanges = MutableSharedFlow$default;
        this.uiEffects = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        java.lang.String name2 = lineItem != null ? lineItem.getName() : null;
        java.lang.String str = name2 == null ? "" : name2;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        java.lang.String valueOf = (lineItem == null || (unitPrice = lineItem.getUnitPrice()) == null) ? null : java.lang.String.valueOf(unitPrice.getValue());
        java.lang.String str2 = valueOf == null ? "" : valueOf;
        this.getHighSpeedVideoFpsRangesFor = str2;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax tax = lineItem != null ? lineItem.getTax() : null;
        this.getHighSpeedVideoSizes = tax;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState(null, str, str2, tax, null, null, lineItem != null, false, false, 433, null));
        this.getHighSpeedVideoSizesFor = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.AnonymousClass1(null), 3, null);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem getItemToEdit() {
        return this.itemToEdit;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountUiEffect> getUiEffects() {
        return this.uiEffects;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState> getUiState() {
        return this.uiState;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel$1", f = "CustomAmountViewModel.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, nl = {73}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object value;
            java.lang.Object value2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                obj = kotlinx.coroutines.flow.FlowKt.first(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.this.Camera2StreamConfigurationMap.getUserState(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
            if (!(userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded)) {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.this.getHighSpeedVideoSizesFor;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState.copy$default((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) value2, null, null, null, null, null, null, false, false, true, 255, null)));
                return kotlin.Unit.INSTANCE;
            }
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2 = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.this.getHighSpeedVideoSizesFor;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState.copy$default((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) value, ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser().getAccountCurrencyCode(), null, null, null, null, null, false, false, false, 510, null)));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final void onNameChange(java.lang.String name2) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState> mutableStateFlow = this.getHighSpeedVideoSizesFor;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState.copy$default(value, null, name2, null, null, "", null, false, false, false, 493, null)));
    }

    public final void onAmountChange(java.lang.String amount) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState> mutableStateFlow = this.getHighSpeedVideoSizesFor;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState.copy$default(value, null, null, amount, null, null, "", false, false, false, 475, null)));
    }

    public final void onTaxSelected(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax tax) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState value;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState> mutableStateFlow = this.getHighSpeedVideoSizesFor;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState.copy$default(value, null, null, null, tax, null, null, false, false, false, 503, null)));
    }

    public final boolean validateForm(java.lang.String amountRequiredMessage, java.lang.String nameNoLinksMessage, java.lang.String nameTooLongMessage, java.lang.String amountMustBePositiveMessage, java.lang.String amountExceedsMaxMessage) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState value;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountRequiredMessage, "");
        java.lang.String str2 = nameNoLinksMessage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameTooLongMessage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountMustBePositiveMessage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountExceedsMaxMessage, "");
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState value2 = this.getHighSpeedVideoSizesFor.getValue();
        if (value2.getName().length() > 80) {
            str2 = nameTooLongMessage;
        } else if (!com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.validation.ValidationUtilsKt.containsUrl(value2.getName())) {
            str2 = "";
        }
        if (kotlin.text.StringsKt.isBlank(value2.getAmount())) {
            str = amountRequiredMessage;
        } else {
            java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(value2.getAmount());
            if (bigDecimalOrNull == null || bigDecimalOrNull.compareTo(java.math.BigDecimal.ZERO) <= 0) {
                str = amountMustBePositiveMessage;
            } else {
                java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(value2.getAmount());
                if (longOrNull != null) {
                    long longValue = longOrNull.longValue();
                    java.lang.String currencyCode = this.getHighSpeedVideoSizesFor.getValue().getCurrencyCode();
                    if (currencyCode != null && longValue > new com.paypal.oslo.core.money.Money(0L, currencyCode).getScale() * 1000000) {
                        str = amountExceedsMaxMessage;
                    }
                }
            }
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState> mutableStateFlow = this.getHighSpeedVideoSizesFor;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState.copy$default(value, null, null, null, null, str2, str, false, false, false, 463, null)));
        return kotlin.text.StringsKt.isBlank(str2) && kotlin.text.StringsKt.isBlank(str);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem createLineItem(java.lang.String defaultName) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultName, "");
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState value = this.uiState.getValue();
        java.lang.String currencyCode = value.getCurrencyCode();
        if (kotlin.text.StringsKt.isBlank(value.getAmount()) || currencyCode == null) {
            return null;
        }
        java.lang.String name2 = value.getName();
        if (!kotlin.text.StringsKt.isBlank(name2)) {
            defaultName = name2;
        }
        java.lang.String str = defaultName;
        if (value.isEditMode()) {
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem = this.itemToEdit;
            kotlin.jvm.internal.Intrinsics.checkNotNull(lineItem);
            com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney asGetPaidMoney = com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.asGetPaidMoney(value.getAmount(), currencyCode);
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax selectedTax = value.getSelectedTax();
            java.math.BigDecimal bigDecimal = java.math.BigDecimal.ONE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            copy = lineItem.copy((r18 & 1) != 0 ? lineItem.catalogItemId : null, (r18 & 2) != 0 ? lineItem.name : str, (r18 & 4) != 0 ? lineItem.unitPrice : asGetPaidMoney, (r18 & 8) != 0 ? lineItem.quantity : bigDecimal, (r18 & 16) != 0 ? lineItem.type : com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType.CUSTOM_AMOUNT, (r18 & 32) != 0 ? lineItem.description : null, (r18 & 64) != 0 ? lineItem.discount : null, (r18 & 128) != 0 ? lineItem.tax : selectedTax);
            return copy;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney asGetPaidMoney2 = com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.asGetPaidMoney(value.getAmount(), currencyCode);
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax selectedTax2 = value.getSelectedTax();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimal2, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem((java.lang.String) null, str, asGetPaidMoney2, bigDecimal2, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType.CUSTOM_AMOUNT, (java.lang.String) null, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount) null, selectedTax2, 97, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final void onDismissDiscardDialog() {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState value;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState> mutableStateFlow = this.getHighSpeedVideoSizesFor;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState.copy$default(value, null, null, null, null, null, null, false, false, false, 383, null)));
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019Jn\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b+\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b,\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b\u000b\u0010\u0019R\u001a\u0010\f\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u0019R\u001a\u0010\r\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b/\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/customamount/CustomAmountViewModel$UiState;", "", "", "currencyCode", "name", "amount", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Tax;", "selectedTax", "nameError", "amountError", "", "isEditMode", "showDiscardChangesDialog", "showError", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Tax;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Tax;", "component5", "component6", "component7", "()Z", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Tax;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/customamount/CustomAmountViewModel$UiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCurrencyCode", "getName", "getAmount", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Tax;", "getSelectedTax", "getNameError", "getAmountError", "Z", "getShowDiscardChangesDialog", "getShowError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UiState {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final java.lang.String amountError;
        private final java.lang.String currencyCode;
        private final boolean isEditMode;
        private final java.lang.String name;
        private final java.lang.String nameError;
        private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax selectedTax;
        private final boolean showDiscardChangesDialog;
        private final boolean showError;

        public UiState(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax tax, java.lang.String str4, java.lang.String str5, boolean z, boolean z2, boolean z3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            this.currencyCode = str;
            this.name = str2;
            this.amount = str3;
            this.selectedTax = tax;
            this.nameError = str4;
            this.amountError = str5;
            this.isEditMode = z;
            this.showDiscardChangesDialog = z2;
            this.showError = z3;
        }

        public /* synthetic */ UiState(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax tax, java.lang.String str4, java.lang.String str5, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? tax : null, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) == 0 ? z3 : false);
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax getSelectedTax() {
            return this.selectedTax;
        }

        public final java.lang.String getNameError() {
            return this.nameError;
        }

        public final java.lang.String getAmountError() {
            return this.amountError;
        }

        public final boolean isEditMode() {
            return this.isEditMode;
        }

        public final boolean getShowDiscardChangesDialog() {
            return this.showDiscardChangesDialog;
        }

        public final boolean getShowError() {
            return this.showError;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.currencyCode;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.amount;
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax tax = this.selectedTax;
            java.lang.String str4 = this.nameError;
            java.lang.String str5 = this.amountError;
            boolean z = this.isEditMode;
            boolean z2 = this.showDiscardChangesDialog;
            boolean z3 = this.showError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UiState(currencyCode=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", amount=");
            sb.append(str3);
            sb.append(", selectedTax=");
            sb.append(tax);
            sb.append(", nameError=");
            sb.append(str4);
            sb.append(", amountError=");
            sb.append(str5);
            sb.append(", isEditMode=");
            sb.append(z);
            sb.append(", showDiscardChangesDialog=");
            sb.append(z2);
            sb.append(", showError=");
            sb.append(z3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.currencyCode;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = this.name.hashCode();
            int hashCode3 = this.amount.hashCode();
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax tax = this.selectedTax;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (tax != null ? tax.hashCode() : 0)) * 31) + this.nameError.hashCode()) * 31) + this.amountError.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isEditMode)) * 31) + java.lang.Boolean.hashCode(this.showDiscardChangesDialog)) * 31) + java.lang.Boolean.hashCode(this.showError);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState uiState = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, uiState.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, uiState.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, uiState.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedTax, uiState.selectedTax) && kotlin.jvm.internal.Intrinsics.areEqual(this.nameError, uiState.nameError) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountError, uiState.amountError) && this.isEditMode == uiState.isEditMode && this.showDiscardChangesDialog == uiState.showDiscardChangesDialog && this.showError == uiState.showError;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState copy(java.lang.String currencyCode, java.lang.String name2, java.lang.String amount, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax selectedTax, java.lang.String nameError, java.lang.String amountError, boolean isEditMode, boolean showDiscardChangesDialog, boolean showError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameError, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountError, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState(currencyCode, name2, amount, selectedTax, nameError, amountError, isEditMode, showDiscardChangesDialog, showError);
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getShowError() {
            return this.showError;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getShowDiscardChangesDialog() {
            return this.showDiscardChangesDialog;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsEditMode() {
            return this.isEditMode;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getAmountError() {
            return this.amountError;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getNameError() {
            return this.nameError;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax getSelectedTax() {
            return this.selectedTax;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState uiState, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax tax, java.lang.String str4, java.lang.String str5, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            return uiState.copy((i & 1) != 0 ? uiState.currencyCode : str, (i & 2) != 0 ? uiState.name : str2, (i & 4) != 0 ? uiState.amount : str3, (i & 8) != 0 ? uiState.selectedTax : tax, (i & 16) != 0 ? uiState.nameError : str4, (i & 32) != 0 ? uiState.amountError : str5, (i & 64) != 0 ? uiState.isEditMode : z, (i & 128) != 0 ? uiState.showDiscardChangesDialog : z2, (i & 256) != 0 ? uiState.showError : z3);
        }

        public UiState() {
            this(null, null, null, null, null, null, false, false, false, 511, null);
        }
    }

    public final void onBackClick() {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState value2 = this.getHighSpeedVideoSizesFor.getValue();
        if (kotlin.jvm.internal.Intrinsics.areEqual(value2.getAmount(), this.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(value2.getName(), this.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(value2.getSelectedTax(), this.getHighSpeedVideoSizes)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel$onBackClick$2(this, null), 3, null);
            return;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState> mutableStateFlow = this.getHighSpeedVideoSizesFor;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.UiState.copy$default(value, null, null, null, null, null, null, false, true, false, 383, null)));
    }
}
