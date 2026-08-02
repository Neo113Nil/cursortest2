package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CreateAgenticSessionInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/AgenticSessionPreferencesInput;", "preferences", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CreateAgenticSessionInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateAgenticSessionInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AgenticSessionPreferencesInput> preferences;

    public CreateAgenticSessionInput(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AgenticSessionPreferencesInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.preferences = optional;
    }

    public /* synthetic */ CreateAgenticSessionInput(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AgenticSessionPreferencesInput> getPreferences() {
        return this.preferences;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AgenticSessionPreferencesInput> optional = this.preferences;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateAgenticSessionInput(preferences=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.preferences.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.api.graphql.schema.type.CreateAgenticSessionInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferences, ((com.paypal.oslo.api.graphql.schema.type.CreateAgenticSessionInput) other).preferences);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateAgenticSessionInput copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AgenticSessionPreferencesInput> preferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferences, "");
        return new com.paypal.oslo.api.graphql.schema.type.CreateAgenticSessionInput(preferences);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AgenticSessionPreferencesInput> component1() {
        return this.preferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CreateAgenticSessionInput copy$default(com.paypal.oslo.api.graphql.schema.type.CreateAgenticSessionInput createAgenticSessionInput, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = createAgenticSessionInput.preferences;
        }
        return createAgenticSessionInput.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreateAgenticSessionInput() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
