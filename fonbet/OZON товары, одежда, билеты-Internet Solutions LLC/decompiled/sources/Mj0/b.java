package Mj0;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    private final int f18146a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18147b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<Class<? extends Throwable>> f18148c;

    public b(Set nonRepeatableExceptions) {
        Intrinsics.checkNotNullParameter(nonRepeatableExceptions, "nonRepeatableExceptions");
        this.f18146a = 1;
        this.f18147b = 300L;
        this.f18148c = nonRepeatableExceptions;
    }

    @Override // Mj0.g
    @NotNull
    public final Set<Class<? extends Throwable>> a() {
        return this.f18148c;
    }

    @Override // Mj0.g
    public final int b() {
        return this.f18146a;
    }

    @Override // Mj0.g
    public final long c() {
        return this.f18147b;
    }
}
