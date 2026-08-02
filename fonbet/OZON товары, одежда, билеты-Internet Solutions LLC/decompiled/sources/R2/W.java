package R2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class W<T> extends g0<T> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Throwable f24328b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(int i11, @NotNull Throwable readException) {
        super(i11);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.f24328b = readException;
    }

    @NotNull
    public final Throwable b() {
        return this.f24328b;
    }
}
