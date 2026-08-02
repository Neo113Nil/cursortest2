package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJF\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageEligibilityInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "processName", "processId", "Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageQualifiedIntentInput;", "qualifiedIntent", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageEligibilityInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getProcessName", "getProcessId", "getQualifiedIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MosaicPageEligibilityInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> processId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> processName;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MosaicPageQualifiedIntentInput> qualifiedIntent;

    public MosaicPageEligibilityInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MosaicPageQualifiedIntentInput> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.processName = optional;
        this.processId = optional2;
        this.qualifiedIntent = optional3;
    }

    public /* synthetic */ MosaicPageEligibilityInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getProcessName() {
        return this.processName;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getProcessId() {
        return this.processId;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MosaicPageQualifiedIntentInput> getQualifiedIntent() {
        return this.qualifiedIntent;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.processName;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.processId;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MosaicPageQualifiedIntentInput> optional3 = this.qualifiedIntent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MosaicPageEligibilityInput(processName=");
        sb.append(optional);
        sb.append(", processId=");
        sb.append(optional2);
        sb.append(", qualifiedIntent=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.processName.hashCode() * 31) + this.processId.hashCode()) * 31) + this.qualifiedIntent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput mosaicPageEligibilityInput = (com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.processName, mosaicPageEligibilityInput.processName) && kotlin.jvm.internal.Intrinsics.areEqual(this.processId, mosaicPageEligibilityInput.processId) && kotlin.jvm.internal.Intrinsics.areEqual(this.qualifiedIntent, mosaicPageEligibilityInput.qualifiedIntent);
    }

    public final com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput copy(com.apollographql.apollo.api.Optional<java.lang.String> processName, com.apollographql.apollo.api.Optional<java.lang.String> processId, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MosaicPageQualifiedIntentInput> qualifiedIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualifiedIntent, "");
        return new com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput(processName, processId, qualifiedIntent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MosaicPageQualifiedIntentInput> component3() {
        return this.qualifiedIntent;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.processId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.processName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput copy$default(com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput mosaicPageEligibilityInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = mosaicPageEligibilityInput.processName;
        }
        if ((i & 2) != 0) {
            optional2 = mosaicPageEligibilityInput.processId;
        }
        if ((i & 4) != 0) {
            optional3 = mosaicPageEligibilityInput.qualifiedIntent;
        }
        return mosaicPageEligibilityInput.copy(optional, optional2, optional3);
    }

    public MosaicPageEligibilityInput() {
        this(null, null, null, 7, null);
    }
}
