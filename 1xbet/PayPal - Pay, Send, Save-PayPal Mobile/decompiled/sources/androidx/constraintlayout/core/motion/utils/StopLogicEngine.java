package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public class StopLogicEngine implements androidx.constraintlayout.core.motion.utils.StopEngine {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizesFor;
    private float getInputFormats;
    private float getInputSizeshNQ4ISI;
    private float getOutputFormats;
    private float getOutputMinFrameDuration;
    private float getOutputMinFrameDurationlomOqCM;
    private float getOutputSizes;
    private float getOutputSizeshNQ4ISI;
    private float getOutputStallDuration;
    private float getOutputStallDurationlomOqCM;
    private java.lang.String getValidOutputFormatsForInputhNQ4ISI;
    private boolean Camera2StreamConfigurationMap = false;
    private boolean getHighSpeedVideoSizes = false;

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public java.lang.String debug(java.lang.String str, float f) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" ===== ");
        sb.append(this.getValidOutputFormatsForInputhNQ4ISI);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append(str);
        sb2.append(this.Camera2StreamConfigurationMap ? "backwards" : "forward ");
        sb2.append(" time = ");
        sb2.append(f);
        sb2.append("  stages ");
        sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.String obj2 = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(obj2);
        sb3.append(str);
        sb3.append(" dur ");
        sb3.append(this.getOutputMinFrameDuration);
        sb3.append(" vel ");
        sb3.append(this.getInputFormats);
        sb3.append(" pos ");
        sb3.append(this.getHighSpeedVideoSizesFor);
        sb3.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.String obj3 = sb3.toString();
        if (this.getHighResolutionOutputSizeshNQ4ISI > 1) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(obj3);
            sb4.append(str);
            sb4.append(" dur ");
            sb4.append(this.getInputSizeshNQ4ISI);
            sb4.append(" vel ");
            sb4.append(this.getOutputMinFrameDurationlomOqCM);
            sb4.append(" pos ");
            sb4.append(this.getOutputFormats);
            sb4.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            obj3 = sb4.toString();
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI > 2) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(obj3);
            sb5.append(str);
            sb5.append(" dur ");
            sb5.append(this.getOutputStallDuration);
            sb5.append(" vel ");
            sb5.append(this.getOutputSizeshNQ4ISI);
            sb5.append(" pos ");
            sb5.append(this.getOutputStallDurationlomOqCM);
            sb5.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            obj3 = sb5.toString();
        }
        float f2 = this.getOutputMinFrameDuration;
        if (f <= f2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(obj3);
            sb6.append(str);
            sb6.append("stage 0\n");
            return sb6.toString();
        }
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 1) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(obj3);
            sb7.append(str);
            sb7.append("end stage 0\n");
            return sb7.toString();
        }
        float f3 = f - f2;
        float f4 = this.getInputSizeshNQ4ISI;
        if (f3 < f4) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(obj3);
            sb8.append(str);
            sb8.append(" stage 1\n");
            return sb8.toString();
        }
        if (i == 2) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(obj3);
            sb9.append(str);
            sb9.append("end stage 1\n");
            return sb9.toString();
        }
        if (f3 - f4 < this.getOutputStallDuration) {
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(obj3);
            sb10.append(str);
            sb10.append(" stage 2\n");
            return sb10.toString();
        }
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
        sb11.append(obj3);
        sb11.append(str);
        sb11.append(" end stage 2\n");
        return sb11.toString();
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f) {
        float f2 = this.getOutputMinFrameDuration;
        if (f <= f2) {
            float f3 = this.getInputFormats;
            return f3 + (((this.getOutputMinFrameDurationlomOqCM - f3) * f) / f2);
        }
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.getInputSizeshNQ4ISI;
        if (f4 < f5) {
            float f6 = this.getOutputMinFrameDurationlomOqCM;
            return f6 + (((this.getOutputSizeshNQ4ISI - f6) * f4) / f5);
        }
        if (i == 2) {
            return 0.0f;
        }
        float f7 = f4 - f5;
        float f8 = this.getOutputStallDuration;
        if (f7 >= f8) {
            return 0.0f;
        }
        float f9 = this.getOutputSizeshNQ4ISI;
        return f9 - ((f7 * f9) / f8);
    }

    public void config(float f, float f2, float f3, float f4, float f5, float f6) {
        this.getHighSpeedVideoSizes = false;
        this.getOutputSizes = f;
        boolean z = f > f2;
        this.Camera2StreamConfigurationMap = z;
        if (z) {
            getHighSpeedVideoFpsRanges(-f3, f - f2, f5, f6, f4);
        } else {
            getHighSpeedVideoFpsRanges(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return this.Camera2StreamConfigurationMap ? -getVelocity(this.getHighSpeedVideoFpsRanges) : getVelocity(this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        return getVelocity() < 1.0E-5f && java.lang.Math.abs(this.getOutputStallDurationlomOqCM - this.getHighSpeedVideoFpsRangesFor) < 1.0E-5f;
    }

    private void getHighSpeedVideoFpsRanges(float f, float f2, float f3, float f4, float f5) {
        this.getHighSpeedVideoSizes = false;
        this.getOutputStallDurationlomOqCM = f2;
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) java.lang.Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (sqrt < f4) {
                this.getValidOutputFormatsForInputhNQ4ISI = "backward accelerate, decelerate";
                this.getHighResolutionOutputSizeshNQ4ISI = 2;
                this.getInputFormats = f;
                this.getOutputMinFrameDurationlomOqCM = sqrt;
                this.getOutputSizeshNQ4ISI = 0.0f;
                float f8 = (sqrt - f) / f3;
                this.getOutputMinFrameDuration = f8;
                this.getInputSizeshNQ4ISI = sqrt / f3;
                this.getHighSpeedVideoSizesFor = ((f + sqrt) * f8) / 2.0f;
                this.getOutputFormats = f2;
                this.getOutputStallDurationlomOqCM = f2;
                return;
            }
            this.getValidOutputFormatsForInputhNQ4ISI = "backward accelerate cruse decelerate";
            this.getHighResolutionOutputSizeshNQ4ISI = 3;
            this.getInputFormats = f;
            this.getOutputMinFrameDurationlomOqCM = f4;
            this.getOutputSizeshNQ4ISI = f4;
            float f9 = (f4 - f) / f3;
            this.getOutputMinFrameDuration = f9;
            float f10 = f4 / f3;
            this.getOutputStallDuration = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.getInputSizeshNQ4ISI = ((f2 - f11) - f12) / f4;
            this.getHighSpeedVideoSizesFor = f11;
            this.getOutputFormats = f2 - f12;
            this.getOutputStallDurationlomOqCM = f2;
            return;
        }
        if (f7 >= f2) {
            this.getValidOutputFormatsForInputhNQ4ISI = "hard stop";
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            this.getInputFormats = f;
            this.getOutputMinFrameDurationlomOqCM = 0.0f;
            this.getHighSpeedVideoSizesFor = f2;
            this.getOutputMinFrameDuration = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.getValidOutputFormatsForInputhNQ4ISI = "cruse decelerate";
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
            this.getInputFormats = f;
            this.getOutputMinFrameDurationlomOqCM = f;
            this.getOutputSizeshNQ4ISI = 0.0f;
            this.getHighSpeedVideoSizesFor = f13;
            this.getOutputFormats = f2;
            this.getOutputMinFrameDuration = f14;
            this.getInputSizeshNQ4ISI = f6;
            return;
        }
        float sqrt2 = (float) java.lang.Math.sqrt((f3 * f2) + ((f * f) / 2.0f));
        float f15 = (sqrt2 - f) / f3;
        this.getOutputMinFrameDuration = f15;
        float f16 = sqrt2 / f3;
        this.getInputSizeshNQ4ISI = f16;
        if (sqrt2 < f4) {
            this.getValidOutputFormatsForInputhNQ4ISI = "accelerate decelerate";
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
            this.getInputFormats = f;
            this.getOutputMinFrameDurationlomOqCM = sqrt2;
            this.getOutputSizeshNQ4ISI = 0.0f;
            this.getOutputMinFrameDuration = f15;
            this.getInputSizeshNQ4ISI = f16;
            this.getHighSpeedVideoSizesFor = ((f + sqrt2) * f15) / 2.0f;
            this.getOutputFormats = f2;
            return;
        }
        this.getValidOutputFormatsForInputhNQ4ISI = "accelerate cruse decelerate";
        this.getHighResolutionOutputSizeshNQ4ISI = 3;
        this.getInputFormats = f;
        this.getOutputMinFrameDurationlomOqCM = f4;
        this.getOutputSizeshNQ4ISI = f4;
        float f17 = (f4 - f) / f3;
        this.getOutputMinFrameDuration = f17;
        float f18 = f4 / f3;
        this.getOutputStallDuration = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.getInputSizeshNQ4ISI = ((f2 - f19) - f20) / f4;
        this.getHighSpeedVideoSizesFor = f19;
        this.getOutputFormats = f2 - f20;
        this.getOutputStallDurationlomOqCM = f2;
    }

    public static class Decelerate implements androidx.constraintlayout.core.motion.utils.StopEngine {
        private float Camera2StreamConfigurationMap;
        private boolean getHighResolutionOutputSizeshNQ4ISI = false;
        private float getHighSpeedVideoFpsRanges;
        private float getHighSpeedVideoFpsRangesFor;
        private float getHighSpeedVideoSizes;
        private float getHighSpeedVideoSizesFor;
        private float getInputFormats;

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public java.lang.String debug(java.lang.String str, float f) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(" ");
            sb.append(this.getInputFormats);
            return sb.toString();
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getVelocity(float f) {
            if (f > this.getHighSpeedVideoFpsRanges) {
                return 0.0f;
            }
            float f2 = this.getHighSpeedVideoSizesFor + (this.getHighSpeedVideoSizes * f);
            this.getInputFormats = f2;
            return f2;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getInterpolation(float f) {
            if (f > this.getHighSpeedVideoFpsRanges) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                return this.getHighSpeedVideoFpsRangesFor;
            }
            getVelocity(f);
            return this.Camera2StreamConfigurationMap + ((this.getHighSpeedVideoSizesFor + ((this.getHighSpeedVideoSizes * f) / 2.0f)) * f);
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getVelocity() {
            return this.getInputFormats;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public boolean isStopped() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public void config(float f, float f2, float f3) {
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            this.getHighSpeedVideoFpsRangesFor = f2;
            this.getHighSpeedVideoSizesFor = f3;
            this.Camera2StreamConfigurationMap = f;
            float f4 = (f2 - f) / (f3 / 2.0f);
            this.getHighSpeedVideoFpsRanges = f4;
            this.getHighSpeedVideoSizes = (-f3) / f4;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        float f2;
        this.getHighSpeedVideoSizes = false;
        float f3 = this.getOutputMinFrameDuration;
        if (f <= f3) {
            float f4 = this.getInputFormats;
            f2 = (f4 * f) + ((((this.getOutputMinFrameDurationlomOqCM - f4) * f) * f) / (f3 * 2.0f));
        } else {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 1) {
                f2 = this.getHighSpeedVideoSizesFor;
            } else {
                float f5 = f - f3;
                float f6 = this.getInputSizeshNQ4ISI;
                if (f5 < f6) {
                    float f7 = this.getHighSpeedVideoSizesFor;
                    float f8 = this.getOutputMinFrameDurationlomOqCM;
                    f2 = f7 + (f8 * f5) + ((((this.getOutputSizeshNQ4ISI - f8) * f5) * f5) / (f6 * 2.0f));
                } else if (i == 2) {
                    f2 = this.getOutputFormats;
                } else {
                    float f9 = f5 - f6;
                    float f10 = this.getOutputStallDuration;
                    if (f9 <= f10) {
                        float f11 = this.getOutputFormats;
                        float f12 = this.getOutputSizeshNQ4ISI * f9;
                        f2 = (f11 + f12) - ((f12 * f9) / (f10 * 2.0f));
                    } else {
                        this.getHighSpeedVideoSizes = true;
                        f2 = this.getOutputStallDurationlomOqCM;
                    }
                }
            }
        }
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getHighSpeedVideoFpsRanges = f;
        return this.Camera2StreamConfigurationMap ? this.getOutputSizes - f2 : this.getOutputSizes + f2;
    }
}
