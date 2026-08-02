package arrow.core.raise;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003BK\u0012\u001a\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006`\u0007\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0017\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006`\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Larrow/core/raise/IorAccumulate;", "Error", "Larrow/core/raise/Accumulate;", "Larrow/core/raise/Raise;", "Larrow/core/NonEmptyList;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Larrow/atomic/getHighResolutionOutputSizeshNQ4ISI;", "p0", "Lkotlin/Function2;", "p1", "p2", "<init>", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function2;Larrow/core/raise/Raise;)V", "", "Camera2StreamConfigurationMap", "(Ljava/lang/Object;)Ljava/lang/Void;", "Larrow/core/raise/RaiseAccumulate$Value;", "accumulateAll-GZgkXh4", "(Ljava/util/List;)Larrow/core/raise/RaiseAccumulate$Value;", "accumulateAll", "getHighSpeedVideoSizes", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI", "Larrow/core/raise/Raise;", "Larrow/core/raise/RaiseAccumulate$Error;", "Larrow/core/raise/RaiseAccumulate$Error;", "getHighSpeedVideoFpsRangesFor", "getLatestError", "()Larrow/core/raise/RaiseAccumulate$Value;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class IorAccumulate<Error> implements arrow.core.raise.Accumulate<Error>, arrow.core.raise.Raise<arrow.core.NonEmptyList<? extends Error>> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final arrow.core.raise.RaiseAccumulate.Error getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final arrow.core.raise.Raise<Error> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<Error, Error, Error> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public IorAccumulate(java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference, kotlin.jvm.functions.Function2<? super Error, ? super Error, ? extends Error> function2, arrow.core.raise.Raise<? super Error> raise) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        this.getHighSpeedVideoFpsRanges = atomicReference;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoSizes = raise;
        this.getHighSpeedVideoFpsRangesFor = new arrow.core.raise.RaiseAccumulate.Error(new kotlin.jvm.functions.Function0(this) { // from class: arrow.core.raise.IorAccumulate$raiseAccumulated$1
            final /* synthetic */ arrow.core.raise.IorAccumulate<Error> getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ java.lang.Object invoke() {
                arrow.core.raise.Raise raise2;
                java.util.concurrent.atomic.AtomicReference atomicReference2;
                raise2 = ((arrow.core.raise.IorAccumulate) this.getHighSpeedVideoSizes).getHighSpeedVideoSizes;
                arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                atomicReference2 = ((arrow.core.raise.IorAccumulate) this.getHighSpeedVideoSizes).getHighSpeedVideoFpsRanges;
                java.lang.Object obj = atomicReference2.get();
                if (obj == arrow.core.EmptyValue.INSTANCE) {
                    obj = null;
                }
                raise2.raise(obj);
                throw new kotlin.KotlinNothingValueException();
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
    }

    @Override // arrow.core.raise.Accumulate
    @kotlin.IgnorableReturnValue
    public final /* bridge */ arrow.core.raise.RaiseAccumulate.Value accumulate(Error error) {
        return arrow.core.raise.Accumulate.DefaultImpls.accumulate(this, error);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final /* bridge */ <A> A bind(arrow.core.Either<? extends arrow.core.NonEmptyList<? extends Error>, ? extends A> either) {
        return (A) arrow.core.raise.Raise.DefaultImpls.bind(this, either);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final /* bridge */ <A> A bind(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>>, ? extends A> function1) {
        return (A) arrow.core.raise.Raise.DefaultImpls.bind(this, function1);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final /* bridge */ <A> java.lang.Object bind(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super A> continuation) {
        return arrow.core.raise.Raise.DefaultImpls.bind(this, function2, continuation);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    public final /* bridge */ <A> java.util.List<A> bindAll(java.lang.Iterable<? extends arrow.core.Either<? extends arrow.core.NonEmptyList<? extends Error>, ? extends A>> iterable) {
        return arrow.core.raise.Raise.DefaultImpls.bindAll(this, iterable);
    }

    @Override // arrow.core.raise.Raise
    public final /* bridge */ <K, A> java.util.Map<K, A> bindAll(java.util.Map<K, ? extends arrow.core.Either<? extends arrow.core.NonEmptyList<? extends Error>, ? extends A>> map) {
        return arrow.core.raise.Raise.DefaultImpls.bindAll(this, map);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    /* renamed from: bindAll-1TN0_VU */
    public final /* bridge */ <A> java.util.Set<A> mo9684bindAll1TN0_VU(java.util.Set<? extends arrow.core.Either<? extends arrow.core.NonEmptyList<? extends Error>, ? extends A>> set) {
        return arrow.core.raise.Raise.DefaultImpls.m9687bindAll1TN0_VU(this, set);
    }

    @Override // arrow.core.raise.Raise
    @arrow.core.raise.RaiseDSL
    /* renamed from: bindAll-vcjLgH4 */
    public final /* bridge */ <A> java.util.List<A> mo9685bindAllvcjLgH4(java.util.List<? extends arrow.core.Either<? extends arrow.core.NonEmptyList<? extends Error>, ? extends A>> list) {
        return arrow.core.raise.Raise.DefaultImpls.m9688bindAllvcjLgH4(this, list);
    }

    @Override // arrow.core.raise.Accumulate
    public final /* bridge */ <A> arrow.core.raise.RaiseAccumulate.Value<java.util.List<A>> bindAllOrAccumulate(java.lang.Iterable<? extends arrow.core.Either<? extends Error, ? extends A>> iterable) {
        return arrow.core.raise.Accumulate.DefaultImpls.bindAllOrAccumulate(this, iterable);
    }

    @Override // arrow.core.raise.Accumulate
    public final /* bridge */ <A> arrow.core.raise.RaiseAccumulate.Value<A> bindNelOrAccumulate(arrow.core.Either<? extends arrow.core.NonEmptyList<? extends Error>, ? extends A> either) {
        return arrow.core.raise.Accumulate.DefaultImpls.bindNelOrAccumulate(this, either);
    }

    @Override // arrow.core.raise.Accumulate
    public final /* bridge */ <A> arrow.core.raise.RaiseAccumulate.Value<A> bindOrAccumulate(arrow.core.Either<? extends Error, ? extends A> either) {
        return arrow.core.raise.Accumulate.DefaultImpls.bindOrAccumulate(this, either);
    }

    @Override // arrow.core.raise.Accumulate
    /* renamed from: getHasAccumulatedErrors */
    public final /* bridge */ boolean hasErrors() {
        return arrow.core.raise.Accumulate.DefaultImpls.getHasAccumulatedErrors(this);
    }

    @Override // arrow.core.raise.Accumulate
    public final /* bridge */ <A> A getOrAccumulate(arrow.core.Either<? extends Error, ? extends A> either, kotlin.jvm.functions.Function1<? super Error, ? extends A> function1) {
        return (A) arrow.core.raise.Accumulate.DefaultImpls.getOrAccumulate(this, either, function1);
    }

    @Override // arrow.core.raise.Raise
    public final /* bridge */ <A> A invoke(kotlin.jvm.functions.Function1<? super arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>>, ? extends A> function1) {
        return (A) arrow.core.raise.Raise.DefaultImpls.invoke(this, function1);
    }

    @Override // arrow.core.raise.Raise
    public final /* bridge */ <A> java.lang.Object invoke(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super A> continuation) {
        return arrow.core.raise.Raise.DefaultImpls.invoke(this, function2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // arrow.core.raise.Raise
    public final /* synthetic */ java.lang.Void raise(java.lang.Object obj) {
        java.util.List all = ((arrow.core.NonEmptyList) obj).getAll();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(all, "");
        arrow.core.NonEmptyList m9567boximpl = arrow.core.NonEmptyList.m9567boximpl(all);
        kotlin.jvm.functions.Function2<Error, Error, Error> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.Iterator<E> it = m9567boximpl.iterator();
        if (!it.hasNext()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            next = function2.invoke(next, it.next());
        }
        Camera2StreamConfigurationMap((arrow.core.raise.IorAccumulate<Error>) next);
        throw new kotlin.KotlinNothingValueException();
    }

    public final java.lang.Void Camera2StreamConfigurationMap(Error p0) {
        arrow.core.raise.Raise<Error> raise = this.getHighSpeedVideoSizes;
        arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get();
        kotlin.jvm.functions.Function2<Error, Error, Error> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (obj != arrow.core.EmptyValue.INSTANCE) {
            p0 = (Error) function2.invoke(obj, p0);
        }
        raise.raise(p0);
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // arrow.core.raise.Accumulate
    /* renamed from: accumulateAll-GZgkXh4 */
    public final arrow.core.raise.RaiseAccumulate.Value mo9683accumulateAllGZgkXh4(java.util.List<? extends Error> p0) {
        java.lang.Object value;
        java.lang.Object value2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        arrow.core.NonEmptyList m9567boximpl = arrow.core.NonEmptyList.m9567boximpl(p0);
        kotlin.jvm.functions.Function2<Error, Error, Error> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.Iterator<E> it = m9567boximpl.iterator();
        if (!it.hasNext()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            next = function2.invoke(next, it.next());
        }
        java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = this.getHighSpeedVideoFpsRanges;
        do {
            value = arrow.atomic.AtomicKt.getValue(atomicReference);
            value2 = arrow.atomic.AtomicKt.getValue(atomicReference);
            arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, value, value2 == arrow.core.EmptyValue.INSTANCE ? next : this.getHighResolutionOutputSizeshNQ4ISI.invoke(value2, next)));
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // arrow.core.raise.Accumulate
    public final arrow.core.raise.RaiseAccumulate.Value getLatestError() {
        if (this.getHighSpeedVideoFpsRanges.get() == arrow.core.EmptyValue.INSTANCE) {
            return null;
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
