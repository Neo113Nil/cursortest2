package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ4\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/EndAuthenticationSessionInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "unbindDevice", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/EndAuthenticationSessionInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getUnbindDevice", "getToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EndAuthenticationSessionInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> token;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> unbindDevice;

    public EndAuthenticationSessionInput(com.apollographql.apollo.api.Optional<java.lang.Boolean> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.unbindDevice = optional;
        this.token = optional2;
    }

    public /* synthetic */ EndAuthenticationSessionInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getUnbindDevice() {
        return this.unbindDevice;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getToken() {
        return this.token;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional = this.unbindDevice;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.token;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EndAuthenticationSessionInput(unbindDevice=");
        sb.append(optional);
        sb.append(", token=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.unbindDevice.hashCode() * 31) + this.token.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.EndAuthenticationSessionInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.EndAuthenticationSessionInput endAuthenticationSessionInput = (com.paypal.oslo.api.graphql.schema.type.EndAuthenticationSessionInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.unbindDevice, endAuthenticationSessionInput.unbindDevice) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, endAuthenticationSessionInput.token);
    }

    public final com.paypal.oslo.api.graphql.schema.type.EndAuthenticationSessionInput copy(com.apollographql.apollo.api.Optional<java.lang.Boolean> unbindDevice, com.apollographql.apollo.api.Optional<java.lang.String> token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unbindDevice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        return new com.paypal.oslo.api.graphql.schema.type.EndAuthenticationSessionInput(unbindDevice, token);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.token;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component1() {
        return this.unbindDevice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.EndAuthenticationSessionInput copy$default(com.paypal.oslo.api.graphql.schema.type.EndAuthenticationSessionInput endAuthenticationSessionInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = endAuthenticationSessionInput.unbindDevice;
        }
        if ((i & 2) != 0) {
            optional2 = endAuthenticationSessionInput.token;
        }
        return endAuthenticationSessionInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EndAuthenticationSessionInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
