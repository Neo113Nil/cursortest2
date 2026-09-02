package o1;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class v implements s1.s {

    /* renamed from: a, reason: collision with root package name */
    public final s1.e f6354a = new s1.e();

    /* renamed from: b, reason: collision with root package name */
    public final s1.e f6355b = new s1.e();

    /* renamed from: c, reason: collision with root package name */
    public final long f6356c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6357d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f6359f;

    public v(w wVar, long j2) {
        this.f6359f = wVar;
        this.f6356c = j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        r12.f6359f.f6368i.n();
     */
    @Override // s1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(s1.e eVar, long j2) {
        int i2;
        long c2;
        while (true) {
            synchronized (this.f6359f) {
                try {
                    this.f6359f.f6368i.i();
                    try {
                        w wVar = this.f6359f;
                        i2 = wVar.f6370k;
                        if (i2 == 0) {
                            i2 = 0;
                        }
                        if (this.f6357d) {
                            throw new IOException("stream closed");
                        }
                        if (!wVar.f6364e.isEmpty()) {
                            this.f6359f.getClass();
                        }
                        s1.e eVar2 = this.f6355b;
                        long j3 = eVar2.f6618b;
                        if (j3 > 0) {
                            c2 = eVar2.c(eVar, Math.min(8192L, j3));
                            w wVar2 = this.f6359f;
                            long j4 = wVar2.f6360a + c2;
                            wVar2.f6360a = j4;
                            if (i2 == 0 && j4 >= wVar2.f6363d.f6332n.a() / 2) {
                                w wVar3 = this.f6359f;
                                wVar3.f6363d.p(wVar3.f6362c, wVar3.f6360a);
                                this.f6359f.f6360a = 0L;
                            }
                        } else {
                            if (this.f6358e || i2 != 0) {
                                break;
                            }
                            this.f6359f.i();
                            this.f6359f.f6368i.n();
                        }
                    } finally {
                        this.f6359f.f6368i.n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c2 != -1) {
                this.f6359f.f6363d.m(c2);
                return c2;
            }
            if (i2 == 0) {
                return -1L;
            }
            throw new A(i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        synchronized (this.f6359f) {
            try {
                this.f6357d = true;
                s1.e eVar = this.f6355b;
                j2 = eVar.f6618b;
                try {
                    eVar.q(j2);
                    if (!this.f6359f.f6364e.isEmpty()) {
                        this.f6359f.getClass();
                    }
                    this.f6359f.notifyAll();
                } catch (EOFException e2) {
                    throw new AssertionError(e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j2 > 0) {
            this.f6359f.f6363d.m(j2);
        }
        this.f6359f.a();
    }

    @Override // s1.s
    public final s1.u d() {
        return this.f6359f.f6368i;
    }
}
