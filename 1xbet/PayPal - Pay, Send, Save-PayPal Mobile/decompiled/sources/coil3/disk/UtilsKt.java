package coil3.disk;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0005\u001a\u00020\u00008CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcoil3/disk/DiskCache;", "singletonDiskCache", "()Lcoil3/disk/DiskCache;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt {
    private static final kotlin.Lazy getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: coil3.disk.UtilsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            coil3.disk.DiskCache build;
            build = new coil3.disk.DiskCache.Builder().directory(okio.FileSystem.SYSTEM_TEMPORARY_DIRECTORY.resolve("coil3_disk_cache")).build();
            return build;
        }
    });

    public static final coil3.disk.DiskCache singletonDiskCache() {
        return (coil3.disk.DiskCache) getHighSpeedVideoFpsRangesFor.getValue();
    }
}
