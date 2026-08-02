package o1;

/* renamed from: o1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1496f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C1501k f15558a;

    /* renamed from: b, reason: collision with root package name */
    public final I3.b f15559b;

    public RunnableC1496f(C1501k c1501k, I3.b bVar) {
        this.f15558a = c1501k;
        this.f15559b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15558a.f15567a != this) {
            return;
        }
        if (AbstractC1499i.f15565f.g(this.f15558a, this, AbstractC1499i.e(this.f15559b))) {
            AbstractC1499i.b(this.f15558a);
        }
    }
}
