package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/DownloadFileSuccess;", "", "Ljava/io/File;", "file", "", "detectedMimeType", "calculatedChecksum", "<init>", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/io/File;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/downloads/impl/engine/DownloadFileSuccess;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/io/File;", "getFile", "Ljava/lang/String;", "getDetectedMimeType", "getCalculatedChecksum"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DownloadFileSuccess {
    private final java.lang.String calculatedChecksum;
    private final java.lang.String detectedMimeType;
    private final java.io.File file;

    public DownloadFileSuccess(java.io.File file, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        this.file = file;
        this.detectedMimeType = str;
        this.calculatedChecksum = str2;
    }

    public final java.io.File getFile() {
        return this.file;
    }

    public final java.lang.String getDetectedMimeType() {
        return this.detectedMimeType;
    }

    public final java.lang.String getCalculatedChecksum() {
        return this.calculatedChecksum;
    }

    public final java.lang.String toString() {
        java.io.File file = this.file;
        java.lang.String str = this.detectedMimeType;
        java.lang.String str2 = this.calculatedChecksum;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DownloadFileSuccess(file=");
        sb.append(file);
        sb.append(", detectedMimeType=");
        sb.append(str);
        sb.append(", calculatedChecksum=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.file.hashCode();
        java.lang.String str = this.detectedMimeType;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.calculatedChecksum;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.downloads.impl.engine.DownloadFileSuccess)) {
            return false;
        }
        com.paypal.oslo.downloads.impl.engine.DownloadFileSuccess downloadFileSuccess = (com.paypal.oslo.downloads.impl.engine.DownloadFileSuccess) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.file, downloadFileSuccess.file) && kotlin.jvm.internal.Intrinsics.areEqual(this.detectedMimeType, downloadFileSuccess.detectedMimeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.calculatedChecksum, downloadFileSuccess.calculatedChecksum);
    }

    public final com.paypal.oslo.downloads.impl.engine.DownloadFileSuccess copy(java.io.File file, java.lang.String detectedMimeType, java.lang.String calculatedChecksum) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return new com.paypal.oslo.downloads.impl.engine.DownloadFileSuccess(file, detectedMimeType, calculatedChecksum);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCalculatedChecksum() {
        return this.calculatedChecksum;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDetectedMimeType() {
        return this.detectedMimeType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.io.File getFile() {
        return this.file;
    }

    public static /* synthetic */ com.paypal.oslo.downloads.impl.engine.DownloadFileSuccess copy$default(com.paypal.oslo.downloads.impl.engine.DownloadFileSuccess downloadFileSuccess, java.io.File file, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            file = downloadFileSuccess.file;
        }
        if ((i & 2) != 0) {
            str = downloadFileSuccess.detectedMimeType;
        }
        if ((i & 4) != 0) {
            str2 = downloadFileSuccess.calculatedChecksum;
        }
        return downloadFileSuccess.copy(file, str, str2);
    }
}
