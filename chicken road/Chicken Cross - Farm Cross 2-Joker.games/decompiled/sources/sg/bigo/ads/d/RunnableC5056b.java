package sg.bigo.ads.d;

import android.content.Context;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.ConsentOptions;
import sg.bigo.ads.n1.k;
import sg.bigo.ads.n1.n;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x1.p;

/* renamed from: sg.bigo.ads.d.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5056b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12720a;
    public final /* synthetic */ ConsentOptions b;

    public RunnableC5056b(Context context, ConsentOptions consentOptions) {
        this.f12720a = context;
        this.b = consentOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num = (Integer) sg.bigo.ads.F0.b.a("sp_ads", "user_consent_gdpr", (Object) 0, 0);
        num.getClass();
        AbstractC5496a.a(2, 5, "", "Revoking user consent...The cached data of user will be deleted now.");
        sg.bigo.ads.u1.g gVar = sg.bigo.ads.s1.d.e.b;
        if (gVar != null) {
            sg.bigo.ads.u1.i iVar = gVar.c;
            synchronized (iVar) {
                iVar.c.clear();
                iVar.b.clear();
            }
        }
        sg.bigo.ads.f1.b.i.a();
        p pVar = p.h;
        Context context = this.f12720a;
        pVar.getClass();
        pVar.e = context.getApplicationContext();
        AbstractC5446j.a(pVar.f);
        pVar.f13400a.clear();
        n nVar = n.n;
        Context context2 = this.f12720a;
        nVar.getClass();
        k kVar = new k(nVar, context2.getApplicationContext());
        if (AbstractC5446j.c == Thread.currentThread()) {
            kVar.run();
        } else {
            AbstractC5446j.a(1, null, kVar, 0L);
        }
        BigoAdSdk.a(this.b, false);
        sg.bigo.ads.F0.b.b("sp_ads", "user_consent_gdpr", num, 0);
    }
}
