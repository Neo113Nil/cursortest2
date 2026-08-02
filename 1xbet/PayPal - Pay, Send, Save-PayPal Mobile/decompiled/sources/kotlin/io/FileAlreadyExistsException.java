package kotlin.io;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/io/FileAlreadyExistsException;", "Lkotlin/io/FileSystemException;", "Ljava/io/File;", "file", "other", "", "reason", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileAlreadyExistsException extends kotlin.io.FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAlreadyExistsException(java.io.File file, java.io.File file2, java.lang.String str) {
        super(file, file2, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
    }

    public /* synthetic */ FileAlreadyExistsException(java.io.File file, java.io.File file2, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }
}
