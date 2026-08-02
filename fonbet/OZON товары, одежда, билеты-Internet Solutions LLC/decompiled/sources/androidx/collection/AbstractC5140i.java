package androidx.collection;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.collection.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5140i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public long[] f38708a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public int[] f38709b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public int[] f38710c;

    /* renamed from: d, reason: collision with root package name */
    public int f38711d;

    /* renamed from: e, reason: collision with root package name */
    public int f38712e;

    public /* synthetic */ AbstractC5140i(int i11) {
        this();
    }

    public final int a(int i11) {
        int hashCode = Integer.hashCode(i11) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f38711d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f38708a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (i13 * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                if (this.f38709b[numberOfTrailingZeros] == i11) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
    }

    public final int b(int i11) {
        int a11 = a(i11);
        if (a11 >= 0) {
            return this.f38710c[a11];
        }
        throw new NoSuchElementException(Ej.b.a(i11, "Cannot find value for key "));
    }

    public final int c(int i11) {
        int a11 = a(i11);
        if (a11 >= 0) {
            return this.f38710c[a11];
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5140i)) {
            return false;
        }
        AbstractC5140i abstractC5140i = (AbstractC5140i) obj;
        if (abstractC5140i.f38712e != this.f38712e) {
            return false;
        }
        int[] iArr = this.f38709b;
        int[] iArr2 = this.f38710c;
        long[] jArr = this.f38708a;
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
                            if (iArr2[i14] != abstractC5140i.b(iArr[i14])) {
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
        int[] iArr = this.f38709b;
        int[] iArr2 = this.f38710c;
        long[] jArr = this.f38708a;
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
                        int i16 = iArr[i15];
                        i12 += Integer.hashCode(iArr2[i15]) ^ Integer.hashCode(i16);
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
        if (this.f38712e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.f38709b;
        int[] iArr2 = this.f38710c;
        long[] jArr = this.f38708a;
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
                            int i16 = iArr[i15];
                            int i17 = iArr2[i15];
                            sb2.append(i16);
                            sb2.append("=");
                            sb2.append(i17);
                            i12++;
                            if (i12 < this.f38712e) {
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

    private AbstractC5140i() {
        this.f38708a = W.f38661a;
        this.f38709b = C5147p.a();
        this.f38710c = C5147p.a();
    }
}
