package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/compose/ui/graphics/SolidColor;", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/graphics/Interpolatable;", "Landroidx/compose/ui/graphics/Color;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/graphics/Paint;", "p", "", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "t", "lerp", "(Ljava/lang/Object;F)Ljava/lang/Object;", "J", "getValue-0d7_KjU", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SolidColor extends androidx.compose.ui.graphics.Brush implements androidx.compose.ui.graphics.Interpolatable {
    public static final int $stable = 0;
    private final long value;

    private SolidColor(long j) {
        super(null);
        this.value = j;
    }

    /* renamed from: getValue-0d7_KjU, reason: not valid java name and from getter */
    public final long getValue() {
        return this.value;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo5941applyToPq9zytI(long size, androidx.compose.ui.graphics.Paint p, float alpha) {
        long m5995copywmQWz5c$default;
        p.setAlpha(1.0f);
        if (alpha != 1.0f) {
            long j = this.value;
            m5995copywmQWz5c$default = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(j, androidx.compose.ui.graphics.Color.m5998getAlphaimpl(j) * alpha, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            m5995copywmQWz5c$default = this.value;
        }
        p.mo5873setColor8_81llA(m5995copywmQWz5c$default);
        if (p.getShader() != null) {
            p.setShader(null);
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.graphics.SolidColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.value, ((androidx.compose.ui.graphics.SolidColor) other).value);
    }

    public final int hashCode() {
        return androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.value);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SolidColor(value=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.value));
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.graphics.Interpolatable
    public final java.lang.Object lerp(java.lang.Object other, float t) {
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        if (other == null) {
            other = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), defaultConstructorMarker);
        }
        if (other instanceof androidx.compose.ui.graphics.SolidColor) {
            return new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.ColorKt.m6046lerpjxsXWHM(this.value, ((androidx.compose.ui.graphics.SolidColor) other).value, t), defaultConstructorMarker);
        }
        return null;
    }

    public /* synthetic */ SolidColor(long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }
}
