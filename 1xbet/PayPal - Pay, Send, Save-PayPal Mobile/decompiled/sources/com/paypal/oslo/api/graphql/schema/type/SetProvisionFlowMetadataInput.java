package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ4\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SetProvisionFlowMetadataInput;", "", "Lcom/apollographql/apollo/api/Optional;", "returnUri", "cancelUri", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/SetProvisionFlowMetadataInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getReturnUri", "getCancelUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SetProvisionFlowMetadataInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Object> cancelUri;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> returnUri;

    public SetProvisionFlowMetadataInput(com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.returnUri = optional;
        this.cancelUri = optional2;
    }

    public /* synthetic */ SetProvisionFlowMetadataInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getReturnUri() {
        return this.returnUri;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getCancelUri() {
        return this.cancelUri;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.returnUri;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional2 = this.cancelUri;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SetProvisionFlowMetadataInput(returnUri=");
        sb.append(optional);
        sb.append(", cancelUri=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.returnUri.hashCode() * 31) + this.cancelUri.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.SetProvisionFlowMetadataInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.SetProvisionFlowMetadataInput setProvisionFlowMetadataInput = (com.paypal.oslo.api.graphql.schema.type.SetProvisionFlowMetadataInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.returnUri, setProvisionFlowMetadataInput.returnUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.cancelUri, setProvisionFlowMetadataInput.cancelUri);
    }

    public final com.paypal.oslo.api.graphql.schema.type.SetProvisionFlowMetadataInput copy(com.apollographql.apollo.api.Optional<? extends java.lang.Object> returnUri, com.apollographql.apollo.api.Optional<? extends java.lang.Object> cancelUri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnUri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelUri, "");
        return new com.paypal.oslo.api.graphql.schema.type.SetProvisionFlowMetadataInput(returnUri, cancelUri);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component2() {
        return this.cancelUri;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component1() {
        return this.returnUri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SetProvisionFlowMetadataInput copy$default(com.paypal.oslo.api.graphql.schema.type.SetProvisionFlowMetadataInput setProvisionFlowMetadataInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = setProvisionFlowMetadataInput.returnUri;
        }
        if ((i & 2) != 0) {
            optional2 = setProvisionFlowMetadataInput.cancelUri;
        }
        return setProvisionFlowMetadataInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SetProvisionFlowMetadataInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
