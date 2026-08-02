package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$mapCardIdData$2", f = "LocalPayPalCardDatabaseRepository.kt", i = {}, l = {90, 97}, m = "invokeSuspend", n = {}, nl = {97, 107}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class LocalPayPalCardDatabaseRepository$mapCardIdData$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0098, code lost:
    
        if (r12.addCardInfo(new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData(r4, r5, r6, r7, java.lang.String.valueOf(r8), r1), r11) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository.access$getCardIdGroupDao(r11.getHighResolutionOutputSizeshNQ4ISI).addCardIdGroupEntity(new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity(r11.Camera2StreamConfigurationMap.getPayPalCardId().getId(), r11.Camera2StreamConfigurationMap.getDigitizedCardId().getId(), r11.Camera2StreamConfigurationMap.getDeviceWalletServiceCardId().getId()), r11) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Map Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardInfoDao access$getCardInfoDao = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository.access$getCardInfoDao(this.getHighResolutionOutputSizeshNQ4ISI);
        java.lang.String id = this.Camera2StreamConfigurationMap.getPayPalCardId().getId();
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType type = this.getHighSpeedVideoFpsRangesFor.getType();
        java.lang.String brand = this.getHighSpeedVideoFpsRangesFor.getBrand();
        java.lang.String description = this.getHighSpeedVideoFpsRangesFor.getDescription();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository localPayPalCardDatabaseRepository = this.getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoSizes = 2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$mapCardIdData$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$mapCardIdData$2(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalPayPalCardDatabaseRepository$mapCardIdData$2(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository localPayPalCardDatabaseRepository, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$mapCardIdData$2> continuation) {
        super(1, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = localPayPalCardDatabaseRepository;
        this.Camera2StreamConfigurationMap = cardIdGroup;
        this.getHighSpeedVideoFpsRangesFor = cardInfo;
    }
}
