package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/datetime/internal/format/ComparisonPredicate;", "T", "E", "Lkotlinx/datetime/internal/format/Predicate;", "expectedValue", "Lkotlin/Function1;", "getter", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "test", "(Ljava/lang/Object;)Z", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ComparisonPredicate<T, E> implements kotlinx.datetime.internal.format.Predicate<T> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<T, E> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final E Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonPredicate(E e, kotlin.jvm.functions.Function1<? super T, ? extends E> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.Camera2StreamConfigurationMap = e;
        this.getHighSpeedVideoSizes = function1;
    }

    @Override // kotlinx.datetime.internal.format.Predicate
    public final boolean test(T value) {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes.invoke(value), this.Camera2StreamConfigurationMap);
    }
}
