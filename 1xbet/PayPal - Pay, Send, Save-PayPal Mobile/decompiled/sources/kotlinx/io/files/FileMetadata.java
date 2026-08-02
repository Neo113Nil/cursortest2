package kotlinx.io.files;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\u0003\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\u0004\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lkotlinx/io/files/FileMetadata;", "", "", "isRegularFile", "isDirectory", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(ZZJ)V", "Z", "()Z", "J", "getSize", "()J"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FileMetadata {
    private final boolean isDirectory;
    private final boolean isRegularFile;
    private final long size;

    public FileMetadata(boolean z, boolean z2, long j) {
        this.isRegularFile = z;
        this.isDirectory = z2;
        this.size = j;
    }

    public /* synthetic */ FileMetadata(boolean z, boolean z2, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? 0L : j);
    }

    /* renamed from: isRegularFile, reason: from getter */
    public final boolean getIsRegularFile() {
        return this.isRegularFile;
    }

    /* renamed from: isDirectory, reason: from getter */
    public final boolean getIsDirectory() {
        return this.isDirectory;
    }

    public final long getSize() {
        return this.size;
    }

    public FileMetadata() {
        this(false, false, 0L, 7, null);
    }
}
