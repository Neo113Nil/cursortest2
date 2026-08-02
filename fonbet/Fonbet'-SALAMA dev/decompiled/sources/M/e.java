package M;

import B.v;
import I4.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r.l;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final r.g f4528a = new r.g(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f4529b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4530c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f4531d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new h());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4529b = threadPoolExecutor;
        f4530c = new Object();
        f4531d = new l();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d a(String str, Context context, j jVar, int i7) {
        r.g gVar = f4528a;
        Typeface typeface = (Typeface) gVar.get(str);
        if (typeface != null) {
            return new d(typeface);
        }
        try {
            v a2 = a.a(jVar, context);
            int i8 = 1;
            f[] fVarArr = (f[]) a2.f966c;
            int i9 = a2.f965b;
            if (i9 != 0) {
                if (i9 == 1) {
                    i8 = -2;
                    if (i8 != 0) {
                        return new d(i8);
                    }
                    Typeface w7 = I.f.f3467a.w(context, fVarArr, i7);
                    if (w7 == null) {
                        return new d(-3);
                    }
                    gVar.put(str, w7);
                    return new d(w7);
                }
                i8 = -3;
                if (i8 != 0) {
                }
            } else {
                if (fVarArr != null && fVarArr.length != 0) {
                    int length = fVarArr.length;
                    i8 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        int i11 = fVarArr[i10].f4536e;
                        if (i11 == 0) {
                            i10++;
                        } else if (i11 >= 0) {
                            i8 = i11;
                        }
                    }
                }
                if (i8 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new d(-1);
        }
    }
}
