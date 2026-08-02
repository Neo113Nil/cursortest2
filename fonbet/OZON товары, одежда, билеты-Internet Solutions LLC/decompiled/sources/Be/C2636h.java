package Be;

import Ae.InterfaceC2397i;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

/* renamed from: Be.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2636h {
    public static final InterfaceC2397i a(InterfaceC2397i interfaceC2397i, CoroutineContext coroutineContext) {
        return ((interfaceC2397i instanceof E) || (interfaceC2397i instanceof y)) ? interfaceC2397i : new H(interfaceC2397i, coroutineContext);
    }

    public static final <T, V> Object b(@NotNull CoroutineContext coroutineContext, V v11, @NotNull Object obj, @NotNull Function2<? super V, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> frame) {
        Object invoke;
        Object c11 = De.G.c(coroutineContext, obj);
        try {
            F f7 = new F(frame, coroutineContext);
            if (function2 == null) {
                invoke = Wc.b.c(function2, v11, f7);
            } else {
                U.g(2, function2);
                invoke = function2.invoke(v11, f7);
            }
            De.G.a(coroutineContext, c11);
            if (invoke == Wc.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return invoke;
        } catch (Throwable th2) {
            De.G.a(coroutineContext, c11);
            throw th2;
        }
    }
}
