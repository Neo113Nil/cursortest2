package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.InterfaceC1120x0;

/* loaded from: classes5.dex */
public final class J0 extends AbstractCoroutineContextElement implements InterfaceC1120x0 {
    public static final J0 a = new J0(InterfaceC1120x0.a.a);

    @Override // kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final InterfaceC1109s attachChild(InterfaceC1113u interfaceC1113u) {
        return K0.a;
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ void cancel() {
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final void cancel(CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean cancel(Throwable th) {
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final Sequence<InterfaceC1120x0> getChildren() {
        return SequencesKt.emptySequence();
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final kotlinx.coroutines.selects.a getOnJoin() {
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final InterfaceC1120x0 getParent() {
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final InterfaceC1053e0 invokeOnCompletion(Function1<? super Throwable, Unit> function1) {
        return K0.a;
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final boolean isCompleted() {
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final Object join(Continuation<? super Unit> continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public final InterfaceC1120x0 plus(InterfaceC1120x0 interfaceC1120x0) {
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final InterfaceC1053e0 invokeOnCompletion(boolean z, boolean z2, Function1<? super Throwable, Unit> function1) {
        return K0.a;
    }
}
