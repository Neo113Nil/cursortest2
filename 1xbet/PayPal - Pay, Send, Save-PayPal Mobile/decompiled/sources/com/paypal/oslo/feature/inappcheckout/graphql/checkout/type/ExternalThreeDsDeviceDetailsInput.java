package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJF\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalThreeDsDeviceDetailsInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "nativeSDK", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPaymentDeviceType;", "paymentDeviceType", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalPaymentDeviceChannel;", "paymentDeviceChannel", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalThreeDsDeviceDetailsInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getNativeSDK", "getPaymentDeviceType", "getPaymentDeviceChannel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExternalThreeDsDeviceDetailsInput {
    public static final int $stable = 8;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> nativeSDK;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPaymentDeviceChannel> paymentDeviceChannel;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPaymentDeviceType> paymentDeviceType;

    /* JADX WARN: Multi-variable type inference failed */
    public ExternalThreeDsDeviceDetailsInput(com.apollographql.apollo.api.Optional<java.lang.Boolean> optional, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPaymentDeviceType> optional2, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPaymentDeviceChannel> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.nativeSDK = optional;
        this.paymentDeviceType = optional2;
        this.paymentDeviceChannel = optional3;
    }

    public /* synthetic */ ExternalThreeDsDeviceDetailsInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getNativeSDK() {
        return this.nativeSDK;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPaymentDeviceType> getPaymentDeviceType() {
        return this.paymentDeviceType;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPaymentDeviceChannel> getPaymentDeviceChannel() {
        return this.paymentDeviceChannel;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional = this.nativeSDK;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPaymentDeviceType> optional2 = this.paymentDeviceType;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPaymentDeviceChannel> optional3 = this.paymentDeviceChannel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalThreeDsDeviceDetailsInput(nativeSDK=");
        sb.append(optional);
        sb.append(", paymentDeviceType=");
        sb.append(optional2);
        sb.append(", paymentDeviceChannel=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.nativeSDK.hashCode() * 31) + this.paymentDeviceType.hashCode()) * 31) + this.paymentDeviceChannel.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsDeviceDetailsInput)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsDeviceDetailsInput externalThreeDsDeviceDetailsInput = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsDeviceDetailsInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.nativeSDK, externalThreeDsDeviceDetailsInput.nativeSDK) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentDeviceType, externalThreeDsDeviceDetailsInput.paymentDeviceType) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentDeviceChannel, externalThreeDsDeviceDetailsInput.paymentDeviceChannel);
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsDeviceDetailsInput copy(com.apollographql.apollo.api.Optional<java.lang.Boolean> nativeSDK, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPaymentDeviceType> paymentDeviceType, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPaymentDeviceChannel> paymentDeviceChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeSDK, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentDeviceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentDeviceChannel, "");
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsDeviceDetailsInput(nativeSDK, paymentDeviceType, paymentDeviceChannel);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPaymentDeviceChannel> component3() {
        return this.paymentDeviceChannel;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPaymentDeviceType> component2() {
        return this.paymentDeviceType;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component1() {
        return this.nativeSDK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsDeviceDetailsInput copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsDeviceDetailsInput externalThreeDsDeviceDetailsInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = externalThreeDsDeviceDetailsInput.nativeSDK;
        }
        if ((i & 2) != 0) {
            optional2 = externalThreeDsDeviceDetailsInput.paymentDeviceType;
        }
        if ((i & 4) != 0) {
            optional3 = externalThreeDsDeviceDetailsInput.paymentDeviceChannel;
        }
        return externalThreeDsDeviceDetailsInput.copy(optional, optional2, optional3);
    }

    public ExternalThreeDsDeviceDetailsInput() {
        this(null, null, null, 7, null);
    }
}
