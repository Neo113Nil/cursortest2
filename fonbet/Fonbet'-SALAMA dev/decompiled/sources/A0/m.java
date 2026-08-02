package A0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import w1.C1718l0;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final s.k f55a = new s.k();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f56b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C1718l0 f57c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? k.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C1718l0 b() {
        C1718l0 c1718l0 = new C1718l0(1);
        f57c = c1718l0;
        f55a.p(c1718l0);
        return f57c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z4) {
        l a2;
        l lVar;
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
                        long a4 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a2 = l.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a2 = null;
                        }
                        if (a2 != null && a2.f53c == a4 && (i7 = a2.f52b) != 2) {
                            i9 = i7;
                            if (z4 && z8 && i9 != 1) {
                                i9 = 2;
                            }
                            lVar = new l(1, (a2 == null && a2.f52b == 2 && i9 == 1 && length < a2.f54d) ? 3 : i9, a4, length2);
                            if (a2 != null || !a2.equals(lVar)) {
                                lVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z8) {
                            i9 = 2;
                        }
                        if (z4) {
                            i9 = 2;
                        }
                        lVar = new l(1, (a2 == null && a2.f52b == 2 && i9 == 1 && length < a2.f54d) ? 3 : i9, a4, length2);
                        if (a2 != null) {
                        }
                        lVar.b(file3);
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
