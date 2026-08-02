package com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ4\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0094@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent;", "Lcom/paypal/oslo/feature/cardconnect/api/CardConnectApi;", "cardConnectApi", "", "cardProduct", "instrumentId", "<init>", "(Lcom/paypal/oslo/feature/cardconnect/api/CardConnectApi;Ljava/lang/String;Ljava/lang/String;)V", "event", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent;Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/cardconnect/api/CardConnectApi;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardConnectSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState, com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cardconnect.api.CardConnectApi getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoSizes;

    public CardConnectSideEffectsMiddleware(com.paypal.oslo.feature.cardconnect.api.CardConnectApi cardConnectApi, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cardConnectApi;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent cardConnectEvent, com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState cardConnectState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(cardConnectEvent, cardConnectState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent cardConnectEvent, com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState cardConnectState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (cardConnectEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionLoading) {
            java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(function1, continuation);
            return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
        }
        if (!(cardConnectEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.RetryClicked)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(function1, continuation);
        return highSpeedVideoFpsRangesFor2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor2 : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectSideEffectsMiddleware$createSession$1 cardConnectSideEffectsMiddleware$createSession$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectSideEffectsMiddleware$createSession$1) {
            cardConnectSideEffectsMiddleware$createSession$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectSideEffectsMiddleware$createSession$1) continuation;
            if ((cardConnectSideEffectsMiddleware$createSession$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                cardConnectSideEffectsMiddleware$createSession$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = cardConnectSideEffectsMiddleware$createSession$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardConnectSideEffectsMiddleware$createSession$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "CardConnectSideEffects: creating session", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardProduct", this.getHighSpeedVideoSizes)), null, 4, null);
                    com.paypal.oslo.feature.cardconnect.api.CardConnectApi cardConnectApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String str = this.getHighSpeedVideoSizes;
                    java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
                    cardConnectSideEffectsMiddleware$createSession$1.Camera2StreamConfigurationMap = function1;
                    cardConnectSideEffectsMiddleware$createSession$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = cardConnectApi.createSession(str, str2, null, cardConnectSideEffectsMiddleware$createSession$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) cardConnectSideEffectsMiddleware$createSession$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "CardConnectSideEffects: session created successfully", null, null, 6, null);
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionSuccess((com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession) ((arrow.core.Either.Right) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.cardconnect.api.models.CardConnectError cardConnectError = (com.paypal.oslo.feature.cardconnect.api.models.CardConnectError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType access$toDebitErrorType = com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectSideEffectsMiddlewareKt.access$toDebitErrorType(cardConnectError);
                    com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo access$toErrorInfo = com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectSideEffectsMiddlewareKt.access$toErrorInfo(cardConnectError);
                    java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorCode", access$toErrorInfo.getErrorCode()));
                    if (cardConnectError instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.RiskDenied) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "CardConnectSideEffects: session creation denied by risk policy", mapOf, null, 4, null);
                    } else {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "CardConnectSideEffects: session creation failed", mapOf, null, 4, null);
                    }
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionFailed(access$toDebitErrorType, access$toErrorInfo));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        cardConnectSideEffectsMiddleware$createSession$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectSideEffectsMiddleware$createSession$1(this, continuation);
        java.lang.Object obj2 = cardConnectSideEffectsMiddleware$createSession$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardConnectSideEffectsMiddleware$createSession$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
