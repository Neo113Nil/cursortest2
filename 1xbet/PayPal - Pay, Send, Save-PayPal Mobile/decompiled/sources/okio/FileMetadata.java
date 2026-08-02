package okio;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00012\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r¢\u0006\u0004\b\u0013\u0010\u0014Jw\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u0003\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u0004\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b$\u0010!R*\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lokio/FileMetadata;", "", "", "isRegularFile", "isDirectory", "Lokio/Path;", "symlinkTarget", "", io.ktor.http.ContentDisposition.Parameters.Size, "createdAtMillis", "lastModifiedAtMillis", "lastAccessedAtMillis", "", "Lkotlin/reflect/KClass;", "extras", "<init>", "(ZZLokio/Path;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V", "T", "type", "extra", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "copy", "(ZZLokio/Path;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)Lokio/FileMetadata;", "", "toString", "()Ljava/lang/String;", "Z", "()Z", "Lokio/Path;", "getSymlinkTarget", "()Lokio/Path;", "Ljava/lang/Long;", "getSize", "()Ljava/lang/Long;", "getCreatedAtMillis", "getLastModifiedAtMillis", "getLastAccessedAtMillis", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileMetadata {
    private final java.lang.Long createdAtMillis;
    private final java.util.Map<kotlin.reflect.KClass<?>, java.lang.Object> extras;
    private final boolean isDirectory;
    private final boolean isRegularFile;
    private final java.lang.Long lastAccessedAtMillis;
    private final java.lang.Long lastModifiedAtMillis;
    private final java.lang.Long size;
    private final okio.Path symlinkTarget;

    public FileMetadata(boolean z, boolean z2, okio.Path path, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, java.util.Map<kotlin.reflect.KClass<?>, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.isRegularFile = z;
        this.isDirectory = z2;
        this.symlinkTarget = path;
        this.size = l;
        this.createdAtMillis = l2;
        this.lastModifiedAtMillis = l3;
        this.lastAccessedAtMillis = l4;
        this.extras = kotlin.collections.MapsKt.toMap(map);
    }

    /* renamed from: isRegularFile, reason: from getter */
    public final boolean getIsRegularFile() {
        return this.isRegularFile;
    }

    /* renamed from: isDirectory, reason: from getter */
    public final boolean getIsDirectory() {
        return this.isDirectory;
    }

    public final okio.Path getSymlinkTarget() {
        return this.symlinkTarget;
    }

    public final java.lang.Long getSize() {
        return this.size;
    }

    public final java.lang.Long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public final java.lang.Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    public final java.lang.Long getLastAccessedAtMillis() {
        return this.lastAccessedAtMillis;
    }

    public /* synthetic */ FileMetadata(boolean z, boolean z2, okio.Path path, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? null : path, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) == 0 ? l4 : null, (i & 128) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<kotlin.reflect.KClass<?>, java.lang.Object> getExtras() {
        return this.extras;
    }

    public final <T> T extra(kotlin.reflect.KClass<? extends T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        java.lang.Object obj = this.extras.get(type);
        if (obj == null) {
            return null;
        }
        return (T) kotlin.reflect.KClasses.cast(type, obj);
    }

    public final okio.FileMetadata copy(boolean isRegularFile, boolean isDirectory, okio.Path symlinkTarget, java.lang.Long size, java.lang.Long createdAtMillis, java.lang.Long lastModifiedAtMillis, java.lang.Long lastAccessedAtMillis, java.util.Map<kotlin.reflect.KClass<?>, ? extends java.lang.Object> extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "");
        return new okio.FileMetadata(isRegularFile, isDirectory, symlinkTarget, size, createdAtMillis, lastModifiedAtMillis, lastAccessedAtMillis, extras);
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.isRegularFile) {
            arrayList.add("isRegularFile");
        }
        if (this.isDirectory) {
            arrayList.add("isDirectory");
        }
        if (this.size != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("byteCount=");
            sb.append(this.size.longValue());
            arrayList.add(sb.toString());
        }
        if (this.createdAtMillis != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("createdAt=");
            sb2.append(this.createdAtMillis.longValue());
            arrayList.add(sb2.toString());
        }
        if (this.lastModifiedAtMillis != null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("lastModifiedAt=");
            sb3.append(this.lastModifiedAtMillis.longValue());
            arrayList.add(sb3.toString());
        }
        if (this.lastAccessedAtMillis != null) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("lastAccessedAt=");
            sb4.append(this.lastAccessedAtMillis.longValue());
            arrayList.add(sb4.toString());
        }
        if (!this.extras.isEmpty()) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("extras=");
            sb5.append(this.extras);
            arrayList.add(sb5.toString());
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public FileMetadata() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }
}
