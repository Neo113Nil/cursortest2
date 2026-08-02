package com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/ReissueCardRequest;", "", "", "instrumentId", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/ReissueCardReason;", "reason", "shippingAddressId", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/ReissueCardReason;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/ReissueCardReason;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/ReissueCardReason;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/ReissueCardRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentId", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/ReissueCardReason;", "getReason", "getShippingAddressId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ReissueCardRequest {
    public static final int $stable = 0;
    private final java.lang.String instrumentId;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason reason;
    private final java.lang.String shippingAddressId;

    public ReissueCardRequest(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason reissueCardReason, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reissueCardReason, "");
        this.instrumentId = str;
        this.reason = reissueCardReason;
        this.shippingAddressId = str2;
    }

    public /* synthetic */ ReissueCardRequest(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason reissueCardReason, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, reissueCardReason, (i & 4) != 0 ? null : str2);
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason getReason() {
        return this.reason;
    }

    public final java.lang.String getShippingAddressId() {
        return this.shippingAddressId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.instrumentId;
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason reissueCardReason = this.reason;
        java.lang.String str2 = this.shippingAddressId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReissueCardRequest(instrumentId=");
        sb.append(str);
        sb.append(", reason=");
        sb.append(reissueCardReason);
        sb.append(", shippingAddressId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.instrumentId.hashCode();
        int hashCode2 = this.reason.hashCode();
        java.lang.String str = this.shippingAddressId;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardRequest)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardRequest reissueCardRequest = (com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, reissueCardRequest.instrumentId) && this.reason == reissueCardRequest.reason && kotlin.jvm.internal.Intrinsics.areEqual(this.shippingAddressId, reissueCardRequest.shippingAddressId);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardRequest copy(java.lang.String instrumentId, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason reason, java.lang.String shippingAddressId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardRequest(instrumentId, reason, shippingAddressId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getShippingAddressId() {
        return this.shippingAddressId;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason getReason() {
        return this.reason;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardRequest copy$default(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardRequest reissueCardRequest, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardReason reissueCardReason, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = reissueCardRequest.instrumentId;
        }
        if ((i & 2) != 0) {
            reissueCardReason = reissueCardRequest.reason;
        }
        if ((i & 4) != 0) {
            str2 = reissueCardRequest.shippingAddressId;
        }
        return reissueCardRequest.copy(str, reissueCardReason, str2);
    }
}
