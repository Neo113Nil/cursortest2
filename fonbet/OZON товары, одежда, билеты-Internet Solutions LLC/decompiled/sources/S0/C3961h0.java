package S0;

import S0.InterfaceC3955f0;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3961h0 {
    @NotNull
    public static final InterfaceC3955f0 a(@NotNull CoroutineContext coroutineContext) {
        InterfaceC3955f0.a aVar = InterfaceC3955f0.f25402a0;
        InterfaceC3955f0 interfaceC3955f0 = (InterfaceC3955f0) coroutineContext.get(InterfaceC3955f0.a.f25403a);
        if (interfaceC3955f0 != null) {
            return interfaceC3955f0;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }
}
