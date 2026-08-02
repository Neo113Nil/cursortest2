package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012"}, d2 = {"Landroidx/compose/ui/platform/AndroidViewConfiguration;", "Landroidx/compose/ui/platform/ViewConfiguration;", "Landroid/view/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroid/view/ViewConfiguration;)V", "getHighSpeedVideoFpsRangesFor", "Landroid/view/ViewConfiguration;", "", "getLongPressTimeoutMillis", "()J", "longPressTimeoutMillis", "getDoubleTapTimeoutMillis", "doubleTapTimeoutMillis", "getDoubleTapMinTimeMillis", "doubleTapMinTimeMillis", "", "getTouchSlop", "()F", "touchSlop", "getHandwritingSlop", "handwritingSlop", "getMaximumFlingVelocity", "maximumFlingVelocity", "getMinimumFlingVelocity", "minimumFlingVelocity", "getHandwritingGestureLineMargin", "handwritingGestureLineMargin"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidViewConfiguration implements androidx.compose.ui.platform.ViewConfiguration {
    public static final int $stable = 8;
    private final android.view.ViewConfiguration getHighSpeedVideoFpsRangesFor;

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final long getDoubleTapMinTimeMillis() {
        return 40L;
    }

    public AndroidViewConfiguration(android.view.ViewConfiguration viewConfiguration) {
        this.getHighSpeedVideoFpsRangesFor = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final long getLongPressTimeoutMillis() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final long getDoubleTapTimeoutMillis() {
        return android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final float getTouchSlop() {
        return this.getHighSpeedVideoFpsRangesFor.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final float getHandwritingSlop() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.compose.ui.platform.AndroidViewConfigurationApi34.INSTANCE.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor);
        }
        return super.getHandwritingSlop();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final float getMaximumFlingVelocity() {
        return this.getHighSpeedVideoFpsRangesFor.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final float getMinimumFlingVelocity() {
        return this.getHighSpeedVideoFpsRangesFor.getScaledMinimumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final float getHandwritingGestureLineMargin() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.compose.ui.platform.AndroidViewConfigurationApi34.INSTANCE.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
        }
        return super.getHandwritingGestureLineMargin();
    }
}
