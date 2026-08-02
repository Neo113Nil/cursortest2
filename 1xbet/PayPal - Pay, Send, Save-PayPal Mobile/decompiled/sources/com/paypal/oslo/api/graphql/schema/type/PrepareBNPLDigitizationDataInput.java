package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PrepareBNPLDigitizationDataInput;", "", "creditAccountId", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/CreditPrepareDigitizationDataDeviceInput;", "device", "Lcom/paypal/oslo/api/graphql/schema/type/CreditPrepareDigitizationDataDeviceWalletInput;", "deviceWallet", "<init>", "(Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/CreditPrepareDigitizationDataDeviceWalletInput;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CreditPrepareDigitizationDataDeviceWalletInput;", "copy", "(Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/CreditPrepareDigitizationDataDeviceWalletInput;)Lcom/paypal/oslo/api/graphql/schema/type/PrepareBNPLDigitizationDataInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCreditAccountId", "Lcom/apollographql/apollo/api/Optional;", "getDevice", "Lcom/paypal/oslo/api/graphql/schema/type/CreditPrepareDigitizationDataDeviceWalletInput;", "getDeviceWallet"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PrepareBNPLDigitizationDataInput {
    private final java.lang.Object creditAccountId;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceInput> device;
    private final com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceWalletInput deviceWallet;

    public PrepareBNPLDigitizationDataInput(java.lang.Object obj, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceInput> optional, com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceWalletInput creditPrepareDigitizationDataDeviceWalletInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditPrepareDigitizationDataDeviceWalletInput, "");
        this.creditAccountId = obj;
        this.device = optional;
        this.deviceWallet = creditPrepareDigitizationDataDeviceWalletInput;
    }

    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public /* synthetic */ PrepareBNPLDigitizationDataInput(java.lang.Object obj, com.apollographql.apollo.api.Optional.Absent absent, com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceWalletInput creditPrepareDigitizationDataDeviceWalletInput, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, creditPrepareDigitizationDataDeviceWalletInput);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceInput> getDevice() {
        return this.device;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceWalletInput getDeviceWallet() {
        return this.deviceWallet;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.creditAccountId;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceInput> optional = this.device;
        com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceWalletInput creditPrepareDigitizationDataDeviceWalletInput = this.deviceWallet;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PrepareBNPLDigitizationDataInput(creditAccountId=");
        sb.append(obj);
        sb.append(", device=");
        sb.append(optional);
        sb.append(", deviceWallet=");
        sb.append(creditPrepareDigitizationDataDeviceWalletInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.creditAccountId.hashCode() * 31) + this.device.hashCode()) * 31) + this.deviceWallet.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.PrepareBNPLDigitizationDataInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.PrepareBNPLDigitizationDataInput prepareBNPLDigitizationDataInput = (com.paypal.oslo.api.graphql.schema.type.PrepareBNPLDigitizationDataInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, prepareBNPLDigitizationDataInput.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.device, prepareBNPLDigitizationDataInput.device) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceWallet, prepareBNPLDigitizationDataInput.deviceWallet);
    }

    public final com.paypal.oslo.api.graphql.schema.type.PrepareBNPLDigitizationDataInput copy(java.lang.Object creditAccountId, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceInput> device, com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceWalletInput deviceWallet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWallet, "");
        return new com.paypal.oslo.api.graphql.schema.type.PrepareBNPLDigitizationDataInput(creditAccountId, device, deviceWallet);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceWalletInput getDeviceWallet() {
        return this.deviceWallet;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceInput> component2() {
        return this.device;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PrepareBNPLDigitizationDataInput copy$default(com.paypal.oslo.api.graphql.schema.type.PrepareBNPLDigitizationDataInput prepareBNPLDigitizationDataInput, java.lang.Object obj, com.apollographql.apollo.api.Optional optional, com.paypal.oslo.api.graphql.schema.type.CreditPrepareDigitizationDataDeviceWalletInput creditPrepareDigitizationDataDeviceWalletInput, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = prepareBNPLDigitizationDataInput.creditAccountId;
        }
        if ((i & 2) != 0) {
            optional = prepareBNPLDigitizationDataInput.device;
        }
        if ((i & 4) != 0) {
            creditPrepareDigitizationDataDeviceWalletInput = prepareBNPLDigitizationDataInput.deviceWallet;
        }
        return prepareBNPLDigitizationDataInput.copy(obj, optional, creditPrepareDigitizationDataDeviceWalletInput);
    }
}
