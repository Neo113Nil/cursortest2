package com.paypal.oslo.feature.qrc.domain.model.eligibility;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JF\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u000fR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibilityRequest;", "", "Lcom/paypal/oslo/feature/qrc/domain/model/scanner/DeviceMetadata;", "deviceMetadata", "", "accountId", "externalId", "", "Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcTypeCapabilityFilter;", "filterCriteria", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/scanner/DeviceMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/scanner/DeviceMetadata;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/scanner/DeviceMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibilityRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/qrc/domain/model/scanner/DeviceMetadata;", "getDeviceMetadata", "Ljava/lang/String;", "getAccountId", "getExternalId", "Ljava/util/List;", "getFilterCriteria"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class QrcEligibilityRequest {
    public static final int $stable = 8;
    private final java.lang.String accountId;
    private final com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata deviceMetadata;
    private final java.lang.String externalId;
    private final java.util.List<com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter> filterCriteria;

    public QrcEligibilityRequest(com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata deviceMetadata, java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter> list) {
        this.deviceMetadata = deviceMetadata;
        this.accountId = str;
        this.externalId = str2;
        this.filterCriteria = list;
    }

    public /* synthetic */ QrcEligibilityRequest(com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata deviceMetadata, java.lang.String str, java.lang.String str2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : deviceMetadata, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata getDeviceMetadata() {
        return this.deviceMetadata;
    }

    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    public final java.lang.String getExternalId() {
        return this.externalId;
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter> getFilterCriteria() {
        return this.filterCriteria;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata deviceMetadata = this.deviceMetadata;
        java.lang.String str = this.accountId;
        java.lang.String str2 = this.externalId;
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter> list = this.filterCriteria;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QrcEligibilityRequest(deviceMetadata=");
        sb.append(deviceMetadata);
        sb.append(", accountId=");
        sb.append(str);
        sb.append(", externalId=");
        sb.append(str2);
        sb.append(", filterCriteria=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata deviceMetadata = this.deviceMetadata;
        int hashCode = deviceMetadata == null ? 0 : deviceMetadata.hashCode();
        java.lang.String str = this.accountId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.externalId;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter> list = this.filterCriteria;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityRequest)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityRequest qrcEligibilityRequest = (com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceMetadata, qrcEligibilityRequest.deviceMetadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, qrcEligibilityRequest.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalId, qrcEligibilityRequest.externalId) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterCriteria, qrcEligibilityRequest.filterCriteria);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityRequest copy(com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata deviceMetadata, java.lang.String accountId, java.lang.String externalId, java.util.List<com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter> filterCriteria) {
        return new com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityRequest(deviceMetadata, accountId, externalId, filterCriteria);
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter> component4() {
        return this.filterCriteria;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getExternalId() {
        return this.externalId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata getDeviceMetadata() {
        return this.deviceMetadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityRequest copy$default(com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityRequest qrcEligibilityRequest, com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata deviceMetadata, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            deviceMetadata = qrcEligibilityRequest.deviceMetadata;
        }
        if ((i & 2) != 0) {
            str = qrcEligibilityRequest.accountId;
        }
        if ((i & 4) != 0) {
            str2 = qrcEligibilityRequest.externalId;
        }
        if ((i & 8) != 0) {
            list = qrcEligibilityRequest.filterCriteria;
        }
        return qrcEligibilityRequest.copy(deviceMetadata, str, str2, list);
    }

    public QrcEligibilityRequest() {
        this(null, null, null, null, 15, null);
    }
}
