package androidx.collection;

/* loaded from: classes8.dex */
public final class c0 extends kotlin.collections.Q {

    /* renamed from: a, reason: collision with root package name */
    private int f38693a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a0<Object> f38694b;

    c0(a0<Object> a0Var) {
        this.f38694b = a0Var;
    }

    @Override // kotlin.collections.Q
    public final int b() {
        int i11 = this.f38693a;
        this.f38693a = i11 + 1;
        return this.f38694b.c(i11);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38693a < this.f38694b.e();
    }
}
