package arrow.core.raise;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Larrow/core/raise/ListAccumulate;", "Error", "Larrow/core/raise/Accumulate;", "Larrow/core/raise/Raise;", "Larrow/core/NonEmptyList;", "p0", "<init>", "(Larrow/core/raise/Raise;)V", "", "Camera2StreamConfigurationMap", "(Ljava/lang/Object;)Ljava/lang/Void;", "Larrow/core/raise/RaiseAccumulate$Value;", "accumulateAll-GZgkXh4", "(Ljava/util/List;)Larrow/core/raise/RaiseAccumulate$Value;", "accumulateAll", "getHighResolutionOutputSizeshNQ4ISI", "Larrow/core/raise/Raise;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "Larrow/core/raise/RaiseAccumulate$Error;", "Larrow/core/raise/RaiseAccumulate$Error;", "getHighSpeedVideoFpsRanges", "getLatestError", "()Larrow/core/raise/RaiseAccumulate$Value;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ListAccumulate<Error> implements arrow.core.raise.Accumulate<Error>, arrow.core.raise.Raise<arrow.core.NonEmptyList<? extends Error>> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final arrow.core.raise.RaiseAccumulate.Error getHighSpeedVideoFpsRanges;
    private final arrow.core.raise.Raise<arrow.core.NonEmptyList<? extends Error>> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.List<Error> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public ListAccumulate(arrow.core.raise.Raise<? super arrow.core.NonEmptyList<? extends Error>> raise) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        this.getHighResolutionOutputSizeshNQ4ISI = raise;
        this.Camera2StreamConfigurationMap = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRanges = new arrow.core.raise.RaiseAccumulate.Error(new kotlin.jvm.functions.Function0(this) { // from class: arrow.core.raise.ListAccumulate$error$1
            final /* synthetic */ arrow.core.raise.ListAccumulate<Error> getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ java.lang.Object invoke() {
                arrow.core.raise.Raise raise2;
                java.util.List list;
                raise2 = ((arrow.core.raise.ListAccumulate) this.getHighSpeedVideoFpsRangesFor).getHighResolutionOutputSizeshNQ4ISI;
                list = ((arrow.core.raise.ListAccumulate) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
                raise2.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(list)));
                throw new kotlin.KotlinNothingValueException();
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
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

    @Override // arrow.core.raise.Raise
    public final /* synthetic */ java.lang.Void raise(java.lang.Object obj) {
        java.util.List all = ((arrow.core.NonEmptyList) obj).getAll();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(all, "");
        this.getHighResolutionOutputSizeshNQ4ISI.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.plus((java.util.Collection) this.Camera2StreamConfigurationMap, (java.lang.Iterable) all))));
        throw new kotlin.KotlinNothingValueException();
    }

    public final java.lang.Void Camera2StreamConfigurationMap(Error p0) {
        this.getHighResolutionOutputSizeshNQ4ISI.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends Error>) this.Camera2StreamConfigurationMap, p0))));
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // arrow.core.raise.Accumulate
    /* renamed from: accumulateAll-GZgkXh4 */
    public final arrow.core.raise.RaiseAccumulate.Value mo9683accumulateAllGZgkXh4(java.util.List<? extends Error> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.Camera2StreamConfigurationMap.addAll(arrow.core.NonEmptyList.m9567boximpl(p0));
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // arrow.core.raise.Accumulate
    public final arrow.core.raise.RaiseAccumulate.Value getLatestError() {
        arrow.core.raise.RaiseAccumulate.Error error = this.getHighSpeedVideoFpsRanges;
        if (this.Camera2StreamConfigurationMap.isEmpty()) {
            error = null;
        }
        return error;
    }
}
