package U;

/* loaded from: classes.dex */
public final class q extends o {

    /* renamed from: n, reason: collision with root package name */
    public final h f5843n;

    public q(h hVar) {
        this.f5843n = hVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f5841m;
        this.f5841m = i + 2;
        Object[] objArr = this.f5839k;
        return new b(this.f5843n, objArr[i], objArr[i + 1]);
    }
}
