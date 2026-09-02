package i1;

/* renamed from: i1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185d extends i1.AbstractC0186e implements java.util.RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final i1.AbstractC0186e f3313a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3314b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3315c;

    public C0185d(i1.AbstractC0186e list, int i2, int i3) {
        kotlin.jvm.internal.i.e(list, "list");
        this.f3313a = list;
        this.f3314b = i2;
        Q1.l.d(i2, i3, list.a());
        this.f3315c = i3 - i2;
    }

    @Override // i1.AbstractC0186e
    public final int a() {
        return this.f3315c;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i2) {
        int i3 = this.f3315c;
        if (i2 < 0 || i2 >= i3) {
            throw new java.lang.IndexOutOfBoundsException(B1.a.h("index: ", i2, i3, ", size: "));
        }
        return this.f3313a.get(this.f3314b + i2);
    }

    @Override // i1.AbstractC0186e, java.util.List
    public final java.util.List subList(int i2, int i3) {
        Q1.l.d(i2, i3, this.f3315c);
        int i4 = this.f3314b;
        return new i1.C0185d(this.f3313a, i2 + i4, i4 + i3);
    }
}
