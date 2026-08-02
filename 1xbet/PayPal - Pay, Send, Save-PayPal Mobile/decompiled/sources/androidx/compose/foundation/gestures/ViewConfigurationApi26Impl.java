package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Landroidx/compose/foundation/gestures/ViewConfigurationApi26Impl;", "", "<init>", "()V", "Landroid/view/ViewConfiguration;", "p0", "", "getHighSpeedVideoFpsRanges", "(Landroid/view/ViewConfiguration;)F", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ViewConfigurationApi26Impl {
    public static final androidx.compose.foundation.gestures.ViewConfigurationApi26Impl INSTANCE = new androidx.compose.foundation.gestures.ViewConfigurationApi26Impl();

    private ViewConfigurationApi26Impl() {
    }

    public final float getHighSpeedVideoFpsRanges(android.view.ViewConfiguration p0) {
        return p0.getScaledVerticalScrollFactor();
    }

    public final float getHighResolutionOutputSizeshNQ4ISI(android.view.ViewConfiguration p0) {
        return p0.getScaledHorizontalScrollFactor();
    }
}
