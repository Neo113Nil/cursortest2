package Td;

import Td.p;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* renamed from: Td.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4045a implements p {

    /* renamed from: Td.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0542a<BuilderType extends AbstractC0542a> implements p.a {
        @Override // Td.p.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public abstract BuilderType q1(d dVar, f fVar) throws IOException;

        /* renamed from: Td.a$a$a, reason: collision with other inner class name */
        static final class C0543a extends FilterInputStream {

            /* renamed from: a, reason: collision with root package name */
            private int f27044a;

            C0543a(ByteArrayInputStream byteArrayInputStream, int i11) {
                super(byteArrayInputStream);
                this.f27044a = i11;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() throws IOException {
                return Math.min(super.available(), this.f27044a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.f27044a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f27044a--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j11) throws IOException {
                long skip = super.skip(Math.min(j11, this.f27044a));
                if (skip >= 0) {
                    this.f27044a = (int) (this.f27044a - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i11, int i12) throws IOException {
                int i13 = this.f27044a;
                if (i13 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i11, Math.min(i12, i13));
                if (read >= 0) {
                    this.f27044a -= read;
                }
                return read;
            }
        }
    }
}
