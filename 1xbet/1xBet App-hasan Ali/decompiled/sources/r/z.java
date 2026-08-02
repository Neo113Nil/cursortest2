package r;

import s.AbstractC2351a;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public long[] f19064a = O.f18957a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f19065b = AbstractC2337o.f19028a;

    /* renamed from: c, reason: collision with root package name */
    public int f19066c;

    /* renamed from: d, reason: collision with root package name */
    public int f19067d;

    /* renamed from: e, reason: collision with root package name */
    public int f19068e;

    public z(int i) {
        if (i >= 0) {
            c(O.d(i));
        } else {
            AbstractC2351a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j5) {
        int i;
        int i5 = ((int) (j5 ^ (j5 >>> 32))) * (-862048943);
        int i6 = i5 ^ (i5 << 16);
        int i7 = i6 & 127;
        int i8 = this.f19066c;
        int i9 = (i6 >>> 7) & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr = this.f19064a;
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
                if (this.f19065b[i] == j5) {
                    break loop0;
                }
                j8 &= j8 - 1;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
        }
        return i >= 0;
    }

    public final int b(int i) {
        int i5 = this.f19066c;
        int i6 = i & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f19064a;
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

    public final void c(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, O.c(i)) : 0;
        this.f19066c = max;
        if (max == 0) {
            jArr = O.f18957a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            X3.l.C0(jArr, -9187201950435737472L);
        }
        this.f19064a = jArr;
        int i5 = max >> 3;
        long j5 = 255 << ((max & 7) << 3);
        jArr[i5] = (jArr[i5] & (~j5)) | j5;
        this.f19068e = O.a(this.f19066c) - this.f19067d;
        this.f19065b = new long[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (zVar.f19067d != this.f19067d) {
            return false;
        }
        long[] jArr = this.f19065b;
        long[] jArr2 = this.f19064a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j5 = jArr2[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j5) < 128 && !zVar.a(jArr[(i << 3) + i6])) {
                            return false;
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.f19065b;
        long[] jArr2 = this.f19064a;
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
                        long j6 = jArr[(i << 3) + i7];
                        i5 += (int) (j6 ^ (j6 >>> 32));
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
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f19065b;
        long[] jArr2 = this.f19064a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i5 = 0;
            loop0: while (true) {
                long j5 = jArr2[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            long j6 = jArr[(i << 3) + i7];
                            if (i5 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i5 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(j6);
                            i5++;
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }
}
