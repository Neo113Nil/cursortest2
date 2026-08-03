package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3968a = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("vide");
    public static final int b = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("soun");
    public static final int c = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("text");
    public static final int d = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("sbtl");
    public static final int e = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("subt");
    public static final int f = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("clcp");
    public static final int g = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("cenc");
    public static final int h = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(com.adjust.sdk.Constants.REFERRER_API_META);

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        if (r14 == 0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0504 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.s a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a aVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b bVar, long j, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, boolean z) {
        long j2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b bVar2;
        long j3;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.s sVar;
        android.util.Pair create;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b c2;
        android.util.Pair pair;
        int i;
        long j4;
        int i2;
        int i3;
        int i4;
        boolean z2;
        java.util.List list;
        int i5;
        int i6;
        int i7;
        int i8;
        java.lang.String str;
        int i9;
        java.lang.String str2;
        java.lang.String str3;
        long j5;
        java.util.List list2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a b2 = aVar.b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.F);
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = b2.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.T).P0;
        nVar.e(16);
        int b3 = nVar.b();
        int i10 = b3 == b ? 1 : b3 == f3968a ? 2 : (b3 == c || b3 == d || b3 == e || b3 == f) ? 3 : b3 == h ? 4 : -1;
        if (i10 == -1) {
            return null;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = aVar.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.P).P0;
        nVar2.e(8);
        int b4 = (nVar2.b() >> 24) & 255;
        nVar2.e(nVar2.b + (b4 == 0 ? 8 : 16));
        int b5 = nVar2.b();
        nVar2.e(nVar2.b + 4);
        int i11 = nVar2.b;
        int i12 = b4 == 0 ? 4 : 8;
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                nVar2.e(nVar2.b + i12);
                break;
            }
            if (nVar2.f4112a[i11 + i13] != -1) {
                j2 = b4 == 0 ? nVar2.k() : nVar2.n();
            } else {
                i13++;
            }
        }
        j2 = -9223372036854775807L;
        nVar2.e(nVar2.b + 16);
        int b6 = nVar2.b();
        int b7 = nVar2.b();
        nVar2.e(nVar2.b + 4);
        int b8 = nVar2.b();
        int b9 = nVar2.b();
        int i14 = (b6 == 0 && b7 == 65536 && b8 == -65536 && b9 == 0) ? 90 : (b6 == 0 && b7 == -65536 && b8 == 65536 && b9 == 0) ? 270 : (b6 == -65536 && b7 == 0 && b8 == 0 && b9 == -65536) ? 180 : 0;
        if (j == -9223372036854775807L) {
            bVar2 = bVar;
            j3 = j2;
        } else {
            bVar2 = bVar;
            j3 = j;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = bVar2.P0;
        nVar3.e(8);
        int b10 = nVar3.b();
        int i15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.b;
        nVar3.e(nVar3.b + (((b10 >> 24) & 255) == 0 ? 8 : 16));
        long k = nVar3.k();
        long a2 = j3 != -9223372036854775807L ? com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(j3, 1000000L, k) : -9223372036854775807L;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a b11 = b2.b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.G).b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.H);
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = b2.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.S).P0;
        nVar4.e(8);
        int b12 = (nVar4.b() >> 24) & 255;
        nVar4.e(nVar4.b + (b12 == 0 ? 8 : 16));
        long k2 = nVar4.k();
        nVar4.e(nVar4.b + (b12 == 0 ? 4 : 8));
        int o = nVar4.o();
        android.util.Pair create2 = android.util.Pair.create(java.lang.Long.valueOf(k2), "" + ((char) (((o >> 10) & 31) + 96)) + ((char) (((o >> 5) & 31) + 96)) + ((char) ((o & 31) + 96)));
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = b11.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.U).P0;
        java.lang.String str4 = (java.lang.String) create2.second;
        nVar5.e(12);
        int b13 = nVar5.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f fVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f(b13);
        int i16 = 0;
        while (i16 < b13) {
            int i17 = nVar5.b;
            int b14 = nVar5.b();
            java.lang.String str5 = "childAtomSize should be positive";
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(b14 > 0, "childAtomSize should be positive");
            int b15 = nVar5.b();
            int i18 = b13;
            if (b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.c || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.d || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.a0 || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.l0 || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.e || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.f || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.g || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.K0 || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.L0) {
                pair = create2;
                java.lang.String str6 = "childAtomSize should be positive";
                i = i14;
                j4 = k;
                i2 = i10;
                int i19 = i16;
                nVar5.e(i17 + 16);
                nVar5.e(nVar5.b + 16);
                int o2 = nVar5.o();
                int o3 = nVar5.o();
                nVar5.e(nVar5.b + 50);
                int i20 = nVar5.b;
                i3 = b14;
                if (b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.a0) {
                    i4 = i19;
                    b15 = a(nVar5, i17, i3, fVar, i4);
                    nVar5.e(i20);
                } else {
                    i4 = i19;
                }
                boolean z3 = false;
                java.lang.String str7 = null;
                java.util.List list3 = null;
                float f2 = 1.0f;
                byte[] bArr = null;
                int i21 = -1;
                while (i20 - i17 < i3) {
                    nVar5.e(i20);
                    int i22 = nVar5.b;
                    int b16 = nVar5.b();
                    if (b16 == 0 && nVar5.b - i17 == i3) {
                        break;
                    }
                    java.lang.String str8 = str6;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(b16 > 0, str8);
                    int b17 = nVar5.b();
                    if (b17 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.I) {
                        if (str7 != null) {
                            throw new java.lang.IllegalStateException();
                        }
                        nVar5.e(i22 + 8);
                        com.fyber.inneractive.sdk.player.exoplayer2.video.a a3 = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(nVar5);
                        list = a3.f4122a;
                        fVar.c = a3.b;
                        if (!z3) {
                            f2 = a3.e;
                        }
                        str7 = "video/avc";
                    } else if (b17 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.J) {
                        if (b17 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.M0) {
                            if (str7 != null) {
                                throw new java.lang.IllegalStateException();
                            }
                            str7 = b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.K0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                        } else if (b17 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.h) {
                            if (str7 != null) {
                                throw new java.lang.IllegalStateException();
                            }
                            str7 = "video/3gpp";
                        } else if (b17 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.K) {
                            if (b17 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.j0) {
                                if (b17 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.I0) {
                                    z2 = z3;
                                    if (b17 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.H0) {
                                        int j6 = nVar5.j();
                                        nVar5.e(nVar5.b + 3);
                                        if (j6 == 0) {
                                            int j7 = nVar5.j();
                                            if (j7 == 0) {
                                                i21 = 0;
                                            } else if (j7 == 1) {
                                                i21 = 1;
                                            } else if (j7 == 2) {
                                                i21 = 2;
                                            } else if (j7 == 3) {
                                                i21 = 3;
                                            }
                                        }
                                    }
                                    break;
                                    break;
                                }
                                int i23 = i22 + 8;
                                while (i23 - i22 < b16) {
                                    nVar5.e(i23);
                                    int b18 = nVar5.b();
                                    z2 = z3;
                                    if (nVar5.b() == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.J0) {
                                        bArr = java.util.Arrays.copyOfRange(nVar5.f4112a, i23, b18 + i23);
                                        break;
                                    }
                                    i23 += b18;
                                    z3 = z2;
                                }
                                z2 = z3;
                                bArr = null;
                            } else {
                                nVar5.e(i22 + 8);
                                f2 = nVar5.m() / nVar5.m();
                                z2 = true;
                            }
                            i20 += b16;
                            z3 = z2;
                            str6 = str8;
                        } else {
                            if (str7 != null) {
                                throw new java.lang.IllegalStateException();
                            }
                            android.util.Pair a4 = a(i22, nVar5);
                            str7 = (java.lang.String) a4.first;
                            list3 = java.util.Collections.singletonList((byte[]) a4.second);
                        }
                        z2 = z3;
                        break;
                        i20 += b16;
                        z3 = z2;
                        str6 = str8;
                    } else {
                        if (str7 != null) {
                            throw new java.lang.IllegalStateException();
                        }
                        nVar5.e(i22 + 8);
                        com.fyber.inneractive.sdk.player.exoplayer2.video.d a5 = com.fyber.inneractive.sdk.player.exoplayer2.video.d.a(nVar5);
                        list = a5.f4124a;
                        fVar.c = a5.b;
                        str7 = "video/hevc";
                    }
                    z2 = z3;
                    list3 = list;
                    break;
                    i20 += b16;
                    z3 = z2;
                    str6 = str8;
                }
                if (str7 != null) {
                    fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(java.lang.Integer.toString(b5), str7, -1, o2, o3, list3, i, f2, bArr, i21, null, dVar);
                }
            } else {
                if (b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.j || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.b0 || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.o || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.q || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.s || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.v || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.t || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.u || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.y0 || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.z0 || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.m || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.n || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.k || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.O0) {
                    nVar5.e(i17 + 16);
                    if (z) {
                        int o4 = nVar5.o();
                        nVar5.e(nVar5.b + 6);
                        i5 = o4;
                    } else {
                        nVar5.e(nVar5.b + 8);
                        i5 = 0;
                    }
                    j4 = k;
                    if (i5 == 0 || i5 == 1) {
                        int o5 = nVar5.o();
                        nVar5.e(nVar5.b + 6);
                        byte[] bArr2 = nVar5.f4112a;
                        int i24 = nVar5.b;
                        i2 = i10;
                        int i25 = i24 + 1;
                        nVar5.b = i25;
                        pair = create2;
                        int i26 = (bArr2[i24] & 255) << 8;
                        nVar5.b = i24 + 2;
                        i6 = i26 | (bArr2[i25] & 255);
                        nVar5.b = i24 + 4;
                        if (i5 == 1) {
                            nVar5.e(i24 + 20);
                        }
                        i7 = o5;
                    } else if (i5 == 2) {
                        nVar5.e(nVar5.b + 16);
                        i6 = (int) java.lang.Math.round(java.lang.Double.longBitsToDouble(nVar5.g()));
                        i7 = nVar5.m();
                        nVar5.e(nVar5.b + 20);
                        pair = create2;
                        i2 = i10;
                    } else {
                        pair = create2;
                        i = i14;
                    }
                    int i27 = nVar5.b;
                    if (b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.b0) {
                        b15 = a(nVar5, i17, b14, fVar, i16);
                        nVar5.e(i27);
                    }
                    java.lang.String str9 = b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.o ? "audio/ac3" : b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.q ? "audio/eac3" : b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.s ? "audio/vnd.dts" : (b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.t || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.u) ? "audio/vnd.dts.hd" : b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.v ? "audio/vnd.dts.hd;profile=lbr" : b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.y0 ? "audio/3gpp" : b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.z0 ? "audio/amr-wb" : (b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.m || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.n) ? "audio/raw" : b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.k ? "audio/mpeg" : b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.O0 ? "audio/alac" : null;
                    byte[] bArr3 = null;
                    while (i27 - i17 < b14) {
                        nVar5.e(i27);
                        int b19 = nVar5.b();
                        int i28 = i14;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(b19 > 0, str5);
                        int b20 = nVar5.b();
                        int i29 = b14;
                        int i30 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.K;
                        int i31 = i16;
                        if (b20 == i30 || (z && b20 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.l)) {
                            if (b20 == i30) {
                                i8 = i27;
                                str = str5;
                            } else {
                                i8 = nVar5.b;
                                while (i8 - i27 < b19) {
                                    nVar5.e(i8);
                                    int b21 = nVar5.b();
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(b21 > 0, str5);
                                    str = str5;
                                    if (nVar5.b() != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.K) {
                                        i8 += b21;
                                        str5 = str;
                                    }
                                }
                                str = str5;
                                i9 = -1;
                                i8 = -1;
                                if (i8 == i9) {
                                    android.util.Pair a6 = a(i8, nVar5);
                                    java.lang.String str10 = (java.lang.String) a6.first;
                                    bArr3 = (byte[]) a6.second;
                                    if ("audio/mp4a-latm".equals(str10)) {
                                        android.util.Pair a7 = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(bArr3);
                                        i6 = ((java.lang.Integer) a7.first).intValue();
                                        i7 = ((java.lang.Integer) a7.second).intValue();
                                    }
                                    str9 = str10;
                                }
                            }
                            i9 = -1;
                            if (i8 == i9) {
                            }
                        } else {
                            if (b20 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.p) {
                                nVar5.e(i27 + 8);
                                java.lang.String num = java.lang.Integer.toString(b5);
                                int i32 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.b[(nVar5.j() & 192) >> 6];
                                int j8 = nVar5.j();
                                int i33 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.d[(j8 & 56) >> 3];
                                if ((j8 & 4) != 0) {
                                    i33++;
                                }
                                fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(num, "audio/ac3", -1, -1, i33, i32, null, dVar, str4);
                            } else if (b20 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.r) {
                                nVar5.e(i27 + 8);
                                java.lang.String num2 = java.lang.Integer.toString(b5);
                                nVar5.e(nVar5.b + 2);
                                int i34 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.b[(nVar5.j() & 192) >> 6];
                                int j9 = nVar5.j();
                                int i35 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.d[(j9 & 14) >> 1];
                                if ((j9 & 1) != 0) {
                                    i35++;
                                }
                                fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(num2, "audio/eac3", -1, -1, i35, i34, null, dVar, str4);
                            } else if (b20 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.w) {
                                fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(java.lang.Integer.toString(b5), str9, -1, -1, i7, i6, null, dVar, str4);
                            } else if (b20 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.O0) {
                                bArr3 = new byte[b19];
                                nVar5.e(i27);
                                nVar5.a(bArr3, 0, b19);
                            }
                            str = str5;
                        }
                        i27 += b19;
                        str5 = str;
                        i14 = i28;
                        b14 = i29;
                        i16 = i31;
                    }
                    i = i14;
                    int i36 = b14;
                    int i37 = i16;
                    if (fVar.b == null && str9 != null) {
                        fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(java.lang.Integer.toString(b5), str9, -1, -1, i7, i6, "audio/raw".equals(str9) ? 2 : -1, -1, -1, bArr3 == null ? null : java.util.Collections.singletonList(bArr3), dVar, 0, str4, null);
                    }
                    i3 = i36;
                    i4 = i37;
                } else {
                    int i38 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.k0;
                    if (b15 == i38 || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.u0 || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.v0 || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.w0 || b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.x0) {
                        nVar5.e(i17 + 16);
                        if (b15 == i38) {
                            j5 = Long.MAX_VALUE;
                            list2 = null;
                            str3 = "application/ttml+xml";
                        } else if (b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.u0) {
                            int i39 = b14 - 16;
                            byte[] bArr4 = new byte[i39];
                            nVar5.a(bArr4, 0, i39);
                            list2 = java.util.Collections.singletonList(bArr4);
                            j5 = Long.MAX_VALUE;
                            str3 = "application/x-quicktime-tx3g";
                        } else {
                            if (b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.v0) {
                                str2 = "application/x-mp4-vtt";
                            } else if (b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.w0) {
                                str3 = "application/ttml+xml";
                                j5 = 0;
                                list2 = null;
                            } else {
                                if (b15 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.x0) {
                                    throw new java.lang.IllegalStateException();
                                }
                                fVar.d = 1;
                                str2 = "application/x-mp4-cea-608";
                            }
                            j5 = Long.MAX_VALUE;
                            list2 = null;
                            str3 = str2;
                        }
                        fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(java.lang.Integer.toString(b5), str3, 0, str4, -1, dVar, j5, list2);
                    } else if (b15 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.N0) {
                        fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(java.lang.Integer.toString(b5), "application/x-camera-motion", dVar);
                    }
                    pair = create2;
                    i = i14;
                    j4 = k;
                }
                i3 = b14;
                i2 = i10;
                i4 = i16;
            }
            nVar5.e(i17 + i3);
            i16 = i4 + 1;
            b13 = i18;
            k = j4;
            i10 = i2;
            create2 = pair;
            i14 = i;
        }
        android.util.Pair pair2 = create2;
        long j10 = k;
        int i40 = i10;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a b22 = aVar.b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.Q);
        if (b22 == null || (c2 = b22.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.R)) == null) {
            sVar = null;
            create = android.util.Pair.create(null, null);
        } else {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = c2.P0;
            nVar6.e(8);
            int b23 = (nVar6.b() >> 24) & 255;
            int m = nVar6.m();
            long[] jArr = new long[m];
            long[] jArr2 = new long[m];
            for (int i41 = 0; i41 < m; i41++) {
                jArr[i41] = b23 == 1 ? nVar6.n() : nVar6.k();
                jArr2[i41] = b23 == 1 ? nVar6.g() : nVar6.b();
                byte[] bArr5 = nVar6.f4112a;
                int i42 = nVar6.b;
                int i43 = i42 + 1;
                nVar6.b = i43;
                int i44 = (bArr5[i42] & 255) << 8;
                nVar6.b = i42 + 2;
                if (((short) ((bArr5[i43] & 255) | i44)) != 1) {
                    throw new java.lang.IllegalArgumentException("Unsupported media rate.");
                }
                nVar6.e(i42 + 4);
            }
            create = android.util.Pair.create(jArr, jArr2);
            sVar = null;
        }
        return fVar.b == null ? sVar : new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.s(b5, i40, ((java.lang.Long) pair2.first).longValue(), j10, a2, fVar.b, fVar.d, fVar.f3965a, fVar.c, (long[]) create.first, (long[]) create.second);
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i, int i2, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.f fVar, int i3) {
        int i4 = nVar.b;
        while (true) {
            if (i4 - i >= i2) {
                return 0;
            }
            nVar.e(i4);
            int b2 = nVar.b();
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(b2 > 0, "childAtomSize should be positive");
            if (nVar.b() == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.W) {
                int i5 = i4 + 8;
                android.util.Pair pair = null;
                java.lang.Integer num = null;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.t tVar = null;
                boolean z = false;
                while (i5 - i4 < b2) {
                    nVar.e(i5);
                    int b3 = nVar.b();
                    int b4 = nVar.b();
                    if (b4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.c0) {
                        num = java.lang.Integer.valueOf(nVar.b());
                    } else if (b4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.X) {
                        nVar.e(nVar.b + 4);
                        z = nVar.b() == g;
                    } else if (b4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.Y) {
                        int i6 = i5 + 8;
                        while (true) {
                            if (i6 - i5 >= b3) {
                                tVar = null;
                                break;
                            }
                            nVar.e(i6);
                            int b5 = nVar.b();
                            if (nVar.b() == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.Z) {
                                nVar.e(nVar.b + 6);
                                nVar.j();
                                int j = nVar.j();
                                byte[] bArr = new byte[16];
                                nVar.a(bArr, 0, 16);
                                tVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.t(j, bArr);
                                break;
                            }
                            i6 += b5;
                        }
                    }
                    i5 += b3;
                }
                if (z) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(num != null, "frma atom is mandatory");
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(tVar != null, "schi->tenc atom is mandatory");
                    pair = android.util.Pair.create(num, tVar);
                }
                if (pair != null) {
                    fVar.f3965a[i3] = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.t) pair.second;
                    return ((java.lang.Integer) pair.first).intValue();
                }
            }
            i4 += b2;
        }
    }

    public static android.util.Pair a(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        java.lang.String str;
        nVar.e(i + 12);
        nVar.e(nVar.b + 1);
        a(nVar);
        nVar.e(nVar.b + 2);
        int j = nVar.j();
        if ((j & 128) != 0) {
            nVar.e(nVar.b + 2);
        }
        if ((j & 64) != 0) {
            nVar.e(nVar.b + nVar.o());
        }
        if ((j & 32) != 0) {
            nVar.e(nVar.b + 2);
        }
        nVar.e(nVar.b + 1);
        a(nVar);
        int j2 = nVar.j();
        if (j2 == 32) {
            str = "video/mp4v-es";
        } else if (j2 == 33) {
            str = "video/avc";
        } else if (j2 != 35) {
            if (j2 != 64) {
                str = null;
                if (j2 == 107) {
                    return android.util.Pair.create("audio/mpeg", null);
                }
                if (j2 == 165) {
                    str = "audio/ac3";
                } else if (j2 != 166) {
                    switch (j2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (j2) {
                                case 169:
                                case 172:
                                    return android.util.Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return android.util.Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        nVar.e(nVar.b + 12);
        nVar.e(nVar.b + 1);
        int a2 = a(nVar);
        byte[] bArr = new byte[a2];
        nVar.a(bArr, 0, a2);
        return android.util.Pair.create(str, bArr);
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int j = nVar.j();
        int i = j & 127;
        while ((j & 128) == 128) {
            j = nVar.j();
            i = (i << 7) | (j & 127);
        }
        return i;
    }
}
