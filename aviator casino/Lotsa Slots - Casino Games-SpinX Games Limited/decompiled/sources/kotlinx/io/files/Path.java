package kotlinx.io.files;

/* compiled from: PathsJvm.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0012\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlinx/io/files/Path;", "", "file", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "getFile$kotlinx_io_core", "()Ljava/io/File;", "parent", "getParent", "()Lkotlinx/io/files/Path;", "toString", "", "equals", "", "other", "hashCode", "", "isAbsolute", "()Z", "name", "getName", "()Ljava/lang/String;", "kotlinx-io-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Path {
    private final java.io.File file;

    public Path(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
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

    public java.lang.String toString() {
        java.lang.String file = this.file.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(file, "toString(...)");
        return file;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof kotlinx.io.files.Path) {
            return kotlin.jvm.internal.Intrinsics.areEqual(toString(), ((kotlinx.io.files.Path) other).toString());
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public final boolean isAbsolute() {
        return this.file.isAbsolute();
    }

    public final java.lang.String getName() {
        java.lang.String name = this.file.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }
}
