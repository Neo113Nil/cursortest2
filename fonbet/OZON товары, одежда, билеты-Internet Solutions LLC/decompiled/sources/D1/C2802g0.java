package D1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: D1.g0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2802g0<T> {

    /* renamed from: a, reason: collision with root package name */
    private int f5459a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private int[] f5460b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private U0.b<T>[] f5461c = new U0.b[16];

    public final boolean a() {
        int i11 = this.f5459a;
        return i11 > 0 && this.f5460b[i11 - 1] >= 0;
    }

    public final T b() {
        int i11 = this.f5459a;
        if (i11 <= 0) {
            throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
        }
        int i12 = i11 - 1;
        int i13 = this.f5460b[i12];
        U0.b<T> bVar = this.f5461c[i12];
        Intrinsics.f(bVar);
        if (i13 > 0) {
            this.f5460b[i12] = r3[i12] - 1;
        } else if (i13 == 0) {
            this.f5461c[i12] = null;
            this.f5459a--;
        }
        return bVar.l()[i13];
    }

    public final void c(@NotNull U0.b<T> bVar) {
        if (bVar.o()) {
            return;
        }
        int i11 = this.f5459a;
        int[] iArr = this.f5460b;
        if (i11 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f5460b = copyOf;
            U0.b<T>[] bVarArr = this.f5461c;
            Object[] copyOf2 = Arrays.copyOf(bVarArr, bVarArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f5461c = (U0.b[]) copyOf2;
        }
        this.f5460b[i11] = bVar.m() - 1;
        this.f5461c[i11] = bVar;
        this.f5459a++;
    }
}
