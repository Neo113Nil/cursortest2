package x1;

/* loaded from: classes.dex */
public final class b implements x1.c {

    /* renamed from: a, reason: collision with root package name */
    public final x1.c f8416a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8417b;

    public b(x1.c cVar, int i2) {
        this.f8416a = cVar;
        this.f8417b = i2;
        if (i2 >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
    }

    @Override // x1.c
    public final java.util.Iterator iterator() {
        return new i1.C0183b(this);
    }
}
