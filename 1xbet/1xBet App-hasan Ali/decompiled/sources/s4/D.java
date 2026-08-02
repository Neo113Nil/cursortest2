package s4;

import p4.C2268h;

/* loaded from: classes.dex */
public final class D extends t4.d {

    /* renamed from: a, reason: collision with root package name */
    public long f19225a;

    /* renamed from: b, reason: collision with root package name */
    public C2268h f19226b;

    @Override // t4.d
    public final boolean a(t4.b bVar) {
        B b3 = (B) bVar;
        if (this.f19225a >= 0) {
            return false;
        }
        long j5 = b3.f19218s;
        if (j5 < b3.f19219t) {
            b3.f19219t = j5;
        }
        this.f19225a = j5;
        return true;
    }

    @Override // t4.d
    public final a4.c[] b(t4.b bVar) {
        long j5 = this.f19225a;
        this.f19225a = -1L;
        this.f19226b = null;
        return ((B) bVar).v(j5);
    }
}
