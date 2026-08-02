package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJF\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDateOfBirthInput;", "", "Lcom/apollographql/apollo/api/Optional;", "day", "month", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDateOfBirthInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getDay", "getMonth", "getYear"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExternalDateOfBirthInput {
    public static final int $stable = 8;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> day;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> month;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> year;

    public ExternalDateOfBirthInput(com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional2, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.day = optional;
        this.month = optional2;
        this.year = optional3;
    }

    public /* synthetic */ ExternalDateOfBirthInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getDay() {
        return this.day;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getMonth() {
        return this.month;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getYear() {
        return this.year;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.day;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional2 = this.month;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional3 = this.year;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalDateOfBirthInput(day=");
        sb.append(optional);
        sb.append(", month=");
        sb.append(optional2);
        sb.append(", year=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.day.hashCode() * 31) + this.month.hashCode()) * 31) + this.year.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDateOfBirthInput)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDateOfBirthInput externalDateOfBirthInput = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDateOfBirthInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.day, externalDateOfBirthInput.day) && kotlin.jvm.internal.Intrinsics.areEqual(this.month, externalDateOfBirthInput.month) && kotlin.jvm.internal.Intrinsics.areEqual(this.year, externalDateOfBirthInput.year);
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDateOfBirthInput copy(com.apollographql.apollo.api.Optional<? extends java.lang.Object> day, com.apollographql.apollo.api.Optional<? extends java.lang.Object> month, com.apollographql.apollo.api.Optional<? extends java.lang.Object> year) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(day, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDateOfBirthInput(day, month, year);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component3() {
        return this.year;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component2() {
        return this.month;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component1() {
        return this.day;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDateOfBirthInput copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDateOfBirthInput externalDateOfBirthInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = externalDateOfBirthInput.day;
        }
        if ((i & 2) != 0) {
            optional2 = externalDateOfBirthInput.month;
        }
        if ((i & 4) != 0) {
            optional3 = externalDateOfBirthInput.year;
        }
        return externalDateOfBirthInput.copy(optional, optional2, optional3);
    }

    public ExternalDateOfBirthInput() {
        this(null, null, null, 7, null);
    }
}
