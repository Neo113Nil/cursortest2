package sg.bigo.ads.u1;

import sg.bigo.ads.b0.AbstractC5025b;

/* loaded from: classes3.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f13340a;

    public h(i iVar) {
        this.f13340a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f13340a;
        iVar.getClass();
        AbstractC5025b.a("tb_stat", "expired_ts < " + System.currentTimeMillis(), null);
        iVar.b.addAll(iVar.a());
    }
}
