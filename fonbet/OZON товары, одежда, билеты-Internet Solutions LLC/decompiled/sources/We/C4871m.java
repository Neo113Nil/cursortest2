package We;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: We.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4871m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final cf.l f33771a;

    public C4871m(int i11, long j11) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        cf.l delegate = new cf.l(bf.e.f55976h, i11, j11);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f33771a = delegate;
    }

    public final void a() {
        this.f33771a.d();
    }

    @NotNull
    public final cf.l b() {
        return this.f33771a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4871m() {
        this(5, 5L);
        TimeUnit timeUnit = TimeUnit.MINUTES;
    }
}
