package my.com.softspace.sspog.attest;

/* loaded from: classes17.dex */
class ApplicationInfo {
    private boolean Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "SSPOGService";
    private long getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private long getOutputFormats;
    private boolean getOutputMinFrameDuration;
    private java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getOutputMinFrameDurationlomOqCM;
    private java.lang.String getOutputSizes;
    private org.json.JSONObject getOutputSizeshNQ4ISI;
    private java.lang.String[] getOutputStallDuration;
    private java.util.List<android.util.Pair<java.lang.String, java.lang.Boolean>> getOutputStallDurationlomOqCM;
    private java.lang.String isOutputSupportedForhNQ4ISI;
    private int toString;

    ApplicationInfo(android.content.Context context, byte[] bArr, boolean z, boolean z2) {
        android.content.pm.Signature[] signatureArr;
        this.getOutputStallDuration = null;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            this.Camera2StreamConfigurationMap = (context.getApplicationInfo().flags & 2) > 0;
            if (z) {
                this.Camera2StreamConfigurationMap = false;
            }
            this.getOutputSizes = my.com.softspace.sspog.BuildConfig.SDK_VERSION;
            this.toString = packageInfo.versionCode;
            this.isOutputSupportedForhNQ4ISI = packageInfo.versionName;
            java.lang.String packageName = context.getPackageName();
            this.getHighSpeedVideoFpsRangesFor = packageName;
            this.getHighSpeedVideoSizesFor = packageManager.getInstallerPackageName(packageName);
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                signatureArr = packageManager.getPackageInfo(this.getHighSpeedVideoFpsRangesFor, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo.getApkContentsSigners();
            } else {
                signatureArr = packageManager.getPackageInfo(this.getHighSpeedVideoFpsRangesFor, 64).signatures;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                this.getOutputStallDuration = new java.lang.String[signatureArr.length];
                for (int i = 0; i < signatureArr.length; i++) {
                    this.getOutputStallDuration[i] = android.util.Base64.encodeToString(getHighSpeedVideoFpsRangesFor(bArr, signatureArr[i].toByteArray()), 2);
                }
            }
            this.getHighSpeedVideoFpsRanges = java.lang.System.currentTimeMillis();
            this.getOutputFormats = android.os.SystemClock.elapsedRealtime();
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
            this.getOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(runningAppProcessInfo);
            sspog.SimpleLogger.d("SSPOGService", "detailDebug %b", java.lang.Boolean.valueOf(z2));
            if (z2) {
                try {
                    this.getOutputSizeshNQ4ISI.putOpt("statm", getHighResolutionOutputSizeshNQ4ISI(runningAppProcessInfo.pid, "statm"));
                    this.getOutputSizeshNQ4ISI.putOpt("status", getHighResolutionOutputSizeshNQ4ISI(runningAppProcessInfo.pid, "status"));
                    this.getOutputSizeshNQ4ISI.putOpt("cmdline", getHighResolutionOutputSizeshNQ4ISI(runningAppProcessInfo.pid, "cmdline"));
                    this.getOutputSizeshNQ4ISI.putOpt("maps", getHighResolutionOutputSizeshNQ4ISI(runningAppProcessInfo.pid, "maps"));
                } catch (java.lang.Exception e) {
                    sspog.SimpleLogger.e("SSPOGService", e, "fail to get process file.", new java.lang.Object[0]);
                }
            }
            java.io.File file = new java.io.File(context.getApplicationInfo().nativeLibraryDir);
            if (file.exists()) {
                this.getOutputMinFrameDurationlomOqCM = new java.util.ArrayList();
                for (java.io.File file2 : file.listFiles()) {
                    try {
                        byte[] calculateSha256OfFile = my.com.softspace.common.util.AndroidUtil.calculateSha256OfFile(file2);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(java.io.File.separatorChar);
                        sb.append(file2.getParentFile().getParentFile().getName());
                        sb.append(java.io.File.separatorChar);
                        sb.append(file2.getParentFile().getName());
                        sb.append(java.io.File.separatorChar);
                        sb.append(file2.getName());
                        this.getOutputMinFrameDurationlomOqCM.add(new android.util.Pair<>(sb.toString(), android.util.Base64.encodeToString(calculateSha256OfFile, 2)));
                    } catch (java.lang.Exception e2) {
                        sspog.SimpleLogger.e("SSPOGService", e2.getMessage(), e2);
                    }
                }
            }
            this.getHighSpeedVideoSizes = android.util.Base64.encodeToString(my.com.softspace.common.util.AndroidUtil.calculateSha256OfFile(new java.io.File(context.getApplicationInfo().sourceDir)), 2);
            this.getOutputStallDurationlomOqCM = new java.util.ArrayList();
            try {
                android.content.pm.PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                for (int i2 = 0; i2 < packageInfo2.requestedPermissions.length; i2++) {
                    java.lang.String str = packageInfo2.requestedPermissions[i2];
                    boolean z3 = (packageInfo2.requestedPermissionsFlags[i2] & 2) != 0;
                    if (str != null && !str.isEmpty()) {
                        this.getOutputStallDurationlomOqCM.add(new android.util.Pair<>(str, java.lang.Boolean.valueOf(z3)));
                    }
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                sspog.SimpleLogger.e("SSPOGService", e3.getMessage(), e3);
            }
            android.view.Display[] displays = ((android.hardware.display.DisplayManager) context.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)).getDisplays();
            this.getOutputMinFrameDuration = (displays != null && displays.length > 1) || ((context instanceof android.app.Activity) && ((android.app.Activity) context).isInMultiWindowMode());
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
            if (windowManager != null) {
                android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                this.getInputFormats = (defaultDisplay == null || defaultDisplay.getDisplayId() == 0) ? false : true;
            }
            if (context instanceof android.app.Activity) {
                this.getInputSizeshNQ4ISI = (((android.app.Activity) context).getWindow().getAttributes().flags & 8192) == 0;
            }
        } catch (java.lang.Exception e4) {
            sspog.SimpleLogger.e("SSPOGService", e4.getMessage(), e4);
        }
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("/proc/");
        sb.append(i);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(str);
        java.lang.String obj = sb.toString();
        java.io.File file = new java.io.File(obj);
        sspog.SimpleLogger.d("SSPOGService", "reading path: %s, exist: %b, canRead: %b", obj, java.lang.Boolean.valueOf(file.exists()), java.lang.Boolean.valueOf(file.canRead()));
        if (!file.exists() || !file.canRead()) {
            return null;
        }
        byte[] bArr = new byte[2048];
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                while (true) {
                    int read = fileInputStream.read(bArr, 0, 2048);
                    if (read > 0) {
                        stringWriter.append((java.lang.CharSequence) new java.lang.String(bArr, 0, read));
                    } else {
                        java.lang.String obj2 = stringWriter.toString();
                        fileInputStream.close();
                        return obj2;
                    }
                }
            } finally {
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    private static org.json.JSONObject Camera2StreamConfigurationMap(android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.putOpt("processName", runningAppProcessInfo.processName);
            jSONObject.putOpt("pid", java.lang.Integer.valueOf(runningAppProcessInfo.pid));
            jSONObject.putOpt("uid", java.lang.Integer.valueOf(runningAppProcessInfo.uid));
            jSONObject.putOpt("important", java.lang.Integer.valueOf(runningAppProcessInfo.importance));
            jSONObject.putOpt("importanceReasonCode", java.lang.Integer.valueOf(runningAppProcessInfo.importanceReasonCode));
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length == 32) {
            try {
                javax.crypto.Mac mac = javax.crypto.Mac.getInstance(org.jose4j.mac.MacUtil.HMAC_SHA256);
                mac.init(new javax.crypto.spec.SecretKeySpec(bArr, org.jose4j.mac.MacUtil.HMAC_SHA256));
                return mac.doFinal(bArr2);
            } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException e) {
                sspog.SimpleLogger.e("cpplog", e, "not manage to perform hmac digest. returning original data. ", new java.lang.Object[0]);
            }
        }
        return bArr2;
    }

    final org.json.JSONObject Camera2StreamConfigurationMap() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.putOpt(com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG, java.lang.Boolean.valueOf(this.Camera2StreamConfigurationMap));
            jSONObject.putOpt("versionCode", java.lang.Integer.valueOf(this.toString));
            jSONObject.putOpt("versionName", this.isOutputSupportedForhNQ4ISI);
            jSONObject.putOpt(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.APPLICATION_ID_KEY, this.getHighSpeedVideoFpsRangesFor);
            jSONObject.putOpt("installerPackageName", this.getHighSpeedVideoSizesFor);
            jSONObject.putOpt("libPogVersion", this.getOutputSizes);
            jSONObject.put("currentTime", this.getHighSpeedVideoFpsRanges);
            jSONObject.put("elapsedTime", this.getOutputFormats);
            jSONObject.putOpt("myProcess", this.getOutputSizeshNQ4ISI);
            java.lang.String[] strArr = this.getOutputStallDuration;
            if (strArr != null && strArr.length > 0) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (java.lang.String str : this.getOutputStallDuration) {
                    jSONArray.put(str);
                }
                jSONObject.putOpt("signatures", jSONArray);
            }
            java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list = this.getOutputMinFrameDurationlomOqCM;
            if (list != null && list.size() > 0) {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                for (android.util.Pair<java.lang.String, java.lang.String> pair : this.getOutputMinFrameDurationlomOqCM) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("filename", pair.first);
                    jSONObject2.put("hash", pair.second);
                    jSONArray2.put(jSONObject2);
                }
                jSONObject.putOpt("nativeLibs", jSONArray2);
            }
            java.util.List<android.util.Pair<java.lang.String, java.lang.Boolean>> list2 = this.getOutputStallDurationlomOqCM;
            if (list2 != null && list2.size() > 0) {
                org.json.JSONArray jSONArray3 = new org.json.JSONArray();
                for (android.util.Pair<java.lang.String, java.lang.Boolean> pair2 : this.getOutputStallDurationlomOqCM) {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put(com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, pair2.first);
                    jSONObject3.put("granted", pair2.second);
                    jSONArray3.put(jSONObject3);
                }
                jSONObject.putOpt("allPermissions", jSONArray3);
            }
            jSONObject.putOpt("apkHash", this.getHighSpeedVideoSizes);
            jSONObject.putOpt("isMultipleScreen", java.lang.Boolean.valueOf(this.getOutputMinFrameDuration));
            jSONObject.putOpt("isScreenCaptureEnable", java.lang.Boolean.valueOf(this.getInputSizeshNQ4ISI));
            jSONObject.putOpt("isScreenResizable", java.lang.Boolean.valueOf(this.getInputFormats));
        } catch (org.json.JSONException unused) {
        }
        sspog.SimpleLogger.d("SSPOGService", jSONObject.toString(), new java.lang.Object[0]);
        return jSONObject;
    }
}
