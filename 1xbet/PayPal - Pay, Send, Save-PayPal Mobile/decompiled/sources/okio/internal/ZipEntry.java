package okio.internal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010!\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u0005\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b&\u0010%R\u001a\u0010\u000b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b'\u0010%R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000e\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b+\u0010%R\u001a\u0010\u000f\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b,\u0010*R\u001a\u0010\u0010\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b-\u0010*R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b1\u00100R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b2\u00100R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b6\u00105R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00103\u001a\u0004\b7\u00105R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0002088\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0016\u0010>\u001a\u0004\u0018\u00010\b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u00100R\u0016\u0010@\u001a\u0004\u0018\u00010\b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u00100R\u0016\u0010B\u001a\u0004\u0018\u00010\b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u00100"}, d2 = {"Lokio/internal/ZipEntry;", "", "Lokio/Path;", "canonicalPath", "", "isDirectory", "", "comment", "", "crc", "compressedSize", io.ktor.http.ContentDisposition.Parameters.Size, "", "compressionMethod", "offset", "dosLastModifiedAtDate", "dosLastModifiedAtTime", "ntfsLastModifiedAtFiletime", "ntfsLastAccessedAtFiletime", "ntfsCreatedAtFiletime", "extendedLastModifiedAtSeconds", "extendedLastAccessedAtSeconds", "extendedCreatedAtSeconds", "<init>", "(Lokio/Path;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "copy$okio", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lokio/internal/ZipEntry;", "Lokio/Path;", "getCanonicalPath", "()Lokio/Path;", "Z", "()Z", "Ljava/lang/String;", "getComment", "()Ljava/lang/String;", "J", "getCrc", "()J", "getCompressedSize", "getSize", com.visa.cbp.getEncExpo.warmup, "getCompressionMethod", "()I", "getOffset", "getDosLastModifiedAtDate", "getDosLastModifiedAtTime", "Ljava/lang/Long;", "getNtfsLastModifiedAtFiletime", "()Ljava/lang/Long;", "getNtfsLastAccessedAtFiletime", "getNtfsCreatedAtFiletime", "Ljava/lang/Integer;", "getExtendedLastModifiedAtSeconds", "()Ljava/lang/Integer;", "getExtendedLastAccessedAtSeconds", "getExtendedCreatedAtSeconds", "", "children", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "getLastAccessedAtMillis$okio", "lastAccessedAtMillis", "getLastModifiedAtMillis$okio", "lastModifiedAtMillis", "getCreatedAtMillis$okio", "createdAtMillis"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
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

    public ZipEntry(okio.Path path, boolean z, java.lang.String str, long j, long j2, long j3, int i, long j4, int i2, int i3, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.canonicalPath = path;
        this.isDirectory = z;
        this.comment = str;
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
