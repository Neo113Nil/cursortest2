package androidx.core.text;

/* loaded from: classes7.dex */
public final class TextDirectionHeuristicsCompat {
    public static final androidx.core.text.TextDirectionHeuristicCompat LTR = new androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicInternal(null, false);
    public static final androidx.core.text.TextDirectionHeuristicCompat RTL = new androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicInternal(null, true);
    public static final androidx.core.text.TextDirectionHeuristicCompat FIRSTSTRONG_LTR = new androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicInternal(androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong.getHighSpeedVideoSizes, false);
    public static final androidx.core.text.TextDirectionHeuristicCompat FIRSTSTRONG_RTL = new androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicInternal(androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong.getHighSpeedVideoSizes, true);
    public static final androidx.core.text.TextDirectionHeuristicCompat ANYRTL_LTR = new androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicInternal(androidx.core.text.TextDirectionHeuristicsCompat.AnyStrong.getHighSpeedVideoFpsRanges, false);
    public static final androidx.core.text.TextDirectionHeuristicCompat LOCALE = androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicLocale.getHighSpeedVideoFpsRanges;

    interface TextDirectionAlgorithm {
        int getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, int i, int i2);
    }

    static int getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static int getHighSpeedVideoFpsRanges(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }

    static abstract class TextDirectionHeuristicImpl implements androidx.core.text.TextDirectionHeuristicCompat {
        private final androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm Camera2StreamConfigurationMap;

        protected abstract boolean getHighResolutionOutputSizeshNQ4ISI();

        TextDirectionHeuristicImpl(androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm textDirectionAlgorithm) {
            this.Camera2StreamConfigurationMap = textDirectionAlgorithm;
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(char[] cArr, int i, int i2) {
            return isRtl(java.nio.CharBuffer.wrap(cArr), i, i2);
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(java.lang.CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new java.lang.IllegalArgumentException();
            }
            if (this.Camera2StreamConfigurationMap == null) {
                return getHighResolutionOutputSizeshNQ4ISI();
            }
            return Camera2StreamConfigurationMap(charSequence, i, i2);
        }

        private boolean Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, int i, int i2) {
            int highSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(charSequence, i, i2);
            if (highSpeedVideoFpsRanges == 0) {
                return true;
            }
            if (highSpeedVideoFpsRanges != 1) {
                return getHighResolutionOutputSizeshNQ4ISI();
            }
            return false;
        }
    }

    static class TextDirectionHeuristicInternal extends androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl {
        private final boolean getHighSpeedVideoFpsRanges;

        TextDirectionHeuristicInternal(androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm textDirectionAlgorithm, boolean z) {
            super(textDirectionAlgorithm);
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        protected boolean getHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    static class FirstStrong implements androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm {
        static final androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong getHighSpeedVideoSizes = new androidx.core.text.TextDirectionHeuristicsCompat.FirstStrong();

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, int i, int i2) {
            int i3 = 2;
            for (int i4 = i; i4 < i2 + i && i3 == 2; i4++) {
                i3 = androidx.core.text.TextDirectionHeuristicsCompat.getHighSpeedVideoFpsRanges(java.lang.Character.getDirectionality(charSequence.charAt(i4)));
            }
            return i3;
        }

        private FirstStrong() {
        }
    }

    static class AnyStrong implements androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm {
        static final androidx.core.text.TextDirectionHeuristicsCompat.AnyStrong getHighSpeedVideoFpsRanges = new androidx.core.text.TextDirectionHeuristicsCompat.AnyStrong(true);
        private final boolean Camera2StreamConfigurationMap;

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, int i, int i2) {
            int i3 = i;
            boolean z = false;
            while (i3 < i2 + i) {
                int highResolutionOutputSizeshNQ4ISI = androidx.core.text.TextDirectionHeuristicsCompat.getHighResolutionOutputSizeshNQ4ISI(java.lang.Character.getDirectionality(charSequence.charAt(i3)));
                if (highResolutionOutputSizeshNQ4ISI != 0) {
                    if (highResolutionOutputSizeshNQ4ISI != 1) {
                        continue;
                        i3++;
                        z = z;
                    } else if (!this.Camera2StreamConfigurationMap) {
                        return 1;
                    }
                } else if (this.Camera2StreamConfigurationMap) {
                    return 0;
                }
                z = true;
                i3++;
                z = z;
            }
            if (z) {
                return this.Camera2StreamConfigurationMap ? 1 : 0;
            }
            return 2;
        }

        private AnyStrong(boolean z) {
            this.Camera2StreamConfigurationMap = z;
        }
    }

    static class TextDirectionHeuristicLocale extends androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl {
        static final androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicLocale getHighSpeedVideoFpsRanges = new androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicLocale();

        TextDirectionHeuristicLocale() {
            super(null);
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        protected boolean getHighResolutionOutputSizeshNQ4ISI() {
            return androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1;
        }
    }

    private TextDirectionHeuristicsCompat() {
    }
}
