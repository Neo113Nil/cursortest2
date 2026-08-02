package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes6.dex */
public interface AeFpsRangeQuirk extends androidx.camera.core.impl.Quirk {
    default android.util.Range<java.lang.Integer> getTargetAeFpsRange() {
        return androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
    }
}
