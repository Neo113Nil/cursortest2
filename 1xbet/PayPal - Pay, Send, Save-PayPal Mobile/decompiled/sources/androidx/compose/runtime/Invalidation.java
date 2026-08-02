package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\f\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\n\u0010\u0014R$\u0010\n\u001a\u0004\u0018\u00010\u00018\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\f\u0010\u0016\"\u0004\b\f\u0010\u0017"}, d2 = {"Landroidx/compose/runtime/Invalidation;", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "p0", "", "p1", "p2", "<init>", "(Landroidx/compose/runtime/RecomposeScopeImpl;ILjava/lang/Object;)V", "", "getHighSpeedVideoSizes", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getHighSpeedVideoFpsRanges", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "()I", "(I)V", "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Invalidation {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.Object getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.RecomposeScopeImpl Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    public Invalidation(androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl, int i, java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = recomposeScopeImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = obj;
    }

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
    public final androidx.compose.runtime.RecomposeScopeImpl getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
    public final int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void getHighSpeedVideoSizes(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    public final java.lang.Object getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
    }

    public final boolean getHighSpeedVideoSizes() {
        return this.Camera2StreamConfigurationMap.isInvalidFor(this.getHighSpeedVideoSizes);
    }
}
