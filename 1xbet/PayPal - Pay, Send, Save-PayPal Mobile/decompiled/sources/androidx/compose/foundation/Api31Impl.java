package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/Api31Impl;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "Landroid/widget/EdgeEffect;", "getHighSpeedVideoSizes", "(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;", "", "p2", "getHighSpeedVideoFpsRangesFor", "(Landroid/widget/EdgeEffect;FF)F", "(Landroid/widget/EdgeEffect;)F"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Api31Impl {
    public static final androidx.compose.foundation.Api31Impl INSTANCE = new androidx.compose.foundation.Api31Impl();

    private Api31Impl() {
    }

    public final android.widget.EdgeEffect getHighSpeedVideoSizes(android.content.Context p0, android.util.AttributeSet p1) {
        try {
            return new android.widget.EdgeEffect(p0, p1);
        } catch (java.lang.Throwable unused) {
            return new android.widget.EdgeEffect(p0);
        }
    }

    public final float getHighSpeedVideoFpsRangesFor(android.widget.EdgeEffect p0, float p1, float p2) {
        try {
            return p0.onPullDistance(p1, p2);
        } catch (java.lang.Throwable unused) {
            p0.onPull(p1, p2);
            return 0.0f;
        }
    }

    public final float getHighSpeedVideoSizes(android.widget.EdgeEffect p0) {
        try {
            return p0.getDistance();
        } catch (java.lang.Throwable unused) {
            return 0.0f;
        }
    }
}
