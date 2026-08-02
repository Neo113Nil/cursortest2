package androidx.collection;

import B1.r0;
import C.C2702w;
import java.util.NoSuchElementException;
import k0.C7445a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class N<K> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public long[] f38634a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public Object[] f38635b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public float[] f38636c;

    /* renamed from: d, reason: collision with root package name */
    public int f38637d;

    /* renamed from: e, reason: collision with root package name */
    public int f38638e;

    public /* synthetic */ N(int i11) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(r0 r0Var) {
        return b(r0Var) >= 0;
    }

    public final int b(K k11) {
        int i11 = 0;
        int hashCode = (k11 != null ? k11.hashCode() : 0) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f38637d;
        int i15 = i12 >>> 7;
        while (true) {
            int i16 = i15 & i14;
            long[] jArr = this.f38634a;
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (i13 * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i14;
                if (Intrinsics.d(this.f38635b[numberOfTrailingZeros], k11)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i11 += 8;
            i15 = i16 + i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n11 = (N) obj;
        if (n11.f38638e != this.f38638e) {
            return false;
        }
        Object[] objArr = this.f38635b;
        float[] fArr = this.f38636c;
        long[] jArr = this.f38634a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj2 = objArr[i14];
                            float f7 = fArr[i14];
                            int b11 = n11.b(obj2);
                            if (b11 < 0) {
                                throw new NoSuchElementException(C2702w.c(obj2, "There is no key ", " in the map"));
                            }
                            if (f7 != n11.f38636c[b11]) {
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
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.f38635b;
        float[] fArr = this.f38636c;
        long[] jArr = this.f38634a;
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
                        i12 += Float.hashCode(fArr[i15]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f38638e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f38635b;
        float[] fArr = this.f38636c;
        long[] jArr = this.f38634a;
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
                            float f7 = fArr[i15];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(f7);
                            i12++;
                            if (i12 < this.f38638e) {
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

    private N() {
        this.f38634a = W.f38661a;
        this.f38635b = C7445a.f70246c;
        this.f38636c = C5138g.a();
    }
}
