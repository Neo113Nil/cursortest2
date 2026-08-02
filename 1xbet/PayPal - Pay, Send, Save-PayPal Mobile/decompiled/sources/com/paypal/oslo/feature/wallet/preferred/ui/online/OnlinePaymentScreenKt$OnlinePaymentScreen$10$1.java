package com.paypal.oslo.feature.wallet.preferred.ui.online;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class OnlinePaymentScreenKt$OnlinePaymentScreen$10$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.String, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        ((com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel) this.receiver).onPaymentMethodSelect(str, fundingInstrumentType);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType) {
        Camera2StreamConfigurationMap(str, fundingInstrumentType);
        return kotlin.Unit.INSTANCE;
    }

    OnlinePaymentScreenKt$OnlinePaymentScreen$10$1(java.lang.Object obj) {
        super(2, obj, com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.class, "onPaymentMethodSelect", "onPaymentMethodSelect(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;)V", 0);
    }
}
