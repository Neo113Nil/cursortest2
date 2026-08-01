package sg.bigo.ads.y;

/* renamed from: sg.bigo.ads.y.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5512d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f13410a;

    public RunnableC5512d(i iVar) {
        this.f13410a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13410a.l.post(new RunnableC5511c(this));
    }
}
