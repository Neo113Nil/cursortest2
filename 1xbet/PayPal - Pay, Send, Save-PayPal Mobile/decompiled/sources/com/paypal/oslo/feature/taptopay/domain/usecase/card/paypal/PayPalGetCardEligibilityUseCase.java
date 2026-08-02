package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bH\u0086B¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardEligibilityUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;", "payPalCardRepository", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;", "getCardIdGroupUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;)V", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;", "ids", "", "clientMetadataId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "cardTypes", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/GetCardEligibilityError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/CardEligibilityResult;", "invoke", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalGetCardEligibilityUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PayPalGetCardEligibilityUseCase(com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalCardRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardIdGroupUseCase, "");
        this.getHighSpeedVideoSizes = payPalCardRepository;
        this.getHighSpeedVideoFpsRanges = payPalGetCardIdGroupUseCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase payPalGetCardEligibilityUseCase, java.util.List list, java.lang.String str, java.util.List list2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        return payPalGetCardEligibilityUseCase.invoke(list, str, list2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0124 -> B:16:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId> list, java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType> list2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.GetCardEligibilityError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase$invoke$1 payPalGetCardEligibilityUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.util.Collection arrayList;
        java.util.Iterator it;
        int i2;
        int i3;
        int i4;
        java.lang.String str2;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase$invoke$1 payPalGetCardEligibilityUseCase$invoke$12;
        java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType> list3;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase payPalGetCardEligibilityUseCase = this;
        java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId> list4 = list;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase$invoke$1) {
            payPalGetCardEligibilityUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase$invoke$1) continuation;
            if ((payPalGetCardEligibilityUseCase$invoke$1.isOutputSupportedFor & Integer.MIN_VALUE) != 0) {
                payPalGetCardEligibilityUseCase$invoke$1.isOutputSupportedFor -= 2147483648;
                java.lang.Object obj4 = payPalGetCardEligibilityUseCase$invoke$1.isOutputSupportedForhNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payPalGetCardEligibilityUseCase$invoke$1.isOutputSupportedFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj4);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Executing PayPalGetCardEligibilityUseCase", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("ids", list4)), null, 4, null);
                    java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId> list5 = list4;
                    payPalCardRepository = payPalGetCardEligibilityUseCase.getHighSpeedVideoSizes;
                    obj = list5;
                    obj2 = obj;
                    obj3 = obj2;
                    arrayList = new java.util.ArrayList();
                    it = list5.iterator();
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    str2 = str;
                    payPalGetCardEligibilityUseCase$invoke$12 = payPalGetCardEligibilityUseCase$invoke$1;
                    list3 = list2;
                    if (it.hasNext()) {
                    }
                    return r5;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj4);
                    return obj4;
                }
                int i5 = payPalGetCardEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                int i6 = payPalGetCardEligibilityUseCase$invoke$1.getHighSpeedVideoSizes;
                int i7 = payPalGetCardEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                int i8 = payPalGetCardEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                i4 = payPalGetCardEligibilityUseCase$invoke$1.Camera2StreamConfigurationMap;
                payPalCardRepository = (com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository) payPalGetCardEligibilityUseCase$invoke$1.getInputSizeshNQ4ISI;
                java.lang.Object obj5 = payPalGetCardEligibilityUseCase$invoke$1.toString;
                java.lang.Object obj6 = payPalGetCardEligibilityUseCase$invoke$1.unwrapAs;
                it = (java.util.Iterator) payPalGetCardEligibilityUseCase$invoke$1.getOutputStallDurationlomOqCM;
                obj2 = (java.lang.Iterable) payPalGetCardEligibilityUseCase$invoke$1.getOutputSizes;
                arrayList = (java.util.Collection) payPalGetCardEligibilityUseCase$invoke$1.getOutputStallDuration;
                obj3 = (java.lang.Iterable) payPalGetCardEligibilityUseCase$invoke$1.getOutputSizeshNQ4ISI;
                java.lang.Object obj7 = (java.lang.Iterable) payPalGetCardEligibilityUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
                java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType> list6 = (java.util.List) payPalGetCardEligibilityUseCase$invoke$1.getOutputFormats;
                java.lang.String str3 = (java.lang.String) payPalGetCardEligibilityUseCase$invoke$1.getOutputMinFrameDuration;
                java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId> list7 = (java.util.List) payPalGetCardEligibilityUseCase$invoke$1.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj4);
                int i9 = i7;
                list4 = list7;
                obj = obj7;
                payPalGetCardEligibilityUseCase$invoke$12 = payPalGetCardEligibilityUseCase$invoke$1;
                list3 = list6;
                int i10 = i8;
                java.lang.Object obj8 = coroutine_suspended;
                int i11 = i10;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj4;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId = cardIdGroup == null ? cardIdGroup.getDeviceWalletServiceCardId() : null;
                if (deviceWalletServiceCardId != null) {
                    arrayList.add(deviceWalletServiceCardId);
                }
                str2 = str3;
                i3 = i11;
                coroutine_suspended = obj8;
                i2 = i9;
                payPalGetCardEligibilityUseCase = this;
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    java.lang.Object obj9 = coroutine_suspended;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) next;
                    int i12 = i2;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase = payPalGetCardEligibilityUseCase.getHighSpeedVideoFpsRanges;
                    payPalGetCardEligibilityUseCase$invoke$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list4);
                    payPalGetCardEligibilityUseCase$invoke$12.getOutputMinFrameDuration = str2;
                    payPalGetCardEligibilityUseCase$invoke$12.getOutputFormats = list3;
                    payPalGetCardEligibilityUseCase$invoke$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                    payPalGetCardEligibilityUseCase$invoke$12.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
                    payPalGetCardEligibilityUseCase$invoke$12.getOutputStallDuration = arrayList;
                    payPalGetCardEligibilityUseCase$invoke$12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                    payPalGetCardEligibilityUseCase$invoke$12.getOutputStallDurationlomOqCM = it;
                    payPalGetCardEligibilityUseCase$invoke$12.unwrapAs = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                    payPalGetCardEligibilityUseCase$invoke$12.toString = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                    payPalGetCardEligibilityUseCase$invoke$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                    payPalGetCardEligibilityUseCase$invoke$12.getInputSizeshNQ4ISI = payPalCardRepository;
                    payPalGetCardEligibilityUseCase$invoke$12.Camera2StreamConfigurationMap = i4;
                    payPalGetCardEligibilityUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = i3;
                    i9 = i12;
                    payPalGetCardEligibilityUseCase$invoke$12.getHighSpeedVideoFpsRanges = i9;
                    payPalGetCardEligibilityUseCase$invoke$12.getHighSpeedVideoSizes = 0;
                    payPalGetCardEligibilityUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                    payPalGetCardEligibilityUseCase$invoke$12.isOutputSupportedFor = 1;
                    java.lang.Object invoke = payPalGetCardIdGroupUseCase.invoke(cardId, payPalGetCardEligibilityUseCase$invoke$12);
                    obj8 = obj9;
                    if (invoke != obj8) {
                        i10 = i3;
                        str3 = str2;
                        obj4 = invoke;
                        int i112 = i10;
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj4;
                        if (cardIdGroup2 == null) {
                        }
                        if (deviceWalletServiceCardId != null) {
                        }
                        str2 = str3;
                        i3 = i112;
                        coroutine_suspended = obj8;
                        i2 = i9;
                        payPalGetCardEligibilityUseCase = this;
                        if (it.hasNext()) {
                            obj8 = coroutine_suspended;
                            payPalGetCardEligibilityUseCase$invoke$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list4);
                            payPalGetCardEligibilityUseCase$invoke$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            payPalGetCardEligibilityUseCase$invoke$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list3);
                            payPalGetCardEligibilityUseCase$invoke$12.getOutputMinFrameDurationlomOqCM = null;
                            payPalGetCardEligibilityUseCase$invoke$12.getOutputSizeshNQ4ISI = null;
                            payPalGetCardEligibilityUseCase$invoke$12.getOutputStallDuration = null;
                            payPalGetCardEligibilityUseCase$invoke$12.getOutputSizes = null;
                            payPalGetCardEligibilityUseCase$invoke$12.getOutputStallDurationlomOqCM = null;
                            payPalGetCardEligibilityUseCase$invoke$12.unwrapAs = null;
                            payPalGetCardEligibilityUseCase$invoke$12.toString = null;
                            payPalGetCardEligibilityUseCase$invoke$12.getHighSpeedVideoSizesFor = null;
                            payPalGetCardEligibilityUseCase$invoke$12.getInputSizeshNQ4ISI = null;
                            payPalGetCardEligibilityUseCase$invoke$12.isOutputSupportedFor = 2;
                            java.lang.Object cardEligibility = payPalCardRepository.getCardEligibility((java.util.List) arrayList, str2, list3, payPalGetCardEligibilityUseCase$invoke$12);
                            if (cardEligibility != obj8) {
                                return cardEligibility;
                            }
                        }
                    }
                }
                return obj8;
            }
        }
        payPalGetCardEligibilityUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase$invoke$1(payPalGetCardEligibilityUseCase, continuation);
        java.lang.Object obj42 = payPalGetCardEligibilityUseCase$invoke$1.isOutputSupportedForhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payPalGetCardEligibilityUseCase$invoke$1.isOutputSupportedFor;
        if (i != 0) {
        }
    }
}
