package sg.bigo.ads.v;

/* loaded from: classes3.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13353a;
    public final /* synthetic */ u b;

    public p(u uVar, int i) {
        this.b = uVar;
        this.f13353a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.h.setBackgroundColor(this.f13353a);
    }
}
