package arrow.core.raise;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Larrow/core/raise/TolerantAccumulate;", "Error", "Larrow/core/raise/Accumulate;", "p0", "Larrow/core/raise/Raise;", "Larrow/core/raise/RaiseAccumulate$Value;", "", "p1", "<init>", "(Larrow/core/raise/Accumulate;Larrow/core/raise/Raise;)V", "Larrow/core/NonEmptyList;", "accumulateAll-GZgkXh4", "(Ljava/util/List;)Larrow/core/raise/RaiseAccumulate$Value;", "accumulateAll", "getHighSpeedVideoFpsRangesFor", "Larrow/core/raise/Accumulate;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Larrow/core/raise/Raise;", "getLatestError", "()Larrow/core/raise/RaiseAccumulate$Value;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class TolerantAccumulate<Error> implements arrow.core.raise.Accumulate<Error> {
    private final arrow.core.raise.Raise<arrow.core.raise.RaiseAccumulate.Value> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final arrow.core.raise.Accumulate<Error> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public TolerantAccumulate(arrow.core.raise.Accumulate<Error> accumulate, arrow.core.raise.Raise<? super arrow.core.raise.RaiseAccumulate.Value> raise) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accumulate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raise, "");
        this.getHighResolutionOutputSizeshNQ4ISI = accumulate;
        this.Camera2StreamConfigurationMap = raise;
    }

    @Override // arrow.core.raise.Accumulate
    @kotlin.IgnorableReturnValue
    public final /* bridge */ arrow.core.raise.RaiseAccumulate.Value accumulate(Error error) {
        return arrow.core.raise.Accumulate.DefaultImpls.accumulate(this, error);
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

    @Override // arrow.core.raise.Accumulate
    /* renamed from: accumulateAll-GZgkXh4 */
    public final arrow.core.raise.RaiseAccumulate.Value mo9683accumulateAllGZgkXh4(java.util.List<? extends Error> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        final arrow.core.raise.RaiseAccumulate.Value mo9683accumulateAllGZgkXh4 = this.getHighResolutionOutputSizeshNQ4ISI.mo9683accumulateAllGZgkXh4(p0);
        return new arrow.core.raise.RaiseAccumulate.Error(new kotlin.jvm.functions.Function0(this) { // from class: arrow.core.raise.TolerantAccumulate$accumulateAll$1
            final /* synthetic */ arrow.core.raise.TolerantAccumulate<Error> getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ java.lang.Object invoke() {
                arrow.core.raise.Raise raise;
                raise = ((arrow.core.raise.TolerantAccumulate) this.getHighResolutionOutputSizeshNQ4ISI).Camera2StreamConfigurationMap;
                raise.raise(mo9683accumulateAllGZgkXh4);
                throw new kotlin.KotlinNothingValueException();
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        });
    }

    @Override // arrow.core.raise.Accumulate
    public final arrow.core.raise.RaiseAccumulate.Value getLatestError() {
        final arrow.core.raise.RaiseAccumulate.Value latestError = this.getHighResolutionOutputSizeshNQ4ISI.getLatestError();
        if (latestError == null) {
            return null;
        }
        return new arrow.core.raise.RaiseAccumulate.Error(new kotlin.jvm.functions.Function0(this) { // from class: arrow.core.raise.TolerantAccumulate$latestError$1
            final /* synthetic */ arrow.core.raise.TolerantAccumulate<Error> getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ java.lang.Object invoke() {
                arrow.core.raise.Raise raise;
                raise = ((arrow.core.raise.TolerantAccumulate) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
                raise.raise(latestError);
                throw new kotlin.KotlinNothingValueException();
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
    }
}
