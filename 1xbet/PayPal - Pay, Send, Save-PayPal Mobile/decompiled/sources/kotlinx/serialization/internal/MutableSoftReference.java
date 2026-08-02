package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/serialization/internal/MutableSoftReference;", "T", "", "<init>", "()V", "Lkotlin/Function0;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/lang/ref/SoftReference;", "getHighSpeedVideoFpsRanges", "Ljava/lang/ref/SoftReference;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class MutableSoftReference<T> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    public volatile java.lang.ref.SoftReference<T> getHighResolutionOutputSizeshNQ4ISI = new java.lang.ref.SoftReference<>(null);

    public final T getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function0<? extends T> p0) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            T t = this.getHighResolutionOutputSizeshNQ4ISI.get();
            if (t != null) {
                return t;
            }
            T invoke = p0.invoke();
            this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.ref.SoftReference<>(invoke);
            return invoke;
        }
    }
}
