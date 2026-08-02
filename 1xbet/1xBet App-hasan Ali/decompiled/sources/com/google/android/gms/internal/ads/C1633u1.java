package com.google.android.gms.internal.ads;

import B.C0072a;
import a3.AbstractC0467k;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1633u1 implements F, U {

    /* renamed from: A, reason: collision with root package name */
    public int f15762A;

    /* renamed from: a, reason: collision with root package name */
    public final O1 f15763a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15764b;

    /* renamed from: c, reason: collision with root package name */
    public final C1617tm f15765c;

    /* renamed from: d, reason: collision with root package name */
    public final C1617tm f15766d;

    /* renamed from: e, reason: collision with root package name */
    public final C1617tm f15767e;
    public final C1617tm f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f15768g;

    /* renamed from: h, reason: collision with root package name */
    public final C1723w1 f15769h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public C1761wv f15770j;

    /* renamed from: k, reason: collision with root package name */
    public int f15771k;

    /* renamed from: l, reason: collision with root package name */
    public int f15772l;

    /* renamed from: m, reason: collision with root package name */
    public long f15773m;

    /* renamed from: n, reason: collision with root package name */
    public int f15774n;

    /* renamed from: o, reason: collision with root package name */
    public C1617tm f15775o;

    /* renamed from: p, reason: collision with root package name */
    public int f15776p;

    /* renamed from: q, reason: collision with root package name */
    public int f15777q;

    /* renamed from: r, reason: collision with root package name */
    public int f15778r;

    /* renamed from: s, reason: collision with root package name */
    public int f15779s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15780t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15781u;

    /* renamed from: v, reason: collision with root package name */
    public H f15782v;

    /* renamed from: w, reason: collision with root package name */
    public C1588t1[] f15783w;

    /* renamed from: x, reason: collision with root package name */
    public long[][] f15784x;

    /* renamed from: y, reason: collision with root package name */
    public int f15785y;

    /* renamed from: z, reason: collision with root package name */
    public long f15786z;

    public C1633u1() {
        this(O1.f, 16);
    }

    @Override // com.google.android.gms.internal.ads.U
    public final long a() {
        return this.f15786z;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec A[EDGE_INSN: B:71:0x00ec->B:72:0x00ec BREAK  A[LOOP:1: B:28:0x0069->B:60:0x00e2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0101  */
    @Override // com.google.android.gms.internal.ads.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T c(long j5) {
        long j6;
        long j7;
        long j8;
        long j9;
        int i;
        C1588t1[] c1588t1Arr;
        int i5;
        long j10;
        int[] iArr;
        int i6;
        long j11;
        int a5;
        C1588t1[] c1588t1Arr2 = this.f15783w;
        int length = c1588t1Arr2.length;
        V v4 = V.f11847c;
        if (length == 0) {
            return new T(v4, v4);
        }
        int i7 = this.f15785y;
        boolean z3 = false;
        int i8 = -1;
        if (i7 != -1) {
            A1 a12 = c1588t1Arr2[i7].f15625b;
            long[] jArr = a12.f;
            int j12 = AbstractC1260lo.j(jArr, j5, false);
            while (true) {
                if (j12 < 0) {
                    j12 = -1;
                    break;
                }
                if ((a12.f7505g[j12] & 1) != 0) {
                    break;
                }
                j12--;
            }
            if (j12 == -1) {
                j12 = a12.a(j5);
            }
            if (j12 == -1) {
                return new T(v4, v4);
            }
            j7 = jArr[j12];
            long[] jArr2 = a12.f7502c;
            j6 = jArr2[j12];
            if (j7 < j5 && j12 < a12.f7501b - 1 && (a5 = a12.a(j5)) != -1 && a5 != j12) {
                j8 = jArr[a5];
                j9 = jArr2[a5];
                i = 0;
                long j13 = j6;
                while (true) {
                    c1588t1Arr = this.f15783w;
                    if (i < c1588t1Arr.length) {
                        break;
                    }
                    if (i != this.f15785y) {
                        A1 a13 = c1588t1Arr[i].f15625b;
                        long[] jArr3 = a13.f;
                        int j14 = AbstractC1260lo.j(jArr3, j7, z3);
                        while (true) {
                            iArr = a13.f7505g;
                            if (j14 < 0) {
                                i6 = i8;
                                break;
                            }
                            if ((iArr[j14] & 1) != 0) {
                                i6 = j14;
                                break;
                            }
                            j14--;
                        }
                        if (i6 == i8) {
                            i6 = a13.a(j7);
                        }
                        long[] jArr4 = a13.f7502c;
                        if (i6 == i8) {
                            j11 = j9;
                        } else {
                            j11 = j9;
                            j13 = Math.min(jArr4[i6], j13);
                        }
                        if (j8 != -9223372036854775807L) {
                            int j15 = AbstractC1260lo.j(jArr3, j8, false);
                            while (true) {
                                if (j15 < 0) {
                                    j15 = -1;
                                    break;
                                }
                                if ((iArr[j15] & 1) != 0) {
                                    break;
                                }
                                j15--;
                            }
                            i5 = -1;
                            if (j15 == -1) {
                                j15 = a13.a(j8);
                            }
                            j10 = j15 == -1 ? j11 : Math.min(jArr4[j15], j11);
                        } else {
                            j10 = j11;
                            i5 = -1;
                        }
                    } else {
                        i5 = i8;
                        j10 = j9;
                    }
                    i++;
                    long j16 = j10;
                    i8 = i5;
                    j9 = j16;
                    z3 = false;
                }
                long j17 = j9;
                V v5 = new V(j7, j13);
                return j8 != -9223372036854775807L ? new T(v5, v5) : new T(v5, new V(j8, j17));
            }
        } else {
            j6 = Long.MAX_VALUE;
            j7 = j5;
        }
        j8 = -9223372036854775807L;
        j9 = -1;
        i = 0;
        long j132 = j6;
        while (true) {
            c1588t1Arr = this.f15783w;
            if (i < c1588t1Arr.length) {
            }
            i++;
            long j162 = j10;
            i8 = i5;
            j9 = j162;
            z3 = false;
        }
        long j172 = j9;
        V v52 = new V(j7, j132);
        if (j8 != -9223372036854775807L) {
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void d(long j5, long j6) {
        this.f15768g.clear();
        this.f15774n = 0;
        this.f15776p = -1;
        this.f15777q = 0;
        this.f15778r = 0;
        this.f15779s = 0;
        this.f15780t = true;
        if (j5 == 0) {
            if (this.f15771k != 3) {
                k();
                return;
            }
            C1723w1 c1723w1 = this.f15769h;
            c1723w1.f16085a.clear();
            c1723w1.f16086b = 0;
            this.i.clear();
            return;
        }
        for (C1588t1 c1588t1 : this.f15783w) {
            A1 a12 = c1588t1.f15625b;
            int j7 = AbstractC1260lo.j(a12.f, j6, false);
            while (true) {
                if (j7 < 0) {
                    j7 = -1;
                    break;
                } else if ((a12.f7505g[j7] & 1) != 0) {
                    break;
                } else {
                    j7--;
                }
            }
            if (j7 == -1) {
                j7 = a12.a(j6);
            }
            c1588t1.f15628e = j7;
            C0782b0 c0782b0 = c1588t1.f15627d;
            if (c0782b0 != null) {
                c0782b0.f12743b = false;
                c0782b0.f12744c = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final boolean e(G g5) {
        C1761wv c1761wv;
        Y e3 = JB.e(g5, false, false);
        if (e3 != null) {
            c1761wv = AbstractC1044gv.n(e3);
        } else {
            C0954ev c0954ev = AbstractC1044gv.f13676l;
            c1761wv = C1761wv.f16184o;
        }
        this.f15770j = c1761wv;
        return e3 == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0013, code lost:
    
        r11 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0017, code lost:
    
        if (r8 == r7) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0431, code lost:
    
        r4 = r41.f15773m - r41.f15774n;
        r6 = r42.c() + r4;
        r8 = r41.f15775o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x043f, code lost:
    
        if (r8 == null) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0441, code lost:
    
        r42.D(r8.f15724a, r41.f15774n, (int) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x044e, code lost:
    
        if (r41.f15772l != 1718909296) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0450, code lost:
    
        r41.f15781u = true;
        r8.j(8);
        r4 = r8.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0462, code lost:
    
        if (r4 == 1751476579) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0464, code lost:
    
        if (r4 == 1903435808) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0466, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x046b, code lost:
    
        if (r4 == 0) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x046e, code lost:
    
        r8.k(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0476, code lost:
    
        if (r8.o() <= 0) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0478, code lost:
    
        r4 = r8.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x047c, code lost:
    
        if (r4 == 1751476579) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x047e, code lost:
    
        if (r4 == 1903435808) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0480, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0485, code lost:
    
        if (r4 == 0) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0482, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0484, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0488, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0489, code lost:
    
        r41.f15762A = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x048b, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04c5, code lost:
    
        l(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04c8, code lost:
    
        if (r10 == false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04cd, code lost:
    
        if (r41.f15771k == 2) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04cf, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0468, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x046a, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0491, code lost:
    
        if (r9.isEmpty() != false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0493, code lost:
    
        ((com.google.android.gms.internal.ads.C0859cp) r9.peek()).f13045d.add(new com.google.android.gms.internal.ads.C1216kp(r41.f15772l, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04a8, code lost:
    
        if (r41.f15781u != false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04af, code lost:
    
        if (r41.f15772l != 1835295092) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04b1, code lost:
    
        r41.f15762A = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04b6, code lost:
    
        if (r4 >= 262144) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04b8, code lost:
    
        r42.C((int) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x04bd, code lost:
    
        r43.f658a = r42.c() + r4;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x001b, code lost:
    
        if (r8 == 2) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x001d, code lost:
    
        r3 = r41.i;
        r8 = r41.f15769h;
        r9 = r8.f16086b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0023, code lost:
    
        if (r9 == 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0025, code lost:
    
        if (r9 == r7) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0027, code lost:
    
        r15 = r8.f16085a;
        r24 = 8;
        r5 = 2192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0030, code lost:
    
        if (r9 == 2) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0032, code lost:
    
        r18 = r42.c();
        r8 = (int) ((r42.j() - r42.c()) - r8.f16087c);
        r12 = new com.google.android.gms.internal.ads.C1617tm(r8);
        r42.D(r12.f15724a, 0, r8);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0055, code lost:
    
        if (r0 >= r15.size()) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0057, code lost:
    
        r8 = (com.google.android.gms.internal.ads.C1678v1) r15.get(r0);
        r12.j((int) (r8.f15953a - r18));
        r12.k(r4);
        r13 = r12.r();
        r14 = java.nio.charset.StandardCharsets.UTF_8;
        r9 = r12.b(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0076, code lost:
    
        switch(r9.hashCode()) {
            case -1711564334: goto L33;
            case -1332107749: goto L30;
            case -1251387154: goto L27;
            case -830665521: goto L24;
            case 1760745220: goto L21;
            default: goto L36;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0080, code lost:
    
        if (r9.equals("Super_SlowMotion_BGM") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0082, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00ae, code lost:
    
        if (r9 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x00b0, code lost:
    
        if (r9 == r7) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x00b2, code lost:
    
        if (r9 == 2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00b4, code lost:
    
        if (r9 == 3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00b6, code lost:
    
        if (r9 != r4) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x00b8, code lost:
    
        r10 = 2820;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00cd, code lost:
    
        r8 = r8.f15954b - (r13 + 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00d2, code lost:
    
        if (r10 == 2192) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x00d6, code lost:
    
        if (r10 == 2816) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x00da, code lost:
    
        if (r10 == 2817) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x00de, code lost:
    
        if (r10 == 2819) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x00e2, code lost:
    
        if (r10 != 2820) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x00ea, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0157, code lost:
    
        r0 = r0 + (r7 == true ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00eb, code lost:
    
        r10 = new java.util.ArrayList();
        r8 = com.google.android.gms.internal.ads.C1723w1.f16084e.i(r12.b(r8, r14));
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x00ff, code lost:
    
        if (r13 >= r8.size()) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0101, code lost:
    
        r9 = com.google.android.gms.internal.ads.C1723w1.f16083d.i((java.lang.CharSequence) r8.get(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0111, code lost:
    
        if (r9.size() != 3) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0114, code lost:
    
        r10.add(new com.google.android.gms.internal.ads.S0((r7 == true ? 1 : 0) << (java.lang.Integer.parseInt((java.lang.String) r9.get(2)) - 1), java.lang.Long.parseLong((java.lang.String) r9.get(0)), java.lang.Long.parseLong((java.lang.String) r9.get(r7 == true ? 1 : 0))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0140, code lost:
    
        r13 = r13 + (r7 == true ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0142, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0148, code lost:
    
        throw com.google.android.gms.internal.ads.B7.a(r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x014e, code lost:
    
        throw com.google.android.gms.internal.ads.B7.a(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x014f, code lost:
    
        r3.add(new com.google.android.gms.internal.ads.T0(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x00c2, code lost:
    
        throw com.google.android.gms.internal.ads.B7.a(null, "Invalid SEF name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x00c3, code lost:
    
        r10 = 2819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x00c6, code lost:
    
        r10 = 2817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x00c9, code lost:
    
        r10 = 2816;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x00cc, code lost:
    
        r10 = 2192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x008a, code lost:
    
        if (r9.equals("Super_SlowMotion_Deflickering_On") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x008c, code lost:
    
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0094, code lost:
    
        if (r9.equals("Super_SlowMotion_Data") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0096, code lost:
    
        r9 = r7 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x009e, code lost:
    
        if (r9.equals("Super_SlowMotion_Edit_Data") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x00a0, code lost:
    
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x00a8, code lost:
    
        if (r9.equals("SlowMotion_Data") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x00aa, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x00ac, code lost:
    
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x015b, code lost:
    
        r43.f658a = 0;
        r0 = r7 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0252, code lost:
    
        if (r43.f658a != 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0254, code lost:
    
        k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0257, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0162, code lost:
    
        r3 = r42.j();
        r9 = r8.f16087c - 20;
        r10 = new com.google.android.gms.internal.ads.C1617tm(r9);
        r42.D(r10.f15724a, 0, r9);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0178, code lost:
    
        if (r0 >= (r9 / 12)) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x017a, code lost:
    
        r10.k(r11);
        r12 = r10.f15724a;
        r13 = r10.f15725b;
        r14 = r13 + 1;
        r10.f15725b = r14;
        r29 = r7;
        r7 = r12[r13] & 255;
        r10.f15725b = r13 + r11;
        r7 = (short) (r7 | ((r12[r14] & 255) << 8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0196, code lost:
    
        if (r7 == r5) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x019a, code lost:
    
        if (r7 == 2816) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x019e, code lost:
    
        if (r7 == 2817) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x01a4, code lost:
    
        if (r7 == 2819) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x01a6, code lost:
    
        if (r7 == 2820) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x01a8, code lost:
    
        r10.k(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x01d7, code lost:
    
        r0 = r0 + 1;
        r7 = r29 == true ? 1 : 0;
        r5 = 2192;
        r11 = 2;
        r24 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x01bd, code lost:
    
        r15.add(new com.google.android.gms.internal.ads.C1678v1(r10.r(), (r3 - r8.f16087c) - r10.r()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x01e1, code lost:
    
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x01e7, code lost:
    
        if (r15.isEmpty() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x01e9, code lost:
    
        r43.f658a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x01ed, code lost:
    
        r0 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x01f0, code lost:
    
        r8.f16086b = 3;
        r43.f658a = ((com.google.android.gms.internal.ads.C1678v1) r15.get(0)).f15953a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x01fe, code lost:
    
        r29 = r7 == true ? 1 : 0;
        r3 = new com.google.android.gms.internal.ads.C1617tm(8);
        r42.D(r3.f15724a, 0, 8);
        r8.f16087c = r3.r() + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x021b, code lost:
    
        if (r3.q() == 1397048916) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x021d, code lost:
    
        r43.f658a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0222, code lost:
    
        r43.f658a = r42.c() - (r8.f16087c - 12);
        r8.f16086b = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0232, code lost:
    
        r29 = r7 == true ? 1 : 0;
        r3 = r42.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x023a, code lost:
    
        if (r3 == (-1)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x023e, code lost:
    
        if (r3 >= 8) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0243, code lost:
    
        r3 = r3 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0246, code lost:
    
        r43.f658a = r3;
        r0 = r29;
        r8.f16086b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0240, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x025b, code lost:
    
        r5 = r42.c();
        r7 = r41.f15776p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0265, code lost:
    
        if (r7 != (-1)) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0267, code lost:
    
        r9 = -1;
        r10 = -1;
        r11 = 0;
        r12 = true;
        r13 = true;
        r16 = Long.MAX_VALUE;
        r31 = Long.MAX_VALUE;
        r33 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x027b, code lost:
    
        r14 = r41.f15783w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0283, code lost:
    
        if (r11 >= r14.length) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0285, code lost:
    
        r7 = r14[r11];
        r8 = r7.f15628e;
        r7 = r7.f15625b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x028d, code lost:
    
        if (r8 != r7.f7501b) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x02c7, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0292, code lost:
    
        r37 = r7.f7502c[r8];
        r7 = r41.f15784x;
        r14 = com.google.android.gms.internal.ads.AbstractC1260lo.f14419a;
        r39 = r7[r11][r8];
        r37 = r37 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x02a4, code lost:
    
        if (r37 < 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x02a8, code lost:
    
        if (r37 < 262144) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x02ac, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x02ad, code lost:
    
        if (r7 != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x02af, code lost:
    
        if (r12 != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x02b1, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x02b8, code lost:
    
        r12 = r7;
        r10 = r11;
        r33 = r37;
        r31 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x02c0, code lost:
    
        if (r39 >= r16) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x02c2, code lost:
    
        r13 = r7;
        r9 = r11;
        r16 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x02b2, code lost:
    
        if (r7 != r12) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x02b6, code lost:
    
        if (r37 >= r33) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x02aa, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x02cc, code lost:
    
        if (r16 == Long.MAX_VALUE) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x02ce, code lost:
    
        if (r13 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x02d7, code lost:
    
        if (r31 < (r16 + 10485760)) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x02d9, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x02dc, code lost:
    
        r41.f15776p = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x02df, code lost:
    
        if (r7 != (-1)) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x02e1, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x02db, code lost:
    
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x02e2, code lost:
    
        r7 = r41.f15783w[r7];
        r8 = r7.f15626c;
        r9 = r7.f15628e;
        r10 = r7.f15625b;
        r12 = r10.f7502c[r9];
        r11 = r10.f7503d[r9];
        r32 = r4;
        r5 = (r12 - r5) + r41.f15777q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0300, code lost:
    
        if (r5 < 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0304, code lost:
    
        if (r5 < 262144) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0309, code lost:
    
        r2 = r7.f15624a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x030e, code lost:
    
        if (r2.f16208h != 1) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0310, code lost:
    
        r5 = r5 + 8;
        r11 = r11 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0314, code lost:
    
        r42.C((int) r5);
        r3 = r2.f16207g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0322, code lost:
    
        if (java.util.Objects.equals(r3.f14904m, "video/avc") != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0324, code lost:
    
        r4 = 1;
        r41.f15780t = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0329, code lost:
    
        r2 = r2.f16210k;
        r5 = r7.f15627d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x032d, code lost:
    
        if (r2 == 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x032f, code lost:
    
        r3 = r41.f15766d;
        r6 = r3.f15724a;
        r6[0] = 0;
        r6[r4] = 0;
        r6[2] = 0;
        r12 = r2 + 1;
        r4 = 4 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0343, code lost:
    
        if (r41.f15778r >= r11) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0345, code lost:
    
        r2 = r41.f15779s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0347, code lost:
    
        if (r2 != 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0349, code lost:
    
        r42.D(r6, r4, r12);
        r41.f15777q += r12;
        r3.j(0);
        r2 = r3.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0359, code lost:
    
        if (r2 <= 0) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x035b, code lost:
    
        r41.f15779s = r2 - 1;
        r2 = r41.f15765c;
        r2.j(0);
        r13 = r32;
        r8.c(r13, r2);
        r8.c(1, r3);
        r41.f15778r += 5;
        r11 = r11 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0378, code lost:
    
        if (r41.f15780t != false) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0380, code lost:
    
        if (com.google.android.gms.internal.ads.AbstractC1668us.h0(r6[r13]) == false) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0382, code lost:
    
        r41.f15780t = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0384, code lost:
    
        r32 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x038e, code lost:
    
        throw com.google.android.gms.internal.ads.B7.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x038f, code lost:
    
        r2 = r8.b(r42, r2, false);
        r41.f15777q += r2;
        r41.f15778r += r2;
        r41.f15779s -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x03a4, code lost:
    
        r36 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x03e5, code lost:
    
        r33 = r10.f[r9];
        r0 = r10.f7505g[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x03ef, code lost:
    
        if (r41.f15780t != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x03f1, code lost:
    
        r0 = r0 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x03f4, code lost:
    
        r35 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x03f6, code lost:
    
        if (r5 == null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x03f8, code lost:
    
        r5.b(r8, r33, r35, r36, 0, null);
        r4 = 1;
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0409, code lost:
    
        if ((r9 + 1) != r10.f7501b) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x040b, code lost:
    
        r5.a(r8, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x041c, code lost:
    
        r7.f15628e += r4;
        r41.f15776p = -1;
        r41.f15777q = 0;
        r41.f15778r = 0;
        r41.f15779s = 0;
        r41.f15780t = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x042d, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0410, code lost:
    
        r4 = 1;
        r8.d(r33, r35, r36, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x03af, code lost:
    
        if ("audio/ac4".equals(r3.f14904m) == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x03b3, code lost:
    
        if (r41.f15778r != 0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x03b5, code lost:
    
        com.google.android.gms.internal.ads.AbstractC1561sb.d(r11, r15);
        r3 = 7;
        r8.c(7, r15);
        r41.f15778r += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x03c3, code lost:
    
        r11 = r11 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x03ca, code lost:
    
        r2 = r41.f15778r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x03cc, code lost:
    
        if (r2 >= r11) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x03ce, code lost:
    
        r2 = r8.b(r42, r11 - r2, false);
        r41.f15777q += r2;
        r41.f15778r += r2;
        r41.f15779s -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x03c2, code lost:
    
        r3 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x03c5, code lost:
    
        if (r5 == null) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x03c7, code lost:
    
        r5.c(r42);
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0328, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x042e, code lost:
    
        r43.f658a = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0430, code lost:
    
        return 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v85 */
    /* JADX WARN: Type inference failed for: r4v9, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(G g5, C0072a c0072a) {
        int i;
        ?? r42;
        while (true) {
            int i5 = 4;
            int i6 = 1;
            while (true) {
                int i7 = this.f15771k;
                ArrayDeque arrayDeque = this.f15768g;
                C1617tm c1617tm = this.f15767e;
                if (i7 != 0) {
                    break;
                }
                boolean z3 = i6 == true ? 1 : 0;
                int i8 = this.f15774n;
                C1617tm c1617tm2 = this.f;
                if (i8 == 0) {
                    if (!g5.F(c1617tm2.f15724a, 0, 8, z3)) {
                        return -1;
                    }
                    this.f15774n = 8;
                    c1617tm2.j(0);
                    this.f15773m = c1617tm2.D();
                    this.f15772l = c1617tm2.q();
                }
                long j5 = this.f15773m;
                if (j5 == 1) {
                    g5.D(c1617tm2.f15724a, 8, 8);
                    this.f15774n += 8;
                    this.f15773m = c1617tm2.E();
                } else if (j5 == 0) {
                    long j6 = g5.j();
                    if (j6 == -1) {
                        C0859cp c0859cp = (C0859cp) arrayDeque.peek();
                        j6 = c0859cp != null ? c0859cp.f13044c : -1L;
                    }
                    if (j6 != -1) {
                        this.f15773m = (j6 - g5.c()) + this.f15774n;
                    }
                }
                long j7 = this.f15773m;
                int i9 = this.f15774n;
                if (j7 < i9) {
                    throw B7.b("Atom size less than header length (unsupported).");
                }
                int i10 = this.f15772l;
                if (i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473 || i10 == 1701082724) {
                    long c5 = g5.c();
                    long j8 = this.f15773m;
                    long j9 = c5 + j8;
                    long j10 = this.f15774n;
                    if (j8 == j10 || this.f15772l != 1835365473) {
                        i = 4;
                    } else {
                        c1617tm.g(8);
                        g5.E(c1617tm.f15724a, 0, 8);
                        byte[] bArr = AbstractC1274m1.f14455a;
                        int i11 = c1617tm.f15725b;
                        i = 4;
                        c1617tm.k(4);
                        if (c1617tm.q() != 1751411826) {
                            i11 += 4;
                        }
                        c1617tm.j(i11);
                        g5.C(c1617tm.f15725b);
                        g5.h();
                    }
                    long j11 = j9 - j10;
                    arrayDeque.push(new C0859cp(this.f15772l, j11));
                    if (this.f15773m == this.f15774n) {
                        l(j11);
                    } else {
                        k();
                    }
                    i6 = 1;
                    i5 = i;
                } else {
                    if (i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124) {
                        AbstractC1668us.a0(i9 == 8);
                        AbstractC1668us.a0(this.f15773m <= 2147483647L);
                        C1617tm c1617tm3 = new C1617tm((int) this.f15773m);
                        System.arraycopy(c1617tm2.f15724a, 0, c1617tm3.f15724a, 0, 8);
                        this.f15775o = c1617tm3;
                        r42 = true;
                        this.f15771k = 1;
                    } else {
                        long c6 = g5.c();
                        long j12 = this.f15774n;
                        long j13 = c6 - j12;
                        if (this.f15772l == 1836086884) {
                            new R0(0L, j13, -9223372036854775807L, j13 + j12, this.f15773m - j12);
                        }
                        this.f15775o = null;
                        r42 = true;
                        this.f15771k = 1;
                    }
                    i6 = r42;
                    i5 = 4;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.U
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        if ((this.f15764b & 16) == 0) {
            h3 = new C0905dr(h3, this.f15763a);
        }
        this.f15782v = h3;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final /* synthetic */ List j() {
        return this.f15770j;
    }

    public final void k() {
        this.f15771k = 0;
        this.f15774n = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022f, code lost:
    
        if (r5 != 13) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0231, code lost:
    
        r6 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0241, code lost:
    
        if (r6 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0243, code lost:
    
        com.google.android.gms.internal.ads.JB.l("MetadataUtil", "Unrecognized cover art flags: " + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01e0, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0253, code lost:
    
        r3.k(4);
        r2 = r2 - 16;
        r0 = new byte[r2];
        r3.f(r0, 0, r2);
        r0 = new com.google.android.gms.internal.ads.D0(r6, null, 3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0236, code lost:
    
        if (r5 != 14) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0238, code lost:
    
        r6 = "image/png";
        r5 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0240, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0269, code lost:
    
        com.google.android.gms.internal.ads.JB.l("MetadataUtil", "Failed to parse cover art attribute");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0276, code lost:
    
        if (r6 != 1631670868) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0278, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(1631670868, "TPE2", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0283, code lost:
    
        if (r6 != 1936682605) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0285, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(1936682605, "TSOT", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0290, code lost:
    
        if (r6 != 1936679276) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0292, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(1936679276, "TSOA", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x029d, code lost:
    
        if (r6 != 1936679282) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x029f, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(1936679282, "TSOP", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02aa, code lost:
    
        if (r6 != 1936679265) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02ac, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(1936679265, "TSO2", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b7, code lost:
    
        if (r6 != 1936679791) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02b9, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(1936679791, "TSOC", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02c4, code lost:
    
        if (r6 != 1920233063) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02c6, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.C(1920233063, "ITUNESADVISORY", r3, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02d3, code lost:
    
        if (r6 != 1885823344) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d5, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.C(1885823344, "ITUNESGAPLESS", r3, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e1, code lost:
    
        if (r6 != 1936683886) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e3, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(1936683886, "TVSHOWSORT", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02ee, code lost:
    
        if (r6 != 1953919848) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02f0, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(1953919848, "TVSHOW", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02fb, code lost:
    
        if (r6 != 757935405) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02fd, code lost:
    
        r0 = null;
        r6 = null;
        r2 = r16;
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0302, code lost:
    
        r13 = r3.f15725b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0304, code lost:
    
        if (r13 >= r12) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0306, code lost:
    
        r15 = r3.q();
        r7 = r3.q();
        r34 = r5;
        r3.k(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0317, code lost:
    
        if (r7 != 1835360622) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0319, code lost:
    
        r6 = r3.a(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x031f, code lost:
    
        r5 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0323, code lost:
    
        r5 = r15 - 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x032a, code lost:
    
        if (r7 != 1851878757) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x032c, code lost:
    
        r0 = r3.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0334, code lost:
    
        if (r7 != 1684108385) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0339, code lost:
    
        if (r7 != 1684108385) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x033b, code lost:
    
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x033d, code lost:
    
        r3.k(r5);
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0337, code lost:
    
        r15 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0342, code lost:
    
        r34 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0344, code lost:
    
        if (r6 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0346, code lost:
    
        if (r0 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x034a, code lost:
    
        if (r2 != r16) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x034e, code lost:
    
        r3.j(r2);
        r3.k(16);
        r0 = new com.google.android.gms.internal.ads.M0(r6, r0, r3.a(r34 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0410, code lost:
    
        com.google.android.gms.internal.ads.JB.d("MetadataUtil", "Skipped unknown metadata entry: " + com.google.android.gms.internal.ads.AbstractC1665up.b(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x039f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x01bd, code lost:
    
        r5 = com.google.android.gms.internal.ads.L0.a(com.google.android.gms.internal.ads.AbstractC1803xs.r(r3) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01c7, code lost:
    
        if (r5 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01c9, code lost:
    
        r0 = new com.google.android.gms.internal.ads.P0("TCON", null, com.google.android.gms.internal.ads.AbstractC1044gv.n(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01db, code lost:
    
        com.google.android.gms.internal.ads.JB.l("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x01d8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x044c, code lost:
    
        r3.j(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x044f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0369, code lost:
    
        r7 = r6 & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x036e, code lost:
    
        if (r7 != 6516084) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0370, code lost:
    
        r2 = r3.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x037b, code lost:
    
        if (r3.q() != 1684108385) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x037d, code lost:
    
        r3.k(8);
        r0 = r3.a(r2 - 16);
        r0 = new com.google.android.gms.internal.ads.H0("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0392, code lost:
    
        com.google.android.gms.internal.ads.JB.l("MetadataUtil", "Failed to parse comment attribute: ".concat(com.google.android.gms.internal.ads.AbstractC1665up.b(r6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03a8, code lost:
    
        if (r7 == 7233901) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03ad, code lost:
    
        if (r7 != 7631467) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03b4, code lost:
    
        if (r7 == 6516589) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03b9, code lost:
    
        if (r7 != 7828084) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03c0, code lost:
    
        if (r7 != 6578553) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03c2, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(r6, "TDRC", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03cd, code lost:
    
        if (r7 != 4280916) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03cf, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(r6, "TPE1", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03d9, code lost:
    
        if (r7 != 7630703) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03db, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(r6, "TSSE", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03e5, code lost:
    
        if (r7 != 6384738) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03e7, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(r6, "TALB", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03f1, code lost:
    
        if (r7 != 7108978) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03f3, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(r6, "USLT", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03fd, code lost:
    
        if (r7 != 6776174) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03ff, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(r6, "TCON", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0407, code lost:
    
        if (r7 != 6779504) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0409, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(r6, "TIT1", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0425, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(r6, "TCOM", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x042c, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.S(r6, "TIT2", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0450, code lost:
    
        r36 = r0;
        r35 = r2;
        r32 = r7;
        r33 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x045f, code lost:
    
        if (r8.isEmpty() == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0463, code lost:
    
        r6 = new com.google.android.gms.internal.ads.C5(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017e, code lost:
    
        r3.j(r8);
        r3.k(r13);
        r8 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0189, code lost:
    
        r12 = r3.f15725b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018b, code lost:
    
        if (r12 >= r11) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018d, code lost:
    
        r12 = r3.q() + r12;
        r6 = r3.q();
        r32 = r7;
        r7 = (r6 >> 24) & 255;
        r33 = r15;
        r35 = r2;
        r36 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b0, code lost:
    
        if (r7 == 169) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b4, code lost:
    
        if (r7 != 253) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01bb, code lost:
    
        if (r6 != 1735291493) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01e5, code lost:
    
        if (r6 != 1684632427) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e7, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.J(1684632427, "TPOS", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0435, code lost:
    
        if (r0 == null) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0437, code lost:
    
        r8.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x043a, code lost:
    
        r7 = r32;
        r15 = r33;
        r2 = r35;
        r0 = r36;
        r16 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f1, code lost:
    
        if (r6 != 1953655662) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f3, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.J(1953655662, "TRCK", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01fd, code lost:
    
        if (r6 != 1953329263) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ff, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.C(1953329263, "TBPM", r3, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x020c, code lost:
    
        if (r6 != 1668311404) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x020e, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC1803xs.C(1668311404, "TCMP", r3, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0218, code lost:
    
        if (r6 != 1668249202) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x021a, code lost:
    
        r2 = r3.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0225, code lost:
    
        if (r3.q() != 1684108385) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0227, code lost:
    
        r5 = r3.q() & 16777215;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x07c8 A[LOOP:13: B:391:0x07c5->B:393:0x07c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(long j5) {
        int i;
        int i5;
        int i6;
        C5 c5;
        C1216kp e3;
        C5 c52;
        ArrayList arrayList;
        ArrayDeque arrayDeque;
        int i7;
        int i8;
        C5 c53;
        ArrayList d5;
        int i9;
        C1588t1[] c1588t1Arr;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList2;
        C5 c54;
        C5 c55;
        C5 c56;
        int i13;
        ArrayList arrayList3;
        int i14;
        int i15;
        int i16;
        int i17;
        C5 c57;
        ArrayList arrayList4;
        ArrayDeque arrayDeque2;
        int i18;
        int i19;
        C5 c58;
        C5 c59;
        int i20;
        int i21;
        Uo uo;
        int i22 = 4;
        int i23 = 16;
        int i24 = 0;
        int i25 = 1;
        while (true) {
            ArrayDeque arrayDeque3 = this.f15768g;
            if (arrayDeque3.isEmpty() || ((C0859cp) arrayDeque3.peek()).f13044c != j5) {
                break;
            }
            C0859cp c0859cp = (C0859cp) arrayDeque3.pop();
            if (c0859cp.f15911b == 1836019574) {
                C0859cp d6 = c0859cp.d(1835365473);
                new ArrayList();
                int i26 = 8;
                int i27 = 1684108385;
                int i28 = -1;
                if (d6 != null) {
                    byte[] bArr = AbstractC1274m1.f14455a;
                    C1216kp e5 = d6.e(1751411826);
                    C1216kp e6 = d6.e(1801812339);
                    C1216kp e7 = d6.e(1768715124);
                    if (e5 != null && e6 != null && e7 != null) {
                        C1617tm c1617tm = e5.f14290c;
                        c1617tm.j(i23);
                        if (c1617tm.q() == 1835299937) {
                            C1617tm c1617tm2 = e6.f14290c;
                            c1617tm2.j(12);
                            int q5 = c1617tm2.q();
                            String[] strArr = new String[q5];
                            for (int i29 = i24; i29 < q5; i29 += i25) {
                                int q6 = c1617tm2.q();
                                c1617tm2.k(i22);
                                strArr[i29] = c1617tm2.b(q6 - 8, StandardCharsets.UTF_8);
                            }
                            C1617tm c1617tm3 = e7.f14290c;
                            c1617tm3.j(8);
                            ArrayList arrayList5 = new ArrayList();
                            while (c1617tm3.o() > 8) {
                                int q7 = c1617tm3.q() + c1617tm3.f15725b;
                                int q8 = c1617tm3.q() - 1;
                                if (q8 < 0 || q8 >= q5) {
                                    AbstractC0467k.y(q8, "Skipped metadata with unknown key index: ", "BoxParsers");
                                } else {
                                    String str = strArr[q8];
                                    while (true) {
                                        int i30 = c1617tm3.f15725b;
                                        if (i30 >= q7) {
                                            uo = null;
                                            break;
                                        }
                                        int q9 = c1617tm3.q();
                                        if (c1617tm3.q() == i27) {
                                            int q10 = c1617tm3.q();
                                            int q11 = c1617tm3.q();
                                            int i31 = q9 - 16;
                                            byte[] bArr2 = new byte[i31];
                                            c1617tm3.f(bArr2, i24, i31);
                                            uo = new Uo(str, bArr2, q11, q10);
                                            break;
                                        }
                                        c1617tm3.j(i30 + q9);
                                        i27 = 1684108385;
                                    }
                                    if (uo != null) {
                                        arrayList5.add(uo);
                                    }
                                }
                                c1617tm3.j(q7);
                                i27 = 1684108385;
                            }
                            if (!arrayList5.isEmpty()) {
                                c5 = new C5(arrayList5);
                                ArrayList arrayList6 = new ArrayList();
                                int i32 = this.f15762A != i25 ? i25 : i24;
                                N n5 = new N();
                                e3 = c0859cp.e(1969517665);
                                if (e3 == null) {
                                    byte[] bArr3 = AbstractC1274m1.f14455a;
                                    C1617tm c1617tm4 = e3.f14290c;
                                    c1617tm4.j(8);
                                    c53 = new C5(-9223372036854775807L, new InterfaceC1592t5[i24]);
                                    while (c1617tm4.o() >= i26) {
                                        int i33 = c1617tm4.f15725b;
                                        int q12 = c1617tm4.q() + i33;
                                        int q13 = c1617tm4.q();
                                        if (q13 == 1835365473) {
                                            c1617tm4.j(i33);
                                            c1617tm4.k(i26);
                                            int i34 = c1617tm4.f15725b;
                                            c1617tm4.k(4);
                                            if (c1617tm4.q() != 1751411826) {
                                                i34 += 4;
                                            }
                                            c1617tm4.j(i34);
                                            while (true) {
                                                int i35 = c1617tm4.f15725b;
                                                if (i35 >= q12) {
                                                    c57 = c5;
                                                    arrayList4 = arrayList6;
                                                    arrayDeque2 = arrayDeque3;
                                                    i18 = i32;
                                                    break;
                                                }
                                                int q14 = c1617tm4.q() + i35;
                                                if (c1617tm4.q() == 1768715124) {
                                                    break;
                                                }
                                                c1617tm4.j(q14);
                                                i26 = 8;
                                                i28 = -1;
                                            }
                                            C5 c510 = null;
                                            c53 = c53.b(c510);
                                            i19 = 8;
                                        } else {
                                            c57 = c5;
                                            arrayList4 = arrayList6;
                                            arrayDeque2 = arrayDeque3;
                                            i18 = i32;
                                            if (q13 == 1936553057) {
                                                c1617tm4.j(i33);
                                                c1617tm4.k(12);
                                                while (true) {
                                                    int i36 = c1617tm4.f15725b;
                                                    if (i36 >= q12) {
                                                        i19 = 8;
                                                        break;
                                                    }
                                                    int q15 = c1617tm4.q();
                                                    if (c1617tm4.q() != 1935766900) {
                                                        c1617tm4.j(i36 + q15);
                                                    } else if (q15 < 16) {
                                                        c59 = null;
                                                        i19 = 8;
                                                    } else {
                                                        c1617tm4.k(4);
                                                        int i37 = -1;
                                                        int i38 = 0;
                                                        int i39 = 0;
                                                        while (i38 < 2) {
                                                            int v4 = c1617tm4.v();
                                                            int v5 = c1617tm4.v();
                                                            if (v4 == 0) {
                                                                i37 = v5;
                                                                i21 = 1;
                                                            } else {
                                                                i21 = 1;
                                                                if (v4 == 1) {
                                                                    i39 = v5;
                                                                }
                                                            }
                                                            i38 += i21;
                                                        }
                                                        if (i37 == 12) {
                                                            i20 = 240;
                                                        } else if (i37 == 13) {
                                                            i20 = 120;
                                                        } else if (i37 != 21) {
                                                            i20 = -2147483647;
                                                        } else {
                                                            i19 = 8;
                                                            if (c1617tm4.o() >= 8) {
                                                                if (c1617tm4.f15725b + 8 > q12) {
                                                                    i20 = -2147483647;
                                                                    if (i20 != -2147483647) {
                                                                        c59 = new C5(-9223372036854775807L, new V0(i39, i20));
                                                                    }
                                                                } else {
                                                                    int q16 = c1617tm4.q();
                                                                    int q17 = c1617tm4.q();
                                                                    if (q16 >= 12 && q17 == 1936877170) {
                                                                        i20 = c1617tm4.w();
                                                                        if (i20 != -2147483647) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            i20 = -2147483647;
                                                            if (i20 != -2147483647) {
                                                            }
                                                        }
                                                        i19 = 8;
                                                        if (i20 != -2147483647) {
                                                        }
                                                    }
                                                }
                                                c59 = null;
                                                c53 = c53.b(c59);
                                            } else {
                                                i19 = 8;
                                                if (q13 == -1451722374) {
                                                    short d7 = c1617tm4.d();
                                                    c1617tm4.k(2);
                                                    String b3 = c1617tm4.b(d7, StandardCharsets.UTF_8);
                                                    int max = Math.max(b3.lastIndexOf(43), b3.lastIndexOf(45));
                                                    try {
                                                        i28 = -1;
                                                    } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                                        i28 = -1;
                                                    }
                                                    try {
                                                        c58 = new C5(-9223372036854775807L, new Hp(Float.parseFloat(b3.substring(0, max)), Float.parseFloat(b3.substring(max, b3.length() - 1))));
                                                    } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                                                        c58 = null;
                                                        c53 = c53.b(c58);
                                                        c1617tm4.j(q12);
                                                        i26 = i19;
                                                        arrayDeque3 = arrayDeque2;
                                                        i32 = i18;
                                                        arrayList6 = arrayList4;
                                                        c5 = c57;
                                                    }
                                                    c53 = c53.b(c58);
                                                    c1617tm4.j(q12);
                                                    i26 = i19;
                                                    arrayDeque3 = arrayDeque2;
                                                    i32 = i18;
                                                    arrayList6 = arrayList4;
                                                    c5 = c57;
                                                }
                                            }
                                        }
                                        i28 = -1;
                                        c1617tm4.j(q12);
                                        i26 = i19;
                                        arrayDeque3 = arrayDeque2;
                                        i32 = i18;
                                        arrayList6 = arrayList4;
                                        c5 = c57;
                                    }
                                    c52 = c5;
                                    arrayList = arrayList6;
                                    arrayDeque = arrayDeque3;
                                    i7 = i26;
                                    i8 = i32;
                                    n5.a(c53);
                                } else {
                                    c52 = c5;
                                    arrayList = arrayList6;
                                    arrayDeque = arrayDeque3;
                                    i7 = 8;
                                    i8 = i32;
                                    c53 = null;
                                }
                                C1216kp e8 = c0859cp.e(1836476516);
                                e8.getClass();
                                long j6 = -9223372036854775807L;
                                C5 c511 = new C5(-9223372036854775807L, AbstractC1274m1.b(e8.f14290c));
                                int i40 = i28;
                                d5 = AbstractC1274m1.d(c0859cp, n5, -9223372036854775807L, null, false, i8, new C1364o1(1));
                                int i41 = i40;
                                long j7 = -9223372036854775807L;
                                i9 = 0;
                                int i42 = 0;
                                while (i9 < d5.size()) {
                                    A1 a12 = (A1) d5.get(i9);
                                    if (a12.f7501b == 0) {
                                        c54 = c511;
                                        arrayList2 = d5;
                                        c55 = c53;
                                        i12 = i42;
                                        arrayList3 = arrayList;
                                        c56 = c52;
                                        i13 = i40;
                                    } else {
                                        H h3 = this.f15782v;
                                        i12 = i42 + 1;
                                        long j8 = j6;
                                        C1768x1 c1768x1 = a12.f7500a;
                                        InterfaceC0737a0 w5 = h3.w(i42, c1768x1.f16203b);
                                        C1588t1 c1588t1 = new C1588t1(c1768x1, a12, w5);
                                        arrayList2 = d5;
                                        long j9 = c1768x1.f16206e;
                                        if (j9 == j8) {
                                            j9 = a12.f7506h;
                                        }
                                        w5.getClass();
                                        j7 = Math.max(j7, j9);
                                        C1407p c1407p = c1768x1.f16207g;
                                        c54 = c511;
                                        boolean equals = "audio/true-hd".equals(c1407p.f14904m);
                                        int i43 = a12.f7504e;
                                        int i44 = equals ? i43 * 16 : i43 + 30;
                                        C1649uH c1649uH = new C1649uH(c1407p);
                                        c1649uH.f15849m = i44;
                                        int i45 = c1768x1.f16203b;
                                        if (i45 == 2) {
                                            int i46 = this.f15764b & 8;
                                            c55 = c53;
                                            int i47 = c1407p.f;
                                            if (i46 != 0) {
                                                i47 |= i41 == -1 ? 1 : 2;
                                            }
                                            if (c1407p.f14913v == -1.0f && j9 > 0 && (i17 = a12.f7501b) > 0) {
                                                c1649uH.f15857u = i17 / (j9 / 1000000.0f);
                                            }
                                            c1649uH.f = i47;
                                        } else {
                                            c55 = c53;
                                        }
                                        if (i45 == 1 && (i15 = n5.f10758a) != -1 && (i16 = n5.f10759b) != -1) {
                                            c1649uH.f15834D = i15;
                                            c1649uH.f15835E = i16;
                                        }
                                        ArrayList arrayList7 = this.i;
                                        C5[] c5Arr = {arrayList7.isEmpty() ? null : new C5(arrayList7), c55, c54};
                                        C5 c512 = new C5(j8, new InterfaceC1592t5[0]);
                                        c56 = c52;
                                        if (c52 != null) {
                                            int i48 = 0;
                                            while (true) {
                                                InterfaceC1592t5[] interfaceC1592t5Arr = c56.f7964k;
                                                if (i48 >= interfaceC1592t5Arr.length) {
                                                    break;
                                                }
                                                InterfaceC1592t5 interfaceC1592t5 = interfaceC1592t5Arr[i48];
                                                if (interfaceC1592t5 instanceof Uo) {
                                                    Uo uo2 = (Uo) interfaceC1592t5;
                                                    i14 = i48;
                                                    if (!uo2.f11818k.equals("com.android.capture.fps")) {
                                                        c512 = c512.a(uo2);
                                                    } else if (i45 == 2) {
                                                        c512 = c512.a(uo2);
                                                    }
                                                    i48 = i14 + 1;
                                                } else {
                                                    i14 = i48;
                                                }
                                                i48 = i14 + 1;
                                            }
                                        }
                                        boolean z3 = true;
                                        int i49 = 0;
                                        while (i49 < 3) {
                                            c512 = c512.b(c5Arr[i49]);
                                            i49++;
                                            z3 = true;
                                        }
                                        if (c512.f7964k.length > 0) {
                                            c1649uH.f15846j = c512;
                                        }
                                        c1588t1.f15626c.e(new C1407p(c1649uH));
                                        if (i45 == 2) {
                                            i13 = -1;
                                            if (i41 == -1) {
                                                i41 = arrayList.size();
                                            }
                                        } else {
                                            i13 = -1;
                                        }
                                        arrayList3 = arrayList;
                                        arrayList3.add(c1588t1);
                                    }
                                    i9++;
                                    arrayList = arrayList3;
                                    c52 = c56;
                                    i40 = i13;
                                    d5 = arrayList2;
                                    i42 = i12;
                                    c511 = c54;
                                    c53 = c55;
                                    j6 = -9223372036854775807L;
                                }
                                int i50 = i40;
                                i = 16;
                                this.f15785y = i41;
                                this.f15786z = j7;
                                c1588t1Arr = (C1588t1[]) arrayList.toArray(new C1588t1[0]);
                                this.f15783w = c1588t1Arr;
                                int length = c1588t1Arr.length;
                                long[][] jArr = new long[length][];
                                int[] iArr = new int[length];
                                long[] jArr2 = new long[length];
                                boolean[] zArr = new boolean[length];
                                for (i10 = 0; i10 < c1588t1Arr.length; i10++) {
                                    jArr[i10] = new long[c1588t1Arr[i10].f15625b.f7501b];
                                    jArr2[i10] = c1588t1Arr[i10].f15625b.f[0];
                                }
                                i5 = 0;
                                long j10 = 0;
                                i11 = 0;
                                while (i11 < c1588t1Arr.length) {
                                    long j11 = Long.MAX_VALUE;
                                    int i51 = i50;
                                    for (int i52 = 0; i52 < c1588t1Arr.length; i52++) {
                                        if (!zArr[i52]) {
                                            long j12 = jArr2[i52];
                                            if (j12 <= j11) {
                                                i51 = i52;
                                                j11 = j12;
                                            }
                                        }
                                    }
                                    int i53 = iArr[i51];
                                    long[] jArr3 = jArr[i51];
                                    jArr3[i53] = j10;
                                    A1 a13 = c1588t1Arr[i51].f15625b;
                                    j10 += a13.f7503d[i53];
                                    int i54 = i53 + 1;
                                    iArr[i51] = i54;
                                    if (i54 < jArr3.length) {
                                        jArr2[i51] = a13.f[i54];
                                    } else {
                                        zArr[i51] = true;
                                        i11++;
                                    }
                                }
                                i6 = 1;
                                this.f15784x = jArr;
                                this.f15782v.v();
                                this.f15782v.x(this);
                                arrayDeque.clear();
                                this.f15771k = 2;
                            }
                        }
                    }
                }
                c5 = null;
                ArrayList arrayList62 = new ArrayList();
                if (this.f15762A != i25) {
                }
                N n52 = new N();
                e3 = c0859cp.e(1969517665);
                if (e3 == null) {
                }
                C1216kp e82 = c0859cp.e(1836476516);
                e82.getClass();
                long j62 = -9223372036854775807L;
                C5 c5112 = new C5(-9223372036854775807L, AbstractC1274m1.b(e82.f14290c));
                int i402 = i28;
                d5 = AbstractC1274m1.d(c0859cp, n52, -9223372036854775807L, null, false, i8, new C1364o1(1));
                int i412 = i402;
                long j72 = -9223372036854775807L;
                i9 = 0;
                int i422 = 0;
                while (i9 < d5.size()) {
                }
                int i502 = i402;
                i = 16;
                this.f15785y = i412;
                this.f15786z = j72;
                c1588t1Arr = (C1588t1[]) arrayList.toArray(new C1588t1[0]);
                this.f15783w = c1588t1Arr;
                int length2 = c1588t1Arr.length;
                long[][] jArr4 = new long[length2][];
                int[] iArr2 = new int[length2];
                long[] jArr22 = new long[length2];
                boolean[] zArr2 = new boolean[length2];
                while (i10 < c1588t1Arr.length) {
                }
                i5 = 0;
                long j102 = 0;
                i11 = 0;
                while (i11 < c1588t1Arr.length) {
                }
                i6 = 1;
                this.f15784x = jArr4;
                this.f15782v.v();
                this.f15782v.x(this);
                arrayDeque.clear();
                this.f15771k = 2;
            } else {
                i = i23;
                i5 = i24;
                i6 = i25;
                if (!arrayDeque3.isEmpty()) {
                    ((C0859cp) arrayDeque3.peek()).f13046e.add(c0859cp);
                }
            }
            i23 = i;
            i24 = i5;
            i25 = i6;
            i22 = 4;
        }
        if (this.f15771k != 2) {
            k();
        }
    }

    public C1633u1(O1 o12, int i) {
        this.f15763a = o12;
        this.f15764b = i;
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        this.f15770j = C1761wv.f16184o;
        this.f15771k = 0;
        this.f15769h = new C1723w1();
        this.i = new ArrayList();
        this.f = new C1617tm(16);
        this.f15768g = new ArrayDeque();
        this.f15765c = new C1617tm(AbstractC1668us.f15916a);
        this.f15766d = new C1617tm(5);
        this.f15767e = new C1617tm();
        this.f15776p = -1;
        this.f15782v = H.f9296e;
        this.f15783w = new C1588t1[0];
        this.f15780t = true;
    }
}
