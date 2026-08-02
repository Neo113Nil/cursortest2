package O9;

import android.graphics.Rect;
import android.util.Log;

/* loaded from: classes9.dex */
public final class j extends p {
    @Override // O9.p
    protected final float a(N9.m mVar, N9.m mVar2) {
        if (mVar.f18815a <= 0 || mVar.f18816b <= 0) {
            return 0.0f;
        }
        N9.m a11 = mVar.a(mVar2);
        float f7 = a11.f18815a * 1.0f;
        float f11 = f7 / mVar.f18815a;
        if (f11 > 1.0f) {
            f11 = (float) Math.pow(1.0f / f11, 1.1d);
        }
        float f12 = ((a11.f18816b * 1.0f) / mVar2.f18816b) + (f7 / mVar2.f18815a);
        return ((1.0f / f12) / f12) * f11;
    }

    @Override // O9.p
    public final Rect b(N9.m mVar, N9.m mVar2) {
        N9.m a11 = mVar.a(mVar2);
        Log.i("j", "Preview: " + mVar + "; Scaled: " + a11 + "; Want: " + mVar2);
        int i11 = mVar2.f18815a;
        int i12 = a11.f18815a;
        int i13 = (i12 - i11) / 2;
        int i14 = mVar2.f18816b;
        int i15 = a11.f18816b;
        int i16 = (i15 - i14) / 2;
        return new Rect(-i13, -i16, i12 - i13, i15 - i16);
    }
}
