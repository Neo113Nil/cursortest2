package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ4\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardJourneyContextInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "source", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardJourneyContextInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getFlowType", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OnboardJourneyContextInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> flowType;
    private final com.apollographql.apollo.api.Optional<java.lang.String> source;

    public OnboardJourneyContextInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.flowType = optional;
        this.source = optional2;
    }

    public /* synthetic */ OnboardJourneyContextInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getFlowType() {
        return this.flowType;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getSource() {
        return this.source;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.flowType;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.source;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardJourneyContextInput(flowType=");
        sb.append(optional);
        sb.append(", source=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.flowType.hashCode() * 31) + this.source.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.OnboardJourneyContextInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.OnboardJourneyContextInput onboardJourneyContextInput = (com.paypal.oslo.api.graphql.schema.type.OnboardJourneyContextInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.flowType, onboardJourneyContextInput.flowType) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, onboardJourneyContextInput.source);
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardJourneyContextInput copy(com.apollographql.apollo.api.Optional<java.lang.String> flowType, com.apollographql.apollo.api.Optional<java.lang.String> source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return new com.paypal.oslo.api.graphql.schema.type.OnboardJourneyContextInput(flowType, source);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.source;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.flowType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.OnboardJourneyContextInput copy$default(com.paypal.oslo.api.graphql.schema.type.OnboardJourneyContextInput onboardJourneyContextInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = onboardJourneyContextInput.flowType;
        }
        if ((i & 2) != 0) {
            optional2 = onboardJourneyContextInput.source;
        }
        return onboardJourneyContextInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnboardJourneyContextInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
