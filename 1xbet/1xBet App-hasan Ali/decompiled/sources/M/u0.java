package M;

import A0.C0022e0;
import P.AbstractC0329z;
import P.C0315s;
import P.C0326x0;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final P.D f3551a = new P.D(C0250v.f3562w);

    public static final void a(K0.O o5, X.d dVar, C0315s c0315s, int i) {
        c0315s.Z(-460300127);
        int i5 = (c0315s.f(o5) ? 4 : 2) | i | (c0315s.h(dVar) ? 32 : 16);
        if ((i5 & 19) == 18 && c0315s.B()) {
            c0315s.S();
        } else {
            P.D d5 = f3551a;
            AbstractC0329z.a(d5.a(((K0.O) c0315s.j(d5)).d(o5)), dVar, c0315s, (i5 & 112) | 8);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0022e0(i, 11, o5, dVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, b0.p pVar, long j5, long j6, O0.l lVar, long j7, V0.k kVar, long j8, int i, boolean z3, int i5, int i6, K0.O o5, C0315s c0315s, int i7, int i8, int i9) {
        int i10;
        int i11;
        long j9;
        int i12;
        long j10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        b0.p pVar2;
        O0.l lVar2;
        long j11;
        V0.k kVar2;
        long j12;
        boolean z5;
        int i20;
        int i21;
        int i22;
        int i23;
        K0.O o6;
        long b3;
        int i24;
        boolean z6;
        O0.l lVar3;
        long j13;
        long j14;
        int i25;
        int i26;
        V0.k kVar3;
        long j15;
        long j16;
        boolean z7;
        int i27;
        K0.O o7;
        b0.p pVar3;
        c0315s.Z(-2055108902);
        if ((i7 & 6) == 0) {
            i10 = (c0315s.f(str) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        int i28 = i9 & 2;
        if (i28 != 0) {
            i10 |= 48;
        } else if ((i7 & 48) == 0) {
            i10 |= c0315s.f(pVar) ? 32 : 16;
            i11 = i9 & 4;
            if (i11 == 0) {
                i10 |= 384;
            } else if ((i7 & 384) == 0) {
                j9 = j5;
                i10 |= c0315s.e(j9) ? 256 : 128;
                i12 = i9 & 8;
                if (i12 != 0) {
                    i10 |= 3072;
                    j10 = j6;
                } else {
                    j10 = j6;
                    if ((i7 & 3072) == 0) {
                        i10 |= c0315s.e(j10) ? 2048 : 1024;
                    }
                }
                int i29 = i10 | 24576;
                i13 = i9 & 32;
                if (i13 != 0) {
                    i29 = i10 | 221184;
                } else if ((i7 & 196608) == 0) {
                    i29 |= c0315s.f(lVar) ? 131072 : 65536;
                    int i30 = i29 | 1572864;
                    i14 = i9 & 128;
                    if (i14 == 0) {
                        i30 = i29 | 14155776;
                    } else if ((i7 & 12582912) == 0) {
                        i30 |= c0315s.e(j7) ? 8388608 : 4194304;
                    }
                    i15 = i30 | 100663296;
                    i16 = i9 & 512;
                    if (i16 == 0) {
                        i15 = i30 | 905969664;
                    } else if ((i7 & 805306368) == 0) {
                        i15 |= c0315s.f(kVar) ? 536870912 : 268435456;
                    }
                    int i31 = i8 | 6;
                    i17 = i9 & 2048;
                    if (i17 == 0) {
                        i31 = i8 | 54;
                        i18 = i17;
                    } else if ((i8 & 48) == 0) {
                        i18 = i17;
                        i31 |= c0315s.d(i) ? 32 : 16;
                    } else {
                        i18 = i17;
                    }
                    int i32 = i31;
                    int i33 = i32 | 384;
                    i19 = i9 & 8192;
                    if (i19 == 0) {
                        i33 = i32 | 3456;
                    } else if ((i8 & 3072) == 0) {
                        i33 |= c0315s.d(i5) ? 2048 : 1024;
                        int i34 = i33 | 221184 | (((i9 & 65536) == 0 || !c0315s.f(o5)) ? 524288 : 1048576);
                        if ((i15 & 306783379) != 306783378 && (599187 & i34) == 599186 && c0315s.B()) {
                            c0315s.S();
                            pVar3 = pVar;
                            lVar3 = lVar;
                            kVar3 = kVar;
                            i27 = i;
                            z7 = z3;
                            i26 = i5;
                            i25 = i6;
                            o7 = o5;
                            j15 = j10;
                            j13 = j9;
                            j16 = j7;
                            j14 = j8;
                        } else {
                            c0315s.U();
                            if ((i7 & 1) != 0 || c0315s.z()) {
                                pVar2 = i28 != 0 ? b0.m.f7161k : pVar;
                                if (i11 != 0) {
                                    j9 = i0.p.f17293g;
                                }
                                if (i12 != 0) {
                                    j10 = W0.o.f6021c;
                                }
                                lVar2 = i13 != 0 ? null : lVar;
                                j11 = i14 != 0 ? W0.o.f6021c : j7;
                                kVar2 = i16 == 0 ? kVar : null;
                                j12 = W0.o.f6021c;
                                z5 = true;
                                i20 = i18 != 0 ? 1 : i;
                                i21 = i19 != 0 ? Integer.MAX_VALUE : i5;
                                if ((i9 & 65536) != 0) {
                                    i22 = i34 & (-3670017);
                                    o6 = (K0.O) c0315s.j(f3551a);
                                    i23 = 1;
                                    c0315s.r();
                                    b0.p pVar4 = pVar2;
                                    c0315s.X(-1827892941);
                                    if (j9 == 16) {
                                        i24 = i23;
                                        b3 = j9;
                                        z6 = false;
                                    } else {
                                        c0315s.X(-1827892168);
                                        b3 = o6.b();
                                        if (b3 != 16) {
                                            i24 = i23;
                                        } else {
                                            i24 = i23;
                                            b3 = ((i0.p) c0315s.j(AbstractC0253y.f3582a)).f17295a;
                                        }
                                        z6 = false;
                                        c0315s.q(false);
                                    }
                                    c0315s.q(z6);
                                    K0.O o8 = o6;
                                    int i35 = (i15 & 126) | 3072;
                                    int i36 = i22 << 9;
                                    int i37 = i24;
                                    int i38 = i20;
                                    E.W.a(str, pVar4, K0.O.e(o8, b3, j10, lVar2, j11, kVar2 == null ? kVar2.f5943a : Integer.MIN_VALUE, j12, 16609104), i38, z5, i21, i37, c0315s, i35 | (i36 & 57344) | 196608 | (i36 & 3670016) | 12582912, 256);
                                    lVar3 = lVar2;
                                    j13 = j9;
                                    j14 = j12;
                                    i25 = i37;
                                    i26 = i21;
                                    kVar3 = kVar2;
                                    j15 = j10;
                                    j16 = j11;
                                    z7 = z5;
                                    i27 = i20;
                                    o7 = o8;
                                    pVar3 = pVar4;
                                } else {
                                    i22 = i34;
                                    i23 = 1;
                                }
                            } else {
                                c0315s.S();
                                if ((i9 & 65536) != 0) {
                                    i34 &= -3670017;
                                }
                                pVar2 = pVar;
                                lVar2 = lVar;
                                j11 = j7;
                                kVar2 = kVar;
                                j12 = j8;
                                i20 = i;
                                z5 = z3;
                                i21 = i5;
                                i23 = i6;
                                i22 = i34;
                            }
                            o6 = o5;
                            c0315s.r();
                            b0.p pVar42 = pVar2;
                            c0315s.X(-1827892941);
                            if (j9 == 16) {
                            }
                            c0315s.q(z6);
                            K0.O o82 = o6;
                            int i352 = (i15 & 126) | 3072;
                            int i362 = i22 << 9;
                            int i372 = i24;
                            int i382 = i20;
                            E.W.a(str, pVar42, K0.O.e(o82, b3, j10, lVar2, j11, kVar2 == null ? kVar2.f5943a : Integer.MIN_VALUE, j12, 16609104), i382, z5, i21, i372, c0315s, i352 | (i362 & 57344) | 196608 | (i362 & 3670016) | 12582912, 256);
                            lVar3 = lVar2;
                            j13 = j9;
                            j14 = j12;
                            i25 = i372;
                            i26 = i21;
                            kVar3 = kVar2;
                            j15 = j10;
                            j16 = j11;
                            z7 = z5;
                            i27 = i20;
                            o7 = o82;
                            pVar3 = pVar42;
                        }
                        C0326x0 s2 = c0315s.s();
                        if (s2 != null) {
                            s2.f4578d = new t0(str, pVar3, j13, j15, lVar3, j16, kVar3, j14, i27, z7, i26, i25, o7, i7, i8, i9);
                            return;
                        }
                        return;
                    }
                    int i342 = i33 | 221184 | (((i9 & 65536) == 0 || !c0315s.f(o5)) ? 524288 : 1048576);
                    if ((i15 & 306783379) != 306783378) {
                    }
                    c0315s.U();
                    if ((i7 & 1) != 0) {
                    }
                    if (i28 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i16 == 0) {
                    }
                    j12 = W0.o.f6021c;
                    z5 = true;
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if ((i9 & 65536) != 0) {
                    }
                }
                int i302 = i29 | 1572864;
                i14 = i9 & 128;
                if (i14 == 0) {
                }
                i15 = i302 | 100663296;
                i16 = i9 & 512;
                if (i16 == 0) {
                }
                int i312 = i8 | 6;
                i17 = i9 & 2048;
                if (i17 == 0) {
                }
                int i322 = i312;
                int i332 = i322 | 384;
                i19 = i9 & 8192;
                if (i19 == 0) {
                }
                int i3422 = i332 | 221184 | (((i9 & 65536) == 0 || !c0315s.f(o5)) ? 524288 : 1048576);
                if ((i15 & 306783379) != 306783378) {
                }
                c0315s.U();
                if ((i7 & 1) != 0) {
                }
                if (i28 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i16 == 0) {
                }
                j12 = W0.o.f6021c;
                z5 = true;
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if ((i9 & 65536) != 0) {
                }
            }
            j9 = j5;
            i12 = i9 & 8;
            if (i12 != 0) {
            }
            int i292 = i10 | 24576;
            i13 = i9 & 32;
            if (i13 != 0) {
            }
            int i3022 = i292 | 1572864;
            i14 = i9 & 128;
            if (i14 == 0) {
            }
            i15 = i3022 | 100663296;
            i16 = i9 & 512;
            if (i16 == 0) {
            }
            int i3122 = i8 | 6;
            i17 = i9 & 2048;
            if (i17 == 0) {
            }
            int i3222 = i3122;
            int i3322 = i3222 | 384;
            i19 = i9 & 8192;
            if (i19 == 0) {
            }
            int i34222 = i3322 | 221184 | (((i9 & 65536) == 0 || !c0315s.f(o5)) ? 524288 : 1048576);
            if ((i15 & 306783379) != 306783378) {
            }
            c0315s.U();
            if ((i7 & 1) != 0) {
            }
            if (i28 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i16 == 0) {
            }
            j12 = W0.o.f6021c;
            z5 = true;
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if ((i9 & 65536) != 0) {
            }
        }
        i11 = i9 & 4;
        if (i11 == 0) {
        }
        j9 = j5;
        i12 = i9 & 8;
        if (i12 != 0) {
        }
        int i2922 = i10 | 24576;
        i13 = i9 & 32;
        if (i13 != 0) {
        }
        int i30222 = i2922 | 1572864;
        i14 = i9 & 128;
        if (i14 == 0) {
        }
        i15 = i30222 | 100663296;
        i16 = i9 & 512;
        if (i16 == 0) {
        }
        int i31222 = i8 | 6;
        i17 = i9 & 2048;
        if (i17 == 0) {
        }
        int i32222 = i31222;
        int i33222 = i32222 | 384;
        i19 = i9 & 8192;
        if (i19 == 0) {
        }
        int i342222 = i33222 | 221184 | (((i9 & 65536) == 0 || !c0315s.f(o5)) ? 524288 : 1048576);
        if ((i15 & 306783379) != 306783378) {
        }
        c0315s.U();
        if ((i7 & 1) != 0) {
        }
        if (i28 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i16 == 0) {
        }
        j12 = W0.o.f6021c;
        z5 = true;
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if ((i9 & 65536) != 0) {
        }
    }
}
