package sg.bigo.ads.m;

/* renamed from: sg.bigo.ads.m.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5324c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5325d f13076a;

    public RunnableC5324c(AbstractC5325d abstractC5325d) {
        this.f13076a = abstractC5325d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC5325d abstractC5325d = this.f13076a;
        sg.bigo.ads.q.o oVar = abstractC5325d.m;
        if (oVar != null) {
            oVar.a(abstractC5325d.k, 1);
        }
    }
}
