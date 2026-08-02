package Ae;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class A0<T> extends AbstractC2381a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.jvm.internal.j f760a;

    /* JADX WARN: Multi-variable type inference failed */
    public A0(@NotNull Function2<? super InterfaceC2397i<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.f760a = (kotlin.coroutines.jvm.internal.j) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // Ae.AbstractC2381a
    public final Object c(@NotNull Be.B b11, @NotNull kotlin.coroutines.d dVar) {
        Object invoke = this.f760a.invoke(b11, dVar);
        return invoke == Wc.a.COROUTINE_SUSPENDED ? invoke : Unit.f71690a;
    }
}
