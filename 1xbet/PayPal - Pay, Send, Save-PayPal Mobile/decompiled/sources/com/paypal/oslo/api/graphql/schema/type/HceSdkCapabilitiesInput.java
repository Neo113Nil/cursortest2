package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJL\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\rR(\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/HceSdkCapabilitiesInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletActiveSdkType;", "activeSdk", "", "version", "", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletIdnvMethod;", "supportedVerificationMethods", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/HceSdkCapabilitiesInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getActiveSdk", "getVersion", "getSupportedVerificationMethods"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HceSdkCapabilitiesInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DeviceWalletActiveSdkType> activeSdk;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DeviceWalletIdnvMethod>> supportedVerificationMethods;
    private final com.apollographql.apollo.api.Optional<java.lang.String> version;

    /* JADX WARN: Multi-variable type inference failed */
    public HceSdkCapabilitiesInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.DeviceWalletActiveSdkType> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DeviceWalletIdnvMethod>> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.activeSdk = optional;
        this.version = optional2;
        this.supportedVerificationMethods = optional3;
    }

    public /* synthetic */ HceSdkCapabilitiesInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DeviceWalletActiveSdkType> getActiveSdk() {
        return this.activeSdk;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getVersion() {
        return this.version;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DeviceWalletIdnvMethod>> getSupportedVerificationMethods() {
        return this.supportedVerificationMethods;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DeviceWalletActiveSdkType> optional = this.activeSdk;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.version;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DeviceWalletIdnvMethod>> optional3 = this.supportedVerificationMethods;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HceSdkCapabilitiesInput(activeSdk=");
        sb.append(optional);
        sb.append(", version=");
        sb.append(optional2);
        sb.append(", supportedVerificationMethods=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.activeSdk.hashCode() * 31) + this.version.hashCode()) * 31) + this.supportedVerificationMethods.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.HceSdkCapabilitiesInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.HceSdkCapabilitiesInput hceSdkCapabilitiesInput = (com.paypal.oslo.api.graphql.schema.type.HceSdkCapabilitiesInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.activeSdk, hceSdkCapabilitiesInput.activeSdk) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, hceSdkCapabilitiesInput.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedVerificationMethods, hceSdkCapabilitiesInput.supportedVerificationMethods);
    }

    public final com.paypal.oslo.api.graphql.schema.type.HceSdkCapabilitiesInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.DeviceWalletActiveSdkType> activeSdk, com.apollographql.apollo.api.Optional<java.lang.String> version, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DeviceWalletIdnvMethod>> supportedVerificationMethods) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeSdk, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedVerificationMethods, "");
        return new com.paypal.oslo.api.graphql.schema.type.HceSdkCapabilitiesInput(activeSdk, version, supportedVerificationMethods);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DeviceWalletIdnvMethod>> component3() {
        return this.supportedVerificationMethods;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.version;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DeviceWalletActiveSdkType> component1() {
        return this.activeSdk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.HceSdkCapabilitiesInput copy$default(com.paypal.oslo.api.graphql.schema.type.HceSdkCapabilitiesInput hceSdkCapabilitiesInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = hceSdkCapabilitiesInput.activeSdk;
        }
        if ((i & 2) != 0) {
            optional2 = hceSdkCapabilitiesInput.version;
        }
        if ((i & 4) != 0) {
            optional3 = hceSdkCapabilitiesInput.supportedVerificationMethods;
        }
        return hceSdkCapabilitiesInput.copy(optional, optional2, optional3);
    }

    public HceSdkCapabilitiesInput() {
        this(null, null, null, 7, null);
    }
}
