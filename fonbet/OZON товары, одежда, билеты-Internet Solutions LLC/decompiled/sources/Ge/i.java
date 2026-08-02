package Ge;

import Sc.C4001c;
import io.reactivex.InterfaceC7095c;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.AbstractC10711a;

/* loaded from: classes10.dex */
final class i extends AbstractC10711a<Unit> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC7095c f10091d;

    public i(@NotNull CoroutineContext coroutineContext, @NotNull InterfaceC7095c interfaceC7095c) {
        super(coroutineContext, false, true);
        this.f10091d = interfaceC7095c;
    }

    @Override // xe.AbstractC10711a
    protected final void w0(boolean z11, @NotNull Throwable th2) {
        try {
            if (this.f10091d.b(th2)) {
                return;
            }
        } catch (Throwable th3) {
            C4001c.a(th2, th3);
        }
        h.a(getContext(), th2);
    }

    @Override // xe.AbstractC10711a
    public final void x0(Unit unit) {
        try {
            this.f10091d.onComplete();
        } catch (Throwable th2) {
            h.a(getContext(), th2);
        }
    }
}
