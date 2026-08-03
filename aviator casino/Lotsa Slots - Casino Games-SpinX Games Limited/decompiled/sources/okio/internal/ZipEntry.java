package okio.internal;

/* compiled from: ZipEntry.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\"\b\u0000\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0017J-\u0010:\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b;\u0010<R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010,\u001a\u0004\b-\u0010+R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010,\u001a\u0004\b.\u0010+R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010/R\u0016\u00100\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010'R\u0016\u00102\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010'R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00105\u001a\u0004\b4\u0010'R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00105\u001a\u0004\b6\u0010'R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00105\u001a\u0004\b7\u0010'R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!¨\u0006="}, d2 = {"Lokio/internal/ZipEntry;", "", "canonicalPath", "Lokio/Path;", "isDirectory", "", "comment", "", "crc", "", "compressedSize", "size", "compressionMethod", "", "offset", "dosLastModifiedAtDate", "dosLastModifiedAtTime", "ntfsLastModifiedAtFiletime", "ntfsLastAccessedAtFiletime", "ntfsCreatedAtFiletime", "extendedLastModifiedAtSeconds", "extendedLastAccessedAtSeconds", "extendedCreatedAtSeconds", "(Lokio/Path;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCanonicalPath", "()Lokio/Path;", com.helpshift.proactive.InAppViewConstants.CHILDREN, "", "getChildren", "()Ljava/util/List;", "getComment", "()Ljava/lang/String;", "getCompressedSize", "()J", "getCompressionMethod", "()I", "getCrc", "createdAtMillis", "getCreatedAtMillis$okio", "()Ljava/lang/Long;", "getDosLastModifiedAtDate", "getDosLastModifiedAtTime", "getExtendedCreatedAtSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExtendedLastAccessedAtSeconds", "getExtendedLastModifiedAtSeconds", "()Z", "lastAccessedAtMillis", "getLastAccessedAtMillis$okio", "lastModifiedAtMillis", "getLastModifiedAtMillis$okio", "getNtfsCreatedAtFiletime", "Ljava/lang/Long;", "getNtfsLastAccessedAtFiletime", "getNtfsLastModifiedAtFiletime", "getOffset", "getSize", "copy", "copy$okio", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lokio/internal/ZipEntry;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ZipEntry {
    private final okio.Path canonicalPath;
    private final java.util.List<okio.Path> children;
    private final java.lang.String comment;
    private final long compressedSize;
    private final int compressionMethod;
    private final long crc;
    private final int dosLastModifiedAtDate;
    private final int dosLastModifiedAtTime;
    private final java.lang.Integer extendedCreatedAtSeconds;
    private final java.lang.Integer extendedLastAccessedAtSeconds;
    private final java.lang.Integer extendedLastModifiedAtSeconds;
    private final boolean isDirectory;
    private final java.lang.Long ntfsCreatedAtFiletime;
    private final java.lang.Long ntfsLastAccessedAtFiletime;
    private final java.lang.Long ntfsLastModifiedAtFiletime;
    private final long offset;
    private final long size;

    public ZipEntry(okio.Path canonicalPath, boolean z, java.lang.String comment, long j, long j2, long j3, int i, long j4, int i2, int i3, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comment, "comment");
        this.canonicalPath = canonicalPath;
        this.isDirectory = z;
        this.comment = comment;
        this.crc = j;
        this.compressedSize = j2;
        this.size = j3;
        this.compressionMethod = i;
        this.offset = j4;
        this.dosLastModifiedAtDate = i2;
        this.dosLastModifiedAtTime = i3;
        this.ntfsLastModifiedAtFiletime = l;
        this.ntfsLastAccessedAtFiletime = l2;
        this.ntfsCreatedAtFiletime = l3;
        this.extendedLastModifiedAtSeconds = num;
        this.extendedLastAccessedAtSeconds = num2;
        this.extendedCreatedAtSeconds = num3;
        this.children = new java.util.ArrayList();
    }

    public final okio.Path getCanonicalPath() {
        return this.canonicalPath;
    }

    /* renamed from: isDirectory, reason: from getter */
    public final boolean getIsDirectory() {
        return this.isDirectory;
    }

    public /* synthetic */ ZipEntry(okio.Path path, boolean z, java.lang.String str, long j, long j2, long j3, int i, long j4, int i2, int i3, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? -1L : j, (i4 & 16) != 0 ? -1L : j2, (i4 & 32) != 0 ? -1L : j3, (i4 & 64) != 0 ? -1 : i, (i4 & 128) == 0 ? j4 : -1L, (i4 & 256) != 0 ? -1 : i2, (i4 & 512) == 0 ? i3 : -1, (i4 & 1024) != 0 ? null : l, (i4 & 2048) != 0 ? null : l2, (i4 & 4096) != 0 ? null : l3, (i4 & 8192) != 0 ? null : num, (i4 & 16384) != 0 ? null : num2, (i4 & 32768) != 0 ? null : num3);
    }

    public final java.lang.String getComment() {
        return this.comment;
    }

    public final long getCrc() {
        return this.crc;
    }

    public final long getCompressedSize() {
        return this.compressedSize;
    }

    public final long getSize() {
        return this.size;
    }

    public final int getCompressionMethod() {
        return this.compressionMethod;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final int getDosLastModifiedAtDate() {
        return this.dosLastModifiedAtDate;
    }

    public final int getDosLastModifiedAtTime() {
        return this.dosLastModifiedAtTime;
    }

    public final java.lang.Long getNtfsLastModifiedAtFiletime() {
        return this.ntfsLastModifiedAtFiletime;
    }

    public final java.lang.Long getNtfsLastAccessedAtFiletime() {
        return this.ntfsLastAccessedAtFiletime;
    }

    public final java.lang.Long getNtfsCreatedAtFiletime() {
        return this.ntfsCreatedAtFiletime;
    }

    public final java.lang.Integer getExtendedLastModifiedAtSeconds() {
        return this.extendedLastModifiedAtSeconds;
    }

    public final java.lang.Integer getExtendedLastAccessedAtSeconds() {
        return this.extendedLastAccessedAtSeconds;
    }

    public final java.lang.Integer getExtendedCreatedAtSeconds() {
        return this.extendedCreatedAtSeconds;
    }

    public final java.util.List<okio.Path> getChildren() {
        return this.children;
    }

    public final okio.internal.ZipEntry copy$okio(java.lang.Integer extendedLastModifiedAtSeconds, java.lang.Integer extendedLastAccessedAtSeconds, java.lang.Integer extendedCreatedAtSeconds) {
        return new okio.internal.ZipEntry(this.canonicalPath, this.isDirectory, this.comment, this.crc, this.compressedSize, this.size, this.compressionMethod, this.offset, this.dosLastModifiedAtDate, this.dosLastModifiedAtTime, this.ntfsLastModifiedAtFiletime, this.ntfsLastAccessedAtFiletime, this.ntfsCreatedAtFiletime, extendedLastModifiedAtSeconds, extendedLastAccessedAtSeconds, extendedCreatedAtSeconds);
    }

    public final java.lang.Long getLastAccessedAtMillis$okio() {
        java.lang.Long l = this.ntfsLastAccessedAtFiletime;
        if (l != null) {
            return java.lang.Long.valueOf(okio.internal.ZipFilesKt.filetimeToEpochMillis(l.longValue()));
        }
        if (this.extendedLastAccessedAtSeconds != null) {
            return java.lang.Long.valueOf(r0.intValue() * 1000);
        }
        return null;
    }

    public final java.lang.Long getLastModifiedAtMillis$okio() {
        java.lang.Long l = this.ntfsLastModifiedAtFiletime;
        if (l != null) {
            return java.lang.Long.valueOf(okio.internal.ZipFilesKt.filetimeToEpochMillis(l.longValue()));
        }
        if (this.extendedLastModifiedAtSeconds != null) {
            return java.lang.Long.valueOf(r0.intValue() * 1000);
        }
        int i = this.dosLastModifiedAtTime;
        if (i != -1) {
            return okio.internal.ZipFilesKt.dosDateTimeToEpochMillis(this.dosLastModifiedAtDate, i);
        }
        return null;
    }

    public final java.lang.Long getCreatedAtMillis$okio() {
        java.lang.Long l = this.ntfsCreatedAtFiletime;
        if (l != null) {
            return java.lang.Long.valueOf(okio.internal.ZipFilesKt.filetimeToEpochMillis(l.longValue()));
        }
        if (this.extendedCreatedAtSeconds != null) {
            return java.lang.Long.valueOf(r0.intValue() * 1000);
        }
        return null;
    }
}
