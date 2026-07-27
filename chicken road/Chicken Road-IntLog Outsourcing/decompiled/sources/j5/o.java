package j5;

import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class o implements u {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f10513a;

    /* renamed from: b, reason: collision with root package name */
    public final y f10514b;

    public o(FileOutputStream out, y yVar) {
        kotlin.jvm.internal.i.e(out, "out");
        this.f10513a = out;
        this.f10514b = yVar;
    }

    @Override // j5.u
    public final void B(f fVar, long j2) {
        b.d(fVar.f10495b, 0L, j2);
        while (j2 > 0) {
            this.f10514b.f();
            r rVar = fVar.f10494a;
            kotlin.jvm.internal.i.b(rVar);
            int min = (int) Math.min(j2, rVar.f10523c - rVar.f10522b);
            this.f10513a.write(rVar.f10521a, rVar.f10522b, min);
            int i2 = rVar.f10522b + min;
            rVar.f10522b = i2;
            long j6 = min;
            j2 -= j6;
            fVar.f10495b -= j6;
            if (i2 == rVar.f10523c) {
                fVar.f10494a = rVar.a();
                s.a(rVar);
            }
        }
    }

    @Override // j5.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10513a.close();
    }

    @Override // j5.u
    public final y d() {
        return this.f10514b;
    }

    @Override // j5.u, java.io.Flushable
    public final void flush() {
        this.f10513a.flush();
    }

    public final String toString() {
        return "sink(" + this.f10513a + ')';
    }
}
