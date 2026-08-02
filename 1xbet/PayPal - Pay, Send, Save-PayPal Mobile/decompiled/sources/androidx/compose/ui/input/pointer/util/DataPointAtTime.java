package androidx.compose.ui.input.pointer.util;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "", "", "time", "", "dataPoint", "<init>", "(JF)V", "component1", "()J", "component2", "()F", "copy", "(JF)Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getTime", "setTime", "(J)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDataPoint", "setDataPoint", "(F)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DataPointAtTime {
    public static final int $stable = 8;
    private float dataPoint;
    private long time;

    public DataPointAtTime(long j, float f) {
        this.time = j;
        this.dataPoint = f;
    }

    public final float getDataPoint() {
        return this.dataPoint;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setDataPoint(float f) {
        this.dataPoint = f;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataPointAtTime(time=");
        sb.append(this.time);
        sb.append(", dataPoint=");
        sb.append(this.dataPoint);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Long.hashCode(this.time) * 31) + java.lang.Float.hashCode(this.dataPoint);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.input.pointer.util.DataPointAtTime)) {
            return false;
        }
        androidx.compose.ui.input.pointer.util.DataPointAtTime dataPointAtTime = (androidx.compose.ui.input.pointer.util.DataPointAtTime) other;
        return this.time == dataPointAtTime.time && java.lang.Float.compare(this.dataPoint, dataPointAtTime.dataPoint) == 0;
    }

    public final androidx.compose.ui.input.pointer.util.DataPointAtTime copy(long time, float dataPoint) {
        return new androidx.compose.ui.input.pointer.util.DataPointAtTime(time, dataPoint);
    }

    /* renamed from: component2, reason: from getter */
    public final float getDataPoint() {
        return this.dataPoint;
    }

    /* renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public static /* synthetic */ androidx.compose.ui.input.pointer.util.DataPointAtTime copy$default(androidx.compose.ui.input.pointer.util.DataPointAtTime dataPointAtTime, long j, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = dataPointAtTime.time;
        }
        if ((i & 2) != 0) {
            f = dataPointAtTime.dataPoint;
        }
        return dataPointAtTime.copy(j, f);
    }
}
