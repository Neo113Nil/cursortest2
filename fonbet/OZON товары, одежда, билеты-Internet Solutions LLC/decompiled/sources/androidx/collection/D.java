package androidx.collection;

import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class D extends AbstractC5146o {

    /* renamed from: e, reason: collision with root package name */
    private int f38609e;

    public /* synthetic */ D(Object obj) {
        this(6);
    }

    private final int d(int i11) {
        int i12 = this.f38726c;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f38724a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = j11 & ((~j11) << 7) & (-9187201950435737472L);
            if (j12 != 0) {
                return (i13 + (Long.numberOfTrailingZeros(j12) >> 3)) & i12;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    private final void e(int i11) {
        long[] jArr;
        int max = i11 > 0 ? Math.max(7, W.e(i11)) : 0;
        this.f38726c = max;
        if (max == 0) {
            jArr = W.f38661a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C7705l.z(jArr);
        }
        this.f38724a = jArr;
        int i12 = max >> 3;
        long j11 = 255 << ((max & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f38609e = W.c(this.f38726c) - this.f38727d;
        this.f38725b = new int[max];
    }

    private final void h(int i11) {
        this.f38727d--;
        long[] jArr = this.f38724a;
        int i12 = this.f38726c;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j11 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j11;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        r23 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (((r10 & ((~r10) << 6)) & (-9187201950435737472L)) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        r3 = d(r7);
        r14 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (r39.f38609e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009d, code lost:
    
        if (((r39.f38724a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        r3 = r39.f38726c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (r3 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        r18 = 128;
        r8 = r39.f38727d;
        r5 = Sc.C.f26091b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bf, code lost:
    
        if (java.lang.Long.compareUnsigned(r8 * 32, r3 * 25) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        r3 = r39.f38724a;
        r5 = r39.f38726c;
        r8 = r39.f38725b;
        androidx.collection.W.a(r3, r5);
        r9 = 0;
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cd, code lost:
    
        if (r9 == r5) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        r11 = r9 >> 3;
        r22 = (r9 & 7) << 3;
        r24 = (r3[r11] >> r22) & r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:
    
        if (r24 != 128) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e9, code lost:
    
        if (r24 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ee, code lost:
    
        r24 = java.lang.Integer.hashCode(r8[r9]) * r6;
        r25 = r6;
        r6 = (r24 ^ (r24 << 16)) >>> 7;
        r26 = d(r6);
        r6 = r6 & r5;
        r28 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0119, code lost:
    
        if ((((r26 - r6) & r5) / 8) != (((r9 - r6) & r5) / 8)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0145, code lost:
    
        r2 = r3;
        r3 = r26 >> 3;
        r14 = r2[r3];
        r27 = (r26 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0155, code lost:
    
        if (((r14 >> r27) & r28) != 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0157, code lost:
    
        r34 = r8;
        r35 = r9;
        r2[r3] = ((~(r28 << r27)) & r14) | ((r24 & 127) << r27);
        r2[r11] = (r2[r11] & (~(r28 << r22))) | (128 << r22);
        r34[r26] = r34[r35];
        r34[r35] = 0;
        r9 = r35;
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a8, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r3 = r2;
        r6 = r25;
        r14 = r28;
        r8 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017f, code lost:
    
        r34 = r8;
        r35 = r9;
        r2[r3] = ((~(r28 << r27)) & r14) | ((r24 & 127) << r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0192, code lost:
    
        if (r10 != (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0194, code lost:
    
        r10 = androidx.collection.W.b(r2, r35 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x019a, code lost:
    
        r34[r10] = r34[r26];
        r34[r26] = r34[r35];
        r34[r35] = r34[r10];
        r9 = r35 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011b, code lost:
    
        r27 = r3;
        r27[r11] = ((r24 & 127) << r22) | (r27[r11] & (~(r28 << r22)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r27, "<this>");
        r27[r27.length - 1] = (r27[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r3 = r27;
        r6 = r25;
        r14 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00eb, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00df, code lost:
    
        r10 = r9;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c1, code lost:
    
        r28 = r14;
        r39.f38609e = androidx.collection.W.c(r39.f38726c) - r39.f38727d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0242, code lost:
    
        r16 = d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x024b, code lost:
    
        r39.f38727d++;
        r1 = r39.f38609e;
        r2 = r39.f38724a;
        r3 = r16 >> 3;
        r5 = r2[r3];
        r7 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0263, code lost:
    
        if (((r5 >> r7) & r28) != r18) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0265, code lost:
    
        r8 = r23 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x026a, code lost:
    
        r39.f38609e = r1 - r8;
        r1 = r39.f38726c;
        r5 = (r5 & (~(r28 << r7))) | (r12 << r7);
        r2[r3] = r5;
        r2[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0268, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d0, code lost:
    
        r28 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d8, code lost:
    
        r2 = androidx.collection.W.d(r39.f38726c);
        r3 = r39.f38724a;
        r5 = r39.f38725b;
        r6 = r39.f38726c;
        e(r2);
        r2 = r39.f38724a;
        r8 = r39.f38725b;
        r9 = r39.f38726c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ef, code lost:
    
        if (r10 >= r6) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01fe, code lost:
    
        if (((r3[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r18) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0200, code lost:
    
        r11 = r5[r10];
        r14 = java.lang.Integer.hashCode(r11) * (-862048943);
        r14 = r14 ^ (r14 << 16);
        r15 = d(r14 >>> 7);
        r16 = r2;
        r1 = r14 & 127;
        r14 = r15 >> 3;
        r20 = (r15 & 7) << 3;
        r1 = (r16[r14] & (~(255 << r20))) | (r1 << r20);
        r16[r14] = r1;
        r16[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r8[r15] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x023b, code lost:
    
        r10 = r10 + 1;
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0239, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d5, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x009f, code lost:
    
        r28 = 255;
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0249, code lost:
    
        r16 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i11) {
        boolean z11;
        int i12;
        int i13 = i11;
        int i14 = 1;
        int i15 = this.f38727d;
        int i16 = -862048943;
        int hashCode = Integer.hashCode(i13) * (-862048943);
        int i17 = hashCode ^ (hashCode << 16);
        int i18 = i17 >>> 7;
        int i19 = i17 & 127;
        int i21 = this.f38726c;
        int i22 = i18 & i21;
        int i23 = 0;
        loop0: while (true) {
            long[] jArr = this.f38724a;
            int i24 = i22 >> 3;
            int i25 = (i22 & 7) << 3;
            int i26 = i23;
            long j11 = (((-i25) >> 63) & (jArr[i24 + i14] << (64 - i25))) | (jArr[i24] >>> i25);
            long j12 = i19;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (j13 - 72340172838076673L) & (~j13) & (-9187201950435737472L);
            while (true) {
                if (j14 == 0) {
                    break;
                }
                i12 = (i22 + (Long.numberOfTrailingZeros(j14) >> 3)) & i21;
                z11 = i14;
                if (this.f38725b[i12] == i13) {
                    break loop0;
                }
                j14 &= j14 - 1;
                i14 = z11 ? 1 : 0;
            }
            i23 = i26 + 8;
            i22 = (i22 + i23) & i21;
            i13 = i11;
            i14 = z11 ? 1 : 0;
        }
        this.f38725b[i12] = i11;
        if (this.f38727d != i15) {
            return z11;
        }
        return false;
    }

    public final void c() {
        this.f38727d = 0;
        long[] jArr = this.f38724a;
        if (jArr != W.f38661a) {
            C7705l.z(jArr);
            long[] jArr2 = this.f38724a;
            int i11 = this.f38726c;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        this.f38609e = W.c(this.f38726c) - this.f38727d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i11) {
        int i12;
        int hashCode = Integer.hashCode(i11) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f38726c;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f38724a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j11 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j12 = (i14 * 72340172838076673L) ^ j11;
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j13 == 0) {
                    break;
                }
                i12 = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i15;
                if (this.f38725b[i12] == i11) {
                    break loop0;
                } else {
                    j13 &= j13 - 1;
                }
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
        if (i12 >= 0) {
            h(i12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        if (((r1 & ((~r1) << 6)) & r18) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        r9 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(@NotNull D elements) {
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i11;
        char c11;
        long j11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int[] iArr3 = elements.f38725b;
        long[] jArr3 = elements.f38724a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j12 = jArr3[i14];
            char c12 = 7;
            long j13 = -9187201950435737472L;
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8;
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((255 & j12) < 128) {
                        int i18 = iArr3[(i14 << 3) + i17];
                        int hashCode = Integer.hashCode(i18) * (-862048943);
                        int i19 = hashCode ^ (hashCode << 16);
                        int i21 = i19 & 127;
                        c11 = c12;
                        int i22 = this.f38726c;
                        int i23 = (i19 >>> 7) & i22;
                        j11 = j13;
                        int i24 = 0;
                        while (true) {
                            long[] jArr4 = this.f38724a;
                            int i25 = i23 >> 3;
                            i11 = i15;
                            int i26 = (i23 & 7) << 3;
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j14 = (jArr4[i25] >>> i26) | (((-i26) >> 63) & (jArr4[i25 + 1] << (64 - i26)));
                            long j15 = (i21 * 72340172838076673L) ^ j14;
                            long j16 = (j15 - 72340172838076673L) & (~j15) & j11;
                            while (true) {
                                if (j16 == 0) {
                                    break;
                                }
                                i13 = ((Long.numberOfTrailingZeros(j16) >> 3) + i23) & i22;
                                int i27 = i21;
                                if (this.f38725b[i13] == i18) {
                                    break;
                                }
                                j16 &= j16 - 1;
                                i21 = i27;
                            }
                            i24 += 8;
                            i23 = (i23 + i24) & i22;
                            iArr3 = iArr2;
                            i15 = i11;
                            jArr3 = jArr2;
                            i21 = i12;
                        }
                        if (i13 >= 0) {
                            h(i13);
                        }
                    } else {
                        jArr2 = jArr3;
                        iArr2 = iArr3;
                        i11 = i15;
                        c11 = c12;
                        j11 = j13;
                    }
                    j12 >>= i11;
                    i17++;
                    c12 = c11;
                    j13 = j11;
                    iArr3 = iArr2;
                    i15 = i11;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                iArr = iArr3;
                if (i16 != i15) {
                    return;
                }
            } else {
                jArr = jArr3;
                iArr = iArr3;
            }
            if (i14 == length) {
                return;
            }
            i14++;
            iArr3 = iArr;
            jArr3 = jArr;
        }
    }

    public D(int i11) {
        super(0);
        if (i11 >= 0) {
            e(W.f(i11));
        } else {
            k0.d.a("Capacity must be a positive value.");
            throw null;
        }
    }
}
