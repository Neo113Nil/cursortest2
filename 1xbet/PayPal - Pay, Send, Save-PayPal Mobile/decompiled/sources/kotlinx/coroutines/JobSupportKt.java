package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e"}, d2 = {"", "boxIncomplete", "(Ljava/lang/Object;)Ljava/lang/Object;", "unboxState", "Lkotlinx/coroutines/internal/Symbol;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/internal/Symbol;", "COMPLETING_WAITING_CHILDREN", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getOutputMinFrameDuration", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/Empty;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/Empty;", "getInputSizeshNQ4ISI"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JobSupportKt {
    private static final kotlinx.coroutines.internal.Symbol Camera2StreamConfigurationMap = new kotlinx.coroutines.internal.Symbol("COMPLETING_ALREADY");
    public static final kotlinx.coroutines.internal.Symbol COMPLETING_WAITING_CHILDREN = new kotlinx.coroutines.internal.Symbol("COMPLETING_WAITING_CHILDREN");
    private static final kotlinx.coroutines.internal.Symbol getHighSpeedVideoFpsRanges = new kotlinx.coroutines.internal.Symbol("COMPLETING_RETRY");
    private static final kotlinx.coroutines.internal.Symbol getOutputMinFrameDuration = new kotlinx.coroutines.internal.Symbol("TOO_LATE_TO_CANCEL");
    private static final kotlinx.coroutines.internal.Symbol getHighSpeedVideoFpsRangesFor = new kotlinx.coroutines.internal.Symbol("SEALED");
    private static final kotlinx.coroutines.Empty getHighSpeedVideoSizes = new kotlinx.coroutines.Empty(false);
    private static final kotlinx.coroutines.Empty getHighResolutionOutputSizeshNQ4ISI = new kotlinx.coroutines.Empty(true);

    public static final java.lang.Object boxIncomplete(java.lang.Object obj) {
        return obj instanceof kotlinx.coroutines.Incomplete ? new kotlinx.coroutines.IncompleteStateBox((kotlinx.coroutines.Incomplete) obj) : obj;
    }

    public static final java.lang.Object unboxState(java.lang.Object obj) {
        kotlinx.coroutines.Incomplete incomplete;
        kotlinx.coroutines.IncompleteStateBox incompleteStateBox = obj instanceof kotlinx.coroutines.IncompleteStateBox ? (kotlinx.coroutines.IncompleteStateBox) obj : null;
        return (incompleteStateBox == null || (incomplete = incompleteStateBox.getHighSpeedVideoFpsRanges) == null) ? obj : incomplete;
    }
}
