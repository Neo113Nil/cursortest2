package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJL\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R%\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CreditAppleWalletPrepareDigitizationDataInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "", "certificates", "nonce", "nonceSignature", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CreditAppleWalletPrepareDigitizationDataInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getCertificates", "getNonce", "getNonceSignature"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreditAppleWalletPrepareDigitizationDataInput {
    private final com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> certificates;
    private final com.apollographql.apollo.api.Optional<java.lang.String> nonce;
    private final com.apollographql.apollo.api.Optional<java.lang.String> nonceSignature;

    /* JADX WARN: Multi-variable type inference failed */
    public CreditAppleWalletPrepareDigitizationDataInput(com.apollographql.apollo.api.Optional<? extends java.util.List<java.lang.String>> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2, com.apollographql.apollo.api.Optional<java.lang.String> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.certificates = optional;
        this.nonce = optional2;
        this.nonceSignature = optional3;
    }

    public /* synthetic */ CreditAppleWalletPrepareDigitizationDataInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> getCertificates() {
        return this.certificates;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getNonce() {
        return this.nonce;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getNonceSignature() {
        return this.nonceSignature;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> optional = this.certificates;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.nonce;
        com.apollographql.apollo.api.Optional<java.lang.String> optional3 = this.nonceSignature;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreditAppleWalletPrepareDigitizationDataInput(certificates=");
        sb.append(optional);
        sb.append(", nonce=");
        sb.append(optional2);
        sb.append(", nonceSignature=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.certificates.hashCode() * 31) + this.nonce.hashCode()) * 31) + this.nonceSignature.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CreditAppleWalletPrepareDigitizationDataInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CreditAppleWalletPrepareDigitizationDataInput creditAppleWalletPrepareDigitizationDataInput = (com.paypal.oslo.api.graphql.schema.type.CreditAppleWalletPrepareDigitizationDataInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.certificates, creditAppleWalletPrepareDigitizationDataInput.certificates) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, creditAppleWalletPrepareDigitizationDataInput.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonceSignature, creditAppleWalletPrepareDigitizationDataInput.nonceSignature);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreditAppleWalletPrepareDigitizationDataInput copy(com.apollographql.apollo.api.Optional<? extends java.util.List<java.lang.String>> certificates, com.apollographql.apollo.api.Optional<java.lang.String> nonce, com.apollographql.apollo.api.Optional<java.lang.String> nonceSignature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificates, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonceSignature, "");
        return new com.paypal.oslo.api.graphql.schema.type.CreditAppleWalletPrepareDigitizationDataInput(certificates, nonce, nonceSignature);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.nonceSignature;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.nonce;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> component1() {
        return this.certificates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CreditAppleWalletPrepareDigitizationDataInput copy$default(com.paypal.oslo.api.graphql.schema.type.CreditAppleWalletPrepareDigitizationDataInput creditAppleWalletPrepareDigitizationDataInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = creditAppleWalletPrepareDigitizationDataInput.certificates;
        }
        if ((i & 2) != 0) {
            optional2 = creditAppleWalletPrepareDigitizationDataInput.nonce;
        }
        if ((i & 4) != 0) {
            optional3 = creditAppleWalletPrepareDigitizationDataInput.nonceSignature;
        }
        return creditAppleWalletPrepareDigitizationDataInput.copy(optional, optional2, optional3);
    }

    public CreditAppleWalletPrepareDigitizationDataInput() {
        this(null, null, null, 7, null);
    }
}
