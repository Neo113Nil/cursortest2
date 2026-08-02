package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\\\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00072\b\b\u0002\u0010\f\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0014R(\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0016R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b/\u0010\u0016R\u001a\u0010\f\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b0\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SetBNPLAutopayInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/SetBNPLAutopayFlowContextInput;", "flowContext", "creditAccountId", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "creditProductIdentifier", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLFundingInstrumentInput;", "fundingInstrument", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPaymentFundingInstrumentInput;", "paymentFundingInstrument", "eTag", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SetBNPLAutopayFlowContextInput;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SetBNPLAutopayFlowContextInput;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "component4", "()Lcom/apollographql/apollo/api/Optional;", "component5", "component6", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SetBNPLAutopayFlowContextInput;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/SetBNPLAutopayInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/SetBNPLAutopayFlowContextInput;", "getFlowContext", "Ljava/lang/Object;", "getCreditAccountId", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "getCreditProductIdentifier", "Lcom/apollographql/apollo/api/Optional;", "getFundingInstrument", "getFundingInstrument$annotations", "()V", "getPaymentFundingInstrument", "getETag"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SetBNPLAutopayInput {
    private final java.lang.Object creditAccountId;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier;
    private final java.lang.Object eTag;
    private final com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayFlowContextInput flowContext;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentInput> fundingInstrument;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentInput> paymentFundingInstrument;

    @kotlin.Deprecated(message = "Use paymentFundingInstrument field instead.")
    public static /* synthetic */ void getFundingInstrument$annotations() {
    }

    public SetBNPLAutopayInput(com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayFlowContextInput setBNPLAutopayFlowContextInput, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentInput> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentInput> optional2, java.lang.Object obj2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setBNPLAutopayFlowContextInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLCreditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        this.flowContext = setBNPLAutopayFlowContextInput;
        this.creditAccountId = obj;
        this.creditProductIdentifier = bNPLCreditProductIdentifier;
        this.fundingInstrument = optional;
        this.paymentFundingInstrument = optional2;
        this.eTag = obj2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public /* synthetic */ SetBNPLAutopayInput(com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayFlowContextInput setBNPLAutopayFlowContextInput, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, java.lang.Object obj2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(setBNPLAutopayFlowContextInput, obj, bNPLCreditProductIdentifier, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, obj2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentInput> getFundingInstrument() {
        return this.fundingInstrument;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentInput> getPaymentFundingInstrument() {
        return this.paymentFundingInstrument;
    }

    public final java.lang.Object getETag() {
        return this.eTag;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayFlowContextInput setBNPLAutopayFlowContextInput = this.flowContext;
        java.lang.Object obj = this.creditAccountId;
        com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = this.creditProductIdentifier;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentInput> optional = this.fundingInstrument;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentInput> optional2 = this.paymentFundingInstrument;
        java.lang.Object obj2 = this.eTag;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SetBNPLAutopayInput(flowContext=");
        sb.append(setBNPLAutopayFlowContextInput);
        sb.append(", creditAccountId=");
        sb.append(obj);
        sb.append(", creditProductIdentifier=");
        sb.append(bNPLCreditProductIdentifier);
        sb.append(", fundingInstrument=");
        sb.append(optional);
        sb.append(", paymentFundingInstrument=");
        sb.append(optional2);
        sb.append(", eTag=");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.flowContext.hashCode() * 31) + this.creditAccountId.hashCode()) * 31) + this.creditProductIdentifier.hashCode()) * 31) + this.fundingInstrument.hashCode()) * 31) + this.paymentFundingInstrument.hashCode()) * 31) + this.eTag.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayInput setBNPLAutopayInput = (com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.flowContext, setBNPLAutopayInput.flowContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, setBNPLAutopayInput.creditAccountId) && this.creditProductIdentifier == setBNPLAutopayInput.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrument, setBNPLAutopayInput.fundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentFundingInstrument, setBNPLAutopayInput.paymentFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.eTag, setBNPLAutopayInput.eTag);
    }

    public final com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayInput copy(com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayFlowContextInput flowContext, java.lang.Object creditAccountId, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentInput> fundingInstrument, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentInput> paymentFundingInstrument, java.lang.Object eTag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentFundingInstrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eTag, "");
        return new com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayInput(flowContext, creditAccountId, creditProductIdentifier, fundingInstrument, paymentFundingInstrument, eTag);
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.Object getETag() {
        return this.eTag;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentInput> component5() {
        return this.paymentFundingInstrument;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLFundingInstrumentInput> component4() {
        return this.fundingInstrument;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayFlowContextInput getFlowContext() {
        return this.flowContext;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayInput copy$default(com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayInput setBNPLAutopayInput, com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayFlowContextInput setBNPLAutopayFlowContextInput, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, java.lang.Object obj2, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            setBNPLAutopayFlowContextInput = setBNPLAutopayInput.flowContext;
        }
        if ((i & 2) != 0) {
            obj = setBNPLAutopayInput.creditAccountId;
        }
        java.lang.Object obj4 = obj;
        if ((i & 4) != 0) {
            bNPLCreditProductIdentifier = setBNPLAutopayInput.creditProductIdentifier;
        }
        com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier2 = bNPLCreditProductIdentifier;
        if ((i & 8) != 0) {
            optional = setBNPLAutopayInput.fundingInstrument;
        }
        com.apollographql.apollo.api.Optional optional3 = optional;
        if ((i & 16) != 0) {
            optional2 = setBNPLAutopayInput.paymentFundingInstrument;
        }
        com.apollographql.apollo.api.Optional optional4 = optional2;
        if ((i & 32) != 0) {
            obj2 = setBNPLAutopayInput.eTag;
        }
        return setBNPLAutopayInput.copy(setBNPLAutopayFlowContextInput, obj4, bNPLCreditProductIdentifier2, optional3, optional4, obj2);
    }
}
