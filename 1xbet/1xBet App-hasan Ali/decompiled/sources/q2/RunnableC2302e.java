package q2;

/* renamed from: q2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2302e implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final C2307j f18872k;

    /* renamed from: l, reason: collision with root package name */
    public final E3.a f18873l;

    public RunnableC2302e(C2307j c2307j, E3.a aVar) {
        this.f18872k = c2307j;
        this.f18873l = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f18872k.f18881k != this) {
            return;
        }
        if (AbstractC2305h.f18879p.p(this.f18872k, this, AbstractC2305h.f(this.f18873l))) {
            AbstractC2305h.c(this.f18872k);
        }
    }
}
