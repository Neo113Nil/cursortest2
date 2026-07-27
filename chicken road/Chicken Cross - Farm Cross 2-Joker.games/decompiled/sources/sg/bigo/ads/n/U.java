package sg.bigo.ads.n;

/* loaded from: classes3.dex */
public final class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U0 f13150a;

    public U(U0 u0) {
        this.f13150a = u0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13150a.C.post(new T(this));
    }
}
