package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.text.Typography;

/* compiled from: RealBufferedSource.java */
/* loaded from: classes6.dex */
final class n implements e {

    /* renamed from: a, reason: collision with root package name */
    public final c f9972a = new c();
    public final s b;
    boolean c;

    n(s sVar) {
        if (sVar == null) {
            throw new NullPointerException("source == null");
        }
        this.b = sVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.e, com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this.f9972a;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j) throws IOException {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        c cVar2 = this.f9972a;
        if (cVar2.b == 0 && this.b.b(cVar2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.f9972a.b(cVar, Math.min(j, this.f9972a.b));
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte[] c(long j) throws IOException {
        e(j);
        return this.f9972a.c(j);
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.f9972a.k();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String d(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long a2 = a((byte) 10, 0L, j2);
        if (a2 != -1) {
            return this.f9972a.h(a2);
        }
        if (j2 < Long.MAX_VALUE && f(j2) && this.f9972a.f(j2 - 1) == 13 && f(1 + j2) && this.f9972a.f(j2) == 10) {
            return this.f9972a.h(j2);
        }
        c cVar = new c();
        c cVar2 = this.f9972a;
        cVar2.a(cVar, 0L, Math.min(32L, cVar2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f9972a.size(), j) + " content=" + cVar.o().g() + Typography.ellipsis);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void e(long j) throws IOException {
        if (!f(j)) {
            throw new EOFException();
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean f() throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        return this.f9972a.f() && this.b.b(this.f9972a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short g() throws IOException {
        e(2L);
        return this.f9972a.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r2)));
     */
    @Override // com.mbridge.msdk.thrid.okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long i() throws IOException {
        e(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!f(i2)) {
                break;
            }
            byte f = this.f9972a.f(i);
            if ((f < 48 || f > 57) && ((f < 97 || f > 102) && (f < 65 || f > 70))) {
                break;
            }
            i = i2;
        }
        return this.f9972a.i();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public InputStream j() {
        return new a();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        c cVar = this.f9972a;
        if (cVar.b == 0 && this.b.b(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f9972a.read(byteBuffer);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte readByte() throws IOException {
        e(1L);
        return this.f9972a.readByte();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void readFully(byte[] bArr) throws IOException {
        try {
            e(bArr.length);
            this.f9972a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                c cVar = this.f9972a;
                long j = cVar.b;
                if (j <= 0) {
                    throw e;
                }
                int read = cVar.read(bArr, i, (int) j);
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int readInt() throws IOException {
        e(4L);
        return this.f9972a.readInt();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short readShort() throws IOException {
        e(2L);
        return this.f9972a.readShort();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void skip(long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            c cVar = this.f9972a;
            if (cVar.b == 0 && this.b.b(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f9972a.size());
            this.f9972a.skip(min);
            j -= min;
        }
    }

    public String toString() {
        return "buffer(" + this.b + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String a(Charset charset) throws IOException {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.f9972a.a(this.b);
        return this.f9972a.a(charset);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int e() throws IOException {
        e(4L);
        return this.f9972a.e();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String c() throws IOException {
        return d(Long.MAX_VALUE);
    }

    public boolean f(long j) throws IOException {
        c cVar;
        if (j >= 0) {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            do {
                cVar = this.f9972a;
                if (cVar.b >= j) {
                    return true;
                }
            } while (this.b.b(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
            return false;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long a(byte b) throws IOException {
        return a(b, 0L, Long.MAX_VALUE);
    }

    public long a(byte b, long j, long j2) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        }
        while (j < j2) {
            long a2 = this.f9972a.a(b, j, j2);
            if (a2 == -1) {
                c cVar = this.f9972a;
                long j3 = cVar.b;
                if (j3 >= j2 || this.b.b(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    break;
                }
                j = Math.max(j, j3);
            } else {
                return a2;
            }
        }
        return -1L;
    }

    /* compiled from: RealBufferedSource.java */
    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            n nVar = n.this;
            if (nVar.c) {
                throw new IOException("closed");
            }
            return (int) Math.min(nVar.f9972a.b, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            n.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            n nVar = n.this;
            if (nVar.c) {
                throw new IOException("closed");
            }
            c cVar = nVar.f9972a;
            if (cVar.b == 0 && nVar.b.b(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return n.this.f9972a.readByte() & 255;
        }

        public String toString() {
            return n.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!n.this.c) {
                u.a(bArr.length, i, i2);
                n nVar = n.this;
                c cVar = nVar.f9972a;
                if (cVar.b == 0 && nVar.b.b(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return n.this.f9972a.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public f b(long j) throws IOException {
        e(j);
        return this.f9972a.b(j);
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.b.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean a(long j, f fVar) throws IOException {
        return a(j, fVar, 0, fVar.j());
    }

    public boolean a(long j, f fVar, int i, int i2) throws IOException {
        if (!this.c) {
            if (j < 0 || i < 0 || i2 < 0 || fVar.j() - i < i2) {
                return false;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = i3 + j;
                if (!f(1 + j2) || this.f9972a.f(j2) != fVar.a(i + i3)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }
}
