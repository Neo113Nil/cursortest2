package af;

import af.C5015e;
import kotlin.Unit;
import sf.M;
import sf.q;

/* renamed from: af.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5016f extends q {

    /* renamed from: a, reason: collision with root package name */
    private boolean f36753a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5015e.b f36754b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ M f36755c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5016f(C5015e.b bVar, M m11, M m12) {
        super(m12);
        this.f36754b = bVar;
        this.f36755c = m11;
    }

    @Override // sf.q, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.f36753a) {
            return;
        }
        this.f36753a = true;
        synchronized (this.f36754b.f36748j) {
            try {
                this.f36754b.l(r1.f() - 1);
                if (this.f36754b.f() == 0 && this.f36754b.i()) {
                    C5015e.b bVar = this.f36754b;
                    bVar.f36748j.X(bVar);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
