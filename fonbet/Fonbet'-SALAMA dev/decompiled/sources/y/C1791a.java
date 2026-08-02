package y;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1791a extends z.o {

    /* renamed from: a, reason: collision with root package name */
    public u.l f18096a;

    /* renamed from: b, reason: collision with root package name */
    public u.i f18097b;

    /* renamed from: c, reason: collision with root package name */
    public u.k f18098c;

    @Override // z.o
    public final float a() {
        return this.f18098c.b();
    }

    public final void b(float f7, float f8, float f9, float f10, float f11, float f12) {
        u.l lVar = this.f18096a;
        this.f18098c = lVar;
        lVar.f16533l = f7;
        boolean z4 = f7 > f8;
        lVar.f16532k = z4;
        if (z4) {
            lVar.d(-f9, f7 - f8, f11, f12, f10);
        } else {
            lVar.d(f9, f8 - f7, f11, f12, f10);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        return this.f18098c.getInterpolation(f7);
    }
}
