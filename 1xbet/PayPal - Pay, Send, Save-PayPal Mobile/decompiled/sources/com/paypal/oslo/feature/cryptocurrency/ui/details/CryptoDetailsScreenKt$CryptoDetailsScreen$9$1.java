package com.paypal.oslo.feature.cryptocurrency.ui.details;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class CryptoDetailsScreenKt$CryptoDetailsScreen$9$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent assetPriceDetailsEvent) {
        com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEvent assetPriceDetailsEvent2 = assetPriceDetailsEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetPriceDetailsEvent2, "");
        ((com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel) this.receiver).handleEvent$cryptocurrency_prodRelease(assetPriceDetailsEvent2);
        return kotlin.Unit.INSTANCE;
    }

    CryptoDetailsScreenKt$CryptoDetailsScreen$9$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.class, "handleEvent", "handleEvent$cryptocurrency_prodRelease(Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEvent;)V", 0);
    }
}
