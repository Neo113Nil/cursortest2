package sg.bigo.ads.X0;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.a.AbstractC5016b;
import sg.bigo.ads.d.C5055a;

/* loaded from: classes3.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12603a;
    public final /* synthetic */ r b;

    public f(Context context, r rVar) {
        this.b = rVar;
        this.f12603a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject a2 = AbstractC5016b.a(this.f12603a);
        C5055a a3 = BigoAdSdk.a(this.f12603a);
        long currentTimeMillis = System.currentTimeMillis();
        a3.f = a2;
        try {
            a2.put("anti_info_update_millis", currentTimeMillis);
        } catch (JSONException unused) {
        }
        C5055a.g = currentTimeMillis;
        a3.c(this.f12603a);
        this.b.o.set(true);
        this.b.d();
    }
}
