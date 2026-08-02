package com.paypal.oslo.feature.taptopay.data.payair.card;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource", f = "CardStateDataSource.kt", i = {0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, m = "updateStateChange", n = {"cards", "$this$withLock_u24default$iv", "$i$f$withLock"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class CardStateDataSource$updateStateChange$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputFormats.Camera2StreamConfigurationMap(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardStateDataSource$updateStateChange$1(com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource cardStateDataSource, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource$updateStateChange$1> continuation) {
        super(continuation);
        this.getInputFormats = cardStateDataSource;
    }
}
