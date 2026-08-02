package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLProvisionedTokenInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletDeviceType;", "deviceType", "Lcom/apollographql/apollo/api/Optional;", "referenceId", "Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletType;", "walletType", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletDeviceType;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletType;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletDeviceType;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletType;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletDeviceType;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletType;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLProvisionedTokenInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletDeviceType;", "getDeviceType", "Lcom/apollographql/apollo/api/Optional;", "getReferenceId", "Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletType;", "getWalletType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BNPLProvisionedTokenInput {
    private final com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType deviceType;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> referenceId;
    private final com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType walletType;

    public BNPLProvisionedTokenInput(com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType creditExternalWalletDeviceType, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional, com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType creditExternalWalletType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditExternalWalletDeviceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditExternalWalletType, "");
        this.deviceType = creditExternalWalletDeviceType;
        this.referenceId = optional;
        this.walletType = creditExternalWalletType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType getDeviceType() {
        return this.deviceType;
    }

    public /* synthetic */ BNPLProvisionedTokenInput(com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType creditExternalWalletDeviceType, com.apollographql.apollo.api.Optional.Absent absent, com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType creditExternalWalletType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(creditExternalWalletDeviceType, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, creditExternalWalletType);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getReferenceId() {
        return this.referenceId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType getWalletType() {
        return this.walletType;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType creditExternalWalletDeviceType = this.deviceType;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.referenceId;
        com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType creditExternalWalletType = this.walletType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BNPLProvisionedTokenInput(deviceType=");
        sb.append(creditExternalWalletDeviceType);
        sb.append(", referenceId=");
        sb.append(optional);
        sb.append(", walletType=");
        sb.append(creditExternalWalletType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.deviceType.hashCode() * 31) + this.referenceId.hashCode()) * 31) + this.walletType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BNPLProvisionedTokenInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BNPLProvisionedTokenInput bNPLProvisionedTokenInput = (com.paypal.oslo.api.graphql.schema.type.BNPLProvisionedTokenInput) other;
        return this.deviceType == bNPLProvisionedTokenInput.deviceType && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, bNPLProvisionedTokenInput.referenceId) && this.walletType == bNPLProvisionedTokenInput.walletType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLProvisionedTokenInput copy(com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType deviceType, com.apollographql.apollo.api.Optional<? extends java.lang.Object> referenceId, com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType walletType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletType, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLProvisionedTokenInput(deviceType, referenceId, walletType);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType getWalletType() {
        return this.walletType;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component2() {
        return this.referenceId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType getDeviceType() {
        return this.deviceType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BNPLProvisionedTokenInput copy$default(com.paypal.oslo.api.graphql.schema.type.BNPLProvisionedTokenInput bNPLProvisionedTokenInput, com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType creditExternalWalletDeviceType, com.apollographql.apollo.api.Optional optional, com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType creditExternalWalletType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            creditExternalWalletDeviceType = bNPLProvisionedTokenInput.deviceType;
        }
        if ((i & 2) != 0) {
            optional = bNPLProvisionedTokenInput.referenceId;
        }
        if ((i & 4) != 0) {
            creditExternalWalletType = bNPLProvisionedTokenInput.walletType;
        }
        return bNPLProvisionedTokenInput.copy(creditExternalWalletDeviceType, optional, creditExternalWalletType);
    }
}
