package N1;

import A1.C0045t0;
import A1.X;
import C1.AbstractC0096b;
import C1.C0095a;
import E3.AbstractC0167z;
import E3.L;
import F1.x;
import K4.C0321h;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f4651a;

    static {
        int i7 = p151v2.t.f17159a;
        f4651a = "OpusHead".getBytes(D3.f.f1719c);
    }

    public static C0321h a(int i7, C0095a c0095a) {
        c0095a.D(i7 + 12);
        c0095a.E(1);
        b(c0095a);
        c0095a.E(2);
        int iT = c0095a.t();
        if ((iT & 128) != 0) {
            c0095a.E(2);
        }
        if ((iT & 64) != 0) {
            c0095a.E(c0095a.y());
        }
        if ((iT & 32) != 0) {
            c0095a.E(2);
        }
        c0095a.E(1);
        b(c0095a);
        String strD = p151v2.i.d(c0095a.t());
        if ("audio/mpeg".equals(strD) || "audio/vnd.dts".equals(strD) || "audio/vnd.dts.hd".equals(strD)) {
            return new C0321h(strD, (byte[]) null, -1, -1);
        }
        c0095a.E(4);
        int iW = c0095a.w();
        int iW2 = c0095a.w();
        c0095a.E(1);
        int iB = b(c0095a);
        byte[] bArr = new byte[iB];
        c0095a.f(bArr, 0, iB);
        if (iW2 <= 0) {
            iW2 = -1;
        }
        return new C0321h(strD, bArr, iW2, iW > 0 ? iW : -1);
    }

    public static int b(C0095a c0095a) {
        int iT = c0095a.t();
        int i7 = iT & 127;
        while ((iT & 128) == 128) {
            iT = c0095a.t();
            i7 = (i7 << 7) | (iT & 127);
        }
        return i7;
    }

    public static Pair c(C0095a c0095a, int i7, int i8) throws C0045t0 {
        r rVar;
        Pair pairCreate;
        int i9;
        int i10;
        byte[] bArr;
        int i11 = c0095a.f1463a;
        while (i11 - i7 < i8) {
            c0095a.D(i11);
            int iG = c0095a.g();
            Q0.a.f("childAtomSize must be positive", iG > 0);
            if (c0095a.g() == 1936289382) {
                int i12 = i11 + 8;
                int i13 = 0;
                int i14 = -1;
                String strR = null;
                Integer numValueOf = null;
                while (i12 - i11 < iG) {
                    c0095a.D(i12);
                    int iG2 = c0095a.g();
                    int iG3 = c0095a.g();
                    if (iG3 == 1718775137) {
                        numValueOf = Integer.valueOf(c0095a.g());
                    } else if (iG3 == 1935894637) {
                        c0095a.E(4);
                        strR = c0095a.r(4, D3.f.f1719c);
                    } else if (iG3 == 1935894633) {
                        i14 = i12;
                        i13 = iG2;
                    }
                    i12 += iG2;
                }
                if ("cenc".equals(strR) || "cbc1".equals(strR) || "cens".equals(strR) || "cbcs".equals(strR)) {
                    Q0.a.f("frma atom is mandatory", numValueOf != null);
                    Q0.a.f("schi atom is mandatory", i14 != -1);
                    int i15 = i14 + 8;
                    while (true) {
                        if (i15 - i14 >= i13) {
                            rVar = null;
                            break;
                        }
                        c0095a.D(i15);
                        int iG4 = c0095a.g();
                        if (c0095a.g() == 1952804451) {
                            int iL = D1.a.l(c0095a.g());
                            c0095a.E(1);
                            if (iL == 0) {
                                c0095a.E(1);
                                i9 = 0;
                                i10 = 0;
                            } else {
                                int iT = c0095a.t();
                                int i16 = (iT & 240) >> 4;
                                i9 = iT & 15;
                                i10 = i16;
                            }
                            boolean z4 = c0095a.t() == 1;
                            int iT2 = c0095a.t();
                            byte[] bArr2 = new byte[16];
                            c0095a.f(bArr2, 0, 16);
                            if (z4 && iT2 == 0) {
                                int iT3 = c0095a.t();
                                byte[] bArr3 = new byte[iT3];
                                c0095a.f(bArr3, 0, iT3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            rVar = new r(z4, strR, iT2, bArr2, i10, i9, bArr);
                            break;
                        }
                        i15 += iG4;
                    }
                    Q0.a.f("tenc atom is mandatory", rVar != null);
                    int i17 = p151v2.t.f17159a;
                    pairCreate = Pair.create(numValueOf, rVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i11 += iG;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0429  */
    /* JADX WARN: Code duplicated, block: B:168:0x0432  */
    /* JADX WARN: Code duplicated, block: B:171:0x043b A[LOOP:4: B:169:0x0438->B:171:0x043b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x0469  */
    /* JADX WARN: Code duplicated, block: B:177:0x046d  */
    /* JADX WARN: Code duplicated, block: B:178:0x046f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0480  */
    /* JADX WARN: Code duplicated, block: B:184:0x0488  */
    /* JADX WARN: Code duplicated, block: B:192:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:193:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:195:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:199:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:200:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:203:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:204:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:206:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:207:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:209:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:211:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:212:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:216:0x0509  */
    /* JADX WARN: Code duplicated, block: B:218:0x0515  */
    /* JADX WARN: Code duplicated, block: B:219:0x052b  */
    /* JADX WARN: Code duplicated, block: B:222:0x0539  */
    /* JADX WARN: Multi-variable type inference failed */
    public static t d(q qVar, a aVar, F1.p pVar) throws C0045t0 {
        d dVar;
        boolean z4;
        int iW;
        int iW2;
        int iW3;
        int i7;
        int[] iArrCopyOf;
        long j;
        boolean z7;
        int i8;
        q qVar2;
        int i9;
        int[] iArr;
        long[] jArr;
        int i10;
        int[] iArr2;
        long[] jArr2;
        int iW4;
        int i11;
        int i12;
        int[] iArr3;
        int i13;
        long[] jArr3;
        long j3;
        int i14;
        boolean z8;
        int[] iArr4;
        int[] iArr5;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr6;
        int i19;
        int[] iArr7;
        int i20;
        int i21;
        long[] jArr4;
        int[] iArr8;
        int[] iArr9;
        long[] jArr5;
        int i22;
        int i23;
        long j7;
        long j8;
        int i24;
        long[] jArr6;
        int i25;
        int[] iArr10;
        int[] iArr11;
        long j9;
        int[] iArr12;
        int i26;
        int i27;
        int i28;
        long j10;
        int i29;
        b bVarY = aVar.y(1937011578);
        X x4 = qVar.f4744f;
        if (bVarY != null) {
            C0095a c0095a = new C0095a();
            C0095a c0095a2 = bVarY.f4636c;
            c0095a.f1465c = c0095a2;
            c0095a2.D(12);
            int iW5 = c0095a2.w();
            if ("audio/raw".equals(x4.f283C)) {
                int iW6 = p151v2.t.w(x4.f298R, x4.f296P);
                if (iW5 == 0 || iW5 % iW6 != 0) {
                    Log.w("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iW6 + ", stsz sample size: " + iW5);
                    iW5 = iW6;
                }
            }
            if (iW5 == 0) {
                iW5 = -1;
            }
            c0095a.f1463a = iW5;
            c0095a.f1464b = c0095a2.w();
            dVar = c0095a;
        } else {
            b bVarY2 = aVar.y(1937013298);
            if (bVarY2 == null) {
                throw C0045t0.a(null, "Track has no sample table size information");
            }
            e eVar = new e();
            C0095a c0095a3 = bVarY2.f4636c;
            eVar.f4650e = c0095a3;
            c0095a3.D(12);
            eVar.f4647b = c0095a3.w() & 255;
            eVar.f4646a = c0095a3.w();
            dVar = eVar;
        }
        int iB = dVar.b();
        if (iB == 0) {
            return new t(qVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        b bVarY3 = aVar.y(1937007471);
        if (bVarY3 == null) {
            bVarY3 = aVar.y(1668232756);
            bVarY3.getClass();
            z4 = true;
        } else {
            z4 = false;
        }
        b bVarY4 = aVar.y(1937011555);
        bVarY4.getClass();
        b bVarY5 = aVar.y(1937011827);
        bVarY5.getClass();
        b bVarY6 = aVar.y(1937011571);
        C0095a c0095a4 = bVarY6 != null ? bVarY6.f4636c : null;
        b bVarY7 = aVar.y(1668576371);
        C0095a c0095a5 = bVarY7 != null ? bVarY7.f4636c : null;
        c cVar = new c(bVarY4.f4636c, bVarY3.f4636c, z4);
        C0095a c0095a6 = bVarY5.f4636c;
        c0095a6.D(12);
        int iW7 = c0095a6.w() - 1;
        int iW8 = c0095a6.w();
        int iW9 = c0095a6.w();
        if (c0095a5 != null) {
            c0095a5.D(12);
            iW = c0095a5.w();
        } else {
            iW = 0;
        }
        if (c0095a4 != null) {
            c0095a4.D(12);
            iW3 = c0095a4.w();
            if (iW3 > 0) {
                iW2 = c0095a4.w() - 1;
            } else {
                iW2 = -1;
                c0095a4 = null;
            }
        } else {
            iW2 = -1;
            iW3 = 0;
        }
        int iA = dVar.a();
        String str = x4.f283C;
        if (iA != -1 && ("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iW7 == 0 && iW == 0 && iW3 == 0) {
            int i30 = cVar.f4637a;
            long[] jArr7 = new long[i30];
            int[] iArr13 = new int[i30];
            while (cVar.a()) {
                int i31 = cVar.f4638b;
                jArr7[i31] = cVar.f4640d;
                iArr13[i31] = cVar.f4639c;
            }
            long j11 = iW9;
            int i32 = 8192 / iA;
            int iG = 0;
            for (int i33 = 0; i33 < i30; i33++) {
                iG += p151v2.t.g(iArr13[i33], i32);
            }
            long[] jArr8 = new long[iG];
            int[] iArr14 = new int[iG];
            long[] jArr9 = new long[iG];
            int[] iArr15 = new int[iG];
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            while (i35 < i30) {
                int i38 = iArr13[i35];
                long j12 = jArr7[i35];
                int i39 = i37;
                int i40 = i30;
                int iMax = i36;
                int i41 = i39;
                long[] jArr10 = jArr7;
                int i42 = i38;
                while (i42 > 0) {
                    int iMin = Math.min(i32, i42);
                    jArr8[i41] = j12;
                    int[] iArr16 = iArr13;
                    int i43 = iA * iMin;
                    iArr14[i41] = i43;
                    iMax = Math.max(iMax, i43);
                    jArr9[i41] = ((long) i34) * j11;
                    iArr15[i41] = 1;
                    j12 += (long) iArr14[i41];
                    i34 += iMin;
                    i42 -= iMin;
                    i41++;
                    iArr13 = iArr16;
                    iA = iA;
                }
                i35++;
                jArr7 = jArr10;
                int i44 = i41;
                i36 = iMax;
                i30 = i40;
                i37 = i44;
            }
            long j13 = j11 * ((long) i34);
            i9 = iB;
            jArr = jArr9;
            iArr2 = iArr15;
            jArr2 = jArr8;
            iArr = iArr14;
            i10 = i36;
            qVar2 = qVar;
            j = j13;
        } else {
            long[] jArrCopyOf = new long[iB];
            int[] iArr17 = new int[iB];
            long[] jArrCopyOf2 = new long[iB];
            int[] iArrCopyOf2 = new int[iB];
            int i45 = iW3;
            int i46 = iW7;
            int iW10 = iW2;
            int i47 = 0;
            int i48 = 0;
            int i49 = 0;
            long j14 = 0;
            int iG2 = 0;
            int iW11 = 0;
            long j15 = 0;
            while (true) {
                if (i47 >= iB) {
                    i7 = i49;
                    iArrCopyOf = iArr17;
                    break;
                }
                boolean zA = true;
                while (i49 == 0) {
                    zA = cVar.a();
                    if (!zA) {
                        break;
                    }
                    j15 = cVar.f4640d;
                    i49 = cVar.f4639c;
                    iB = iB;
                    iW10 = iW10;
                }
                int i50 = iB;
                int i51 = iW10;
                if (!zA) {
                    Log.w("AtomParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i47);
                    iArrCopyOf = Arrays.copyOf(iArr17, i47);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i47);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i47);
                    iB = i47;
                    i7 = i49;
                    break;
                }
                if (c0095a5 != null) {
                    while (iW11 == 0 && iW > 0) {
                        iW11 = c0095a5.w();
                        iG2 = c0095a5.g();
                        iW--;
                    }
                    iW11--;
                }
                int i52 = iG2;
                jArrCopyOf[i47] = j15;
                int iC = dVar.c();
                iArr17[i47] = iC;
                if (iC > i48) {
                    i48 = iC;
                }
                int[] iArr18 = iArr17;
                jArrCopyOf2[i47] = j14 + ((long) i52);
                iArrCopyOf2[i47] = c0095a4 == null ? 1 : 0;
                iW10 = i51;
                if (i47 == iW10) {
                    iArrCopyOf2[i47] = 1;
                    i45--;
                    if (i45 > 0) {
                        c0095a4.getClass();
                        iW10 = c0095a4.w() - 1;
                    }
                }
                long[] jArr11 = jArrCopyOf;
                j14 += (long) iW9;
                int i53 = iW8 - 1;
                if (i53 != 0 || i46 <= 0) {
                    iW4 = i53;
                    i11 = i46;
                } else {
                    iW4 = c0095a6.w();
                    i11 = i46 - 1;
                    iW9 = c0095a6.g();
                }
                int i54 = iW4;
                j15 += (long) iArr18[i47];
                i49--;
                i47++;
                jArrCopyOf = jArr11;
                iG2 = i52;
                iArr17 = iArr18;
                iB = i50;
                int i55 = i11;
                iW8 = i54;
                i46 = i55;
            }
            j = j14 + ((long) iG2);
            if (c0095a5 == null) {
                z7 = true;
                break;
            }
            while (true) {
                if (iW <= 0) {
                    z7 = true;
                    break;
                }
                if (c0095a5.w() != 0) {
                    z7 = false;
                    break;
                }
                c0095a5.g();
                iW--;
            }
            if (i45 == 0 && iW8 == 0 && i7 == 0 && i46 == 0) {
                i8 = iW11;
                if (i8 == 0 && z7) {
                    qVar2 = qVar;
                }
                i9 = iB;
                iArr = iArrCopyOf;
                jArr = jArrCopyOf2;
                i10 = i48;
                iArr2 = iArrCopyOf2;
                jArr2 = jArrCopyOf;
            } else {
                i8 = iW11;
            }
            StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
            qVar2 = qVar;
            sb.append(qVar2.f4739a);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i45);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(iW8);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i7);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i46);
            sb.append(", remainingSamplesAtTimestampOffset ");
            sb.append(i8);
            sb.append(!z7 ? ", ctts invalid" : "");
            Log.w("AtomParsers", sb.toString());
            i9 = iB;
            iArr = iArrCopyOf;
            jArr = jArrCopyOf2;
            i10 = i48;
            iArr2 = iArrCopyOf2;
            jArr2 = jArrCopyOf;
        }
        long jK = p151v2.t.K(j, 1000000L, qVar2.f4741c);
        long j16 = qVar2.f4741c;
        long[] jArr12 = qVar2.f4746h;
        if (jArr12 == null) {
            p151v2.t.L(jArr, j16);
            return new t(qVar, jArr2, iArr, i10, jArr, iArr2, jK);
        }
        int length = jArr12.length;
        int i56 = qVar2.f4740b;
        long[] jArr13 = qVar2.f4747i;
        if (length == 1 && i56 == 1 && jArr.length >= 2) {
            jArr13.getClass();
            long j17 = jArr13[0];
            jArr3 = jArr13;
            i13 = i56;
            long jK2 = j17 + p151v2.t.K(jArr12[0], qVar2.f4741c, qVar2.f4742d);
            int length2 = jArr.length - 1;
            i12 = i9;
            int iJ = p151v2.t.j(4, 0, length2);
            iArr3 = iArr2;
            int iJ2 = p151v2.t.j(jArr.length - 4, 0, length2);
            long j18 = jArr[0];
            if (j18 <= j17 && j17 < jArr[iJ] && jArr[iJ2] < jK2 && jK2 <= j) {
                long jK3 = p151v2.t.K(j17 - j18, x4.f297Q, qVar2.f4741c);
                j3 = j;
                long jK4 = p151v2.t.K(j - jK2, x4.f297Q, qVar2.f4741c);
                if ((jK3 != 0 || jK4 != 0) && jK3 <= 2147483647L && jK4 <= 2147483647L) {
                    pVar.f2561a = (int) jK3;
                    pVar.f2562b = (int) jK4;
                    p151v2.t.L(jArr, j16);
                    return new t(qVar, jArr2, iArr, i10, jArr, iArr3, p151v2.t.K(jArr12[0], 1000000L, qVar2.f4742d));
                }
            }
            if (jArr12.length == 1) {
                i14 = 0;
                if (jArr12[0] == 0) {
                    jArr3.getClass();
                    j10 = jArr3[0];
                    for (i29 = 0; i29 < jArr.length; i29++) {
                        jArr[i29] = p151v2.t.K(jArr[i29] - j10, 1000000L, qVar2.f4741c);
                    }
                    return new t(qVar, jArr2, iArr, i10, jArr, iArr3, p151v2.t.K(j3 - j10, 1000000L, qVar2.f4741c));
                }
            } else {
                i14 = 0;
            }
            if (i13 == 1) {
                z8 = 1;
            } else {
                z8 = i14;
            }
            iArr4 = new int[jArr12.length];
            iArr5 = new int[jArr12.length];
            jArr3.getClass();
            i15 = i14;
            i16 = i15;
            i17 = i16;
            i18 = i17;
            while (i15 < jArr12.length) {
                j9 = jArr3[i15];
                if (j9 != -1) {
                    iArr12 = iArr4;
                    long jK5 = p151v2.t.K(jArr12[i15], qVar2.f4741c, qVar2.f4742d);
                    iArr12[i15] = p151v2.t.f(jArr, j9, true);
                    iArr5[i15] = p151v2.t.b(jArr, j9 + jK5, z8);
                    while (true) {
                        i26 = iArr12[i15];
                        i27 = iArr5[i15];
                        if (i26 >= i27 || (iArr3[i26] & 1) != 0) {
                            break;
                        }
                        iArr12[i15] = i26 + 1;
                    }
                    int i57 = (i27 - i26) + i17;
                    if (i18 != i26) {
                        i28 = 1;
                    } else {
                        i28 = 0;
                    }
                    i16 = i28 | i16;
                    i18 = i27;
                    i17 = i57;
                } else {
                    iArr12 = iArr4;
                }
                i15++;
                iArr4 = iArr12;
                iArr = iArr;
                i10 = i10;
            }
            iArr6 = iArr;
            i19 = i10;
            iArr7 = iArr4;
            if (i17 != i12) {
                i20 = 1;
            } else {
                i20 = 0;
            }
            i21 = i16 | i20;
            if (i21 != 0) {
                jArr4 = new long[i17];
            } else {
                jArr4 = jArr2;
            }
            if (i21 != 0) {
                iArr8 = new int[i17];
            } else {
                iArr8 = iArr6;
            }
            if (i21 != 0) {
                i19 = 0;
            }
            if (i21 != 0) {
                iArr9 = new int[i17];
            } else {
                iArr9 = iArr3;
            }
            jArr5 = new long[i17];
            i22 = 0;
            i23 = 0;
            j7 = 0;
            while (i22 < jArr12.length) {
                j8 = jArr3[i22];
                long[] jArr14 = jArr12;
                i24 = iArr7[i22];
                jArr6 = jArr5;
                i25 = iArr5[i22];
                if (i21 != 0) {
                    int i58 = i25 - i24;
                    System.arraycopy(jArr2, i24, jArr4, i23, i58);
                    iArr10 = iArr6;
                    System.arraycopy(iArr10, i24, iArr8, i23, i58);
                    iArr11 = iArr3;
                    System.arraycopy(iArr11, i24, iArr9, i23, i58);
                } else {
                    iArr10 = iArr6;
                    iArr11 = iArr3;
                }
                int i59 = i19;
                while (i24 < i25) {
                    int[] iArr19 = iArr9;
                    int i60 = i25;
                    long j19 = j7;
                    long j20 = j8;
                    jArr6[i23] = p151v2.t.K(j7, 1000000L, qVar2.f4742d) + p151v2.t.K(Math.max(0L, jArr[i24] - j8), 1000000L, qVar2.f4741c);
                    if (i21 == 0 && iArr8[i23] > i59) {
                        i59 = iArr10[i24];
                    }
                    i23++;
                    i24++;
                    i25 = i60;
                    j7 = j19;
                    j8 = j20;
                    iArr9 = iArr19;
                }
                j7 += jArr14[i22];
                i22++;
                iArr3 = iArr11;
                i19 = i59;
                jArr4 = jArr4;
                jArr12 = jArr14;
                jArr5 = jArr6;
                iArr5 = iArr5;
                iArr9 = iArr9;
                iArr6 = iArr10;
                jArr2 = jArr2;
            }
            return new t(qVar, jArr4, iArr8, i19, jArr5, iArr9, p151v2.t.K(j7, 1000000L, qVar2.f4742d));
        }
        i12 = i9;
        iArr3 = iArr2;
        i13 = i56;
        jArr3 = jArr13;
        j3 = j;
        if (jArr12.length == 1) {
            i14 = 0;
            if (jArr12[0] == 0) {
                jArr3.getClass();
                j10 = jArr3[0];
                while (i29 < jArr.length) {
                    jArr[i29] = p151v2.t.K(jArr[i29] - j10, 1000000L, qVar2.f4741c);
                }
                return new t(qVar, jArr2, iArr, i10, jArr, iArr3, p151v2.t.K(j3 - j10, 1000000L, qVar2.f4741c));
            }
        } else {
            i14 = 0;
        }
        if (i13 == 1) {
            z8 = 1;
        } else {
            z8 = i14;
        }
        iArr4 = new int[jArr12.length];
        iArr5 = new int[jArr12.length];
        jArr3.getClass();
        i15 = i14;
        i16 = i15;
        i17 = i16;
        i18 = i17;
        while (i15 < jArr12.length) {
            j9 = jArr3[i15];
            if (j9 != -1) {
                iArr12 = iArr4;
                long jK6 = p151v2.t.K(jArr12[i15], qVar2.f4741c, qVar2.f4742d);
                iArr12[i15] = p151v2.t.f(jArr, j9, true);
                iArr5[i15] = p151v2.t.b(jArr, j9 + jK6, z8);
                while (true) {
                    i26 = iArr12[i15];
                    i27 = iArr5[i15];
                    if (i26 >= i27) {
                        break;
                    }
                    break;
                    break;
                    iArr12[i15] = i26 + 1;
                }
                int i510 = (i27 - i26) + i17;
                if (i18 != i26) {
                    i28 = 1;
                } else {
                    i28 = 0;
                }
                i16 = i28 | i16;
                i18 = i27;
                i17 = i510;
            } else {
                iArr12 = iArr4;
            }
            i15++;
            iArr4 = iArr12;
            iArr = iArr;
            i10 = i10;
        }
        iArr6 = iArr;
        i19 = i10;
        iArr7 = iArr4;
        if (i17 != i12) {
            i20 = 1;
        } else {
            i20 = 0;
        }
        i21 = i16 | i20;
        if (i21 != 0) {
            jArr4 = new long[i17];
        } else {
            jArr4 = jArr2;
        }
        if (i21 != 0) {
            iArr8 = new int[i17];
        } else {
            iArr8 = iArr6;
        }
        if (i21 != 0) {
            i19 = 0;
        }
        if (i21 != 0) {
            iArr9 = new int[i17];
        } else {
            iArr9 = iArr3;
        }
        jArr5 = new long[i17];
        i22 = 0;
        i23 = 0;
        j7 = 0;
        while (i22 < jArr12.length) {
            j8 = jArr3[i22];
            long[] jArr15 = jArr12;
            i24 = iArr7[i22];
            jArr6 = jArr5;
            i25 = iArr5[i22];
            if (i21 != 0) {
                int i511 = i25 - i24;
                System.arraycopy(jArr2, i24, jArr4, i23, i511);
                iArr10 = iArr6;
                System.arraycopy(iArr10, i24, iArr8, i23, i511);
                iArr11 = iArr3;
                System.arraycopy(iArr11, i24, iArr9, i23, i511);
            } else {
                iArr10 = iArr6;
                iArr11 = iArr3;
            }
            int i512 = i19;
            while (i24 < i25) {
                int[] iArr110 = iArr9;
                int i61 = i25;
                long j110 = j7;
                long j21 = j8;
                jArr6[i23] = p151v2.t.K(j7, 1000000L, qVar2.f4742d) + p151v2.t.K(Math.max(0L, jArr[i24] - j8), 1000000L, qVar2.f4741c);
                if (i21 == 0) {
                }
                i23++;
                i24++;
                i25 = i61;
                j7 = j110;
                j8 = j21;
                iArr9 = iArr110;
            }
            j7 += jArr15[i22];
            i22++;
            iArr3 = iArr11;
            i19 = i512;
            jArr4 = jArr4;
            jArr12 = jArr15;
            jArr5 = jArr6;
            iArr5 = iArr5;
            iArr9 = iArr9;
            iArr6 = iArr10;
            jArr2 = jArr2;
        }
        return new t(qVar, jArr4, iArr8, i19, jArr5, iArr9, p151v2.t.K(j7, 1000000L, qVar2.f4742d));
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0267  */
    /* JADX WARN: Code duplicated, block: B:323:0x0584  */
    /* JADX WARN: Code duplicated, block: B:325:0x0593  */
    /* JADX WARN: Code duplicated, block: B:326:0x0595  */
    /* JADX WARN: Code duplicated, block: B:329:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:331:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:333:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:339:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:341:0x060e  */
    /* JADX WARN: Code duplicated, block: B:344:0x062f A[PHI: r48 r66
      0x062f: PHI (r48v18 java.lang.String) = (r48v11 java.lang.String), (r48v11 java.lang.String), (r48v19 java.lang.String) binds: [B:388:0x078b, B:369:0x06ea, B:343:0x062a] A[DONT_GENERATE, DONT_INLINE]
      0x062f: PHI (r66v10 A1.X) = (r66v4 A1.X), (r66v6 A1.X), (r66v11 A1.X) binds: [B:388:0x078b, B:369:0x06ea, B:343:0x062a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:345:0x0633  */
    /* JADX WARN: Code duplicated, block: B:347:0x0638  */
    /* JADX WARN: Code duplicated, block: B:349:0x0661  */
    /* JADX WARN: Code duplicated, block: B:360:0x068e  */
    /* JADX WARN: Code duplicated, block: B:362:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:364:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:366:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:367:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:370:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:372:0x06f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:373:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:376:0x0714  */
    /* JADX WARN: Code duplicated, block: B:378:0x0719  */
    /* JADX WARN: Code duplicated, block: B:379:0x0736  */
    /* JADX WARN: Code duplicated, block: B:381:0x073b  */
    /* JADX WARN: Code duplicated, block: B:384:0x075a  */
    /* JADX WARN: Code duplicated, block: B:386:0x075f  */
    /* JADX WARN: Code duplicated, block: B:387:0x0787  */
    /* JADX WARN: Code duplicated, block: B:389:0x078d  */
    /* JADX WARN: Code duplicated, block: B:390:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:392:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:394:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:396:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:398:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:402:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:404:0x0803  */
    /* JADX WARN: Code duplicated, block: B:405:0x0805  */
    /* JADX WARN: Code duplicated, block: B:409:0x0813 A[LOOP:4: B:400:0x07f4->B:409:0x0813, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:412:0x0820  */
    /* JADX WARN: Code duplicated, block: B:414:0x082e  */
    /* JADX WARN: Code duplicated, block: B:416:0x0836  */
    /* JADX WARN: Code duplicated, block: B:417:0x084a  */
    /* JADX WARN: Code duplicated, block: B:419:0x085a  */
    /* JADX WARN: Code duplicated, block: B:421:0x0860  */
    /* JADX WARN: Code duplicated, block: B:431:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:435:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:437:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:439:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:440:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:442:0x0909  */
    /* JADX WARN: Code duplicated, block: B:444:0x0910  */
    /* JADX WARN: Code duplicated, block: B:447:0x091e  */
    /* JADX WARN: Code duplicated, block: B:448:0x0921  */
    /* JADX WARN: Code duplicated, block: B:450:0x0926  */
    /* JADX WARN: Code duplicated, block: B:451:0x0928  */
    /* JADX WARN: Code duplicated, block: B:455:0x094a  */
    /* JADX WARN: Code duplicated, block: B:457:0x0959  */
    /* JADX WARN: Code duplicated, block: B:462:0x0972  */
    /* JADX WARN: Code duplicated, block: B:463:0x0974  */
    /* JADX WARN: Code duplicated, block: B:466:0x0983 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:467:0x0985  */
    /* JADX WARN: Code duplicated, block: B:469:0x0988  */
    /* JADX WARN: Code duplicated, block: B:472:0x0998  */
    /* JADX WARN: Code duplicated, block: B:478:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:480:0x09c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:481:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:483:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:486:0x09da  */
    /* JADX WARN: Code duplicated, block: B:488:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:490:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:492:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:606:0x0c5a  */
    /* JADX WARN: Code duplicated, block: B:610:0x0c82  */
    /* JADX WARN: Code duplicated, block: B:611:0x0c88  */
    /* JADX WARN: Code duplicated, block: B:613:0x0cc0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:616:0x0cc6  */
    /* JADX WARN: Code duplicated, block: B:618:0x0cca  */
    /* JADX WARN: Code duplicated, block: B:619:0x0ccf  */
    /* JADX WARN: Code duplicated, block: B:622:0x0cd7  */
    /* JADX WARN: Code duplicated, block: B:628:0x0d18  */
    /* JADX WARN: Code duplicated, block: B:630:0x0d23  */
    /* JADX WARN: Code duplicated, block: B:632:0x0d2c  */
    /* JADX WARN: Code duplicated, block: B:633:0x0d2e  */
    /* JADX WARN: Code duplicated, block: B:635:0x0d48  */
    /* JADX WARN: Code duplicated, block: B:637:0x0d4b  */
    /* JADX WARN: Code duplicated, block: B:638:0x0d50  */
    /* JADX WARN: Code duplicated, block: B:641:0x0d58  */
    /* JADX WARN: Code duplicated, block: B:642:0x0d5d  */
    /* JADX WARN: Code duplicated, block: B:645:0x0d6a A[LOOP:7: B:634:0x0d46->B:645:0x0d6a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:650:0x0d7f  */
    /* JADX WARN: Code duplicated, block: B:651:0x0d88  */
    /* JADX WARN: Code duplicated, block: B:654:0x0d8e  */
    /* JADX WARN: Code duplicated, block: B:655:0x0d90  */
    /* JADX WARN: Code duplicated, block: B:665:0x0700 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x0d71 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x081a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x07e6 A[EDGE_INSN: B:679:0x07e6->B:393:0x07e6 BREAK  A[LOOP:4: B:400:0x07f4->B:409:0x0813], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x0c72 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0129  */
    /* JADX WARN: Code duplicated, block: B:74:0x012e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0131  */
    /* JADX WARN: Code duplicated, block: B:78:0x0144  */
    /* JADX WARN: Code duplicated, block: B:79:0x0147  */
    /* JADX WARN: Code duplicated, block: B:83:0x0158  */
    /* JADX WARN: Code duplicated, block: B:86:0x0190  */
    /* JADX WARN: Code duplicated, block: B:87:0x0193  */
    /* JADX WARN: Code duplicated, block: B:90:0x019e  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:96:0x020b  */
    /* JADX WARN: Code duplicated, block: B:97:0x020d  */
    public static ArrayList e(a aVar, F1.p pVar, long j, DrmInitData drmInitData, boolean z4, boolean z7, D3.g gVar) throws C0045t0 {
        int i7;
        long jU;
        int i8;
        int i9;
        long j3;
        C0095a c0095a;
        int i10;
        long jU2;
        long jK;
        int iL;
        int i11;
        int i12;
        Pair pairCreate;
        String str;
        C0095a c0095a2;
        int iG;
        r[] rVarArr;
        int i13;
        X x4;
        int i14;
        int i15;
        ArrayList arrayList;
        int i16;
        a aVar2;
        Pair pair;
        int i17;
        long j7;
        r[] rVarArr2;
        X x7;
        long[] jArr;
        long[] jArr2;
        q qVar;
        a aVarT;
        b bVarY;
        C0095a c0095a3;
        int iL2;
        int iW;
        long[] jArr3;
        long[] jArr4;
        int i18;
        Pair pairCreate2;
        long jU3;
        long jG;
        int i19;
        int iG2;
        boolean z8;
        int iG3;
        int i20;
        String str2;
        r[] rVarArr3;
        X x8;
        int iY;
        int iY2;
        int i21;
        int i22;
        DrmInitData drmInitDataA;
        String str3;
        boolean z9;
        DrmInitData drmInitData2;
        String str4;
        float f7;
        int i23;
        int i24;
        String str5;
        byte[] bArr;
        ByteBuffer byteBufferOrder;
        C0321h c0321h;
        int i25;
        int i26;
        int i27;
        int i28;
        List list;
        List list2;
        float f8;
        byte[] bArr2;
        Format$Builder format$Builder;
        int i29;
        int i30;
        int i31;
        byte[] bArrArray;
        int i32;
        int iG4;
        boolean z10;
        int iG5;
        float fW;
        byte[] bArr3;
        J0.a aVarC;
        int i33;
        int i34;
        int i35;
        byte[] bArrCopyOfRange;
        boolean z11;
        p156w2.e eVarA;
        boolean z12;
        p156w2.a aVarA;
        Pair pairC;
        int iY3;
        String str6;
        int iRound;
        int i36;
        int iW2;
        int i37;
        int i38;
        int i39;
        DrmInitData drmInitDataA2;
        String str7;
        int i40;
        int iIntValue;
        int i41;
        int i42;
        String str8;
        C0321h c0321h2;
        List listI;
        int iG6;
        String str9;
        boolean z13;
        int iG7;
        String str10;
        int i43;
        int i44;
        boolean z14;
        String str11;
        int iG8;
        boolean z15;
        C0321h c0321h3;
        C0321h c0321hA;
        byte[] bArr4;
        String str12;
        int[] iArr;
        int[] iArr2;
        List listI2;
        int i45;
        int iT;
        int i46;
        String str13;
        int iT2;
        int i47;
        long j8;
        L lI;
        ArrayList arrayList2 = new ArrayList();
        int i48 = 0;
        while (true) {
            ArrayList arrayList3 = aVar.f4635e;
            if (i48 >= arrayList3.size()) {
                return arrayList2;
            }
            a aVar3 = (a) arrayList3.get(i48);
            if (aVar3.f1675b != 1953653099) {
                i16 = i48;
            } else {
                b bVarY2 = aVar.y(1836476516);
                bVarY2.getClass();
                a aVarT2 = aVar3.t(1835297121);
                aVarT2.getClass();
                b bVarY3 = aVarT2.y(1751411826);
                bVarY3.getClass();
                C0095a c0095a4 = bVarY3.f4636c;
                c0095a4.D(16);
                int iG9 = c0095a4.g();
                if (iG9 == 1936684398) {
                    i7 = 1;
                } else if (iG9 == 1986618469) {
                    i7 = 2;
                } else if (iG9 == 1952807028 || iG9 == 1935832172 || iG9 == 1937072756 || iG9 == 1668047728) {
                    i7 = 3;
                } else {
                    i7 = iG9 == 1835365473 ? 5 : -1;
                }
                if (i7 == -1) {
                    arrayList = arrayList2;
                    i16 = i48;
                    qVar = null;
                } else {
                    b bVarY4 = aVar3.y(1953196132);
                    bVarY4.getClass();
                    C0095a c0095a5 = bVarY4.f4636c;
                    c0095a5.D(8);
                    int iL3 = D1.a.l(c0095a5.g());
                    c0095a5.E(iL3 == 0 ? 8 : 16);
                    int iG10 = c0095a5.g();
                    c0095a5.E(4);
                    int i49 = c0095a5.f1463a;
                    int i50 = iL3 == 0 ? 4 : 8;
                    int i51 = 0;
                    while (true) {
                        if (i51 >= i50) {
                            c0095a5.E(i50);
                        } else {
                            if (((byte[]) c0095a5.f1465c)[i49 + i51] != -1) {
                                jU = iL3 == 0 ? c0095a5.u() : c0095a5.x();
                                if (jU != 0) {
                                    break;
                                }
                                break;
                            }
                            i51++;
                        }
                        jU = -9223372036854775807L;
                        break;
                    }
                    c0095a5.E(16);
                    int iG11 = c0095a5.g();
                    int iG12 = c0095a5.g();
                    c0095a5.E(4);
                    int iG13 = c0095a5.g();
                    int iG14 = c0095a5.g();
                    if (iG11 == 0 && iG12 == 65536) {
                        i8 = -65536;
                        if (iG13 == -65536 && iG14 == 0) {
                            i9 = 90;
                        }
                        if (j == -9223372036854775807L) {
                            j3 = jU;
                        } else {
                            j3 = j;
                        }
                        c0095a = bVarY2.f4636c;
                        c0095a.D(8);
                        if (D1.a.l(c0095a.g()) == 0) {
                            i10 = 8;
                        } else {
                            i10 = 16;
                        }
                        c0095a.E(i10);
                        jU2 = c0095a.u();
                        jK = j3 != -9223372036854775807L ? p151v2.t.K(j3, 1000000L, jU2) : -9223372036854775807L;
                        a aVarT3 = aVarT2.t(1835626086);
                        aVarT3.getClass();
                        a aVarT4 = aVarT3.t(1937007212);
                        aVarT4.getClass();
                        b bVarY5 = aVarT2.y(1835296868);
                        bVarY5.getClass();
                        C0095a c0095a6 = bVarY5.f4636c;
                        c0095a6.D(8);
                        iL = D1.a.l(c0095a6.g());
                        if (iL == 0) {
                            i11 = 8;
                        } else {
                            i11 = 16;
                        }
                        c0095a6.E(i11);
                        long jU4 = c0095a6.u();
                        if (iL == 0) {
                            i12 = 4;
                        } else {
                            i12 = 8;
                        }
                        c0095a6.E(i12);
                        int iY4 = c0095a6.y();
                        pairCreate = Pair.create(Long.valueOf(jU4), "" + ((char) (((iY4 >> 10) & 31) + 96)) + ((char) (((iY4 >> 5) & 31) + 96)) + ((char) ((iY4 & 31) + 96)));
                        b bVarY6 = aVarT4.y(1937011556);
                        bVarY6.getClass();
                        str = (String) pairCreate.second;
                        c0095a2 = bVarY6.f4636c;
                        c0095a2.D(12);
                        iG = c0095a2.g();
                        rVarArr = new r[iG];
                        i13 = 0;
                        x4 = null;
                        i14 = 0;
                        i15 = 0;
                        while (i13 < iG) {
                            int i52 = iG;
                            i19 = c0095a2.f1463a;
                            int i53 = i48;
                            iG2 = c0095a2.g();
                            ArrayList arrayList4 = arrayList2;
                            long j9 = jU2;
                            if (iG2 > 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            Q0.a.f("childAtomSize must be positive", z8);
                            iG3 = c0095a2.g();
                            if (iG3 != 1635148593 || iG3 == 1635148595 || iG3 == 1701733238 || iG3 == 1831958048 || iG3 == 1836070006 || iG3 == 1752589105 || iG3 == 1751479857 || iG3 == 1932670515 || iG3 == 1211250227 || iG3 == 1987063864 || iG3 == 1987063865 || iG3 == 1635135537 || iG3 == 1685479798 || iG3 == 1685479729 || iG3 == 1685481573 || iG3 == 1685481521) {
                                i13 = i13;
                                i20 = i9;
                                aVar3 = aVar3;
                                pairCreate = pairCreate;
                                str2 = "childAtomSize must be positive";
                                rVarArr3 = rVarArr;
                                x8 = x4;
                                c0095a2.D(i19 + 16);
                                c0095a2.E(16);
                                iY = c0095a2.y();
                                iY2 = c0095a2.y();
                                c0095a2.E(50);
                                i21 = c0095a2.f1463a;
                                if (iG3 == 1701733238) {
                                    iG2 = iG2;
                                    i22 = i19;
                                    pairC = c(c0095a2, i22, iG2);
                                    if (pairC != null) {
                                        iG3 = ((Integer) pairC.first).intValue();
                                        if (drmInitData == null) {
                                            drmInitDataA = null;
                                        } else {
                                            drmInitDataA = drmInitData.a(((r) pairC.second).f4750b);
                                        }
                                        rVarArr3[i13] = (r) pairC.second;
                                    } else {
                                        drmInitDataA = drmInitData;
                                    }
                                    c0095a2.D(i21);
                                } else {
                                    iG2 = iG2;
                                    i22 = i19;
                                    drmInitDataA = drmInitData;
                                }
                                if (iG3 == 1831958048) {
                                    str3 = "video/mpeg";
                                } else if (iG3 == 1211250227) {
                                    str3 = "video/3gpp";
                                } else {
                                    str3 = null;
                                }
                                z9 = false;
                                str = str;
                                drmInitData2 = drmInitDataA;
                                str4 = str3;
                                f7 = 1.0f;
                                i23 = i15;
                                i24 = -1;
                                str5 = null;
                                bArr = null;
                                byteBufferOrder = null;
                                c0321h = null;
                                i25 = -1;
                                i26 = -1;
                                i27 = -1;
                                i28 = i21;
                                list = null;
                                while (true) {
                                    if (i28 - i22 >= iG2) {
                                        list2 = list;
                                        i24 = i24;
                                        break;
                                    }
                                    c0095a2.D(i28);
                                    i32 = c0095a2.f1463a;
                                    list2 = list;
                                    iG4 = c0095a2.g();
                                    i24 = i24;
                                    if (iG4 != 0 && c0095a2.f1463a - i22 == iG2) {
                                        break;
                                    }
                                    if (iG4 > 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    Q0.a.f(str2, z10);
                                    iG5 = c0095a2.g();
                                    String str14 = str2;
                                    if (iG5 == 1635148611) {
                                        if (str4 == null) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        Q0.a.f(null, z12);
                                        c0095a2.D(i32 + 8);
                                        aVarA = p156w2.a.a(c0095a2);
                                        if (!z9) {
                                            f7 = aVarA.f17960e;
                                        }
                                        ArrayList arrayList5 = aVarA.f17956a;
                                        int i54 = aVarA.f17957b;
                                        iY = iY;
                                        iY2 = iY2;
                                        iG3 = iG3;
                                        i22 = i22;
                                        str5 = aVarA.f17961f;
                                        list2 = arrayList5;
                                        i23 = i54;
                                        fW = f7;
                                        str4 = "video/avc";
                                    } else if (iG5 == 1752589123) {
                                        if (str4 == null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        Q0.a.f(null, z11);
                                        c0095a2.D(i32 + 8);
                                        eVarA = p156w2.e.a(c0095a2);
                                        if (!z9) {
                                            f7 = eVarA.f17982c;
                                        }
                                        int i55 = eVarA.f17981b;
                                        List list3 = eVarA.f17980a;
                                        iY = iY;
                                        iY2 = iY2;
                                        iG3 = iG3;
                                        i22 = i22;
                                        str5 = eVarA.f17983d;
                                        i23 = i55;
                                        str4 = "video/hevc";
                                        fW = f7;
                                        list2 = list3;
                                    } else {
                                        if (iG5 != 1685480259 || iG5 == 1685485123) {
                                            iY = iY;
                                            iY2 = iY2;
                                            iG3 = iG3;
                                            i22 = i22;
                                            iG2 = iG2;
                                            fW = f7;
                                            bArr3 = bArr;
                                            aVarC = J0.a.c(c0095a2);
                                            if (aVarC != null) {
                                                str5 = aVarC.f3771b;
                                                str4 = "video/dolby-vision";
                                            }
                                        } else {
                                            if (iG5 == 1987076931) {
                                                Q0.a.f(null, str4 == null);
                                                str4 = iG3 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            } else {
                                                if (iG5 == 1635135811) {
                                                    Q0.a.f(null, str4 == null);
                                                    str4 = "video/av01";
                                                } else if (iG5 == 1668050025) {
                                                    if (byteBufferOrder == null) {
                                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer = byteBufferOrder;
                                                    byteBuffer.position(21);
                                                    byteBuffer.putShort(c0095a2.q());
                                                    byteBuffer.putShort(c0095a2.q());
                                                    byteBufferOrder = byteBuffer;
                                                    fW = f7;
                                                } else if (iG5 == 1835295606) {
                                                    if (byteBufferOrder == null) {
                                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer2 = byteBufferOrder;
                                                    short sQ = c0095a2.q();
                                                    short sQ2 = c0095a2.q();
                                                    iG3 = iG3;
                                                    short sQ3 = c0095a2.q();
                                                    i22 = i22;
                                                    short sQ4 = c0095a2.q();
                                                    iG2 = iG2;
                                                    short sQ5 = c0095a2.q();
                                                    byte[] bArr5 = bArr;
                                                    short sQ6 = c0095a2.q();
                                                    fW = f7;
                                                    short sQ7 = c0095a2.q();
                                                    iY2 = iY2;
                                                    short sQ8 = c0095a2.q();
                                                    long jU5 = c0095a2.u();
                                                    long jU6 = c0095a2.u();
                                                    iY = iY;
                                                    byteBuffer2.position(1);
                                                    byteBuffer2.putShort(sQ5);
                                                    byteBuffer2.putShort(sQ6);
                                                    byteBuffer2.putShort(sQ);
                                                    byteBuffer2.putShort(sQ2);
                                                    byteBuffer2.putShort(sQ3);
                                                    byteBuffer2.putShort(sQ4);
                                                    byteBuffer2.putShort(sQ7);
                                                    byteBuffer2.putShort(sQ8);
                                                    byteBuffer2.putShort((short) (jU5 / 10000));
                                                    byteBuffer2.putShort((short) (jU6 / 10000));
                                                    byteBufferOrder = byteBuffer2;
                                                    bArr = bArr5;
                                                } else {
                                                    iY = iY;
                                                    iY2 = iY2;
                                                    iG3 = iG3;
                                                    i22 = i22;
                                                    iG2 = iG2;
                                                    fW = f7;
                                                    bArr3 = bArr;
                                                    if (iG5 == 1681012275) {
                                                        Q0.a.f(null, str4 == null);
                                                        str4 = "video/3gpp";
                                                        i24 = i24;
                                                        bArr = bArr3;
                                                    } else if (iG5 == 1702061171) {
                                                        Q0.a.f(null, str4 == null);
                                                        C0321h c0321hA2 = a(i32, c0095a2);
                                                        byte[] bArr6 = (byte[]) c0321hA2.f4019e;
                                                        List listI3 = bArr6 != null ? AbstractC0167z.I(bArr6) : list2;
                                                        str4 = (String) c0321hA2.f4018d;
                                                        c0321h = c0321hA2;
                                                        list2 = listI3;
                                                        i24 = i24;
                                                        bArr = bArr3;
                                                    } else if (iG5 == 1885434736) {
                                                        c0095a2.D(i32 + 8);
                                                        fW = c0095a2.w() / c0095a2.w();
                                                        i24 = i24;
                                                        bArr = bArr3;
                                                        z9 = true;
                                                    } else if (iG5 == 1937126244) {
                                                        int i56 = i32 + 8;
                                                        while (true) {
                                                            if (i56 - i32 >= iG4) {
                                                                bArrCopyOfRange = null;
                                                                break;
                                                            }
                                                            c0095a2.D(i56);
                                                            int iG15 = c0095a2.g();
                                                            if (c0095a2.g() == 1886547818) {
                                                                bArrCopyOfRange = Arrays.copyOfRange((byte[]) c0095a2.f1465c, i56, iG15 + i56);
                                                                break;
                                                            }
                                                            i56 += iG15;
                                                        }
                                                        bArr = bArrCopyOfRange;
                                                        i24 = i24;
                                                    } else if (iG5 == 1936995172) {
                                                        int iT3 = c0095a2.t();
                                                        c0095a2.E(3);
                                                        if (iT3 == 0) {
                                                            int iT4 = c0095a2.t();
                                                            if (iT4 == 0) {
                                                                i24 = 0;
                                                            } else if (iT4 == 1) {
                                                                i24 = 1;
                                                            } else if (iT4 == 2) {
                                                                i24 = 2;
                                                            } else if (iT4 == 3) {
                                                                i24 = 3;
                                                            }
                                                        }
                                                        i24 = i24;
                                                        bArr = bArr3;
                                                    } else if (iG5 == 1668246642) {
                                                        int iG16 = c0095a2.g();
                                                        if (iG16 == 1852009592 || iG16 == 1852009571) {
                                                            int iY5 = c0095a2.y();
                                                            int iY6 = c0095a2.y();
                                                            c0095a2.E(2);
                                                            boolean z16 = iG4 == 19 && (c0095a2.t() & 128) != 0;
                                                            int iA = p156w2.b.a(iY5);
                                                            if (z16) {
                                                                i33 = 1;
                                                                i34 = 1;
                                                            } else {
                                                                i33 = 1;
                                                                i34 = 2;
                                                            }
                                                            if (iY6 != i33) {
                                                                if (iY6 != 16) {
                                                                    i35 = 7;
                                                                    if (iY6 != 18) {
                                                                        if (iY6 != 6 && iY6 != 7) {
                                                                            i35 = -1;
                                                                        }
                                                                    }
                                                                } else {
                                                                    i35 = 6;
                                                                }
                                                                i26 = iA;
                                                                i25 = i34;
                                                                i27 = i35;
                                                            }
                                                            i35 = 3;
                                                            i26 = iA;
                                                            i25 = i34;
                                                            i27 = i35;
                                                        } else {
                                                            Log.w("AtomParsers", "Unsupported color type: " + D1.a.c(iG16));
                                                        }
                                                    }
                                                }
                                                i28 += iG4;
                                                list = list2;
                                                iG3 = iG3;
                                                i22 = i22;
                                                iG2 = iG2;
                                                f7 = fW;
                                                iY2 = iY2;
                                                iY = iY;
                                                str2 = str14;
                                            }
                                            fW = f7;
                                        }
                                        i24 = i24;
                                        bArr = bArr3;
                                        i28 += iG4;
                                        list = list2;
                                        iG3 = iG3;
                                        i22 = i22;
                                        iG2 = iG2;
                                        f7 = fW;
                                        iY2 = iY2;
                                        iY = iY;
                                        str2 = str14;
                                    }
                                    i28 += iG4;
                                    list = list2;
                                    iG3 = iG3;
                                    i22 = i22;
                                    iG2 = iG2;
                                    f7 = fW;
                                    iY2 = iY2;
                                    iY = iY;
                                    str2 = str14;
                                }
                                f8 = f7;
                                bArr2 = bArr;
                                if (str4 == null) {
                                    i9 = i20;
                                    x4 = x8;
                                } else {
                                    format$Builder = new Format$Builder();
                                    format$Builder.f10528a = Integer.toString(iG10);
                                    format$Builder.f10537k = str4;
                                    format$Builder.f10535h = str5;
                                    format$Builder.f10542p = iY;
                                    format$Builder.f10543q = iY2;
                                    format$Builder.f10546t = f8;
                                    i9 = i20;
                                    format$Builder.f10545s = i9;
                                    format$Builder.f10547u = bArr2;
                                    format$Builder.f10548v = i24;
                                    format$Builder.f10539m = list2;
                                    format$Builder.f10540n = drmInitData2;
                                    i29 = i26;
                                    i30 = i25;
                                    i31 = i27;
                                    if (i29 == -1 || i30 != -1 || i31 != -1 || byteBufferOrder != null) {
                                        if (byteBufferOrder != null) {
                                            bArrArray = byteBufferOrder.array();
                                        } else {
                                            bArrArray = null;
                                        }
                                        format$Builder.f10549w = new p156w2.b(i29, bArrArray, i30, i31);
                                    }
                                    if (c0321h != null) {
                                        C0321h c0321h4 = c0321h;
                                        format$Builder.f10533f = c0321h4.f4016b;
                                        format$Builder.f10534g = c0321h4.f4017c;
                                    }
                                    x4 = new X(format$Builder);
                                }
                                i15 = i23;
                            } else if (iG3 == 1836069985 || iG3 == 1701733217 || iG3 == 1633889587 || iG3 == 1700998451 || iG3 == 1633889588 || iG3 == 1835823201 || iG3 == 1685353315 || iG3 == 1685353317 || iG3 == 1685353320 || iG3 == 1685353324 || iG3 == 1685353336 || iG3 == 1935764850 || iG3 == 1935767394 || iG3 == 1819304813 || iG3 == 1936684916 || iG3 == 1953984371 || iG3 == 778924082 || iG3 == 778924083 || iG3 == 1835557169 || iG3 == 1835560241 || iG3 == 1634492771 || iG3 == 1634492791 || iG3 == 1970037111 || iG3 == 1332770163 || iG3 == 1716281667) {
                                pairCreate = pairCreate;
                                c0095a2.D(i19 + 16);
                                if (z7) {
                                    iY3 = c0095a2.y();
                                    c0095a2.E(6);
                                } else {
                                    c0095a2.E(8);
                                    iY3 = 0;
                                }
                                if (iY3 == 0 || iY3 == 1) {
                                    int iY7 = c0095a2.y();
                                    c0095a2.E(6);
                                    byte[] bArr7 = (byte[]) c0095a2.f1465c;
                                    int i57 = c0095a2.f1463a;
                                    str6 = "childAtomSize must be positive";
                                    int i58 = i57 + 1;
                                    c0095a2.f1463a = i58;
                                    int i59 = (bArr7[i57] & 255) << 8;
                                    c0095a2.f1463a = i57 + 2;
                                    int i60 = (bArr7[i58] & 255) | i59;
                                    c0095a2.f1463a = i57 + 4;
                                    c0095a2.D(i57);
                                    int iG17 = c0095a2.g();
                                    if (iY3 == 1) {
                                        c0095a2.E(16);
                                    }
                                    iRound = i60;
                                    i36 = iG17;
                                    iW2 = iY7;
                                } else {
                                    if (iY3 == 2) {
                                        c0095a2.E(16);
                                        iRound = (int) Math.round(Double.longBitsToDouble(c0095a2.n()));
                                        iW2 = c0095a2.w();
                                        c0095a2.E(20);
                                        str6 = "childAtomSize must be positive";
                                        i36 = 0;
                                    } else {
                                        i13 = i13;
                                        i39 = i9;
                                        i38 = iG2;
                                        aVar3 = aVar3;
                                        i37 = i19;
                                        rVarArr3 = rVarArr;
                                    }
                                    i9 = i39;
                                    iG2 = i38;
                                    i22 = i37;
                                }
                                int i61 = c0095a2.f1463a;
                                if (iG3 == 1701733217) {
                                    Pair pairC2 = c(c0095a2, i19, iG2);
                                    if (pairC2 != null) {
                                        iG3 = ((Integer) pairC2.first).intValue();
                                        drmInitDataA2 = drmInitData == null ? null : drmInitData.a(((r) pairC2.second).f4750b);
                                        rVarArr[i13] = (r) pairC2.second;
                                    } else {
                                        drmInitDataA2 = drmInitData;
                                    }
                                    c0095a2.D(i61);
                                } else {
                                    drmInitDataA2 = drmInitData;
                                }
                                String str15 = "audio/ac3";
                                int i62 = iRound;
                                if (iG3 == 1633889587) {
                                    str7 = "audio/ac3";
                                } else if (iG3 == 1700998451) {
                                    str7 = "audio/eac3";
                                } else if (iG3 == 1633889588) {
                                    str7 = "audio/ac4";
                                } else if (iG3 == 1685353315) {
                                    str7 = "audio/vnd.dts";
                                } else if (iG3 == 1685353320 || iG3 == 1685353324) {
                                    str7 = "audio/vnd.dts.hd";
                                } else if (iG3 == 1685353317) {
                                    str7 = "audio/vnd.dts.hd;profile=lbr";
                                } else if (iG3 == 1685353336) {
                                    str7 = "audio/vnd.dts.uhd;profile=p2";
                                } else if (iG3 == 1935764850) {
                                    str7 = "audio/3gpp";
                                } else if (iG3 == 1935767394) {
                                    str7 = "audio/amr-wb";
                                } else {
                                    if (iG3 == 1819304813 || iG3 == 1936684916) {
                                        str7 = "audio/raw";
                                        i40 = 2;
                                    } else if (iG3 == 1953984371) {
                                        i40 = 268435456;
                                        str7 = "audio/raw";
                                    } else if (iG3 == 778924082 || iG3 == 778924083) {
                                        str7 = "audio/mpeg";
                                    } else if (iG3 == 1835557169) {
                                        str7 = "audio/mha1";
                                    } else if (iG3 == 1835560241) {
                                        str7 = "audio/mhm1";
                                    } else if (iG3 == 1634492771) {
                                        str7 = "audio/alac";
                                    } else if (iG3 == 1634492791) {
                                        str7 = "audio/g711-alaw";
                                    } else if (iG3 == 1970037111) {
                                        str7 = "audio/g711-mlaw";
                                    } else if (iG3 == 1332770163) {
                                        str7 = "audio/opus";
                                    } else if (iG3 == 1716281667) {
                                        str7 = "audio/flac";
                                    } else {
                                        str7 = iG3 == 1835823201 ? "audio/true-hd" : null;
                                    }
                                    i13 = i13;
                                    i39 = i9;
                                    iIntValue = iW2;
                                    rVarArr3 = rVarArr;
                                    i41 = i61;
                                    i42 = i62;
                                    str8 = null;
                                    c0321h2 = null;
                                    listI = null;
                                    while (i41 - i19 < iG2) {
                                        c0095a2.D(i41);
                                        iG6 = c0095a2.g();
                                        int i63 = iG2;
                                        int i64 = i19;
                                        str9 = str6;
                                        if (iG6 > 0) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        Q0.a.f(str9, z13);
                                        iG7 = c0095a2.g();
                                        int i65 = i40;
                                        if (iG7 == 1835557187) {
                                            int i66 = iG6 - 13;
                                            byte[] bArr8 = new byte[i66];
                                            c0095a2.D(i41 + 13);
                                            c0095a2.f(bArr8, 0, i66);
                                            listI = AbstractC0167z.I(bArr8);
                                            str15 = str15;
                                            str11 = str9;
                                            str8 = str8;
                                        } else {
                                            str10 = str8;
                                            if (iG7 == 1702061171) {
                                                i43 = 1702061171;
                                            } else if (z7 || iG7 != 2002876005) {
                                                iArr = AbstractC0096b.f1471f;
                                                iArr2 = AbstractC0096b.f1469d;
                                                if (iG7 == 1684103987) {
                                                    c0095a2.D(i41 + 8);
                                                    String string = Integer.toString(iG10);
                                                    int i67 = iArr2[(c0095a2.t() & 192) >> 6];
                                                    iT2 = c0095a2.t();
                                                    i47 = iArr[(iT2 & 56) >> 3];
                                                    if ((iT2 & 4) != 0) {
                                                        i47++;
                                                    }
                                                    Format$Builder format$Builder2 = new Format$Builder();
                                                    format$Builder2.f10528a = string;
                                                    format$Builder2.f10537k = str15;
                                                    format$Builder2.f10550x = i47;
                                                    format$Builder2.f10551y = i67;
                                                    format$Builder2.f10540n = drmInitDataA2;
                                                    format$Builder2.f10530c = str;
                                                    x4 = new X(format$Builder2);
                                                    str15 = str15;
                                                } else if (iG7 == 1684366131) {
                                                    c0095a2.D(i41 + 8);
                                                    String string2 = Integer.toString(iG10);
                                                    c0095a2.E(2);
                                                    int i68 = iArr2[(c0095a2.t() & 192) >> 6];
                                                    iT = c0095a2.t();
                                                    i46 = iArr[(iT & 14) >> 1];
                                                    if ((iT & 1) != 0) {
                                                        i46++;
                                                    }
                                                    if (((c0095a2.t() & 30) >> 1) > 0 && (c0095a2.t() & 2) != 0) {
                                                        i46 += 2;
                                                    }
                                                    if (c0095a2.d() > 0 || (c0095a2.t() & 1) == 0) {
                                                        str13 = "audio/eac3";
                                                    } else {
                                                        str13 = "audio/eac3-joc";
                                                    }
                                                    Format$Builder format$Builder3 = new Format$Builder();
                                                    format$Builder3.f10528a = string2;
                                                    format$Builder3.f10537k = str13;
                                                    format$Builder3.f10550x = i46;
                                                    format$Builder3.f10551y = i68;
                                                    format$Builder3.f10540n = drmInitDataA2;
                                                    format$Builder3.f10530c = str;
                                                    x4 = new X(format$Builder3);
                                                } else {
                                                    str15 = str15;
                                                    if (iG7 == 1684103988) {
                                                        c0095a2.D(i41 + 8);
                                                        String string3 = Integer.toString(iG10);
                                                        c0095a2.E(1);
                                                        if (((c0095a2.t() & 32) >> 5) == 1) {
                                                            i45 = 48000;
                                                        } else {
                                                            i45 = 44100;
                                                        }
                                                        Format$Builder format$Builder4 = new Format$Builder();
                                                        format$Builder4.f10528a = string3;
                                                        format$Builder4.f10537k = "audio/ac4";
                                                        format$Builder4.f10550x = 2;
                                                        format$Builder4.f10551y = i45;
                                                        format$Builder4.f10540n = drmInitDataA2;
                                                        format$Builder4.f10530c = str;
                                                        x4 = new X(format$Builder4);
                                                    } else if (iG7 == 1684892784) {
                                                        if (iG7 == 1684305011) {
                                                            Format$Builder format$Builder5 = new Format$Builder();
                                                            format$Builder5.f10528a = Integer.toString(iG10);
                                                            format$Builder5.f10537k = str7;
                                                            format$Builder5.f10550x = iIntValue;
                                                            format$Builder5.f10551y = i42;
                                                            format$Builder5.f10540n = drmInitDataA2;
                                                            format$Builder5.f10530c = str;
                                                            x4 = new X(format$Builder5);
                                                        } else {
                                                            if (iG7 == 1682927731) {
                                                                int i69 = iG6 - 8;
                                                                byte[] bArr9 = f4651a;
                                                                byte[] bArrCopyOf = Arrays.copyOf(bArr9, bArr9.length + i69);
                                                                c0095a2.D(i41 + 8);
                                                                c0095a2.f(bArrCopyOf, bArr9.length, i69);
                                                                listI2 = AbstractC0096b.a(bArrCopyOf);
                                                            } else if (iG7 == 1684425825) {
                                                                byte[] bArr10 = new byte[iG6 - 8];
                                                                bArr10[0] = 102;
                                                                bArr10[1] = 76;
                                                                bArr10[2] = 97;
                                                                bArr10[3] = 67;
                                                                c0095a2.D(i41 + 12);
                                                                c0095a2.f(bArr10, 4, iG6 - 12);
                                                                listI2 = AbstractC0167z.I(bArr10);
                                                            } else if (iG7 == 1634492771) {
                                                                int i70 = iG6 - 12;
                                                                byte[] bArr11 = new byte[i70];
                                                                c0095a2.D(i41 + 12);
                                                                c0095a2.f(bArr11, 0, i70);
                                                                C0095a c0095a7 = new C0095a(bArr11);
                                                                c0095a7.D(9);
                                                                int iT5 = c0095a7.t();
                                                                c0095a7.D(20);
                                                                Pair pairCreate3 = Pair.create(Integer.valueOf(c0095a7.w()), Integer.valueOf(iT5));
                                                                int iIntValue2 = ((Integer) pairCreate3.first).intValue();
                                                                iIntValue = ((Integer) pairCreate3.second).intValue();
                                                                listI = AbstractC0167z.I(bArr11);
                                                                i42 = iIntValue2;
                                                            }
                                                            listI = listI2;
                                                        }
                                                        str8 = str10;
                                                        str11 = str9;
                                                    } else {
                                                        if (i36 > 0) {
                                                            throw C0045t0.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + i36);
                                                        }
                                                        i42 = i36;
                                                        str8 = str10;
                                                        str11 = str9;
                                                        iIntValue = 2;
                                                    }
                                                    str8 = str10;
                                                    str11 = str9;
                                                }
                                                str8 = str10;
                                                str11 = str9;
                                            } else {
                                                i43 = 1702061171;
                                            }
                                            if (iG7 == i43) {
                                                i44 = c0095a2.f1463a;
                                                if (i44 >= i41) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                Q0.a.f(null, z14);
                                                while (true) {
                                                    if (i44 - i41 < iG6) {
                                                        str11 = str9;
                                                        i44 = -1;
                                                        break;
                                                    }
                                                    c0095a2.D(i44);
                                                    iG8 = c0095a2.g();
                                                    str11 = str9;
                                                    if (iG8 > 0) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                    Q0.a.f(str11, z15);
                                                    if (c0095a2.g() == 1702061171) {
                                                        break;
                                                    }
                                                    i44 += iG8;
                                                    str9 = str11;
                                                }
                                            } else {
                                                i44 = i41;
                                                str11 = str9;
                                            }
                                            if (i44 != -1) {
                                                c0321hA = a(i44, c0095a2);
                                                str7 = (String) c0321hA.f4018d;
                                                bArr4 = (byte[]) c0321hA.f4019e;
                                                if (bArr4 != null) {
                                                    if ("audio/mp4a-latm".equals(str7)) {
                                                        C0095a c0095aG = AbstractC0096b.g(new x(bArr4, bArr4.length), false);
                                                        i42 = c0095aG.f1463a;
                                                        iIntValue = c0095aG.f1464b;
                                                        str12 = (String) c0095aG.f1465c;
                                                    } else {
                                                        iIntValue = iIntValue;
                                                        str12 = str10;
                                                    }
                                                    listI = AbstractC0167z.I(bArr4);
                                                    String str16 = str12;
                                                    c0321h3 = c0321hA;
                                                    str8 = str16;
                                                } else {
                                                    c0321h3 = c0321hA;
                                                }
                                                c0321h2 = c0321h3;
                                                iIntValue = iIntValue;
                                                i41 += iG6;
                                                str6 = str11;
                                                i40 = i65;
                                                iG2 = i63;
                                                i19 = i64;
                                                str15 = str15;
                                            } else {
                                                c0321h3 = c0321h2;
                                            }
                                            str8 = str10;
                                            c0321h2 = c0321h3;
                                            iIntValue = iIntValue;
                                            i41 += iG6;
                                            str6 = str11;
                                            i40 = i65;
                                            iG2 = i63;
                                            i19 = i64;
                                            str15 = str15;
                                        }
                                        i41 += iG6;
                                        str6 = str11;
                                        i40 = i65;
                                        iG2 = i63;
                                        i19 = i64;
                                        str15 = str15;
                                    }
                                    String str17 = str8;
                                    i38 = iG2;
                                    int i71 = i40;
                                    i37 = i19;
                                    if (x4 == null || str7 == null) {
                                        x4 = x4;
                                    } else {
                                        Format$Builder format$Builder6 = new Format$Builder();
                                        format$Builder6.f10528a = Integer.toString(iG10);
                                        format$Builder6.f10537k = str7;
                                        format$Builder6.f10535h = str17;
                                        format$Builder6.f10550x = iIntValue;
                                        format$Builder6.f10551y = i42;
                                        format$Builder6.f10552z = i71;
                                        format$Builder6.f10539m = listI;
                                        format$Builder6.f10540n = drmInitDataA2;
                                        format$Builder6.f10530c = str;
                                        if (c0321h2 != null) {
                                            C0321h c0321h5 = c0321h2;
                                            format$Builder6.f10533f = c0321h5.f4016b;
                                            format$Builder6.f10534g = c0321h5.f4017c;
                                        }
                                        x4 = new X(format$Builder6);
                                    }
                                    i9 = i39;
                                    iG2 = i38;
                                    i22 = i37;
                                }
                                i40 = -1;
                                i13 = i13;
                                i39 = i9;
                                iIntValue = iW2;
                                rVarArr3 = rVarArr;
                                i41 = i61;
                                i42 = i62;
                                str8 = null;
                                c0321h2 = null;
                                listI = null;
                                while (i41 - i19 < iG2) {
                                    c0095a2.D(i41);
                                    iG6 = c0095a2.g();
                                    int i610 = iG2;
                                    int i611 = i19;
                                    str9 = str6;
                                    if (iG6 > 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    Q0.a.f(str9, z13);
                                    iG7 = c0095a2.g();
                                    int i612 = i40;
                                    if (iG7 == 1835557187) {
                                        int i613 = iG6 - 13;
                                        byte[] bArr12 = new byte[i613];
                                        c0095a2.D(i41 + 13);
                                        c0095a2.f(bArr12, 0, i613);
                                        listI = AbstractC0167z.I(bArr12);
                                        str15 = str15;
                                        str11 = str9;
                                        str8 = str8;
                                    } else {
                                        str10 = str8;
                                        if (iG7 == 1702061171) {
                                            if (z7) {
                                            }
                                            iArr = AbstractC0096b.f1471f;
                                            iArr2 = AbstractC0096b.f1469d;
                                            if (iG7 == 1684103987) {
                                                c0095a2.D(i41 + 8);
                                                String string4 = Integer.toString(iG10);
                                                int i614 = iArr2[(c0095a2.t() & 192) >> 6];
                                                iT2 = c0095a2.t();
                                                i47 = iArr[(iT2 & 56) >> 3];
                                                if ((iT2 & 4) != 0) {
                                                    i47++;
                                                }
                                                Format$Builder format$Builder7 = new Format$Builder();
                                                format$Builder7.f10528a = string4;
                                                format$Builder7.f10537k = str15;
                                                format$Builder7.f10550x = i47;
                                                format$Builder7.f10551y = i614;
                                                format$Builder7.f10540n = drmInitDataA2;
                                                format$Builder7.f10530c = str;
                                                x4 = new X(format$Builder7);
                                                str15 = str15;
                                            } else if (iG7 == 1684366131) {
                                                c0095a2.D(i41 + 8);
                                                String string5 = Integer.toString(iG10);
                                                c0095a2.E(2);
                                                int i615 = iArr2[(c0095a2.t() & 192) >> 6];
                                                iT = c0095a2.t();
                                                i46 = iArr[(iT & 14) >> 1];
                                                if ((iT & 1) != 0) {
                                                    i46++;
                                                }
                                                if (((c0095a2.t() & 30) >> 1) > 0) {
                                                    i46 += 2;
                                                }
                                                if (c0095a2.d() > 0) {
                                                    str13 = "audio/eac3";
                                                } else {
                                                    str13 = "audio/eac3";
                                                }
                                                Format$Builder format$Builder8 = new Format$Builder();
                                                format$Builder8.f10528a = string5;
                                                format$Builder8.f10537k = str13;
                                                format$Builder8.f10550x = i46;
                                                format$Builder8.f10551y = i615;
                                                format$Builder8.f10540n = drmInitDataA2;
                                                format$Builder8.f10530c = str;
                                                x4 = new X(format$Builder8);
                                            } else {
                                                str15 = str15;
                                                if (iG7 == 1684103988) {
                                                    c0095a2.D(i41 + 8);
                                                    String string6 = Integer.toString(iG10);
                                                    c0095a2.E(1);
                                                    if (((c0095a2.t() & 32) >> 5) == 1) {
                                                        i45 = 48000;
                                                    } else {
                                                        i45 = 44100;
                                                    }
                                                    Format$Builder format$Builder9 = new Format$Builder();
                                                    format$Builder9.f10528a = string6;
                                                    format$Builder9.f10537k = "audio/ac4";
                                                    format$Builder9.f10550x = 2;
                                                    format$Builder9.f10551y = i45;
                                                    format$Builder9.f10540n = drmInitDataA2;
                                                    format$Builder9.f10530c = str;
                                                    x4 = new X(format$Builder9);
                                                } else if (iG7 == 1684892784) {
                                                    if (iG7 == 1684305011) {
                                                        Format$Builder format$Builder10 = new Format$Builder();
                                                        format$Builder10.f10528a = Integer.toString(iG10);
                                                        format$Builder10.f10537k = str7;
                                                        format$Builder10.f10550x = iIntValue;
                                                        format$Builder10.f10551y = i42;
                                                        format$Builder10.f10540n = drmInitDataA2;
                                                        format$Builder10.f10530c = str;
                                                        x4 = new X(format$Builder10);
                                                    } else {
                                                        if (iG7 == 1682927731) {
                                                            int i616 = iG6 - 8;
                                                            byte[] bArr13 = f4651a;
                                                            byte[] bArrCopyOf2 = Arrays.copyOf(bArr13, bArr13.length + i616);
                                                            c0095a2.D(i41 + 8);
                                                            c0095a2.f(bArrCopyOf2, bArr13.length, i616);
                                                            listI2 = AbstractC0096b.a(bArrCopyOf2);
                                                        } else if (iG7 == 1684425825) {
                                                            byte[] bArr14 = new byte[iG6 - 8];
                                                            bArr14[0] = 102;
                                                            bArr14[1] = 76;
                                                            bArr14[2] = 97;
                                                            bArr14[3] = 67;
                                                            c0095a2.D(i41 + 12);
                                                            c0095a2.f(bArr14, 4, iG6 - 12);
                                                            listI2 = AbstractC0167z.I(bArr14);
                                                        } else if (iG7 == 1634492771) {
                                                            int i72 = iG6 - 12;
                                                            byte[] bArr15 = new byte[i72];
                                                            c0095a2.D(i41 + 12);
                                                            c0095a2.f(bArr15, 0, i72);
                                                            C0095a c0095a8 = new C0095a(bArr15);
                                                            c0095a8.D(9);
                                                            int iT6 = c0095a8.t();
                                                            c0095a8.D(20);
                                                            Pair pairCreate4 = Pair.create(Integer.valueOf(c0095a8.w()), Integer.valueOf(iT6));
                                                            int iIntValue3 = ((Integer) pairCreate4.first).intValue();
                                                            iIntValue = ((Integer) pairCreate4.second).intValue();
                                                            listI = AbstractC0167z.I(bArr15);
                                                            i42 = iIntValue3;
                                                        }
                                                        listI = listI2;
                                                    }
                                                    str8 = str10;
                                                    str11 = str9;
                                                } else {
                                                    if (i36 > 0) {
                                                        throw C0045t0.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + i36);
                                                    }
                                                    i42 = i36;
                                                    str8 = str10;
                                                    str11 = str9;
                                                    iIntValue = 2;
                                                }
                                                str8 = str10;
                                                str11 = str9;
                                            }
                                            str8 = str10;
                                            str11 = str9;
                                        } else {
                                            i43 = 1702061171;
                                        }
                                        if (iG7 == i43) {
                                            i44 = c0095a2.f1463a;
                                            if (i44 >= i41) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            Q0.a.f(null, z14);
                                            while (true) {
                                                if (i44 - i41 < iG6) {
                                                    str11 = str9;
                                                    i44 = -1;
                                                    break;
                                                }
                                                c0095a2.D(i44);
                                                iG8 = c0095a2.g();
                                                str11 = str9;
                                                if (iG8 > 0) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                                Q0.a.f(str11, z15);
                                                if (c0095a2.g() == 1702061171) {
                                                    break;
                                                    break;
                                                }
                                                i44 += iG8;
                                                str9 = str11;
                                            }
                                        } else {
                                            i44 = i41;
                                            str11 = str9;
                                        }
                                        if (i44 != -1) {
                                            c0321hA = a(i44, c0095a2);
                                            str7 = (String) c0321hA.f4018d;
                                            bArr4 = (byte[]) c0321hA.f4019e;
                                            if (bArr4 != null) {
                                                if ("audio/mp4a-latm".equals(str7)) {
                                                    C0095a c0095aG2 = AbstractC0096b.g(new x(bArr4, bArr4.length), false);
                                                    i42 = c0095aG2.f1463a;
                                                    iIntValue = c0095aG2.f1464b;
                                                    str12 = (String) c0095aG2.f1465c;
                                                } else {
                                                    iIntValue = iIntValue;
                                                    str12 = str10;
                                                }
                                                listI = AbstractC0167z.I(bArr4);
                                                String str18 = str12;
                                                c0321h3 = c0321hA;
                                                str8 = str18;
                                            } else {
                                                c0321h3 = c0321hA;
                                            }
                                            c0321h2 = c0321h3;
                                            iIntValue = iIntValue;
                                            i41 += iG6;
                                            str6 = str11;
                                            i40 = i612;
                                            iG2 = i610;
                                            i19 = i611;
                                            str15 = str15;
                                        } else {
                                            c0321h3 = c0321h2;
                                        }
                                        str8 = str10;
                                        c0321h2 = c0321h3;
                                        iIntValue = iIntValue;
                                        i41 += iG6;
                                        str6 = str11;
                                        i40 = i612;
                                        iG2 = i610;
                                        i19 = i611;
                                        str15 = str15;
                                    }
                                    i41 += iG6;
                                    str6 = str11;
                                    i40 = i612;
                                    iG2 = i610;
                                    i19 = i611;
                                    str15 = str15;
                                }
                                String str19 = str8;
                                i38 = iG2;
                                int i73 = i40;
                                i37 = i19;
                                if (x4 == null) {
                                    x4 = x4;
                                } else {
                                    x4 = x4;
                                }
                                i9 = i39;
                                iG2 = i38;
                                i22 = i37;
                            } else {
                                if (iG3 == 1414810956 || iG3 == 1954034535 || iG3 == 2004251764 || iG3 == 1937010800 || iG3 == 1664495672) {
                                    c0095a2.D(i19 + 16);
                                    String str20 = "application/ttml+xml";
                                    if (iG3 == 1414810956) {
                                        j8 = Long.MAX_VALUE;
                                        lI = null;
                                    } else if (iG3 == 1954034535) {
                                        int i74 = iG2 - 16;
                                        byte[] bArr16 = new byte[i74];
                                        c0095a2.f(bArr16, 0, i74);
                                        lI = AbstractC0167z.I(bArr16);
                                        str20 = "application/x-quicktime-tx3g";
                                        j8 = Long.MAX_VALUE;
                                    } else if (iG3 == 2004251764) {
                                        str20 = "application/x-mp4-vtt";
                                        j8 = Long.MAX_VALUE;
                                        lI = null;
                                    } else if (iG3 == 1937010800) {
                                        j8 = 0;
                                        lI = null;
                                    } else {
                                        if (iG3 != 1664495672) {
                                            throw new IllegalStateException();
                                        }
                                        str20 = "application/x-mp4-cea-608";
                                        j8 = Long.MAX_VALUE;
                                        lI = null;
                                        i14 = 1;
                                    }
                                    Format$Builder format$Builder11 = new Format$Builder();
                                    format$Builder11.f10528a = Integer.toString(iG10);
                                    format$Builder11.f10537k = str20;
                                    format$Builder11.f10530c = str;
                                    format$Builder11.f10541o = j8;
                                    format$Builder11.f10539m = lI;
                                    x4 = new X(format$Builder11);
                                } else if (iG3 == 1835365492) {
                                    c0095a2.D(i19 + 16);
                                    if (iG3 == 1835365492) {
                                        c0095a2.o();
                                        String strO = c0095a2.o();
                                        if (strO != null) {
                                            Format$Builder format$Builder12 = new Format$Builder();
                                            format$Builder12.f10528a = Integer.toString(iG10);
                                            format$Builder12.f10537k = strO;
                                            x4 = new X(format$Builder12);
                                        }
                                    }
                                } else if (iG3 == 1667329389) {
                                    Format$Builder format$Builder13 = new Format$Builder();
                                    format$Builder13.f10528a = Integer.toString(iG10);
                                    format$Builder13.f10537k = "application/x-camera-motion";
                                    x4 = new X(format$Builder13);
                                }
                                i22 = i19;
                                rVarArr3 = rVarArr;
                            }
                            c0095a2.D(i22 + iG2);
                            i13++;
                            drmInitData = drmInitData;
                            iG = i52;
                            i48 = i53;
                            arrayList2 = arrayList4;
                            jU2 = j9;
                            str = str;
                            rVarArr = rVarArr3;
                            pairCreate = pairCreate;
                            i7 = i7;
                            aVar3 = aVar3;
                        }
                        arrayList = arrayList2;
                        i16 = i48;
                        aVar2 = aVar3;
                        pair = pairCreate;
                        i17 = i7;
                        j7 = jU2;
                        rVarArr2 = rVarArr;
                        x7 = x4;
                        if (z4) {
                            aVar3 = aVar2;
                        } else {
                            aVar3 = aVar2;
                            aVarT = aVar3.t(1701082227);
                            if (aVarT == null) {
                                bVarY = aVarT.y(1701606260);
                                if (bVarY == null) {
                                    pairCreate2 = null;
                                } else {
                                    c0095a3 = bVarY.f4636c;
                                    c0095a3.D(8);
                                    iL2 = D1.a.l(c0095a3.g());
                                    iW = c0095a3.w();
                                    jArr3 = new long[iW];
                                    jArr4 = new long[iW];
                                    for (i18 = 0; i18 < iW; i18++) {
                                        if (iL2 == 1) {
                                            jU3 = c0095a3.x();
                                        } else {
                                            jU3 = c0095a3.u();
                                        }
                                        jArr3[i18] = jU3;
                                        if (iL2 == 1) {
                                            jG = c0095a3.n();
                                        } else {
                                            jG = c0095a3.g();
                                        }
                                        jArr4[i18] = jG;
                                        if (c0095a3.q() == 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        c0095a3.E(2);
                                    }
                                    pairCreate2 = Pair.create(jArr3, jArr4);
                                }
                                if (pairCreate2 != null) {
                                    jArr2 = (long[]) pairCreate2.first;
                                    jArr = (long[]) pairCreate2.second;
                                }
                            }
                            if (x7 == null) {
                                qVar = null;
                            } else {
                                qVar = new q(iG10, i17, ((Long) pair.first).longValue(), j7, jK, x7, i14, rVarArr2, i15, jArr2, jArr);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        if (x7 == null) {
                            qVar = null;
                        } else {
                            qVar = new q(iG10, i17, ((Long) pair.first).longValue(), j7, jK, x7, i14, rVarArr2, i15, jArr2, jArr);
                        }
                    } else {
                        i8 = -65536;
                    }
                    if (iG11 == 0 && iG12 == i8) {
                        if (iG13 == 65536 && iG14 == 0) {
                            i9 = 270;
                        } else {
                            i8 = -65536;
                            if (iG11 != i8) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                        }
                    } else if (iG11 != i8 && iG12 == 0 && iG13 == 0 && iG14 == i8) {
                        i9 = 180;
                    } else {
                        i9 = 0;
                    }
                    if (j == -9223372036854775807L) {
                        j3 = jU;
                    } else {
                        j3 = j;
                    }
                    c0095a = bVarY2.f4636c;
                    c0095a.D(8);
                    if (D1.a.l(c0095a.g()) == 0) {
                        i10 = 8;
                    } else {
                        i10 = 16;
                    }
                    c0095a.E(i10);
                    jU2 = c0095a.u();
                    if (j3 != -9223372036854775807L) {
                    }
                    a aVarT5 = aVarT2.t(1835626086);
                    aVarT5.getClass();
                    a aVarT6 = aVarT5.t(1937007212);
                    aVarT6.getClass();
                    b bVarY7 = aVarT2.y(1835296868);
                    bVarY7.getClass();
                    C0095a c0095a9 = bVarY7.f4636c;
                    c0095a9.D(8);
                    iL = D1.a.l(c0095a9.g());
                    if (iL == 0) {
                        i11 = 8;
                    } else {
                        i11 = 16;
                    }
                    c0095a9.E(i11);
                    long jU7 = c0095a9.u();
                    if (iL == 0) {
                        i12 = 4;
                    } else {
                        i12 = 8;
                    }
                    c0095a9.E(i12);
                    int iY8 = c0095a9.y();
                    pairCreate = Pair.create(Long.valueOf(jU7), "" + ((char) (((iY8 >> 10) & 31) + 96)) + ((char) (((iY8 >> 5) & 31) + 96)) + ((char) ((iY8 & 31) + 96)));
                    b bVarY8 = aVarT6.y(1937011556);
                    bVarY8.getClass();
                    str = (String) pairCreate.second;
                    c0095a2 = bVarY8.f4636c;
                    c0095a2.D(12);
                    iG = c0095a2.g();
                    rVarArr = new r[iG];
                    i13 = 0;
                    x4 = null;
                    i14 = 0;
                    i15 = 0;
                    while (i13 < iG) {
                        int i510 = iG;
                        i19 = c0095a2.f1463a;
                        int i511 = i48;
                        iG2 = c0095a2.g();
                        ArrayList arrayList6 = arrayList2;
                        long j10 = jU2;
                        if (iG2 > 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        Q0.a.f("childAtomSize must be positive", z8);
                        iG3 = c0095a2.g();
                        if (iG3 != 1635148593) {
                            i13 = i13;
                            i20 = i9;
                            aVar3 = aVar3;
                            pairCreate = pairCreate;
                            str2 = "childAtomSize must be positive";
                            rVarArr3 = rVarArr;
                            x8 = x4;
                            c0095a2.D(i19 + 16);
                            c0095a2.E(16);
                            iY = c0095a2.y();
                            iY2 = c0095a2.y();
                            c0095a2.E(50);
                            i21 = c0095a2.f1463a;
                            if (iG3 == 1701733238) {
                                iG2 = iG2;
                                i22 = i19;
                                pairC = c(c0095a2, i22, iG2);
                                if (pairC != null) {
                                    iG3 = ((Integer) pairC.first).intValue();
                                    if (drmInitData == null) {
                                        drmInitDataA = null;
                                    } else {
                                        drmInitDataA = drmInitData.a(((r) pairC.second).f4750b);
                                    }
                                    rVarArr3[i13] = (r) pairC.second;
                                } else {
                                    drmInitDataA = drmInitData;
                                }
                                c0095a2.D(i21);
                            } else {
                                iG2 = iG2;
                                i22 = i19;
                                drmInitDataA = drmInitData;
                            }
                            if (iG3 == 1831958048) {
                                str3 = "video/mpeg";
                            } else if (iG3 == 1211250227) {
                                str3 = "video/3gpp";
                            } else {
                                str3 = null;
                            }
                            z9 = false;
                            str = str;
                            drmInitData2 = drmInitDataA;
                            str4 = str3;
                            f7 = 1.0f;
                            i23 = i15;
                            i24 = -1;
                            str5 = null;
                            bArr = null;
                            byteBufferOrder = null;
                            c0321h = null;
                            i25 = -1;
                            i26 = -1;
                            i27 = -1;
                            i28 = i21;
                            list = null;
                            while (true) {
                                if (i28 - i22 >= iG2) {
                                    list2 = list;
                                    i24 = i24;
                                    break;
                                }
                                c0095a2.D(i28);
                                i32 = c0095a2.f1463a;
                                list2 = list;
                                iG4 = c0095a2.g();
                                i24 = i24;
                                if (iG4 != 0) {
                                }
                                if (iG4 > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                Q0.a.f(str2, z10);
                                iG5 = c0095a2.g();
                                String str110 = str2;
                                if (iG5 == 1635148611) {
                                    if (str4 == null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    Q0.a.f(null, z12);
                                    c0095a2.D(i32 + 8);
                                    aVarA = p156w2.a.a(c0095a2);
                                    if (!z9) {
                                        f7 = aVarA.f17960e;
                                    }
                                    ArrayList arrayList7 = aVarA.f17956a;
                                    int i512 = aVarA.f17957b;
                                    iY = iY;
                                    iY2 = iY2;
                                    iG3 = iG3;
                                    i22 = i22;
                                    str5 = aVarA.f17961f;
                                    list2 = arrayList7;
                                    i23 = i512;
                                    fW = f7;
                                    str4 = "video/avc";
                                } else if (iG5 == 1752589123) {
                                    if (str4 == null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    Q0.a.f(null, z11);
                                    c0095a2.D(i32 + 8);
                                    eVarA = p156w2.e.a(c0095a2);
                                    if (!z9) {
                                        f7 = eVarA.f17982c;
                                    }
                                    int i513 = eVarA.f17981b;
                                    List list4 = eVarA.f17980a;
                                    iY = iY;
                                    iY2 = iY2;
                                    iG3 = iG3;
                                    i22 = i22;
                                    str5 = eVarA.f17983d;
                                    i23 = i513;
                                    str4 = "video/hevc";
                                    fW = f7;
                                    list2 = list4;
                                } else {
                                    if (iG5 != 1685480259) {
                                        iY = iY;
                                        iY2 = iY2;
                                        iG3 = iG3;
                                        i22 = i22;
                                        iG2 = iG2;
                                        fW = f7;
                                        bArr3 = bArr;
                                        aVarC = J0.a.c(c0095a2);
                                        if (aVarC != null) {
                                            str5 = aVarC.f3771b;
                                            str4 = "video/dolby-vision";
                                        }
                                        i24 = i24;
                                        bArr = bArr3;
                                    } else {
                                        iY = iY;
                                        iY2 = iY2;
                                        iG3 = iG3;
                                        i22 = i22;
                                        iG2 = iG2;
                                        fW = f7;
                                        bArr3 = bArr;
                                        aVarC = J0.a.c(c0095a2);
                                        if (aVarC != null) {
                                            str5 = aVarC.f3771b;
                                            str4 = "video/dolby-vision";
                                        }
                                        i24 = i24;
                                        bArr = bArr3;
                                    }
                                    i28 += iG4;
                                    list = list2;
                                    iG3 = iG3;
                                    i22 = i22;
                                    iG2 = iG2;
                                    f7 = fW;
                                    iY2 = iY2;
                                    iY = iY;
                                    str2 = str110;
                                }
                                i28 += iG4;
                                list = list2;
                                iG3 = iG3;
                                i22 = i22;
                                iG2 = iG2;
                                f7 = fW;
                                iY2 = iY2;
                                iY = iY;
                                str2 = str110;
                            }
                            f8 = f7;
                            bArr2 = bArr;
                            if (str4 == null) {
                                i9 = i20;
                                x4 = x8;
                            } else {
                                format$Builder = new Format$Builder();
                                format$Builder.f10528a = Integer.toString(iG10);
                                format$Builder.f10537k = str4;
                                format$Builder.f10535h = str5;
                                format$Builder.f10542p = iY;
                                format$Builder.f10543q = iY2;
                                format$Builder.f10546t = f8;
                                i9 = i20;
                                format$Builder.f10545s = i9;
                                format$Builder.f10547u = bArr2;
                                format$Builder.f10548v = i24;
                                format$Builder.f10539m = list2;
                                format$Builder.f10540n = drmInitData2;
                                i29 = i26;
                                i30 = i25;
                                i31 = i27;
                                if (i29 == -1) {
                                    if (byteBufferOrder != null) {
                                        bArrArray = byteBufferOrder.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    format$Builder.f10549w = new p156w2.b(i29, bArrArray, i30, i31);
                                } else {
                                    if (byteBufferOrder != null) {
                                        bArrArray = byteBufferOrder.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    format$Builder.f10549w = new p156w2.b(i29, bArrArray, i30, i31);
                                }
                                if (c0321h != null) {
                                    C0321h c0321h6 = c0321h;
                                    format$Builder.f10533f = c0321h6.f4016b;
                                    format$Builder.f10534g = c0321h6.f4017c;
                                }
                                x4 = new X(format$Builder);
                            }
                            i15 = i23;
                        } else {
                            i13 = i13;
                            i20 = i9;
                            aVar3 = aVar3;
                            pairCreate = pairCreate;
                            str2 = "childAtomSize must be positive";
                            rVarArr3 = rVarArr;
                            x8 = x4;
                            c0095a2.D(i19 + 16);
                            c0095a2.E(16);
                            iY = c0095a2.y();
                            iY2 = c0095a2.y();
                            c0095a2.E(50);
                            i21 = c0095a2.f1463a;
                            if (iG3 == 1701733238) {
                                iG2 = iG2;
                                i22 = i19;
                                pairC = c(c0095a2, i22, iG2);
                                if (pairC != null) {
                                    iG3 = ((Integer) pairC.first).intValue();
                                    if (drmInitData == null) {
                                        drmInitDataA = null;
                                    } else {
                                        drmInitDataA = drmInitData.a(((r) pairC.second).f4750b);
                                    }
                                    rVarArr3[i13] = (r) pairC.second;
                                } else {
                                    drmInitDataA = drmInitData;
                                }
                                c0095a2.D(i21);
                            } else {
                                iG2 = iG2;
                                i22 = i19;
                                drmInitDataA = drmInitData;
                            }
                            if (iG3 == 1831958048) {
                                str3 = "video/mpeg";
                            } else if (iG3 == 1211250227) {
                                str3 = "video/3gpp";
                            } else {
                                str3 = null;
                            }
                            z9 = false;
                            str = str;
                            drmInitData2 = drmInitDataA;
                            str4 = str3;
                            f7 = 1.0f;
                            i23 = i15;
                            i24 = -1;
                            str5 = null;
                            bArr = null;
                            byteBufferOrder = null;
                            c0321h = null;
                            i25 = -1;
                            i26 = -1;
                            i27 = -1;
                            i28 = i21;
                            list = null;
                            while (true) {
                                if (i28 - i22 >= iG2) {
                                    list2 = list;
                                    i24 = i24;
                                    break;
                                }
                                c0095a2.D(i28);
                                i32 = c0095a2.f1463a;
                                list2 = list;
                                iG4 = c0095a2.g();
                                i24 = i24;
                                if (iG4 != 0) {
                                }
                                if (iG4 > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                Q0.a.f(str2, z10);
                                iG5 = c0095a2.g();
                                String str111 = str2;
                                if (iG5 == 1635148611) {
                                    if (str4 == null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    Q0.a.f(null, z12);
                                    c0095a2.D(i32 + 8);
                                    aVarA = p156w2.a.a(c0095a2);
                                    if (!z9) {
                                        f7 = aVarA.f17960e;
                                    }
                                    ArrayList arrayList8 = aVarA.f17956a;
                                    int i514 = aVarA.f17957b;
                                    iY = iY;
                                    iY2 = iY2;
                                    iG3 = iG3;
                                    i22 = i22;
                                    str5 = aVarA.f17961f;
                                    list2 = arrayList8;
                                    i23 = i514;
                                    fW = f7;
                                    str4 = "video/avc";
                                } else if (iG5 == 1752589123) {
                                    if (str4 == null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    Q0.a.f(null, z11);
                                    c0095a2.D(i32 + 8);
                                    eVarA = p156w2.e.a(c0095a2);
                                    if (!z9) {
                                        f7 = eVarA.f17982c;
                                    }
                                    int i515 = eVarA.f17981b;
                                    List list5 = eVarA.f17980a;
                                    iY = iY;
                                    iY2 = iY2;
                                    iG3 = iG3;
                                    i22 = i22;
                                    str5 = eVarA.f17983d;
                                    i23 = i515;
                                    str4 = "video/hevc";
                                    fW = f7;
                                    list2 = list5;
                                } else {
                                    if (iG5 != 1685480259) {
                                        iY = iY;
                                        iY2 = iY2;
                                        iG3 = iG3;
                                        i22 = i22;
                                        iG2 = iG2;
                                        fW = f7;
                                        bArr3 = bArr;
                                        aVarC = J0.a.c(c0095a2);
                                        if (aVarC != null) {
                                            str5 = aVarC.f3771b;
                                            str4 = "video/dolby-vision";
                                        }
                                        i24 = i24;
                                        bArr = bArr3;
                                    } else {
                                        iY = iY;
                                        iY2 = iY2;
                                        iG3 = iG3;
                                        i22 = i22;
                                        iG2 = iG2;
                                        fW = f7;
                                        bArr3 = bArr;
                                        aVarC = J0.a.c(c0095a2);
                                        if (aVarC != null) {
                                            str5 = aVarC.f3771b;
                                            str4 = "video/dolby-vision";
                                        }
                                        i24 = i24;
                                        bArr = bArr3;
                                    }
                                    i28 += iG4;
                                    list = list2;
                                    iG3 = iG3;
                                    i22 = i22;
                                    iG2 = iG2;
                                    f7 = fW;
                                    iY2 = iY2;
                                    iY = iY;
                                    str2 = str111;
                                }
                                i28 += iG4;
                                list = list2;
                                iG3 = iG3;
                                i22 = i22;
                                iG2 = iG2;
                                f7 = fW;
                                iY2 = iY2;
                                iY = iY;
                                str2 = str111;
                            }
                            f8 = f7;
                            bArr2 = bArr;
                            if (str4 == null) {
                                i9 = i20;
                                x4 = x8;
                            } else {
                                format$Builder = new Format$Builder();
                                format$Builder.f10528a = Integer.toString(iG10);
                                format$Builder.f10537k = str4;
                                format$Builder.f10535h = str5;
                                format$Builder.f10542p = iY;
                                format$Builder.f10543q = iY2;
                                format$Builder.f10546t = f8;
                                i9 = i20;
                                format$Builder.f10545s = i9;
                                format$Builder.f10547u = bArr2;
                                format$Builder.f10548v = i24;
                                format$Builder.f10539m = list2;
                                format$Builder.f10540n = drmInitData2;
                                i29 = i26;
                                i30 = i25;
                                i31 = i27;
                                if (i29 == -1) {
                                    if (byteBufferOrder != null) {
                                        bArrArray = byteBufferOrder.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    format$Builder.f10549w = new p156w2.b(i29, bArrArray, i30, i31);
                                } else {
                                    if (byteBufferOrder != null) {
                                        bArrArray = byteBufferOrder.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    format$Builder.f10549w = new p156w2.b(i29, bArrArray, i30, i31);
                                }
                                if (c0321h != null) {
                                    C0321h c0321h7 = c0321h;
                                    format$Builder.f10533f = c0321h7.f4016b;
                                    format$Builder.f10534g = c0321h7.f4017c;
                                }
                                x4 = new X(format$Builder);
                            }
                            i15 = i23;
                        }
                        c0095a2.D(i22 + iG2);
                        i13++;
                        drmInitData = drmInitData;
                        iG = i510;
                        i48 = i511;
                        arrayList2 = arrayList6;
                        jU2 = j10;
                        str = str;
                        rVarArr = rVarArr3;
                        pairCreate = pairCreate;
                        i7 = i7;
                        aVar3 = aVar3;
                    }
                    arrayList = arrayList2;
                    i16 = i48;
                    aVar2 = aVar3;
                    pair = pairCreate;
                    i17 = i7;
                    j7 = jU2;
                    rVarArr2 = rVarArr;
                    x7 = x4;
                    if (z4) {
                        aVar3 = aVar2;
                        aVarT = aVar3.t(1701082227);
                        if (aVarT == null) {
                            bVarY = aVarT.y(1701606260);
                            if (bVarY == null) {
                                pairCreate2 = null;
                            } else {
                                c0095a3 = bVarY.f4636c;
                                c0095a3.D(8);
                                iL2 = D1.a.l(c0095a3.g());
                                iW = c0095a3.w();
                                jArr3 = new long[iW];
                                jArr4 = new long[iW];
                                while (i18 < iW) {
                                    if (iL2 == 1) {
                                        jU3 = c0095a3.x();
                                    } else {
                                        jU3 = c0095a3.u();
                                    }
                                    jArr3[i18] = jU3;
                                    if (iL2 == 1) {
                                        jG = c0095a3.n();
                                    } else {
                                        jG = c0095a3.g();
                                    }
                                    jArr4[i18] = jG;
                                    if (c0095a3.q() == 1) {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                    c0095a3.E(2);
                                }
                                pairCreate2 = Pair.create(jArr3, jArr4);
                            }
                            if (pairCreate2 != null) {
                                jArr2 = (long[]) pairCreate2.first;
                                jArr = (long[]) pairCreate2.second;
                            }
                        }
                        if (x7 == null) {
                            qVar = null;
                        } else {
                            qVar = new q(iG10, i17, ((Long) pair.first).longValue(), j7, jK, x7, i14, rVarArr2, i15, jArr2, jArr);
                        }
                    } else {
                        aVar3 = aVar2;
                    }
                    jArr = null;
                    jArr2 = null;
                    if (x7 == null) {
                        qVar = null;
                    } else {
                        qVar = new q(iG10, i17, ((Long) pair.first).longValue(), j7, jK, x7, i14, rVarArr2, i15, jArr2, jArr);
                    }
                }
                q qVar2 = (q) gVar.apply(qVar);
                if (qVar2 == null) {
                    arrayList2 = arrayList;
                } else {
                    a aVarT7 = aVar3.t(1835297121);
                    aVarT7.getClass();
                    a aVarT8 = aVarT7.t(1835626086);
                    aVarT8.getClass();
                    a aVarT9 = aVarT8.t(1937007212);
                    aVarT9.getClass();
                    t tVarD = d(qVar2, aVarT9, pVar);
                    arrayList2 = arrayList;
                    arrayList2.add(tVarD);
                }
            }
            i48 = i16 + 1;
        }
    }
}
