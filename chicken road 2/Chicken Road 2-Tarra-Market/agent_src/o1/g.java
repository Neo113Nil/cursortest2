package o1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class g implements s1.s {

    /* renamed from: a, reason: collision with root package name */
    public final v f6285a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6286b;

    /* renamed from: c, reason: collision with root package name */
    public long f6287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f6288d;

    public g(h hVar, v vVar) {
        this.f6288d = hVar;
        if (vVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f6285a = vVar;
        this.f6286b = false;
        this.f6287c = 0L;
    }

    public final void a() {
        this.f6285a.close();
    }

    @Override // s1.s
    public final long c(s1.e eVar, long j2) {
        try {
            long c2 = this.f6285a.c(eVar, 8192L);
            if (c2 > 0) {
                this.f6287c += c2;
            }
            return c2;
        } catch (IOException e2) {
            if (!this.f6286b) {
                this.f6286b = true;
                h hVar = this.f6288d;
                hVar.f6292b.h(false, hVar, e2);
            }
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
        if (this.f6286b) {
            return;
        }
        this.f6286b = true;
        h hVar = this.f6288d;
        hVar.f6292b.h(false, hVar, null);
    }

    @Override // s1.s
    public final s1.u d() {
        return this.f6285a.f6359f.f6368i;
    }

    public final String toString() {
        return g.class.getSimpleName() + "(" + this.f6285a.toString() + ")";
    }
}
