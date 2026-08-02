package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "<init>", "(I)V", "that", "", "plusAssign", "component1", "()I", "copy", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCount", "setCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DeltaCounter {
    public static final int $stable = 8;
    private int count;

    public DeltaCounter(int i) {
        this.count = i;
    }

    public /* synthetic */ DeltaCounter(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void plusAssign(int that) {
        this.count += that;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeltaCounter(count=");
        sb.append(this.count);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.count);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter) && this.count == ((androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter) other).count;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter copy(int count) {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter(count);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public static /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter copy$default(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter deltaCounter, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = deltaCounter.count;
        }
        return deltaCounter.copy(i);
    }

    public DeltaCounter() {
        this(0, 1, null);
    }
}
