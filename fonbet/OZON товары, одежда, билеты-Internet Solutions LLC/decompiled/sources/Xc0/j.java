package Xc0;

import Vb0.b;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.J;

/* loaded from: classes3.dex */
public final class j extends kotlin.coroutines.a implements J {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f34364a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(J.a aVar, d dVar) {
        super(aVar);
        this.f34364a = dVar;
    }

    @Override // xe.J
    public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        b.a.c(Vb0.b.f28514a, th2);
        d.E0(this.f34364a);
    }
}
