package com.daon.dmds.utils.idcapture;

/* loaded from: classes7.dex */
public class IdCaptureQualityFilterImpl implements com.daon.dmds.utils.idcapture.IdCaptureQualityFilter {
    final com.daon.idcapture.IDCapture getHighSpeedVideoFpsRanges;
    final java.lang.String getHighSpeedVideoSizes = "IdCaptureQualityFilterImpl";
    int getHighResolutionOutputSizeshNQ4ISI = 0;
    int Camera2StreamConfigurationMap = 0;
    int getHighSpeedVideoFpsRangesFor = 0;

    public IdCaptureQualityFilterImpl(android.content.Context context) throws com.daon.idcapture.IDCaptureException {
        this.getHighSpeedVideoFpsRanges = new com.daon.idcapture.IDCapture(context.getAssets());
    }

    static java.lang.String Camera2StreamConfigurationMap(java.lang.Object obj, java.lang.String str) {
        for (java.lang.reflect.Field field : obj.getClass().getFields()) {
            if (field.getName().equals(str)) {
                try {
                    field.setAccessible(true);
                    java.lang.Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        return obj2.toString();
                    }
                    return null;
                } catch (java.lang.IllegalAccessException e) {
                    com.daon.dmds.utils.DobsLogUtils.getStackTrace(e);
                }
            }
        }
        return "0";
    }

    @Override // com.daon.dmds.utils.idcapture.IdCaptureQualityFilter
    public void analyzeImageQuality(final android.graphics.Bitmap bitmap, final com.daon.dmds.models.DMDSOptions dMDSOptions, final com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle, final boolean z, final com.daon.dmds.utils.idcapture.IdCaptureResultListener idCaptureResultListener) {
        com.daon.dmds.utils.BackgroundExecutor.submit(new java.lang.Runnable() { // from class: com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                byte[] data;
                android.graphics.Bitmap bitmap2;
                int width;
                int height;
                android.graphics.Bitmap createBitmap;
                com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl idCaptureQualityFilterImpl = com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl.this;
                com.daon.dmds.utils.idcapture.IdCaptureResultListener idCaptureResultListener2 = idCaptureResultListener;
                com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle2 = dMDSQuadrangle;
                boolean z2 = z;
                android.graphics.Bitmap bitmap3 = bitmap;
                com.daon.dmds.models.DMDSOptions dMDSOptions2 = dMDSOptions;
                if (idCaptureQualityFilterImpl.getHighSpeedVideoFpsRanges == null) {
                    idCaptureResultListener2.onFailure(new com.daon.dmds.models.DMDSDocumentQualityInfo(null, com.daon.dmds.models.DMDSDocumentDetectionStatus.DOCUMENT_QUALITY_FAILED));
                    return;
                }
                double calculateDetectionAspectRatio = com.daon.dmds.utils.DMDSPointParser.calculateDetectionAspectRatio(dMDSQuadrangle2);
                try {
                    com.daon.idcapture.IDCaptureConfig iDCaptureConfig = new com.daon.idcapture.IDCaptureConfig();
                    iDCaptureConfig.setIDCropTolerance(0.06d);
                    java.lang.String str = idCaptureQualityFilterImpl.getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("AR: ");
                    sb.append(calculateDetectionAspectRatio);
                    com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb.toString());
                    if (calculateDetectionAspectRatio != 0.0d) {
                        iDCaptureConfig.setIdShape(calculateDetectionAspectRatio);
                    }
                    if (z2) {
                        data = new com.daon.dmds.utils.idcapture.RGB(bitmap3).getData();
                        bitmap2 = bitmap3;
                        width = bitmap3.getWidth();
                        height = bitmap3.getHeight();
                    } else {
                        android.graphics.Rect rect = com.daon.dmds.utils.DMDSPointParser.toRect(dMDSQuadrangle2);
                        rect.inset(((int) (rect.width() * 0.05d)) * (-1), ((int) (rect.height() * 0.05d)) * (-1));
                        if (rect.left < 0) {
                            rect.left = 0;
                        }
                        if (rect.top < 0) {
                            rect.top = 0;
                        }
                        if (rect.width() > bitmap3.getWidth()) {
                            rect.right = bitmap3.getWidth();
                        }
                        if (rect.height() > bitmap3.getHeight()) {
                            rect.bottom = bitmap3.getHeight();
                        }
                        bitmap2 = android.graphics.Bitmap.createBitmap(bitmap3, rect.left, rect.top, rect.width(), rect.height());
                        data = new com.daon.dmds.utils.idcapture.RGB(bitmap2).getData();
                        width = bitmap2.getWidth();
                        height = bitmap2.getHeight();
                    }
                    com.daon.idcapture.IDCaptureResult processRawFrame = idCaptureQualityFilterImpl.getHighSpeedVideoFpsRanges.processRawFrame(data, width, height, 0, 1, iDCaptureConfig);
                    com.daon.dmds.utils.DobsLogUtils.logDebug(idCaptureQualityFilterImpl.getHighSpeedVideoSizes, processRawFrame.quality.toString());
                    java.util.HashMap hashMap = new java.util.HashMap();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl.Camera2StreamConfigurationMap(processRawFrame.quality, "Summary"));
                    hashMap.put(com.daon.dmds.utils.DMDSDocumentUtils.ID_SUMMARY_PARAM, sb2.toString());
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl.Camera2StreamConfigurationMap(processRawFrame.quality, "AspectRatio"));
                    hashMap.put(com.daon.dmds.utils.DMDSDocumentUtils.ID_ASPECT_RATIO_PARAM, sb3.toString());
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl.Camera2StreamConfigurationMap(processRawFrame.quality, "Size"));
                    hashMap.put(com.daon.dmds.utils.DMDSDocumentUtils.ID_SIZE_PARAM, sb4.toString());
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    sb5.append(com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl.Camera2StreamConfigurationMap(processRawFrame.quality, "VertDistort"));
                    hashMap.put(com.daon.dmds.utils.DMDSDocumentUtils.ID_VERT_DISTORT_PARAM, sb5.toString());
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl.Camera2StreamConfigurationMap(processRawFrame.quality, "HorizDistort"));
                    hashMap.put(com.daon.dmds.utils.DMDSDocumentUtils.ID_HORIZ_DISTORT_PARAM, sb6.toString());
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl.Camera2StreamConfigurationMap(processRawFrame.quality, "MinInternalAngle"));
                    hashMap.put(com.daon.dmds.utils.DMDSDocumentUtils.ID_MIN_INTERNAL_ANGLE_PARAM, sb7.toString());
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append(com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl.Camera2StreamConfigurationMap(processRawFrame.quality, "MaxInternalAngle"));
                    hashMap.put(com.daon.dmds.utils.DMDSDocumentUtils.ID_MAX_INTERNAL_ANGLE_PARAM, sb8.toString());
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    sb9.append(com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl.Camera2StreamConfigurationMap(processRawFrame.quality, "SumInternalAngle"));
                    hashMap.put(com.daon.dmds.utils.DMDSDocumentUtils.ID_SUM_INTERNAL_ANGLE_PARAM, sb9.toString());
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                    sb10.append(com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl.Camera2StreamConfigurationMap(processRawFrame.quality, "GlareAdaptive"));
                    hashMap.put(com.daon.dmds.utils.DMDSDocumentUtils.ID_GLARE_ADAPTIVE_PARAM, sb10.toString());
                    java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                    sb11.append(com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl.Camera2StreamConfigurationMap(processRawFrame.quality, "GlareFixed"));
                    hashMap.put(com.daon.dmds.utils.DMDSDocumentUtils.ID_GLARE_FIXED_PARAM, sb11.toString());
                    java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                    sb12.append(com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl.Camera2StreamConfigurationMap(processRawFrame.quality, "GlobalBlur"));
                    hashMap.put(com.daon.dmds.utils.DMDSDocumentUtils.ID_GLOBAL_BLUR_PARAM, sb12.toString());
                    java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                    sb13.append(com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl.Camera2StreamConfigurationMap(processRawFrame.quality, "LocalBlur"));
                    hashMap.put(com.daon.dmds.utils.DMDSDocumentUtils.ID_LOCAL_BLUR_PARAM, sb13.toString());
                    java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
                    sb14.append(com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl.Camera2StreamConfigurationMap(processRawFrame.quality, "IDSourceWidth"));
                    hashMap.put(com.daon.dmds.utils.DMDSDocumentUtils.ID_ID_SOURCE_WIDTH_PARAM, sb14.toString());
                    java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
                    sb15.append(com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl.Camera2StreamConfigurationMap(processRawFrame.quality, "IDSourceHeight"));
                    hashMap.put(com.daon.dmds.utils.DMDSDocumentUtils.ID_ID_SOURCE_HEIGHT_PARAM, sb15.toString());
                    java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
                    sb16.append(com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl.Camera2StreamConfigurationMap(processRawFrame.quality, "DPIsource"));
                    hashMap.put(com.daon.dmds.utils.DMDSDocumentUtils.ID_DPI_SOURCE_PARAM, sb16.toString());
                    java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
                    sb17.append(idCaptureQualityFilterImpl.Camera2StreamConfigurationMap);
                    hashMap.put("idBlurFailCount", sb17.toString());
                    java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
                    sb18.append(idCaptureQualityFilterImpl.getHighSpeedVideoFpsRangesFor);
                    hashMap.put("idGlareFailCount", sb18.toString());
                    java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
                    sb19.append(idCaptureQualityFilterImpl.getHighResolutionOutputSizeshNQ4ISI);
                    hashMap.put("idFailToAnalyze", sb19.toString());
                    com.daon.idcapture.IDCaptureResult.Quality quality = processRawFrame.quality;
                    if (!quality.isAvailable) {
                        com.daon.dmds.utils.DobsLogUtils.logDebug(idCaptureQualityFilterImpl.getHighSpeedVideoSizes, "FAIL TO ANALYZE");
                        idCaptureQualityFilterImpl.getHighResolutionOutputSizeshNQ4ISI++;
                        idCaptureResultListener2.onFailure(new com.daon.dmds.models.DMDSDocumentQualityInfo(null, com.daon.dmds.models.DMDSDocumentDetectionStatus.DOCUMENT_QUALITY_FAILED));
                        return;
                    }
                    if (quality.LocalBlur < dMDSOptions2.getMinLocalBlur()) {
                        java.lang.String str2 = idCaptureQualityFilterImpl.getHighSpeedVideoSizes;
                        java.lang.StringBuilder sb20 = new java.lang.StringBuilder("BLUR DIDN'T MATCH THRESHOLD [LB: ");
                        sb20.append(processRawFrame.quality.LocalBlur);
                        sb20.append("]");
                        com.daon.dmds.utils.DobsLogUtils.logDebug(str2, sb20.toString());
                        idCaptureQualityFilterImpl.Camera2StreamConfigurationMap++;
                    }
                    if (processRawFrame.quality.GlareFixed > dMDSOptions2.getMaxGlareFixed()) {
                        java.lang.String str3 = idCaptureQualityFilterImpl.getHighSpeedVideoSizes;
                        java.lang.StringBuilder sb21 = new java.lang.StringBuilder("GLARE DIDN'T MATCH THRESHOLD ");
                        sb21.append(processRawFrame.quality.GlareFixed);
                        com.daon.dmds.utils.DobsLogUtils.logDebug(str3, sb21.toString());
                        idCaptureQualityFilterImpl.getHighSpeedVideoFpsRangesFor++;
                    }
                    com.daon.idcapture.IDCaptureCroppingCoords croppingCoords = idCaptureQualityFilterImpl.getHighSpeedVideoFpsRanges.getCroppingCoords();
                    if (z2) {
                        createBitmap = android.graphics.Bitmap.createBitmap(bitmap3, croppingCoords.x, croppingCoords.y, croppingCoords.width, croppingCoords.height);
                    } else {
                        createBitmap = android.graphics.Bitmap.createBitmap(bitmap2, croppingCoords.x, croppingCoords.y, croppingCoords.width, croppingCoords.height);
                        bitmap2.recycle();
                    }
                    java.lang.String str4 = idCaptureQualityFilterImpl.getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Fail count [detect: ");
                    sb22.append(idCaptureQualityFilterImpl.getHighResolutionOutputSizeshNQ4ISI);
                    sb22.append("], [blur: ");
                    sb22.append(idCaptureQualityFilterImpl.Camera2StreamConfigurationMap);
                    sb22.append("], [glare: ");
                    sb22.append(idCaptureQualityFilterImpl.getHighSpeedVideoFpsRangesFor);
                    sb22.append("]");
                    com.daon.dmds.utils.DobsLogUtils.logDebug(str4, sb22.toString());
                    idCaptureResultListener2.onSuccess(new com.daon.dmds.models.DMDSIDCaptureResult(createBitmap, hashMap));
                } catch (java.lang.Exception e) {
                    com.daon.dmds.utils.DobsLogUtils.logError(idCaptureQualityFilterImpl.getHighSpeedVideoSizes, e.toString());
                    idCaptureResultListener2.onFailure(new com.daon.dmds.models.DMDSDocumentQualityInfo(null, com.daon.dmds.models.DMDSDocumentDetectionStatus.DOCUMENT_QUALITY_FAILED));
                }
            }
        });
    }
}
