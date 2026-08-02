package com.paypal.oslo.feature.businesshome.ui.home;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/FakeBusinessInsightsCardData;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card$BusinessInsights;", "getBusinessInsightsCard", "()Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card$BusinessInsights;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FakeBusinessInsightsCardData {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.businesshome.ui.home.FakeBusinessInsightsCardData INSTANCE = new com.paypal.oslo.feature.businesshome.ui.home.FakeBusinessInsightsCardData();

    private FakeBusinessInsightsCardData() {
    }

    public final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.BusinessInsights getBusinessInsightsCard() {
        return new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.BusinessInsights(new com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData(com.paypal.oslo.feature.businesshome.ui.home.FakeInsightsData.INSTANCE.getSalesInsight(), com.paypal.oslo.feature.businesshome.ui.home.FakeInsightsData.INSTANCE.getInvoiceInsight(), com.paypal.oslo.feature.businesshome.ui.home.FakeInsightsData.INSTANCE.getFrequentlyPurchased(), com.paypal.oslo.feature.businesshome.ui.home.FakeInsightsData.INSTANCE.getTopItems(), com.paypal.oslo.feature.businesshome.ui.home.FakeInsightsData.INSTANCE.getTtpInsight()), null, 2, null);
    }
}
