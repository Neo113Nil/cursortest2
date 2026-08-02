package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJP\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u000bR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "bankCode", "countryCode", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Iban, "branchCode", "<init>", "(Lcom/apollographql/apollo/api/Optional;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "()Ljava/lang/Object;", "component3", "component4", "copy", "(Lcom/apollographql/apollo/api/Optional;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/BankInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getBankCode", "Ljava/lang/Object;", "getCountryCode", "getIban", "getBranchCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BankInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> bankCode;
    private final com.apollographql.apollo.api.Optional<java.lang.String> branchCode;
    private final java.lang.Object countryCode;
    private final com.apollographql.apollo.api.Optional<java.lang.String> iban;

    public BankInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, java.lang.Object obj, com.apollographql.apollo.api.Optional<java.lang.String> optional2, com.apollographql.apollo.api.Optional<java.lang.String> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.bankCode = optional;
        this.countryCode = obj;
        this.iban = optional2;
        this.branchCode = optional3;
    }

    public /* synthetic */ BankInput(com.apollographql.apollo.api.Optional.Absent absent, java.lang.Object obj, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, obj, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getBankCode() {
        return this.bankCode;
    }

    public final java.lang.Object getCountryCode() {
        return this.countryCode;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getIban() {
        return this.iban;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getBranchCode() {
        return this.branchCode;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.bankCode;
        java.lang.Object obj = this.countryCode;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.iban;
        com.apollographql.apollo.api.Optional<java.lang.String> optional3 = this.branchCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BankInput(bankCode=");
        sb.append(optional);
        sb.append(", countryCode=");
        sb.append(obj);
        sb.append(", iban=");
        sb.append(optional2);
        sb.append(", branchCode=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.bankCode.hashCode() * 31) + this.countryCode.hashCode()) * 31) + this.iban.hashCode()) * 31) + this.branchCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BankInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BankInput bankInput = (com.paypal.oslo.api.graphql.schema.type.BankInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.bankCode, bankInput.bankCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, bankInput.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.iban, bankInput.iban) && kotlin.jvm.internal.Intrinsics.areEqual(this.branchCode, bankInput.branchCode);
    }

    public final com.paypal.oslo.api.graphql.schema.type.BankInput copy(com.apollographql.apollo.api.Optional<java.lang.String> bankCode, java.lang.Object countryCode, com.apollographql.apollo.api.Optional<java.lang.String> iban, com.apollographql.apollo.api.Optional<java.lang.String> branchCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iban, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(branchCode, "");
        return new com.paypal.oslo.api.graphql.schema.type.BankInput(bankCode, countryCode, iban, branchCode);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component4() {
        return this.branchCode;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.iban;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getCountryCode() {
        return this.countryCode;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.bankCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BankInput copy$default(com.paypal.oslo.api.graphql.schema.type.BankInput bankInput, com.apollographql.apollo.api.Optional optional, java.lang.Object obj, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            optional = bankInput.bankCode;
        }
        if ((i & 2) != 0) {
            obj = bankInput.countryCode;
        }
        if ((i & 4) != 0) {
            optional2 = bankInput.iban;
        }
        if ((i & 8) != 0) {
            optional3 = bankInput.branchCode;
        }
        return bankInput.copy(optional, obj, optional2, optional3);
    }
}
