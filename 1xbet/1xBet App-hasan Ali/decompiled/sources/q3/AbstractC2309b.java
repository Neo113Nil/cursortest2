package q3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import m3.v;

/* renamed from: q3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2309b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f18887a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f18888b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f18889c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f18890d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f18891e;
    public static Boolean f;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f18892g;

    public static void a(Context context, Throwable th) {
        try {
            v.e(context);
        } catch (Exception e3) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e3);
        }
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b3 : bArr) {
            char[] cArr2 = f18887a;
            cArr[i] = cArr2[(b3 & 255) >>> 4];
            cArr[i + 1] = cArr2[b3 & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long d(InputStream inputStream, OutputStream outputStream, boolean z3) {
        byte[] bArr = new byte[1024];
        long j5 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                j5 += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z3) {
                    c(inputStream);
                    c(outputStream);
                }
                throw th;
            }
        }
        if (z3) {
            c(inputStream);
            c(outputStream);
        }
        return j5;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean g(Context context) {
        if (f18890d == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z3 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z3 = true;
            }
            f18890d = Boolean.valueOf(z3);
        }
        return f18890d.booleanValue();
    }

    public static boolean h(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f18888b == null) {
            f18888b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f18888b.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (j(context)) {
            return !e() || f();
        }
        return false;
    }

    public static byte[] i(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i = 0;
        while (i < length) {
            int i5 = i + 2;
            bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i5), 16);
            i = i5;
        }
        return bArr;
    }

    public static boolean j(Context context) {
        if (f18889c == null) {
            f18889c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f18889c.booleanValue();
    }
}
