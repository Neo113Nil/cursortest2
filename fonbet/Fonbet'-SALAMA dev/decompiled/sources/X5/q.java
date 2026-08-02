package X5;

import W5.AbstractC0486a1;
import W5.AbstractC0490c;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class q extends AbstractC0490c {

    /* renamed from: a, reason: collision with root package name */
    public final N6.d f7622a;

    public q(N6.d dVar) {
        this.f7622a = dVar;
    }

    @Override // W5.AbstractC0490c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        N6.d dVar = this.f7622a;
        dVar.g(dVar.f4797b);
    }

    @Override // W5.AbstractC0490c
    public final AbstractC0490c d(int i7) {
        N6.d dVar = new N6.d();
        dVar.m(this.f7622a, i7);
        return new q(dVar);
    }

    @Override // W5.AbstractC0490c
    public final void e(OutputStream outputStream, int i7) {
        long j = i7;
        N6.d dVar = this.f7622a;
        dVar.getClass();
        t6.h.e(outputStream, "out");
        p3.f.m(dVar.f4797b, 0L, j);
        N6.j jVar = dVar.f4796a;
        while (j > 0) {
            t6.h.b(jVar);
            int min = (int) Math.min(j, jVar.f4811c - jVar.f4810b);
            outputStream.write(jVar.f4809a, jVar.f4810b, min);
            int i8 = jVar.f4810b + min;
            jVar.f4810b = i8;
            long j3 = min;
            dVar.f4797b -= j3;
            j -= j3;
            if (i8 == jVar.f4811c) {
                N6.j a2 = jVar.a();
                dVar.f4796a = a2;
                N6.k.a(jVar);
                jVar = a2;
            }
        }
    }

    @Override // W5.AbstractC0490c
    public final void f(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // W5.AbstractC0490c
    public final void g(byte[] bArr, int i7, int i8) {
        while (i8 > 0) {
            int read = this.f7622a.read(bArr, i7, i8);
            if (read == -1) {
                throw new IndexOutOfBoundsException(AbstractC0486a1.f(i8, "EOF trying to read ", " bytes"));
            }
            i8 -= read;
            i7 += read;
        }
    }

    @Override // W5.AbstractC0490c
    public final int h() {
        try {
            return this.f7622a.c() & 255;
        } catch (EOFException e7) {
            throw new IndexOutOfBoundsException(e7.getMessage());
        }
    }

    @Override // W5.AbstractC0490c
    public final int i() {
        return (int) this.f7622a.f4797b;
    }

    @Override // W5.AbstractC0490c
    public final void j(int i7) {
        try {
            this.f7622a.g(i7);
        } catch (EOFException e7) {
            throw new IndexOutOfBoundsException(e7.getMessage());
        }
    }
}
