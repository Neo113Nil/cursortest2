package v2;

import L4.InterfaceC0228k;
import L4.v;
import v.AbstractC2529y;

/* loaded from: classes.dex */
public final class o extends m {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC2529y f20425k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20426l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC0228k f20427m;

    public o(InterfaceC0228k interfaceC0228k, AbstractC2529y abstractC2529y) {
        this.f20425k = abstractC2529y;
        this.f20427m = interfaceC0228k;
    }

    @Override // v2.m
    public final AbstractC2529y b() {
        return this.f20425k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f20426l = true;
        InterfaceC0228k interfaceC0228k = this.f20427m;
        if (interfaceC0228k != null) {
            H2.e.a(interfaceC0228k);
        }
    }

    @Override // v2.m
    public final synchronized InterfaceC0228k d() {
        InterfaceC0228k interfaceC0228k;
        try {
            if (this.f20426l) {
                throw new IllegalStateException("closed");
            }
            interfaceC0228k = this.f20427m;
            if (interfaceC0228k == null) {
                v vVar = L4.o.f3106a;
                kotlin.jvm.internal.l.c(null);
                vVar.i(null);
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC0228k;
    }
}
