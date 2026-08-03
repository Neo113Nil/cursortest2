package N;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final m.h f1136a = new m.h();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f1137b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public static m0.j f1138c = null;

    public static long a(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return android.os.Build.VERSION.SDK_INT >= 33 ? N.j.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static m0.j b() {
        m0.j jVar = new m0.j(11, false);
        f1138c = jVar;
        m.h hVar = f1136a;
        hVar.getClass();
        if (m.g.f8034f.e(hVar, null, jVar)) {
            m.g.b(hVar);
        }
        return f1138c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(android.content.Context context, boolean z2) {
        N.k a2;
        N.k kVar;
        int i2;
        if (z2 || f1138c == null) {
            synchronized (f1137b) {
                if (!z2) {
                    try {
                        if (f1138c != null) {
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                int i3 = android.os.Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    java.io.File file = new java.io.File(new java.io.File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i4 = 0;
                    boolean z3 = file.exists() && length > 0;
                    java.io.File file2 = new java.io.File(new java.io.File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long a3 = a(context);
                        java.io.File file3 = new java.io.File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a2 = N.k.a(file3);
                            } catch (java.io.IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a2 = null;
                        }
                        if (a2 != null && a2.f1134c == a3 && (i2 = a2.f1133b) != 2) {
                            i4 = i2;
                            if (z2 && z4 && i4 != 1) {
                                i4 = 2;
                            }
                            kVar = new N.k(1, (a2 == null && a2.f1133b == 2 && i4 == 1 && length < a2.f1135d) ? 3 : i4, a3, length2);
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
                        kVar = new N.k(1, (a2 == null && a2.f1133b == 2 && i4 == 1 && length < a2.f1135d) ? 3 : i4, a3, length2);
                        if (a2 != null) {
                        }
                        kVar.b(file3);
                        b();
                        return;
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
