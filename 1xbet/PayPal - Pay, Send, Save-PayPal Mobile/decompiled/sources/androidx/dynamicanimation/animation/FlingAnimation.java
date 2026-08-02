package androidx.dynamicanimation.animation;

/* loaded from: classes7.dex */
public final class FlingAnimation extends androidx.dynamicanimation.animation.DynamicAnimation<androidx.dynamicanimation.animation.FlingAnimation> {
    private final androidx.dynamicanimation.animation.FlingAnimation.DragForce getOutputMinFrameDuration;

    public FlingAnimation(androidx.dynamicanimation.animation.FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        androidx.dynamicanimation.animation.FlingAnimation.DragForce dragForce = new androidx.dynamicanimation.animation.FlingAnimation.DragForce();
        this.getOutputMinFrameDuration = dragForce;
        dragForce.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap() * 62.5f;
    }

    public <K> FlingAnimation(K k, androidx.dynamicanimation.animation.FloatPropertyCompat<K> floatPropertyCompat) {
        super(k, floatPropertyCompat);
        androidx.dynamicanimation.animation.FlingAnimation.DragForce dragForce = new androidx.dynamicanimation.animation.FlingAnimation.DragForce();
        this.getOutputMinFrameDuration = dragForce;
        dragForce.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap() * 62.5f;
    }

    public final androidx.dynamicanimation.animation.FlingAnimation setFriction(float f) {
        if (f <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Friction must be positive");
        }
        this.getOutputMinFrameDuration.getHighSpeedVideoSizes = f * (-4.2f);
        return this;
    }

    public final float getFriction() {
        return this.getOutputMinFrameDuration.getHighSpeedVideoSizes / (-4.2f);
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final androidx.dynamicanimation.animation.FlingAnimation setMinValue(float f) {
        super.setMinValue(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final androidx.dynamicanimation.animation.FlingAnimation setMaxValue(float f) {
        super.setMaxValue(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final androidx.dynamicanimation.animation.FlingAnimation setStartVelocity(float f) {
        super.setStartVelocity(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    final boolean Camera2StreamConfigurationMap(long j) {
        androidx.dynamicanimation.animation.FlingAnimation.DragForce dragForce = this.getOutputMinFrameDuration;
        float f = this.getHighSpeedVideoSizesFor;
        float f2 = this.getOutputFormats;
        float f3 = j;
        dragForce.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap = (float) (f2 * java.lang.Math.exp((f3 / 1000.0f) * dragForce.getHighSpeedVideoSizes));
        dragForce.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges = (float) ((f - r2) + ((f2 / dragForce.getHighSpeedVideoSizes) * java.lang.Math.exp((r4 * f3) / 1000.0f)));
        float f4 = dragForce.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
        if (java.lang.Math.abs(dragForce.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap) < dragForce.Camera2StreamConfigurationMap) {
            dragForce.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap = 0.0f;
        }
        androidx.dynamicanimation.animation.DynamicAnimation.MassState massState = dragForce.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizesFor = massState.getHighSpeedVideoFpsRanges;
        this.getOutputFormats = massState.Camera2StreamConfigurationMap;
        if (this.getHighSpeedVideoSizesFor < this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoSizesFor = this.Camera2StreamConfigurationMap;
            return true;
        }
        if (this.getHighSpeedVideoSizesFor > this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoSizesFor = this.getHighSpeedVideoFpsRangesFor;
            return true;
        }
        float f5 = this.getHighSpeedVideoSizesFor;
        float f6 = this.getOutputFormats;
        if (f5 < this.getHighSpeedVideoFpsRangesFor && f5 > this.Camera2StreamConfigurationMap) {
            if (java.lang.Math.abs(f6) >= this.getOutputMinFrameDuration.Camera2StreamConfigurationMap) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    final void getHighSpeedVideoSizes(float f) {
        this.getOutputMinFrameDuration.Camera2StreamConfigurationMap = f * 62.5f;
    }

    static final class DragForce implements androidx.dynamicanimation.animation.Force {
        float Camera2StreamConfigurationMap;
        float getHighSpeedVideoSizes = -4.2f;
        final androidx.dynamicanimation.animation.DynamicAnimation.MassState getHighSpeedVideoFpsRanges = new androidx.dynamicanimation.animation.DynamicAnimation.MassState();

        DragForce() {
        }
    }
}
