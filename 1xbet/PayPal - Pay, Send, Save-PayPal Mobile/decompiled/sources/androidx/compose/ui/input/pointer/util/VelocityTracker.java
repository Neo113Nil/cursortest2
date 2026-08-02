package androidx.compose.ui.input.pointer.util;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0003R\u001a\u0010\u0015\u001a\u00020\u00148\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "", "<init>", "()V", "", "timeMillis", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "addPosition-Uv8p0NA", "(JJ)V", "addPosition", "Landroidx/compose/ui/unit/Velocity;", "calculateVelocity-9UxMQ8M", "()J", "calculateVelocity", "maximumVelocity", "calculateVelocity-AH228Gc", "(J)J", "resetTracking", "Landroidx/compose/ui/input/pointer/util/PlatformVelocityTracker;", "platformVelocityTracker", "Landroidx/compose/ui/input/pointer/util/PlatformVelocityTracker;", "getPlatformVelocityTracker$ui", "()Landroidx/compose/ui/input/pointer/util/PlatformVelocityTracker;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VelocityTracker {
    public static final int $stable = 8;
    private final androidx.compose.ui.input.pointer.util.PlatformVelocityTracker platformVelocityTracker = androidx.compose.ui.input.pointer.util.PlatformVelocityTracker_androidKt.PlatformVelocityTracker();

    /* renamed from: getPlatformVelocityTracker$ui, reason: from getter */
    public final androidx.compose.ui.input.pointer.util.PlatformVelocityTracker getPlatformVelocityTracker() {
        return this.platformVelocityTracker;
    }

    /* renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m7330addPositionUv8p0NA(long timeMillis, long position) {
        this.platformVelocityTracker.mo7321addPositionUv8p0NA(timeMillis, position);
    }

    /* renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m7331calculateVelocity9UxMQ8M() {
        return m7332calculateVelocityAH228Gc(androidx.compose.ui.unit.VelocityKt.Velocity(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    /* renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public final long m7332calculateVelocityAH228Gc(long maximumVelocity) {
        return this.platformVelocityTracker.mo7322calculateVelocityAH228Gc(maximumVelocity);
    }

    public final void resetTracking() {
        this.platformVelocityTracker.resetTracking();
    }
}
