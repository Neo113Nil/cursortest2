package androidx.collection;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.collection.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5146o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public long[] f38724a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public int[] f38725b;

    /* renamed from: c, reason: collision with root package name */
    public int f38726c;

    /* renamed from: d, reason: collision with root package name */
    public int f38727d;

    public /* synthetic */ AbstractC5146o(int i11) {
        this();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i11) {
        int i12;
        int hashCode = Integer.hashCode(i11) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f38726c;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f38724a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j11 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j12 = (i14 * 72340172838076673L) ^ j11;
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j13 == 0) {
                    break;
                }
                i12 = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i15;
                if (this.f38725b[i12] == i11) {
                    break loop0;
                }
                j13 &= j13 - 1;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
        return i12 >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5146o)) {
            return false;
        }
        AbstractC5146o abstractC5146o = (AbstractC5146o) obj;
        if (abstractC5146o.f38727d != this.f38727d) {
            return false;
        }
        int[] iArr = this.f38725b;
        long[] jArr = this.f38724a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && !abstractC5146o.a(iArr[(i11 << 3) + i13])) {
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
        int[] iArr = this.f38725b;
        long[] jArr = this.f38724a;
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
                        i12 = Integer.hashCode(iArr[(i11 << 3) + i14]) + i12;
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
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f38725b;
        long[] jArr = this.f38724a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            loop0: while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i12 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j11 & 255) < 128) {
                            int i17 = iArr[(i12 << 3) + i16];
                            i11 = i14;
                            if (i13 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append(i17);
                            i13++;
                        } else {
                            i11 = i14;
                        }
                        j11 >>= i11;
                        i16++;
                        i14 = i11;
                    }
                    if (i15 != i14) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        sb2.append((CharSequence) "]");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    private AbstractC5146o() {
        this.f38724a = W.f38661a;
        this.f38725b = C5147p.a();
    }
}
