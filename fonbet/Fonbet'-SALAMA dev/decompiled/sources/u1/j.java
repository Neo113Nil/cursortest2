package u1;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import w1.AbstractC1706i0;
import w1.C1755w0;
import w1.C1761y0;
import w1.r;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static A5.h f16701b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16702a;

    public /* synthetic */ j(int i7) {
        this.f16702a = i7;
    }

    public static void a() {
        k.f16704b = true;
        k.f16705c = k.f16707e.d(k.f16706d);
        Set<v1.d> set = k.f16703a;
        synchronized (set) {
            try {
                for (v1.d dVar : set) {
                    HashMap hashMap = k.f16705c;
                    dVar.getClass();
                    new Handler(Looper.getMainLooper()).post(new v1.c(3, hashMap));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b() {
        String[] split = AbstractC1706i0.f17737e.i("Flurry_PerformanceFlags", "resource|http").toLowerCase(Locale.ENGLISH).split("\\W+");
        AbstractC1706i0.f17736d = 0;
        for (String str : split) {
            int i7 = 0;
            while (true) {
                if (i7 >= 2) {
                    break;
                }
                if (AbstractC1706i0.f17733a[i7].equals(str)) {
                    AbstractC1706i0.f17736d = AbstractC1706i0.f17734b[i7] | AbstractC1706i0.f17736d;
                    break;
                }
                i7++;
            }
        }
    }

    public static void g(int i7, String str, boolean z4) {
        String str2;
        HashMap hashMap = new HashMap();
        if (i7 == 1) {
            str2 = "FetchSuccess";
        } else if (i7 == 2) {
            str2 = "FetchNoChange";
        } else if (i7 == 3) {
            str2 = "FetchError";
        } else {
            if (i7 != 4) {
                throw null;
            }
            str2 = "ActivateComplete";
        }
        hashMap.put("type", str2);
        if (str != null) {
            hashMap.put(str, Boolean.toString(z4));
        }
        new Handler(Looper.getMainLooper()).post(new v1.c(0, hashMap));
    }

    public final void c(boolean z4) {
        switch (this.f16702a) {
            case 0:
                AbstractC1706i0.o(3, "Fetch Completed with state: Activate Completed - ".concat(z4 ? "Cached" : "New"));
                if (!z4) {
                    a();
                    break;
                }
                break;
            case 1:
                g(4, "isCache", z4);
                break;
            default:
                b();
                break;
        }
    }

    public final void d(boolean z4) {
        switch (this.f16702a) {
            case 0:
                AbstractC1706i0.o(3, "Fetch Completed with state: Fail - ".concat(z4 ? "Retrying" : "End"));
                if (!z4) {
                    a();
                    break;
                }
                break;
            case 1:
                g(3, "isRetrying", z4);
                break;
            default:
                b();
                break;
        }
    }

    public final void e() {
        switch (this.f16702a) {
            case 0:
                AbstractC1706i0.o(3, "Fetch Completed with state: No Change");
                a();
                break;
            case 1:
                g(2, null, false);
                break;
            default:
                b();
                break;
        }
    }

    public final void f() {
        switch (this.f16702a) {
            case 0:
                C1761y0 c1761y0 = k.f16707e;
                ((C1755w0) c1761y0.f17932b).k(k.f16706d);
                break;
            case 1:
                g(1, null, false);
                break;
            default:
                c cVar = AbstractC1706i0.f17737e;
                cVar.getClass();
                if (!r.f17840z.get()) {
                    AbstractC1706i0.q("Flurry SDK must be initialized before activating config");
                    break;
                } else {
                    ((C1755w0) cVar.f16591b).k(null);
                    break;
                }
        }
    }
}
