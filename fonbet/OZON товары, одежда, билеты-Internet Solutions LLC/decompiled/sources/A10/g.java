package A10;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f294a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f295b;

    /* renamed from: c, reason: collision with root package name */
    private int f296c;

    public g(@NotNull Function0<Unit> onScrollStart, @NotNull Function0<Unit> onScrollEnd) {
        Intrinsics.checkNotNullParameter(onScrollStart, "onScrollStart");
        Intrinsics.checkNotNullParameter(onScrollEnd, "onScrollEnd");
        this.f294a = onScrollStart;
        this.f295b = onScrollEnd;
    }

    public final void a(int i11) {
        if (i11 == 0) {
            this.f295b.invoke();
        } else if (this.f296c == 0) {
            this.f294a.invoke();
        }
        this.f296c = i11;
    }
}
