package R2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n0 implements CoroutineContext.Element {

    /* renamed from: a, reason: collision with root package name */
    private final n0 f24396a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3922p<?> f24397b;

    public n0(n0 n0Var, @NotNull C3922p<?> instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f24396a = n0Var;
        this.f24397b = instance;
    }

    public final void a(@NotNull C3922p candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (this.f24397b == candidate) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        n0 n0Var = this.f24396a;
        if (n0Var != null) {
            n0Var.a(candidate);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r11, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.a<E> aVar) {
        return (E) CoroutineContext.Element.a.b(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.a<?> getKey() {
        return m0.f24387a;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.a<?> aVar) {
        return CoroutineContext.Element.a.c(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(coroutineContext, this);
    }
}
