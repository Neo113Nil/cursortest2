package j0;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final c f17440a;

    /* renamed from: b, reason: collision with root package name */
    public final c f17441b;

    /* renamed from: c, reason: collision with root package name */
    public final c f17442c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f17443d;

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f17440a = cVar;
        this.f17441b = cVar2;
        this.f17442c = cVar3;
        this.f17443d = fArr;
    }

    public long a(long j5) {
        float h3 = i0.p.h(j5);
        float g5 = i0.p.g(j5);
        float e3 = i0.p.e(j5);
        float d5 = i0.p.d(j5);
        c cVar = this.f17441b;
        long d6 = cVar.d(h3, g5, e3);
        float intBitsToFloat = Float.intBitsToFloat((int) (d6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d6 & 4294967295L));
        float e5 = cVar.e(h3, g5, e3);
        float[] fArr = this.f17443d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e5 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f5 = intBitsToFloat2;
        return this.f17442c.f(f, f5, e5, d5, this.f17440a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(c cVar, c cVar2, int i) {
        this(cVar2, r4, r5, r3);
        float[] fArr;
        long j5 = cVar.f17413b;
        long j6 = b.f17407a;
        c a5 = b.a(j5, j6) ? j.a(cVar) : cVar;
        c a6 = b.a(cVar2.f17413b, j6) ? j.a(cVar2) : cVar2;
        if (i == 3) {
            boolean a7 = b.a(cVar.f17413b, j6);
            boolean a8 = b.a(cVar2.f17413b, j6);
            if ((!a7 || !a8) && (a7 || a8)) {
                cVar = a7 ? cVar : cVar2;
                float[] fArr2 = j.f17449e;
                s sVar = ((q) cVar).f17463d;
                float[] a9 = a7 ? sVar.a() : fArr2;
                fArr2 = a8 ? sVar.a() : fArr2;
                fArr = new float[]{a9[0] / fArr2[0], a9[1] / fArr2[1], a9[2] / fArr2[2]};
            }
        }
        fArr = null;
    }
}
