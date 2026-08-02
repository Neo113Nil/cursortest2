package com.paypal.oslo.feature.taptopay.domain.observer.paypal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB)\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/observer/paypal/PurgeCardDataOnCardDeletedObserver;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OrphanedCardLifecycleDependency;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalObserveCardStateUseCase;", "payPalObserveCardStateUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardArtUseCase;", "payPalDeleteCardArtUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardIdGroupUseCase;", "payPalDeleteCardIdGroupUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardInfoUseCase;", "payPalDeleteCardInfoUseCase", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalObserveCardStateUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardArtUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardIdGroupUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardInfoUseCase;Lkotlinx/coroutines/CoroutineDispatcher;)V", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalObserveCardStateUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardArtUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardIdGroupUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardInfoUseCase;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardArtUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardIdGroupUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardInfoUseCase;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PurgeCardDataOnCardDeletedObserver implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OrphanedCardLifecycleDependency {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardArtUseCase getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardInfoUseCase Camera2StreamConfigurationMap;

    public PurgeCardDataOnCardDeletedObserver(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase payPalObserveCardStateUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardArtUseCase payPalDeleteCardArtUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase payPalDeleteCardIdGroupUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardInfoUseCase payPalDeleteCardInfoUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalObserveCardStateUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalDeleteCardArtUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalDeleteCardIdGroupUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalDeleteCardInfoUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRanges = payPalDeleteCardArtUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = payPalDeleteCardIdGroupUseCase;
        this.Camera2StreamConfigurationMap = payPalDeleteCardInfoUseCase;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineDispatcher.plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        this.getHighSpeedVideoFpsRangesFor = CoroutineScope;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Observing card deleted state", null, null, 6, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver.AnonymousClass1(payPalObserveCardStateUseCase, this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$deleteCardArt(com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver purgeCardDataOnCardDeletedObserver, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$deleteCardArt$1 purgeCardDataOnCardDeletedObserver$deleteCardArt$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$deleteCardArt$1) {
            purgeCardDataOnCardDeletedObserver$deleteCardArt$1 = (com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$deleteCardArt$1) continuation;
            if ((purgeCardDataOnCardDeletedObserver$deleteCardArt$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                purgeCardDataOnCardDeletedObserver$deleteCardArt$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = purgeCardDataOnCardDeletedObserver$deleteCardArt$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = purgeCardDataOnCardDeletedObserver$deleteCardArt$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    purgeCardDataOnCardDeletedObserver$deleteCardArt$1.getHighResolutionOutputSizeshNQ4ISI = payPalCardId;
                    purgeCardDataOnCardDeletedObserver$deleteCardArt$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = purgeCardDataOnCardDeletedObserver.getHighSpeedVideoFpsRanges.invoke(payPalCardId, purgeCardDataOnCardDeletedObserver$deleteCardArt$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    payPalCardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId) purgeCardDataOnCardDeletedObserver$deleteCardArt$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card art deleted successfully", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", payPalCardId.getId())), 2, null);
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardArtError payPalDeleteCardArtError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardArtError) ((arrow.core.Either.Left) either).getValue();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(payPalDeleteCardArtError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardArtError.CardArtNotFound.INSTANCE)) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Unable to delete card art, card art not found", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", payPalCardId.getId())), 2, null);
                    } else {
                        if (!(payPalDeleteCardArtError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardArtError.DefaultError)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.taptopay.LoggerKt.log.w("Unable to delete card art", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardArtError.DefaultError) payPalDeleteCardArtError).getDebugMessage())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", payPalCardId.getId())));
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        purgeCardDataOnCardDeletedObserver$deleteCardArt$1 = new com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$deleteCardArt$1(purgeCardDataOnCardDeletedObserver, continuation);
        java.lang.Object obj2 = purgeCardDataOnCardDeletedObserver$deleteCardArt$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = purgeCardDataOnCardDeletedObserver$deleteCardArt$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public PurgeCardDataOnCardDeletedObserver(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase payPalObserveCardStateUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardArtUseCase payPalDeleteCardArtUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase payPalDeleteCardIdGroupUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardInfoUseCase payPalDeleteCardInfoUseCase) {
        this(payPalObserveCardStateUseCase, payPalDeleteCardArtUseCase, payPalDeleteCardIdGroupUseCase, payPalDeleteCardInfoUseCase, kotlinx.coroutines.Dispatchers.getIO());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalObserveCardStateUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalDeleteCardArtUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalDeleteCardIdGroupUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalDeleteCardInfoUseCase, "");
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1", f = "PurgeCardDataOnCardDeletedObserver.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, nl = {106}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoSizes;

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$2, reason: invalid class name */
        static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver getHighSpeedVideoSizes;

            /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(3:24|25|26))(2:30|31))(6:35|36|37|38|39|(2:41|28)(1:42))|32|(2:34|28)|26))|48|6|7|(0)(0)|32|(0)|26|(1:(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00e2, code lost:
            
                if (r0.invoke(r12, r2) == r3) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0068, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange payPalCardStateChange, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$2$emit$1 purgeCardDataOnCardDeletedObserver$1$2$emit$1;
                java.lang.Object coroutine_suspended;
                int i;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange payPalCardStateChange2;
                java.lang.Throwable th;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId;
                if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$2$emit$1) {
                    purgeCardDataOnCardDeletedObserver$1$2$emit$1 = (com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$2$emit$1) continuation;
                    if ((purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                        purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                        java.lang.Object obj = purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoFpsRanges;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            try {
                                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId2 = payPalCardStateChange.getCard().getPayPalCardId();
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card deleted, purging local data", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", payPalCardId2.getId()), kotlin.TuplesKt.to("digitizedCardId", payPalCardStateChange.getCard().getDigitizedCard().getCardId())), 2, null);
                                com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver purgeCardDataOnCardDeletedObserver = this.getHighSpeedVideoSizes;
                                payPalCardStateChange2 = payPalCardStateChange;
                                purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoFpsRangesFor = payPalCardStateChange2;
                                purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoSizes = payPalCardId2;
                                purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                if (com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver.access$deleteCardArt(purgeCardDataOnCardDeletedObserver, payPalCardId2, purgeCardDataOnCardDeletedObserver$1$2$emit$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                payPalCardId = payPalCardId2;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                payPalCardStateChange2 = payPalCardStateChange;
                                th = th;
                                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to purge card data of deleted card", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", payPalCardStateChange2.getCard().getPayPalCardId().getId()), kotlin.TuplesKt.to("digitizedCardId", payPalCardStateChange2.getCard().getDigitizedCard().getCardId())), th, 2, null);
                                return kotlin.Unit.INSTANCE;
                            }
                        } else if (i == 1) {
                            payPalCardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId) purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoSizes;
                            payPalCardStateChange2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange) purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                        } else {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange payPalCardStateChange3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange) purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoFpsRangesFor;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    payPalCardStateChange2 = payPalCardStateChange3;
                                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to purge card data of deleted card", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", payPalCardStateChange2.getCard().getPayPalCardId().getId()), kotlin.TuplesKt.to("digitizedCardId", payPalCardStateChange2.getCard().getDigitizedCard().getCardId())), th, 2, null);
                                    return kotlin.Unit.INSTANCE;
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                            payPalCardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId) purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoSizes;
                            payPalCardStateChange2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange) purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardInfoUseCase payPalDeleteCardInfoUseCase = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId3 = payPalCardId;
                            purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoFpsRangesFor = payPalCardStateChange2;
                            purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalCardId);
                            purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                        }
                        purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoFpsRangesFor = payPalCardStateChange2;
                        purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoSizes = payPalCardId;
                        purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                        if (this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI.invoke(payPalCardId, purgeCardDataOnCardDeletedObserver$1$2$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardInfoUseCase payPalDeleteCardInfoUseCase2 = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId32 = payPalCardId;
                        purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoFpsRangesFor = payPalCardStateChange2;
                        purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalCardId);
                        purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                    }
                }
                purgeCardDataOnCardDeletedObserver$1$2$emit$1 = new com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$2$emit$1(this, continuation);
                java.lang.Object obj2 = purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoFpsRanges;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                }
                purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoFpsRangesFor = payPalCardStateChange2;
                purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoSizes = payPalCardId;
                purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                if (this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI.invoke(payPalCardId, purgeCardDataOnCardDeletedObserver$1$2$emit$1) == coroutine_suspended) {
                }
                com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardInfoUseCase payPalDeleteCardInfoUseCase22 = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId322 = payPalCardId;
                purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoFpsRangesFor = payPalCardStateChange2;
                purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalCardId);
                purgeCardDataOnCardDeletedObserver$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI = 3;
            }

            AnonymousClass2(com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver purgeCardDataOnCardDeletedObserver) {
                this.getHighSpeedVideoSizes = purgeCardDataOnCardDeletedObserver;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange> invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke();
                this.getHighSpeedVideoSizes = 1;
                if (new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange>() { // from class: com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$invokeSuspend$$inlined$filter$1

                    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                    /* renamed from: com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                            com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                                if ((anonymousClass1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.getOutputFormats -= 2147483648;
                                    java.lang.Object obj2 = anonymousClass1.getInputSizeshNQ4ISI;
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.getOutputFormats;
                                    if (i != 0) {
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                        if (((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange) obj).getType() == com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.DELETED) {
                                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                            anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                            anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                            anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                            anonymousClass1.getHighSpeedVideoFpsRangesFor = 0;
                                            anonymousClass1.getOutputFormats = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        int i2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                        java.lang.Object obj3 = anonymousClass1.Camera2StreamConfigurationMap;
                                        java.lang.Object obj4 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                            java.lang.Object obj22 = anonymousClass1.getInputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputFormats;
                            if (i != 0) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$invokeSuspend$$inlined$filter$1$2", f = "PurgeCardDataOnCardDeletedObserver.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                        /* renamed from: com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                            java.lang.Object Camera2StreamConfigurationMap;
                            java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.Object getHighSpeedVideoFpsRanges;
                            int getHighSpeedVideoFpsRangesFor;
                            java.lang.Object getHighSpeedVideoSizes;
                            /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
                            int getOutputFormats;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                this.getInputSizeshNQ4ISI = obj;
                                this.getOutputFormats |= Integer.MIN_VALUE;
                                return com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                            }

                            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                            this.Camera2StreamConfigurationMap = flowCollector;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange> flowCollector, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                    }
                }.collect(new com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver.AnonymousClass1.AnonymousClass2(this.Camera2StreamConfigurationMap), this) == coroutine_suspended) {
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
            return ((com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase payPalObserveCardStateUseCase, com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver purgeCardDataOnCardDeletedObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = payPalObserveCardStateUseCase;
            this.Camera2StreamConfigurationMap = purgeCardDataOnCardDeletedObserver;
        }
    }
}
