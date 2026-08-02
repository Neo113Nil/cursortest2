package com.paypal.oslo.feature.qrc.domain.model.eligibility;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcTypeCapabilityFilter;", "", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "qrCodeType", "", "Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcCapability;", "capabilities", "", "enrollmentVersion", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;Ljava/util/List;Ljava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;Ljava/util/List;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcTypeCapabilityFilter;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "getQrCodeType", "Ljava/util/List;", "getCapabilities", "Ljava/lang/Integer;", "getEnrollmentVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class QrcTypeCapabilityFilter {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> capabilities;
    private final java.lang.Integer enrollmentVersion;
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType;

    /* JADX WARN: Multi-variable type inference failed */
    public QrcTypeCapabilityFilter(com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType, java.util.List<? extends com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> list, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrCodeType, "");
        this.qrCodeType = qrCodeType;
        this.capabilities = list;
        this.enrollmentVersion = num;
    }

    public /* synthetic */ QrcTypeCapabilityFilter(com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType, java.util.List list, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(qrCodeType, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType getQrCodeType() {
        return this.qrCodeType;
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> getCapabilities() {
        return this.capabilities;
    }

    public final java.lang.Integer getEnrollmentVersion() {
        return this.enrollmentVersion;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType = this.qrCodeType;
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> list = this.capabilities;
        java.lang.Integer num = this.enrollmentVersion;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QrcTypeCapabilityFilter(qrCodeType=");
        sb.append(qrCodeType);
        sb.append(", capabilities=");
        sb.append(list);
        sb.append(", enrollmentVersion=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.qrCodeType.hashCode();
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> list = this.capabilities;
        int hashCode2 = list == null ? 0 : list.hashCode();
        java.lang.Integer num = this.enrollmentVersion;
        return (((hashCode * 31) + hashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter qrcTypeCapabilityFilter = (com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter) other;
        return this.qrCodeType == qrcTypeCapabilityFilter.qrCodeType && kotlin.jvm.internal.Intrinsics.areEqual(this.capabilities, qrcTypeCapabilityFilter.capabilities) && kotlin.jvm.internal.Intrinsics.areEqual(this.enrollmentVersion, qrcTypeCapabilityFilter.enrollmentVersion);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter copy(com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType, java.util.List<? extends com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> capabilities, java.lang.Integer enrollmentVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrCodeType, "");
        return new com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter(qrCodeType, capabilities, enrollmentVersion);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getEnrollmentVersion() {
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
    public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter copy$default(com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter qrcTypeCapabilityFilter, com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType, java.util.List list, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qrCodeType = qrcTypeCapabilityFilter.qrCodeType;
        }
        if ((i & 2) != 0) {
            list = qrcTypeCapabilityFilter.capabilities;
        }
        if ((i & 4) != 0) {
            num = qrcTypeCapabilityFilter.enrollmentVersion;
        }
        return qrcTypeCapabilityFilter.copy(qrCodeType, list, num);
    }
}
