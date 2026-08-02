package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0007@AX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R*\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R*\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001a\u0010*\u001a\u00020\u000e8\u0011X\u0091D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u001e"}, d2 = {"Landroidx/compose/animation/core/AnimationVector4D;", "Landroidx/compose/animation/core/AnimationVector;", "", "v1", "v2", "v3", "v4", "<init>", "(FFFF)V", "", "reset$animation_core", "()V", "newVector$animation_core", "()Landroidx/compose/animation/core/AnimationVector4D;", "", "index", "get$animation_core", "(I)F", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "set$animation_core", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getV1", "()F", "setV1$animation_core", "(F)V", "getV2", "setV2$animation_core", "getV3", "setV3$animation_core", "getV4", "setV4$animation_core", io.ktor.http.ContentDisposition.Parameters.Size, com.visa.cbp.getEncExpo.warmup, "getSize$animation_core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimationVector4D extends androidx.compose.animation.core.AnimationVector {
    public static final int $stable = 8;
    private final int size;
    private float v1;
    private float v2;
    private float v3;
    private float v4;

    public AnimationVector4D(float f, float f2, float f3, float f4) {
        super(null);
        this.v1 = f;
        this.v2 = f2;
        this.v3 = f3;
        this.v4 = f4;
        this.size = 4;
    }

    public final float getV1() {
        return this.v1;
    }

    public final void setV1$animation_core(float f) {
        this.v1 = f;
    }

    public final float getV2() {
        return this.v2;
    }

    public final void setV2$animation_core(float f) {
        this.v2 = f;
    }

    public final float getV3() {
        return this.v3;
    }

    public final void setV3$animation_core(float f) {
        this.v3 = f;
    }

    public final float getV4() {
        return this.v4;
    }

    public final void setV4$animation_core(float f) {
        this.v4 = f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void reset$animation_core() {
        this.v1 = 0.0f;
        this.v2 = 0.0f;
        this.v3 = 0.0f;
        this.v4 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final androidx.compose.animation.core.AnimationVector4D newVector$animation_core() {
        return new androidx.compose.animation.core.AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final float get$animation_core(int index) {
        if (index == 0) {
            return this.v1;
        }
        if (index == 1) {
            return this.v2;
        }
        if (index == 2) {
            return this.v3;
        }
        if (index != 3) {
            return 0.0f;
        }
        return this.v4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void set$animation_core(int index, float value) {
        if (index == 0) {
            this.v1 = value;
            return;
        }
        if (index == 1) {
            this.v2 = value;
        } else if (index == 2) {
            this.v3 = value;
        } else {
            if (index != 3) {
                return;
            }
            this.v4 = value;
        }
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* renamed from: getSize$animation_core, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AnimationVector4D: v1 = ");
        sb.append(this.v1);
        sb.append(", v2 = ");
        sb.append(this.v2);
        sb.append(", v3 = ");
        sb.append(this.v3);
        sb.append(", v4 = ");
        sb.append(this.v4);
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.compose.animation.core.AnimationVector4D)) {
            return false;
        }
        androidx.compose.animation.core.AnimationVector4D animationVector4D = (androidx.compose.animation.core.AnimationVector4D) other;
        return animationVector4D.v1 == this.v1 && animationVector4D.v2 == this.v2 && animationVector4D.v3 == this.v3 && animationVector4D.v4 == this.v4;
    }

    public final int hashCode() {
        return (((((java.lang.Float.hashCode(this.v1) * 31) + java.lang.Float.hashCode(this.v2)) * 31) + java.lang.Float.hashCode(this.v3)) * 31) + java.lang.Float.hashCode(this.v4);
    }
}
