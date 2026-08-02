package r;

/* renamed from: r.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2333k {

    /* renamed from: a, reason: collision with root package name */
    public long[] f19011a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f19012b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f19013c;

    /* renamed from: d, reason: collision with root package name */
    public int f19014d;

    /* renamed from: e, reason: collision with root package name */
    public int f19015e;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i) {
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
        return i5 >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i) {
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
        if (i5 >= 0) {
            return this.f19013c[i5];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2333k)) {
            return false;
        }
        AbstractC2333k abstractC2333k = (AbstractC2333k) obj;
        if (abstractC2333k.f19015e != this.f19015e) {
            return false;
        }
        int[] iArr = this.f19012b;
        Object[] objArr = this.f19013c;
        long[] jArr = this.f19011a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j5 = jArr[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j5) < 128) {
                            int i7 = (i << 3) + i6;
                            int i8 = iArr[i7];
                            Object obj2 = objArr[i7];
                            if (obj2 == null) {
                                if (abstractC2333k.b(i8) != null || !abstractC2333k.a(i8)) {
                                    break loop0;
                                }
                            } else if (!obj2.equals(abstractC2333k.b(i8))) {
                                return false;
                            }
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int[] iArr = this.f19012b;
        Object[] objArr = this.f19013c;
        long[] jArr = this.f19011a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i5 = 0;
        while (true) {
            long j5 = jArr[i];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        int i8 = (i << 3) + i7;
                        int i9 = iArr[i8];
                        Object obj = objArr[i8];
                        i5 += (obj != null ? obj.hashCode() : 0) ^ i9;
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
        if (this.f19015e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f19012b;
        Object[] objArr = this.f19013c;
        long[] jArr = this.f19011a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i5 = 0;
            while (true) {
                long j5 = jArr[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            int i8 = (i << 3) + i7;
                            int i9 = iArr[i8];
                            Object obj = objArr[i8];
                            sb.append(i9);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i5++;
                            if (i5 < this.f19015e) {
                                sb.append(", ");
                            }
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
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }
}
