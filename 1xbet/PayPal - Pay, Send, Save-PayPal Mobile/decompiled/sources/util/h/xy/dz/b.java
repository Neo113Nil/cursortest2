package util.h.xy.dz;

/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private char getHighSpeedVideoFpsRanges;
    private java.lang.StringBuffer getHighSpeedVideoFpsRangesFor;
    private int getInputSizeshNQ4ISI;

    /* renamed from: ˏ, reason: contains not printable characters */
    public final java.lang.String m26447() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 17) + ((i & 17) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (this.getInputSizeshNQ4ISI == this.getHighResolutionOutputSizeshNQ4ISI.length()) {
            return null;
        }
        int i3 = this.getInputSizeshNQ4ISI;
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i4 = i3 * 339;
        int i5 = ~identityHashCode;
        int i6 = ~((i5 ^ (-2)) | (i5 & (-2)));
        int i7 = ~i3;
        int i8 = ~((i7 ^ 1) | (i7 & 1));
        int i9 = ((((i4 | (-337)) << 1) - (i4 ^ (-337))) - (~(-(-((((i6 & i8) | (i6 ^ i8)) | (~((identityHashCode ^ 1) | (identityHashCode & 1)))) * (-338)))))) - 1;
        int i10 = (~((i3 ^ (-2)) | (i3 & (-2)))) * 338;
        int i11 = i3 | 1;
        int i12 = (i9 ^ i10) + ((i10 & i9) << 1) + (((~((i11 ^ identityHashCode) | (i11 & identityHashCode))) | (~(i5 | (-2)))) * 338);
        this.getHighSpeedVideoFpsRangesFor.setLength(0);
        boolean z = false;
        boolean z2 = false;
        while (i12 != this.getHighResolutionOutputSizeshNQ4ISI.length()) {
            int i13 = Camera2StreamConfigurationMap;
            int i14 = (i13 ^ 99) + ((i13 & 99) << 1);
            getHighSpeedVideoSizes = i14 % 128;
            char charAt = this.getHighResolutionOutputSizeshNQ4ISI.charAt(i12);
            if (i14 % 2 == 0 ? charAt == '\"' : charAt == '\n') {
                if (!z) {
                    int i15 = Camera2StreamConfigurationMap;
                    int i16 = i15 + 67;
                    getHighSpeedVideoSizes = i16 % 128;
                    if (i16 % 2 != 0) {
                        throw null;
                    }
                    if (z2) {
                        z2 = false;
                    } else {
                        int i17 = ((i15 | 79) << 1) - (i15 ^ 79);
                        int i18 = i17 % 128;
                        getHighSpeedVideoSizes = i18;
                        z2 = i17 % 2 == 0;
                        int i19 = (i18 ^ 37) + ((i18 & 37) << 1);
                        Camera2StreamConfigurationMap = i19 % 128;
                        if (i19 % 2 == 0) {
                            int i20 = 3 / 3;
                        }
                    }
                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 111) % 128;
                }
                this.getHighSpeedVideoFpsRangesFor.append(charAt);
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 23) % 128;
            } else if (z || z2) {
                this.getHighSpeedVideoFpsRangesFor.append(charAt);
            } else {
                if (charAt != '\\') {
                    if (charAt == this.getHighSpeedVideoFpsRanges) {
                        break;
                    }
                    this.getHighSpeedVideoFpsRangesFor.append(charAt);
                } else {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 9) % 128;
                    this.getHighSpeedVideoFpsRangesFor.append(charAt);
                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 55) % 128;
                    z = true;
                }
                i12 = ((i12 & 1) << 1) + (i12 ^ 1);
                int i21 = getHighSpeedVideoSizes;
                Camera2StreamConfigurationMap = ((i21 & 69) + (i21 | 69)) % 128;
            }
            z = false;
            i12 = ((i12 & 1) << 1) + (i12 ^ 1);
            int i212 = getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = ((i212 & 69) + (i212 | 69)) % 128;
        }
        this.getInputSizeshNQ4ISI = i12;
        return this.getHighSpeedVideoFpsRangesFor.toString();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean m26446() {
        boolean z;
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 79) % 128;
        if (this.getInputSizeshNQ4ISI != this.getHighResolutionOutputSizeshNQ4ISI.length()) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 85) % 128;
            z = true;
        } else {
            z = false;
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 71) % 128;
        return z;
    }

    public b(java.lang.String str, char c) {
        this.getHighSpeedVideoFpsRangesFor = new java.lang.StringBuffer();
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getInputSizeshNQ4ISI = -1;
        this.getHighSpeedVideoFpsRanges = c;
    }

    public b(java.lang.String str) {
        this(str, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
    }
}
