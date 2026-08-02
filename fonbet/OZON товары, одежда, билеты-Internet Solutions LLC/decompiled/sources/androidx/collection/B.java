package androidx.collection;

import java.util.Arrays;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class B extends AbstractC5142k {
    public B(int i11) {
        this.f38714a = i11 == 0 ? C5147p.a() : new int[i11];
    }

    public final void b(int i11) {
        c(this.f38715b + 1);
        int[] iArr = this.f38714a;
        int i12 = this.f38715b;
        iArr[i12] = i11;
        this.f38715b = i12 + 1;
    }

    public final void c(int i11) {
        int[] iArr = this.f38714a;
        if (iArr.length < i11) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i11, (iArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f38714a = copyOf;
        }
    }

    public final int d(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f38715b)) {
            StringBuilder f7 = P4.f.f(i11, "Index ", " must be in 0..");
            f7.append(this.f38715b - 1);
            throw new IndexOutOfBoundsException(f7.toString());
        }
        int[] iArr = this.f38714a;
        int i13 = iArr[i11];
        if (i11 != i12 - 1) {
            C7705l.p(i11, i11 + 1, iArr, iArr, i12);
        }
        this.f38715b--;
        return i13;
    }

    public final void e(int i11, int i12) {
        if (i11 < 0 || i11 >= this.f38715b) {
            StringBuilder f7 = P4.f.f(i11, "set index ", " must be between 0 .. ");
            f7.append(this.f38715b - 1);
            throw new IndexOutOfBoundsException(f7.toString());
        }
        int[] iArr = this.f38714a;
        int i13 = iArr[i11];
        iArr[i11] = i12;
    }

    public /* synthetic */ B() {
        this(16);
    }
}
