package f2;

import e2.AbstractC1005b;

/* renamed from: f2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1077i extends AbstractC1005b {

    /* renamed from: d, reason: collision with root package name */
    public final C1076h f12863d;

    public C1077i(C1076h c1076h, long j, long j3) {
        super(j, j3);
        this.f12863d = c1076h;
    }

    @Override // e2.InterfaceC1014k
    public final long c() {
        a();
        return this.f12863d.d(this.f12576c);
    }

    @Override // e2.InterfaceC1014k
    public final long f() {
        a();
        return this.f12863d.c(this.f12576c);
    }
}
