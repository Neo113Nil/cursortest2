package b2;

import android.animation.TypeEvaluator;
import g1.C1969c;

/* loaded from: classes.dex */
public final class e implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public C1969c[] f7231a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        C1969c[] c1969cArr = (C1969c[]) obj;
        C1969c[] c1969cArr2 = (C1969c[]) obj2;
        if (!G4.d.j(c1969cArr, c1969cArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!G4.d.j(this.f7231a, c1969cArr)) {
            this.f7231a = G4.d.p(c1969cArr);
        }
        for (int i = 0; i < c1969cArr.length; i++) {
            C1969c c1969c = this.f7231a[i];
            C1969c c1969c2 = c1969cArr[i];
            C1969c c1969c3 = c1969cArr2[i];
            c1969c.getClass();
            c1969c.f17077a = c1969c2.f17077a;
            int i5 = 0;
            while (true) {
                float[] fArr = c1969c2.f17078b;
                if (i5 < fArr.length) {
                    c1969c.f17078b[i5] = (c1969c3.f17078b[i5] * f) + ((1.0f - f) * fArr[i5]);
                    i5++;
                }
            }
        }
        return this.f7231a;
    }
}
