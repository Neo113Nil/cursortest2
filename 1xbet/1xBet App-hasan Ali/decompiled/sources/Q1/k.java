package Q1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final b1.l f4885a = new b1.l();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4886b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static j f4887c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? h.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static j b() {
        j jVar = new j(0);
        f4887c = jVar;
        f4885a.j(jVar);
        return f4887c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z3) {
        boolean z5;
        i a5;
        i iVar;
        int i;
        if (z3 || f4887c == null) {
            synchronized (f4886b) {
                if (!z3) {
                    if (f4887c != null) {
                        return;
                    }
                }
                int i5 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z5 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z5 = false;
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28 && i6 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z6 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z7 = file2.exists() && length2 > 0;
                    try {
                        long a6 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a5 = i.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            a5 = null;
                        }
                        if (a5 != null && a5.f4882c == a6 && (i = a5.f4881b) != 2) {
                            i5 = i;
                            if (z3 && z7 && i5 != 1) {
                                i5 = 2;
                            }
                            if (a5 != null && a5.f4881b == 2 && i5 == 1 && length < a5.f4883d) {
                                i5 = 3;
                            }
                            iVar = new i(1, i5, a6, length2);
                            if (a5 != null || !a5.equals(iVar)) {
                                iVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z6) {
                            i5 = 1;
                        } else if (z7) {
                            i5 = 2;
                        }
                        if (z3) {
                            i5 = 2;
                        }
                        if (a5 != null) {
                            i5 = 3;
                        }
                        iVar = new i(1, i5, a6, length2);
                        if (a5 != null) {
                        }
                        iVar.b(file3);
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
