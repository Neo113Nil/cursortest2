package coil.util;

/* compiled from: Utils.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcoil/util/SingletonDiskCache;", "", "<init>", "()V", "DIRECTORY", "", com.ironsource.C3232q2.p, "Lcoil/disk/DiskCache;", "get", "context", "Landroid/content/Context;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingletonDiskCache {
    private static final java.lang.String DIRECTORY = "image_cache";
    public static final coil.util.SingletonDiskCache INSTANCE = new coil.util.SingletonDiskCache();
    private static coil.disk.DiskCache instance;

    private SingletonDiskCache() {
    }

    public final synchronized coil.disk.DiskCache get(android.content.Context context) {
        coil.disk.DiskCache diskCache;
        diskCache = instance;
        if (diskCache == null) {
            coil.util.SingletonDiskCache singletonDiskCache = this;
            diskCache = new coil.disk.DiskCache.Builder().directory(kotlin.io.FilesKt.resolve(coil.util.Utils.getSafeCacheDir(context), DIRECTORY)).build();
            instance = diskCache;
        }
        return diskCache;
    }
}
