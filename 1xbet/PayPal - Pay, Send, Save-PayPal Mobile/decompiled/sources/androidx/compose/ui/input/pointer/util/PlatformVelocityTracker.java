package androidx.compose.ui.input.pointer.util;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0006H&¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PlatformVelocityTracker;", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "event", "Landroidx/compose/ui/geometry/Offset;", "offset", "", "addPointerInputChange-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V", "addPointerInputChange", "", "timeMillis", com.daon.sdk.face.license.License.FEATURE_POSITION, "addPosition-Uv8p0NA", "(JJ)V", "addPosition", "Landroidx/compose/ui/unit/Velocity;", "maximumVelocity", "calculateVelocity-AH228Gc", "(J)J", "calculateVelocity", "resetTracking", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PlatformVelocityTracker {
    /* renamed from: addPointerInputChange-Uv8p0NA */
    void mo7320addPointerInputChangeUv8p0NA(androidx.compose.ui.input.pointer.PointerInputChange event, long offset);

    /* renamed from: addPosition-Uv8p0NA */
    void mo7321addPositionUv8p0NA(long timeMillis, long position);

    /* renamed from: calculateVelocity-AH228Gc */
    long mo7322calculateVelocityAH228Gc(long maximumVelocity);

    void resetTracking();
}
