package p000;

import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class na0 {

    /* JADX INFO: renamed from: d */
    public static final File f5345d = new File("/proc/self/fd");

    /* JADX INFO: renamed from: e */
    public static volatile na0 f5346e;

    /* JADX INFO: renamed from: a */
    public final int f5347a;

    /* JADX INFO: renamed from: b */
    public int f5348b;

    /* JADX INFO: renamed from: c */
    public boolean f5349c = true;

    public na0() {
        new AtomicBoolean(false);
        this.f5347a = 20000;
    }

    /* JADX INFO: renamed from: a */
    public static na0 m3507a() {
        if (f5346e == null) {
            synchronized (na0.class) {
                try {
                    if (f5346e == null) {
                        f5346e = new na0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5346e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3508b(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (z) {
            if (z2) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                    return false;
                }
            } else if (i >= 0 && i2 >= 0) {
                synchronized (this) {
                    try {
                        int i3 = this.f5348b + 1;
                        this.f5348b = i3;
                        if (i3 >= 50) {
                            this.f5348b = 0;
                            int length = f5345d.list().length;
                            long j = this.f5347a;
                            boolean z4 = ((long) length) < j;
                            this.f5349c = z4;
                            if (!z4 && Log.isLoggable("Downsampler", 5)) {
                                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j);
                            }
                        }
                        z3 = this.f5349c;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z3) {
                    return true;
                }
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                    return false;
                }
            } else if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        }
        return false;
    }
}
