package com.paypal.oslo.feature.qrc.graphql.type;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJD\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR(\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeTypeCapabilityInput;", "", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;", "qrCodeType", "Lcom/apollographql/apollo/api/Optional;", "", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeCapability;", "qrCodeCapabilities", "", "enrollmentVersion", "<init>", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeTypeCapabilityInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;", "getQrCodeType", "Lcom/apollographql/apollo/api/Optional;", "getQrCodeCapabilities", "getEnrollmentVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class QRCodeTypeCapabilityInput {
    public static final int $stable = 8;
    private final com.apollographql.apollo.api.Optional<java.lang.Integer> enrollmentVersion;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability>> qrCodeCapabilities;
    private final com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qrCodeType;

    /* JADX WARN: Multi-variable type inference failed */
    public QRCodeTypeCapabilityInput(com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qRCodeType, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability>> optional, com.apollographql.apollo.api.Optional<java.lang.Integer> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qRCodeType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.qrCodeType = qRCodeType;
        this.qrCodeCapabilities = optional;
        this.enrollmentVersion = optional2;
    }

    public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeType getQrCodeType() {
        return this.qrCodeType;
    }

    public /* synthetic */ QRCodeTypeCapabilityInput(com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qRCodeType, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(qRCodeType, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability>> getQrCodeCapabilities() {
        return this.qrCodeCapabilities;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> getEnrollmentVersion() {
        return this.enrollmentVersion;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qRCodeType = this.qrCodeType;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability>> optional = this.qrCodeCapabilities;
        com.apollographql.apollo.api.Optional<java.lang.Integer> optional2 = this.enrollmentVersion;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QRCodeTypeCapabilityInput(qrCodeType=");
        sb.append(qRCodeType);
        sb.append(", qrCodeCapabilities=");
        sb.append(optional);
        sb.append(", enrollmentVersion=");
        sb.append(optional2);
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
        if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.type.QRCodeTypeCapabilityInput)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeTypeCapabilityInput qRCodeTypeCapabilityInput = (com.paypal.oslo.feature.qrc.graphql.type.QRCodeTypeCapabilityInput) other;
        return this.qrCodeType == qRCodeTypeCapabilityInput.qrCodeType && kotlin.jvm.internal.Intrinsics.areEqual(this.qrCodeCapabilities, qRCodeTypeCapabilityInput.qrCodeCapabilities) && kotlin.jvm.internal.Intrinsics.areEqual(this.enrollmentVersion, qRCodeTypeCapabilityInput.enrollmentVersion);
    }

    public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeTypeCapabilityInput copy(com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qrCodeType, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability>> qrCodeCapabilities, com.apollographql.apollo.api.Optional<java.lang.Integer> enrollmentVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrCodeType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrCodeCapabilities, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollmentVersion, "");
        return new com.paypal.oslo.feature.qrc.graphql.type.QRCodeTypeCapabilityInput(qrCodeType, qrCodeCapabilities, enrollmentVersion);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> component3() {
        return this.enrollmentVersion;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability>> component2() {
        return this.qrCodeCapabilities;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeType getQrCodeType() {
        return this.qrCodeType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.type.QRCodeTypeCapabilityInput copy$default(com.paypal.oslo.feature.qrc.graphql.type.QRCodeTypeCapabilityInput qRCodeTypeCapabilityInput, com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qRCodeType, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qRCodeType = qRCodeTypeCapabilityInput.qrCodeType;
        }
        if ((i & 2) != 0) {
            optional = qRCodeTypeCapabilityInput.qrCodeCapabilities;
        }
        if ((i & 4) != 0) {
            optional2 = qRCodeTypeCapabilityInput.enrollmentVersion;
        }
        return qRCodeTypeCapabilityInput.copy(qRCodeType, optional, optional2);
    }
}
