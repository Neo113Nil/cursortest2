package com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J[\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00107R\u0017\u0010:\u001a\u0002098\u0007¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020%0>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010?R \u0010&\u001a\b\u0012\u0004\u0012\u00020%0@8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020E0D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010FR \u0010H\u001a\b\u0012\u0004\u0012\u00020E0G8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/viewmodel/CardFormViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/reducer/CardFormReducer;", "reducer", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetStatesUseCase;", "getStatesUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/AddCardUseCase;", "addCardUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/UpdateCardUseCase;", "updateCardUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetCardBrandUseCase;", "getCardBrandUseCase", "Lcom/paypal/oslo/feature/inappcheckout/ui/util/CardPayloadBuilder;", "cardPayloadBuilder", "Landroid/content/Context;", "context", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/ui/card/reducer/CardFormReducer;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetStatesUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/AddCardUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/UpdateCardUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetCardBrandUseCase;Lcom/paypal/oslo/feature/inappcheckout/ui/util/CardPayloadBuilder;Landroid/content/Context;)V", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$OperationType;", "operationType", "", "fiId", "cardBrand", "lastDigits", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;", "cardFormData", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;", "fiMetadata", "", "isCardFormDataLoading", "", "initialize", "(Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$OperationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;Z)V", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event;", "event", "onEvent", "(Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event;)V", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$State;", "state", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ValidationErrors;", "validateFields", "(Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$State;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/ValidationErrors;", "getInputFormats", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/reducer/CardFormReducer;", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetStatesUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/AddCardUseCase;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/UpdateCardUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetCardBrandUseCase;", "Lcom/paypal/oslo/feature/inappcheckout/ui/util/CardPayloadBuilder;", "getOutputMinFrameDuration", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Effect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardFormViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.AddCardUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect> getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.ui.util.CardPayloadBuilder getOutputMinFrameDuration;
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardBrandUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.UpdateCardUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final android.content.res.Resources resources;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State> state;

    @javax.inject.Inject
    public CardFormViewModel(com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer cardFormReducer, com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase getStatesUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.AddCardUseCase addCardUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.UpdateCardUseCase updateCardUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardBrandUseCase getCardBrandUseCase, com.paypal.oslo.feature.inappcheckout.ui.util.CardPayloadBuilder cardPayloadBuilder, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardFormReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getStatesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCardBrandUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPayloadBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRanges = cardFormReducer;
        this.getHighResolutionOutputSizeshNQ4ISI = getStatesUseCase;
        this.Camera2StreamConfigurationMap = addCardUseCase;
        this.getHighSpeedVideoFpsRangesFor = updateCardUseCase;
        this.getHighSpeedVideoSizes = getCardBrandUseCase;
        this.getOutputMinFrameDuration = cardPayloadBuilder;
        android.content.res.Resources resources = context.getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "");
        this.resources = resources;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State(null, null, null, null, null, null, null, null, false, false, false, null, null, 8191, null));
        this.getInputSizeshNQ4ISI = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getInputFormats = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.AnonymousClass1(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleSaveCard(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel$handleSaveCard$1 cardFormViewModel$handleSaveCard$1;
        int i;
        boolean z;
        arrow.core.Either either;
        com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardSuccess onSaveCardSuccess;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel$handleSaveCard$1) {
            cardFormViewModel$handleSaveCard$1 = (com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel$handleSaveCard$1) continuation;
            if ((cardFormViewModel$handleSaveCard$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                cardFormViewModel$handleSaveCard$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = cardFormViewModel$handleSaveCard$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardFormViewModel$handleSaveCard$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State value = cardFormViewModel.getInputSizeshNQ4ISI.getValue();
                    boolean isBillingAddressExpanded = value.isBillingAddressExpanded();
                    com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity buildCardOperationPayload = cardFormViewModel.getOutputMinFrameDuration.buildCardOperationPayload(value.getCardDetails(), value.getBillingAddress(), isBillingAddressExpanded, value.getSelectedAddressId(), value.getFiId());
                    int i2 = com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.WhenMappings.$EnumSwitchMapping$0[value.getOperationType().ordinal()];
                    if (i2 == 1) {
                        com.paypal.oslo.feature.inappcheckout.domain.usecase.AddCardUseCase addCardUseCase = cardFormViewModel.Camera2StreamConfigurationMap;
                        cardFormViewModel$handleSaveCard$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
                        cardFormViewModel$handleSaveCard$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildCardOperationPayload);
                        cardFormViewModel$handleSaveCard$1.getHighSpeedVideoSizes = isBillingAddressExpanded;
                        cardFormViewModel$handleSaveCard$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = addCardUseCase.invoke(buildCardOperationPayload, cardFormViewModel$handleSaveCard$1);
                        if (obj != coroutine_suspended) {
                            z = isBillingAddressExpanded;
                            either = (arrow.core.Either) obj;
                        }
                    } else {
                        if (i2 != 2) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.inappcheckout.domain.usecase.UpdateCardUseCase updateCardUseCase = cardFormViewModel.getHighSpeedVideoFpsRangesFor;
                        cardFormViewModel$handleSaveCard$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
                        cardFormViewModel$handleSaveCard$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildCardOperationPayload);
                        cardFormViewModel$handleSaveCard$1.getHighSpeedVideoSizes = isBillingAddressExpanded;
                        cardFormViewModel$handleSaveCard$1.getHighSpeedVideoFpsRangesFor = 2;
                        obj = updateCardUseCase.invoke(buildCardOperationPayload, cardFormViewModel$handleSaveCard$1);
                        if (obj != coroutine_suspended) {
                            z = isBillingAddressExpanded;
                            either = (arrow.core.Either) obj;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    z = cardFormViewModel$handleSaveCard$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    either = (arrow.core.Either) obj;
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = cardFormViewModel$handleSaveCard$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    either = (arrow.core.Either) obj;
                }
                if (!(either instanceof arrow.core.Either.Left)) {
                    onSaveCardSuccess = new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardFailure(new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error.ApiError(((com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity) ((arrow.core.Either.Left) either).getValue()).getDescription()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    onSaveCardSuccess = new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardSuccess(z);
                }
                cardFormViewModel.onEvent(onSaveCardSuccess);
                return kotlin.Unit.INSTANCE;
            }
        }
        cardFormViewModel$handleSaveCard$1 = new com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel$handleSaveCard$1(cardFormViewModel, continuation);
        java.lang.Object obj2 = cardFormViewModel$handleSaveCard$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardFormViewModel$handleSaveCard$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        cardFormViewModel.onEvent(onSaveCardSuccess);
        return kotlin.Unit.INSTANCE;
    }

    public final android.content.res.Resources getResources() {
        return this.resources;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect> getEffect() {
        return this.effect;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel$1", f = "CardFormViewModel.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, nl = {69}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges = 1;
                obj = com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.this.getHighResolutionOutputSizeshNQ4ISI.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.this.onEvent(new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateStateList((java.util.Map) obj));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final void initialize(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType, java.lang.String fiId, java.lang.String cardBrand, java.lang.String lastDigits, com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormData, com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fiMetadata, boolean isCardFormDataLoading) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "");
        onEvent(new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.Initialize(operationType, fiId, cardBrand, lastDigits, cardFormData, fiMetadata, isCardFormDataLoading));
    }

    public final void onEvent(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event event) {
        com.paypal.oslo.feature.inappcheckout.domain.entity.PrefillCardInfo prefillCardInfo;
        com.paypal.oslo.feature.inappcheckout.domain.entity.PrefillCardInfo prefillCardInfo2;
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            java.lang.String cardNumber = this.getInputSizeshNQ4ISI.getValue().getCardDetails().getCardNumber();
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State> mutableStateFlow = this.getInputSizeshNQ4ISI;
            mutableStateFlow.setValue(this.getHighSpeedVideoFpsRanges.reduce(mutableStateFlow.getValue(), event));
            java.lang.String str = null;
            if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.Initialize) {
                com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.Initialize initialize = (com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.Initialize) event;
                if (initialize.getOperationType() != com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType.UPDATE) {
                    return;
                }
                java.lang.String cardBrand = initialize.getCardBrand();
                java.lang.String lastDigits = initialize.getLastDigits();
                com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormData = initialize.getCardFormData();
                com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fiMetadata = initialize.getFiMetadata();
                if (cardBrand == null) {
                    cardBrand = (cardFormData == null || (prefillCardInfo2 = cardFormData.getPrefillCardInfo()) == null) ? null : prefillCardInfo2.getCardBrand();
                }
                if (lastDigits != null) {
                    str = lastDigits;
                } else if (cardFormData != null && (prefillCardInfo = cardFormData.getPrefillCardInfo()) != null) {
                    str = prefillCardInfo.getLast4Digits();
                }
                if (cardBrand == null || str == null) {
                    return;
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition cardValidations = com.paypal.oslo.feature.inappcheckout.ui.util.CardUtilsKt.getCardValidations(new com.paypal.oslo.feature.inappcheckout.domain.entity.CardMetadata(cardBrand), fiMetadata);
                event = new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.SetCardValidations(cardValidations, com.paypal.oslo.feature.inappcheckout.ui.util.CardUtilsKt.buildMaskedCardNumber(str, cardValidations.getGrouping()));
            } else if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateUserInput)) {
                if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.BackClicked) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel$emitEffect$1(this, com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect.NavigateBack.INSTANCE, null), 3, null);
                    return;
                }
                if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.SaveCardClicked)) {
                    if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardSuccess) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel$emitEffect$1(this, new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect.CardSavedSuccessfully(((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardSuccess) event).getBillingAddressAdded()), null), 3, null);
                        return;
                    }
                    return;
                } else {
                    if (!validateFields(this.getInputSizeshNQ4ISI.getValue()).hasErrors()) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel$handleOnSaveCardClicked$1(this, null), 3, null);
                        return;
                    }
                    event = new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardFailure(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error.ClientSideValidationError.INSTANCE);
                }
            } else {
                if (((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateUserInput) event).getUserInput() instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.CardDetailsInput) {
                    java.lang.String cardNumber2 = this.getInputSizeshNQ4ISI.getValue().getCardDetails().getCardNumber();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(cardNumber, cardNumber2)) {
                        return;
                    }
                    int length = cardNumber.length();
                    int length2 = cardNumber2.length();
                    java.util.List<java.lang.Integer> card_brand_fetch_triggers = com.paypal.oslo.feature.inappcheckout.domain.util.CardConstants.INSTANCE.getCARD_BRAND_FETCH_TRIGGERS();
                    if ((card_brand_fetch_triggers instanceof java.util.Collection) && card_brand_fetch_triggers.isEmpty()) {
                        return;
                    }
                    java.util.Iterator<T> it = card_brand_fetch_triggers.iterator();
                    while (it.hasNext()) {
                        int intValue = ((java.lang.Number) it.next()).intValue();
                        if (length + 1 <= intValue && intValue <= length2) {
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel$fetchCardBrandAndUpdateValidations$1(this, null), 3, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.model.ValidationErrors validateFields(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        if (state.isSaveButtonClicked()) {
            return com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationUtilsKt.getValidationErrors(state.getCardDetails(), state.getBillingAddress(), this.resources, state.isBillingAddressExpanded(), state.getCardValidations(), state.getOperationType() == com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType.ADD);
        }
        return new com.paypal.oslo.feature.inappcheckout.domain.model.ValidationErrors(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType.values().length];
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType.ADD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType.UPDATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
