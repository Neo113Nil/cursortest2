package r;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final g.h f6479a = new g.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f6480b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static N.i f6481c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? j.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static N.i b() {
        N.i iVar = new N.i(17);
        f6481c = iVar;
        g.h hVar = f6479a;
        hVar.getClass();
        if (g.g.f1065f.g(hVar, null, iVar)) {
            g.g.b(hVar);
        }
        return f6481c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z2) {
        k a2;
        k kVar;
        int i2;
        if (z2 || f6481c == null) {
            synchronized (f6480b) {
                if (!z2) {
                    try {
                        if (f6481c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i4 = 0;
                    boolean z3 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long a3 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a2 = k.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a2 = null;
                        }
                        if (a2 != null && a2.f6477c == a3 && (i2 = a2.f6476b) != 2) {
                            i4 = i2;
                            if (z2 && z4 && i4 != 1) {
                                i4 = 2;
                            }
                            kVar = new k(1, (a2 == null && a2.f6476b == 2 && i4 == 1 && length < a2.f6478d) ? 3 : i4, a3, length2);
                            if (a2 != null || !a2.equals(kVar)) {
                                kVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z4) {
                            i4 = 2;
                        }
                        if (z2) {
                            i4 = 2;
                        }
                        kVar = new k(1, (a2 == null && a2.f6476b == 2 && i4 == 1 && length < a2.f6478d) ? 3 : i4, a3, length2);
                        if (a2 != null) {
                        }
                        kVar.b(file3);
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
