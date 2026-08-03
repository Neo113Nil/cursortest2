package V1;

/* loaded from: classes.dex */
public final class l implements V1.w {

    /* renamed from: a, reason: collision with root package name */
    public byte f1770a;

    /* renamed from: b, reason: collision with root package name */
    public final V1.q f1771b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.zip.Inflater f1772c;

    /* renamed from: d, reason: collision with root package name */
    public final V1.m f1773d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.zip.CRC32 f1774e;

    public l(V1.w source) {
        kotlin.jvm.internal.i.e(source, "source");
        V1.q qVar = new V1.q(source);
        this.f1771b = qVar;
        java.util.zip.Inflater inflater = new java.util.zip.Inflater(true);
        this.f1772c = inflater;
        this.f1773d = new V1.m(qVar, inflater);
        this.f1774e = new java.util.zip.CRC32();
    }

    public static void a(java.lang.String str, int i2, int i3) {
        if (i3 != i2) {
            throw new java.io.IOException(java.lang.String.format("%s: actual 0x%08x != expected 0x%08x", java.util.Arrays.copyOf(new java.lang.Object[]{str, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i2)}, 3)));
        }
    }

    public final void b(V1.g gVar, long j2, long j3) {
        V1.r rVar = gVar.f1763a;
        kotlin.jvm.internal.i.b(rVar);
        while (true) {
            int i2 = rVar.f1789c;
            int i3 = rVar.f1788b;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= i2 - i3;
            rVar = rVar.f1792f;
            kotlin.jvm.internal.i.b(rVar);
        }
        while (j3 > 0) {
            int min = (int) java.lang.Math.min(rVar.f1789c - r6, j3);
            this.f1774e.update(rVar.f1787a, (int) (rVar.f1788b + j2), min);
            j3 -= min;
            rVar = rVar.f1792f;
            kotlin.jvm.internal.i.b(rVar);
            j2 = 0;
        }
    }

    @Override // V1.w
    public final long c(V1.g sink, long j2) {
        V1.q qVar;
        V1.g gVar;
        long j3;
        kotlin.jvm.internal.i.e(sink, "sink");
        byte b2 = this.f1770a;
        java.util.zip.CRC32 crc32 = this.f1774e;
        V1.q qVar2 = this.f1771b;
        if (b2 == 0) {
            qVar2.q(10L);
            V1.g gVar2 = qVar2.f1785b;
            byte b3 = gVar2.b(3L);
            boolean z2 = ((b3 >> 1) & 1) == 1;
            if (z2) {
                b(gVar2, 0L, 10L);
            }
            a("ID1ID2", 8075, qVar2.n());
            qVar2.r(8L);
            if (((b3 >> 2) & 1) == 1) {
                qVar2.q(2L);
                if (z2) {
                    b(gVar2, 0L, 2L);
                }
                short m2 = gVar2.m();
                long j4 = ((short) (((m2 & 255) << 8) | ((m2 & 65280) >>> 8))) & 65535;
                qVar2.q(j4);
                if (z2) {
                    b(gVar2, 0L, j4);
                    j3 = j4;
                } else {
                    j3 = j4;
                }
                qVar2.r(j3);
            }
            if (((b3 >> 3) & 1) == 1) {
                gVar = gVar2;
                long b4 = qVar2.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b4 == -1) {
                    throw new java.io.EOFException();
                }
                if (z2) {
                    qVar = qVar2;
                    b(gVar, 0L, b4 + 1);
                } else {
                    qVar = qVar2;
                }
                qVar.r(b4 + 1);
            } else {
                qVar = qVar2;
                gVar = gVar2;
            }
            if (((b3 >> 4) & 1) == 1) {
                long b5 = qVar.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b5 == -1) {
                    throw new java.io.EOFException();
                }
                if (z2) {
                    b(gVar, 0L, b5 + 1);
                }
                qVar.r(b5 + 1);
            }
            if (z2) {
                qVar.q(2L);
                short m3 = gVar.m();
                a("FHCRC", (short) (((m3 & 255) << 8) | ((m3 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f1770a = (byte) 1;
        } else {
            qVar = qVar2;
        }
        if (this.f1770a == 1) {
            long j5 = sink.f1764b;
            long c2 = this.f1773d.c(sink, 8192L);
            if (c2 != -1) {
                b(sink, j5, c2);
                return c2;
            }
            this.f1770a = (byte) 2;
        }
        if (this.f1770a != 2) {
            return -1L;
        }
        a("CRC", qVar.m(), (int) crc32.getValue());
        a("ISIZE", qVar.m(), (int) this.f1772c.getBytesWritten());
        this.f1770a = (byte) 3;
        if (qVar.a()) {
            return -1L;
        }
        throw new java.io.IOException("gzip finished without exhausting source");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1773d.close();
    }

    @Override // V1.w
    public final V1.y d() {
        return this.f1771b.f1784a.d();
    }
}
