package S0;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3955f0 extends CoroutineContext.Element {

    /* renamed from: a0, reason: collision with root package name */
    @NotNull
    public static final a f25402a0 = a.f25403a;

    /* renamed from: S0.f0$a */
    public static final class a implements CoroutineContext.a<InterfaceC3955f0> {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f25403a = new a();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    default CoroutineContext.a<?> getKey() {
        return a.f25403a;
    }

    <R> Object v(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> dVar);
}
