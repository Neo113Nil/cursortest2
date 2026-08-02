package okio;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b+\u0010*J\u001f\u0010-\u001a\u00020,2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020,2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0005H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020,2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b2\u0010.J\u001f\u00103\u001a\u00020,2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u00101J\u000f\u00104\u001a\u00020,H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0007H\u0016¢\u0006\u0004\b6\u00107R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u00108\u001a\u0004\b\u0002\u00109"}, d2 = {"Lokio/ForwardingFileSystem;", "Lokio/FileSystem;", "delegate", "<init>", "(Lokio/FileSystem;)V", "Lokio/Path;", "path", "", "functionName", "parameterName", "onPathParameter", "(Lokio/Path;Ljava/lang/String;Ljava/lang/String;)Lokio/Path;", "onPathResult", "(Lokio/Path;Ljava/lang/String;)Lokio/Path;", "canonicalize", "(Lokio/Path;)Lokio/Path;", "Lokio/FileMetadata;", "metadataOrNull", "(Lokio/Path;)Lokio/FileMetadata;", org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.DIRECT, "", "list", "(Lokio/Path;)Ljava/util/List;", "listOrNull", "", "followSymlinks", "Lkotlin/sequences/Sequence;", "listRecursively", "(Lokio/Path;Z)Lkotlin/sequences/Sequence;", "file", "Lokio/FileHandle;", "openReadOnly", "(Lokio/Path;)Lokio/FileHandle;", "mustCreate", "mustExist", "openReadWrite", "(Lokio/Path;ZZ)Lokio/FileHandle;", "Lokio/Source;", "source", "(Lokio/Path;)Lokio/Source;", "Lokio/Sink;", "sink", "(Lokio/Path;Z)Lokio/Sink;", "appendingSink", "", "createDirectory", "(Lokio/Path;Z)V", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "atomicMove", "(Lokio/Path;Lokio/Path;)V", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "createSymlink", "close", "()V", "toString", "()Ljava/lang/String;", "Lokio/FileSystem;", "()Lokio/FileSystem;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ForwardingFileSystem extends okio.FileSystem {
    private final okio.FileSystem delegate;

    public ForwardingFileSystem(okio.FileSystem fileSystem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        this.delegate = fileSystem;
    }

    /* renamed from: delegate, reason: from getter */
    public final okio.FileSystem getDelegate() {
        return this.delegate;
    }

    @Override // okio.FileSystem
    public okio.Path canonicalize(okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path path) throws java.io.IOException {
        okio.FileMetadata copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        okio.FileMetadata metadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (metadataOrNull == null) {
            return null;
        }
        if (metadataOrNull.getSymlinkTarget() == null) {
            return metadataOrNull;
        }
        copy = metadataOrNull.copy((r18 & 1) != 0 ? metadataOrNull.isRegularFile : false, (r18 & 2) != 0 ? metadataOrNull.isDirectory : false, (r18 & 4) != 0 ? metadataOrNull.symlinkTarget : onPathResult(metadataOrNull.getSymlinkTarget(), "metadataOrNull"), (r18 & 8) != 0 ? metadataOrNull.size : null, (r18 & 16) != 0 ? metadataOrNull.createdAtMillis : null, (r18 & 32) != 0 ? metadataOrNull.lastModifiedAtMillis : null, (r18 & 64) != 0 ? metadataOrNull.lastAccessedAtMillis : null, (r18 & 128) != 0 ? metadataOrNull.extras : null);
        return copy;
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> list(okio.Path dir) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "");
        java.util.List<okio.Path> list = this.delegate.list(onPathParameter(dir, "list", org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.DIRECT));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((okio.Path) it.next(), "list"));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.collections.CollectionsKt.sort(arrayList2);
        return arrayList2;
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> listOrNull(okio.Path dir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "");
        java.util.List<okio.Path> listOrNull = this.delegate.listOrNull(onPathParameter(dir, "listOrNull", org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.DIRECT));
        if (listOrNull == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = listOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((okio.Path) it.next(), "listOrNull"));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.collections.CollectionsKt.sort(arrayList2);
        return arrayList2;
    }

    @Override // okio.FileSystem
    public kotlin.sequences.Sequence<okio.Path> listRecursively(okio.Path dir, boolean followSymlinks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "");
        return kotlin.sequences.SequencesKt.map(this.delegate.listRecursively(onPathParameter(dir, "listRecursively", org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.DIRECT), followSymlinks), new kotlin.jvm.functions.Function1() { // from class: okio.ForwardingFileSystem$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return okio.ForwardingFileSystem.$r8$lambda$uSGFIfEGqOOIQR48FjtdbUCanJ4(okio.ForwardingFileSystem.this, (okio.Path) obj);
            }
        });
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path file) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return this.delegate.openReadOnly(onPathParameter(file, "openReadOnly", "file"));
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path file, boolean mustCreate, boolean mustExist) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return this.delegate.openReadWrite(onPathParameter(file, "openReadWrite", "file"), mustCreate, mustExist);
    }

    @Override // okio.FileSystem
    public okio.Source source(okio.Path file) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return this.delegate.source(onPathParameter(file, "source", "file"));
    }

    @Override // okio.FileSystem
    public okio.Sink sink(okio.Path file, boolean mustCreate) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return this.delegate.sink(onPathParameter(file, "sink", "file"), mustCreate);
    }

    @Override // okio.FileSystem
    public okio.Sink appendingSink(okio.Path file, boolean mustExist) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return this.delegate.appendingSink(onPathParameter(file, "appendingSink", "file"), mustExist);
    }

    @Override // okio.FileSystem
    public void createDirectory(okio.Path dir, boolean mustCreate) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "");
        this.delegate.createDirectory(onPathParameter(dir, "createDirectory", org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.DIRECT), mustCreate);
    }

    @Override // okio.FileSystem
    public void atomicMove(okio.Path source, okio.Path target) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        this.delegate.atomicMove(onPathParameter(source, "atomicMove", "source"), onPathParameter(target, "atomicMove", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET));
    }

    @Override // okio.FileSystem
    public void delete(okio.Path path, boolean mustExist) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        this.delegate.delete(onPathParameter(path, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "path"), mustExist);
    }

    @Override // okio.FileSystem
    public void createSymlink(okio.Path source, okio.Path target) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        this.delegate.createSymlink(onPathParameter(source, "createSymlink", "source"), onPathParameter(target, "createSymlink", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET));
    }

    @Override // okio.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.delegate.close();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getSimpleName());
        sb.append('(');
        sb.append(this.delegate);
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ okio.Path $r8$lambda$uSGFIfEGqOOIQR48FjtdbUCanJ4(okio.ForwardingFileSystem forwardingFileSystem, okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return forwardingFileSystem.onPathResult(path, "listRecursively");
    }

    public okio.Path onPathResult(okio.Path path, java.lang.String functionName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionName, "");
        return path;
    }

    public okio.Path onPathParameter(okio.Path path, java.lang.String functionName, java.lang.String parameterName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterName, "");
        return path;
    }
}
