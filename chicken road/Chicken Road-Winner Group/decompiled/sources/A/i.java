package A;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m0.E;
import p.C1156f;
import p.C1161k;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final C1156f f20a = new C1156f(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f21b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f22c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1161k f23d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new l());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f21b = threadPoolExecutor;
        f22c = new Object();
        f23d = new C1161k();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h a(String str, Context context, e eVar, int i3) {
        C1156f c1156f = f20a;
        Typeface typeface = (Typeface) c1156f.a(str);
        if (typeface != null) {
            return new h(typeface);
        }
        try {
            E a3 = d.a(context, eVar);
            int i4 = 1;
            j[] jVarArr = (j[]) a3.f9946b;
            int i5 = a3.f9945a;
            if (i5 != 0) {
                if (i5 == 1) {
                    i4 = -2;
                    if (i4 != 0) {
                        return new h(i4);
                    }
                    Typeface m3 = w.d.f10438a.m(context, jVarArr, i3);
                    if (m3 == null) {
                        return new h(-3);
                    }
                    c1156f.b(str, m3);
                    return new h(m3);
                }
                i4 = -3;
                if (i4 != 0) {
                }
            } else {
                if (jVarArr != null && jVarArr.length != 0) {
                    int length = jVarArr.length;
                    i4 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        int i7 = jVarArr[i6].f28e;
                        if (i7 == 0) {
                            i6++;
                        } else if (i7 >= 0) {
                            i4 = i7;
                        }
                    }
                }
                if (i4 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new h(-1);
        }
    }
}
