package Q1;

import A1.C0045t0;
import A1.X;
import C1.C0095a;
import F1.h;
import F1.m;
import F1.v;
import com.google.android.exoplayer2.Format$Builder;
import java.io.EOFException;
import java.io.InterruptedIOException;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f5757m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f5758n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f5759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f5760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N1.e f5761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f5763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0095a f5764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final X f5766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5767i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f5769l;

    public a(m mVar, v vVar, N1.e eVar) throws C0045t0 {
        this.f5759a = mVar;
        this.f5760b = vVar;
        this.f5761c = eVar;
        int i7 = eVar.f4647b;
        int iMax = Math.max(1, i7 / 10);
        this.f5765g = iMax;
        byte[] bArr = (byte[]) eVar.f4650e;
        int length = bArr.length;
        byte b7 = bArr[0];
        byte b8 = bArr[1];
        int i8 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
        this.f5762d = i8;
        int i9 = eVar.f4646a;
        int i10 = eVar.f4648c;
        int i11 = (((i10 - (i9 * 4)) * 8) / (eVar.f4649d * i9)) + 1;
        if (i8 != i11) {
            throw C0045t0.a(null, "Expected frames per block: " + i11 + "; got: " + i8);
        }
        int iG = t.g(iMax, i8);
        this.f5763e = new byte[iG * i10];
        this.f5764f = new C0095a(i8 * 2 * i9 * iG);
        int i12 = ((i10 * i7) * 8) / i8;
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10537k = "audio/raw";
        format$Builder.f10533f = i12;
        format$Builder.f10534g = i12;
        format$Builder.f10538l = iMax * 2 * i9;
        format$Builder.f10550x = i9;
        format$Builder.f10551y = i7;
        format$Builder.f10552z = 2;
        this.f5766h = new X(format$Builder);
    }

    @Override // Q1.b
    public final void a(long j) {
        this.f5767i = 0;
        this.j = j;
        this.f5768k = 0;
        this.f5769l = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:28:0x00be  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:37:0x0145  */
    /* JADX WARN: Code duplicated, block: B:38:0x0149  */
    /* JADX WARN: Code duplicated, block: B:44:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0119 A[EDGE_INSN: B:48:0x0119->B:35:0x0119 BREAK  A[LOOP:1: B:17:0x004b->B:34:0x010d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // Q1.b
    public final boolean b(h hVar, long j) throws EOFException, InterruptedIOException {
        byte[] bArr;
        int i7;
        boolean z4;
        int i8;
        int i9;
        C0095a c0095a;
        int i10;
        int i11;
        int i12;
        int i13;
        byte[] bArr2;
        int i14;
        int i15;
        int iJ;
        int[] iArr;
        int i16;
        int i17;
        int iJ2;
        int i18;
        byte b7;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = this.f5768k;
        N1.e eVar = this.f5761c;
        int i25 = i24 / (eVar.f4646a * 2);
        int i26 = this.f5765g;
        int i27 = this.f5762d;
        int iG = t.g(i26 - i25, i27);
        int i28 = eVar.f4648c;
        int i29 = iG * i28;
        boolean z7 = j == 0;
        while (true) {
            bArr = this.f5763e;
            if (z7 && (i22 = this.f5767i) < i29) {
                i23 = hVar.read(bArr, this.f5767i, (int) Math.min(i29 - i22, j));
                if (i23 == -1) {
                    break;
                }
                this.f5767i += i23;
                bArr = this.f5763e;
                if (z7) {
                }
            }
            i7 = this.f5767i / i28;
            if (i7 > 0) {
                i9 = 0;
                while (true) {
                    c0095a = this.f5764f;
                    if (i9 < i7) {
                        break;
                    }
                    i12 = 0;
                    while (true) {
                        i13 = eVar.f4646a;
                        if (i12 < i13) {
                            bArr2 = (byte[]) c0095a.f1465c;
                            int i30 = (i12 * 4) + (i9 * i28);
                            i14 = (i13 * 4) + i30;
                            i15 = (i28 / i13) - 4;
                            iJ = (short) ((bArr[i30] & 255) | ((bArr[i30 + 1] & 255) << 8));
                            int i31 = bArr[i30 + 2] & 255;
                            boolean z8 = z7;
                            int iMin = Math.min(i31, 88);
                            iArr = f5758n;
                            i16 = iArr[iMin];
                            i17 = ((i9 * i27 * i13) + i12) * 2;
                            bArr2[i17] = (byte) (iJ & 255);
                            bArr2[i17 + 1] = (byte) (iJ >> 8);
                            iJ2 = iMin;
                            int i32 = i26;
                            i18 = 0;
                            while (i18 < i15 * 2) {
                                b7 = bArr[((i18 / 8) * i13 * 4) + i14 + ((i18 / 2) % 4)];
                                byte[] bArr3 = bArr;
                                i19 = b7 & 255;
                                if (i18 % 2 == 0) {
                                    i20 = b7 & 15;
                                } else {
                                    i20 = i19 >> 4;
                                }
                                i21 = ((((i20 & 7) * 2) + 1) * i16) >> 3;
                                if ((i20 & 8) != 0) {
                                    i21 = -i21;
                                }
                                iJ = t.j(iJ + i21, -32768, 32767);
                                i17 = (i13 * 2) + i17;
                                bArr2[i17] = (byte) (iJ & 255);
                                bArr2[i17 + 1] = (byte) (iJ >> 8);
                                iJ2 = t.j(iJ2 + f5757m[i20], 0, 88);
                                i16 = iArr[iJ2];
                                i18++;
                                i14 = i14;
                                bArr = bArr3;
                            }
                            i12++;
                            z7 = z8;
                            i26 = i32;
                        }
                    }
                    i9++;
                }
                i10 = i26;
                z4 = z7;
                int i33 = i27 * i7 * 2 * eVar.f4646a;
                c0095a.D(0);
                c0095a.C(i33);
                this.f5767i -= i7 * i28;
                int i34 = c0095a.f1464b;
                this.f5760b.c(i34, c0095a);
                i11 = this.f5768k + i34;
                this.f5768k = i11;
                if (i11 / (eVar.f4646a * 2) >= i10) {
                    d(i10);
                }
            } else {
                z4 = z7;
            }
            if (z4 && (i8 = this.f5768k / (eVar.f4646a * 2)) > 0) {
                d(i8);
            }
            return z4;
        }
        while (true) {
            bArr = this.f5763e;
            if (z7) {
            }
            i7 = this.f5767i / i28;
            if (i7 > 0) {
                i9 = 0;
                while (true) {
                    c0095a = this.f5764f;
                    if (i9 < i7) {
                        break;
                        break;
                    }
                    i12 = 0;
                    while (true) {
                        i13 = eVar.f4646a;
                        if (i12 < i13) {
                            bArr2 = (byte[]) c0095a.f1465c;
                            int i35 = (i12 * 4) + (i9 * i28);
                            i14 = (i13 * 4) + i35;
                            i15 = (i28 / i13) - 4;
                            iJ = (short) ((bArr[i35] & 255) | ((bArr[i35 + 1] & 255) << 8));
                            int i36 = bArr[i35 + 2] & 255;
                            boolean z9 = z7;
                            int iMin2 = Math.min(i36, 88);
                            iArr = f5758n;
                            i16 = iArr[iMin2];
                            i17 = ((i9 * i27 * i13) + i12) * 2;
                            bArr2[i17] = (byte) (iJ & 255);
                            bArr2[i17 + 1] = (byte) (iJ >> 8);
                            iJ2 = iMin2;
                            int i37 = i26;
                            i18 = 0;
                            while (i18 < i15 * 2) {
                                b7 = bArr[((i18 / 8) * i13 * 4) + i14 + ((i18 / 2) % 4)];
                                byte[] bArr4 = bArr;
                                i19 = b7 & 255;
                                if (i18 % 2 == 0) {
                                    i20 = b7 & 15;
                                } else {
                                    i20 = i19 >> 4;
                                }
                                i21 = ((((i20 & 7) * 2) + 1) * i16) >> 3;
                                if ((i20 & 8) != 0) {
                                    i21 = -i21;
                                }
                                iJ = t.j(iJ + i21, -32768, 32767);
                                i17 = (i13 * 2) + i17;
                                bArr2[i17] = (byte) (iJ & 255);
                                bArr2[i17 + 1] = (byte) (iJ >> 8);
                                iJ2 = t.j(iJ2 + f5757m[i20], 0, 88);
                                i16 = iArr[iJ2];
                                i18++;
                                i14 = i14;
                                bArr = bArr4;
                            }
                            i12++;
                            z7 = z9;
                            i26 = i37;
                        }
                    }
                    i9++;
                }
                i10 = i26;
                z4 = z7;
                int i38 = i27 * i7 * 2 * eVar.f4646a;
                c0095a.D(0);
                c0095a.C(i38);
                this.f5767i -= i7 * i28;
                int i39 = c0095a.f1464b;
                this.f5760b.c(i39, c0095a);
                i11 = this.f5768k + i39;
                this.f5768k = i11;
                if (i11 / (eVar.f4646a * 2) >= i10) {
                    d(i10);
                }
            } else {
                z4 = z7;
            }
            if (z4) {
                d(i8);
            }
            return z4;
            this.f5767i += i23;
        }
    }

    @Override // Q1.b
    public final void c(int i7, long j) {
        this.f5759a.m(new f(this.f5761c, this.f5762d, i7, j));
        this.f5760b.a(this.f5766h);
    }

    public final void d(int i7) {
        long j = this.j;
        long j3 = this.f5769l;
        N1.e eVar = this.f5761c;
        long jK = j + t.K(j3, 1000000L, eVar.f4647b);
        int i8 = i7 * 2 * eVar.f4646a;
        this.f5760b.e(jK, 1, i8, this.f5768k - i8, null);
        this.f5769l += (long) i7;
        this.f5768k -= i8;
    }
}
