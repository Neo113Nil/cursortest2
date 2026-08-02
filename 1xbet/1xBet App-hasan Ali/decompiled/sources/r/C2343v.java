package r;

import s.AbstractC2351a;

/* renamed from: r.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2343v extends AbstractC2333k {
    public int f;

    public C2343v(int i) {
        this.f19011a = O.f18957a;
        this.f19012b = AbstractC2335m.f19017a;
        this.f19013c = AbstractC2351a.f19151c;
        if (i >= 0) {
            e(O.d(i));
        } else {
            AbstractC2351a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f19015e = 0;
        long[] jArr = this.f19011a;
        if (jArr != O.f18957a) {
            X3.l.C0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f19011a;
            int i = this.f19014d;
            int i5 = i >> 3;
            long j5 = 255 << ((i & 7) << 3);
            jArr2[i5] = (jArr2[i5] & (~j5)) | j5;
        }
        X3.l.B0(this.f19013c, 0, this.f19014d);
        this.f = O.a(this.f19014d) - this.f19015e;
    }

    public final int d(int i) {
        int i5 = this.f19014d;
        int i6 = i & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f19011a;
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

    public final void e(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, O.c(i)) : 0;
        this.f19014d = max;
        if (max == 0) {
            jArr = O.f18957a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            X3.l.C0(jArr, -9187201950435737472L);
        }
        this.f19011a = jArr;
        int i5 = max >> 3;
        long j5 = 255 << ((max & 7) << 3);
        jArr[i5] = (jArr[i5] & (~j5)) | j5;
        this.f = O.a(this.f19014d) - this.f19015e;
        this.f19012b = new int[max];
        this.f19013c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i) {
        int i5;
        int i6 = (-862048943) * i;
        int i7 = i6 ^ (i6 << 16);
        int i8 = i7 & 127;
        int i9 = this.f19014d;
        int i10 = (i7 >>> 7) & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr = this.f19011a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j5 = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j6 = (i8 * 72340172838076673L) ^ j5;
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                i5 = ((Long.numberOfTrailingZeros(j7) >> 3) + i10) & i9;
                if (this.f19012b[i5] == i) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
        }
        if (i5 < 0) {
            return null;
        }
        this.f19015e--;
        long[] jArr2 = this.f19011a;
        int i14 = this.f19014d;
        int i15 = i5 >> 3;
        int i16 = (i5 & 7) << 3;
        long j8 = (jArr2[i15] & (~(255 << i16))) | (254 << i16);
        jArr2[i15] = j8;
        jArr2[(((i5 - 7) & i14) + (i14 & 7)) >> 3] = j8;
        Object[] objArr = this.f19013c;
        Object obj = objArr[i5];
        objArr[i5] = null;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        r20 = r11;
        r3 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (((((~r7) << 6) & r7) & r20) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        r2 = d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r37.f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (((r37.f19011a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        r2 = r37.f19014d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        if (r2 <= 8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        r22 = 128;
        r24 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
    
        if (java.lang.Long.compare((r37.f19015e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        r2 = r37.f19011a;
        r5 = r37.f19014d;
        r6 = r37.f19012b;
        r7 = r37.f19013c;
        r8 = (r5 + 7) >> 3;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d0, code lost:
    
        if (r11 >= r8) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d2, code lost:
    
        r17 = r13;
        r13 = r2[r11] & r20;
        r2[r11] = ((~r13) + (r13 >>> 7)) & (-72340172838076674L);
        r11 = r11 + 1;
        r14 = r14;
        r13 = r17;
        r4 = r4;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f3, code lost:
    
        r28 = r4;
        r17 = r13;
        r12 = r14;
        r3 = X3.l.F0(r2);
        r4 = r3 - 1;
        r2[r4] = (r2[r4] & 72057594037927935L) | (-72057594037927936L);
        r2[r3] = r2[0];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0114, code lost:
    
        if (r3 == r5) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0116, code lost:
    
        r4 = r3 >> 3;
        r8 = (r3 & 7) << 3;
        r13 = (r2[r4] >> r8) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0123, code lost:
    
        if (r13 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012a, code lost:
    
        if (r13 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012d, code lost:
    
        r11 = r6[r3] * r17;
        r13 = (r11 ^ (r11 << 16)) >>> 7;
        r14 = d(r13);
        r13 = r13 & r5;
        r31 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0148, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r3 - r13) & r5) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x014a, code lost:
    
        r2[r4] = ((~(255 << r8)) & r2[r4]) | ((r11 & 127) << r8);
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0168, code lost:
    
        r12 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016b, code lost:
    
        r30 = r3;
        r3 = r14 >> 3;
        r12 = r2[r3];
        r4 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017d, code lost:
    
        if (((r12 >> r4) & 255) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017f, code lost:
    
        r2[r3] = ((~(255 << r4)) & r12) | ((r11 & 127) << r4);
        r2[r4] = (r2[r4] & (~(255 << r8))) | (128 << r8);
        r6[r14] = r6[r30];
        r6[r30] = 0;
        r7[r14] = r7[r30];
        r7[r30] = null;
        r3 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d0, code lost:
    
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ac, code lost:
    
        r2[r3] = ((~(255 << r4)) & r12) | ((r11 & 127) << r4);
        r3 = r6[r14];
        r6[r14] = r6[r30];
        r6[r30] = r3;
        r3 = r7[r14];
        r7[r14] = r7[r30];
        r7[r30] = r3;
        r3 = r30 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0125, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01de, code lost:
    
        r31 = r12;
        r37.f = r.O.a(r37.f19014d) - r37.f19015e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x026d, code lost:
    
        r17 = d(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0276, code lost:
    
        r37.f19015e++;
        r1 = r37.f;
        r2 = r37.f19011a;
        r3 = r17 >> 3;
        r4 = r2[r3];
        r6 = (r17 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x028e, code lost:
    
        if (((r4 >> r6) & r24) != r22) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0290, code lost:
    
        r7 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0294, code lost:
    
        r37.f = r1 - r7;
        r1 = r37.f19014d;
        r4 = (r4 & (~(r24 << r6))) | (r9 << r6);
        r2[r3] = r4;
        r2[(((r17 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0293, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ef, code lost:
    
        r28 = r4;
        r31 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01fd, code lost:
    
        r2 = r.O.b(r37.f19014d);
        r3 = r37.f19011a;
        r4 = r37.f19012b;
        r5 = r37.f19013c;
        r6 = r37.f19014d;
        e(r2);
        r2 = r37.f19011a;
        r7 = r37.f19012b;
        r8 = r37.f19013c;
        r11 = r37.f19014d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0217, code lost:
    
        if (r12 >= r6) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0227, code lost:
    
        if (((r3[r12 >> 3] >> ((r12 & 7) << 3)) & r24) >= r22) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0229, code lost:
    
        r13 = r4[r12];
        r14 = r13 * r13;
        r14 = r14 ^ (r14 << 16);
        r15 = d(r14 >>> 7);
        r19 = r2;
        r1 = r14 & 127;
        r14 = r15 >> 3;
        r20 = (r15 & 7) << 3;
        r1 = (r19[r14] & (~(r24 << r20))) | (r1 << r20);
        r19[r14] = r1;
        r19[(((r15 - 7) & r11) + (r11 & 7)) >> 3] = r1;
        r7[r15] = r13;
        r8[r15] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0265, code lost:
    
        r12 = r12 + 1;
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0263, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f6, code lost:
    
        r24 = 255;
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0097, code lost:
    
        r24 = 255;
        r31 = 1;
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0274, code lost:
    
        r17 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, Object obj) {
        int i5;
        int i6 = i;
        int i7 = -862048943;
        int i8 = i6 * (-862048943);
        int i9 = i8 ^ (i8 << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.f19014d;
        int i13 = i10 & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f19011a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            int i17 = 1;
            int i18 = i14;
            long j5 = (((-i16) >> 63) & (jArr[i15 + 1] << (64 - i16))) | (jArr[i15] >>> i16);
            long j6 = i11;
            int i19 = i7;
            int i20 = i11;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = -9187201950435737472L;
            long j9 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j9 == 0) {
                    break;
                }
                i5 = (i13 + (Long.numberOfTrailingZeros(j9) >> 3)) & i12;
                long j10 = j8;
                if (this.f19012b[i5] == i6) {
                    break loop0;
                }
                j9 &= j9 - 1;
                j8 = j10;
            }
            i14 = i18 + 8;
            i13 = (i13 + i14) & i12;
            i7 = i19;
            i11 = i20;
            i6 = i;
        }
        this.f19012b[i5] = i;
        this.f19013c[i5] = obj;
    }

    public /* synthetic */ C2343v() {
        this(6);
    }
}
