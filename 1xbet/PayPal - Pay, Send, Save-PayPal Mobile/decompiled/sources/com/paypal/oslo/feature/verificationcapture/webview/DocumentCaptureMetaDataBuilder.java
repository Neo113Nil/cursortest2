package com.paypal.oslo.feature.verificationcapture.webview;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/webview/DocumentCaptureMetaDataBuilder;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "imageBytes", "", "documentSide", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;", "deviceCaptureData", "partyId", "", "isStage", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE, "extractedData", "build", "(Landroid/content/Context;[BLjava/lang/String;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "p0", "p1", "Lorg/json/JSONObject;", "getHighSpeedVideoFpsRangesFor", "(Landroid/content/Context;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;)Lorg/json/JSONObject;", "Lorg/json/JSONArray;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONArray;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "serializeDeviceCaptureDataLegacy$verification_capture_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DocumentCaptureMetaDataBuilder {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.webview.DocumentCaptureMetaDataBuilder INSTANCE = new com.paypal.oslo.feature.verificationcapture.webview.DocumentCaptureMetaDataBuilder();

    private DocumentCaptureMetaDataBuilder() {
    }

    public final java.lang.String build(android.content.Context context, byte[] imageBytes, java.lang.String documentSide, com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData deviceCaptureData, java.lang.String partyId, boolean isStage, java.lang.String barcode, java.lang.String extractedData) {
        org.json.JSONArray highResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo sdkInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageBytes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partyId, "");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String calculateMD5$verification_capture_prodRelease = com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder.INSTANCE.calculateMD5$verification_capture_prodRelease(imageBytes);
            jSONObject.put("md5", calculateMD5$verification_capture_prodRelease);
            com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder faceTecIntermediateResultBuilder = com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder.INSTANCE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(partyId);
            sb.append("#");
            sb.append(calculateMD5$verification_capture_prodRelease);
            jSONObject.put("checksum", faceTecIntermediateResultBuilder.encryptDocString$verification_capture_prodRelease(sb.toString(), isStage));
            java.lang.String version = (deviceCaptureData == null || (sdkInfo = deviceCaptureData.getSdkInfo()) == null) ? null : sdkInfo.getVersion();
            if (version == null) {
                version = "";
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "Native");
            jSONObject2.put("version", version);
            jSONObject.put("sdk_info", jSONObject2);
            jSONObject.put("dev_info", getHighSpeedVideoFpsRangesFor(context, deviceCaptureData));
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("schema_id", "11F0-0A11-9B143630-9D6F-741A5148515C");
            try {
                if (deviceCaptureData != null) {
                    java.lang.String serializeDeviceCaptureDataLegacy$verification_capture_prodRelease = serializeDeviceCaptureDataLegacy$verification_capture_prodRelease(deviceCaptureData);
                    jSONObject3.put("encrypted_payload", com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder.INSTANCE.aesGcmEncrypt$verification_capture_prodRelease(serializeDeviceCaptureDataLegacy$verification_capture_prodRelease, partyId));
                    jSONObject3.put("payload", org.json.JSONObject.NULL);
                    com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder faceTecIntermediateResultBuilder2 = com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder.INSTANCE;
                    byte[] bytes = serializeDeviceCaptureDataLegacy$verification_capture_prodRelease.getBytes(kotlin.text.Charsets.UTF_8);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                    java.lang.String calculateSHA256$verification_capture_prodRelease = faceTecIntermediateResultBuilder2.calculateSHA256$verification_capture_prodRelease(bytes);
                    com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder faceTecIntermediateResultBuilder3 = com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder.INSTANCE;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(partyId);
                    sb2.append("#");
                    sb2.append(calculateMD5$verification_capture_prodRelease);
                    sb2.append("#");
                    sb2.append(calculateSHA256$verification_capture_prodRelease);
                    jSONObject3.put("checksum", faceTecIntermediateResultBuilder3.encryptDocString$verification_capture_prodRelease(sb2.toString(), isStage));
                } else {
                    jSONObject3.put("encrypted_payload", "");
                    jSONObject3.put("payload", org.json.JSONObject.NULL);
                    jSONObject3.put("checksum", "");
                }
                jSONObject.put("capture_data", jSONObject3);
                jSONObject.put("side", documentSide);
                jSONObject.put("collection_type", "SDK");
                jSONObject.put("verifier", "v1.0");
                java.lang.String str = barcode;
                if (str != null && str.length() != 0) {
                    com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder faceTecIntermediateResultBuilder4 = com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder.INSTANCE;
                    byte[] bytes2 = barcode.getBytes(kotlin.text.Charsets.UTF_8);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "");
                    java.lang.String calculateMD5$verification_capture_prodRelease2 = faceTecIntermediateResultBuilder4.calculateMD5$verification_capture_prodRelease(bytes2);
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    jSONObject4.put("checksum", com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder.INSTANCE.encryptDocString$verification_capture_prodRelease(calculateMD5$verification_capture_prodRelease2, isStage));
                    jSONObject4.put("encoded_raw_data", com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder.INSTANCE.aesGcmEncrypt$verification_capture_prodRelease(barcode, partyId));
                    jSONObject.put("barcode_info", jSONObject4);
                }
                java.lang.String str2 = extractedData;
                if (str2 != null && str2.length() != 0 && (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(extractedData, partyId)) != null) {
                    jSONObject.put("extracted_infos", highResolutionOutputSizeshNQ4ISI);
                }
                return jSONObject.toString();
            } catch (java.lang.Exception e) {
                e = e;
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "Unknown";
                }
                com.paypal.android.logger.Logger.e$default(logger, "[DocumentCapture] Failed to build metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, null, 12, null);
                return null;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r2 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static org.json.JSONObject getHighSpeedVideoFpsRangesFor(android.content.Context p0, com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData p1) {
        java.lang.String concat;
        java.lang.String str;
        com.paypal.oslo.feature.verificationcapture.domain.model.DeviceInfo deviceInfo;
        if (p1 == null || (deviceInfo = p1.getDeviceInfo()) == null || (concat = deviceInfo.getClientOs()) == null) {
            concat = "Android ".concat(java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
        }
        try {
            str = android.provider.Settings.Secure.getString(p0.getContentResolver(), a.b.l);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            com.paypal.android.logger.Logger.w$default(logger, "[DocumentCapture] Failed to read ANDROID_ID", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, 4, null);
        }
        str = "";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("client_os", concat);
        jSONObject.put("devc_type", (p0.getResources().getConfiguration().screenLayout & 15) >= 3 ? androidx.webkit.UserAgentMetadata.FORM_FACTOR_TABLET : "Phone");
        jSONObject.put("devc_name", android.os.Build.MODEL);
        jSONObject.put("device_id", str);
        java.lang.String appVersion = p1 != null ? p1.getAppVersion() : null;
        jSONObject.put(com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, appVersion != null ? appVersion : "");
        return jSONObject;
    }

    private static org.json.JSONArray getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, java.lang.String p1) {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(p0);
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                java.lang.String optString = jSONObject.optString("payload");
                kotlin.jvm.internal.Intrinsics.checkNotNull(optString);
                if (optString.length() > 0) {
                    jSONObject.put("payload", com.paypal.oslo.feature.verificationcapture.webview.FaceTecIntermediateResultBuilder.INSTANCE.aesGcmEncrypt$verification_capture_prodRelease(optString, p1));
                }
                jSONArray2.put(jSONObject);
            }
            return jSONArray2;
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            com.paypal.android.logger.Logger.w$default(logger, "[DocumentCapture] Failed to parse extracted infos", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, 4, null);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x04ac, code lost:
    
        if (r7 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x04d0, code lost:
    
        if (r7 == null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String serializeDeviceCaptureDataLegacy$verification_capture_prodRelease(com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData data) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        sb.append("\"sdk_info\": {");
        java.lang.String platform = data.getSdkInfo().getPlatform();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\"platform\":\"");
        sb2.append(platform);
        sb2.append("\"");
        sb.append(sb2.toString());
        if (data.getSdkInfo().getVersion().length() > 0) {
            java.lang.String version = data.getSdkInfo().getVersion();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(",\"version\":\"");
            sb3.append(version);
            sb3.append("\"");
            sb.append(sb3.toString());
        }
        if (data.getSdkInfo().getName().length() > 0) {
            java.lang.String name2 = data.getSdkInfo().getName();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(",\"name\":\"");
            sb4.append(name2);
            sb4.append("\"");
            sb.append(sb4.toString());
        }
        if (data.getSdkInfo().getVerfCaptureSdkVersion().length() > 0) {
            java.lang.String verfCaptureSdkVersion = data.getSdkInfo().getVerfCaptureSdkVersion();
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(",\"verf_capture_sdk_version\":\"");
            sb5.append(verfCaptureSdkVersion);
            sb5.append("\"");
            sb.append(sb5.toString());
        }
        if (data.getSdkInfo().getContext().length() > 0) {
            java.lang.String context = data.getSdkInfo().getContext();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(",\"context\":\"");
            sb6.append(context);
            sb6.append("\"");
            sb.append(sb6.toString());
        }
        sb.append("}");
        sb.append(",");
        com.paypal.oslo.feature.verificationcapture.domain.model.DeviceInfo deviceInfo = data.getDeviceInfo();
        sb.append("\"dev_info\": {");
        java.lang.String clientOs = deviceInfo.getClientOs();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("\"client_os\":\"");
        sb7.append(clientOs);
        sb7.append("\",");
        sb.append(sb7.toString());
        int screenSizeX = deviceInfo.getScreenSizeX();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("\"screen_size_x\":\"");
        sb8.append(screenSizeX);
        sb8.append("\",");
        sb.append(sb8.toString());
        int screenSizeY = deviceInfo.getScreenSizeY();
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("\"screen_size_y\":\"");
        sb9.append(screenSizeY);
        sb9.append("\",");
        sb.append(sb9.toString());
        int touchPoint = deviceInfo.getTouchPoint();
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("\"touch_point\":\"");
        sb10.append(touchPoint);
        sb10.append("\",");
        sb.append(sb10.toString());
        boolean isRoot = deviceInfo.isRoot();
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("\"is_root\":\"");
        sb11.append(isRoot);
        sb11.append("\",");
        sb.append(sb11.toString());
        boolean isEmulator = deviceInfo.isEmulator();
        java.lang.StringBuilder sb12 = new java.lang.StringBuilder("\"is_emulator\":\"");
        sb12.append(isEmulator);
        sb12.append("\",");
        sb.append(sb12.toString());
        java.lang.String macAddrs = deviceInfo.getMacAddrs();
        if (macAddrs == null) {
            macAddrs = "";
        }
        java.lang.StringBuilder sb13 = new java.lang.StringBuilder("\"mac_addrs\":\"");
        sb13.append(macAddrs);
        sb13.append("\",");
        sb.append(sb13.toString());
        java.lang.String board = deviceInfo.getBoard();
        java.lang.StringBuilder sb14 = new java.lang.StringBuilder("\"board\":\"");
        sb14.append(board);
        sb14.append("\",");
        sb.append(sb14.toString());
        java.lang.String cpuAbi1 = deviceInfo.getCpuAbi1();
        java.lang.StringBuilder sb15 = new java.lang.StringBuilder("\"cpu_abi1\":\"");
        sb15.append(cpuAbi1);
        sb15.append("\",");
        sb.append(sb15.toString());
        java.lang.String cpuArch = deviceInfo.getCpuArch();
        java.lang.StringBuilder sb16 = new java.lang.StringBuilder("\"cpu_arch\":\"");
        sb16.append(cpuArch);
        sb16.append("\"");
        sb.append(sb16.toString());
        sb.append("}");
        sb.append(",");
        java.lang.String appVersion = data.getAppVersion();
        java.lang.StringBuilder sb17 = new java.lang.StringBuilder("\"app_version\":\"");
        sb17.append(appVersion);
        sb17.append("\",");
        sb.append(sb17.toString());
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDeviceInfo captureDeviceInfo = data.getCaptureDeviceInfo();
        sb.append("\"capture_device_info\": {");
        java.lang.String deviceId = captureDeviceInfo.getDeviceId();
        java.lang.String str4 = "\"device_id\":\"";
        java.lang.StringBuilder sb18 = new java.lang.StringBuilder("\"device_id\":\"");
        sb18.append(deviceId);
        sb18.append("\",");
        sb.append(sb18.toString());
        int width = captureDeviceInfo.getWidth();
        java.lang.StringBuilder sb19 = new java.lang.StringBuilder("\"width\":\"");
        sb19.append(width);
        sb19.append("\",");
        sb.append(sb19.toString());
        int height = captureDeviceInfo.getHeight();
        java.lang.StringBuilder sb20 = new java.lang.StringBuilder("\"height\":\"");
        sb20.append(height);
        sb20.append("\",");
        sb.append(sb20.toString());
        float aspectRatio = captureDeviceInfo.getAspectRatio();
        java.lang.StringBuilder sb21 = new java.lang.StringBuilder("\"aspect_ratio\":\"");
        sb21.append(aspectRatio);
        sb21.append("\",");
        sb.append(sb21.toString());
        int frameRate = captureDeviceInfo.getFrameRate();
        java.lang.StringBuilder sb22 = new java.lang.StringBuilder("\"frame_rate\":\"");
        sb22.append(frameRate);
        sb22.append("\"");
        sb.append(sb22.toString());
        sb.append("}");
        sb.append(",");
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureInfo captureInfo = data.getCaptureInfo();
        sb.append("\"capture_info\": {");
        java.lang.String collectionMode = captureInfo.getCollectionMode();
        java.lang.StringBuilder sb23 = new java.lang.StringBuilder("\"collection_mode\":\"");
        sb23.append(collectionMode);
        sb23.append("\",");
        sb.append(sb23.toString());
        java.lang.String captureMode = captureInfo.getCaptureMode();
        java.lang.StringBuilder sb24 = new java.lang.StringBuilder("\"capture_mode\":\"");
        sb24.append(captureMode);
        sb24.append("\",");
        sb.append(sb24.toString());
        int effort = captureInfo.getEffort();
        java.lang.StringBuilder sb25 = new java.lang.StringBuilder("\"effort\":\"");
        sb25.append(effort);
        sb25.append("\",");
        sb.append(sb25.toString());
        int retryNumber = captureInfo.getRetryNumber();
        java.lang.StringBuilder sb26 = new java.lang.StringBuilder("\"retry_number\":\"");
        sb26.append(retryNumber);
        sb26.append("\",");
        sb.append(sb26.toString());
        java.lang.Object docDetectScore = captureInfo.getDocDetectScore();
        java.lang.Object valueOf = java.lang.Double.valueOf(0.0d);
        if (docDetectScore == null) {
            docDetectScore = valueOf;
        }
        java.lang.StringBuilder sb27 = new java.lang.StringBuilder("\"doc_detect_score\":\"");
        sb27.append(docDetectScore);
        sb27.append("\",");
        sb.append(sb27.toString());
        java.lang.Object activeLivenessScore = captureInfo.getActiveLivenessScore();
        if (activeLivenessScore == null) {
            activeLivenessScore = valueOf;
        }
        java.lang.StringBuilder sb28 = new java.lang.StringBuilder("\"active_liveness_score\":\"");
        sb28.append(activeLivenessScore);
        sb28.append("\",");
        sb.append(sb28.toString());
        java.lang.String activeLivenessType = captureInfo.getActiveLivenessType();
        if (activeLivenessType == null) {
            activeLivenessType = "";
        }
        java.lang.StringBuilder sb29 = new java.lang.StringBuilder("\"active_liveness_type\":\"");
        sb29.append(activeLivenessType);
        sb29.append("\",");
        sb.append(sb29.toString());
        java.lang.Object lightingScore = captureInfo.getLightingScore();
        if (lightingScore != null) {
            valueOf = lightingScore;
        }
        java.lang.StringBuilder sb30 = new java.lang.StringBuilder("\"lighting_score\":\"");
        sb30.append(valueOf);
        sb30.append("\"");
        sb.append(sb30.toString());
        sb.append("}");
        sb.append(",");
        com.paypal.oslo.feature.verificationcapture.domain.model.BatteryInfo batteryInfo = data.getBatteryInfo();
        sb.append("\"battery_info\": {");
        boolean isChanged = batteryInfo.isChanged();
        java.lang.StringBuilder sb31 = new java.lang.StringBuilder("\"is_changed\":\"");
        sb31.append(isChanged);
        sb31.append("\",");
        sb.append(sb31.toString());
        int collectionCount = batteryInfo.getCollectionCount();
        java.lang.StringBuilder sb32 = new java.lang.StringBuilder("\"collection_count\":\"");
        sb32.append(collectionCount);
        sb32.append("\"");
        sb.append(sb32.toString());
        if (batteryInfo.getDetails().isEmpty()) {
            str = "\"device_id\":\"";
        } else {
            sb.append(",\"details\":[");
            java.util.Iterator it = batteryInfo.getDetails().iterator();
            int i = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail batteryDetail = (com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail) next;
                int current = batteryDetail.getCurrent();
                int max = batteryDetail.getMax();
                float temperature = batteryDetail.getTemperature();
                java.util.Iterator it2 = it;
                java.lang.String str5 = str4;
                java.lang.StringBuilder sb33 = new java.lang.StringBuilder("{\"current\":\"");
                sb33.append(current);
                sb33.append("\",\"max\":\"");
                sb33.append(max);
                sb33.append("\",\"temperature\":\"");
                sb33.append(temperature);
                sb33.append("\"}");
                sb.append(sb33.toString());
                if (i < batteryInfo.getDetails().size() - 1) {
                    sb.append(",");
                }
                i++;
                it = it2;
                str4 = str5;
            }
            str = str4;
            sb.append("]");
        }
        sb.append("}");
        sb.append(",");
        com.paypal.oslo.feature.verificationcapture.domain.model.SensorData sensorData = data.getSensorData();
        sb.append("\"sensor_data\": {");
        boolean motionIsChanged = sensorData.getMotionIsChanged();
        java.lang.StringBuilder sb34 = new java.lang.StringBuilder("\"montion_is_changed\":\"");
        sb34.append(motionIsChanged);
        sb34.append("\",");
        sb.append(sb34.toString());
        boolean accIsChanged = sensorData.getAccIsChanged();
        java.lang.StringBuilder sb35 = new java.lang.StringBuilder("\"acc_is_changed\":\"");
        sb35.append(accIsChanged);
        sb35.append("\",");
        sb.append(sb35.toString());
        boolean gyrIsChanged = sensorData.getGyrIsChanged();
        java.lang.StringBuilder sb36 = new java.lang.StringBuilder("\"gyr_is_changed\":\"");
        sb36.append(gyrIsChanged);
        sb36.append("\",");
        sb.append(sb36.toString());
        int collectionCount2 = sensorData.getCollectionCount();
        java.lang.StringBuilder sb37 = new java.lang.StringBuilder("\"collection_count\":\"");
        sb37.append(collectionCount2);
        sb37.append("\",");
        sb.append(sb37.toString());
        float[] motionEvent = sensorData.getMotionEvent();
        java.lang.String str6 = "null";
        if (motionEvent != null) {
            str2 = java.util.Arrays.toString(motionEvent);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
        }
        str2 = "null";
        java.lang.StringBuilder sb38 = new java.lang.StringBuilder("\"motion_event\":\"");
        sb38.append(str2);
        sb38.append("\",");
        sb.append(sb38.toString());
        float[] accEvent = sensorData.getAccEvent();
        if (accEvent != null) {
            str3 = java.util.Arrays.toString(accEvent);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
        }
        str3 = "null";
        java.lang.StringBuilder sb39 = new java.lang.StringBuilder("\"acc_event\":\"");
        sb39.append(str3);
        sb39.append("\",");
        sb.append(sb39.toString());
        float[] gyrEvent = sensorData.getGyrEvent();
        if (gyrEvent != null) {
            java.lang.String arrays = java.util.Arrays.toString(gyrEvent);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
            if (arrays != null) {
                str6 = arrays;
            }
        }
        java.lang.StringBuilder sb40 = new java.lang.StringBuilder("\"gyr_event\":\"");
        sb40.append(str6);
        sb40.append("\"");
        sb.append(sb40.toString());
        sb.append("}");
        if (!data.getMediaDeviceInfo().isEmpty()) {
            sb.append(",");
            sb.append("\"media_device_infos\":[");
            int i2 = 0;
            for (java.lang.Object obj : data.getMediaDeviceInfo()) {
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo mediaDeviceInfo = (com.paypal.oslo.feature.verificationcapture.domain.model.MediaDeviceInfo) obj;
                sb.append("{");
                java.lang.String deviceId2 = mediaDeviceInfo.getDeviceId();
                java.lang.String str7 = str;
                java.lang.StringBuilder sb41 = new java.lang.StringBuilder(str7);
                sb41.append(deviceId2);
                sb41.append("\"");
                sb.append(sb41.toString());
                java.lang.String groupId = mediaDeviceInfo.getGroupId();
                java.lang.StringBuilder sb42 = new java.lang.StringBuilder(",\"group_id\":\"");
                sb42.append(groupId);
                sb42.append("\"");
                sb.append(sb42.toString());
                java.lang.String kind = mediaDeviceInfo.getKind();
                java.lang.StringBuilder sb43 = new java.lang.StringBuilder(",\"kind\":\"");
                sb43.append(kind);
                sb43.append("\"");
                sb.append(sb43.toString());
                java.lang.String label = mediaDeviceInfo.getLabel();
                java.lang.StringBuilder sb44 = new java.lang.StringBuilder(",\"label\":\"");
                sb44.append(label);
                sb44.append("\"");
                sb.append(sb44.toString());
                java.lang.String faceMode = mediaDeviceInfo.getFaceMode();
                java.lang.StringBuilder sb45 = new java.lang.StringBuilder(",\"face_mode\":\"");
                sb45.append(faceMode);
                sb45.append("\"");
                sb.append(sb45.toString());
                sb.append("}");
                if (i2 < data.getMediaDeviceInfo().size() - 1) {
                    sb.append(",");
                }
                i2++;
                str = str7;
            }
            sb.append("]");
        }
        sb.append("}");
        java.lang.String obj2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }
}
