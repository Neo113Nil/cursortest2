package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0018\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J¢\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0002\u0010\f\u001a\u00020\u00052\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0013R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0015R\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b,\u0010\u0015R\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b-\u0010\u0015R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b.\u0010\u0015R\u001a\u0010\f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u001aR\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b1\u0010\u0015R\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b2\u0010\u0015R\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b3\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalThreeDsContingencyInput;", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalThreeDsIndicator;", "threeDsIndicator", "Lcom/apollographql/apollo/api/Optional;", "", "ip", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalThreeDsDeviceDetailsInput;", "threeDsDeviceDetails", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalThreeDsBrowserDetailsInput;", "threeDsBrowserDetails", "paymentAuthenticationRequest", "instrumentId", "returnUrl", "referenceId", "threeDsTransactionId", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalThreeDsIndicator;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalThreeDsIndicator;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "component4", "component5", "component6", "()Ljava/lang/String;", "component7", "component8", "component9", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalThreeDsIndicator;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalThreeDsContingencyInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalThreeDsIndicator;", "getThreeDsIndicator", "Lcom/apollographql/apollo/api/Optional;", "getIp", "getThreeDsDeviceDetails", "getThreeDsBrowserDetails", "getPaymentAuthenticationRequest", "Ljava/lang/String;", "getInstrumentId", "getReturnUrl", "getReferenceId", "getThreeDsTransactionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExternalThreeDsContingencyInput {
    public static final int $stable = 8;
    private final java.lang.String instrumentId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> ip;
    private final com.apollographql.apollo.api.Optional<java.lang.String> paymentAuthenticationRequest;
    private final com.apollographql.apollo.api.Optional<java.lang.String> referenceId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> returnUrl;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsBrowserDetailsInput> threeDsBrowserDetails;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsDeviceDetailsInput> threeDsDeviceDetails;
    private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsIndicator threeDsIndicator;
    private final com.apollographql.apollo.api.Optional<java.lang.String> threeDsTransactionId;

    public ExternalThreeDsContingencyInput(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsIndicator externalThreeDsIndicator, com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsDeviceDetailsInput> optional2, com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsBrowserDetailsInput> optional3, com.apollographql.apollo.api.Optional<java.lang.String> optional4, java.lang.String str, com.apollographql.apollo.api.Optional<java.lang.String> optional5, com.apollographql.apollo.api.Optional<java.lang.String> optional6, com.apollographql.apollo.api.Optional<java.lang.String> optional7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalThreeDsIndicator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional7, "");
        this.threeDsIndicator = externalThreeDsIndicator;
        this.ip = optional;
        this.threeDsDeviceDetails = optional2;
        this.threeDsBrowserDetails = optional3;
        this.paymentAuthenticationRequest = optional4;
        this.instrumentId = str;
        this.returnUrl = optional5;
        this.referenceId = optional6;
        this.threeDsTransactionId = optional7;
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsIndicator getThreeDsIndicator() {
        return this.threeDsIndicator;
    }

    public /* synthetic */ ExternalThreeDsContingencyInput(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsIndicator externalThreeDsIndicator, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, com.apollographql.apollo.api.Optional optional4, java.lang.String str, com.apollographql.apollo.api.Optional optional5, com.apollographql.apollo.api.Optional optional6, com.apollographql.apollo.api.Optional optional7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(externalThreeDsIndicator, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional2, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional3, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional4, str, (i & 64) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional5, (i & 128) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional6, (i & 256) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional7);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getIp() {
        return this.ip;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsDeviceDetailsInput> getThreeDsDeviceDetails() {
        return this.threeDsDeviceDetails;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsBrowserDetailsInput> getThreeDsBrowserDetails() {
        return this.threeDsBrowserDetails;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getPaymentAuthenticationRequest() {
        return this.paymentAuthenticationRequest;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getReturnUrl() {
        return this.returnUrl;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getReferenceId() {
        return this.referenceId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getThreeDsTransactionId() {
        return this.threeDsTransactionId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsIndicator externalThreeDsIndicator = this.threeDsIndicator;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.ip;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsDeviceDetailsInput> optional2 = this.threeDsDeviceDetails;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsBrowserDetailsInput> optional3 = this.threeDsBrowserDetails;
        com.apollographql.apollo.api.Optional<java.lang.String> optional4 = this.paymentAuthenticationRequest;
        java.lang.String str = this.instrumentId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional5 = this.returnUrl;
        com.apollographql.apollo.api.Optional<java.lang.String> optional6 = this.referenceId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional7 = this.threeDsTransactionId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalThreeDsContingencyInput(threeDsIndicator=");
        sb.append(externalThreeDsIndicator);
        sb.append(", ip=");
        sb.append(optional);
        sb.append(", threeDsDeviceDetails=");
        sb.append(optional2);
        sb.append(", threeDsBrowserDetails=");
        sb.append(optional3);
        sb.append(", paymentAuthenticationRequest=");
        sb.append(optional4);
        sb.append(", instrumentId=");
        sb.append(str);
        sb.append(", returnUrl=");
        sb.append(optional5);
        sb.append(", referenceId=");
        sb.append(optional6);
        sb.append(", threeDsTransactionId=");
        sb.append(optional7);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((this.threeDsIndicator.hashCode() * 31) + this.ip.hashCode()) * 31) + this.threeDsDeviceDetails.hashCode()) * 31) + this.threeDsBrowserDetails.hashCode()) * 31) + this.paymentAuthenticationRequest.hashCode()) * 31) + this.instrumentId.hashCode()) * 31) + this.returnUrl.hashCode()) * 31) + this.referenceId.hashCode()) * 31) + this.threeDsTransactionId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsContingencyInput)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsContingencyInput externalThreeDsContingencyInput = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsContingencyInput) other;
        return this.threeDsIndicator == externalThreeDsContingencyInput.threeDsIndicator && kotlin.jvm.internal.Intrinsics.areEqual(this.ip, externalThreeDsContingencyInput.ip) && kotlin.jvm.internal.Intrinsics.areEqual(this.threeDsDeviceDetails, externalThreeDsContingencyInput.threeDsDeviceDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.threeDsBrowserDetails, externalThreeDsContingencyInput.threeDsBrowserDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAuthenticationRequest, externalThreeDsContingencyInput.paymentAuthenticationRequest) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, externalThreeDsContingencyInput.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, externalThreeDsContingencyInput.returnUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, externalThreeDsContingencyInput.referenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.threeDsTransactionId, externalThreeDsContingencyInput.threeDsTransactionId);
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsContingencyInput copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsIndicator threeDsIndicator, com.apollographql.apollo.api.Optional<java.lang.String> ip, com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsDeviceDetailsInput> threeDsDeviceDetails, com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsBrowserDetailsInput> threeDsBrowserDetails, com.apollographql.apollo.api.Optional<java.lang.String> paymentAuthenticationRequest, java.lang.String instrumentId, com.apollographql.apollo.api.Optional<java.lang.String> returnUrl, com.apollographql.apollo.api.Optional<java.lang.String> referenceId, com.apollographql.apollo.api.Optional<java.lang.String> threeDsTransactionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDsIndicator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ip, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDsDeviceDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDsBrowserDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAuthenticationRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDsTransactionId, "");
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsContingencyInput(threeDsIndicator, ip, threeDsDeviceDetails, threeDsBrowserDetails, paymentAuthenticationRequest, instrumentId, returnUrl, referenceId, threeDsTransactionId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component9() {
        return this.threeDsTransactionId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component8() {
        return this.referenceId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component7() {
        return this.returnUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component5() {
        return this.paymentAuthenticationRequest;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsBrowserDetailsInput> component4() {
        return this.threeDsBrowserDetails;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsDeviceDetailsInput> component3() {
        return this.threeDsDeviceDetails;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.ip;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsIndicator getThreeDsIndicator() {
        return this.threeDsIndicator;
    }
}
