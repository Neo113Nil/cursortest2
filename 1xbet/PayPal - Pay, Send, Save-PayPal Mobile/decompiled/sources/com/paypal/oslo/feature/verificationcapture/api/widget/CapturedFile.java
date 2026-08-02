package com.paypal.oslo.feature.verificationcapture.api.widget;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJN\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b\u000b\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/widget/CapturedFile;", "", "", "fileId", "documentId", "", "imageBytes", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "fileSizeBytes", "", "isManualCapture", "<init>", "(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;JZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()[B", "component4", "component5", "()J", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;JZ)Lcom/paypal/oslo/feature/verificationcapture/api/widget/CapturedFile;", "toString", "Ljava/lang/String;", "getFileId", "getDocumentId", "[B", "getImageBytes", "getMimeType", "J", "getFileSizeBytes", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CapturedFile {
    public static final int $stable = 8;
    private final java.lang.String documentId;
    private final java.lang.String fileId;
    private final long fileSizeBytes;
    private final byte[] imageBytes;
    private final boolean isManualCapture;
    private final java.lang.String mimeType;

    public CapturedFile(java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, long j, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.fileId = str;
        this.documentId = str2;
        this.imageBytes = bArr;
        this.mimeType = str3;
        this.fileSizeBytes = j;
        this.isManualCapture = z;
    }

    public final java.lang.String getFileId() {
        return this.fileId;
    }

    public final java.lang.String getDocumentId() {
        return this.documentId;
    }

    public final byte[] getImageBytes() {
        return this.imageBytes;
    }

    public /* synthetic */ CapturedFile(java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, long j, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, bArr, (i & 8) != 0 ? "image/jpeg" : str3, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? false : z);
    }

    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public final long getFileSizeBytes() {
        return this.fileSizeBytes;
    }

    public final boolean isManualCapture() {
        return this.isManualCapture;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.api.widget.CapturedFile capturedFile = (com.paypal.oslo.feature.verificationcapture.api.widget.CapturedFile) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fileId, capturedFile.fileId) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, capturedFile.documentId) && java.util.Arrays.equals(this.imageBytes, capturedFile.imageBytes) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, capturedFile.mimeType) && this.fileSizeBytes == capturedFile.fileSizeBytes && this.isManualCapture == capturedFile.isManualCapture;
    }

    public final int hashCode() {
        int hashCode = this.fileId.hashCode();
        java.lang.String str = this.documentId;
        int hashCode2 = str != null ? str.hashCode() : 0;
        return (((((((((hashCode * 31) + hashCode2) * 31) + java.util.Arrays.hashCode(this.imageBytes)) * 31) + this.mimeType.hashCode()) * 31) + java.lang.Long.hashCode(this.fileSizeBytes)) * 31) + java.lang.Boolean.hashCode(this.isManualCapture);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.fileId;
        java.lang.String str2 = this.documentId;
        java.lang.String arrays = java.util.Arrays.toString(this.imageBytes);
        java.lang.String str3 = this.mimeType;
        long j = this.fileSizeBytes;
        boolean z = this.isManualCapture;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CapturedFile(fileId=");
        sb.append(str);
        sb.append(", documentId=");
        sb.append(str2);
        sb.append(", imageBytes=");
        sb.append(arrays);
        sb.append(", mimeType=");
        sb.append(str3);
        sb.append(", fileSizeBytes=");
        sb.append(j);
        sb.append(", isManualCapture=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final com.paypal.oslo.feature.verificationcapture.api.widget.CapturedFile copy(java.lang.String fileId, java.lang.String documentId, byte[] imageBytes, java.lang.String mimeType, long fileSizeBytes, boolean isManualCapture) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageBytes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeType, "");
        return new com.paypal.oslo.feature.verificationcapture.api.widget.CapturedFile(fileId, documentId, imageBytes, mimeType, fileSizeBytes, isManualCapture);
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsManualCapture() {
        return this.isManualCapture;
    }

    /* renamed from: component5, reason: from getter */
    public final long getFileSizeBytes() {
        return this.fileSizeBytes;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getImageBytes() {
        return this.imageBytes;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDocumentId() {
        return this.documentId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFileId() {
        return this.fileId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.widget.CapturedFile copy$default(com.paypal.oslo.feature.verificationcapture.api.widget.CapturedFile capturedFile, java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = capturedFile.fileId;
        }
        if ((i & 2) != 0) {
            str2 = capturedFile.documentId;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            bArr = capturedFile.imageBytes;
        }
        byte[] bArr2 = bArr;
        if ((i & 8) != 0) {
            str3 = capturedFile.mimeType;
        }
        java.lang.String str5 = str3;
        if ((i & 16) != 0) {
            j = capturedFile.fileSizeBytes;
        }
        long j2 = j;
        if ((i & 32) != 0) {
            z = capturedFile.isManualCapture;
        }
        return capturedFile.copy(str, str4, bArr2, str5, j2, z);
    }
}
