package com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ6\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086B¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalGetTransactionHistoryUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/GetTransactionHistoryUseCase;", "getTransactionHistoryUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;", "getCardIdGroupUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/transaction/CachedTransactionRepository;", "cachedTransactionRepository", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/GetTransactionHistoryUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/transaction/CachedTransactionRepository;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;", "id", "Ljava/util/Date;", "from", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalGetTransactionHistoryError;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/paypal/PayPalTransaction;", "invoke", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/GetTransactionHistoryUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/transaction/CachedTransactionRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalGetTransactionHistoryUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PayPalGetTransactionHistoryUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase getTransactionHistoryUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase, com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository cachedTransactionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTransactionHistoryUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardIdGroupUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedTransactionRepository, "");
        this.getHighSpeedVideoFpsRanges = getTransactionHistoryUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = payPalGetCardIdGroupUseCase;
        this.getHighSpeedVideoSizes = cachedTransactionRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalGetTransactionHistoryUseCase payPalGetTransactionHistoryUseCase, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, java.util.Date date, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            date = null;
        }
        return payPalGetTransactionHistoryUseCase.invoke(cardId, date, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x015a, code lost:
    
        if (r13 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x009c, code lost:
    
        if (r13 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d A[LOOP:1: B:29:0x0107->B:31:0x010d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, java.util.Date date, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetTransactionHistoryError, ? extends java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.paypal.PayPalTransaction>>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalGetTransactionHistoryUseCase$invoke$1 payPalGetTransactionHistoryUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup;
        int i2;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId2;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup2;
        java.util.Date date2;
        arrow.core.Either either;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetTransactionHistoryError.DefaultError defaultError;
        arrow.core.Either left;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId3;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup3;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction> list;
        java.util.Iterator<T> it;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalGetTransactionHistoryUseCase$invoke$1) {
            payPalGetTransactionHistoryUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalGetTransactionHistoryUseCase$invoke$1) continuation;
            if ((payPalGetTransactionHistoryUseCase$invoke$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                payPalGetTransactionHistoryUseCase$invoke$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = payPalGetTransactionHistoryUseCase$invoke$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payPalGetTransactionHistoryUseCase$invoke$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    payPalGetTransactionHistoryUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = cardId;
                    payPalGetTransactionHistoryUseCase$invoke$1.getHighSpeedVideoSizes = date;
                    payPalGetTransactionHistoryUseCase$invoke$1.getOutputMinFrameDuration = 1;
                    obj = payPalGetCardIdGroupUseCase.invoke(cardId, payPalGetTransactionHistoryUseCase$invoke$1);
                } else if (i == 1) {
                    date = (java.util.Date) payPalGetTransactionHistoryUseCase$invoke$1.getHighSpeedVideoSizes;
                    cardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) payPalGetTransactionHistoryUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        int i3 = payPalGetTransactionHistoryUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup4 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) payPalGetTransactionHistoryUseCase$invoke$1.Camera2StreamConfigurationMap;
                        date2 = (java.util.Date) payPalGetTransactionHistoryUseCase$invoke$1.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId4 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) payPalGetTransactionHistoryUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        i2 = i3;
                        cardIdGroup2 = cardIdGroup4;
                        cardId2 = cardId4;
                        either = (arrow.core.Either) obj;
                        if (!(either instanceof arrow.core.Either.Right)) {
                            java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction> list2 = (java.util.List) ((arrow.core.Either.Right) either).getValue();
                            com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository cachedTransactionRepository = this.getHighSpeedVideoSizes;
                            payPalGetTransactionHistoryUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = cardId2;
                            payPalGetTransactionHistoryUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(date2);
                            payPalGetTransactionHistoryUseCase$invoke$1.Camera2StreamConfigurationMap = cardIdGroup2;
                            payPalGetTransactionHistoryUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                            payPalGetTransactionHistoryUseCase$invoke$1.getOutputFormats = list2;
                            payPalGetTransactionHistoryUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i2;
                            payPalGetTransactionHistoryUseCase$invoke$1.getOutputMinFrameDuration = 3;
                            if (cachedTransactionRepository.setTransactionHistory(list2, payPalGetTransactionHistoryUseCase$invoke$1) != coroutine_suspended) {
                                cardId3 = cardId2;
                                cardIdGroup3 = cardIdGroup2;
                                list = list2;
                                java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction> list3 = list;
                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                                it = list3.iterator();
                                while (it.hasNext()) {
                                }
                                left = arrow.core.EitherKt.right(arrayList);
                                cardId2 = cardId3;
                                if (left == null) {
                                }
                            }
                        } else {
                            if (!(either instanceof arrow.core.Either.Left)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            arrow.core.Either.Left left2 = (arrow.core.Either.Left) either;
                            if (left2.getValue() instanceof com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError.DeviceOffline) {
                                com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository cachedTransactionRepository2 = this.getHighSpeedVideoSizes;
                                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId = cardIdGroup2.getPayPalCardId();
                                payPalGetTransactionHistoryUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = cardId2;
                                payPalGetTransactionHistoryUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(date2);
                                payPalGetTransactionHistoryUseCase$invoke$1.Camera2StreamConfigurationMap = cardIdGroup2;
                                payPalGetTransactionHistoryUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                payPalGetTransactionHistoryUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i2;
                                payPalGetTransactionHistoryUseCase$invoke$1.getOutputMinFrameDuration = 4;
                                obj = cachedTransactionRepository2.getTransactionHistory(payPalCardId, payPalGetTransactionHistoryUseCase$invoke$1);
                            } else {
                                com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError getTransactionHistoryError = (com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError) left2.getValue();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(getTransactionHistoryError, com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError.CardNotFound.INSTANCE)) {
                                    defaultError = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetTransactionHistoryError.CardNotFound.INSTANCE;
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(getTransactionHistoryError, com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError.DeviceOffline.INSTANCE)) {
                                    defaultError = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetTransactionHistoryError.DeviceOffline.INSTANCE;
                                } else {
                                    if (!(getTransactionHistoryError instanceof com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError.DefaultError)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    defaultError = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetTransactionHistoryError.DefaultError(((com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError.DefaultError) getTransactionHistoryError).getDebugMessage(), null, 2, null);
                                }
                                left = arrow.core.EitherKt.left(defaultError);
                                if (left == null) {
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = payPalGetTransactionHistoryUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        cardIdGroup2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) payPalGetTransactionHistoryUseCase$invoke$1.Camera2StreamConfigurationMap;
                        cardId2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) payPalGetTransactionHistoryUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.Iterable iterable = (java.lang.Iterable) obj;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                        java.util.Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new com.paypal.oslo.feature.taptopay.domain.model.payment.paypal.PayPalTransaction(cardIdGroup2.getPayPalCardId(), cardIdGroup2.getDeviceWalletServiceCardId(), (com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction) it2.next()));
                        }
                        left = arrow.core.EitherKt.right(arrayList2);
                        if (left == null) {
                            return left;
                        }
                        cardId = cardId2;
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card not found for card ID", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", cardId.toString())), null, 10, null);
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetTransactionHistoryError.CardNotFound.INSTANCE);
                    }
                    int i5 = payPalGetTransactionHistoryUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    list = (java.util.List) payPalGetTransactionHistoryUseCase$invoke$1.getOutputFormats;
                    cardIdGroup3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) payPalGetTransactionHistoryUseCase$invoke$1.Camera2StreamConfigurationMap;
                    cardId3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) payPalGetTransactionHistoryUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction> list32 = list;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list32, 10));
                    it = list32.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new com.paypal.oslo.feature.taptopay.domain.model.payment.paypal.PayPalTransaction(cardIdGroup3.getPayPalCardId(), cardIdGroup3.getDeviceWalletServiceCardId(), (com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction) it.next()));
                    }
                    left = arrow.core.EitherKt.right(arrayList3);
                    cardId2 = cardId3;
                    if (left == null) {
                    }
                }
                cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj;
                if (cardIdGroup != null) {
                    com.paypal.oslo.feature.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase getTransactionHistoryUseCase = this.getHighSpeedVideoFpsRanges;
                    java.lang.String id = cardIdGroup.getDigitizedCardId().getId();
                    payPalGetTransactionHistoryUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = cardId;
                    payPalGetTransactionHistoryUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(date);
                    payPalGetTransactionHistoryUseCase$invoke$1.Camera2StreamConfigurationMap = cardIdGroup;
                    i2 = 0;
                    payPalGetTransactionHistoryUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                    payPalGetTransactionHistoryUseCase$invoke$1.getOutputMinFrameDuration = 2;
                    java.lang.Object invoke = getTransactionHistoryUseCase.invoke(id, date, payPalGetTransactionHistoryUseCase$invoke$1);
                    if (invoke != coroutine_suspended) {
                        java.util.Date date3 = date;
                        cardId2 = cardId;
                        cardIdGroup2 = cardIdGroup;
                        obj = invoke;
                        date2 = date3;
                        either = (arrow.core.Either) obj;
                        if (!(either instanceof arrow.core.Either.Right)) {
                        }
                    }
                    return coroutine_suspended;
                }
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card not found for card ID", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", cardId.toString())), null, 10, null);
                return arrow.core.EitherKt.left(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetTransactionHistoryError.CardNotFound.INSTANCE);
            }
        }
        payPalGetTransactionHistoryUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalGetTransactionHistoryUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = payPalGetTransactionHistoryUseCase$invoke$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payPalGetTransactionHistoryUseCase$invoke$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj2;
        if (cardIdGroup != null) {
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card not found for card ID", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", cardId.toString())), null, 10, null);
        return arrow.core.EitherKt.left(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetTransactionHistoryError.CardNotFound.INSTANCE);
    }
}
