package Q2;

import Ve.Zm;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.F;
import sf.G;

/* loaded from: classes8.dex */
public final class f<T> implements T2.d<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Zm f22942a;

    public f(@NotNull Zm delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f22942a = delegate;
    }

    public final Object a(@NotNull G g10, @NotNull kotlin.coroutines.d dVar) {
        return this.f22942a.c(g10.a2(), (kotlin.coroutines.jvm.internal.c) dVar);
    }

    public final Object b(Object obj, @NotNull F f7, @NotNull kotlin.coroutines.d dVar) {
        Object d11 = this.f22942a.d(obj, f7.d(), (kotlin.coroutines.jvm.internal.c) dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }
}
