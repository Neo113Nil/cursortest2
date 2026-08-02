package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJP\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR(\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u000fR(\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u000fR\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b#\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardAccountCreationTermsInputComponentInput;", "", "", "accepted", "Lcom/apollographql/apollo/api/Optional;", "", "majorVersion", "minorVersion", "", "submitId", "<init>", "(ZLcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Z", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "component4", "copy", "(ZLcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardAccountCreationTermsInputComponentInput;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Z", "getAccepted", "Lcom/apollographql/apollo/api/Optional;", "getMajorVersion", "getMajorVersion$annotations", "()V", "getMinorVersion", "getMinorVersion$annotations", "getSubmitId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OnboardAccountCreationTermsInputComponentInput {
    private final boolean accepted;
    private final com.apollographql.apollo.api.Optional<java.lang.Integer> majorVersion;
    private final com.apollographql.apollo.api.Optional<java.lang.Integer> minorVersion;
    private final com.apollographql.apollo.api.Optional<java.lang.String> submitId;

    @kotlin.Deprecated(message = "Not required - server will cache the version.")
    public static /* synthetic */ void getMajorVersion$annotations() {
    }

    @kotlin.Deprecated(message = "Not required - server will cache the version.")
    public static /* synthetic */ void getMinorVersion$annotations() {
    }

    public OnboardAccountCreationTermsInputComponentInput(boolean z, com.apollographql.apollo.api.Optional<java.lang.Integer> optional, com.apollographql.apollo.api.Optional<java.lang.Integer> optional2, com.apollographql.apollo.api.Optional<java.lang.String> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.accepted = z;
        this.majorVersion = optional;
        this.minorVersion = optional2;
        this.submitId = optional3;
    }

    public final boolean getAccepted() {
        return this.accepted;
    }

    public /* synthetic */ OnboardAccountCreationTermsInputComponentInput(boolean z, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> getMajorVersion() {
        return this.majorVersion;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> getMinorVersion() {
        return this.minorVersion;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getSubmitId() {
        return this.submitId;
    }

    public final java.lang.String toString() {
        boolean z = this.accepted;
        com.apollographql.apollo.api.Optional<java.lang.Integer> optional = this.majorVersion;
        com.apollographql.apollo.api.Optional<java.lang.Integer> optional2 = this.minorVersion;
        com.apollographql.apollo.api.Optional<java.lang.String> optional3 = this.submitId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardAccountCreationTermsInputComponentInput(accepted=");
        sb.append(z);
        sb.append(", majorVersion=");
        sb.append(optional);
        sb.append(", minorVersion=");
        sb.append(optional2);
        sb.append(", submitId=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.accepted) * 31) + this.majorVersion.hashCode()) * 31) + this.minorVersion.hashCode()) * 31) + this.submitId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationTermsInputComponentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationTermsInputComponentInput onboardAccountCreationTermsInputComponentInput = (com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationTermsInputComponentInput) other;
        return this.accepted == onboardAccountCreationTermsInputComponentInput.accepted && kotlin.jvm.internal.Intrinsics.areEqual(this.majorVersion, onboardAccountCreationTermsInputComponentInput.majorVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.minorVersion, onboardAccountCreationTermsInputComponentInput.minorVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.submitId, onboardAccountCreationTermsInputComponentInput.submitId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationTermsInputComponentInput copy(boolean accepted, com.apollographql.apollo.api.Optional<java.lang.Integer> majorVersion, com.apollographql.apollo.api.Optional<java.lang.Integer> minorVersion, com.apollographql.apollo.api.Optional<java.lang.String> submitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(majorVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minorVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitId, "");
        return new com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationTermsInputComponentInput(accepted, majorVersion, minorVersion, submitId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component4() {
        return this.submitId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> component3() {
        return this.minorVersion;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> component2() {
        return this.majorVersion;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAccepted() {
        return this.accepted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationTermsInputComponentInput copy$default(com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationTermsInputComponentInput onboardAccountCreationTermsInputComponentInput, boolean z, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = onboardAccountCreationTermsInputComponentInput.accepted;
        }
        if ((i & 2) != 0) {
            optional = onboardAccountCreationTermsInputComponentInput.majorVersion;
        }
        if ((i & 4) != 0) {
            optional2 = onboardAccountCreationTermsInputComponentInput.minorVersion;
        }
        if ((i & 8) != 0) {
            optional3 = onboardAccountCreationTermsInputComponentInput.submitId;
        }
        return onboardAccountCreationTermsInputComponentInput.copy(z, optional, optional2, optional3);
    }
}
