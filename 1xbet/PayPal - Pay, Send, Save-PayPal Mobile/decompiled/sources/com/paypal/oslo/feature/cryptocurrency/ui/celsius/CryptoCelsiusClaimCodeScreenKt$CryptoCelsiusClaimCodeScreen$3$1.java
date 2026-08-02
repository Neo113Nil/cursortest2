package com.paypal.oslo.feature.cryptocurrency.ui.celsius;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent cryptoCelsiusClaimCodeEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoCelsiusClaimCodeEvent, "");
        ((com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel) this.receiver).handleEvent(cryptoCelsiusClaimCodeEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEvent cryptoCelsiusClaimCodeEvent) {
        getHighSpeedVideoFpsRanges(cryptoCelsiusClaimCodeEvent);
        return kotlin.Unit.INSTANCE;
    }

    CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel.class, "handleEvent", "handleEvent(Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEvent;)V", 0);
    }
}
