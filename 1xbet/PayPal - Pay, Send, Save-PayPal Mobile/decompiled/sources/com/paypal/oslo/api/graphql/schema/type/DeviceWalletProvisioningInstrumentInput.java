package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletProvisioningInstrumentInput;", "", "", "instrumentId", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "instrumentType", "Lcom/apollographql/apollo/api/Optional;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletProvisioningInstrumentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentId", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "getInstrumentType", "Lcom/apollographql/apollo/api/Optional;", "getCvv"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeviceWalletProvisioningInstrumentInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> cvv;
    private final java.lang.String instrumentId;
    private final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType instrumentType;

    public DeviceWalletProvisioningInstrumentInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.instrumentId = str;
        this.instrumentType = fundingInstrumentType;
        this.cvv = optional;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public /* synthetic */ DeviceWalletProvisioningInstrumentInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fundingInstrumentType, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getCvv() {
        return this.cvv;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.instrumentId;
        com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = this.instrumentType;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.cvv;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceWalletProvisioningInstrumentInput(instrumentId=");
        sb.append(str);
        sb.append(", instrumentType=");
        sb.append(fundingInstrumentType);
        sb.append(", cvv=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.instrumentId.hashCode() * 31) + this.instrumentType.hashCode()) * 31) + this.cvv.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningInstrumentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningInstrumentInput deviceWalletProvisioningInstrumentInput = (com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningInstrumentInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, deviceWalletProvisioningInstrumentInput.instrumentId) && this.instrumentType == deviceWalletProvisioningInstrumentInput.instrumentType && kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, deviceWalletProvisioningInstrumentInput.cvv);
    }

    public final com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningInstrumentInput copy(java.lang.String instrumentId, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType instrumentType, com.apollographql.apollo.api.Optional<java.lang.String> cvv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
        return new com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningInstrumentInput(instrumentId, instrumentType, cvv);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.cvv;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningInstrumentInput copy$default(com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningInstrumentInput deviceWalletProvisioningInstrumentInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = deviceWalletProvisioningInstrumentInput.instrumentId;
        }
        if ((i & 2) != 0) {
            fundingInstrumentType = deviceWalletProvisioningInstrumentInput.instrumentType;
        }
        if ((i & 4) != 0) {
            optional = deviceWalletProvisioningInstrumentInput.cvv;
        }
        return deviceWalletProvisioningInstrumentInput.copy(str, fundingInstrumentType, optional);
    }
}
