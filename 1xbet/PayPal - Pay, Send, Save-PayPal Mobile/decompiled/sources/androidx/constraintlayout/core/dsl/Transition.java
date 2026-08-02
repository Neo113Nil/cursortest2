package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class Transition {
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoSizes;
    private java.lang.String getOutputFormats;
    private androidx.constraintlayout.core.dsl.OnSwipe getOutputStallDuration = null;
    final int Camera2StreamConfigurationMap = -1;
    private final int getHighSpeedVideoFpsRangesFor = 400;
    private final float getHighSpeedVideoFpsRanges = 0.0f;
    private int getHighSpeedVideoSizesFor = 0;
    private java.lang.String getOutputMinFrameDuration = null;
    private int getInputSizeshNQ4ISI = -1;
    private int getInputFormats = 400;
    private float getOutputStallDurationlomOqCM = 0.0f;
    private androidx.constraintlayout.core.dsl.KeyFrames getOutputMinFrameDurationlomOqCM = new androidx.constraintlayout.core.dsl.KeyFrames();

    public void setOnSwipe(androidx.constraintlayout.core.dsl.OnSwipe onSwipe) {
        this.getOutputStallDuration = onSwipe;
    }

    public void setKeyFrames(androidx.constraintlayout.core.dsl.Keys keys) {
        this.getOutputMinFrameDurationlomOqCM.add(keys);
    }

    public Transition(java.lang.String str, java.lang.String str2) {
        this.getOutputFormats = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizes = null;
        this.getOutputFormats = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
    }

    public Transition(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.getOutputFormats = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizes = null;
        this.getOutputFormats = str;
        this.getHighSpeedVideoSizes = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = str3;
    }

    public void setId(java.lang.String str) {
        this.getOutputFormats = str;
    }

    public void setTo(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    public void setFrom(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public void setDuration(int i) {
        this.getInputFormats = i;
    }

    public void setStagger(float f) {
        this.getOutputStallDurationlomOqCM = f;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getOutputFormats);
        sb.append(":{\nfrom:'");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("',\nto:'");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("',\n");
        java.lang.String obj = sb.toString();
        if (this.getInputFormats != 400) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj);
            sb2.append("duration:");
            sb2.append(this.getInputFormats);
            sb2.append(",\n");
            obj = sb2.toString();
        }
        if (this.getOutputStallDurationlomOqCM != 0.0f) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(obj);
            sb3.append("stagger:");
            sb3.append(this.getOutputStallDurationlomOqCM);
            sb3.append(",\n");
            obj = sb3.toString();
        }
        if (this.getOutputStallDuration != null) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(obj);
            sb4.append(this.getOutputStallDuration.toString());
            obj = sb4.toString();
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        sb5.append(obj);
        sb5.append(this.getOutputMinFrameDurationlomOqCM.toString());
        java.lang.String obj2 = sb5.toString();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(obj2);
        sb6.append("},\n");
        return sb6.toString();
    }

    public java.lang.String getId() {
        return this.getOutputFormats;
    }
}
