package A0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import p155w1.C1009l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p129s.k f55a = new p129s.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f56b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C1009l0 f57c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? k.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C1009l0 b() {
        C1009l0 c1009l0 = new C1009l0(1);
        f57c = c1009l0;
        f55a.p(c1009l0);
        return f57c;
    }

    public static void c(Context context, boolean z4) {
        l lVarA;
        int i7;
        if (z4 || f57c == null) {
            synchronized (f56b) {
                if (!z4) {
                    try {
                        if (f57c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 28 && i8 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i9 = 0;
                    boolean z7 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z8 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                lVarA = l.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            lVarA = null;
                        }
                        if (lVarA != null && lVarA.f53c == jA && (i7 = lVarA.f52b) != 2) {
                            i9 = i7;
                        } else if (z7) {
                            i9 = 1;
                        } else if (z8) {
                            i9 = 2;
                        }
                        if (z4 && z8 && i9 != 1) {
                            i9 = 2;
                        }
                        l lVar = new l(1, (lVarA == null || lVarA.f52b != 2 || i9 != 1 || length >= lVarA.f54d) ? i9 : 3, jA, length2);
                        if (lVarA == null || !lVarA.equals(lVar)) {
                            try {
                                lVar.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
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
