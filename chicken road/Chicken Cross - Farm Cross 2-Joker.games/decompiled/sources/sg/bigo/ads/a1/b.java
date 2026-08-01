package sg.bigo.ads.a1;

import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import sg.bigo.ads.X0.r;
import sg.bigo.ads.Y.c;
import sg.bigo.ads.Y.d;
import sg.bigo.ads.Y.e;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class b implements e {
    public static volatile b b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12679a = new ArrayList();

    public static void a(r rVar) {
        synchronized (b.f12679a) {
            b.f12679a.add(rVar);
        }
    }

    public static synchronized void a(Context context, r rVar) {
        Context applicationContext;
        synchronized (b.class) {
            if (b == null) {
                b = new b();
                int i = d.c;
                d dVar = c.f12622a;
                b bVar = b;
                if (!dVar.f12623a && (applicationContext = context.getApplicationContext()) != null) {
                    dVar.f12623a = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    applicationContext.registerReceiver(dVar, intentFilter);
                }
                AbstractC5446j.a(2, null, new sg.bigo.ads.Y.a(dVar, bVar), 1L);
            }
            b.getClass();
            a(rVar);
        }
    }
}
