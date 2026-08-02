package com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b\n\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;", "", "", "id", "pinStatus", "pinOrigin", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardPricingDetails;", "pricingDetails", "", "isFundingSourceRequired", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getPinStatus", "getPinOrigin", "Ljava/util/List;", "getPricingDetails", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitInstrumentForRequestPhysicalCardResponse {
    public static final int $stable = 8;
    private final java.lang.String id;
    private final boolean isFundingSourceRequired;
    private final java.lang.String pinOrigin;
    private final java.lang.String pinStatus;
    private final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails> pricingDetails;

    public DebitInstrumentForRequestPhysicalCardResponse(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.id = str;
        this.pinStatus = str2;
        this.pinOrigin = str3;
        this.pricingDetails = list;
        this.isFundingSourceRequired = z;
    }

    public /* synthetic */ DebitInstrumentForRequestPhysicalCardResponse(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, (i & 16) != 0 ? false : z);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getPinStatus() {
        return this.pinStatus;
    }

    public final java.lang.String getPinOrigin() {
        return this.pinOrigin;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails> getPricingDetails() {
        return this.pricingDetails;
    }

    public final boolean isFundingSourceRequired() {
        return this.isFundingSourceRequired;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.pinStatus;
        java.lang.String str3 = this.pinOrigin;
        java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails> list = this.pricingDetails;
        boolean z = this.isFundingSourceRequired;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentForRequestPhysicalCardResponse(id=");
        sb.append(str);
        sb.append(", pinStatus=");
        sb.append(str2);
        sb.append(", pinOrigin=");
        sb.append(str3);
        sb.append(", pricingDetails=");
        sb.append(list);
        sb.append(", isFundingSourceRequired=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.pinStatus.hashCode()) * 31) + this.pinOrigin.hashCode()) * 31) + this.pricingDetails.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isFundingSourceRequired);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentForRequestPhysicalCardResponse = (com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, debitInstrumentForRequestPhysicalCardResponse.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.pinStatus, debitInstrumentForRequestPhysicalCardResponse.pinStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.pinOrigin, debitInstrumentForRequestPhysicalCardResponse.pinOrigin) && kotlin.jvm.internal.Intrinsics.areEqual(this.pricingDetails, debitInstrumentForRequestPhysicalCardResponse.pricingDetails) && this.isFundingSourceRequired == debitInstrumentForRequestPhysicalCardResponse.isFundingSourceRequired;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse copy(java.lang.String id, java.lang.String pinStatus, java.lang.String pinOrigin, java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails> pricingDetails, boolean isFundingSourceRequired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pinStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pinOrigin, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pricingDetails, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse(id, pinStatus, pinOrigin, pricingDetails, isFundingSourceRequired);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsFundingSourceRequired() {
        return this.isFundingSourceRequired;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails> component4() {
        return this.pricingDetails;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPinOrigin() {
        return this.pinOrigin;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPinStatus() {
        return this.pinStatus;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse copy$default(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentForRequestPhysicalCardResponse, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = debitInstrumentForRequestPhysicalCardResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = debitInstrumentForRequestPhysicalCardResponse.pinStatus;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = debitInstrumentForRequestPhysicalCardResponse.pinOrigin;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            list = debitInstrumentForRequestPhysicalCardResponse.pricingDetails;
        }
        java.util.List list2 = list;
        if ((i & 16) != 0) {
            z = debitInstrumentForRequestPhysicalCardResponse.isFundingSourceRequired;
        }
        return debitInstrumentForRequestPhysicalCardResponse.copy(str, str4, str5, list2, z);
    }
}
