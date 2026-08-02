package kotlin.io.path;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\t"}, d2 = {"Lkotlin/io/path/IllegalFileNameException;", "Ljava/nio/file/FileSystemException;", "Ljava/nio/file/Path;", "file", "other", "", "message", "<init>", "(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/String;)V", "(Ljava/nio/file/Path;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IllegalFileNameException extends java.nio.file.FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllegalFileNameException(java.nio.file.Path path, java.nio.file.Path path2, java.lang.String str) {
        super(path.toString(), path2 != null ? path2.toString() : null, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IllegalFileNameException(java.nio.file.Path path) {
        this(path, null, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
    }
}
