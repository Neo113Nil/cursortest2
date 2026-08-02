package androidx.compose.ui.platform;

import S0.C3985t0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5257j1 implements e1.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3985t0 f40897a = S0.C0.a(1.0f);

    public final void a(float f7) {
        this.f40897a.h(f7);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r11, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.a<E> aVar) {
        return (E) CoroutineContext.Element.a.b(this, aVar);
    }

    @Override // e1.g
    public final float getScaleFactor() {
        return this.f40897a.getFloatValue();
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
