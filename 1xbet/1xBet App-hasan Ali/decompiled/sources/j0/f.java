package j0;

import i0.F;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: e, reason: collision with root package name */
    public final q f17438e;
    public final q f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f17439g;

    public f(q qVar, q qVar2) {
        super(qVar2, qVar, qVar2, null);
        float[] g5;
        this.f17438e = qVar;
        this.f = qVar2;
        s sVar = qVar2.f17463d;
        s sVar2 = qVar.f17463d;
        boolean d5 = j.d(sVar2, sVar);
        float[] fArr = qVar.i;
        float[] fArr2 = qVar2.f17467j;
        if (d5) {
            g5 = j.g(fArr2, fArr);
        } else {
            float[] a5 = sVar2.a();
            s sVar3 = qVar2.f17463d;
            float[] a6 = sVar3.a();
            s sVar4 = j.f17446b;
            boolean d6 = j.d(sVar2, sVar4);
            float[] fArr3 = C2016a.f17405b.f17406a;
            g5 = j.g(j.d(sVar3, sVar4) ? fArr2 : j.f(j.g(j.c(fArr3, a6, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.i)), d6 ? fArr : j.g(j.c(fArr3, a5, new float[]{0.964212f, 1.0f, 0.825188f}), fArr));
        }
        this.f17439g = g5;
    }

    @Override // j0.g
    public final long a(long j5) {
        float h3 = i0.p.h(j5);
        float g5 = i0.p.g(j5);
        float e3 = i0.p.e(j5);
        float d5 = i0.p.d(j5);
        m mVar = this.f17438e.f17473p;
        float b3 = (float) mVar.b(h3);
        float b5 = (float) mVar.b(g5);
        float b6 = (float) mVar.b(e3);
        float[] fArr = this.f17439g;
        float f = (fArr[6] * b6) + (fArr[3] * b5) + (fArr[0] * b3);
        float f5 = (fArr[7] * b6) + (fArr[4] * b5) + (fArr[1] * b3);
        float f6 = (fArr[8] * b6) + (fArr[5] * b5) + (fArr[2] * b3);
        q qVar = this.f;
        float b7 = (float) qVar.f17470m.b(f);
        double d6 = f5;
        m mVar2 = qVar.f17470m;
        return F.b(b7, (float) mVar2.b(d6), (float) mVar2.b(f6), d5, qVar);
    }
}
