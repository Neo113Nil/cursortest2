package C4;

import A.v;
import L4.C0226i;
import L4.I;
import L4.q;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class d extends q {

    /* renamed from: l, reason: collision with root package name */
    public final long f858l;

    /* renamed from: m, reason: collision with root package name */
    public long f859m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f860n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f861o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f862p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v f863q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v vVar, I i, long j5) {
        super(i);
        kotlin.jvm.internal.l.f("delegate", i);
        this.f863q = vVar;
        this.f858l = j5;
        this.f860n = true;
        if (j5 == 0) {
            b(null);
        }
    }

    public final IOException b(IOException iOException) {
        if (this.f861o) {
            return iOException;
        }
        this.f861o = true;
        v vVar = this.f863q;
        if (iOException == null && this.f860n) {
            this.f860n = false;
            vVar.getClass();
            kotlin.jvm.internal.l.f("call", (i) vVar.f133b);
        }
        return vVar.a(true, false, iOException);
    }

    @Override // L4.q, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f862p) {
            return;
        }
        this.f862p = true;
        try {
            super.close();
            b(null);
        } catch (IOException e3) {
            throw b(e3);
        }
    }

    @Override // L4.q, L4.I
    public final long e(C0226i c0226i, long j5) {
        kotlin.jvm.internal.l.f("sink", c0226i);
        if (this.f862p) {
            throw new IllegalStateException("closed");
        }
        try {
            long e3 = this.f3108k.e(c0226i, j5);
            if (this.f860n) {
                this.f860n = false;
                v vVar = this.f863q;
                vVar.getClass();
                kotlin.jvm.internal.l.f("call", (i) vVar.f133b);
            }
            if (e3 == -1) {
                b(null);
                return -1L;
            }
            long j6 = this.f859m + e3;
            long j7 = this.f858l;
            if (j7 == -1 || j6 <= j7) {
                this.f859m = j6;
                if (j6 == j7) {
                    b(null);
                }
                return e3;
            }
            throw new ProtocolException("expected " + j7 + " bytes but received " + j6);
        } catch (IOException e5) {
            throw b(e5);
        }
    }
}
