package com.datadog.trace.api.normalize;

/* loaded from: classes3.dex */
public class HttpResourceNames {
    private static com.datadog.trace.api.normalize.HttpResourceNames Camera2StreamConfigurationMap;
    public static final com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString DEFAULT_RESOURCE_NAME = com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString.create(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
    private static final com.datadog.android.trace.internal.compat.function.Function<com.datadog.trace.api.Pair<java.lang.CharSequence, java.lang.CharSequence>, com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString> getHighSpeedVideoSizes = new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.normalize.HttpResourceNames$$ExternalSyntheticLambda0
        @Override // com.datadog.android.trace.internal.compat.function.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return com.datadog.trace.api.normalize.HttpResourceNames.Camera2StreamConfigurationMap((com.datadog.trace.api.Pair) obj);
        }
    };
    private static final com.datadog.trace.api.cache.DDCache<com.datadog.trace.api.Pair<java.lang.CharSequence, java.lang.CharSequence>, java.lang.CharSequence> getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.api.cache.DDCaches.newFixedSizeCache(128);
    private static final com.datadog.trace.api.normalize.SimpleHttpPathNormalizer getHighSpeedVideoFpsRanges = new com.datadog.trace.api.normalize.SimpleHttpPathNormalizer();
    private final com.datadog.trace.api.normalize.AntPatternHttpPathNormalizer getHighSpeedVideoSizesFor = new com.datadog.trace.api.normalize.AntPatternHttpPathNormalizer(com.datadog.trace.api.Config.get().getHttpServerPathResourceNameMapping());
    private final com.datadog.trace.api.normalize.AntPatternHttpPathNormalizer getHighSpeedVideoFpsRangesFor = new com.datadog.trace.api.normalize.AntPatternHttpPathNormalizer(com.datadog.trace.api.Config.get().getHttpClientPathResourceNameMapping());
    private final boolean getOutputFormats = com.datadog.trace.api.Config.get().getHttpResourceRemoveTrailingSlash();

    static /* synthetic */ com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString Camera2StreamConfigurationMap(com.datadog.trace.api.Pair pair) {
        java.lang.StringBuilder sb;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) pair.getRight();
        if (charSequence == null) {
            return DEFAULT_RESOURCE_NAME;
        }
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) pair.getLeft();
        if (charSequence2 == null) {
            sb = new java.lang.StringBuilder(charSequence.length());
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(charSequence.length() + charSequence2.length() + 1);
            sb2.append(charSequence2);
            for (int i = 0; i < sb2.length(); i++) {
                sb2.setCharAt(i, java.lang.Character.toUpperCase(sb2.charAt(i)));
            }
            sb2.append(' ');
            sb = sb2;
        }
        int length = charSequence.length() - 1;
        if (Camera2StreamConfigurationMap == null) {
            Camera2StreamConfigurationMap = new com.datadog.trace.api.normalize.HttpResourceNames();
        }
        if (Camera2StreamConfigurationMap.getOutputFormats && length > 0 && charSequence.charAt(length) == '/') {
            sb.append(charSequence, 0, length);
        } else {
            sb.append(charSequence);
        }
        return com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString.create(sb);
    }

    private HttpResourceNames() {
    }

    public static com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setForServer(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z) {
        com.datadog.trace.api.Pair<java.lang.CharSequence, java.lang.Byte> computeForServer = computeForServer(charSequence, charSequence2, z);
        if (computeForServer.hasLeft()) {
            agentSpan.setResourceName(computeForServer.getLeft(), computeForServer.getRight().byteValue());
        }
        return agentSpan;
    }

    public static com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setForClient(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z) {
        com.datadog.trace.api.Pair<java.lang.CharSequence, java.lang.Byte> computeForClient = computeForClient(charSequence, charSequence2, z);
        if (computeForClient.hasLeft()) {
            agentSpan.setResourceName(computeForClient.getLeft(), computeForClient.getRight().byteValue());
        }
        return agentSpan;
    }

    public static java.lang.CharSequence join(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        return getHighResolutionOutputSizeshNQ4ISI.computeIfAbsent(com.datadog.trace.api.Pair.of(charSequence, charSequence2), getHighSpeedVideoSizes);
    }

    public static com.datadog.trace.api.Pair<java.lang.CharSequence, java.lang.Byte> computeForClient(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z) {
        byte b;
        if (Camera2StreamConfigurationMap == null) {
            Camera2StreamConfigurationMap = new com.datadog.trace.api.normalize.HttpResourceNames();
        }
        java.lang.String normalize = Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor.normalize(charSequence2.toString(), z);
        if (normalize != null) {
            b = 4;
        } else {
            normalize = getHighSpeedVideoFpsRanges.normalize(charSequence2.toString(), z);
            b = 1;
        }
        return com.datadog.trace.api.Pair.of(join(charSequence, normalize), java.lang.Byte.valueOf(b));
    }

    public static com.datadog.trace.api.Pair<java.lang.CharSequence, java.lang.Byte> computeForServer(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z) {
        byte b;
        if (Camera2StreamConfigurationMap == null) {
            Camera2StreamConfigurationMap = new com.datadog.trace.api.normalize.HttpResourceNames();
        }
        java.lang.String normalize = Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor.normalize(charSequence2.toString(), z);
        if (normalize != null) {
            b = 4;
        } else {
            normalize = getHighSpeedVideoFpsRanges.normalize(charSequence2.toString(), z);
            b = 1;
        }
        return com.datadog.trace.api.Pair.of(join(charSequence, normalize), java.lang.Byte.valueOf(b));
    }
}
