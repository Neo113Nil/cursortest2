package androidx.core.os;

/* loaded from: classes7.dex */
final class LocaleListCompatWrapper implements androidx.core.os.LocaleListInterface {
    private final java.util.Locale[] getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoSizesFor;
    private static final java.util.Locale[] getHighSpeedVideoFpsRangesFor = new java.util.Locale[0];
    private static final java.util.Locale Camera2StreamConfigurationMap = new java.util.Locale("en", "XA");
    private static final java.util.Locale getHighSpeedVideoFpsRanges = new java.util.Locale("ar", "XB");
    private static final java.util.Locale getHighResolutionOutputSizeshNQ4ISI = androidx.core.os.LocaleListCompat.getHighSpeedVideoFpsRanges("en-Latn");

    @Override // androidx.core.os.LocaleListInterface
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI() {
        return null;
    }

    @Override // androidx.core.os.LocaleListInterface
    public final java.util.Locale getHighSpeedVideoFpsRanges(int i) {
        if (i < 0) {
            return null;
        }
        java.util.Locale[] localeArr = this.getHighSpeedVideoSizes;
        if (i < localeArr.length) {
            return localeArr[i];
        }
        return null;
    }

    @Override // androidx.core.os.LocaleListInterface
    public final boolean getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes.length == 0;
    }

    @Override // androidx.core.os.LocaleListInterface
    public final int Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoSizes.length;
    }

    @Override // androidx.core.os.LocaleListInterface
    public final int Camera2StreamConfigurationMap(java.util.Locale locale) {
        int i = 0;
        while (true) {
            java.util.Locale[] localeArr = this.getHighSpeedVideoSizes;
            if (i >= localeArr.length) {
                return -1;
            }
            if (localeArr[i].equals(locale)) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.core.os.LocaleListCompatWrapper)) {
            return false;
        }
        java.util.Locale[] localeArr = ((androidx.core.os.LocaleListCompatWrapper) obj).getHighSpeedVideoSizes;
        if (this.getHighSpeedVideoSizes.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            java.util.Locale[] localeArr2 = this.getHighSpeedVideoSizes;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        int i = 1;
        for (java.util.Locale locale : this.getHighSpeedVideoSizes) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        int i = 0;
        while (true) {
            java.util.Locale[] localeArr = this.getHighSpeedVideoSizes;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.getHighSpeedVideoSizes.length - 1) {
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    @Override // androidx.core.os.LocaleListInterface
    public final java.lang.String getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoSizesFor;
    }

    private static java.lang.String getHighSpeedVideoSizes(java.util.Locale locale) {
        java.lang.String script = locale.getScript();
        return !script.isEmpty() ? script : "";
    }

    private static boolean getHighSpeedVideoFpsRanges(java.util.Locale locale) {
        return Camera2StreamConfigurationMap.equals(locale) || getHighSpeedVideoFpsRanges.equals(locale);
    }

    private static int Camera2StreamConfigurationMap(java.util.Locale locale, java.util.Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || getHighSpeedVideoFpsRanges(locale) || getHighSpeedVideoFpsRanges(locale2)) {
            return 0;
        }
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(locale);
        if (!highSpeedVideoSizes.isEmpty()) {
            return highSpeedVideoSizes.equals(getHighSpeedVideoSizes(locale2)) ? 1 : 0;
        }
        java.lang.String country = locale.getCountry();
        return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
    }

    private int getHighResolutionOutputSizeshNQ4ISI(java.util.Locale locale) {
        int i = 0;
        while (true) {
            java.util.Locale[] localeArr = this.getHighSpeedVideoSizes;
            if (i >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (Camera2StreamConfigurationMap(locale, localeArr[i]) > 0) {
                return i;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r6 >= Integer.MAX_VALUE) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getHighSpeedVideoFpsRanges(java.util.Collection<java.lang.String> collection, boolean z) {
        int i;
        java.util.Locale[] localeArr = this.getHighSpeedVideoSizes;
        if (localeArr.length == 1) {
            return 0;
        }
        if (localeArr.length == 0) {
            return -1;
        }
        if (z) {
            i = getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI);
            if (i == 0) {
                return 0;
            }
        }
        i = Integer.MAX_VALUE;
        java.util.Iterator<java.lang.String> it = collection.iterator();
        while (it.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.core.os.LocaleListCompat.getHighSpeedVideoFpsRanges(it.next()));
            if (highResolutionOutputSizeshNQ4ISI == 0) {
                return 0;
            }
            if (highResolutionOutputSizeshNQ4ISI < i) {
                i = highResolutionOutputSizeshNQ4ISI;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    private java.util.Locale getHighSpeedVideoSizes(java.util.Collection<java.lang.String> collection, boolean z) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(collection, z);
        if (highSpeedVideoFpsRanges == -1) {
            return null;
        }
        return this.getHighSpeedVideoSizes[highSpeedVideoFpsRanges];
    }

    @Override // androidx.core.os.LocaleListInterface
    public final java.util.Locale getHighSpeedVideoFpsRangesFor(java.lang.String[] strArr) {
        return getHighSpeedVideoSizes(java.util.Arrays.asList(strArr), false);
    }
}
