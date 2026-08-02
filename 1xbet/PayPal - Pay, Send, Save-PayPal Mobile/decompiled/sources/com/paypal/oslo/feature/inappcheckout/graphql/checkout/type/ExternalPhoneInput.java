package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ6\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneInput;", "", "", "countryCode", com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber, "Lcom/apollographql/apollo/api/Optional;", "extensionNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPhoneInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountryCode", "getNationalNumber", "Lcom/apollographql/apollo/api/Optional;", "getExtensionNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExternalPhoneInput {
    public static final int $stable = 8;
    private final java.lang.String countryCode;
    private final com.apollographql.apollo.api.Optional<java.lang.String> extensionNumber;
    private final java.lang.String nationalNumber;

    public ExternalPhoneInput(java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.countryCode = str;
        this.nationalNumber = str2;
        this.extensionNumber = optional;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String getNationalNumber() {
        return this.nationalNumber;
    }

    public /* synthetic */ ExternalPhoneInput(java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getExtensionNumber() {
        return this.extensionNumber;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.countryCode;
        java.lang.String str2 = this.nationalNumber;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.extensionNumber;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalPhoneInput(countryCode=");
        sb.append(str);
        sb.append(", nationalNumber=");
        sb.append(str2);
        sb.append(", extensionNumber=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.countryCode.hashCode() * 31) + this.nationalNumber.hashCode()) * 31) + this.extensionNumber.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneInput)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneInput externalPhoneInput = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, externalPhoneInput.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.nationalNumber, externalPhoneInput.nationalNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.extensionNumber, externalPhoneInput.extensionNumber);
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneInput copy(java.lang.String countryCode, java.lang.String nationalNumber, com.apollographql.apollo.api.Optional<java.lang.String> extensionNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nationalNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionNumber, "");
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneInput(countryCode, nationalNumber, extensionNumber);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.extensionNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNationalNumber() {
        return this.nationalNumber;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneInput copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPhoneInput externalPhoneInput, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = externalPhoneInput.countryCode;
        }
        if ((i & 2) != 0) {
            str2 = externalPhoneInput.nationalNumber;
        }
        if ((i & 4) != 0) {
            optional = externalPhoneInput.extensionNumber;
        }
        return externalPhoneInput.copy(str, str2, optional);
    }
}
