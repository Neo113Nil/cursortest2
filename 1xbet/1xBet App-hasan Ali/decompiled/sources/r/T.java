package r;

/* loaded from: classes.dex */
public final class T extends X3.y {

    /* renamed from: k, reason: collision with root package name */
    public int f18966k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f18967l;

    public T(S s2) {
        this.f18967l = s2;
    }

    @Override // X3.y
    public final int a() {
        int i = this.f18966k;
        this.f18966k = i + 1;
        return this.f18967l.g(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18966k < this.f18967l.j();
    }
}
