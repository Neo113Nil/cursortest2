package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011Jd\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b/\u0010\u0011R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b0\u0010\u0011R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b1\u0010\u0011"}, d2 = {"Lcom/paypal/android/threeds/data/model/TransactionData;", "", "", "transactionCategory", "messageCategory", "Lcom/paypal/android/threeds/data/model/PurchaseAmount;", "purchaseAmount", "Lcom/paypal/android/threeds/data/model/InstalmentData;", "instalmentData", "Lcom/paypal/android/threeds/data/model/RecurringData;", "recurringData", "transactionType", "addressMatchIndicator", "purchaseDatetime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/android/threeds/data/model/PurchaseAmount;Lcom/paypal/android/threeds/data/model/InstalmentData;Lcom/paypal/android/threeds/data/model/RecurringData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/android/threeds/data/model/PurchaseAmount;", "component4", "()Lcom/paypal/android/threeds/data/model/InstalmentData;", "component5", "()Lcom/paypal/android/threeds/data/model/RecurringData;", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/android/threeds/data/model/PurchaseAmount;Lcom/paypal/android/threeds/data/model/InstalmentData;Lcom/paypal/android/threeds/data/model/RecurringData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/android/threeds/data/model/TransactionData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransactionCategory", "getMessageCategory", "Lcom/paypal/android/threeds/data/model/PurchaseAmount;", "getPurchaseAmount", "Lcom/paypal/android/threeds/data/model/InstalmentData;", "getInstalmentData", "Lcom/paypal/android/threeds/data/model/RecurringData;", "getRecurringData", "getTransactionType", "getAddressMatchIndicator", "getPurchaseDatetime"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TransactionData {
    public static final int $stable = 0;

    @com.google.gson.annotations.SerializedName("address_match_indicator")
    private final java.lang.String addressMatchIndicator;

    @com.google.gson.annotations.SerializedName("instalment_data")
    private final com.paypal.android.threeds.data.model.InstalmentData instalmentData;

    @com.google.gson.annotations.SerializedName("message_category")
    private final java.lang.String messageCategory;

    @com.google.gson.annotations.SerializedName(com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.PURCHASE_AMOUNT)
    private final com.paypal.android.threeds.data.model.PurchaseAmount purchaseAmount;

    @com.google.gson.annotations.SerializedName("purchase_datetime")
    private final java.lang.String purchaseDatetime;

    @com.google.gson.annotations.SerializedName("recurring_data")
    private final com.paypal.android.threeds.data.model.RecurringData recurringData;

    @com.google.gson.annotations.SerializedName("transaction_category")
    private final java.lang.String transactionCategory;

    @com.google.gson.annotations.SerializedName(com.visa.cbp.getTicketMetaData$6672$values.values.setTokenInfo)
    private final java.lang.String transactionType;

    public TransactionData(java.lang.String str, java.lang.String str2, com.paypal.android.threeds.data.model.PurchaseAmount purchaseAmount, com.paypal.android.threeds.data.model.InstalmentData instalmentData, com.paypal.android.threeds.data.model.RecurringData recurringData, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchaseAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.transactionCategory = str;
        this.messageCategory = str2;
        this.purchaseAmount = purchaseAmount;
        this.instalmentData = instalmentData;
        this.recurringData = recurringData;
        this.transactionType = str3;
        this.addressMatchIndicator = str4;
        this.purchaseDatetime = str5;
    }

    public /* synthetic */ TransactionData(java.lang.String str, java.lang.String str2, com.paypal.android.threeds.data.model.PurchaseAmount purchaseAmount, com.paypal.android.threeds.data.model.InstalmentData instalmentData, com.paypal.android.threeds.data.model.RecurringData recurringData, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, purchaseAmount, (i & 8) != 0 ? null : instalmentData, (i & 16) != 0 ? null : recurringData, str3, str4, str5);
    }

    public final java.lang.String getTransactionCategory() {
        return this.transactionCategory;
    }

    public final java.lang.String getMessageCategory() {
        return this.messageCategory;
    }

    public final com.paypal.android.threeds.data.model.PurchaseAmount getPurchaseAmount() {
        return this.purchaseAmount;
    }

    public final com.paypal.android.threeds.data.model.InstalmentData getInstalmentData() {
        return this.instalmentData;
    }

    public final com.paypal.android.threeds.data.model.RecurringData getRecurringData() {
        return this.recurringData;
    }

    public final java.lang.String getTransactionType() {
        return this.transactionType;
    }

    public final java.lang.String getAddressMatchIndicator() {
        return this.addressMatchIndicator;
    }

    public final java.lang.String getPurchaseDatetime() {
        return this.purchaseDatetime;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.transactionCategory;
        java.lang.String str2 = this.messageCategory;
        com.paypal.android.threeds.data.model.PurchaseAmount purchaseAmount = this.purchaseAmount;
        com.paypal.android.threeds.data.model.InstalmentData instalmentData = this.instalmentData;
        com.paypal.android.threeds.data.model.RecurringData recurringData = this.recurringData;
        java.lang.String str3 = this.transactionType;
        java.lang.String str4 = this.addressMatchIndicator;
        java.lang.String str5 = this.purchaseDatetime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionData(transactionCategory=");
        sb.append(str);
        sb.append(", messageCategory=");
        sb.append(str2);
        sb.append(", purchaseAmount=");
        sb.append(purchaseAmount);
        sb.append(", instalmentData=");
        sb.append(instalmentData);
        sb.append(", recurringData=");
        sb.append(recurringData);
        sb.append(", transactionType=");
        sb.append(str3);
        sb.append(", addressMatchIndicator=");
        sb.append(str4);
        sb.append(", purchaseDatetime=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.transactionCategory.hashCode();
        int hashCode2 = this.messageCategory.hashCode();
        int hashCode3 = this.purchaseAmount.hashCode();
        com.paypal.android.threeds.data.model.InstalmentData instalmentData = this.instalmentData;
        int hashCode4 = instalmentData == null ? 0 : instalmentData.hashCode();
        com.paypal.android.threeds.data.model.RecurringData recurringData = this.recurringData;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (recurringData != null ? recurringData.hashCode() : 0)) * 31) + this.transactionType.hashCode()) * 31) + this.addressMatchIndicator.hashCode()) * 31) + this.purchaseDatetime.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.TransactionData)) {
            return false;
        }
        com.paypal.android.threeds.data.model.TransactionData transactionData = (com.paypal.android.threeds.data.model.TransactionData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionCategory, transactionData.transactionCategory) && kotlin.jvm.internal.Intrinsics.areEqual(this.messageCategory, transactionData.messageCategory) && kotlin.jvm.internal.Intrinsics.areEqual(this.purchaseAmount, transactionData.purchaseAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.instalmentData, transactionData.instalmentData) && kotlin.jvm.internal.Intrinsics.areEqual(this.recurringData, transactionData.recurringData) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionType, transactionData.transactionType) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressMatchIndicator, transactionData.addressMatchIndicator) && kotlin.jvm.internal.Intrinsics.areEqual(this.purchaseDatetime, transactionData.purchaseDatetime);
    }

    public final com.paypal.android.threeds.data.model.TransactionData copy(java.lang.String transactionCategory, java.lang.String messageCategory, com.paypal.android.threeds.data.model.PurchaseAmount purchaseAmount, com.paypal.android.threeds.data.model.InstalmentData instalmentData, com.paypal.android.threeds.data.model.RecurringData recurringData, java.lang.String transactionType, java.lang.String addressMatchIndicator, java.lang.String purchaseDatetime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionCategory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageCategory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchaseAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressMatchIndicator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchaseDatetime, "");
        return new com.paypal.android.threeds.data.model.TransactionData(transactionCategory, messageCategory, purchaseAmount, instalmentData, recurringData, transactionType, addressMatchIndicator, purchaseDatetime);
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getPurchaseDatetime() {
        return this.purchaseDatetime;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getAddressMatchIndicator() {
        return this.addressMatchIndicator;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getTransactionType() {
        return this.transactionType;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.android.threeds.data.model.RecurringData getRecurringData() {
        return this.recurringData;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.android.threeds.data.model.InstalmentData getInstalmentData() {
        return this.instalmentData;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.android.threeds.data.model.PurchaseAmount getPurchaseAmount() {
        return this.purchaseAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessageCategory() {
        return this.messageCategory;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTransactionCategory() {
        return this.transactionCategory;
    }
}
