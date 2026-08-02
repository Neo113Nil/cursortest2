package v2;

import L4.C;
import L4.InterfaceC0228k;
import L4.z;
import v.AbstractC2529y;
import w2.C2550h;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: k, reason: collision with root package name */
    public final z f20418k;

    /* renamed from: l, reason: collision with root package name */
    public final L4.o f20419l;

    /* renamed from: m, reason: collision with root package name */
    public final String f20420m;

    /* renamed from: n, reason: collision with root package name */
    public final C2550h f20421n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20422o;

    /* renamed from: p, reason: collision with root package name */
    public C f20423p;

    public l(z zVar, L4.o oVar, String str, C2550h c2550h) {
        this.f20418k = zVar;
        this.f20419l = oVar;
        this.f20420m = str;
        this.f20421n = c2550h;
    }

    @Override // v2.m
    public final AbstractC2529y b() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f20422o = true;
            C c5 = this.f20423p;
            if (c5 != null) {
                H2.e.a(c5);
            }
            C2550h c2550h = this.f20421n;
            if (c2550h != null) {
                H2.e.a(c2550h);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // v2.m
    public final synchronized InterfaceC0228k d() {
        if (this.f20422o) {
            throw new IllegalStateException("closed");
        }
        C c5 = this.f20423p;
        if (c5 != null) {
            return c5;
        }
        C k5 = N4.b.k(this.f20419l.i(this.f20418k));
        this.f20423p = k5;
        return k5;
    }
}
