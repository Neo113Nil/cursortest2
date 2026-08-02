package com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0082\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eHÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b2\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001dR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010!R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b:\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/DebitInstrumentShipment;", "", "", "id", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "lastNChars", "", "virtualCard", "primary", "primaryCurrencyCode", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentStatus;", "status", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentShipmentDetails;", "shipmentDetails", "", "availableActions", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentOperation;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentStatus;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentShipmentDetails;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentStatus;", "component8", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentShipmentDetails;", "component9", "()Ljava/util/List;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentStatus;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentShipmentDetails;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/DebitInstrumentShipment;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getProductName", "getLastNChars", "Z", "getVirtualCard", "getPrimary", "getPrimaryCurrencyCode", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentStatus;", "getStatus", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentShipmentDetails;", "getShipmentDetails", "Ljava/util/List;", "getAvailableActions", "getActions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitInstrumentShipment {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> actions;
    private final java.util.List<java.lang.String> availableActions;
    private final java.lang.String id;
    private final java.lang.String lastNChars;
    private final boolean primary;
    private final java.lang.String primaryCurrencyCode;
    private final java.lang.String productName;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails shipmentDetails;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus status;
    private final boolean virtualCard;

    /* JADX WARN: Multi-variable type inference failed */
    public DebitInstrumentShipment(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, java.lang.String str4, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus debitInstrumentStatus, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails debitInstrumentShipmentDetails, java.util.List<java.lang.String> list, java.util.List<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentShipmentDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.id = str;
        this.productName = str2;
        this.lastNChars = str3;
        this.virtualCard = z;
        this.primary = z2;
        this.primaryCurrencyCode = str4;
        this.status = debitInstrumentStatus;
        this.shipmentDetails = debitInstrumentShipmentDetails;
        this.availableActions = list;
        this.actions = list2;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getProductName() {
        return this.productName;
    }

    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    public final boolean getVirtualCard() {
        return this.virtualCard;
    }

    public final boolean getPrimary() {
        return this.primary;
    }

    public final java.lang.String getPrimaryCurrencyCode() {
        return this.primaryCurrencyCode;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails getShipmentDetails() {
        return this.shipmentDetails;
    }

    public final java.util.List<java.lang.String> getAvailableActions() {
        return this.availableActions;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> getActions() {
        return this.actions;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.productName;
        java.lang.String str3 = this.lastNChars;
        boolean z = this.virtualCard;
        boolean z2 = this.primary;
        java.lang.String str4 = this.primaryCurrencyCode;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus debitInstrumentStatus = this.status;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails debitInstrumentShipmentDetails = this.shipmentDetails;
        java.util.List<java.lang.String> list = this.availableActions;
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> list2 = this.actions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentShipment(id=");
        sb.append(str);
        sb.append(", productName=");
        sb.append(str2);
        sb.append(", lastNChars=");
        sb.append(str3);
        sb.append(", virtualCard=");
        sb.append(z);
        sb.append(", primary=");
        sb.append(z2);
        sb.append(", primaryCurrencyCode=");
        sb.append(str4);
        sb.append(", status=");
        sb.append(debitInstrumentStatus);
        sb.append(", shipmentDetails=");
        sb.append(debitInstrumentShipmentDetails);
        sb.append(", availableActions=");
        sb.append(list);
        sb.append(", actions=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.productName.hashCode();
        int hashCode3 = this.lastNChars.hashCode();
        int hashCode4 = java.lang.Boolean.hashCode(this.virtualCard);
        int hashCode5 = java.lang.Boolean.hashCode(this.primary);
        java.lang.String str = this.primaryCurrencyCode;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.status.hashCode()) * 31) + this.shipmentDetails.hashCode()) * 31) + this.availableActions.hashCode()) * 31) + this.actions.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.DebitInstrumentShipment)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.DebitInstrumentShipment debitInstrumentShipment = (com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.DebitInstrumentShipment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, debitInstrumentShipment.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.productName, debitInstrumentShipment.productName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, debitInstrumentShipment.lastNChars) && this.virtualCard == debitInstrumentShipment.virtualCard && this.primary == debitInstrumentShipment.primary && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrencyCode, debitInstrumentShipment.primaryCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, debitInstrumentShipment.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.shipmentDetails, debitInstrumentShipment.shipmentDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableActions, debitInstrumentShipment.availableActions) && kotlin.jvm.internal.Intrinsics.areEqual(this.actions, debitInstrumentShipment.actions);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.DebitInstrumentShipment copy(java.lang.String id, java.lang.String productName, java.lang.String lastNChars, boolean virtualCard, boolean primary, java.lang.String primaryCurrencyCode, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus status, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails shipmentDetails, java.util.List<java.lang.String> availableActions, java.util.List<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> actions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shipmentDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableActions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actions, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.DebitInstrumentShipment(id, productName, lastNChars, virtualCard, primary, primaryCurrencyCode, status, shipmentDetails, availableActions, actions);
    }

    public final java.util.List<java.lang.String> component9() {
        return this.availableActions;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails getShipmentDetails() {
        return this.shipmentDetails;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus getStatus() {
        return this.status;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getPrimaryCurrencyCode() {
        return this.primaryCurrencyCode;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getVirtualCard() {
        return this.virtualCard;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getProductName() {
        return this.productName;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> component10() {
        return this.actions;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
