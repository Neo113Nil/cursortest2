package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureDataPayload;", "", "", "schemaId", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.ENCRYPTED_PAYLOAD_KEY, "checksum", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureDataPayload;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSchemaId", "getEncryptedPayload", "getChecksum"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CaptureDataPayload {
    public static final int $stable = 0;
    private final java.lang.String checksum;
    private final java.lang.String encryptedPayload;
    private final java.lang.String schemaId;

    public CaptureDataPayload(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.schemaId = str;
        this.encryptedPayload = str2;
        this.checksum = str3;
    }

    public final java.lang.String getSchemaId() {
        return this.schemaId;
    }

    public final java.lang.String getEncryptedPayload() {
        return this.encryptedPayload;
    }

    public final java.lang.String getChecksum() {
        return this.checksum;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.schemaId;
        java.lang.String str2 = this.encryptedPayload;
        java.lang.String str3 = this.checksum;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CaptureDataPayload(schemaId=");
        sb.append(str);
        sb.append(", encryptedPayload=");
        sb.append(str2);
        sb.append(", checksum=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.schemaId.hashCode() * 31) + this.encryptedPayload.hashCode()) * 31) + this.checksum.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDataPayload)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDataPayload captureDataPayload = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDataPayload) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.schemaId, captureDataPayload.schemaId) && kotlin.jvm.internal.Intrinsics.areEqual(this.encryptedPayload, captureDataPayload.encryptedPayload) && kotlin.jvm.internal.Intrinsics.areEqual(this.checksum, captureDataPayload.checksum);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDataPayload copy(java.lang.String schemaId, java.lang.String encryptedPayload, java.lang.String checksum) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(schemaId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedPayload, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checksum, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDataPayload(schemaId, encryptedPayload, checksum);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getChecksum() {
        return this.checksum;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEncryptedPayload() {
        return this.encryptedPayload;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSchemaId() {
        return this.schemaId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDataPayload copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDataPayload captureDataPayload, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = captureDataPayload.schemaId;
        }
        if ((i & 2) != 0) {
            str2 = captureDataPayload.encryptedPayload;
        }
        if ((i & 4) != 0) {
            str3 = captureDataPayload.checksum;
        }
        return captureDataPayload.copy(str, str2, str3);
    }
}
