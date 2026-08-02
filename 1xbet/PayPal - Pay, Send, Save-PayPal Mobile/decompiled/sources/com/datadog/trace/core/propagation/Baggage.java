package com.datadog.trace.core.propagation;

/* loaded from: classes3.dex */
public final class Baggage {
    private static final com.datadog.trace.util.PercentEscaper getHighSpeedVideoFpsRangesFor = com.datadog.trace.util.PercentEscaper.create();
    private final java.util.HashMap<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges = new java.util.HashMap<>();

    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRanges.isEmpty();
    }

    public final com.datadog.trace.core.propagation.Baggage put(java.lang.String str, java.lang.String str2) {
        this.getHighSpeedVideoFpsRanges.put(str, str2);
        return this;
    }

    public final com.datadog.trace.core.propagation.Baggage mergeWith(com.datadog.trace.core.propagation.Baggage baggage) {
        if (baggage != null) {
            this.getHighSpeedVideoFpsRanges.putAll(baggage.asMap());
        }
        return this;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : asMap().entrySet()) {
            if (i > 0) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            }
            com.datadog.trace.util.PercentEscaper percentEscaper = getHighSpeedVideoFpsRangesFor;
            com.datadog.trace.util.PercentEscaper.Escaped escapeKey = percentEscaper.escapeKey(entry.getKey());
            com.datadog.trace.util.PercentEscaper.Escaped escapeValue = percentEscaper.escapeValue(entry.getValue());
            sb.append(escapeKey.data);
            sb.append('=');
            sb.append(escapeValue.data);
            i++;
        }
        return sb.toString();
    }

    public final java.util.Map<java.lang.String, java.lang.String> asMap() {
        return new java.util.HashMap(this.getHighSpeedVideoFpsRanges);
    }

    public static com.datadog.trace.core.propagation.Baggage from(java.lang.String str) {
        if (str == null) {
            return new com.datadog.trace.core.propagation.Baggage();
        }
        int indexOf = str.indexOf(44);
        if (indexOf == -1) {
            indexOf = str.length();
        }
        int indexOf2 = str.indexOf(61);
        com.datadog.trace.core.propagation.Baggage baggage = new com.datadog.trace.core.propagation.Baggage();
        int i = 0;
        while (indexOf2 != -1) {
            if (indexOf2 > indexOf) {
                return new com.datadog.trace.core.propagation.Baggage();
            }
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str.substring(i, indexOf2).trim());
            java.lang.String highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(str.substring(indexOf2 + 1, indexOf).trim());
            if (highSpeedVideoFpsRangesFor.isEmpty() || highSpeedVideoFpsRangesFor2.isEmpty()) {
                return new com.datadog.trace.core.propagation.Baggage();
            }
            baggage.put(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2);
            i = indexOf + 1;
            indexOf2 = str.indexOf(61, i);
            indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
        }
        return baggage;
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        try {
            return java.net.URLDecoder.decode(str, "UTF-8");
        } catch (java.io.UnsupportedEncodingException | java.lang.IllegalArgumentException unused) {
            return str;
        }
    }
}
