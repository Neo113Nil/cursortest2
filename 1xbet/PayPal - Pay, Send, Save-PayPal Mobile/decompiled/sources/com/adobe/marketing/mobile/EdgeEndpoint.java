package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class EdgeEndpoint {
    final java.lang.String getHighSpeedVideoFpsRanges;

    enum EdgeEnvironmentType {
        PROD("prod"),
        PRE_PROD("pre-prod"),
        INT(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_INT);

        private static final java.util.Map<java.lang.String, com.adobe.marketing.mobile.EdgeEndpoint.EdgeEnvironmentType> getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
        private final java.lang.String getOutputMinFrameDuration;

        static {
            for (com.adobe.marketing.mobile.EdgeEndpoint.EdgeEnvironmentType edgeEnvironmentType : values()) {
                getHighSpeedVideoFpsRangesFor.put(edgeEnvironmentType.getOutputMinFrameDuration, edgeEnvironmentType);
            }
        }

        EdgeEnvironmentType(java.lang.String str) {
            this.getOutputMinFrameDuration = str;
        }

        static com.adobe.marketing.mobile.EdgeEndpoint.EdgeEnvironmentType getHighSpeedVideoFpsRanges(java.lang.String str) {
            if (str == null) {
                return PROD;
            }
            com.adobe.marketing.mobile.EdgeEndpoint.EdgeEnvironmentType edgeEnvironmentType = getHighSpeedVideoFpsRangesFor.get(str.toLowerCase(java.util.Locale.ROOT));
            return edgeEnvironmentType == null ? PROD : edgeEnvironmentType;
        }
    }

    EdgeEndpoint(com.adobe.marketing.mobile.EdgeNetworkService.RequestType requestType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        com.adobe.marketing.mobile.EdgeEndpoint.EdgeEnvironmentType highSpeedVideoFpsRanges = com.adobe.marketing.mobile.EdgeEndpoint.EdgeEnvironmentType.getHighSpeedVideoFpsRanges(str);
        str2 = com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2) ? "edge.adobedc.net" : str2;
        java.lang.String concat = !com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str4) ? androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR.concat(java.lang.String.valueOf(str4)) : "";
        int i = com.adobe.marketing.mobile.EdgeEndpoint.AnonymousClass1.Camera2StreamConfigurationMap[highSpeedVideoFpsRanges.ordinal()];
        if (i == 1) {
            sb.append("https://");
            sb.append(str2);
            sb.append("/ee-pre-prd");
        } else if (i == 2) {
            sb.append("https://edge-int.adobedc.net/ee");
        } else {
            sb.append("https://");
            sb.append(str2);
            sb.append("/ee");
        }
        sb.append(concat);
        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str3)) {
            sb.append(str3);
        } else {
            sb.append("/v1/");
            sb.append(requestType.type);
        }
        this.getHighSpeedVideoFpsRanges = sb.toString();
    }

    /* renamed from: com.adobe.marketing.mobile.EdgeEndpoint$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.adobe.marketing.mobile.EdgeEndpoint.EdgeEnvironmentType.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.adobe.marketing.mobile.EdgeEndpoint.EdgeEnvironmentType.PRE_PROD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.adobe.marketing.mobile.EdgeEndpoint.EdgeEnvironmentType.INT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }
}
