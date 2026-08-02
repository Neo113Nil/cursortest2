package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l40 {

    /* JADX INFO: renamed from: a */
    public static final rk0 f4669a = new rk0(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f4670b;

    /* JADX INFO: renamed from: c */
    public static final Object f4671c;

    /* JADX INFO: renamed from: d */
    public static final w71 f4672d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0862x2(2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4670b = threadPoolExecutor;
        f4671c = new Object();
        f4672d = new w71(0);
    }

    /* JADX INFO: renamed from: a */
    public static String m3167a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((f40) list.get(i2)).f2308g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static k40 m3168b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceM5790a;
        rk0 rk0Var = f4669a;
        wo1.m5378a("getFontSync");
        try {
            Typeface typeface = (Typeface) rk0Var.m4362b(str);
            if (typeface != null) {
                k40 k40Var = new k40(typeface);
                Trace.endSection();
                return k40Var;
            }
            try {
                C0678s3 c0678s3M1360a = e40.m1360a(context, list);
                List list2 = (List) c0678s3M1360a.f7022k;
                int i3 = c0678s3M1360a.f7021j;
                if (i3 == 0) {
                    q40[] q40VarArr = (q40[]) list2.get(0);
                    if (q40VarArr == null || q40VarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = q40VarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = q40VarArr[i4].f6372f;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    k40 k40Var2 = new k40(i2);
                    Trace.endSection();
                    return k40Var2;
                }
                if (list2.size() > 1) {
                    aa0 aa0Var = ye1.f9283a;
                    wo1.m5378a("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceM5790a = ye1.f9283a.m163l(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    typefaceM5790a = ye1.m5790a(context, (q40[]) list2.get(0), i);
                }
                if (typefaceM5790a == null) {
                    k40 k40Var3 = new k40(-3);
                    Trace.endSection();
                    return k40Var3;
                }
                rk0Var.m4363c(str, typefaceM5790a);
                k40 k40Var4 = new k40(typefaceM5790a);
                Trace.endSection();
                return k40Var4;
            } catch (PackageManager.NameNotFoundException unused) {
                k40 k40Var5 = new k40(-1);
                Trace.endSection();
                return k40Var5;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
