package N1;

import A1.C0045t0;
import A1.X;
import C1.AbstractC0096b;
import C1.C0095a;
import E4.y;
import F1.v;
import F1.w;
import android.util.Pair;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import io.sentry.SentryReplayEvent;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v0.AbstractC1663a;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class m implements F1.k, F1.s {

    /* renamed from: i, reason: collision with root package name */
    public int f4718i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f4719k;

    /* renamed from: l, reason: collision with root package name */
    public C0095a f4720l;

    /* renamed from: n, reason: collision with root package name */
    public int f4722n;

    /* renamed from: o, reason: collision with root package name */
    public int f4723o;

    /* renamed from: p, reason: collision with root package name */
    public int f4724p;

    /* renamed from: s, reason: collision with root package name */
    public long[][] f4727s;

    /* renamed from: t, reason: collision with root package name */
    public int f4728t;

    /* renamed from: u, reason: collision with root package name */
    public long f4729u;

    /* renamed from: v, reason: collision with root package name */
    public int f4730v;

    /* renamed from: h, reason: collision with root package name */
    public int f4717h = 0;

    /* renamed from: f, reason: collision with root package name */
    public final o f4715f = new o();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4716g = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final C0095a f4713d = new C0095a(16);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f4714e = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    public final C0095a f4710a = new C0095a(AbstractC1664a.f17086c);

    /* renamed from: b, reason: collision with root package name */
    public final C0095a f4711b = new C0095a(4);

    /* renamed from: c, reason: collision with root package name */
    public final C0095a f4712c = new C0095a(4, false);

    /* renamed from: m, reason: collision with root package name */
    public int f4721m = -1;

    /* renamed from: q, reason: collision with root package name */
    public F1.m f4725q = F1.m.f2545g;

    /* renamed from: r, reason: collision with root package name */
    public l[] f4726r = new l[0];

    @Override // F1.k
    public final boolean a(F1.l lVar) {
        return p.c(lVar, false, false);
    }

    @Override // F1.s
    public final boolean d() {
        return true;
    }

    @Override // F1.k
    public final void e(F1.m mVar) {
        this.f4725q = mVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x048b  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    @Override // F1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(F1.l lVar, y yVar) {
        int i7;
        int i8;
        long j;
        int i9;
        char c3;
        boolean z4;
        boolean z7;
        int i10;
        a aVar;
        boolean z8;
        int i11;
        int i12;
        int i13 = 3;
        int i14 = 0;
        int i15 = 2;
        int i16 = 4;
        boolean z9 = true;
        while (true) {
            int i17 = this.f4717h;
            ArrayDeque arrayDeque = this.f4714e;
            C0095a c0095a = this.f4712c;
            if (i17 == 0) {
                boolean z10 = z9;
                int i18 = this.f4719k;
                C0095a c0095a2 = this.f4713d;
                if (i18 == 0) {
                    if (!lVar.a((byte[]) c0095a2.f1465c, 0, 8, z10)) {
                        return -1;
                    }
                    this.f4719k = 8;
                    c0095a2.D(0);
                    this.j = c0095a2.u();
                    this.f4718i = c0095a2.g();
                }
                long j3 = this.j;
                if (j3 == 1) {
                    lVar.readFully((byte[]) c0095a2.f1465c, 8, 8);
                    this.f4719k += 8;
                    this.j = c0095a2.x();
                } else if (j3 == 0) {
                    long j7 = lVar.j();
                    if (j7 == -1 && (aVar = (a) arrayDeque.peek()) != null) {
                        j7 = aVar.f4633c;
                    }
                    if (j7 != -1) {
                        this.j = (j7 - lVar.z()) + this.f4719k;
                    }
                }
                long j8 = this.j;
                int i19 = this.f4719k;
                if (j8 < i19) {
                    throw C0045t0.c("Atom size less than header length (unsupported).");
                }
                int i20 = this.f4718i;
                if (i20 == 1836019574 || i20 == 1953653099 || i20 == 1835297121 || i20 == 1835626086 || i20 == 1937007212 || i20 == 1701082227 || i20 == 1835365473) {
                    z8 = true;
                    long z11 = lVar.z();
                    long j9 = this.j;
                    long j10 = this.f4719k;
                    long j11 = (z11 + j9) - j10;
                    if (j9 == j10 || this.f4718i != 1835365473) {
                        i11 = 4;
                    } else {
                        c0095a.A(8);
                        lVar.y((byte[]) c0095a.f1465c, 0, 8);
                        byte[] bArr = f.f4651a;
                        int i21 = c0095a.f1463a;
                        i11 = 4;
                        c0095a.E(4);
                        if (c0095a.g() != 1751411826) {
                            i21 += 4;
                        }
                        c0095a.D(i21);
                        lVar.q(c0095a.f1463a);
                        lVar.p();
                    }
                    arrayDeque.push(new a(this.f4718i, j11));
                    if (this.j == this.f4719k) {
                        j(j11);
                        i12 = 0;
                    } else {
                        i12 = 0;
                        this.f4717h = 0;
                        this.f4719k = 0;
                    }
                } else {
                    if (i20 == 1835296868 || i20 == 1836476516 || i20 == 1751411826 || i20 == 1937011556 || i20 == 1937011827 || i20 == 1937011571 || i20 == 1668576371 || i20 == 1701606260 || i20 == 1937011555 || i20 == 1937011578 || i20 == 1937013298 || i20 == 1937007471 || i20 == 1668232756 || i20 == 1953196132 || i20 == 1718909296 || i20 == 1969517665 || i20 == 1801812339 || i20 == 1768715124) {
                        AbstractC1664a.h(i19 == 8);
                        AbstractC1664a.h(this.j <= 2147483647L);
                        C0095a c0095a3 = new C0095a((int) this.j);
                        System.arraycopy((byte[]) c0095a2.f1465c, 0, (byte[]) c0095a3.f1465c, 0, 8);
                        this.f4720l = c0095a3;
                        z8 = true;
                        this.f4717h = 1;
                    } else {
                        long z12 = lVar.z();
                        long j12 = this.f4719k;
                        long j13 = z12 - j12;
                        if (this.f4718i == 1836086884) {
                            new MotionPhotoMetadata(0L, j13, -9223372036854775807L, j13 + j12, this.j - j12);
                        }
                        this.f4720l = null;
                        z8 = true;
                        this.f4717h = 1;
                    }
                    i12 = 0;
                    i11 = 4;
                }
                z9 = z8;
                i16 = i11;
                i15 = 2;
                i14 = i12;
                i13 = 3;
            } else {
                if (i17 != z9) {
                    if (i17 == i15) {
                        long z13 = lVar.z();
                        if (this.f4721m == -1) {
                            int i22 = -1;
                            int i23 = -1;
                            boolean z14 = true;
                            boolean z15 = true;
                            int i24 = 0;
                            long j14 = Long.MAX_VALUE;
                            long j15 = Long.MAX_VALUE;
                            long j16 = Long.MAX_VALUE;
                            while (true) {
                                l[] lVarArr = this.f4726r;
                                if (i24 >= lVarArr.length) {
                                    break;
                                }
                                l lVar2 = lVarArr[i24];
                                int i25 = lVar2.f4709e;
                                t tVar = lVar2.f4706b;
                                if (i25 != tVar.f4771b) {
                                    long j17 = tVar.f4772c[i25];
                                    long[][] jArr = this.f4727s;
                                    int i26 = v2.t.f17153a;
                                    long j18 = jArr[i24][i25];
                                    long j19 = j17 - z13;
                                    boolean z16 = j19 < 0 || j19 >= 262144;
                                    if ((!z16 && z15) || (z16 == z15 && j19 < j16)) {
                                        z15 = z16;
                                        j15 = j18;
                                        i23 = i24;
                                        j16 = j19;
                                    }
                                    if (j18 < j14) {
                                        z14 = z16;
                                        j14 = j18;
                                        i22 = i24;
                                    }
                                }
                                i24++;
                            }
                            if (j14 == Long.MAX_VALUE || !z14 || j15 < j14 + SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE) {
                                i22 = i23;
                            }
                            this.f4721m = i22;
                            if (i22 == -1) {
                                return -1;
                            }
                        }
                        l lVar3 = this.f4726r[this.f4721m];
                        v vVar = lVar3.f4707c;
                        int i27 = lVar3.f4709e;
                        t tVar2 = lVar3.f4706b;
                        long j20 = tVar2.f4772c[i27];
                        int i28 = tVar2.f4773d[i27];
                        long j21 = (j20 - z13) + this.f4722n;
                        if (j21 < 0 || j21 >= 262144) {
                            yVar.f2247a = j20;
                            return 1;
                        }
                        q qVar = lVar3.f4705a;
                        if (qVar.f4745g == 1) {
                            j21 += 8;
                            i28 -= 8;
                        }
                        lVar.q((int) j21);
                        int i29 = qVar.j;
                        w wVar = lVar3.f4708d;
                        if (i29 == 0) {
                            if ("audio/ac4".equals(qVar.f4744f.f283C)) {
                                if (this.f4723o == 0) {
                                    AbstractC0096b.c(i28, c0095a);
                                    i7 = 7;
                                    vVar.c(7, c0095a);
                                    this.f4723o += 7;
                                } else {
                                    i7 = 7;
                                }
                                i28 += i7;
                            } else if (wVar != null) {
                                wVar.c(lVar);
                            }
                            while (true) {
                                int i30 = this.f4723o;
                                if (i30 >= i28) {
                                    break;
                                }
                                int d7 = vVar.d(lVar, i28 - i30, false);
                                this.f4722n += d7;
                                this.f4723o += d7;
                                this.f4724p -= d7;
                            }
                        } else {
                            C0095a c0095a4 = this.f4711b;
                            byte[] bArr2 = (byte[]) c0095a4.f1465c;
                            ?? r8 = 0;
                            bArr2[0] = 0;
                            bArr2[1] = 0;
                            bArr2[2] = 0;
                            int i31 = 4 - i29;
                            while (this.f4723o < i28) {
                                int i32 = this.f4724p;
                                if (i32 == 0) {
                                    lVar.readFully(bArr2, i31, i29);
                                    this.f4722n += i29;
                                    c0095a4.D(r8);
                                    int g3 = c0095a4.g();
                                    if (g3 < 0) {
                                        throw C0045t0.a(null, "Invalid NAL length");
                                    }
                                    this.f4724p = g3;
                                    C0095a c0095a5 = this.f4710a;
                                    c0095a5.D(r8);
                                    vVar.c(4, c0095a5);
                                    this.f4723o += 4;
                                    i28 += i31;
                                } else {
                                    int d8 = vVar.d(lVar, i32, r8);
                                    this.f4722n += d8;
                                    this.f4723o += d8;
                                    this.f4724p -= d8;
                                }
                                r8 = 0;
                            }
                        }
                        int i33 = i28;
                        long j22 = tVar2.f4775f[i27];
                        int i34 = tVar2.f4776g[i27];
                        if (wVar != null) {
                            wVar.b(vVar, j22, i34, i33, 0, null);
                            if (i27 + 1 == tVar2.f4771b) {
                                wVar.a(vVar, null);
                            }
                        } else {
                            vVar.e(j22, i34, i33, 0, null);
                        }
                        lVar3.f4709e++;
                        this.f4721m = -1;
                        this.f4722n = 0;
                        this.f4723o = 0;
                        this.f4724p = 0;
                        return 0;
                    }
                    if (i17 != i13) {
                        throw new IllegalStateException();
                    }
                    ArrayList arrayList = this.f4716g;
                    o oVar = this.f4715f;
                    int i35 = oVar.f4736b;
                    if (i35 != 0) {
                        if (i35 != z9) {
                            ArrayList arrayList2 = oVar.f4735a;
                            short s7 = 2192;
                            if (i35 == i15) {
                                long j23 = lVar.j();
                                int i36 = oVar.f4737c - 20;
                                C0095a c0095a6 = new C0095a(i36);
                                lVar.readFully((byte[]) c0095a6.f1465c, 0, i36);
                                int i37 = 0;
                                while (i37 < i36 / 12) {
                                    c0095a6.E(2);
                                    byte[] bArr3 = (byte[]) c0095a6.f1465c;
                                    int i38 = c0095a6.f1463a;
                                    int i39 = i38 + 1;
                                    c0095a6.f1463a = i39;
                                    int i40 = bArr3[i38] & 255;
                                    c0095a6.f1463a = i38 + 2;
                                    short s8 = (short) (((bArr3[i39] & 255) << 8) | i40);
                                    if (s8 != s7 && s8 != 2816) {
                                        if (s8 != 2817) {
                                            if (s8 != 2819 && s8 != 2820) {
                                                c0095a6.E(8);
                                                j = j23;
                                                i37++;
                                                j23 = j;
                                                s7 = 2192;
                                            }
                                            j = j23;
                                            arrayList2.add(new n((j23 - oVar.f4737c) - c0095a6.i(), c0095a6.i()));
                                            i37++;
                                            j23 = j;
                                            s7 = 2192;
                                        }
                                    }
                                    j = j23;
                                    arrayList2.add(new n((j23 - oVar.f4737c) - c0095a6.i(), c0095a6.i()));
                                    i37++;
                                    j23 = j;
                                    s7 = 2192;
                                }
                                if (arrayList2.isEmpty()) {
                                    yVar.f2247a = 0L;
                                } else {
                                    oVar.f4736b = 3;
                                    yVar.f2247a = ((n) arrayList2.get(0)).f4731a;
                                }
                            } else {
                                if (i35 != i13) {
                                    throw new IllegalStateException();
                                }
                                long z17 = lVar.z();
                                int j24 = (int) ((lVar.j() - lVar.z()) - oVar.f4737c);
                                C0095a c0095a7 = new C0095a(j24);
                                lVar.readFully((byte[]) c0095a7.f1465c, i14, j24);
                                int i41 = i14;
                                while (i41 < arrayList2.size()) {
                                    n nVar = (n) arrayList2.get(i41);
                                    c0095a7.D((int) (nVar.f4731a - z17));
                                    c0095a7.E(i16);
                                    int i42 = c0095a7.i();
                                    Charset charset = D3.f.f1719c;
                                    String r7 = c0095a7.r(i42, charset);
                                    switch (r7.hashCode()) {
                                        case -1711564334:
                                            if (r7.equals("SlowMotion_Data")) {
                                                i9 = 0;
                                                break;
                                            }
                                            i9 = -1;
                                            break;
                                        case -1332107749:
                                            if (r7.equals("Super_SlowMotion_Edit_Data")) {
                                                i9 = 1;
                                                break;
                                            }
                                            i9 = -1;
                                            break;
                                        case -1251387154:
                                            if (r7.equals("Super_SlowMotion_Data")) {
                                                i9 = 2;
                                                break;
                                            }
                                            i9 = -1;
                                            break;
                                        case -830665521:
                                            if (r7.equals("Super_SlowMotion_Deflickering_On")) {
                                                i9 = i13;
                                                break;
                                            }
                                            i9 = -1;
                                            break;
                                        case 1760745220:
                                            if (r7.equals("Super_SlowMotion_BGM")) {
                                                i9 = 4;
                                                break;
                                            }
                                            i9 = -1;
                                            break;
                                        default:
                                            i9 = -1;
                                            break;
                                    }
                                    switch (i9) {
                                        case 0:
                                            c3 = 2192;
                                            break;
                                        case 1:
                                            c3 = 2819;
                                            break;
                                        case 2:
                                            c3 = 2816;
                                            break;
                                        case 3:
                                            c3 = 2820;
                                            break;
                                        case 4:
                                            c3 = 2817;
                                            break;
                                        default:
                                            throw C0045t0.a(null, "Invalid SEF name");
                                    }
                                    int i43 = nVar.f4732b - (i42 + 8);
                                    if (c3 == 2192) {
                                        ArrayList arrayList3 = new ArrayList();
                                        List R6 = o.f4734e.R(c0095a7.r(i43, charset));
                                        for (int i44 = 0; i44 < R6.size(); i44++) {
                                            List R7 = o.f4733d.R((CharSequence) R6.get(i44));
                                            if (R7.size() != i13) {
                                                throw C0045t0.a(null, null);
                                            }
                                            try {
                                                arrayList3.add(new SlowMotionData.Segment(Long.parseLong((String) R7.get(0)), Long.parseLong((String) R7.get(1)), 1 << (Integer.parseInt((String) R7.get(2)) - 1)));
                                            } catch (NumberFormatException e7) {
                                                throw C0045t0.a(e7, null);
                                            }
                                        }
                                        arrayList.add(new SlowMotionData(arrayList3));
                                    } else if (c3 != 2816 && c3 != 2817 && c3 != 2819 && c3 != 2820) {
                                        throw new IllegalStateException();
                                    }
                                    i41++;
                                    i16 = 4;
                                }
                                yVar.f2247a = 0L;
                            }
                        } else {
                            C0095a c0095a8 = new C0095a(8);
                            lVar.readFully((byte[]) c0095a8.f1465c, 0, 8);
                            oVar.f4737c = c0095a8.i() + 8;
                            if (c0095a8.g() != 1397048916) {
                                yVar.f2247a = 0L;
                            } else {
                                yVar.f2247a = lVar.z() - (oVar.f4737c - 12);
                                oVar.f4736b = 2;
                            }
                        }
                        i8 = 1;
                    } else {
                        long j25 = lVar.j();
                        yVar.f2247a = (j25 == -1 || j25 < 8) ? 0L : j25 - 8;
                        i8 = 1;
                        oVar.f4736b = 1;
                    }
                    if (yVar.f2247a == 0) {
                        this.f4717h = 0;
                        this.f4719k = 0;
                    }
                    return i8;
                }
                long j26 = this.j - this.f4719k;
                long z18 = lVar.z() + j26;
                C0095a c0095a9 = this.f4720l;
                if (c0095a9 != null) {
                    lVar.readFully((byte[]) c0095a9.f1465c, this.f4719k, (int) j26);
                    if (this.f4718i == 1718909296) {
                        c0095a9.D(8);
                        int g7 = c0095a9.g();
                        int i45 = g7 != 1751476579 ? g7 != 1903435808 ? 0 : 1 : 2;
                        if (i45 == 0) {
                            c0095a9.E(4);
                            while (true) {
                                if (c0095a9.d() <= 0) {
                                    i45 = 0;
                                    break;
                                }
                                int g8 = c0095a9.g();
                                i45 = g8 != 1751476579 ? g8 != 1903435808 ? 0 : 1 : 2;
                                if (i45 != 0) {
                                    break;
                                }
                            }
                        }
                        this.f4730v = i45;
                    } else if (!arrayDeque.isEmpty()) {
                        ((a) arrayDeque.peek()).f4634d.add(new b(this.f4718i, c0095a9));
                    }
                } else if (j26 < 262144) {
                    lVar.q((int) j26);
                } else {
                    yVar.f2247a = lVar.z() + j26;
                    z4 = true;
                    j(z18);
                    if (z4) {
                        z7 = true;
                        i10 = 2;
                    } else {
                        i10 = 2;
                        if (this.f4717h != 2) {
                            return 1;
                        }
                        z7 = true;
                    }
                    z9 = z7;
                    i15 = i10;
                    i14 = 0;
                    i16 = 4;
                }
                z4 = false;
                j(z18);
                if (z4) {
                }
                z9 = z7;
                i15 = i10;
                i14 = 0;
                i16 = 4;
            }
        }
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        this.f4714e.clear();
        this.f4719k = 0;
        this.f4721m = -1;
        this.f4722n = 0;
        this.f4723o = 0;
        this.f4724p = 0;
        if (j == 0) {
            if (this.f4717h != 3) {
                this.f4717h = 0;
                this.f4719k = 0;
                return;
            } else {
                o oVar = this.f4715f;
                oVar.f4735a.clear();
                oVar.f4736b = 0;
                this.f4716g.clear();
                return;
            }
        }
        for (l lVar : this.f4726r) {
            t tVar = lVar.f4706b;
            int f7 = v2.t.f(tVar.f4775f, j3, false);
            while (true) {
                if (f7 < 0) {
                    f7 = -1;
                    break;
                } else if ((tVar.f4776g[f7] & 1) != 0) {
                    break;
                } else {
                    f7--;
                }
            }
            if (f7 == -1) {
                f7 = tVar.a(j3);
            }
            lVar.f4709e = f7;
            w wVar = lVar.f4708d;
            if (wVar != null) {
                wVar.f2577b = false;
                wVar.f2578c = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00df A[EDGE_INSN: B:70:0x00df->B:71:0x00df BREAK  A[LOOP:1: B:28:0x006c->B:59:0x00d7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    @Override // F1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final F1.r h(long j) {
        long j3;
        long j7;
        long j8;
        long j9;
        int i7;
        l[] lVarArr;
        boolean z4;
        int i8;
        int[] iArr;
        int i9;
        int a2;
        l[] lVarArr2 = this.f4726r;
        int length = lVarArr2.length;
        F1.t tVar = F1.t.f2569c;
        if (length == 0) {
            return new F1.r(tVar, tVar);
        }
        int i10 = this.f4728t;
        boolean z7 = false;
        int i11 = -1;
        if (i10 != -1) {
            t tVar2 = lVarArr2[i10].f4706b;
            long[] jArr = tVar2.f4775f;
            int f7 = v2.t.f(jArr, j, false);
            while (true) {
                if (f7 < 0) {
                    f7 = -1;
                    break;
                }
                if ((tVar2.f4776g[f7] & 1) != 0) {
                    break;
                }
                f7--;
            }
            if (f7 == -1) {
                f7 = tVar2.a(j);
            }
            if (f7 == -1) {
                return new F1.r(tVar, tVar);
            }
            j7 = jArr[f7];
            long[] jArr2 = tVar2.f4772c;
            j3 = jArr2[f7];
            if (j7 < j && f7 < tVar2.f4771b - 1 && (a2 = tVar2.a(j)) != -1 && a2 != f7) {
                j8 = jArr[a2];
                j9 = jArr2[a2];
                i7 = 0;
                long j10 = j3;
                while (true) {
                    lVarArr = this.f4726r;
                    if (i7 < lVarArr.length) {
                        break;
                    }
                    if (i7 != this.f4728t) {
                        t tVar3 = lVarArr[i7].f4706b;
                        long[] jArr3 = tVar3.f4775f;
                        int f8 = v2.t.f(jArr3, j7, z7);
                        while (true) {
                            iArr = tVar3.f4776g;
                            if (f8 < 0) {
                                i9 = i11;
                                break;
                            }
                            if ((iArr[f8] & 1) != 0) {
                                i9 = f8;
                                break;
                            }
                            f8--;
                        }
                        if (i9 == i11) {
                            i9 = tVar3.a(j7);
                        }
                        long[] jArr4 = tVar3.f4772c;
                        if (i9 != i11) {
                            j10 = Math.min(jArr4[i9], j10);
                        }
                        if (j8 != -9223372036854775807L) {
                            z4 = false;
                            int f9 = v2.t.f(jArr3, j8, false);
                            while (true) {
                                if (f9 < 0) {
                                    i8 = -1;
                                    f9 = -1;
                                    break;
                                }
                                if ((iArr[f9] & 1) != 0) {
                                    i8 = -1;
                                    break;
                                }
                                f9--;
                            }
                            if (f9 == i8) {
                                f9 = tVar3.a(j8);
                            }
                            if (f9 != i8) {
                                j9 = Math.min(jArr4[f9], j9);
                            }
                        } else {
                            i8 = -1;
                            z4 = false;
                        }
                    } else {
                        int i12 = i11;
                        z4 = z7;
                        i8 = i12;
                    }
                    i7++;
                    boolean z8 = z4;
                    i11 = i8;
                    z7 = z8;
                }
                F1.t tVar4 = new F1.t(j7, j10);
                return j8 != -9223372036854775807L ? new F1.r(tVar4, tVar4) : new F1.r(tVar4, new F1.t(j8, j9));
            }
        } else {
            j3 = Long.MAX_VALUE;
            j7 = j;
        }
        j8 = -9223372036854775807L;
        j9 = -1;
        i7 = 0;
        long j102 = j3;
        while (true) {
            lVarArr = this.f4726r;
            if (i7 < lVarArr.length) {
            }
            i7++;
            boolean z82 = z4;
            i11 = i8;
            z7 = z82;
        }
        F1.t tVar42 = new F1.t(j7, j102);
        return j8 != -9223372036854775807L ? new F1.r(tVar42, tVar42) : new F1.r(tVar42, new F1.t(j8, j9));
    }

    @Override // F1.s
    public final long i() {
        return this.f4729u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e0, code lost:
    
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e7, code lost:
    
        if (r8 != 1851878757) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e9, code lost:
    
        r3 = r10.p(r24 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f3, code lost:
    
        if (r8 != 1684108385) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f5, code lost:
    
        r12 = r24;
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f9, code lost:
    
        r10.E(r24 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0202, code lost:
    
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0204, code lost:
    
        if (r0 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0206, code lost:
    
        if (r3 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0209, code lost:
    
        if (r5 != (-1)) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0221, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0222, code lost:
    
        r10.D(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x020c, code lost:
    
        r10.D(r5);
        r10.E(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x021e, code lost:
    
        r5 = new com.google.android.exoplayer2.metadata.id3.InternalFrame(r0, r3, r10.p(r12 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0227, code lost:
    
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a5, code lost:
    
        android.util.Log.d("MetadataUtil", "Skipped unknown metadata entry: " + D1.a.c(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02b8, code lost:
    
        r10.D(r11);
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00c5, code lost:
    
        r0 = N1.k.f(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00c9, code lost:
    
        if (r0 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00cd, code lost:
    
        if (r0 > 192) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00cf, code lost:
    
        r0 = N1.k.f4704a[r0 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00d7, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00d9, code lost:
    
        r5 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame("TCON", null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00e0, code lost:
    
        android.util.Log.w("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00e6, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00d6, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00fc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02df, code lost:
    
        r10.D(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00bb, code lost:
    
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x022c, code lost:
    
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0233, code lost:
    
        if (r0 != 6516084) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0235, code lost:
    
        r5 = N1.k.a(r13, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x023d, code lost:
    
        if (r0 == 7233901) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0242, code lost:
    
        if (r0 != 7631467) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0249, code lost:
    
        if (r0 == 6516589) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x024e, code lost:
    
        if (r0 != 7828084) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0255, code lost:
    
        if (r0 != 6578553) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0257, code lost:
    
        r5 = N1.k.d(r13, r10, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0261, code lost:
    
        if (r0 != 4280916) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0263, code lost:
    
        r5 = N1.k.d(r13, r10, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x026d, code lost:
    
        if (r0 != 7630703) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x026f, code lost:
    
        r5 = N1.k.d(r13, r10, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0279, code lost:
    
        if (r0 != 6384738) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x027b, code lost:
    
        r5 = N1.k.d(r13, r10, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0285, code lost:
    
        if (r0 != 7108978) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0287, code lost:
    
        r5 = N1.k.d(r13, r10, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0291, code lost:
    
        if (r0 != 6776174) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0293, code lost:
    
        r5 = N1.k.d(r13, r10, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x029b, code lost:
    
        if (r0 != 6779504) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x029d, code lost:
    
        r5 = N1.k.d(r13, r10, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02bd, code lost:
    
        r5 = N1.k.d(r13, r10, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02c5, code lost:
    
        r5 = N1.k.d(r13, r10, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02e3, code lost:
    
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02ea, code lost:
    
        if (r2.isEmpty() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02ec, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02f3, code lost:
    
        r20 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02ee, code lost:
    
        r0 = new com.google.android.exoplayer2.metadata.Metadata(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r10.D(r3);
        r3 = r3 + r12;
        r10.E(r13);
        r2 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        r11 = r10.f1463a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (r11 >= r3) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        r11 = r10.g() + r11;
        r13 = r10.g();
        r8 = (r13 >> 24) & 255;
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        if (r8 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        if (r8 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        if (r13 != 1735291493) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f3, code lost:
    
        if (r13 != 1684632427) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f5, code lost:
    
        r5 = N1.k.c(r13, r10, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e7, code lost:
    
        r10.D(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ea, code lost:
    
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02cd, code lost:
    
        if (r5 == null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02cf, code lost:
    
        r2.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02d2, code lost:
    
        r3 = r20;
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        if (r13 != 1953655662) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        r5 = N1.k.c(r13, r10, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010e, code lost:
    
        if (r13 != 1953329263) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0110, code lost:
    
        r0 = N1.k.e(r13, "TBPM", r10, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0118, code lost:
    
        r10.D(r11);
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
    
        if (r13 != 1668311404) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0122, code lost:
    
        r5 = N1.k.e(r13, "TCMP", r10, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012d, code lost:
    
        if (r13 != 1668249202) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012f, code lost:
    
        r5 = N1.k.b(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0137, code lost:
    
        if (r13 != 1631670868) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0139, code lost:
    
        r5 = N1.k.d(r13, r10, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
    
        if (r13 != 1936682605) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0145, code lost:
    
        r5 = N1.k.d(r13, r10, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014f, code lost:
    
        if (r13 != 1936679276) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0151, code lost:
    
        r5 = N1.k.d(r13, r10, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015b, code lost:
    
        if (r13 != 1936679282) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015d, code lost:
    
        r5 = N1.k.d(r13, r10, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0167, code lost:
    
        if (r13 != 1936679265) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0169, code lost:
    
        r5 = N1.k.d(r13, r10, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0174, code lost:
    
        if (r13 != 1936679791) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0176, code lost:
    
        r5 = N1.k.d(r13, r10, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0181, code lost:
    
        if (r13 != 1920233063) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0183, code lost:
    
        r5 = N1.k.e(r13, "ITUNESADVISORY", r10, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018f, code lost:
    
        if (r13 != 1885823344) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0191, code lost:
    
        r0 = N1.k.e(r13, "ITUNESGAPLESS", r10, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019e, code lost:
    
        if (r13 != 1936683886) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a0, code lost:
    
        r5 = N1.k.d(r13, r10, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ab, code lost:
    
        if (r13 != 1953919848) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ad, code lost:
    
        r5 = N1.k.d(r13, r10, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b8, code lost:
    
        if (r13 != 757935405) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ba, code lost:
    
        r0 = null;
        r3 = null;
        r5 = -1;
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01be, code lost:
    
        r13 = r10.f1463a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c0, code lost:
    
        if (r13 >= r11) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c2, code lost:
    
        r24 = r10.g();
        r8 = r10.g();
        r10.E(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d3, code lost:
    
        if (r8 != 1835360622) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d5, code lost:
    
        r0 = r10.p(r24 - 12);
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01fe, code lost:
    
        r6 = r27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05da A[EDGE_INSN: B:304:0x05da->B:305:0x05da BREAK  A[LOOP:10: B:294:0x05a4->B:300:0x05d4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0617 A[EDGE_INSN: B:335:0x0617->B:336:0x0617 BREAK  A[LOOP:9: B:259:0x04d2->B:265:0x0603], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0639 A[LOOP:12: B:337:0x0636->B:339:0x0639, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0655  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(long j) {
        int i7;
        ArrayDeque arrayDeque;
        Metadata metadata;
        Metadata metadata2;
        ArrayList arrayList;
        Metadata metadata3;
        int i8;
        ArrayList e7;
        int size;
        long j3;
        int i9;
        long j7;
        l[] lVarArr;
        int i10;
        int i11;
        ArrayList arrayList2;
        int i12;
        int i13;
        Metadata metadata4;
        int i14;
        Metadata.Entry[] entryArr;
        Metadata metadata5;
        Metadata metadata6;
        int i15;
        ArrayList arrayList3;
        Metadata metadata7;
        Metadata metadata8;
        int i16;
        int i17;
        ArrayList arrayList4;
        int i18;
        String[] strArr;
        MdtaMetadataEntry mdtaMetadataEntry;
        ArrayDeque arrayDeque2;
        int i19 = 4;
        int i20 = 1;
        while (true) {
            ArrayDeque arrayDeque3 = this.f4714e;
            if (arrayDeque3.isEmpty() || ((a) arrayDeque3.peek()).f4633c != j) {
                break;
            }
            a aVar = (a) arrayDeque3.pop();
            if (aVar.f1675b == 1836019574) {
                ArrayList arrayList5 = new ArrayList();
                boolean z4 = this.f4730v == i20 ? i20 : 0;
                F1.p pVar = new F1.p();
                b y4 = aVar.y(1969517665);
                int i21 = 1751411826;
                int i22 = 1768715124;
                int i23 = 1835365473;
                int i24 = 8;
                if (y4 != null) {
                    byte[] bArr = f.f4651a;
                    C0095a c0095a = y4.f4636c;
                    c0095a.D(8);
                    Metadata metadata9 = null;
                    Metadata metadata10 = null;
                    while (c0095a.d() >= i24) {
                        int i25 = c0095a.f1463a;
                        int g3 = c0095a.g();
                        int g7 = c0095a.g();
                        if (g7 == i23) {
                            c0095a.D(i25);
                            int i26 = i25 + g3;
                            c0095a.E(i24);
                            int i27 = c0095a.f1463a;
                            c0095a.E(i19);
                            if (c0095a.g() != i21) {
                                i27 += i19;
                            }
                            c0095a.D(i27);
                            while (true) {
                                int i28 = c0095a.f1463a;
                                if (i28 >= i26) {
                                    arrayDeque2 = arrayDeque3;
                                    metadata9 = null;
                                    break;
                                }
                                int g8 = c0095a.g();
                                if (c0095a.g() == i22) {
                                    break;
                                }
                                c0095a.D(i28 + g8);
                                arrayDeque3 = arrayDeque3;
                                i22 = 1768715124;
                                i24 = 8;
                            }
                        } else {
                            arrayDeque2 = arrayDeque3;
                            if (g7 == 1936553057) {
                                c0095a.D(i25);
                                int i29 = i25 + g3;
                                c0095a.E(12);
                                while (true) {
                                    int i30 = c0095a.f1463a;
                                    if (i30 >= i29) {
                                        break;
                                    }
                                    int g9 = c0095a.g();
                                    if (c0095a.g() != 1935766900) {
                                        c0095a.D(i30 + g9);
                                    } else if (g9 >= 14) {
                                        c0095a.E(5);
                                        int t7 = c0095a.t();
                                        if (t7 == 12 || t7 == 13) {
                                            float f7 = t7 == 12 ? 240.0f : 120.0f;
                                            c0095a.E(1);
                                            metadata10 = new Metadata(new SmtaMetadataEntry(f7, c0095a.t()));
                                        }
                                    }
                                }
                                metadata10 = null;
                            }
                        }
                        c0095a.D(i25 + g3);
                        arrayDeque3 = arrayDeque2;
                        i19 = 4;
                        i23 = 1835365473;
                        i22 = 1768715124;
                        i21 = 1751411826;
                        i24 = 8;
                    }
                    arrayDeque = arrayDeque3;
                    Pair create = Pair.create(metadata9, metadata10);
                    metadata2 = (Metadata) create.first;
                    metadata = (Metadata) create.second;
                    if (metadata2 != null) {
                        pVar.b(metadata2);
                    }
                    i23 = 1835365473;
                } else {
                    arrayDeque = arrayDeque3;
                    metadata = null;
                    metadata2 = null;
                }
                a t8 = aVar.t(i23);
                if (t8 != null) {
                    byte[] bArr2 = f.f4651a;
                    b y5 = t8.y(1751411826);
                    b y7 = t8.y(1801812339);
                    b y8 = t8.y(1768715124);
                    if (y5 != null && y7 != null && y8 != null) {
                        C0095a c0095a2 = y5.f4636c;
                        c0095a2.D(16);
                        if (c0095a2.g() == 1835299937) {
                            C0095a c0095a3 = y7.f4636c;
                            c0095a3.D(12);
                            int g10 = c0095a3.g();
                            String[] strArr2 = new String[g10];
                            for (int i31 = 0; i31 < g10; i31++) {
                                int g11 = c0095a3.g();
                                c0095a3.E(4);
                                strArr2[i31] = c0095a3.r(g11 - 8, D3.f.f1719c);
                            }
                            C0095a c0095a4 = y8.f4636c;
                            c0095a4.D(8);
                            ArrayList arrayList6 = new ArrayList();
                            for (int i32 = 8; c0095a4.d() > i32; i32 = 8) {
                                int i33 = c0095a4.f1463a;
                                int g12 = c0095a4.g();
                                int g13 = c0095a4.g() - 1;
                                if (g13 < 0 || g13 >= g10) {
                                    arrayList4 = arrayList5;
                                    i18 = g10;
                                    strArr = strArr2;
                                    AbstractC1663a.j(g13, "Skipped metadata with unknown key index: ", "AtomParsers");
                                } else {
                                    String str = strArr2[g13];
                                    int i34 = i33 + g12;
                                    while (true) {
                                        int i35 = c0095a4.f1463a;
                                        if (i35 >= i34) {
                                            arrayList4 = arrayList5;
                                            i18 = g10;
                                            strArr = strArr2;
                                            mdtaMetadataEntry = null;
                                            break;
                                        }
                                        int g14 = c0095a4.g();
                                        int i36 = i34;
                                        i18 = g10;
                                        if (c0095a4.g() == 1684108385) {
                                            int g15 = c0095a4.g();
                                            int g16 = c0095a4.g();
                                            int i37 = g14 - 16;
                                            strArr = strArr2;
                                            byte[] bArr3 = new byte[i37];
                                            arrayList4 = arrayList5;
                                            c0095a4.f(bArr3, 0, i37);
                                            mdtaMetadataEntry = new MdtaMetadataEntry(str, bArr3, g16, g15);
                                            break;
                                        }
                                        c0095a4.D(i35 + g14);
                                        i34 = i36;
                                        g10 = i18;
                                    }
                                    if (mdtaMetadataEntry != null) {
                                        arrayList6.add(mdtaMetadataEntry);
                                    }
                                }
                                c0095a4.D(i33 + g12);
                                g10 = i18;
                                strArr2 = strArr;
                                arrayList5 = arrayList4;
                            }
                            arrayList = arrayList5;
                            if (!arrayList6.isEmpty()) {
                                metadata3 = new Metadata(arrayList6);
                                i8 = -1;
                                e7 = f.e(aVar, pVar, -9223372036854775807L, null, false, z4, new H5.k(10));
                                size = e7.size();
                                j3 = -9223372036854775807L;
                                int i38 = -1;
                                long j8 = -9223372036854775807L;
                                i9 = 0;
                                while (true) {
                                    j7 = 0;
                                    if (i9 >= size) {
                                        break;
                                    }
                                    t tVar = (t) e7.get(i9);
                                    if (tVar.f4771b == 0) {
                                        metadata5 = metadata;
                                        metadata6 = metadata2;
                                        arrayList2 = e7;
                                        i12 = size;
                                        i15 = i8;
                                        arrayList3 = arrayList;
                                    } else {
                                        q qVar = tVar.f4770a;
                                        arrayList2 = e7;
                                        i12 = size;
                                        long j9 = qVar.f4743e;
                                        if (j9 == j3) {
                                            j9 = tVar.f4777h;
                                        }
                                        long max = Math.max(j8, j9);
                                        F1.m mVar = this.f4725q;
                                        int i39 = qVar.f4740b;
                                        l lVar = new l(qVar, tVar, mVar.r(i9, i39));
                                        X x4 = qVar.f4744f;
                                        boolean equals = "audio/true-hd".equals(x4.f283C);
                                        int i40 = tVar.f4774e;
                                        int i41 = equals ? i40 * 16 : i40 + 30;
                                        Format$Builder a2 = x4.a();
                                        a2.f10538l = i41;
                                        if (i39 == 2 && j9 > 0) {
                                            int i42 = tVar.f4771b;
                                            if (i42 > 1) {
                                                a2.f10544r = i42 / (j9 / 1000000.0f);
                                            } else {
                                                i13 = 1;
                                                if (i39 == i13 && (i16 = pVar.f2561a) != -1 && (i17 = pVar.f2562b) != -1) {
                                                    a2.f10524A = i16;
                                                    a2.f10525B = i17;
                                                }
                                                ArrayList arrayList7 = this.f4716g;
                                                Metadata[] metadataArr = {metadata, !arrayList7.isEmpty() ? null : new Metadata(arrayList7)};
                                                metadata4 = new Metadata(new Metadata.Entry[0]);
                                                if (i39 != 1) {
                                                    if (metadata2 != null) {
                                                        metadata4 = metadata2;
                                                    }
                                                } else if (i39 == 2 && metadata3 != null) {
                                                    int i43 = 0;
                                                    while (true) {
                                                        Metadata.Entry[] entryArr2 = metadata3.f10562a;
                                                        if (i43 >= entryArr2.length) {
                                                            break;
                                                        }
                                                        Metadata.Entry entry = entryArr2[i43];
                                                        if (entry instanceof MdtaMetadataEntry) {
                                                            MdtaMetadataEntry mdtaMetadataEntry2 = (MdtaMetadataEntry) entry;
                                                            if ("com.android.capture.fps".equals(mdtaMetadataEntry2.f10640a)) {
                                                                metadata4 = new Metadata(mdtaMetadataEntry2);
                                                                break;
                                                            }
                                                        }
                                                        i43++;
                                                    }
                                                }
                                                i14 = 0;
                                                while (true) {
                                                    entryArr = metadata4.f10562a;
                                                    if (i14 < 2) {
                                                        break;
                                                    }
                                                    Metadata metadata11 = metadataArr[i14];
                                                    if (metadata11 != null) {
                                                        Metadata.Entry[] entryArr3 = metadata11.f10562a;
                                                        if (entryArr3.length != 0) {
                                                            int i44 = v2.t.f17153a;
                                                            metadata7 = metadata;
                                                            Object[] copyOf = Arrays.copyOf(entryArr, entryArr.length + entryArr3.length);
                                                            metadata8 = metadata2;
                                                            System.arraycopy(entryArr3, 0, copyOf, entryArr.length, entryArr3.length);
                                                            metadata4 = new Metadata((Metadata.Entry[]) copyOf);
                                                            i14++;
                                                            metadata = metadata7;
                                                            metadata2 = metadata8;
                                                        }
                                                    }
                                                    metadata7 = metadata;
                                                    metadata8 = metadata2;
                                                    i14++;
                                                    metadata = metadata7;
                                                    metadata2 = metadata8;
                                                }
                                                metadata5 = metadata;
                                                metadata6 = metadata2;
                                                if (entryArr.length > 0) {
                                                    a2.f10536i = metadata4;
                                                }
                                                lVar.f4707c.a(new X(a2));
                                                if (i39 != 2) {
                                                    i15 = -1;
                                                    if (i38 == -1) {
                                                        i38 = arrayList.size();
                                                    }
                                                } else {
                                                    i15 = -1;
                                                }
                                                arrayList3 = arrayList;
                                                arrayList3.add(lVar);
                                                j8 = max;
                                            }
                                        }
                                        i13 = 1;
                                        if (i39 == i13) {
                                            a2.f10524A = i16;
                                            a2.f10525B = i17;
                                        }
                                        ArrayList arrayList72 = this.f4716g;
                                        Metadata[] metadataArr2 = {metadata, !arrayList72.isEmpty() ? null : new Metadata(arrayList72)};
                                        metadata4 = new Metadata(new Metadata.Entry[0]);
                                        if (i39 != 1) {
                                        }
                                        i14 = 0;
                                        while (true) {
                                            entryArr = metadata4.f10562a;
                                            if (i14 < 2) {
                                            }
                                            i14++;
                                            metadata = metadata7;
                                            metadata2 = metadata8;
                                        }
                                        metadata5 = metadata;
                                        metadata6 = metadata2;
                                        if (entryArr.length > 0) {
                                        }
                                        lVar.f4707c.a(new X(a2));
                                        if (i39 != 2) {
                                        }
                                        arrayList3 = arrayList;
                                        arrayList3.add(lVar);
                                        j8 = max;
                                    }
                                    i9++;
                                    i8 = i15;
                                    arrayList = arrayList3;
                                    e7 = arrayList2;
                                    size = i12;
                                    metadata = metadata5;
                                    metadata2 = metadata6;
                                    j3 = -9223372036854775807L;
                                }
                                int i45 = i8;
                                this.f4728t = i38;
                                this.f4729u = j8;
                                lVarArr = (l[]) arrayList.toArray(new l[0]);
                                this.f4726r = lVarArr;
                                long[][] jArr = new long[lVarArr.length][];
                                int[] iArr = new int[lVarArr.length];
                                long[] jArr2 = new long[lVarArr.length];
                                boolean[] zArr = new boolean[lVarArr.length];
                                for (i10 = 0; i10 < lVarArr.length; i10++) {
                                    jArr[i10] = new long[lVarArr[i10].f4706b.f4771b];
                                    jArr2[i10] = lVarArr[i10].f4706b.f4775f[0];
                                }
                                i11 = 0;
                                while (i11 < lVarArr.length) {
                                    int i46 = i45;
                                    long j10 = Long.MAX_VALUE;
                                    for (int i47 = 0; i47 < lVarArr.length; i47++) {
                                        if (!zArr[i47]) {
                                            long j11 = jArr2[i47];
                                            if (j11 <= j10) {
                                                i46 = i47;
                                                j10 = j11;
                                            }
                                        }
                                    }
                                    int i48 = iArr[i46];
                                    long[] jArr3 = jArr[i46];
                                    jArr3[i48] = j7;
                                    t tVar2 = lVarArr[i46].f4706b;
                                    j7 += tVar2.f4773d[i48];
                                    int i49 = i48 + 1;
                                    iArr[i46] = i49;
                                    if (i49 < jArr3.length) {
                                        jArr2[i46] = tVar2.f4775f[i49];
                                    } else {
                                        zArr[i46] = true;
                                        i11++;
                                    }
                                }
                                i7 = 1;
                                this.f4727s = jArr;
                                this.f4725q.n();
                                this.f4725q.m(this);
                                arrayDeque.clear();
                                this.f4717h = 2;
                            }
                            metadata3 = null;
                            i8 = -1;
                            e7 = f.e(aVar, pVar, -9223372036854775807L, null, false, z4, new H5.k(10));
                            size = e7.size();
                            j3 = -9223372036854775807L;
                            int i382 = -1;
                            long j82 = -9223372036854775807L;
                            i9 = 0;
                            while (true) {
                                j7 = 0;
                                if (i9 >= size) {
                                }
                                i9++;
                                i8 = i15;
                                arrayList = arrayList3;
                                e7 = arrayList2;
                                size = i12;
                                metadata = metadata5;
                                metadata2 = metadata6;
                                j3 = -9223372036854775807L;
                            }
                            int i452 = i8;
                            this.f4728t = i382;
                            this.f4729u = j82;
                            lVarArr = (l[]) arrayList.toArray(new l[0]);
                            this.f4726r = lVarArr;
                            long[][] jArr4 = new long[lVarArr.length][];
                            int[] iArr2 = new int[lVarArr.length];
                            long[] jArr22 = new long[lVarArr.length];
                            boolean[] zArr2 = new boolean[lVarArr.length];
                            while (i10 < lVarArr.length) {
                            }
                            i11 = 0;
                            while (i11 < lVarArr.length) {
                            }
                            i7 = 1;
                            this.f4727s = jArr4;
                            this.f4725q.n();
                            this.f4725q.m(this);
                            arrayDeque.clear();
                            this.f4717h = 2;
                        }
                    }
                }
                arrayList = arrayList5;
                metadata3 = null;
                i8 = -1;
                e7 = f.e(aVar, pVar, -9223372036854775807L, null, false, z4, new H5.k(10));
                size = e7.size();
                j3 = -9223372036854775807L;
                int i3822 = -1;
                long j822 = -9223372036854775807L;
                i9 = 0;
                while (true) {
                    j7 = 0;
                    if (i9 >= size) {
                    }
                    i9++;
                    i8 = i15;
                    arrayList = arrayList3;
                    e7 = arrayList2;
                    size = i12;
                    metadata = metadata5;
                    metadata2 = metadata6;
                    j3 = -9223372036854775807L;
                }
                int i4522 = i8;
                this.f4728t = i3822;
                this.f4729u = j822;
                lVarArr = (l[]) arrayList.toArray(new l[0]);
                this.f4726r = lVarArr;
                long[][] jArr42 = new long[lVarArr.length][];
                int[] iArr22 = new int[lVarArr.length];
                long[] jArr222 = new long[lVarArr.length];
                boolean[] zArr22 = new boolean[lVarArr.length];
                while (i10 < lVarArr.length) {
                }
                i11 = 0;
                while (i11 < lVarArr.length) {
                }
                i7 = 1;
                this.f4727s = jArr42;
                this.f4725q.n();
                this.f4725q.m(this);
                arrayDeque.clear();
                this.f4717h = 2;
            } else {
                i7 = i20;
                if (!arrayDeque3.isEmpty()) {
                    ((a) arrayDeque3.peek()).f4635e.add(aVar);
                }
            }
            i20 = i7;
            i19 = 4;
        }
        if (this.f4717h != 2) {
            this.f4717h = 0;
            this.f4719k = 0;
        }
    }

    @Override // F1.k
    public final void release() {
    }
}
