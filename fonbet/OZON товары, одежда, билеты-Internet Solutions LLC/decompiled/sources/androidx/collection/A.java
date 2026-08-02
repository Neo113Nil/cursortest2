package androidx.collection;

import kotlin.collections.C7705l;

/* loaded from: classes.dex */
public final class A extends AbstractC5140i {

    /* renamed from: f, reason: collision with root package name */
    private int f38607f;

    public A() {
        super(0);
        f(W.f(6));
    }

    private final int e(int i11) {
        int i12 = this.f38711d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f38708a;
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

    private final void f(int i11) {
        long[] jArr;
        int max = i11 > 0 ? Math.max(7, W.e(i11)) : 0;
        this.f38711d = max;
        if (max == 0) {
            jArr = W.f38661a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C7705l.z(jArr);
        }
        this.f38708a = jArr;
        int i12 = max >> 3;
        long j11 = 255 << ((max & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f38607f = W.c(this.f38711d) - this.f38712e;
        this.f38709b = new int[max];
        this.f38710c = new int[max];
    }

    public final void d() {
        this.f38712e = 0;
        long[] jArr = this.f38708a;
        if (jArr != W.f38661a) {
            C7705l.z(jArr);
            long[] jArr2 = this.f38708a;
            int i11 = this.f38711d;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        this.f38607f = W.c(this.f38711d) - this.f38712e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        r3 = e(r6);
        r9 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r39.f38607f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        if (((r39.f38708a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        r3 = r39.f38711d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if (r3 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        r13 = r39.f38712e;
        r5 = Sc.C.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        if (java.lang.Long.compareUnsigned(r13 * 32, r3 * 25) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        r3 = r39.f38708a;
        r4 = r39.f38711d;
        r5 = r39.f38709b;
        r13 = r39.f38710c;
        androidx.collection.W.a(r3, r4);
        r14 = 0;
        r7 = -1;
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
    
        if (r14 == r4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
    
        r8 = r14 >> 3;
        r20 = (r14 & 7) << 3;
        r24 = (r3[r8] >> r20) & r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dd, code lost:
    
        if (r24 != 128) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e9, code lost:
    
        if (r24 == 254) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        r24 = java.lang.Integer.hashCode(r5[r14]) * r21;
        r25 = r9;
        r9 = (r24 ^ (r24 << 16)) >>> 7;
        r10 = e(r9);
        r9 = r9 & r4;
        r28 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0118, code lost:
    
        if ((((r10 - r9) & r4) / 8) != (((r14 - r9) & r4) / 8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011a, code lost:
    
        r3[r8] = (r3[r8] & (~(r25 << r20))) | ((r24 & 127) << r20);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "<this>");
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013b, code lost:
    
        r14 = r14 + 1;
        r9 = r25;
        r15 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0142, code lost:
    
        r8 = r10 >> 3;
        r33 = r3[r8];
        r9 = (r10 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0151, code lost:
    
        if (((r33 >> r9) & r25) != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0153, code lost:
    
        r3[r8] = (r33 & (~(r25 << r9))) | ((r24 & 127) << r9);
        r3[r8] = (r3[r8] & (~(r25 << r20))) | (128 << r20);
        r5[r10] = r5[r14];
        r5[r14] = 0;
        r13[r10] = r13[r14];
        r13[r14] = 0;
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01bc, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "<this>");
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0184, code lost:
    
        r3[r8] = (r33 & (~(r25 << r9))) | ((r24 & 127) << r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0198, code lost:
    
        if (r7 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x019a, code lost:
    
        r7 = androidx.collection.W.b(r3, r14 + 1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a0, code lost:
    
        r5[r7] = r5[r10];
        r5[r10] = r5[r14];
        r5[r14] = r5[r7];
        r13[r7] = r13[r10];
        r13[r10] = r13[r14];
        r13[r14] = r13[r7];
        r14 = r14 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:
    
        r14 = r14 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00df, code lost:
    
        r38 = r14;
        r14 = r14 + 1;
        r7 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01cc, code lost:
    
        r25 = r9;
        r28 = r15;
        r39.f38607f = androidx.collection.W.c(r39.f38711d) - r39.f38712e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0259, code lost:
    
        r3 = e(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x025d, code lost:
    
        r39.f38712e++;
        r1 = r39.f38607f;
        r2 = r39.f38708a;
        r4 = r3 >> 3;
        r5 = r2[r4];
        r7 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0275, code lost:
    
        if (((r5 >> r7) & r25) != r22) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0277, code lost:
    
        r16 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0279, code lost:
    
        r39.f38607f = r1 - r16;
        r1 = r39.f38711d;
        r5 = (r5 & (~(r25 << r7))) | (r11 << r7);
        r2[r4] = r5;
        r2[(((r3 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01dd, code lost:
    
        r25 = 255;
        r28 = r15;
        r22 = 128;
        r2 = androidx.collection.W.d(r39.f38711d);
        r3 = r39.f38708a;
        r4 = r39.f38709b;
        r5 = r39.f38710c;
        r7 = r39.f38711d;
        f(r2);
        r2 = r39.f38708a;
        r8 = r39.f38709b;
        r9 = r39.f38710c;
        r10 = r39.f38711d;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01fe, code lost:
    
        if (r13 >= r7) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x020e, code lost:
    
        if (((r3[r13 >> 3] >> ((r13 & 7) << 3)) & 255) >= 128) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0210, code lost:
    
        r14 = r4[r13];
        r15 = java.lang.Integer.hashCode(r14) * r21;
        r15 = r15 ^ (r15 << 16);
        r1 = e(r15 >>> 7);
        r17 = r2;
        r1 = r15 & 127;
        r15 = r1 >> 3;
        r19 = (r1 & 7) << 3;
        r1 = (r17[r15] & (~(255 << r19))) | (r1 << r19);
        r17[r15] = r1;
        r17[(((r1 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r1] = r14;
        r9[r1] = r5[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0252, code lost:
    
        r13 = r13 + 1;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0250, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x009b, code lost:
    
        r25 = 255;
        r28 = r15;
        r22 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i11, int i12) {
        int i13;
        int i14;
        int i15 = i11;
        int i16 = 1;
        int i17 = -862048943;
        int hashCode = Integer.hashCode(i15) * (-862048943);
        int i18 = hashCode ^ (hashCode << 16);
        int i19 = i18 >>> 7;
        int i21 = i18 & 127;
        int i22 = this.f38711d;
        int i23 = i19 & i22;
        int i24 = 0;
        loop0: while (true) {
            long[] jArr = this.f38708a;
            int i25 = i23 >> 3;
            int i26 = (i23 & 7) << 3;
            int i27 = i24;
            int i28 = 0;
            long j11 = (((-i26) >> 63) & (jArr[i25 + i16] << (64 - i26))) | (jArr[i25] >>> i26);
            long j12 = i21;
            int i29 = i16;
            int i31 = i21;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j14 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i23 + (Long.numberOfTrailingZeros(j14) >> 3)) & i22;
                int i32 = i17;
                if (this.f38709b[numberOfTrailingZeros] == i15) {
                    i14 = numberOfTrailingZeros;
                    break loop0;
                } else {
                    j14 &= j14 - 1;
                    i17 = i32;
                }
            }
            i24 = i27 + 8;
            i23 = (i23 + i24) & i22;
            i15 = i11;
            i21 = i31;
            i17 = i13;
            i16 = i29;
        }
        if (i14 < 0) {
            i14 = ~i14;
        }
        this.f38709b[i14] = i11;
        this.f38710c[i14] = i12;
    }
}
