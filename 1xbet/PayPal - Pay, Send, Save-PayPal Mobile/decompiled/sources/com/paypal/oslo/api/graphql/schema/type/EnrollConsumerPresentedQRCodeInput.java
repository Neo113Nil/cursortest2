package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJL\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\rR(\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/EnrollConsumerPresentedQRCodeInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/QRCodeType;", "qrCodeType", "", "Lcom/paypal/oslo/api/graphql/schema/type/QRCodeCapability;", "qrCodeCapabilities", "", "enrollmentVersion", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/EnrollConsumerPresentedQRCodeInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getQrCodeType", "getQrCodeCapabilities", "getEnrollmentVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EnrollConsumerPresentedQRCodeInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Integer> enrollmentVersion;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.QRCodeCapability>> qrCodeCapabilities;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.QRCodeType> qrCodeType;

    /* JADX WARN: Multi-variable type inference failed */
    public EnrollConsumerPresentedQRCodeInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.QRCodeType> optional, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.QRCodeCapability>> optional2, com.apollographql.apollo.api.Optional<java.lang.Integer> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.qrCodeType = optional;
        this.qrCodeCapabilities = optional2;
        this.enrollmentVersion = optional3;
    }

    public /* synthetic */ EnrollConsumerPresentedQRCodeInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.QRCodeType> getQrCodeType() {
        return this.qrCodeType;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.QRCodeCapability>> getQrCodeCapabilities() {
        return this.qrCodeCapabilities;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> getEnrollmentVersion() {
        return this.enrollmentVersion;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.QRCodeType> optional = this.qrCodeType;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.QRCodeCapability>> optional2 = this.qrCodeCapabilities;
        com.apollographql.apollo.api.Optional<java.lang.Integer> optional3 = this.enrollmentVersion;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EnrollConsumerPresentedQRCodeInput(qrCodeType=");
        sb.append(optional);
        sb.append(", qrCodeCapabilities=");
        sb.append(optional2);
        sb.append(", enrollmentVersion=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.qrCodeType.hashCode() * 31) + this.qrCodeCapabilities.hashCode()) * 31) + this.enrollmentVersion.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.EnrollConsumerPresentedQRCodeInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.EnrollConsumerPresentedQRCodeInput enrollConsumerPresentedQRCodeInput = (com.paypal.oslo.api.graphql.schema.type.EnrollConsumerPresentedQRCodeInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.qrCodeType, enrollConsumerPresentedQRCodeInput.qrCodeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.qrCodeCapabilities, enrollConsumerPresentedQRCodeInput.qrCodeCapabilities) && kotlin.jvm.internal.Intrinsics.areEqual(this.enrollmentVersion, enrollConsumerPresentedQRCodeInput.enrollmentVersion);
    }

    public final com.paypal.oslo.api.graphql.schema.type.EnrollConsumerPresentedQRCodeInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.QRCodeType> qrCodeType, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.QRCodeCapability>> qrCodeCapabilities, com.apollographql.apollo.api.Optional<java.lang.Integer> enrollmentVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrCodeType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrCodeCapabilities, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollmentVersion, "");
        return new com.paypal.oslo.api.graphql.schema.type.EnrollConsumerPresentedQRCodeInput(qrCodeType, qrCodeCapabilities, enrollmentVersion);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> component3() {
        return this.enrollmentVersion;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.QRCodeCapability>> component2() {
        return this.qrCodeCapabilities;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.QRCodeType> component1() {
        return this.qrCodeType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.EnrollConsumerPresentedQRCodeInput copy$default(com.paypal.oslo.api.graphql.schema.type.EnrollConsumerPresentedQRCodeInput enrollConsumerPresentedQRCodeInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = enrollConsumerPresentedQRCodeInput.qrCodeType;
        }
        if ((i & 2) != 0) {
            optional2 = enrollConsumerPresentedQRCodeInput.qrCodeCapabilities;
        }
        if ((i & 4) != 0) {
            optional3 = enrollConsumerPresentedQRCodeInput.enrollmentVersion;
        }
        return enrollConsumerPresentedQRCodeInput.copy(optional, optional2, optional3);
    }

    public EnrollConsumerPresentedQRCodeInput() {
        this(null, null, null, 7, null);
    }
}
