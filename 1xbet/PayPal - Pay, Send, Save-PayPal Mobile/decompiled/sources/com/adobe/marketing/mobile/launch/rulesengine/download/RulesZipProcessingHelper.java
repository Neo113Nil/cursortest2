package com.adobe.marketing.mobile.launch.rulesengine.download;

/* loaded from: classes7.dex */
class RulesZipProcessingHelper {
    RulesZipProcessingHelper() {
    }

    static java.io.File getHighSpeedVideoFpsRanges(java.lang.String str) {
        java.lang.String sha2hash = com.adobe.marketing.mobile.util.StringEncoder.sha2hash(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getApplicationCacheDir().getPath());
        sb.append(java.io.File.separator);
        sb.append("aepsdktmp");
        sb.append(java.io.File.separator);
        sb.append(sha2hash);
        return new java.io.File(sb.toString());
    }

    static java.io.File getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getHighSpeedVideoFpsRanges(str).getPath());
        sb.append(java.io.File.separator);
        sb.append("rules.zip");
        return new java.io.File(sb.toString());
    }

    static boolean Camera2StreamConfigurationMap(java.lang.String str) {
        return !com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str);
    }

    final java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        if (!(!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str))) {
            return null;
        }
        java.io.File highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
        if (!com.adobe.marketing.mobile.internal.util.FileUtils.extractFromZip(getHighResolutionOutputSizeshNQ4ISI(str), highSpeedVideoFpsRanges.getPath())) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "RulesZipProcessingHelper", "Failed to extract rules response zip into temp dir.", new java.lang.Object[0]);
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(highSpeedVideoFpsRanges.getPath());
        sb.append(java.io.File.separator);
        sb.append("rules.json");
        java.io.File file = new java.io.File(sb.toString());
        if (!file.exists()) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "RulesZipProcessingHelper", "Extract rules directory does not contain a rules.json file.", new java.lang.Object[0]);
            return null;
        }
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                java.lang.String readAsString = com.adobe.marketing.mobile.util.StreamUtils.readAsString(fileInputStream);
                if (readAsString != null) {
                    fileInputStream.close();
                    return readAsString;
                }
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "RulesZipProcessingHelper", "Null content from rules.json file.", new java.lang.Object[0]);
                fileInputStream.close();
                return null;
            } finally {
            }
        } catch (java.io.IOException unused) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "RulesZipProcessingHelper", "Exception while processing rules from source %s", str);
            return null;
        }
    }
}
