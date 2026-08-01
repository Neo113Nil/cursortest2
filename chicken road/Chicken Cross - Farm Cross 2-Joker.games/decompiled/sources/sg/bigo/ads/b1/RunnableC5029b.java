package sg.bigo.ads.b1;

/* renamed from: sg.bigo.ads.b1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5029b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12695a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ AbstractC5032e d;

    public RunnableC5029b(AbstractC5032e abstractC5032e, String str, String str2, long j) {
        this.d = abstractC5032e;
        this.f12695a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC5032e abstractC5032e = this.d;
        sg.bigo.ads.Q0.n nVar = abstractC5032e.c;
        if (nVar == null || nVar.a(this.f12695a, this.b, this.c, abstractC5032e.l()).c == 0) {
            return;
        }
        this.d.m();
    }
}
