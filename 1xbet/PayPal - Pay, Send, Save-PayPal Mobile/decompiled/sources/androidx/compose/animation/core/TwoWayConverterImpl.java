package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r"}, d2 = {"Landroidx/compose/animation/core/TwoWayConverterImpl;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "Lkotlin/Function1;", "p0", "p1", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getConvertToVector", "()Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getConvertFromVector"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TwoWayConverterImpl<T, V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.animation.core.TwoWayConverter<T, V> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<T, V> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<V, T> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public TwoWayConverterImpl(kotlin.jvm.functions.Function1<? super T, ? extends V> function1, kotlin.jvm.functions.Function1<? super V, ? extends T> function12) {
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRanges = function12;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public final kotlin.jvm.functions.Function1<T, V> getConvertToVector() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public final kotlin.jvm.functions.Function1<V, T> getConvertFromVector() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
