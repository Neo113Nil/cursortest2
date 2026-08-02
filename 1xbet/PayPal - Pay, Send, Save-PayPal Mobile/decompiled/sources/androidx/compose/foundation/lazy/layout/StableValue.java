package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00028\u00008\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f\u0088\u0001\u0011\u0092\u0001\u00028\u0000"}, d2 = {"Landroidx/compose/foundation/lazy/layout/StableValue;", "T", "", "p0", "getHighSpeedVideoFpsRanges", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
final class StableValue<T> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final T getHighSpeedVideoFpsRangesFor;

    public static <T> java.lang.Object getHighSpeedVideoFpsRanges(T t) {
        return t;
    }

    /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
    private /* synthetic */ java.lang.Object getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        return getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object p0) {
        return getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, p0);
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StableValue(value=");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    private static boolean getHighSpeedVideoFpsRangesFor(java.lang.Object obj, java.lang.Object obj2) {
        return (obj2 instanceof androidx.compose.foundation.lazy.layout.StableValue) && kotlin.jvm.internal.Intrinsics.areEqual(obj, ((androidx.compose.foundation.lazy.layout.StableValue) obj2).getGetHighSpeedVideoFpsRangesFor());
    }
}
