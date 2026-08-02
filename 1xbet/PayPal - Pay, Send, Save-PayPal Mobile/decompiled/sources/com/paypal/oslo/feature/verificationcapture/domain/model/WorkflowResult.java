package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\bB\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJ²\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001dR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u00106R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010!\"\u0004\b9\u0010:R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u00103\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u00106R\"\u0010\n\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010\u001b\"\u0004\b?\u0010@R\"\u0010\f\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010A\u001a\u0004\b\f\u0010%\"\u0004\bB\u0010CR$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u00103\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u00106R$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u00103\u001a\u0004\bF\u0010\u001f\"\u0004\bG\u00106R$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u00103\u001a\u0004\bH\u0010\u001f\"\u0004\bI\u00106R$\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u00107\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010:R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010L\u001a\u0004\bM\u0010+\"\u0004\bN\u0010OR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010L\u001a\u0004\bP\u0010+\"\u0004\bQ\u0010OR$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u00103\u001a\u0004\bR\u0010\u001f\"\u0004\bS\u00106"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowResult;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowType;", "workflowType", "", "documentId", "", "documentContext", "vpId", "", "retryCount", "", "isManualCapture", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE, "extractedData", "metaData", "faceScan", "", "auditTrailCompressedBase64", "lowQualityAuditTrailCompressedBase64", "sessionId", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowType;Ljava/lang/String;[BLjava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/util/List;Ljava/util/List;Ljava/lang/String;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowType;", "component2", "()Ljava/lang/String;", "component3", "()[B", "component4", "component5", "component6", "()Z", "component7", "component8", "component9", "component10", "component11", "()Ljava/util/List;", "component12", "component13", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowType;Ljava/lang/String;[BLjava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowResult;", "toString", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowType;", "getWorkflowType", "Ljava/lang/String;", "getDocumentId", "setDocumentId", "(Ljava/lang/String;)V", "[B", "getDocumentContext", "setDocumentContext", "([B)V", "getVpId", "setVpId", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "setRetryCount", "(I)V", "Z", "setManualCapture", "(Z)V", "getBarcode", "setBarcode", "getExtractedData", "setExtractedData", "getMetaData", "setMetaData", "getFaceScan", "setFaceScan", "Ljava/util/List;", "getAuditTrailCompressedBase64", "setAuditTrailCompressedBase64", "(Ljava/util/List;)V", "getLowQualityAuditTrailCompressedBase64", "setLowQualityAuditTrailCompressedBase64", "getSessionId", "setSessionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class WorkflowResult {
    public static final int $stable = 8;
    private java.util.List<java.lang.String> auditTrailCompressedBase64;
    private java.lang.String barcode;
    private byte[] documentContext;
    private java.lang.String documentId;
    private java.lang.String extractedData;
    private byte[] faceScan;
    private boolean isManualCapture;
    private java.util.List<java.lang.String> lowQualityAuditTrailCompressedBase64;
    private java.lang.String metaData;
    private int retryCount;
    private java.lang.String sessionId;
    private java.lang.String vpId;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType workflowType;

    public WorkflowResult(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType workflowType, java.lang.String str, byte[] bArr, java.lang.String str2, int i, boolean z, java.lang.String str3, java.lang.String str4, java.lang.String str5, byte[] bArr2, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workflowType, "");
        this.workflowType = workflowType;
        this.documentId = str;
        this.documentContext = bArr;
        this.vpId = str2;
        this.retryCount = i;
        this.isManualCapture = z;
        this.barcode = str3;
        this.extractedData = str4;
        this.metaData = str5;
        this.faceScan = bArr2;
        this.auditTrailCompressedBase64 = list;
        this.lowQualityAuditTrailCompressedBase64 = list2;
        this.sessionId = str6;
    }

    public /* synthetic */ WorkflowResult(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType workflowType, java.lang.String str, byte[] bArr, java.lang.String str2, int i, boolean z, java.lang.String str3, java.lang.String str4, java.lang.String str5, byte[] bArr2, java.util.List list, java.util.List list2, java.lang.String str6, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(workflowType, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : bArr, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) == 0 ? z : false, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? null : bArr2, (i2 & 1024) != 0 ? null : list, (i2 & 2048) != 0 ? null : list2, (i2 & 4096) == 0 ? str6 : null);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType getWorkflowType() {
        return this.workflowType;
    }

    public final java.lang.String getDocumentId() {
        return this.documentId;
    }

    public final void setDocumentId(java.lang.String str) {
        this.documentId = str;
    }

    public final byte[] getDocumentContext() {
        return this.documentContext;
    }

    public final void setDocumentContext(byte[] bArr) {
        this.documentContext = bArr;
    }

    public final java.lang.String getVpId() {
        return this.vpId;
    }

    public final void setVpId(java.lang.String str) {
        this.vpId = str;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final void setRetryCount(int i) {
        this.retryCount = i;
    }

    public final boolean isManualCapture() {
        return this.isManualCapture;
    }

    public final void setManualCapture(boolean z) {
        this.isManualCapture = z;
    }

    public final java.lang.String getBarcode() {
        return this.barcode;
    }

    public final void setBarcode(java.lang.String str) {
        this.barcode = str;
    }

    public final java.lang.String getExtractedData() {
        return this.extractedData;
    }

    public final void setExtractedData(java.lang.String str) {
        this.extractedData = str;
    }

    public final java.lang.String getMetaData() {
        return this.metaData;
    }

    public final void setMetaData(java.lang.String str) {
        this.metaData = str;
    }

    public final byte[] getFaceScan() {
        return this.faceScan;
    }

    public final void setFaceScan(byte[] bArr) {
        this.faceScan = bArr;
    }

    public final java.util.List<java.lang.String> getAuditTrailCompressedBase64() {
        return this.auditTrailCompressedBase64;
    }

    public final void setAuditTrailCompressedBase64(java.util.List<java.lang.String> list) {
        this.auditTrailCompressedBase64 = list;
    }

    public final java.util.List<java.lang.String> getLowQualityAuditTrailCompressedBase64() {
        return this.lowQualityAuditTrailCompressedBase64;
    }

    public final void setLowQualityAuditTrailCompressedBase64(java.util.List<java.lang.String> list) {
        this.lowQualityAuditTrailCompressedBase64 = list;
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final void setSessionId(java.lang.String str) {
        this.sessionId = str;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult workflowResult = (com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult) other;
        if (this.workflowType != workflowResult.workflowType || !kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, workflowResult.documentId)) {
            return false;
        }
        byte[] bArr = this.documentContext;
        if (bArr != null) {
            byte[] bArr2 = workflowResult.documentContext;
            if (bArr2 == null || !java.util.Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (workflowResult.documentContext != null) {
            return false;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.vpId, workflowResult.vpId) || this.retryCount != workflowResult.retryCount || this.isManualCapture != workflowResult.isManualCapture || !kotlin.jvm.internal.Intrinsics.areEqual(this.barcode, workflowResult.barcode) || !kotlin.jvm.internal.Intrinsics.areEqual(this.extractedData, workflowResult.extractedData) || !kotlin.jvm.internal.Intrinsics.areEqual(this.metaData, workflowResult.metaData)) {
            return false;
        }
        byte[] bArr3 = this.faceScan;
        if (bArr3 != null) {
            byte[] bArr4 = workflowResult.faceScan;
            if (bArr4 == null || !java.util.Arrays.equals(bArr3, bArr4)) {
                return false;
            }
        } else if (workflowResult.faceScan != null) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, workflowResult.sessionId);
    }

    public final int hashCode() {
        int hashCode = this.workflowType.hashCode();
        java.lang.String str = this.documentId;
        int hashCode2 = str != null ? str.hashCode() : 0;
        byte[] bArr = this.documentContext;
        int hashCode3 = bArr != null ? java.util.Arrays.hashCode(bArr) : 0;
        java.lang.String str2 = this.vpId;
        int hashCode4 = str2 != null ? str2.hashCode() : 0;
        int i = this.retryCount;
        int hashCode5 = java.lang.Boolean.hashCode(this.isManualCapture);
        java.lang.String str3 = this.barcode;
        int hashCode6 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.extractedData;
        int hashCode7 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.metaData;
        int hashCode8 = str5 != null ? str5.hashCode() : 0;
        byte[] bArr2 = this.faceScan;
        int hashCode9 = bArr2 != null ? java.util.Arrays.hashCode(bArr2) : 0;
        java.lang.String str6 = this.sessionId;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType workflowType = this.workflowType;
        java.lang.String str = this.documentId;
        java.lang.String arrays = java.util.Arrays.toString(this.documentContext);
        java.lang.String str2 = this.vpId;
        int i = this.retryCount;
        boolean z = this.isManualCapture;
        java.lang.String str3 = this.barcode;
        java.lang.String str4 = this.extractedData;
        java.lang.String str5 = this.metaData;
        java.lang.String arrays2 = java.util.Arrays.toString(this.faceScan);
        java.util.List<java.lang.String> list = this.auditTrailCompressedBase64;
        java.util.List<java.lang.String> list2 = this.lowQualityAuditTrailCompressedBase64;
        java.lang.String str6 = this.sessionId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WorkflowResult(workflowType=");
        sb.append(workflowType);
        sb.append(", documentId=");
        sb.append(str);
        sb.append(", documentContext=");
        sb.append(arrays);
        sb.append(", vpId=");
        sb.append(str2);
        sb.append(", retryCount=");
        sb.append(i);
        sb.append(", isManualCapture=");
        sb.append(z);
        sb.append(", barcode=");
        sb.append(str3);
        sb.append(", extractedData=");
        sb.append(str4);
        sb.append(", metaData=");
        sb.append(str5);
        sb.append(", faceScan=");
        sb.append(arrays2);
        sb.append(", auditTrailCompressedBase64=");
        sb.append(list);
        sb.append(", lowQualityAuditTrailCompressedBase64=");
        sb.append(list2);
        sb.append(", sessionId=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult copy(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType workflowType, java.lang.String documentId, byte[] documentContext, java.lang.String vpId, int retryCount, boolean isManualCapture, java.lang.String barcode, java.lang.String extractedData, java.lang.String metaData, byte[] faceScan, java.util.List<java.lang.String> auditTrailCompressedBase64, java.util.List<java.lang.String> lowQualityAuditTrailCompressedBase64, java.lang.String sessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workflowType, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowResult(workflowType, documentId, documentContext, vpId, retryCount, isManualCapture, barcode, extractedData, metaData, faceScan, auditTrailCompressedBase64, lowQualityAuditTrailCompressedBase64, sessionId);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getMetaData() {
        return this.metaData;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getExtractedData() {
        return this.extractedData;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getBarcode() {
        return this.barcode;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsManualCapture() {
        return this.isManualCapture;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getVpId() {
        return this.vpId;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getDocumentContext() {
        return this.documentContext;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDocumentId() {
        return this.documentId;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final java.util.List<java.lang.String> component12() {
        return this.lowQualityAuditTrailCompressedBase64;
    }

    public final java.util.List<java.lang.String> component11() {
        return this.auditTrailCompressedBase64;
    }

    /* renamed from: component10, reason: from getter */
    public final byte[] getFaceScan() {
        return this.faceScan;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType getWorkflowType() {
        return this.workflowType;
    }
}
