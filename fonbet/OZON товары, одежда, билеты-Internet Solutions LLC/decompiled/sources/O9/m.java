package O9;

import android.graphics.Rect;

/* loaded from: classes9.dex */
public final class m extends p {
    @Override // O9.p
    protected final float a(N9.m mVar, N9.m mVar2) {
        int i11;
        int i12 = mVar.f18815a;
        if (i12 <= 0 || (i11 = mVar.f18816b) <= 0) {
            return 0.0f;
        }
        int i13 = mVar2.f18815a;
        float f7 = (i12 * 1.0f) / i13;
        if (f7 < 1.0f) {
            f7 = 1.0f / f7;
        }
        float f11 = i11;
        float f12 = mVar2.f18816b;
        float f13 = (f11 * 1.0f) / f12;
        if (f13 < 1.0f) {
            f13 = 1.0f / f13;
        }
        float f14 = (1.0f / f7) / f13;
        float f15 = ((i12 * 1.0f) / f11) / ((i13 * 1.0f) / f12);
        if (f15 < 1.0f) {
            f15 = 1.0f / f15;
        }
        return (((1.0f / f15) / f15) / f15) * f14;
    }

    @Override // O9.p
    public final Rect b(N9.m mVar, N9.m mVar2) {
        return new Rect(0, 0, mVar2.f18815a, mVar2.f18816b);
    }
}
