package com.datadog.trace.core.propagation.ptags;

/* loaded from: classes3.dex */
final class DatadogPTagsCodec extends com.datadog.trace.core.propagation.ptags.PTagsCodec {
    private static final com.datadog.trace.relocate.api.RatelimitedLogger getHighResolutionOutputSizeshNQ4ISI = new com.datadog.trace.relocate.api.RatelimitedLogger(com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.core.propagation.ptags.DatadogPTagsCodec.class), 5, java.util.concurrent.TimeUnit.MINUTES);
    private final int getHighSpeedVideoFpsRanges;

    public static /* synthetic */ boolean Camera2StreamConfigurationMap(int i) {
        return i >= 32 && i <= 126;
    }

    public static /* synthetic */ boolean getHighSpeedVideoFpsRanges(int i) {
        return i > 32 && i <= 126 && i != 44;
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    protected final int appendSuffix(java.lang.StringBuilder sb, com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags pTags, int i) {
        return i;
    }

    DatadogPTagsCodec(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    final com.datadog.trace.core.propagation.PropagationTags getHighSpeedVideoFpsRangesFor(com.datadog.trace.core.propagation.ptags.PTagsFactory pTagsFactory, java.lang.String str) {
        if (str == null) {
            return pTagsFactory.empty();
        }
        if (str.length() <= this.getHighSpeedVideoFpsRanges) {
            int length = str.length();
            java.util.ArrayList arrayList = null;
            com.datadog.trace.core.propagation.ptags.TagValue tagValue = null;
            int i = 0;
            com.datadog.trace.core.propagation.ptags.TagValue tagValue2 = null;
            while (i < length) {
                int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str, i, '=', new com.datadog.android.trace.internal.compat.function.IntPredicate() { // from class: com.datadog.trace.core.propagation.ptags.DatadogPTagsCodec$$ExternalSyntheticLambda0
                    @Override // com.datadog.android.trace.internal.compat.function.IntPredicate
                    public final boolean check(int i2) {
                        return com.datadog.trace.core.propagation.ptags.DatadogPTagsCodec.getHighSpeedVideoFpsRanges(i2);
                    }
                });
                if (highSpeedVideoFpsRanges < 0 || highSpeedVideoFpsRanges == length) {
                    getHighResolutionOutputSizeshNQ4ISI.warn("Invalid datadog tags header value: '{}' at {}", str, java.lang.Integer.valueOf(i));
                    return com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags.getHighSpeedVideoFpsRangesFor(pTagsFactory, "decoding_error");
                }
                int i2 = highSpeedVideoFpsRanges + 1;
                int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str, i2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA, new com.datadog.android.trace.internal.compat.function.IntPredicate() { // from class: com.datadog.trace.core.propagation.ptags.DatadogPTagsCodec$$ExternalSyntheticLambda1
                    @Override // com.datadog.android.trace.internal.compat.function.IntPredicate
                    public final boolean check(int i3) {
                        return com.datadog.trace.core.propagation.ptags.DatadogPTagsCodec.Camera2StreamConfigurationMap(i3);
                    }
                });
                if (highSpeedVideoFpsRanges2 < 0) {
                    getHighResolutionOutputSizeshNQ4ISI.warn("Invalid datadog tags header value: '{}' at {}", str, java.lang.Integer.valueOf(highSpeedVideoFpsRanges));
                    return com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags.getHighSpeedVideoFpsRangesFor(pTagsFactory, "decoding_error");
                }
                com.datadog.trace.core.propagation.ptags.TagKey highResolutionOutputSizeshNQ4ISI = com.datadog.trace.core.propagation.ptags.TagKey.getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.DATADOG, str, i, highSpeedVideoFpsRanges);
                com.datadog.trace.core.propagation.ptags.TagValue highSpeedVideoSizes = com.datadog.trace.core.propagation.ptags.TagValue.getHighSpeedVideoSizes(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.DATADOG, str, i2, highSpeedVideoFpsRanges2);
                if (highResolutionOutputSizeshNQ4ISI != null && !highResolutionOutputSizeshNQ4ISI.equals(UPSTREAM_SERVICES_DEPRECATED_TAG)) {
                    if (!validateTagValue(highResolutionOutputSizeshNQ4ISI, highSpeedVideoSizes)) {
                        getHighResolutionOutputSizeshNQ4ISI.warn("Invalid datadog tags header value: '{}' invalid tag value at {}", str, java.lang.Integer.valueOf(i2));
                        if (highResolutionOutputSizeshNQ4ISI.equals(TRACE_ID_TAG)) {
                            return com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags.getHighSpeedVideoFpsRangesFor(pTagsFactory, "malformed_tid ".concat(java.lang.String.valueOf(highSpeedVideoSizes)));
                        }
                        return com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags.getHighSpeedVideoFpsRangesFor(pTagsFactory, "decoding_error");
                    }
                    if (highResolutionOutputSizeshNQ4ISI.equals(DECISION_MAKER_TAG)) {
                        tagValue2 = highSpeedVideoSizes;
                    } else if (highResolutionOutputSizeshNQ4ISI.equals(TRACE_ID_TAG)) {
                        tagValue = highSpeedVideoSizes;
                    } else {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList(6);
                        }
                        arrayList.add(highResolutionOutputSizeshNQ4ISI);
                        arrayList.add(highSpeedVideoSizes);
                    }
                }
                i = highSpeedVideoFpsRanges2 + 1;
            }
            return new com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags(pTagsFactory, arrayList, tagValue2, tagValue);
        }
        return com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags.getHighSpeedVideoFpsRangesFor(pTagsFactory, "extract_max_size");
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    protected final int estimateHeaderSize(com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags pTags) {
        return pTags.getHighSpeedVideoFpsRanges();
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    protected final int appendPrefix(java.lang.StringBuilder sb, com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags pTags) {
        return pTags.getHighSpeedVideoFpsRanges();
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    protected final int appendTag(java.lang.StringBuilder sb, com.datadog.trace.core.propagation.ptags.TagElement tagElement, com.datadog.trace.core.propagation.ptags.TagElement tagElement2, int i) {
        if (i <= this.getHighSpeedVideoFpsRanges) {
            if (sb.length() > 0) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            }
            sb.append(tagElement.getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.DATADOG));
            sb.append('=');
            sb.append(tagElement2.getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.DATADOG));
        }
        return i;
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    protected final boolean isTooLarge(java.lang.StringBuilder sb, int i) {
        return i > this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    protected final boolean isEmpty(java.lang.StringBuilder sb, int i) {
        return sb.length() == 0;
    }

    private static int getHighSpeedVideoFpsRanges(java.lang.String str, int i, char c, com.datadog.android.trace.internal.compat.function.IntPredicate intPredicate) {
        int length = str.length();
        if (i >= length) {
            return -1;
        }
        char charAt = str.charAt(i);
        while (intPredicate.check(charAt) && charAt != c) {
            i++;
            if (i < length) {
                charAt = str.charAt(i);
                if (i < length - 1 && charAt == c) {
                    return i;
                }
            }
            if (i >= length) {
                return i;
            }
        }
        return -1;
    }
}
