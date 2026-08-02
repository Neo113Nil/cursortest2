package androidx.collection;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.collection.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5142k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public int[] f38714a;

    /* renamed from: b, reason: collision with root package name */
    public int f38715b;

    public final int a(int i11) {
        if (i11 >= 0 && i11 < this.f38715b) {
            return this.f38714a[i11];
        }
        StringBuilder f7 = P4.f.f(i11, "Index ", " must be in 0..");
        f7.append(this.f38715b - 1);
        throw new IndexOutOfBoundsException(f7.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC5142k) {
            AbstractC5142k abstractC5142k = (AbstractC5142k) obj;
            int i11 = abstractC5142k.f38715b;
            int i12 = this.f38715b;
            if (i11 == i12) {
                int[] iArr = this.f38714a;
                int[] iArr2 = abstractC5142k.f38714a;
                IntRange o11 = kotlin.ranges.h.o(0, i12);
                int f71842a = o11.getF71842a();
                int f71843b = o11.getF71843b();
                if (f71842a > f71843b) {
                    return true;
                }
                while (iArr[f71842a] == iArr2[f71842a]) {
                    if (f71842a == f71843b) {
                        return true;
                    }
                    f71842a++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f38714a;
        int i11 = this.f38715b;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += Integer.hashCode(iArr[i13]) * 31;
        }
        return i12;
    }

    @NotNull
    public final String toString() {
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f38714a;
        int i11 = this.f38715b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i13 = iArr[i12];
            if (i12 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i12 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i13);
            i12++;
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
