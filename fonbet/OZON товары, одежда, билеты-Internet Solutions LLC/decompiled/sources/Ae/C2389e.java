package Ae;

import Be.AbstractC2635g;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

/* renamed from: Ae.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2389e<T> extends AbstractC2635g<T> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.jvm.internal.j f972d;

    /* JADX WARN: Multi-variable type inference failed */
    public C2389e(@NotNull Function2<? super ze.u<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        super(coroutineContext, i11, enumC11113a);
        this.f972d = (kotlin.coroutines.jvm.internal.j) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // Be.AbstractC2635g
    protected Object d(@NotNull ze.u<? super T> uVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object invoke = this.f972d.invoke(uVar, dVar);
        return invoke == Wc.a.COROUTINE_SUSPENDED ? invoke : Unit.f71690a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // Be.AbstractC2635g
    @NotNull
    protected AbstractC2635g<T> e(@NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        return new C2389e(this.f972d, coroutineContext, i11, enumC11113a);
    }

    @Override // Be.AbstractC2635g
    @NotNull
    public final String toString() {
        return "block[" + this.f972d + "] -> " + super.toString();
    }
}
