package F4;

import androidx.recyclerview.widget.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i.c f8979a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8980b;

    public z(@NotNull i.c diff, boolean z11) {
        Intrinsics.checkNotNullParameter(diff, "diff");
        this.f8979a = diff;
        this.f8980b = z11;
    }

    @NotNull
    public final i.c a() {
        return this.f8979a;
    }

    public final boolean b() {
        return this.f8980b;
    }
}
