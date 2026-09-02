package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import g.AbstractFutureC0037g;
import g.C0038h;
import java.io.File;
import java.io.IOException;

/* renamed from: o.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0082n {

    /* renamed from: a, reason: collision with root package name */
    public static final C0038h f1045a = new C0038h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1046b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C.b f1047c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0080l.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C.b b() {
        C.b bVar = new C.b(15);
        f1047c = bVar;
        C0038h c0038h = f1045a;
        c0038h.getClass();
        if (AbstractFutureC0037g.f525g.e(c0038h, null, bVar)) {
            AbstractFutureC0037g.b(c0038h);
        }
        return f1047c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:80)(1:18)|19|(1:79)(1:23)|24|25|26|(2:64|65)(1:28)|29|(9:36|(1:40)|(1:47)|48|(2:56|57)|52|53|54|55)|(1:63)|(1:40)|(3:42|45|47)|48|(1:50)|56|57|52|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009e, code lost:
    
        r6 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z2) {
        C0081m a2;
        C0081m c0081m;
        int i2;
        if (z2 || f1047c == null) {
            synchronized (f1046b) {
                if (!z2) {
                    try {
                        if (f1047c != null) {
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
                                a2 = C0081m.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a2 = null;
                        }
                        if (a2 != null && a2.f1043c == a3 && (i2 = a2.f1042b) != 2) {
                            i4 = i2;
                            if (z2 && z4 && i4 != 1) {
                                i4 = 2;
                            }
                            if (a2 != null && a2.f1042b == 2 && i4 == 1 && length < a2.f1044d) {
                                i4 = 3;
                            }
                            c0081m = new C0081m(1, i4, a3, length2);
                            if (a2 != null || !a2.equals(c0081m)) {
                                c0081m.b(file3);
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
                        if (a2 != null) {
                            i4 = 3;
                        }
                        c0081m = new C0081m(1, i4, a3, length2);
                        if (a2 != null) {
                        }
                        c0081m.b(file3);
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
