package androidx.core.text;

/* loaded from: classes7.dex */
public final class BidiFormatter {
    private static final java.lang.String Camera2StreamConfigurationMap;
    static final androidx.core.text.BidiFormatter getHighResolutionOutputSizeshNQ4ISI;
    static final androidx.core.text.BidiFormatter getHighSpeedVideoFpsRanges;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    static final androidx.core.text.TextDirectionHeuristicCompat getHighSpeedVideoSizes;
    private final int getHighSpeedVideoSizesFor;
    private final androidx.core.text.TextDirectionHeuristicCompat getInputFormats;
    private final boolean getOutputFormats;

    static {
        androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat = androidx.core.text.TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        getHighSpeedVideoSizes = textDirectionHeuristicCompat;
        getHighSpeedVideoFpsRangesFor = java.lang.Character.toString((char) 8206);
        Camera2StreamConfigurationMap = java.lang.Character.toString((char) 8207);
        getHighResolutionOutputSizeshNQ4ISI = new androidx.core.text.BidiFormatter(false, 2, textDirectionHeuristicCompat);
        getHighSpeedVideoFpsRanges = new androidx.core.text.BidiFormatter(true, 2, textDirectionHeuristicCompat);
    }

    public static final class Builder {
        private androidx.core.text.TextDirectionHeuristicCompat getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;

        public Builder() {
            this.getHighSpeedVideoFpsRangesFor = androidx.core.text.BidiFormatter.Camera2StreamConfigurationMap(java.util.Locale.getDefault());
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.text.BidiFormatter.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = 2;
        }

        public Builder(boolean z) {
            this.getHighSpeedVideoFpsRangesFor = z;
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.text.BidiFormatter.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = 2;
        }

        public Builder(java.util.Locale locale) {
            this.getHighSpeedVideoFpsRangesFor = androidx.core.text.BidiFormatter.Camera2StreamConfigurationMap(locale);
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.text.BidiFormatter.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = 2;
        }

        public final androidx.core.text.BidiFormatter.Builder stereoReset(boolean z) {
            if (z) {
                this.getHighSpeedVideoSizes |= 2;
                return this;
            }
            this.getHighSpeedVideoSizes &= -3;
            return this;
        }

        public final androidx.core.text.BidiFormatter.Builder setTextDirectionHeuristic(androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
            this.getHighResolutionOutputSizeshNQ4ISI = textDirectionHeuristicCompat;
            return this;
        }

        public final androidx.core.text.BidiFormatter build() {
            if (this.getHighSpeedVideoSizes == 2 && this.getHighResolutionOutputSizeshNQ4ISI == androidx.core.text.BidiFormatter.getHighSpeedVideoSizes) {
                return this.getHighSpeedVideoFpsRangesFor ? androidx.core.text.BidiFormatter.getHighSpeedVideoFpsRanges : androidx.core.text.BidiFormatter.getHighResolutionOutputSizeshNQ4ISI;
            }
            return new androidx.core.text.BidiFormatter(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    public static androidx.core.text.BidiFormatter getInstance() {
        return new androidx.core.text.BidiFormatter.Builder().build();
    }

    public static androidx.core.text.BidiFormatter getInstance(boolean z) {
        return new androidx.core.text.BidiFormatter.Builder(z).build();
    }

    public static androidx.core.text.BidiFormatter getInstance(java.util.Locale locale) {
        return new androidx.core.text.BidiFormatter.Builder(locale).build();
    }

    BidiFormatter(boolean z, int i, androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        this.getOutputFormats = z;
        this.getHighSpeedVideoSizesFor = i;
        this.getInputFormats = textDirectionHeuristicCompat;
    }

    public final boolean isRtlContext() {
        return this.getOutputFormats;
    }

    public final boolean getStereoReset() {
        return (this.getHighSpeedVideoSizesFor & 2) != 0;
    }

    public final boolean isRtl(java.lang.String str) {
        return isRtl((java.lang.CharSequence) str);
    }

    public final boolean isRtl(java.lang.CharSequence charSequence) {
        return this.getInputFormats.isRtl(charSequence, 0, charSequence.length());
    }

    public final java.lang.String unicodeWrap(java.lang.String str, androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z) {
        if (str == null) {
            return null;
        }
        return unicodeWrap((java.lang.CharSequence) str, textDirectionHeuristicCompat, z).toString();
    }

    public final java.lang.CharSequence unicodeWrap(java.lang.CharSequence charSequence, androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z) {
        java.lang.String str;
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.String str2 = "";
        if (getStereoReset() && z) {
            boolean isRtl2 = (isRtl ? androidx.core.text.TextDirectionHeuristicsCompat.RTL : androidx.core.text.TextDirectionHeuristicsCompat.LTR).isRtl(charSequence, 0, charSequence.length());
            if (!this.getOutputFormats && (isRtl2 || getHighSpeedVideoFpsRangesFor(charSequence) == 1)) {
                str = getHighSpeedVideoFpsRangesFor;
            } else {
                str = (!this.getOutputFormats || (isRtl2 && getHighSpeedVideoFpsRangesFor(charSequence) != -1)) ? "" : Camera2StreamConfigurationMap;
            }
            spannableStringBuilder.append((java.lang.CharSequence) str);
        }
        if (isRtl != this.getOutputFormats) {
            spannableStringBuilder.append(isRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            boolean isRtl3 = (isRtl ? androidx.core.text.TextDirectionHeuristicsCompat.RTL : androidx.core.text.TextDirectionHeuristicsCompat.LTR).isRtl(charSequence, 0, charSequence.length());
            if (!this.getOutputFormats && (isRtl3 || getHighSpeedVideoFpsRanges(charSequence) == 1)) {
                str2 = getHighSpeedVideoFpsRangesFor;
            } else if (this.getOutputFormats && (!isRtl3 || getHighSpeedVideoFpsRanges(charSequence) == -1)) {
                str2 = Camera2StreamConfigurationMap;
            }
            spannableStringBuilder.append((java.lang.CharSequence) str2);
        }
        return spannableStringBuilder;
    }

    public final java.lang.String unicodeWrap(java.lang.String str, androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        return unicodeWrap(str, textDirectionHeuristicCompat, true);
    }

    public final java.lang.CharSequence unicodeWrap(java.lang.CharSequence charSequence, androidx.core.text.TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        return unicodeWrap(charSequence, textDirectionHeuristicCompat, true);
    }

    public final java.lang.String unicodeWrap(java.lang.String str, boolean z) {
        return unicodeWrap(str, this.getInputFormats, z);
    }

    public final java.lang.CharSequence unicodeWrap(java.lang.CharSequence charSequence, boolean z) {
        return unicodeWrap(charSequence, this.getInputFormats, z);
    }

    public final java.lang.String unicodeWrap(java.lang.String str) {
        return unicodeWrap(str, this.getInputFormats, true);
    }

    public final java.lang.CharSequence unicodeWrap(java.lang.CharSequence charSequence) {
        return unicodeWrap(charSequence, this.getInputFormats, true);
    }

    static boolean Camera2StreamConfigurationMap(java.util.Locale locale) {
        return androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1;
    }

    private static int getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence) {
        androidx.core.text.BidiFormatter.DirectionalityEstimator directionalityEstimator = new androidx.core.text.BidiFormatter.DirectionalityEstimator(charSequence);
        directionalityEstimator.getHighSpeedVideoFpsRangesFor = directionalityEstimator.Camera2StreamConfigurationMap;
        int i = 0;
        while (true) {
            int i2 = i;
            while (directionalityEstimator.getHighSpeedVideoFpsRangesFor > 0) {
                byte highSpeedVideoFpsRangesFor = directionalityEstimator.getHighSpeedVideoFpsRangesFor();
                if (highSpeedVideoFpsRangesFor != 0) {
                    if (highSpeedVideoFpsRangesFor == 1 || highSpeedVideoFpsRangesFor == 2) {
                        if (i2 == 0) {
                            return 1;
                        }
                        if (i == 0) {
                            break;
                        }
                    } else if (highSpeedVideoFpsRangesFor != 9) {
                        switch (highSpeedVideoFpsRangesFor) {
                            case 14:
                            case 15:
                                if (i == i2) {
                                    return -1;
                                }
                                i2--;
                                break;
                            case 16:
                            case 17:
                                if (i == i2) {
                                    return 1;
                                }
                                i2--;
                                break;
                            case 18:
                                i2++;
                                break;
                            default:
                                if (i != 0) {
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i2 == 0) {
                        return -1;
                    }
                    if (i == 0) {
                        break;
                    }
                }
            }
            return 0;
            i = i2;
        }
    }

    private static int getHighSpeedVideoFpsRangesFor(java.lang.CharSequence charSequence) {
        byte Camera2StreamConfigurationMap2;
        char charAt;
        char charAt2;
        androidx.core.text.BidiFormatter.DirectionalityEstimator directionalityEstimator = new androidx.core.text.BidiFormatter.DirectionalityEstimator(charSequence);
        directionalityEstimator.getHighSpeedVideoFpsRangesFor = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (directionalityEstimator.getHighSpeedVideoFpsRangesFor < directionalityEstimator.Camera2StreamConfigurationMap && i == 0) {
            char charAt3 = directionalityEstimator.getHighSpeedVideoSizes.charAt(directionalityEstimator.getHighSpeedVideoFpsRangesFor);
            directionalityEstimator.getHighResolutionOutputSizeshNQ4ISI = charAt3;
            if (java.lang.Character.isHighSurrogate(charAt3)) {
                int codePointAt = java.lang.Character.codePointAt(directionalityEstimator.getHighSpeedVideoSizes, directionalityEstimator.getHighSpeedVideoFpsRangesFor);
                directionalityEstimator.getHighSpeedVideoFpsRangesFor += java.lang.Character.charCount(codePointAt);
                Camera2StreamConfigurationMap2 = java.lang.Character.getDirectionality(codePointAt);
            } else {
                directionalityEstimator.getHighSpeedVideoFpsRangesFor++;
                Camera2StreamConfigurationMap2 = androidx.core.text.BidiFormatter.DirectionalityEstimator.Camera2StreamConfigurationMap(directionalityEstimator.getHighResolutionOutputSizeshNQ4ISI);
                if (directionalityEstimator.getHighSpeedVideoFpsRanges) {
                    char c = directionalityEstimator.getHighResolutionOutputSizeshNQ4ISI;
                    if (c == '<') {
                        int i4 = directionalityEstimator.getHighSpeedVideoFpsRangesFor;
                        while (true) {
                            int i5 = directionalityEstimator.getHighSpeedVideoFpsRangesFor;
                            if (i5 < directionalityEstimator.Camera2StreamConfigurationMap) {
                                java.lang.CharSequence charSequence2 = directionalityEstimator.getHighSpeedVideoSizes;
                                directionalityEstimator.getHighSpeedVideoFpsRangesFor = i5 + 1;
                                char charAt4 = charSequence2.charAt(i5);
                                directionalityEstimator.getHighResolutionOutputSizeshNQ4ISI = charAt4;
                                if (charAt4 != '>') {
                                    if (charAt4 == '\"' || charAt4 == '\'') {
                                        do {
                                            int i6 = directionalityEstimator.getHighSpeedVideoFpsRangesFor;
                                            if (i6 < directionalityEstimator.Camera2StreamConfigurationMap) {
                                                java.lang.CharSequence charSequence3 = directionalityEstimator.getHighSpeedVideoSizes;
                                                directionalityEstimator.getHighSpeedVideoFpsRangesFor = i6 + 1;
                                                charAt2 = charSequence3.charAt(i6);
                                                directionalityEstimator.getHighResolutionOutputSizeshNQ4ISI = charAt2;
                                            }
                                        } while (charAt2 != charAt4);
                                    }
                                }
                            } else {
                                directionalityEstimator.getHighSpeedVideoFpsRangesFor = i4;
                                directionalityEstimator.getHighResolutionOutputSizeshNQ4ISI = kotlin.text.Typography.less;
                                Camera2StreamConfigurationMap2 = 13;
                            }
                        }
                    } else if (c == '&') {
                        do {
                            int i7 = directionalityEstimator.getHighSpeedVideoFpsRangesFor;
                            if (i7 < directionalityEstimator.Camera2StreamConfigurationMap) {
                                java.lang.CharSequence charSequence4 = directionalityEstimator.getHighSpeedVideoSizes;
                                directionalityEstimator.getHighSpeedVideoFpsRangesFor = i7 + 1;
                                charAt = charSequence4.charAt(i7);
                                directionalityEstimator.getHighResolutionOutputSizeshNQ4ISI = charAt;
                            }
                            Camera2StreamConfigurationMap2 = 12;
                        } while (charAt != ';');
                        Camera2StreamConfigurationMap2 = 12;
                    }
                }
            }
            if (Camera2StreamConfigurationMap2 != 0) {
                if (Camera2StreamConfigurationMap2 == 1 || Camera2StreamConfigurationMap2 == 2) {
                    if (i3 == 0) {
                        return 1;
                    }
                } else if (Camera2StreamConfigurationMap2 != 9) {
                    switch (Camera2StreamConfigurationMap2) {
                        case 14:
                        case 15:
                            i3++;
                            i2 = -1;
                            continue;
                        case 16:
                        case 17:
                            i3++;
                            i2 = 1;
                            continue;
                        case 18:
                            i3--;
                            i2 = 0;
                            continue;
                    }
                }
            } else if (i3 == 0) {
                return -1;
            }
            i = i3;
        }
        if (i != 0) {
            if (i2 != 0) {
                return i2;
            }
            while (directionalityEstimator.getHighSpeedVideoFpsRangesFor > 0) {
                switch (directionalityEstimator.getHighSpeedVideoFpsRangesFor()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
        }
        return 0;
    }

    static class DirectionalityEstimator {
        private static final byte[] getInputSizeshNQ4ISI = new byte[1792];
        final int Camera2StreamConfigurationMap;
        char getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges = false;
        int getHighSpeedVideoFpsRangesFor;
        final java.lang.CharSequence getHighSpeedVideoSizes;

        static {
            for (int i = 0; i < 1792; i++) {
                getInputSizeshNQ4ISI[i] = java.lang.Character.getDirectionality(i);
            }
        }

        DirectionalityEstimator(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoSizes = charSequence;
            this.Camera2StreamConfigurationMap = charSequence.length();
        }

        static byte Camera2StreamConfigurationMap(char c) {
            return c < 1792 ? getInputSizeshNQ4ISI[c] : java.lang.Character.getDirectionality(c);
        }

        final byte getHighSpeedVideoFpsRangesFor() {
            char charAt = this.getHighSpeedVideoSizes.charAt(this.getHighSpeedVideoFpsRangesFor - 1);
            this.getHighResolutionOutputSizeshNQ4ISI = charAt;
            if (java.lang.Character.isLowSurrogate(charAt)) {
                int codePointBefore = java.lang.Character.codePointBefore(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
                this.getHighSpeedVideoFpsRangesFor -= java.lang.Character.charCount(codePointBefore);
                return java.lang.Character.getDirectionality(codePointBefore);
            }
            this.getHighSpeedVideoFpsRangesFor--;
            char c = this.getHighResolutionOutputSizeshNQ4ISI;
            byte directionality = c < 1792 ? getInputSizeshNQ4ISI[c] : java.lang.Character.getDirectionality(c);
            if (!this.getHighSpeedVideoFpsRanges) {
                return directionality;
            }
            char c2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (c2 == '>') {
                return getHighSpeedVideoSizes();
            }
            return c2 == ';' ? Camera2StreamConfigurationMap() : directionality;
        }

        private byte getHighSpeedVideoSizes() {
            char charAt;
            int i = this.getHighSpeedVideoFpsRangesFor;
            while (true) {
                int i2 = this.getHighSpeedVideoFpsRangesFor;
                if (i2 <= 0) {
                    break;
                }
                java.lang.CharSequence charSequence = this.getHighSpeedVideoSizes;
                int i3 = i2 - 1;
                this.getHighSpeedVideoFpsRangesFor = i3;
                char charAt2 = charSequence.charAt(i3);
                this.getHighResolutionOutputSizeshNQ4ISI = charAt2;
                if (charAt2 != '<') {
                    if (charAt2 == '>') {
                        break;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i4 = this.getHighSpeedVideoFpsRangesFor;
                            if (i4 > 0) {
                                java.lang.CharSequence charSequence2 = this.getHighSpeedVideoSizes;
                                int i5 = i4 - 1;
                                this.getHighSpeedVideoFpsRangesFor = i5;
                                charAt = charSequence2.charAt(i5);
                                this.getHighResolutionOutputSizeshNQ4ISI = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    return com.google.common.base.Ascii.FF;
                }
            }
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.text.Typography.greater;
            return (byte) 13;
        }

        private byte Camera2StreamConfigurationMap() {
            char charAt;
            int i = this.getHighSpeedVideoFpsRangesFor;
            do {
                int i2 = this.getHighSpeedVideoFpsRangesFor;
                if (i2 <= 0) {
                    break;
                }
                java.lang.CharSequence charSequence = this.getHighSpeedVideoSizes;
                int i3 = i2 - 1;
                this.getHighSpeedVideoFpsRangesFor = i3;
                charAt = charSequence.charAt(i3);
                this.getHighResolutionOutputSizeshNQ4ISI = charAt;
                if (charAt == '&') {
                    return com.google.common.base.Ascii.FF;
                }
            } while (charAt != ';');
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighResolutionOutputSizeshNQ4ISI = ';';
            return (byte) 13;
        }
    }
}
