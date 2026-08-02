package com.datadog.trace.core.propagation.ptags;

/* loaded from: classes3.dex */
final class TagKey extends com.datadog.trace.core.propagation.ptags.TagElement {
    private static final com.datadog.trace.logger.Logger getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.core.propagation.ptags.TagKey.class);
    private static final com.datadog.trace.api.cache.DDPartialKeyCache<java.lang.String, com.datadog.trace.core.propagation.ptags.TagKey> getHighSpeedVideoFpsRanges = com.datadog.trace.api.cache.DDCaches.newFixedSizePartialKeyCache(64);
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    final java.lang.String[] getHighSpeedVideoSizes = new java.lang.String[com.datadog.trace.core.propagation.ptags.TagElement.Encoding.getHighSpeedVideoSizes()];

    static com.datadog.trace.core.propagation.ptags.TagKey Camera2StreamConfigurationMap(java.lang.String str) {
        if (getHighSpeedVideoFpsRangesFor(str, 0, str.length(), (java.lang.String) null)) {
            com.datadog.trace.logger.Logger logger = getHighResolutionOutputSizeshNQ4ISI;
            if (logger.isDebugEnabled()) {
                logger.debug("Invalid header s: {}", str);
            }
            return null;
        }
        return getHighSpeedVideoFpsRanges.computeIfAbsent(str, 0, str.length(), new com.datadog.trace.core.propagation.ptags.TagKey$$ExternalSyntheticLambda0(), new com.datadog.trace.core.propagation.ptags.TagKey$$ExternalSyntheticLambda1(), new com.datadog.trace.core.propagation.ptags.TagKey$$ExternalSyntheticLambda2());
    }

    private static boolean getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, int i2, java.lang.String str2) {
        int length = str2 == null ? 0 : str2.length();
        int length2 = str.length();
        if (i < 0 || i2 <= 0 || i2 - i <= length || length2 <= length || length2 < i2) {
            return true;
        }
        return (str2 == null || str.startsWith(str2, i)) ? false : true;
    }

    private TagKey(java.lang.String str, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor = (i == 0 && i2 == str.length()) ? str : str.substring(i, i2);
        for (com.datadog.trace.core.propagation.ptags.TagElement.Encoding encoding : com.datadog.trace.core.propagation.ptags.TagElement.Encoding.getHighSpeedVideoFpsRanges()) {
            java.lang.String[] strArr = this.getHighSpeedVideoSizes;
            int ordinal = encoding.ordinal();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(encoding.getPrefix());
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            strArr[ordinal] = sb.toString();
        }
    }

    @Override // com.datadog.trace.core.propagation.ptags.TagElement
    final java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.propagation.ptags.TagElement.Encoding encoding) {
        return this.getHighSpeedVideoSizes[encoding.ordinal()];
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.getHighSpeedVideoFpsRangesFor.equals(((com.datadog.trace.core.propagation.ptags.TagKey) obj).getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.getHighSpeedVideoFpsRangesFor.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.getHighSpeedVideoFpsRangesFor.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i, int i2) {
        return this.getHighSpeedVideoFpsRangesFor.subSequence(i, i2);
    }

    public static /* synthetic */ com.datadog.trace.core.propagation.ptags.TagKey getHighSpeedVideoSizes(java.lang.String str, int i, int i2) {
        return new com.datadog.trace.core.propagation.ptags.TagKey(str, i, i2);
    }

    public static /* synthetic */ int getHighSpeedVideoFpsRanges(java.lang.String str, int i, int i2) {
        int min = java.lang.Integer.min(str.length(), i2);
        int i3 = 0;
        if (i >= 0 && min > 0) {
            while (i < min) {
                i3 = (i3 * 31) + str.charAt(i);
                i++;
            }
        }
        return i3;
    }

    public static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, int i2, com.datadog.trace.core.propagation.ptags.TagKey tagKey) {
        int min = java.lang.Integer.min(str.length(), i2);
        if (i < 0 || min < 0 || min - i != tagKey.length()) {
            return false;
        }
        int i3 = 0;
        boolean z = true;
        while (z && i < min) {
            z = str.charAt(i) == tagKey.charAt(i3);
            i++;
            i3++;
        }
        return z;
    }

    static com.datadog.trace.core.propagation.ptags.TagKey getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.propagation.ptags.TagElement.Encoding encoding, java.lang.String str, int i, int i2) {
        if (encoding == null || str == null || getHighSpeedVideoFpsRangesFor(str, i, i2, encoding.getPrefix())) {
            com.datadog.trace.logger.Logger logger = getHighResolutionOutputSizeshNQ4ISI;
            if (!logger.isDebugEnabled()) {
                return null;
            }
            logger.debug("Invalid header h: {} s: {} b: {} e: {}", encoding, str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
            return null;
        }
        return getHighSpeedVideoFpsRanges.computeIfAbsent(str, i + encoding.getPrefixLength(), i2, new com.datadog.trace.core.propagation.ptags.TagKey$$ExternalSyntheticLambda0(), new com.datadog.trace.core.propagation.ptags.TagKey$$ExternalSyntheticLambda1(), new com.datadog.trace.core.propagation.ptags.TagKey$$ExternalSyntheticLambda2());
    }
}
