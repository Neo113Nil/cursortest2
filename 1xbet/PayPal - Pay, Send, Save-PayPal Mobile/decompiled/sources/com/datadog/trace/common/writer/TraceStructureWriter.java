package com.datadog.trace.common.writer;

/* loaded from: classes8.dex */
public class TraceStructureWriter implements com.datadog.trace.common.writer.Writer {
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoFpsRangesFor = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.common.writer.TraceStructureWriter.class);
    private static final java.util.regex.Pattern getHighSpeedVideoSizes = java.util.regex.Pattern.compile(io.ktor.sse.ServerSentEventKt.COLON, 16);
    private final boolean Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final java.io.PrintStream getInputFormats;

    @Override // com.datadog.trace.common.writer.Writer
    public void incrementDropCounts(int i) {
    }

    @Override // com.datadog.trace.common.writer.Writer
    public void start() {
    }

    public TraceStructureWriter() {
        this("", false);
    }

    public TraceStructureWriter(boolean z) {
        this("", z);
    }

    public TraceStructureWriter(java.lang.String str) {
        this(str, false);
    }

    public TraceStructureWriter(java.lang.String str, boolean z) {
        str = str == null ? "" : str;
        boolean z2 = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            str = str.substring(1);
        }
        try {
            java.lang.String[] split = getHighSpeedVideoSizes.split(str);
            java.lang.String str2 = split[0];
            this.getInputFormats = str2.isEmpty() ? java.lang.System.out : new java.io.PrintStream(new java.io.FileOutputStream(str2));
            boolean z3 = false;
            for (int i = 1; i < split.length; i++) {
                java.lang.String lowerCase = split[i].toLowerCase(java.util.Locale.ROOT);
                int hashCode = lowerCase.hashCode();
                if (hashCode == -321297139) {
                    if (lowerCase.equals("includeservice")) {
                        z3 = true;
                    }
                    getHighSpeedVideoFpsRangesFor.warn("Illegal TraceStructureWriter argument '{}'", split[i]);
                } else if (hashCode != 547817489) {
                    if (hashCode == 1204416694 && lowerCase.equals("includeresource")) {
                        z2 = true;
                    }
                    getHighSpeedVideoFpsRangesFor.warn("Illegal TraceStructureWriter argument '{}'", split[i]);
                } else {
                    if (lowerCase.equals("debuglog")) {
                        z = true;
                    }
                    getHighSpeedVideoFpsRangesFor.warn("Illegal TraceStructureWriter argument '{}'", split[i]);
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            this.Camera2StreamConfigurationMap = z2;
            this.getHighSpeedVideoFpsRanges = z3;
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Failed to create trace structure writer from ".concat(java.lang.String.valueOf(str)), e);
        }
    }

    @Override // com.datadog.trace.common.writer.Writer
    public void write(java.util.List<com.datadog.trace.core.DDSpan> list) {
        if (list.isEmpty()) {
            Camera2StreamConfigurationMap(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI, null, 0L);
            return;
        }
        byte b = 0;
        com.datadog.trace.api.DDTraceId traceId = list.get(0).getTraceId();
        long spanId = list.get(0).getSpanId();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.datadog.trace.core.DDSpan dDSpan : list) {
            if (dDSpan.mo10034getLocalRootSpan() == dDSpan) {
                spanId = dDSpan.getSpanId();
            }
            hashMap.put(java.lang.Long.valueOf(dDSpan.getSpanId()), new com.datadog.trace.common.writer.TraceStructureWriter.Node(dDSpan, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, b));
        }
        for (com.datadog.trace.core.DDSpan dDSpan2 : list) {
            if (!traceId.equals(dDSpan2.getTraceId())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Trace ");
                sb.append(traceId);
                sb.append(" has broken trace link at ");
                sb.append(dDSpan2.getSpanId());
                sb.append("(");
                sb.append((java.lang.Object) dDSpan2.getOperationName());
                sb.append(")->");
                sb.append(dDSpan2.getTraceId());
                java.lang.String obj = sb.toString();
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    getHighSpeedVideoFpsRangesFor.error(obj);
                    return;
                }
                return;
            }
            if (spanId != dDSpan2.getSpanId()) {
                com.datadog.trace.common.writer.TraceStructureWriter.Node node = (com.datadog.trace.common.writer.TraceStructureWriter.Node) hashMap.get(java.lang.Long.valueOf(dDSpan2.getParentId()));
                if (node == null) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Trace ");
                    sb2.append(traceId);
                    sb2.append(" has broken parent link at ");
                    sb2.append(dDSpan2.getSpanId());
                    sb2.append("(");
                    sb2.append((java.lang.Object) dDSpan2.getOperationName());
                    sb2.append(")->");
                    sb2.append(dDSpan2.getParentId());
                    java.lang.String obj2 = sb2.toString();
                    if (this.getHighResolutionOutputSizeshNQ4ISI) {
                        getHighSpeedVideoFpsRangesFor.error(obj2);
                    }
                    node = (com.datadog.trace.common.writer.TraceStructureWriter.Node) hashMap.get(java.lang.Long.valueOf(spanId));
                }
                node.getHighResolutionOutputSizeshNQ4ISI.add((com.datadog.trace.common.writer.TraceStructureWriter.Node) hashMap.get(java.lang.Long.valueOf(dDSpan2.getSpanId())));
            }
        }
        Camera2StreamConfigurationMap(java.lang.String.valueOf(hashMap.get(java.lang.Long.valueOf(spanId))), traceId, spanId);
    }

    private void Camera2StreamConfigurationMap(java.lang.String str, com.datadog.trace.api.DDTraceId dDTraceId, long j) {
        this.getInputFormats.println(str);
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            com.datadog.trace.logger.Logger logger = getHighSpeedVideoFpsRangesFor;
            if (logger.isDebugEnabled()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (dDTraceId != null) {
                    sb.append("t_id=");
                    sb.append(dDTraceId);
                }
                if (j != 0) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append("s_id=");
                    sb.append(com.datadog.trace.api.DDSpanId.toString(j));
                }
                if (sb.length() > 0) {
                    sb.append(" -> ");
                }
                logger.debug("{}wrote {}", sb, str);
            }
        }
    }

    @Override // com.datadog.trace.common.writer.Writer
    public boolean flush() {
        this.getInputFormats.flush();
        return true;
    }

    @Override // com.datadog.trace.common.writer.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.getInputFormats != java.lang.System.out) {
            this.getInputFormats.close();
        }
    }

    static final class Node {
        private final java.lang.CharSequence Camera2StreamConfigurationMap;
        final java.util.List<com.datadog.trace.common.writer.TraceStructureWriter.Node> getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.CharSequence getHighSpeedVideoFpsRanges;
        private final java.lang.CharSequence getHighSpeedVideoFpsRangesFor;

        private Node(com.datadog.trace.core.DDSpan dDSpan, boolean z, boolean z2) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRanges = dDSpan.getOperationName();
            this.Camera2StreamConfigurationMap = z2 ? dDSpan.getResourceName() : null;
            this.getHighSpeedVideoFpsRangesFor = z ? dDSpan.getServiceName() : null;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            java.lang.CharSequence charSequence = this.getHighSpeedVideoFpsRangesFor;
            if (charSequence != null) {
                sb.append(charSequence);
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            }
            sb.append(this.getHighSpeedVideoFpsRanges);
            if (this.Camera2StreamConfigurationMap != null) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                sb.append(this.Camera2StreamConfigurationMap);
            }
            java.util.Iterator<com.datadog.trace.common.writer.TraceStructureWriter.Node> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
            }
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        }

        /* synthetic */ Node(com.datadog.trace.core.DDSpan dDSpan, boolean z, boolean z2, byte b) {
            this(dDSpan, z, z2);
        }
    }
}
