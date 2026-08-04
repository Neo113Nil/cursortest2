package M;

import B.v;
import I4.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p122r.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p122r.g f4528a = new p122r.g(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f4529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f4530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f4531d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new h());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4529b = threadPoolExecutor;
        f4530c = new Object();
        f4531d = new l();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[EDGE_INSN: B:10:0x0020->B:24:0x003d BREAK  A[LOOP:0: B:17:0x002d->B:23:0x003a]] */
    public static d a(String str, Context context, j jVar, int i7) {
        p122r.g gVar = f4528a;
        Typeface typeface = (Typeface) gVar.get(str);
        if (typeface != null) {
            return new d(typeface);
        }
        try {
            v vVarA = a.a(jVar, context);
            int i8 = 1;
            f[] fVarArr = (f[]) vVarA.f966c;
            int i9 = vVarA.f965b;
            if (i9 != 0) {
                if (i9 != 1) {
                    i8 = -3;
                    break;
                }
                i8 = -2;
            } else if (fVarArr != null && fVarArr.length != 0) {
                i8 = 0;
                for (f fVar : fVarArr) {
                    int i10 = fVar.f4536e;
                    if (i10 != 0) {
                        if (i10 >= 0) {
                            i8 = i10;
                            break;
                        }
                        i8 = -3;
                        break;
                    }
                }
            }
            if (i8 != 0) {
                return new d(i8);
            }
            Typeface typefaceW = I.f.f3467a.w(context, fVarArr, i7);
            if (typefaceW == null) {
                return new d(-3);
            }
            gVar.put(str, typefaceW);
            return new d(typefaceW);
        } catch (PackageManager.NameNotFoundException unused) {
            return new d(-1);
        }
    }
}
