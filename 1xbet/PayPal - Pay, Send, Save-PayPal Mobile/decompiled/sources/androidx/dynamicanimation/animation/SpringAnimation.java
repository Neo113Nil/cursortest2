package androidx.dynamicanimation.animation;

/* loaded from: classes3.dex */
public final class SpringAnimation extends androidx.dynamicanimation.animation.DynamicAnimation<androidx.dynamicanimation.animation.SpringAnimation> {
    private boolean getInputFormats;
    private float getOutputMinFrameDuration;
    private androidx.dynamicanimation.animation.SpringForce getOutputSizes;

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    final void getHighSpeedVideoSizes(float f) {
    }

    public SpringAnimation(androidx.dynamicanimation.animation.FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        this.getOutputSizes = null;
        this.getOutputMinFrameDuration = Float.MAX_VALUE;
        this.getInputFormats = false;
    }

    public <K> SpringAnimation(K k, androidx.dynamicanimation.animation.FloatPropertyCompat<K> floatPropertyCompat) {
        super(k, floatPropertyCompat);
        this.getOutputSizes = null;
        this.getOutputMinFrameDuration = Float.MAX_VALUE;
        this.getInputFormats = false;
    }

    public <K> SpringAnimation(K k, androidx.dynamicanimation.animation.FloatPropertyCompat<K> floatPropertyCompat, float f) {
        super(k, floatPropertyCompat);
        this.getOutputSizes = null;
        this.getOutputMinFrameDuration = Float.MAX_VALUE;
        this.getInputFormats = false;
        this.getOutputSizes = new androidx.dynamicanimation.animation.SpringForce(f);
    }

    public final androidx.dynamicanimation.animation.SpringForce getSpring() {
        return this.getOutputSizes;
    }

    public final androidx.dynamicanimation.animation.SpringAnimation setSpring(androidx.dynamicanimation.animation.SpringForce springForce) {
        this.getOutputSizes = springForce;
        return this;
    }

    public final void animateToFinalPosition(float f) {
        if (isRunning()) {
            this.getOutputMinFrameDuration = f;
            return;
        }
        if (this.getOutputSizes == null) {
            this.getOutputSizes = new androidx.dynamicanimation.animation.SpringForce(f);
        }
        this.getOutputSizes.setFinalPosition(f);
        start();
    }

    public final void skipToEnd() {
        if (!canSkipToEnd()) {
            throw new java.lang.UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new android.util.AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.getHighSpeedVideoFpsRanges) {
            this.getInputFormats = true;
        }
    }

    public final boolean canSkipToEnd() {
        return this.getOutputSizes.getHighResolutionOutputSizeshNQ4ISI > 0.0d;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    final boolean Camera2StreamConfigurationMap(long j) {
        if (this.getInputFormats) {
            float f = this.getOutputMinFrameDuration;
            if (f != Float.MAX_VALUE) {
                this.getOutputSizes.setFinalPosition(f);
                this.getOutputMinFrameDuration = Float.MAX_VALUE;
            }
            this.getHighSpeedVideoSizesFor = this.getOutputSizes.getFinalPosition();
            this.getOutputFormats = 0.0f;
            this.getInputFormats = false;
            return true;
        }
        if (this.getOutputMinFrameDuration != Float.MAX_VALUE) {
            this.getOutputSizes.getFinalPosition();
            long j2 = j / 2;
            androidx.dynamicanimation.animation.DynamicAnimation.MassState highSpeedVideoSizes = this.getOutputSizes.getHighSpeedVideoSizes(this.getHighSpeedVideoSizesFor, this.getOutputFormats, j2);
            this.getOutputSizes.setFinalPosition(this.getOutputMinFrameDuration);
            this.getOutputMinFrameDuration = Float.MAX_VALUE;
            androidx.dynamicanimation.animation.DynamicAnimation.MassState highSpeedVideoSizes2 = this.getOutputSizes.getHighSpeedVideoSizes(highSpeedVideoSizes.getHighSpeedVideoFpsRanges, highSpeedVideoSizes.Camera2StreamConfigurationMap, j2);
            this.getHighSpeedVideoSizesFor = highSpeedVideoSizes2.getHighSpeedVideoFpsRanges;
            this.getOutputFormats = highSpeedVideoSizes2.Camera2StreamConfigurationMap;
        } else {
            androidx.dynamicanimation.animation.DynamicAnimation.MassState highSpeedVideoSizes3 = this.getOutputSizes.getHighSpeedVideoSizes(this.getHighSpeedVideoSizesFor, this.getOutputFormats, j);
            this.getHighSpeedVideoSizesFor = highSpeedVideoSizes3.getHighSpeedVideoFpsRanges;
            this.getOutputFormats = highSpeedVideoSizes3.Camera2StreamConfigurationMap;
        }
        this.getHighSpeedVideoSizesFor = java.lang.Math.max(this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoSizesFor = java.lang.Math.min(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor);
        if (!this.getOutputSizes.isAtEquilibrium(this.getHighSpeedVideoSizesFor, this.getOutputFormats)) {
            return false;
        }
        this.getHighSpeedVideoSizesFor = this.getOutputSizes.getFinalPosition();
        this.getOutputFormats = 0.0f;
        return true;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final void start() {
        androidx.dynamicanimation.animation.SpringForce springForce = this.getOutputSizes;
        if (springForce == null) {
            throw new java.lang.UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double finalPosition = springForce.getFinalPosition();
        if (finalPosition > this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (finalPosition >= this.Camera2StreamConfigurationMap) {
            androidx.dynamicanimation.animation.SpringForce springForce2 = this.getOutputSizes;
            double abs = java.lang.Math.abs(Camera2StreamConfigurationMap());
            springForce2.getHighSpeedVideoFpsRangesFor = abs;
            springForce2.getHighSpeedVideoSizes = abs * 62.5d;
            super.start();
            return;
        }
        throw new java.lang.UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
    }
}
