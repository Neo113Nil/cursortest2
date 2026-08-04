package C1;

import A1.C0045t0;
import C0.C0091j;
import W5.AbstractC0486a1;
import android.util.Log;
import com.google.android.gms.internal.ads.zzbbd;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: renamed from: C1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0096b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f1466a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f1467b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f1468c = {1, 2, 3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1469d = {48000, 44100, 32000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f1470e = {24000, 22050, 16000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f1471f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f1472g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f1473h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f1474i = {2002, 2000, 1920, 1601, 1600, 1001, zzbbd.zzq.zzf, 960, 800, 800, 480, 400, 400, 2048};
    public static final int[] j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f1475k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f1476l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f1477m = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f1478n = {44100, 48000, 32000};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f1479o = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f1480p = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f1481q = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f1482r = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f1483s = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static ArrayList a(byte[] bArr) {
        long j3 = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j3).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static int b(int i7, int i8) {
        int i9 = i8 / 2;
        if (i7 < 0 || i7 >= 3 || i8 < 0 || i9 >= 19) {
            return -1;
        }
        int i10 = f1469d[i7];
        if (i10 == 44100) {
            return ((i8 % 2) + f1473h[i9]) * 2;
        }
        int i11 = f1472g[i9];
        return i10 == 32000 ? i11 * 6 : i11 * 4;
    }

    public static void c(int i7, C0095a c0095a) {
        c0095a.A(7);
        byte[] bArr = (byte[]) c0095a.f1465c;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i7 >> 16) & 255);
        bArr[5] = (byte) ((i7 >> 8) & 255);
        bArr[6] = (byte) (i7 & 255);
    }

    public static int d(int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (!((i7 & (-2097152)) == -2097152) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return -1;
        }
        int i13 = f1478n[i11];
        if (i8 == 2) {
            i13 /= 2;
        } else if (i8 == 0) {
            i13 /= 4;
        }
        int i14 = (i7 >>> 9) & 1;
        if (i9 == 3) {
            return ((((i8 == 3 ? f1479o[i10 - 1] : f1480p[i10 - 1]) * 12) / i13) + i14) * 4;
        }
        if (i8 == 3) {
            i12 = i9 == 2 ? f1481q[i10 - 1] : f1482r[i10 - 1];
        } else {
            i12 = f1483s[i10 - 1];
        }
        if (i8 == 3) {
            return AbstractC0486a1.q(i12, 144, i13, i14);
        }
        return AbstractC0486a1.q(i9 == 1 ? 72 : 144, i12, i13, i14);
    }

    public static int e(F1.x xVar) throws C0045t0 {
        int i7 = xVar.i(4);
        if (i7 == 15) {
            return xVar.i(24);
        }
        if (i7 < 13) {
            return f1466a[i7];
        }
        throw C0045t0.a(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static C0091j f(F1.x xVar) {
        int i7;
        int i8;
        int i9 = xVar.i(16);
        int i10 = xVar.i(16);
        if (i10 == 65535) {
            i10 = xVar.i(24);
            i7 = 7;
        } else {
            i7 = 4;
        }
        int i11 = i10 + i7;
        if (i9 == 44097) {
            i11 += 2;
        }
        if (xVar.i(2) == 3) {
            do {
                xVar.i(2);
            } while (xVar.h());
        }
        int i12 = xVar.i(10);
        if (xVar.h() && xVar.i(3) > 0) {
            xVar.r(2);
        }
        int i13 = xVar.h() ? 48000 : 44100;
        int i14 = xVar.i(4);
        int[] iArr = f1474i;
        if (i13 == 44100 && i14 == 13) {
            i8 = iArr[i14];
        } else if (i13 != 48000 || i14 >= 14) {
            i8 = 0;
        } else {
            int i15 = iArr[i14];
            int i16 = i12 % 5;
            if (i16 == 1) {
                if (i14 != 3 || i14 == 8) {
                    i8 = i15 + 1;
                } else {
                    i8 = i15;
                }
            } else if (i16 != 2) {
                if (i16 == 3) {
                    if (i14 != 3) {
                    }
                    i8 = i15 + 1;
                } else if (i16 == 4 && (i14 == 3 || i14 == 8 || i14 == 11)) {
                    i8 = i15 + 1;
                } else {
                    i8 = i15;
                }
            } else if (i14 == 8 || i14 == 11) {
                i8 = i15 + 1;
            } else {
                i8 = i15;
            }
        }
        return new C0091j(i13, i11, i8);
    }

    public static C0095a g(F1.x xVar, boolean z4) throws C0045t0 {
        int i7 = xVar.i(5);
        if (i7 == 31) {
            i7 = xVar.i(6) + 32;
        }
        int iE = e(xVar);
        int i8 = xVar.i(4);
        String strD = p031e1.k.d(i7, "mp4a.40.");
        if (i7 == 5 || i7 == 29) {
            iE = e(xVar);
            int i9 = xVar.i(5);
            if (i9 == 31) {
                i9 = xVar.i(6) + 32;
            }
            i7 = i9;
            if (i7 == 22) {
                i8 = xVar.i(4);
            }
        }
        if (z4) {
            if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4 && i7 != 6 && i7 != 7 && i7 != 17) {
                switch (i7) {
                    case 19:
                    case 20:
                    case zzbbd.zzt.zzm /* 21 */:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C0045t0.c("Unsupported audio object type: " + i7);
                }
            }
            if (xVar.h()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (xVar.h()) {
                xVar.r(14);
            }
            boolean zH = xVar.h();
            if (i8 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i7 == 6 || i7 == 20) {
                xVar.r(3);
            }
            if (zH) {
                if (i7 == 22) {
                    xVar.r(16);
                }
                if (i7 == 17 || i7 == 19 || i7 == 20 || i7 == 23) {
                    xVar.r(3);
                }
                xVar.r(1);
            }
            switch (i7) {
                case 17:
                case 19:
                case 20:
                case zzbbd.zzt.zzm /* 21 */:
                case 22:
                case 23:
                    int i10 = xVar.i(2);
                    if (i10 == 2 || i10 == 3) {
                        throw C0045t0.c("Unsupported epConfig: " + i10);
                    }
                    break;
            }
        }
        int i11 = f1467b[i8];
        if (i11 != -1) {
            return new C0095a(iE, i11, strD);
        }
        throw C0045t0.a(null, null);
    }

    public static int h(int i7) {
        int i8;
        int i9;
        if (!((i7 & (-2097152)) == -2097152) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0) {
            return -1;
        }
        int i10 = (i7 >>> 12) & 15;
        int i11 = (i7 >>> 10) & 3;
        if (i10 == 0 || i10 == 15 || i11 == 3) {
            return -1;
        }
        if (i9 == 1) {
            return i8 == 3 ? 1152 : 576;
        }
        if (i9 == 2) {
            return 1152;
        }
        if (i9 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
