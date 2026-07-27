package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class g extends i {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f5724a = new SparseArray();
    public final SparseBooleanArray b = new SparseBooleanArray();

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ba, code lost:
    
        if (r13 == (-1)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cd, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01cb, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c9, code lost:
    
        if (r15 == (-1)) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e1  */
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
    public final j a(com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr, z zVar) {
        int i;
        boolean z;
        int[][] iArr;
        int i2;
        boolean z2;
        int[][] iArr2;
        int i3;
        y yVar;
        c cVar;
        int[] iArr3;
        y yVar2;
        ArrayList arrayList;
        boolean z3;
        int i4;
        boolean a2;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr4;
        int[] iArr5 = new int[aVarArr.length + 1];
        int length = aVarArr.length + 1;
        y[][] yVarArr = new y[length][];
        int[][][] iArr6 = new int[aVarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = zVar.f5719a;
            yVarArr[i10] = new y[i11];
            iArr6[i10] = new int[i11][];
        }
        int length2 = aVarArr.length;
        int[] iArr7 = new int[length2];
        for (int i12 = 0; i12 < length2; i12++) {
            aVarArr[i12].getClass();
            iArr7[i12] = 4;
        }
        for (int i13 = 0; i13 < zVar.f5719a; i13++) {
            y yVar3 = zVar.b[i13];
            int length3 = aVarArr.length;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (i14 >= aVarArr.length) {
                    break;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.a aVar = aVarArr[i14];
                for (int i16 = 0; i16 < yVar3.f5718a; i16++) {
                    o oVar = yVar3.b[i16];
                    com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c) aVar;
                    cVar2.getClass();
                    try {
                        int b = cVar2.b(cVar2.h, oVar) & 3;
                        if (b > i15) {
                            if (b == 3) {
                                length3 = i14;
                                break;
                            }
                            i15 = b;
                            length3 = i14;
                        }
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f e) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e);
                    }
                }
                i14++;
            }
            if (length3 == aVarArr.length) {
                iArr4 = new int[yVar3.f5718a];
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.a aVar2 = aVarArr[length3];
                int[] iArr8 = new int[yVar3.f5718a];
                for (int i17 = 0; i17 < yVar3.f5718a; i17++) {
                    o oVar2 = yVar3.b[i17];
                    com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c) aVar2;
                    cVar3.getClass();
                    try {
                        iArr8[i17] = cVar3.b(cVar3.h, oVar2);
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f e2) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e2);
                    }
                }
                iArr4 = iArr8;
            }
            int i18 = iArr5[length3];
            yVarArr[length3][i18] = yVar3;
            iArr6[length3][i18] = iArr4;
            iArr5[length3] = i18 + 1;
        }
        z[] zVarArr = new z[aVarArr.length];
        int[] iArr9 = new int[aVarArr.length];
        for (int i19 = 0; i19 < aVarArr.length; i19++) {
            int i20 = iArr5[i19];
            zVarArr[i19] = new z((y[]) Arrays.copyOf(yVarArr[i19], i20));
            iArr6[i19] = (int[][]) Arrays.copyOf(iArr6[i19], i20);
            iArr9[i19] = aVarArr[i19].f5555a;
        }
        new z((y[]) Arrays.copyOf(yVarArr[aVarArr.length], iArr5[aVarArr.length]));
        int length4 = aVarArr.length;
        b[] bVarArr = new b[length4];
        c cVar4 = (c) ((d) this).c.get();
        int i21 = 0;
        boolean z5 = false;
        while (i21 < length4) {
            if (2 == aVarArr[i21].f5555a) {
                if (z5) {
                    cVar = cVar4;
                } else {
                    z zVar2 = zVarArr[i21];
                    int[][] iArr10 = iArr6[i21];
                    cVar4.getClass();
                    y yVar4 = null;
                    int i22 = 0;
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = -1;
                    int i26 = -1;
                    while (i22 < zVar2.f5719a) {
                        y yVar5 = zVar2.b[i22];
                        z zVar3 = zVar2;
                        ArrayList arrayList2 = new ArrayList(yVar5.f5718a);
                        for (int i27 = 0; i27 < yVar5.f5718a; i27++) {
                            arrayList2.add(Integer.valueOf(i27));
                        }
                        int[] iArr11 = iArr10[i22];
                        int i28 = 0;
                        int i29 = i24;
                        y yVar6 = yVar4;
                        int i30 = i29;
                        int i31 = i25;
                        int[][] iArr12 = iArr10;
                        int i32 = i31;
                        int i33 = i26;
                        int i34 = i23;
                        int i35 = i33;
                        while (i28 < yVar5.f5718a) {
                            c cVar5 = cVar4;
                            if (d.a(iArr11[i28], true)) {
                                o oVar3 = yVar5.b[i28];
                                if (arrayList2.contains(Integer.valueOf(i28))) {
                                    int i36 = oVar3.j;
                                    yVar2 = yVar5;
                                    arrayList = arrayList2;
                                    if ((i36 == -1 || i36 <= Integer.MAX_VALUE) && (((i8 = oVar3.k) == -1 || i8 <= Integer.MAX_VALUE) && ((i9 = oVar3.b) == -1 || i9 <= Integer.MAX_VALUE))) {
                                        z3 = true;
                                        i4 = !z3 ? 2 : 1;
                                        iArr3 = iArr11;
                                        a2 = d.a(iArr11[i28], false);
                                        if (a2) {
                                            i4 += 1000;
                                        }
                                        z4 = i4 <= i30;
                                        if (i4 == i30) {
                                            i5 = i4;
                                        } else if (oVar3.b() != i32) {
                                            int b2 = oVar3.b();
                                            i5 = i4;
                                            i6 = -1;
                                            if (b2 != -1) {
                                                if (i32 != -1) {
                                                    i7 = b2 - i32;
                                                    z4 = a2 || !z3 ? i7 < 0 : i7 > 0;
                                                }
                                                i7 = 1;
                                                if (a2) {
                                                }
                                            }
                                        } else {
                                            i5 = i4;
                                            i6 = -1;
                                            int i37 = oVar3.b;
                                            if (i37 != -1) {
                                                if (i35 != -1) {
                                                    i7 = i37 - i35;
                                                    if (a2) {
                                                    }
                                                }
                                                i7 = 1;
                                                if (a2) {
                                                }
                                            }
                                        }
                                        if (!z4) {
                                            int i38 = oVar3.b;
                                            i32 = oVar3.b();
                                            i35 = i38;
                                            i34 = i28;
                                            yVar6 = yVar2;
                                            i30 = i5;
                                        }
                                    }
                                } else {
                                    yVar2 = yVar5;
                                    arrayList = arrayList2;
                                }
                                z3 = false;
                                if (!z3) {
                                }
                                iArr3 = iArr11;
                                a2 = d.a(iArr11[i28], false);
                                if (a2) {
                                }
                                if (i4 <= i30) {
                                }
                                if (i4 == i30) {
                                }
                                if (!z4) {
                                }
                            } else {
                                iArr3 = iArr11;
                                yVar2 = yVar5;
                                arrayList = arrayList2;
                            }
                            i28++;
                            cVar4 = cVar5;
                            yVar5 = yVar2;
                            arrayList2 = arrayList;
                            iArr11 = iArr3;
                        }
                        i22++;
                        zVar2 = zVar3;
                        y yVar7 = yVar6;
                        i24 = i30;
                        yVar4 = yVar7;
                        i25 = i32;
                        iArr10 = iArr12;
                        int i39 = i34;
                        i26 = i35;
                        i23 = i39;
                    }
                    cVar = cVar4;
                    e eVar = yVar4 == null ? null : new e(yVar4, i23);
                    bVarArr[i21] = eVar;
                    z5 = eVar != null;
                }
                int i40 = zVarArr[i21].f5719a;
            } else {
                cVar = cVar4;
            }
            i21++;
            cVar4 = cVar;
        }
        c cVar6 = cVar4;
        boolean z6 = false;
        int i41 = 0;
        boolean z7 = false;
        while (i41 < length4) {
            int i42 = aVarArr[i41].f5555a;
            if (i42 != 1) {
                if (i42 == 2) {
                    i = length4;
                } else if (i42 != 3) {
                    z zVar4 = zVarArr[i41];
                    int[][] iArr13 = iArr6[i41];
                    cVar6.getClass();
                    int i43 = 0;
                    int i44 = 0;
                    int i45 = 0;
                    y yVar8 = null;
                    while (i43 < zVar4.f5719a) {
                        y yVar9 = zVar4.b[i43];
                        int[] iArr14 = iArr13[i43];
                        int i46 = length4;
                        int i47 = 0;
                        while (i47 < yVar9.f5718a) {
                            z zVar5 = zVar4;
                            if (d.a(iArr14[i47], true)) {
                                int i48 = (yVar9.b[i47].x & 1) != 0 ? 2 : 1;
                                yVar = yVar9;
                                if (d.a(iArr14[i47], false)) {
                                    i48 += 1000;
                                }
                                if (i48 > i45) {
                                    i45 = i48;
                                    i44 = i47;
                                    yVar8 = yVar;
                                }
                            } else {
                                yVar = yVar9;
                            }
                            i47++;
                            zVar4 = zVar5;
                            yVar9 = yVar;
                        }
                        i43++;
                        length4 = i46;
                    }
                    i = length4;
                    bVarArr[i41] = yVar8 == null ? null : new e(yVar8, i44);
                } else {
                    i = length4;
                    if (!z7) {
                        z zVar6 = zVarArr[i41];
                        int[][] iArr15 = iArr6[i41];
                        cVar6.getClass();
                        int i49 = 0;
                        int i50 = 0;
                        int i51 = 0;
                        y yVar10 = null;
                        while (i49 < zVar6.f5719a) {
                            y yVar11 = zVar6.b[i49];
                            int[] iArr16 = iArr15[i49];
                            y yVar12 = yVar10;
                            int i52 = i51;
                            int i53 = i50;
                            int i54 = 0;
                            while (i54 < yVar11.f5718a) {
                                z zVar7 = zVar6;
                                if (d.a(iArr16[i54], true)) {
                                    int i55 = yVar11.b[i54].x;
                                    boolean z8 = (i55 & 1) != 0;
                                    boolean z9 = (i55 & 2) != 0;
                                    if (!z8) {
                                        i3 = z9 ? 1 : 3;
                                    }
                                    iArr2 = iArr15;
                                    if (d.a(iArr16[i54], false)) {
                                        i3 += 1000;
                                    }
                                    if (i3 > i52) {
                                        i52 = i3;
                                        i53 = i54;
                                        yVar12 = yVar11;
                                    }
                                    i54++;
                                    zVar6 = zVar7;
                                    iArr15 = iArr2;
                                }
                                iArr2 = iArr15;
                                i54++;
                                zVar6 = zVar7;
                                iArr15 = iArr2;
                            }
                            i49++;
                            i50 = i53;
                            i51 = i52;
                            yVar10 = yVar12;
                        }
                        e eVar2 = yVar10 == null ? null : new e(yVar10, i50);
                        bVarArr[i41] = eVar2;
                        z = eVar2 != null;
                        i41++;
                        z7 = z;
                        length4 = i;
                    }
                }
                z = z7;
                i41++;
                z7 = z;
                length4 = i;
            } else {
                i = length4;
                if (!z6) {
                    z zVar8 = zVarArr[i41];
                    int[][] iArr17 = iArr6[i41];
                    cVar6.getClass();
                    int i56 = 0;
                    int i57 = 0;
                    int i58 = -1;
                    int i59 = -1;
                    while (i56 < zVar8.f5719a) {
                        y yVar13 = zVar8.b[i56];
                        int[] iArr18 = iArr17[i56];
                        int i60 = i59;
                        int i61 = i58;
                        int i62 = i57;
                        int i63 = 0;
                        while (i63 < yVar13.f5718a) {
                            boolean z10 = z7;
                            if (d.a(iArr18[i63], true)) {
                                o oVar4 = yVar13.b[i63];
                                iArr = iArr17;
                                int i64 = iArr18[i63];
                                if ((oVar4.x & 1) != 0) {
                                    z2 = false;
                                    i2 = 2;
                                } else {
                                    i2 = 1;
                                    z2 = false;
                                }
                                if (d.a(i64, z2)) {
                                    i2 += 1000;
                                }
                                if (i2 > i62) {
                                    i60 = i56;
                                    i61 = i63;
                                    i62 = i2;
                                }
                            } else {
                                iArr = iArr17;
                            }
                            i63++;
                            iArr17 = iArr;
                            z7 = z10;
                        }
                        i56++;
                        i57 = i62;
                        i58 = i61;
                        i59 = i60;
                        z7 = z7;
                    }
                    z = z7;
                    e eVar3 = i59 == -1 ? null : new e(zVar8.b[i59], i58);
                    bVarArr[i41] = eVar3;
                    z6 = eVar3 != null;
                    i41++;
                    z7 = z;
                    length4 = i;
                }
                z = z7;
                i41++;
                z7 = z;
                length4 = i;
            }
        }
        for (int i65 = 0; i65 < aVarArr.length; i65++) {
            if (this.b.get(i65)) {
                bVarArr[i65] = null;
            } else {
                z zVar9 = zVarArr[i65];
                Map map = (Map) this.f5724a.get(i65);
                if (map != null && map.containsKey(zVar9)) {
                    if (((Map) this.f5724a.get(i65)).get(zVar9) != null) {
                        throw new ClassCastException();
                    }
                    bVarArr[i65] = null;
                }
            }
        }
        f fVar = new f(zVarArr);
        t[] tVarArr = new t[aVarArr.length];
        for (int i66 = 0; i66 < aVarArr.length; i66++) {
            tVarArr[i66] = bVarArr[i66] != null ? t.b : null;
        }
        return new j(zVar, new h(bVarArr), fVar, tVarArr);
    }
}
