package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class KeyCycles extends androidx.constraintlayout.core.dsl.KeyAttributes {
    private float[] Camera2StreamConfigurationMap;
    private float[] getHighResolutionOutputSizeshNQ4ISI;
    private float[] getHighSpeedVideoFpsRanges;
    private androidx.constraintlayout.core.dsl.KeyCycles.Wave getHighSpeedVideoSizes;

    public enum Wave {
        SIN,
        SQUARE,
        TRIANGLE,
        SAW,
        REVERSE_SAW,
        COS
    }

    public androidx.constraintlayout.core.dsl.KeyCycles.Wave getWaveShape() {
        return this.getHighSpeedVideoSizes;
    }

    public void setWaveShape(androidx.constraintlayout.core.dsl.KeyCycles.Wave wave) {
        this.getHighSpeedVideoSizes = wave;
    }

    public float[] getWavePeriod() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setWavePeriod(float... fArr) {
        this.getHighSpeedVideoFpsRanges = fArr;
    }

    public float[] getWaveOffset() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setWaveOffset(float... fArr) {
        this.Camera2StreamConfigurationMap = fArr;
    }

    public float[] getWavePhase() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setWavePhase(float... fArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = fArr;
    }

    @Override // androidx.constraintlayout.core.dsl.KeyAttributes
    protected void attributesToString(java.lang.StringBuilder sb) {
        super.attributesToString(sb);
        if (this.getHighSpeedVideoSizes != null) {
            sb.append("shape:'");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append("',\n");
        }
        append(sb, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PERIOD, this.getHighSpeedVideoFpsRanges);
        append(sb, "offset", this.Camera2StreamConfigurationMap);
        append(sb, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PHASE, this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
