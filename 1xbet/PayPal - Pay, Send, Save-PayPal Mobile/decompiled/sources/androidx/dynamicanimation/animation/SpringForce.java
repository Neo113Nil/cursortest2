package androidx.dynamicanimation.animation;

/* loaded from: classes3.dex */
public final class SpringForce implements androidx.dynamicanimation.animation.Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    double Camera2StreamConfigurationMap;
    double getHighResolutionOutputSizeshNQ4ISI;
    private double getHighSpeedVideoFpsRanges;
    double getHighSpeedVideoFpsRangesFor;
    double getHighSpeedVideoSizes;
    private double getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private final androidx.dynamicanimation.animation.DynamicAnimation.MassState getInputSizeshNQ4ISI;
    private double getOutputFormats;
    private double getOutputMinFrameDuration;

    public SpringForce() {
        this.Camera2StreamConfigurationMap = java.lang.Math.sqrt(1500.0d);
        this.getHighResolutionOutputSizeshNQ4ISI = 0.5d;
        this.getInputFormats = false;
        this.getOutputFormats = Double.MAX_VALUE;
        this.getInputSizeshNQ4ISI = new androidx.dynamicanimation.animation.DynamicAnimation.MassState();
    }

    public SpringForce(float f) {
        this.Camera2StreamConfigurationMap = java.lang.Math.sqrt(1500.0d);
        this.getHighResolutionOutputSizeshNQ4ISI = 0.5d;
        this.getInputFormats = false;
        this.getOutputFormats = Double.MAX_VALUE;
        this.getInputSizeshNQ4ISI = new androidx.dynamicanimation.animation.DynamicAnimation.MassState();
        this.getOutputFormats = f;
    }

    public final androidx.dynamicanimation.animation.SpringForce setStiffness(float f) {
        if (f <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.Camera2StreamConfigurationMap = java.lang.Math.sqrt(f);
        this.getInputFormats = false;
        return this;
    }

    public final float getStiffness() {
        double d = this.Camera2StreamConfigurationMap;
        return (float) (d * d);
    }

    public final androidx.dynamicanimation.animation.SpringForce setDampingRatio(float f) {
        if (f < 0.0f) {
            throw new java.lang.IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getInputFormats = false;
        return this;
    }

    public final float getDampingRatio() {
        return (float) this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.dynamicanimation.animation.SpringForce setFinalPosition(float f) {
        this.getOutputFormats = f;
        return this;
    }

    public final float getFinalPosition() {
        return (float) this.getOutputFormats;
    }

    public final float getAcceleration(float f, float f2) {
        float finalPosition = getFinalPosition();
        double d = this.Camera2StreamConfigurationMap;
        return (float) (((-(d * d)) * (f - finalPosition)) - (((d * 2.0d) * this.getHighResolutionOutputSizeshNQ4ISI) * f2));
    }

    public final boolean isAtEquilibrium(float f, float f2) {
        return ((double) java.lang.Math.abs(f2)) < this.getHighSpeedVideoSizes && ((double) java.lang.Math.abs(f - getFinalPosition())) < this.getHighSpeedVideoFpsRangesFor;
    }

    private void getHighSpeedVideoFpsRangesFor() {
        if (this.getInputFormats) {
            return;
        }
        if (this.getOutputFormats == Double.MAX_VALUE) {
            throw new java.lang.IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d = this.getHighResolutionOutputSizeshNQ4ISI;
        if (d > 1.0d) {
            double d2 = this.Camera2StreamConfigurationMap;
            this.getOutputMinFrameDuration = ((-d) * d2) + (d2 * java.lang.Math.sqrt((d * d) - 1.0d));
            double d3 = this.getHighResolutionOutputSizeshNQ4ISI;
            double d4 = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizesFor = ((-d3) * d4) - (d4 * java.lang.Math.sqrt((d3 * d3) - 1.0d));
        } else if (d >= 0.0d && d < 1.0d) {
            this.getHighSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap * java.lang.Math.sqrt(1.0d - (d * d));
        }
        this.getInputFormats = true;
    }

    final androidx.dynamicanimation.animation.DynamicAnimation.MassState getHighSpeedVideoSizes(double d, double d2, long j) {
        double pow;
        double cos;
        getHighSpeedVideoFpsRangesFor();
        double d3 = j / 1000.0d;
        double d4 = d - this.getOutputFormats;
        double d5 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (d5 > 1.0d) {
            double d6 = this.getHighSpeedVideoSizesFor;
            double d7 = ((d6 * d4) - d2) / (d6 - this.getOutputMinFrameDuration);
            double d8 = d4 - d7;
            pow = (java.lang.Math.pow(2.718281828459045d, d6 * d3) * d8) + (java.lang.Math.pow(2.718281828459045d, this.getOutputMinFrameDuration * d3) * d7);
            double d9 = this.getHighSpeedVideoSizesFor;
            double pow2 = java.lang.Math.pow(2.718281828459045d, d9 * d3);
            double d10 = this.getOutputMinFrameDuration;
            cos = (d8 * d9 * pow2) + (d7 * d10 * java.lang.Math.pow(2.718281828459045d, d10 * d3));
        } else if (d5 == 1.0d) {
            double d11 = this.Camera2StreamConfigurationMap;
            double d12 = d2 + (d11 * d4);
            double d13 = d4 + (d12 * d3);
            pow = java.lang.Math.pow(2.718281828459045d, (-d11) * d3) * d13;
            double pow3 = java.lang.Math.pow(2.718281828459045d, (-this.Camera2StreamConfigurationMap) * d3);
            double d14 = -this.Camera2StreamConfigurationMap;
            cos = (d13 * pow3 * d14) + (d12 * java.lang.Math.pow(2.718281828459045d, d3 * d14));
        } else {
            double d15 = 1.0d / this.getHighSpeedVideoFpsRanges;
            double d16 = this.Camera2StreamConfigurationMap;
            double d17 = d15 * ((d5 * d16 * d4) + d2);
            pow = java.lang.Math.pow(2.718281828459045d, (-d5) * d16 * d3) * ((java.lang.Math.cos(this.getHighSpeedVideoFpsRanges * d3) * d4) + (java.lang.Math.sin(this.getHighSpeedVideoFpsRanges * d3) * d17));
            double d18 = this.Camera2StreamConfigurationMap;
            double d19 = -d18;
            double d20 = this.getHighResolutionOutputSizeshNQ4ISI;
            double pow4 = java.lang.Math.pow(2.718281828459045d, (-d20) * d18 * d3);
            double d21 = this.getHighSpeedVideoFpsRanges;
            double d22 = -d21;
            double sin = java.lang.Math.sin(d21 * d3);
            double d23 = this.getHighSpeedVideoFpsRanges;
            cos = (d19 * pow * d20) + (((d22 * d4 * sin) + (d17 * d23 * java.lang.Math.cos(d23 * d3))) * pow4);
        }
        this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges = (float) (pow + this.getOutputFormats);
        this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap = (float) cos;
        return this.getInputSizeshNQ4ISI;
    }
}
