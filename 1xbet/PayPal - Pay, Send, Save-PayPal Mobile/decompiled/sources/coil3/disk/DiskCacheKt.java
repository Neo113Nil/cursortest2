package coil3.disk;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcoil3/disk/DiskCache$Builder;", "Ljava/io/File;", "directory", "(Lcoil3/disk/DiskCache$Builder;Ljava/io/File;)Lcoil3/disk/DiskCache$Builder;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DiskCacheKt {
    public static final coil3.disk.DiskCache.Builder directory(coil3.disk.DiskCache.Builder builder, java.io.File file) {
        return builder.directory(okio.Path.Companion.get$default(okio.Path.INSTANCE, file, false, 1, (java.lang.Object) null));
    }
}
