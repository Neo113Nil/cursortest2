package p090m3;

import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.g;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.D;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import p096n1.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f15255a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f15256b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f15257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f15258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f15259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f15260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f15261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f15262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f15263i;
    public static int j;

    public static void a(Context context, Throwable th) {
        try {
            D.i(context);
        } catch (Exception e7) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e7);
        }
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i7 = 0;
        for (byte b7 : bArr) {
            char[] cArr2 = f15256b;
            cArr[i7] = cArr2[(b7 & 255) >>> 4];
            cArr[i7 + 1] = cArr2[b7 & 15];
            i7 += 2;
        }
        return new String(cArr);
    }

    public static String c(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i7 = 0; i7 < length; i7++) {
            char[] cArr = f15255a;
            sb.append(cArr[(bArr[i7] & 240) >>> 4]);
            sb.append(cArr[bArr[i7] & 15]);
        }
        return sb.toString();
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long e(InputStream inputStream, OutputStream outputStream, boolean z4) {
        byte[] bArr = new byte[1024];
        long j3 = 0;
        while (true) {
            try {
                int i7 = inputStream.read(bArr, 0, 1024);
                if (i7 == -1) {
                    break;
                }
                j3 += (long) i7;
                outputStream.write(bArr, 0, i7);
            } catch (Throwable th) {
                if (z4) {
                    d(inputStream);
                    d(outputStream);
                }
                throw th;
            }
        }
        if (z4) {
            d(inputStream);
            d(outputStream);
        }
        return j3;
    }

    public static String f() throws Throwable {
        BufferedReader bufferedReader;
        if (f15263i == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f15263i = Application.getProcessName();
            } else {
                int iMyPid = j;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    j = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        String str = "/proc/" + iMyPid + "/cmdline";
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str));
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            try {
                                String line = bufferedReader.readLine();
                                D.i(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                d(bufferedReader2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    d(bufferedReader);
                }
                f15263i = strTrim;
            }
        }
        return f15263i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    public static byte[] g(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo packageInfoT = p097n3.c.a(context).t(64, str);
        Signature[] signatureArr = packageInfoT.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            for (int i7 = 0; i7 < 2; i7++) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        if (messageDigest != null) {
                            return messageDigest.digest(packageInfoT.signatures[0].toByteArray());
                        }
                    }
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            messageDigest = null;
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoT.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean j(Context context, int i7) {
        if (o(context, i7, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                h hVarA = h.a(context);
                hVarA.getClass();
                if (packageInfo == null) {
                    return false;
                }
                if (!h.c(packageInfo, false)) {
                    if (!h.c(packageInfo, true)) {
                        return false;
                    }
                    if (!g.honorsDebugCertificates(hVarA.f11219a)) {
                        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        return false;
                    }
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean k(Context context) {
        if (f15259e == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z4 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z4 = true;
            }
            f15259e = Boolean.valueOf(z4);
        }
        return f15259e.booleanValue();
    }

    public static boolean l(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f15257c == null) {
            f15257c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f15257c.booleanValue();
    }

    public static boolean m(Context context) {
        l(context);
        if (q(context)) {
            return !h() || i();
        }
        return false;
    }

    public static byte[] n(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i7 = 0;
        while (i7 < length) {
            int i8 = i7 + 2;
            bArr[i7 / 2] = (byte) Integer.parseInt(str.substring(i7, i8), 16);
            i7 = i8;
        }
        return bArr;
    }

    public static boolean o(Context context, int i7, String str) {
        e eVarA = p097n3.c.a(context);
        eVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) eVarA.f15314b).getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i7, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static void p(StringBuilder sb, HashMap map) {
        sb.append("{");
        boolean z4 = true;
        for (String str : map.keySet()) {
            if (!z4) {
                sb.append(",");
            }
            String str2 = (String) map.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z4 = false;
        }
        sb.append("}");
    }

    public static boolean q(Context context) {
        if (f15258d == null) {
            f15258d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f15258d.booleanValue();
    }
}
