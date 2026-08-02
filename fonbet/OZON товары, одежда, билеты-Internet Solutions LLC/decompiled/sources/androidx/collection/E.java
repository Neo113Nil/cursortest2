package androidx.collection;

import kotlin.collections.C7705l;

/* loaded from: classes8.dex */
public final class E extends AbstractC5148q {

    /* renamed from: f, reason: collision with root package name */
    private int f38610f;

    public E(int i11) {
        super(0);
        if (i11 >= 0) {
            c(W.f(i11));
        } else {
            k0.d.a("Capacity must be a positive value.");
            throw null;
        }
    }

    private final int b(int i11) {
        int i12 = this.f38733d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f38730a;
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

    private final void c(int i11) {
        long[] jArr;
        int max = i11 > 0 ? Math.max(7, W.e(i11)) : 0;
        this.f38733d = max;
        if (max == 0) {
            jArr = W.f38661a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C7705l.z(jArr);
        }
        this.f38730a = jArr;
        int i12 = max >> 3;
        long j11 = 255 << ((max & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f38610f = W.c(this.f38733d) - this.f38734e;
        this.f38731b = new long[max];
        this.f38732c = new int[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        r2 = b(r5);
        r8 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r40.f38610f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (((r40.f38730a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        r2 = r40.f38733d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        if (r2 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        r12 = r40.f38734e;
        r4 = Sc.C.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bc, code lost:
    
        if (java.lang.Long.compareUnsigned(r12 * 32, r2 * 25) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        r2 = r40.f38730a;
        r3 = r40.f38733d;
        r4 = r40.f38731b;
        r12 = r40.f38732c;
        androidx.collection.W.a(r2, r3);
        r13 = 0;
        r6 = -1;
        r24 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
    
        if (r13 == r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
    
        r7 = r13 >> 3;
        r16 = (r13 & 7) << 3;
        r26 = (r2[r7] >> r16) & r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dd, code lost:
    
        if (r26 != 128) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e9, code lost:
    
        if (r26 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        r19 = java.lang.Long.hashCode(r4[r13]) * r20;
        r26 = r8;
        r8 = (r19 ^ (r19 << 16)) >>> 7;
        r9 = b(r8);
        r8 = r8 & r3;
        r29 = r14;
        r28 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011a, code lost:
    
        if ((((r9 - r8) & r3) / 8) != (((r13 - r8) & r3) / 8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011c, code lost:
    
        r36 = r2;
        r36[r7] = (r2[r7] & (~(r26 << r16))) | ((r19 & 127) << r16);
        r1 = r36;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "<this>");
        r1[r1.length - 1] = (r1[r28] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013d, code lost:
    
        r13 = r13 + 1;
        r2 = r1;
        r8 = r26;
        r15 = r28;
        r14 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0147, code lost:
    
        r1 = r2;
        r2 = r9 >> 3;
        r34 = r1[r2];
        r8 = (r9 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0156, code lost:
    
        if (((r34 >> r8) & r26) != 128) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0158, code lost:
    
        r37 = "<this>";
        r1[r2] = (r34 & (~(r26 << r8))) | ((r19 & 127) << r8);
        r1[r7] = (r1[r7] & (~(r26 << r16))) | (128 << r16);
        r4[r9] = r4[r13];
        r4[r13] = 0;
        r12[r9] = r12[r13];
        r12[r13] = r28;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b9, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r37);
        r1[r1.length - 1] = (r1[r28] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0184, code lost:
    
        r37 = "<this>";
        r1[r2] = (r34 & (~(r26 << r8))) | ((r19 & 127) << r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0196, code lost:
    
        if (r6 != (-1)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0198, code lost:
    
        r6 = androidx.collection.W.b(r1, r13 + 1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019e, code lost:
    
        r4[r6] = r4[r9];
        r4[r9] = r4[r13];
        r4[r13] = r4[r6];
        r12[r6] = r12[r9];
        r12[r9] = r12[r13];
        r12[r13] = r12[r6];
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00eb, code lost:
    
        r13 = r13 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00df, code lost:
    
        r39 = r13;
        r13 = r13 + 1;
        r6 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c9, code lost:
    
        r26 = r8;
        r29 = r14;
        r28 = r15;
        r40.f38610f = androidx.collection.W.c(r40.f38733d) - r40.f38734e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x025d, code lost:
    
        r2 = b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0261, code lost:
    
        r40.f38734e++;
        r1 = r40.f38610f;
        r3 = r40.f38730a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0279, code lost:
    
        if (((r5 >> r7) & r26) != r24) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x027b, code lost:
    
        r28 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x027d, code lost:
    
        r40.f38610f = r1 - r28;
        r1 = r40.f38733d;
        r5 = (r5 & (~(r26 << r7))) | (r10 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01dc, code lost:
    
        r26 = 255;
        r29 = r14;
        r28 = 0;
        r24 = 128;
        r1 = androidx.collection.W.d(r40.f38733d);
        r2 = r40.f38730a;
        r3 = r40.f38731b;
        r4 = r40.f38732c;
        r6 = r40.f38733d;
        c(r1);
        r1 = r40.f38730a;
        r7 = r40.f38731b;
        r8 = r40.f38732c;
        r9 = r40.f38733d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ff, code lost:
    
        if (r12 >= r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x020e, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0210, code lost:
    
        r13 = r3[r12];
        r15 = java.lang.Long.hashCode(r13) * r20;
        r15 = r15 ^ (r15 << 16);
        r16 = r1;
        r1 = b(r15 >>> 7);
        r17 = r2;
        r1 = r15 & 127;
        r15 = r1 >> 3;
        r19 = (r1 & 7) << 3;
        r1 = (r16[r15] & (~(255 << r19))) | (r1 << r19);
        r16[r15] = r1;
        r16[(((r1 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r1] = r13;
        r8[r1] = r4[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0256, code lost:
    
        r12 = r12 + 1;
        r1 = r16;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0252, code lost:
    
        r16 = r1;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009a, code lost:
    
        r26 = 255;
        r29 = r14;
        r28 = 0;
        r24 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i11, long j11) {
        int i12;
        int i13;
        int i14 = 1;
        int i15 = -862048943;
        int hashCode = Long.hashCode(j11) * (-862048943);
        int i16 = hashCode ^ (hashCode << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & 127;
        int i19 = this.f38733d;
        int i21 = i17 & i19;
        int i22 = 0;
        loop0: while (true) {
            long[] jArr = this.f38730a;
            int i23 = i21 >> 3;
            int i24 = (i21 & 7) << 3;
            int i25 = i22;
            int i26 = 0;
            long j12 = (((-i24) >> 63) & (jArr[i23 + i14] << (64 - i24))) | (jArr[i23] >>> i24);
            long j13 = i18;
            int i27 = i14;
            int i28 = i18;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j15 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i21 + (Long.numberOfTrailingZeros(j15) >> 3)) & i19;
                int i29 = i15;
                if (this.f38731b[numberOfTrailingZeros] == j11) {
                    i13 = numberOfTrailingZeros;
                    break loop0;
                } else {
                    j15 &= j15 - 1;
                    i15 = i29;
                }
            }
            i22 = i25 + 8;
            i21 = (i21 + i22) & i19;
            i18 = i28;
            i15 = i12;
            i14 = i27;
        }
        if (i13 < 0) {
            i13 = ~i13;
        }
        this.f38731b[i13] = j11;
        this.f38732c[i13] = i11;
    }
}
