package kotlinx.coroutines.debug.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/internal/Symbol;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/internal/Symbol;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/debug/internal/Marked;", "Lkotlinx/coroutines/debug/internal/Marked;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConcurrentWeakMapKt {
    private static final kotlinx.coroutines.internal.Symbol Camera2StreamConfigurationMap = new kotlinx.coroutines.internal.Symbol("REHASH");
    private static final kotlinx.coroutines.debug.internal.Marked getHighSpeedVideoFpsRangesFor = new kotlinx.coroutines.debug.internal.Marked(null);
    private static final kotlinx.coroutines.debug.internal.Marked getHighSpeedVideoFpsRanges = new kotlinx.coroutines.debug.internal.Marked(java.lang.Boolean.TRUE);

    public static final /* synthetic */ kotlinx.coroutines.debug.internal.Marked access$mark(java.lang.Object obj) {
        if (obj == null) {
            return getHighSpeedVideoFpsRangesFor;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(obj, java.lang.Boolean.TRUE) ? getHighSpeedVideoFpsRanges : new kotlinx.coroutines.debug.internal.Marked(obj);
    }

    public static final /* synthetic */ java.lang.Void access$noImpl() {
        throw new java.lang.UnsupportedOperationException("not implemented");
    }
}
