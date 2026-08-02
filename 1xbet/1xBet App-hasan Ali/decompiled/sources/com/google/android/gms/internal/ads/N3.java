package com.google.android.gms.internal.ads;

import A0.C0052p0;
import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class N3 {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f10776b = Logger.getLogger(N3.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final C0052p0 f10777a = new C0052p0(3);

    /* JADX WARN: Multi-variable type inference failed */
    public final P3 a(C1205ke c1205ke, AbstractC1690vD abstractC1690vD) {
        int b3;
        ByteBuffer byteBuffer;
        long limit;
        P3 t32;
        P3 p32;
        long d5 = c1205ke.d();
        C0052p0 c0052p0 = this.f10777a;
        ((ByteBuffer) c0052p0.get()).rewind().limit(8);
        do {
            b3 = c1205ke.b((ByteBuffer) c0052p0.get());
            byteBuffer = c1205ke.f14251k;
            if (b3 == 8) {
                ((ByteBuffer) c0052p0.get()).rewind();
                long Q5 = AbstractC1803xs.Q((ByteBuffer) c0052p0.get());
                if (Q5 < 8 && Q5 > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(Q5);
                    sb.append("). Stop parsing!");
                    f10776b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) c0052p0.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (Q5 == 1) {
                        ((ByteBuffer) c0052p0.get()).limit(16);
                        c1205ke.b((ByteBuffer) c0052p0.get());
                        ((ByteBuffer) c0052p0.get()).position(8);
                        limit = AbstractC1803xs.X((ByteBuffer) c0052p0.get()) - 16;
                    } else {
                        limit = Q5 == 0 ? byteBuffer.limit() - c1205ke.d() : Q5 - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) c0052p0.get()).limit(((ByteBuffer) c0052p0.get()).limit() + 16);
                        c1205ke.b((ByteBuffer) c0052p0.get());
                        byte[] bArr2 = new byte[16];
                        for (int position = ((ByteBuffer) c0052p0.get()).position() - 16; position < ((ByteBuffer) c0052p0.get()).position(); position++) {
                            bArr2[position - (((ByteBuffer) c0052p0.get()).position() - 16)] = ((ByteBuffer) c0052p0.get()).get(position);
                        }
                        limit -= 16;
                    }
                    long j5 = limit;
                    if (abstractC1690vD instanceof P3) {
                    }
                    if ("moov".equals(str)) {
                        t32 = new R3();
                    } else {
                        if ("mvhd".equals(str)) {
                            S3 s32 = new S3("mvhd");
                            s32.f11496x = 1.0d;
                            s32.f11497y = 1.0f;
                            s32.f11498z = C1870zD.f16562j;
                            p32 = s32;
                            ((ByteBuffer) c0052p0.get()).rewind();
                            p32.b(c1205ke, (ByteBuffer) c0052p0.get(), j5, this);
                            return p32;
                        }
                        t32 = new T3(str, 0);
                    }
                    p32 = t32;
                    ((ByteBuffer) c0052p0.get()).rewind();
                    p32.b(c1205ke, (ByteBuffer) c0052p0.get(), j5, this);
                    return p32;
                } catch (UnsupportedEncodingException e3) {
                    throw new RuntimeException(e3);
                }
            }
        } while (b3 >= 0);
        byteBuffer.position((int) d5);
        throw new EOFException();
    }
}
