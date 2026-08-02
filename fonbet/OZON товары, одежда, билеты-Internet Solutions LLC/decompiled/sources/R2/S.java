package R2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class S<T> extends g0<T> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Throwable f24323b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(@NotNull Throwable finalException) {
        super(Integer.MAX_VALUE);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.f24323b = finalException;
    }

    @NotNull
    public final Throwable b() {
        return this.f24323b;
    }
}
