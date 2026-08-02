package v1;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: k, reason: collision with root package name */
    public final int f20354k;

    /* renamed from: l, reason: collision with root package name */
    public int f20355l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f20356m = -1;

    public o(int i) {
        this.f20354k = i;
    }

    @Override // v1.n
    public final boolean b(CharSequence charSequence, int i, int i5, v vVar) {
        int i6 = this.f20354k;
        if (i > i6 || i6 >= i5) {
            return i5 <= i6;
        }
        this.f20355l = i;
        this.f20356m = i5;
        return false;
    }

    @Override // v1.n
    public final Object a() {
        return this;
    }
}
