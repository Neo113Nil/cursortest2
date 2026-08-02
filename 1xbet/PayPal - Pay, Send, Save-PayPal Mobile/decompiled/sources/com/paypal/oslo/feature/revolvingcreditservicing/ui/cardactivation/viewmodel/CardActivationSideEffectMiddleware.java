package com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationSideEffectMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/CardActivationPreloadedAvailability;", "preloadedAvailability", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/cardactivation/GetCardActivationAvailabilityUseCase;", "getCardActivationAvailabilityUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/cardactivation/ActivateCardUseCase;", "activateCardUseCase", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/CardActivationPreloadedAvailability;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/cardactivation/GetCardActivationAvailabilityUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/cardactivation/ActivateCardUseCase;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/CardActivationPreloadedAvailability;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/cardactivation/GetCardActivationAvailabilityUseCase;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/cardactivation/ActivateCardUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CardActivationSideEffectMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CardActivationPreloadedAvailability getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CardActivationSideEffectMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CardActivationPreloadedAvailability cardActivationPreloadedAvailability, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase getCardActivationAvailabilityUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase activateCardUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCardActivationAvailabilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activateCardUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier;
        this.getHighSpeedVideoFpsRangesFor = cardActivationPreloadedAvailability;
        this.getHighSpeedVideoSizes = getCardActivationAvailabilityUseCase;
        this.getHighSpeedVideoFpsRanges = activateCardUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$activateCard(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware cardActivationSideEffectMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Activating activating, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$activateCard$1 cardActivationSideEffectMiddleware$activateCard$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$activateCard$1) {
            cardActivationSideEffectMiddleware$activateCard$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$activateCard$1) continuation;
            if ((cardActivationSideEffectMiddleware$activateCard$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                cardActivationSideEffectMiddleware$activateCard$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = cardActivationSideEffectMiddleware$activateCard$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardActivationSideEffectMiddleware$activateCard$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.ActivateCardRequestData activateCardRequestData = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.ActivateCardRequestData(activating.getData().getCreditAccountId(), activating.getCvv());
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase activateCardUseCase = cardActivationSideEffectMiddleware.getHighSpeedVideoFpsRanges;
                    cardActivationSideEffectMiddleware$activateCard$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activating);
                    cardActivationSideEffectMiddleware$activateCard$1.getHighSpeedVideoFpsRanges = function1;
                    cardActivationSideEffectMiddleware$activateCard$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activateCardRequestData);
                    cardActivationSideEffectMiddleware$activateCard$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = activateCardUseCase.invoke(activateCardRequestData, cardActivationSideEffectMiddleware$activateCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) cardActivationSideEffectMiddleware$activateCard$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationSucceeded.INSTANCE);
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError cardActivationError = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError) ((arrow.core.Either.Left) either).getValue();
                    if (cardActivationError instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.MaxAttemptsReached) {
                        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationMaxAttemptsError(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.MaxAttemptsReached) cardActivationError).getSupportPhoneNumber()));
                    } else {
                        if (!(cardActivationError instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.NetworkError) && !kotlin.jvm.internal.Intrinsics.areEqual(cardActivationError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationError.NotYetImplemented.INSTANCE)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationFailed.INSTANCE);
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        cardActivationSideEffectMiddleware$activateCard$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$activateCard$1(cardActivationSideEffectMiddleware, continuation);
        java.lang.Object obj2 = cardActivationSideEffectMiddleware$activateCard$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardActivationSideEffectMiddleware$activateCard$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$fetchAvailability(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware cardActivationSideEffectMiddleware, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$fetchAvailability$1 cardActivationSideEffectMiddleware$fetchAvailability$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$fetchAvailability$1) {
            cardActivationSideEffectMiddleware$fetchAvailability$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$fetchAvailability$1) continuation;
            if ((cardActivationSideEffectMiddleware$fetchAvailability$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                cardActivationSideEffectMiddleware$fetchAvailability$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = cardActivationSideEffectMiddleware$fetchAvailability$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardActivationSideEffectMiddleware$fetchAvailability$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase getCardActivationAvailabilityUseCase = cardActivationSideEffectMiddleware.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = cardActivationSideEffectMiddleware.getHighResolutionOutputSizeshNQ4ISI;
                    cardActivationSideEffectMiddleware$fetchAvailability$1.getHighSpeedVideoFpsRanges = function1;
                    cardActivationSideEffectMiddleware$fetchAvailability$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = getCardActivationAvailabilityUseCase.invoke(creditProductIdentifier, cardActivationSideEffectMiddleware$fetchAvailability$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) cardActivationSideEffectMiddleware$fetchAvailability$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationAvailability cardActivationAvailability = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationAvailability) ((arrow.core.Either.Right) either).getValue();
                    int i2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware.WhenMappings.$EnumSwitchMapping$0[cardActivationAvailability.getCardActivationStatus().ordinal()];
                    if (i2 == 1) {
                        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoaded(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.uimodel.CardActivationUiModel(cardActivationAvailability.getCreditAccountId(), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_card_activation_message), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_card_activation_description, new java.lang.Object[]{cardActivationAvailability.getLastDigits()}, null, false, 12, null), cardActivationAvailability.getCardArtUrl(), cardActivationAvailability.getSupportPhoneNumber())));
                    } else if (i2 == 2) {
                        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnNotReadyToActivateError.INSTANCE);
                    } else if (i2 == 3) {
                        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCardAlreadyActivatedError.INSTANCE);
                    } else {
                        if (i2 != 4) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnAvailabilityCheckRequestFailure.INSTANCE);
                    }
                } else if (either instanceof arrow.core.Either.Left) {
                    function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnAvailabilityCheckRequestFailure.INSTANCE);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        cardActivationSideEffectMiddleware$fetchAvailability$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$fetchAvailability$1(cardActivationSideEffectMiddleware, continuation);
        java.lang.Object obj2 = cardActivationSideEffectMiddleware$fetchAvailability$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardActivationSideEffectMiddleware$fetchAvailability$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent event = input.getEvent();
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnViewCreated) {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CardActivationPreloadedAvailability cardActivationPreloadedAvailability = this.getHighSpeedVideoFpsRangesFor;
            if (cardActivationPreloadedAvailability == null) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$invoke$1(this, input, null), 3, null);
                return;
            } else {
                input.getEventDispatcher().invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoaded(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.uimodel.CardActivationUiModel(cardActivationPreloadedAvailability.getCreditAccountId(), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_card_activation_message), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_card_activation_description, new java.lang.Object[]{this.getHighSpeedVideoFpsRangesFor.getLastDigits()}, null, false, 12, null), this.getHighSpeedVideoFpsRangesFor.getCardArtUrl(), this.getHighSpeedVideoFpsRangesFor.getSupportPhoneNumber())));
                return;
            }
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivateClicked) {
            if (input.getStates().getSecond() instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Activating) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState second = input.getStates().getSecond();
                kotlin.jvm.internal.Intrinsics.checkNotNull(second, "");
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$invoke$2(this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Activating) second, input, null), 3, null);
                return;
            }
            return;
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnTryAgainClicked) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState second2 = input.getStates().getSecond();
            if (second2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Loading) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$invoke$3(this, input, null), 3, null);
            } else if (second2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Activating) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware$invoke$4(this, second2, input, null), 3, null);
            }
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus.READY_TO_ACTIVATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus.NOT_READY_TO_ACTIVATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus.ACTIVATED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cardactivation.CardActivationStatus.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
