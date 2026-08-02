package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/iab/ui/benefit/BenefitDetailsUiData;", "payInFourBenefitsData", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/iab/ui/benefit/BenefitDetailsUiData;", "getPayInFourBenefitsData", "()Lcom/paypal/oslo/feature/shoppingrewards/shopping/iab/ui/benefit/BenefitDetailsUiData;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BenefitDetailsUiDataKt {
    private static final com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitDetailsUiData payInFourBenefitsData = new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitDetailsUiData("https://www.paypalobjects.com/shopping/oslo/shopping_bag.png", "https://www.paypalobjects.com/shopping/oslo/nike_logo.png", com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitDetailsUiDataKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitDetailsUiDataKt.$r8$lambda$rxAFZTNx97QXWR4NNffWqOMvuUo((com.paypal.pds.core.Builder) obj);
        }
    }), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData("Pay in 4, interest-free.", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem[]{new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem(com.paypal.pds.core.Icon.Cart.INSTANCE, "First payment due today, next payments due every 2 weeks."), new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem(com.paypal.pds.core.Icon.CurrencyUsdCircle.INSTANCE, "No late fees, no impact to your credit score.")}), null, null, 12, null)), "Subject to approval.");

    public static final com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitDetailsUiData getPayInFourBenefitsData() {
        return payInFourBenefitsData;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rxAFZTNx97QXWR4NNffWqOMvuUo(com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, "Your Pay Later benefits at ", com.paypal.pds.core.Color.ContentBase.INSTANCE, false, 4, null);
        com.paypal.pds.core.Builder.append$default(builder, "Nike", com.paypal.pds.core.Color.ContentRoleBaseInfo.INSTANCE, false, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
