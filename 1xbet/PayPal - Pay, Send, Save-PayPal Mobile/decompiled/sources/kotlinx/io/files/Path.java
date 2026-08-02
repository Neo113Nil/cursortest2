package kotlinx.io.files;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lkotlinx/io/files/Path;", "", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/io/File;", "getFile$kotlinx_io_core", "()Ljava/io/File;", "getParent", "()Lkotlinx/io/files/Path;", "parent", "isAbsolute", "()Z", "getName", "name"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Path {
    private final java.io.File file;

    public Path(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        this.file = file;
    }

    /* renamed from: getFile$kotlinx_io_core, reason: from getter */
    public final java.io.File getFile() {
        return this.file;
    }

    public final kotlinx.io.files.Path getParent() {
        java.io.File parentFile = this.file.getParentFile();
        if (parentFile == null) {
            return null;
        }
        return new kotlinx.io.files.Path(parentFile);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.file.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof kotlinx.io.files.Path) {
            return kotlin.jvm.internal.Intrinsics.areEqual(toString(), ((kotlinx.io.files.Path) other).toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final boolean isAbsolute() {
        return this.file.isAbsolute();
    }

    public final java.lang.String getName() {
        java.lang.String name2 = this.file.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        return name2;
    }
}
