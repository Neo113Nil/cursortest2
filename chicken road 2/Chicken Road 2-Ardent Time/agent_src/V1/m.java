package V1;

/* loaded from: classes.dex */
public final class m implements V1.w {

    /* renamed from: a, reason: collision with root package name */
    public final V1.q f1775a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.zip.Inflater f1776b;

    /* renamed from: c, reason: collision with root package name */
    public int f1777c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1778d;

    public m(V1.q qVar, java.util.zip.Inflater inflater) {
        this.f1775a = qVar;
        this.f1776b = inflater;
    }

    @Override // V1.w
    public final long c(V1.g sink, long j2) {
        long j3;
        kotlin.jvm.internal.i.e(sink, "sink");
        while (!this.f1778d) {
            V1.q qVar = this.f1775a;
            java.util.zip.Inflater inflater = this.f1776b;
            try {
                V1.r q2 = sink.q(1);
                int min = (int) java.lang.Math.min(8192L, 8192 - q2.f1789c);
                if (inflater.needsInput() && !qVar.a()) {
                    V1.r rVar = qVar.f1785b.f1763a;
                    kotlin.jvm.internal.i.b(rVar);
                    int i2 = rVar.f1789c;
                    int i3 = rVar.f1788b;
                    int i4 = i2 - i3;
                    this.f1777c = i4;
                    inflater.setInput(rVar.f1787a, i3, i4);
                }
                int inflate = inflater.inflate(q2.f1787a, q2.f1789c, min);
                int i5 = this.f1777c;
                if (i5 != 0) {
                    int remaining = i5 - inflater.getRemaining();
                    this.f1777c -= remaining;
                    qVar.r(remaining);
                }
                if (inflate > 0) {
                    q2.f1789c += inflate;
                    j3 = inflate;
                    sink.f1764b += j3;
                } else {
                    if (q2.f1788b == q2.f1789c) {
                        sink.f1763a = q2.a();
                        V1.s.a(q2);
                    }
                    j3 = 0;
                }
                if (j3 > 0) {
                    return j3;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (qVar.a()) {
                    throw new java.io.EOFException("source exhausted prematurely");
                }
            } catch (java.util.zip.DataFormatException e2) {
                throw new java.io.IOException(e2);
            }
        }
        throw new java.lang.IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1778d) {
            return;
        }
        this.f1776b.end();
        this.f1778d = true;
        this.f1775a.close();
    }

    @Override // V1.w
    public final V1.y d() {
        return this.f1775a.f1784a.d();
    }
}
