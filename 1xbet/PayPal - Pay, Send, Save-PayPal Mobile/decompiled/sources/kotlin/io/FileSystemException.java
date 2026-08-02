package kotlin.io;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlin/io/FileSystemException;", "Ljava/io/IOException;", "Ljava/io/File;", "file", "other", "", "reason", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "getOther", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public class FileSystemException extends java.io.IOException {
    private final java.io.File file;
    private final java.io.File other;
    private final java.lang.String reason;

    public /* synthetic */ FileSystemException(java.io.File file, java.io.File file2, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }

    public final java.io.File getFile() {
        return this.file;
    }

    public final java.io.File getOther() {
        return this.other;
    }

    public final java.lang.String getReason() {
        return this.reason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemException(java.io.File file, java.io.File file2, java.lang.String str) {
        super(kotlin.io.ExceptionsKt.access$constructMessage(file, file2, str));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        this.file = file;
        this.other = file2;
        this.reason = str;
    }
}
