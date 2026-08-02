package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028\u0007@AX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0005R\u001a\u0010 \u001a\u00020\u000b8\u0011X\u0091D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001b"}, d2 = {"Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/AnimationVector;", "", "initVal", "<init>", "(F)V", "", "reset$animation_core", "()V", "newVector$animation_core", "()Landroidx/compose/animation/core/AnimationVector1D;", "", "index", "get$animation_core", "(I)F", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "set$animation_core", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getValue", "()F", "setValue$animation_core", io.ktor.http.ContentDisposition.Parameters.Size, com.visa.cbp.getEncExpo.warmup, "getSize$animation_core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimationVector1D extends androidx.compose.animation.core.AnimationVector {
    public static final int $stable = 8;
    private final int size;
    private float value;

    public AnimationVector1D(float f) {
        super(null);
        this.value = f;
        this.size = 1;
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue$animation_core(float f) {
        this.value = f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void reset$animation_core() {
        this.value = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final androidx.compose.animation.core.AnimationVector1D newVector$animation_core() {
        return new androidx.compose.animation.core.AnimationVector1D(0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final float get$animation_core(int index) {
        if (index == 0) {
            return this.value;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void set$animation_core(int index, float value) {
        if (index == 0) {
            this.value = value;
        }
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* renamed from: getSize$animation_core, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AnimationVector1D: value = ");
        sb.append(this.value);
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof androidx.compose.animation.core.AnimationVector1D) && ((androidx.compose.animation.core.AnimationVector1D) other).value == this.value;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.value);
    }
}
