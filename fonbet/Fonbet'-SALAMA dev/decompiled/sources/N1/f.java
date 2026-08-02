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
import w2.C1766a;
import w2.C1767b;
import w2.C1770e;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f4651a;

    static {
        int i7 = v2.t.f17153a;
        f4651a = "OpusHead".getBytes(D3.f.f1719c);
    }

    public static C0321h a(int i7, C0095a c0095a) {
        c0095a.D(i7 + 12);
        c0095a.E(1);
        b(c0095a);
        c0095a.E(2);
        int t7 = c0095a.t();
        if ((t7 & 128) != 0) {
            c0095a.E(2);
        }
        if ((t7 & 64) != 0) {
            c0095a.E(c0095a.y());
        }
        if ((t7 & 32) != 0) {
            c0095a.E(2);
        }
        c0095a.E(1);
        b(c0095a);
        String d7 = v2.i.d(c0095a.t());
        if ("audio/mpeg".equals(d7) || "audio/vnd.dts".equals(d7) || "audio/vnd.dts.hd".equals(d7)) {
            return new C0321h(d7, (byte[]) null, -1, -1);
        }
        c0095a.E(4);
        int w7 = c0095a.w();
        int w8 = c0095a.w();
        c0095a.E(1);
        int b7 = b(c0095a);
        byte[] bArr = new byte[b7];
        c0095a.f(bArr, 0, b7);
        if (w8 <= 0) {
            w8 = -1;
        }
        return new C0321h(d7, bArr, w8, w7 > 0 ? w7 : -1);
    }

    public static int b(C0095a c0095a) {
        int t7 = c0095a.t();
        int i7 = t7 & 127;
        while ((t7 & 128) == 128) {
            t7 = c0095a.t();
            i7 = (i7 << 7) | (t7 & 127);
        }
        return i7;
    }

    public static Pair c(C0095a c0095a, int i7, int i8) {
        Integer num;
        r rVar;
        Pair create;
        int i9;
        int i10;
        byte[] bArr;
        int i11 = c0095a.f1463a;
        while (i11 - i7 < i8) {
            c0095a.D(i11);
            int g3 = c0095a.g();
            Q0.a.f("childAtomSize must be positive", g3 > 0);
            if (c0095a.g() == 1936289382) {
                int i12 = i11 + 8;
                int i13 = 0;
                int i14 = -1;
                String str = null;
                Integer num2 = null;
                while (i12 - i11 < g3) {
                    c0095a.D(i12);
                    int g7 = c0095a.g();
                    int g8 = c0095a.g();
                    if (g8 == 1718775137) {
                        num2 = Integer.valueOf(c0095a.g());
                    } else if (g8 == 1935894637) {
                        c0095a.E(4);
                        str = c0095a.r(4, D3.f.f1719c);
                    } else if (g8 == 1935894633) {
                        i14 = i12;
                        i13 = g7;
                    }
                    i12 += g7;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    Q0.a.f("frma atom is mandatory", num2 != null);
                    Q0.a.f("schi atom is mandatory", i14 != -1);
                    int i15 = i14 + 8;
                    while (true) {
                        if (i15 - i14 >= i13) {
                            num = num2;
                            rVar = null;
                            break;
                        }
                        c0095a.D(i15);
                        int g9 = c0095a.g();
                        if (c0095a.g() == 1952804451) {
                            int l7 = D1.a.l(c0095a.g());
                            c0095a.E(1);
                            if (l7 == 0) {
                                c0095a.E(1);
                                i9 = 0;
                                i10 = 0;
                            } else {
                                int t7 = c0095a.t();
                                int i16 = (t7 & 240) >> 4;
                                i9 = t7 & 15;
                                i10 = i16;
                            }
                            boolean z4 = c0095a.t() == 1;
                            int t8 = c0095a.t();
                            byte[] bArr2 = new byte[16];
                            c0095a.f(bArr2, 0, 16);
                            if (z4 && t8 == 0) {
                                int t9 = c0095a.t();
                                byte[] bArr3 = new byte[t9];
                                c0095a.f(bArr3, 0, t9);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            rVar = new r(z4, str, t8, bArr2, i10, i9, bArr);
                        } else {
                            i15 += g9;
                        }
                    }
                    Q0.a.f("tenc atom is mandatory", rVar != null);
                    int i17 = v2.t.f17153a;
                    create = Pair.create(num, rVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i11 += g3;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0429  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t d(q qVar, a aVar, F1.p pVar) {
        e eVar;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z7;
        X x4;
        int i11;
        int[] iArr;
        long j;
        boolean z8;
        int i12;
        q qVar2;
        long[] jArr;
        int i13;
        int[] iArr2;
        long[] jArr2;
        int i14;
        int[] iArr3;
        long[] jArr3;
        int i15;
        int i16;
        int i17;
        int[] iArr4;
        int i18;
        long[] jArr4;
        long j3;
        int i19;
        int i20;
        int i21;
        int i22;
        long[] jArr5;
        int[] iArr5;
        int[] iArr6;
        long[] jArr6;
        int[] iArr7;
        int[] iArr8;
        int i23;
        int[] iArr9;
        int i24;
        int i25;
        b y4 = aVar.y(1937011578);
        X x7 = qVar.f4744f;
        if (y4 != null) {
            C0095a c0095a = new C0095a();
            C0095a c0095a2 = y4.f4636c;
            c0095a.f1465c = c0095a2;
            c0095a2.D(12);
            int w7 = c0095a2.w();
            if ("audio/raw".equals(x7.f283C)) {
                int w8 = v2.t.w(x7.f298R, x7.f296P);
                if (w7 == 0 || w7 % w8 != 0) {
                    Log.w("AtomParsers", "Audio sample size mismatch. stsd sample size: " + w8 + ", stsz sample size: " + w7);
                    w7 = w8;
                }
            }
            if (w7 == 0) {
                w7 = -1;
            }
            c0095a.f1463a = w7;
            c0095a.f1464b = c0095a2.w();
            eVar = c0095a;
        } else {
            b y5 = aVar.y(1937013298);
            if (y5 == null) {
                throw C0045t0.a(null, "Track has no sample table size information");
            }
            e eVar2 = new e();
            C0095a c0095a3 = y5.f4636c;
            eVar2.f4650e = c0095a3;
            c0095a3.D(12);
            eVar2.f4647b = c0095a3.w() & 255;
            eVar2.f4646a = c0095a3.w();
            eVar = eVar2;
        }
        int b7 = eVar.b();
        if (b7 == 0) {
            return new t(qVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        b y7 = aVar.y(1937007471);
        if (y7 == null) {
            y7 = aVar.y(1668232756);
            y7.getClass();
            z4 = true;
        } else {
            z4 = false;
        }
        b y8 = aVar.y(1937011555);
        y8.getClass();
        b y9 = aVar.y(1937011827);
        y9.getClass();
        b y10 = aVar.y(1937011571);
        C0095a c0095a4 = y10 != null ? y10.f4636c : null;
        b y11 = aVar.y(1668576371);
        C0095a c0095a5 = y11 != null ? y11.f4636c : null;
        c cVar = new c(y8.f4636c, y7.f4636c, z4);
        C0095a c0095a6 = y9.f4636c;
        c0095a6.D(12);
        int w9 = c0095a6.w() - 1;
        int w10 = c0095a6.w();
        int w11 = c0095a6.w();
        if (c0095a5 != null) {
            c0095a5.D(12);
            i7 = c0095a5.w();
        } else {
            i7 = 0;
        }
        if (c0095a4 != null) {
            c0095a4.D(12);
            i9 = c0095a4.w();
            if (i9 > 0) {
                i8 = c0095a4.w() - 1;
            } else {
                i8 = -1;
                c0095a4 = null;
            }
        } else {
            i8 = -1;
            i9 = 0;
        }
        int a2 = eVar.a();
        String str = x7.f283C;
        if (a2 == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && w9 == 0 && i7 == 0 && i9 == 0)) {
            i10 = i9;
            z7 = false;
        } else {
            i10 = i9;
            z7 = true;
        }
        if (z7) {
            int i26 = cVar.f4637a;
            long[] jArr7 = new long[i26];
            int[] iArr10 = new int[i26];
            while (cVar.a()) {
                int i27 = cVar.f4638b;
                jArr7[i27] = cVar.f4640d;
                iArr10[i27] = cVar.f4639c;
            }
            long j7 = w11;
            int i28 = 8192 / a2;
            int i29 = 0;
            for (int i30 = 0; i30 < i26; i30++) {
                i29 += v2.t.g(iArr10[i30], i28);
            }
            long[] jArr8 = new long[i29];
            int[] iArr11 = new int[i29];
            long[] jArr9 = new long[i29];
            int[] iArr12 = new int[i29];
            int i31 = 0;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            while (i32 < i26) {
                int i35 = iArr10[i32];
                long j8 = jArr7[i32];
                int i36 = i34;
                int i37 = i26;
                int i38 = i33;
                int i39 = i36;
                long[] jArr10 = jArr7;
                int i40 = i35;
                while (i40 > 0) {
                    int min = Math.min(i28, i40);
                    jArr8[i39] = j8;
                    int[] iArr13 = iArr10;
                    int i41 = a2 * min;
                    iArr11[i39] = i41;
                    i38 = Math.max(i38, i41);
                    jArr9[i39] = i31 * j7;
                    iArr12[i39] = 1;
                    j8 += iArr11[i39];
                    i31 += min;
                    i40 -= min;
                    i39++;
                    iArr10 = iArr13;
                    a2 = a2;
                }
                i32++;
                jArr7 = jArr10;
                int i42 = i39;
                i33 = i38;
                i26 = i37;
                i34 = i42;
            }
            long j9 = j7 * i31;
            i13 = b7;
            x4 = x7;
            jArr2 = jArr9;
            iArr3 = iArr12;
            jArr3 = jArr8;
            iArr2 = iArr11;
            i14 = i33;
            qVar2 = qVar;
            j = j9;
        } else {
            long[] jArr11 = new long[b7];
            int[] iArr14 = new int[b7];
            long[] jArr12 = new long[b7];
            int[] iArr15 = new int[b7];
            int i43 = i10;
            x4 = x7;
            int i44 = w9;
            int i45 = i8;
            int i46 = 0;
            int i47 = 0;
            int i48 = 0;
            long j10 = 0;
            int i49 = 0;
            int i50 = 0;
            long j11 = 0;
            while (true) {
                if (i46 >= b7) {
                    i11 = i48;
                    iArr = iArr14;
                    break;
                }
                boolean z9 = true;
                while (i48 == 0) {
                    z9 = cVar.a();
                    if (!z9) {
                        break;
                    }
                    j11 = cVar.f4640d;
                    i48 = cVar.f4639c;
                    b7 = b7;
                    i45 = i45;
                }
                int i51 = b7;
                int i52 = i45;
                if (!z9) {
                    Log.w("AtomParsers", "Unexpected end of chunk data");
                    jArr11 = Arrays.copyOf(jArr11, i46);
                    iArr = Arrays.copyOf(iArr14, i46);
                    jArr12 = Arrays.copyOf(jArr12, i46);
                    iArr15 = Arrays.copyOf(iArr15, i46);
                    b7 = i46;
                    i11 = i48;
                    break;
                }
                if (c0095a5 != null) {
                    while (i50 == 0 && i7 > 0) {
                        i50 = c0095a5.w();
                        i49 = c0095a5.g();
                        i7--;
                    }
                    i50--;
                }
                int i53 = i49;
                jArr11[i46] = j11;
                int c3 = eVar.c();
                iArr14[i46] = c3;
                if (c3 > i47) {
                    i47 = c3;
                }
                int[] iArr16 = iArr14;
                jArr12[i46] = j10 + i53;
                iArr15[i46] = c0095a4 == null ? 1 : 0;
                i45 = i52;
                if (i46 == i45) {
                    iArr15[i46] = 1;
                    i43--;
                    if (i43 > 0) {
                        c0095a4.getClass();
                        i45 = c0095a4.w() - 1;
                    }
                }
                long[] jArr13 = jArr11;
                j10 += w11;
                int i54 = w10 - 1;
                if (i54 != 0 || i44 <= 0) {
                    i15 = i54;
                    i16 = i44;
                } else {
                    i15 = c0095a6.w();
                    i16 = i44 - 1;
                    w11 = c0095a6.g();
                }
                int i55 = i15;
                j11 += iArr16[i46];
                i48--;
                i46++;
                jArr11 = jArr13;
                i49 = i53;
                iArr14 = iArr16;
                b7 = i51;
                int i56 = i16;
                w10 = i55;
                i44 = i56;
            }
            j = j10 + i49;
            if (c0095a5 != null) {
                while (i7 > 0) {
                    if (c0095a5.w() != 0) {
                        z8 = false;
                        break;
                    }
                    c0095a5.g();
                    i7--;
                }
            }
            z8 = true;
            if (i43 == 0 && w10 == 0 && i11 == 0 && i44 == 0) {
                i12 = i50;
                if (i12 == 0 && z8) {
                    qVar2 = qVar;
                    jArr = jArr11;
                    i13 = b7;
                    iArr2 = iArr;
                    jArr2 = jArr12;
                    i14 = i47;
                    iArr3 = iArr15;
                    jArr3 = jArr;
                }
            } else {
                i12 = i50;
            }
            StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
            qVar2 = qVar;
            jArr = jArr11;
            sb.append(qVar2.f4739a);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i43);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(w10);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i11);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i44);
            sb.append(", remainingSamplesAtTimestampOffset ");
            sb.append(i12);
            sb.append(!z8 ? ", ctts invalid" : "");
            Log.w("AtomParsers", sb.toString());
            i13 = b7;
            iArr2 = iArr;
            jArr2 = jArr12;
            i14 = i47;
            iArr3 = iArr15;
            jArr3 = jArr;
        }
        long K7 = v2.t.K(j, 1000000L, qVar2.f4741c);
        long j12 = qVar2.f4741c;
        long[] jArr14 = qVar2.f4746h;
        if (jArr14 == null) {
            v2.t.L(jArr2, j12);
            return new t(qVar, jArr3, iArr2, i14, jArr2, iArr3, K7);
        }
        int length = jArr14.length;
        int i57 = qVar2.f4740b;
        long[] jArr15 = qVar2.f4747i;
        if (length == 1 && i57 == 1 && jArr2.length >= 2) {
            jArr15.getClass();
            long j13 = jArr15[0];
            jArr4 = jArr15;
            i18 = i57;
            long K8 = j13 + v2.t.K(jArr14[0], qVar2.f4741c, qVar2.f4742d);
            int length2 = jArr2.length - 1;
            i17 = i13;
            int j14 = v2.t.j(4, 0, length2);
            iArr4 = iArr3;
            int j15 = v2.t.j(jArr2.length - 4, 0, length2);
            long j16 = jArr2[0];
            if (j16 <= j13 && j13 < jArr2[j14] && jArr2[j15] < K8 && K8 <= j) {
                X x8 = x4;
                long K9 = v2.t.K(j13 - j16, x8.f297Q, qVar2.f4741c);
                j3 = j;
                long K10 = v2.t.K(j - K8, x8.f297Q, qVar2.f4741c);
                if ((K9 != 0 || K10 != 0) && K9 <= 2147483647L && K10 <= 2147483647L) {
                    pVar.f2561a = (int) K9;
                    pVar.f2562b = (int) K10;
                    v2.t.L(jArr2, j12);
                    return new t(qVar, jArr3, iArr2, i14, jArr2, iArr4, v2.t.K(jArr14[0], 1000000L, qVar2.f4742d));
                }
                if (jArr14.length != 1) {
                    i19 = 0;
                    if (jArr14[0] == 0) {
                        jArr4.getClass();
                        long j17 = jArr4[0];
                        for (int i58 = 0; i58 < jArr2.length; i58++) {
                            jArr2[i58] = v2.t.K(jArr2[i58] - j17, 1000000L, qVar2.f4741c);
                        }
                        return new t(qVar, jArr3, iArr2, i14, jArr2, iArr4, v2.t.K(j3 - j17, 1000000L, qVar2.f4741c));
                    }
                } else {
                    i19 = 0;
                }
                boolean z10 = i18 != 1 ? 1 : i19;
                int[] iArr17 = new int[jArr14.length];
                int[] iArr18 = new int[jArr14.length];
                jArr4.getClass();
                i20 = i19;
                int i59 = i20;
                int i60 = i59;
                int i61 = i60;
                while (i20 < jArr14.length) {
                    long j18 = jArr4[i20];
                    if (j18 != -1) {
                        iArr9 = iArr17;
                        iArr8 = iArr2;
                        i23 = i14;
                        long K11 = v2.t.K(jArr14[i20], qVar2.f4741c, qVar2.f4742d);
                        iArr9[i20] = v2.t.f(jArr2, j18, true);
                        iArr18[i20] = v2.t.b(jArr2, j18 + K11, z10);
                        while (true) {
                            i24 = iArr9[i20];
                            i25 = iArr18[i20];
                            if (i24 >= i25 || (iArr4[i24] & 1) != 0) {
                                break;
                            }
                            iArr9[i20] = i24 + 1;
                        }
                        int i62 = (i25 - i24) + i60;
                        i59 = (i61 != i24 ? 1 : 0) | i59;
                        i61 = i25;
                        i60 = i62;
                    } else {
                        iArr8 = iArr2;
                        i23 = i14;
                        iArr9 = iArr17;
                    }
                    i20++;
                    iArr17 = iArr9;
                    iArr2 = iArr8;
                    i14 = i23;
                }
                int[] iArr19 = iArr2;
                int i63 = i14;
                int[] iArr20 = iArr17;
                i21 = i59 | (i60 == i17 ? 1 : 0);
                long[] jArr16 = i21 == 0 ? new long[i60] : jArr3;
                int[] iArr21 = i21 == 0 ? new int[i60] : iArr19;
                if (i21 != 0) {
                    i63 = 0;
                }
                int[] iArr22 = i21 == 0 ? new int[i60] : iArr4;
                long[] jArr17 = new long[i60];
                i22 = 0;
                int i64 = 0;
                long j19 = 0;
                while (i22 < jArr14.length) {
                    long j20 = jArr4[i22];
                    long[] jArr18 = jArr14;
                    int i65 = iArr20[i22];
                    long[] jArr19 = jArr17;
                    int i66 = iArr18[i22];
                    if (i21 != 0) {
                        iArr5 = iArr18;
                        int i67 = i66 - i65;
                        System.arraycopy(jArr3, i65, jArr16, i64, i67);
                        jArr5 = jArr3;
                        iArr6 = iArr19;
                        System.arraycopy(iArr6, i65, iArr21, i64, i67);
                        jArr6 = jArr16;
                        iArr7 = iArr4;
                        System.arraycopy(iArr7, i65, iArr22, i64, i67);
                    } else {
                        jArr5 = jArr3;
                        iArr5 = iArr18;
                        iArr6 = iArr19;
                        jArr6 = jArr16;
                        iArr7 = iArr4;
                    }
                    int i68 = i63;
                    while (i65 < i66) {
                        int[] iArr23 = iArr22;
                        int i69 = i66;
                        long j21 = j19;
                        long j22 = j20;
                        jArr19[i64] = v2.t.K(j19, 1000000L, qVar2.f4742d) + v2.t.K(Math.max(0L, jArr2[i65] - j20), 1000000L, qVar2.f4741c);
                        if (i21 != 0 && iArr21[i64] > i68) {
                            i68 = iArr6[i65];
                        }
                        i64++;
                        i65++;
                        i66 = i69;
                        j19 = j21;
                        j20 = j22;
                        iArr22 = iArr23;
                    }
                    j19 += jArr18[i22];
                    i22++;
                    iArr4 = iArr7;
                    i63 = i68;
                    jArr16 = jArr6;
                    jArr14 = jArr18;
                    jArr17 = jArr19;
                    iArr18 = iArr5;
                    iArr22 = iArr22;
                    iArr19 = iArr6;
                    jArr3 = jArr5;
                }
                return new t(qVar, jArr16, iArr21, i63, jArr17, iArr22, v2.t.K(j19, 1000000L, qVar2.f4742d));
            }
        } else {
            i17 = i13;
            iArr4 = iArr3;
            i18 = i57;
            jArr4 = jArr15;
        }
        j3 = j;
        if (jArr14.length != 1) {
        }
        if (i18 != 1) {
        }
        int[] iArr172 = new int[jArr14.length];
        int[] iArr182 = new int[jArr14.length];
        jArr4.getClass();
        i20 = i19;
        int i592 = i20;
        int i602 = i592;
        int i612 = i602;
        while (i20 < jArr14.length) {
        }
        int[] iArr192 = iArr2;
        int i632 = i14;
        int[] iArr202 = iArr172;
        i21 = i592 | (i602 == i17 ? 1 : 0);
        if (i21 == 0) {
        }
        if (i21 == 0) {
        }
        if (i21 != 0) {
        }
        if (i21 == 0) {
        }
        long[] jArr172 = new long[i602];
        i22 = 0;
        int i642 = 0;
        long j192 = 0;
        while (i22 < jArr14.length) {
        }
        return new t(qVar, jArr16, iArr21, i632, jArr172, iArr22, v2.t.K(j192, 1000000L, qVar2.f4742d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        if (r14 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
    
        r14 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0d18  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0d8e  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0d90  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0d88  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList e(a aVar, F1.p pVar, long j, DrmInitData drmInitData, boolean z4, boolean z7, D3.g gVar) {
        long j3;
        int i7;
        int i8;
        long K7;
        int g3;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        Pair pair;
        int i13;
        long j7;
        r[] rVarArr;
        X x4;
        long[] jArr;
        long[] jArr2;
        q qVar;
        D3.g gVar2;
        Pair create;
        int i14;
        a aVar2;
        Pair pair2;
        int i15;
        r[] rVarArr2;
        int i16;
        int i17;
        DrmInitData drmInitData2;
        String str;
        int i18;
        int i19;
        List list;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        float f7;
        byte[] bArr;
        int i28;
        int i29;
        int i30;
        byte[] bArr2;
        int i31;
        String str2;
        X x7;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        DrmInitData drmInitData3;
        String str3;
        int i38;
        int i39;
        String str4;
        String str5;
        int i40;
        int i41;
        String str6;
        int i42;
        C0321h c0321h;
        String str7;
        List I7;
        String str8;
        long j8;
        L l7;
        a aVar3 = aVar;
        DrmInitData drmInitData4 = drmInitData;
        ArrayList arrayList2 = new ArrayList();
        int i43 = 0;
        while (true) {
            ArrayList arrayList3 = aVar3.f4635e;
            if (i43 >= arrayList3.size()) {
                return arrayList2;
            }
            a aVar4 = (a) arrayList3.get(i43);
            if (aVar4.f1675b != 1953653099) {
                i12 = i43;
            } else {
                b y4 = aVar3.y(1836476516);
                y4.getClass();
                a t7 = aVar4.t(1835297121);
                t7.getClass();
                b y5 = t7.y(1751411826);
                y5.getClass();
                C0095a c0095a = y5.f4636c;
                c0095a.D(16);
                int g7 = c0095a.g();
                int i44 = g7 == 1936684398 ? 1 : g7 == 1986618469 ? 2 : (g7 == 1952807028 || g7 == 1935832172 || g7 == 1937072756 || g7 == 1668047728) ? 3 : g7 == 1835365473 ? 5 : -1;
                if (i44 == -1) {
                    gVar2 = gVar;
                    arrayList = arrayList2;
                    i12 = i43;
                    qVar = null;
                } else {
                    b y7 = aVar4.y(1953196132);
                    y7.getClass();
                    C0095a c0095a2 = y7.f4636c;
                    c0095a2.D(8);
                    int l8 = D1.a.l(c0095a2.g());
                    c0095a2.E(l8 == 0 ? 8 : 16);
                    int g8 = c0095a2.g();
                    c0095a2.E(4);
                    int i45 = c0095a2.f1463a;
                    int i46 = l8 == 0 ? 4 : 8;
                    int i47 = 0;
                    while (true) {
                        if (i47 >= i46) {
                            c0095a2.E(i46);
                            break;
                        }
                        if (((byte[]) c0095a2.f1465c)[i45 + i47] != -1) {
                            j3 = l8 == 0 ? c0095a2.u() : c0095a2.x();
                        } else {
                            i47++;
                        }
                    }
                    c0095a2.E(16);
                    int g9 = c0095a2.g();
                    int g10 = c0095a2.g();
                    c0095a2.E(4);
                    int g11 = c0095a2.g();
                    int g12 = c0095a2.g();
                    if (g9 == 0 && g10 == 65536) {
                        i7 = -65536;
                        if (g11 == -65536 && g12 == 0) {
                            i8 = 90;
                            long j9 = j == -9223372036854775807L ? j3 : j;
                            C0095a c0095a3 = y4.f4636c;
                            c0095a3.D(8);
                            c0095a3.E(D1.a.l(c0095a3.g()) == 0 ? 8 : 16);
                            long u4 = c0095a3.u();
                            K7 = j9 != -9223372036854775807L ? v2.t.K(j9, 1000000L, u4) : -9223372036854775807L;
                            a t8 = t7.t(1835626086);
                            t8.getClass();
                            a t9 = t8.t(1937007212);
                            t9.getClass();
                            b y8 = t7.y(1835296868);
                            y8.getClass();
                            C0095a c0095a4 = y8.f4636c;
                            c0095a4.D(8);
                            int l9 = D1.a.l(c0095a4.g());
                            c0095a4.E(l9 == 0 ? 8 : 16);
                            long u7 = c0095a4.u();
                            c0095a4.E(l9 == 0 ? 4 : 8);
                            int y9 = c0095a4.y();
                            Pair create2 = Pair.create(Long.valueOf(u7), "" + ((char) (((y9 >> 10) & 31) + 96)) + ((char) (((y9 >> 5) & 31) + 96)) + ((char) ((y9 & 31) + 96)));
                            b y10 = t9.y(1937011556);
                            y10.getClass();
                            String str9 = (String) create2.second;
                            C0095a c0095a5 = y10.f4636c;
                            c0095a5.D(12);
                            g3 = c0095a5.g();
                            r[] rVarArr3 = new r[g3];
                            i9 = 0;
                            X x8 = null;
                            i10 = 0;
                            i11 = 0;
                            while (i9 < g3) {
                                int i48 = g3;
                                int i49 = c0095a5.f1463a;
                                int i50 = i43;
                                int g13 = c0095a5.g();
                                ArrayList arrayList4 = arrayList2;
                                long j10 = u4;
                                Q0.a.f("childAtomSize must be positive", g13 > 0);
                                int g14 = c0095a5.g();
                                if (g14 == 1635148593 || g14 == 1635148595 || g14 == 1701733238 || g14 == 1831958048 || g14 == 1836070006 || g14 == 1752589105 || g14 == 1751479857 || g14 == 1932670515 || g14 == 1211250227 || g14 == 1987063864 || g14 == 1987063865 || g14 == 1635135537 || g14 == 1685479798 || g14 == 1685479729 || g14 == 1685481573 || g14 == 1685481521) {
                                    i14 = i9;
                                    int i51 = i8;
                                    aVar2 = aVar4;
                                    pair2 = create2;
                                    i15 = i44;
                                    String str10 = "childAtomSize must be positive";
                                    rVarArr2 = rVarArr3;
                                    X x9 = x8;
                                    c0095a5.D(i49 + 16);
                                    c0095a5.E(16);
                                    int y11 = c0095a5.y();
                                    int y12 = c0095a5.y();
                                    c0095a5.E(50);
                                    int i52 = c0095a5.f1463a;
                                    if (g14 == 1701733238) {
                                        i16 = g13;
                                        i17 = i49;
                                        Pair c3 = c(c0095a5, i17, i16);
                                        if (c3 != null) {
                                            g14 = ((Integer) c3.first).intValue();
                                            drmInitData2 = drmInitData == null ? null : drmInitData.a(((r) c3.second).f4750b);
                                            rVarArr2[i14] = (r) c3.second;
                                        } else {
                                            drmInitData2 = drmInitData;
                                        }
                                        c0095a5.D(i52);
                                    } else {
                                        i16 = g13;
                                        i17 = i49;
                                        drmInitData2 = drmInitData;
                                    }
                                    boolean z8 = false;
                                    str = str9;
                                    DrmInitData drmInitData5 = drmInitData2;
                                    String str11 = g14 == 1831958048 ? "video/mpeg" : g14 == 1211250227 ? "video/3gpp" : null;
                                    float f8 = 1.0f;
                                    int i53 = i11;
                                    int i54 = -1;
                                    String str12 = null;
                                    byte[] bArr3 = null;
                                    ByteBuffer byteBuffer = null;
                                    C0321h c0321h2 = null;
                                    int i55 = -1;
                                    int i56 = -1;
                                    int i57 = -1;
                                    int i58 = i52;
                                    List list2 = null;
                                    while (true) {
                                        if (i58 - i17 >= i16) {
                                            i18 = y11;
                                            i19 = y12;
                                            list = list2;
                                            i20 = i17;
                                            i21 = i16;
                                            i22 = i54;
                                            break;
                                        }
                                        c0095a5.D(i58);
                                        int i59 = c0095a5.f1463a;
                                        list = list2;
                                        int g15 = c0095a5.g();
                                        i22 = i54;
                                        if (g15 == 0 && c0095a5.f1463a - i17 == i16) {
                                            i18 = y11;
                                            i19 = y12;
                                            i20 = i17;
                                            i21 = i16;
                                            break;
                                        }
                                        Q0.a.f(str10, g15 > 0);
                                        int g16 = c0095a5.g();
                                        String str13 = str10;
                                        if (g16 == 1635148611) {
                                            Q0.a.f(null, str11 == null);
                                            c0095a5.D(i59 + 8);
                                            C1766a a2 = C1766a.a(c0095a5);
                                            if (!z8) {
                                                f8 = a2.f17954e;
                                            }
                                            ArrayList arrayList5 = a2.f17950a;
                                            int i60 = a2.f17951b;
                                            i23 = y11;
                                            i24 = y12;
                                            i25 = g14;
                                            i26 = i17;
                                            str12 = a2.f17955f;
                                            list = arrayList5;
                                            i27 = i16;
                                            i53 = i60;
                                            f7 = f8;
                                            str11 = "video/avc";
                                        } else if (g16 == 1752589123) {
                                            Q0.a.f(null, str11 == null);
                                            c0095a5.D(i59 + 8);
                                            C1770e a4 = C1770e.a(c0095a5);
                                            if (!z8) {
                                                f8 = a4.f17976c;
                                            }
                                            int i61 = a4.f17975b;
                                            List list3 = a4.f17974a;
                                            i23 = y11;
                                            i24 = y12;
                                            i25 = g14;
                                            i26 = i17;
                                            str12 = a4.f17977d;
                                            i53 = i61;
                                            i27 = i16;
                                            str11 = "video/hevc";
                                            f7 = f8;
                                            list = list3;
                                        } else {
                                            if (g16 == 1685480259 || g16 == 1685485123) {
                                                i23 = y11;
                                                i24 = y12;
                                                i25 = g14;
                                                i26 = i17;
                                                i27 = i16;
                                                f7 = f8;
                                                bArr = bArr3;
                                                J0.a c4 = J0.a.c(c0095a5);
                                                if (c4 != null) {
                                                    str12 = c4.f3771b;
                                                    str11 = "video/dolby-vision";
                                                }
                                            } else {
                                                if (g16 == 1987076931) {
                                                    Q0.a.f(null, str11 == null);
                                                    str11 = g14 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                } else if (g16 == 1635135811) {
                                                    Q0.a.f(null, str11 == null);
                                                    str11 = "video/av01";
                                                } else if (g16 == 1668050025) {
                                                    if (byteBuffer == null) {
                                                        byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer2 = byteBuffer;
                                                    byteBuffer2.position(21);
                                                    byteBuffer2.putShort(c0095a5.q());
                                                    byteBuffer2.putShort(c0095a5.q());
                                                    i23 = y11;
                                                    i24 = y12;
                                                    i25 = g14;
                                                    i26 = i17;
                                                    byteBuffer = byteBuffer2;
                                                    i27 = i16;
                                                    f7 = f8;
                                                } else if (g16 == 1835295606) {
                                                    if (byteBuffer == null) {
                                                        byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer3 = byteBuffer;
                                                    short q7 = c0095a5.q();
                                                    short q8 = c0095a5.q();
                                                    i25 = g14;
                                                    short q9 = c0095a5.q();
                                                    i26 = i17;
                                                    short q10 = c0095a5.q();
                                                    i27 = i16;
                                                    short q11 = c0095a5.q();
                                                    byte[] bArr4 = bArr3;
                                                    short q12 = c0095a5.q();
                                                    f7 = f8;
                                                    short q13 = c0095a5.q();
                                                    i24 = y12;
                                                    short q14 = c0095a5.q();
                                                    long u8 = c0095a5.u();
                                                    long u9 = c0095a5.u();
                                                    i23 = y11;
                                                    byteBuffer3.position(1);
                                                    byteBuffer3.putShort(q11);
                                                    byteBuffer3.putShort(q12);
                                                    byteBuffer3.putShort(q7);
                                                    byteBuffer3.putShort(q8);
                                                    byteBuffer3.putShort(q9);
                                                    byteBuffer3.putShort(q10);
                                                    byteBuffer3.putShort(q13);
                                                    byteBuffer3.putShort(q14);
                                                    byteBuffer3.putShort((short) (u8 / 10000));
                                                    byteBuffer3.putShort((short) (u9 / 10000));
                                                    byteBuffer = byteBuffer3;
                                                    i54 = i22;
                                                    bArr3 = bArr4;
                                                    i58 += g15;
                                                    list2 = list;
                                                    g14 = i25;
                                                    i17 = i26;
                                                    i16 = i27;
                                                    f8 = f7;
                                                    y12 = i24;
                                                    y11 = i23;
                                                    str10 = str13;
                                                } else {
                                                    i23 = y11;
                                                    i24 = y12;
                                                    i25 = g14;
                                                    i26 = i17;
                                                    i27 = i16;
                                                    f7 = f8;
                                                    bArr = bArr3;
                                                    if (g16 == 1681012275) {
                                                        Q0.a.f(null, str11 == null);
                                                        str11 = "video/3gpp";
                                                        i54 = i22;
                                                        bArr3 = bArr;
                                                    } else if (g16 == 1702061171) {
                                                        Q0.a.f(null, str11 == null);
                                                        C0321h a7 = a(i59, c0095a5);
                                                        byte[] bArr5 = (byte[]) a7.f4019e;
                                                        List I8 = bArr5 != null ? AbstractC0167z.I(bArr5) : list;
                                                        str11 = (String) a7.f4018d;
                                                        c0321h2 = a7;
                                                        list = I8;
                                                        i54 = i22;
                                                        bArr3 = bArr;
                                                    } else if (g16 == 1885434736) {
                                                        c0095a5.D(i59 + 8);
                                                        f7 = c0095a5.w() / c0095a5.w();
                                                        i54 = i22;
                                                        bArr3 = bArr;
                                                        z8 = true;
                                                        i58 += g15;
                                                        list2 = list;
                                                        g14 = i25;
                                                        i17 = i26;
                                                        i16 = i27;
                                                        f8 = f7;
                                                        y12 = i24;
                                                        y11 = i23;
                                                        str10 = str13;
                                                    } else if (g16 == 1937126244) {
                                                        int i62 = i59 + 8;
                                                        while (true) {
                                                            if (i62 - i59 >= g15) {
                                                                bArr2 = null;
                                                                break;
                                                            }
                                                            c0095a5.D(i62);
                                                            int g17 = c0095a5.g();
                                                            if (c0095a5.g() == 1886547818) {
                                                                bArr2 = Arrays.copyOfRange((byte[]) c0095a5.f1465c, i62, g17 + i62);
                                                                break;
                                                            }
                                                            i62 += g17;
                                                        }
                                                        bArr3 = bArr2;
                                                        i54 = i22;
                                                    } else if (g16 == 1936995172) {
                                                        int t10 = c0095a5.t();
                                                        c0095a5.E(3);
                                                        if (t10 == 0) {
                                                            int t11 = c0095a5.t();
                                                            if (t11 == 0) {
                                                                i22 = 0;
                                                            } else if (t11 == 1) {
                                                                i22 = 1;
                                                            } else if (t11 == 2) {
                                                                i22 = 2;
                                                            } else if (t11 == 3) {
                                                                i22 = 3;
                                                            }
                                                        }
                                                        i54 = i22;
                                                        bArr3 = bArr;
                                                        i58 += g15;
                                                        list2 = list;
                                                        g14 = i25;
                                                        i17 = i26;
                                                        i16 = i27;
                                                        f8 = f7;
                                                        y12 = i24;
                                                        y11 = i23;
                                                        str10 = str13;
                                                    } else if (g16 == 1668246642) {
                                                        int g18 = c0095a5.g();
                                                        if (g18 == 1852009592 || g18 == 1852009571) {
                                                            int y13 = c0095a5.y();
                                                            int y14 = c0095a5.y();
                                                            c0095a5.E(2);
                                                            boolean z9 = g15 == 19 && (c0095a5.t() & 128) != 0;
                                                            int a8 = C1767b.a(y13);
                                                            if (z9) {
                                                                i28 = 1;
                                                                i29 = 1;
                                                            } else {
                                                                i28 = 1;
                                                                i29 = 2;
                                                            }
                                                            if (y14 != i28) {
                                                                if (y14 != 16) {
                                                                    i30 = 7;
                                                                    if (y14 != 18) {
                                                                        if (y14 != 6 && y14 != 7) {
                                                                            i30 = -1;
                                                                        }
                                                                    }
                                                                } else {
                                                                    i30 = 6;
                                                                }
                                                                i56 = a8;
                                                                i55 = i29;
                                                                i57 = i30;
                                                            }
                                                            i30 = 3;
                                                            i56 = a8;
                                                            i55 = i29;
                                                            i57 = i30;
                                                        } else {
                                                            Log.w("AtomParsers", "Unsupported color type: " + D1.a.c(g18));
                                                        }
                                                    }
                                                    i58 += g15;
                                                    list2 = list;
                                                    g14 = i25;
                                                    i17 = i26;
                                                    i16 = i27;
                                                    f8 = f7;
                                                    y12 = i24;
                                                    y11 = i23;
                                                    str10 = str13;
                                                }
                                                i23 = y11;
                                                i24 = y12;
                                                i25 = g14;
                                                i26 = i17;
                                                i27 = i16;
                                                f7 = f8;
                                            }
                                            i54 = i22;
                                            bArr3 = bArr;
                                            i58 += g15;
                                            list2 = list;
                                            g14 = i25;
                                            i17 = i26;
                                            i16 = i27;
                                            f8 = f7;
                                            y12 = i24;
                                            y11 = i23;
                                            str10 = str13;
                                        }
                                        i54 = i22;
                                        i58 += g15;
                                        list2 = list;
                                        g14 = i25;
                                        i17 = i26;
                                        i16 = i27;
                                        f8 = f7;
                                        y12 = i24;
                                        y11 = i23;
                                        str10 = str13;
                                    }
                                    float f9 = f8;
                                    byte[] bArr6 = bArr3;
                                    if (str11 == null) {
                                        i8 = i51;
                                        x8 = x9;
                                    } else {
                                        Format$Builder format$Builder = new Format$Builder();
                                        format$Builder.f10528a = Integer.toString(g8);
                                        format$Builder.f10537k = str11;
                                        format$Builder.f10535h = str12;
                                        format$Builder.f10542p = i18;
                                        format$Builder.f10543q = i19;
                                        format$Builder.f10546t = f9;
                                        i8 = i51;
                                        format$Builder.f10545s = i8;
                                        format$Builder.f10547u = bArr6;
                                        format$Builder.f10548v = i22;
                                        format$Builder.f10539m = list;
                                        format$Builder.f10540n = drmInitData5;
                                        int i63 = i56;
                                        int i64 = i55;
                                        int i65 = i57;
                                        if (i63 != -1 || i64 != -1 || i65 != -1 || byteBuffer != null) {
                                            format$Builder.f10549w = new C1767b(i63, byteBuffer != null ? byteBuffer.array() : null, i64, i65);
                                        }
                                        if (c0321h2 != null) {
                                            C0321h c0321h3 = c0321h2;
                                            format$Builder.f10533f = c0321h3.f4016b;
                                            format$Builder.f10534g = c0321h3.f4017c;
                                        }
                                        x8 = new X(format$Builder);
                                    }
                                    i11 = i53;
                                } else {
                                    i15 = i44;
                                    if (g14 == 1836069985 || g14 == 1701733217 || g14 == 1633889587 || g14 == 1700998451 || g14 == 1633889588 || g14 == 1835823201 || g14 == 1685353315 || g14 == 1685353317 || g14 == 1685353320 || g14 == 1685353324 || g14 == 1685353336 || g14 == 1935764850 || g14 == 1935767394 || g14 == 1819304813 || g14 == 1936684916 || g14 == 1953984371 || g14 == 778924082 || g14 == 778924083 || g14 == 1835557169 || g14 == 1835560241 || g14 == 1634492771 || g14 == 1634492791 || g14 == 1970037111 || g14 == 1332770163 || g14 == 1716281667) {
                                        pair2 = create2;
                                        c0095a5.D(i49 + 16);
                                        if (z7) {
                                            i31 = c0095a5.y();
                                            c0095a5.E(6);
                                        } else {
                                            c0095a5.E(8);
                                            i31 = 0;
                                        }
                                        if (i31 == 0 || i31 == 1) {
                                            int y15 = c0095a5.y();
                                            c0095a5.E(6);
                                            byte[] bArr7 = (byte[]) c0095a5.f1465c;
                                            int i66 = c0095a5.f1463a;
                                            str2 = "childAtomSize must be positive";
                                            int i67 = i66 + 1;
                                            c0095a5.f1463a = i67;
                                            x7 = x8;
                                            int i68 = (bArr7[i66] & 255) << 8;
                                            aVar2 = aVar4;
                                            c0095a5.f1463a = i66 + 2;
                                            int i69 = (bArr7[i67] & 255) | i68;
                                            c0095a5.f1463a = i66 + 4;
                                            c0095a5.D(i66);
                                            int g19 = c0095a5.g();
                                            if (i31 == 1) {
                                                c0095a5.E(16);
                                            }
                                            i32 = i69;
                                            i33 = g19;
                                            i34 = y15;
                                        } else if (i31 == 2) {
                                            c0095a5.E(16);
                                            i32 = (int) Math.round(Double.longBitsToDouble(c0095a5.n()));
                                            i34 = c0095a5.w();
                                            c0095a5.E(20);
                                            aVar2 = aVar4;
                                            str2 = "childAtomSize must be positive";
                                            x7 = x8;
                                            i33 = 0;
                                        } else {
                                            i14 = i9;
                                            i37 = i8;
                                            i36 = g13;
                                            aVar2 = aVar4;
                                            i35 = i49;
                                            rVarArr2 = rVarArr3;
                                            str = str9;
                                            i8 = i37;
                                            i21 = i36;
                                            i20 = i35;
                                        }
                                        int i70 = c0095a5.f1463a;
                                        if (g14 == 1701733217) {
                                            Pair c7 = c(c0095a5, i49, g13);
                                            if (c7 != null) {
                                                g14 = ((Integer) c7.first).intValue();
                                                drmInitData3 = drmInitData4 == null ? null : drmInitData4.a(((r) c7.second).f4750b);
                                                rVarArr3[i9] = (r) c7.second;
                                            } else {
                                                drmInitData3 = drmInitData4;
                                            }
                                            c0095a5.D(i70);
                                        } else {
                                            drmInitData3 = drmInitData4;
                                        }
                                        String str14 = "audio/ac3";
                                        int i71 = i32;
                                        if (g14 == 1633889587) {
                                            str3 = "audio/ac3";
                                        } else if (g14 == 1700998451) {
                                            str3 = "audio/eac3";
                                        } else if (g14 == 1633889588) {
                                            str3 = "audio/ac4";
                                        } else if (g14 == 1685353315) {
                                            str3 = "audio/vnd.dts";
                                        } else if (g14 == 1685353320 || g14 == 1685353324) {
                                            str3 = "audio/vnd.dts.hd";
                                        } else if (g14 == 1685353317) {
                                            str3 = "audio/vnd.dts.hd;profile=lbr";
                                        } else if (g14 == 1685353336) {
                                            str3 = "audio/vnd.dts.uhd;profile=p2";
                                        } else if (g14 == 1935764850) {
                                            str3 = "audio/3gpp";
                                        } else if (g14 == 1935767394) {
                                            str3 = "audio/amr-wb";
                                        } else {
                                            if (g14 == 1819304813 || g14 == 1936684916) {
                                                str3 = "audio/raw";
                                                i38 = 2;
                                            } else if (g14 == 1953984371) {
                                                i38 = 268435456;
                                                str3 = "audio/raw";
                                            } else {
                                                str3 = (g14 == 778924082 || g14 == 778924083) ? "audio/mpeg" : g14 == 1835557169 ? "audio/mha1" : g14 == 1835560241 ? "audio/mhm1" : g14 == 1634492771 ? "audio/alac" : g14 == 1634492791 ? "audio/g711-alaw" : g14 == 1970037111 ? "audio/g711-mlaw" : g14 == 1332770163 ? "audio/opus" : g14 == 1716281667 ? "audio/flac" : g14 == 1835823201 ? "audio/true-hd" : null;
                                            }
                                            i14 = i9;
                                            i37 = i8;
                                            int i72 = i34;
                                            rVarArr2 = rVarArr3;
                                            i39 = i70;
                                            int i73 = i71;
                                            String str15 = null;
                                            C0321h c0321h4 = null;
                                            List list4 = null;
                                            while (i39 - i49 < g13) {
                                                c0095a5.D(i39);
                                                int g20 = c0095a5.g();
                                                int i74 = g13;
                                                int i75 = i49;
                                                String str16 = str2;
                                                Q0.a.f(str16, g20 > 0);
                                                int g21 = c0095a5.g();
                                                int i76 = i38;
                                                if (g21 == 1835557187) {
                                                    int i77 = g20 - 13;
                                                    byte[] bArr8 = new byte[i77];
                                                    c0095a5.D(i39 + 13);
                                                    c0095a5.f(bArr8, 0, i77);
                                                    list4 = AbstractC0167z.I(bArr8);
                                                    str4 = str14;
                                                    str6 = str16;
                                                    str15 = str15;
                                                } else {
                                                    String str17 = str15;
                                                    if (g21 == 1702061171) {
                                                        str4 = str14;
                                                        str5 = str16;
                                                        i40 = 1702061171;
                                                    } else if (z7 && g21 == 2002876005) {
                                                        str4 = str14;
                                                        str5 = str16;
                                                        i40 = 1702061171;
                                                    } else {
                                                        int[] iArr = AbstractC0096b.f1471f;
                                                        int[] iArr2 = AbstractC0096b.f1469d;
                                                        if (g21 == 1684103987) {
                                                            c0095a5.D(i39 + 8);
                                                            String num = Integer.toString(g8);
                                                            int i78 = iArr2[(c0095a5.t() & 192) >> 6];
                                                            int t12 = c0095a5.t();
                                                            int i79 = iArr[(t12 & 56) >> 3];
                                                            if ((t12 & 4) != 0) {
                                                                i79++;
                                                            }
                                                            Format$Builder format$Builder2 = new Format$Builder();
                                                            format$Builder2.f10528a = num;
                                                            format$Builder2.f10537k = str14;
                                                            format$Builder2.f10550x = i79;
                                                            format$Builder2.f10551y = i78;
                                                            format$Builder2.f10540n = drmInitData3;
                                                            format$Builder2.f10530c = str9;
                                                            x7 = new X(format$Builder2);
                                                            str4 = str14;
                                                        } else if (g21 == 1684366131) {
                                                            c0095a5.D(i39 + 8);
                                                            String num2 = Integer.toString(g8);
                                                            c0095a5.E(2);
                                                            int i80 = iArr2[(c0095a5.t() & 192) >> 6];
                                                            int t13 = c0095a5.t();
                                                            int i81 = iArr[(t13 & 14) >> 1];
                                                            if ((t13 & 1) != 0) {
                                                                i81++;
                                                            }
                                                            if (((c0095a5.t() & 30) >> 1) > 0 && (c0095a5.t() & 2) != 0) {
                                                                i81 += 2;
                                                            }
                                                            if (c0095a5.d() <= 0 || (c0095a5.t() & 1) == 0) {
                                                                str4 = str14;
                                                                str8 = "audio/eac3";
                                                            } else {
                                                                str8 = "audio/eac3-joc";
                                                                str4 = str14;
                                                            }
                                                            Format$Builder format$Builder3 = new Format$Builder();
                                                            format$Builder3.f10528a = num2;
                                                            format$Builder3.f10537k = str8;
                                                            format$Builder3.f10550x = i81;
                                                            format$Builder3.f10551y = i80;
                                                            format$Builder3.f10540n = drmInitData3;
                                                            format$Builder3.f10530c = str9;
                                                            x7 = new X(format$Builder3);
                                                        } else {
                                                            str4 = str14;
                                                            if (g21 == 1684103988) {
                                                                c0095a5.D(i39 + 8);
                                                                String num3 = Integer.toString(g8);
                                                                c0095a5.E(1);
                                                                int i82 = ((c0095a5.t() & 32) >> 5) == 1 ? 48000 : 44100;
                                                                Format$Builder format$Builder4 = new Format$Builder();
                                                                format$Builder4.f10528a = num3;
                                                                format$Builder4.f10537k = "audio/ac4";
                                                                format$Builder4.f10550x = 2;
                                                                format$Builder4.f10551y = i82;
                                                                format$Builder4.f10540n = drmInitData3;
                                                                format$Builder4.f10530c = str9;
                                                                x7 = new X(format$Builder4);
                                                            } else if (g21 == 1684892784) {
                                                                if (i33 <= 0) {
                                                                    throw C0045t0.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + i33);
                                                                }
                                                                i73 = i33;
                                                                str15 = str17;
                                                                str6 = str16;
                                                                i72 = 2;
                                                            } else if (g21 == 1684305011) {
                                                                Format$Builder format$Builder5 = new Format$Builder();
                                                                format$Builder5.f10528a = Integer.toString(g8);
                                                                format$Builder5.f10537k = str3;
                                                                format$Builder5.f10550x = i72;
                                                                format$Builder5.f10551y = i73;
                                                                format$Builder5.f10540n = drmInitData3;
                                                                format$Builder5.f10530c = str9;
                                                                x7 = new X(format$Builder5);
                                                            } else {
                                                                if (g21 == 1682927731) {
                                                                    int i83 = g20 - 8;
                                                                    byte[] bArr9 = f4651a;
                                                                    byte[] copyOf = Arrays.copyOf(bArr9, bArr9.length + i83);
                                                                    c0095a5.D(i39 + 8);
                                                                    c0095a5.f(copyOf, bArr9.length, i83);
                                                                    I7 = AbstractC0096b.a(copyOf);
                                                                } else if (g21 == 1684425825) {
                                                                    byte[] bArr10 = new byte[g20 - 8];
                                                                    bArr10[0] = 102;
                                                                    bArr10[1] = 76;
                                                                    bArr10[2] = 97;
                                                                    bArr10[3] = 67;
                                                                    c0095a5.D(i39 + 12);
                                                                    c0095a5.f(bArr10, 4, g20 - 12);
                                                                    I7 = AbstractC0167z.I(bArr10);
                                                                } else {
                                                                    if (g21 == 1634492771) {
                                                                        int i84 = g20 - 12;
                                                                        byte[] bArr11 = new byte[i84];
                                                                        c0095a5.D(i39 + 12);
                                                                        c0095a5.f(bArr11, 0, i84);
                                                                        C0095a c0095a6 = new C0095a(bArr11);
                                                                        c0095a6.D(9);
                                                                        int t14 = c0095a6.t();
                                                                        c0095a6.D(20);
                                                                        Pair create3 = Pair.create(Integer.valueOf(c0095a6.w()), Integer.valueOf(t14));
                                                                        int intValue = ((Integer) create3.first).intValue();
                                                                        i72 = ((Integer) create3.second).intValue();
                                                                        list4 = AbstractC0167z.I(bArr11);
                                                                        i73 = intValue;
                                                                        str15 = str17;
                                                                        str6 = str16;
                                                                    }
                                                                    str15 = str17;
                                                                    str6 = str16;
                                                                }
                                                                list4 = I7;
                                                                str15 = str17;
                                                                str6 = str16;
                                                            }
                                                            str15 = str17;
                                                            str6 = str16;
                                                        }
                                                        str15 = str17;
                                                        str6 = str16;
                                                    }
                                                    if (g21 != i40) {
                                                        i41 = c0095a5.f1463a;
                                                        Q0.a.f(null, i41 >= i39);
                                                        while (true) {
                                                            if (i41 - i39 >= g20) {
                                                                str6 = str5;
                                                                i41 = -1;
                                                                break;
                                                            }
                                                            c0095a5.D(i41);
                                                            int g22 = c0095a5.g();
                                                            str6 = str5;
                                                            Q0.a.f(str6, g22 > 0);
                                                            if (c0095a5.g() == 1702061171) {
                                                                break;
                                                            }
                                                            i41 += g22;
                                                            str5 = str6;
                                                        }
                                                    } else {
                                                        i41 = i39;
                                                        str6 = str5;
                                                    }
                                                    if (i41 != -1) {
                                                        C0321h a9 = a(i41, c0095a5);
                                                        str3 = (String) a9.f4018d;
                                                        byte[] bArr12 = (byte[]) a9.f4019e;
                                                        if (bArr12 != null) {
                                                            if ("audio/mp4a-latm".equals(str3)) {
                                                                C0095a g23 = AbstractC0096b.g(new x(bArr12, bArr12.length), false);
                                                                i73 = g23.f1463a;
                                                                i42 = g23.f1464b;
                                                                str7 = (String) g23.f1465c;
                                                            } else {
                                                                i42 = i72;
                                                                str7 = str17;
                                                            }
                                                            list4 = AbstractC0167z.I(bArr12);
                                                            String str18 = str7;
                                                            c0321h = a9;
                                                            str15 = str18;
                                                            c0321h4 = c0321h;
                                                            i72 = i42;
                                                            i39 += g20;
                                                            str2 = str6;
                                                            i38 = i76;
                                                            g13 = i74;
                                                            i49 = i75;
                                                            str14 = str4;
                                                        } else {
                                                            i42 = i72;
                                                            c0321h = a9;
                                                        }
                                                    } else {
                                                        i42 = i72;
                                                        c0321h = c0321h4;
                                                    }
                                                    str15 = str17;
                                                    c0321h4 = c0321h;
                                                    i72 = i42;
                                                    i39 += g20;
                                                    str2 = str6;
                                                    i38 = i76;
                                                    g13 = i74;
                                                    i49 = i75;
                                                    str14 = str4;
                                                }
                                                i39 += g20;
                                                str2 = str6;
                                                i38 = i76;
                                                g13 = i74;
                                                i49 = i75;
                                                str14 = str4;
                                            }
                                            String str19 = str15;
                                            i36 = g13;
                                            int i85 = i38;
                                            i35 = i49;
                                            if (x7 == null || str3 == null) {
                                                x8 = x7;
                                            } else {
                                                Format$Builder format$Builder6 = new Format$Builder();
                                                format$Builder6.f10528a = Integer.toString(g8);
                                                format$Builder6.f10537k = str3;
                                                format$Builder6.f10535h = str19;
                                                format$Builder6.f10550x = i72;
                                                format$Builder6.f10551y = i73;
                                                format$Builder6.f10552z = i85;
                                                format$Builder6.f10539m = list4;
                                                format$Builder6.f10540n = drmInitData3;
                                                format$Builder6.f10530c = str9;
                                                if (c0321h4 != null) {
                                                    C0321h c0321h5 = c0321h4;
                                                    format$Builder6.f10533f = c0321h5.f4016b;
                                                    format$Builder6.f10534g = c0321h5.f4017c;
                                                }
                                                x8 = new X(format$Builder6);
                                            }
                                            str = str9;
                                            i8 = i37;
                                            i21 = i36;
                                            i20 = i35;
                                        }
                                        i38 = -1;
                                        i14 = i9;
                                        i37 = i8;
                                        int i722 = i34;
                                        rVarArr2 = rVarArr3;
                                        i39 = i70;
                                        int i732 = i71;
                                        String str152 = null;
                                        C0321h c0321h42 = null;
                                        List list42 = null;
                                        while (i39 - i49 < g13) {
                                        }
                                        String str192 = str152;
                                        i36 = g13;
                                        int i852 = i38;
                                        i35 = i49;
                                        if (x7 == null) {
                                        }
                                        x8 = x7;
                                        str = str9;
                                        i8 = i37;
                                        i21 = i36;
                                        i20 = i35;
                                    } else {
                                        if (g14 == 1414810956 || g14 == 1954034535 || g14 == 2004251764 || g14 == 1937010800 || g14 == 1664495672) {
                                            c0095a5.D(i49 + 16);
                                            String str20 = "application/ttml+xml";
                                            if (g14 != 1414810956) {
                                                if (g14 == 1954034535) {
                                                    int i86 = g13 - 16;
                                                    byte[] bArr13 = new byte[i86];
                                                    c0095a5.f(bArr13, 0, i86);
                                                    l7 = AbstractC0167z.I(bArr13);
                                                    str20 = "application/x-quicktime-tx3g";
                                                    j8 = Long.MAX_VALUE;
                                                } else if (g14 == 2004251764) {
                                                    str20 = "application/x-mp4-vtt";
                                                } else if (g14 == 1937010800) {
                                                    j8 = 0;
                                                    l7 = null;
                                                } else {
                                                    if (g14 != 1664495672) {
                                                        throw new IllegalStateException();
                                                    }
                                                    str20 = "application/x-mp4-cea-608";
                                                    j8 = Long.MAX_VALUE;
                                                    l7 = null;
                                                    i10 = 1;
                                                }
                                                Format$Builder format$Builder7 = new Format$Builder();
                                                pair2 = create2;
                                                format$Builder7.f10528a = Integer.toString(g8);
                                                format$Builder7.f10537k = str20;
                                                format$Builder7.f10530c = str9;
                                                format$Builder7.f10541o = j8;
                                                format$Builder7.f10539m = l7;
                                                i14 = i9;
                                                x8 = new X(format$Builder7);
                                                i21 = g13;
                                                aVar2 = aVar4;
                                            }
                                            j8 = Long.MAX_VALUE;
                                            l7 = null;
                                            Format$Builder format$Builder72 = new Format$Builder();
                                            pair2 = create2;
                                            format$Builder72.f10528a = Integer.toString(g8);
                                            format$Builder72.f10537k = str20;
                                            format$Builder72.f10530c = str9;
                                            format$Builder72.f10541o = j8;
                                            format$Builder72.f10539m = l7;
                                            i14 = i9;
                                            x8 = new X(format$Builder72);
                                            i21 = g13;
                                            aVar2 = aVar4;
                                        } else {
                                            if (g14 == 1835365492) {
                                                c0095a5.D(i49 + 16);
                                                if (g14 == 1835365492) {
                                                    c0095a5.o();
                                                    String o7 = c0095a5.o();
                                                    if (o7 != null) {
                                                        Format$Builder format$Builder8 = new Format$Builder();
                                                        format$Builder8.f10528a = Integer.toString(g8);
                                                        format$Builder8.f10537k = o7;
                                                        x8 = new X(format$Builder8);
                                                    }
                                                }
                                            } else if (g14 == 1667329389) {
                                                Format$Builder format$Builder9 = new Format$Builder();
                                                format$Builder9.f10528a = Integer.toString(g8);
                                                format$Builder9.f10537k = "application/x-camera-motion";
                                                x8 = new X(format$Builder9);
                                            }
                                            i14 = i9;
                                            i21 = g13;
                                            aVar2 = aVar4;
                                            pair2 = create2;
                                        }
                                        str = str9;
                                        i20 = i49;
                                        rVarArr2 = rVarArr3;
                                    }
                                }
                                c0095a5.D(i20 + i21);
                                i9 = i14 + 1;
                                drmInitData4 = drmInitData;
                                g3 = i48;
                                i43 = i50;
                                arrayList2 = arrayList4;
                                u4 = j10;
                                str9 = str;
                                rVarArr3 = rVarArr2;
                                create2 = pair2;
                                i44 = i15;
                                aVar4 = aVar2;
                            }
                            arrayList = arrayList2;
                            i12 = i43;
                            a aVar5 = aVar4;
                            pair = create2;
                            i13 = i44;
                            j7 = u4;
                            rVarArr = rVarArr3;
                            x4 = x8;
                            if (z4) {
                                aVar4 = aVar5;
                            } else {
                                aVar4 = aVar5;
                                a t15 = aVar4.t(1701082227);
                                if (t15 != null) {
                                    b y16 = t15.y(1701606260);
                                    if (y16 == null) {
                                        create = null;
                                    } else {
                                        C0095a c0095a7 = y16.f4636c;
                                        c0095a7.D(8);
                                        int l10 = D1.a.l(c0095a7.g());
                                        int w7 = c0095a7.w();
                                        long[] jArr3 = new long[w7];
                                        long[] jArr4 = new long[w7];
                                        for (int i87 = 0; i87 < w7; i87++) {
                                            jArr3[i87] = l10 == 1 ? c0095a7.x() : c0095a7.u();
                                            jArr4[i87] = l10 == 1 ? c0095a7.n() : c0095a7.g();
                                            if (c0095a7.q() != 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            c0095a7.E(2);
                                        }
                                        create = Pair.create(jArr3, jArr4);
                                    }
                                    if (create != null) {
                                        jArr2 = (long[]) create.first;
                                        jArr = (long[]) create.second;
                                        qVar = x4 != null ? null : new q(g8, i13, ((Long) pair.first).longValue(), j7, K7, x4, i10, rVarArr, i11, jArr2, jArr);
                                        gVar2 = gVar;
                                    }
                                }
                            }
                            jArr = null;
                            jArr2 = null;
                            if (x4 != null) {
                            }
                            gVar2 = gVar;
                        }
                    } else {
                        i7 = -65536;
                    }
                    if (g9 == 0 && g10 == i7) {
                        if (g11 == 65536 && g12 == 0) {
                            i8 = 270;
                            if (j == -9223372036854775807L) {
                            }
                            C0095a c0095a32 = y4.f4636c;
                            c0095a32.D(8);
                            c0095a32.E(D1.a.l(c0095a32.g()) == 0 ? 8 : 16);
                            long u42 = c0095a32.u();
                            if (j9 != -9223372036854775807L) {
                            }
                            a t82 = t7.t(1835626086);
                            t82.getClass();
                            a t92 = t82.t(1937007212);
                            t92.getClass();
                            b y82 = t7.y(1835296868);
                            y82.getClass();
                            C0095a c0095a42 = y82.f4636c;
                            c0095a42.D(8);
                            int l92 = D1.a.l(c0095a42.g());
                            c0095a42.E(l92 == 0 ? 8 : 16);
                            long u72 = c0095a42.u();
                            c0095a42.E(l92 == 0 ? 4 : 8);
                            int y92 = c0095a42.y();
                            Pair create22 = Pair.create(Long.valueOf(u72), "" + ((char) (((y92 >> 10) & 31) + 96)) + ((char) (((y92 >> 5) & 31) + 96)) + ((char) ((y92 & 31) + 96)));
                            b y102 = t92.y(1937011556);
                            y102.getClass();
                            String str92 = (String) create22.second;
                            C0095a c0095a52 = y102.f4636c;
                            c0095a52.D(12);
                            g3 = c0095a52.g();
                            r[] rVarArr32 = new r[g3];
                            i9 = 0;
                            X x82 = null;
                            i10 = 0;
                            i11 = 0;
                            while (i9 < g3) {
                            }
                            arrayList = arrayList2;
                            i12 = i43;
                            a aVar52 = aVar4;
                            pair = create22;
                            i13 = i44;
                            j7 = u42;
                            rVarArr = rVarArr32;
                            x4 = x82;
                            if (z4) {
                            }
                            jArr = null;
                            jArr2 = null;
                            if (x4 != null) {
                            }
                            gVar2 = gVar;
                        } else {
                            i7 = -65536;
                        }
                    }
                    i8 = (g9 == i7 && g10 == 0 && g11 == 0 && g12 == i7) ? 180 : 0;
                    if (j == -9223372036854775807L) {
                    }
                    C0095a c0095a322 = y4.f4636c;
                    c0095a322.D(8);
                    c0095a322.E(D1.a.l(c0095a322.g()) == 0 ? 8 : 16);
                    long u422 = c0095a322.u();
                    if (j9 != -9223372036854775807L) {
                    }
                    a t822 = t7.t(1835626086);
                    t822.getClass();
                    a t922 = t822.t(1937007212);
                    t922.getClass();
                    b y822 = t7.y(1835296868);
                    y822.getClass();
                    C0095a c0095a422 = y822.f4636c;
                    c0095a422.D(8);
                    int l922 = D1.a.l(c0095a422.g());
                    c0095a422.E(l922 == 0 ? 8 : 16);
                    long u722 = c0095a422.u();
                    c0095a422.E(l922 == 0 ? 4 : 8);
                    int y922 = c0095a422.y();
                    Pair create222 = Pair.create(Long.valueOf(u722), "" + ((char) (((y922 >> 10) & 31) + 96)) + ((char) (((y922 >> 5) & 31) + 96)) + ((char) ((y922 & 31) + 96)));
                    b y1022 = t922.y(1937011556);
                    y1022.getClass();
                    String str922 = (String) create222.second;
                    C0095a c0095a522 = y1022.f4636c;
                    c0095a522.D(12);
                    g3 = c0095a522.g();
                    r[] rVarArr322 = new r[g3];
                    i9 = 0;
                    X x822 = null;
                    i10 = 0;
                    i11 = 0;
                    while (i9 < g3) {
                    }
                    arrayList = arrayList2;
                    i12 = i43;
                    a aVar522 = aVar4;
                    pair = create222;
                    i13 = i44;
                    j7 = u422;
                    rVarArr = rVarArr322;
                    x4 = x822;
                    if (z4) {
                    }
                    jArr = null;
                    jArr2 = null;
                    if (x4 != null) {
                    }
                    gVar2 = gVar;
                }
                q qVar2 = (q) gVar2.apply(qVar);
                if (qVar2 == null) {
                    arrayList2 = arrayList;
                } else {
                    a t16 = aVar4.t(1835297121);
                    t16.getClass();
                    a t17 = t16.t(1835626086);
                    t17.getClass();
                    a t18 = t17.t(1937007212);
                    t18.getClass();
                    t d7 = d(qVar2, t18, pVar);
                    arrayList2 = arrayList;
                    arrayList2.add(d7);
                }
            }
            i43 = i12 + 1;
            aVar3 = aVar;
            drmInitData4 = drmInitData;
        }
    }
}
