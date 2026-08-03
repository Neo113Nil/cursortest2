package com.unity3d.ads.core.data.model;

/* compiled from: CachedFile.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JS\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006&"}, d2 = {"Lcom/unity3d/ads/core/data/model/CachedFile;", "", "url", "", "name", "file", "Ljava/io/File;", com.facebook.share.internal.ShareConstants.MEDIA_EXTENSION, "contentLength", "", "protocol", "priority", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;JLjava/lang/String;I)V", "getContentLength", "()J", "getExtension", "()Ljava/lang/String;", "getFile", "()Ljava/io/File;", "getName", "getPriority", "()I", "getProtocol", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CachedFile {
    private final long contentLength;
    private final java.lang.String extension;
    private final java.io.File file;
    private final java.lang.String name;
    private final int priority;
    private final java.lang.String protocol;
    private final java.lang.String url;

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final java.io.File getFile() {
        return this.file;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getExtension() {
        return this.extension;
    }

    /* renamed from: component5, reason: from getter */
    public final long getContentLength() {
        return this.contentLength;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getProtocol() {
        return this.protocol;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    public final com.unity3d.ads.core.data.model.CachedFile copy(java.lang.String url, java.lang.String name, java.io.File file, java.lang.String extension, long contentLength, java.lang.String protocol, int priority) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "protocol");
        return new com.unity3d.ads.core.data.model.CachedFile(url, name, file, extension, contentLength, protocol, priority);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.ads.core.data.model.CachedFile)) {
            return false;
        }
        com.unity3d.ads.core.data.model.CachedFile cachedFile = (com.unity3d.ads.core.data.model.CachedFile) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, cachedFile.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, cachedFile.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.file, cachedFile.file) && kotlin.jvm.internal.Intrinsics.areEqual(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && kotlin.jvm.internal.Intrinsics.areEqual(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority;
    }

    public int hashCode() {
        int hashCode = ((this.url.hashCode() * 31) + this.name.hashCode()) * 31;
        java.io.File file = this.file;
        int hashCode2 = (hashCode + (file == null ? 0 : file.hashCode())) * 31;
        java.lang.String str = this.extension;
        return ((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.contentLength)) * 31) + this.protocol.hashCode()) * 31) + this.priority;
    }

    public java.lang.String toString() {
        return "CachedFile(url=" + this.url + ", name=" + this.name + ", file=" + this.file + ", extension=" + this.extension + ", contentLength=" + this.contentLength + ", protocol=" + this.protocol + ", priority=" + this.priority + ')';
    }

    public CachedFile(java.lang.String url, java.lang.String name, java.io.File file, java.lang.String str, long j, java.lang.String protocol, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.url = url;
        this.name = name;
        this.file = file;
        this.extension = str;
        this.contentLength = j;
        this.protocol = protocol;
        this.priority = i;
    }

    public /* synthetic */ CachedFile(java.lang.String str, java.lang.String str2, java.io.File file, java.lang.String str3, long j, java.lang.String str4, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : file, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? -1L : j, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? Integer.MAX_VALUE : i);
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.io.File getFile() {
        return this.file;
    }

    public final java.lang.String getExtension() {
        return this.extension;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final java.lang.String getProtocol() {
        return this.protocol;
    }

    public final int getPriority() {
        return this.priority;
    }
}
