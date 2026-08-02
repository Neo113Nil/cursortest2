package T2;

import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC1146j8;
import com.google.android.gms.internal.ads.AbstractC1715vu;
import com.google.android.gms.internal.ads.Hq;
import com.google.android.gms.internal.ads.InterfaceC1760wu;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class G extends U2.j {
    public static void m(String str) {
        if (!o()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        Hq hq = U2.j.f5880a;
        Iterator c5 = ((InterfaceC1760wu) hq.f9491l).c(hq, str);
        boolean z3 = true;
        while (true) {
            AbstractC1715vu abstractC1715vu = (AbstractC1715vu) c5;
            if (!abstractC1715vu.hasNext()) {
                return;
            }
            String str2 = (String) abstractC1715vu.next();
            if (z3) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z3 = false;
        }
    }

    public static void n(String str, Throwable th) {
        if (o()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean o() {
        return U2.j.l(2) && ((Boolean) AbstractC1146j8.f14087a.s()).booleanValue();
    }
}
