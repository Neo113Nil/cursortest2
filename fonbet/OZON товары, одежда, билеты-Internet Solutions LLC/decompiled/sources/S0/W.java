package S0;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f25319a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    private int f25320b;

    public final void a() {
        this.f25320b = 0;
    }

    public final int b() {
        return this.f25320b;
    }

    public final int c(int i11) {
        int i12 = this.f25320b;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f25319a[i13] == i11) {
                return i13;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.f25320b == 0;
    }

    public final int e() {
        return this.f25319a[this.f25320b - 1];
    }

    public final int f(int i11) {
        return this.f25319a[i11];
    }

    public final int g() {
        return this.f25319a[this.f25320b - 2];
    }

    public final int h(int i11) {
        return this.f25320b > 0 ? e() : i11;
    }

    public final int i() {
        int[] iArr = this.f25319a;
        int i11 = this.f25320b - 1;
        this.f25320b = i11;
        return iArr[i11];
    }

    public final void j(int i11) {
        int i12 = this.f25320b;
        int[] iArr = this.f25319a;
        if (i12 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f25319a = copyOf;
        }
        int[] iArr2 = this.f25319a;
        int i13 = this.f25320b;
        this.f25320b = i13 + 1;
        iArr2[i13] = i11;
    }
}
