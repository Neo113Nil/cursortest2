package kotlin.io;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÀ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0011\u0010!\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0011\u0010\"\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b$\u0010\u0018"}, d2 = {"Lkotlin/io/FilePathComponents;", "", "Ljava/io/File;", "root", "", "segments", "<init>", "(Ljava/io/File;Ljava/util/List;)V", "", "beginIndex", "endIndex", "subPath", "(II)Ljava/io/File;", "component1", "()Ljava/io/File;", "component2", "()Ljava/util/List;", "copy$kotlin_stdlib", "(Ljava/io/File;Ljava/util/List;)Lkotlin/io/FilePathComponents;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/io/File;", "getRoot", "Ljava/util/List;", "getSegments", "getRootName", "rootName", "isRooted", "()Z", "getSize", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FilePathComponents {
    private final java.io.File root;
    private final java.util.List<java.io.File> segments;

    /* JADX WARN: Multi-variable type inference failed */
    public FilePathComponents(java.io.File file, java.util.List<? extends java.io.File> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.root = file;
        this.segments = list;
    }

    public final java.io.File getRoot() {
        return this.root;
    }

    public final java.util.List<java.io.File> getSegments() {
        return this.segments;
    }

    public final java.lang.String getRootName() {
        java.lang.String path = this.root.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
        return path;
    }

    public final boolean isRooted() {
        java.lang.String path = this.root.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
        return path.length() > 0;
    }

    public final int getSize() {
        return this.segments.size();
    }

    public final java.io.File subPath(int beginIndex, int endIndex) {
        if (beginIndex < 0 || beginIndex > endIndex || endIndex > getSize()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.List<java.io.File> subList = this.segments.subList(beginIndex, endIndex);
        java.lang.String str = java.io.File.separator;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        return new java.io.File(kotlin.collections.CollectionsKt.joinToString$default(subList, str, null, null, 0, null, null, 62, null));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FilePathComponents(root=");
        sb.append(this.root);
        sb.append(", segments=");
        sb.append(this.segments);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.root.hashCode() * 31) + this.segments.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof kotlin.io.FilePathComponents)) {
            return false;
        }
        kotlin.io.FilePathComponents filePathComponents = (kotlin.io.FilePathComponents) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.root, filePathComponents.root) && kotlin.jvm.internal.Intrinsics.areEqual(this.segments, filePathComponents.segments);
    }

    public final kotlin.io.FilePathComponents copy$kotlin_stdlib(java.io.File root, java.util.List<? extends java.io.File> segments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(root, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segments, "");
        return new kotlin.io.FilePathComponents(root, segments);
    }

    public final java.util.List<java.io.File> component2() {
        return this.segments;
    }

    /* renamed from: component1, reason: from getter */
    public final java.io.File getRoot() {
        return this.root;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.io.FilePathComponents copy$kotlin_stdlib$default(kotlin.io.FilePathComponents filePathComponents, java.io.File file, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            file = filePathComponents.root;
        }
        if ((i & 2) != 0) {
            list = filePathComponents.segments;
        }
        return filePathComponents.copy$kotlin_stdlib(file, list);
    }
}
