package p165y;

import p143u.i;
import p143u.k;
import p143u.l;
import p169z.o;

/* JADX INFO: loaded from: classes.dex */
public final class a extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f18102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f18103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f18104c;

    @Override // p169z.o
    public final float a() {
        return this.f18104c.b();
    }

    public final void b(float f7, float f8, float f9, float f10, float f11, float f12) {
        l lVar = this.f18102a;
        this.f18104c = lVar;
        lVar.f16539l = f7;
        boolean z4 = f7 > f8;
        lVar.f16538k = z4;
        if (z4) {
            lVar.d(-f9, f7 - f8, f11, f12, f10);
        } else {
            lVar.d(f9, f8 - f7, f11, f12, f10);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        return this.f18104c.getInterpolation(f7);
    }
}
