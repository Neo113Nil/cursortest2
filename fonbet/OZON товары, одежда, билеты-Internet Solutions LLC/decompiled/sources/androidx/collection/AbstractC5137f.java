package androidx.collection;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.collection.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC5137f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public long[] f38701a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public float[] f38702b;

    /* renamed from: c, reason: collision with root package name */
    public int f38703c;

    public /* synthetic */ AbstractC5137f(int i11) {
        this();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
    
        r27 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        if (((r12 & ((~r12) << 6)) & r23) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z11;
        int i11;
        boolean z12;
        ?? r19;
        int i12;
        long j11;
        int i13;
        boolean z13 = true;
        if (obj == this) {
            return true;
        }
        int i14 = 0;
        if (!(obj instanceof AbstractC5137f)) {
            return false;
        }
        AbstractC5137f abstractC5137f = (AbstractC5137f) obj;
        abstractC5137f.getClass();
        float[] fArr = this.f38702b;
        long[] jArr = this.f38701a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        while (true) {
            long j12 = jArr[i15];
            long j13 = -9187201950435737472L;
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8;
                int i17 = 8 - ((~(i15 - length)) >>> 31);
                int i18 = i14;
                while (i18 < i17) {
                    if ((j12 & 255) < 128) {
                        float f7 = fArr[(i15 << 3) + i18];
                        abstractC5137f.getClass();
                        int hashCode = Float.hashCode(f7) * (-862048943);
                        int i19 = hashCode ^ (hashCode << 16);
                        z12 = z13;
                        int i21 = i19 & 127;
                        r19 = i14;
                        int i22 = abstractC5137f.f38703c;
                        int i23 = (i19 >>> 7) & i22;
                        int i24 = r19 == true ? 1 : 0;
                        while (true) {
                            long[] jArr2 = abstractC5137f.f38701a;
                            int i25 = i23 >> 3;
                            j11 = j13;
                            int i26 = (i23 & 7) << 3;
                            long j14 = (jArr2[i25] >>> i26) | ((jArr2[i25 + 1] << (64 - i26)) & ((-i26) >> 63));
                            int i27 = i16;
                            long j15 = j14 ^ (i21 * 72340172838076673L);
                            long j16 = (j15 - 72340172838076673L) & (~j15) & j11;
                            while (true) {
                                if (j16 == 0) {
                                    break;
                                }
                                i13 = (i23 + (Long.numberOfTrailingZeros(j16) >> 3)) & i22;
                                i12 = i27;
                                if (abstractC5137f.f38702b[i13] == f7) {
                                    break;
                                }
                                j16 &= j16 - 1;
                                i27 = i12;
                            }
                            i24 += 8;
                            i23 = (i23 + i24) & i22;
                            j13 = j11;
                            i16 = i12;
                        }
                        if (!(i13 >= 0 ? z12 : r19 == true ? 1 : 0)) {
                            return r19;
                        }
                    } else {
                        z12 = z13;
                        r19 = i14;
                        i12 = i16;
                        j11 = j13;
                    }
                    j12 >>= i12;
                    i18++;
                    z13 = z12;
                    i14 = r19;
                    j13 = j11;
                    i16 = i12;
                }
                z11 = z13;
                i11 = i14;
                if (i17 != i16) {
                    return z11;
                }
            } else {
                z11 = z13;
                i11 = i14;
            }
            if (i15 == length) {
                return z11;
            }
            i15++;
            z13 = z11;
            i14 = i11;
        }
    }

    public final int hashCode() {
        float[] fArr = this.f38702b;
        long[] jArr = this.f38701a;
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
                        i12 = Float.hashCode(fArr[(i11 << 3) + i14]) + i12;
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
        float[] fArr = this.f38702b;
        long[] jArr = this.f38701a;
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
                            float f7 = fArr[(i12 << 3) + i16];
                            i11 = i14;
                            if (i13 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append(f7);
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

    private AbstractC5137f() {
        this.f38701a = W.f38661a;
        this.f38702b = C5138g.a();
    }
}
