package my.com.softspace.sspog.attest;

/* loaded from: classes17.dex */
class HardwareInfo {
    private final java.lang.String ArtificialStackFrames;
    private org.json.JSONObject Camera2StreamConfigurationMap;
    private org.json.JSONObject accessartificialFrame;
    private org.json.JSONObject coroutineBoundary;
    private final java.lang.String getHighSpeedVideoSizes;
    private org.json.JSONObject getHighSpeedVideoSizesFor;
    private final java.lang.String getInputSizeshNQ4ISI;
    private final boolean getOutputSizeshNQ4ISI;
    private org.json.JSONObject getOutputStallDuration;
    private final java.lang.String getValidOutputFormatsForInputhNQ4ISI;
    private org.json.JSONObject toString;
    private static final java.util.regex.Pattern getHighSpeedVideoFpsRanges = java.util.regex.Pattern.compile("Hardware[\\t\\s]*:[\\t\\s]*(.*)");
    private static final java.util.regex.Pattern getHighSpeedVideoFpsRangesFor = java.util.regex.Pattern.compile("processor[\\t\\s]*:[\\t\\s]*(.*)");
    private static final java.util.regex.Pattern getHighResolutionOutputSizeshNQ4ISI = java.util.regex.Pattern.compile("Features[\\s\\t]*:[\\s\\t]*(.*)");
    private final java.lang.String getOutputFormats = android.os.Build.BOARD;
    private final java.lang.String getOutputMinFrameDuration = android.os.Build.BOOTLOADER;
    private final java.lang.String getInputFormats = android.os.Build.BRAND;
    private final java.lang.String getOutputSizes = android.os.Build.DEVICE;
    private final java.lang.String getOutputMinFrameDurationlomOqCM = android.os.Build.HARDWARE;
    private final java.lang.String isOutputSupportedForhNQ4ISI = android.os.Build.MANUFACTURER;
    private final java.lang.String isOutputSupportedFor = android.os.Build.MODEL;
    private final java.lang.String unwrapAs = android.os.Build.PRODUCT;
    private final java.lang.String getOutputStallDurationlomOqCM = android.os.Build.FINGERPRINT;

    HardwareInfo(android.content.Context context) {
        java.lang.String str;
        java.lang.String str2;
        long j;
        long j2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5 = "voltage";
        java.lang.String str6 = "temperature";
        if (android.os.Build.SUPPORTED_ABIS != null && android.os.Build.SUPPORTED_ABIS.length > 0) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            for (java.lang.String str7 : android.os.Build.SUPPORTED_ABIS) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                }
                stringBuffer.append(str7);
            }
            this.getInputSizeshNQ4ISI = stringBuffer.toString();
        } else {
            this.getInputSizeshNQ4ISI = null;
        }
        this.getValidOutputFormatsForInputhNQ4ISI = android.os.Build.getRadioVersion();
        if (context.getApplicationContext().getApplicationInfo().targetSdkVersion < 29) {
            this.ArtificialStackFrames = android.os.Build.getSerial();
        } else {
            this.ArtificialStackFrames = "Not Available";
        }
        this.getOutputSizeshNQ4ISI = "1".equals(android.provider.Settings.Global.getString(context.getContentResolver(), "adb_enabled"));
        this.getHighSpeedVideoSizes = android.provider.Settings.Secure.getString(context.getContentResolver(), a.b.l);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            int i = 1;
            java.lang.String runFailableCmd = my.com.softspace.common.util.AndroidUtil.runFailableCmd("/system/bin/cat /proc/cpuinfo");
            if (runFailableCmd == null) {
                str = "voltage";
                str2 = "temperature";
            } else {
                java.util.regex.Matcher matcher = getHighSpeedVideoFpsRanges.matcher(runFailableCmd);
                if (matcher.find()) {
                    jSONObject.putOpt("chipset", matcher.group(1));
                }
                java.util.regex.Matcher matcher2 = getHighResolutionOutputSizeshNQ4ISI.matcher(runFailableCmd);
                if (matcher2.find()) {
                    jSONObject.putOpt("features", matcher2.group(1));
                }
                java.util.regex.Matcher matcher3 = getHighSpeedVideoFpsRangesFor.matcher(runFailableCmd);
                int i2 = 0;
                long j3 = 0;
                long j4 = 0;
                while (matcher3.find()) {
                    java.lang.String group = matcher3.group(i);
                    java.lang.String runFailableCmd2 = my.com.softspace.common.util.AndroidUtil.runFailableCmd(Camera2StreamConfigurationMap(group, "min_freq"));
                    java.lang.String trim = runFailableCmd2 == null ? null : runFailableCmd2.trim();
                    if (trim != null) {
                        j = java.lang.Long.parseLong(trim);
                        if (j4 <= j) {
                            j4 = j;
                        }
                    } else {
                        j = 0;
                    }
                    java.lang.String runFailableCmd3 = my.com.softspace.common.util.AndroidUtil.runFailableCmd(Camera2StreamConfigurationMap(group, "max_freq"));
                    java.lang.String trim2 = runFailableCmd3 == null ? null : runFailableCmd3.trim();
                    if (trim2 != null) {
                        j2 = java.lang.Long.parseLong(trim2);
                        if (j3 <= j2) {
                            j3 = j2;
                        }
                    } else {
                        j2 = 0;
                    }
                    java.lang.String runFailableCmd4 = my.com.softspace.common.util.AndroidUtil.runFailableCmd(Camera2StreamConfigurationMap(group, "cur_freq"));
                    java.lang.String trim3 = runFailableCmd4 == null ? null : runFailableCmd4.trim();
                    java.util.regex.Matcher matcher4 = matcher3;
                    if (trim3 != null) {
                        long parseLong = java.lang.Long.parseLong(trim3);
                        str3 = str5;
                        if (parseLong > 0) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("cpu_");
                            sb.append(group);
                            sb.append("_current");
                            java.lang.String obj = sb.toString();
                            java.lang.Object[] objArr = {getHighSpeedVideoSizes(parseLong)};
                            str4 = str6;
                            jSONObject.putOpt(obj, java.lang.String.format("%s", objArr));
                        } else {
                            str4 = str6;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cpu_");
                            sb2.append(group);
                            sb2.append("_current");
                            jSONObject.putOpt(sb2.toString(), "-");
                        }
                    } else {
                        str3 = str5;
                        str4 = str6;
                    }
                    if (j <= 0 || j2 <= 0) {
                        jSONObject.putOpt("cpu_".concat(java.lang.String.valueOf(group)), "-");
                    } else {
                        jSONObject.putOpt("cpu_".concat(java.lang.String.valueOf(group)), java.lang.String.format("%s - %s", getHighSpeedVideoSizes(j), getHighSpeedVideoSizes(j2)));
                    }
                    i2++;
                    matcher3 = matcher4;
                    str6 = str4;
                    str5 = str3;
                    i = 1;
                }
                str = str5;
                str2 = str6;
                jSONObject.putOpt("cores", java.lang.Integer.valueOf(i2));
                if (j3 > 0 && j4 > 0) {
                    jSONObject.putOpt("clockSpeed", java.lang.String.format("%s - %s", getHighSpeedVideoSizes(j4), getHighSpeedVideoSizes(j3)));
                }
                java.lang.String runFailableCmd5 = my.com.softspace.common.util.AndroidUtil.runFailableCmd("/system/bin/cat /sys/devices/system/cpu/cpu0/cpufreq/scaling_governor");
                jSONObject.putOpt("governor", runFailableCmd5 == null ? null : runFailableCmd5.trim());
            }
            this.getHighSpeedVideoSizesFor = jSONObject;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            jSONObject2.putOpt("total", java.lang.Long.valueOf(memoryInfo.totalMem));
            jSONObject2.putOpt(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, java.lang.Long.valueOf(memoryInfo.availMem));
            jSONObject2.putOpt("threshold", java.lang.Long.valueOf(memoryInfo.threshold));
            jSONObject2.putOpt("lowMemory", java.lang.Boolean.valueOf(memoryInfo.lowMemory));
            this.toString = jSONObject2;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME)).getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getRealSize(point);
            android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            long round = java.lang.Math.round(displayMetrics.xdpi);
            long round2 = java.lang.Math.round(displayMetrics.ydpi);
            if (round <= round2) {
                round = round2;
            }
            double ceil = java.lang.Math.ceil(java.lang.Math.sqrt(java.lang.Math.pow(point.x / displayMetrics.xdpi, 2.0d) + java.lang.Math.pow(point.y / displayMetrics.ydpi, 2.0d)) * 100.0d) / 100.0d;
            jSONObject3.putOpt("width", java.lang.Integer.valueOf(point.x));
            jSONObject3.putOpt("height", java.lang.Integer.valueOf(point.y));
            jSONObject3.putOpt("ratio", java.lang.String.format(java.util.Locale.US, "%d - %d", java.lang.Integer.valueOf(point.x), java.lang.Integer.valueOf(point.y)));
            jSONObject3.putOpt("dpi", java.lang.Integer.valueOf((int) round));
            jSONObject3.putOpt(io.ktor.http.ContentDisposition.Parameters.Size, java.lang.Double.valueOf(ceil));
            this.coroutineBoundary = jSONObject3;
            this.accessartificialFrame = Camera2StreamConfigurationMap(context);
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            jSONObject4.putOpt("bluetooth", java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.bluetooth")));
            jSONObject4.putOpt("bluetooth_le", java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.bluetooth_le")));
            jSONObject4.putOpt(com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.camera.any")));
            jSONObject4.putOpt(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Fingerprint, java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.fingerprint")));
            jSONObject4.putOpt("location_gps", java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.location.gps")));
            jSONObject4.putOpt("location_network", java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.location.network")));
            jSONObject4.putOpt("microphone", java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.microphone")));
            jSONObject4.putOpt("nfc", java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.nfc")));
            jSONObject4.putOpt("nfc_hce", java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.nfc.hce")));
            jSONObject4.putOpt("telephony", java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.telephony")));
            jSONObject4.putOpt("usb_accessory", java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.usb.accessory")));
            jSONObject4.putOpt("usb_host", java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.usb.host")));
            jSONObject4.putOpt("wifi", java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.wifi")));
            jSONObject4.putOpt("wifi_direct", java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.wifi.direct")));
            this.getOutputStallDuration = jSONObject4;
            android.content.Intent registerReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            registerReceiver.getStringExtra("technology");
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            android.os.BatteryManager batteryManager = (android.os.BatteryManager) context.getSystemService("batterymanager");
            jSONObject5.putOpt("current_ctr", java.lang.Long.valueOf(batteryManager.getLongProperty(1)));
            jSONObject5.putOpt("current_now", java.lang.Long.valueOf(batteryManager.getLongProperty(2)));
            jSONObject5.putOpt("current_avg", java.lang.Long.valueOf(batteryManager.getLongProperty(3)));
            jSONObject5.putOpt("capacity", java.lang.Long.valueOf(batteryManager.getLongProperty(4)));
            jSONObject5.putOpt("energy_counter", java.lang.Long.valueOf(batteryManager.getLongProperty(5)));
            switch (registerReceiver.getIntExtra(com.google.android.libraries.places.api.model.PlaceTypes.HEALTH, 1)) {
                case 2:
                    jSONObject5.putOpt(com.google.android.libraries.places.api.model.PlaceTypes.HEALTH, "good");
                    break;
                case 3:
                    jSONObject5.putOpt(com.google.android.libraries.places.api.model.PlaceTypes.HEALTH, "over_heat");
                    break;
                case 4:
                    jSONObject5.putOpt(com.google.android.libraries.places.api.model.PlaceTypes.HEALTH, "dead");
                    break;
                case 5:
                    jSONObject5.putOpt(com.google.android.libraries.places.api.model.PlaceTypes.HEALTH, "over_voltage");
                    break;
                case 6:
                    jSONObject5.putOpt(com.google.android.libraries.places.api.model.PlaceTypes.HEALTH, com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE);
                    break;
                case 7:
                    jSONObject5.putOpt(com.google.android.libraries.places.api.model.PlaceTypes.HEALTH, "cold");
                    break;
                default:
                    jSONObject5.putOpt(com.google.android.libraries.places.api.model.PlaceTypes.HEALTH, "unknown");
                    break;
            }
            int intExtra = registerReceiver.getIntExtra("plugged", 0);
            if (intExtra == 1) {
                jSONObject5.putOpt("plugged", "ac");
            } else if (intExtra == 2) {
                jSONObject5.putOpt("plugged", "usb");
            } else if (intExtra == 4) {
                jSONObject5.putOpt("plugged", "wireless");
            } else {
                jSONObject5.putOpt("plugged", "no");
            }
            int intExtra2 = registerReceiver.getIntExtra("status", 1);
            if (intExtra2 == 2) {
                jSONObject5.putOpt("status", "charging");
            } else if (intExtra2 == 3) {
                jSONObject5.putOpt("status", "discharging");
            } else if (intExtra2 == 4) {
                jSONObject5.putOpt("status", "not_charging");
            } else if (intExtra2 == 5) {
                jSONObject5.putOpt("status", a.b.m);
            } else {
                jSONObject5.putOpt("status", "unknown");
            }
            jSONObject5.putOpt("level_cur", java.lang.Integer.valueOf(registerReceiver.getIntExtra("level", 0)));
            jSONObject5.putOpt("level_max", java.lang.Integer.valueOf(registerReceiver.getIntExtra("scale", 0)));
            jSONObject5.putOpt("present", java.lang.Boolean.valueOf(registerReceiver.getBooleanExtra("present", false)));
            jSONObject5.putOpt("technology", registerReceiver.getStringExtra("technology"));
            java.lang.String str8 = str2;
            jSONObject5.putOpt(str8, java.lang.Integer.valueOf(registerReceiver.getIntExtra(str8, 0)));
            java.lang.String str9 = str;
            jSONObject5.putOpt(str9, java.lang.Integer.valueOf(registerReceiver.getIntExtra(str9, 0)));
            this.Camera2StreamConfigurationMap = jSONObject5;
        } catch (java.lang.Exception unused) {
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(long j) {
        if (j >= 1000000000) {
            return java.lang.String.format(java.util.Locale.US, "%.02f THz", java.lang.Float.valueOf((j / 1000000) / 1000.0f));
        }
        if (j >= 1000000) {
            return java.lang.String.format(java.util.Locale.US, "%.02f GHz", java.lang.Float.valueOf((j / 1000) / 1000.0f));
        }
        if (j >= 1000) {
            return java.lang.String.format(java.util.Locale.US, "%d MHz", java.lang.Long.valueOf(j / 1000));
        }
        return java.lang.String.format(java.util.Locale.US, "%d kHz", java.lang.Long.valueOf(j));
    }

    private static org.json.JSONObject Camera2StreamConfigurationMap(android.content.Context context) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        long blockCountLong = statFs.getBlockCountLong();
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBytes = statFs.getAvailableBytes();
        jSONObject.putOpt("internal_total", java.lang.Long.valueOf(blockCountLong * blockSizeLong));
        jSONObject.putOpt("internal_available", java.lang.Long.valueOf(availableBytes));
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONObject.putOpt("external_mount", jSONArray);
        java.lang.String externalStorageState = android.os.Environment.getExternalStorageState();
        externalStorageState.hashCode();
        if (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) {
            try {
                for (java.io.File file : context.getExternalFilesDirs(null)) {
                    if (!android.os.Environment.isExternalStorageEmulated(file)) {
                        java.lang.String externalStorageState2 = android.os.Environment.getExternalStorageState(file);
                        if (externalStorageState2.equals("mounted") || externalStorageState2.equals("mounted_ro")) {
                            android.os.StatFs statFs2 = new android.os.StatFs(file.getPath());
                            jSONArray.put(new org.json.JSONObject().putOpt("total", java.lang.Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong())).putOpt(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, java.lang.Long.valueOf(statFs2.getAvailableBytes())).putOpt("removable", java.lang.Boolean.valueOf(android.os.Environment.isExternalStorageRemovable(file))).putOpt("emulated", java.lang.Boolean.valueOf(android.os.Environment.isExternalStorageEmulated(file))));
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return jSONObject;
    }

    private static java.lang.String[] Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("/system/bin/cat /sys/devices/system/cpu/cpu");
        sb.append(str);
        sb.append("/cpufreq/cpuinfo_");
        sb.append(str2);
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("/system/bin/cat /sys/devices/system/cpu/cpu");
        sb2.append(str);
        sb2.append("/cpufreq/scaling_");
        sb2.append(str2);
        return new java.lang.String[]{obj, sb2.toString()};
    }

    final org.json.JSONObject getHighSpeedVideoFpsRangesFor() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.putOpt("bootloader", this.getOutputMinFrameDuration);
            jSONObject.putOpt("model", this.isOutputSupportedFor);
            jSONObject.putOpt("product", this.unwrapAs);
            jSONObject.putOpt("manufacturer", this.isOutputSupportedForhNQ4ISI);
            jSONObject.putOpt("device", this.getOutputSizes);
            jSONObject.putOpt("brand", this.getInputFormats);
            jSONObject.putOpt(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Fingerprint, this.getOutputStallDurationlomOqCM);
            jSONObject.putOpt("board", this.getOutputFormats);
            jSONObject.putOpt("serialNumber", this.ArtificialStackFrames);
            jSONObject.putOpt("hardware", this.getOutputMinFrameDurationlomOqCM);
            jSONObject.putOpt("radioVersion", this.getValidOutputFormatsForInputhNQ4ISI);
            jSONObject.putOpt("supportABI", this.getInputSizeshNQ4ISI);
            jSONObject.putOpt("androidId", this.getHighSpeedVideoSizes);
            jSONObject.putOpt("isAdbEnable", java.lang.Boolean.valueOf(this.getOutputSizeshNQ4ISI));
            jSONObject.putOpt("cpu", this.getHighSpeedVideoSizesFor);
            jSONObject.putOpt("ram", this.toString);
            jSONObject.putOpt(com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, this.accessartificialFrame);
            jSONObject.putOpt("screen", this.coroutineBoundary);
            jSONObject.putOpt("features", this.getOutputStallDuration);
            jSONObject.putOpt("battery", this.Camera2StreamConfigurationMap);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }
}
