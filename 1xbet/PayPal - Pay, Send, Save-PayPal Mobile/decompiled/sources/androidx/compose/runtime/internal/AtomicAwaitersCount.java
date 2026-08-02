package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083@\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u000b"}, d2 = {"Landroidx/compose/runtime/internal/AtomicAwaitersCount;", "", "getHighSpeedVideoSizes", "()Landroidx/compose/runtime/internal/AtomicInt;", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/runtime/internal/AtomicInt;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/internal/AtomicInt;", "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
final class AtomicAwaitersCount {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.internal.AtomicInt getHighSpeedVideoSizes;

    public static final /* synthetic */ int getHighSpeedVideoSizes(int i) {
        return (i & 15) << 27;
    }

    public static androidx.compose.runtime.internal.AtomicInt getHighSpeedVideoSizes() {
        return new androidx.compose.runtime.internal.AtomicInt(0);
    }

    public final java.lang.String toString() {
        int i = this.getHighSpeedVideoSizes.get();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AtomicAwaitersCount(version = ");
        sb.append((i >>> 27) & 15);
        sb.append(", count = ");
        sb.append(i & 134217727);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object p0) {
        return (p0 instanceof androidx.compose.runtime.internal.AtomicAwaitersCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((androidx.compose.runtime.internal.AtomicAwaitersCount) p0).getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }
}
