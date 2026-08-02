package androidx.constraintlayout.core.parser;

/* loaded from: classes6.dex */
public class CLToken extends androidx.constraintlayout.core.parser.CLElement {
    int Camera2StreamConfigurationMap;
    char[] getHighResolutionOutputSizeshNQ4ISI;
    androidx.constraintlayout.core.parser.CLToken.Type getHighSpeedVideoFpsRanges;
    char[] getHighSpeedVideoFpsRangesFor;
    char[] getHighSpeedVideoSizes;

    enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public boolean getBoolean() throws androidx.constraintlayout.core.parser.CLParsingException {
        if (this.getHighSpeedVideoFpsRanges == androidx.constraintlayout.core.parser.CLToken.Type.TRUE) {
            return true;
        }
        if (this.getHighSpeedVideoFpsRanges == androidx.constraintlayout.core.parser.CLToken.Type.FALSE) {
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("this token is not a boolean: <");
        sb.append(content());
        sb.append(">");
        throw new androidx.constraintlayout.core.parser.CLParsingException(sb.toString(), this);
    }

    public boolean isNull() throws androidx.constraintlayout.core.parser.CLParsingException {
        if (this.getHighSpeedVideoFpsRanges == androidx.constraintlayout.core.parser.CLToken.Type.NULL) {
            return true;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("this token is not a null: <");
        sb.append(content());
        sb.append(">");
        throw new androidx.constraintlayout.core.parser.CLParsingException(sb.toString(), this);
    }

    public CLToken(char[] cArr) {
        super(cArr);
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRanges = androidx.constraintlayout.core.parser.CLToken.Type.UNKNOWN;
        this.getHighSpeedVideoFpsRangesFor = "true".toCharArray();
        this.getHighResolutionOutputSizeshNQ4ISI = "false".toCharArray();
        this.getHighSpeedVideoSizes = "null".toCharArray();
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] cArr) {
        return new androidx.constraintlayout.core.parser.CLToken(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toJSON() {
        if (androidx.constraintlayout.core.parser.CLParser.getHighSpeedVideoSizes) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("<");
            sb.append(content());
            sb.append(">");
            return sb.toString();
        }
        return content();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toFormattedJSON(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        addIndent(sb, i);
        sb.append(content());
        return sb.toString();
    }

    public androidx.constraintlayout.core.parser.CLToken.Type getType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean validate(char c, long j) {
        int ordinal = this.getHighSpeedVideoFpsRanges.ordinal();
        if (ordinal == 0) {
            char[] cArr = this.getHighSpeedVideoFpsRangesFor;
            int i = this.Camera2StreamConfigurationMap;
            if (cArr[i] == c) {
                this.getHighSpeedVideoFpsRanges = androidx.constraintlayout.core.parser.CLToken.Type.TRUE;
            } else if (this.getHighResolutionOutputSizeshNQ4ISI[i] == c) {
                this.getHighSpeedVideoFpsRanges = androidx.constraintlayout.core.parser.CLToken.Type.FALSE;
            } else if (this.getHighSpeedVideoSizes[i] == c) {
                this.getHighSpeedVideoFpsRanges = androidx.constraintlayout.core.parser.CLToken.Type.NULL;
            }
            r2 = true;
        } else if (ordinal == 1) {
            char[] cArr2 = this.getHighSpeedVideoFpsRangesFor;
            int i2 = this.Camera2StreamConfigurationMap;
            r2 = cArr2[i2] == c;
            if (r2) {
                if (i2 + 1 == cArr2.length) {
                    setEnd(j);
                }
                r2 = true;
            }
        } else if (ordinal == 2) {
            char[] cArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i3 = this.Camera2StreamConfigurationMap;
            r2 = cArr3[i3] == c;
            if (r2) {
                if (i3 + 1 == cArr3.length) {
                    setEnd(j);
                }
                r2 = true;
            }
        } else if (ordinal == 3) {
            char[] cArr4 = this.getHighSpeedVideoSizes;
            int i4 = this.Camera2StreamConfigurationMap;
            r2 = cArr4[i4] == c;
            if (r2) {
                if (i4 + 1 == cArr4.length) {
                    setEnd(j);
                }
                r2 = true;
            }
        }
        this.Camera2StreamConfigurationMap++;
        return r2;
    }
}
