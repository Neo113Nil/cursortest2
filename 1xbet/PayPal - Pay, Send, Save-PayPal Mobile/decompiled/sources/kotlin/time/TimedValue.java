package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Lkotlin/time/TimedValue;", "T", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/time/Duration;", "duration", "<init>", "(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/Object;", "component2-UwyO8pc", "()J", "component2", "copy-RFiDyg4", "(Ljava/lang/Object;J)Lkotlin/time/TimedValue;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getValue", "J", "getDuration-UwyO8pc"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TimedValue<T> {
    private final long duration;
    private final T value;

    private TimedValue(T t, long j) {
        this.value = t;
        this.duration = j;
    }

    /* renamed from: getDuration-UwyO8pc, reason: not valid java name */
    public final long m24050getDurationUwyO8pc() {
        return this.duration;
    }

    public final T getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TimedValue(value=");
        sb.append(this.value);
        sb.append(", duration=");
        sb.append((java.lang.Object) kotlin.time.Duration.m23977toStringimpl(this.duration));
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        T t = this.value;
        return ((t == null ? 0 : t.hashCode()) * 31) + kotlin.time.Duration.m23960hashCodeimpl(this.duration);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof kotlin.time.TimedValue)) {
            return false;
        }
        kotlin.time.TimedValue timedValue = (kotlin.time.TimedValue) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.value, timedValue.value) && kotlin.time.Duration.m23947equalsimpl0(this.duration, timedValue.duration);
    }

    /* renamed from: copy-RFiDyg4, reason: not valid java name */
    public final kotlin.time.TimedValue<T> m24049copyRFiDyg4(T value, long duration) {
        return new kotlin.time.TimedValue<>(value, duration, null);
    }

    /* renamed from: component2-UwyO8pc, reason: not valid java name and from getter */
    public final long getDuration() {
        return this.duration;
    }

    public final T component1() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-RFiDyg4$default, reason: not valid java name */
    public static /* synthetic */ kotlin.time.TimedValue m24047copyRFiDyg4$default(kotlin.time.TimedValue timedValue, java.lang.Object obj, long j, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = timedValue.value;
        }
        if ((i & 2) != 0) {
            j = timedValue.duration;
        }
        return timedValue.m24049copyRFiDyg4(obj, j);
    }

    public /* synthetic */ TimedValue(java.lang.Object obj, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j);
    }
}
