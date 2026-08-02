package com.google.android.gms.internal.ads;

import android.content.Context;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1561sb {

    /* renamed from: Q, reason: collision with root package name */
    public static final Lj f15501Q;

    /* renamed from: a0, reason: collision with root package name */
    public static D3.o f15512a0;

    /* renamed from: b0, reason: collision with root package name */
    public static v3.g f15514b0;

    /* renamed from: e0, reason: collision with root package name */
    public static final C0861cr f15520e0;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f15511a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f15513b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f15515c = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f15517d = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f15519e = {44100, 48000, 32000};
    public static final int[] f = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f15522g = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f15523h = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] i = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f15524j = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: k, reason: collision with root package name */
    public static final C1543s1 f15525k = new C1543s1(17);

    /* renamed from: l, reason: collision with root package name */
    public static final O5 f15526l = new O5(0);

    /* renamed from: m, reason: collision with root package name */
    public static final G3 f15527m = new G3(4, "", "gads:afs:csa:experiment_id");

    /* renamed from: n, reason: collision with root package name */
    public static final G3 f15528n = new G3(4, "", "gads:app_index:experiment_id");

    /* renamed from: o, reason: collision with root package name */
    public static final G3 f15529o = new G3(4, "", "gads:block_autoclicks_experiment_id");

    /* renamed from: p, reason: collision with root package name */
    public static final G3 f15530p = new G3(4, "", "gads:sdk_core_experiment_id");

    /* renamed from: q, reason: collision with root package name */
    public static final G3 f15531q = new G3(4, "", "gads:spam_app_context:experiment_id");

    /* renamed from: r, reason: collision with root package name */
    public static final G3 f15532r = new G3(4, "", "gads:temporary_experiment_id:1");

    /* renamed from: s, reason: collision with root package name */
    public static final G3 f15533s = new G3(4, "", "gads:temporary_experiment_id:10");

    /* renamed from: t, reason: collision with root package name */
    public static final G3 f15534t = new G3(4, "", "gads:temporary_experiment_id:11");

    /* renamed from: u, reason: collision with root package name */
    public static final G3 f15535u = new G3(4, "", "gads:temporary_experiment_id:12");

    /* renamed from: v, reason: collision with root package name */
    public static final G3 f15536v = new G3(4, "", "gads:temporary_experiment_id:13");

    /* renamed from: w, reason: collision with root package name */
    public static final G3 f15537w = new G3(4, "", "gads:temporary_experiment_id:14");

    /* renamed from: x, reason: collision with root package name */
    public static final G3 f15538x = new G3(4, "", "gads:temporary_experiment_id:15");

    /* renamed from: y, reason: collision with root package name */
    public static final G3 f15539y = new G3(4, "", "gads:temporary_experiment_id:2");

    /* renamed from: z, reason: collision with root package name */
    public static final G3 f15540z = new G3(4, "", "gads:temporary_experiment_id:3");

    /* renamed from: A, reason: collision with root package name */
    public static final G3 f15487A = new G3(4, "", "gads:temporary_experiment_id:4");

    /* renamed from: B, reason: collision with root package name */
    public static final G3 f15488B = new G3(4, "", "gads:temporary_experiment_id:5");

    /* renamed from: C, reason: collision with root package name */
    public static final G3 f15489C = new G3(4, "", "gads:temporary_experiment_id:6");

    /* renamed from: D, reason: collision with root package name */
    public static final G3 f15490D = new G3(4, "", "gads:temporary_experiment_id:7");

    /* renamed from: E, reason: collision with root package name */
    public static final G3 f15491E = new G3(4, "", "gads:temporary_experiment_id:8");

    /* renamed from: F, reason: collision with root package name */
    public static final G3 f15492F = new G3(4, "", "gads:temporary_experiment_id:9");

    /* renamed from: G, reason: collision with root package name */
    public static final G3 f15493G = new G3(4, "", "gads:corewebview:experiment_id");

    /* renamed from: H, reason: collision with root package name */
    public static final G3 f15494H = new G3(4, "", "gads:pan:experiment_id");

    /* renamed from: I, reason: collision with root package name */
    public static final O5 f15495I = new O5(9);
    public static final O5 J = new O5(11);
    public static final O5 K = new O5(13);

    /* renamed from: L, reason: collision with root package name */
    public static final O5 f15496L = new O5(15);

    /* renamed from: M, reason: collision with root package name */
    public static final O5 f15497M = new O5(24);

    /* renamed from: N, reason: collision with root package name */
    public static final O5 f15498N = new O5(26);

    /* renamed from: O, reason: collision with root package name */
    public static final O5 f15499O = new O5(28);

    /* renamed from: P, reason: collision with root package name */
    public static final Lj f15500P = new Lj(4);

    /* renamed from: R, reason: collision with root package name */
    public static final Lj f15502R = new Lj(8);

    /* renamed from: S, reason: collision with root package name */
    public static final Lj f15503S = new Lj(10);

    /* renamed from: T, reason: collision with root package name */
    public static final Lj f15504T = new Lj(12);

    /* renamed from: U, reason: collision with root package name */
    public static final Lj f15505U = new Lj(14);

    /* renamed from: V, reason: collision with root package name */
    public static final Lj f15506V = new Lj(16);

    /* renamed from: W, reason: collision with root package name */
    public static final Lj f15507W = new Lj(18);

    /* renamed from: X, reason: collision with root package name */
    public static final Lj f15508X = new Lj(21);

    /* renamed from: Y, reason: collision with root package name */
    public static final Lj f15509Y = new Lj(27);

    /* renamed from: Z, reason: collision with root package name */
    public static final Lj f15510Z = new Lj(29);

    /* renamed from: c0, reason: collision with root package name */
    public static final Object f15516c0 = new Object();

    /* renamed from: d0, reason: collision with root package name */
    public static final C0861cr f15518d0 = new C0861cr(3);

    /* renamed from: f0, reason: collision with root package name */
    public static final C0861cr f15521f0 = new C0861cr(7);

    static {
        int i5 = 5;
        f15501Q = new Lj(i5);
        f15520e0 = new C0861cr(i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r10 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
    
        if (r10 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
    
        if (r10 != 8) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1586t a(C0826c0 c0826c0) {
        int i5;
        int i6;
        int f5 = c0826c0.f(16);
        int f6 = c0826c0.f(16);
        if (f6 == 65535) {
            f6 = c0826c0.f(24);
            i5 = 7;
        } else {
            i5 = 4;
        }
        int i7 = f6 + i5;
        if (f5 == 44097) {
            i7 += 2;
        }
        if (c0826c0.f(2) == 3) {
            do {
                c0826c0.f(2);
            } while (c0826c0.w());
        }
        int f7 = c0826c0.f(10);
        if (c0826c0.w() && c0826c0.f(3) > 0) {
            c0826c0.u(2);
        }
        int i8 = true != c0826c0.w() ? 44100 : 48000;
        int f8 = c0826c0.f(4);
        int[] iArr = f15515c;
        if (i8 == 44100 && f8 == 13) {
            i6 = iArr[13];
        } else if (i8 != 48000 || f8 >= 14) {
            i6 = 0;
        } else {
            int i9 = iArr[f8];
            int i10 = f7 % 5;
            if (i10 != 1) {
                if (i10 == 2) {
                    if (f8 != 8) {
                    }
                    i6 = i9 + 1;
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        if (f8 != 3) {
                            if (f8 != 8) {
                            }
                        }
                        i6 = i9 + 1;
                    }
                    i6 = i9;
                }
            }
            if (f8 != 3) {
            }
            i6 = i9 + 1;
        }
        return new C1586t(i8, i7, i6, false);
    }

    public static int b(int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        if (!((i5 & (-2097152)) == -2097152) || (i6 = (i5 >>> 19) & 3) == 1 || (i7 = (i5 >>> 17) & 3) == 0 || (i8 = (i5 >>> 12) & 15) == 0 || i8 == 15 || (i9 = (i5 >>> 10) & 3) == 3) {
            return -1;
        }
        int i10 = i8 - 1;
        int i11 = f15519e[i9];
        if (i6 == 2) {
            i11 /= 2;
        } else if (i6 == 0) {
            i11 /= 4;
        }
        int i12 = (i5 >>> 9) & 1;
        if (i7 == 3) {
            return ((((i6 == 3 ? f[i10] : f15522g[i10]) * 12) / i11) + i12) * 4;
        }
        int i13 = i6 == 3 ? i7 == 2 ? f15523h[i10] : i[i10] : f15524j[i10];
        if (i6 == 3) {
            return ((i13 * 144) / i11) + i12;
        }
        return (((i7 == 1 ? 72 : 144) * i13) / i11) + i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:
    
        if (r11 != 3) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1541s c(C0826c0 c0826c0, boolean z3) {
        int f5 = c0826c0.f(5);
        if (f5 == 31) {
            f5 = c0826c0.f(6) + 32;
        }
        int i5 = i(c0826c0);
        int f6 = c0826c0.f(4);
        String q5 = AbstractC2107A.q("mp4a.40.", f5);
        int i6 = 22;
        if (f5 == 5 || f5 == 29) {
            i5 = i(c0826c0);
            int f7 = c0826c0.f(5);
            if (f7 == 31) {
                f7 = c0826c0.f(6) + 32;
            }
            f5 = f7;
            if (f5 == 22) {
                f6 = c0826c0.f(4);
            }
        }
        if (z3) {
            int i7 = 3;
            if (f5 != 1 && f5 != 2 && f5 != 3 && f5 != 4 && f5 != 6 && f5 != 7 && f5 != 17) {
                switch (f5) {
                    case 19:
                    case 20:
                    case C1639u7.zzm /* 21 */:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw B7.b("Unsupported audio object type: " + f5);
                }
            }
            if (c0826c0.w()) {
                JB.l("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c0826c0.w()) {
                c0826c0.u(14);
            }
            boolean w5 = c0826c0.w();
            if (f6 == 0) {
                throw new UnsupportedOperationException();
            }
            if (f5 != 6) {
                if (f5 == 20) {
                    f5 = 20;
                }
                if (w5) {
                    if (f5 == 22) {
                        c0826c0.u(16);
                    } else {
                        i6 = f5;
                    }
                    if (i6 == 17 || i6 == 19 || i6 == 20 || i6 == 23) {
                        c0826c0.u(3);
                    }
                    c0826c0.u(1);
                }
                switch (f5) {
                    case 17:
                    case 19:
                    case 20:
                    case C1639u7.zzm /* 21 */:
                    case 22:
                    case 23:
                        int f8 = c0826c0.f(2);
                        if (f8 == 2) {
                            i7 = f8;
                        }
                        throw B7.b("Unsupported epConfig: " + i7);
                }
            }
            c0826c0.u(3);
            if (w5) {
            }
            switch (f5) {
            }
        }
        int i8 = f15513b[f6];
        if (i8 != -1) {
            return new C1541s(i5, i8, q5);
        }
        throw B7.a(null, null);
    }

    public static void d(int i5, C1617tm c1617tm) {
        c1617tm.g(7);
        byte[] bArr = c1617tm.f15724a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i5 >> 16) & 255);
        bArr[5] = (byte) ((i5 >> 8) & 255);
        bArr[6] = (byte) (i5 & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (com.google.android.gms.internal.ads.AbstractC1561sb.f15512a0.c() != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Context context, boolean z3) {
        synchronized (f15516c0) {
            try {
                if (f15514b0 == null) {
                    f15514b0 = new v3.g(context);
                }
                D3.o oVar = f15512a0;
                if (oVar != null) {
                    if (oVar.c()) {
                        if (f15512a0.d()) {
                        }
                    }
                    if (z3) {
                    }
                }
                v3.g gVar = f15514b0;
                m3.v.f("the appSetIdClient shouldn't be null", gVar);
                f15512a0 = gVar.d();
            } finally {
            }
        }
    }

    public static int f(int i5) {
        return (i5 == 0 || i5 == 3) ? 1 : 2;
    }

    public static int g(byte[] bArr, int i5, int i6) {
        int h3 = h(i5, bArr);
        if (i6 == 0 || i6 == 3) {
            return h3;
        }
        while (true) {
            int length = bArr.length;
            if (h3 >= length - 1) {
                return length;
            }
            int i7 = h3 + 1;
            if ((h3 - i5) % 2 == 0 && bArr[i7] == 0) {
                return h3;
            }
            h3 = h(i7, bArr);
        }
    }

    public static int h(int i5, byte[] bArr) {
        while (true) {
            int length = bArr.length;
            if (i5 >= length) {
                return length;
            }
            if (bArr[i5] == 0) {
                return i5;
            }
            i5++;
        }
    }

    public static int i(C0826c0 c0826c0) {
        int f5 = c0826c0.f(4);
        if (f5 == 15) {
            if (c0826c0.a() >= 24) {
                return c0826c0.f(24);
            }
            throw B7.a(null, "AAC header insufficient data");
        }
        if (f5 < 13) {
            return f15511a[f5];
        }
        throw B7.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static int j(int i5, C1617tm c1617tm) {
        byte[] bArr = c1617tm.f15724a;
        int i6 = c1617tm.f15725b;
        int i7 = i6;
        while (true) {
            int i8 = i7 + 1;
            if (i8 >= i6 + i5) {
                return i5;
            }
            if ((bArr[i7] & 255) == 255 && bArr[i8] == 0) {
                System.arraycopy(bArr, i7 + 2, bArr, i8, (i5 - (i7 - i6)) - 2);
                i5--;
            }
            i7 = i8;
        }
    }

    public static C1761wv k(byte[] bArr, int i5, int i6) {
        if (i6 >= bArr.length) {
            return AbstractC1044gv.n("");
        }
        AbstractC0952et.q("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int g5 = g(bArr, i6, i5);
        int i7 = 0;
        while (i6 < g5) {
            String str = new String(bArr, i6, g5 - i6, n(i5));
            int length = objArr.length;
            int i8 = i7 + 1;
            int d5 = AbstractC0776av.d(length, i8);
            if (d5 > length) {
                objArr = Arrays.copyOf(objArr, d5);
            }
            objArr[i7] = str;
            i6 = f(i5) + g5;
            g5 = g(bArr, i6, i5);
            i7 = i8;
        }
        C1761wv k5 = AbstractC1044gv.k(i7, objArr);
        return k5.isEmpty() ? AbstractC1044gv.n("") : k5;
    }

    public static String l(byte[] bArr, int i5, int i6, Charset charset) {
        return (i6 <= i5 || i6 > bArr.length) ? "" : new String(bArr, i5, i6 - i5, charset);
    }

    public static String m(int i5, int i6, int i7, int i8, int i9) {
        return i5 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
    }

    public static Charset n(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean o(C1617tm c1617tm, int i5, int i6, boolean z3) {
        boolean z5;
        int x5;
        long x6;
        int i7;
        int i8;
        int i9 = c1617tm.f15725b;
        while (true) {
            try {
                z5 = true;
                z5 = true;
                int i10 = 1;
                int i11 = 1;
                if (c1617tm.o() < i6) {
                    break;
                }
                if (i5 >= 3) {
                    x5 = c1617tm.q();
                    x6 = c1617tm.D();
                    i7 = c1617tm.z();
                } else {
                    x5 = c1617tm.x();
                    x6 = c1617tm.x();
                    i7 = 0;
                }
                if (x5 != 0 || x6 != 0 || i7 != 0) {
                    if (i5 == 4 && !z3) {
                        if ((8421504 & x6) != 0) {
                            break;
                        }
                        x6 = ((x6 >> 24) << 21) | (((x6 >> 16) & 255) << 14) | (x6 & 255) | (((x6 >> 8) & 255) << 7);
                    }
                    if (i5 == 4) {
                        if ((i7 & 64) == 0) {
                            i10 = 0;
                        }
                        int i12 = i10;
                        i11 = i7 & 1;
                        i8 = i12;
                    } else if (i5 == 3) {
                        i8 = (i7 & 32) != 0 ? 1 : 0;
                        if ((i7 & 128) == 0) {
                            i11 = 0;
                        }
                    } else {
                        i8 = 0;
                        i11 = 0;
                    }
                    if (i11 != 0) {
                        i8 += 4;
                    }
                    if (x6 >= i8 && c1617tm.o() >= x6) {
                        c1617tm.k((int) x6);
                    }
                }
            } finally {
                c1617tm.j(i9);
            }
        }
        return z5;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:79|(2:81|(1:91)(3:86|(1:88)(1:90)|89))|92|(1:93)|(2:95|(7:117|118|119|(4:(7:125|126|127|(5:129|130|131|(1:133)|134)(2:140|(1:142))|135|(1:137)(1:139)|138)|143|144|(2:(1:(1:(1:224)(4:219|(1:221)|222|223))(12:188|(1:190)(1:212)|191|(1:193)|194|195|(4:198|(3:200|201|202)(1:204)|203|196)|205|206|(1:208)(1:211)|209|210))(8:161|(1:163)(1:181)|164|(1:166)(1:180)|167|(4:170|(3:172|173|174)(1:176)|175|168)|177|178)|179)(2:152|(1:154)(1:155)))(9:225|(1:(1:(0)))|143|144|(1:146)|(1:157)|(1:183)|(1:214)|224)|55|(1:57)|58)(2:98|(9:102|103|104|105|(1:107)(1:109)|108|55|(0)|58)(1:101)))|234|118|119|(0)(0)|55|(0)|58) */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0283, code lost:
    
        if (r8 == 67) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x02be, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x02c1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static K0 p(int i5, C1617tm c1617tm, boolean z3, C1543s1 c1543s1) {
        int y5;
        int i6;
        int i7;
        boolean z5;
        boolean z6;
        boolean z7;
        int i8;
        String str;
        K0 k02;
        int i9;
        K0 e02;
        K0 n02;
        int h3;
        String n5;
        int v4 = c1617tm.v();
        int v5 = c1617tm.v();
        int v6 = c1617tm.v();
        int v7 = i5 >= 3 ? c1617tm.v() : 0;
        if (i5 == 4) {
            y5 = c1617tm.y();
            if (!z3) {
                y5 = ((y5 >> 24) << 21) | (y5 & 255) | (((y5 >> 8) & 255) << 7) | (((y5 >> 16) & 255) << 14);
            }
        } else {
            y5 = i5 == 3 ? c1617tm.y() : c1617tm.x();
        }
        int z8 = i5 >= 3 ? c1617tm.z() : 0;
        if (v4 == 0 && v5 == 0 && v6 == 0 && v7 == 0 && y5 == 0 && z8 == 0) {
            c1617tm.j(c1617tm.f15726c);
            return null;
        }
        int p5 = c1617tm.p() + y5;
        if (p5 > c1617tm.f15726c) {
            JB.l("Id3Decoder", "Frame size exceeds remaining tag data");
            c1617tm.j(c1617tm.f15726c);
            return null;
        }
        if (c1543s1 != null) {
            c1617tm.j(p5);
            return null;
        }
        if (i5 == 3) {
            int i10 = z8 & 64;
            i6 = (z8 & 128) != 0 ? 1 : 0;
            z7 = false;
            z6 = i10 != 0;
            z5 = (z8 & 32) != 0;
            i7 = i6;
        } else if (i5 == 4) {
            boolean z9 = (z8 & 64) != 0;
            int i11 = (z8 & 8) != 0 ? 1 : 0;
            z6 = (z8 & 4) != 0;
            z7 = (z8 & 2) != 0;
            i7 = z8 & 1;
            int i12 = i11;
            z5 = z9;
            i6 = i12;
        } else {
            i6 = 0;
            i7 = 0;
            z5 = false;
            z6 = false;
            z7 = false;
        }
        if (i6 != 0 || z6) {
            JB.l("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            c1617tm.j(p5);
            return null;
        }
        if (z5) {
            c1617tm.k(1);
            y5--;
        }
        if (i7 != 0) {
            c1617tm.k(4);
            y5 -= 4;
        }
        if (z7) {
            y5 = j(y5, c1617tm);
        }
        try {
            try {
            } catch (Throwable th) {
                c1617tm.j(p5);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            i8 = v4;
            str = "Id3Decoder";
            c1617tm.j(p5);
            k02 = null;
            if (k02 == null) {
            }
            return k02;
        } catch (OutOfMemoryError e5) {
            e = e5;
            i8 = v4;
            str = "Id3Decoder";
            c1617tm.j(p5);
            k02 = null;
            if (k02 == null) {
            }
            return k02;
        }
        if (v4 == 84 && v5 == 88 && v6 == 88 && (i5 == 2 || v7 == 88)) {
            if (y5 > 0) {
                int v8 = c1617tm.v();
                int i13 = y5 - 1;
                byte[] bArr = new byte[i13];
                c1617tm.f(bArr, 0, i13);
                int g5 = g(bArr, 0, v8);
                e02 = new P0("TXXX", new String(bArr, 0, g5, n(v8)), k(bArr, v8, g5 + f(v8)));
                i8 = v4;
            }
            i8 = v4;
            e02 = null;
        } else {
            if (v4 == 84) {
                String m5 = m(i5, 84, v5, v6, v7);
                if (y5 > 0) {
                    int v9 = c1617tm.v();
                    int i14 = y5 - 1;
                    byte[] bArr2 = new byte[i14];
                    c1617tm.f(bArr2, 0, i14);
                    i8 = v4;
                    e02 = new P0(m5, null, k(bArr2, v9, 0));
                }
            } else {
                if (v4 == 87) {
                    if (v5 != 88 || v6 != 88 || (i5 != 2 && v7 != 88)) {
                        i9 = 87;
                    }
                    int v10 = c1617tm.v();
                    int i15 = y5 - 1;
                    byte[] bArr3 = new byte[i15];
                    c1617tm.f(bArr3, 0, i15);
                    int g6 = g(bArr3, 0, v10);
                    String str2 = new String(bArr3, 0, g6, n(v10));
                    int f5 = g6 + f(v10);
                    e02 = new Q0("WXXX", str2, l(bArr3, f5, h(f5, bArr3), StandardCharsets.ISO_8859_1));
                    i8 = v4;
                } else {
                    i9 = v4;
                }
                if (i9 != 87) {
                    if (i9 == 80) {
                        if (v5 == 82 && v6 == 73 && v7 == 86) {
                            byte[] bArr4 = new byte[y5];
                            c1617tm.f(bArr4, 0, y5);
                            int h4 = h(0, bArr4);
                            String str3 = new String(bArr4, 0, h4, StandardCharsets.ISO_8859_1);
                            int i16 = h4 + 1;
                            e02 = new O0(str3, y5 <= i16 ? AbstractC1260lo.f : Arrays.copyOfRange(bArr4, i16, y5));
                        } else {
                            i9 = 80;
                        }
                    }
                    try {
                    } catch (Exception e6) {
                        e = e6;
                    } catch (OutOfMemoryError e7) {
                        e = e7;
                    }
                    if (i9 == 71) {
                        if (v5 != 69 || v6 != 79) {
                            str = "Id3Decoder";
                            i9 = 71;
                            if (i5 != 2) {
                                if (i9 == 80 && v5 == 73 && v6 == 67) {
                                    int v11 = c1617tm.v();
                                    Charset n6 = n(v11);
                                    int i17 = y5 - 1;
                                    byte[] bArr5 = new byte[i17];
                                    c1617tm.f(bArr5, 0, i17);
                                    if (i5 == 2) {
                                        i8 = v4;
                                        String concat = "image/".concat(String.valueOf(AbstractC0952et.n(new String(bArr5, 0, 3, StandardCharsets.ISO_8859_1))));
                                        if ("image/jpg".equals(concat)) {
                                            concat = "image/jpeg";
                                        }
                                        n5 = concat;
                                        h3 = 2;
                                    } else {
                                        i8 = v4;
                                        h3 = h(0, bArr5);
                                        n5 = AbstractC0952et.n(new String(bArr5, 0, h3, StandardCharsets.ISO_8859_1));
                                        if (n5.indexOf(47) == -1) {
                                            n5 = "image/".concat(n5);
                                        }
                                    }
                                    int i18 = bArr5[h3 + 1] & 255;
                                    int i19 = h3 + 2;
                                    int g7 = g(bArr5, i19, v11);
                                    String str4 = new String(bArr5, i19, g7 - i19, n6);
                                    int f6 = g7 + f(v11);
                                    e02 = new D0(n5, str4, i18, i17 <= f6 ? AbstractC1260lo.f : Arrays.copyOfRange(bArr5, f6, i17));
                                }
                                i8 = v4;
                                if (i9 == 67 || v5 != 79 || v6 != 77 || (v7 != 77 && i5 != 2)) {
                                    if (i9 != 67 && v5 == 72 && v6 == 65 && v7 == 80) {
                                        int p6 = c1617tm.p();
                                        int h5 = h(p6, c1617tm.l());
                                        String str5 = new String(c1617tm.l(), p6, h5 - p6, StandardCharsets.ISO_8859_1);
                                        c1617tm.j(h5 + 1);
                                        int q5 = c1617tm.q();
                                        int q6 = c1617tm.q();
                                        long D5 = c1617tm.D();
                                        long j5 = D5 == 4294967295L ? -1L : D5;
                                        long D6 = c1617tm.D();
                                        long j6 = D6 == 4294967295L ? -1L : D6;
                                        ArrayList arrayList = new ArrayList();
                                        int i20 = p6 + y5;
                                        while (c1617tm.p() < i20) {
                                            K0 p7 = p(i5, c1617tm, z3, null);
                                            if (p7 != null) {
                                                arrayList.add(p7);
                                            }
                                        }
                                        n02 = new F0(str5, q5, q6, j5, j6, (K0[]) arrayList.toArray(new K0[0]));
                                    } else if (i9 != 67 && v5 == 84 && v6 == 79 && v7 == 67) {
                                        int p8 = c1617tm.p();
                                        int h6 = h(p8, c1617tm.l());
                                        String str6 = new String(c1617tm.l(), p8, h6 - p8, StandardCharsets.ISO_8859_1);
                                        c1617tm.j(h6 + 1);
                                        int v12 = c1617tm.v();
                                        boolean z10 = (v12 & 2) != 0;
                                        int i21 = v12 & 1;
                                        int v13 = c1617tm.v();
                                        String[] strArr = new String[v13];
                                        int i22 = 0;
                                        while (i22 < v13) {
                                            int p9 = c1617tm.p();
                                            int h7 = h(p9, c1617tm.l());
                                            strArr[i22] = new String(c1617tm.l(), p9, h7 - p9, StandardCharsets.ISO_8859_1);
                                            c1617tm.j(h7 + 1);
                                            i22++;
                                            p8 = p8;
                                            v13 = v13;
                                            str6 = str6;
                                        }
                                        int i23 = p8;
                                        String str7 = str6;
                                        ArrayList arrayList2 = new ArrayList();
                                        int i24 = i23 + y5;
                                        while (c1617tm.p() < i24) {
                                            K0 p10 = p(i5, c1617tm, z3, null);
                                            if (p10 != null) {
                                                arrayList2.add(p10);
                                            }
                                        }
                                        n02 = new G0(str7, z10, 1 == i21, strArr, (K0[]) arrayList2.toArray(new K0[0]));
                                    } else if (i9 != 77 && v5 == 76 && v6 == 76 && v7 == 84) {
                                        int z11 = c1617tm.z();
                                        int x5 = c1617tm.x();
                                        int x6 = c1617tm.x();
                                        int v14 = c1617tm.v();
                                        int v15 = c1617tm.v();
                                        C0826c0 c0826c0 = new C0826c0();
                                        c0826c0.q(c1617tm);
                                        int i25 = ((y5 - 10) * 8) / (v14 + v15);
                                        int[] iArr = new int[i25];
                                        int[] iArr2 = new int[i25];
                                        for (int i26 = 0; i26 < i25; i26++) {
                                            int f7 = c0826c0.f(v14);
                                            int f8 = c0826c0.f(v15);
                                            iArr[i26] = f7;
                                            iArr2[i26] = f8;
                                        }
                                        n02 = new N0(z11, x5, x6, iArr, iArr2);
                                    } else {
                                        String m6 = m(i5, i9, v5, v6, v7);
                                        byte[] bArr6 = new byte[y5];
                                        c1617tm.f(bArr6, 0, y5);
                                        e02 = new E0(m6, bArr6);
                                    }
                                    e02 = n02;
                                } else if (y5 < 4) {
                                    e02 = null;
                                } else {
                                    int v16 = c1617tm.v();
                                    Charset n7 = n(v16);
                                    byte[] bArr7 = new byte[3];
                                    c1617tm.f(bArr7, 0, 3);
                                    String str8 = new String(bArr7, 0, 3);
                                    int i27 = y5 - 4;
                                    byte[] bArr8 = new byte[i27];
                                    c1617tm.f(bArr8, 0, i27);
                                    int g8 = g(bArr8, 0, v16);
                                    String str9 = new String(bArr8, 0, g8, n7);
                                    int f9 = g8 + f(v16);
                                    e02 = new H0(str8, str9, l(bArr8, f9, g(bArr8, f9, v16), n7));
                                }
                            } else {
                                if (i9 == 65) {
                                    if (v5 == 80) {
                                        if (v6 == 73) {
                                        }
                                    }
                                }
                                i8 = v4;
                                if (i9 == 67) {
                                }
                                if (i9 != 67) {
                                }
                                if (i9 != 67) {
                                }
                                if (i9 != 77) {
                                }
                                String m62 = m(i5, i9, v5, v6, v7);
                                byte[] bArr62 = new byte[y5];
                                c1617tm.f(bArr62, 0, y5);
                                e02 = new E0(m62, bArr62);
                            }
                            c1617tm.j(p5);
                            k02 = e02;
                            e = null;
                            if (k02 == null) {
                                JB.n(str, "Failed to decode frame: id=" + m(i5, i8, v5, v6, v7) + ", frameSize=" + y5, e);
                            }
                            return k02;
                        }
                        if (v7 == 66 || i5 == 2) {
                            try {
                                int v17 = c1617tm.v();
                                Charset n8 = n(v17);
                                int i28 = y5 - 1;
                                byte[] bArr9 = new byte[i28];
                                c1617tm.f(bArr9, 0, i28);
                                int h8 = h(0, bArr9);
                                str = "Id3Decoder";
                                String e8 = AbstractC1593t6.e(new String(bArr9, 0, h8, StandardCharsets.ISO_8859_1));
                                int i29 = h8 + 1;
                                int g9 = g(bArr9, i29, v17);
                                String l5 = l(bArr9, i29, g9, n8);
                                int f10 = g9 + f(v17);
                                int g10 = g(bArr9, f10, v17);
                                String l6 = l(bArr9, f10, g10, n8);
                                int f11 = g10 + f(v17);
                                i8 = v4;
                                e02 = new I0(e8, l5, l6, i28 <= f11 ? AbstractC1260lo.f : Arrays.copyOfRange(bArr9, f11, i28));
                                c1617tm.j(p5);
                                k02 = e02;
                                e = null;
                            } catch (Exception e9) {
                                e = e9;
                                str = "Id3Decoder";
                                i8 = v4;
                                c1617tm.j(p5);
                                k02 = null;
                                if (k02 == null) {
                                }
                                return k02;
                            } catch (OutOfMemoryError e10) {
                                e = e10;
                                str = "Id3Decoder";
                                i8 = v4;
                                c1617tm.j(p5);
                                k02 = null;
                                if (k02 == null) {
                                }
                                return k02;
                            }
                            if (k02 == null) {
                            }
                            return k02;
                        }
                        i9 = 71;
                    }
                    str = "Id3Decoder";
                    if (i5 != 2) {
                    }
                    c1617tm.j(p5);
                    k02 = e02;
                    e = null;
                    if (k02 == null) {
                    }
                    return k02;
                }
                String m7 = m(i5, 87, v5, v6, v7);
                byte[] bArr10 = new byte[y5];
                c1617tm.f(bArr10, 0, y5);
                e02 = new Q0(m7, null, new String(bArr10, 0, h(0, bArr10), StandardCharsets.ISO_8859_1));
                i8 = v4;
            }
            i8 = v4;
            e02 = null;
        }
        str = "Id3Decoder";
        c1617tm.j(p5);
        k02 = e02;
        e = null;
        if (k02 == null) {
        }
        return k02;
    }
}
