package sg.bigo.ads.K0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Collections;
import java.util.Set;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static long f12344a;
    public static long b;
    public static long c;
    public static long d;

    public static Set a(int i) {
        return Collections.newSetFromMap(new G(i));
    }

    public static long b() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public static long c() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }

    public static long a() {
        long j;
        if (System.currentTimeMillis() - b > 60000) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                j = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
            } catch (Throwable th) {
                AbstractC5496a.a("StorageUtils", "getExternalStorageRemainSpace" + th.getMessage());
                j = 0;
            }
            f12344a = j;
            b = System.currentTimeMillis();
        }
        return f12344a;
    }

    public static int b(Context context) {
        try {
            return (int) Math.min(15728640L, (((ActivityManager) context.getSystemService("activity")).getLargeMemoryClass() / 8) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Exception unused) {
            return 15728640;
        }
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
        } catch (Exception unused) {
            memoryInfo = null;
        }
        if (memoryInfo == null) {
            return 0L;
        }
        return AbstractC4964v.a(3, memoryInfo.totalMem);
    }
}
