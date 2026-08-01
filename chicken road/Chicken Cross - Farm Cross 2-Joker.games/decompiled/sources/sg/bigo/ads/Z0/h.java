package sg.bigo.ads.Z0;

import android.text.TextUtils;
import sg.bigo.ads.T0.p;
import sg.bigo.ads.api.Ad;

/* loaded from: classes3.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f12659a;
    public final /* synthetic */ k b;
    public final /* synthetic */ Ad c;
    public final /* synthetic */ l d;

    public h(l lVar, p pVar, k kVar, int i, Ad ad) {
        this.d = lVar;
        this.f12659a = pVar;
        this.b = kVar;
        this.c = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f12659a;
        String str = pVar == null ? null : pVar.l;
        if (!TextUtils.isEmpty(str)) {
            l.c.remove(str);
        }
        k kVar = this.b;
        kVar.e = true;
        this.d.getClass();
        l.a(str, kVar);
        this.b.a();
        k kVar2 = this.b;
        if (kVar2.f12662a) {
            this.d.a(kVar2, this.f12659a, this.c, 1);
            return;
        }
        if (kVar2.b) {
            this.d.a(kVar2, this.f12659a, this.c, 2);
            return;
        }
        l lVar = this.d;
        sg.bigo.ads.P.c[] a2 = m.a(this.c);
        Ad ad = this.c;
        lVar.getClass();
        l.a(str, kVar2, a2, 1, 0, 0, null, true, ad);
        this.d.a(this.c, true);
    }
}
