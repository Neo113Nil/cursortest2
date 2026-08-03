package v;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final l.f f8371a = new l.f(16);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ThreadPoolExecutor f8372b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f8373c;

    /* renamed from: d, reason: collision with root package name */
    public static final l.k f8374d;

    static {
        v.i iVar = new v.i();
        iVar.f8381a = "fonts-androidx";
        iVar.f8382b = 10;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingDeque(), iVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f8372b = threadPoolExecutor;
        f8373c = new java.lang.Object();
        f8374d = new l.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v.e a(java.lang.String str, android.content.Context context, I1.u uVar, int i2) {
        l.f fVar = f8371a;
        android.graphics.Typeface typeface = (android.graphics.Typeface) fVar.a(str);
        if (typeface != null) {
            return new v.e(typeface);
        }
        try {
            M1.n a2 = v.AbstractC0999b.a(context, uVar);
            int i3 = 1;
            v.g[] gVarArr = (v.g[]) a2.f1094b;
            int i4 = a2.f1093a;
            if (i4 != 0) {
                if (i4 == 1) {
                    i3 = -2;
                    if (i3 != 0) {
                        return new v.e(i3);
                    }
                    android.graphics.Typeface k2 = r.d.f8330a.k(context, gVarArr, i2);
                    if (k2 == null) {
                        return new v.e(-3);
                    }
                    fVar.b(str, k2);
                    return new v.e(k2);
                }
                i3 = -3;
                if (i3 != 0) {
                }
            } else {
                if (gVarArr != null && gVarArr.length != 0) {
                    int length = gVarArr.length;
                    i3 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        int i6 = gVarArr[i5].f8379e;
                        if (i6 == 0) {
                            i5++;
                        } else if (i6 >= 0) {
                            i3 = i6;
                        }
                    }
                }
                if (i3 != 0) {
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return new v.e(-1);
        }
    }
}
