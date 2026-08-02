package kotlinx.coroutines;

import kotlin.SubclassOptInRequired;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;

@SubclassOptInRequired(markerClass = InterfaceC1114u0.class)
/* renamed from: kotlinx.coroutines.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1096l<T> extends Continuation<T> {
    kotlinx.coroutines.internal.x b(Object obj, Function3 function3);

    boolean cancel(Throwable th);

    <R extends T> void f(R r, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3);

    boolean isActive();

    void k(Object obj);
}
