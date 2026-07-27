package D3;

import M.m0;
import T4.s;
import T4.x;
import j5.p;
import y3.AbstractC1571e;

/* loaded from: classes.dex */
public final class d extends x {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1571e f443b;

    /* renamed from: c, reason: collision with root package name */
    public final int f444c;

    /* renamed from: d, reason: collision with root package name */
    public final s f445d;

    public d(AbstractC1571e abstractC1571e, int i2, s sVar) {
        this.f443b = abstractC1571e;
        this.f444c = i2;
        this.f445d = sVar;
    }

    @Override // T4.x
    public final long a() {
        return this.f444c;
    }

    @Override // T4.x
    public final s b() {
        return this.f445d;
    }

    @Override // T4.x
    public final void c(p pVar) {
        this.f443b.b(new m0(pVar));
    }
}
