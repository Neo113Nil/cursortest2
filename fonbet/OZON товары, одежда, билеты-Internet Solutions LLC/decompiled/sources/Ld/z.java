package Ld;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.d0;
import td.e0;

/* loaded from: classes10.dex */
public final class z implements d0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Gd.F f16827b;

    public z(@NotNull Gd.F packageFragment) {
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.f16827b = packageFragment;
    }

    @Override // td.d0
    @NotNull
    public final void b() {
        e0 NO_SOURCE_FILE = e0.f99393a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Gd.F f7 = this.f16827b;
        sb2.append(f7);
        sb2.append(": ");
        sb2.append(f7.H0().keySet());
        return sb2.toString();
    }
}
