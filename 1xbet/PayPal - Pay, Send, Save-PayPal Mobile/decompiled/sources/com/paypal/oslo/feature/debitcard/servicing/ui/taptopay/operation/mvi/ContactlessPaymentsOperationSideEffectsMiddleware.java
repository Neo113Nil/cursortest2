package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fH\u0094@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent;", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/IsCardDigitizedApi;", "isCardDigitized", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetCardEligibilityApi;", "getCardEligibility", "<init>", "(Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/IsCardDigitizedApi;Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetCardEligibilityApi;)V", "event", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent;Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/IsCardDigitizedApi;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetCardEligibilityApi;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactlessPaymentsOperationSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.api.domain.usecase.card.IsCardDigitizedApi Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetCardEligibilityApi getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ContactlessPaymentsOperationSideEffectsMiddleware(com.paypal.oslo.feature.taptopay.api.domain.usecase.card.IsCardDigitizedApi isCardDigitizedApi, com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetCardEligibilityApi getCardEligibilityApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isCardDigitizedApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCardEligibilityApi, "");
        this.Camera2StreamConfigurationMap = isCardDigitizedApi;
        this.getHighSpeedVideoFpsRangesFor = getCardEligibilityApi;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent contactlessPaymentsOperationEvent, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState contactlessPaymentsOperationState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(contactlessPaymentsOperationEvent, contactlessPaymentsOperationState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (r13 == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent contactlessPaymentsOperationEvent, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState contactlessPaymentsOperationState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationSideEffectsMiddleware$handleEvent$1 contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$1;
        int i;
        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent contactlessPaymentsOperationEvent2;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId payPalCardId;
        boolean areEqual;
        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus contactlessPaymentsProvisionStatus;
        com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus eligibilityStatus;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationSideEffectsMiddleware$handleEvent$1) {
            contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationSideEffectsMiddleware$handleEvent$1) continuation;
            if ((contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationSideEffectsMiddleware$handleEvent$1 contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12 = contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$1;
                java.lang.Object obj = contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (contactlessPaymentsOperationEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckRequested) {
                        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId payPalCardId2 = new com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId(((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckRequested) contactlessPaymentsOperationEvent).getCardId());
                        com.paypal.oslo.feature.taptopay.api.domain.usecase.card.IsCardDigitizedApi isCardDigitizedApi = this.Camera2StreamConfigurationMap;
                        java.util.List<com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId> listOf = kotlin.collections.CollectionsKt.listOf(payPalCardId2);
                        contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12.getHighSpeedVideoFpsRangesFor = contactlessPaymentsOperationEvent;
                        contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(contactlessPaymentsOperationState);
                        contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12.Camera2StreamConfigurationMap = function1;
                        contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12.getHighSpeedVideoFpsRanges = payPalCardId2;
                        contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                        java.lang.Object invoke = isCardDigitizedApi.invoke(listOf, contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12);
                        if (invoke != coroutine_suspended) {
                            contactlessPaymentsOperationEvent2 = contactlessPaymentsOperationEvent;
                            payPalCardId = payPalCardId2;
                            obj = invoke;
                            areEqual = kotlin.jvm.internal.Intrinsics.areEqual(((java.util.Map) obj).get(payPalCardId), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                            java.lang.String cardId = ((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckRequested) contactlessPaymentsOperationEvent2).getCardId();
                            if (!areEqual) {
                            }
                            function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckSucceeded(cardId, contactlessPaymentsProvisionStatus));
                        }
                    } else if (contactlessPaymentsOperationEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckSucceeded) {
                        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckSucceeded provisionStatusCheckSucceeded = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckSucceeded) contactlessPaymentsOperationEvent;
                        if (provisionStatusCheckSucceeded.getProvisionStatus() == com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus.NOT_PROVISIONED) {
                            function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckRequested(provisionStatusCheckSucceeded.getCardId(), provisionStatusCheckSucceeded.getProvisionStatus()));
                        }
                    } else if (contactlessPaymentsOperationEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckRequested) {
                        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId payPalCardId3 = new com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId(((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckRequested) contactlessPaymentsOperationEvent).getCardId());
                        contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(contactlessPaymentsOperationEvent);
                        contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(contactlessPaymentsOperationState);
                        contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12.Camera2StreamConfigurationMap = function1;
                        contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalCardId3);
                        contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12.getHighResolutionOutputSizeshNQ4ISI = 2;
                        obj = com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetCardEligibilityApi.invoke$default(this.getHighSpeedVideoFpsRangesFor, payPalCardId3, null, null, contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12, 6, null);
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    payPalCardId = (com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId) contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12.getHighSpeedVideoFpsRanges;
                    function1 = (kotlin.jvm.functions.Function1) contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12.Camera2StreamConfigurationMap;
                    contactlessPaymentsOperationEvent2 = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent) contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    areEqual = kotlin.jvm.internal.Intrinsics.areEqual(((java.util.Map) obj).get(payPalCardId), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    java.lang.String cardId2 = ((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckRequested) contactlessPaymentsOperationEvent2).getCardId();
                    if (!areEqual) {
                        contactlessPaymentsProvisionStatus = com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus.PROVISIONED;
                    } else {
                        contactlessPaymentsProvisionStatus = com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus.NOT_PROVISIONED;
                    }
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckSucceeded(cardId2, contactlessPaymentsProvisionStatus));
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$12.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Either either = (arrow.core.Either) obj;
                    if (either instanceof arrow.core.Either.Right) {
                        eligibilityStatus = ((java.lang.Boolean) ((arrow.core.Either.Right) either).getValue()).booleanValue() ? com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.ELIGIBLE : com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.INELIGIBLE;
                    } else if (either instanceof arrow.core.Either.Left) {
                        eligibilityStatus = com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.INELIGIBLE;
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckSucceeded(eligibilityStatus));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationSideEffectsMiddleware$handleEvent$1(this, continuation);
        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationSideEffectsMiddleware$handleEvent$1 contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$122 = contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$1;
        java.lang.Object obj2 = contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$122.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contactlessPaymentsOperationSideEffectsMiddleware$handleEvent$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
