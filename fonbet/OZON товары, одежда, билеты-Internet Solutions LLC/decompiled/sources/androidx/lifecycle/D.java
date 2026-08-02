package androidx.lifecycle;

import androidx.lifecycle.AbstractC5434v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class D extends B implements G {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC5434v f43193a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f43194b;

    public D(@NotNull AbstractC5434v lifecycle, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f43193a = lifecycle;
        this.f43194b = coroutineContext;
        if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
            xe.E0.b(coroutineContext, null);
        }
    }

    @Override // androidx.lifecycle.B
    @NotNull
    public final AbstractC5434v a() {
        return this.f43193a;
    }

    @Override // xe.M
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.f43194b;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(@NotNull J source, @NotNull AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        AbstractC5434v abstractC5434v = this.f43193a;
        if (abstractC5434v.b().compareTo(AbstractC5434v.b.DESTROYED) <= 0) {
            abstractC5434v.e(this);
            xe.E0.b(this.f43194b, null);
        }
    }
}
