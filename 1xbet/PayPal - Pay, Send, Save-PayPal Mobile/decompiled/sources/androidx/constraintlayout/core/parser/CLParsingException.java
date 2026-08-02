package androidx.constraintlayout.core.parser;

/* loaded from: classes6.dex */
public class CLParsingException extends java.lang.Exception {
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoSizes;

    public CLParsingException(java.lang.String str, androidx.constraintlayout.core.parser.CLElement cLElement) {
        super(str);
        this.getHighSpeedVideoSizes = str;
        if (cLElement != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = cLElement.getStrClass();
            this.getHighSpeedVideoFpsRanges = cLElement.getLine();
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = "unknown";
            this.getHighSpeedVideoFpsRanges = 0;
        }
    }

    public java.lang.String reason() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(" (");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(" at line ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(")");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CLParsingException (");
        sb.append(hashCode());
        sb.append(") : ");
        sb.append(reason());
        return sb.toString();
    }
}
