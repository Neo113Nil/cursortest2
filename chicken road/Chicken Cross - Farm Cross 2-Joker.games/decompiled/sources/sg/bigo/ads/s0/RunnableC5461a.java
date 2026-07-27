package sg.bigo.ads.s0;

/* renamed from: sg.bigo.ads.s0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5461a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f13284a;
    public final /* synthetic */ sg.bigo.ads.U.c b;
    public final /* synthetic */ String c;

    public RunnableC5461a(z zVar, sg.bigo.ads.U.c cVar, String str) {
        this.f13284a = zVar;
        this.b = cVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar = this.f13284a;
        sg.bigo.ads.U.c cVar = this.b;
        zVar.a(cVar.f12561a, new y(2, cVar.b, 0L, cVar.c, this.c, cVar.d, cVar.e, cVar.f));
    }
}
