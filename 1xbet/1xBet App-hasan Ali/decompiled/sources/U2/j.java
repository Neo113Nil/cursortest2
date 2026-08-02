package U2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC1715vu;
import com.google.android.gms.internal.ads.Aq;
import com.google.android.gms.internal.ads.Hq;
import com.google.android.gms.internal.ads.InterfaceC1760wu;
import java.lang.reflect.Array;
import java.util.Iterator;
import m3.v;
import t3.C2424c;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Hq f5880a = new Hq(5, new Aq(6, 0));

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !a((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i = 0; i < length; i++) {
                        if (!v.g(Array.get(obj, i), Array.get(obj2, i))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }

    public static C2424c b(Context context) {
        try {
            return C2424c.c(context, C2424c.f19570b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e3) {
            throw new k(e3);
        }
    }

    public static String c(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        return str + " @" + stackTrace[3].getLineNumber();
    }

    public static void d(String str) {
        if (!l(3)) {
            return;
        }
        if (str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        Hq hq = f5880a;
        Iterator c5 = ((InterfaceC1760wu) hq.f9491l).c(hq, str);
        boolean z3 = true;
        while (true) {
            AbstractC1715vu abstractC1715vu = (AbstractC1715vu) c5;
            if (!abstractC1715vu.hasNext()) {
                return;
            }
            String str2 = (String) abstractC1715vu.next();
            if (z3) {
                Log.d("Ads", str2);
            } else {
                Log.d("Ads-cont", str2);
            }
            z3 = false;
        }
    }

    public static void e(String str, Throwable th) {
        if (l(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void f(String str) {
        if (!l(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        Hq hq = f5880a;
        Iterator c5 = ((InterfaceC1760wu) hq.f9491l).c(hq, str);
        boolean z3 = true;
        while (true) {
            AbstractC1715vu abstractC1715vu = (AbstractC1715vu) c5;
            if (!abstractC1715vu.hasNext()) {
                return;
            }
            String str2 = (String) abstractC1715vu.next();
            if (z3) {
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z3 = false;
        }
    }

    public static void g(String str, Throwable th) {
        if (l(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void h(String str) {
        if (!l(4)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.i("Ads", str);
            return;
        }
        Hq hq = f5880a;
        Iterator c5 = ((InterfaceC1760wu) hq.f9491l).c(hq, str);
        boolean z3 = true;
        while (true) {
            AbstractC1715vu abstractC1715vu = (AbstractC1715vu) c5;
            if (!abstractC1715vu.hasNext()) {
                return;
            }
            String str2 = (String) abstractC1715vu.next();
            if (z3) {
                Log.i("Ads", str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z3 = false;
        }
    }

    public static void i(String str) {
        if (!l(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w("Ads", str);
            return;
        }
        Hq hq = f5880a;
        Iterator c5 = ((InterfaceC1760wu) hq.f9491l).c(hq, str);
        boolean z3 = true;
        while (true) {
            AbstractC1715vu abstractC1715vu = (AbstractC1715vu) c5;
            if (!abstractC1715vu.hasNext()) {
                return;
            }
            String str2 = (String) abstractC1715vu.next();
            if (z3) {
                Log.w("Ads", str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z3 = false;
        }
    }

    public static void j(String str, Throwable th) {
        if (l(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void k(String str, Exception exc) {
        if (l(5)) {
            if (exc != null) {
                j(c(str), exc);
            } else {
                i(c(str));
            }
        }
    }

    public static boolean l(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
