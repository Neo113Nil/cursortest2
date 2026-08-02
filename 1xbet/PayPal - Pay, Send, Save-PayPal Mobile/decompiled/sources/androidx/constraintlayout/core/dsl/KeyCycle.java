package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class KeyCycle extends androidx.constraintlayout.core.dsl.KeyAttribute {
    private float Camera2StreamConfigurationMap;
    private float getHighResolutionOutputSizeshNQ4ISI;
    private androidx.constraintlayout.core.dsl.KeyCycle.Wave getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoSizes;

    public enum Wave {
        SIN,
        SQUARE,
        TRIANGLE,
        SAW,
        REVERSE_SAW,
        COS
    }

    public androidx.constraintlayout.core.dsl.KeyCycle.Wave getShape() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setShape(androidx.constraintlayout.core.dsl.KeyCycle.Wave wave) {
        this.getHighSpeedVideoFpsRanges = wave;
    }

    public float getPeriod() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setPeriod(float f) {
        this.Camera2StreamConfigurationMap = f;
    }

    public float getOffset() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setOffset(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    public float getPhase() {
        return this.getHighSpeedVideoSizes;
    }

    public void setPhase(float f) {
        this.getHighSpeedVideoSizes = f;
    }

    @Override // androidx.constraintlayout.core.dsl.KeyAttribute
    protected void attributesToString(java.lang.StringBuilder sb) {
        super.attributesToString(sb);
        if (this.getHighSpeedVideoFpsRanges != null) {
            sb.append("shape:'");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append("',\n");
        }
        append(sb, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PERIOD, this.Camera2StreamConfigurationMap);
        append(sb, "offset", this.getHighResolutionOutputSizeshNQ4ISI);
        append(sb, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PHASE, this.getHighSpeedVideoSizes);
    }
}
