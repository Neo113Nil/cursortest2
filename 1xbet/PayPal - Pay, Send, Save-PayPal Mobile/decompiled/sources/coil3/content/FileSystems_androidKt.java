package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lokio/FileSystem;", "Lokio/Path;", "directory", "", "remainingFreeSpaceBytes", "(Lokio/FileSystem;Lokio/Path;)J"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileSystems_androidKt {
    public static final long remainingFreeSpaceBytes(okio.FileSystem fileSystem, okio.Path path) {
        java.io.File file = path.toFile();
        file.mkdir();
        android.os.StatFs statFs = new android.os.StatFs(file.getAbsolutePath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }
}
