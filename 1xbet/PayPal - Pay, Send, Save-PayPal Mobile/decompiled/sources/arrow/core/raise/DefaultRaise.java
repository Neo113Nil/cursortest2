package arrow.core.raise;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\r\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0004\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Larrow/core/raise/DefaultRaise;", "Larrow/core/raise/Raise;", "", "", "isTraced", "<init>", "(Z)V", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, "()Z", "r", "", "raise", "(Ljava/lang/Object;)Ljava/lang/Void;", "Z", "isTraced$annotations", "()V", "Larrow/atomic/AtomicBoolean;", "getHighSpeedVideoFpsRangesFor", "Larrow/atomic/AtomicBoolean;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultRaise implements arrow.core.raise.Raise<java.lang.Object> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final arrow.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI = new arrow.atomic.AtomicBoolean(true);
    private final boolean isTraced;

    public static /* synthetic */ void isTraced$annotations() {
    }

    public DefaultRaise(boolean z) {
        this.isTraced = z;
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final /* bridge */ <A> A bind(arrow.core.Either<? extends java.lang.Object, ? extends A> either) {
        return (A) arrow.core.raise.Raise.DefaultImpls.bind(this, either);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final /* bridge */ <A> A bind(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<java.lang.Object>, ? extends A> function1) {
        return (A) arrow.core.raise.Raise.DefaultImpls.bind(this, function1);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final /* bridge */ <A> java.lang.Object bind(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<java.lang.Object>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super A> continuation) {
        return arrow.core.raise.Raise.DefaultImpls.bind(this, function2, continuation);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final /* bridge */ <A> java.util.List<A> bindAll(java.lang.Iterable<? extends arrow.core.Either<? extends java.lang.Object, ? extends A>> iterable) {
        return arrow.core.raise.Raise.DefaultImpls.bindAll(this, iterable);
    }

    @Override // arrow.core.raise.Raise
    public final /* bridge */ <K, A> java.util.Map<K, A> bindAll(java.util.Map<K, ? extends arrow.core.Either<? extends java.lang.Object, ? extends A>> map) {
        return arrow.core.raise.Raise.DefaultImpls.bindAll(this, map);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    /* renamed from: bindAll-1TN0_VU, reason: not valid java name */
    public final /* bridge */ <A> java.util.Set<A> mo9684bindAll1TN0_VU(java.util.Set<? extends arrow.core.Either<? extends java.lang.Object, ? extends A>> set) {
        return arrow.core.raise.Raise.DefaultImpls.m9687bindAll1TN0_VU(this, set);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    /* renamed from: bindAll-vcjLgH4, reason: not valid java name */
    public final /* bridge */ <A> java.util.List<A> mo9685bindAllvcjLgH4(java.util.List<? extends arrow.core.Either<? extends java.lang.Object, ? extends A>> list) {
        return arrow.core.raise.Raise.DefaultImpls.m9688bindAllvcjLgH4(this, list);
    }

    @Override // arrow.core.raise.Raise
    public final /* bridge */ <A> A invoke(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<java.lang.Object>, ? extends A> function1) {
        return (A) arrow.core.raise.Raise.DefaultImpls.invoke(this, function1);
    }

    @Override // arrow.core.raise.Raise
    public final /* bridge */ <A> java.lang.Object invoke(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<java.lang.Object>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super A> continuation) {
        return arrow.core.raise.Raise.DefaultImpls.invoke(this, function2, continuation);
    }

    /* renamed from: isTraced, reason: from getter */
    public final boolean getIsTraced() {
        return this.isTraced;
    }

    @kotlin.IgnorableReturnValue
    public final boolean complete() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(false);
    }

    @Override // arrow.core.raise.Raise
    public final java.lang.Void raise(java.lang.Object r) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI.getValue()) {
            throw new arrow.core.raise.RaiseLeakedException();
        }
        if (this.isTraced) {
            throw new arrow.core.raise.Traced(r, this, null, 4, null);
        }
        throw arrow.core.raise.CancellationExceptionNoTraceKt.NoTrace(r, this);
    }
}
