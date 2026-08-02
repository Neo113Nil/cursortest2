package com.google.android.gms.internal.ads;

import B.C0072a;
import a3.AbstractC0467k;
import android.util.Pair;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0738a1 implements F {

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f12554e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f12555f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final byte[] f12556g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final byte[] f12557h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final UUID f12558i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final Map f12559j0;

    /* renamed from: A, reason: collision with root package name */
    public long f12560A;

    /* renamed from: B, reason: collision with root package name */
    public long f12561B;

    /* renamed from: C, reason: collision with root package name */
    public long f12562C;

    /* renamed from: D, reason: collision with root package name */
    public Zk f12563D;

    /* renamed from: E, reason: collision with root package name */
    public Zk f12564E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f12565F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f12566G;

    /* renamed from: H, reason: collision with root package name */
    public int f12567H;

    /* renamed from: I, reason: collision with root package name */
    public long f12568I;
    public long J;
    public int K;

    /* renamed from: L, reason: collision with root package name */
    public int f12569L;

    /* renamed from: M, reason: collision with root package name */
    public int[] f12570M;

    /* renamed from: N, reason: collision with root package name */
    public int f12571N;

    /* renamed from: O, reason: collision with root package name */
    public int f12572O;

    /* renamed from: P, reason: collision with root package name */
    public int f12573P;

    /* renamed from: Q, reason: collision with root package name */
    public int f12574Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f12575R;

    /* renamed from: S, reason: collision with root package name */
    public long f12576S;

    /* renamed from: T, reason: collision with root package name */
    public int f12577T;

    /* renamed from: U, reason: collision with root package name */
    public int f12578U;

    /* renamed from: V, reason: collision with root package name */
    public int f12579V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f12580W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f12581X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f12582Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f12583Z;

    /* renamed from: a, reason: collision with root package name */
    public final C0783b1 f12584a;

    /* renamed from: a0, reason: collision with root package name */
    public byte f12585a0;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f12586b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f12587b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12588c;

    /* renamed from: c0, reason: collision with root package name */
    public H f12589c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12590d;

    /* renamed from: d0, reason: collision with root package name */
    public final Y0 f12591d0;

    /* renamed from: e, reason: collision with root package name */
    public final O1 f12592e;
    public final C1617tm f;

    /* renamed from: g, reason: collision with root package name */
    public final C1617tm f12593g;

    /* renamed from: h, reason: collision with root package name */
    public final C1617tm f12594h;
    public final C1617tm i;

    /* renamed from: j, reason: collision with root package name */
    public final C1617tm f12595j;

    /* renamed from: k, reason: collision with root package name */
    public final C1617tm f12596k;

    /* renamed from: l, reason: collision with root package name */
    public final C1617tm f12597l;

    /* renamed from: m, reason: collision with root package name */
    public final C1617tm f12598m;

    /* renamed from: n, reason: collision with root package name */
    public final C1617tm f12599n;

    /* renamed from: o, reason: collision with root package name */
    public final C1617tm f12600o;

    /* renamed from: p, reason: collision with root package name */
    public ByteBuffer f12601p;

    /* renamed from: q, reason: collision with root package name */
    public long f12602q;

    /* renamed from: r, reason: collision with root package name */
    public long f12603r;

    /* renamed from: s, reason: collision with root package name */
    public long f12604s;

    /* renamed from: t, reason: collision with root package name */
    public long f12605t;

    /* renamed from: u, reason: collision with root package name */
    public long f12606u;

    /* renamed from: v, reason: collision with root package name */
    public Z0 f12607v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12608w;

    /* renamed from: x, reason: collision with root package name */
    public int f12609x;

    /* renamed from: y, reason: collision with root package name */
    public long f12610y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12611z;

    static {
        int i = AbstractC1260lo.f14419a;
        f12555f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f12556g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f12557h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f12558i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        AbstractC0467k.z(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC0467k.z(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f12559j0 = Collections.unmodifiableMap(hashMap);
    }

    public C0738a1() {
        this(new Y0(), 2, O1.f);
    }

    public static byte[] o(long j5, long j6, String str) {
        AbstractC1668us.S(j5 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j5 / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j7 = j5 - (i * 3600000000L);
        int i5 = (int) (j7 / 60000000);
        Integer valueOf2 = Integer.valueOf(i5);
        long j8 = j7 - (i5 * 60000000);
        int i6 = (int) (j8 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i6), Integer.valueOf((int) ((j8 - (i6 * 1000000)) / j6)));
        int i7 = AbstractC1260lo.f14419a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05d3, code lost:
    
        if (r0.C() == r8.getLeastSignificantBits()) goto L341;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0879  */
    /* JADX WARN: Type inference failed for: r0v120 */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v244 */
    /* JADX WARN: Type inference failed for: r2v92, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v94, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v98 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i) {
        int i5;
        char c5;
        char c6;
        Z0 z02;
        int i6;
        List list;
        int i7;
        String str;
        String str2;
        String str3;
        List list2;
        List list3;
        Pair pair;
        String str4;
        int i8;
        ArrayList arrayList;
        int i9;
        ArrayList arrayList2;
        int q5;
        List list4;
        List list5;
        List list6;
        C1649uH c1649uH;
        int i10;
        int i11;
        C1242lE c1242lE;
        int i12;
        int i13;
        byte[] bArr;
        int i14;
        String str5;
        Dx a5;
        List list7;
        List list8;
        U j5;
        int i15;
        int i16;
        AbstractC1668us.F(this.f12589c0);
        SparseArray sparseArray = this.f12586b;
        if (i == 160) {
            if (this.f12567H == 2) {
                Z0 z03 = (Z0) sparseArray.get(this.f12571N);
                z03.f12409Y.getClass();
                if (this.f12576S > 0 && "A_OPUS".equals(z03.f12412b)) {
                    byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f12576S).array();
                    this.f12600o.h(array.length, array);
                }
                int i17 = 0;
                for (int i18 = 0; i18 < this.f12569L; i18++) {
                    i17 += this.f12570M[i18];
                }
                int i19 = 0;
                while (i19 < this.f12569L) {
                    long j6 = this.f12568I + ((z03.f12415e * i19) / 1000);
                    int i20 = this.f12573P;
                    if (i19 == 0) {
                        if (!this.f12575R) {
                            i20 |= 1;
                        }
                        i5 = 0;
                    } else {
                        i5 = i19;
                    }
                    int i21 = this.f12570M[i5];
                    int i22 = i17 - i21;
                    k(z03, j6, i20, i21, i22);
                    i19 = i5 + 1;
                    i17 = i22;
                }
                this.f12567H = 0;
                return;
            }
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i23 = this.f12609x;
                if (i23 != -1) {
                    long j7 = this.f12610y;
                    if (j7 != -1) {
                        if (i23 == 475249515) {
                            this.f12560A = j7;
                            return;
                        }
                        return;
                    }
                }
                throw B7.a(null, "Mandatory element SeekID or SeekPosition not found");
            }
            if (i == 25152) {
                i(i);
                Z0 z04 = this.f12607v;
                if (z04.f12417h) {
                    Z z3 = z04.f12418j;
                    if (z3 == null) {
                        throw B7.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                    }
                    z04.f12420l = new C1334nG(null, true, new XF(AbstractC1644uC.f15803a, "video/webm", z3.f12384b));
                    return;
                }
                return;
            }
            if (i == 28032) {
                i(i);
                Z0 z05 = this.f12607v;
                if (z05.f12417h && z05.i != null) {
                    throw B7.a(null, "Combining encryption and compression is not supported");
                }
                return;
            }
            if (i == 357149030) {
                if (this.f12604s == -9223372036854775807L) {
                    this.f12604s = 1000000L;
                }
                long j8 = this.f12605t;
                if (j8 != -9223372036854775807L) {
                    this.f12606u = c(j8);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (sparseArray.size() == 0) {
                    throw B7.a(null, "No valid tracks were found");
                }
                this.f12589c0.v();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.f12608w) {
                H h3 = this.f12589c0;
                Zk zk = this.f12563D;
                Zk zk2 = this.f12564E;
                if (this.f12603r == -1 || this.f12606u == -9223372036854775807L || zk == null || (i15 = zk.f12512a) == 0 || zk2 == null || zk2.f12512a != i15) {
                    j5 = new J(this.f12606u, 0L);
                } else {
                    int[] iArr = new int[i15];
                    long[] jArr = new long[i15];
                    long[] jArr2 = new long[i15];
                    long[] jArr3 = new long[i15];
                    for (int i24 = 0; i24 < i15; i24++) {
                        jArr3[i24] = zk.d(i24);
                        jArr[i24] = zk2.d(i24) + this.f12603r;
                    }
                    int i25 = 0;
                    while (true) {
                        i16 = i15 - 1;
                        if (i25 >= i16) {
                            break;
                        }
                        int i26 = i25 + 1;
                        iArr[i25] = (int) (jArr[i26] - jArr[i25]);
                        jArr2[i25] = jArr3[i26] - jArr3[i25];
                        i25 = i26;
                    }
                    iArr[i16] = (int) ((this.f12603r + this.f12602q) - jArr[i16]);
                    long j9 = this.f12606u - jArr3[i16];
                    jArr2[i16] = j9;
                    if (j9 <= 0) {
                        JB.l("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j9);
                        iArr = Arrays.copyOf(iArr, i16);
                        jArr = Arrays.copyOf(jArr, i16);
                        jArr2 = Arrays.copyOf(jArr2, i16);
                        jArr3 = Arrays.copyOf(jArr3, i16);
                    }
                    j5 = new A(iArr, jArr, jArr2, jArr3);
                }
                h3.x(j5);
                this.f12608w = true;
            }
            this.f12563D = null;
            this.f12564E = null;
            return;
        }
        Z0 z06 = this.f12607v;
        AbstractC1668us.F(z06);
        String str6 = z06.f12412b;
        if (str6 == null) {
            throw B7.a(null, "CodecId is missing in TrackEntry element");
        }
        switch (str6.hashCode()) {
            case -2095576542:
                if (str6.equals("V_MPEG4/ISO/AP")) {
                    c5 = 6;
                    break;
                }
                c5 = 65535;
                break;
            case -2095575984:
                if (str6.equals("V_MPEG4/ISO/SP")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case -1985379776:
                if (str6.equals("A_MS/ACM")) {
                    c5 = 23;
                    break;
                }
                c5 = 65535;
                break;
            case -1784763192:
                if (str6.equals("A_TRUEHD")) {
                    c5 = 18;
                    break;
                }
                c5 = 65535;
                break;
            case -1730367663:
                if (str6.equals("A_VORBIS")) {
                    c5 = '\f';
                    break;
                }
                c5 = 65535;
                break;
            case -1482641358:
                if (str6.equals("A_MPEG/L2")) {
                    c5 = 14;
                    break;
                }
                c5 = 65535;
                break;
            case -1482641357:
                if (str6.equals("A_MPEG/L3")) {
                    c5 = 15;
                    break;
                }
                c5 = 65535;
                break;
            case -1373388978:
                if (str6.equals("V_MS/VFW/FOURCC")) {
                    c5 = '\t';
                    break;
                }
                c5 = 65535;
                break;
            case -933872740:
                if (str6.equals("S_DVBSUB")) {
                    c5 = ' ';
                    break;
                }
                c5 = 65535;
                break;
            case -538363189:
                if (str6.equals("V_MPEG4/ISO/ASP")) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case -538363109:
                if (str6.equals("V_MPEG4/ISO/AVC")) {
                    c5 = 7;
                    break;
                }
                c5 = 65535;
                break;
            case -425012669:
                if (str6.equals("S_VOBSUB")) {
                    c5 = 30;
                    break;
                }
                c5 = 65535;
                break;
            case -356037306:
                if (str6.equals("A_DTS/LOSSLESS")) {
                    c5 = 21;
                    break;
                }
                c5 = 65535;
                break;
            case 62923557:
                if (str6.equals("A_AAC")) {
                    c5 = '\r';
                    break;
                }
                c5 = 65535;
                break;
            case 62923603:
                if (str6.equals("A_AC3")) {
                    c5 = 16;
                    break;
                }
                c5 = 65535;
                break;
            case 62927045:
                if (str6.equals("A_DTS")) {
                    c5 = 19;
                    break;
                }
                c5 = 65535;
                break;
            case 82318131:
                if (str6.equals("V_AV1")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case 82338133:
                if (str6.equals("V_VP8")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case 82338134:
                if (str6.equals("V_VP9")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case 99146302:
                if (str6.equals("S_HDMV/PGS")) {
                    c5 = 31;
                    break;
                }
                c5 = 65535;
                break;
            case 444813526:
                if (str6.equals("V_THEORA")) {
                    c5 = '\n';
                    break;
                }
                c5 = 65535;
                break;
            case 542569478:
                if (str6.equals("A_DTS/EXPRESS")) {
                    c5 = 20;
                    break;
                }
                c5 = 65535;
                break;
            case 635596514:
                if (str6.equals("A_PCM/FLOAT/IEEE")) {
                    c5 = 26;
                    break;
                }
                c5 = 65535;
                break;
            case 725948237:
                if (str6.equals("A_PCM/INT/BIG")) {
                    c5 = 25;
                    break;
                }
                c5 = 65535;
                break;
            case 725957860:
                if (str6.equals("A_PCM/INT/LIT")) {
                    c5 = 24;
                    break;
                }
                c5 = 65535;
                break;
            case 738597099:
                if (str6.equals("S_TEXT/ASS")) {
                    c5 = 28;
                    break;
                }
                c5 = 65535;
                break;
            case 855502857:
                if (str6.equals("V_MPEGH/ISO/HEVC")) {
                    c5 = '\b';
                    break;
                }
                c5 = 65535;
                break;
            case 1045209816:
                if (str6.equals("S_TEXT/WEBVTT")) {
                    c5 = 29;
                    break;
                }
                c5 = 65535;
                break;
            case 1422270023:
                if (str6.equals("S_TEXT/UTF8")) {
                    c5 = 27;
                    break;
                }
                c5 = 65535;
                break;
            case 1809237540:
                if (str6.equals("V_MPEG2")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case 1950749482:
                if (str6.equals("A_EAC3")) {
                    c5 = 17;
                    break;
                }
                c5 = 65535;
                break;
            case 1950789798:
                if (str6.equals("A_FLAC")) {
                    c5 = 22;
                    break;
                }
                c5 = 65535;
                break;
            case 1951062397:
                if (str6.equals("A_OPUS")) {
                    c5 = 11;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        switch (c5) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case C1639u7.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                H h4 = this.f12589c0;
                int i27 = z06.f12413c;
                String str7 = z06.f12412b;
                int i28 = 4;
                switch (str7.hashCode()) {
                    case -2095576542:
                        if (str7.equals("V_MPEG4/ISO/AP")) {
                            c6 = 6;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case -2095575984:
                        if (str7.equals("V_MPEG4/ISO/SP")) {
                            c6 = 4;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case -1985379776:
                        if (str7.equals("A_MS/ACM")) {
                            c6 = 23;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case -1784763192:
                        if (str7.equals("A_TRUEHD")) {
                            c6 = 18;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case -1730367663:
                        if (str7.equals("A_VORBIS")) {
                            c6 = 11;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case -1482641358:
                        if (str7.equals("A_MPEG/L2")) {
                            c6 = 14;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case -1482641357:
                        if (str7.equals("A_MPEG/L3")) {
                            c6 = 15;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case -1373388978:
                        if (str7.equals("V_MS/VFW/FOURCC")) {
                            c6 = '\t';
                            break;
                        }
                        c6 = 65535;
                        break;
                    case -933872740:
                        if (str7.equals("S_DVBSUB")) {
                            c6 = ' ';
                            break;
                        }
                        c6 = 65535;
                        break;
                    case -538363189:
                        if (str7.equals("V_MPEG4/ISO/ASP")) {
                            c6 = 5;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case -538363109:
                        if (str7.equals("V_MPEG4/ISO/AVC")) {
                            c6 = 7;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case -425012669:
                        if (str7.equals("S_VOBSUB")) {
                            c6 = 30;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case -356037306:
                        if (str7.equals("A_DTS/LOSSLESS")) {
                            c6 = 21;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 62923557:
                        if (str7.equals("A_AAC")) {
                            c6 = '\r';
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 62923603:
                        if (str7.equals("A_AC3")) {
                            c6 = 16;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 62927045:
                        if (str7.equals("A_DTS")) {
                            c6 = 19;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 82318131:
                        if (str7.equals("V_AV1")) {
                            c6 = 2;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 82338133:
                        if (str7.equals("V_VP8")) {
                            c6 = 0;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 82338134:
                        if (str7.equals("V_VP9")) {
                            c6 = 1;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 99146302:
                        if (str7.equals("S_HDMV/PGS")) {
                            c6 = 31;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 444813526:
                        if (str7.equals("V_THEORA")) {
                            c6 = '\n';
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 542569478:
                        if (str7.equals("A_DTS/EXPRESS")) {
                            c6 = 20;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 635596514:
                        if (str7.equals("A_PCM/FLOAT/IEEE")) {
                            c6 = 26;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 725948237:
                        if (str7.equals("A_PCM/INT/BIG")) {
                            c6 = 25;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 725957860:
                        if (str7.equals("A_PCM/INT/LIT")) {
                            c6 = 24;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 738597099:
                        if (str7.equals("S_TEXT/ASS")) {
                            c6 = 28;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 855502857:
                        if (str7.equals("V_MPEGH/ISO/HEVC")) {
                            c6 = '\b';
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 1045209816:
                        if (str7.equals("S_TEXT/WEBVTT")) {
                            c6 = 29;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 1422270023:
                        if (str7.equals("S_TEXT/UTF8")) {
                            c6 = 27;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 1809237540:
                        if (str7.equals("V_MPEG2")) {
                            c6 = 3;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 1950749482:
                        if (str7.equals("A_EAC3")) {
                            c6 = 17;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 1950789798:
                        if (str7.equals("A_FLAC")) {
                            c6 = 22;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 1951062397:
                        if (str7.equals("A_OPUS")) {
                            c6 = '\f';
                            break;
                        }
                        c6 = 65535;
                        break;
                    default:
                        c6 = 65535;
                        break;
                }
                String str8 = "audio/raw";
                switch (c6) {
                    case 0:
                        z02 = z06;
                        i6 = 3;
                        str8 = "video/x-vnd.on2.vp8";
                        list = null;
                        i28 = -1;
                        i7 = -1;
                        str = null;
                        list6 = list;
                        if (z02.f12399O != null && (a5 = Dx.a(new C1617tm(z02.f12399O))) != null) {
                            str = a5.f8430l;
                            str8 = "video/dolby-vision";
                        }
                        int i29 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                            c1649uH.f15831A = z02.f12400P;
                            c1649uH.f15832B = z02.f12402R;
                            c1649uH.f15833C = i28;
                            i10 = 1;
                        } else if (AbstractC1593t6.g(str8)) {
                            if (z02.f12426r == 0) {
                                int i30 = z02.f12424p;
                                i11 = -1;
                                if (i30 == -1) {
                                    i30 = z02.f12421m;
                                }
                                z02.f12424p = i30;
                                int i31 = z02.f12425q;
                                if (i31 == -1) {
                                    i31 = z02.f12422n;
                                }
                                z02.f12425q = i31;
                            } else {
                                i11 = -1;
                            }
                            float f = (z02.f12424p == i11 || (i14 = z02.f12425q) == i11) ? -1.0f : (z02.f12422n * r2) / (z02.f12421m * i14);
                            if (z02.f12433y) {
                                if (z02.f12391E == -1.0f || z02.f12392F == -1.0f || z02.f12393G == -1.0f || z02.f12394H == -1.0f || z02.f12395I == -1.0f || z02.J == -1.0f || z02.K == -1.0f || z02.f12396L == -1.0f || z02.f12397M == -1.0f || z02.f12398N == -1.0f) {
                                    bArr = null;
                                } else {
                                    byte[] bArr2 = new byte[25];
                                    ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                    order.put((byte) 0);
                                    order.putShort((short) ((z02.f12391E * 50000.0f) + 0.5f));
                                    order.putShort((short) ((z02.f12392F * 50000.0f) + 0.5f));
                                    order.putShort((short) ((z02.f12393G * 50000.0f) + 0.5f));
                                    order.putShort((short) ((z02.f12394H * 50000.0f) + 0.5f));
                                    order.putShort((short) ((z02.f12395I * 50000.0f) + 0.5f));
                                    order.putShort((short) ((z02.J * 50000.0f) + 0.5f));
                                    order.putShort((short) ((z02.K * 50000.0f) + 0.5f));
                                    order.putShort((short) ((z02.f12396L * 50000.0f) + 0.5f));
                                    order.putShort((short) (z02.f12397M + 0.5f));
                                    order.putShort((short) (z02.f12398N + 0.5f));
                                    order.putShort((short) z02.f12389C);
                                    order.putShort((short) z02.f12390D);
                                    bArr = bArr2;
                                }
                                int i32 = z02.f12434z;
                                int i33 = z02.f12388B;
                                int i34 = z02.f12387A;
                                int i35 = z02.f12423o;
                                c1242lE = new C1242lE(i32, i33, i34, i35, i35, bArr);
                            } else {
                                c1242lE = null;
                            }
                            String str9 = z02.f12411a;
                            if (str9 != null) {
                                Map map = f12559j0;
                                if (map.containsKey(str9)) {
                                    i12 = ((Integer) map.get(z02.f12411a)).intValue();
                                    if (z02.f12427s == 0 && Float.compare(z02.f12428t, 0.0f) == 0 && Float.compare(z02.f12429u, 0.0f) == 0) {
                                        if (Float.compare(z02.f12430v, 0.0f) != 0) {
                                            i13 = 0;
                                        } else if (Float.compare(z02.f12430v, 90.0f) == 0) {
                                            i13 = 90;
                                        } else if (Float.compare(z02.f12430v, -180.0f) == 0 || Float.compare(z02.f12430v, 180.0f) == 0) {
                                            i13 = 180;
                                        } else if (Float.compare(z02.f12430v, -90.0f) == 0) {
                                            i13 = 270;
                                        }
                                        c1649uH.f15855s = z02.f12421m;
                                        c1649uH.f15856t = z02.f12422n;
                                        c1649uH.f15859w = f;
                                        c1649uH.f15858v = i13;
                                        c1649uH.f15860x = z02.f12431w;
                                        c1649uH.f15861y = z02.f12432x;
                                        c1649uH.f15862z = c1242lE;
                                        i10 = 2;
                                    }
                                    i13 = i12;
                                    c1649uH.f15855s = z02.f12421m;
                                    c1649uH.f15856t = z02.f12422n;
                                    c1649uH.f15859w = f;
                                    c1649uH.f15858v = i13;
                                    c1649uH.f15860x = z02.f12431w;
                                    c1649uH.f15861y = z02.f12432x;
                                    c1649uH.f15862z = c1242lE;
                                    i10 = 2;
                                }
                            }
                            i12 = i11;
                            if (z02.f12427s == 0) {
                                if (Float.compare(z02.f12430v, 0.0f) != 0) {
                                }
                                c1649uH.f15855s = z02.f12421m;
                                c1649uH.f15856t = z02.f12422n;
                                c1649uH.f15859w = f;
                                c1649uH.f15858v = i13;
                                c1649uH.f15860x = z02.f12431w;
                                c1649uH.f15861y = z02.f12432x;
                                c1649uH.f15862z = c1242lE;
                                i10 = 2;
                            }
                            i13 = i12;
                            c1649uH.f15855s = z02.f12421m;
                            c1649uH.f15856t = z02.f12422n;
                            c1649uH.f15859w = f;
                            c1649uH.f15858v = i13;
                            c1649uH.f15860x = z02.f12431w;
                            c1649uH.f15861y = z02.f12432x;
                            c1649uH.f15862z = c1242lE;
                            i10 = 2;
                        } else {
                            if (!"application/x-subrip".equals(str8) && !"text/x-ssa".equals(str8) && !"text/vtt".equals(str8) && !"application/vobsub".equals(str8) && !"application/pgs".equals(str8) && !"application/dvbsubs".equals(str8)) {
                                throw B7.a(null, "Unexpected MIME type.");
                            }
                            i10 = i6;
                        }
                        str5 = z02.f12411a;
                        if (str5 != null && !f12559j0.containsKey(str5)) {
                            c1649uH.f15840b = z02.f12411a;
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i29;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p = new C1407p(c1649uH);
                        InterfaceC0737a0 w5 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w5;
                        w5.e(c1407p);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 1:
                        z02 = z06;
                        i6 = 3;
                        str8 = "video/x-vnd.on2.vp9";
                        list = null;
                        i28 = -1;
                        i7 = -1;
                        str = null;
                        list6 = list;
                        if (z02.f12399O != null) {
                            str = a5.f8430l;
                            str8 = "video/dolby-vision";
                            break;
                        }
                        int i292 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                            c1649uH.f15840b = z02.f12411a;
                            break;
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i292;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p2 = new C1407p(c1649uH);
                        InterfaceC0737a0 w52 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w52;
                        w52.e(c1407p2);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 2:
                        z02 = z06;
                        i6 = 3;
                        str8 = "video/av01";
                        list = null;
                        i28 = -1;
                        i7 = -1;
                        str = null;
                        list6 = list;
                        if (z02.f12399O != null) {
                        }
                        int i2922 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i2922;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p22 = new C1407p(c1649uH);
                        InterfaceC0737a0 w522 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w522;
                        w522.e(c1407p22);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 3:
                        z02 = z06;
                        i6 = 3;
                        str8 = "video/mpeg2";
                        list = null;
                        i28 = -1;
                        i7 = -1;
                        str = null;
                        list6 = list;
                        if (z02.f12399O != null) {
                        }
                        int i29222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i29222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w5222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w5222;
                        w5222.e(c1407p222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        z02 = z06;
                        i6 = 3;
                        byte[] bArr3 = z02.f12419k;
                        str8 = "video/mp4v-es";
                        list = bArr3 == null ? null : Collections.singletonList(bArr3);
                        i28 = -1;
                        i7 = -1;
                        str = null;
                        list6 = list;
                        if (z02.f12399O != null) {
                        }
                        int i292222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i292222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p2222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w52222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w52222;
                        w52222.e(c1407p2222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 7:
                        z02 = z06;
                        i6 = 3;
                        C1631u a6 = C1631u.a(new C1617tm(z02.a(z02.f12412b)));
                        z02.f12410Z = a6.f15747b;
                        ArrayList arrayList3 = a6.f15746a;
                        str2 = a6.f15755l;
                        str3 = "video/avc";
                        list2 = arrayList3;
                        str = str2;
                        list3 = list2;
                        str8 = str3;
                        i28 = -1;
                        i7 = -1;
                        list6 = list3;
                        if (z02.f12399O != null) {
                        }
                        int i2922222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i2922222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p22222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w522222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w522222;
                        w522222.e(c1407p22222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case '\b':
                        z02 = z06;
                        i6 = 3;
                        O a7 = O.a(new C1617tm(z02.a(z02.f12412b)), false, null);
                        z02.f12410Z = a7.f10880b;
                        List list9 = a7.f10879a;
                        str2 = a7.f10887k;
                        str3 = "video/hevc";
                        list2 = list9;
                        str = str2;
                        list3 = list2;
                        str8 = str3;
                        i28 = -1;
                        i7 = -1;
                        list6 = list3;
                        if (z02.f12399O != null) {
                        }
                        int i29222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i29222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w5222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w5222222;
                        w5222222.e(c1407p222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case '\t':
                        ?? r22 = "MatroskaExtractor";
                        z02 = z06;
                        C1617tm c1617tm = new C1617tm(z02.a(z02.f12412b));
                        try {
                            c1617tm.k(16);
                            long B5 = c1617tm.B();
                            try {
                                if (B5 == 1482049860) {
                                    pair = new Pair("video/divx", null);
                                } else if (B5 != 859189832) {
                                    if (B5 == 826496599) {
                                        int i36 = c1617tm.f15725b + 20;
                                        byte[] bArr4 = c1617tm.f15724a;
                                        while (true) {
                                            int length = bArr4.length;
                                            if (i36 >= length - 4) {
                                                try {
                                                    throw B7.a(null, "Failed to find FourCC VC1 initialization data");
                                                } catch (ArrayIndexOutOfBoundsException unused) {
                                                    r22 = 0;
                                                    throw B7.a(r22, "Error parsing FourCC private data");
                                                }
                                            }
                                            int i37 = i36 + 1;
                                            if (bArr4[i36] == 0 && bArr4[i37] == 0 && bArr4[i36 + 2] == 1) {
                                                i6 = 3;
                                                if (bArr4[i36 + 3] == 15) {
                                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr4, i36, length)));
                                                    str4 = null;
                                                }
                                            }
                                            i36 = i37;
                                        }
                                    } else {
                                        i6 = 3;
                                        JB.l(r22, "Unknown FourCC. Setting mimeType to video/x-unknown");
                                        str4 = null;
                                        pair = new Pair("video/x-unknown", null);
                                    }
                                    str8 = (String) pair.first;
                                    str = str4;
                                    list3 = (List) pair.second;
                                    i28 = -1;
                                    i7 = -1;
                                    list6 = list3;
                                    if (z02.f12399O != null) {
                                    }
                                    int i292222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                                    c1649uH = new C1649uH();
                                    if ("audio".equals(AbstractC1593t6.h(str8))) {
                                    }
                                    str5 = z02.f12411a;
                                    if (str5 != null) {
                                    }
                                    c1649uH.b(i27);
                                    c1649uH.c(str8);
                                    c1649uH.f15849m = i7;
                                    c1649uH.f15842d = z02.f12408X;
                                    c1649uH.f15843e = i292222222;
                                    c1649uH.f15851o = list6;
                                    c1649uH.i = str;
                                    c1649uH.f15852p = z02.f12420l;
                                    C1407p c1407p2222222 = new C1407p(c1649uH);
                                    InterfaceC0737a0 w52222222 = h4.w(z02.f12413c, i10);
                                    z02.f12409Y = w52222222;
                                    w52222222.e(c1407p2222222);
                                    sparseArray.put(z02.f12413c, z02);
                                    break;
                                } else {
                                    pair = new Pair("video/3gpp", null);
                                }
                                str4 = null;
                                r22 = 0;
                                i6 = 3;
                                str8 = (String) pair.first;
                                str = str4;
                                list3 = (List) pair.second;
                                i28 = -1;
                                i7 = -1;
                                list6 = list3;
                                if (z02.f12399O != null) {
                                }
                                int i2922222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                                c1649uH = new C1649uH();
                                if ("audio".equals(AbstractC1593t6.h(str8))) {
                                }
                                str5 = z02.f12411a;
                                if (str5 != null) {
                                }
                                c1649uH.b(i27);
                                c1649uH.c(str8);
                                c1649uH.f15849m = i7;
                                c1649uH.f15842d = z02.f12408X;
                                c1649uH.f15843e = i2922222222;
                                c1649uH.f15851o = list6;
                                c1649uH.i = str;
                                c1649uH.f15852p = z02.f12420l;
                                C1407p c1407p22222222 = new C1407p(c1649uH);
                                InterfaceC0737a0 w522222222 = h4.w(z02.f12413c, i10);
                                z02.f12409Y = w522222222;
                                w522222222.e(c1407p22222222);
                                sparseArray.put(z02.f12413c, z02);
                            } catch (ArrayIndexOutOfBoundsException unused2) {
                            }
                        } catch (ArrayIndexOutOfBoundsException unused3) {
                            r22 = 0;
                        }
                        break;
                    case '\n':
                        z02 = z06;
                        str8 = "video/x-unknown";
                        list5 = null;
                        i28 = -1;
                        list4 = list5;
                        i7 = -1;
                        list8 = list4;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i29222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i29222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w5222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w5222222222;
                        w5222222222.e(c1407p222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 11:
                        z02 = z06;
                        byte[] a8 = z02.a(str7);
                        try {
                            try {
                                if (a8[0] != 2) {
                                    throw B7.a(null, "Error parsing vorbis codec private");
                                }
                                int i38 = 0;
                                int i39 = 1;
                                while (true) {
                                    int i40 = a8[i39];
                                    i39++;
                                    int i41 = i40 & 255;
                                    if (i41 != 255) {
                                        int i42 = i38 + i41;
                                        int i43 = 0;
                                        while (true) {
                                            int i44 = a8[i39];
                                            i39++;
                                            int i45 = i44 & 255;
                                            if (i45 != 255) {
                                                int i46 = i43 + i45;
                                                if (a8[i39] != 1) {
                                                    throw B7.a(null, "Error parsing vorbis codec private");
                                                }
                                                byte[] bArr5 = new byte[i42];
                                                System.arraycopy(a8, i39, bArr5, 0, i42);
                                                int i47 = i39 + i42;
                                                if (a8[i47] != 3) {
                                                    throw B7.a(null, "Error parsing vorbis codec private");
                                                }
                                                int i48 = i47 + i46;
                                                if (a8[i48] != 5) {
                                                    throw B7.a(null, "Error parsing vorbis codec private");
                                                }
                                                int length2 = a8.length - i48;
                                                byte[] bArr6 = new byte[length2];
                                                System.arraycopy(a8, i48, bArr6, 0, length2);
                                                ArrayList arrayList4 = new ArrayList(2);
                                                arrayList4.add(bArr5);
                                                arrayList4.add(bArr6);
                                                i8 = 8192;
                                                str8 = "audio/vorbis";
                                                arrayList = arrayList4;
                                                i7 = i8;
                                                arrayList2 = arrayList;
                                                i28 = -1;
                                                list8 = arrayList2;
                                                str = null;
                                                list7 = list8;
                                                i6 = 3;
                                                list6 = list7;
                                                if (z02.f12399O != null) {
                                                }
                                                int i292222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                                                c1649uH = new C1649uH();
                                                if ("audio".equals(AbstractC1593t6.h(str8))) {
                                                }
                                                str5 = z02.f12411a;
                                                if (str5 != null) {
                                                }
                                                c1649uH.b(i27);
                                                c1649uH.c(str8);
                                                c1649uH.f15849m = i7;
                                                c1649uH.f15842d = z02.f12408X;
                                                c1649uH.f15843e = i292222222222;
                                                c1649uH.f15851o = list6;
                                                c1649uH.i = str;
                                                c1649uH.f15852p = z02.f12420l;
                                                C1407p c1407p2222222222 = new C1407p(c1649uH);
                                                InterfaceC0737a0 w52222222222 = h4.w(z02.f12413c, i10);
                                                z02.f12409Y = w52222222222;
                                                w52222222222.e(c1407p2222222222);
                                                sparseArray.put(z02.f12413c, z02);
                                                break;
                                            } else {
                                                i43 += 255;
                                            }
                                        }
                                    } else {
                                        i38 += 255;
                                    }
                                }
                            } catch (ArrayIndexOutOfBoundsException unused4) {
                                throw B7.a(a8, "Error parsing vorbis codec private");
                            }
                        } catch (ArrayIndexOutOfBoundsException unused5) {
                            a8 = 0;
                        }
                        break;
                    case '\f':
                        z02 = z06;
                        ArrayList arrayList5 = new ArrayList(3);
                        arrayList5.add(z02.a(z02.f12412b));
                        ByteBuffer allocate = ByteBuffer.allocate(8);
                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                        arrayList5.add(allocate.order(byteOrder).putLong(z02.f12403S).array());
                        arrayList5.add(ByteBuffer.allocate(8).order(byteOrder).putLong(z02.f12404T).array());
                        i8 = 5760;
                        str8 = "audio/opus";
                        arrayList = arrayList5;
                        i7 = i8;
                        arrayList2 = arrayList;
                        i28 = -1;
                        list8 = arrayList2;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i2922222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i2922222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p22222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w522222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w522222222222;
                        w522222222222.e(c1407p22222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case '\r':
                        z02 = z06;
                        List singletonList = Collections.singletonList(z02.a(str7));
                        byte[] bArr7 = z02.f12419k;
                        C1541s c7 = AbstractC1561sb.c(new C0826c0(bArr7.length, bArr7), false);
                        z02.f12402R = c7.f15400b;
                        z02.f12400P = c7.f15401c;
                        str = c7.f15399a;
                        str8 = "audio/mp4a-latm";
                        i28 = -1;
                        i7 = -1;
                        list7 = singletonList;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i29222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i29222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w5222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w5222222222222;
                        w5222222222222.e(c1407p222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 14:
                        z02 = z06;
                        i9 = 4096;
                        str8 = "audio/mpeg-L2";
                        i7 = i9;
                        arrayList2 = null;
                        i28 = -1;
                        list8 = arrayList2;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i292222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i292222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p2222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w52222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w52222222222222;
                        w52222222222222.e(c1407p2222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 15:
                        z02 = z06;
                        i9 = 4096;
                        str8 = "audio/mpeg";
                        i7 = i9;
                        arrayList2 = null;
                        i28 = -1;
                        list8 = arrayList2;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i2922222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i2922222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p22222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w522222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w522222222222222;
                        w522222222222222.e(c1407p22222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 16:
                        z02 = z06;
                        str8 = "audio/ac3";
                        list5 = null;
                        i28 = -1;
                        list4 = list5;
                        i7 = -1;
                        list8 = list4;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i29222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i29222222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p222222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w5222222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w5222222222222222;
                        w5222222222222222.e(c1407p222222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 17:
                        z02 = z06;
                        str8 = "audio/eac3";
                        list5 = null;
                        i28 = -1;
                        list4 = list5;
                        i7 = -1;
                        list8 = list4;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i292222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i292222222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p2222222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w52222222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w52222222222222222;
                        w52222222222222222.e(c1407p2222222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 18:
                        z02 = z06;
                        z02.f12405U = new C0782b0();
                        str8 = "audio/true-hd";
                        list5 = null;
                        i28 = -1;
                        list4 = list5;
                        i7 = -1;
                        list8 = list4;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i2922222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i2922222222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p22222222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w522222222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w522222222222222222;
                        w522222222222222222.e(c1407p22222222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 19:
                    case 20:
                        z02 = z06;
                        str8 = "audio/vnd.dts";
                        list5 = null;
                        i28 = -1;
                        list4 = list5;
                        i7 = -1;
                        list8 = list4;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i29222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i29222222222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p222222222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w5222222222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w5222222222222222222;
                        w5222222222222222222.e(c1407p222222222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case C1639u7.zzm /* 21 */:
                        z02 = z06;
                        str8 = "audio/vnd.dts.hd";
                        list5 = null;
                        i28 = -1;
                        list4 = list5;
                        i7 = -1;
                        list8 = list4;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i292222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i292222222222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p2222222222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w52222222222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w52222222222222222222;
                        w52222222222222222222.e(c1407p2222222222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 22:
                        z02 = z06;
                        str8 = "audio/flac";
                        list5 = Collections.singletonList(z02.a(str7));
                        i28 = -1;
                        list4 = list5;
                        i7 = -1;
                        list8 = list4;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i2922222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i2922222222222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p22222222222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w522222222222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w522222222222222222222;
                        w522222222222222222222.e(c1407p22222222222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 23:
                        z02 = z06;
                        C1617tm c1617tm2 = new C1617tm(z02.a(z02.f12412b));
                        try {
                            int t5 = c1617tm2.t();
                            if (t5 != 1) {
                                if (t5 == 65534) {
                                    c1617tm2.j(24);
                                    long C5 = c1617tm2.C();
                                    UUID uuid = f12558i0;
                                    if (C5 == uuid.getMostSignificantBits()) {
                                        break;
                                    }
                                }
                                JB.l("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                str8 = "audio/x-unknown";
                                list5 = null;
                                i28 = -1;
                                list4 = list5;
                                i7 = -1;
                                list8 = list4;
                                str = null;
                                list7 = list8;
                                i6 = 3;
                                list6 = list7;
                                if (z02.f12399O != null) {
                                }
                                int i29222222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                                c1649uH = new C1649uH();
                                if ("audio".equals(AbstractC1593t6.h(str8))) {
                                }
                                str5 = z02.f12411a;
                                if (str5 != null) {
                                }
                                c1649uH.b(i27);
                                c1649uH.c(str8);
                                c1649uH.f15849m = i7;
                                c1649uH.f15842d = z02.f12408X;
                                c1649uH.f15843e = i29222222222222222222222;
                                c1649uH.f15851o = list6;
                                c1649uH.i = str;
                                c1649uH.f15852p = z02.f12420l;
                                C1407p c1407p222222222222222222222 = new C1407p(c1649uH);
                                InterfaceC0737a0 w5222222222222222222222 = h4.w(z02.f12413c, i10);
                                z02.f12409Y = w5222222222222222222222;
                                w5222222222222222222222.e(c1407p222222222222222222222);
                                sparseArray.put(z02.f12413c, z02);
                                break;
                            }
                            q5 = AbstractC1260lo.q(z02.f12401Q);
                            if (q5 == 0) {
                                JB.l("MatroskaExtractor", "Unsupported PCM bit depth: " + z02.f12401Q + ". Setting mimeType to audio/x-unknown");
                                str8 = "audio/x-unknown";
                                list5 = null;
                                i28 = -1;
                                list4 = list5;
                                i7 = -1;
                                list8 = list4;
                                str = null;
                                list7 = list8;
                                i6 = 3;
                                list6 = list7;
                                if (z02.f12399O != null) {
                                }
                                int i292222222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                                c1649uH = new C1649uH();
                                if ("audio".equals(AbstractC1593t6.h(str8))) {
                                }
                                str5 = z02.f12411a;
                                if (str5 != null) {
                                }
                                c1649uH.b(i27);
                                c1649uH.c(str8);
                                c1649uH.f15849m = i7;
                                c1649uH.f15842d = z02.f12408X;
                                c1649uH.f15843e = i292222222222222222222222;
                                c1649uH.f15851o = list6;
                                c1649uH.i = str;
                                c1649uH.f15852p = z02.f12420l;
                                C1407p c1407p2222222222222222222222 = new C1407p(c1649uH);
                                InterfaceC0737a0 w52222222222222222222222 = h4.w(z02.f12413c, i10);
                                z02.f12409Y = w52222222222222222222222;
                                w52222222222222222222222.e(c1407p2222222222222222222222);
                                sparseArray.put(z02.f12413c, z02);
                            }
                            i28 = q5;
                            list4 = null;
                            i7 = -1;
                            list8 = list4;
                            str = null;
                            list7 = list8;
                            i6 = 3;
                            list6 = list7;
                            if (z02.f12399O != null) {
                            }
                            int i2922222222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                            c1649uH = new C1649uH();
                            if ("audio".equals(AbstractC1593t6.h(str8))) {
                            }
                            str5 = z02.f12411a;
                            if (str5 != null) {
                            }
                            c1649uH.b(i27);
                            c1649uH.c(str8);
                            c1649uH.f15849m = i7;
                            c1649uH.f15842d = z02.f12408X;
                            c1649uH.f15843e = i2922222222222222222222222;
                            c1649uH.f15851o = list6;
                            c1649uH.i = str;
                            c1649uH.f15852p = z02.f12420l;
                            C1407p c1407p22222222222222222222222 = new C1407p(c1649uH);
                            InterfaceC0737a0 w522222222222222222222222 = h4.w(z02.f12413c, i10);
                            z02.f12409Y = w522222222222222222222222;
                            w522222222222222222222222.e(c1407p22222222222222222222222);
                            sparseArray.put(z02.f12413c, z02);
                        } catch (ArrayIndexOutOfBoundsException unused6) {
                            throw B7.a(null, "Error parsing MS/ACM codec private");
                        }
                        break;
                    case 24:
                        z02 = z06;
                        q5 = AbstractC1260lo.q(z02.f12401Q);
                        if (q5 == 0) {
                            JB.l("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + z02.f12401Q + ". Setting mimeType to audio/x-unknown");
                            str8 = "audio/x-unknown";
                            list5 = null;
                            i28 = -1;
                            list4 = list5;
                            i7 = -1;
                            list8 = list4;
                            str = null;
                            list7 = list8;
                            i6 = 3;
                            list6 = list7;
                            if (z02.f12399O != null) {
                            }
                            int i29222222222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                            c1649uH = new C1649uH();
                            if ("audio".equals(AbstractC1593t6.h(str8))) {
                            }
                            str5 = z02.f12411a;
                            if (str5 != null) {
                            }
                            c1649uH.b(i27);
                            c1649uH.c(str8);
                            c1649uH.f15849m = i7;
                            c1649uH.f15842d = z02.f12408X;
                            c1649uH.f15843e = i29222222222222222222222222;
                            c1649uH.f15851o = list6;
                            c1649uH.i = str;
                            c1649uH.f15852p = z02.f12420l;
                            C1407p c1407p222222222222222222222222 = new C1407p(c1649uH);
                            InterfaceC0737a0 w5222222222222222222222222 = h4.w(z02.f12413c, i10);
                            z02.f12409Y = w5222222222222222222222222;
                            w5222222222222222222222222.e(c1407p222222222222222222222222);
                            sparseArray.put(z02.f12413c, z02);
                            break;
                        }
                        i28 = q5;
                        list4 = null;
                        i7 = -1;
                        list8 = list4;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i292222222222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i292222222222222222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p2222222222222222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w52222222222222222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w52222222222222222222222222;
                        w52222222222222222222222222.e(c1407p2222222222222222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 25:
                        z02 = z06;
                        int i49 = z02.f12401Q;
                        if (i49 == 8) {
                            list4 = null;
                            i28 = 3;
                            i7 = -1;
                            list8 = list4;
                            str = null;
                            list7 = list8;
                            i6 = 3;
                            list6 = list7;
                            if (z02.f12399O != null) {
                            }
                            int i2922222222222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                            c1649uH = new C1649uH();
                            if ("audio".equals(AbstractC1593t6.h(str8))) {
                            }
                            str5 = z02.f12411a;
                            if (str5 != null) {
                            }
                            c1649uH.b(i27);
                            c1649uH.c(str8);
                            c1649uH.f15849m = i7;
                            c1649uH.f15842d = z02.f12408X;
                            c1649uH.f15843e = i2922222222222222222222222222;
                            c1649uH.f15851o = list6;
                            c1649uH.i = str;
                            c1649uH.f15852p = z02.f12420l;
                            C1407p c1407p22222222222222222222222222 = new C1407p(c1649uH);
                            InterfaceC0737a0 w522222222222222222222222222 = h4.w(z02.f12413c, i10);
                            z02.f12409Y = w522222222222222222222222222;
                            w522222222222222222222222222.e(c1407p22222222222222222222222222);
                            sparseArray.put(z02.f12413c, z02);
                            break;
                        } else {
                            if (i49 == 16) {
                                q5 = 268435456;
                            } else if (i49 == 24) {
                                q5 = 1342177280;
                            } else if (i49 == 32) {
                                q5 = 1610612736;
                            } else {
                                JB.l("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i49 + ". Setting mimeType to audio/x-unknown");
                                str8 = "audio/x-unknown";
                                list5 = null;
                                i28 = -1;
                                list4 = list5;
                                i7 = -1;
                                list8 = list4;
                                str = null;
                                list7 = list8;
                                i6 = 3;
                                list6 = list7;
                                if (z02.f12399O != null) {
                                }
                                int i29222222222222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                                c1649uH = new C1649uH();
                                if ("audio".equals(AbstractC1593t6.h(str8))) {
                                }
                                str5 = z02.f12411a;
                                if (str5 != null) {
                                }
                                c1649uH.b(i27);
                                c1649uH.c(str8);
                                c1649uH.f15849m = i7;
                                c1649uH.f15842d = z02.f12408X;
                                c1649uH.f15843e = i29222222222222222222222222222;
                                c1649uH.f15851o = list6;
                                c1649uH.i = str;
                                c1649uH.f15852p = z02.f12420l;
                                C1407p c1407p222222222222222222222222222 = new C1407p(c1649uH);
                                InterfaceC0737a0 w5222222222222222222222222222 = h4.w(z02.f12413c, i10);
                                z02.f12409Y = w5222222222222222222222222222;
                                w5222222222222222222222222222.e(c1407p222222222222222222222222222);
                                sparseArray.put(z02.f12413c, z02);
                            }
                            i28 = q5;
                            list4 = null;
                            i7 = -1;
                            list8 = list4;
                            str = null;
                            list7 = list8;
                            i6 = 3;
                            list6 = list7;
                            if (z02.f12399O != null) {
                            }
                            int i292222222222222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                            c1649uH = new C1649uH();
                            if ("audio".equals(AbstractC1593t6.h(str8))) {
                            }
                            str5 = z02.f12411a;
                            if (str5 != null) {
                            }
                            c1649uH.b(i27);
                            c1649uH.c(str8);
                            c1649uH.f15849m = i7;
                            c1649uH.f15842d = z02.f12408X;
                            c1649uH.f15843e = i292222222222222222222222222222;
                            c1649uH.f15851o = list6;
                            c1649uH.i = str;
                            c1649uH.f15852p = z02.f12420l;
                            C1407p c1407p2222222222222222222222222222 = new C1407p(c1649uH);
                            InterfaceC0737a0 w52222222222222222222222222222 = h4.w(z02.f12413c, i10);
                            z02.f12409Y = w52222222222222222222222222222;
                            w52222222222222222222222222222.e(c1407p2222222222222222222222222222);
                            sparseArray.put(z02.f12413c, z02);
                        }
                        break;
                    case 26:
                        z02 = z06;
                        int i50 = z02.f12401Q;
                        if (i50 != 32) {
                            JB.l("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i50 + ". Setting mimeType to audio/x-unknown");
                            str8 = "audio/x-unknown";
                            list5 = null;
                            i28 = -1;
                            list4 = list5;
                            i7 = -1;
                            list8 = list4;
                            str = null;
                            list7 = list8;
                            i6 = 3;
                            list6 = list7;
                            if (z02.f12399O != null) {
                            }
                            int i2922222222222222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                            c1649uH = new C1649uH();
                            if ("audio".equals(AbstractC1593t6.h(str8))) {
                            }
                            str5 = z02.f12411a;
                            if (str5 != null) {
                            }
                            c1649uH.b(i27);
                            c1649uH.c(str8);
                            c1649uH.f15849m = i7;
                            c1649uH.f15842d = z02.f12408X;
                            c1649uH.f15843e = i2922222222222222222222222222222;
                            c1649uH.f15851o = list6;
                            c1649uH.i = str;
                            c1649uH.f15852p = z02.f12420l;
                            C1407p c1407p22222222222222222222222222222 = new C1407p(c1649uH);
                            InterfaceC0737a0 w522222222222222222222222222222 = h4.w(z02.f12413c, i10);
                            z02.f12409Y = w522222222222222222222222222222;
                            w522222222222222222222222222222.e(c1407p22222222222222222222222222222);
                            sparseArray.put(z02.f12413c, z02);
                            break;
                        }
                        list4 = null;
                        i7 = -1;
                        list8 = list4;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i29222222222222222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i29222222222222222222222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p222222222222222222222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w5222222222222222222222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w5222222222222222222222222222222;
                        w5222222222222222222222222222222.e(c1407p222222222222222222222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 27:
                        z02 = z06;
                        str8 = "application/x-subrip";
                        list5 = null;
                        i28 = -1;
                        list4 = list5;
                        i7 = -1;
                        list8 = list4;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i292222222222222222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i292222222222222222222222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p2222222222222222222222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w52222222222222222222222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w52222222222222222222222222222222;
                        w52222222222222222222222222222222.e(c1407p2222222222222222222222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 28:
                        z02 = z06;
                        str8 = "text/x-ssa";
                        list5 = AbstractC1044gv.o(f12555f0, z02.a(z02.f12412b));
                        i28 = -1;
                        list4 = list5;
                        i7 = -1;
                        list8 = list4;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i2922222222222222222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i2922222222222222222222222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p22222222222222222222222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w522222222222222222222222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w522222222222222222222222222222222;
                        w522222222222222222222222222222222.e(c1407p22222222222222222222222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 29:
                        z02 = z06;
                        str8 = "text/vtt";
                        list5 = null;
                        i28 = -1;
                        list4 = list5;
                        i7 = -1;
                        list8 = list4;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i29222222222222222222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i29222222222222222222222222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p222222222222222222222222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w5222222222222222222222222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w5222222222222222222222222222222222;
                        w5222222222222222222222222222222222.e(c1407p222222222222222222222222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 30:
                        z02 = z06;
                        str8 = "application/vobsub";
                        list5 = AbstractC1044gv.n(z02.a(str7));
                        i28 = -1;
                        list4 = list5;
                        i7 = -1;
                        list8 = list4;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i292222222222222222222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i292222222222222222222222222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p2222222222222222222222222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w52222222222222222222222222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w52222222222222222222222222222222222;
                        w52222222222222222222222222222222222.e(c1407p2222222222222222222222222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case 31:
                        z02 = z06;
                        str8 = "application/pgs";
                        list5 = null;
                        i28 = -1;
                        list4 = list5;
                        i7 = -1;
                        list8 = list4;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i2922222222222222222222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i2922222222222222222222222222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p22222222222222222222222222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w522222222222222222222222222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w522222222222222222222222222222222222;
                        w522222222222222222222222222222222222.e(c1407p22222222222222222222222222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    case ' ':
                        byte[] bArr8 = new byte[4];
                        z02 = z06;
                        System.arraycopy(z02.a(str7), 0, bArr8, 0, 4);
                        str8 = "application/dvbsubs";
                        list5 = AbstractC1044gv.n(bArr8);
                        i28 = -1;
                        list4 = list5;
                        i7 = -1;
                        list8 = list4;
                        str = null;
                        list7 = list8;
                        i6 = 3;
                        list6 = list7;
                        if (z02.f12399O != null) {
                        }
                        int i29222222222222222222222222222222222222 = (z02.f12407W ? 1 : 0) | (true != z02.f12406V ? 0 : 2);
                        c1649uH = new C1649uH();
                        if ("audio".equals(AbstractC1593t6.h(str8))) {
                        }
                        str5 = z02.f12411a;
                        if (str5 != null) {
                        }
                        c1649uH.b(i27);
                        c1649uH.c(str8);
                        c1649uH.f15849m = i7;
                        c1649uH.f15842d = z02.f12408X;
                        c1649uH.f15843e = i29222222222222222222222222222222222222;
                        c1649uH.f15851o = list6;
                        c1649uH.i = str;
                        c1649uH.f15852p = z02.f12420l;
                        C1407p c1407p222222222222222222222222222222222222 = new C1407p(c1649uH);
                        InterfaceC0737a0 w5222222222222222222222222222222222222 = h4.w(z02.f12413c, i10);
                        z02.f12409Y = w5222222222222222222222222222222222222;
                        w5222222222222222222222222222222222222.e(c1407p222222222222222222222222222222222222);
                        sparseArray.put(z02.f12413c, z02);
                        break;
                    default:
                        throw B7.a(null, "Unrecognized codec identifier.");
                }
        }
        this.f12607v = null;
    }

    public final int b(B b3, Z0 z02, int i, boolean z3) {
        int b5;
        int b6;
        int i5;
        if ("S_TEXT/UTF8".equals(z02.f12412b)) {
            n(b3, f12554e0, i);
            int i6 = this.f12578U;
            m();
            return i6;
        }
        if ("S_TEXT/ASS".equals(z02.f12412b)) {
            n(b3, f12556g0, i);
            int i7 = this.f12578U;
            m();
            return i7;
        }
        if ("S_TEXT/WEBVTT".equals(z02.f12412b)) {
            n(b3, f12557h0, i);
            int i8 = this.f12578U;
            m();
            return i8;
        }
        InterfaceC0737a0 interfaceC0737a0 = z02.f12409Y;
        boolean z5 = this.f12580W;
        C1617tm c1617tm = this.f12596k;
        if (!z5) {
            boolean z6 = z02.f12417h;
            C1617tm c1617tm2 = this.f12594h;
            if (z6) {
                this.f12573P &= -1073741825;
                if (!this.f12581X) {
                    b3.F(c1617tm2.f15724a, 0, 1, false);
                    this.f12577T++;
                    byte b7 = c1617tm2.f15724a[0];
                    if ((b7 & 128) == 128) {
                        throw B7.a(null, "Extension bit is set in signal byte");
                    }
                    this.f12585a0 = b7;
                    this.f12581X = true;
                }
                byte b8 = this.f12585a0;
                if ((b8 & 1) == 1) {
                    int i9 = b8 & 2;
                    this.f12573P |= 1073741824;
                    if (!this.f12587b0) {
                        C1617tm c1617tm3 = this.f12598m;
                        b3.F(c1617tm3.f15724a, 0, 8, false);
                        this.f12577T += 8;
                        this.f12587b0 = true;
                        c1617tm2.f15724a[0] = (byte) ((i9 != 2 ? 0 : 128) | 8);
                        c1617tm2.j(0);
                        interfaceC0737a0.f(c1617tm2, 1, 1);
                        this.f12578U++;
                        c1617tm3.j(0);
                        interfaceC0737a0.f(c1617tm3, 8, 1);
                        this.f12578U += 8;
                    }
                    if (i9 == 2) {
                        if (!this.f12582Y) {
                            b3.F(c1617tm2.f15724a, 0, 1, false);
                            this.f12577T++;
                            c1617tm2.j(0);
                            this.f12583Z = c1617tm2.v();
                            this.f12582Y = true;
                        }
                        int i10 = this.f12583Z * 4;
                        c1617tm2.g(i10);
                        b3.F(c1617tm2.f15724a, 0, i10, false);
                        this.f12577T += i10;
                        int i11 = (this.f12583Z >> 1) + 1;
                        int i12 = (i11 * 6) + 2;
                        ByteBuffer byteBuffer = this.f12601p;
                        if (byteBuffer == null || byteBuffer.capacity() < i12) {
                            this.f12601p = ByteBuffer.allocate(i12);
                        }
                        this.f12601p.position(0);
                        this.f12601p.putShort((short) i11);
                        int i13 = 0;
                        int i14 = 0;
                        while (true) {
                            i5 = this.f12583Z;
                            if (i13 >= i5) {
                                break;
                            }
                            int y5 = c1617tm2.y();
                            int i15 = y5 - i14;
                            if (i13 % 2 == 0) {
                                this.f12601p.putShort((short) i15);
                            } else {
                                this.f12601p.putInt(i15);
                            }
                            i13++;
                            i14 = y5;
                        }
                        int i16 = (i - this.f12577T) - i14;
                        if ((i5 & 1) == 1) {
                            this.f12601p.putInt(i16);
                        } else {
                            this.f12601p.putShort((short) i16);
                            this.f12601p.putInt(0);
                        }
                        byte[] array = this.f12601p.array();
                        C1617tm c1617tm4 = this.f12599n;
                        c1617tm4.h(i12, array);
                        interfaceC0737a0.f(c1617tm4, i12, 1);
                        this.f12578U += i12;
                    }
                }
            } else {
                byte[] bArr = z02.i;
                if (bArr != null) {
                    c1617tm.h(bArr.length, bArr);
                }
            }
            if (!"A_OPUS".equals(z02.f12412b) ? z02.f > 0 : z3) {
                this.f12573P |= 268435456;
                this.f12600o.g(0);
                int i17 = (c1617tm.f15726c + i) - this.f12577T;
                c1617tm2.g(4);
                byte[] bArr2 = c1617tm2.f15724a;
                bArr2[0] = (byte) ((i17 >> 24) & 255);
                bArr2[1] = (byte) ((i17 >> 16) & 255);
                bArr2[2] = (byte) ((i17 >> 8) & 255);
                bArr2[3] = (byte) (i17 & 255);
                interfaceC0737a0.f(c1617tm2, 4, 2);
                this.f12578U += 4;
            }
            this.f12580W = true;
        }
        int i18 = i + c1617tm.f15726c;
        if (!"V_MPEG4/ISO/AVC".equals(z02.f12412b) && !"V_MPEGH/ISO/HEVC".equals(z02.f12412b)) {
            if (z02.f12405U != null) {
                AbstractC1668us.a0(c1617tm.f15726c == 0);
                z02.f12405U.c(b3);
            }
            while (true) {
                int i19 = this.f12577T;
                if (i19 >= i18) {
                    break;
                }
                int i20 = i18 - i19;
                int o5 = c1617tm.o();
                if (o5 > 0) {
                    b6 = Math.min(i20, o5);
                    interfaceC0737a0.c(b6, c1617tm);
                } else {
                    b6 = interfaceC0737a0.b(b3, i20, false);
                }
                this.f12577T += b6;
                this.f12578U += b6;
            }
        } else {
            C1617tm c1617tm5 = this.f12593g;
            byte[] bArr3 = c1617tm5.f15724a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i21 = z02.f12410Z;
            int i22 = 4 - i21;
            while (this.f12577T < i18) {
                int i23 = this.f12579V;
                if (i23 == 0) {
                    int min = Math.min(i21, c1617tm.o());
                    b3.F(bArr3, i22 + min, i21 - min, false);
                    if (min > 0) {
                        c1617tm.f(bArr3, i22, min);
                    }
                    this.f12577T += i21;
                    c1617tm5.j(0);
                    this.f12579V = c1617tm5.y();
                    C1617tm c1617tm6 = this.f;
                    c1617tm6.j(0);
                    interfaceC0737a0.c(4, c1617tm6);
                    this.f12578U += 4;
                } else {
                    int o6 = c1617tm.o();
                    if (o6 > 0) {
                        b5 = Math.min(i23, o6);
                        interfaceC0737a0.c(b5, c1617tm);
                    } else {
                        b5 = interfaceC0737a0.b(b3, i23, false);
                    }
                    this.f12577T += b5;
                    this.f12578U += b5;
                    this.f12579V -= b5;
                }
            }
        }
        if ("A_VORBIS".equals(z02.f12412b)) {
            C1617tm c1617tm7 = this.i;
            c1617tm7.j(0);
            interfaceC0737a0.c(4, c1617tm7);
            this.f12578U += 4;
        }
        int i24 = this.f12578U;
        m();
        return i24;
    }

    public final long c(long j5) {
        long j6 = this.f12604s;
        if (j6 != -9223372036854775807L) {
            return AbstractC1260lo.u(j5, j6, 1000L, RoundingMode.DOWN);
        }
        throw B7.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void d(long j5, long j6) {
        this.f12562C = -9223372036854775807L;
        this.f12567H = 0;
        Y0 y02 = this.f12591d0;
        y02.f12267e = 0;
        y02.f12264b.clear();
        C0783b1 c0783b1 = y02.f12265c;
        c0783b1.f12751k = 0;
        c0783b1.f12752l = 0;
        C0783b1 c0783b12 = this.f12584a;
        c0783b12.f12751k = 0;
        c0783b12.f12752l = 0;
        m();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f12586b;
            if (i >= sparseArray.size()) {
                return;
            }
            C0782b0 c0782b0 = ((Z0) sparseArray.valueAt(i)).f12405U;
            if (c0782b0 != null) {
                c0782b0.f12743b = false;
                c0782b0.f12744c = 0;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final boolean e(G g5) {
        C2.h hVar = new C2.h(4, (byte) 0);
        B b3 = (B) g5;
        long j5 = b3.f7751m;
        long j6 = 1024;
        if (j5 != -1 && j5 <= 1024) {
            j6 = j5;
        }
        C1617tm c1617tm = (C1617tm) hVar.f834m;
        B b5 = (B) g5;
        b5.G(c1617tm.f15724a, 0, 4, false);
        long D5 = c1617tm.D();
        hVar.f833l = 4;
        while (true) {
            if (D5 != 440786851) {
                int i = (int) j6;
                int i5 = hVar.f833l + 1;
                hVar.f833l = i5;
                if (i5 == i) {
                    break;
                }
                b5.G(c1617tm.f15724a, 0, 1, false);
                D5 = ((D5 << 8) & (-256)) | (c1617tm.f15724a[0] & 255);
            } else {
                long l5 = hVar.l(b3);
                long j7 = hVar.f833l;
                if (l5 != Long.MIN_VALUE) {
                    long j8 = j7 + l5;
                    if (j5 == -1 || j8 < j5) {
                        while (true) {
                            long j9 = hVar.f833l;
                            if (j9 < j8) {
                                if (hVar.l(b3) != Long.MIN_VALUE) {
                                    long l6 = hVar.l(b3);
                                    if (l6 < 0) {
                                        break;
                                    }
                                    if (l6 != 0) {
                                        int i6 = (int) l6;
                                        b5.g(i6, false);
                                        hVar.f833l += i6;
                                    }
                                } else {
                                    break;
                                }
                            } else if (j9 == j8) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x0470, code lost:
    
        throw com.google.android.gms.internal.ads.B7.a(null, "EBML lacing sample size out of range.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x00d2, code lost:
    
        if (r5 == 1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(G g5, C0072a c0072a) {
        boolean z3;
        C0783b1 c0783b1;
        long j5;
        int i;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        B b3;
        int i9;
        long j6;
        int i10;
        int i11;
        int i12;
        C0783b1 c0783b12;
        long j7;
        B b5;
        C0783b1 c0783b13;
        int i13;
        int e3;
        boolean z5 = 0;
        this.f12566G = false;
        while (!this.f12566G) {
            Y0 y02 = this.f12591d0;
            AbstractC1668us.F(y02.f12266d);
            while (true) {
                ArrayDeque arrayDeque = y02.f12264b;
                X0 x02 = (X0) arrayDeque.peek();
                if (x02 == null || ((B) g5).f7752n < x02.f12134b) {
                    int i14 = y02.f12267e;
                    int i15 = 8;
                    int i16 = 4;
                    C0783b1 c0783b14 = y02.f12265c;
                    if (i14 == 0) {
                        B b6 = (B) g5;
                        long g6 = c0783b14.g(b6, true, z5, 4);
                        if (g6 == -2) {
                            b6.f7754p = z5 ? 1 : 0;
                            C0783b1 c0783b15 = c0783b14;
                            while (true) {
                                byte[] bArr = y02.f12263a;
                                j5 = 0;
                                b5 = (B) g5;
                                b5.G(bArr, z5 ? 1 : 0, i16, z5);
                                byte b7 = bArr[z5 ? 1 : 0];
                                int i17 = z5 ? 1 : 0;
                                C0783b1 c0783b16 = c0783b15;
                                while (true) {
                                    if (i17 < i15) {
                                        int i18 = i17 + 1;
                                        C0783b1 c0783b17 = c0783b16;
                                        if ((C0783b1.f12748n[i17] & b7) != 0) {
                                            i13 = i18;
                                            c0783b13 = c0783b17;
                                        } else {
                                            i17 = i18;
                                            c0783b16 = c0783b17;
                                        }
                                    } else {
                                        c0783b13 = c0783b16;
                                        i13 = -1;
                                    }
                                }
                                if (i13 != -1 && i13 <= i16) {
                                    e3 = (int) C0783b1.e(i13, z5, bArr);
                                    Object obj = y02.f12266d.f11282l;
                                    if (e3 != 357149030 && e3 != 524531317 && e3 != 475249515) {
                                        if (e3 == 374648427) {
                                            e3 = 374648427;
                                        }
                                    }
                                }
                                b5.k(1);
                                c0783b15 = c0783b13;
                                i15 = 8;
                                i16 = 4;
                            }
                            b5.k(i13);
                            j7 = e3;
                            z3 = true;
                            c0783b12 = c0783b13;
                        } else {
                            z3 = true;
                            c0783b12 = c0783b14;
                            j5 = 0;
                            j7 = g6;
                        }
                        if (j7 != -1) {
                            y02.f = (int) j7;
                            y02.f12267e = z3 ? 1 : 0;
                            c0783b1 = c0783b12;
                        }
                    } else {
                        z3 = true;
                        c0783b1 = c0783b14;
                        j5 = 0;
                    }
                    y02.f12268g = c0783b1.g((B) g5, z5, z3, 8);
                    y02.f12267e = 2;
                    Qt qt = y02.f12266d;
                    int i19 = y02.f;
                    C0738a1 c0738a1 = (C0738a1) qt.f11282l;
                    RuntimeException runtimeException = null;
                    switch (i19) {
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 241:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            long j8 = y02.f12268g;
                            if (j8 > 8) {
                                throw B7.a(null, "Invalid integer size: " + j8);
                            }
                            long a5 = y02.a((B) g5, (int) j8);
                            c0738a1.getClass();
                            if (i19 != 20529) {
                                if (i19 != 20530) {
                                    switch (i19) {
                                        case 131:
                                            c0738a1.i(i19);
                                            c0738a1.f12607v.f12414d = (int) a5;
                                            break;
                                        case 136:
                                            boolean z6 = a5 == 1;
                                            c0738a1.i(i19);
                                            c0738a1.f12607v.f12407W = z6;
                                            break;
                                        case 155:
                                            c0738a1.J = c0738a1.c(a5);
                                            break;
                                        case 159:
                                            c0738a1.i(i19);
                                            c0738a1.f12607v.f12400P = (int) a5;
                                            break;
                                        case 176:
                                            c0738a1.i(i19);
                                            c0738a1.f12607v.f12421m = (int) a5;
                                            break;
                                        case 179:
                                            c0738a1.g(i19);
                                            c0738a1.f12563D.e(c0738a1.c(a5));
                                            break;
                                        case 186:
                                            c0738a1.i(i19);
                                            c0738a1.f12607v.f12422n = (int) a5;
                                            break;
                                        case 215:
                                            c0738a1.i(i19);
                                            c0738a1.f12607v.f12413c = (int) a5;
                                            break;
                                        case 231:
                                            c0738a1.f12562C = c0738a1.c(a5);
                                            break;
                                        case 238:
                                            c0738a1.f12574Q = (int) a5;
                                            break;
                                        case 241:
                                            if (!c0738a1.f12565F) {
                                                c0738a1.g(i19);
                                                c0738a1.f12564E.e(a5);
                                                c0738a1.f12565F = true;
                                                break;
                                            }
                                            break;
                                        case 251:
                                            c0738a1.f12575R = true;
                                            break;
                                        case 16871:
                                            c0738a1.i(i19);
                                            c0738a1.f12607v.f12416g = (int) a5;
                                            break;
                                        case 16980:
                                            if (a5 != 3) {
                                                throw B7.a(null, "ContentCompAlgo " + a5 + " not supported");
                                            }
                                            break;
                                        case 17029:
                                            if (a5 < 1 || a5 > 2) {
                                                throw B7.a(null, "DocTypeReadVersion " + a5 + " not supported");
                                            }
                                            break;
                                        case 17143:
                                            if (a5 != 1) {
                                                throw B7.a(null, "EBMLReadVersion " + a5 + " not supported");
                                            }
                                            break;
                                        case 18401:
                                            if (a5 != 5) {
                                                throw B7.a(null, "ContentEncAlgo " + a5 + " not supported");
                                            }
                                            break;
                                        case 18408:
                                            if (a5 != 1) {
                                                throw B7.a(null, "AESSettingsCipherMode " + a5 + " not supported");
                                            }
                                            break;
                                        case 21420:
                                            c0738a1.f12610y = a5 + c0738a1.f12603r;
                                            break;
                                        case 21432:
                                            int i20 = (int) a5;
                                            c0738a1.i(i19);
                                            if (i20 == 0) {
                                                i = 0;
                                                c0738a1.f12607v.f12432x = 0;
                                                y02.f12267e = i;
                                                break;
                                            } else if (i20 == 1) {
                                                c0738a1.f12607v.f12432x = 2;
                                                break;
                                            } else if (i20 == 3) {
                                                c0738a1.f12607v.f12432x = 1;
                                                break;
                                            } else if (i20 == 15) {
                                                c0738a1.f12607v.f12432x = 3;
                                                break;
                                            }
                                            break;
                                        case 21680:
                                            c0738a1.i(i19);
                                            c0738a1.f12607v.f12424p = (int) a5;
                                            break;
                                        case 21682:
                                            c0738a1.i(i19);
                                            c0738a1.f12607v.f12426r = (int) a5;
                                            break;
                                        case 21690:
                                            c0738a1.i(i19);
                                            c0738a1.f12607v.f12425q = (int) a5;
                                            break;
                                        case 21930:
                                            boolean z7 = a5 == 1;
                                            c0738a1.i(i19);
                                            c0738a1.f12607v.f12406V = z7;
                                            break;
                                        case 21938:
                                            c0738a1.i(i19);
                                            Z0 z02 = c0738a1.f12607v;
                                            z02.f12433y = true;
                                            z02.f12423o = (int) a5;
                                            break;
                                        case 21998:
                                            c0738a1.i(i19);
                                            c0738a1.f12607v.f = (int) a5;
                                            break;
                                        case 22186:
                                            c0738a1.i(i19);
                                            c0738a1.f12607v.f12403S = a5;
                                            break;
                                        case 22203:
                                            c0738a1.i(i19);
                                            c0738a1.f12607v.f12404T = a5;
                                            break;
                                        case 25188:
                                            c0738a1.i(i19);
                                            c0738a1.f12607v.f12401Q = (int) a5;
                                            break;
                                        case 30114:
                                            c0738a1.f12576S = a5;
                                            break;
                                        case 30321:
                                            int i21 = (int) a5;
                                            c0738a1.i(i19);
                                            if (i21 == 0) {
                                                i = 0;
                                                c0738a1.f12607v.f12427s = 0;
                                                y02.f12267e = i;
                                                break;
                                            } else if (i21 == 1) {
                                                c0738a1.f12607v.f12427s = 1;
                                                break;
                                            } else if (i21 == 2) {
                                                c0738a1.f12607v.f12427s = 2;
                                                break;
                                            } else if (i21 == 3) {
                                                c0738a1.f12607v.f12427s = 3;
                                                break;
                                            }
                                            break;
                                        case 2352003:
                                            c0738a1.i(i19);
                                            c0738a1.f12607v.f12415e = (int) a5;
                                            break;
                                        case 2807729:
                                            c0738a1.f12604s = a5;
                                            break;
                                        default:
                                            switch (i19) {
                                                case 21945:
                                                    int i22 = (int) a5;
                                                    c0738a1.i(i19);
                                                    if (i22 == 1) {
                                                        c0738a1.f12607v.f12388B = 2;
                                                        break;
                                                    } else if (i22 == 2) {
                                                        c0738a1.f12607v.f12388B = 1;
                                                        break;
                                                    }
                                                    break;
                                                case 21946:
                                                    c0738a1.i(i19);
                                                    int b8 = C1242lE.b((int) a5);
                                                    if (b8 != -1) {
                                                        c0738a1.f12607v.f12387A = b8;
                                                        break;
                                                    }
                                                    break;
                                                case 21947:
                                                    c0738a1.i(i19);
                                                    c0738a1.f12607v.f12433y = true;
                                                    int a6 = C1242lE.a((int) a5);
                                                    if (a6 != -1) {
                                                        c0738a1.f12607v.f12434z = a6;
                                                        break;
                                                    }
                                                    break;
                                                case 21948:
                                                    c0738a1.i(i19);
                                                    c0738a1.f12607v.f12389C = (int) a5;
                                                    break;
                                                case 21949:
                                                    c0738a1.i(i19);
                                                    c0738a1.f12607v.f12390D = (int) a5;
                                                    break;
                                            }
                                    }
                                } else if (a5 != 1) {
                                    throw B7.a(null, "ContentEncodingScope " + a5 + " not supported");
                                }
                            } else if (a5 != 0) {
                                throw B7.a(null, "ContentEncodingOrder " + a5 + " not supported");
                            }
                            i = 0;
                            y02.f12267e = i;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            long j9 = y02.f12268g;
                            if (j9 > 2147483647L) {
                                throw B7.a(null, "String element size: " + j9);
                            }
                            int i23 = (int) j9;
                            if (i23 == 0) {
                                str = "";
                            } else {
                                byte[] bArr2 = new byte[i23];
                                ((B) g5).F(bArr2, 0, i23, false);
                                while (i23 > 0) {
                                    int i24 = i23 - 1;
                                    if (bArr2[i24] == 0) {
                                        i23 = i24;
                                    } else {
                                        str = new String(bArr2, 0, i23);
                                    }
                                }
                                str = new String(bArr2, 0, i23);
                            }
                            c0738a1.getClass();
                            if (i19 == 134) {
                                c0738a1.i(i19);
                                c0738a1.f12607v.f12412b = str;
                            } else if (i19 != 17026) {
                                if (i19 == 21358) {
                                    c0738a1.i(i19);
                                    c0738a1.f12607v.f12411a = str;
                                } else if (i19 == 2274716) {
                                    c0738a1.i(i19);
                                    c0738a1.f12607v.f12408X = str;
                                }
                            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                throw B7.a(null, "DocType " + str + " not supported");
                            }
                            y02.f12267e = 0;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            long j10 = ((B) g5).f7752n;
                            arrayDeque.push(new X0(i19, y02.f12268g + j10));
                            Qt qt2 = y02.f12266d;
                            int i25 = y02.f;
                            long j11 = y02.f12268g;
                            C0738a1 c0738a12 = (C0738a1) qt2.f11282l;
                            AbstractC1668us.F(c0738a12.f12589c0);
                            if (i25 != 160) {
                                if (i25 == 174) {
                                    Z0 z03 = new Z0();
                                    z03.f12421m = -1;
                                    z03.f12422n = -1;
                                    z03.f12423o = -1;
                                    z03.f12424p = -1;
                                    z03.f12425q = -1;
                                    z03.f12426r = 0;
                                    z03.f12427s = -1;
                                    z03.f12428t = 0.0f;
                                    z03.f12429u = 0.0f;
                                    z03.f12430v = 0.0f;
                                    z03.f12431w = null;
                                    z03.f12432x = -1;
                                    z03.f12433y = false;
                                    z03.f12434z = -1;
                                    z03.f12387A = -1;
                                    z03.f12388B = -1;
                                    z03.f12389C = 1000;
                                    z03.f12390D = 200;
                                    z03.f12391E = -1.0f;
                                    z03.f12392F = -1.0f;
                                    z03.f12393G = -1.0f;
                                    z03.f12394H = -1.0f;
                                    z03.f12395I = -1.0f;
                                    z03.J = -1.0f;
                                    z03.K = -1.0f;
                                    z03.f12396L = -1.0f;
                                    z03.f12397M = -1.0f;
                                    z03.f12398N = -1.0f;
                                    z03.f12400P = 1;
                                    z03.f12401Q = -1;
                                    z03.f12402R = 8000;
                                    z03.f12403S = 0L;
                                    z03.f12404T = 0L;
                                    z03.f12407W = true;
                                    z03.f12408X = "eng";
                                    c0738a12.f12607v = z03;
                                } else if (i25 == 187) {
                                    i5 = 0;
                                    c0738a12.f12565F = false;
                                } else if (i25 == 19899) {
                                    c0738a12.f12609x = -1;
                                    c0738a12.f12610y = -1L;
                                } else if (i25 == 20533) {
                                    c0738a12.i(i25);
                                    c0738a12.f12607v.f12417h = true;
                                } else if (i25 == 21968) {
                                    c0738a12.i(i25);
                                    c0738a12.f12607v.f12433y = true;
                                } else if (i25 == 408125543) {
                                    long j12 = c0738a12.f12603r;
                                    if (j12 != -1 && j12 != j10) {
                                        throw B7.a(null, "Multiple Segment elements not supported");
                                    }
                                    c0738a12.f12603r = j10;
                                    c0738a12.f12602q = j11;
                                } else if (i25 == 475249515) {
                                    c0738a12.f12563D = new Zk(32);
                                    c0738a12.f12564E = new Zk(32);
                                } else if (i25 == 524531317 && !c0738a12.f12608w) {
                                    if (!c0738a12.f12588c || c0738a12.f12560A == -1) {
                                        c0738a12.f12589c0.x(new J(c0738a12.f12606u, j5));
                                        c0738a12.f12608w = true;
                                    } else {
                                        c0738a12.f12611z = true;
                                    }
                                }
                                i5 = 0;
                            } else {
                                i5 = 0;
                                c0738a12.f12575R = false;
                                c0738a12.f12576S = j5;
                            }
                            y02.f12267e = i5;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            int i26 = (int) y02.f12268g;
                            SparseArray sparseArray = c0738a1.f12586b;
                            if (i19 == 161 || i19 == 163) {
                                int i27 = c0738a1.f12567H;
                                C1617tm c1617tm = c0738a1.f12594h;
                                if (i27 == 0) {
                                    C0783b1 c0783b18 = c0738a1.f12584a;
                                    c0738a1.f12571N = (int) c0783b18.g((B) g5, z5, true, 8);
                                    c0738a1.f12572O = c0783b18.f12752l;
                                    c0738a1.J = -9223372036854775807L;
                                    c0738a1.f12567H = 1;
                                    c1617tm.g(z5 ? 1 : 0);
                                }
                                Z0 z04 = (Z0) sparseArray.get(c0738a1.f12571N);
                                if (z04 == null) {
                                    ((B) g5).k(i26 - c0738a1.f12572O);
                                    c0738a1.f12567H = z5 ? 1 : 0;
                                    i7 = z5;
                                } else {
                                    z04.f12409Y.getClass();
                                    if (c0738a1.f12567H == 1) {
                                        B b9 = (B) g5;
                                        c0738a1.l(b9, 3);
                                        int i28 = (c1617tm.f15724a[2] & 6) >> 1;
                                        if (i28 == 0) {
                                            c0738a1.f12569L = 1;
                                            int[] iArr = c0738a1.f12570M;
                                            if (iArr == null) {
                                                iArr = new int[1];
                                            } else {
                                                int length = iArr.length;
                                                if (length < 1) {
                                                    iArr = new int[Math.max(length + length, 1)];
                                                }
                                            }
                                            c0738a1.f12570M = iArr;
                                            iArr[z5 ? 1 : 0] = (i26 - c0738a1.f12572O) - 3;
                                        } else {
                                            c0738a1.l(b9, 4);
                                            int i29 = (c1617tm.f15724a[3] & 255) + 1;
                                            c0738a1.f12569L = i29;
                                            int[] iArr2 = c0738a1.f12570M;
                                            if (iArr2 == null) {
                                                iArr2 = new int[i29];
                                            } else {
                                                int length2 = iArr2.length;
                                                if (length2 < i29) {
                                                    iArr2 = new int[Math.max(length2 + length2, i29)];
                                                }
                                            }
                                            c0738a1.f12570M = iArr2;
                                            if (i28 == 2) {
                                                int i30 = (i26 - c0738a1.f12572O) - 4;
                                                int i31 = c0738a1.f12569L;
                                                Arrays.fill(iArr2, z5 ? 1 : 0, i31, i30 / i31);
                                            } else if (i28 == 1) {
                                                int i32 = z5 ? 1 : 0;
                                                int i33 = i32;
                                                int i34 = 4;
                                                while (true) {
                                                    int i35 = c0738a1.f12569L - 1;
                                                    if (i32 < i35) {
                                                        c0738a1.f12570M[i32] = z5 ? 1 : 0;
                                                        while (true) {
                                                            i10 = i34 + 1;
                                                            c0738a1.l(b9, i10);
                                                            int i36 = c1617tm.f15724a[i34] & 255;
                                                            int[] iArr3 = c0738a1.f12570M;
                                                            i11 = iArr3[i32] + i36;
                                                            iArr3[i32] = i11;
                                                            if (i36 != 255) {
                                                                break;
                                                            }
                                                            i34 = i10;
                                                        }
                                                        i33 += i11;
                                                        i32++;
                                                        i34 = i10;
                                                    } else {
                                                        c0738a1.f12570M[i35] = ((i26 - c0738a1.f12572O) - i34) - i33;
                                                    }
                                                }
                                            } else {
                                                if (i28 != 3) {
                                                    throw B7.a(null, "Unexpected lacing value: 2");
                                                }
                                                int i37 = z5 ? 1 : 0;
                                                int i38 = i37;
                                                int i39 = 4;
                                                int i40 = z5;
                                                while (true) {
                                                    int i41 = c0738a1.f12569L - 1;
                                                    if (i37 < i41) {
                                                        c0738a1.f12570M[i37] = i40;
                                                        int i42 = i39 + 1;
                                                        c0738a1.l(b9, i42);
                                                        int i43 = i40;
                                                        if (c1617tm.f15724a[i39] == 0) {
                                                            throw B7.a(runtimeException, "No valid varint length mask found");
                                                        }
                                                        int i44 = i43;
                                                        while (true) {
                                                            if (i44 < 8) {
                                                                int i45 = 1 << (7 - i44);
                                                                if ((c1617tm.f15724a[i39] & i45) != 0) {
                                                                    int i46 = i42 + i44;
                                                                    c0738a1.l(b9, i46);
                                                                    int i47 = i44;
                                                                    int i48 = c1617tm.f15724a[i39] & 255 & (~i45);
                                                                    b3 = b9;
                                                                    i9 = i38;
                                                                    j6 = i48;
                                                                    while (i42 < i46) {
                                                                        j6 = (j6 << 8) | (c1617tm.f15724a[i42] & 255);
                                                                        i42++;
                                                                    }
                                                                    if (i37 > 0) {
                                                                        j6 -= (1 << ((i47 * 7) + 6)) - 1;
                                                                    }
                                                                    i39 = i46;
                                                                } else {
                                                                    i44++;
                                                                }
                                                            } else {
                                                                b3 = b9;
                                                                i9 = i38;
                                                                i39 = i42;
                                                                j6 = j5;
                                                            }
                                                        }
                                                        if (j6 >= -2147483648L && j6 <= 2147483647L) {
                                                            int[] iArr4 = c0738a1.f12570M;
                                                            int i49 = (int) j6;
                                                            if (i37 != 0) {
                                                                i49 += iArr4[i37 - 1];
                                                            }
                                                            iArr4[i37] = i49;
                                                            i38 = i9 + i49;
                                                            i37++;
                                                            b9 = b3;
                                                            i40 = i43;
                                                            runtimeException = null;
                                                        }
                                                    } else {
                                                        i8 = i40;
                                                        c0738a1.f12570M[i41] = ((i26 - c0738a1.f12572O) - i39) - i38;
                                                    }
                                                }
                                            }
                                        }
                                        i8 = z5 ? 1 : 0;
                                        int i50 = c1617tm.f15724a[i8] << 8;
                                        c0738a1.f12568I = c0738a1.c((r2[1] & 255) | i50) + c0738a1.f12562C;
                                        if (z04.f12414d != 2) {
                                            if (i19 != 163) {
                                                i12 = i8;
                                            } else if ((c1617tm.f15724a[2] & 128) == 128) {
                                                i19 = 163;
                                            } else {
                                                i12 = i8;
                                                i19 = 163;
                                            }
                                            c0738a1.f12573P = i12;
                                            c0738a1.f12567H = 2;
                                            c0738a1.K = i8;
                                            i6 = 163;
                                        }
                                        i12 = 1;
                                        c0738a1.f12573P = i12;
                                        c0738a1.f12567H = 2;
                                        c0738a1.K = i8;
                                        i6 = 163;
                                    } else {
                                        i6 = 163;
                                    }
                                    if (i19 == i6) {
                                        while (true) {
                                            int i51 = c0738a1.K;
                                            if (i51 < c0738a1.f12569L) {
                                                c0738a1.k(z04, c0738a1.f12568I + ((c0738a1.K * z04.f12415e) / 1000), c0738a1.f12573P, c0738a1.b((B) g5, z04, c0738a1.f12570M[i51], false), 0);
                                                c0738a1.K++;
                                            } else {
                                                i7 = 0;
                                                c0738a1.f12567H = 0;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            int i52 = c0738a1.K;
                                            if (i52 < c0738a1.f12569L) {
                                                int[] iArr5 = c0738a1.f12570M;
                                                iArr5[i52] = c0738a1.b((B) g5, z04, iArr5[i52], true);
                                                c0738a1.K++;
                                            } else {
                                                i7 = 0;
                                            }
                                        }
                                    }
                                }
                                y02.f12267e = i7;
                                break;
                            } else {
                                if (i19 != 165) {
                                    if (i19 == 16877) {
                                        c0738a1.i(i19);
                                        Z0 z05 = c0738a1.f12607v;
                                        int i53 = z05.f12416g;
                                        if (i53 == 1685485123 || i53 == 1685480259) {
                                            byte[] bArr3 = new byte[i26];
                                            z05.f12399O = bArr3;
                                            ((B) g5).F(bArr3, z5 ? 1 : 0, i26, z5);
                                        } else {
                                            ((B) g5).k(i26);
                                        }
                                    } else if (i19 == 16981) {
                                        c0738a1.i(i19);
                                        byte[] bArr4 = new byte[i26];
                                        c0738a1.f12607v.i = bArr4;
                                        ((B) g5).F(bArr4, z5 ? 1 : 0, i26, z5);
                                    } else if (i19 == 18402) {
                                        byte[] bArr5 = new byte[i26];
                                        ((B) g5).F(bArr5, z5 ? 1 : 0, i26, z5);
                                        c0738a1.i(i19);
                                        c0738a1.f12607v.f12418j = new Z(1, z5 ? 1 : 0, z5 ? 1 : 0, bArr5);
                                    } else if (i19 == 21419) {
                                        C1617tm c1617tm2 = c0738a1.f12595j;
                                        Arrays.fill(c1617tm2.f15724a, z5 ? (byte) 1 : (byte) 0);
                                        ((B) g5).F(c1617tm2.f15724a, 4 - i26, i26, z5);
                                        c1617tm2.j(z5 ? 1 : 0);
                                        c0738a1.f12609x = (int) c1617tm2.D();
                                    } else if (i19 == 25506) {
                                        c0738a1.i(i19);
                                        byte[] bArr6 = new byte[i26];
                                        c0738a1.f12607v.f12419k = bArr6;
                                        ((B) g5).F(bArr6, z5 ? 1 : 0, i26, z5);
                                    } else {
                                        if (i19 != 30322) {
                                            throw B7.a(null, "Unexpected id: " + i19);
                                        }
                                        c0738a1.i(i19);
                                        byte[] bArr7 = new byte[i26];
                                        c0738a1.f12607v.f12431w = bArr7;
                                        ((B) g5).F(bArr7, z5 ? 1 : 0, i26, z5);
                                    }
                                } else if (c0738a1.f12567H != 2) {
                                    i7 = 0;
                                    y02.f12267e = i7;
                                } else {
                                    Z0 z06 = (Z0) sparseArray.get(c0738a1.f12571N);
                                    if (c0738a1.f12574Q == 4 && "V_VP9".equals(z06.f12412b)) {
                                        C1617tm c1617tm3 = c0738a1.f12600o;
                                        c1617tm3.g(i26);
                                        ((B) g5).F(c1617tm3.f15724a, z5 ? 1 : 0, i26, z5);
                                    } else {
                                        ((B) g5).k(i26);
                                    }
                                }
                                i7 = z5;
                                y02.f12267e = i7;
                            }
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            long j13 = y02.f12268g;
                            if (j13 != 4 && j13 != 8) {
                                throw B7.a(null, "Invalid float size: " + j13);
                            }
                            int i54 = (int) j13;
                            double intBitsToFloat = i54 == 4 ? Float.intBitsToFloat((int) r12) : Double.longBitsToDouble(y02.a((B) g5, i54));
                            if (i19 == 181) {
                                c0738a1.i(i19);
                                c0738a1.f12607v.f12402R = (int) intBitsToFloat;
                            } else if (i19 != 17545) {
                                switch (i19) {
                                    case 21969:
                                        c0738a1.i(i19);
                                        c0738a1.f12607v.f12391E = (float) intBitsToFloat;
                                        break;
                                    case 21970:
                                        c0738a1.i(i19);
                                        c0738a1.f12607v.f12392F = (float) intBitsToFloat;
                                        break;
                                    case 21971:
                                        c0738a1.i(i19);
                                        c0738a1.f12607v.f12393G = (float) intBitsToFloat;
                                        break;
                                    case 21972:
                                        c0738a1.i(i19);
                                        c0738a1.f12607v.f12394H = (float) intBitsToFloat;
                                        break;
                                    case 21973:
                                        c0738a1.i(i19);
                                        c0738a1.f12607v.f12395I = (float) intBitsToFloat;
                                        break;
                                    case 21974:
                                        c0738a1.i(i19);
                                        c0738a1.f12607v.J = (float) intBitsToFloat;
                                        break;
                                    case 21975:
                                        c0738a1.i(i19);
                                        c0738a1.f12607v.K = (float) intBitsToFloat;
                                        break;
                                    case 21976:
                                        c0738a1.i(i19);
                                        c0738a1.f12607v.f12396L = (float) intBitsToFloat;
                                        break;
                                    case 21977:
                                        c0738a1.i(i19);
                                        c0738a1.f12607v.f12397M = (float) intBitsToFloat;
                                        break;
                                    case 21978:
                                        c0738a1.i(i19);
                                        c0738a1.f12607v.f12398N = (float) intBitsToFloat;
                                        break;
                                    default:
                                        switch (i19) {
                                            case 30323:
                                                c0738a1.i(i19);
                                                c0738a1.f12607v.f12428t = (float) intBitsToFloat;
                                                break;
                                            case 30324:
                                                c0738a1.i(i19);
                                                c0738a1.f12607v.f12429u = (float) intBitsToFloat;
                                                break;
                                            case 30325:
                                                c0738a1.i(i19);
                                                c0738a1.f12607v.f12430v = (float) intBitsToFloat;
                                                break;
                                            default:
                                                c0738a1.getClass();
                                                break;
                                        }
                                }
                            } else {
                                c0738a1.f12605t = (long) intBitsToFloat;
                            }
                            y02.f12267e = z5 ? 1 : 0;
                            break;
                            break;
                        default:
                            ((B) g5).k((int) y02.f12268g);
                            y02.f12267e = z5 ? 1 : 0;
                    }
                } else {
                    ((C0738a1) y02.f12266d.f11282l).a(((X0) arrayDeque.pop()).f12133a);
                    z5 = 1;
                }
            }
            z5 = 1;
            if (z5 != 0) {
                long j14 = ((B) g5).f7752n;
                if (this.f12611z) {
                    this.f12561B = j14;
                    c0072a.f658a = this.f12560A;
                    this.f12611z = false;
                    return 1;
                }
                if (this.f12608w) {
                    long j15 = this.f12561B;
                    if (j15 != -1) {
                        c0072a.f658a = j15;
                        this.f12561B = -1L;
                        return 1;
                    }
                }
                z5 = 0;
            } else {
                int i55 = 0;
                while (true) {
                    SparseArray sparseArray2 = this.f12586b;
                    if (i55 >= sparseArray2.size()) {
                        return -1;
                    }
                    Z0 z07 = (Z0) sparseArray2.valueAt(i55);
                    z07.f12409Y.getClass();
                    C0782b0 c0782b0 = z07.f12405U;
                    if (c0782b0 != null) {
                        c0782b0.a(z07.f12409Y, z07.f12418j);
                    }
                    i55++;
                }
            }
        }
        return z5 ? 1 : 0;
    }

    public final void g(int i) {
        if (this.f12563D == null || this.f12564E == null) {
            throw B7.a(null, "Element " + i + " must be in a Cues");
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        if (this.f12590d) {
            h3 = new C0905dr(h3, this.f12592e);
        }
        this.f12589c0 = h3;
    }

    public final void i(int i) {
        if (this.f12607v != null) {
            return;
        }
        throw B7.a(null, "Element " + i + " must be in a TrackEntry");
    }

    @Override // com.google.android.gms.internal.ads.F
    public final List j() {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        return C1761wv.f16184o;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0 A[EDGE_INSN: B:50:0x00d0->B:49:0x00d0 BREAK  A[LOOP:0: B:42:0x00bf->B:46:0x00cd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Z0 z02, long j5, int i, int i5, int i6) {
        char c5;
        byte[] o5;
        int i7;
        int i8;
        int i9;
        C0782b0 c0782b0 = z02.f12405U;
        if (c0782b0 != null) {
            c0782b0.b(z02.f12409Y, j5, i, i5, i6, z02.f12418j);
        } else {
            if ("S_TEXT/UTF8".equals(z02.f12412b) || "S_TEXT/ASS".equals(z02.f12412b) || "S_TEXT/WEBVTT".equals(z02.f12412b)) {
                if (this.f12569L > 1) {
                    JB.l("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j6 = this.J;
                    if (j6 == -9223372036854775807L) {
                        JB.l("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = z02.f12412b;
                        C1617tm c1617tm = this.f12597l;
                        byte[] bArr = c1617tm.f15724a;
                        int hashCode = str.hashCode();
                        if (hashCode == 738597099) {
                            if (str.equals("S_TEXT/ASS")) {
                                c5 = 1;
                                if (c5 != 0) {
                                }
                                System.arraycopy(o5, 0, bArr, i7, o5.length);
                                i8 = c1617tm.f15725b;
                                while (true) {
                                    if (i8 >= c1617tm.f15726c) {
                                    }
                                    i8++;
                                }
                                z02.f12409Y.c(c1617tm.f15726c, c1617tm);
                                i9 = i5 + c1617tm.f15726c;
                                if ((i & 268435456) != 0) {
                                }
                                z02.f12409Y.d(j5, i, i9, i6, z02.f12418j);
                            }
                            c5 = 65535;
                            if (c5 != 0) {
                            }
                            System.arraycopy(o5, 0, bArr, i7, o5.length);
                            i8 = c1617tm.f15725b;
                            while (true) {
                                if (i8 >= c1617tm.f15726c) {
                                }
                                i8++;
                            }
                            z02.f12409Y.c(c1617tm.f15726c, c1617tm);
                            i9 = i5 + c1617tm.f15726c;
                            if ((i & 268435456) != 0) {
                            }
                            z02.f12409Y.d(j5, i, i9, i6, z02.f12418j);
                        } else if (hashCode != 1045209816) {
                            if (hashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                                c5 = 0;
                                if (c5 != 0) {
                                    o5 = o(j6, 1000L, "%02d:%02d:%02d,%03d");
                                    i7 = 19;
                                } else if (c5 == 1) {
                                    o5 = o(j6, 10000L, "%01d:%02d:%02d:%02d");
                                    i7 = 21;
                                } else {
                                    if (c5 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    o5 = o(j6, 1000L, "%02d:%02d:%02d.%03d");
                                    i7 = 25;
                                }
                                System.arraycopy(o5, 0, bArr, i7, o5.length);
                                i8 = c1617tm.f15725b;
                                while (true) {
                                    if (i8 >= c1617tm.f15726c) {
                                        break;
                                    }
                                    if (c1617tm.f15724a[i8] == 0) {
                                        c1617tm.i(i8);
                                        break;
                                    }
                                    i8++;
                                }
                                z02.f12409Y.c(c1617tm.f15726c, c1617tm);
                                i9 = i5 + c1617tm.f15726c;
                                if ((i & 268435456) != 0) {
                                    int i10 = this.f12569L;
                                    C1617tm c1617tm2 = this.f12600o;
                                    if (i10 > 1) {
                                        c1617tm2.g(0);
                                    } else {
                                        int i11 = c1617tm2.f15726c;
                                        z02.f12409Y.f(c1617tm2, i11, 2);
                                        i9 += i11;
                                    }
                                }
                                z02.f12409Y.d(j5, i, i9, i6, z02.f12418j);
                            }
                            c5 = 65535;
                            if (c5 != 0) {
                            }
                            System.arraycopy(o5, 0, bArr, i7, o5.length);
                            i8 = c1617tm.f15725b;
                            while (true) {
                                if (i8 >= c1617tm.f15726c) {
                                }
                                i8++;
                            }
                            z02.f12409Y.c(c1617tm.f15726c, c1617tm);
                            i9 = i5 + c1617tm.f15726c;
                            if ((i & 268435456) != 0) {
                            }
                            z02.f12409Y.d(j5, i, i9, i6, z02.f12418j);
                        } else {
                            if (str.equals("S_TEXT/WEBVTT")) {
                                c5 = 2;
                                if (c5 != 0) {
                                }
                                System.arraycopy(o5, 0, bArr, i7, o5.length);
                                i8 = c1617tm.f15725b;
                                while (true) {
                                    if (i8 >= c1617tm.f15726c) {
                                    }
                                    i8++;
                                }
                                z02.f12409Y.c(c1617tm.f15726c, c1617tm);
                                i9 = i5 + c1617tm.f15726c;
                                if ((i & 268435456) != 0) {
                                }
                                z02.f12409Y.d(j5, i, i9, i6, z02.f12418j);
                            }
                            c5 = 65535;
                            if (c5 != 0) {
                            }
                            System.arraycopy(o5, 0, bArr, i7, o5.length);
                            i8 = c1617tm.f15725b;
                            while (true) {
                                if (i8 >= c1617tm.f15726c) {
                                }
                                i8++;
                            }
                            z02.f12409Y.c(c1617tm.f15726c, c1617tm);
                            i9 = i5 + c1617tm.f15726c;
                            if ((i & 268435456) != 0) {
                            }
                            z02.f12409Y.d(j5, i, i9, i6, z02.f12418j);
                        }
                    }
                }
            }
            i9 = i5;
            if ((i & 268435456) != 0) {
            }
            z02.f12409Y.d(j5, i, i9, i6, z02.f12418j);
        }
        this.f12566G = true;
    }

    public final void l(B b3, int i) {
        C1617tm c1617tm = this.f12594h;
        if (c1617tm.f15726c >= i) {
            return;
        }
        byte[] bArr = c1617tm.f15724a;
        if (bArr.length < i) {
            int length = bArr.length;
            c1617tm.e(Math.max(length + length, i));
        }
        byte[] bArr2 = c1617tm.f15724a;
        int i5 = c1617tm.f15726c;
        b3.F(bArr2, i5, i - i5, false);
        c1617tm.i(i);
    }

    public final void m() {
        this.f12577T = 0;
        this.f12578U = 0;
        this.f12579V = 0;
        this.f12580W = false;
        this.f12581X = false;
        this.f12582Y = false;
        this.f12583Z = 0;
        this.f12585a0 = (byte) 0;
        this.f12587b0 = false;
        this.f12596k.g(0);
    }

    public final void n(B b3, byte[] bArr, int i) {
        int length = bArr.length;
        int i5 = length + i;
        C1617tm c1617tm = this.f12597l;
        byte[] bArr2 = c1617tm.f15724a;
        if (bArr2.length < i5) {
            byte[] copyOf = Arrays.copyOf(bArr, i5 + i);
            c1617tm.h(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        b3.F(c1617tm.f15724a, length, i, false);
        c1617tm.j(0);
        c1617tm.i(i5);
    }

    public C0738a1(Y0 y02, int i, O1 o12) {
        this.f12603r = -1L;
        this.f12604s = -9223372036854775807L;
        this.f12605t = -9223372036854775807L;
        this.f12606u = -9223372036854775807L;
        this.f12560A = -1L;
        this.f12561B = -1L;
        this.f12562C = -9223372036854775807L;
        this.f12591d0 = y02;
        y02.f12266d = new Qt(1, this);
        this.f12592e = o12;
        this.f12588c = true;
        this.f12590d = (i & 2) == 0;
        this.f12584a = new C0783b1(0);
        this.f12586b = new SparseArray();
        this.f12594h = new C1617tm(4);
        this.i = new C1617tm(ByteBuffer.allocate(4).putInt(-1).array());
        this.f12595j = new C1617tm(4);
        this.f = new C1617tm(AbstractC1668us.f15916a);
        this.f12593g = new C1617tm(4);
        this.f12596k = new C1617tm();
        this.f12597l = new C1617tm();
        this.f12598m = new C1617tm(8);
        this.f12599n = new C1617tm();
        this.f12600o = new C1617tm();
        this.f12570M = new int[1];
    }
}
