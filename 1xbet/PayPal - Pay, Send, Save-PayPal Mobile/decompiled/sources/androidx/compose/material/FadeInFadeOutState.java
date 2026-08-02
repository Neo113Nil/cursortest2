package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R$\u0010\u0007\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013\"\u0004\b\u0005\u0010\u0014"}, d2 = {"Landroidx/compose/material/FadeInFadeOutState;", "T", "", "<init>", "()V", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "()Ljava/lang/Object;", "getHighSpeedVideoSizes", "(Ljava/lang/Object;)V", "getHighResolutionOutputSizeshNQ4ISI", "", "Landroidx/compose/material/FadeInFadeOutAnimationItem;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "()Ljava/util/List;", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/RecomposeScope;", "()Landroidx/compose/runtime/RecomposeScope;", "(Landroidx/compose/runtime/RecomposeScope;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FadeInFadeOutState<T> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.runtime.RecomposeScope getHighSpeedVideoFpsRangesFor;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    private java.util.List<androidx.compose.material.FadeInFadeOutAnimationItem<T>> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
    public final java.lang.Object getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void getHighSpeedVideoSizes(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
    }

    public final java.util.List<androidx.compose.material.FadeInFadeOutAnimationItem<T>> getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
    public final androidx.compose.runtime.RecomposeScope getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void Camera2StreamConfigurationMap(androidx.compose.runtime.RecomposeScope recomposeScope) {
        this.getHighSpeedVideoFpsRangesFor = recomposeScope;
    }
}
