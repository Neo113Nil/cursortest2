package n1;

import s1.i;
import s1.m;
import s1.r;
import s1.u;

/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public final i f6179a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f6181c;

    public b(g gVar) {
        this.f6181c = gVar;
        this.f6179a = new i(gVar.f6195d.f6636b.d());
    }

    @Override // s1.r, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f6180b) {
            return;
        }
        this.f6180b = true;
        this.f6181c.f6195d.h("0\r\n\r\n");
        g gVar = this.f6181c;
        i iVar = this.f6179a;
        gVar.getClass();
        u uVar = iVar.f6624e;
        iVar.f6624e = u.f6653d;
        uVar.a();
        uVar.b();
        this.f6181c.f6196e = 3;
    }

    @Override // s1.r
    public final u d() {
        return this.f6179a;
    }

    @Override // s1.r
    public final void e(s1.e eVar, long j2) {
        if (this.f6180b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        g gVar = this.f6181c;
        m mVar = gVar.f6195d;
        if (mVar.f6637c) {
            throw new IllegalStateException("closed");
        }
        mVar.f6635a.u(j2);
        mVar.a();
        m mVar2 = gVar.f6195d;
        mVar2.h("\r\n");
        mVar2.e(eVar, j2);
        mVar2.h("\r\n");
    }

    @Override // s1.r, java.io.Flushable
    public final synchronized void flush() {
        if (this.f6180b) {
            return;
        }
        this.f6181c.f6195d.flush();
    }
}
