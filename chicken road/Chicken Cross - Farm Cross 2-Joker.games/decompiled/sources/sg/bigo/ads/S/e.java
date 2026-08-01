package sg.bigo.ads.S;

import android.net.Uri;
import android.os.SystemClock;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12529a;
    public final /* synthetic */ f b;

    public e(f fVar, String str) {
        this.b = fVar;
        this.f12529a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        Long l = (Long) this.b.c.get(this.f12529a);
        if (l == null || SystemClock.elapsedRealtime() - l.longValue() > 300000) {
            Uri parse = Uri.parse(this.f12529a);
            sg.bigo.ads.T.c cVar = this.b.f12530a;
            CustomTabsClient customTabsClient = cVar.b;
            if (customTabsClient != null) {
                if (customTabsClient == null) {
                    cVar.f12543a = null;
                } else if (cVar.f12543a == null) {
                    cVar.f12543a = customTabsClient.newSession(new sg.bigo.ads.T.a(cVar));
                }
                CustomTabsSession customTabsSession = cVar.f12543a;
                if (customTabsSession != null) {
                    z = customTabsSession.mayLaunchUrl(parse, null, null);
                    String str = this.f12529a;
                    if (!z) {
                        sg.bigo.ads.s1.b.a(3002, 10115, String.valueOf(str), (sg.bigo.ads.P.c) null);
                    }
                    this.b.c.put(this.f12529a, Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
            z = false;
            String str2 = this.f12529a;
            if (!z) {
            }
            this.b.c.put(this.f12529a, Long.valueOf(SystemClock.elapsedRealtime()));
        }
        AbstractC5446j.a(2, null, new d(this), 200L);
    }
}
