package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public abstract class g extends com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f4070a = new android.util.SparseArray();
    public final android.util.SparseBooleanArray b = new android.util.SparseBooleanArray();

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ba, code lost:
    
        if (r13 == (-1)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cd, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01cb, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c9, code lost:
    
        if (r15 == (-1)) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ab  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j a(com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.source.z zVar) {
        int i;
        boolean z;
        int[][] iArr;
        int[][] iArr2;
        int i2;
        com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c cVar;
        int[] iArr3;
        com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar2;
        java.util.ArrayList arrayList;
        boolean z2;
        int i3;
        boolean a2;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr4;
        int[] iArr5 = new int[aVarArr.length + 1];
        int length = aVarArr.length + 1;
        com.fyber.inneractive.sdk.player.exoplayer2.source.y[][] yVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.source.y[length][];
        int[][][] iArr6 = new int[aVarArr.length + 1][][];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = zVar.f4065a;
            yVarArr[i8] = new com.fyber.inneractive.sdk.player.exoplayer2.source.y[i9];
            iArr6[i8] = new int[i9][];
        }
        int length2 = aVarArr.length;
        int[] iArr7 = new int[length2];
        for (int i10 = 0; i10 < length2; i10++) {
            aVarArr[i10].getClass();
            iArr7[i10] = 4;
        }
        for (int i11 = 0; i11 < zVar.f4065a; i11++) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar3 = zVar.b[i11];
            int length3 = aVarArr.length;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 >= aVarArr.length) {
                    break;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.a aVar = aVarArr[i12];
                for (int i14 = 0; i14 < yVar3.f4064a; i14++) {
                    com.fyber.inneractive.sdk.player.exoplayer2.o oVar = yVar3.b[i14];
                    com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c) aVar;
                    cVar2.getClass();
                    try {
                        int b = cVar2.b(cVar2.h, oVar) & 3;
                        if (b > i13) {
                            if (b == 3) {
                                length3 = i12;
                                break;
                            }
                            i13 = b;
                            length3 = i12;
                        }
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f e) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e);
                    }
                }
                i12++;
            }
            if (length3 == aVarArr.length) {
                iArr4 = new int[yVar3.f4064a];
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.a aVar2 = aVarArr[length3];
                int[] iArr8 = new int[yVar3.f4064a];
                for (int i15 = 0; i15 < yVar3.f4064a; i15++) {
                    com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = yVar3.b[i15];
                    com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c) aVar2;
                    cVar3.getClass();
                    try {
                        iArr8[i15] = cVar3.b(cVar3.h, oVar2);
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f e2) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e2);
                    }
                }
                iArr4 = iArr8;
            }
            int i16 = iArr5[length3];
            yVarArr[length3][i16] = yVar3;
            iArr6[length3][i16] = iArr4;
            iArr5[length3] = i16 + 1;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.z[] zVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.source.z[aVarArr.length];
        int[] iArr9 = new int[aVarArr.length];
        for (int i17 = 0; i17 < aVarArr.length; i17++) {
            int i18 = iArr5[i17];
            zVarArr[i17] = new com.fyber.inneractive.sdk.player.exoplayer2.source.z((com.fyber.inneractive.sdk.player.exoplayer2.source.y[]) java.util.Arrays.copyOf(yVarArr[i17], i18));
            iArr6[i17] = (int[][]) java.util.Arrays.copyOf(iArr6[i17], i18);
            iArr9[i17] = aVarArr[i17].f3901a;
        }
        new com.fyber.inneractive.sdk.player.exoplayer2.source.z((com.fyber.inneractive.sdk.player.exoplayer2.source.y[]) java.util.Arrays.copyOf(yVarArr[aVarArr.length], iArr5[aVarArr.length]));
        int length4 = aVarArr.length;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[length4];
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c cVar4 = (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c) ((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d) this).c.get();
        int i19 = 0;
        boolean z3 = false;
        while (i19 < length4) {
            if (2 == aVarArr[i19].f3901a) {
                if (z3) {
                    cVar = cVar4;
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.source.z zVar2 = zVarArr[i19];
                    int[][] iArr10 = iArr6[i19];
                    cVar4.getClass();
                    com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar4 = null;
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    int i23 = -1;
                    int i24 = -1;
                    while (i20 < zVar2.f4065a) {
                        com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar5 = zVar2.b[i20];
                        com.fyber.inneractive.sdk.player.exoplayer2.source.z zVar3 = zVar2;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(yVar5.f4064a);
                        for (int i25 = 0; i25 < yVar5.f4064a; i25++) {
                            arrayList2.add(java.lang.Integer.valueOf(i25));
                        }
                        int[] iArr11 = iArr10[i20];
                        int i26 = 0;
                        int i27 = i22;
                        com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar6 = yVar4;
                        int i28 = i27;
                        int i29 = i23;
                        int[][] iArr12 = iArr10;
                        int i30 = i29;
                        int i31 = i24;
                        int i32 = i21;
                        int i33 = i31;
                        while (i26 < yVar5.f4064a) {
                            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c cVar5 = cVar4;
                            if (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d.a(iArr11[i26], true)) {
                                com.fyber.inneractive.sdk.player.exoplayer2.o oVar3 = yVar5.b[i26];
                                if (arrayList2.contains(java.lang.Integer.valueOf(i26))) {
                                    int i34 = oVar3.j;
                                    yVar2 = yVar5;
                                    arrayList = arrayList2;
                                    if ((i34 == -1 || i34 <= Integer.MAX_VALUE) && (((i6 = oVar3.k) == -1 || i6 <= Integer.MAX_VALUE) && ((i7 = oVar3.b) == -1 || i7 <= Integer.MAX_VALUE))) {
                                        z2 = true;
                                        i3 = !z2 ? 2 : 1;
                                        iArr3 = iArr11;
                                        a2 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d.a(iArr11[i26], false);
                                        if (a2) {
                                            i3 += 1000;
                                        }
                                        boolean z4 = i3 <= i28;
                                        if (i3 == i28) {
                                            i4 = i3;
                                            if (!z4) {
                                            }
                                            int i35 = oVar3.b;
                                            i30 = oVar3.b();
                                            i33 = i35;
                                            i32 = i26;
                                            yVar6 = yVar2;
                                            i28 = i4;
                                        } else if (oVar3.b() != i30) {
                                            int b2 = oVar3.b();
                                            i4 = i3;
                                            if (b2 != -1) {
                                                if (i30 != -1) {
                                                    i5 = b2 - i30;
                                                    if (a2 || !z2) {
                                                        if (i5 >= 0) {
                                                        }
                                                        int i352 = oVar3.b;
                                                        i30 = oVar3.b();
                                                        i33 = i352;
                                                        i32 = i26;
                                                        yVar6 = yVar2;
                                                        i28 = i4;
                                                    } else {
                                                        if (i5 <= 0) {
                                                        }
                                                        int i3522 = oVar3.b;
                                                        i30 = oVar3.b();
                                                        i33 = i3522;
                                                        i32 = i26;
                                                        yVar6 = yVar2;
                                                        i28 = i4;
                                                    }
                                                }
                                                i5 = 1;
                                                if (a2) {
                                                }
                                                if (i5 >= 0) {
                                                }
                                                int i35222 = oVar3.b;
                                                i30 = oVar3.b();
                                                i33 = i35222;
                                                i32 = i26;
                                                yVar6 = yVar2;
                                                i28 = i4;
                                            }
                                        } else {
                                            i4 = i3;
                                            int i36 = oVar3.b;
                                            if (i36 != -1) {
                                                if (i33 != -1) {
                                                    i5 = i36 - i33;
                                                    if (a2) {
                                                    }
                                                    if (i5 >= 0) {
                                                    }
                                                    int i352222 = oVar3.b;
                                                    i30 = oVar3.b();
                                                    i33 = i352222;
                                                    i32 = i26;
                                                    yVar6 = yVar2;
                                                    i28 = i4;
                                                }
                                                i5 = 1;
                                                if (a2) {
                                                }
                                                if (i5 >= 0) {
                                                }
                                                int i3522222 = oVar3.b;
                                                i30 = oVar3.b();
                                                i33 = i3522222;
                                                i32 = i26;
                                                yVar6 = yVar2;
                                                i28 = i4;
                                            }
                                        }
                                    }
                                } else {
                                    yVar2 = yVar5;
                                    arrayList = arrayList2;
                                }
                                z2 = false;
                                if (!z2) {
                                }
                                iArr3 = iArr11;
                                a2 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d.a(iArr11[i26], false);
                                if (a2) {
                                }
                                if (i3 <= i28) {
                                }
                                if (i3 == i28) {
                                }
                            } else {
                                iArr3 = iArr11;
                                yVar2 = yVar5;
                                arrayList = arrayList2;
                            }
                            i26++;
                            cVar4 = cVar5;
                            yVar5 = yVar2;
                            arrayList2 = arrayList;
                            iArr11 = iArr3;
                        }
                        i20++;
                        zVar2 = zVar3;
                        com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar7 = yVar6;
                        i22 = i28;
                        yVar4 = yVar7;
                        i23 = i30;
                        iArr10 = iArr12;
                        int i37 = i32;
                        i24 = i33;
                        i21 = i37;
                    }
                    cVar = cVar4;
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e eVar = yVar4 == null ? null : new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e(yVar4, i21);
                    bVarArr[i19] = eVar;
                    z3 = eVar != null;
                }
                int i38 = zVarArr[i19].f4065a;
            } else {
                cVar = cVar4;
            }
            i19++;
            cVar4 = cVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c cVar6 = cVar4;
        boolean z5 = false;
        int i39 = 0;
        boolean z6 = false;
        while (i39 < length4) {
            int i40 = aVarArr[i39].f3901a;
            if (i40 != 1) {
                if (i40 == 2) {
                    i = length4;
                } else if (i40 != 3) {
                    com.fyber.inneractive.sdk.player.exoplayer2.source.z zVar4 = zVarArr[i39];
                    int[][] iArr13 = iArr6[i39];
                    cVar6.getClass();
                    int i41 = 0;
                    int i42 = 0;
                    int i43 = 0;
                    com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar8 = null;
                    while (i41 < zVar4.f4065a) {
                        com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar9 = zVar4.b[i41];
                        int[] iArr14 = iArr13[i41];
                        int i44 = length4;
                        int i45 = 0;
                        while (i45 < yVar9.f4064a) {
                            com.fyber.inneractive.sdk.player.exoplayer2.source.z zVar5 = zVar4;
                            if (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d.a(iArr14[i45], true)) {
                                int i46 = (yVar9.b[i45].x & 1) != 0 ? 2 : 1;
                                yVar = yVar9;
                                if (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d.a(iArr14[i45], false)) {
                                    i46 += 1000;
                                }
                                if (i46 > i43) {
                                    i43 = i46;
                                    i42 = i45;
                                    yVar8 = yVar;
                                }
                            } else {
                                yVar = yVar9;
                            }
                            i45++;
                            zVar4 = zVar5;
                            yVar9 = yVar;
                        }
                        i41++;
                        length4 = i44;
                    }
                    i = length4;
                    bVarArr[i39] = yVar8 == null ? null : new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e(yVar8, i42);
                } else {
                    i = length4;
                    if (!z6) {
                        com.fyber.inneractive.sdk.player.exoplayer2.source.z zVar6 = zVarArr[i39];
                        int[][] iArr15 = iArr6[i39];
                        cVar6.getClass();
                        int i47 = 0;
                        int i48 = 0;
                        int i49 = 0;
                        com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar10 = null;
                        while (i47 < zVar6.f4065a) {
                            com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar11 = zVar6.b[i47];
                            int[] iArr16 = iArr15[i47];
                            com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar12 = yVar10;
                            int i50 = i49;
                            int i51 = i48;
                            int i52 = 0;
                            while (i52 < yVar11.f4064a) {
                                com.fyber.inneractive.sdk.player.exoplayer2.source.z zVar7 = zVar6;
                                if (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d.a(iArr16[i52], true)) {
                                    int i53 = yVar11.b[i52].x;
                                    boolean z7 = (i53 & 1) != 0;
                                    boolean z8 = (i53 & 2) != 0;
                                    if (!z7) {
                                        i2 = z8 ? 1 : 3;
                                    }
                                    iArr2 = iArr15;
                                    if (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d.a(iArr16[i52], false)) {
                                        i2 += 1000;
                                    }
                                    if (i2 > i50) {
                                        i50 = i2;
                                        i51 = i52;
                                        yVar12 = yVar11;
                                    }
                                    i52++;
                                    zVar6 = zVar7;
                                    iArr15 = iArr2;
                                }
                                iArr2 = iArr15;
                                i52++;
                                zVar6 = zVar7;
                                iArr15 = iArr2;
                            }
                            i47++;
                            i48 = i51;
                            i49 = i50;
                            yVar10 = yVar12;
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e eVar2 = yVar10 == null ? null : new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e(yVar10, i48);
                        bVarArr[i39] = eVar2;
                        z = eVar2 != null;
                        i39++;
                        z6 = z;
                        length4 = i;
                    }
                }
                z = z6;
                i39++;
                z6 = z;
                length4 = i;
            } else {
                i = length4;
                if (!z5) {
                    com.fyber.inneractive.sdk.player.exoplayer2.source.z zVar8 = zVarArr[i39];
                    int[][] iArr17 = iArr6[i39];
                    cVar6.getClass();
                    int i54 = 0;
                    int i55 = 0;
                    int i56 = -1;
                    int i57 = -1;
                    while (i54 < zVar8.f4065a) {
                        com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar13 = zVar8.b[i54];
                        int[] iArr18 = iArr17[i54];
                        int i58 = i57;
                        int i59 = i56;
                        int i60 = i55;
                        int i61 = 0;
                        while (i61 < yVar13.f4064a) {
                            boolean z9 = z6;
                            if (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d.a(iArr18[i61], true)) {
                                com.fyber.inneractive.sdk.player.exoplayer2.o oVar4 = yVar13.b[i61];
                                iArr = iArr17;
                                int i62 = iArr18[i61];
                                int i63 = (oVar4.x & 1) != 0 ? 2 : 1;
                                if (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d.a(i62, false)) {
                                    i63 += 1000;
                                }
                                if (i63 > i60) {
                                    i58 = i54;
                                    i59 = i61;
                                    i60 = i63;
                                }
                            } else {
                                iArr = iArr17;
                            }
                            i61++;
                            iArr17 = iArr;
                            z6 = z9;
                        }
                        i54++;
                        i55 = i60;
                        i56 = i59;
                        i57 = i58;
                        z6 = z6;
                    }
                    z = z6;
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e eVar3 = i57 == -1 ? null : new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e(zVar8.b[i57], i56);
                    bVarArr[i39] = eVar3;
                    z5 = eVar3 != null;
                    i39++;
                    z6 = z;
                    length4 = i;
                }
                z = z6;
                i39++;
                z6 = z;
                length4 = i;
            }
        }
        for (int i64 = 0; i64 < aVarArr.length; i64++) {
            if (this.b.get(i64)) {
                bVarArr[i64] = null;
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.source.z zVar9 = zVarArr[i64];
                java.util.Map map = (java.util.Map) this.f4070a.get(i64);
                if (map != null && map.containsKey(zVar9)) {
                    if (((java.util.Map) this.f4070a.get(i64)).get(zVar9) != null) {
                        throw new java.lang.ClassCastException();
                    }
                    bVarArr[i64] = null;
                }
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f fVar = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f(zVarArr);
        com.fyber.inneractive.sdk.player.exoplayer2.t[] tVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.t[aVarArr.length];
        for (int i65 = 0; i65 < aVarArr.length; i65++) {
            tVarArr[i65] = bVarArr[i65] != null ? com.fyber.inneractive.sdk.player.exoplayer2.t.b : null;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j(zVar, new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h(bVarArr), fVar, tVarArr);
    }
}
