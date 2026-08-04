package p145u1;

import A5.h;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import p155w1.AbstractC0997i0;
import p155w1.C1046w0;
import p155w1.C1052y0;
import p155w1.r;
import v1.c;
import v1.d;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static h f16707b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16708a;

    public /* synthetic */ j(int i7) {
        this.f16708a = i7;
    }

    public static void a() {
        k.f16710b = true;
        k.f16711c = k.f16713e.d(k.f16712d);
        Set<d> set = k.f16709a;
        synchronized (set) {
            try {
                for (d dVar : set) {
                    HashMap map = k.f16711c;
                    dVar.getClass();
                    new Handler(Looper.getMainLooper()).post(new c(3, map));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b() {
        String[] strArrSplit = AbstractC0997i0.f17743e.i("Flurry_PerformanceFlags", "resource|http").toLowerCase(Locale.ENGLISH).split("\\W+");
        AbstractC0997i0.f17742d = 0;
        for (String str : strArrSplit) {
            for (int i7 = 0; i7 < 2; i7++) {
                if (AbstractC0997i0.f17739a[i7].equals(str)) {
                    AbstractC0997i0.f17742d = AbstractC0997i0.f17740b[i7] | AbstractC0997i0.f17742d;
                    break;
                }
            }
        }
    }

    public static void g(int i7, String str, boolean z4) {
        String str2;
        HashMap map = new HashMap();
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
        map.put("type", str2);
        if (str != null) {
            map.put(str, Boolean.toString(z4));
        }
        new Handler(Looper.getMainLooper()).post(new c(0, map));
    }

    public final void c(boolean z4) {
        switch (this.f16708a) {
            case 0:
                AbstractC0997i0.o(3, "Fetch Completed with state: Activate Completed - ".concat(z4 ? "Cached" : "New"));
                if (!z4) {
                    a();
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
        switch (this.f16708a) {
            case 0:
                AbstractC0997i0.o(3, "Fetch Completed with state: Fail - ".concat(z4 ? "Retrying" : "End"));
                if (!z4) {
                    a();
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
        switch (this.f16708a) {
            case 0:
                AbstractC0997i0.o(3, "Fetch Completed with state: No Change");
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
        switch (this.f16708a) {
            case 0:
                C1052y0 c1052y0 = k.f16713e;
                ((C1046w0) c1052y0.f17938b).k(k.f16712d);
                break;
            case 1:
                g(1, null, false);
                break;
            default:
                c cVar = AbstractC0997i0.f17743e;
                cVar.getClass();
                if (!r.f17846z.get()) {
                    AbstractC0997i0.q("Flurry SDK must be initialized before activating config");
                } else {
                    ((C1046w0) cVar.f16597b).k(null);
                }
                break;
        }
    }
}
