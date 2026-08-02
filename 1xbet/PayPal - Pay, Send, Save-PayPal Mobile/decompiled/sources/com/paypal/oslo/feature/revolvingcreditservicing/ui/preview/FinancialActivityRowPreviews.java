package com.paypal.oslo.feature.revolvingcreditservicing.ui.preview;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJG\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/preview/FinancialActivityRowPreviews;", "", "<init>", "()V", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/specialfinancing/uimodel/SpecialFinancingItemUiModel;", "createSpecialFinancingList$revolvingcredit_servicing_prodRelease", "(I)Ljava/util/List;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/specialfinancing/uimodel/SpecialFinancingItemUiModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FinancialActivityRowPreviews {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.preview.FinancialActivityRowPreviews INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.preview.FinancialActivityRowPreviews();

    private FinancialActivityRowPreviews() {
    }

    public static /* synthetic */ java.util.List createSpecialFinancingList$revolvingcredit_servicing_prodRelease$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.preview.FinancialActivityRowPreviews financialActivityRowPreviews, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        return financialActivityRowPreviews.createSpecialFinancingList$revolvingcredit_servicing_prodRelease(i);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel> createSpecialFinancingList$revolvingcredit_servicing_prodRelease(int size) {
        return kotlin.collections.CollectionsKt.take(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel[]{getHighSpeedVideoFpsRangesFor("nike-row-0", "Nike", "$127.01", "June 26, 2024", "$350.00", "December 26, 2024", "$28.45"), getHighSpeedVideoFpsRangesFor("apple-row-1", "Apple", "$350.00", "July 15, 2024", "$999.00", "January 15, 2025", "$62.15"), getHighSpeedVideoFpsRangesFor("bestbuy-row-2", "Best Buy", "$89.99", "September 30, 2024", "$1,299.00", "March 30, 2025", "$45.23"), getHighSpeedVideoFpsRangesFor("amazon-row-3", "Amazon", "$450.50", "December 1, 2024", "$1,850.00", "June 1, 2025", "$112.34"), getHighSpeedVideoFpsRangesFor("target-row-4", "Target", "$275.25", "February 10, 2025", "$500.00", "August 10, 2025", "$0.00")}), size);
    }

    private static com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel getHighSpeedVideoFpsRangesFor(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(p1);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("No interest if paid in full\nby ".concat(java.lang.String.valueOf(p5)));
        java.lang.String substringBefore$default = kotlin.text.StringsKt.substringBefore$default(p0, "-", (java.lang.String) null, 2, (java.lang.Object) null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("https://preview.url/");
        sb.append(substringBefore$default);
        sb.append("-logo.png");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel(p0, plainString, plainString2, sb.toString(), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(p2), p3, p4, p5, p6, true, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Remaining \nbalance"));
    }
}
