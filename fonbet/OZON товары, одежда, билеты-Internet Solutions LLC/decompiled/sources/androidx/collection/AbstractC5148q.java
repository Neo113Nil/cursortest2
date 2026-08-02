package androidx.collection;

import I0.C3173b;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.collection.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC5148q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public long[] f38730a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public long[] f38731b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public int[] f38732c;

    /* renamed from: d, reason: collision with root package name */
    public int f38733d;

    /* renamed from: e, reason: collision with root package name */
    public int f38734e;

    public /* synthetic */ AbstractC5148q(int i11) {
        this();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        r13 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(long j11) {
        int i11;
        int hashCode = Long.hashCode(j11) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f38733d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f38730a;
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
                if (this.f38731b[i11] == j11) {
                    break loop0;
                }
                j14 &= j14 - 1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
        if (i11 >= 0) {
            return this.f38732c[i11];
        }
        throw new NoSuchElementException(C3173b.b(j11, "Cannot find value for key "));
    }

    public final boolean equals(Object obj) {
        boolean z11;
        long[] jArr;
        boolean z12;
        long[] jArr2;
        boolean z13 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5148q)) {
            return false;
        }
        AbstractC5148q abstractC5148q = (AbstractC5148q) obj;
        if (abstractC5148q.f38734e != this.f38734e) {
            return false;
        }
        long[] jArr3 = this.f38731b;
        int[] iArr = this.f38732c;
        long[] jArr4 = this.f38730a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr4[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        z12 = z13;
                        jArr2 = jArr3;
                        if (iArr[i14] != abstractC5148q.a(jArr2[i14])) {
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
        long[] jArr = this.f38731b;
        int[] iArr = this.f38732c;
        long[] jArr2 = this.f38730a;
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
                        i12 += Integer.hashCode(iArr[i15]) ^ Long.hashCode(j12);
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
        if (this.f38734e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.f38731b;
        int[] iArr = this.f38732c;
        long[] jArr2 = this.f38730a;
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
                            int i18 = iArr[i17];
                            sb2.append(j12);
                            sb2.append("=");
                            sb2.append(i18);
                            i14++;
                            if (i14 < this.f38734e) {
                                sb2.append(", ");
                            }
                        } else {
                            i12 = i13;
                        }
                        j11 >>= 8;
                        i16++;
                        i13 = i12;
                    }
                    int i19 = i13;
                    if (i15 != 8) {
                        break;
                    }
                    i11 = i19;
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

    private AbstractC5148q() {
        this.f38730a = W.f38661a;
        this.f38731b = C5152v.a();
        this.f38732c = C5147p.a();
    }
}
