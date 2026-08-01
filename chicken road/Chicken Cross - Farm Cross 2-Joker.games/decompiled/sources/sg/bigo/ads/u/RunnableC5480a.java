package sg.bigo.ads.u;

/* renamed from: sg.bigo.ads.u.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5480a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13325a;
    public final /* synthetic */ C5481b b;

    public RunnableC5480a(C5481b c5481b, int i) {
        this.b = c5481b;
        this.f13325a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5481b c5481b = this.b;
        int i = this.f13325a;
        if (i == c5481b.c && i == c5481b.d) {
            c5481b.a(i);
        }
    }
}
