package M3;

import M3.e;
import java.util.ArrayList;
import java.util.zip.Inflater;
import m3.C8049B;
import m3.C8050C;
import m3.N;

/* loaded from: classes8.dex */
final class f {
    public static e a(int i11, byte[] bArr) {
        ArrayList<e.a> arrayList;
        int p11;
        C8050C c8050c = new C8050C(bArr);
        try {
            c8050c.S(4);
            p11 = c8050c.p();
            c8050c.R(0);
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (p11 == 1886547818) {
            c8050c.S(8);
            int f7 = c8050c.f();
            int i12 = c8050c.i();
            while (f7 < i12) {
                int p12 = c8050c.p() + f7;
                if (p12 <= f7 || p12 > i12) {
                    break;
                }
                int p13 = c8050c.p();
                if (p13 != 2037673328 && p13 != 1836279920) {
                    c8050c.R(p12);
                    f7 = p12;
                }
                c8050c.Q(p12);
                arrayList = b(c8050c);
                break;
            }
            arrayList = null;
        } else {
            arrayList = b(c8050c);
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            e.a aVar = arrayList.get(0);
            return new e(aVar, aVar, i11);
        }
        if (size != 2) {
            return null;
        }
        return new e(arrayList.get(0), arrayList.get(1), i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x003c, code lost:
    
        if (r3 != 1918990112) goto L4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.util.ArrayList<M3.e$a>] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5, types: [java.util.ArrayList<M3.e$a>] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList<e.a> b(C8050C c8050c) {
        char c11;
        ?? r202;
        boolean z11;
        int i11;
        e.a aVar;
        C8050C c8050c2 = c8050c;
        e.a aVar2 = null;
        if (c8050c2.E() == 0) {
            char c12 = 7;
            c8050c2.S(7);
            int p11 = c8050c2.p();
            boolean z12 = true;
            if (p11 == 1684433976) {
                C8050C c8050c3 = new C8050C();
                Inflater inflater = new Inflater(true);
                try {
                    if (!N.K(c8050c2, c8050c3, inflater)) {
                        return null;
                    }
                    inflater.end();
                    c8050c2 = c8050c3;
                } finally {
                    inflater.end();
                }
            }
            ArrayList<e.a> arrayList = new ArrayList<>();
            int f7 = c8050c2.f();
            int i12 = c8050c2.i();
            while (f7 < i12) {
                int p12 = c8050c2.p() + f7;
                if (p12 > f7 && p12 <= i12) {
                    if (c8050c2.p() == 1835365224) {
                        int p13 = c8050c2.p();
                        if (p13 <= 10000) {
                            float[] fArr = new float[p13];
                            for (int i13 = 0; i13 < p13; i13++) {
                                fArr[i13] = Float.intBitsToFloat(c8050c2.p());
                            }
                            int p14 = c8050c2.p();
                            if (p14 <= 32000) {
                                double log = Math.log(2.0d);
                                c11 = c12;
                                e.a aVar3 = aVar2;
                                int ceil = (int) Math.ceil(Math.log(p13 * 2.0d) / log);
                                z11 = z12;
                                byte[] e11 = c8050c2.e();
                                C8049B c8049b = new C8049B(e11.length, e11);
                                c8049b.n(c8050c2.f() * 8);
                                float[] fArr2 = new float[p14 * 5];
                                int i14 = 5;
                                int[] iArr = new int[5];
                                e.a aVar4 = aVar3;
                                int i15 = 0;
                                int i16 = 0;
                                while (true) {
                                    if (i15 < p14) {
                                        int i17 = 0;
                                        while (i17 < i14) {
                                            int i18 = iArr[i17];
                                            int h11 = c8049b.h(ceil);
                                            int i19 = i18 + ((h11 >> 1) ^ (-(h11 & 1)));
                                            if (i19 >= p13 || i19 < 0) {
                                                break;
                                            }
                                            fArr2[i16] = fArr[i19];
                                            iArr[i17] = i19;
                                            i17++;
                                            i16++;
                                            i14 = 5;
                                        }
                                        i15++;
                                        i14 = 5;
                                    } else {
                                        c8049b.n((c8049b.e() + 7) & (-8));
                                        int i21 = 32;
                                        int h12 = c8049b.h(32);
                                        e.b[] bVarArr = new e.b[h12];
                                        int i22 = 0;
                                        while (i22 < h12) {
                                            int h13 = c8049b.h(8);
                                            int h14 = c8049b.h(8);
                                            int h15 = c8049b.h(i21);
                                            if (h15 <= 128000) {
                                                int i23 = h12;
                                                float[] fArr3 = fArr2;
                                                int ceil2 = (int) Math.ceil(Math.log(p14 * 2.0d) / log);
                                                float[] fArr4 = new float[h15 * 3];
                                                float[] fArr5 = new float[h15 * 2];
                                                i11 = i12;
                                                int i24 = 0;
                                                int i25 = 0;
                                                while (i24 < h15) {
                                                    int h16 = c8049b.h(ceil2);
                                                    C8049B c8049b2 = c8049b;
                                                    int i26 = i25 + ((h16 >> 1) ^ (-(h16 & 1)));
                                                    if (i26 >= 0 && i26 < p14) {
                                                        int i27 = i24 * 3;
                                                        int i28 = i26 * 5;
                                                        fArr4[i27] = fArr3[i28];
                                                        fArr4[i27 + 1] = fArr3[i28 + 1];
                                                        fArr4[i27 + 2] = fArr3[i28 + 2];
                                                        int i29 = i24 * 2;
                                                        fArr5[i29] = fArr3[i28 + 3];
                                                        fArr5[i29 + 1] = fArr3[i28 + 4];
                                                        i24++;
                                                        i25 = i26;
                                                        c8049b = c8049b2;
                                                    }
                                                }
                                                bVarArr[i22] = new e.b(h13, h14, fArr4, fArr5);
                                                i22++;
                                                h12 = i23;
                                                fArr2 = fArr3;
                                                i12 = i11;
                                                c8049b = c8049b;
                                                i21 = 32;
                                            }
                                        }
                                        i11 = i12;
                                        aVar = new e.a(bVarArr);
                                        r202 = aVar4;
                                    }
                                }
                                i11 = i12;
                                aVar = aVar4;
                                r202 = aVar4;
                                if (aVar != null) {
                                    return r202;
                                }
                                arrayList.add(aVar);
                            }
                        }
                        c11 = c12;
                        aVar = aVar2;
                        r202 = aVar;
                        z11 = z12;
                        i11 = i12;
                        if (aVar != null) {
                        }
                    } else {
                        c11 = c12;
                        r202 = aVar2;
                        z11 = z12;
                        i11 = i12;
                    }
                    c8050c2.R(p12);
                    f7 = p12;
                    c12 = c11;
                    z12 = z11;
                    aVar2 = r202;
                    i12 = i11;
                }
            }
            return arrayList;
        }
        return aVar2;
    }
}
