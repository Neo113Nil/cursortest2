package androidx.collection;

import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class H<K> extends N<K> {

    /* renamed from: f, reason: collision with root package name */
    private int f38613f;

    public H() {
        super(0);
        e(W.f(6));
    }

    private final int d(int i11) {
        int i12 = this.f38637d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f38634a;
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
        this.f38637d = max;
        if (max == 0) {
            jArr = W.f38661a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C7705l.z(jArr);
        }
        this.f38634a = jArr;
        int i12 = max >> 3;
        long j11 = 255 << ((max & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f38613f = W.c(this.f38637d) - this.f38638e;
        this.f38635b = new Object[max];
        this.f38636c = new float[max];
    }

    public final void c() {
        this.f38638e = 0;
        long[] jArr = this.f38634a;
        if (jArr != W.f38661a) {
            C7705l.z(jArr);
            long[] jArr2 = this.f38634a;
            int i11 = this.f38637d;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        C7705l.x(this.f38635b, null, 0, this.f38637d);
        this.f38613f = W.c(this.f38637d) - this.f38638e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(@NotNull H from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.f38635b;
        float[] fArr = from.f38636c;
        long[] jArr = from.f38634a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        g(objArr[i14], fArr[i14]);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        r22 = r6;
        r4 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if (((r3 & ((~r3) << 6)) & (-9187201950435737472L)) == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        r3 = d(r7);
        r13 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r39.f38613f != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (((r39.f38634a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        r3 = r39.f38637d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        if (r3 <= 8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        r5 = r39.f38638e;
        r10 = Sc.C.INSTANCE;
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        if (java.lang.Long.compareUnsigned(r5 * 32, r3 * 25) > 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
    
        r3 = r39.f38634a;
        r5 = r39.f38637d;
        r6 = r39.f38635b;
        r8 = r39.f38636c;
        androidx.collection.W.a(r3, r5);
        r9 = 0;
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d0, code lost:
    
        if (r9 == r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        r15 = r9 >> 3;
        r25 = (r9 & 7) << 3;
        r23 = (r3[r15] >> r25) & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e0, code lost:
    
        if (r23 != 128) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        if (r23 == 254) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
    
        r23 = r6[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        if (r23 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f5, code lost:
    
        r23 = r23.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fc, code lost:
    
        r23 = r23 * r22;
        r24 = r4;
        r4 = (r23 ^ (r23 << 16)) >>> 7;
        r26 = d(r4);
        r4 = r4 & r5;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0121, code lost:
    
        if ((((r26 - r4) & r5) / 8) != (((r9 - r4) & r5) / 8)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014d, code lost:
    
        r2 = r3;
        r3 = r26 >> 3;
        r13 = r2[r3];
        r27 = (r26 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015d, code lost:
    
        if (((r13 >> r27) & r28) != 128) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015f, code lost:
    
        r34 = r8;
        r35 = r9;
        r2[r3] = ((~(r28 << r27)) & r13) | ((r23 & 127) << r27);
        r2[r15] = (r2[r15] & (~(r28 << r25))) | (128 << r25);
        r6[r26] = r6[r35];
        r6[r35] = null;
        r34[r26] = r34[r35];
        r34[r35] = 0.0f;
        r9 = r35;
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c5, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r3 = r2;
        r4 = r24;
        r13 = r28;
        r8 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x018f, code lost:
    
        r34 = r8;
        r35 = r9;
        r2[r3] = ((~(r28 << r27)) & r13) | ((r23 & 127) << r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a2, code lost:
    
        if (r10 != (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a4, code lost:
    
        r10 = androidx.collection.W.b(r2, r35 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01aa, code lost:
    
        r6[r10] = r6[r26];
        r6[r26] = r6[r35];
        r6[r35] = r6[r10];
        r34[r10] = r34[r26];
        r34[r26] = r34[r35];
        r34[r35] = r34[r10];
        r9 = r35 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0123, code lost:
    
        r27 = r3;
        r27[r15] = ((r23 & 127) << r25) | (r27[r15] & (~(r28 << r25)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r27, "<this>");
        r27[r27.length - 1] = (r27[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r3 = r27;
        r4 = r24;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fa, code lost:
    
        r23 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ee, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        r10 = r9;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01de, code lost:
    
        r28 = r13;
        r39.f38613f = androidx.collection.W.c(r39.f38637d) - r39.f38638e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x026e, code lost:
    
        r3 = d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0272, code lost:
    
        r39.f38638e++;
        r1 = r39.f38613f;
        r2 = r39.f38634a;
        r4 = r3 >> 3;
        r5 = r2[r4];
        r7 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x028a, code lost:
    
        if (((r5 >> r7) & r28) != r20) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x028d, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x028f, code lost:
    
        r39.f38613f = r1 - r16;
        r1 = r39.f38637d;
        r5 = (r5 & (~(r28 << r7))) | (r11 << r7);
        r2[r4] = r5;
        r2[(((r3 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r15 = ~r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ed, code lost:
    
        r28 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f3, code lost:
    
        r2 = androidx.collection.W.d(r39.f38637d);
        r3 = r39.f38634a;
        r4 = r39.f38635b;
        r5 = r39.f38636c;
        r6 = r39.f38637d;
        e(r2);
        r2 = r39.f38634a;
        r8 = r39.f38635b;
        r9 = r39.f38636c;
        r10 = r39.f38637d;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020e, code lost:
    
        if (r13 >= r6) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x021e, code lost:
    
        if (((r3[r13 >> 3] >> ((r13 & 7) << 3)) & 255) >= r20) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0220, code lost:
    
        r14 = r4[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0222, code lost:
    
        if (r14 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0224, code lost:
    
        r15 = r14.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x022b, code lost:
    
        r15 = r15 * r22;
        r15 = r15 ^ (r15 << 16);
        r1 = d(r15 >>> 7);
        r18 = r2;
        r1 = r15 & 127;
        r15 = r1 >> 3;
        r23 = (r1 & 7) << 3;
        r1 = (r18[r15] & (~(255 << r23))) | (r1 << r23);
        r18[r15] = r1;
        r18[(((r1 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r1] = r14;
        r9[r1] = r5[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0267, code lost:
    
        r13 = r13 + 1;
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0229, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0265, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f0, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00a2, code lost:
    
        r28 = 255;
        r20 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(K k11, float f7) {
        int i11;
        int i12;
        K k12 = k11;
        int i13 = 1;
        int i14 = -862048943;
        int hashCode = (k12 != null ? k12.hashCode() : 0) * (-862048943);
        int i15 = hashCode ^ (hashCode << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.f38637d;
        int i19 = i16 & i18;
        int i21 = 0;
        loop0: while (true) {
            long[] jArr = this.f38634a;
            int i22 = i19 >> 3;
            int i23 = (i19 & 7) << 3;
            int i24 = i13;
            long j11 = (((-i23) >> 63) & (jArr[i22 + i13] << (64 - i23))) | (jArr[i22] >>> i23);
            long j12 = i17;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (j13 - 72340172838076673L) & (~j13) & (-9187201950435737472L);
            while (true) {
                if (j14 == 0) {
                    break;
                }
                i12 = ((Long.numberOfTrailingZeros(j14) >> 3) + i19) & i18;
                int i25 = i14;
                if (Intrinsics.d(this.f38635b[i12], k12)) {
                    break loop0;
                }
                j14 &= j14 - 1;
                i14 = i25;
            }
            i21 += 8;
            i19 = (i19 + i21) & i18;
            k12 = k11;
            i13 = i24;
            i14 = i11;
        }
        if (i12 < 0) {
            i12 = ~i12;
        }
        this.f38635b[i12] = k11;
        this.f38636c[i12] = f7;
    }
}
