package F4;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class U<Key, Value> implements Function0<M<Key, Value>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<M<Key, Value>> f8854a;

    /* JADX WARN: Multi-variable type inference failed */
    public U(@NotNull xe.I dispatcher, @NotNull Function0<? extends M<Key, Value>> delegate) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f8854a = delegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f8854a.invoke();
    }
}
