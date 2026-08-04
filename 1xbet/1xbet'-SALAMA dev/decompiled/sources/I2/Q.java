package I2;

import android.os.Process;
import android.webkit.CookieManager;

/* JADX INFO: loaded from: classes.dex */
public class Q extends AbstractC0293a {
    public final CookieManager h() {
        P p5 = E2.o.f1952C.f1957c;
        int iMyUid = Process.myUid();
        if (iMyUid == 0 || iMyUid == 1000) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            int i7 = J.f3546b;
            J2.j.e("Failed to obtain CookieManager.", th);
            E2.o.f1952C.f1961g.zzv(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }
}
