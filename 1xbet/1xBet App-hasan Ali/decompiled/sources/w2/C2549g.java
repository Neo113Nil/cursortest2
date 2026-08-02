package w2;

import L4.C0226i;
import L4.G;
import L4.p;
import java.io.IOException;

/* renamed from: w2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2549g extends p {

    /* renamed from: l, reason: collision with root package name */
    public final O0.e f20524l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20525m;

    public C2549g(G g5, O0.e eVar) {
        super(g5);
        this.f20524l = eVar;
    }

    @Override // L4.p, L4.G
    public final void D(C0226i c0226i, long j5) {
        if (this.f20525m) {
            c0226i.J(j5);
            return;
        }
        try {
            super.D(c0226i, j5);
        } catch (IOException e3) {
            this.f20525m = true;
            this.f20524l.c(e3);
        }
    }

    @Override // L4.p, L4.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e3) {
            this.f20525m = true;
            this.f20524l.c(e3);
        }
    }

    @Override // L4.p, L4.G, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e3) {
            this.f20525m = true;
            this.f20524l.c(e3);
        }
    }
}
