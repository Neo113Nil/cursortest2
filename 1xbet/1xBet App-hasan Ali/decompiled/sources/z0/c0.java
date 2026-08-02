package z0;

import A0.W0;
import com.google.android.gms.internal.ads.DF;
import java.util.HashSet;
import r.C2315A;
import w0.AbstractC2540a;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2731G f21766a;

    /* renamed from: b, reason: collision with root package name */
    public final C2745b0 f21767b;

    /* renamed from: c, reason: collision with root package name */
    public final C2761s f21768c;

    /* renamed from: d, reason: collision with root package name */
    public e0 f21769d;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f21770e;
    public b0.o f;

    /* renamed from: g, reason: collision with root package name */
    public R.e f21771g;

    /* renamed from: h, reason: collision with root package name */
    public R.e f21772h;
    public final R.e i;

    /* renamed from: j, reason: collision with root package name */
    public DF f21773j;

    public c0(C2731G c2731g) {
        this.f21766a = c2731g;
        C2745b0 c2745b0 = new C2745b0();
        c2745b0.f7165n = -1;
        this.f21767b = c2745b0;
        C2761s c2761s = new C2761s(c2731g);
        this.f21768c = c2761s;
        this.f21769d = c2761s;
        x0 x0Var = c2761s.f21856Y;
        this.f21770e = x0Var;
        this.f = x0Var;
        this.i = new R.e(new b0.p[16]);
    }

    public static final void a(c0 c0Var, b0.o oVar, e0 e0Var) {
        c0Var.getClass();
        for (b0.o oVar2 = oVar.f7166o; oVar2 != null; oVar2 = oVar2.f7166o) {
            if (oVar2 == c0Var.f21767b) {
                C2731G u5 = c0Var.f21766a.u();
                e0Var.f21795A = u5 != null ? u5.f21612O.f21768c : null;
                c0Var.f21769d = e0Var;
                return;
            } else {
                if ((oVar2.f7164m & 2) != 0) {
                    return;
                }
                oVar2.x0(e0Var);
            }
        }
    }

    public static b0.o b(b0.n nVar, b0.o oVar) {
        b0.o oVar2;
        if (nVar instanceof Z) {
            oVar2 = ((Z) nVar).i();
            oVar2.f7164m = f0.f(oVar2);
        } else {
            C2746c c2746c = new C2746c();
            c2746c.f7164m = f0.d(nVar);
            c2746c.f21764y = nVar;
            c2746c.f21763A = new HashSet();
            oVar2 = c2746c;
        }
        if (oVar2.f7175x) {
            AbstractC2540a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        oVar2.f7170s = true;
        b0.o oVar3 = oVar.f7167p;
        if (oVar3 != null) {
            oVar3.f7166o = oVar2;
            oVar2.f7167p = oVar3;
        }
        oVar.f7167p = oVar2;
        oVar2.f7166o = oVar;
        return oVar2;
    }

    public static b0.o c(b0.o oVar) {
        boolean z3 = oVar.f7175x;
        if (z3) {
            C2315A c2315a = f0.f21815a;
            if (!z3) {
                AbstractC2540a.b("autoInvalidateRemovedNode called on unattached node");
            }
            f0.a(oVar, -1, 2);
            oVar.v0();
            oVar.n0();
        }
        b0.o oVar2 = oVar.f7167p;
        b0.o oVar3 = oVar.f7166o;
        if (oVar2 != null) {
            oVar2.f7166o = oVar3;
            oVar.f7167p = null;
        }
        if (oVar3 != null) {
            oVar3.f7167p = oVar2;
            oVar.f7166o = null;
        }
        kotlin.jvm.internal.l.c(oVar3);
        return oVar3;
    }

    public static void h(b0.n nVar, b0.n nVar2, b0.o oVar) {
        if ((nVar instanceof Z) && (nVar2 instanceof Z)) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe", oVar);
            ((Z) nVar2).k(oVar);
            if (oVar.f7175x) {
                f0.c(oVar);
                return;
            } else {
                oVar.f7171t = true;
                return;
            }
        }
        if (!(oVar instanceof C2746c)) {
            AbstractC2540a.b("Unknown Modifier.Node type");
            return;
        }
        C2746c c2746c = (C2746c) oVar;
        if (c2746c.f7175x) {
            c2746c.z0();
        }
        c2746c.f21764y = nVar2;
        c2746c.f7164m = f0.d(nVar2);
        if (c2746c.f7175x) {
            c2746c.y0(false);
        }
        if (oVar.f7175x) {
            f0.c(oVar);
        } else {
            oVar.f7171t = true;
        }
    }

    public final boolean d(int i) {
        return (i & this.f.f7165n) != 0;
    }

    public final void e() {
        for (b0.o oVar = this.f; oVar != null; oVar = oVar.f7167p) {
            oVar.u0();
            if (oVar.f7170s) {
                C2315A c2315a = f0.f21815a;
                if (!oVar.f7175x) {
                    AbstractC2540a.b("autoInvalidateInsertedNode called on unattached node");
                }
                f0.a(oVar, -1, 1);
            }
            if (oVar.f7171t) {
                f0.c(oVar);
            }
            oVar.f7170s = false;
            oVar.f7171t = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a8, code lost:
    
        if (r14 <= r7) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01aa, code lost:
    
        if (r9 <= r12) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ac, code lost:
    
        r27 = r9;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ba, code lost:
    
        if (r0.k(r14 - 1, r27 - 1) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bc, code lost:
    
        r14 = r14 - 1;
        r9 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c7, code lost:
    
        r29[r20 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01cb, code lost:
    
        if (r24 == 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01cd, code lost:
    
        r9 = r22 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01cf, code lost:
    
        if (r9 < r11) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d1, code lost:
    
        if (r9 > r3) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d7, code lost:
    
        if (r26[r20 + r9] < r14) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d9, code lost:
    
        r15[r32] = r14;
        r21 = 1;
        r15[1] = r27;
        r15[r17] = r23;
        r15[r19] = r25;
        r15[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x026b, code lost:
    
        r13 = r28 + 2;
        r9 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c3, code lost:
    
        r27 = r9;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x019c, code lost:
    
        r27 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0195, code lost:
    
        r25 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0183, code lost:
    
        r9 = r29[(r13 + 1) + r20];
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0176, code lost:
    
        r24 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0181, code lost:
    
        r24 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0273, code lost:
    
        r3 = r3 + 1;
        r9 = r35;
        r11 = r36;
        r13 = r26;
        r14 = r29;
        r21 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x015c, code lost:
    
        r9 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d1, code lost:
    
        if (r13[(r9 + 1) + r20] > r26[(r25 - 1) + r20]) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0151, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0157, code lost:
    
        if ((r22 & 1) != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0159, code lost:
    
        r9 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015e, code lost:
    
        r13 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015f, code lost:
    
        if (r13 > r3) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0161, code lost:
    
        if (r13 == r11) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0163, code lost:
    
        if (r13 == r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0165, code lost:
    
        r24 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0173, code lost:
    
        if (r29[(r13 + 1) + r20] >= r29[(r13 - 1) + r20]) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0178, code lost:
    
        r9 = r29[(r13 - 1) + r20];
        r14 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x018a, code lost:
    
        r23 = r10 - ((r8 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0190, code lost:
    
        if (r3 == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0192, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0197, code lost:
    
        if (r14 != r9) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0199, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x019e, code lost:
    
        r25 = r23 + (r25 & r27);
        r23 = r9;
        r9 = r23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i, R.e eVar, R.e eVar2, b0.o oVar, boolean z3) {
        int i5;
        R.e eVar3;
        R.e eVar4;
        int i6;
        c0 c0Var;
        int i7;
        int i8;
        int[] iArr;
        int[] iArr2;
        int i9;
        int i10;
        char c5;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 3;
        char c6 = 2;
        int i16 = 1;
        DF df = this.f21773j;
        if (df == null) {
            i5 = i;
            eVar3 = eVar;
            eVar4 = eVar2;
            df = new DF(this, oVar, i5, eVar3, eVar4, z3);
            this.f21773j = df;
        } else {
            i5 = i;
            eVar3 = eVar;
            eVar4 = eVar2;
            df.f8186m = oVar;
            df.f8184k = i5;
            df.f8187n = eVar3;
            df.f8188o = eVar4;
            df.f8185l = z3;
        }
        int i17 = eVar3.f5108m - i5;
        int i18 = eVar4.f5108m - i5;
        int i19 = ((i17 + i18) + 1) / 2;
        P.Q q5 = new P.Q(i19 * 3);
        P.Q q6 = new P.Q(i19 * 4);
        int i20 = 0;
        q6.e(0, i17, 0, i18);
        int i21 = (i19 * 2) + 1;
        int[] iArr3 = new int[i21];
        int[] iArr4 = new int[i21];
        int[] iArr5 = new int[5];
        while (true) {
            int i22 = q6.f4389b;
            if (i22 == 0) {
                break;
            }
            char c7 = c6;
            int[] iArr6 = q6.f4388a;
            int i23 = i22 - 1;
            q6.f4389b = i23;
            int i24 = iArr6[i23];
            int i25 = i20;
            int i26 = i22 - 2;
            q6.f4389b = i26;
            int i27 = iArr6[i26];
            int i28 = i15;
            int i29 = i22 - 3;
            q6.f4389b = i29;
            int i30 = iArr6[i29];
            int i31 = i22 - 4;
            q6.f4389b = i31;
            int i32 = iArr6[i31];
            int i33 = i30 - i32;
            int i34 = i21;
            int i35 = i24 - i27;
            if (i33 >= i16 && i35 >= i16) {
                int i36 = i16;
                int i37 = ((i33 + i35) + 1) / 2;
                int i38 = i34 / 2;
                int i39 = i38 + 1;
                iArr3[i39] = i32;
                iArr4[i39] = i30;
                int i40 = i25;
                while (i40 < i37) {
                    int i41 = i33 - i35;
                    int i42 = i33;
                    int i43 = i37;
                    int i44 = i36;
                    if ((Math.abs(i41) & 1) == i44) {
                        i9 = i44;
                        i10 = i9;
                    } else {
                        i9 = i25;
                        i10 = i44;
                    }
                    int i45 = -i40;
                    int i46 = i9;
                    int i47 = i45;
                    while (true) {
                        if (i47 > i40) {
                            break;
                        }
                        if (i47 != i45) {
                            if (i47 != i40) {
                                i11 = i47;
                                iArr = iArr3;
                            } else {
                                i11 = i47;
                                iArr = iArr3;
                            }
                            i12 = iArr[(i11 - 1) + i38];
                            i13 = i12 + 1;
                            int i48 = ((i13 - i32) + i27) - i11;
                            int i49 = i48 - ((i40 == 0 ? 1 : i25) & (i13 != i12 ? 1 : i25));
                            int i50 = i12;
                            i14 = i48;
                            while (i13 < i30 && i14 < i24 && df.k(i13, i14)) {
                                i13++;
                                i14++;
                            }
                            iArr[i38 + i11] = i13;
                            if (i46 == 0) {
                                int i51 = i14;
                                int i52 = i41 - i11;
                                iArr2 = iArr4;
                                if (i52 >= i45 + 1 && i52 <= i40 - 1 && iArr2[i38 + i52] <= i13) {
                                    iArr5[i25] = i50;
                                    iArr5[1] = i49;
                                    iArr5[c7] = i13;
                                    iArr5[i28] = i51;
                                    iArr5[4] = i25;
                                    c5 = 1;
                                    break;
                                }
                            } else {
                                iArr2 = iArr4;
                            }
                            i47 = i11 + 2;
                            iArr3 = iArr;
                            iArr4 = iArr2;
                            i10 = 1;
                        } else {
                            i11 = i47;
                            iArr = iArr3;
                        }
                        i12 = iArr[i11 + 1 + i38];
                        i13 = i12;
                        int i482 = ((i13 - i32) + i27) - i11;
                        int i492 = i482 - ((i40 == 0 ? 1 : i25) & (i13 != i12 ? 1 : i25));
                        int i502 = i12;
                        i14 = i482;
                        while (i13 < i30) {
                            i13++;
                            i14++;
                        }
                        iArr[i38 + i11] = i13;
                        if (i46 == 0) {
                        }
                        i47 = i11 + 2;
                        iArr3 = iArr;
                        iArr4 = iArr2;
                        i10 = 1;
                    }
                    if (Math.min(iArr5[c7] - iArr5[i25], iArr5[i28] - iArr5[c5]) > 0) {
                        int i53 = iArr5[i25];
                        int i54 = iArr5[c5];
                        int i55 = iArr5[i28] - i54;
                        int i56 = iArr5[c7] - i53;
                        if (i55 != i56) {
                            i56 = Math.min(i56, i55);
                            int i57 = iArr5[4];
                            int i58 = i57 != 0 ? 1 : i25;
                            int i59 = iArr5[i28];
                            c5 = 1;
                            int i60 = iArr5[1];
                            int i61 = i59 - i60;
                            int i62 = iArr5[c7];
                            int i63 = iArr5[i25];
                            i53 += ((i61 > i62 - i63 ? 1 : i25) | i58) ^ 1;
                            i54 += ((i57 != 0 ? 1 : i25) | ((i59 - i60 > i62 - i63 ? 1 : i25) ^ 1)) ^ 1;
                        } else {
                            c5 = 1;
                        }
                        q5.d(i53, i54, i56);
                    }
                    q6.e(i32, iArr5[i25], i27, iArr5[c5]);
                    q6.e(iArr5[c7], i30, iArr5[i28], i24);
                    i20 = i25;
                    i21 = i34;
                    c6 = c7;
                    i15 = i28;
                    iArr3 = iArr;
                    iArr4 = iArr2;
                    i16 = 1;
                }
            }
            iArr = iArr3;
            iArr2 = iArr4;
            i20 = i25;
            i21 = i34;
            c6 = c7;
            i15 = i28;
            iArr3 = iArr;
            iArr4 = iArr2;
            i16 = 1;
        }
        int i64 = i15;
        int i65 = i20;
        int i66 = -1;
        int i67 = q5.f4389b;
        if (i67 % 3 != 0) {
            AbstractC2540a.b("Array size not a multiple of 3");
        }
        if (i67 > i64) {
            i6 = i65;
            q5.f(i6, i67 - i64);
        } else {
            i6 = i65;
        }
        q5.d(i17, i18, i6);
        int i68 = i6;
        int i69 = i68;
        int i70 = i69;
        while (i68 < q5.f4389b) {
            int[] iArr7 = q5.f4388a;
            int i71 = iArr7[i68];
            int i72 = iArr7[i68 + 2];
            int i73 = i71 - i72;
            int i74 = iArr7[i68 + 1] - i72;
            i68 += 3;
            while (true) {
                c0Var = (c0) df.f8189p;
                if (i69 >= i73) {
                    break;
                }
                b0.o oVar2 = ((b0.o) df.f8186m).f7167p;
                kotlin.jvm.internal.l.c(oVar2);
                c0Var.getClass();
                if ((oVar2.f7164m & 2) != 0) {
                    e0 e0Var = oVar2.f7169r;
                    kotlin.jvm.internal.l.c(e0Var);
                    e0 e0Var2 = e0Var.f21795A;
                    e0 e0Var3 = e0Var.f21813z;
                    kotlin.jvm.internal.l.c(e0Var3);
                    if (e0Var2 != null) {
                        e0Var2.f21813z = e0Var3;
                    }
                    e0Var3.f21795A = e0Var2;
                    a(c0Var, (b0.o) df.f8186m, e0Var3);
                }
                df.f8186m = c(oVar2);
                i69++;
            }
            while (i70 < i74) {
                int i75 = df.f8184k + i70;
                b0.o oVar3 = (b0.o) df.f8186m;
                b0.n nVar = (b0.n) ((R.e) df.f8188o).f5106k[i75];
                c0Var.getClass();
                b0.o b3 = b(nVar, oVar3);
                df.f8186m = b3;
                if (df.f8185l) {
                    b0.o oVar4 = b3.f7167p;
                    kotlin.jvm.internal.l.c(oVar4);
                    e0 e0Var4 = oVar4.f7169r;
                    kotlin.jvm.internal.l.c(e0Var4);
                    InterfaceC2765w g5 = AbstractC2749f.g((b0.o) df.f8186m);
                    if (g5 != null) {
                        C2767y c2767y = new C2767y(c0Var.f21766a, g5);
                        ((b0.o) df.f8186m).x0(c2767y);
                        a(c0Var, (b0.o) df.f8186m, c2767y);
                        c2767y.f21795A = e0Var4.f21795A;
                        c2767y.f21813z = e0Var4;
                        e0Var4.f21795A = c2767y;
                    } else {
                        ((b0.o) df.f8186m).x0(e0Var4);
                    }
                    ((b0.o) df.f8186m).m0();
                    ((b0.o) df.f8186m).u0();
                    b0.o oVar5 = (b0.o) df.f8186m;
                    C2315A c2315a = f0.f21815a;
                    if (!oVar5.f7175x) {
                        AbstractC2540a.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    i7 = i66;
                    i8 = 1;
                    f0.a(oVar5, i7, 1);
                } else {
                    i7 = i66;
                    i8 = 1;
                    b3.f7170s = true;
                }
                i70 += i8;
                i66 = i7;
            }
            int i76 = i66;
            while (true) {
                int i77 = i72 - 1;
                if (i72 > 0) {
                    b0.o oVar6 = ((b0.o) df.f8186m).f7167p;
                    kotlin.jvm.internal.l.c(oVar6);
                    df.f8186m = oVar6;
                    R.e eVar5 = (R.e) df.f8187n;
                    int i78 = df.f8184k;
                    b0.n nVar2 = (b0.n) eVar5.f5106k[i78 + i69];
                    b0.n nVar3 = (b0.n) ((R.e) df.f8188o).f5106k[i78 + i70];
                    if (kotlin.jvm.internal.l.a(nVar2, nVar3)) {
                        c0Var.getClass();
                    } else {
                        b0.o oVar7 = (b0.o) df.f8186m;
                        c0Var.getClass();
                        h(nVar2, nVar3, oVar7);
                    }
                    i69++;
                    i70++;
                    i72 = i77;
                }
            }
            i66 = i76;
        }
        int i79 = i6;
        for (b0.o oVar8 = this.f21770e.f7166o; oVar8 != null && oVar8 != this.f21767b; oVar8 = oVar8.f7166o) {
            i79 |= oVar8.f7164m;
            oVar8.f7165n = i79;
        }
    }

    public final void g() {
        C2731G c2731g;
        C2767y c2767y;
        b0.o oVar = this.f21770e.f7166o;
        e0 e0Var = this.f21768c;
        b0.o oVar2 = oVar;
        while (true) {
            c2731g = this.f21766a;
            if (oVar2 == null) {
                break;
            }
            InterfaceC2765w g5 = AbstractC2749f.g(oVar2);
            if (g5 != null) {
                e0 e0Var2 = oVar2.f7169r;
                if (e0Var2 != null) {
                    C2767y c2767y2 = (C2767y) e0Var2;
                    InterfaceC2765w interfaceC2765w = c2767y2.f21871Y;
                    c2767y2.k1(g5);
                    c2767y = c2767y2;
                    if (interfaceC2765w != oVar2) {
                        m0 m0Var = c2767y2.f21811S;
                        c2767y = c2767y2;
                        if (m0Var != null) {
                            ((W0) m0Var).invalidate();
                            c2767y = c2767y2;
                        }
                    }
                } else {
                    C2767y c2767y3 = new C2767y(c2731g, g5);
                    oVar2.x0(c2767y3);
                    c2767y = c2767y3;
                }
                e0Var.f21795A = c2767y;
                c2767y.f21813z = e0Var;
                e0Var = c2767y;
            } else {
                oVar2.x0(e0Var);
            }
            oVar2 = oVar2.f7166o;
        }
        C2731G u5 = c2731g.u();
        e0Var.f21795A = u5 != null ? u5.f21612O.f21768c : null;
        this.f21769d = e0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        b0.o oVar = this.f;
        x0 x0Var = this.f21770e;
        if (oVar != x0Var) {
            while (true) {
                if (oVar == null || oVar == x0Var) {
                    break;
                }
                sb.append(String.valueOf(oVar));
                if (oVar.f7167p == x0Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                oVar = oVar.f7167p;
            }
        } else {
            sb.append("]");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }
}
