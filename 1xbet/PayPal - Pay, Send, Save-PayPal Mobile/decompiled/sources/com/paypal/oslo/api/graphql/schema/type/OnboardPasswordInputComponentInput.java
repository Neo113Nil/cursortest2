package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardPasswordInputComponentInput;", "", "", "password", "Lcom/apollographql/apollo/api/Optional;", "submitId", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardPasswordInputComponentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPassword", "Lcom/apollographql/apollo/api/Optional;", "getSubmitId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OnboardPasswordInputComponentInput {
    private final java.lang.String password;
    private final com.apollographql.apollo.api.Optional<java.lang.String> submitId;

    public OnboardPasswordInputComponentInput(java.lang.String str, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.password = str;
        this.submitId = optional;
    }

    public final java.lang.String getPassword() {
        return this.password;
    }

    public /* synthetic */ OnboardPasswordInputComponentInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getSubmitId() {
        return this.submitId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.password;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.submitId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardPasswordInputComponentInput(password=");
        sb.append(str);
        sb.append(", submitId=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.password.hashCode() * 31) + this.submitId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.OnboardPasswordInputComponentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.OnboardPasswordInputComponentInput onboardPasswordInputComponentInput = (com.paypal.oslo.api.graphql.schema.type.OnboardPasswordInputComponentInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.password, onboardPasswordInputComponentInput.password) && kotlin.jvm.internal.Intrinsics.areEqual(this.submitId, onboardPasswordInputComponentInput.submitId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardPasswordInputComponentInput copy(java.lang.String password, com.apollographql.apollo.api.Optional<java.lang.String> submitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitId, "");
        return new com.paypal.oslo.api.graphql.schema.type.OnboardPasswordInputComponentInput(password, submitId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.submitId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPassword() {
        return this.password;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.OnboardPasswordInputComponentInput copy$default(com.paypal.oslo.api.graphql.schema.type.OnboardPasswordInputComponentInput onboardPasswordInputComponentInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = onboardPasswordInputComponentInput.password;
        }
        if ((i & 2) != 0) {
            optional = onboardPasswordInputComponentInput.submitId;
        }
        return onboardPasswordInputComponentInput.copy(str, optional);
    }
}
