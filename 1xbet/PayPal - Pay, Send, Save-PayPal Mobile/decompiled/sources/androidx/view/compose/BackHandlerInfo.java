package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/activity/compose/BackHandlerInfo;", "Landroidx/navigationevent/NavigationEventInfo;", "", "p0", "", "p1", "<init>", "(Ljava/lang/Object;J)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "getHighSpeedVideoSizes", "J"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* data */ class BackHandlerInfo extends androidx.view.NavigationEventInfo {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    public BackHandlerInfo(java.lang.Object obj, long j) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BackHandlerInfo(getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoSizes.hashCode() * 31) + java.lang.Long.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.view.compose.BackHandlerInfo)) {
            return false;
        }
        androidx.view.compose.BackHandlerInfo backHandlerInfo = (androidx.view.compose.BackHandlerInfo) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, backHandlerInfo.getHighSpeedVideoSizes) && this.getHighResolutionOutputSizeshNQ4ISI == backHandlerInfo.getHighResolutionOutputSizeshNQ4ISI;
    }
}
