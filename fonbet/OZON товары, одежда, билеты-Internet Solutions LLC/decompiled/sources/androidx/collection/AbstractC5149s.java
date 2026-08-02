package androidx.collection;

import k0.C7445a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.collection.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5149s<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public long[] f38736a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public long[] f38737b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public Object[] f38738c;

    /* renamed from: d, reason: collision with root package name */
    public int f38739d;

    /* renamed from: e, reason: collision with root package name */
    public int f38740e;

    public /* synthetic */ AbstractC5149s(int i11) {
        this();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j11) {
        int i11;
        int hashCode = Long.hashCode(j11) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f38739d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f38736a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j12 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j13 = (i13 * 72340172838076673L) ^ j12;
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j14 == 0) {
                    break;
                }
                i11 = ((Long.numberOfTrailingZeros(j14) >> 3) + i15) & i14;
                if (this.f38737b[i11] == j11) {
                    break loop0;
                }
                j14 &= j14 - 1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
        return i11 >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(long j11) {
        int i11;
        int hashCode = Long.hashCode(j11) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f38739d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f38736a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j12 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j13 = (i13 * 72340172838076673L) ^ j12;
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j14 == 0) {
                    break;
                }
                i11 = ((Long.numberOfTrailingZeros(j14) >> 3) + i15) & i14;
                if (this.f38737b[i11] == j11) {
                    break loop0;
                }
                j14 &= j14 - 1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
        return i11 >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V c(long j11) {
        int i11;
        int hashCode = Long.hashCode(j11) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f38739d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f38736a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j12 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j13 = (i13 * 72340172838076673L) ^ j12;
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j14 == 0) {
                    break;
                }
                i11 = ((Long.numberOfTrailingZeros(j14) >> 3) + i15) & i14;
                if (this.f38737b[i11] == j11) {
                    break loop0;
                }
                j14 &= j14 - 1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
        if (i11 >= 0) {
            return (V) this.f38738c[i11];
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z11;
        long[] jArr;
        boolean z12;
        long[] jArr2;
        boolean z13 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5149s)) {
            return false;
        }
        AbstractC5149s abstractC5149s = (AbstractC5149s) obj;
        if (abstractC5149s.f38740e != this.f38740e) {
            return false;
        }
        long[] jArr3 = this.f38737b;
        Object[] objArr = this.f38738c;
        long[] jArr4 = this.f38736a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        loop0: while (true) {
            long j11 = jArr4[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        z12 = z13;
                        jArr2 = jArr3;
                        long j12 = jArr2[i14];
                        Object obj2 = objArr[i14];
                        if (obj2 == null) {
                            if (abstractC5149s.c(j12) != null || !abstractC5149s.b(j12)) {
                                break loop0;
                            }
                        } else if (!obj2.equals(abstractC5149s.c(j12))) {
                            return false;
                        }
                    } else {
                        z12 = z13;
                        jArr2 = jArr3;
                    }
                    j11 >>= 8;
                    i13++;
                    z13 = z12;
                    jArr3 = jArr2;
                }
                z11 = z13;
                jArr = jArr3;
                if (i12 != 8) {
                    return z11;
                }
            } else {
                z11 = z13;
                jArr = jArr3;
            }
            if (i11 == length) {
                return z11;
            }
            i11++;
            z13 = z11;
            jArr3 = jArr;
        }
    }

    public final int hashCode() {
        long[] jArr = this.f38737b;
        Object[] objArr = this.f38738c;
        long[] jArr2 = this.f38736a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            long j11 = jArr2[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j11) < 128) {
                        int i15 = (i11 << 3) + i14;
                        long j12 = jArr[i15];
                        Object obj = objArr[i15];
                        i12 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j12);
                    }
                    j11 >>= 8;
                }
                if (i13 != 8) {
                    return i12;
                }
            }
            if (i11 == length) {
                return i12;
            }
            i11++;
        }
    }

    @NotNull
    public final String toString() {
        int i11;
        int i12;
        if (this.f38740e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.f38737b;
        Object[] objArr = this.f38738c;
        long[] jArr2 = this.f38736a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                long j11 = jArr2[i13];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((255 & j11) < 128) {
                            int i17 = (i13 << 3) + i16;
                            i12 = i13;
                            long j12 = jArr[i17];
                            Object obj = objArr[i17];
                            sb2.append(j12);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i14++;
                            if (i14 < this.f38740e) {
                                sb2.append(", ");
                            }
                        } else {
                            i12 = i13;
                        }
                        j11 >>= 8;
                        i16++;
                        i13 = i12;
                    }
                    int i18 = i13;
                    if (i15 != 8) {
                        break;
                    }
                    i11 = i18;
                } else {
                    i11 = i13;
                }
                if (i11 == length) {
                    break;
                }
                i13 = i11 + 1;
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "s.append('}').toString()");
        return sb3;
    }

    private AbstractC5149s() {
        this.f38736a = W.f38661a;
        this.f38737b = C5152v.a();
        this.f38738c = C7445a.f70246c;
    }
}
