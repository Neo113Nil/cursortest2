package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ^\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b.\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u001bR\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ReissueRevolvingCreditInstrumentInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "creditProductIdentifier", "creditAccountId", "creditInstrumentId", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingFlowContextInput;", "flowContext", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentType;", "instrumentType", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentReissueReason;", "reason", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditShippingAddressInput;", "shippingAddress", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingFlowContextInput;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentType;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentReissueReason;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "component2", "()Ljava/lang/Object;", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingFlowContextInput;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentType;", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentReissueReason;", "component7", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingFlowContextInput;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentType;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentReissueReason;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ReissueRevolvingCreditInstrumentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/Object;", "getCreditAccountId", "getCreditInstrumentId", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingFlowContextInput;", "getFlowContext", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentType;", "getInstrumentType", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentReissueReason;", "getReason", "Lcom/apollographql/apollo/api/Optional;", "getShippingAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReissueRevolvingCreditInstrumentInput {
    private final java.lang.Object creditAccountId;
    private final java.lang.Object creditInstrumentId;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingFlowContextInput flowContext;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType instrumentType;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentReissueReason reason;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditShippingAddressInput> shippingAddress;

    public ReissueRevolvingCreditInstrumentInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingFlowContextInput revolvingCreditServicingFlowContextInput, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType revolvingCreditInstrumentType, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentReissueReason revolvingCreditInstrumentReissueReason, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditShippingAddressInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingFlowContextInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditInstrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditInstrumentReissueReason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.creditProductIdentifier = revolvingCreditProductIdentifier;
        this.creditAccountId = obj;
        this.creditInstrumentId = obj2;
        this.flowContext = revolvingCreditServicingFlowContextInput;
        this.instrumentType = revolvingCreditInstrumentType;
        this.reason = revolvingCreditInstrumentReissueReason;
        this.shippingAddress = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.lang.Object getCreditInstrumentId() {
        return this.creditInstrumentId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentReissueReason getReason() {
        return this.reason;
    }

    public /* synthetic */ ReissueRevolvingCreditInstrumentInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingFlowContextInput revolvingCreditServicingFlowContextInput, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType revolvingCreditInstrumentType, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentReissueReason revolvingCreditInstrumentReissueReason, com.apollographql.apollo.api.Optional optional, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(revolvingCreditProductIdentifier, obj, obj2, revolvingCreditServicingFlowContextInput, revolvingCreditInstrumentType, revolvingCreditInstrumentReissueReason, (i & 64) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditShippingAddressInput> getShippingAddress() {
        return this.shippingAddress;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier = this.creditProductIdentifier;
        java.lang.Object obj = this.creditAccountId;
        java.lang.Object obj2 = this.creditInstrumentId;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingFlowContextInput revolvingCreditServicingFlowContextInput = this.flowContext;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType revolvingCreditInstrumentType = this.instrumentType;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentReissueReason revolvingCreditInstrumentReissueReason = this.reason;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditShippingAddressInput> optional = this.shippingAddress;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReissueRevolvingCreditInstrumentInput(creditProductIdentifier=");
        sb.append(revolvingCreditProductIdentifier);
        sb.append(", creditAccountId=");
        sb.append(obj);
        sb.append(", creditInstrumentId=");
        sb.append(obj2);
        sb.append(", flowContext=");
        sb.append(revolvingCreditServicingFlowContextInput);
        sb.append(", instrumentType=");
        sb.append(revolvingCreditInstrumentType);
        sb.append(", reason=");
        sb.append(revolvingCreditInstrumentReissueReason);
        sb.append(", shippingAddress=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((this.creditProductIdentifier.hashCode() * 31) + this.creditAccountId.hashCode()) * 31) + this.creditInstrumentId.hashCode()) * 31) + this.flowContext.hashCode()) * 31) + this.instrumentType.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.shippingAddress.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ReissueRevolvingCreditInstrumentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ReissueRevolvingCreditInstrumentInput reissueRevolvingCreditInstrumentInput = (com.paypal.oslo.api.graphql.schema.type.ReissueRevolvingCreditInstrumentInput) other;
        return this.creditProductIdentifier == reissueRevolvingCreditInstrumentInput.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, reissueRevolvingCreditInstrumentInput.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditInstrumentId, reissueRevolvingCreditInstrumentInput.creditInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowContext, reissueRevolvingCreditInstrumentInput.flowContext) && this.instrumentType == reissueRevolvingCreditInstrumentInput.instrumentType && this.reason == reissueRevolvingCreditInstrumentInput.reason && kotlin.jvm.internal.Intrinsics.areEqual(this.shippingAddress, reissueRevolvingCreditInstrumentInput.shippingAddress);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ReissueRevolvingCreditInstrumentInput copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier, java.lang.Object creditAccountId, java.lang.Object creditInstrumentId, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingFlowContextInput flowContext, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType instrumentType, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentReissueReason reason, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditShippingAddressInput> shippingAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditInstrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAddress, "");
        return new com.paypal.oslo.api.graphql.schema.type.ReissueRevolvingCreditInstrumentInput(creditProductIdentifier, creditAccountId, creditInstrumentId, flowContext, instrumentType, reason, shippingAddress);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditShippingAddressInput> component7() {
        return this.shippingAddress;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentReissueReason getReason() {
        return this.reason;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getCreditInstrumentId() {
        return this.creditInstrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ReissueRevolvingCreditInstrumentInput copy$default(com.paypal.oslo.api.graphql.schema.type.ReissueRevolvingCreditInstrumentInput reissueRevolvingCreditInstrumentInput, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingFlowContextInput revolvingCreditServicingFlowContextInput, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType revolvingCreditInstrumentType, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentReissueReason revolvingCreditInstrumentReissueReason, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            revolvingCreditProductIdentifier = reissueRevolvingCreditInstrumentInput.creditProductIdentifier;
        }
        if ((i & 2) != 0) {
            obj = reissueRevolvingCreditInstrumentInput.creditAccountId;
        }
        java.lang.Object obj4 = obj;
        if ((i & 4) != 0) {
            obj2 = reissueRevolvingCreditInstrumentInput.creditInstrumentId;
        }
        java.lang.Object obj5 = obj2;
        if ((i & 8) != 0) {
            revolvingCreditServicingFlowContextInput = reissueRevolvingCreditInstrumentInput.flowContext;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingFlowContextInput revolvingCreditServicingFlowContextInput2 = revolvingCreditServicingFlowContextInput;
        if ((i & 16) != 0) {
            revolvingCreditInstrumentType = reissueRevolvingCreditInstrumentInput.instrumentType;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType revolvingCreditInstrumentType2 = revolvingCreditInstrumentType;
        if ((i & 32) != 0) {
            revolvingCreditInstrumentReissueReason = reissueRevolvingCreditInstrumentInput.reason;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentReissueReason revolvingCreditInstrumentReissueReason2 = revolvingCreditInstrumentReissueReason;
        if ((i & 64) != 0) {
            optional = reissueRevolvingCreditInstrumentInput.shippingAddress;
        }
        return reissueRevolvingCreditInstrumentInput.copy(revolvingCreditProductIdentifier, obj4, obj5, revolvingCreditServicingFlowContextInput2, revolvingCreditInstrumentType2, revolvingCreditInstrumentReissueReason2, optional);
    }
}
