package s1;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    public final e f6635a = new e();

    /* renamed from: b, reason: collision with root package name */
    public final r f6636b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6637c;

    public m(r rVar) {
        this.f6636b = rVar;
    }

    public final f a() {
        if (this.f6637c) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f6635a;
        long j2 = eVar.f6618b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            o oVar = eVar.f6617a.f6647g;
            if (oVar.f6643c < 8192 && oVar.f6645e) {
                j2 -= r6 - oVar.f6642b;
            }
        }
        if (j2 > 0) {
            this.f6636b.e(eVar, j2);
        }
        return this;
    }

    public final f b(byte[] bArr) {
        if (this.f6637c) {
            throw new IllegalStateException("closed");
        }
        this.f6635a.s(bArr.length, bArr);
        a();
        return this;
    }

    @Override // s1.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r rVar = this.f6636b;
        if (this.f6637c) {
            return;
        }
        try {
            e eVar = this.f6635a;
            long j2 = eVar.f6618b;
            if (j2 > 0) {
                rVar.e(eVar, j2);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            rVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f6637c = true;
        if (th == null) {
            return;
        }
        Charset charset = v.f6657a;
        throw th;
    }

    @Override // s1.r
    public final u d() {
        return this.f6636b.d();
    }

    @Override // s1.r
    public final void e(e eVar, long j2) {
        if (this.f6637c) {
            throw new IllegalStateException("closed");
        }
        this.f6635a.e(eVar, j2);
        a();
    }

    @Override // s1.r, java.io.Flushable
    public final void flush() {
        if (this.f6637c) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f6635a;
        long j2 = eVar.f6618b;
        r rVar = this.f6636b;
        if (j2 > 0) {
            rVar.e(eVar, j2);
        }
        rVar.flush();
    }

    public final f g(int i2) {
        if (this.f6637c) {
            throw new IllegalStateException("closed");
        }
        this.f6635a.t(i2);
        a();
        return this;
    }

    @Override // s1.f
    public final f h(String str) {
        if (this.f6637c) {
            throw new IllegalStateException("closed");
        }
        this.f6635a.v(str, 0, str.length());
        a();
        return this;
    }

    public final f i(int i2) {
        if (this.f6637c) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f6635a;
        o r2 = eVar.r(4);
        int i3 = r2.f6643c;
        byte b2 = (byte) ((i2 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = r2.f6641a;
        bArr[i3] = b2;
        bArr[i3 + 1] = (byte) ((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i3 + 2] = (byte) ((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i3 + 3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        r2.f6643c = i3 + 4;
        eVar.f6618b += 4;
        a();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f6637c;
    }

    public final String toString() {
        return "buffer(" + this.f6636b + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f6637c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f6635a.write(byteBuffer);
        a();
        return write;
    }
}
