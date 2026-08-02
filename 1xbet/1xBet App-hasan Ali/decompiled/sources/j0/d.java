package j0;

import A0.o1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f17415a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f17416b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f17417c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f17418d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f17419e;
    public static final q f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f17420g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f17421h;
    public static final q i;

    /* renamed from: j, reason: collision with root package name */
    public static final q f17422j;

    /* renamed from: k, reason: collision with root package name */
    public static final q f17423k;

    /* renamed from: l, reason: collision with root package name */
    public static final q f17424l;

    /* renamed from: m, reason: collision with root package name */
    public static final q f17425m;

    /* renamed from: n, reason: collision with root package name */
    public static final q f17426n;

    /* renamed from: o, reason: collision with root package name */
    public static final q f17427o;

    /* renamed from: p, reason: collision with root package name */
    public static final q f17428p;

    /* renamed from: q, reason: collision with root package name */
    public static final q f17429q;

    /* renamed from: r, reason: collision with root package name */
    public static final q f17430r;

    /* renamed from: s, reason: collision with root package name */
    public static final k f17431s;

    /* renamed from: t, reason: collision with root package name */
    public static final k f17432t;

    /* renamed from: u, reason: collision with root package name */
    public static final q f17433u;

    /* renamed from: v, reason: collision with root package name */
    public static final q f17434v;

    /* renamed from: w, reason: collision with root package name */
    public static final q f17435w;

    /* renamed from: x, reason: collision with root package name */
    public static final l f17436x;

    /* renamed from: y, reason: collision with root package name */
    public static final c[] f17437y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f17415a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f17416b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        r rVar = new r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar2 = new r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar3 = new r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f17417c = rVar3;
        r rVar4 = new r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f17418d = rVar4;
        s sVar = j.f17448d;
        q qVar = new q("sRGB IEC61966-2.1", fArr, sVar, rVar, 0);
        f17419e = qVar;
        q qVar2 = new q("sRGB IEC61966-2.1 (Linear)", fArr, sVar, 1.0d, 0.0f, 1.0f, 1);
        f = qVar2;
        q qVar3 = new q("scRGB-nl IEC 61966-2-2:2003", fArr, sVar, null, new o1(8), new o1(9), -0.799f, 2.399f, rVar, 2);
        f17420g = qVar3;
        q qVar4 = new q("scRGB IEC 61966-2-2:2003", fArr, sVar, 1.0d, -0.5f, 7.499f, 3);
        f17421h = qVar4;
        q qVar5 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = qVar5;
        q qVar6 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, sVar, new r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f17422j = qVar6;
        q qVar7 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f17423k = qVar7;
        q qVar8 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, sVar, rVar, 7);
        f17424l = qVar8;
        q qVar9 = new q("NTSC (1953)", fArr2, j.f17445a, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f17425m = qVar9;
        q qVar10 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f17426n = qVar10;
        q qVar11 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, sVar, 2.2d, 0.0f, 1.0f, 10);
        f17427o = qVar11;
        q qVar12 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.f17446b, new r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f17428p = qVar12;
        s sVar2 = j.f17447c;
        q qVar13 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, sVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f17429q = qVar13;
        q qVar14 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, sVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f17430r = qVar14;
        k kVar = new k(14, 1, b.f17408b, "Generic XYZ");
        f17431s = kVar;
        long j5 = b.f17409c;
        k kVar2 = new k(15, 0, j5, "Generic L*a*b*");
        f17432t = kVar2;
        q qVar15 = new q("None", fArr, sVar, rVar2, 16);
        f17433u = qVar15;
        q qVar16 = new q("Hybrid Log Gamma encoding", fArr3, sVar, null, new o1(10), new o1(11), 0.0f, 1.0f, rVar3, 17);
        f17434v = qVar16;
        q qVar17 = new q("Perceptual Quantizer encoding", fArr3, sVar, null, new o1(12), new o1(13), 0.0f, 1.0f, rVar4, 18);
        f17435w = qVar17;
        l lVar = new l(19, j5, "Oklab");
        f17436x = lVar;
        f17437y = new c[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, kVar, kVar2, qVar15, qVar16, qVar17, lVar};
    }

    public static double a(r rVar, double d5) {
        double d6 = d5 < 0.0d ? -1.0d : 1.0d;
        double d7 = d5 * d6;
        double d8 = rVar.f17476b;
        double d9 = d8 * d7;
        return (rVar.f17480g + 1.0d) * d6 * (d9 <= 1.0d ? Math.pow(d9, rVar.f17477c) : Math.exp((d7 - rVar.f) * rVar.f17478d) + rVar.f17479e);
    }

    public static double b(r rVar, double d5) {
        double d6 = d5 < 0.0d ? -1.0d : 1.0d;
        double d7 = 1.0d / rVar.f17476b;
        double d8 = 1.0d / rVar.f17477c;
        double d9 = 1.0d / rVar.f17478d;
        double d10 = (d5 * d6) / (rVar.f17480g + 1.0d);
        return d6 * (d10 <= 1.0d ? Math.pow(d10, d8) * d7 : (Math.log(d10 - rVar.f17479e) * d9) + rVar.f);
    }

    public static double c(r rVar, double d5) {
        double d6 = d5 < 0.0d ? -1.0d : 1.0d;
        double d7 = d5 * d6;
        double d8 = rVar.f17476b;
        double d9 = rVar.f17478d;
        double pow = (Math.pow(d7, d9) * rVar.f17477c) + d8;
        return Math.pow((pow >= 0.0d ? pow : 0.0d) / ((Math.pow(d7, d9) * rVar.f) + rVar.f17479e), rVar.f17480g) * d6;
    }

    public static double d(r rVar, double d5) {
        double d6 = d5 < 0.0d ? -1.0d : 1.0d;
        double d7 = d5 * d6;
        double d8 = -rVar.f17476b;
        double d9 = 1.0d / rVar.f17480g;
        return Math.pow(Math.max((Math.pow(d7, d9) * rVar.f17479e) + d8, 0.0d) / ((Math.pow(d7, d9) * (-rVar.f)) + rVar.f17477c), 1.0d / rVar.f17478d) * d6;
    }
}
