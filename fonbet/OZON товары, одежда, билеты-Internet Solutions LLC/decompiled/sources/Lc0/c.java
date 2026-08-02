package Lc0;

import Vb0.b;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.J;

/* loaded from: classes3.dex */
public final class c extends kotlin.coroutines.a implements J {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f16730a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(J.a aVar, a aVar2) {
        super(aVar);
        this.f16730a = aVar2;
    }

    @Override // xe.J
    public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        b.a.c(Vb0.b.f28514a, th2);
        this.f16730a.i0().v(th2);
    }
}
