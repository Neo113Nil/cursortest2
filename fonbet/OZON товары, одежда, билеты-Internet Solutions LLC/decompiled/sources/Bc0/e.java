package Bc0;

import Sc.InterfaceC4008j;
import Vb0.b;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.J;

/* loaded from: classes3.dex */
public final class e extends kotlin.coroutines.a implements J {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4008j f3525a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(J.a aVar, InterfaceC4008j interfaceC4008j) {
        super(aVar);
        this.f3525a = interfaceC4008j;
    }

    @Override // xe.J
    public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        b.a.c(Vb0.b.f28514a, th2);
        ((Nc0.d) this.f3525a.getValue()).y(null);
    }
}
