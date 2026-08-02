package androidx.collection;

import kotlin.collections.C7705l;

/* loaded from: classes.dex */
public final class G extends AbstractC5151u {

    /* renamed from: e, reason: collision with root package name */
    private int f38612e;

    public G(int i11) {
        super(0);
        if (i11 >= 0) {
            c(W.f(i11));
        } else {
            k0.d.a("Capacity must be a positive value.");
            throw null;
        }
    }

    private final int b(int i11) {
        int i12 = this.f38745c;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f38743a;
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
        this.f38745c = max;
        if (max == 0) {
            jArr = W.f38661a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C7705l.z(jArr);
        }
        this.f38743a = jArr;
        int i12 = max >> 3;
        long j11 = 255 << ((max & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f38612e = W.c(this.f38745c) - this.f38746d;
        this.f38744b = new long[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        r2 = b(r5);
        r6 = 128;
        r8 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (r39.f38612e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        if (((r39.f38743a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        r2 = r39.f38745c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        if (r2 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        r12 = r39.f38746d;
        r4 = Sc.C.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        if (java.lang.Long.compareUnsigned(r12 * 32, r2 * 25) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
    
        r2 = r39.f38743a;
        r3 = r39.f38745c;
        r4 = r39.f38744b;
        androidx.collection.W.a(r2, r3);
        r12 = 0;
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
    
        if (r12 == r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
    
        r16 = r12 >> 3;
        r19 = (r12 & 7) << 3;
        r24 = (r2[r16] >> r19) & r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
    
        if (r24 != r6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e5, code lost:
    
        if (r24 == 254) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e9, code lost:
    
        r24 = java.lang.Long.hashCode(r4[r12]) * r20;
        r25 = r6;
        r6 = (r24 ^ (r24 << 16)) >>> 7;
        r7 = b(r6);
        r6 = r6 & r3;
        r28 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0114, code lost:
    
        if ((((r7 - r6) & r3) / 8) != (((r12 - r6) & r3) / 8)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0140, code lost:
    
        r27 = r14;
        r8 = r15;
        r6 = r7 >> 3;
        r14 = r2[r6];
        r34 = (r7 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0151, code lost:
    
        if (((r14 >> r34) & r28) != r25) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0153, code lost:
    
        r35 = r8;
        r36 = "<this>";
        r37 = r2;
        r37[r6] = ((~(r28 << r34)) & r14) | ((r24 & 127) << r34);
        r37[r16] = (r37[r16] & (~(r28 << r19))) | (r25 << r19);
        r4[r7] = r4[r12];
        r4[r12] = 0;
        r13 = r12;
        r6 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ab, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r36);
        r6[r6.length - 1] = (r6[r35] & 72057594037927935L) | Long.MIN_VALUE;
        r12 = r12 + 1;
        r2 = r6;
        r6 = r25;
        r14 = r27;
        r8 = r28;
        r15 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017d, code lost:
    
        r37 = r2;
        r35 = r8;
        r36 = "<this>";
        r37[r6] = ((r24 & 127) << r34) | ((~(r28 << r34)) & r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0190, code lost:
    
        if (r13 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0192, code lost:
    
        r6 = r37;
        r13 = androidx.collection.W.b(r6, r12 + 1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x019d, code lost:
    
        r4[r13] = r4[r7];
        r4[r7] = r4[r12];
        r4[r12] = r4[r13];
        r12 = r12 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x019b, code lost:
    
        r6 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0116, code lost:
    
        r8 = r15;
        r2[r16] = ((r24 & 127) << r19) | (r2[r16] & (~(r28 << r19)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
        r2[r2.length - 1] = (r2[r8] & 72057594037927935L) | Long.MIN_VALUE;
        r12 = r12 + 1;
        r15 = r8;
        r6 = r25;
        r14 = r14;
        r8 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e7, code lost:
    
        r12 = r12 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r13 = r12;
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c6, code lost:
    
        r25 = r6;
        r28 = r8;
        r27 = r14;
        r35 = r15;
        r39.f38612e = androidx.collection.W.c(r39.f38745c) - r39.f38746d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x024e, code lost:
    
        r17 = b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0257, code lost:
    
        r39.f38746d++;
        r1 = r39.f38612e;
        r2 = r39.f38743a;
        r3 = r17 >> 3;
        r4 = r2[r3];
        r6 = (r17 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x026f, code lost:
    
        if (((r4 >> r6) & r28) != r25) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0271, code lost:
    
        r35 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0273, code lost:
    
        r39.f38612e = r1 - r35;
        r1 = r39.f38745c;
        r4 = (r4 & (~(r28 << r6))) | (r10 << r6);
        r2[r3] = r4;
        r2[(((r17 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01db, code lost:
    
        r25 = 128;
        r28 = 255;
        r27 = r14;
        r35 = 0;
        r1 = androidx.collection.W.d(r39.f38745c);
        r2 = r39.f38743a;
        r3 = r39.f38744b;
        r4 = r39.f38745c;
        c(r1);
        r1 = r39.f38743a;
        r6 = r39.f38744b;
        r7 = r39.f38745c;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01fa, code lost:
    
        if (r8 >= r4) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0209, code lost:
    
        if (((r2[r8 >> 3] >> ((r8 & 7) << 3)) & 255) >= 128) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x020b, code lost:
    
        r12 = r3[r8];
        r9 = java.lang.Long.hashCode(r12) * r20;
        r9 = r9 ^ (r9 << 16);
        r14 = b(r9 >>> 7);
        r16 = r1;
        r15 = r2;
        r1 = r9 & 127;
        r9 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r1 = (r16[r9] & (~(255 << r17))) | (r1 << r17);
        r16[r9] = r1;
        r16[(((r14 - 7) & r7) + (r7 & 7)) >> 3] = r1;
        r6[r14] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0248, code lost:
    
        r8 = r8 + 1;
        r2 = r15;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0245, code lost:
    
        r16 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009a, code lost:
    
        r25 = 128;
        r28 = 255;
        r27 = r14;
        r35 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0255, code lost:
    
        r17 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j11) {
        int i11;
        int i12;
        int i13 = 1;
        int i14 = -862048943;
        int hashCode = Long.hashCode(j11) * (-862048943);
        int i15 = hashCode ^ (hashCode << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.f38745c;
        int i19 = i16 & i18;
        int i21 = 0;
        loop0: while (true) {
            long[] jArr = this.f38743a;
            int i22 = i19 >> 3;
            int i23 = (i19 & 7) << 3;
            int i24 = i21;
            int i25 = 0;
            long j12 = (((-i23) >> 63) & (jArr[i22 + i13] << (64 - i23))) | (jArr[i22] >>> i23);
            long j13 = i17;
            int i26 = i13;
            int i27 = i17;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j15 == 0) {
                    break;
                }
                i12 = (i19 + (Long.numberOfTrailingZeros(j15) >> 3)) & i18;
                int i28 = i14;
                if (this.f38744b[i12] == j11) {
                    break loop0;
                }
                j15 &= j15 - 1;
                i14 = i28;
            }
            i21 = i24 + 8;
            i19 = (i19 + i21) & i18;
            i17 = i27;
            i14 = i11;
            i13 = i26;
        }
        this.f38744b[i12] = j11;
    }
}
