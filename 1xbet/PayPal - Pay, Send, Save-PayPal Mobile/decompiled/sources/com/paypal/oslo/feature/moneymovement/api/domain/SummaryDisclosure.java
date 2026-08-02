package com.paypal.oslo.feature.moneymovement.api.domain;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosure;", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;", "type", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosure;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;", "getType", "Ljava/lang/String;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SummaryDisclosure {
    public static final int $stable = 0;
    private final java.lang.String data;
    private final com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType type;

    public SummaryDisclosure(com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType summaryDisclosureType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(summaryDisclosureType, "");
        this.type = summaryDisclosureType;
        this.data = str;
    }

    public /* synthetic */ SummaryDisclosure(com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType summaryDisclosureType, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(summaryDisclosureType, (i & 2) != 0 ? null : str);
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType getType() {
        return this.type;
    }

    public final java.lang.String getData() {
        return this.data;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType summaryDisclosureType = this.type;
        java.lang.String str = this.data;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SummaryDisclosure(type=");
        sb.append(summaryDisclosureType);
        sb.append(", data=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        java.lang.String str = this.data;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure summaryDisclosure = (com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure) other;
        return this.type == summaryDisclosure.type && kotlin.jvm.internal.Intrinsics.areEqual(this.data, summaryDisclosure.data);
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure copy(com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType type, java.lang.String data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure(type, data);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getData() {
        return this.data;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure copy$default(com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure summaryDisclosure, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType summaryDisclosureType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            summaryDisclosureType = summaryDisclosure.type;
        }
        if ((i & 2) != 0) {
            str = summaryDisclosure.data;
        }
        return summaryDisclosure.copy(summaryDisclosureType, str);
    }
}
