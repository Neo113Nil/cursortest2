package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
class LayoutState {
    boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    boolean getHighSpeedVideoSizesFor;
    int getOutputMinFrameDuration;
    boolean getInputFormats = true;
    int getInputSizeshNQ4ISI = 0;
    int Camera2StreamConfigurationMap = 0;

    LayoutState() {
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LayoutState{mAvailable=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", mCurrentPosition=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", mItemDirection=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", mLayoutDirection=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", mStartLine=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", mEndLine=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
