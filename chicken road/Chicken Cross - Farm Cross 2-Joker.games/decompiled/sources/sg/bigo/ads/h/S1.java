package sg.bigo.ads.h;

/* loaded from: classes3.dex */
public final class S1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T1 f12853a;

    public S1(T1 t1) {
        this.f12853a = t1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12853a.i.setVisibility(0);
        AbstractC5140Q.a(this.f12853a.i, 200L, new R1(this));
        this.f12853a.j.F0();
        this.f12853a.j.I0();
    }
}
