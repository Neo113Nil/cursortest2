package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class BusinessSelectItemsScreenKt$BusinessSelectItemsScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineItem, "");
        ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel) this.receiver).increaseItemQuantity(lineItem);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        getHighSpeedVideoSizes(lineItem);
        return kotlin.Unit.INSTANCE;
    }

    BusinessSelectItemsScreenKt$BusinessSelectItemsScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel.class, "increaseItemQuantity", "increaseItemQuantity(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;)V", 0);
    }
}
