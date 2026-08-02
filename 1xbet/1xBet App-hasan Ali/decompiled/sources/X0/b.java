package X0;

import W0.i;
import r.AbstractC2339q;
import r.S;
import s.AbstractC2351a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f6065a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile S f6066b = new S(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f6067c;

    static {
        Object[] objArr = new Object[0];
        f6067c = objArr;
        synchronized (objArr) {
            f6066b.i((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f6066b.i((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f6066b.i((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f6066b.i((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f6066b.i((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f6066b.g(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        i.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f) {
        float g5;
        a aVar;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        a aVar2 = (a) f6066b.e(i);
        if (aVar2 != null) {
            return aVar2;
        }
        S s2 = f6066b;
        if (s2.f18962k) {
            AbstractC2339q.a(s2);
        }
        int a5 = AbstractC2351a.a(s2.f18965n, i, s2.f18963l);
        if (a5 >= 0) {
            return (a) f6066b.k(a5);
        }
        int i5 = -(a5 + 1);
        int i6 = i5 - 1;
        if (i5 >= f6066b.j()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f});
            b(f, cVar);
            return cVar;
        }
        float[] fArr = f6065a;
        if (i6 < 0) {
            aVar = new c(fArr, fArr);
            g5 = 1.0f;
        } else {
            g5 = f6066b.g(i6) / 100.0f;
            aVar = (a) f6066b.k(i6);
        }
        float g6 = f6066b.g(i5) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, g5 == g6 ? 0.0f : (f - g5) / (g6 - g5))) * 1.0f) + 0.0f;
        a aVar3 = (a) f6066b.k(i5);
        float[] fArr2 = new float[9];
        for (int i7 = 0; i7 < 9; i7++) {
            float f5 = fArr[i7];
            float b3 = aVar.b(f5);
            fArr2[i7] = ((aVar3.b(f5) - b3) * max) + b3;
        }
        c cVar2 = new c(fArr, fArr2);
        b(f, cVar2);
        return cVar2;
    }

    public static void b(float f, c cVar) {
        synchronized (f6067c) {
            S clone = f6066b.clone();
            clone.i((int) (f * 100.0f), cVar);
            f6066b = clone;
        }
    }
}
