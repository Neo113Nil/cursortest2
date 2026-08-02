package A0;

import u.InterfaceC2477y;

/* loaded from: classes.dex */
public final /* synthetic */ class o1 implements j0.i, InterfaceC2477y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f547a;

    @Override // u.InterfaceC2477y
    public float a(float f) {
        return f;
    }

    @Override // j0.i
    public double b(double d5) {
        switch (this.f547a) {
            case 8:
                double d6 = d5 < 0.0d ? -d5 : d5;
                return Math.copySign(d6 >= 0.0031308049535603718d ? (Math.pow(d6, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d6 / 0.07739938080495357d, d5);
            case 9:
                double d7 = d5 < 0.0d ? -d5 : d5;
                return Math.copySign(d7 >= 0.04045d ? Math.pow((0.9478672985781991d * d7) + 0.05213270142180095d, 2.4d) : 0.07739938080495357d * d7, d5);
            case 10:
                float[] fArr = j0.d.f17415a;
                return j0.d.b(j0.d.f17417c, d5);
            case 11:
                float[] fArr2 = j0.d.f17415a;
                return j0.d.a(j0.d.f17417c, d5);
            case 12:
                float[] fArr3 = j0.d.f17415a;
                return j0.d.d(j0.d.f17418d, d5);
            case 13:
                float[] fArr4 = j0.d.f17415a;
                return j0.d.c(j0.d.f17418d, d5);
            default:
                return d5;
        }
    }
}
