package com.paypal.oslo.feature.qrc.domain.model.enrollment;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcEnrollmentRequest;", "", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "qrCodeType", "", "Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcCapability;", "capabilities", "", "enrollmentVersion", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;Ljava/util/List;I)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "component2", "()Ljava/util/List;", "component3", "()I", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;Ljava/util/List;I)Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcEnrollmentRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "getQrCodeType", "Ljava/util/List;", "getCapabilities", com.visa.cbp.getEncExpo.warmup, "getEnrollmentVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class QrcEnrollmentRequest {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> capabilities;
    private final int enrollmentVersion;
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType;

    /* JADX WARN: Multi-variable type inference failed */
    public QrcEnrollmentRequest(com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType, java.util.List<? extends com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> list, int i) {
        this.qrCodeType = qrCodeType;
        this.capabilities = list;
        this.enrollmentVersion = i;
    }

    public /* synthetic */ QrcEnrollmentRequest(com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType, java.util.List list, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(qrCodeType, list, (i2 & 4) != 0 ? 4 : i);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType getQrCodeType() {
        return this.qrCodeType;
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> getCapabilities() {
        return this.capabilities;
    }

    public final int getEnrollmentVersion() {
        return this.enrollmentVersion;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType = this.qrCodeType;
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> list = this.capabilities;
        int i = this.enrollmentVersion;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QrcEnrollmentRequest(qrCodeType=");
        sb.append(qrCodeType);
        sb.append(", capabilities=");
        sb.append(list);
        sb.append(", enrollmentVersion=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType = this.qrCodeType;
        int hashCode = qrCodeType == null ? 0 : qrCodeType.hashCode();
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> list = this.capabilities;
        return (((hashCode * 31) + (list != null ? list.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.enrollmentVersion);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentRequest)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentRequest qrcEnrollmentRequest = (com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentRequest) other;
        return this.qrCodeType == qrcEnrollmentRequest.qrCodeType && kotlin.jvm.internal.Intrinsics.areEqual(this.capabilities, qrcEnrollmentRequest.capabilities) && this.enrollmentVersion == qrcEnrollmentRequest.enrollmentVersion;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentRequest copy(com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType, java.util.List<? extends com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> capabilities, int enrollmentVersion) {
        return new com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentRequest(qrCodeType, capabilities, enrollmentVersion);
    }

    /* renamed from: component3, reason: from getter */
    public final int getEnrollmentVersion() {
        return this.enrollmentVersion;
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> component2() {
        return this.capabilities;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType getQrCodeType() {
        return this.qrCodeType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentRequest copy$default(com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentRequest qrcEnrollmentRequest, com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType, java.util.List list, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            qrCodeType = qrcEnrollmentRequest.qrCodeType;
        }
        if ((i2 & 2) != 0) {
            list = qrcEnrollmentRequest.capabilities;
        }
        if ((i2 & 4) != 0) {
            i = qrcEnrollmentRequest.enrollmentVersion;
        }
        return qrcEnrollmentRequest.copy(qrCodeType, list, i);
    }
}
