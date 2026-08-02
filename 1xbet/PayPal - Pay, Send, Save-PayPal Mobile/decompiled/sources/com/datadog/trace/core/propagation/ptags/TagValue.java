package com.datadog.trace.core.propagation.ptags;

/* loaded from: classes3.dex */
final class TagValue extends com.datadog.trace.core.propagation.ptags.TagElement {
    final int getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.CharSequence[] getHighSpeedVideoFpsRanges;
    private final int getInputSizeshNQ4ISI;
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoSizes = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.core.propagation.ptags.TagValue.class);
    private static final com.datadog.trace.api.cache.DDPartialKeyCache<java.lang.CharSequence, com.datadog.trace.core.propagation.ptags.TagValue> getHighSpeedVideoFpsRangesFor = com.datadog.trace.api.cache.DDCaches.newFixedSizePartialKeyCache(128);
    static final int Camera2StreamConfigurationMap = com.datadog.trace.core.propagation.ptags.TagElement.Encoding.DATADOG.ordinal();

    interface CharConverter {
        char convert(char c);
    }

    public static /* synthetic */ char getHighResolutionOutputSizeshNQ4ISI(char c) {
        if (c == ',' || c == ';' || c == '~') {
            return '_';
        }
        if (c == '=') {
            return '~';
        }
        return c;
    }

    static char getHighSpeedVideoFpsRanges(char c) {
        if (c == ',' || c == ';' || c == '~') {
            return '_';
        }
        if (c == '=') {
            return '~';
        }
        return c;
    }

    public static /* synthetic */ char getHighSpeedVideoFpsRangesFor(char c) {
        if (c == '~') {
            return '=';
        }
        return c;
    }

    public static /* synthetic */ char getHighSpeedVideoSizes(char c) {
        return c;
    }

    static com.datadog.trace.core.propagation.ptags.TagValue getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence charSequence) {
        return getHighSpeedVideoSizes(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.DATADOG, charSequence, charSequence == null ? -1 : 0, charSequence != null ? charSequence.length() : -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.propagation.ptags.TagValue.CharConverter charConverter, java.lang.CharSequence charSequence, int i, int i2) {
        int min = java.lang.Integer.min(charSequence.length(), i2);
        int i3 = 0;
        if (i >= 0 && min > 0) {
            while (i < min) {
                i3 = (i3 * 31) + charConverter.convert(charSequence.charAt(i));
                i++;
            }
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getHighSpeedVideoSizes(com.datadog.trace.core.propagation.ptags.TagValue.CharConverter charConverter, java.lang.CharSequence charSequence, int i, int i2, com.datadog.trace.core.propagation.ptags.TagValue tagValue) {
        int min = java.lang.Integer.min(charSequence.length(), i2);
        if (i < 0 || min < 0 || min - i != tagValue.length()) {
            return false;
        }
        int i3 = 0;
        boolean z = true;
        while (z && i < min) {
            z = charConverter.convert(charSequence.charAt(i)) == tagValue.charAt(i3);
            i++;
            i3++;
        }
        return z;
    }

    private TagValue(com.datadog.trace.core.propagation.ptags.TagElement.Encoding encoding, int i, java.lang.CharSequence charSequence, int i2, int i3) {
        java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[com.datadog.trace.core.propagation.ptags.TagElement.Encoding.getHighSpeedVideoSizes()];
        this.getHighSpeedVideoFpsRanges = charSequenceArr;
        int ordinal = encoding.ordinal();
        this.getHighResolutionOutputSizeshNQ4ISI = ordinal;
        this.getInputSizeshNQ4ISI = i;
        if (i2 != 0 || i3 != charSequence.length()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(i3 - i2);
            sb.append(charSequence, i2, i3);
            charSequence = sb.toString();
        }
        charSequenceArr[ordinal] = charSequence;
    }

    @Override // com.datadog.trace.core.propagation.ptags.TagElement
    final java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.propagation.ptags.TagElement.Encoding encoding) {
        int ordinal = encoding.ordinal();
        java.lang.CharSequence[] charSequenceArr = this.getHighSpeedVideoFpsRanges;
        java.lang.CharSequence charSequence = charSequenceArr[ordinal];
        if (charSequence != null) {
            return charSequence;
        }
        java.lang.CharSequence charSequence2 = charSequenceArr[this.getHighResolutionOutputSizeshNQ4ISI];
        int length = charSequence2.length();
        com.datadog.trace.core.propagation.ptags.TagValue.CharConverter tagValue$$ExternalSyntheticLambda1 = this.getHighResolutionOutputSizeshNQ4ISI == Camera2StreamConfigurationMap ? new com.datadog.trace.core.propagation.ptags.TagValue$$ExternalSyntheticLambda1() : new com.datadog.trace.core.propagation.ptags.TagValue$$ExternalSyntheticLambda2();
        java.lang.StringBuilder sb = null;
        for (int i = 0; i < length; i++) {
            char charAt = charSequence2.charAt(i);
            char convert = tagValue$$ExternalSyntheticLambda1.convert(charAt);
            if (convert != charAt && sb == null) {
                sb = new java.lang.StringBuilder(length);
                sb.append(charSequence2, 0, i);
            }
            if (sb != null) {
                sb.append(convert);
            }
        }
        java.lang.CharSequence[] charSequenceArr2 = this.getHighSpeedVideoFpsRanges;
        if (sb != null) {
            charSequence2 = sb.toString();
        }
        charSequenceArr2[ordinal] = charSequence2;
        return charSequence2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.datadog.trace.core.propagation.ptags.TagValue tagValue = (com.datadog.trace.core.propagation.ptags.TagValue) obj;
        if (this.getInputSizeshNQ4ISI != tagValue.getInputSizeshNQ4ISI) {
            return false;
        }
        java.lang.CharSequence charSequence = this.getHighSpeedVideoFpsRanges[this.getHighResolutionOutputSizeshNQ4ISI];
        java.lang.CharSequence charSequence2 = tagValue.getHighSpeedVideoFpsRanges[tagValue.getHighResolutionOutputSizeshNQ4ISI];
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return false;
        }
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == tagValue.getHighResolutionOutputSizeshNQ4ISI) {
            for (int i2 = 0; i2 < length; i2++) {
                if (charSequence.charAt(i2) != charSequence2.charAt(i2)) {
                    return false;
                }
            }
        } else {
            int i3 = Camera2StreamConfigurationMap;
            com.datadog.trace.core.propagation.ptags.TagValue.CharConverter tagValue$$ExternalSyntheticLambda0 = i == i3 ? new com.datadog.trace.core.propagation.ptags.TagValue$$ExternalSyntheticLambda0() : new com.datadog.trace.core.propagation.ptags.TagValue$$ExternalSyntheticLambda2();
            com.datadog.trace.core.propagation.ptags.TagValue.CharConverter tagValue$$ExternalSyntheticLambda02 = tagValue.getHighResolutionOutputSizeshNQ4ISI == i3 ? new com.datadog.trace.core.propagation.ptags.TagValue$$ExternalSyntheticLambda0() : new com.datadog.trace.core.propagation.ptags.TagValue$$ExternalSyntheticLambda2();
            for (int i4 = 0; i4 < length; i4++) {
                if (tagValue$$ExternalSyntheticLambda0.convert(charSequence.charAt(i4)) != tagValue$$ExternalSyntheticLambda02.convert(charSequence2.charAt(i4))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRanges[this.getHighResolutionOutputSizeshNQ4ISI].toString();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.getHighSpeedVideoFpsRanges[this.getHighResolutionOutputSizeshNQ4ISI].length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 == Camera2StreamConfigurationMap) {
            return this.getHighSpeedVideoFpsRanges[i2].charAt(i);
        }
        char charAt = this.getHighSpeedVideoFpsRanges[i2].charAt(i);
        if (charAt == '~') {
            return '=';
        }
        return charAt;
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i, int i2) {
        return this.getHighSpeedVideoFpsRanges[this.getHighResolutionOutputSizeshNQ4ISI].subSequence(i, i2);
    }

    public static /* synthetic */ com.datadog.trace.core.propagation.ptags.TagValue getHighSpeedVideoFpsRangesFor(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        return new com.datadog.trace.core.propagation.ptags.TagValue(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.DATADOG, i, charSequence, i2, i3);
    }

    public static /* synthetic */ com.datadog.trace.core.propagation.ptags.TagValue getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        return new com.datadog.trace.core.propagation.ptags.TagValue(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.W3C, i, charSequence, i2, i3);
    }

    static com.datadog.trace.core.propagation.ptags.TagValue getHighSpeedVideoSizes(com.datadog.trace.core.propagation.ptags.TagElement.Encoding encoding, java.lang.CharSequence charSequence, int i, int i2) {
        if (charSequence == null || i < 0 || i2 <= 0 || charSequence.length() < i2) {
            com.datadog.trace.logger.Logger logger = getHighSpeedVideoSizes;
            if (!logger.isDebugEnabled()) {
                return null;
            }
            logger.debug("Invalid header h: {} s: {} b: {} e: {}", encoding, charSequence, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
            return null;
        }
        if (encoding == com.datadog.trace.core.propagation.ptags.TagElement.Encoding.W3C) {
            return getHighSpeedVideoFpsRangesFor.computeIfAbsent(charSequence, i, i2, new com.datadog.trace.api.cache.DDPartialKeyCache.Hasher() { // from class: com.datadog.trace.core.propagation.ptags.TagValue$$ExternalSyntheticLambda3
                @Override // com.datadog.trace.api.cache.DDPartialKeyCache.Hasher
                public final int apply(java.lang.Object obj, int i3, int i4) {
                    int highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = com.datadog.trace.core.propagation.ptags.TagValue.getHighResolutionOutputSizeshNQ4ISI(new com.datadog.trace.core.propagation.ptags.TagValue$$ExternalSyntheticLambda0(), (java.lang.CharSequence) obj, i3, i4);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }, new com.datadog.trace.api.cache.DDPartialKeyCache.Comparator() { // from class: com.datadog.trace.core.propagation.ptags.TagValue$$ExternalSyntheticLambda4
                @Override // com.datadog.trace.api.cache.DDPartialKeyCache.Comparator
                public final boolean test(java.lang.Object obj, int i3, int i4, java.lang.Object obj2) {
                    boolean highSpeedVideoSizes;
                    highSpeedVideoSizes = com.datadog.trace.core.propagation.ptags.TagValue.getHighSpeedVideoSizes(new com.datadog.trace.core.propagation.ptags.TagValue$$ExternalSyntheticLambda2(), (java.lang.CharSequence) obj, i3, i4, (com.datadog.trace.core.propagation.ptags.TagValue) obj2);
                    return highSpeedVideoSizes;
                }
            }, new com.datadog.trace.api.cache.DDPartialKeyCache.Producer() { // from class: com.datadog.trace.core.propagation.ptags.TagValue$$ExternalSyntheticLambda5
                @Override // com.datadog.trace.api.cache.DDPartialKeyCache.Producer
                public final java.lang.Object apply(java.lang.Object obj, int i3, int i4, int i5) {
                    return com.datadog.trace.core.propagation.ptags.TagValue.getHighResolutionOutputSizeshNQ4ISI((java.lang.CharSequence) obj, i3, i4, i5);
                }
            });
        }
        return getHighSpeedVideoFpsRangesFor.computeIfAbsent(charSequence, i, i2, new com.datadog.trace.api.cache.DDPartialKeyCache.Hasher() { // from class: com.datadog.trace.core.propagation.ptags.TagValue$$ExternalSyntheticLambda6
            @Override // com.datadog.trace.api.cache.DDPartialKeyCache.Hasher
            public final int apply(java.lang.Object obj, int i3, int i4) {
                int highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = com.datadog.trace.core.propagation.ptags.TagValue.getHighResolutionOutputSizeshNQ4ISI(new com.datadog.trace.core.propagation.ptags.TagValue$$ExternalSyntheticLambda1(), (java.lang.CharSequence) obj, i3, i4);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, new com.datadog.trace.api.cache.DDPartialKeyCache.Comparator() { // from class: com.datadog.trace.core.propagation.ptags.TagValue$$ExternalSyntheticLambda7
            @Override // com.datadog.trace.api.cache.DDPartialKeyCache.Comparator
            public final boolean test(java.lang.Object obj, int i3, int i4, java.lang.Object obj2) {
                boolean highSpeedVideoSizes;
                highSpeedVideoSizes = com.datadog.trace.core.propagation.ptags.TagValue.getHighSpeedVideoSizes(new com.datadog.trace.core.propagation.ptags.TagValue$$ExternalSyntheticLambda0(), (java.lang.CharSequence) obj, i3, i4, (com.datadog.trace.core.propagation.ptags.TagValue) obj2);
                return highSpeedVideoSizes;
            }
        }, new com.datadog.trace.api.cache.DDPartialKeyCache.Producer() { // from class: com.datadog.trace.core.propagation.ptags.TagValue$$ExternalSyntheticLambda8
            @Override // com.datadog.trace.api.cache.DDPartialKeyCache.Producer
            public final java.lang.Object apply(java.lang.Object obj, int i3, int i4, int i5) {
                return com.datadog.trace.core.propagation.ptags.TagValue.getHighSpeedVideoFpsRangesFor((java.lang.CharSequence) obj, i3, i4, i5);
            }
        });
    }
}
