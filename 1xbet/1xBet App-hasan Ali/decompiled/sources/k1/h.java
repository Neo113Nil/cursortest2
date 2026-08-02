package k1;

import G4.l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import g1.AbstractC1970d;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r.Q;
import r.r;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final r f17568a = new r(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f17569b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f17570c;

    /* renamed from: d, reason: collision with root package name */
    public static final Q f17571d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f17569b = threadPoolExecutor;
        f17570c = new Object();
        f17571d = new Q(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < list.size(); i5++) {
            sb.append(((e) list.get(i5)).f17563g);
            sb.append("-");
            sb.append(i);
            if (i5 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #1 {all -> 0x00b6, all -> 0x0075, all -> 0x00a7, NameNotFoundException -> 0x00ac, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x0019, B:11:0x001d, B:17:0x004f, B:20:0x0058, B:22:0x005e, B:24:0x0064, B:27:0x0071, B:29:0x0092, B:32:0x009e, B:37:0x0076, B:38:0x0079, B:39:0x007a, B:42:0x008d, B:45:0x00a8, B:46:0x00ab, B:48:0x002d, B:50:0x0035, B:53:0x0039, B:55:0x003d, B:57:0x0048, B:66:0x00ac, B:26:0x006b, B:41:0x0087), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[Catch: all -> 0x00b6, TRY_ENTER, TryCatch #1 {all -> 0x00b6, all -> 0x0075, all -> 0x00a7, NameNotFoundException -> 0x00ac, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x0019, B:11:0x001d, B:17:0x004f, B:20:0x0058, B:22:0x005e, B:24:0x0064, B:27:0x0071, B:29:0x0092, B:32:0x009e, B:37:0x0076, B:38:0x0079, B:39:0x007a, B:42:0x008d, B:45:0x00a8, B:46:0x00ab, B:48:0x002d, B:50:0x0035, B:53:0x0039, B:55:0x003d, B:57:0x0048, B:66:0x00ac, B:26:0x006b, B:41:0x0087), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #1 {all -> 0x00b6, all -> 0x0075, all -> 0x00a7, NameNotFoundException -> 0x00ac, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x0019, B:11:0x001d, B:17:0x004f, B:20:0x0058, B:22:0x005e, B:24:0x0064, B:27:0x0071, B:29:0x0092, B:32:0x009e, B:37:0x0076, B:38:0x0079, B:39:0x007a, B:42:0x008d, B:45:0x00a8, B:46:0x00ab, B:48:0x002d, B:50:0x0035, B:53:0x0039, B:55:0x003d, B:57:0x0048, B:66:0x00ac, B:26:0x006b, B:41:0x0087), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e A[Catch: all -> 0x00b6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b6, all -> 0x0075, all -> 0x00a7, NameNotFoundException -> 0x00ac, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x0019, B:11:0x001d, B:17:0x004f, B:20:0x0058, B:22:0x005e, B:24:0x0064, B:27:0x0071, B:29:0x0092, B:32:0x009e, B:37:0x0076, B:38:0x0079, B:39:0x007a, B:42:0x008d, B:45:0x00a8, B:46:0x00ab, B:48:0x002d, B:50:0x0035, B:53:0x0039, B:55:0x003d, B:57:0x0048, B:66:0x00ac, B:26:0x006b, B:41:0x0087), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g b(String str, Context context, List list, int i) {
        Typeface typeface;
        int i5;
        Typeface r5;
        AbstractC2425d.k("getFontSync");
        r rVar = f17568a;
        try {
            typeface = (Typeface) rVar.b(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new g(typeface);
        }
        C2.h a5 = d.a(context, list);
        int i6 = a5.f833l;
        List list2 = (List) a5.f834m;
        if (i6 != 0) {
            if (i6 == 1) {
                i5 = -2;
                if (i5 == 0) {
                    return new g(i5);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    i[] iVarArr = (i[]) list2.get(0);
                    l lVar = AbstractC1970d.f17079a;
                    AbstractC2425d.k("TypefaceCompat.createFromFontInfo");
                    r5 = AbstractC1970d.f17079a.r(context, iVarArr, i);
                    Trace.endSection();
                    if (r5 != null) {
                        return new g(-3);
                    }
                    rVar.c(str, r5);
                    return new g(r5);
                }
                l lVar2 = AbstractC1970d.f17079a;
                AbstractC2425d.k("TypefaceCompat.createFromFontInfoWithFallback");
                r5 = AbstractC1970d.f17079a.s(context, list2, i);
                Trace.endSection();
                if (r5 != null) {
                }
            }
            i5 = -3;
            if (i5 == 0) {
            }
        } else {
            i[] iVarArr2 = (i[]) list2.get(0);
            if (iVarArr2 != null && iVarArr2.length != 0) {
                int length = iVarArr2.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        i5 = 0;
                        break;
                    }
                    int i8 = iVarArr2[i7].f;
                    if (i8 == 0) {
                        i7++;
                    } else if (i8 >= 0) {
                        i5 = i8;
                    }
                }
                if (i5 == 0) {
                }
            }
            i5 = 1;
            if (i5 == 0) {
            }
        }
    }
}
