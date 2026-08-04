package G4;

import A1.K0;
import U5.AbstractC0442i;
import U5.InterfaceC0444k;
import U5.b0;
import U5.c0;
import W5.AbstractC0487b;
import W5.InterfaceC0485a0;
import W5.d2;
import java.io.IOException;
import p155w1.C1017n0;

/* JADX INFO: renamed from: G4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0282o implements X, InterfaceC0485a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3013e;

    @Override // W5.InterfaceC0485a0
    public void b(p016b6.a aVar) {
        p113p3.f.q("writePayload should not be called multiple times", ((byte[]) this.f3012d) == null);
        try {
            this.f3012d = F3.g.b(aVar);
            d2 d2Var = (d2) this.f3011c;
            for (AbstractC0442i abstractC0442i : d2Var.f7182a) {
                abstractC0442i.i(0);
            }
            byte[] bArr = (byte[]) this.f3012d;
            long length = bArr.length;
            long length2 = bArr.length;
            for (AbstractC0442i abstractC0442i2 : d2Var.f7182a) {
                abstractC0442i2.j(0, length, length2);
            }
            long length3 = ((byte[]) this.f3012d).length;
            AbstractC0442i[] abstractC0442iArr = d2Var.f7182a;
            for (AbstractC0442i abstractC0442i3 : abstractC0442iArr) {
                abstractC0442i3.k(length3);
            }
            long length4 = ((byte[]) this.f3012d).length;
            for (AbstractC0442i abstractC0442i4 : abstractC0442iArr) {
                abstractC0442i4.l(length4);
            }
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // W5.InterfaceC0485a0
    public void close() {
        this.f3009a = true;
        p113p3.f.q("Lack of request message. GET request is only supported for unary requests", ((byte[]) this.f3012d) != null);
        ((X5.j) ((AbstractC0487b) this.f3013e)).f7556o.d0((b0) this.f3010b, (byte[]) this.f3012d);
        this.f3012d = null;
        this.f3010b = null;
    }

    public H2.r d() {
        return new H2.r((c0) this.f3012d, (String) this.f3013e, (p016b6.b) this.f3010b, (p016b6.b) this.f3011c, this.f3009a);
    }

    @Override // W5.InterfaceC0485a0
    public boolean isClosed() {
        return this.f3009a;
    }

    @Override // G4.X
    public void start() {
        if (((r) this.f3013e).f3020b.f2247a != -1) {
            this.f3012d = ((L4.f) this.f3010b).b(L4.e.f4356x, this.f3009a ? r.f3018d : r.f3017c, new K0(this, 5));
        }
    }

    @Override // G4.X
    public void stop() {
        C1017n0 c1017n0 = (C1017n0) this.f3012d;
        if (c1017n0 != null) {
            c1017n0.f();
        }
    }

    @Override // W5.InterfaceC0485a0
    public void flush() {
    }

    @Override // W5.InterfaceC0485a0
    public InterfaceC0485a0 a(InterfaceC0444k interfaceC0444k) {
        return this;
    }

    @Override // W5.InterfaceC0485a0
    public void c(int i7) {
    }
}
