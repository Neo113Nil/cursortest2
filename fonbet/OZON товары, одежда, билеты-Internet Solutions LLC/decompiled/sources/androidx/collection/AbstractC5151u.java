package androidx.collection;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.collection.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5151u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public long[] f38743a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public long[] f38744b;

    /* renamed from: c, reason: collision with root package name */
    public int f38745c;

    /* renamed from: d, reason: collision with root package name */
    public int f38746d;

    public /* synthetic */ AbstractC5151u(int i11) {
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
        int i14 = this.f38745c;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f38743a;
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
                if (this.f38744b[i11] == j11) {
                    break loop0;
                }
                j14 &= j14 - 1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
        return i11 >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5151u)) {
            return false;
        }
        AbstractC5151u abstractC5151u = (AbstractC5151u) obj;
        if (abstractC5151u.f38746d != this.f38746d) {
            return false;
        }
        long[] jArr = this.f38744b;
        long[] jArr2 = this.f38743a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr2[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && !abstractC5151u.a(jArr[(i11 << 3) + i13])) {
                            return false;
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
        long[] jArr = this.f38744b;
        long[] jArr2 = this.f38743a;
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
                        i12 = Long.hashCode(jArr[(i11 << 3) + i14]) + i12;
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
        int i13;
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f38744b;
        long[] jArr2 = this.f38743a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i14 = 0;
            int i15 = 0;
            loop0: while (true) {
                long j11 = jArr2[i14];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8;
                    int i17 = 8 - ((~(i14 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j11 & 255) < 128) {
                            i12 = i14;
                            long j12 = jArr[(i14 << 3) + i18];
                            i13 = i16;
                            if (i15 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i15 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append(j12);
                            i15++;
                        } else {
                            i12 = i14;
                            i13 = i16;
                        }
                        j11 >>= i13;
                        i18++;
                        i16 = i13;
                        i14 = i12;
                    }
                    int i19 = i14;
                    if (i17 != i16) {
                        break;
                    }
                    i11 = i19;
                } else {
                    i11 = i14;
                }
                if (i11 == length) {
                    break;
                }
                i14 = i11 + 1;
            }
        }
        sb2.append((CharSequence) "]");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    private AbstractC5151u() {
        this.f38743a = W.f38661a;
        this.f38744b = C5152v.a();
    }
}
