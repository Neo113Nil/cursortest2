package com.daon.dmds.utils.face;

/* loaded from: classes7.dex */
public class FaceFinderImpl implements com.daon.dmds.utils.face.FaceFinder {
    public static final java.lang.String PASSPORT_DOCUMENT_CLASS = "PASSPORT";
    public static final java.lang.String TAG = "FaceFinderImpl";
    static java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI;
    final com.daon.sdk.face.DaonFace getHighSpeedVideoFpsRangesFor;

    public FaceFinderImpl(android.content.Context context, java.lang.String str) throws java.lang.Exception {
        if (android.text.TextUtils.isEmpty(str)) {
            this.getHighSpeedVideoFpsRangesFor = new com.daon.sdk.face.DaonFace(context, 4);
        } else {
            this.getHighSpeedVideoFpsRangesFor = new com.daon.sdk.face.DaonFace(context, 4, new java.io.ByteArrayInputStream(str.getBytes()));
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_FACE_FRONTAL, 0.45f);
        bundle.putFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_MIN_FACE_SIZE, 0.07f);
        com.daon.sdk.face.DaonFace daonFace = this.getHighSpeedVideoFpsRangesFor;
        if (daonFace != null) {
            daonFace.setConfiguration(bundle);
        }
        getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    static com.daon.dmds.models.DMDSFaceResultQuality getHighResolutionOutputSizeshNQ4ISI(com.daon.sdk.face.DaonFace.Face face) {
        com.daon.dmds.models.DMDSFaceResultQuality.Builder builder = new com.daon.dmds.models.DMDSFaceResultQuality.Builder();
        com.daon.sdk.face.QualityResult quality = face.getQuality();
        if (quality != null && quality.getBundle() != null) {
            builder.setFaceFoundConfidence(quality.getBundle().getFloat(com.daon.sdk.face.QualityResult.RESULT_FACE_FOUND_SCORE));
            builder.setEyesFoundConfidence(quality.getBundle().getFloat(com.daon.sdk.face.QualityResult.RESULT_EYES_FOUND_SCORE));
            builder.setEyesOpenConfidence(quality.getBundle().getFloat(com.daon.sdk.face.QualityResult.RESULT_EYES_OPEN_SCORE));
            builder.setUniformLightingConfidence(quality.getBundle().getFloat(com.daon.sdk.face.QualityResult.RESULT_LIGHTING_SCORE));
            builder.setFaceFrontalConfidence(quality.getBundle().getFloat(com.daon.sdk.face.QualityResult.RESULT_FACE_FRONTAL_SCORE));
            builder.setEyeDistance(quality.getBundle().getInt(com.daon.sdk.face.QualityResult.RESULT_EYES_DISTANCE_SCORE));
            builder.setPoseAngle(quality.getBundle().getInt(com.daon.sdk.face.QualityResult.RESULT_POSE_ANGLE_SCORE));
            builder.setSharpness(quality.getBundle().getInt(com.daon.sdk.face.QualityResult.RESULT_SHARPNESS_SCORE));
            builder.setExposure(quality.getBundle().getInt(com.daon.sdk.face.QualityResult.RESULT_EXPOSURE_SCORE));
            builder.setGrayscaleDensity(quality.getBundle().getInt(com.daon.sdk.face.QualityResult.RESULT_GRAYSCALE_DENSITY_SCORE));
            builder.setGlobalScore(quality.getScore());
            builder.setFaceRotation(face.getRotation());
        }
        return builder.build();
    }

    @Override // com.daon.dmds.utils.face.FaceFinder
    public void clear() {
        com.daon.sdk.face.DaonFace daonFace = this.getHighSpeedVideoFpsRangesFor;
        if (daonFace != null) {
            daonFace.stop();
        }
    }

    @Override // com.daon.dmds.utils.face.FaceFinder
    public void findBestFace(final android.graphics.Bitmap bitmap, final com.daon.dmds.models.DMDSOptions dMDSOptions, final java.lang.String str, final com.daon.dmds.utils.face.FaceResultListener faceResultListener) {
        com.daon.dmds.utils.BackgroundExecutor.submit(new java.lang.Runnable() { // from class: com.daon.dmds.utils.face.FaceFinderImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.models.DMDSFaceResultQuality highSpeedVideoSizes;
                com.daon.dmds.models.DMDSFace dMDSFace;
                com.daon.dmds.utils.face.FaceFinderImpl faceFinderImpl = com.daon.dmds.utils.face.FaceFinderImpl.this;
                android.graphics.Bitmap bitmap2 = bitmap;
                com.daon.dmds.utils.face.FaceResultListener faceResultListener2 = faceResultListener;
                com.daon.dmds.models.DMDSOptions dMDSOptions2 = dMDSOptions;
                java.lang.String str2 = str;
                if (com.daon.dmds.utils.face.FaceFinderImpl.getHighResolutionOutputSizeshNQ4ISI.get()) {
                    com.daon.dmds.utils.DobsLogUtils.logDebug(com.daon.dmds.utils.face.FaceFinderImpl.TAG, "Skip this request!");
                    return;
                }
                if (bitmap2 == null) {
                    faceResultListener2.onFailure(new com.daon.dmds.models.DMDSFaceQualityInfo(null, com.daon.dmds.models.DMDSDocumentDetectionStatus.FACE_NOT_FOUND));
                    com.daon.dmds.utils.DobsLogUtils.logError(com.daon.dmds.utils.face.FaceFinderImpl.TAG, "Request for null object!");
                    return;
                }
                com.daon.dmds.utils.face.FaceFinderImpl.getHighResolutionOutputSizeshNQ4ISI.set(true);
                float faceQualityScoreThreshold = dMDSOptions2.getFaceQualityScoreThreshold();
                com.daon.dmds.models.DocTypeEnum extractDocumentType = com.daon.dmds.utils.DMDSDocumentUtils.extractDocumentType(dMDSOptions2.getDocumentTypes());
                if (extractDocumentType == com.daon.dmds.models.DocTypeEnum.IdDocument || extractDocumentType == com.daon.dmds.models.DocTypeEnum.IdDocumentCombined) {
                    com.daon.sdk.face.Result analyze = faceFinderImpl.getHighSpeedVideoFpsRangesFor.analyze(bitmap2);
                    if (faceQualityScoreThreshold <= analyze.getQualityResult().getScore()) {
                        dMDSFace = new com.daon.dmds.models.DMDSFace(bitmap2, com.daon.dmds.utils.face.FaceFinderImpl.getHighSpeedVideoSizes(analyze));
                        highSpeedVideoSizes = null;
                    } else {
                        highSpeedVideoSizes = com.daon.dmds.utils.face.FaceFinderImpl.getHighSpeedVideoSizes(analyze);
                        dMDSFace = null;
                    }
                } else {
                    com.daon.sdk.face.DaonFace daonFace = faceFinderImpl.getHighSpeedVideoFpsRangesFor;
                    com.daon.dmds.models.DocTypeEnum extractDocumentType2 = com.daon.dmds.utils.DMDSDocumentUtils.extractDocumentType(dMDSOptions2.getDocumentTypes());
                    if (str2 == null) {
                        str2 = "";
                    }
                    float f = Float.MIN_VALUE;
                    highSpeedVideoSizes = null;
                    dMDSFace = null;
                    for (com.daon.sdk.face.DaonFace.Face face : daonFace.analyzeFaces(bitmap2, (str2.equalsIgnoreCase(com.daon.dmds.utils.face.FaceFinderImpl.PASSPORT_DOCUMENT_CLASS) || extractDocumentType2 == com.daon.dmds.models.DocTypeEnum.Passport) ? 5 : java.util.Arrays.asList(com.daon.dmds.models.DocTypeEnum.IdDocument, com.daon.dmds.models.DocTypeEnum.IdDocumentCombined, com.daon.dmds.models.DocTypeEnum.IdBarcodeDocument).contains(extractDocumentType2) ^ true ? 3 : 0)) {
                        float score = face.getQuality().getScore();
                        if (score <= faceQualityScoreThreshold || score <= f) {
                            highSpeedVideoSizes = com.daon.dmds.utils.face.FaceFinderImpl.getHighResolutionOutputSizeshNQ4ISI(face);
                        } else {
                            dMDSFace = new com.daon.dmds.models.DMDSFace(face.getBitmap(), com.daon.dmds.utils.face.FaceFinderImpl.getHighResolutionOutputSizeshNQ4ISI(face));
                            f = score;
                        }
                    }
                }
                if (dMDSFace != null) {
                    faceResultListener2.onSuccess(dMDSFace);
                } else if (highSpeedVideoSizes != null) {
                    faceResultListener2.onFailure(new com.daon.dmds.models.DMDSFaceQualityInfo(highSpeedVideoSizes, com.daon.dmds.models.DMDSDocumentDetectionStatus.FACE_QUALITY_FAILED));
                } else {
                    faceResultListener2.onFailure(new com.daon.dmds.models.DMDSFaceQualityInfo(null, com.daon.dmds.models.DMDSDocumentDetectionStatus.FACE_NOT_FOUND));
                }
                com.daon.dmds.utils.face.FaceFinderImpl.getHighResolutionOutputSizeshNQ4ISI.set(false);
            }
        });
    }

    static com.daon.dmds.models.DMDSFaceResultQuality getHighSpeedVideoSizes(com.daon.sdk.face.Result result) {
        com.daon.dmds.models.DMDSFaceResultQuality.Builder builder = new com.daon.dmds.models.DMDSFaceResultQuality.Builder();
        com.daon.sdk.face.QualityResult qualityResult = result.getQualityResult();
        if (qualityResult != null && qualityResult.getBundle() != null) {
            builder.setFaceFoundConfidence(qualityResult.getBundle().getFloat(com.daon.sdk.face.QualityResult.RESULT_FACE_FOUND_SCORE));
            builder.setEyesFoundConfidence(qualityResult.getBundle().getFloat(com.daon.sdk.face.QualityResult.RESULT_EYES_FOUND_SCORE));
            builder.setEyesOpenConfidence(qualityResult.getBundle().getFloat(com.daon.sdk.face.QualityResult.RESULT_EYES_OPEN_SCORE));
            builder.setUniformLightingConfidence(qualityResult.getBundle().getFloat(com.daon.sdk.face.QualityResult.RESULT_LIGHTING_SCORE));
            builder.setFaceFrontalConfidence(qualityResult.getBundle().getFloat(com.daon.sdk.face.QualityResult.RESULT_FACE_FRONTAL_SCORE));
            builder.setEyeDistance(qualityResult.getBundle().getInt(com.daon.sdk.face.QualityResult.RESULT_EYES_DISTANCE_SCORE));
            builder.setPoseAngle(qualityResult.getBundle().getInt(com.daon.sdk.face.QualityResult.RESULT_POSE_ANGLE_SCORE));
            builder.setSharpness(qualityResult.getBundle().getInt(com.daon.sdk.face.QualityResult.RESULT_SHARPNESS_SCORE));
            builder.setExposure(qualityResult.getBundle().getInt(com.daon.sdk.face.QualityResult.RESULT_EXPOSURE_SCORE));
            builder.setGrayscaleDensity(qualityResult.getBundle().getInt(com.daon.sdk.face.QualityResult.RESULT_GRAYSCALE_DENSITY_SCORE));
            builder.setGlobalScore(qualityResult.getScore());
        }
        return builder.build();
    }
}
