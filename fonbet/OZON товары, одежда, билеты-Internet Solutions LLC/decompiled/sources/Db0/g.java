package Db0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f6315a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6316b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6317c;

    public g(int i11, int i12, int i13) {
        this.f6315a = i11;
        this.f6316b = i12;
        this.f6317c = i13;
    }

    public final int a(@NotNull g rhs) {
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        int i11 = Intrinsics.i(this.f6315a, rhs.f6315a);
        if (i11 != 0) {
            return i11;
        }
        int i12 = Intrinsics.i(this.f6316b, rhs.f6316b);
        return i12 != 0 ? i12 : Intrinsics.i(this.f6317c, rhs.f6317c);
    }
}
