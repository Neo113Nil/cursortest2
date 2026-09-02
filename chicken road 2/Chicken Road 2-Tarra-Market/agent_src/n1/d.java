package n1;

import java.net.ProtocolException;
import s1.i;
import s1.r;
import s1.u;

/* loaded from: classes.dex */
public final class d implements r {

    /* renamed from: a, reason: collision with root package name */
    public final i f6186a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6187b;

    /* renamed from: c, reason: collision with root package name */
    public long f6188c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f6189d;

    public d(g gVar, long j2) {
        this.f6189d = gVar;
        this.f6186a = new i(gVar.f6195d.f6636b.d());
        this.f6188c = j2;
    }

    @Override // s1.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6187b) {
            return;
        }
        this.f6187b = true;
        if (this.f6188c > 0) {
            throw new ProtocolException("unexpected end of stream");
        }
        g gVar = this.f6189d;
        gVar.getClass();
        i iVar = this.f6186a;
        u uVar = iVar.f6624e;
        iVar.f6624e = u.f6653d;
        uVar.a();
        uVar.b();
        gVar.f6196e = 3;
    }

    @Override // s1.r
    public final u d() {
        return this.f6186a;
    }

    @Override // s1.r
    public final void e(s1.e eVar, long j2) {
        if (this.f6187b) {
            throw new IllegalStateException("closed");
        }
        long j3 = eVar.f6618b;
        byte[] bArr = j1.d.f6053a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (j2 <= this.f6188c) {
            this.f6189d.f6195d.e(eVar, j2);
            this.f6188c -= j2;
        } else {
            throw new ProtocolException("expected " + this.f6188c + " bytes but received " + j2);
        }
    }

    @Override // s1.r, java.io.Flushable
    public final void flush() {
        if (this.f6187b) {
            return;
        }
        this.f6189d.f6195d.flush();
    }
}
