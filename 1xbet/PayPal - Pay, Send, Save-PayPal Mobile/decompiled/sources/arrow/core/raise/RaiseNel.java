package arrow.core.raise;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Larrow/core/raise/RaiseNel;", "Error", "Larrow/core/raise/Raise;", "Larrow/core/NonEmptyList;", "Larrow/core/raise/Accumulate;", "p0", "<init>", "(Larrow/core/raise/Accumulate;)V", "getHighSpeedVideoFpsRangesFor", "Larrow/core/raise/Accumulate;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class RaiseNel<Error> implements arrow.core.raise.Raise<arrow.core.NonEmptyList<? extends Error>> {
    private final arrow.core.raise.Accumulate<Error> getHighSpeedVideoFpsRangesFor;

    public RaiseNel(arrow.core.raise.Accumulate<Error> accumulate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accumulate, "");
        this.getHighSpeedVideoFpsRangesFor = accumulate;
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
        java.util.List<? extends Error> all = ((arrow.core.NonEmptyList) obj).getAll();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(all, "");
        this.getHighSpeedVideoFpsRangesFor.mo9683accumulateAllGZgkXh4(all).getValue();
        throw new kotlin.KotlinNothingValueException();
    }
}
