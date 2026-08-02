package com.google.android.gms.internal.ads;

import B.C0072a;
import a3.AbstractC0467k;
import android.util.Pair;
import android.util.SparseArray;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1498r1 implements F {
    public static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final C1407p K;

    /* renamed from: A, reason: collision with root package name */
    public int f15211A;

    /* renamed from: B, reason: collision with root package name */
    public int f15212B;

    /* renamed from: C, reason: collision with root package name */
    public int f15213C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f15214D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f15215E;

    /* renamed from: F, reason: collision with root package name */
    public H f15216F;

    /* renamed from: G, reason: collision with root package name */
    public InterfaceC0737a0[] f15217G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC0737a0[] f15218H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f15219I;

    /* renamed from: a, reason: collision with root package name */
    public final O1 f15220a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15221b;

    /* renamed from: c, reason: collision with root package name */
    public final List f15222c;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f15226h;
    public final C1617tm i;

    /* renamed from: n, reason: collision with root package name */
    public final C1245lH f15231n;

    /* renamed from: o, reason: collision with root package name */
    public C1761wv f15232o;

    /* renamed from: p, reason: collision with root package name */
    public int f15233p;

    /* renamed from: q, reason: collision with root package name */
    public int f15234q;

    /* renamed from: r, reason: collision with root package name */
    public long f15235r;

    /* renamed from: s, reason: collision with root package name */
    public int f15236s;

    /* renamed from: t, reason: collision with root package name */
    public C1617tm f15237t;

    /* renamed from: u, reason: collision with root package name */
    public long f15238u;

    /* renamed from: v, reason: collision with root package name */
    public int f15239v;

    /* renamed from: w, reason: collision with root package name */
    public long f15240w;

    /* renamed from: x, reason: collision with root package name */
    public long f15241x;

    /* renamed from: y, reason: collision with root package name */
    public long f15242y;

    /* renamed from: z, reason: collision with root package name */
    public C1454q1 f15243z;

    /* renamed from: j, reason: collision with root package name */
    public final C1390oj f15227j = new C1390oj(2);

    /* renamed from: k, reason: collision with root package name */
    public final C1617tm f15228k = new C1617tm(16);

    /* renamed from: e, reason: collision with root package name */
    public final C1617tm f15224e = new C1617tm(AbstractC1668us.f15916a);
    public final C1617tm f = new C1617tm(5);

    /* renamed from: g, reason: collision with root package name */
    public final C1617tm f15225g = new C1617tm();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f15229l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f15230m = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f15223d = new SparseArray();

    static {
        C1649uH c1649uH = new C1649uH();
        c1649uH.c("application/x-emsg");
        K = new C1407p(c1649uH);
    }

    public C1498r1(O1 o12, int i, AbstractC1044gv abstractC1044gv) {
        this.f15220a = o12;
        this.f15221b = i;
        this.f15222c = Collections.unmodifiableList(abstractC1044gv);
        byte[] bArr = new byte[16];
        this.f15226h = bArr;
        this.i = new C1617tm(bArr);
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        this.f15232o = C1761wv.f16184o;
        this.f15241x = -9223372036854775807L;
        this.f15240w = -9223372036854775807L;
        this.f15242y = -9223372036854775807L;
        this.f15216F = H.f9296e;
        this.f15217G = new InterfaceC0737a0[0];
        this.f15218H = new InterfaceC0737a0[0];
        this.f15231n = new C1245lH(new Mt(3, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1334nG a(ArrayList arrayList) {
        int i;
        UUID uuid;
        Qt qt;
        UUID uuid2;
        int size = arrayList.size();
        int i5 = 0;
        ArrayList arrayList2 = null;
        while (i5 < size) {
            C1216kp c1216kp = (C1216kp) arrayList.get(i5);
            if (c1216kp.f15911b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = c1216kp.f14290c.f15724a;
                C1617tm c1617tm = new C1617tm(bArr);
                if (c1617tm.f15726c >= 32) {
                    c1617tm.j(0);
                    int o5 = c1617tm.o();
                    int q5 = c1617tm.q();
                    if (q5 != o5) {
                        JB.l("PsshAtomUtil", "Advertised atom size (" + q5 + ") does not match buffer size: " + o5);
                    } else {
                        int q6 = c1617tm.q();
                        if (q6 != 1886614376) {
                            AbstractC0467k.y(q6, "Atom type is not pssh: ", "PsshAtomUtil");
                        } else {
                            int a5 = AbstractC1274m1.a(c1617tm.q());
                            if (a5 > 1) {
                                AbstractC0467k.y(a5, "Unsupported pssh version: ", "PsshAtomUtil");
                            } else {
                                UUID uuid3 = new UUID(c1617tm.C(), c1617tm.C());
                                if (a5 == 1) {
                                    int y5 = c1617tm.y();
                                    UUID[] uuidArr = new UUID[y5];
                                    int i6 = 0;
                                    while (i6 < y5) {
                                        uuidArr[i6] = new UUID(c1617tm.C(), c1617tm.C());
                                        i6++;
                                        i5 = i5;
                                    }
                                }
                                i = i5;
                                uuid = null;
                                int y6 = c1617tm.y();
                                int o6 = c1617tm.o();
                                if (y6 != o6) {
                                    JB.l("PsshAtomUtil", "Atom data size (" + y6 + ") does not match the bytes left: " + o6);
                                    qt = null;
                                } else {
                                    c1617tm.f(new byte[y6], 0, y6);
                                    qt = new Qt(2, uuid3);
                                }
                                uuid2 = qt != null ? uuid : (UUID) qt.f11282l;
                                if (uuid2 != null) {
                                    JB.l("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                } else {
                                    arrayList2.add(new XF(uuid2, "video/mp4", bArr));
                                }
                            }
                        }
                    }
                }
                i = i5;
                qt = null;
                uuid = null;
                if (qt != null) {
                }
                if (uuid2 != null) {
                }
            } else {
                i = i5;
            }
            i5 = i + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C1334nG(null, false, (XF[]) arrayList2.toArray(new XF[0]));
    }

    public static void b(C1617tm c1617tm, int i, C1858z1 c1858z1) {
        c1617tm.j(i + 8);
        int q5 = c1617tm.q();
        byte[] bArr = AbstractC1274m1.f14455a;
        if ((q5 & 1) != 0) {
            throw B7.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z3 = (q5 & 2) != 0;
        int y5 = c1617tm.y();
        if (y5 == 0) {
            Arrays.fill(c1858z1.f16534l, 0, c1858z1.f16529e, false);
            return;
        }
        int i5 = c1858z1.f16529e;
        if (y5 != i5) {
            throw B7.a(null, "Senc sample count " + y5 + " is different from fragment sample count" + i5);
        }
        Arrays.fill(c1858z1.f16534l, 0, y5, z3);
        int o5 = c1617tm.o();
        C1617tm c1617tm2 = c1858z1.f16536n;
        c1617tm2.g(o5);
        c1858z1.f16533k = true;
        c1858z1.f16537o = true;
        c1617tm.f(c1617tm2.f15724a, 0, c1617tm2.f15726c);
        c1617tm2.j(0);
        c1858z1.f16537o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02db, code lost:
    
        r10 = (com.google.android.gms.internal.ads.C1216kp) r6.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02e3, code lost:
    
        if (r10.f15911b != r14) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02e5, code lost:
    
        r28 = r4 + 1;
        r10 = r10.f14290c;
        r10.j(8);
        r13 = r10.q();
        r14 = r12.f15076d;
        r29 = r2;
        r2 = r5.f16525a;
        r30 = com.google.android.gms.internal.ads.AbstractC1260lo.f14419a;
        r30 = r3;
        r5.f16530g[r4] = r10.y();
        r3 = r5.f;
        r31 = r4;
        r3 = r5.f16526b;
        r3[r31] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0314, code lost:
    
        if ((r13 & 1) == 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0316, code lost:
    
        r3[r31] = r3 + r10.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0323, code lost:
    
        if ((r13 & 4) == 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0325, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0328, code lost:
    
        r4 = r2.f14568d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x032a, code lost:
    
        if (r3 == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x032c, code lost:
    
        r4 = r10.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0330, code lost:
    
        r32 = r3;
        r3 = r13 & 256;
        r3 = r13 & 512;
        r3 = r13 & 1024;
        r13 = r13 & 2048;
        r14 = r14.f7500a;
        r3 = r14.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0344, code lost:
    
        if (r3 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0346, code lost:
    
        r36 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x034c, code lost:
    
        if (r3.length != 1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x034e, code lost:
    
        r3 = r14.f16209j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0350, code lost:
    
        if (r3 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0354, code lost:
    
        r38 = r3[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x035a, code lost:
    
        if (r38 != 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x035c, code lost:
    
        r37 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x038a, code lost:
    
        r26 = r37[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x035f, code lost:
    
        r44 = java.math.RoundingMode.DOWN;
        r37 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0387, code lost:
    
        if ((com.google.android.gms.internal.ads.AbstractC1260lo.u(r38, 1000000, r14.f16205d, r44) + com.google.android.gms.internal.ads.AbstractC1260lo.u(r37[0], 1000000, r14.f16204c, r44)) >= r14.f16206e) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0390, code lost:
    
        r4 = r5.f16531h;
        r13 = r5.i;
        r3 = r5.f16532j;
        r3 = r5.f16530g[r31] + r9;
        r39 = r9;
        r9 = r5.f16538p;
        r4 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03a9, code lost:
    
        if (r4 >= r3) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03ab, code lost:
    
        if (r3 == 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03ad, code lost:
    
        r31 = r3;
        r3 = r10.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03b7, code lost:
    
        r39 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03c1, code lost:
    
        if (r3 < 0) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03c3, code lost:
    
        if (r3 == 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03c5, code lost:
    
        r42 = r7;
        r7 = r10.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03d4, code lost:
    
        if (r7 < 0) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03d6, code lost:
    
        if (r3 == 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03d8, code lost:
    
        r4 = r10.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03ea, code lost:
    
        if (r13 == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03ec, code lost:
    
        r43 = r2;
        r2 = r10.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03f6, code lost:
    
        r44 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03fd, code lost:
    
        r1 = com.google.android.gms.internal.ads.AbstractC1260lo.u((r2 + r9) - r26, 1000000, r14.f16204c, java.math.RoundingMode.DOWN);
        r13[r39] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0414, code lost:
    
        if (r5.f16539q != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0416, code lost:
    
        r13[r39] = r1 + r12.f15076d.f7506h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x041e, code lost:
    
        r4[r39] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0426, code lost:
    
        if (((r4 >> 16) & 1) != 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0428, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x042c, code lost:
    
        r3[r39] = r1;
        r9 = r9 + r3;
        r4 = r39 + 1;
        r3 = r31;
        r7 = r42;
        r2 = r43;
        r1 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x042b, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03f9, code lost:
    
        r43 = r2;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03dd, code lost:
    
        if (r39 != 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03df, code lost:
    
        if (r32 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03e1, code lost:
    
        r4 = r36;
        r39 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03e6, code lost:
    
        r39 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03e8, code lost:
    
        r4 = r2.f14568d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x044d, code lost:
    
        throw com.google.android.gms.internal.ads.B7.a(null, "Unexpected negative value: " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03d0, code lost:
    
        r42 = r7;
        r7 = r2.f14567c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x045f, code lost:
    
        throw com.google.android.gms.internal.ads.B7.a(null, "Unexpected negative value: " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03ba, code lost:
    
        r31 = r3;
        r3 = r2.f14566b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0460, code lost:
    
        r44 = r1;
        r42 = r7;
        r5.f16538p = r9;
        r4 = r28;
        r9 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x047c, code lost:
    
        r2 = r29 + 1;
        r3 = r30;
        r7 = r42;
        r1 = r44;
        r14 = 1953658222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x038d, code lost:
    
        r36 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0327, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x046f, code lost:
    
        r44 = r1;
        r29 = r2;
        r30 = r3;
        r42 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0489, code lost:
    
        r44 = r1;
        r30 = r3;
        r1 = r12.f15076d;
        r2 = r5.f16525a;
        r2.getClass();
        r1 = r1.f7500a.f16211l[r2.f14565a];
        r2 = r8.e(1935763834);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04a3, code lost:
    
        if (r2 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04a5, code lost:
    
        r1.getClass();
        r2 = r2.f14290c;
        r2.j(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04b5, code lost:
    
        if ((r2.q() & 1) != 1) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04b7, code lost:
    
        r2.k(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04ba, code lost:
    
        r3 = r2.v();
        r4 = r2.y();
        r7 = r5.f16529e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x04c4, code lost:
    
        if (r4 > r7) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04c6, code lost:
    
        r7 = r1.f16380d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x04c8, code lost:
    
        if (r3 != 0) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x04ca, code lost:
    
        r3 = r5.f16534l;
        r9 = 0;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04ce, code lost:
    
        if (r13 >= r4) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x04d0, code lost:
    
        r10 = r2.v();
        r9 = r9 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04d5, code lost:
    
        if (r10 <= r7) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x04d7, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x04da, code lost:
    
        r3[r13] = r10;
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x04d9, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x04e1, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04f0, code lost:
    
        java.util.Arrays.fill(r5.f16534l, r4, r5.f16529e, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04f7, code lost:
    
        if (r9 <= 0) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x04f9, code lost:
    
        r5.f16536n.g(r9);
        r5.f16533k = true;
        r5.f16537o = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x04e3, code lost:
    
        if (r3 <= r7) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x04e5, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x04e8, code lost:
    
        r9 = r3 * r4;
        r13 = false;
        java.util.Arrays.fill(r5.f16534l, 0, r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x04e7, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x051f, code lost:
    
        throw com.google.android.gms.internal.ads.B7.a(null, "Saiz sample count " + r4 + " is greater than fragment sample count" + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0520, code lost:
    
        r2 = r8.e(1935763823);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0527, code lost:
    
        if (r2 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0529, code lost:
    
        r2 = r2.f14290c;
        r2.j(8);
        r4 = r2.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0537, code lost:
    
        if ((r4 & 1) != 1) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0539, code lost:
    
        r2.k(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x053c, code lost:
    
        r3 = r2.y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0540, code lost:
    
        if (r3 != 1) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0542, code lost:
    
        r3 = com.google.android.gms.internal.ads.AbstractC1274m1.a(r4);
        r9 = r5.f16527c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0548, code lost:
    
        if (r3 != 0) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x054a, code lost:
    
        r2 = r2.D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0553, code lost:
    
        r5.f16527c = r9 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x054f, code lost:
    
        r2 = r2.E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x056b, code lost:
    
        throw com.google.android.gms.internal.ads.B7.a(null, "Unexpected saio entry count: " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0556, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x056c, code lost:
    
        r3 = r8.e(1936027235);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0573, code lost:
    
        if (r3 == null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0575, code lost:
    
        b(r3.f14290c, 0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x057b, code lost:
    
        if (r1 == null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x057d, code lost:
    
        r33 = r1.f16378b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0584, code lost:
    
        r1 = null;
        r3 = null;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x058b, code lost:
    
        if (r4 >= r6.size()) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x058d, code lost:
    
        r7 = (com.google.android.gms.internal.ads.C1216kp) r6.get(r4);
        r8 = r7.f14290c;
        r7 = r7.f15911b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x059d, code lost:
    
        if (r7 != 1935828848) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x059f, code lost:
    
        r8.j(12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x05a8, code lost:
    
        if (r8.q() != 1936025959) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x05aa, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x05bf, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x05b2, code lost:
    
        if (r7 != 1936158820) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x05b4, code lost:
    
        r8.j(12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x05bb, code lost:
    
        if (r8.q() != 1936025959) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x05bd, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x05c4, code lost:
    
        if (r1 == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x05c6, code lost:
    
        if (r3 != null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x05ce, code lost:
    
        r1.j(8);
        r7 = com.google.android.gms.internal.ads.AbstractC1274m1.a(r1.q());
        r8 = r21;
        r1.k(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x05e0, code lost:
    
        if (r7 != 1) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x05e2, code lost:
    
        r1.k(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x05e9, code lost:
    
        if (r1.q() != 1) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x05eb, code lost:
    
        r3.j(8);
        r1 = com.google.android.gms.internal.ads.AbstractC1274m1.a(r3.q());
        r3.k(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x05f9, code lost:
    
        if (r1 != 1) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0601, code lost:
    
        if (r3.D() == 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0603, code lost:
    
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x061c, code lost:
    
        if (r3.D() != 1) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x061e, code lost:
    
        r3.k(1);
        r1 = r3.v();
        r36 = (r1 & 240) >> 4;
        r37 = r1 & 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0630, code lost:
    
        if (r3.v() != 1) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0632, code lost:
    
        r34 = r3.v();
        r1 = r19;
        r7 = new byte[r1];
        r3.f(r7, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x063e, code lost:
    
        if (r34 != 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0640, code lost:
    
        r1 = r3.v();
        r2 = new byte[r1];
        r3.f(r2, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0649, code lost:
    
        r5.f16533k = true;
        r5.f16535m = new com.google.android.gms.internal.ads.C1813y1(true, r33, r34, r7, r36, r37, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0669, code lost:
    
        r1 = r6.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x066e, code lost:
    
        if (r2 >= r1) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0670, code lost:
    
        r3 = (com.google.android.gms.internal.ads.C1216kp) r6.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x067b, code lost:
    
        if (r3.f15911b != 1970628964) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x067d, code lost:
    
        r3 = r3.f14290c;
        r3.j(8);
        r7 = r53.f15226h;
        r3.f(r7, 0, 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0692, code lost:
    
        if (java.util.Arrays.equals(r7, com.google.android.gms.internal.ads.C1498r1.J) == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0694, code lost:
    
        b(r3, 16, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x069f, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x06a2, code lost:
    
        r12 = 8;
        r14 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0661, code lost:
    
        throw com.google.android.gms.internal.ads.B7.b("Entry count in sgpd != 1 (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x060c, code lost:
    
        throw com.google.android.gms.internal.ads.B7.b("Variable length description in sgpd found (unsupported)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x060d, code lost:
    
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x060f, code lost:
    
        if (r1 < r4) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0611, code lost:
    
        r3.k(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0668, code lost:
    
        throw com.google.android.gms.internal.ads.B7.b("Entry count in sbgp != 1 (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x05c8, code lost:
    
        r4 = r20;
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0582, code lost:
    
        r33 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x025c, code lost:
    
        r6 = r6.D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0265, code lost:
    
        r5.f16538p = r6;
        r5.f16539q = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x01d2, code lost:
    
        r13 = r10 & 1;
        r14 = r12.f15074b;
        r15 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x01d9, code lost:
    
        if (r13 == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x01db, code lost:
    
        r5 = r9.E();
        r14.f16526b = r5;
        r14.f16527c = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x01e3, code lost:
    
        r5 = r12.f15077e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x01e7, code lost:
    
        if ((r10 & 2) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x01e9, code lost:
    
        r6 = r9.q() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x01f4, code lost:
    
        if ((r10 & 8) == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x01f6, code lost:
    
        r13 = r9.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0201, code lost:
    
        if ((r10 & 16) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0203, code lost:
    
        r7 = r9.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x020e, code lost:
    
        if ((r10 & 32) == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0210, code lost:
    
        r5 = r9.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0217, code lost:
    
        r14.f16525a = new com.google.android.gms.internal.ads.C1319n1(r6, r13, r7, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0215, code lost:
    
        r5 = r5.f14568d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x020a, code lost:
    
        r7 = r5.f14567c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x01fd, code lost:
    
        r13 = r5.f14566b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x01f0, code lost:
    
        r6 = r5.f14565a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x06a8, code lost:
    
        r44 = r1;
        r25 = r2;
        r30 = r3;
        r12 = r4;
        r15 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x06c4, code lost:
    
        r44 = r1;
        r12 = r4;
        r1 = a(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x06d2, code lost:
    
        if (r1 == null) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x06d4, code lost:
    
        r3 = r44.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x06d9, code lost:
    
        if (r5 >= r3) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x06db, code lost:
    
        r6 = r44;
        r7 = (com.google.android.gms.internal.ads.C1454q1) r6.valueAt(r5);
        r9 = r7.f15076d;
        r10 = r7.f15074b.f16525a;
        r11 = com.google.android.gms.internal.ads.AbstractC1260lo.f14419a;
        r9 = r9.f7500a.f16211l[r10.f14565a];
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x06f3, code lost:
    
        if (r9 == null) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x06f5, code lost:
    
        r9 = r9.f16378b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x06f9, code lost:
    
        r9 = r1.a(r9);
        r10 = r7.f15076d.f7500a.f16207g;
        r10.getClass();
        r11 = new com.google.android.gms.internal.ads.C1649uH(r10);
        r11.f15852p = r9;
        r7.f15073a.e(new com.google.android.gms.internal.ads.C1407p(r11));
        r5 = r5 + 1;
        r44 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x06f8, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x071e, code lost:
    
        r6 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0729, code lost:
    
        if (r53.f15240w == (-9223372036854775807L)) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x072b, code lost:
    
        r1 = r6.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0730, code lost:
    
        if (r2 >= r1) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0732, code lost:
    
        r3 = (com.google.android.gms.internal.ads.C1454q1) r6.valueAt(r2);
        r4 = r53.f15240w;
        r7 = r3.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x073c, code lost:
    
        r11 = r3.f15074b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0740, code lost:
    
        if (r7 >= r11.f16529e) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0748, code lost:
    
        if (r11.i[r7] > r4) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x074e, code lost:
    
        if (r11.f16532j[r7] == false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0750, code lost:
    
        r3.i = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0752, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0757, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x075d, code lost:
    
        r53.f15240w = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0767, code lost:
    
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0772, code lost:
    
        if (r7.isEmpty() != false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0774, code lost:
    
        ((com.google.android.gms.internal.ads.C0859cp) r7.peek()).f13046e.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0780, code lost:
    
        r53.f15233p = 0;
        r53.f15236s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0785, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018c, code lost:
    
        r1 = r10;
        r19 = 16;
        r20 = 2;
        r21 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0196, code lost:
    
        if (r8 != 1836019558) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0198, code lost:
    
        r2 = r9.f13046e;
        r3 = r2.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019f, code lost:
    
        if (r6 >= r3) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a1, code lost:
    
        r8 = (com.google.android.gms.internal.ads.C0859cp) r2.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ac, code lost:
    
        if (r8.f15911b != 1953653094) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ae, code lost:
    
        r9 = r8.e(1952868452);
        r9.getClass();
        r9 = r9.f14290c;
        r9.j(r4);
        r10 = r9.q();
        r12 = com.google.android.gms.internal.ads.AbstractC1274m1.f14455a;
        r12 = (com.google.android.gms.internal.ads.C1454q1) r1.get(r9.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01cd, code lost:
    
        if (r12 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01cf, code lost:
    
        r15 = r6;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x021e, code lost:
    
        if (r12 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0220, code lost:
    
        r44 = r1;
        r25 = r2;
        r30 = r3;
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0227, code lost:
    
        r14 = r19;
        r4 = r20;
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x06b2, code lost:
    
        r6 = r15 + 1;
        r20 = r4;
        r21 = r8;
        r4 = r12;
        r19 = r14;
        r2 = r25;
        r3 = r30;
        r1 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0233, code lost:
    
        r5 = r12.f15074b;
        r6 = r5.f16538p;
        r9 = r5.f16539q;
        r12.d();
        r12.f15082l = true;
        r10 = r8.e(1952867444);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0246, code lost:
    
        if (r10 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0248, code lost:
    
        r6 = r10.f14290c;
        r6.j(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0255, code lost:
    
        if (com.google.android.gms.internal.ads.AbstractC1274m1.a(r6.q()) != 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0257, code lost:
    
        r6 = r6.E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0260, code lost:
    
        r5.f16538p = r6;
        r5.f16539q = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0269, code lost:
    
        r6 = r8.f13045d;
        r7 = r6.size();
        r9 = 0;
        r10 = 0;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0272, code lost:
    
        r14 = 1953658222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0275, code lost:
    
        if (r13 >= r7) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0277, code lost:
    
        r4 = (com.google.android.gms.internal.ads.C1216kp) r6.get(r13);
        r25 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0283, code lost:
    
        if (r4.f15911b != 1953658222) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0285, code lost:
    
        r2 = r4.f14290c;
        r2.j(12);
        r2 = r2.y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0290, code lost:
    
        if (r2 <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0292, code lost:
    
        r10 = r10 + r2;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x029a, code lost:
    
        r13 = r13 + 1;
        r2 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02a1, code lost:
    
        r25 = r2;
        r12.f15079h = 0;
        r12.f15078g = 0;
        r12.f = 0;
        r5.f16528d = r9;
        r5.f16529e = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02b1, code lost:
    
        if (r5.f16530g.length >= r9) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02b3, code lost:
    
        r5.f = new long[r9];
        r5.f16530g = new int[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02be, code lost:
    
        if (r5.f16531h.length >= r10) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02c0, code lost:
    
        r10 = (r10 * 125) / 100;
        r5.f16531h = new int[r10];
        r5.i = new long[r10];
        r5.f16532j = new boolean[r10];
        r5.f16534l = new boolean[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02d4, code lost:
    
        r2 = 0;
        r4 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02d7, code lost:
    
        r26 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02d9, code lost:
    
        if (r2 >= r7) goto L339;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j5) {
        int i;
        C1319n1 c1319n1;
        C1319n1 c1319n12;
        int i5 = 8;
        loop0: while (true) {
            int i6 = 0;
            while (true) {
                ArrayDeque arrayDeque = this.f15229l;
                if (arrayDeque.isEmpty() || ((C0859cp) arrayDeque.peek()).f13044c != j5) {
                    break loop0;
                }
                C0859cp c0859cp = (C0859cp) arrayDeque.pop();
                int i7 = c0859cp.f15911b;
                SparseArray sparseArray = this.f15223d;
                ArrayList arrayList = c0859cp.f13045d;
                int i8 = 12;
                if (i7 != 1836019574) {
                    break;
                }
                C1334nG a5 = a(arrayList);
                C0859cp d5 = c0859cp.d(1836475768);
                d5.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList2 = d5.f13045d;
                int size = arrayList2.size();
                int i9 = 0;
                long j6 = -9223372036854775807L;
                while (i9 < size) {
                    C1216kp c1216kp = (C1216kp) arrayList2.get(i9);
                    int i10 = c1216kp.f15911b;
                    C1617tm c1617tm = c1216kp.f14290c;
                    if (i10 == 1953654136) {
                        c1617tm.j(i8);
                        Pair create = Pair.create(Integer.valueOf(c1617tm.q()), new C1319n1(c1617tm.q() - 1, c1617tm.q(), c1617tm.q(), c1617tm.q()));
                        sparseArray2.put(((Integer) create.first).intValue(), (C1319n1) create.second);
                    } else if (i10 == 1835362404) {
                        c1617tm.j(i5);
                        j6 = AbstractC1274m1.a(c1617tm.q()) == 0 ? c1617tm.D() : c1617tm.E();
                    }
                    i9++;
                    i8 = 12;
                }
                int i11 = 1;
                ArrayList d6 = AbstractC1274m1.d(c0859cp, new N(), j6, a5, false, false, new C1364o1(i6));
                int size2 = d6.size();
                if (sparseArray.size() == 0) {
                    int i12 = 0;
                    while (i12 < size2) {
                        A1 a12 = (A1) d6.get(i12);
                        C1768x1 c1768x1 = a12.f7500a;
                        InterfaceC0737a0 w5 = this.f15216F.w(i12, c1768x1.f16203b);
                        w5.getClass();
                        int size3 = sparseArray2.size();
                        int i13 = c1768x1.f16202a;
                        if (size3 == i11) {
                            c1319n1 = (C1319n1) sparseArray2.valueAt(0);
                        } else {
                            c1319n1 = (C1319n1) sparseArray2.get(i13);
                            c1319n1.getClass();
                        }
                        sparseArray.put(i13, new C1454q1(w5, a12, c1319n1));
                        this.f15241x = Math.max(this.f15241x, c1768x1.f16206e);
                        i12++;
                        i11 = 1;
                    }
                    this.f15216F.v();
                } else {
                    AbstractC1668us.a0(sparseArray.size() == size2);
                    for (int i14 = 0; i14 < size2; i14++) {
                        A1 a13 = (A1) d6.get(i14);
                        C1768x1 c1768x12 = a13.f7500a;
                        C1454q1 c1454q1 = (C1454q1) sparseArray.get(c1768x12.f16202a);
                        if (sparseArray2.size() == 1) {
                            c1319n12 = (C1319n1) sparseArray2.valueAt(0);
                        } else {
                            c1319n12 = (C1319n1) sparseArray2.get(c1768x12.f16202a);
                            c1319n12.getClass();
                        }
                        c1454q1.f15076d = a13;
                        c1454q1.f15077e = c1319n12;
                        c1454q1.f15073a.e(a13.f7500a.f16207g);
                        c1454q1.d();
                    }
                }
            }
            i5 = i;
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void d(long j5, long j6) {
        SparseArray sparseArray = this.f15223d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C1454q1) sparseArray.valueAt(i)).d();
        }
        this.f15230m.clear();
        this.f15239v = 0;
        this.f15231n.f(0);
        this.f15240w = j6;
        this.f15229l.clear();
        this.f15233p = 0;
        this.f15236s = 0;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final boolean e(G g5) {
        C1761wv c1761wv;
        Y e3 = JB.e(g5, true, false);
        if (e3 != null) {
            c1761wv = AbstractC1044gv.n(e3);
        } else {
            C0954ev c0954ev = AbstractC1044gv.f13676l;
            c1761wv = C1761wv.f16184o;
        }
        this.f15232o = c1761wv;
        return e3 == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x011d, code lost:
    
        if (r2.f15076d.f7500a.f16208h != 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x011f, code lost:
    
        r34.f15211A = r3 - 8;
        ((com.google.android.gms.internal.ads.B) r35).k(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0139, code lost:
    
        if ("audio/ac4".equals(r2.f15076d.f7500a.f16207g.f14904m) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x013b, code lost:
    
        r34.f15212B = r2.b(r34.f15211A, 7);
        r3 = r34.f15211A;
        r8 = r34.i;
        com.google.android.gms.internal.ads.AbstractC1561sb.d(r3, r8);
        r5.c(7, r8);
        r3 = r34.f15212B + 7;
        r34.f15212B = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x015c, code lost:
    
        r34.f15211A += r3;
        r34.f15233p = 4;
        r34.f15213C = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0154, code lost:
    
        r3 = r2.b(r34.f15211A, 0);
        r34.f15212B = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00d1, code lost:
    
        r3 = r6.f16531h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0166, code lost:
    
        r3 = r2.f15076d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x016a, code lost:
    
        if (r2.f15082l != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x016c, code lost:
    
        r7 = r3.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0179, code lost:
    
        r3 = r3.f7500a;
        r6 = r3.f16210k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x017d, code lost:
    
        if (r6 != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x017f, code lost:
    
        r3 = r34.f15212B;
        r4 = r34.f15211A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0183, code lost:
    
        if (r3 >= r4) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0185, code lost:
    
        r34.f15212B += r5.b(r35, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0190, code lost:
    
        r31 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02cd, code lost:
    
        r26 = r31.a();
        r0 = r31.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02d5, code lost:
    
        if (r0 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02d7, code lost:
    
        r29 = r0.f16379c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02de, code lost:
    
        r24 = r7;
        r5.d(r24, r26, r34.f15211A, 0, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02ef, code lost:
    
        if (r14.isEmpty() != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02f1, code lost:
    
        r0 = (com.google.android.gms.internal.ads.C1409p1) r14.removeFirst();
        r34.f15239v -= r0.f14931c;
        r2 = r0.f14930b;
        r3 = r0.f14929a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0302, code lost:
    
        if (r2 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0304, code lost:
    
        r3 = r3 + r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0306, code lost:
    
        r6 = r3;
        r2 = r34.f15217G;
        r3 = r2.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x030b, code lost:
    
        if (r4 >= r3) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x030d, code lost:
    
        r2[r4].d(r6, 1, r0.f14931c, r34.f15239v, null);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x031f, code lost:
    
        if (r31.e() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0321, code lost:
    
        r34.f15243z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02dc, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0194, code lost:
    
        r11 = r34.f;
        r12 = r11.f15724a;
        r12[0] = 0;
        r12[1] = 0;
        r12[r18] = 0;
        r15 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01aa, code lost:
    
        if (r34.f15212B >= r34.f15211A) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01ac, code lost:
    
        r4 = r34.f15213C;
        r9 = r3.f16207g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b2, code lost:
    
        if (r4 != 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01b4, code lost:
    
        r17 = r3;
        ((com.google.android.gms.internal.ads.B) r35).F(r12, r6, r15, false);
        r11.j(0);
        r4 = r11.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01c4, code lost:
    
        if (r4 <= 0) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01c6, code lost:
    
        r34.f15213C = r4 - 1;
        r4 = r34.f15224e;
        r4.j(0);
        r5.c(4, r4);
        r5.c(1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01de, code lost:
    
        if (r34.f15218H.length <= 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01e0, code lost:
    
        r4 = r12[4];
        r9 = r9.f14904m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01e8, code lost:
    
        if ("video/avc".equals(r9) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01ea, code lost:
    
        r18 = r4;
        r21 = r6;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01f1, code lost:
    
        if ((r18 & 31) == 6) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01f4, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0212, code lost:
    
        r34.f15215E = r4;
        r34.f15212B += 5;
        r34.f15211A += r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0222, code lost:
    
        if (r34.f15214D != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0230, code lost:
    
        if (java.util.Objects.equals(r2.f15076d.f7500a.f16207g.f14904m, "video/avc") == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x023a, code lost:
    
        if (com.google.android.gms.internal.ads.AbstractC1668us.h0(r12[4]) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x023c, code lost:
    
        r34.f15214D = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x023f, code lost:
    
        r3 = r17;
        r6 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01ff, code lost:
    
        if ("video/hevc".equals(r9) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0209, code lost:
    
        if (((r18 & 126) >> 1) != 39) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x020c, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01f6, code lost:
    
        r18 = r4;
        r21 = r6;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x020e, code lost:
    
        r21 = r6;
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x024e, code lost:
    
        throw com.google.android.gms.internal.ads.B7.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x024f, code lost:
    
        r17 = r3;
        r21 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0256, code lost:
    
        if (r34.f15215E == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0258, code lost:
    
        r3 = r34.f15225g;
        r3.g(r4);
        r31 = r2;
        r23 = r11;
        ((com.google.android.gms.internal.ads.B) r35).F(r3.f15724a, 0, r34.f15213C, false);
        r5.c(r34.f15213C, r3);
        r2 = r34.f15213C;
        r4 = com.google.android.gms.internal.ads.AbstractC1668us.v(r3.f15726c, r3.f15724a);
        r3.j("video/hevc".equals(r9.f14904m) ? 1 : 0);
        r3.i(r4);
        r4 = r9.f14906o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x028a, code lost:
    
        if (r4 == (-1)) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x028e, code lost:
    
        if (r4 == r10.f14376k) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0290, code lost:
    
        if (r4 < 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0292, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0295, code lost:
    
        com.google.android.gms.internal.ads.AbstractC1668us.a0(r6);
        r10.f14376k = r4;
        r10.f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0294, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x029d, code lost:
    
        r10.d(r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02a6, code lost:
    
        if ((r31.a() & 5) == 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02a8, code lost:
    
        r10.f(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02b8, code lost:
    
        r34.f15212B += r2;
        r34.f15213C -= r2;
        r3 = r17;
        r6 = r21;
        r11 = r23;
        r2 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02af, code lost:
    
        r31 = r2;
        r23 = r11;
        r2 = r5.b(r35, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0173, code lost:
    
        r7 = r6.i[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ba, code lost:
    
        r3 = r34.f15233p;
        r5 = r2.f15073a;
        r6 = r2.f15074b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c2, code lost:
    
        if (r3 != 3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c6, code lost:
    
        if (r2.f15082l != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c8, code lost:
    
        r3 = r2.f15076d.f7503d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d7, code lost:
    
        r34.f15211A = r3;
        r34.f15214D = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e0, code lost:
    
        if (r2.f >= r2.i) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e2, code lost:
    
        ((com.google.android.gms.internal.ads.B) r35).k(r3);
        r0 = r2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00eb, code lost:
    
        if (r0 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ee, code lost:
    
        r3 = r6.f16536n;
        r0 = r0.f16380d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f2, code lost:
    
        if (r0 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f4, code lost:
    
        r3.k(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f7, code lost:
    
        r0 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00fb, code lost:
    
        if (r6.f16533k == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0101, code lost:
    
        if (r6.f16534l[r0] == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0103, code lost:
    
        r3.k(r3.z() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x010f, code lost:
    
        if (r2.e() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0111, code lost:
    
        r34.f15243z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0326, code lost:
    
        r34.f15233p = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x032a, code lost:
    
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(G g5, C0072a c0072a) {
        String G5;
        String G6;
        long j5;
        long D5;
        long j6;
        long j7;
        long E5;
        long E6;
        char c5;
        loop0: while (true) {
            while (true) {
                int i = this.f15233p;
                ArrayDeque arrayDeque = this.f15229l;
                SparseArray sparseArray = this.f15223d;
                C1245lH c1245lH = this.f15231n;
                if (i != 0) {
                    ArrayDeque arrayDeque2 = this.f15230m;
                    if (i != 1) {
                        long j8 = Long.MAX_VALUE;
                        if (i != 2) {
                            C1454q1 c1454q1 = this.f15243z;
                            if (c1454q1 != null) {
                                c5 = 2;
                                break loop0;
                            }
                            int size = sparseArray.size();
                            c5 = 2;
                            C1454q1 c1454q12 = null;
                            for (int i5 = 0; i5 < size; i5++) {
                                C1454q1 c1454q13 = (C1454q1) sparseArray.valueAt(i5);
                                boolean z3 = c1454q13.f15082l;
                                if (z3 || c1454q13.f != c1454q13.f15076d.f7501b) {
                                    C1858z1 c1858z1 = c1454q13.f15074b;
                                    if (!z3 || c1454q13.f15079h != c1858z1.f16528d) {
                                        long j9 = !z3 ? c1454q13.f15076d.f7502c[c1454q13.f] : c1858z1.f[c1454q13.f15079h];
                                        if (j9 < j8) {
                                            c1454q12 = c1454q13;
                                            j8 = j9;
                                        }
                                    }
                                }
                            }
                            if (c1454q12 == null) {
                                int i6 = (int) (this.f15238u - ((B) g5).f7752n);
                                if (i6 < 0) {
                                    throw B7.a(null, "Offset to end of mdat was negative.");
                                }
                                ((B) g5).k(i6);
                                this.f15233p = 0;
                                this.f15236s = 0;
                            } else {
                                int i7 = (int) ((!c1454q12.f15082l ? c1454q12.f15076d.f7502c[c1454q12.f] : c1454q12.f15074b.f[c1454q12.f15079h]) - ((B) g5).f7752n);
                                if (i7 < 0) {
                                    JB.l("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    i7 = 0;
                                }
                                ((B) g5).k(i7);
                                this.f15243z = c1454q12;
                                c1454q1 = c1454q12;
                            }
                        } else {
                            int size2 = sparseArray.size();
                            C1454q1 c1454q14 = null;
                            for (int i8 = 0; i8 < size2; i8++) {
                                C1858z1 c1858z12 = ((C1454q1) sparseArray.valueAt(i8)).f15074b;
                                if (c1858z12.f16537o) {
                                    long j10 = c1858z12.f16527c;
                                    if (j10 < j8) {
                                        c1454q14 = (C1454q1) sparseArray.valueAt(i8);
                                        j8 = j10;
                                    }
                                }
                            }
                            if (c1454q14 == null) {
                                this.f15233p = 3;
                            } else {
                                int i9 = (int) (j8 - ((B) g5).f7752n);
                                if (i9 < 0) {
                                    throw B7.a(null, "Offset to encryption data was negative.");
                                }
                                B b3 = (B) g5;
                                b3.k(i9);
                                C1858z1 c1858z13 = c1454q14.f15074b;
                                C1617tm c1617tm = c1858z13.f16536n;
                                b3.F(c1617tm.f15724a, 0, c1617tm.f15726c, false);
                                c1858z13.f16536n.j(0);
                                c1858z13.f16537o = false;
                            }
                        }
                    } else {
                        int i10 = ((int) this.f15235r) - this.f15236s;
                        C1617tm c1617tm2 = this.f15237t;
                        if (c1617tm2 != null) {
                            ((B) g5).F(c1617tm2.f15724a, 8, i10, false);
                            int i11 = this.f15234q;
                            C1216kp c1216kp = new C1216kp(i11, c1617tm2);
                            long j11 = ((B) g5).f7752n;
                            if (!arrayDeque.isEmpty()) {
                                ((C0859cp) arrayDeque.peek()).f13045d.add(c1216kp);
                            } else if (i11 == 1936286840) {
                                c1617tm2.j(8);
                                int a5 = AbstractC1274m1.a(c1617tm2.q());
                                c1617tm2.k(4);
                                long D6 = c1617tm2.D();
                                if (a5 == 0) {
                                    E5 = c1617tm2.D();
                                    E6 = c1617tm2.D();
                                } else {
                                    E5 = c1617tm2.E();
                                    E6 = c1617tm2.E();
                                }
                                long j12 = E6 + j11;
                                long j13 = E5;
                                long u5 = AbstractC1260lo.u(j13, 1000000L, D6, RoundingMode.DOWN);
                                c1617tm2.k(2);
                                int z5 = c1617tm2.z();
                                int[] iArr = new int[z5];
                                long[] jArr = new long[z5];
                                long[] jArr2 = new long[z5];
                                long[] jArr3 = new long[z5];
                                long j14 = u5;
                                long j15 = j13;
                                int i12 = 0;
                                while (i12 < z5) {
                                    int q5 = c1617tm2.q();
                                    if ((q5 & Integer.MIN_VALUE) != 0) {
                                        throw B7.a(null, "Unhandled indirect reference");
                                    }
                                    long D7 = c1617tm2.D();
                                    iArr[i12] = q5 & Integer.MAX_VALUE;
                                    jArr[i12] = j12;
                                    jArr3[i12] = j14;
                                    long j16 = j15 + D7;
                                    long[] jArr4 = jArr2;
                                    long[] jArr5 = jArr3;
                                    int i13 = i12;
                                    j14 = AbstractC1260lo.u(j16, 1000000L, D6, RoundingMode.DOWN);
                                    jArr4[i13] = j14 - jArr5[i13];
                                    c1617tm2.k(4);
                                    j12 += iArr[i13];
                                    jArr2 = jArr4;
                                    jArr3 = jArr5;
                                    u5 = u5;
                                    j15 = j16;
                                    i12 = i13 + 1;
                                    jArr = jArr;
                                }
                                Pair create = Pair.create(Long.valueOf(u5), new A(iArr, jArr, jArr2, jArr3));
                                this.f15242y = ((Long) create.first).longValue();
                                this.f15216F.x((U) create.second);
                                this.f15219I = true;
                            } else if (i11 == 1701671783 && this.f15217G.length != 0) {
                                c1617tm2.j(8);
                                int a6 = AbstractC1274m1.a(c1617tm2.q());
                                if (a6 == 0) {
                                    G5 = c1617tm2.G();
                                    G5.getClass();
                                    G6 = c1617tm2.G();
                                    G6.getClass();
                                    long D8 = c1617tm2.D();
                                    long D9 = c1617tm2.D();
                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                    long u6 = AbstractC1260lo.u(D9, 1000000L, D8, roundingMode);
                                    long j17 = this.f15242y;
                                    j5 = j17 != -9223372036854775807L ? j17 + u6 : -9223372036854775807L;
                                    long u7 = AbstractC1260lo.u(c1617tm2.D(), 1000L, D8, roundingMode);
                                    D5 = c1617tm2.D();
                                    j6 = u6;
                                    j7 = u7;
                                } else if (a6 != 1) {
                                    AbstractC0467k.y(a6, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                                } else {
                                    long D10 = c1617tm2.D();
                                    long E7 = c1617tm2.E();
                                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                                    j5 = AbstractC1260lo.u(E7, 1000000L, D10, roundingMode2);
                                    j7 = AbstractC1260lo.u(c1617tm2.D(), 1000L, D10, roundingMode2);
                                    long D11 = c1617tm2.D();
                                    G5 = c1617tm2.G();
                                    G5.getClass();
                                    G6 = c1617tm2.G();
                                    G6.getClass();
                                    D5 = D11;
                                    j6 = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[c1617tm2.o()];
                                c1617tm2.f(bArr, 0, c1617tm2.o());
                                C1390oj c1390oj = this.f15227j;
                                ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c1390oj.f14827l;
                                byteArrayOutputStream.reset();
                                DataOutputStream dataOutputStream = (DataOutputStream) c1390oj.f14828m;
                                try {
                                    dataOutputStream.writeBytes(G5);
                                    dataOutputStream.writeByte(0);
                                    dataOutputStream.writeBytes(G6);
                                    dataOutputStream.writeByte(0);
                                    dataOutputStream.writeLong(j7);
                                    dataOutputStream.writeLong(D5);
                                    dataOutputStream.write(bArr);
                                    dataOutputStream.flush();
                                    C1617tm c1617tm3 = new C1617tm(byteArrayOutputStream.toByteArray());
                                    int o5 = c1617tm3.o();
                                    for (InterfaceC0737a0 interfaceC0737a0 : this.f15217G) {
                                        c1617tm3.j(0);
                                        interfaceC0737a0.c(o5, c1617tm3);
                                    }
                                    if (j5 == -9223372036854775807L) {
                                        arrayDeque2.addLast(new C1409p1(o5, j6, true));
                                        this.f15239v += o5;
                                    } else if (arrayDeque2.isEmpty()) {
                                        for (InterfaceC0737a0 interfaceC0737a02 : this.f15217G) {
                                            interfaceC0737a02.d(j5, 1, o5, 0, null);
                                        }
                                    } else {
                                        arrayDeque2.addLast(new C1409p1(o5, j5, false));
                                        this.f15239v += o5;
                                    }
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3);
                                }
                            }
                        } else {
                            ((B) g5).k(i10);
                        }
                        c(((B) g5).f7752n);
                    }
                } else {
                    int i14 = this.f15236s;
                    C1617tm c1617tm4 = this.f15228k;
                    if (i14 == 0) {
                        if (!((B) g5).F(c1617tm4.f15724a, 0, 8, true)) {
                            c1245lH.f(0);
                            return -1;
                        }
                        this.f15236s = 8;
                        c1617tm4.j(0);
                        this.f15235r = c1617tm4.D();
                        this.f15234q = c1617tm4.q();
                    }
                    long j18 = this.f15235r;
                    if (j18 == 1) {
                        ((B) g5).F(c1617tm4.f15724a, 8, 8, false);
                        this.f15236s += 8;
                        this.f15235r = c1617tm4.E();
                    } else if (j18 == 0) {
                        long j19 = ((B) g5).f7751m;
                        if (j19 == -1) {
                            j19 = !arrayDeque.isEmpty() ? ((C0859cp) arrayDeque.peek()).f13044c : -1L;
                        }
                        if (j19 != -1) {
                            this.f15235r = (j19 - ((B) g5).f7752n) + this.f15236s;
                        }
                    }
                    long j20 = this.f15235r;
                    long j21 = this.f15236s;
                    if (j20 < j21) {
                        throw B7.b("Atom size less than header length (unsupported).");
                    }
                    long j22 = ((B) g5).f7752n - j21;
                    int i15 = this.f15234q;
                    if ((i15 == 1836019558 || i15 == 1835295092) && !this.f15219I) {
                        this.f15216F.x(new J(this.f15241x, j22));
                        this.f15219I = true;
                    }
                    if (this.f15234q == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i16 = 0; i16 < size3; i16++) {
                            C1858z1 c1858z14 = ((C1454q1) sparseArray.valueAt(i16)).f15074b;
                            c1858z14.f16527c = j22;
                            c1858z14.f16526b = j22;
                        }
                    }
                    int i17 = this.f15234q;
                    if (i17 == 1835295092) {
                        this.f15243z = null;
                        this.f15238u = j22 + this.f15235r;
                        this.f15233p = 2;
                    } else if (i17 == 1836019574 || i17 == 1953653099 || i17 == 1835297121 || i17 == 1835626086 || i17 == 1937007212 || i17 == 1836019558 || i17 == 1953653094 || i17 == 1836475768 || i17 == 1701082227) {
                        long j23 = (((B) g5).f7752n + this.f15235r) - 8;
                        arrayDeque.push(new C0859cp(i17, j23));
                        if (this.f15235r == this.f15236s) {
                            c(j23);
                        } else {
                            this.f15233p = 0;
                            this.f15236s = 0;
                        }
                    } else if (i17 == 1751411826 || i17 == 1835296868 || i17 == 1836476516 || i17 == 1936286840 || i17 == 1937011556 || i17 == 1937011827 || i17 == 1668576371 || i17 == 1937011555 || i17 == 1937011578 || i17 == 1937013298 || i17 == 1937007471 || i17 == 1668232756 || i17 == 1937011571 || i17 == 1952867444 || i17 == 1952868452 || i17 == 1953196132 || i17 == 1953654136 || i17 == 1953658222 || i17 == 1886614376 || i17 == 1935763834 || i17 == 1935763823 || i17 == 1936027235 || i17 == 1970628964 || i17 == 1935828848 || i17 == 1936158820 || i17 == 1701606260 || i17 == 1835362404 || i17 == 1701671783) {
                        if (this.f15236s != 8) {
                            throw B7.b("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.f15235r > 2147483647L) {
                            throw B7.b("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        C1617tm c1617tm5 = new C1617tm((int) this.f15235r);
                        System.arraycopy(c1617tm4.f15724a, 0, c1617tm5.f15724a, 0, 8);
                        this.f15237t = c1617tm5;
                        this.f15233p = 1;
                    } else {
                        if (this.f15235r > 2147483647L) {
                            throw B7.b("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f15237t = null;
                        this.f15233p = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        if ((this.f15221b & 32) == 0) {
            h3 = new C0905dr(h3, this.f15220a);
        }
        this.f15216F = h3;
        int i = 0;
        this.f15233p = 0;
        this.f15236s = 0;
        InterfaceC0737a0[] interfaceC0737a0Arr = new InterfaceC0737a0[2];
        this.f15217G = interfaceC0737a0Arr;
        InterfaceC0737a0[] interfaceC0737a0Arr2 = (InterfaceC0737a0[]) AbstractC1260lo.f(0, interfaceC0737a0Arr);
        this.f15217G = interfaceC0737a0Arr2;
        for (InterfaceC0737a0 interfaceC0737a0 : interfaceC0737a0Arr2) {
            interfaceC0737a0.e(K);
        }
        List list = this.f15222c;
        this.f15218H = new InterfaceC0737a0[list.size()];
        int i5 = 100;
        while (i < this.f15218H.length) {
            int i6 = i5 + 1;
            InterfaceC0737a0 w5 = this.f15216F.w(i5, 3);
            w5.e((C1407p) list.get(i));
            this.f15218H[i] = w5;
            i++;
            i5 = i6;
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final /* synthetic */ List j() {
        return this.f15232o;
    }
}
