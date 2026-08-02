package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;", "ids", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardArtUseCase;", "payPalGetCardArtUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardInfoUseCase;", "payPalGetCardInfoUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "toPayPalDigitizedCards", "(Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardArtUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardInfoUseCase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;", "p0", "p1", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardArtUseCase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalCardExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0291 -> B:11:0x02a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x02be -> B:12:0x02ce). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object toPayPalDigitizedCards(java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> list, java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup> list2, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase payPalGetCardArtUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardExtensionsKt$toPayPalDigitizedCards$1 payPalCardExtensionsKt$toPayPalDigitizedCards$1;
        int i;
        java.lang.Iterable iterable;
        java.lang.Iterable iterable2;
        java.lang.Iterable iterable3;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardExtensionsKt$toPayPalDigitizedCards$1 payPalCardExtensionsKt$toPayPalDigitizedCards$12;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        int i2;
        int i3;
        int i4;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> list3;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup> list4;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase payPalGetCardArtUseCase2;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase2;
        int i5;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Iterable iterable4;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard;
        int i6;
        java.lang.Object obj3;
        java.lang.Iterable iterable5;
        java.lang.Iterable iterable6;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId;
        int i7;
        int i8;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase3;
        int i9;
        java.util.ArrayList arrayList2;
        int i10;
        java.util.Iterator it2;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase payPalGetCardArtUseCase3;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> list5;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup> list6;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard2;
        java.lang.Object invoke;
        java.lang.Object obj4;
        java.lang.Object obj5;
        int i11;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup2;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardExtensionsKt$toPayPalDigitizedCards$1) {
            payPalCardExtensionsKt$toPayPalDigitizedCards$1 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardExtensionsKt$toPayPalDigitizedCards$1) continuation;
            if ((payPalCardExtensionsKt$toPayPalDigitizedCards$1.CoroutineDebuggingKt & Integer.MIN_VALUE) != 0) {
                payPalCardExtensionsKt$toPayPalDigitizedCards$1.CoroutineDebuggingKt -= 2147483648;
                java.lang.Object obj6 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.coroutineBoundary;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payPalCardExtensionsKt$toPayPalDigitizedCards$1.CoroutineDebuggingKt;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj6);
                    java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> list7 = list;
                    iterable = list7;
                    iterable2 = iterable;
                    iterable3 = iterable2;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12 = payPalCardExtensionsKt$toPayPalDigitizedCards$1;
                    arrayList = new java.util.ArrayList();
                    it = list7.iterator();
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    list3 = list;
                    list4 = list2;
                    payPalGetCardArtUseCase2 = payPalGetCardArtUseCase;
                    payPalGetCardInfoUseCase2 = payPalGetCardInfoUseCase;
                    if (!it.hasNext()) {
                    }
                } else if (i == 1) {
                    int i12 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.getOutputMinFrameDuration;
                    int i13 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.getHighSpeedVideoFpsRanges;
                    int i14 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.getHighSpeedVideoSizes;
                    i10 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i15 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.getHighSpeedVideoFpsRangesFor;
                    int i16 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId) payPalCardExtensionsKt$toPayPalDigitizedCards$1.getOutputStallDuration;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) payPalCardExtensionsKt$toPayPalDigitizedCards$1.getOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard3 = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) payPalCardExtensionsKt$toPayPalDigitizedCards$1.getOutputStallDurationlomOqCM;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) payPalCardExtensionsKt$toPayPalDigitizedCards$1.getOutputMinFrameDurationlomOqCM;
                    com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard4 = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) payPalCardExtensionsKt$toPayPalDigitizedCards$1.getInputFormats;
                    java.lang.Object obj7 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.getOutputFormats;
                    java.lang.Object obj8 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.accessartificialFrame;
                    java.util.Iterator it3 = (java.util.Iterator) payPalCardExtensionsKt$toPayPalDigitizedCards$1.ArtificialStackFrames;
                    java.lang.Iterable iterable7 = (java.lang.Iterable) payPalCardExtensionsKt$toPayPalDigitizedCards$1.coroutineCreation;
                    ?? r3 = (java.util.Collection) payPalCardExtensionsKt$toPayPalDigitizedCards$1.toString;
                    iterable6 = (java.lang.Iterable) payPalCardExtensionsKt$toPayPalDigitizedCards$1.isOutputSupportedFor;
                    iterable5 = (java.lang.Iterable) payPalCardExtensionsKt$toPayPalDigitizedCards$1.unwrapAs;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase4 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase) payPalCardExtensionsKt$toPayPalDigitizedCards$1.isOutputSupportedForhNQ4ISI;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase payPalGetCardArtUseCase4 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase) payPalCardExtensionsKt$toPayPalDigitizedCards$1.getValidOutputFormatsForInputhNQ4ISI;
                    java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup> list8 = (java.util.List) payPalCardExtensionsKt$toPayPalDigitizedCards$1.getHighSpeedVideoSizesFor;
                    list5 = (java.util.List) payPalCardExtensionsKt$toPayPalDigitizedCards$1.getInputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj6);
                    iterable4 = iterable7;
                    obj2 = obj7;
                    obj = obj8;
                    deviceWalletServiceCardId = deviceWalletServiceCardId2;
                    cardIdGroup = cardIdGroup3;
                    payPalGetCardInfoUseCase3 = payPalGetCardInfoUseCase4;
                    obj3 = coroutine_suspended;
                    i7 = i16;
                    list6 = list8;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12 = payPalCardExtensionsKt$toPayPalDigitizedCards$1;
                    digitizedCard2 = digitizedCard3;
                    digitizedCard = digitizedCard4;
                    i8 = i15;
                    payPalCardId = payPalCardId2;
                    arrayList2 = r3;
                    i9 = i14;
                    it2 = it3;
                    i6 = i12;
                    i5 = i13;
                    payPalGetCardArtUseCase3 = payPalGetCardArtUseCase4;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection) obj6;
                    int i17 = i9;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId3 = cardIdGroup.getPayPalCardId();
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list5);
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.getHighSpeedVideoSizesFor = list6;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.getValidOutputFormatsForInputhNQ4ISI = payPalGetCardArtUseCase3;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.isOutputSupportedForhNQ4ISI = payPalGetCardInfoUseCase3;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.unwrapAs = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable5);
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable6);
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.toString = arrayList2;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.coroutineCreation = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable4);
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.ArtificialStackFrames = it2;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.accessartificialFrame = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCard);
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardIdGroup);
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputStallDurationlomOqCM = digitizedCard2;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputSizeshNQ4ISI = deviceWalletServiceCardId;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputStallDuration = payPalCardId;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputSizes = cardArtCollection;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.Camera2StreamConfigurationMap = i7;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.getHighSpeedVideoFpsRangesFor = i8;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.getHighResolutionOutputSizeshNQ4ISI = i10;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.getHighSpeedVideoSizes = i17;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.getHighSpeedVideoFpsRanges = i5;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputMinFrameDuration = i6;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12.CoroutineDebuggingKt = 2;
                    invoke = payPalGetCardInfoUseCase3.invoke(payPalCardId3, payPalCardExtensionsKt$toPayPalDigitizedCards$12);
                    obj4 = obj3;
                    if (invoke != obj4) {
                    }
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i18 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.getOutputMinFrameDuration;
                    int i19 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.getHighSpeedVideoFpsRanges;
                    int i20 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.getHighSpeedVideoSizes;
                    int i21 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i22 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.getHighSpeedVideoFpsRangesFor;
                    int i23 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection) payPalCardExtensionsKt$toPayPalDigitizedCards$1.getOutputSizes;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId4 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId) payPalCardExtensionsKt$toPayPalDigitizedCards$1.getOutputStallDuration;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) payPalCardExtensionsKt$toPayPalDigitizedCards$1.getOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard5 = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) payPalCardExtensionsKt$toPayPalDigitizedCards$1.getOutputStallDurationlomOqCM;
                    java.lang.Object obj9 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.getOutputFormats;
                    java.lang.Object obj10 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.accessartificialFrame;
                    java.util.Iterator it4 = (java.util.Iterator) payPalCardExtensionsKt$toPayPalDigitizedCards$1.ArtificialStackFrames;
                    java.lang.Iterable iterable8 = (java.lang.Iterable) payPalCardExtensionsKt$toPayPalDigitizedCards$1.coroutineCreation;
                    ?? r15 = (java.util.Collection) payPalCardExtensionsKt$toPayPalDigitizedCards$1.toString;
                    java.lang.Iterable iterable9 = (java.lang.Iterable) payPalCardExtensionsKt$toPayPalDigitizedCards$1.isOutputSupportedFor;
                    iterable = (java.lang.Iterable) payPalCardExtensionsKt$toPayPalDigitizedCards$1.unwrapAs;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase5 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase) payPalCardExtensionsKt$toPayPalDigitizedCards$1.isOutputSupportedForhNQ4ISI;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase payPalGetCardArtUseCase5 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase) payPalCardExtensionsKt$toPayPalDigitizedCards$1.getValidOutputFormatsForInputhNQ4ISI;
                    java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup> list9 = (java.util.List) payPalCardExtensionsKt$toPayPalDigitizedCards$1.getHighSpeedVideoSizesFor;
                    list5 = (java.util.List) payPalCardExtensionsKt$toPayPalDigitizedCards$1.getInputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj6);
                    iterable6 = iterable9;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection3 = cardArtCollection2;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId5 = payPalCardId4;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId4 = deviceWalletServiceCardId3;
                    com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard6 = digitizedCard5;
                    arrayList = r15;
                    payPalGetCardArtUseCase3 = payPalGetCardArtUseCase5;
                    obj4 = coroutine_suspended;
                    payPalGetCardInfoUseCase3 = payPalGetCardInfoUseCase5;
                    i10 = i21;
                    list6 = list9;
                    i3 = i22;
                    i2 = i23;
                    iterable3 = iterable8;
                    payPalCardExtensionsKt$toPayPalDigitizedCards$12 = payPalCardExtensionsKt$toPayPalDigitizedCards$1;
                    list4 = list6;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard(payPalCardId5, deviceWalletServiceCardId4, digitizedCard6, cardArtCollection3, (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) obj6);
                    list3 = list5;
                    payPalGetCardArtUseCase2 = payPalGetCardArtUseCase3;
                    payPalGetCardInfoUseCase2 = payPalGetCardInfoUseCase3;
                    it = it4;
                    i4 = i10;
                    iterable2 = iterable6;
                    if (payPalDigitizedCard != null) {
                        arrayList.add(payPalDigitizedCard);
                    }
                    coroutine_suspended = obj4;
                    if (!it.hasNext()) {
                        java.lang.Object next = it.next();
                        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard7 = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) next;
                        java.util.Iterator it5 = list4.iterator();
                        while (true) {
                            obj5 = coroutine_suspended;
                            if (!it5.hasNext()) {
                                i11 = i4;
                                cardIdGroup2 = 0;
                                break;
                            }
                            cardIdGroup2 = it5.next();
                            i11 = i4;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) cardIdGroup2).getDigitizedCardId().getId(), digitizedCard7.getCardId())) {
                                break;
                            }
                            coroutine_suspended = obj5;
                            i4 = i11;
                        }
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup4 = cardIdGroup2;
                        if (cardIdGroup4 != null) {
                            payPalCardId = cardIdGroup4.getPayPalCardId();
                            int i24 = i3;
                            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId5 = cardIdGroup4.getDeviceWalletServiceCardId();
                            int i25 = i2;
                            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId6 = cardIdGroup4.getPayPalCardId();
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list3);
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getHighSpeedVideoSizesFor = list4;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getValidOutputFormatsForInputhNQ4ISI = payPalGetCardArtUseCase2;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.isOutputSupportedForhNQ4ISI = payPalGetCardInfoUseCase2;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.unwrapAs = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable2);
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.toString = arrayList;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.coroutineCreation = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable3);
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.ArtificialStackFrames = it;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.accessartificialFrame = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCard7);
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputMinFrameDurationlomOqCM = cardIdGroup4;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputStallDurationlomOqCM = digitizedCard7;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputSizeshNQ4ISI = deviceWalletServiceCardId5;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputStallDuration = payPalCardId;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputSizes = null;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.Camera2StreamConfigurationMap = i25;
                            java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> list10 = list3;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getHighSpeedVideoFpsRangesFor = i24;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getHighResolutionOutputSizeshNQ4ISI = i11;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getHighSpeedVideoSizes = 0;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getHighSpeedVideoFpsRanges = 0;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputMinFrameDuration = 0;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.CoroutineDebuggingKt = 1;
                            obj6 = getHighResolutionOutputSizeshNQ4ISI(payPalCardId6, payPalGetCardArtUseCase2, payPalCardExtensionsKt$toPayPalDigitizedCards$12);
                            java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup> list11 = list4;
                            if (obj6 == obj5) {
                                return obj5;
                            }
                            obj3 = obj5;
                            iterable5 = iterable;
                            iterable4 = iterable3;
                            arrayList2 = arrayList;
                            it2 = it;
                            obj2 = next;
                            obj = obj2;
                            digitizedCard2 = digitizedCard7;
                            digitizedCard = digitizedCard2;
                            i9 = 0;
                            cardIdGroup = cardIdGroup4;
                            payPalGetCardInfoUseCase3 = payPalGetCardInfoUseCase2;
                            deviceWalletServiceCardId = deviceWalletServiceCardId5;
                            list6 = list11;
                            payPalGetCardArtUseCase3 = payPalGetCardArtUseCase2;
                            i7 = i25;
                            i8 = i24;
                            list5 = list10;
                            iterable6 = iterable2;
                            i10 = i11;
                            i5 = 0;
                            i6 = 0;
                            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection4 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection) obj6;
                            int i172 = i9;
                            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId32 = cardIdGroup.getPayPalCardId();
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list5);
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getHighSpeedVideoSizesFor = list6;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getValidOutputFormatsForInputhNQ4ISI = payPalGetCardArtUseCase3;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.isOutputSupportedForhNQ4ISI = payPalGetCardInfoUseCase3;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.unwrapAs = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable5);
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable6);
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.toString = arrayList2;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.coroutineCreation = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable4);
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.ArtificialStackFrames = it2;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.accessartificialFrame = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCard);
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardIdGroup);
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputStallDurationlomOqCM = digitizedCard2;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputSizeshNQ4ISI = deviceWalletServiceCardId;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputStallDuration = payPalCardId;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputSizes = cardArtCollection4;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.Camera2StreamConfigurationMap = i7;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getHighSpeedVideoFpsRangesFor = i8;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getHighResolutionOutputSizeshNQ4ISI = i10;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getHighSpeedVideoSizes = i172;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getHighSpeedVideoFpsRanges = i5;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.getOutputMinFrameDuration = i6;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12.CoroutineDebuggingKt = 2;
                            invoke = payPalGetCardInfoUseCase3.invoke(payPalCardId32, payPalCardExtensionsKt$toPayPalDigitizedCards$12);
                            obj4 = obj3;
                            if (invoke != obj4) {
                                return obj4;
                            }
                            digitizedCard6 = digitizedCard2;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$1 = payPalCardExtensionsKt$toPayPalDigitizedCards$12;
                            i23 = i7;
                            payPalCardId5 = payPalCardId;
                            deviceWalletServiceCardId4 = deviceWalletServiceCardId;
                            iterable8 = iterable4;
                            cardArtCollection3 = cardArtCollection4;
                            it4 = it2;
                            obj6 = invoke;
                            iterable = iterable5;
                            arrayList = arrayList2;
                            i22 = i8;
                            i3 = i22;
                            i2 = i23;
                            iterable3 = iterable8;
                            payPalCardExtensionsKt$toPayPalDigitizedCards$12 = payPalCardExtensionsKt$toPayPalDigitizedCards$1;
                            list4 = list6;
                            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard(payPalCardId5, deviceWalletServiceCardId4, digitizedCard6, cardArtCollection3, (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) obj6);
                            list3 = list5;
                            payPalGetCardArtUseCase2 = payPalGetCardArtUseCase3;
                            payPalGetCardInfoUseCase2 = payPalGetCardInfoUseCase3;
                            it = it4;
                            i4 = i10;
                            iterable2 = iterable6;
                            if (payPalDigitizedCard2 != null) {
                            }
                            coroutine_suspended = obj4;
                            if (!it.hasNext()) {
                                return arrayList;
                            }
                        } else {
                            obj4 = obj5;
                            payPalDigitizedCard2 = null;
                            i4 = i11;
                            i2 = i2;
                            list3 = list3;
                            if (payPalDigitizedCard2 != null) {
                            }
                            coroutine_suspended = obj4;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        payPalCardExtensionsKt$toPayPalDigitizedCards$1 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardExtensionsKt$toPayPalDigitizedCards$1(continuation);
        java.lang.Object obj62 = payPalCardExtensionsKt$toPayPalDigitizedCards$1.coroutineBoundary;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payPalCardExtensionsKt$toPayPalDigitizedCards$1.CoroutineDebuggingKt;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase payPalGetCardArtUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection> continuation) {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardExtensionsKt$getCardArtCollection$1 payPalCardExtensionsKt$getCardArtCollection$1;
        int i;
        arrow.core.Either either;
        java.lang.String debugMessage;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardExtensionsKt$getCardArtCollection$1) {
            payPalCardExtensionsKt$getCardArtCollection$1 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardExtensionsKt$getCardArtCollection$1) continuation;
            if ((payPalCardExtensionsKt$getCardArtCollection$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                payPalCardExtensionsKt$getCardArtCollection$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = payPalCardExtensionsKt$getCardArtCollection$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payPalCardExtensionsKt$getCardArtCollection$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    payPalCardExtensionsKt$getCardArtCollection$1.getHighSpeedVideoSizes = payPalCardId;
                    payPalCardExtensionsKt$getCardArtCollection$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalGetCardArtUseCase);
                    payPalCardExtensionsKt$getCardArtCollection$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = payPalGetCardArtUseCase.invoke(payPalCardId, payPalCardExtensionsKt$getCardArtCollection$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    payPalCardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId) payPalCardExtensionsKt$getCardArtCollection$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection) ((arrow.core.Either.Right) either).getValue();
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardArtError payPalGetCardArtError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardArtError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    pairArr[0] = kotlin.TuplesKt.to("paypal_card_id", payPalCardId.getId());
                    if (kotlin.jvm.internal.Intrinsics.areEqual(payPalGetCardArtError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardArtError.CardArtNotFound.INSTANCE)) {
                        debugMessage = "card art not found";
                    } else {
                        if (!(payPalGetCardArtError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardArtError.DefaultError)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        debugMessage = ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardArtError.DefaultError) payPalGetCardArtError).getDebugMessage();
                    }
                    pairArr[1] = kotlin.TuplesKt.to("error", debugMessage);
                    com.paypal.android.logger.Logger.w$default(logger, "Failed to get card art.", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    return null;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        payPalCardExtensionsKt$getCardArtCollection$1 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardExtensionsKt$getCardArtCollection$1(continuation);
        java.lang.Object obj2 = payPalCardExtensionsKt$getCardArtCollection$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payPalCardExtensionsKt$getCardArtCollection$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
