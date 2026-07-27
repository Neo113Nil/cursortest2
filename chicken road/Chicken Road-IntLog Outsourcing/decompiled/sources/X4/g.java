package X4;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class g implements j5.u {

    /* renamed from: a, reason: collision with root package name */
    public final j5.u f3555a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3556b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3557c;

    /* renamed from: d, reason: collision with root package name */
    public long f3558d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3559e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f3561g;

    public g(i iVar, j5.u delegate, long j2) {
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f3561g = iVar;
        this.f3555a = delegate;
        this.f3556b = j2;
        this.f3559e = iVar.f3569a;
    }

    @Override // j5.u
    public final void B(j5.f fVar, long j2) {
        if (this.f3560f) {
            throw new IllegalStateException("closed");
        }
        long j6 = this.f3556b;
        if (j6 != -1 && this.f3558d + j2 > j6) {
            throw new ProtocolException("expected " + j6 + " bytes but received " + (this.f3558d + j2));
        }
        try {
            if (this.f3559e) {
                this.f3559e = false;
                i iVar = this.f3561g;
                iVar.getClass();
                r call = (r) iVar.f3571c;
                kotlin.jvm.internal.i.e(call, "call");
            }
            this.f3555a.B(fVar, j2);
            this.f3558d += j2;
        } catch (IOException e3) {
            IOException b6 = b(e3);
            kotlin.jvm.internal.i.b(b6);
            throw b6;
        }
    }

    public final void a() {
        this.f3555a.close();
    }

    public final IOException b(IOException iOException) {
        if (this.f3557c) {
            return iOException;
        }
        this.f3557c = true;
        return i.a(this.f3561g, false, true, iOException, 2);
    }

    public final void c() {
        this.f3555a.flush();
    }

    @Override // j5.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3560f) {
            return;
        }
        this.f3560f = true;
        long j2 = this.f3556b;
        if (j2 != -1 && this.f3558d != j2) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            a();
            b(null);
        } catch (IOException e3) {
            IOException b6 = b(e3);
            kotlin.jvm.internal.i.b(b6);
            throw b6;
        }
    }

    @Override // j5.u
    public final j5.y d() {
        return this.f3555a.d();
    }

    @Override // j5.u, java.io.Flushable
    public final void flush() {
        try {
            c();
        } catch (IOException e3) {
            IOException b6 = b(e3);
            kotlin.jvm.internal.i.b(b6);
            throw b6;
        }
    }

    public final String toString() {
        return g.class.getSimpleName() + '(' + this.f3555a + ')';
    }
}
