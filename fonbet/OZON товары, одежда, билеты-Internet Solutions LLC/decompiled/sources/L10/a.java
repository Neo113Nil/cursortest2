package L10;

import i10.InterfaceC6995a;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a<S extends InterfaceC6995a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<S> f16201a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f16202b;

    public a(@NotNull Class<S> clazz, @NotNull Function2<? super S, ? super d<? super Unit>, ? extends Object> callback) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f16201a = clazz;
        this.f16202b = callback;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    public final Object a(@NotNull InterfaceC6995a interfaceC6995a, @NotNull d<? super Unit> dVar) {
        Object invoke;
        S cast = this.f16201a.cast(interfaceC6995a);
        return (cast != null && (invoke = this.f16202b.invoke(cast, dVar)) == Wc.a.COROUTINE_SUSPENDED) ? invoke : Unit.f71690a;
    }

    @NotNull
    public final Class<S> b() {
        return this.f16201a;
    }
}
