package com.adjust.sdk.oaid;

/* loaded from: classes2.dex */
public class Util {
    public static synchronized java.util.Map<java.lang.String, java.lang.String> getOaidParameters(android.content.Context context, com.adjust.sdk.ILogger iLogger) {
        synchronized (com.adjust.sdk.oaid.Util.class) {
            if (!com.adjust.sdk.oaid.AdjustOaid.isOaidToBeRead) {
                return null;
            }
            if (isManufacturerHuawei(iLogger)) {
                java.util.Map<java.lang.String, java.lang.String> oaidParametersUsingHms = getOaidParametersUsingHms(context, iLogger);
                if (oaidParametersUsingHms != null) {
                    return oaidParametersUsingHms;
                }
                return getOaidParametersUsingMsa(context, iLogger);
            }
            java.util.Map<java.lang.String, java.lang.String> oaidParametersUsingMsa = getOaidParametersUsingMsa(context, iLogger);
            if (oaidParametersUsingMsa != null) {
                return oaidParametersUsingMsa;
            }
            return getOaidParametersUsingHms(context, iLogger);
        }
    }

    private static boolean isManufacturerHuawei(com.adjust.sdk.ILogger iLogger) {
        try {
            java.lang.String str = android.os.Build.MANUFACTURER;
            if (str != null) {
                if (str.equalsIgnoreCase("huawei")) {
                    return true;
                }
            }
        } catch (java.lang.Exception unused) {
            iLogger.debug("Manufacturer not available", new java.lang.Object[0]);
        }
        return false;
    }

    private static java.util.Map<java.lang.String, java.lang.String> getOaidParametersUsingHms(android.content.Context context, com.adjust.sdk.ILogger iLogger) {
        for (int i = 1; i <= 2; i++) {
            com.adjust.sdk.oaid.OaidInfo oaidInfo = com.adjust.sdk.oaid.HmsSdkClient.getOaidInfo(context, iLogger, i * 3000);
            if (oaidInfo != null && oaidInfo.getOaid() != null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                com.adjust.sdk.PackageBuilder.addString(hashMap, "oaid", oaidInfo.getOaid());
                com.adjust.sdk.PackageBuilder.addBoolean(hashMap, "oaid_tracking_enabled", java.lang.Boolean.valueOf(oaidInfo.isTrackingEnabled()));
                com.adjust.sdk.PackageBuilder.addString(hashMap, "oaid_src", "hms");
                com.adjust.sdk.PackageBuilder.addLong(hashMap, "oaid_attempt", i);
                return hashMap;
            }
        }
        iLogger.debug("Fail to read the OAID using HMS", new java.lang.Object[0]);
        return null;
    }

    private static java.util.Map<java.lang.String, java.lang.String> getOaidParametersUsingMsa(android.content.Context context, com.adjust.sdk.ILogger iLogger) {
        if (!com.adjust.sdk.oaid.AdjustOaid.isMsaSdkAvailable) {
            return null;
        }
        for (int i = 1; i <= 2; i++) {
            com.adjust.sdk.oaid.OaidInfo oaidInfo = com.adjust.sdk.oaid.MsaSdkClient.getOaidInfo(context, iLogger, i * 3000);
            if (oaidInfo != null && oaidInfo.getOaid() != null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                com.adjust.sdk.PackageBuilder.addString(hashMap, "oaid", oaidInfo.getOaid());
                com.adjust.sdk.PackageBuilder.addBoolean(hashMap, "oaid_tracking_enabled", java.lang.Boolean.valueOf(oaidInfo.isTrackingEnabled()));
                com.adjust.sdk.PackageBuilder.addString(hashMap, "oaid_src", "msa");
                com.adjust.sdk.PackageBuilder.addLong(hashMap, "oaid_attempt", i);
                return hashMap;
            }
        }
        iLogger.debug("Fail to read the OAID using MSA", new java.lang.Object[0]);
        return null;
    }

    public static java.lang.String readCertFromAssetFile(android.content.Context context, com.adjust.sdk.ILogger iLogger) {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(context.getAssets().open(context.getPackageName() + ".cert.pem")));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    return sb.toString();
                }
            }
        } catch (java.lang.Exception e) {
            iLogger.error("readCertFromAssetFile Error reading asset file: " + e.getMessage(), new java.lang.Object[0]);
            return "";
        }
    }
}
