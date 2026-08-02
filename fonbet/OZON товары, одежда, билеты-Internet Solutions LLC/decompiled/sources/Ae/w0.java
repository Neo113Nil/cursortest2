package Ae;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface w0<T> extends B0<T>, InterfaceC2397i<T> {
    Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @NotNull
    M0<Integer> getSubscriptionCount();

    void resetReplayCache();

    boolean tryEmit(T t2);
}
