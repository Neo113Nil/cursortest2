package s1;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class j implements s {

    /* renamed from: b, reason: collision with root package name */
    public final n f6626b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f6627c;

    /* renamed from: d, reason: collision with root package name */
    public final k f6628d;

    /* renamed from: a, reason: collision with root package name */
    public int f6625a = 0;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f6629e = new CRC32();

    public j(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f6627c = inflater;
        Logger logger = l.f6634a;
        n nVar = new n(sVar);
        this.f6626b = nVar;
        this.f6628d = new k(nVar, inflater);
    }

    public static void a(String str, int i2, int i3) {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public final void b(e eVar, long j2, long j3) {
        o oVar = eVar.f6617a;
        while (true) {
            int i2 = oVar.f6643c;
            int i3 = oVar.f6642b;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= i2 - i3;
            oVar = oVar.f6646f;
        }
        while (j3 > 0) {
            int min = (int) Math.min(oVar.f6643c - r6, j3);
            this.f6629e.update(oVar.f6641a, (int) (oVar.f6642b + j2), min);
            j3 -= min;
            oVar = oVar.f6646f;
            j2 = 0;
        }
    }

    @Override // s1.s
    public final long c(e eVar, long j2) {
        n nVar;
        e eVar2;
        long j3;
        int i2 = this.f6625a;
        CRC32 crc32 = this.f6629e;
        n nVar2 = this.f6626b;
        if (i2 == 0) {
            nVar2.o(10L);
            e eVar3 = nVar2.f6638a;
            byte b2 = eVar3.b(3L);
            boolean z2 = ((b2 >> 1) & 1) == 1;
            if (z2) {
                eVar2 = eVar3;
                b(eVar3, 0L, 10L);
            } else {
                eVar2 = eVar3;
            }
            a("ID1ID2", 8075, nVar2.l());
            nVar2.p(8L);
            if (((b2 >> 2) & 1) == 1) {
                nVar2.o(2L);
                if (z2) {
                    b(eVar2, 0L, 2L);
                }
                short m2 = eVar2.m();
                Charset charset = v.f6657a;
                long j4 = (short) (((m2 & 255) << 8) | ((m2 & 65280) >>> 8));
                nVar2.o(j4);
                if (z2) {
                    b(eVar2, 0L, j4);
                    j3 = j4;
                } else {
                    j3 = j4;
                }
                nVar2.p(j3);
            }
            if (((b2 >> 3) & 1) == 1) {
                long b3 = nVar2.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b3 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    nVar = nVar2;
                    b(eVar2, 0L, b3 + 1);
                } else {
                    nVar = nVar2;
                }
                nVar.p(b3 + 1);
            } else {
                nVar = nVar2;
            }
            if (((b2 >> 4) & 1) == 1) {
                long b4 = nVar.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b4 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    b(eVar2, 0L, b4 + 1);
                }
                nVar.p(b4 + 1);
            }
            if (z2) {
                nVar.o(2L);
                short m3 = eVar2.m();
                Charset charset2 = v.f6657a;
                a("FHCRC", (short) (((m3 & 255) << 8) | ((m3 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f6625a = 1;
        } else {
            nVar = nVar2;
        }
        if (this.f6625a == 1) {
            long j5 = eVar.f6618b;
            long c2 = this.f6628d.c(eVar, 8192L);
            if (c2 != -1) {
                b(eVar, j5, c2);
                return c2;
            }
            this.f6625a = 2;
        }
        if (this.f6625a == 2) {
            nVar.o(4L);
            e eVar4 = nVar.f6638a;
            int l2 = eVar4.l();
            Charset charset3 = v.f6657a;
            a("CRC", ((l2 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | ((l2 & (-16777216)) >>> 24) | ((l2 & 16711680) >>> 8) | ((l2 & 65280) << 8), (int) crc32.getValue());
            nVar.o(4L);
            int l3 = eVar4.l();
            a("ISIZE", ((l3 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | ((l3 & (-16777216)) >>> 24) | ((l3 & 16711680) >>> 8) | ((l3 & 65280) << 8), (int) this.f6627c.getBytesWritten());
            this.f6625a = 3;
            if (!nVar.a()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6628d.close();
    }

    @Override // s1.s
    public final u d() {
        return this.f6626b.f6639b.d();
    }
}
