package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.SubclassOptInRequired;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

@SubclassOptInRequired(markerClass = InterfaceC1114u0.class)
/* renamed from: kotlinx.coroutines.x0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1120x0 extends CoroutineContext.Element {

    /* renamed from: kotlinx.coroutines.x0$a */
    public static final class a implements CoroutineContext.Key<InterfaceC1120x0> {
        public static final /* synthetic */ a a = new a();
    }

    InterfaceC1109s attachChild(InterfaceC1113u interfaceC1113u);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean cancel(Throwable th);

    CancellationException getCancellationException();

    Sequence<InterfaceC1120x0> getChildren();

    kotlinx.coroutines.selects.a getOnJoin();

    InterfaceC1120x0 getParent();

    InterfaceC1053e0 invokeOnCompletion(Function1<? super Throwable, Unit> function1);

    InterfaceC1053e0 invokeOnCompletion(boolean z, boolean z2, Function1<? super Throwable, Unit> function1);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(Continuation<? super Unit> continuation);

    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    InterfaceC1120x0 plus(InterfaceC1120x0 interfaceC1120x0);

    boolean start();
}
