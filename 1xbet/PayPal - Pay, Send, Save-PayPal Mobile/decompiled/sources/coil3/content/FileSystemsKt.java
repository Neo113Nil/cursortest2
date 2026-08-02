package coil3.content;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0010\u001a\u00020\r*\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lokio/FileSystem;", "Lokio/Path;", "file", "", "mustCreate", "", "createFile", "(Lokio/FileSystem;Lokio/Path;Z)V", "createTempFile", "(Lokio/FileSystem;)Lokio/Path;", "directory", "deleteContents", "(Lokio/FileSystem;Lokio/Path;)V", "", "getExtension", "(Lokio/Path;)Ljava/lang/String;", "extension"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FileSystemsKt {
    public static /* synthetic */ void createFile$default(okio.FileSystem fileSystem, okio.Path path, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        createFile(fileSystem, path, z);
    }

    public static final void createFile(okio.FileSystem fileSystem, okio.Path path, boolean z) {
        if (z) {
            coil3.content.UtilsKt.closeQuietly((java.io.Closeable) fileSystem.sink(path, true));
        } else {
            if (fileSystem.exists(path)) {
                return;
            }
            coil3.content.UtilsKt.closeQuietly((java.io.Closeable) fileSystem.sink(path));
        }
    }

    public static final okio.Path createTempFile(okio.FileSystem fileSystem) {
        okio.Path resolve;
        do {
            resolve = okio.FileSystem.SYSTEM_TEMPORARY_DIRECTORY.resolve("tmp_".concat(java.lang.String.valueOf(kotlin.ULong.m23498toStringimpl(kotlin.random.URandomKt.nextULong(kotlin.random.Random.INSTANCE)))));
        } while (fileSystem.exists(resolve));
        createFile(fileSystem, resolve, true);
        return resolve;
    }

    public static final void deleteContents(okio.FileSystem fileSystem, okio.Path path) {
        try {
            java.io.IOException iOException = null;
            for (okio.Path path2 : fileSystem.list(path)) {
                try {
                    if (fileSystem.metadata(path2).getIsDirectory()) {
                        deleteContents(fileSystem, path2);
                    }
                    fileSystem.delete(path2);
                } catch (java.io.IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (java.io.FileNotFoundException unused) {
        }
    }

    public static final java.lang.String getExtension(okio.Path path) {
        return kotlin.text.StringsKt.substringAfterLast(path.name(), com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, "");
    }
}
