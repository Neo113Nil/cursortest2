package sg.bigo.ads.T0;

import android.content.Context;
import com.ironsource.U3;

/* loaded from: classes3.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f12554a;

    public i(g gVar) {
        this.f12554a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f12554a;
        Context context = gVar.f12563a;
        long j = 15 * 1000;
        sg.bigo.ads.U.a aVar = null;
        try {
            Object invoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
            Boolean bool = (Boolean) invoke.getClass().getMethod(U3.j.M, null).invoke(invoke, null);
            String str = (String) invoke.getClass().getMethod("getId", null).invoke(invoke, null);
            if (str != null && bool != null) {
                aVar = new sg.bigo.ads.U.a(str, bool.booleanValue());
            }
        } catch (Exception unused) {
        }
        if (aVar == null) {
            try {
                aVar = sg.bigo.ads.o0.c.a(context, j);
            } catch (Exception unused2) {
            }
        }
        if (aVar == null) {
            aVar = new sg.bigo.ads.U.a("", true);
        }
        gVar.f = aVar;
        this.f12554a.a(0L);
    }
}
