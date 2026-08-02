package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJF\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageTaxIdentificationNumberInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "ssn4", "ssn9", "itin", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageTaxIdentificationNumberInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getSsn4", "getSsn9", "getItin"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MosaicPageTaxIdentificationNumberInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> itin;
    private final com.apollographql.apollo.api.Optional<java.lang.String> ssn4;
    private final com.apollographql.apollo.api.Optional<java.lang.String> ssn9;

    public MosaicPageTaxIdentificationNumberInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2, com.apollographql.apollo.api.Optional<java.lang.String> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.ssn4 = optional;
        this.ssn9 = optional2;
        this.itin = optional3;
    }

    public /* synthetic */ MosaicPageTaxIdentificationNumberInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getSsn4() {
        return this.ssn4;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getSsn9() {
        return this.ssn9;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getItin() {
        return this.itin;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.ssn4;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.ssn9;
        com.apollographql.apollo.api.Optional<java.lang.String> optional3 = this.itin;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MosaicPageTaxIdentificationNumberInput(ssn4=");
        sb.append(optional);
        sb.append(", ssn9=");
        sb.append(optional2);
        sb.append(", itin=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.ssn4.hashCode() * 31) + this.ssn9.hashCode()) * 31) + this.itin.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInput mosaicPageTaxIdentificationNumberInput = (com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.ssn4, mosaicPageTaxIdentificationNumberInput.ssn4) && kotlin.jvm.internal.Intrinsics.areEqual(this.ssn9, mosaicPageTaxIdentificationNumberInput.ssn9) && kotlin.jvm.internal.Intrinsics.areEqual(this.itin, mosaicPageTaxIdentificationNumberInput.itin);
    }

    public final com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInput copy(com.apollographql.apollo.api.Optional<java.lang.String> ssn4, com.apollographql.apollo.api.Optional<java.lang.String> ssn9, com.apollographql.apollo.api.Optional<java.lang.String> itin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ssn4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ssn9, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itin, "");
        return new com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInput(ssn4, ssn9, itin);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.itin;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.ssn9;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.ssn4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInput copy$default(com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInput mosaicPageTaxIdentificationNumberInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = mosaicPageTaxIdentificationNumberInput.ssn4;
        }
        if ((i & 2) != 0) {
            optional2 = mosaicPageTaxIdentificationNumberInput.ssn9;
        }
        if ((i & 4) != 0) {
            optional3 = mosaicPageTaxIdentificationNumberInput.itin;
        }
        return mosaicPageTaxIdentificationNumberInput.copy(optional, optional2, optional3);
    }

    public MosaicPageTaxIdentificationNumberInput() {
        this(null, null, null, 7, null);
    }
}
