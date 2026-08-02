package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\rJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/ui/graphics/Interval;", "T", "", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(FFLjava/lang/Object;)V", "other", "", "overlaps", "(Landroidx/compose/ui/graphics/Interval;)Z", "(FF)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "contains", "(F)Z", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getStart", "()F", "getEnd", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class Interval<T> {
    public static final int $stable = 0;
    private final T data;
    private final float end;
    private final float start;

    public Interval(float f, float f2, T t) {
        this.start = f;
        this.end = f2;
        this.data = t;
    }

    public /* synthetic */ Interval(float f, float f2, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, (i & 4) != 0 ? null : obj);
    }

    public final T getData() {
        return this.data;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getStart() {
        return this.start;
    }

    public final boolean overlaps(androidx.compose.ui.graphics.Interval<T> other) {
        return this.start <= other.end && this.end >= other.start;
    }

    public final boolean overlaps(float start, float end) {
        return this.start <= end && this.end >= start;
    }

    public final boolean contains(float value) {
        return value <= this.end && this.start <= value;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && getClass() == other.getClass()) {
            androidx.compose.ui.graphics.Interval interval = (androidx.compose.ui.graphics.Interval) other;
            return this.start == interval.start && this.end == interval.end && kotlin.jvm.internal.Intrinsics.areEqual(this.data, interval.data);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = java.lang.Float.hashCode(this.start);
        int hashCode2 = java.lang.Float.hashCode(this.end);
        T t = this.data;
        return (((hashCode * 31) + hashCode2) * 31) + (t != null ? t.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Interval(start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(')');
        return sb.toString();
    }
}
