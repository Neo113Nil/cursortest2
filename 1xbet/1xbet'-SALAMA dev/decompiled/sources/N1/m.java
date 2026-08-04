package N1;

import A1.C0045t0;
import A1.X;
import C1.AbstractC0096b;
import C1.C0095a;
import E4.y;
import F1.v;
import F1.w;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
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

/* JADX INFO: loaded from: classes.dex */
public final class m implements F1.k, F1.s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4718i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4719k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0095a f4720l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4722n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4723o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4724p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long[][] f4727s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4728t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f4729u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4730v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4717h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f4715f = new o();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f4716g = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0095a f4713d = new C0095a(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f4714e = new ArrayDeque();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0095a f4710a = new C0095a(p151v2.a.f17092c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0095a f4711b = new C0095a(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0095a f4712c = new C0095a(4, false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4721m = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public F1.m f4725q = F1.m.f2545g;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
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
    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:233:0x0482  */
    /* JADX WARN: Code duplicated, block: B:237:0x0489  */
    /* JADX WARN: Code duplicated, block: B:238:0x048b  */
    /* JADX WARN: Code duplicated, block: B:346:0x0487 A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // F1.k
    public final int f(F1.l lVar, y yVar) throws C0045t0 {
        int i7;
        int i8;
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
                long j = this.j;
                if (j == 1) {
                    lVar.readFully((byte[]) c0095a2.f1465c, 8, 8);
                    this.f4719k += 8;
                    this.j = c0095a2.x();
                } else if (j == 0) {
                    long j3 = lVar.j();
                    if (j3 == -1 && (aVar = (a) arrayDeque.peek()) != null) {
                        j3 = aVar.f4633c;
                    }
                    if (j3 != -1) {
                        this.j = (j3 - lVar.z()) + ((long) this.f4719k);
                    }
                }
                long j7 = this.j;
                int i19 = this.f4719k;
                if (j7 < i19) {
                    throw C0045t0.c("Atom size less than header length (unsupported).");
                }
                int i20 = this.f4718i;
                if (i20 == 1836019574 || i20 == 1953653099 || i20 == 1835297121 || i20 == 1835626086 || i20 == 1937007212 || i20 == 1701082227 || i20 == 1835365473) {
                    z8 = true;
                    long jZ = lVar.z();
                    long j8 = this.j;
                    long j9 = this.f4719k;
                    long j10 = (jZ + j8) - j9;
                    if (j8 == j9 || this.f4718i != 1835365473) {
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
                    arrayDeque.push(new a(this.f4718i, j10));
                    if (this.j == this.f4719k) {
                        j(j10);
                        i12 = 0;
                    } else {
                        i12 = 0;
                        this.f4717h = 0;
                        this.f4719k = 0;
                    }
                } else {
                    if (i20 == 1835296868 || i20 == 1836476516 || i20 == 1751411826 || i20 == 1937011556 || i20 == 1937011827 || i20 == 1937011571 || i20 == 1668576371 || i20 == 1701606260 || i20 == 1937011555 || i20 == 1937011578 || i20 == 1937013298 || i20 == 1937007471 || i20 == 1668232756 || i20 == 1953196132 || i20 == 1718909296 || i20 == 1969517665 || i20 == 1801812339 || i20 == 1768715124) {
                        p151v2.a.h(i19 == 8);
                        p151v2.a.h(this.j <= 2147483647L);
                        C0095a c0095a3 = new C0095a((int) this.j);
                        System.arraycopy((byte[]) c0095a2.f1465c, 0, (byte[]) c0095a3.f1465c, 0, 8);
                        this.f4720l = c0095a3;
                        z8 = true;
                        this.f4717h = 1;
                    } else {
                        long jZ2 = lVar.z();
                        long j11 = this.f4719k;
                        long j12 = jZ2 - j11;
                        if (this.f4718i == 1836086884) {
                            new MotionPhotoMetadata(0L, j12, -9223372036854775807L, j12 + j11, this.j - j11);
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
                        long jZ3 = lVar.z();
                        if (this.f4721m == -1) {
                            int i22 = -1;
                            int i23 = -1;
                            boolean z11 = true;
                            boolean z12 = true;
                            int i24 = 0;
                            long j13 = Long.MAX_VALUE;
                            long j14 = Long.MAX_VALUE;
                            long j15 = Long.MAX_VALUE;
                            while (true) {
                                l[] lVarArr = this.f4726r;
                                if (i24 >= lVarArr.length) {
                                    break;
                                }
                                l lVar2 = lVarArr[i24];
                                int i25 = lVar2.f4709e;
                                t tVar = lVar2.f4706b;
                                if (i25 != tVar.f4771b) {
                                    long j16 = tVar.f4772c[i25];
                                    long[][] jArr = this.f4727s;
                                    int i26 = p151v2.t.f17159a;
                                    long j17 = jArr[i24][i25];
                                    long j18 = j16 - jZ3;
                                    boolean z13 = j18 < 0 || j18 >= 262144;
                                    if ((!z13 && z12) || (z13 == z12 && j18 < j15)) {
                                        z12 = z13;
                                        j14 = j17;
                                        i23 = i24;
                                        j15 = j18;
                                    }
                                    if (j17 < j13) {
                                        z11 = z13;
                                        j13 = j17;
                                        i22 = i24;
                                    }
                                }
                                i24++;
                            }
                            if (j13 == Long.MAX_VALUE || !z11 || j14 < j13 + SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE) {
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
                        long j19 = tVar2.f4772c[i27];
                        int i28 = tVar2.f4773d[i27];
                        long j20 = (j19 - jZ3) + ((long) this.f4722n);
                        if (j20 < 0 || j20 >= 262144) {
                            yVar.f2247a = j19;
                            return 1;
                        }
                        q qVar = lVar3.f4705a;
                        if (qVar.f4745g == 1) {
                            j20 += 8;
                            i28 -= 8;
                        }
                        lVar.q((int) j20);
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
                                int iD = vVar.d(lVar, i28 - i30, false);
                                this.f4722n += iD;
                                this.f4723o += iD;
                                this.f4724p -= iD;
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
                                    int iG = c0095a4.g();
                                    if (iG < 0) {
                                        throw C0045t0.a(null, "Invalid NAL length");
                                    }
                                    this.f4724p = iG;
                                    C0095a c0095a5 = this.f4710a;
                                    c0095a5.D(r8);
                                    vVar.c(4, c0095a5);
                                    this.f4723o += 4;
                                    i28 += i31;
                                } else {
                                    int iD2 = vVar.d(lVar, i32, r8);
                                    this.f4722n += iD2;
                                    this.f4723o += iD2;
                                    this.f4724p -= iD2;
                                }
                                r8 = 0;
                            }
                        }
                        int i33 = i28;
                        long j21 = tVar2.f4775f[i27];
                        int i34 = tVar2.f4776g[i27];
                        if (wVar != null) {
                            wVar.b(vVar, j21, i34, i33, 0, null);
                            if (i27 + 1 == tVar2.f4771b) {
                                wVar.a(vVar, null);
                            }
                        } else {
                            vVar.e(j21, i34, i33, 0, null);
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
                                long j22 = lVar.j();
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
                                            }
                                            i37++;
                                            j22 = j22;
                                            s7 = 2192;
                                        }
                                        arrayList2.add(new n((j22 - ((long) oVar.f4737c)) - ((long) c0095a6.i()), c0095a6.i()));
                                        i37++;
                                        j22 = j22;
                                        s7 = 2192;
                                    }
                                    arrayList2.add(new n((j22 - ((long) oVar.f4737c)) - ((long) c0095a6.i()), c0095a6.i()));
                                    i37++;
                                    j22 = j22;
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
                                long jZ4 = lVar.z();
                                int iJ = (int) ((lVar.j() - lVar.z()) - ((long) oVar.f4737c));
                                C0095a c0095a7 = new C0095a(iJ);
                                lVar.readFully((byte[]) c0095a7.f1465c, i14, iJ);
                                int i41 = i14;
                                while (i41 < arrayList2.size()) {
                                    n nVar = (n) arrayList2.get(i41);
                                    c0095a7.D((int) (nVar.f4731a - jZ4));
                                    c0095a7.E(i16);
                                    int i42 = c0095a7.i();
                                    Charset charset = D3.f.f1719c;
                                    String strR = c0095a7.r(i42, charset);
                                    switch (strR.hashCode()) {
                                        case -1711564334:
                                            if (strR.equals("SlowMotion_Data")) {
                                                i9 = 0;
                                            } else {
                                                i9 = -1;
                                            }
                                            break;
                                        case -1332107749:
                                            if (strR.equals("Super_SlowMotion_Edit_Data")) {
                                                i9 = 1;
                                            } else {
                                                i9 = -1;
                                            }
                                            break;
                                        case -1251387154:
                                            if (strR.equals("Super_SlowMotion_Data")) {
                                                i9 = 2;
                                            } else {
                                                i9 = -1;
                                            }
                                            break;
                                        case -830665521:
                                            if (strR.equals("Super_SlowMotion_Deflickering_On")) {
                                                i9 = i13;
                                            } else {
                                                i9 = -1;
                                            }
                                            break;
                                        case 1760745220:
                                            if (strR.equals("Super_SlowMotion_BGM")) {
                                                i9 = 4;
                                            } else {
                                                i9 = -1;
                                            }
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
                                        List listR = o.f4734e.R(c0095a7.r(i43, charset));
                                        for (int i44 = 0; i44 < listR.size(); i44++) {
                                            List listR2 = o.f4733d.R((CharSequence) listR.get(i44));
                                            if (listR2.size() != i13) {
                                                throw C0045t0.a(null, null);
                                            }
                                            try {
                                                arrayList3.add(new SlowMotionData.Segment(Long.parseLong((String) listR2.get(0)), Long.parseLong((String) listR2.get(1)), 1 << (Integer.parseInt((String) listR2.get(2)) - 1)));
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
                                yVar.f2247a = lVar.z() - ((long) (oVar.f4737c - 12));
                                oVar.f4736b = 2;
                            }
                        }
                        i8 = 1;
                    } else {
                        long j23 = lVar.j();
                        yVar.f2247a = (j23 == -1 || j23 < 8) ? 0L : j23 - 8;
                        i8 = 1;
                        oVar.f4736b = 1;
                    }
                    if (yVar.f2247a == 0) {
                        this.f4717h = 0;
                        this.f4719k = 0;
                    }
                    return i8;
                }
                long j24 = this.j - ((long) this.f4719k);
                long jZ5 = lVar.z() + j24;
                C0095a c0095a9 = this.f4720l;
                if (c0095a9 != null) {
                    lVar.readFully((byte[]) c0095a9.f1465c, this.f4719k, (int) j24);
                    if (this.f4718i == 1718909296) {
                        c0095a9.D(8);
                        int iG2 = c0095a9.g();
                        int i45 = iG2 != 1751476579 ? iG2 != 1903435808 ? 0 : 1 : 2;
                        if (i45 == 0) {
                            c0095a9.E(4);
                            do {
                                if (c0095a9.d() <= 0) {
                                    i45 = 0;
                                    break;
                                }
                                int iG3 = c0095a9.g();
                                i45 = iG3 != 1751476579 ? iG3 != 1903435808 ? 0 : 1 : 2;
                            } while (i45 == 0);
                        }
                        this.f4730v = i45;
                    } else if (!arrayDeque.isEmpty()) {
                        ((a) arrayDeque.peek()).f4634d.add(new b(this.f4718i, c0095a9));
                    }
                } else {
                    if (j24 < 262144) {
                        lVar.q((int) j24);
                    } else {
                        yVar.f2247a = lVar.z() + j24;
                        z4 = true;
                    }
                    j(jZ5);
                    if (z4) {
                        i10 = 2;
                        if (this.f4717h != 2) {
                            return 1;
                        }
                        z7 = true;
                    } else {
                        z7 = true;
                        i10 = 2;
                    }
                    z9 = z7;
                    i15 = i10;
                    i14 = 0;
                    i16 = 4;
                }
                z4 = false;
                j(jZ5);
                if (z4) {
                    i10 = 2;
                    if (this.f4717h != 2) {
                        return 1;
                    }
                    z7 = true;
                } else {
                    z7 = true;
                    i10 = 2;
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
            int iF = p151v2.t.f(tVar.f4775f, j3, false);
            while (true) {
                if (iF < 0) {
                    iF = -1;
                    break;
                } else if ((tVar.f4776g[iF] & 1) != 0) {
                    break;
                } else {
                    iF--;
                }
            }
            if (iF == -1) {
                iF = tVar.a(j3);
            }
            lVar.f4709e = iF;
            w wVar = lVar.f4708d;
            if (wVar != null) {
                wVar.f2577b = false;
                wVar.f2578c = 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c A[LOOP:2: B:34:0x007f->B:39:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba A[LOOP:3: B:50:0x00b0->B:54:0x00ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df A[EDGE_INSN: B:72:0x00df->B:64:0x00df BREAK  A[LOOP:1: B:29:0x006c->B:63:0x00d7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00b8 A[SYNTHETIC] */
    @Override // F1.s
    public final F1.r h(long j) {
        long j3;
        long j7;
        long j8;
        long jMin;
        int i7;
        long jMin2;
        l[] lVarArr;
        F1.t tVar;
        F1.r rVar;
        boolean z4;
        int i8;
        t tVar2;
        long[] jArr;
        int iF;
        int[] iArr;
        int iA;
        long[] jArr2;
        int iF2;
        int iA2;
        l[] lVarArr2 = this.f4726r;
        int length = lVarArr2.length;
        F1.t tVar3 = F1.t.f2569c;
        if (length == 0) {
            return new F1.r(tVar3, tVar3);
        }
        int i9 = this.f4728t;
        boolean z7 = false;
        int i10 = -1;
        if (i9 != -1) {
            t tVar4 = lVarArr2[i9].f4706b;
            long[] jArr3 = tVar4.f4775f;
            int iF3 = p151v2.t.f(jArr3, j, false);
            while (true) {
                if (iF3 < 0) {
                    iF3 = -1;
                    break;
                }
                if ((tVar4.f4776g[iF3] & 1) != 0) {
                    break;
                }
                iF3--;
            }
            if (iF3 == -1) {
                iF3 = tVar4.a(j);
            }
            if (iF3 == -1) {
                return new F1.r(tVar3, tVar3);
            }
            j7 = jArr3[iF3];
            long[] jArr4 = tVar4.f4772c;
            j3 = jArr4[iF3];
            if (j7 < j && iF3 < tVar4.f4771b - 1 && (iA2 = tVar4.a(j)) != -1 && iA2 != iF3) {
                j8 = jArr3[iA2];
                jMin = jArr4[iA2];
            }
            i7 = 0;
            jMin2 = j3;
            while (true) {
                lVarArr = this.f4726r;
                if (i7 < lVarArr.length) {
                    break;
                }
                if (i7 != this.f4728t) {
                    tVar2 = lVarArr[i7].f4706b;
                    jArr = tVar2.f4775f;
                    iF = p151v2.t.f(jArr, j7, z7);
                    while (true) {
                        iArr = tVar2.f4776g;
                        if (iF >= 0) {
                            iA = i10;
                            break;
                        }
                        if ((iArr[iF] & 1) != 0) {
                            iA = iF;
                            break;
                        }
                        iF--;
                    }
                    if (iA == i10) {
                        iA = tVar2.a(j7);
                    }
                    jArr2 = tVar2.f4772c;
                    if (iA != i10) {
                        jMin2 = Math.min(jArr2[iA], jMin2);
                    }
                    if (j8 != -9223372036854775807L) {
                        z4 = false;
                        iF2 = p151v2.t.f(jArr, j8, false);
                        while (true) {
                            if (iF2 >= 0) {
                                i8 = -1;
                                iF2 = -1;
                                break;
                            }
                            if ((iArr[iF2] & 1) != 0) {
                                i8 = -1;
                                break;
                            }
                            iF2--;
                        }
                        if (iF2 == i8) {
                            iF2 = tVar2.a(j8);
                        }
                        if (iF2 == i8) {
                            jMin = Math.min(jArr2[iF2], jMin);
                        }
                    } else {
                        i8 = -1;
                        z4 = false;
                    }
                } else {
                    int i11 = i10;
                    z4 = z7;
                    i8 = i11;
                }
                i7++;
                boolean z8 = z4;
                i10 = i8;
                z7 = z8;
            }
            tVar = new F1.t(j7, jMin2);
            if (j8 == -9223372036854775807L) {
                rVar = new F1.r(tVar, tVar);
            } else {
                rVar = new F1.r(tVar, new F1.t(j8, jMin));
            }
            return rVar;
        }
        j3 = Long.MAX_VALUE;
        j7 = j;
        j8 = -9223372036854775807L;
        jMin = -1;
        i7 = 0;
        jMin2 = j3;
        while (true) {
            lVarArr = this.f4726r;
            if (i7 < lVarArr.length) {
                break;
                break;
            }
            if (i7 != this.f4728t) {
                tVar2 = lVarArr[i7].f4706b;
                jArr = tVar2.f4775f;
                iF = p151v2.t.f(jArr, j7, z7);
                while (true) {
                    iArr = tVar2.f4776g;
                    if (iF >= 0) {
                        iA = i10;
                        break;
                    }
                    if ((iArr[iF] & 1) != 0) {
                        iA = iF;
                        break;
                    }
                    iF--;
                }
                if (iA == i10) {
                    iA = tVar2.a(j7);
                }
                jArr2 = tVar2.f4772c;
                if (iA != i10) {
                    jMin2 = Math.min(jArr2[iA], jMin2);
                }
                if (j8 != -9223372036854775807L) {
                    z4 = false;
                    iF2 = p151v2.t.f(jArr, j8, false);
                    while (true) {
                        if (iF2 >= 0) {
                            i8 = -1;
                            iF2 = -1;
                            break;
                        }
                        if ((iArr[iF2] & 1) != 0) {
                            i8 = -1;
                            break;
                        }
                        iF2--;
                    }
                    if (iF2 == i8) {
                        iF2 = tVar2.a(j8);
                    }
                    if (iF2 == i8) {
                        jMin = Math.min(jArr2[iF2], jMin);
                    }
                } else {
                    i8 = -1;
                    z4 = false;
                }
            } else {
                int i12 = i10;
                z4 = z7;
                i8 = i12;
            }
            i7++;
            boolean z9 = z4;
            i10 = i8;
            z7 = z9;
        }
        tVar = new F1.t(j7, jMin2);
        if (j8 == -9223372036854775807L) {
            rVar = new F1.r(tVar, tVar);
        } else {
            rVar = new F1.r(tVar, new F1.t(j8, jMin));
        }
        return rVar;
    }

    @Override // F1.s
    public final long i() {
        return this.f4729u;
    }

    /* JADX WARN: Code duplicated, block: B:238:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:295:0x05ad  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void j(long j) throws C0045t0 {
        int i7;
        ArrayDeque arrayDeque;
        Metadata metadata;
        Metadata metadata2;
        ArrayList arrayList;
        Metadata metadata3;
        long j3;
        int i8;
        Metadata.Entry[] entryArr;
        Metadata metadata4;
        Metadata metadata5;
        int i9;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        MdtaMetadataEntry mdtaMetadataEntry;
        ArrayDeque arrayDeque2;
        ArrayDeque arrayDeque3;
        Id3Frame id3FrameD;
        ArrayDeque arrayDeque4;
        Id3Frame id3FrameE;
        int i13 = 4;
        int i14 = 1;
        while (true) {
            ArrayDeque arrayDeque5 = this.f4714e;
            if (arrayDeque5.isEmpty() || ((a) arrayDeque5.peek()).f4633c != j) {
                break;
            }
            a aVar = (a) arrayDeque5.pop();
            if (aVar.f1675b == 1836019574) {
                ArrayList arrayList3 = new ArrayList();
                boolean z4 = this.f4730v == i14 ? i14 : 0;
                F1.p pVar = new F1.p();
                b bVarY = aVar.y(1969517665);
                int i15 = 1751411826;
                int i16 = 1768715124;
                int i17 = 1835365473;
                int i18 = 8;
                if (bVarY != null) {
                    byte[] bArr = f.f4651a;
                    C0095a c0095a = bVarY.f4636c;
                    c0095a.D(8);
                    Metadata metadata6 = null;
                    Metadata metadata7 = null;
                    while (c0095a.d() >= i18) {
                        int i19 = c0095a.f1463a;
                        int iG = c0095a.g();
                        int iG2 = c0095a.g();
                        if (iG2 == i17) {
                            c0095a.D(i19);
                            int i20 = i19 + iG;
                            c0095a.E(i18);
                            int i21 = c0095a.f1463a;
                            c0095a.E(i13);
                            if (c0095a.g() != i15) {
                                i21 += i13;
                            }
                            c0095a.D(i21);
                            while (true) {
                                int i22 = c0095a.f1463a;
                                if (i22 >= i20) {
                                    arrayDeque2 = arrayDeque5;
                                    metadata6 = null;
                                    break;
                                }
                                int iG3 = c0095a.g();
                                if (c0095a.g() == i16) {
                                    c0095a.D(i22);
                                    int i23 = i22 + iG3;
                                    c0095a.E(i18);
                                    ArrayList arrayList4 = new ArrayList();
                                    while (true) {
                                        int i24 = c0095a.f1463a;
                                        if (i24 >= i23) {
                                            break;
                                        }
                                        int iG4 = c0095a.g() + i24;
                                        int iG5 = c0095a.g();
                                        int i25 = (iG5 >> 24) & 255;
                                        int i26 = i23;
                                        if (i25 == 169 || i25 == 253) {
                                            arrayDeque3 = arrayDeque5;
                                            int i27 = 16777215 & iG5;
                                            if (i27 == 6516084) {
                                                id3FrameD = k.a(iG5, c0095a);
                                            } else if (i27 == 7233901 || i27 == 7631467) {
                                                id3FrameD = k.d(iG5, c0095a, "TIT2");
                                            } else if (i27 == 6516589 || i27 == 7828084) {
                                                id3FrameD = k.d(iG5, c0095a, "TCOM");
                                            } else if (i27 == 6578553) {
                                                id3FrameD = k.d(iG5, c0095a, "TDRC");
                                            } else if (i27 == 4280916) {
                                                id3FrameD = k.d(iG5, c0095a, "TPE1");
                                            } else if (i27 == 7630703) {
                                                id3FrameD = k.d(iG5, c0095a, "TSSE");
                                            } else if (i27 == 6384738) {
                                                id3FrameD = k.d(iG5, c0095a, "TALB");
                                            } else if (i27 == 7108978) {
                                                id3FrameD = k.d(iG5, c0095a, "USLT");
                                            } else if (i27 == 6776174) {
                                                id3FrameD = k.d(iG5, c0095a, "TCON");
                                            } else if (i27 == 6779504) {
                                                id3FrameD = k.d(iG5, c0095a, "TIT1");
                                            } else {
                                                Log.d("MetadataUtil", "Skipped unknown metadata entry: " + D1.a.c(iG5));
                                                c0095a.D(iG4);
                                                id3FrameD = null;
                                            }
                                            c0095a.D(iG4);
                                        } else {
                                            if (iG5 == 1735291493) {
                                                try {
                                                    int iF = k.f(c0095a);
                                                    String str = (iF <= 0 || iF > 192) ? null : k.f4704a[iF - 1];
                                                    if (str != null) {
                                                        id3FrameD = new TextInformationFrame("TCON", null, str);
                                                    } else {
                                                        Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                        id3FrameD = null;
                                                    }
                                                } catch (Throwable th) {
                                                    c0095a.D(iG4);
                                                    throw th;
                                                }
                                            } else if (iG5 == 1684632427) {
                                                id3FrameD = k.c(iG5, c0095a, "TPOS");
                                            } else if (iG5 == 1953655662) {
                                                id3FrameD = k.c(iG5, c0095a, "TRCK");
                                            } else {
                                                if (iG5 == 1953329263) {
                                                    id3FrameE = k.e(iG5, "TBPM", c0095a, true, false);
                                                } else if (iG5 == 1668311404) {
                                                    id3FrameD = k.e(iG5, "TCMP", c0095a, true, true);
                                                } else if (iG5 == 1668249202) {
                                                    id3FrameD = k.b(c0095a);
                                                } else if (iG5 == 1631670868) {
                                                    id3FrameD = k.d(iG5, c0095a, "TPE2");
                                                } else if (iG5 == 1936682605) {
                                                    id3FrameD = k.d(iG5, c0095a, "TSOT");
                                                } else if (iG5 == 1936679276) {
                                                    id3FrameD = k.d(iG5, c0095a, "TSO2");
                                                } else if (iG5 == 1936679282) {
                                                    id3FrameD = k.d(iG5, c0095a, "TSOA");
                                                } else if (iG5 == 1936679265) {
                                                    id3FrameD = k.d(iG5, c0095a, "TSOP");
                                                } else if (iG5 == 1936679791) {
                                                    id3FrameD = k.d(iG5, c0095a, "TSOC");
                                                } else if (iG5 == 1920233063) {
                                                    id3FrameD = k.e(iG5, "ITUNESADVISORY", c0095a, false, false);
                                                } else if (iG5 == 1885823344) {
                                                    id3FrameE = k.e(iG5, "ITUNESGAPLESS", c0095a, false, true);
                                                } else if (iG5 == 1936683886) {
                                                    id3FrameD = k.d(iG5, c0095a, "TVSHOWSORT");
                                                } else if (iG5 == 1953919848) {
                                                    id3FrameD = k.d(iG5, c0095a, "TVSHOW");
                                                } else if (iG5 == 757935405) {
                                                    String strP = null;
                                                    String strP2 = null;
                                                    int i28 = -1;
                                                    int i29 = -1;
                                                    while (true) {
                                                        int i30 = c0095a.f1463a;
                                                        if (i30 >= iG4) {
                                                            break;
                                                        }
                                                        int iG6 = c0095a.g();
                                                        int iG7 = c0095a.g();
                                                        c0095a.E(4);
                                                        if (iG7 == 1835360622) {
                                                            strP = c0095a.p(iG6 - 12);
                                                            arrayDeque4 = arrayDeque5;
                                                        } else {
                                                            arrayDeque4 = arrayDeque5;
                                                            if (iG7 == 1851878757) {
                                                                strP2 = c0095a.p(iG6 - 12);
                                                            } else {
                                                                if (iG7 == 1684108385) {
                                                                    i29 = iG6;
                                                                    i28 = i30;
                                                                }
                                                                c0095a.E(iG6 - 12);
                                                            }
                                                        }
                                                        arrayDeque5 = arrayDeque4;
                                                    }
                                                    arrayDeque3 = arrayDeque5;
                                                    if (strP == null || strP2 == null || i28 == -1) {
                                                        id3FrameD = null;
                                                    } else {
                                                        c0095a.D(i28);
                                                        c0095a.E(16);
                                                        id3FrameD = new InternalFrame(strP, strP2, c0095a.p(i29 - 16));
                                                    }
                                                    c0095a.D(iG4);
                                                } else {
                                                    arrayDeque3 = arrayDeque5;
                                                    Log.d("MetadataUtil", "Skipped unknown metadata entry: " + D1.a.c(iG5));
                                                    c0095a.D(iG4);
                                                    id3FrameD = null;
                                                }
                                                c0095a.D(iG4);
                                                id3FrameD = id3FrameE;
                                                arrayDeque3 = arrayDeque5;
                                            }
                                            c0095a.D(iG4);
                                            arrayDeque3 = arrayDeque5;
                                        }
                                        if (id3FrameD != null) {
                                            arrayList4.add(id3FrameD);
                                        }
                                        i23 = i26;
                                        arrayDeque5 = arrayDeque3;
                                    }
                                    arrayDeque2 = arrayDeque5;
                                    metadata6 = arrayList4.isEmpty() ? null : new Metadata(arrayList4);
                                    break;
                                }
                                c0095a.D(i22 + iG3);
                                arrayDeque5 = arrayDeque5;
                                i16 = 1768715124;
                                i18 = 8;
                            }
                        } else {
                            arrayDeque2 = arrayDeque5;
                            if (iG2 == 1936553057) {
                                c0095a.D(i19);
                                int i31 = i19 + iG;
                                c0095a.E(12);
                                while (true) {
                                    int i32 = c0095a.f1463a;
                                    if (i32 < i31) {
                                        int iG8 = c0095a.g();
                                        if (c0095a.g() != 1935766900) {
                                            c0095a.D(i32 + iG8);
                                        } else if (iG8 >= 14) {
                                            c0095a.E(5);
                                            int iT = c0095a.t();
                                            if (iT == 12 || iT == 13) {
                                                float f7 = iT == 12 ? 240.0f : 120.0f;
                                                c0095a.E(1);
                                                metadata7 = new Metadata(new SmtaMetadataEntry(f7, c0095a.t()));
                                                break;
                                            }
                                        }
                                    }
                                    metadata7 = null;
                                    break;
                                }
                            }
                        }
                        c0095a.D(i19 + iG);
                        arrayDeque5 = arrayDeque2;
                        i13 = 4;
                        i17 = 1835365473;
                        i16 = 1768715124;
                        i15 = 1751411826;
                        i18 = 8;
                    }
                    arrayDeque = arrayDeque5;
                    Pair pairCreate = Pair.create(metadata6, metadata7);
                    metadata2 = (Metadata) pairCreate.first;
                    metadata = (Metadata) pairCreate.second;
                    if (metadata2 != null) {
                        pVar.b(metadata2);
                    }
                    i17 = 1835365473;
                } else {
                    arrayDeque = arrayDeque5;
                    metadata = null;
                    metadata2 = null;
                }
                a aVarT = aVar.t(i17);
                if (aVarT != null) {
                    byte[] bArr2 = f.f4651a;
                    b bVarY2 = aVarT.y(1751411826);
                    b bVarY3 = aVarT.y(1801812339);
                    b bVarY4 = aVarT.y(1768715124);
                    if (bVarY2 == null || bVarY3 == null || bVarY4 == null) {
                        arrayList = arrayList3;
                        metadata3 = null;
                    } else {
                        C0095a c0095a2 = bVarY2.f4636c;
                        c0095a2.D(16);
                        if (c0095a2.g() != 1835299937) {
                            arrayList = arrayList3;
                        } else {
                            C0095a c0095a3 = bVarY3.f4636c;
                            c0095a3.D(12);
                            int iG9 = c0095a3.g();
                            String[] strArr = new String[iG9];
                            for (int i33 = 0; i33 < iG9; i33++) {
                                int iG10 = c0095a3.g();
                                c0095a3.E(4);
                                strArr[i33] = c0095a3.r(iG10 - 8, D3.f.f1719c);
                            }
                            C0095a c0095a4 = bVarY4.f4636c;
                            c0095a4.D(8);
                            ArrayList arrayList5 = new ArrayList();
                            for (int i34 = 8; c0095a4.d() > i34; i34 = 8) {
                                int i35 = c0095a4.f1463a;
                                int iG11 = c0095a4.g();
                                int iG12 = c0095a4.g() - 1;
                                if (iG12 < 0 || iG12 >= iG9) {
                                    arrayList3 = arrayList3;
                                    i12 = iG9;
                                    strArr = strArr;
                                    p150v0.a.j(iG12, "Skipped metadata with unknown key index: ", "AtomParsers");
                                } else {
                                    String str2 = strArr[iG12];
                                    int i36 = i35 + iG11;
                                    while (true) {
                                        int i37 = c0095a4.f1463a;
                                        if (i37 >= i36) {
                                            i12 = iG9;
                                            mdtaMetadataEntry = null;
                                            break;
                                        }
                                        int iG13 = c0095a4.g();
                                        int i38 = i36;
                                        i12 = iG9;
                                        if (c0095a4.g() == 1684108385) {
                                            int iG14 = c0095a4.g();
                                            int iG15 = c0095a4.g();
                                            int i39 = iG13 - 16;
                                            byte[] bArr3 = new byte[i39];
                                            c0095a4.f(bArr3, 0, i39);
                                            mdtaMetadataEntry = new MdtaMetadataEntry(str2, bArr3, iG15, iG14);
                                            break;
                                        }
                                        c0095a4.D(i37 + iG13);
                                        i36 = i38;
                                        iG9 = i12;
                                    }
                                    if (mdtaMetadataEntry != null) {
                                        arrayList5.add(mdtaMetadataEntry);
                                    }
                                }
                                c0095a4.D(i35 + iG11);
                                iG9 = i12;
                                strArr = strArr;
                                arrayList3 = arrayList3;
                            }
                            arrayList = arrayList3;
                            if (!arrayList5.isEmpty()) {
                                metadata3 = new Metadata(arrayList5);
                            }
                        }
                        metadata3 = null;
                    }
                } else {
                    arrayList = arrayList3;
                    metadata3 = null;
                }
                int i40 = -1;
                ArrayList arrayListE = f.e(aVar, pVar, -9223372036854775807L, null, false, z4, new H5.k(10));
                int size = arrayListE.size();
                long j7 = -9223372036854775807L;
                int size2 = -1;
                long j8 = -9223372036854775807L;
                int i41 = 0;
                while (true) {
                    j3 = 0;
                    if (i41 >= size) {
                        break;
                    }
                    t tVar = (t) arrayListE.get(i41);
                    if (tVar.f4771b == 0) {
                        metadata4 = metadata;
                        metadata5 = metadata2;
                        i9 = i40;
                        arrayList2 = arrayList;
                    } else {
                        q qVar = tVar.f4770a;
                        long j9 = qVar.f4743e;
                        if (j9 == j7) {
                            j9 = tVar.f4777h;
                        }
                        long jMax = Math.max(j8, j9);
                        F1.m mVar = this.f4725q;
                        int i42 = qVar.f4740b;
                        l lVar = new l(qVar, tVar, mVar.r(i41, i42));
                        X x4 = qVar.f4744f;
                        boolean zEquals = "audio/true-hd".equals(x4.f283C);
                        int i43 = tVar.f4774e;
                        int i44 = zEquals ? i43 * 16 : i43 + 30;
                        Format$Builder format$BuilderA = x4.a();
                        format$BuilderA.f10538l = i44;
                        if (i42 != 2 || j9 <= 0) {
                            i8 = 1;
                        } else {
                            int i45 = tVar.f4771b;
                            if (i45 > 1) {
                                format$BuilderA.f10544r = i45 / (j9 / 1000000.0f);
                                i8 = 1;
                            } else {
                                i8 = 1;
                            }
                        }
                        if (i42 == i8 && (i10 = pVar.f2561a) != -1 && (i11 = pVar.f2562b) != -1) {
                            format$BuilderA.f10524A = i10;
                            format$BuilderA.f10525B = i11;
                        }
                        ArrayList arrayList6 = this.f4716g;
                        Metadata[] metadataArr = {metadata, arrayList6.isEmpty() ? null : new Metadata(arrayList6)};
                        Metadata metadata8 = new Metadata(new Metadata.Entry[0]);
                        if (i42 != 1) {
                            if (i42 == 2 && metadata3 != null) {
                                int i46 = 0;
                                while (true) {
                                    Metadata.Entry[] entryArr2 = metadata3.f10562a;
                                    if (i46 >= entryArr2.length) {
                                        break;
                                    }
                                    Metadata.Entry entry = entryArr2[i46];
                                    if (entry instanceof MdtaMetadataEntry) {
                                        MdtaMetadataEntry mdtaMetadataEntry2 = (MdtaMetadataEntry) entry;
                                        if ("com.android.capture.fps".equals(mdtaMetadataEntry2.f10640a)) {
                                            metadata8 = new Metadata(mdtaMetadataEntry2);
                                            break;
                                        }
                                    }
                                    i46++;
                                }
                            }
                        } else if (metadata2 != null) {
                            metadata8 = metadata2;
                        }
                        int i47 = 0;
                        while (true) {
                            entryArr = metadata8.f10562a;
                            if (i47 >= 2) {
                                break;
                            }
                            Metadata metadata9 = metadataArr[i47];
                            if (metadata9 != null) {
                                Metadata.Entry[] entryArr3 = metadata9.f10562a;
                                if (entryArr3.length != 0) {
                                    int i48 = p151v2.t.f17159a;
                                    Object[] objArrCopyOf = Arrays.copyOf(entryArr, entryArr.length + entryArr3.length);
                                    System.arraycopy(entryArr3, 0, objArrCopyOf, entryArr.length, entryArr3.length);
                                    metadata8 = new Metadata((Metadata.Entry[]) objArrCopyOf);
                                }
                            }
                            i47++;
                            metadata = metadata;
                            metadata2 = metadata2;
                        }
                        metadata4 = metadata;
                        metadata5 = metadata2;
                        if (entryArr.length > 0) {
                            format$BuilderA.f10536i = metadata8;
                        }
                        lVar.f4707c.a(new X(format$BuilderA));
                        if (i42 == 2) {
                            i9 = -1;
                            if (size2 == -1) {
                                size2 = arrayList.size();
                            }
                        } else {
                            i9 = -1;
                        }
                        arrayList2 = arrayList;
                        arrayList2.add(lVar);
                        j8 = jMax;
                    }
                    i41++;
                    i40 = i9;
                    arrayList = arrayList2;
                    arrayListE = arrayListE;
                    size = size;
                    metadata = metadata4;
                    metadata2 = metadata5;
                    j7 = -9223372036854775807L;
                }
                int i49 = i40;
                this.f4728t = size2;
                this.f4729u = j8;
                l[] lVarArr = (l[]) arrayList.toArray(new l[0]);
                this.f4726r = lVarArr;
                long[][] jArr = new long[lVarArr.length][];
                int[] iArr = new int[lVarArr.length];
                long[] jArr2 = new long[lVarArr.length];
                boolean[] zArr = new boolean[lVarArr.length];
                for (int i50 = 0; i50 < lVarArr.length; i50++) {
                    jArr[i50] = new long[lVarArr[i50].f4706b.f4771b];
                    jArr2[i50] = lVarArr[i50].f4706b.f4775f[0];
                }
                int i51 = 0;
                while (i51 < lVarArr.length) {
                    int i52 = i49;
                    long j10 = Long.MAX_VALUE;
                    for (int i53 = 0; i53 < lVarArr.length; i53++) {
                        if (!zArr[i53]) {
                            long j11 = jArr2[i53];
                            if (j11 <= j10) {
                                i52 = i53;
                                j10 = j11;
                            }
                        }
                    }
                    int i54 = iArr[i52];
                    long[] jArr3 = jArr[i52];
                    jArr3[i54] = j3;
                    t tVar2 = lVarArr[i52].f4706b;
                    j3 += (long) tVar2.f4773d[i54];
                    int i55 = i54 + 1;
                    iArr[i52] = i55;
                    if (i55 < jArr3.length) {
                        jArr2[i52] = tVar2.f4775f[i55];
                    } else {
                        zArr[i52] = true;
                        i51++;
                    }
                }
                i7 = 1;
                this.f4727s = jArr;
                this.f4725q.n();
                this.f4725q.m(this);
                arrayDeque.clear();
                this.f4717h = 2;
            } else {
                i7 = i14;
                if (!arrayDeque5.isEmpty()) {
                    ((a) arrayDeque5.peek()).f4635e.add(aVar);
                }
            }
            i14 = i7;
            i13 = 4;
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
