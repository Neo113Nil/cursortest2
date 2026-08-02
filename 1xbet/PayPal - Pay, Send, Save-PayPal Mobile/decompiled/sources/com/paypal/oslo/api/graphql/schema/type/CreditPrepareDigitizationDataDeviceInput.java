package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ4\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CreditPrepareDigitizationDataDeviceInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "externalDeviceId", "Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletDeviceType;", "deviceType", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CreditPrepareDigitizationDataDeviceInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getExternalDeviceId", "getDeviceType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreditPrepareDigitizationDataDeviceInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType> deviceType;
    private final com.apollographql.apollo.api.Optional<java.lang.String> externalDeviceId;

    /* JADX WARN: Multi-variable type inference failed */
    public CreditPrepareDigitizationDataDeviceInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.externalDeviceId = optional;
        this.deviceType = optional2;
    }

    public /* synthetic */ CreditPrepareDigitizationDataDeviceInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getExternalDeviceId() {
        return this.externalDeviceId;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType> getDeviceType() {
        return this.deviceType;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.externalDeviceId;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType> optional2 = this.deviceType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreditPrepareDigitizationDataDeviceInput(externalDeviceId=");
        sb.append(optional);
        sb.append(", deviceType=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.externalDeviceId.hashCode() * 31) + this.deviceType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceInput creditPrepareDigitizationDataDeviceInput = (com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.externalDeviceId, creditPrepareDigitizationDataDeviceInput.externalDeviceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceType, creditPrepareDigitizationDataDeviceInput.deviceType);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceInput copy(com.apollographql.apollo.api.Optional<java.lang.String> externalDeviceId, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType> deviceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalDeviceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        return new com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceInput(externalDeviceId, deviceType);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType> component2() {
        return this.deviceType;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.externalDeviceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceInput copy$default(com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceInput creditPrepareDigitizationDataDeviceInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = creditPrepareDigitizationDataDeviceInput.externalDeviceId;
        }
        if ((i & 2) != 0) {
            optional2 = creditPrepareDigitizationDataDeviceInput.deviceType;
        }
        return creditPrepareDigitizationDataDeviceInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreditPrepareDigitizationDataDeviceInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
