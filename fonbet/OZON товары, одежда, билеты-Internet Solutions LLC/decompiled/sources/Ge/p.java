package Ge;

import Sc.C4001c;
import io.reactivex.z;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.AbstractC10711a;

/* loaded from: classes10.dex */
final class p<T> extends AbstractC10711a<T> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final z<T> f10107d;

    public p(@NotNull CoroutineContext coroutineContext, @NotNull z<T> zVar) {
        super(coroutineContext, false, true);
        this.f10107d = zVar;
    }

    @Override // xe.AbstractC10711a
    protected final void w0(boolean z11, @NotNull Throwable th2) {
        try {
            if (this.f10107d.b(th2)) {
                return;
            }
        } catch (Throwable th3) {
            C4001c.a(th2, th3);
        }
        h.a(getContext(), th2);
    }

    @Override // xe.AbstractC10711a
    protected final void x0(@NotNull T t2) {
        try {
            this.f10107d.onSuccess(t2);
        } catch (Throwable th2) {
            h.a(getContext(), th2);
        }
    }
}
