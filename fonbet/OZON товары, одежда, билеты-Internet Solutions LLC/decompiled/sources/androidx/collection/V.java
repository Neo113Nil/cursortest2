package androidx.collection;

import k0.C7445a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class V<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public long[] f38656a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public Object[] f38657b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public Object[] f38658c;

    /* renamed from: d, reason: collision with root package name */
    public int f38659d;

    /* renamed from: e, reason: collision with root package name */
    public int f38660e;

    public /* synthetic */ V(int i11) {
        this();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(K k11) {
        int i11;
        int hashCode = (k11 != null ? k11.hashCode() : 0) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f38659d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f38656a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (i13 * 72340172838076673L) ^ j11;
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j13 == 0) {
                    break;
                }
                i11 = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                if (Intrinsics.d(this.f38657b[i11], k11)) {
                    break loop0;
                }
                j13 &= j13 - 1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
        return i11 >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V b(K k11) {
        int i11;
        int i12 = 0;
        int hashCode = (k11 != null ? k11.hashCode() : 0) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f38659d;
        int i16 = i13 >>> 7;
        loop0: while (true) {
            int i17 = i16 & i15;
            long[] jArr = this.f38656a;
            int i18 = i17 >> 3;
            int i19 = (i17 & 7) << 3;
            long j11 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j12 = (i14 * 72340172838076673L) ^ j11;
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j13 == 0) {
                    break;
                }
                i11 = ((Long.numberOfTrailingZeros(j13) >> 3) + i17) & i15;
                if (Intrinsics.d(this.f38657b[i11], k11)) {
                    break loop0;
                }
                j13 &= j13 - 1;
            }
            i12 += 8;
            i16 = i17 + i12;
        }
        if (i11 >= 0) {
            return (V) this.f38658c[i11];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v11 = (V) obj;
        if (v11.f38660e != this.f38660e) {
            return false;
        }
        Object[] objArr = this.f38657b;
        Object[] objArr2 = this.f38658c;
        long[] jArr = this.f38656a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            loop0: while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj2 = objArr[i14];
                            Object obj3 = objArr2[i14];
                            if (obj3 == null) {
                                if (v11.b(obj2) != null || !v11.a(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(v11.b(obj2))) {
                                return false;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.f38657b;
        Object[] objArr2 = this.f38658c;
        long[] jArr = this.f38656a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j11) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Object obj = objArr[i15];
                        Object obj2 = objArr2[i15];
                        i12 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f38660e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f38657b;
        Object[] objArr2 = this.f38658c;
        long[] jArr = this.f38656a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j11) < 128) {
                            int i15 = (i11 << 3) + i14;
                            Object obj = objArr[i15];
                            Object obj2 = objArr2[i15];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb2.append(obj2);
                            i12++;
                            if (i12 < this.f38660e) {
                                sb2.append(", ");
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "s.append('}').toString()");
        return sb3;
    }

    private V() {
        this.f38656a = W.f38661a;
        Object[] objArr = C7445a.f70246c;
        this.f38657b = objArr;
        this.f38658c = objArr;
    }
}
