package androidx.compose.foundation.content.internal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/foundation/content/internal/ReceiveContentConfigurationImpl;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "Landroidx/compose/foundation/content/ReceiveContentListener;", "p0", "<init>", "(Landroidx/compose/foundation/content/ReceiveContentListener;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/content/ReceiveContentListener;", "getReceiveContentListener", "()Landroidx/compose/foundation/content/ReceiveContentListener;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class ReceiveContentConfigurationImpl extends androidx.compose.foundation.content.internal.ReceiveContentConfiguration {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.content.ReceiveContentListener getHighSpeedVideoFpsRanges;

    public ReceiveContentConfigurationImpl(androidx.compose.foundation.content.ReceiveContentListener receiveContentListener) {
        this.getHighSpeedVideoFpsRanges = receiveContentListener;
    }

    @Override // androidx.compose.foundation.content.internal.ReceiveContentConfiguration
    /* renamed from: getReceiveContentListener, reason: from getter */
    public final androidx.compose.foundation.content.ReceiveContentListener getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReceiveContentConfigurationImpl(getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.foundation.content.internal.ReceiveContentConfigurationImpl) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, ((androidx.compose.foundation.content.internal.ReceiveContentConfigurationImpl) p0).getHighSpeedVideoFpsRanges);
    }
}
