package V1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1787a;

    /* renamed from: b, reason: collision with root package name */
    public int f1788b;

    /* renamed from: c, reason: collision with root package name */
    public int f1789c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1790d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1791e;

    /* renamed from: f, reason: collision with root package name */
    public V1.r f1792f;

    /* renamed from: g, reason: collision with root package name */
    public V1.r f1793g;

    public r() {
        this.f1787a = new byte[8192];
        this.f1791e = true;
        this.f1790d = false;
    }

    public final V1.r a() {
        V1.r rVar = this.f1792f;
        if (rVar == this) {
            rVar = null;
        }
        V1.r rVar2 = this.f1793g;
        kotlin.jvm.internal.i.b(rVar2);
        rVar2.f1792f = this.f1792f;
        V1.r rVar3 = this.f1792f;
        kotlin.jvm.internal.i.b(rVar3);
        rVar3.f1793g = this.f1793g;
        this.f1792f = null;
        this.f1793g = null;
        return rVar;
    }

    public final void b(V1.r segment) {
        kotlin.jvm.internal.i.e(segment, "segment");
        segment.f1793g = this;
        segment.f1792f = this.f1792f;
        V1.r rVar = this.f1792f;
        kotlin.jvm.internal.i.b(rVar);
        rVar.f1793g = segment;
        this.f1792f = segment;
    }

    public final V1.r c() {
        this.f1790d = true;
        return new V1.r(this.f1787a, this.f1788b, this.f1789c, true);
    }

    public final void d(V1.r sink, int i2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (!sink.f1791e) {
            throw new java.lang.IllegalStateException("only owner can write");
        }
        int i3 = sink.f1789c;
        int i4 = i3 + i2;
        byte[] bArr = sink.f1787a;
        if (i4 > 8192) {
            if (sink.f1790d) {
                throw new java.lang.IllegalArgumentException();
            }
            int i5 = sink.f1788b;
            if (i4 - i5 > 8192) {
                throw new java.lang.IllegalArgumentException();
            }
            i1.AbstractC0189h.K(0, i5, i3, bArr, bArr);
            sink.f1789c -= sink.f1788b;
            sink.f1788b = 0;
        }
        int i6 = sink.f1789c;
        int i7 = this.f1788b;
        i1.AbstractC0189h.K(i6, i7, i7 + i2, this.f1787a, bArr);
        sink.f1789c += i2;
        this.f1788b += i2;
    }

    public r(byte[] data, int i2, int i3, boolean z2) {
        kotlin.jvm.internal.i.e(data, "data");
        this.f1787a = data;
        this.f1788b = i2;
        this.f1789c = i3;
        this.f1790d = z2;
        this.f1791e = false;
    }
}
