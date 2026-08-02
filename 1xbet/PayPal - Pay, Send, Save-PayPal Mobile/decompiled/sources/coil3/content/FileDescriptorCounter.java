package coil3.content;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcoil3/util/FileDescriptorCounter;", "", "<init>", "()V", "Lcoil3/util/Logger;", "p0", "", "getHighSpeedVideoSizes", "(Lcoil3/util/Logger;)Z", "Ljava/io/File;", "getHighSpeedVideoFpsRangesFor", "Ljava/io/File;", "Camera2StreamConfigurationMap", "", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "", "J", "getHighResolutionOutputSizeshNQ4ISI", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class FileDescriptorCounter {
    public static final coil3.content.FileDescriptorCounter INSTANCE = new coil3.content.FileDescriptorCounter();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.io.File Camera2StreamConfigurationMap = new java.io.File("/proc/self/fd");

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static int getHighSpeedVideoFpsRanges = 30;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static long getHighSpeedVideoFpsRangesFor = android.os.SystemClock.uptimeMillis();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static boolean getHighSpeedVideoSizes = true;

    private FileDescriptorCounter() {
    }

    public final boolean getHighSpeedVideoSizes(coil3.content.Logger p0) {
        boolean z;
        synchronized (this) {
            int i = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRanges = i + 1;
            if (i >= 30 || android.os.SystemClock.uptimeMillis() > getHighSpeedVideoFpsRangesFor + 30000) {
                getHighSpeedVideoFpsRanges = 0;
                getHighSpeedVideoFpsRangesFor = android.os.SystemClock.uptimeMillis();
                java.lang.String[] list = Camera2StreamConfigurationMap.list();
                if (list == null) {
                    list = new java.lang.String[0];
                }
                int length = list.length;
                boolean z2 = length < 800;
                getHighSpeedVideoSizes = z2;
                if (!z2 && p0 != null) {
                    coil3.util.Logger.Level level = coil3.util.Logger.Level.Warn;
                    if (p0.getMinLevel().compareTo(level) <= 0) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to allocate more hardware bitmaps. Number of used file descriptors: ");
                        sb.append(length);
                        p0.log("FileDescriptorCounter", level, sb.toString(), null);
                    }
                }
            }
            z = getHighSpeedVideoSizes;
        }
        return z;
    }
}
