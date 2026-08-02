package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ>\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InitiateThreeDSecureConfirmationInput;", "", "", "bypassConfirmationProcess", "Lcom/apollographql/apollo/api/Optional;", "", "externalReferenceId", "sdkData", "<init>", "(ZLcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Z", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(ZLcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/InitiateThreeDSecureConfirmationInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Z", "getBypassConfirmationProcess", "Lcom/apollographql/apollo/api/Optional;", "getExternalReferenceId", "getSdkData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InitiateThreeDSecureConfirmationInput {
    private final boolean bypassConfirmationProcess;
    private final com.apollographql.apollo.api.Optional<java.lang.String> externalReferenceId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> sdkData;

    public InitiateThreeDSecureConfirmationInput(boolean z, com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.bypassConfirmationProcess = z;
        this.externalReferenceId = optional;
        this.sdkData = optional2;
    }

    public final boolean getBypassConfirmationProcess() {
        return this.bypassConfirmationProcess;
    }

    public /* synthetic */ InitiateThreeDSecureConfirmationInput(boolean z, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getExternalReferenceId() {
        return this.externalReferenceId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getSdkData() {
        return this.sdkData;
    }

    public final java.lang.String toString() {
        boolean z = this.bypassConfirmationProcess;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.externalReferenceId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.sdkData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InitiateThreeDSecureConfirmationInput(bypassConfirmationProcess=");
        sb.append(z);
        sb.append(", externalReferenceId=");
        sb.append(optional);
        sb.append(", sdkData=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.bypassConfirmationProcess) * 31) + this.externalReferenceId.hashCode()) * 31) + this.sdkData.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.InitiateThreeDSecureConfirmationInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.InitiateThreeDSecureConfirmationInput initiateThreeDSecureConfirmationInput = (com.paypal.oslo.api.graphql.schema.type.InitiateThreeDSecureConfirmationInput) other;
        return this.bypassConfirmationProcess == initiateThreeDSecureConfirmationInput.bypassConfirmationProcess && kotlin.jvm.internal.Intrinsics.areEqual(this.externalReferenceId, initiateThreeDSecureConfirmationInput.externalReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkData, initiateThreeDSecureConfirmationInput.sdkData);
    }

    public final com.paypal.oslo.api.graphql.schema.type.InitiateThreeDSecureConfirmationInput copy(boolean bypassConfirmationProcess, com.apollographql.apollo.api.Optional<java.lang.String> externalReferenceId, com.apollographql.apollo.api.Optional<java.lang.String> sdkData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalReferenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkData, "");
        return new com.paypal.oslo.api.graphql.schema.type.InitiateThreeDSecureConfirmationInput(bypassConfirmationProcess, externalReferenceId, sdkData);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.sdkData;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.externalReferenceId;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getBypassConfirmationProcess() {
        return this.bypassConfirmationProcess;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InitiateThreeDSecureConfirmationInput copy$default(com.paypal.oslo.api.graphql.schema.type.InitiateThreeDSecureConfirmationInput initiateThreeDSecureConfirmationInput, boolean z, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = initiateThreeDSecureConfirmationInput.bypassConfirmationProcess;
        }
        if ((i & 2) != 0) {
            optional = initiateThreeDSecureConfirmationInput.externalReferenceId;
        }
        if ((i & 4) != 0) {
            optional2 = initiateThreeDSecureConfirmationInput.sdkData;
        }
        return initiateThreeDSecureConfirmationInput.copy(z, optional, optional2);
    }
}
