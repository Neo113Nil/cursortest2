package com.paypal.oslo.feature.businesshome.ui.home;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/FakeInsightsData;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/businesshome/ui/home/InsightsUiData$SalesInsight;", "getSalesInsight", "()Lcom/paypal/oslo/feature/businesshome/ui/home/InsightsUiData$SalesInsight;", "Lcom/paypal/oslo/feature/businesshome/ui/home/InsightsUiData$InvoiceInsight;", "getInvoiceInsight", "()Lcom/paypal/oslo/feature/businesshome/ui/home/InsightsUiData$InvoiceInsight;", "Lcom/paypal/oslo/feature/businesshome/ui/home/InsightsUiData$FrequentlyPurchased;", "getFrequentlyPurchased", "()Lcom/paypal/oslo/feature/businesshome/ui/home/InsightsUiData$FrequentlyPurchased;", "Lcom/paypal/oslo/feature/businesshome/ui/home/InsightsUiData$TopItems;", "getTopItems", "()Lcom/paypal/oslo/feature/businesshome/ui/home/InsightsUiData$TopItems;", "Lcom/paypal/oslo/feature/businesshome/ui/home/InsightsUiData$TtpInsight;", "getTtpInsight", "()Lcom/paypal/oslo/feature/businesshome/ui/home/InsightsUiData$TtpInsight;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FakeInsightsData {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.businesshome.ui.home.FakeInsightsData INSTANCE = new com.paypal.oslo.feature.businesshome.ui.home.FakeInsightsData();

    private FakeInsightsData() {
    }

    public final com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData.SalesInsight getSalesInsight() {
        return new com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData.SalesInsight(new com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData.SalesInsight.SalesVolume("7.1", true), "87% of customers surveyed believe that PayPal Working Capital loan helped increase their sales revenue.");
    }

    public final com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData.InvoiceInsight getInvoiceInsight() {
        return new com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData.InvoiceInsight("Your invoices are overdue", "80% of the time");
    }

    public final com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData.FrequentlyPurchased getFrequentlyPurchased() {
        return new com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData.FrequentlyPurchased("Most frequently purchased", "Purchased together 23 times", new kotlin.Pair(new com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData.Item("Custom table", com.paypal.oslo.feature.businesshome.R.drawable.feature_business_home_furniture_table, "brown", null, null, 24, null), new com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData.Item("Custom sofa chair", com.paypal.oslo.feature.businesshome.R.drawable.feature_business_home_furniture_sofa_chair, "brown", null, null, 24, null)));
    }

    public final com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData.TopItems getTopItems() {
        return new com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData.TopItems("Your top items this month", new kotlin.Pair(new com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData.Item("Custom table", com.paypal.oslo.feature.businesshome.R.drawable.feature_business_home_furniture_table, null, "$299", "15 sold", 4, null), new com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData.Item("Custom sofa chair", com.paypal.oslo.feature.businesshome.R.drawable.feature_business_home_furniture_sofa_chair, null, "$499", "8 sold", 4, null)));
    }

    public final com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData.TtpInsight getTtpInsight() {
        return new com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData.TtpInsight("Tap to Pay now represents", "35% of sales");
    }
}
