package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJL\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\rR(\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingThreeDSCardMetadataInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingCardUsageConsentLevel;", "consentLevel", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingCardConsentMetadataInput;", "consentMetadata", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingThreeDSMetadataInput;", "threeDsMetadata", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingThreeDSCardMetadataInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getConsentLevel", "getConsentMetadata", "getThreeDsMetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BNPLServicingThreeDSCardMetadataInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLServicingCardUsageConsentLevel> consentLevel;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingCardConsentMetadataInput>> consentMetadata;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLServicingThreeDSMetadataInput> threeDsMetadata;

    /* JADX WARN: Multi-variable type inference failed */
    public BNPLServicingThreeDSCardMetadataInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.BNPLServicingCardUsageConsentLevel> optional, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingCardConsentMetadataInput>> optional2, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLServicingThreeDSMetadataInput> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.consentLevel = optional;
        this.consentMetadata = optional2;
        this.threeDsMetadata = optional3;
    }

    public /* synthetic */ BNPLServicingThreeDSCardMetadataInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLServicingCardUsageConsentLevel> getConsentLevel() {
        return this.consentLevel;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingCardConsentMetadataInput>> getConsentMetadata() {
        return this.consentMetadata;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLServicingThreeDSMetadataInput> getThreeDsMetadata() {
        return this.threeDsMetadata;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLServicingCardUsageConsentLevel> optional = this.consentLevel;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingCardConsentMetadataInput>> optional2 = this.consentMetadata;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLServicingThreeDSMetadataInput> optional3 = this.threeDsMetadata;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BNPLServicingThreeDSCardMetadataInput(consentLevel=");
        sb.append(optional);
        sb.append(", consentMetadata=");
        sb.append(optional2);
        sb.append(", threeDsMetadata=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.consentLevel.hashCode() * 31) + this.consentMetadata.hashCode()) * 31) + this.threeDsMetadata.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BNPLServicingThreeDSCardMetadataInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingThreeDSCardMetadataInput bNPLServicingThreeDSCardMetadataInput = (com.paypal.oslo.api.graphql.schema.type.BNPLServicingThreeDSCardMetadataInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.consentLevel, bNPLServicingThreeDSCardMetadataInput.consentLevel) && kotlin.jvm.internal.Intrinsics.areEqual(this.consentMetadata, bNPLServicingThreeDSCardMetadataInput.consentMetadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.threeDsMetadata, bNPLServicingThreeDSCardMetadataInput.threeDsMetadata);
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingThreeDSCardMetadataInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.BNPLServicingCardUsageConsentLevel> consentLevel, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingCardConsentMetadataInput>> consentMetadata, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLServicingThreeDSMetadataInput> threeDsMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentLevel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDsMetadata, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLServicingThreeDSCardMetadataInput(consentLevel, consentMetadata, threeDsMetadata);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLServicingThreeDSMetadataInput> component3() {
        return this.threeDsMetadata;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingCardConsentMetadataInput>> component2() {
        return this.consentMetadata;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BNPLServicingCardUsageConsentLevel> component1() {
        return this.consentLevel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BNPLServicingThreeDSCardMetadataInput copy$default(com.paypal.oslo.api.graphql.schema.type.BNPLServicingThreeDSCardMetadataInput bNPLServicingThreeDSCardMetadataInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = bNPLServicingThreeDSCardMetadataInput.consentLevel;
        }
        if ((i & 2) != 0) {
            optional2 = bNPLServicingThreeDSCardMetadataInput.consentMetadata;
        }
        if ((i & 4) != 0) {
            optional3 = bNPLServicingThreeDSCardMetadataInput.threeDsMetadata;
        }
        return bNPLServicingThreeDSCardMetadataInput.copy(optional, optional2, optional3);
    }

    public BNPLServicingThreeDSCardMetadataInput() {
        this(null, null, null, 7, null);
    }
}
