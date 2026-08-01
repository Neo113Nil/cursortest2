package sg.bigo.ads.n;

/* renamed from: sg.bigo.ads.n.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5392n0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f13181a;
    public final /* synthetic */ float b;
    public final /* synthetic */ C5401s0 c;

    public RunnableC5392n0(C5401s0 c5401s0, float f, float f2) {
        this.c = c5401s0;
        this.f13181a = f;
        this.b = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5401s0.a(this.c, (int) this.f13181a, (int) this.b);
    }
}
