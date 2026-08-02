package U;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5842n;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5842n) {
            case 0:
                int i = this.f5841m;
                this.f5841m = i + 2;
                Object[] objArr = this.f5839k;
                return new a(0, objArr[i], objArr[i + 1]);
            case 1:
                int i5 = this.f5841m;
                this.f5841m = i5 + 2;
                return this.f5839k[i5];
            default:
                int i6 = this.f5841m;
                this.f5841m = i6 + 2;
                return this.f5839k[i6 + 1];
        }
    }
}
