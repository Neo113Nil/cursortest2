package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\bD\b\u0080\b\u0018\u0000 W2\u00020\u0001:\u0001WBé\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010 J\u0012\u0010/\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b1\u0010\"J\u0010\u00102\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b2\u0010\"J\u0010\u00103\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b3\u0010\"J\u0010\u00104\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b4\u0010\"J\u0010\u00105\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u0010\"J\u0010\u00106\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b6\u0010\"J\u0010\u00107\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u0010\"J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010 Jò\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020\u00042\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b@\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\b\u0005\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bD\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010%R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010'R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bI\u0010 R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bJ\u0010 R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bK\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bL\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bM\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bN\u0010 R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bO\u0010 R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\bQ\u00100R\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\b\u0015\u0010\"R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010C\u001a\u0004\b\u0016\u0010\"R\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\bR\u0010\"R\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010C\u001a\u0004\bS\u0010\"R\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010C\u001a\u0004\bT\u0010\"R\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010C\u001a\u0004\bU\u0010\"R\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010C\u001a\u0004\b\u001b\u0010\"R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010A\u001a\u0004\bV\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseManagementUiState;", "", "", "paymentId", "", "isLoading", "receipt", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseStatusUiState;", "status", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/ItemUiState;", "items", "issuedDate", "amountPaidFormatted", "subtotalFormatted", "feeFormatted", "netAmountFormatted", "taxFormatted", "totalFormatted", "", "toastMessage", "isSendingReceipt", "isRefunding", "showRefundConfirmation", "showRefundError", "showSendReceiptError", "canRefund", "isRefundPurchase", "originalPurchaseUuid", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseStatusUiState;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZZZZZZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseStatusUiState;", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/lang/Integer;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;ZLjava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseStatusUiState;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZZZZZZLjava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseManagementUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPaymentId", "Z", "getReceipt", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseStatusUiState;", "getStatus", "Ljava/util/List;", "getItems", "getIssuedDate", "getAmountPaidFormatted", "getSubtotalFormatted", "getFeeFormatted", "getNetAmountFormatted", "getTaxFormatted", "getTotalFormatted", "Ljava/lang/Integer;", "getToastMessage", "getShowRefundConfirmation", "getShowRefundError", "getShowSendReceiptError", "getCanRefund", "getOriginalPurchaseUuid", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PurchaseManagementUiState {
    private final java.lang.String amountPaidFormatted;
    private final boolean canRefund;
    private final java.lang.String feeFormatted;
    private final boolean isLoading;
    private final boolean isRefundPurchase;
    private final boolean isRefunding;
    private final boolean isSendingReceipt;
    private final java.lang.String issuedDate;
    private final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState> items;
    private final java.lang.String netAmountFormatted;
    private final java.lang.String originalPurchaseUuid;
    private final java.lang.String paymentId;
    private final java.lang.String receipt;
    private final boolean showRefundConfirmation;
    private final boolean showRefundError;
    private final boolean showSendReceiptError;
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState status;
    private final java.lang.String subtotalFormatted;
    private final java.lang.String taxFormatted;
    private final java.lang.Integer toastMessage;
    private final java.lang.String totalFormatted;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState.Companion(null);
    public static final int $stable = 8;

    public PurchaseManagementUiState(java.lang.String str, boolean z, java.lang.String str2, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState purchaseStatusUiState, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState> list, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.Integer num, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, java.lang.String str10) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchaseStatusUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "");
        this.paymentId = str;
        this.isLoading = z;
        this.receipt = str2;
        this.status = purchaseStatusUiState;
        this.items = list;
        this.issuedDate = str3;
        this.amountPaidFormatted = str4;
        this.subtotalFormatted = str5;
        this.feeFormatted = str6;
        this.netAmountFormatted = str7;
        this.taxFormatted = str8;
        this.totalFormatted = str9;
        this.toastMessage = num;
        this.isSendingReceipt = z2;
        this.isRefunding = z3;
        this.showRefundConfirmation = z4;
        this.showRefundError = z5;
        this.showSendReceiptError = z6;
        this.canRefund = z7;
        this.isRefundPurchase = z8;
        this.originalPurchaseUuid = str10;
    }

    public /* synthetic */ PurchaseManagementUiState(java.lang.String str, boolean z, java.lang.String str2, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState purchaseStatusUiState, java.util.List list, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.Integer num, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, java.lang.String str10, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_draft, com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE) : purchaseStatusUiState, (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 32) == 0 ? str3 : "", (i & 64) != 0 ? "$0.00" : str4, (i & 128) != 0 ? "$0.00" : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) == 0 ? str9 : "$0.00", (i & 4096) != 0 ? null : num, (i & 8192) != 0 ? false : z2, (i & 16384) != 0 ? false : z3, (i & 32768) != 0 ? false : z4, (i & 65536) != 0 ? false : z5, (i & 131072) != 0 ? false : z6, (i & 262144) != 0 ? false : z7, (i & 524288) != 0 ? false : z8, (i & 1048576) != 0 ? null : str10);
    }

    public final java.lang.String getPaymentId() {
        return this.paymentId;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final java.lang.String getReceipt() {
        return this.receipt;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState getStatus() {
        return this.status;
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState> getItems() {
        return this.items;
    }

    public final java.lang.String getIssuedDate() {
        return this.issuedDate;
    }

    public final java.lang.String getAmountPaidFormatted() {
        return this.amountPaidFormatted;
    }

    public final java.lang.String getSubtotalFormatted() {
        return this.subtotalFormatted;
    }

    public final java.lang.String getFeeFormatted() {
        return this.feeFormatted;
    }

    public final java.lang.String getNetAmountFormatted() {
        return this.netAmountFormatted;
    }

    public final java.lang.String getTaxFormatted() {
        return this.taxFormatted;
    }

    public final java.lang.String getTotalFormatted() {
        return this.totalFormatted;
    }

    public final java.lang.Integer getToastMessage() {
        return this.toastMessage;
    }

    public final boolean isSendingReceipt() {
        return this.isSendingReceipt;
    }

    public final boolean isRefunding() {
        return this.isRefunding;
    }

    public final boolean getShowRefundConfirmation() {
        return this.showRefundConfirmation;
    }

    public final boolean getShowRefundError() {
        return this.showRefundError;
    }

    public final boolean getShowSendReceiptError() {
        return this.showSendReceiptError;
    }

    public final boolean getCanRefund() {
        return this.canRefund;
    }

    public final boolean isRefundPurchase() {
        return this.isRefundPurchase;
    }

    public final java.lang.String getOriginalPurchaseUuid() {
        return this.originalPurchaseUuid;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseManagementUiState$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseManagementUiState;", "initial", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseManagementUiState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState initial() {
            return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState(null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, null, 2097151, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.paymentId;
        boolean z = this.isLoading;
        java.lang.String str2 = this.receipt;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState purchaseStatusUiState = this.status;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState> list = this.items;
        java.lang.String str3 = this.issuedDate;
        java.lang.String str4 = this.amountPaidFormatted;
        java.lang.String str5 = this.subtotalFormatted;
        java.lang.String str6 = this.feeFormatted;
        java.lang.String str7 = this.netAmountFormatted;
        java.lang.String str8 = this.taxFormatted;
        java.lang.String str9 = this.totalFormatted;
        java.lang.Integer num = this.toastMessage;
        boolean z2 = this.isSendingReceipt;
        boolean z3 = this.isRefunding;
        boolean z4 = this.showRefundConfirmation;
        boolean z5 = this.showRefundError;
        boolean z6 = this.showSendReceiptError;
        boolean z7 = this.canRefund;
        boolean z8 = this.isRefundPurchase;
        java.lang.String str10 = this.originalPurchaseUuid;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PurchaseManagementUiState(paymentId=");
        sb.append(str);
        sb.append(", isLoading=");
        sb.append(z);
        sb.append(", receipt=");
        sb.append(str2);
        sb.append(", status=");
        sb.append(purchaseStatusUiState);
        sb.append(", items=");
        sb.append(list);
        sb.append(", issuedDate=");
        sb.append(str3);
        sb.append(", amountPaidFormatted=");
        sb.append(str4);
        sb.append(", subtotalFormatted=");
        sb.append(str5);
        sb.append(", feeFormatted=");
        sb.append(str6);
        sb.append(", netAmountFormatted=");
        sb.append(str7);
        sb.append(", taxFormatted=");
        sb.append(str8);
        sb.append(", totalFormatted=");
        sb.append(str9);
        sb.append(", toastMessage=");
        sb.append(num);
        sb.append(", isSendingReceipt=");
        sb.append(z2);
        sb.append(", isRefunding=");
        sb.append(z3);
        sb.append(", showRefundConfirmation=");
        sb.append(z4);
        sb.append(", showRefundError=");
        sb.append(z5);
        sb.append(", showSendReceiptError=");
        sb.append(z6);
        sb.append(", canRefund=");
        sb.append(z7);
        sb.append(", isRefundPurchase=");
        sb.append(z8);
        sb.append(", originalPurchaseUuid=");
        sb.append(str10);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.paymentId.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.isLoading);
        int hashCode3 = this.receipt.hashCode();
        int hashCode4 = this.status.hashCode();
        int hashCode5 = this.items.hashCode();
        int hashCode6 = this.issuedDate.hashCode();
        int hashCode7 = this.amountPaidFormatted.hashCode();
        int hashCode8 = this.subtotalFormatted.hashCode();
        java.lang.String str = this.feeFormatted;
        int hashCode9 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.netAmountFormatted;
        int hashCode10 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.taxFormatted;
        int hashCode11 = str3 == null ? 0 : str3.hashCode();
        int hashCode12 = this.totalFormatted.hashCode();
        java.lang.Integer num = this.toastMessage;
        int hashCode13 = num == null ? 0 : num.hashCode();
        int hashCode14 = java.lang.Boolean.hashCode(this.isSendingReceipt);
        int hashCode15 = java.lang.Boolean.hashCode(this.isRefunding);
        int hashCode16 = java.lang.Boolean.hashCode(this.showRefundConfirmation);
        int hashCode17 = java.lang.Boolean.hashCode(this.showRefundError);
        int hashCode18 = java.lang.Boolean.hashCode(this.showSendReceiptError);
        int hashCode19 = java.lang.Boolean.hashCode(this.canRefund);
        int hashCode20 = java.lang.Boolean.hashCode(this.isRefundPurchase);
        java.lang.String str4 = this.originalPurchaseUuid;
        return (((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState purchaseManagementUiState = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentId, purchaseManagementUiState.paymentId) && this.isLoading == purchaseManagementUiState.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.receipt, purchaseManagementUiState.receipt) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, purchaseManagementUiState.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, purchaseManagementUiState.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuedDate, purchaseManagementUiState.issuedDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountPaidFormatted, purchaseManagementUiState.amountPaidFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtotalFormatted, purchaseManagementUiState.subtotalFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.feeFormatted, purchaseManagementUiState.feeFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.netAmountFormatted, purchaseManagementUiState.netAmountFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxFormatted, purchaseManagementUiState.taxFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalFormatted, purchaseManagementUiState.totalFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.toastMessage, purchaseManagementUiState.toastMessage) && this.isSendingReceipt == purchaseManagementUiState.isSendingReceipt && this.isRefunding == purchaseManagementUiState.isRefunding && this.showRefundConfirmation == purchaseManagementUiState.showRefundConfirmation && this.showRefundError == purchaseManagementUiState.showRefundError && this.showSendReceiptError == purchaseManagementUiState.showSendReceiptError && this.canRefund == purchaseManagementUiState.canRefund && this.isRefundPurchase == purchaseManagementUiState.isRefundPurchase && kotlin.jvm.internal.Intrinsics.areEqual(this.originalPurchaseUuid, purchaseManagementUiState.originalPurchaseUuid);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState copy(java.lang.String paymentId, boolean isLoading, java.lang.String receipt, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState status, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState> items, java.lang.String issuedDate, java.lang.String amountPaidFormatted, java.lang.String subtotalFormatted, java.lang.String feeFormatted, java.lang.String netAmountFormatted, java.lang.String taxFormatted, java.lang.String totalFormatted, java.lang.Integer toastMessage, boolean isSendingReceipt, boolean isRefunding, boolean showRefundConfirmation, boolean showRefundError, boolean showSendReceiptError, boolean canRefund, boolean isRefundPurchase, java.lang.String originalPurchaseUuid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receipt, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuedDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountPaidFormatted, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtotalFormatted, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalFormatted, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState(paymentId, isLoading, receipt, status, items, issuedDate, amountPaidFormatted, subtotalFormatted, feeFormatted, netAmountFormatted, taxFormatted, totalFormatted, toastMessage, isSendingReceipt, isRefunding, showRefundConfirmation, showRefundError, showSendReceiptError, canRefund, isRefundPurchase, originalPurchaseUuid);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getFeeFormatted() {
        return this.feeFormatted;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getSubtotalFormatted() {
        return this.subtotalFormatted;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getAmountPaidFormatted() {
        return this.amountPaidFormatted;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getIssuedDate() {
        return this.issuedDate;
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState> component5() {
        return this.items;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getReceipt() {
        return this.receipt;
    }

    /* renamed from: component21, reason: from getter */
    public final java.lang.String getOriginalPurchaseUuid() {
        return this.originalPurchaseUuid;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsRefundPurchase() {
        return this.isRefundPurchase;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getCanRefund() {
        return this.canRefund;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getShowSendReceiptError() {
        return this.showSendReceiptError;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getShowRefundError() {
        return this.showRefundError;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getShowRefundConfirmation() {
        return this.showRefundConfirmation;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsRefunding() {
        return this.isRefunding;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsSendingReceipt() {
        return this.isSendingReceipt;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.Integer getToastMessage() {
        return this.toastMessage;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getTotalFormatted() {
        return this.totalFormatted;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getTaxFormatted() {
        return this.taxFormatted;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getNetAmountFormatted() {
        return this.netAmountFormatted;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPaymentId() {
        return this.paymentId;
    }

    public PurchaseManagementUiState() {
        this(null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, null, 2097151, null);
    }
}
