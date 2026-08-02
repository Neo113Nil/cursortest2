package E4;

import C4.k;
import C4.m;
import L4.C;
import L4.C0226i;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;
import o4.AbstractC2227e;
import o4.AbstractC2234l;
import y4.n;
import y4.u;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: n, reason: collision with root package name */
    public final n f1493n;

    /* renamed from: o, reason: collision with root package name */
    public long f1494o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1495p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ m f1496q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m mVar, n nVar) {
        super(mVar);
        l.f("url", nVar);
        this.f1496q = mVar;
        this.f1493n = nVar;
        this.f1494o = -1L;
        this.f1495p = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1488l) {
            return;
        }
        if (this.f1495p) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!z4.b.g(this)) {
                ((k) this.f1496q.f910c).l();
                b();
            }
        }
        this.f1488l = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        if (r12 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
    
        if (r18.f1495p == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0078, code lost:
    
        a.AbstractC0444a.k(16);
        r2 = java.lang.Integer.toString(r4, 16);
        kotlin.jvm.internal.l.e("toString(...)", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0091, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r2));
     */
    @Override // E4.b, L4.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(C0226i c0226i, long j5) {
        C0226i c0226i2;
        long j6;
        l.f("sink", c0226i);
        long j7 = 0;
        if (j5 < 0) {
            throw new IllegalArgumentException(AbstractC2107A.r("byteCount < 0: ", j5).toString());
        }
        if (this.f1488l) {
            throw new IllegalStateException("closed");
        }
        if (this.f1495p) {
            long j8 = this.f1494o;
            m mVar = this.f1496q;
            if (j8 == 0 || j8 == -1) {
                if (j8 != -1) {
                    ((C) mVar.f911d).r(Long.MAX_VALUE);
                }
                try {
                    C c5 = (C) mVar.f911d;
                    c5.s(1L);
                    int i = 0;
                    while (true) {
                        int i5 = i + 1;
                        boolean j9 = c5.j(i5);
                        c0226i2 = c5.f3051l;
                        if (!j9) {
                            j6 = j7;
                            break;
                        }
                        j6 = j7;
                        byte m5 = c0226i2.m(i);
                        if ((m5 < 48 || m5 > 57) && ((m5 < 97 || m5 > 102) && (m5 < 65 || m5 > 70))) {
                            break;
                        }
                        i = i5;
                        j7 = j6;
                    }
                    this.f1494o = c0226i2.A();
                    String obj = AbstractC2227e.Q0(((C) mVar.f911d).r(Long.MAX_VALUE)).toString();
                    if (this.f1494o < j6 || (obj.length() > 0 && !AbstractC2234l.x0(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f1494o + obj + '\"');
                    }
                    if (this.f1494o == j6) {
                        this.f1495p = false;
                        mVar.f913g = ((a) mVar.f).f();
                        u uVar = (u) mVar.f909b;
                        l.c(uVar);
                        y4.m mVar2 = (y4.m) mVar.f913g;
                        l.c(mVar2);
                        D4.e.b(uVar.f21420t, this.f1493n, mVar2);
                        b();
                    }
                } catch (NumberFormatException e3) {
                    throw new ProtocolException(e3.getMessage());
                }
            }
            long e5 = super.e(c0226i, Math.min(j5, this.f1494o));
            if (e5 != -1) {
                this.f1494o -= e5;
                return e5;
            }
            ((k) mVar.f910c).l();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
        return -1L;
    }
}
