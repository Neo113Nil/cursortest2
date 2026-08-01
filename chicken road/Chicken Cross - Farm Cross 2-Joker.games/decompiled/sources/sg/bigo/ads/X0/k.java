package sg.bigo.ads.X0;

import android.content.Context;
import com.iab.omid.library.bigosg.Omid;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f12606a;

    public k(r rVar) {
        this.f12606a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.m1.g gVar = sg.bigo.ads.m1.f.f13126a;
        r rVar = this.f12606a;
        Context context = rVar.f12613a;
        String str = rVar.b.z;
        try {
            Omid.activate(context);
            gVar.e = str;
            AbstractC5446j.a(1, null, new sg.bigo.ads.m1.d(context), 0L);
        } catch (Throwable th) {
            AbstractC5496a.a(1, 5, "OMSDK", "Failed to initialize OM SDK initialize: " + th.getMessage());
        }
    }
}
