package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ox0 {

    /* JADX INFO: renamed from: a */
    public static final u11 f5935a = new u11();

    /* JADX INFO: renamed from: b */
    public static final Object f5936b = new Object();

    /* JADX INFO: renamed from: c */
    public static aa0 f5937c = null;

    /* JADX INFO: renamed from: a */
    public static long m3803a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0491n1.m3457a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static aa0 m3804b() {
        aa0 aa0Var = new aa0(10);
        f5937c = aa0Var;
        f5935a.m5018j(aa0Var);
        return f5937c;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0047 A[Catch: all -> 0x0013, TryCatch #2 {, blocks: (B:9:0x000d, B:11:0x0011, B:16:0x001a, B:22:0x002f, B:33:0x0041, B:35:0x0047, B:36:0x004a, B:38:0x004d, B:44:0x0070, B:50:0x0093, B:51:0x0097, B:53:0x00a8, B:61:0x00b6, B:63:0x00bc, B:78:0x00d8, B:81:0x00de, B:84:0x00e5, B:86:0x00ee, B:89:0x00f7, B:90:0x00fa, B:88:0x00f4, B:55:0x00ad, B:56:0x00b0, B:92:0x00fc, B:93:0x00ff, B:31:0x003f, B:30:0x003c), top: B:102:0x000d, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x004d A[Catch: all -> 0x0013, TryCatch #2 {, blocks: (B:9:0x000d, B:11:0x0011, B:16:0x001a, B:22:0x002f, B:33:0x0041, B:35:0x0047, B:36:0x004a, B:38:0x004d, B:44:0x0070, B:50:0x0093, B:51:0x0097, B:53:0x00a8, B:61:0x00b6, B:63:0x00bc, B:78:0x00d8, B:81:0x00de, B:84:0x00e5, B:86:0x00ee, B:89:0x00f7, B:90:0x00fa, B:88:0x00f4, B:55:0x00ad, B:56:0x00b0, B:92:0x00fc, B:93:0x00ff, B:31:0x003f, B:30:0x003c), top: B:102:0x000d, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:98:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static void m3805c(Context context, boolean z) {
        int i;
        boolean z2;
        File file;
        boolean z3;
        File file2;
        long length;
        boolean z4;
        File file3;
        nx0 nx0VarM3598a;
        nx0 nx0Var;
        int i2;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || f5937c == null) {
            synchronized (f5936b) {
                if (z) {
                    i = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    if (Build.VERSION.SDK_INT == 30) {
                        m3804b();
                        return;
                    }
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    long jM3803a = m3803a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        nx0VarM3598a = nx0.m3598a(file3);
                    } else {
                        nx0VarM3598a = null;
                    }
                    if (nx0VarM3598a == null) {
                        if (!z2) {
                            i = 327680;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                    } else if (!z2) {
                        i = 327680;
                    } else if (z3) {
                        i = 1;
                    } else if (z4) {
                        i = 2;
                    }
                    if (z) {
                        i = 2;
                    }
                    if (nx0VarM3598a != null) {
                        i = 3;
                    }
                    nx0Var = new nx0(1, i, jM3803a, length);
                    if (nx0VarM3598a != null) {
                        nx0Var.m3599b(file3);
                    } else {
                        nx0Var.m3599b(file3);
                    }
                    m3804b();
                    return;
                }
                if (f5937c != null) {
                    return;
                }
                i = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    z2 = false;
                }
                if (Build.VERSION.SDK_INT == 30) {
                    m3804b();
                    return;
                }
                file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length3 = file.length();
                if (file.exists() || length3 <= 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file2.length();
                if (file2.exists() || length <= 0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                try {
                    long jM3803a2 = m3803a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            nx0VarM3598a = nx0.m3598a(file3);
                        } catch (IOException unused2) {
                            m3804b();
                            return;
                        }
                    } else {
                        nx0VarM3598a = null;
                    }
                    if (nx0VarM3598a == null && nx0VarM3598a.f5565c == jM3803a2 && (i2 = nx0VarM3598a.f5564b) != 2) {
                        i = i2;
                    } else if (!z2) {
                        i = 327680;
                    } else if (z3) {
                        i = 1;
                    } else if (z4) {
                        i = 2;
                    }
                    if (z && z4 && i != 1) {
                        i = 2;
                    }
                    if (nx0VarM3598a != null && nx0VarM3598a.f5564b == 2 && i == 1 && length3 < nx0VarM3598a.f5566d) {
                        i = 3;
                    }
                    nx0Var = new nx0(1, i, jM3803a2, length);
                    if (nx0VarM3598a != null || !nx0VarM3598a.equals(nx0Var)) {
                        try {
                            nx0Var.m3599b(file3);
                        } catch (IOException unused3) {
                        }
                    }
                    m3804b();
                    return;
                } catch (PackageManager.NameNotFoundException unused4) {
                    m3804b();
                    return;
                }
                throw th;
            }
        }
    }
}
