package okhttp3.internal.publicsuffix;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lokhttp3/internal/publicsuffix/ResourcePublicSuffixList;", "Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Lokio/Path;", "path", "Lokio/FileSystem;", "fileSystem", "<init>", "(Lokio/Path;Lokio/FileSystem;)V", "Lokio/Source;", "listSource", "()Lokio/Source;", "Lokio/Path;", "getPath", "()Lokio/Path;", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ResourcePublicSuffixList extends okhttp3.internal.publicsuffix.BasePublicSuffixList {
    public static final okio.Path PUBLIC_SUFFIX_RESOURCE = okio.Path.Companion.get$default(okio.Path.INSTANCE, "okhttp3/internal/publicsuffix/PublicSuffixDatabase.list", false, 1, (java.lang.Object) null);
    private final okio.FileSystem fileSystem;
    private final okio.Path path;

    public ResourcePublicSuffixList(okio.Path path, okio.FileSystem fileSystem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        this.path = path;
        this.fileSystem = fileSystem;
    }

    public /* synthetic */ ResourcePublicSuffixList(okio.Path path, okio.FileSystem fileSystem, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PUBLIC_SUFFIX_RESOURCE : path, (i & 2) != 0 ? okio.FileSystem.RESOURCES : fileSystem);
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public final okio.Path getPath() {
        return this.path;
    }

    public final okio.FileSystem getFileSystem() {
        return this.fileSystem;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public final okio.Source listSource() {
        return this.fileSystem.source(getPath());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResourcePublicSuffixList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
