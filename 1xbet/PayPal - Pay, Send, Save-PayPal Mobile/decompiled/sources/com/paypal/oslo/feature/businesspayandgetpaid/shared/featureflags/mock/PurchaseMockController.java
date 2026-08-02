package com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0012\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR)\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f0\u000b8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\"\u0010!\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/featureflags/mock/PurchaseMockController;", "", "<init>", "()V", "", "purchaseId", "", "isDemoPurchase", "(Ljava/lang/String;)Z", "DEMO_PURCHASE_ID", "Ljava/lang/String;", "", "Lkotlin/Pair;", "demoPurchases", "Ljava/util/List;", "getDemoPurchases", "()Ljava/util/List;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoSizes", "useMockEnabled", "Z", "getUseMockEnabled", "()Z", "setUseMockEnabled", "(Z)V", "simulateLoadError", "getSimulateLoadError", "setSimulateLoadError", "simulateSendReceiptError", "getSimulateSendReceiptError", "setSimulateSendReceiptError", "simulateRefundError", "getSimulateRefundError", "setSimulateRefundError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PurchaseMockController {
    public static final int $stable;
    public static final java.lang.String DEMO_PURCHASE_ID = "DEMO-PURCHASE-001";
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock.PurchaseMockController INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock.PurchaseMockController();
    private static final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> demoPurchases;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.Set<java.lang.String> getHighSpeedVideoSizes;
    private static boolean simulateLoadError;
    private static boolean simulateRefundError;
    private static boolean simulateSendReceiptError;
    private static boolean useMockEnabled;

    private PurchaseMockController() {
    }

    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getDemoPurchases() {
        return demoPurchases;
    }

    static {
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to(DEMO_PURCHASE_ID, "PAID / USD / 2 items / tax + discount + fee"), kotlin.TuplesKt.to("DEMO-PURCHASE-002", "DRAFT / USD / 1 item / no tax"), kotlin.TuplesKt.to("DEMO-PURCHASE-003", "SENT / USD / 1 item / tax 8.5%"), kotlin.TuplesKt.to("DEMO-PURCHASE-004", "PAID / EUR / 3 items / VAT 21% + fee"), kotlin.TuplesKt.to("DEMO-PURCHASE-005", "PAID / GBP / 1 item / fixed discount + fee"), kotlin.TuplesKt.to("DEMO-PURCHASE-006", "PAID / USD / 5 items / tax + discount + fee"), kotlin.TuplesKt.to("DEMO-PURCHASE-007", "PENDING_CONFIRMATION / USD / 1 item"), kotlin.TuplesKt.to("DEMO-PURCHASE-008", "PENDING_CONFIRMATION / SEK / 2 items / Moms 25%"), kotlin.TuplesKt.to("DEMO-PURCHASE-009", "REFUNDED / USD / 1 item / tax + fee"), kotlin.TuplesKt.to("DEMO-PURCHASE-010", "PENDING_REFUND / USD / 2 items / discount + fee"), kotlin.TuplesKt.to("DEMO-PURCHASE-011", "REFUND / USD / links to 009"), kotlin.TuplesKt.to("DEMO-PURCHASE-012", "REFUND / EUR / no tax/fee"), kotlin.TuplesKt.to("DEMO-PURCHASE-013", "PAID / JPY / 2 items / 0-decimal currency"), kotlin.TuplesKt.to("DEMO-PURCHASE-014", "PAID / USD / high value $12k / tax + discount"), kotlin.TuplesKt.to("DEMO-PURCHASE-015", "DRAFT / EUR / 3 items / freelance"), kotlin.TuplesKt.to("DEMO-PURCHASE-016", "SENT / GBP / 1 item / discount, no tax"), kotlin.TuplesKt.to("DEMO-PURCHASE-017", "PAID / USD / tiny amount $1.50"), kotlin.TuplesKt.to("DEMO-PURCHASE-018", "PAID / USD / 2 items / qty > 1"), kotlin.TuplesKt.to("DEMO-PURCHASE-019", "REFUND / USD / 2 items / links to 010"), kotlin.TuplesKt.to("DEMO-PURCHASE-020", "PAID / USD / 1 item / no tax, has fee")});
        demoPurchases = listOf;
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list = listOf;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((kotlin.Pair) it.next()).getFirst());
        }
        getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.toSet(arrayList);
        $stable = 8;
    }

    public final boolean isDemoPurchase(java.lang.String purchaseId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchaseId, "");
        return getHighSpeedVideoSizes.contains(purchaseId);
    }

    public final boolean getUseMockEnabled() {
        return useMockEnabled;
    }

    public final void setUseMockEnabled(boolean z) {
        useMockEnabled = z;
    }

    public final boolean getSimulateLoadError() {
        return simulateLoadError;
    }

    public final void setSimulateLoadError(boolean z) {
        simulateLoadError = z;
    }

    public final boolean getSimulateSendReceiptError() {
        return simulateSendReceiptError;
    }

    public final void setSimulateSendReceiptError(boolean z) {
        simulateSendReceiptError = z;
    }

    public final boolean getSimulateRefundError() {
        return simulateRefundError;
    }

    public final void setSimulateRefundError(boolean z) {
        simulateRefundError = z;
    }
}
