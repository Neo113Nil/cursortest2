package com.datadog.trace.core.propagation.ptags;

/* loaded from: classes3.dex */
abstract class PTagsCodec {
    protected static final java.lang.String PROPAGATION_ERROR_INCONSISTENT_TID = "inconsistent_tid ";
    protected static final java.lang.String PROPAGATION_ERROR_MALFORMED_TID = "malformed_tid ";
    protected static final com.datadog.trace.core.propagation.ptags.TagKey DECISION_MAKER_TAG = com.datadog.trace.core.propagation.ptags.TagKey.Camera2StreamConfigurationMap("dm");
    protected static final com.datadog.trace.core.propagation.ptags.TagKey TRACE_ID_TAG = com.datadog.trace.core.propagation.ptags.TagKey.Camera2StreamConfigurationMap("tid");
    protected static final com.datadog.trace.core.propagation.ptags.TagKey UPSTREAM_SERVICES_DEPRECATED_TAG = com.datadog.trace.core.propagation.ptags.TagKey.Camera2StreamConfigurationMap("upstream_services");

    protected static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    protected abstract int appendPrefix(java.lang.StringBuilder sb, com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags pTags);

    protected abstract int appendSuffix(java.lang.StringBuilder sb, com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags pTags, int i);

    protected abstract int appendTag(java.lang.StringBuilder sb, com.datadog.trace.core.propagation.ptags.TagElement tagElement, com.datadog.trace.core.propagation.ptags.TagElement tagElement2, int i);

    protected abstract int estimateHeaderSize(com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags pTags);

    abstract com.datadog.trace.core.propagation.PropagationTags getHighSpeedVideoFpsRangesFor(com.datadog.trace.core.propagation.ptags.PTagsFactory pTagsFactory, java.lang.String str);

    protected abstract boolean isEmpty(java.lang.StringBuilder sb, int i);

    protected abstract boolean isTooLarge(java.lang.StringBuilder sb, int i);

    PTagsCodec() {
    }

    static java.lang.String getHighSpeedVideoSizes(com.datadog.trace.core.propagation.ptags.PTagsCodec pTagsCodec, com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags pTags) {
        int estimateHeaderSize = pTagsCodec.estimateHeaderSize(pTags);
        if (estimateHeaderSize == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(estimateHeaderSize);
        int appendPrefix = pTagsCodec.appendPrefix(sb, pTags);
        if (!pTags.getHighResolutionOutputSizeshNQ4ISI()) {
            if (pTags.Camera2StreamConfigurationMap != null) {
                appendPrefix = pTagsCodec.appendTag(sb, DECISION_MAKER_TAG, pTags.Camera2StreamConfigurationMap, appendPrefix);
            }
            if (pTags.getHighSpeedVideoFpsRanges != null) {
                appendPrefix = pTagsCodec.appendTag(sb, TRACE_ID_TAG, pTags.getHighSpeedVideoFpsRanges, appendPrefix);
            }
            java.util.List<com.datadog.trace.core.propagation.ptags.TagElement> list = pTags.getHighResolutionOutputSizeshNQ4ISI;
            if (list == null) {
                list = java.util.Collections.emptyList();
            }
            java.util.Iterator<com.datadog.trace.core.propagation.ptags.TagElement> it = list.iterator();
            while (it.hasNext() && !pTagsCodec.isTooLarge(sb, appendPrefix)) {
                appendPrefix = pTagsCodec.appendTag(sb, it.next(), it.next(), appendPrefix);
            }
        }
        int appendSuffix = pTagsCodec.appendSuffix(sb, pTags, appendPrefix);
        if (pTagsCodec.isTooLarge(sb, appendSuffix) || pTagsCodec.isEmpty(sb, appendSuffix)) {
            return null;
        }
        return sb.toString();
    }

    static void Camera2StreamConfigurationMap(com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags pTags, java.util.Map<java.lang.String, java.lang.String> map) {
        if (pTags.getHighSpeedVideoFpsRanges() > pTags.getHighSpeedVideoSizes()) {
            if (pTags.getHighResolutionOutputSizeshNQ4ISI()) {
                map.put("_dd.propagation_error", "disabled");
                return;
            } else {
                map.put("_dd.propagation_error", "inject_max_size");
                return;
            }
        }
        java.util.List<com.datadog.trace.core.propagation.ptags.TagElement> list = pTags.getHighResolutionOutputSizeshNQ4ISI;
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        java.util.Iterator<com.datadog.trace.core.propagation.ptags.TagElement> it = list.iterator();
        while (it.hasNext()) {
            map.put(it.next().getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.DATADOG).toString(), it.next().getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.DATADOG).toString());
        }
        if (pTags.Camera2StreamConfigurationMap != null) {
            map.put(DECISION_MAKER_TAG.getHighSpeedVideoSizes[com.datadog.trace.core.propagation.ptags.TagElement.Encoding.DATADOG.ordinal()].toString(), pTags.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.DATADOG).toString());
        }
        if (pTags.getHighSpeedVideoFpsRanges != null) {
            map.put(TRACE_ID_TAG.getHighSpeedVideoSizes[com.datadog.trace.core.propagation.ptags.TagElement.Encoding.DATADOG.ordinal()].toString(), pTags.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.DATADOG).toString());
        }
        if (pTags.getHighSpeedVideoFpsRangesFor() != null) {
            map.put("_dd.propagation_error", pTags.getHighSpeedVideoFpsRangesFor());
        }
    }

    static int getHighSpeedVideoFpsRanges(java.util.List<com.datadog.trace.core.propagation.ptags.TagElement> list) {
        int prefixLength = com.datadog.trace.core.propagation.ptags.TagElement.Encoding.DATADOG.getPrefixLength();
        int i = 0;
        boolean z = true;
        for (com.datadog.trace.core.propagation.ptags.TagElement tagElement : list) {
            if (z) {
                i += prefixLength;
            }
            z = !z;
            i = i + tagElement.length() + 1;
        }
        if (i == 0) {
            return 0;
        }
        return i - 1;
    }

    static int getHighSpeedVideoFpsRanges(int i, com.datadog.trace.core.propagation.ptags.TagKey tagKey, com.datadog.trace.core.propagation.ptags.TagValue tagValue) {
        if (tagValue == null) {
            return i;
        }
        if (i > 0) {
            i++;
        }
        return i + tagKey.length() + 1 + tagValue.length() + com.datadog.trace.core.propagation.ptags.TagElement.Encoding.DATADOG.getPrefixLength();
    }

    protected static boolean validateTagValue(com.datadog.trace.core.propagation.ptags.TagKey tagKey, com.datadog.trace.core.propagation.ptags.TagValue tagValue) {
        int i;
        int length;
        if (tagKey.equals(DECISION_MAKER_TAG)) {
            char highSpeedVideoFpsRanges = tagValue.getHighResolutionOutputSizeshNQ4ISI != com.datadog.trace.core.propagation.ptags.TagValue.Camera2StreamConfigurationMap ? com.datadog.trace.core.propagation.ptags.TagValue.getHighSpeedVideoFpsRanges('-') : '-';
            java.lang.CharSequence charSequence = tagValue.getHighSpeedVideoFpsRanges[tagValue.getHighResolutionOutputSizeshNQ4ISI];
            int length2 = charSequence.length();
            int i2 = -1;
            for (int i3 = 0; i3 < length2; i3++) {
                if (charSequence.charAt(i3) == highSpeedVideoFpsRanges) {
                    i2 = i3;
                }
            }
            if (i2 >= 0 && ((i2 == 0 || i2 == 10) && (i = i2 + 1) != (length = tagValue.length()))) {
                int i4 = 0;
                while (true) {
                    if (i4 >= i2) {
                        for (i = i2 + 1; i < length; i++) {
                            if (isDigit(tagValue.charAt(i))) {
                            }
                        }
                    } else {
                        if (!isHexDigit(tagValue.charAt(i4))) {
                            break;
                        }
                        i4++;
                    }
                }
            }
            return false;
        }
        if (!tagKey.equals(TRACE_ID_TAG)) {
            return true;
        }
        if (tagValue.length() == 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                if (isHexDigit(tagValue.charAt(i5))) {
                }
            }
            return true;
        }
        return false;
    }

    protected static boolean isHexDigit(char c) {
        return (c >= 'a' && c <= 'f') || isDigit(c);
    }
}
