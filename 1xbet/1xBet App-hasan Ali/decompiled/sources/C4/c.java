package C4;

import A.v;
import L4.C0226i;
import L4.G;
import L4.p;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class c extends p {

    /* renamed from: l, reason: collision with root package name */
    public final long f853l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f854m;

    /* renamed from: n, reason: collision with root package name */
    public long f855n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f856o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f857p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v vVar, G g5, long j5) {
        super(g5);
        kotlin.jvm.internal.l.f("delegate", g5);
        this.f857p = vVar;
        this.f853l = j5;
    }

    @Override // L4.p, L4.G
    public final void D(C0226i c0226i, long j5) {
        kotlin.jvm.internal.l.f("source", c0226i);
        if (this.f856o) {
            throw new IllegalStateException("closed");
        }
        long j6 = this.f853l;
        if (j6 == -1 || this.f855n + j5 <= j6) {
            try {
                super.D(c0226i, j5);
                this.f855n += j5;
                return;
            } catch (IOException e3) {
                throw b(e3);
            }
        }
        throw new ProtocolException("expected " + j6 + " bytes but received " + (this.f855n + j5));
    }

    public final IOException b(IOException iOException) {
        if (this.f854m) {
            return iOException;
        }
        this.f854m = true;
        return this.f857p.a(false, true, iOException);
    }

    @Override // L4.p, L4.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f856o) {
            return;
        }
        this.f856o = true;
        long j5 = this.f853l;
        if (j5 != -1 && this.f855n != j5) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            b(null);
        } catch (IOException e3) {
            throw b(e3);
        }
    }

    @Override // L4.p, L4.G, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e3) {
            throw b(e3);
        }
    }
}
