package com.daon.dmds.utils;

/* loaded from: classes7.dex */
public class MBUtils {
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = "MBUtils";

    /* renamed from: com.daon.dmds.utils.MBUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.daon.dmds.models.DMDSVideoResolution.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.daon.dmds.models.DMDSVideoResolution.VID_1080P.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.daon.dmds.models.DMDSVideoResolution.VID_2160P.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.daon.dmds.models.DMDSOrientation.values().length];
            getHighSpeedVideoFpsRanges = iArr2;
            try {
                iArr2[com.daon.dmds.models.DMDSOrientation.DMDS_ORIENTATION_PORTRAIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DMDSOrientation.DMDS_ORIENTATION_LANDSCAPE_RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DMDSOrientation.DMDS_ORIENTATION_PORTRAIT_UPSIDE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DMDSOrientation.DMDS_ORIENTATION_LANDSCAPE_LEFT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[com.microblink.blinkid.hardware.orientation.Orientation.values().length];
            Camera2StreamConfigurationMap = iArr3;
            try {
                iArr3[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
        }
    }

    public static com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors convertImageExtensionFactors(com.daon.dmds.models.DMDSImageExtensionFactors dMDSImageExtensionFactors) {
        if (dMDSImageExtensionFactors == null) {
            return null;
        }
        if (dMDSImageExtensionFactors.getTop() == 0.0f && dMDSImageExtensionFactors.getRight() == 0.0f && dMDSImageExtensionFactors.getBottom() == 0.0f && dMDSImageExtensionFactors.getLeft() == 0.0f) {
            return null;
        }
        return new com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors(dMDSImageExtensionFactors.getTop(), dMDSImageExtensionFactors.getBottom(), dMDSImageExtensionFactors.getLeft(), dMDSImageExtensionFactors.getRight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void enableAllImages(com.daon.dmds.models.DMDSOptions dMDSOptions, com.microblink.blinkid.entities.recognizers.Recognizer recognizer) {
        if (recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions) {
            ((com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions) recognizer).setReturnFullDocumentImage(true);
        }
        if (recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions) {
            com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions fullDocumentImageExtensionOptions = (com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions) recognizer;
            com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors convertImageExtensionFactors = convertImageExtensionFactors(dMDSOptions.getImageExtensionFactors());
            if (convertImageExtensionFactors != null) {
                fullDocumentImageExtensionOptions.setFullDocumentImageExtensionFactors(convertImageExtensionFactors);
            }
        }
        if (recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.SignatureImageOptions) {
            ((com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.SignatureImageOptions) recognizer).setReturnSignatureImage(true);
        }
        if (dMDSOptions.isFaceDetection() && (recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FaceImageOptions)) {
            ((com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FaceImageOptions) recognizer).setReturnFaceImage(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.microblink.blinkid.entities.recognizers.Recognizer$Result] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.microblink.blinkid.entities.recognizers.Recognizer$Result] */
    public static void extractResultImages(com.microblink.blinkid.entities.recognizers.Recognizer.Result result, com.daon.dmds.models.DMDSDocument dMDSDocument) {
        com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result result2;
        com.microblink.blinkid.image.Image signatureImage;
        com.microblink.blinkid.image.Image fullDocumentImage;
        if (result instanceof com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result) {
            result2 = (com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result) result;
            com.microblink.blinkid.image.Image successFrame = result2.getSuccessFrame();
            if (successFrame != null) {
                dMDSDocument.setUnprocessedImage(com.daon.dmds.utils.DMDSDocumentUtils.rotateImage(successFrame.convertToBitmap(), orientation2Rotation(successFrame.getImageOrientation())));
            }
        } else {
            result2 = null;
        }
        if (result2 != null) {
            result = result2.getSlaveResult();
        }
        if ((result instanceof com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FullDocumentImageResult) && (fullDocumentImage = result.getFullDocumentImage()) != null) {
            dMDSDocument.setProcessedImage(com.daon.dmds.utils.DMDSDocumentUtils.rotateImage(fullDocumentImage.convertToBitmap(), orientation2Rotation(fullDocumentImage.getImageOrientation())));
        }
        if (!(result instanceof com.microblink.blinkid.entities.recognizers.blinkid.imageresult.SignatureImageResult) || (signatureImage = ((com.microblink.blinkid.entities.recognizers.blinkid.imageresult.SignatureImageResult) result).getSignatureImage()) == null) {
            return;
        }
        dMDSDocument.setSignatureImage(signatureImage.convertToBitmap());
    }

    public static com.microblink.blinkid.hardware.orientation.Orientation getOrientation(android.content.Context context) {
        return toMbOrientation(com.daon.dmds.utils.DMDSDocumentUtils.getDeviceOrientation(context));
    }

    public static com.daon.dmds.models.DMDSRecognitionMode mapRecognitionMode(com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionMode recognitionMode) {
        int ordinal = recognitionMode.ordinal();
        return com.daon.dmds.models.DMDSRecognitionMode.values().length <= ordinal ? com.daon.dmds.models.DMDSRecognitionMode.NONE : com.daon.dmds.models.DMDSRecognitionMode.values()[ordinal];
    }

    public static com.microblink.blinkid.hardware.camera.VideoResolutionPreset mapVideoResolution(com.daon.dmds.models.DMDSVideoResolution dMDSVideoResolution) {
        int i = com.daon.dmds.utils.MBUtils.AnonymousClass1.getHighSpeedVideoFpsRangesFor[dMDSVideoResolution.ordinal()];
        return i != 1 ? i != 2 ? com.microblink.blinkid.hardware.camera.VideoResolutionPreset.VIDEO_RESOLUTION_DEFAULT : com.microblink.blinkid.hardware.camera.VideoResolutionPreset.VIDEO_RESOLUTION_2160p : com.microblink.blinkid.hardware.camera.VideoResolutionPreset.VIDEO_RESOLUTION_1080p;
    }

    public static int orientation2Rotation(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        int i = com.daon.dmds.utils.MBUtils.AnonymousClass1.Camera2StreamConfigurationMap[orientation.ordinal()];
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 270;
        }
        if (i != 3) {
            return 0;
        }
        return com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
    }

    public static com.daon.dmds.models.DMDSDocumentRotation rotateAndSetUnprocessedImage(com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation cardRotation, com.daon.dmds.models.DMDSDocument dMDSDocument, com.microblink.blinkid.image.Image image, com.daon.dmds.models.DocumentSide documentSide) {
        com.daon.dmds.models.DMDSDocumentRotation fromMBCardRotation = com.daon.dmds.models.DMDSDocumentRotation.fromMBCardRotation(cardRotation);
        int rotationDegrees = fromMBCardRotation.getRotationDegrees();
        if (documentSide == com.daon.dmds.models.DocumentSide.FIRST) {
            dMDSDocument.setUnprocessedImage(com.daon.dmds.utils.DMDSDocumentUtils.rotateImage(image.convertToBitmap(), rotationDegrees + 90));
            return fromMBCardRotation;
        }
        dMDSDocument.setUnprocessedBackImage(com.daon.dmds.utils.DMDSDocumentUtils.rotateImage(image.convertToBitmap(), rotationDegrees + 90));
        return fromMBCardRotation;
    }

    public static boolean setupLicense(java.lang.String str, android.content.Context context) {
        return setupLicense(str, null, context);
    }

    public static boolean shouldTranslateImage(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        int i = com.daon.dmds.utils.MBUtils.AnonymousClass1.Camera2StreamConfigurationMap[orientation.ordinal()];
        return i == 1 || i == 2;
    }

    public static com.microblink.blinkid.hardware.orientation.Orientation toMbOrientation(com.daon.dmds.models.DMDSOrientation dMDSOrientation) {
        int i = com.daon.dmds.utils.MBUtils.AnonymousClass1.getHighSpeedVideoFpsRanges[dMDSOrientation.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT;
    }

    public static boolean setupLicense(java.lang.String str, java.lang.String str2, android.content.Context context) {
        if (com.microblink.blinkid.MicroblinkSDK.getApplicationContext() != null) {
            return true;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(com.daon.dmds.utils.DMDSDocumentUtils.getActivity(context).getApplicationContext());
        com.microblink.blinkid.MicroblinkSDK.setShowTrialLicenseWarning(false);
        try {
            if (android.text.TextUtils.isEmpty(str2)) {
                com.microblink.blinkid.MicroblinkSDK.setLicenseKey(str, (android.content.Context) weakReference.get());
            } else {
                com.microblink.blinkid.MicroblinkSDK.setLicenseKey(str, str2, (android.content.Context) weakReference.get());
            }
            com.microblink.blinkid.MicroblinkSDK.setIntentDataTransferMode(com.microblink.blinkid.intent.IntentDataTransferMode.OPTIMISED);
            return true;
        } catch (com.microblink.blinkid.licence.exception.InvalidLicenceKeyException | java.lang.NullPointerException e) {
            com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoFpsRangesFor, e.getMessage());
            return false;
        }
    }
}
