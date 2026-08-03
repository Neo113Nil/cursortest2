package y1;

/* loaded from: classes.dex */
public final class b implements java.util.Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f8487a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f8488b;

    /* renamed from: c, reason: collision with root package name */
    public int f8489c;

    /* renamed from: d, reason: collision with root package name */
    public v1.C1002c f8490d;

    /* renamed from: e, reason: collision with root package name */
    public int f8491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y1.c f8492f;

    public b(y1.c cVar) {
        this.f8492f = cVar;
        int i2 = cVar.f8494b;
        int length = cVar.f8493a.length();
        if (length < 0) {
            throw new java.lang.IllegalArgumentException(B1.a.g(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > length) {
            i2 = length;
        }
        this.f8488b = i2;
        this.f8489c = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i2 = this.f8489c;
        if (i2 < 0) {
            this.f8487a = 0;
            this.f8490d = null;
            return;
        }
        y1.c cVar = this.f8492f;
        int i3 = cVar.f8495c;
        java.lang.String str = cVar.f8493a;
        if (i3 > 0) {
            int i4 = this.f8491e + 1;
            this.f8491e = i4;
        }
        if (i2 <= str.length()) {
            h1.C0172d c0172d = (h1.C0172d) cVar.f8496d.invoke(str, java.lang.Integer.valueOf(this.f8489c));
            if (c0172d == null) {
                this.f8490d = new v1.C1002c(this.f8488b, y1.g.O(str), 1);
                this.f8489c = -1;
            } else {
                int intValue = ((java.lang.Number) c0172d.f3295a).intValue();
                int intValue2 = ((java.lang.Number) c0172d.f3296b).intValue();
                this.f8490d = u0.AbstractC0995a.F(this.f8488b, intValue);
                int i5 = intValue + intValue2;
                this.f8488b = i5;
                this.f8489c = i5 + (intValue2 == 0 ? 1 : 0);
            }
            this.f8487a = 1;
        }
        this.f8490d = new v1.C1002c(this.f8488b, y1.g.O(str), 1);
        this.f8489c = -1;
        this.f8487a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8487a == -1) {
            a();
        }
        return this.f8487a == 1;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.f8487a == -1) {
            a();
        }
        if (this.f8487a == 0) {
            throw new java.util.NoSuchElementException();
        }
        v1.C1002c c1002c = this.f8490d;
        kotlin.jvm.internal.i.c(c1002c, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f8490d = null;
        this.f8487a = -1;
        return c1002c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
