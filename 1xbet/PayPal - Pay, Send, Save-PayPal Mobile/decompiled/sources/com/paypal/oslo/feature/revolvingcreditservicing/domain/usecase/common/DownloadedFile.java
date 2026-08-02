package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/common/DownloadedFile;", "", "Landroid/net/Uri;", "uri", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "copy", "(Landroid/net/Uri;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/common/DownloadedFile;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroid/net/Uri;", "getUri", "Ljava/lang/String;", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DownloadedFile {
    public static final int $stable = 8;
    private final java.lang.String mimeType;
    private final android.net.Uri uri;

    public DownloadedFile(android.net.Uri uri, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        this.uri = uri;
        this.mimeType = str;
    }

    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public final android.net.Uri getUri() {
        return this.uri;
    }

    public final java.lang.String toString() {
        android.net.Uri uri = this.uri;
        java.lang.String str = this.mimeType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DownloadedFile(uri=");
        sb.append(uri);
        sb.append(", mimeType=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.uri.hashCode();
        java.lang.String str = this.mimeType;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadedFile)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadedFile downloadedFile = (com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadedFile) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.uri, downloadedFile.uri) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, downloadedFile.mimeType);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadedFile copy(android.net.Uri uri, java.lang.String mimeType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadedFile(uri, mimeType);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component1, reason: from getter */
    public final android.net.Uri getUri() {
        return this.uri;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadedFile copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadedFile downloadedFile, android.net.Uri uri, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uri = downloadedFile.uri;
        }
        if ((i & 2) != 0) {
            str = downloadedFile.mimeType;
        }
        return downloadedFile.copy(uri, str);
    }
}
