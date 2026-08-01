package sg.bigo.ads.H0;

import android.os.Build;
import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f12320a = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    public static final String[] b = {"/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props"};
    public static final String[] c = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    public static final String[] d = {"goldfish"};

    public static boolean a() {
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        for (int i = 0; i < 2; i++) {
            File file = fileArr[i];
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                if (new String(bArr).contains(d[0])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String b() {
        return " Build.BOARD = " + Build.BOARD + ", Build.BOOTLOADER = " + Build.BOOTLOADER + ", Build.BRAND = " + Build.BRAND + ", Build.DEVICE = " + Build.DEVICE + ", Build.DISPLAY = " + Build.DISPLAY + ", Build.FINGERPRINT = " + Build.FINGERPRINT + ", Build.HARDWARE = " + Build.HARDWARE + ", Build.HOST = " + Build.HOST + ", Build.MANUFACTURER = " + Build.MANUFACTURER + ", Build.MODEL = " + Build.MODEL + ", Build.PRODUCT = " + Build.PRODUCT + ", Build.TIME = " + Build.TIME + ", Build.TYPE = " + Build.TYPE + ", Build.ID = " + Build.USER + ", Build.VERSION.CODENAME = " + Build.VERSION.CODENAME + ", Build.VERSION.INCREMENTAL = " + Build.VERSION.INCREMENTAL + ", Build.VERSION.RELEASE = " + Build.VERSION.RELEASE + ", Build.VERSION.SDK_INT = " + Build.VERSION.SDK_INT + ",";
    }
}
