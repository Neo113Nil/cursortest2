package r;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public long[] f19059a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f19060b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f19061c;

    /* renamed from: d, reason: collision with root package name */
    public int f19062d;

    /* renamed from: e, reason: collision with root package name */
    public int f19063e;
    public int f;

    public final int a(int i) {
        int i5 = this.f19062d;
        int i6 = i & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f19059a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j5 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j6 = j5 & ((~j5) << 7) & (-9187201950435737472L);
            if (j6 != 0) {
                return (i6 + (Long.numberOfTrailingZeros(j6) >> 3)) & i5;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j5) {
        int i;
        int i5 = ((int) ((j5 >>> 32) ^ j5)) * (-862048943);
        int i6 = i5 ^ (i5 << 16);
        int i7 = i6 & 127;
        int i8 = this.f19062d;
        int i9 = (i6 >>> 7) & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr = this.f19059a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j6 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j7 = (i7 * 72340172838076673L) ^ j6;
            long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j8 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j8) >> 3) + i9) & i8;
                if (this.f19060b[i] == j5) {
                    break loop0;
                }
                j8 &= j8 - 1;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
        }
        if (i >= 0) {
            return this.f19061c[i];
        }
        return null;
    }

    public final void c(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, O.c(i)) : 0;
        this.f19062d = max;
        if (max == 0) {
            jArr = O.f18957a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            X3.l.C0(jArr, -9187201950435737472L);
        }
        this.f19059a = jArr;
        int i5 = max >> 3;
        long j5 = 255 << ((max & 7) << 3);
        jArr[i5] = (jArr[i5] & (~j5)) | j5;
        this.f = O.a(this.f19062d) - this.f19063e;
        this.f19060b = new long[max];
        this.f19061c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        r1 = a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        if (r40.f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        if (((r40.f19059a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
    
        r1 = r40.f19062d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        r8 = 8;
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c8, code lost:
    
        if (java.lang.Long.compare((r40.f19063e * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ca, code lost:
    
        r1 = r40.f19059a;
        r2 = r40.f19062d;
        r3 = r40.f19060b;
        r5 = r40.f19061c;
        r6 = (r2 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d7, code lost:
    
        if (r7 >= r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d9, code lost:
    
        r10 = r8;
        r8 = r1[r7] & r11;
        r1[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r8 = r10;
        r9 = r9;
        r11 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f8, code lost:
    
        r12 = r8;
        r31 = r9;
        r6 = X3.l.F0(r1);
        r7 = r6 - 1;
        r10 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[0];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0114, code lost:
    
        if (r6 == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0116, code lost:
    
        r7 = r6 >> 3;
        r19 = (r6 & 7) << 3;
        r8 = (r1[r7] >> r19) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0124, code lost:
    
        if (r8 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012b, code lost:
    
        if (r8 == 254) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012e, code lost:
    
        r8 = r3[r6];
        r8 = ((int) (r8 ^ (r8 >>> r13))) * r20;
        r9 = (r8 ^ (r8 << 16)) >>> 7;
        r29 = a(r9);
        r9 = r9 & r2;
        r33 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014d, code lost:
    
        if ((((r29 - r9) & r2) / 8) != (((r6 - r9) & r2) / r12)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0174, code lost:
    
        r35 = r12;
        r30 = r13;
        r9 = r29 >> 3;
        r10 = r1[r9];
        r12 = (r29 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0186, code lost:
    
        if (((r10 >> r12) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0188, code lost:
    
        r36 = r15;
        r37 = r14;
        r1[r9] = (r10 & (~(255 << r12))) | ((r8 & 127) << r12);
        r1[r7] = (r1[r7] & (~(255 << r19))) | (128 << r19);
        r3[r29] = r3[r6];
        r3[r6] = 0;
        r5[r29] = r5[r6];
        r5[r6] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d5, code lost:
    
        r1[r1.length - 1] = (r1[r36] & r33) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r13 = r30;
        r10 = r33;
        r12 = r35;
        r15 = r36;
        r14 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b4, code lost:
    
        r37 = r14;
        r36 = r15;
        r1[r9] = ((r8 & 127) << r12) | (r10 & (~(255 << r12)));
        r7 = r3[r29];
        r3[r29] = r3[r6];
        r3[r6] = r7;
        r7 = r5[r29];
        r5[r29] = r5[r6];
        r5[r6] = r7;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014f, code lost:
    
        r1[r7] = ((r8 & 127) << r19) | (r1[r7] & (~(255 << r19)));
        r1[r1.length - r14] = (r1[r15] & r33) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r13 = r13;
        r10 = r33;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0126, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ee, code lost:
    
        r37 = r14;
        r36 = r15;
        r40.f = r.O.a(r40.f19062d) - r40.f19063e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0280, code lost:
    
        r1 = a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0284, code lost:
    
        r17 = r1;
        r40.f19063e++;
        r1 = r40.f;
        r2 = r40.f19059a;
        r3 = r17 >> 3;
        r4 = r2[r3];
        r6 = (r17 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x029e, code lost:
    
        if (((r4 >> r6) & 255) != r23) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02a0, code lost:
    
        r7 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02a5, code lost:
    
        r40.f = r1 - r7;
        r1 = r40.f19062d;
        r4 = (r4 & (~(255 << r6))) | (r31 << r6);
        r2[r3] = r4;
        r2[(((r17 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02a3, code lost:
    
        r7 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ff, code lost:
    
        r31 = r9;
        r37 = 1;
        r36 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x020d, code lost:
    
        r1 = r.O.b(r40.f19062d);
        r2 = r40.f19059a;
        r3 = r40.f19060b;
        r5 = r40.f19061c;
        r6 = r40.f19062d;
        c(r1);
        r1 = r40.f19059a;
        r7 = r40.f19060b;
        r8 = r40.f19061c;
        r9 = r40.f19062d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0228, code lost:
    
        if (r10 >= r6) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0237, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r23) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0239, code lost:
    
        r11 = r3[r10];
        r13 = ((int) ((r11 >>> r13) ^ r11)) * r20;
        r13 = r13 ^ (r13 << 16);
        r14 = a(r13 >>> 7);
        r17 = r1;
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r18 = (r14 & 7) << 3;
        r1 = (r17[r13] & (~(255 << r18))) | (r1 << r18);
        r17[r13] = r1;
        r17[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r14] = r11;
        r8[r14] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x027a, code lost:
    
        r10 = r10 + 1;
        r2 = r15;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0277, code lost:
    
        r17 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0208, code lost:
    
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x009d, code lost:
    
        r31 = r9;
        r37 = 1;
        r36 = 0;
        r23 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j5, C2316B c2316b) {
        int i;
        int i5;
        char c5 = ' ';
        int i6 = -862048943;
        int i7 = ((int) (j5 ^ (j5 >>> 32))) * (-862048943);
        int i8 = i7 ^ (i7 << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f19062d;
        int i12 = i9 & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f19059a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            int i16 = 1;
            int i17 = i13;
            int i18 = 0;
            long j6 = (((-i15) >> 63) & (jArr[i14 + 1] << (64 - i15))) | (jArr[i14] >>> i15);
            long j7 = i10;
            char c6 = c5;
            int i19 = i10;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            long j9 = -9187201950435737472L;
            long j10 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i5 = (i12 + (Long.numberOfTrailingZeros(j10) >> 3)) & i11;
                int i20 = i6;
                if (this.f19060b[i5] == j5) {
                    break loop0;
                }
                j10 &= j10 - 1;
                i6 = i20;
            }
            i13 = i17 + 8;
            i12 = (i12 + i13) & i11;
            i10 = i19;
            i6 = i;
            c5 = c6;
        }
        this.f19060b[i5] = j5;
        this.f19061c[i5] = c2316b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dc, code lost:
    
        if (((r2 & ((~r2) << 6)) & r22) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
    
        r0 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        long[] jArr;
        Object[] objArr;
        boolean z3;
        int i;
        Object[] objArr2;
        long j5;
        int i5;
        char c5;
        long j6;
        long[] jArr2;
        int i6;
        if (obj != this) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                if (yVar.f19063e == this.f19063e) {
                    long[] jArr3 = this.f19060b;
                    Object[] objArr3 = this.f19061c;
                    long[] jArr4 = this.f19059a;
                    int length = jArr4.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j7 = jArr4[i7];
                            char c6 = 7;
                            long j8 = -9187201950435737472L;
                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                int i10 = 0;
                                z3 = true;
                                while (i10 < i9) {
                                    if ((j7 & 255) < 128) {
                                        int i11 = (i7 << 3) + i10;
                                        objArr2 = objArr3;
                                        long j9 = jArr3[i11];
                                        c5 = c6;
                                        Object obj2 = objArr2[i11];
                                        if (obj2 != null) {
                                            i = i10;
                                            j5 = j7;
                                            i5 = i8;
                                            j6 = j8;
                                            jArr2 = jArr3;
                                            if (!obj2.equals(yVar.b(j9))) {
                                                return false;
                                            }
                                        } else {
                                            if (yVar.b(j9) != null) {
                                                return false;
                                            }
                                            j6 = j8;
                                            int i12 = ((int) (j9 ^ (j9 >>> 32))) * (-862048943);
                                            int i13 = i12 ^ (i12 << 16);
                                            int i14 = i13 & 127;
                                            int i15 = yVar.f19062d;
                                            int i16 = (i13 >>> 7) & i15;
                                            i5 = i8;
                                            int i17 = 0;
                                            while (true) {
                                                long[] jArr5 = yVar.f19059a;
                                                int i18 = i16 >> 3;
                                                int i19 = (i16 & 7) << 3;
                                                long j10 = jArr5[i18] >>> i19;
                                                long j11 = jArr5[i18 + 1] << (64 - i19);
                                                i = i10;
                                                jArr2 = jArr3;
                                                long j12 = j10 | (j11 & ((-i19) >> 63));
                                                j5 = j7;
                                                long j13 = (i14 * 72340172838076673L) ^ j12;
                                                long j14 = (j13 - 72340172838076673L) & (~j13) & j6;
                                                while (true) {
                                                    if (j14 == 0) {
                                                        break;
                                                    }
                                                    int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i16) & i15;
                                                    if (yVar.f19060b[numberOfTrailingZeros] == j9) {
                                                        i6 = numberOfTrailingZeros;
                                                        break;
                                                    }
                                                    j14 &= j14 - 1;
                                                }
                                                i17 += 8;
                                                i16 = (i16 + i17) & i15;
                                                jArr3 = jArr2;
                                                i10 = i;
                                                j7 = j5;
                                            }
                                            if (!(i6 >= 0)) {
                                                return false;
                                            }
                                        }
                                    } else {
                                        i = i10;
                                        objArr2 = objArr3;
                                        j5 = j7;
                                        i5 = i8;
                                        c5 = c6;
                                        j6 = j8;
                                        jArr2 = jArr3;
                                    }
                                    j7 = j5 >> i5;
                                    i10 = i + 1;
                                    c6 = c5;
                                    jArr3 = jArr2;
                                    objArr3 = objArr2;
                                    i8 = i5;
                                    j8 = j6;
                                }
                                objArr = objArr3;
                                int i20 = i8;
                                jArr = jArr3;
                                if (i9 != i20) {
                                    return true;
                                }
                            } else {
                                jArr = jArr3;
                                objArr = objArr3;
                                z3 = true;
                            }
                            if (i7 == length) {
                                return z3;
                            }
                            i7++;
                            jArr3 = jArr;
                            objArr3 = objArr;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.f19060b;
        Object[] objArr = this.f19061c;
        long[] jArr2 = this.f19059a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i5 = 0;
        while (true) {
            long j5 = jArr2[i];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        int i8 = (i << 3) + i7;
                        long j6 = jArr[i8];
                        Object obj = objArr[i8];
                        i5 += (obj != null ? obj.hashCode() : 0) ^ ((int) (j6 ^ (j6 >>> 32)));
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return i5;
                }
            }
            if (i == length) {
                return i5;
            }
            i++;
        }
    }

    public final String toString() {
        int i;
        int i5;
        if (this.f19063e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f19060b;
        Object[] objArr = this.f19061c;
        long[] jArr2 = this.f19059a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                long j5 = jArr2[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((255 & j5) < 128) {
                            int i10 = (i6 << 3) + i9;
                            i5 = i6;
                            long j6 = jArr[i10];
                            Object obj = objArr[i10];
                            sb.append(j6);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i7++;
                            if (i7 < this.f19063e) {
                                sb.append(", ");
                            }
                        } else {
                            i5 = i6;
                        }
                        j5 >>= 8;
                        i9++;
                        i6 = i5;
                    }
                    int i11 = i6;
                    if (i8 != 8) {
                        break;
                    }
                    i = i11;
                } else {
                    i = i6;
                }
                if (i == length) {
                    break;
                }
                i6 = i + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }
}
