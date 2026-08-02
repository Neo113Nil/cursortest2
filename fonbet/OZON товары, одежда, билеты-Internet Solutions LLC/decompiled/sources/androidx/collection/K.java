package androidx.collection;

import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class K<K> extends T<K> {

    /* renamed from: f, reason: collision with root package name */
    private int f38615f;

    public K(int i11) {
        super(0);
        if (i11 >= 0) {
            d(W.f(i11));
        } else {
            k0.d.a("Capacity must be a positive value.");
            throw null;
        }
    }

    private final int c(int i11) {
        int i12 = this.f38653d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f38650a;
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

    private final void d(int i11) {
        long[] jArr;
        int max = i11 > 0 ? Math.max(7, W.e(i11)) : 0;
        this.f38653d = max;
        if (max == 0) {
            jArr = W.f38661a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C7705l.z(jArr);
        }
        this.f38650a = jArr;
        int i12 = max >> 3;
        long j11 = 255 << ((max & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f38615f = W.c(this.f38653d) - this.f38654e;
        this.f38651b = new Object[max];
        this.f38652c = new long[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        r3 = c(r6);
        r9 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (r41.f38615f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (((r41.f38650a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        r3 = r41.f38653d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        if (r3 <= 8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        r13 = r41.f38654e;
        r5 = Sc.C.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        if (java.lang.Long.compareUnsigned(r13 * 32, r3 * 25) > 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        r3 = r41.f38650a;
        r4 = r41.f38653d;
        r5 = r41.f38651b;
        r13 = r41.f38652c;
        androidx.collection.W.a(r3, r4);
        r14 = 0;
        r7 = -1;
        r25 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        if (r14 == r4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        r8 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r27 = (r3[r8] >> r17) & r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e1, code lost:
    
        if (r27 != 128) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ed, code lost:
    
        if (r27 == 254) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f1, code lost:
    
        r20 = r5[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f3, code lost:
    
        if (r20 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f5, code lost:
    
        r20 = r20.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fc, code lost:
    
        r20 = r20 * r21;
        r27 = r9;
        r9 = (r20 ^ (r20 << 16)) >>> 7;
        r10 = c(r9);
        r9 = r9 & r4;
        r30 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0121, code lost:
    
        if ((((r10 - r9) & r4) / 8) != (((r14 - r9) & r4) / 8)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0123, code lost:
    
        r3[r8] = (r3[r8] & (~(r27 << r17))) | ((r20 & 127) << r17);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "<this>");
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0144, code lost:
    
        r14 = r14 + 1;
        r9 = r27;
        r15 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014b, code lost:
    
        r8 = r10 >> 3;
        r35 = r3[r8];
        r9 = (r10 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015a, code lost:
    
        if (((r35 >> r9) & r27) != 128) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015c, code lost:
    
        r3[r8] = (r35 & (~(r27 << r9))) | ((r20 & 127) << r9);
        r3[r8] = (r3[r8] & (~(r27 << r17))) | (128 << r17);
        r5[r10] = r5[r14];
        r5[r14] = null;
        r13[r10] = r13[r14];
        r13[r14] = 0;
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c6, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "<this>");
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018e, code lost:
    
        r3[r8] = (r35 & (~(r27 << r9))) | ((r20 & 127) << r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a2, code lost:
    
        if (r7 != (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a4, code lost:
    
        r7 = androidx.collection.W.b(r3, r14 + 1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01aa, code lost:
    
        r5[r7] = r5[r10];
        r5[r10] = r5[r14];
        r5[r14] = r5[r7];
        r13[r7] = r13[r10];
        r13[r10] = r13[r14];
        r13[r14] = r13[r7];
        r14 = r14 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:
    
        r14 = r14 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e3, code lost:
    
        r40 = r14;
        r14 = r14 + 1;
        r7 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d6, code lost:
    
        r27 = r9;
        r30 = r15;
        r41.f38615f = androidx.collection.W.c(r41.f38653d) - r41.f38654e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0268, code lost:
    
        r3 = c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x026c, code lost:
    
        r41.f38654e++;
        r1 = r41.f38615f;
        r2 = r41.f38650a;
        r4 = r3 >> 3;
        r5 = r2[r4];
        r7 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0284, code lost:
    
        if (((r5 >> r7) & r27) != r25) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0287, code lost:
    
        r30 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0289, code lost:
    
        r41.f38615f = r1 - r30;
        r1 = r41.f38653d;
        r5 = (r5 & (~(r27 << r7))) | (r11 << r7);
        r2[r4] = r5;
        r2[(((r3 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e7, code lost:
    
        r27 = 255;
        r30 = r15;
        r25 = 128;
        r2 = androidx.collection.W.d(r41.f38653d);
        r3 = r41.f38650a;
        r4 = r41.f38651b;
        r5 = r41.f38652c;
        r7 = r41.f38653d;
        d(r2);
        r2 = r41.f38650a;
        r8 = r41.f38651b;
        r9 = r41.f38652c;
        r10 = r41.f38653d;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0208, code lost:
    
        if (r13 >= r7) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0218, code lost:
    
        if (((r3[r13 >> 3] >> ((r13 & 7) << 3)) & 255) >= 128) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x021a, code lost:
    
        r14 = r4[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x021c, code lost:
    
        if (r14 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x021e, code lost:
    
        r15 = r14.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0225, code lost:
    
        r15 = r15 * r21;
        r15 = r15 ^ (r15 << 16);
        r1 = c(r15 >>> 7);
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
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0261, code lost:
    
        r13 = r13 + 1;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0223, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x025f, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x009f, code lost:
    
        r27 = 255;
        r30 = r15;
        r25 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j11, Object obj) {
        int i11;
        int i12;
        Object obj2 = obj;
        int i13 = 1;
        int i14 = -862048943;
        int hashCode = obj2.hashCode() * (-862048943);
        int i15 = hashCode ^ (hashCode << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.f38653d;
        int i19 = i16 & i18;
        int i21 = 0;
        loop0: while (true) {
            long[] jArr = this.f38650a;
            int i22 = i19 >> 3;
            int i23 = (i19 & 7) << 3;
            int i24 = i21;
            long j12 = (((-i23) >> 63) & (jArr[i22 + i13] << (64 - i23))) | (jArr[i22] >>> i23);
            long j13 = i17;
            int i25 = i13;
            int i26 = i17;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j15 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j15) >> 3)) & i18;
                int i27 = i14;
                if (Intrinsics.d(this.f38651b[numberOfTrailingZeros], obj2)) {
                    i12 = numberOfTrailingZeros;
                    break loop0;
                } else {
                    j15 &= j15 - 1;
                    i14 = i27;
                }
            }
            i21 = i24 + 8;
            i19 = (i19 + i21) & i18;
            obj2 = obj;
            i17 = i26;
            i14 = i11;
            i13 = i25;
        }
        if (i12 < 0) {
            i12 = ~i12;
        }
        this.f38651b[i12] = obj;
        this.f38652c[i12] = j11;
    }
}
