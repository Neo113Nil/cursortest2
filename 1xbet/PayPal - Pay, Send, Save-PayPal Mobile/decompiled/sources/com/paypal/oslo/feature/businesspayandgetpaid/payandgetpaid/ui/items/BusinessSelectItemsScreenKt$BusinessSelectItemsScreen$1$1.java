package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class BusinessSelectItemsScreenKt$BusinessSelectItemsScreen$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineItem, "");
        ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel) this.receiver).decreaseItemQuantity(lineItem);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        Camera2StreamConfigurationMap(lineItem);
        return kotlin.Unit.INSTANCE;
    }

    BusinessSelectItemsScreenKt$BusinessSelectItemsScreen$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel.class, "decreaseItemQuantity", "decreaseItemQuantity(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;)V", 0);
    }
}
