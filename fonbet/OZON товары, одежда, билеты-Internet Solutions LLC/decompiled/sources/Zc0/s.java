package Zc0;

import Vb0.b;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.J;

/* loaded from: classes3.dex */
public final class s extends kotlin.coroutines.a implements J {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f35883a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(J.a aVar, q qVar) {
        super(aVar);
        this.f35883a = qVar;
    }

    @Override // xe.J
    public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        b.a.c(Vb0.b.f28514a, th2);
        q.k0(this.f35883a);
    }
}
