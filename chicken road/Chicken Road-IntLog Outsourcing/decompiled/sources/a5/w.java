package a5;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class w implements j5.w {

    /* renamed from: a, reason: collision with root package name */
    public final j5.q f4021a;

    /* renamed from: b, reason: collision with root package name */
    public int f4022b;

    /* renamed from: c, reason: collision with root package name */
    public int f4023c;

    /* renamed from: d, reason: collision with root package name */
    public int f4024d;

    /* renamed from: e, reason: collision with root package name */
    public int f4025e;

    /* renamed from: f, reason: collision with root package name */
    public int f4026f;

    public w(j5.q source) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f4021a = source;
    }

    @Override // j5.w
    public final j5.y d() {
        return this.f4021a.f10518a.d();
    }

    @Override // j5.w
    public final long s(j5.f sink, long j2) {
        int i2;
        int o2;
        kotlin.jvm.internal.i.e(sink, "sink");
        do {
            int i3 = this.f4025e;
            j5.q qVar = this.f4021a;
            if (i3 != 0) {
                long s2 = qVar.s(sink, Math.min(8192L, i3));
                if (s2 == -1) {
                    return -1L;
                }
                this.f4025e -= (int) s2;
                return s2;
            }
            qVar.C(this.f4026f);
            this.f4026f = 0;
            if ((this.f4023c & 4) != 0) {
                return -1L;
            }
            i2 = this.f4024d;
            int l2 = U4.c.l(qVar);
            this.f4025e = l2;
            this.f4022b = l2;
            int c2 = qVar.c() & 255;
            this.f4023c = qVar.c() & 255;
            Logger logger = x.f4027d;
            if (logger.isLoggable(Level.FINE)) {
                j5.i iVar = h.f3953a;
                logger.fine(h.b(true, this.f4024d, this.f4022b, c2, this.f4023c));
            }
            o2 = qVar.o() & Integer.MAX_VALUE;
            this.f4024d = o2;
            if (c2 != 9) {
                throw new IOException(c2 + " != TYPE_CONTINUATION");
            }
        } while (o2 == i2);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
