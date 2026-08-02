package com.daon.dmds.utils;

/* loaded from: classes7.dex */
public class DMDSDocumentUtils {
    public static final java.lang.String BACK_QUALITY_IMAGE = "backQualityImage";
    public static final java.lang.String FACE_CONST = "face";
    public static final java.lang.String FACE_IMAGE = "faceImage";
    public static final java.lang.String FRONT_QUALITY_IMAGE = "frontQualityImage";
    public static final java.lang.String ID_ASPECT_RATIO_PARAM = "idAspectRatio";
    public static final java.lang.String ID_DPI_SOURCE_PARAM = "idDPISource";
    public static final java.lang.String ID_GLARE_ADAPTIVE_PARAM = "idGlareAdaptive";
    public static final java.lang.String ID_GLARE_FIXED_PARAM = "idGlareFixed";
    public static final java.lang.String ID_GLOBAL_BLUR_PARAM = "idGlobalBlur";
    public static final java.lang.String ID_HORIZ_DISTORT_PARAM = "idHorizDistort";
    public static final java.lang.String ID_ID_SOURCE_HEIGHT_PARAM = "idIDSourceHeight";
    public static final java.lang.String ID_ID_SOURCE_WIDTH_PARAM = "idIDSourceWidth";
    public static final java.lang.String ID_LOCAL_BLUR_PARAM = "idLocalBlur";
    public static final java.lang.String ID_MAX_INTERNAL_ANGLE_PARAM = "idMaxInternalAngle";
    public static final java.lang.String ID_MIN_INTERNAL_ANGLE_PARAM = "idMinInternalAngle";
    public static final java.lang.String ID_SIZE_PARAM = "idSize";
    public static final java.lang.String ID_SUMMARY_PARAM = "idSummary";
    public static final java.lang.String ID_SUM_INTERNAL_ANGLE_PARAM = "idSumInternalAngle";
    public static final java.lang.String ID_VERT_DISTORT_PARAM = "idVertDistort";
    public static final long MESSAGE_REMOVE_DELAY = 1000;
    public static final long MESSAGE_SHOW_DELAY = 1000;
    public static final java.lang.String PROCESSED_BACK_IMAGE = "processedBackImage";
    public static final java.lang.String PROCESSED_FRONT_IMAGE = "processedFrontImage";
    public static final java.lang.String SIGNATURE_IMAGE = "signatureImage";
    public static final java.lang.String UNPROCESSED_BACK_IMAGE = "unprocessedBackImage";
    public static final java.lang.String UNPROCESSED_BARCODE_IMAGE = "unprocessedBarcodeImage";
    public static final java.lang.String UNPROCESSED_FRONT_IMAGE = "unprocessedFrontImage";
    private static final java.lang.String getHighSpeedVideoSizes = "DMDSDocumentUtils";
    private static final java.text.SimpleDateFormat getHighSpeedVideoFpsRanges = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US);
    public static int ASPECT_RATIO_THRESHOLD = 4;

    /* renamed from: com.daon.dmds.utils.DMDSDocumentUtils$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[com.daon.dmds.models.DocTypeEnum.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[com.daon.dmds.models.DocTypeEnum.Passport.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DocTypeEnum.EdgeDetection.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DocTypeEnum.EdgeDetection_ID1.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DocTypeEnum.EdgeDetection_ID2.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DocTypeEnum.EdgeDetection_ID3.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DocTypeEnum.EdgeDetection_Custom.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DocTypeEnum.IdDocument.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DocTypeEnum.IdDocumentCombined.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DocTypeEnum.EdgeDetection_A4.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DocTypeEnum.EdgeDetection_A4_Landscape.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.daon.dmds.models.DocTypeEnum.EdgeDetection_A4_Portrait.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
        }
    }

    public static com.microblink.blinkid.entities.recognizers.templating.DewarpPolicy buildDewarpPolicy(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        return dMDSOptions.getDewarpPolicy() == com.daon.dmds.models.DMDSDewarpPolicy.NO_UP_SCALING ? new com.microblink.blinkid.entities.recognizers.templating.dewarpPolicies.NoUpScalingDewarpPolicy(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_KODAK_DCR_COMPRESSED) : new com.microblink.blinkid.entities.recognizers.templating.dewarpPolicies.DPIBasedDewarpPolicy(dMDSOptions.getFullDocumentImageDpi());
    }

    public static com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector buildDocumentDetector(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector documentDetector;
        switch (com.daon.dmds.utils.DMDSDocumentUtils.AnonymousClass2.getHighSpeedVideoFpsRanges[extractDocumentType(dMDSOptions.getDocumentTypes()).ordinal()]) {
            case 3:
                com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification createFromPreset = com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification.createFromPreset(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecificationPreset.DOCUMENT_SPECIFICATION_PRESET_ID1_CARD);
                com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification createFromPreset2 = com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification.createFromPreset(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecificationPreset.DOCUMENT_SPECIFICATION_PRESET_ID1_VERTICAL_CARD);
                if (!dMDSOptions.isEdgeDetectionVerticalCardScan()) {
                    documentDetector = new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector(createFromPreset);
                    break;
                } else {
                    documentDetector = new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector(createFromPreset, createFromPreset2);
                    break;
                }
            case 4:
                com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification createFromPreset3 = com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification.createFromPreset(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecificationPreset.DOCUMENT_SPECIFICATION_PRESET_ID2_CARD);
                com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification createFromPreset4 = com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification.createFromPreset(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecificationPreset.DOCUMENT_SPECIFICATION_PRESET_ID2_VERTICAL_CARD);
                if (!dMDSOptions.isEdgeDetectionVerticalCardScan()) {
                    documentDetector = new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector(createFromPreset3);
                    break;
                } else {
                    documentDetector = new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector(createFromPreset3, createFromPreset4);
                    break;
                }
            case 5:
            case 6:
                com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification documentSpecification = new com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification(dMDSOptions.getCustomEdgeDetectionAspectRatio(), dMDSOptions.getCustomEdgeDetectionPhysicalHeightInInches());
                com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification documentSpecification2 = new com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification(1.0d / dMDSOptions.getCustomEdgeDetectionAspectRatio(), dMDSOptions.getCustomEdgeDetectionPhysicalHeightInInches());
                documentSpecification.setLandscapeScale(1.0d, dMDSOptions.getEdgeDetectionPortraitScaleTolerance());
                documentSpecification.setPortraitScale(1.0d, dMDSOptions.getEdgeDetectionLandscapeScaleTolerance());
                documentSpecification2.setLandscapeScale(1.0d, dMDSOptions.getEdgeDetectionLandscapeScaleTolerance());
                documentSpecification2.setPortraitScale(1.0d, dMDSOptions.getEdgeDetectionPortraitScaleTolerance());
                if (!dMDSOptions.isEdgeDetectionVerticalCardScan()) {
                    documentDetector = new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector(documentSpecification);
                    break;
                } else {
                    documentDetector = new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector(documentSpecification, documentSpecification2);
                    break;
                }
            case 7:
            case 8:
            default:
                com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification createFromPreset5 = com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification.createFromPreset(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecificationPreset.DOCUMENT_SPECIFICATION_PRESET_ID1_CARD);
                com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification createFromPreset6 = com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification.createFromPreset(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecificationPreset.DOCUMENT_SPECIFICATION_PRESET_ID1_VERTICAL_CARD);
                com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification createFromPreset7 = com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification.createFromPreset(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecificationPreset.DOCUMENT_SPECIFICATION_PRESET_A4_PORTRAIT);
                com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification createFromPreset8 = com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification.createFromPreset(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecificationPreset.DOCUMENT_SPECIFICATION_PRESET_A4_LANDSCAPE);
                if (!dMDSOptions.isEdgeDetectionVerticalCardScan()) {
                    documentDetector = new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector(createFromPreset5, createFromPreset7, createFromPreset8);
                    break;
                } else {
                    documentDetector = new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector(createFromPreset5, createFromPreset6, createFromPreset7, createFromPreset8);
                    break;
                }
            case 9:
                documentDetector = new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification.createFromPreset(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecificationPreset.DOCUMENT_SPECIFICATION_PRESET_A4_PORTRAIT), com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification.createFromPreset(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecificationPreset.DOCUMENT_SPECIFICATION_PRESET_A4_LANDSCAPE));
                break;
            case 10:
                documentDetector = new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification.createFromPreset(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecificationPreset.DOCUMENT_SPECIFICATION_PRESET_A4_LANDSCAPE));
                break;
            case 11:
                documentDetector = new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification.createFromPreset(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecificationPreset.DOCUMENT_SPECIFICATION_PRESET_A4_PORTRAIT));
                break;
        }
        documentDetector.setNumStableDetectionsThreshold(dMDSOptions.getStableEdgeDetectionsNumber());
        return documentDetector;
    }

    public static com.microblink.blinkid.geometry.Rectangle buildProcessingLocation(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = 0.0f;
        float f6 = 1.0f;
        if (dMDSOptions.getImageExtensionFactors().isEmpty()) {
            f = 0.0f;
            f2 = 1.0f;
        } else {
            if (dMDSOptions.getImageExtensionFactors().getLeft() != 0.0f) {
                f3 = 0.0f - dMDSOptions.getImageExtensionFactors().getLeft();
                f4 = dMDSOptions.getImageExtensionFactors().getLeft() + 1.0f;
            } else {
                f3 = 0.0f;
                f4 = 1.0f;
            }
            if (dMDSOptions.getImageExtensionFactors().getRight() != 0.0f) {
                f4 += dMDSOptions.getImageExtensionFactors().getRight();
            }
            if (dMDSOptions.getImageExtensionFactors().getTop() != 0.0f) {
                f = 0.0f - dMDSOptions.getImageExtensionFactors().getTop();
                f6 = 1.0f + dMDSOptions.getImageExtensionFactors().getTop();
            } else {
                f = 0.0f;
            }
            if (dMDSOptions.getImageExtensionFactors().getBottom() != 0.0f) {
                f6 += dMDSOptions.getImageExtensionFactors().getBottom();
            }
            f5 = f3;
            f2 = f6;
            f6 = f4;
        }
        return new com.microblink.blinkid.geometry.Rectangle(f5, f, f6, f2);
    }

    public static int calculateScaleFactor(android.graphics.Bitmap bitmap, int i) {
        if (bitmap == null) {
            return -1;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = 1;
        if (java.lang.Math.max(width, height) <= i) {
            return 1;
        }
        while (true) {
            if ((width / i2) / 2 < i && (height / i2) / 2 < i) {
                return i2;
            }
            i2 *= 2;
        }
    }

    public static boolean checkIfDocumentIsTilted(com.daon.dmds.models.DMDSOptions dMDSOptions, com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        android.graphics.Point upperLeft = dMDSQuadrangle.getUpperLeft();
        android.graphics.Point upperRight = dMDSQuadrangle.getUpperRight();
        android.graphics.Point lowerLeft = dMDSQuadrangle.getLowerLeft();
        android.graphics.Point lowerRight = dMDSQuadrangle.getLowerRight();
        android.graphics.Point point = new android.graphics.Point(upperLeft.x - lowerLeft.x, upperLeft.y - lowerLeft.y);
        android.graphics.Point point2 = new android.graphics.Point(upperRight.x - upperLeft.x, upperRight.y - upperLeft.y);
        android.graphics.Point point3 = new android.graphics.Point(lowerRight.x - upperRight.x, lowerRight.y - upperRight.y);
        android.graphics.Point point4 = new android.graphics.Point(lowerLeft.x - lowerRight.x, lowerLeft.y - lowerRight.y);
        double d = (point.x * point2.x) + (point.y * point2.y);
        int i = point.x;
        int i2 = point.y;
        double sqrt = java.lang.Math.sqrt((i * i) + (i2 * i2));
        int i3 = point2.x;
        int i4 = point2.y;
        double degrees = java.lang.Math.toDegrees(java.lang.Math.acos(d / (sqrt * java.lang.Math.sqrt((i3 * i3) + (i4 * i4)))));
        double d2 = (point2.x * point3.x) + (point2.y * point3.y);
        int i5 = point2.x;
        int i6 = point2.y;
        double sqrt2 = java.lang.Math.sqrt((i5 * i5) + (i6 * i6));
        int i7 = point3.x;
        int i8 = point3.y;
        double degrees2 = java.lang.Math.toDegrees(java.lang.Math.acos(d2 / (sqrt2 * java.lang.Math.sqrt((i7 * i7) + (i8 * i8)))));
        double d3 = (point3.x * point4.x) + (point3.y * point4.y);
        int i9 = point3.x;
        int i10 = point3.y;
        double sqrt3 = java.lang.Math.sqrt((i9 * i9) + (i10 * i10));
        int i11 = point4.x;
        int i12 = point4.y;
        double degrees3 = java.lang.Math.toDegrees(java.lang.Math.acos(d3 / (sqrt3 * java.lang.Math.sqrt((i11 * i11) + (i12 * i12)))));
        double d4 = (point4.x * point.x) + (point4.y * point.y);
        int i13 = point4.x;
        int i14 = point4.y;
        double sqrt4 = java.lang.Math.sqrt((i13 * i13) + (i14 * i14));
        int i15 = point.x;
        int i16 = point.y;
        double degrees4 = java.lang.Math.toDegrees(java.lang.Math.acos(d4 / (sqrt4 * java.lang.Math.sqrt((i15 * i15) + (i16 * i16)))));
        java.lang.String str = getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("upperLeft: ");
        sb.append(degrees);
        sb.append("  upperRight: ");
        sb.append(degrees2);
        sb.append("  lowerRight: ");
        sb.append(degrees3);
        sb.append("  lowerLeft: ");
        sb.append(degrees4);
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb.toString());
        if (degrees >= dMDSOptions.getMinTiltAngle() && degrees <= dMDSOptions.getMaxTiltAngle()) {
            return false;
        }
        if (degrees2 >= dMDSOptions.getMinTiltAngle() && degrees2 <= dMDSOptions.getMaxTiltAngle()) {
            return false;
        }
        if (degrees3 < dMDSOptions.getMinTiltAngle() || degrees3 > dMDSOptions.getMaxTiltAngle()) {
            return degrees4 < dMDSOptions.getMinTiltAngle() || degrees4 > dMDSOptions.getMaxTiltAngle();
        }
        return false;
    }

    public static boolean checkIfLicenseExceptionOccurred(java.lang.Throwable th) {
        while (!(th instanceof com.microblink.blinkid.licence.exception.InvalidLicenceKeyException)) {
            if (th == null) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    public static android.graphics.Bitmap cropPoly(android.graphics.Bitmap bitmap, com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        if (bitmap != null && dMDSQuadrangle != null) {
            int abs = java.lang.Math.abs(dMDSQuadrangle.getLowerRight().x - dMDSQuadrangle.getLowerLeft().x);
            int abs2 = java.lang.Math.abs(dMDSQuadrangle.getLowerLeft().y - dMDSQuadrangle.getUpperLeft().y);
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(abs, abs2, bitmap.getConfig());
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            float[] fArr = {dMDSQuadrangle.getUpperLeft().x, dMDSQuadrangle.getUpperLeft().y, dMDSQuadrangle.getUpperRight().x, dMDSQuadrangle.getUpperRight().y, dMDSQuadrangle.getLowerLeft().x, dMDSQuadrangle.getLowerLeft().y, dMDSQuadrangle.getLowerRight().x, dMDSQuadrangle.getLowerRight().y};
            float f = abs;
            float f2 = abs2;
            float[] fArr2 = {0.0f, 0.0f, f, 0.0f, 0.0f, f2, f, f2};
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            if (matrix.setPolyToPoly(fArr, 0, fArr2, 0, 4)) {
                canvas.drawBitmap(bitmap, matrix, null);
                return createBitmap;
            }
        }
        return null;
    }

    public static java.lang.String dateToString(com.microblink.blinkid.entities.recognizers.blinkid.generic.DateResult dateResult) {
        return dateResult == null ? "" : getHighSpeedVideoSizes(dateResult.getDate());
    }

    public static com.daon.dmds.models.DocTypeEnum extractDocumentType(java.util.List<com.daon.dmds.models.DocTypeEnum> list) {
        return list.isEmpty() ? com.daon.dmds.models.DocTypeEnum.None : list.get(0);
    }

    public static void formatUnprocessedImage(com.daon.dmds.models.DMDSResult dMDSResult, com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        float f;
        float f2;
        if (dMDSResult == null || orientation == null) {
            com.daon.dmds.utils.DobsLogUtils.logError(getHighSpeedVideoSizes, "Invalid input parameters");
            return;
        }
        com.daon.dmds.models.DMDSQuadrangle processedDocumentCoordinates = dMDSResult.getDocument().getProcessedDocumentCoordinates();
        android.graphics.Bitmap unprocessedImage = dMDSResult.getDocument().getUnprocessedImage();
        if (unprocessedImage == null) {
            com.daon.dmds.utils.DobsLogUtils.logError(getHighSpeedVideoSizes, "Invalid data");
            return;
        }
        int height = dMDSResult.getDocument().getUnprocessedImage().getHeight();
        int width = dMDSResult.getDocument().getUnprocessedImage().getWidth();
        int orientation2Rotation = com.daon.dmds.utils.MBUtils.orientation2Rotation(orientation);
        if (com.daon.dmds.utils.MBUtils.shouldTranslateImage(orientation)) {
            f = (height - width) / 2.0f;
            f2 = (width - height) / 2.0f;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (orientation2Rotation != 0) {
            android.graphics.Rect rect = new android.graphics.Rect(0, 0, width, height);
            matrix.postRotate(orientation2Rotation, rect.exactCenterX(), rect.exactCenterY());
        }
        if (f != 0.0f || f2 != 0.0f) {
            matrix.postTranslate(f, f2);
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(unprocessedImage, 0, 0, width, height, matrix, true);
        if (processedDocumentCoordinates != null) {
            float[] fArr = {processedDocumentCoordinates.getUpperLeft().x, processedDocumentCoordinates.getUpperLeft().y, processedDocumentCoordinates.getUpperRight().x, processedDocumentCoordinates.getUpperRight().y, processedDocumentCoordinates.getLowerRight().x, processedDocumentCoordinates.getLowerRight().y, processedDocumentCoordinates.getLowerLeft().x, processedDocumentCoordinates.getLowerLeft().y};
            matrix.mapPoints(fArr);
            com.daon.dmds.utils.DMDSPointParser.sortPoints(fArr, processedDocumentCoordinates);
        }
        dMDSResult.getDocument().setUnprocessedImage(createBitmap);
        dMDSResult.getDocument().setProcessedDocumentCoordinates(processedDocumentCoordinates);
        if (unprocessedImage.isRecycled()) {
            return;
        }
        unprocessedImage.recycle();
    }

    public static android.app.Activity getActivity(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static com.daon.dmds.models.DMDSDocumentDetectionStatus getAnalyzeStatusFromDetectionIssues(com.daon.dmds.models.DMDSDocumentDetectionIssues dMDSDocumentDetectionIssues) {
        boolean isDocumentTilted = dMDSDocumentDetectionIssues.isDocumentTilted();
        boolean isDocumentFillsScanningArea = dMDSDocumentDetectionIssues.isDocumentFillsScanningArea();
        boolean isDocumentTooCloseToEdge = dMDSDocumentDetectionIssues.isDocumentTooCloseToEdge();
        boolean isDocumentTooCloseToCamera = dMDSDocumentDetectionIssues.isDocumentTooCloseToCamera();
        boolean isBlurDetected = dMDSDocumentDetectionIssues.isBlurDetected();
        return dMDSDocumentDetectionIssues.isWrongSideDetected() ? com.daon.dmds.models.DMDSDocumentDetectionStatus.WRONG_SIDE_DETECTED : dMDSDocumentDetectionIssues.isFaceNotFound() ? com.daon.dmds.models.DMDSDocumentDetectionStatus.FACE_NOT_FOUND : dMDSDocumentDetectionIssues.isGlareDetected() ? com.daon.dmds.models.DMDSDocumentDetectionStatus.GLARE_DETECTED : isBlurDetected ? com.daon.dmds.models.DMDSDocumentDetectionStatus.BLUR_DETECTED : isDocumentTooCloseToEdge ? com.daon.dmds.models.DMDSDocumentDetectionStatus.DOCUMENT_TOO_CLOSE_TO_EDGE : isDocumentTooCloseToCamera ? com.daon.dmds.models.DMDSDocumentDetectionStatus.DOCUMENT_TOO_CLOSE_TO_CAMERA : isDocumentTilted ? com.daon.dmds.models.DMDSDocumentDetectionStatus.DOCUMENT_TILTED : !isDocumentFillsScanningArea ? com.daon.dmds.models.DMDSDocumentDetectionStatus.DOCUMENT_DOES_NOT_FILL_SCANNING_AREA : com.daon.dmds.models.DMDSDocumentDetectionStatus.NO_ERROR;
    }

    public static java.util.List<com.daon.dmds.models.DocTypeEnum> getAvailableDocumentTypes(java.lang.String str, java.lang.String str2, android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.daon.dmds.utils.MBUtils.setupLicense(str, str2, context)) {
            com.daon.dmds.utils.DobsLogUtils.logError(getHighSpeedVideoSizes, "Invalid licence key");
            return arrayList;
        }
        com.daon.dmds.models.DMDSOptions dMDSOptions = new com.daon.dmds.models.DMDSOptions();
        for (com.daon.dmds.models.DocTypeEnum docTypeEnum : com.daon.dmds.models.DocTypeEnum.values()) {
            if (docTypeEnum != com.daon.dmds.models.DocTypeEnum.None) {
                try {
                    com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(docTypeEnum).buildRecognizerBundle(dMDSOptions);
                    arrayList.add(docTypeEnum);
                } catch (java.lang.Exception | java.lang.UnsatisfiedLinkError e) {
                    com.daon.dmds.utils.DobsLogUtils.getStackTrace(e);
                }
            }
        }
        java.util.Collections.sort(arrayList, new java.util.Comparator<com.daon.dmds.models.DocTypeEnum>() { // from class: com.daon.dmds.utils.DMDSDocumentUtils.1
            @Override // java.util.Comparator
            public /* synthetic */ int compare(com.daon.dmds.models.DocTypeEnum docTypeEnum2, com.daon.dmds.models.DocTypeEnum docTypeEnum3) {
                return docTypeEnum2.name().compareTo(docTypeEnum3.name());
            }
        });
        return arrayList;
    }

    public static android.graphics.Bitmap getDocumentImageForFaceExtraction(com.daon.dmds.models.ResponseData responseData, com.daon.dmds.recognizers.DocumentRecognizer documentRecognizer) {
        if (!(documentRecognizer instanceof com.daon.dmds.recognizers.FaceExtractor)) {
            return responseData.getResult().getDocument().getProcessedImage();
        }
        com.daon.dmds.recognizers.FaceExtractor faceExtractor = (com.daon.dmds.recognizers.FaceExtractor) documentRecognizer;
        if (faceExtractor.getFaceFromRecogniser() != null) {
            return faceExtractor.getFaceFromRecogniser();
        }
        return null;
    }

    public static com.daon.dmds.models.DocumentSide getDocumentSide(com.daon.dmds.models.ResponseData responseData) {
        return responseData.getResult().getDocument().getProcessedBackImage() != null ? com.daon.dmds.models.DocumentSide.SECOND : com.daon.dmds.models.DocumentSide.FIRST;
    }

    public static com.daon.dmds.models.DocTypeEnum getEnumFromName(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return com.daon.dmds.models.DocTypeEnum.None;
        }
        for (com.daon.dmds.models.DocTypeEnum docTypeEnum : com.daon.dmds.models.DocTypeEnum.values()) {
            if (docTypeEnum.name().equals(str)) {
                return docTypeEnum;
            }
        }
        return com.daon.dmds.models.DocTypeEnum.None;
    }

    public static com.daon.dmds.models.DMDSOptions getFallbackOptions(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        com.daon.dmds.models.DMDSOptions dMDSOptions2 = new com.daon.dmds.models.DMDSOptions(dMDSOptions);
        dMDSOptions2.setDocumentTypes(java.util.Collections.singletonList(dMDSOptions.getFallbackToEdgeDetectionDocumentType()));
        return dMDSOptions2;
    }

    public static com.microblink.blinkid.hardware.orientation.Orientation getMBOrientation(android.content.Context context, com.daon.dmds.recognizers.DocumentRecognizer documentRecognizer) {
        return documentRecognizer instanceof com.daon.dmds.recognizers.documents.BlinkIDCombinedDocument ? ((com.daon.dmds.recognizers.documents.BlinkIDCombinedDocument) documentRecognizer).getDocumentRotation().toMBOrientation() : com.daon.dmds.utils.MBUtils.getOrientation(context);
    }

    public static com.daon.dmds.models.DMDSDocumentDetectionStatus getMostFrequentStatus(java.util.List<com.daon.dmds.models.DMDSDocumentDetectionStatus> list) {
        java.util.Iterator it = new java.util.HashSet(list).iterator();
        com.daon.dmds.models.DMDSDocumentDetectionStatus dMDSDocumentDetectionStatus = null;
        int i = -1;
        while (it.hasNext()) {
            com.daon.dmds.models.DMDSDocumentDetectionStatus dMDSDocumentDetectionStatus2 = (com.daon.dmds.models.DMDSDocumentDetectionStatus) it.next();
            int frequency = java.util.Collections.frequency(list, dMDSDocumentDetectionStatus2);
            if (frequency > i) {
                dMDSDocumentDetectionStatus = dMDSDocumentDetectionStatus2;
                i = frequency;
            }
        }
        return dMDSDocumentDetectionStatus;
    }

    public static java.lang.String getSDKVersion() {
        return com.daon.dmds.BuildConfig.SDK_VERSION;
    }

    public static android.graphics.Point getScreenDimensions(android.content.Context context) {
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME)).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static android.graphics.Bitmap getUnprocessedImage(com.daon.dmds.models.ResponseData responseData) {
        return responseData.getResult().getDocument().getProcessedBackImage() != null ? responseData.getResult().getDocument().getUnprocessedBackImage() : responseData.getResult().getDocument().getUnprocessedImage();
    }

    public static void handleFeedbackMessages(boolean z, com.daon.dmds.models.DMDSDocumentDetectionStatus dMDSDocumentDetectionStatus, com.daon.dmds.managers.DMDSCustomScanListener dMDSCustomScanListener, java.util.List<com.daon.dmds.models.DMDSDocumentDetectionStatus> list, boolean z2) {
        if (!z) {
            dMDSCustomScanListener.documentDetectionStatus(dMDSDocumentDetectionStatus);
            return;
        }
        list.add(dMDSDocumentDetectionStatus);
        if (z2) {
            com.daon.dmds.models.DMDSDocumentDetectionStatus mostFrequentStatus = getMostFrequentStatus(list);
            list.clear();
            dMDSCustomScanListener.documentDetectionStatus(mostFrequentStatus);
        }
    }

    public static boolean ignoreDocumentManualCropping(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        return java.util.Objects.requireNonNull(extractDocumentType(dMDSOptions.getDocumentTypes())) == com.daon.dmds.models.DocTypeEnum.IdDocumentCombined;
    }

    public static boolean ignoreFallbackToEdgeDetection(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        return java.util.Objects.requireNonNull(extractDocumentType(dMDSOptions.getDocumentTypes())) == com.daon.dmds.models.DocTypeEnum.IdDocumentCombined;
    }

    public static boolean isDocTypeFromEdgeGroup(java.lang.String str) {
        return str.contentEquals(com.daon.dmds.models.DocTypeEnum.EdgeDetection.name()) || str.contentEquals(com.daon.dmds.models.DocTypeEnum.EdgeDetection_A4.name()) || str.contentEquals(com.daon.dmds.models.DocTypeEnum.EdgeDetection_A4_Landscape.name()) || str.contentEquals(com.daon.dmds.models.DocTypeEnum.EdgeDetection_A4_Portrait.name()) || str.contentEquals(com.daon.dmds.models.DocTypeEnum.EdgeDetection_ID1.name()) || str.contentEquals(com.daon.dmds.models.DocTypeEnum.EdgeDetection_ID2.name()) || str.contentEquals(com.daon.dmds.models.DocTypeEnum.EdgeDetection_ID3.name()) || str.contentEquals(com.daon.dmds.models.DocTypeEnum.EdgeDetection_Custom.name());
    }

    public static boolean isFaceMissingFromDocumentImage(com.microblink.blinkid.entities.recognizers.blinkid.generic.AdditionalProcessingInfo... additionalProcessingInfoArr) {
        if (additionalProcessingInfoArr.length > 0) {
            for (com.microblink.blinkid.entities.recognizers.blinkid.generic.ImageExtractionType imageExtractionType : additionalProcessingInfoArr[0].getImageExtractionFailures()) {
                if (imageExtractionType != null && imageExtractionType.name().equalsIgnoreCase("face")) {
                    return true;
                }
            }
        }
        if (additionalProcessingInfoArr.length > 1) {
            for (com.microblink.blinkid.entities.recognizers.blinkid.generic.ImageExtractionType imageExtractionType2 : additionalProcessingInfoArr[1].getImageExtractionFailures()) {
                if (imageExtractionType2 != null && imageExtractionType2.name().equalsIgnoreCase("face")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static java.lang.Boolean isOldIdCaptureLibrary() {
        if (!com.daon.dmds.utils.DMDSValidator.validateFaceQualityDependencies()) {
            return java.lang.Boolean.TRUE;
        }
        try {
            return java.lang.Boolean.valueOf(java.lang.Integer.parseInt(com.daon.idcapture.IDCapture.version().replaceAll("[^0-9]", "")) < 1600);
        } catch (java.lang.NumberFormatException e) {
            com.daon.dmds.utils.DobsLogUtils.getStackTrace(e);
            return java.lang.Boolean.FALSE;
        }
    }

    public static boolean isScanningRegionFilled(boolean z, java.lang.String str) {
        if (z) {
            return true;
        }
        switch (com.daon.dmds.utils.DMDSDocumentUtils.AnonymousClass2.getHighSpeedVideoFpsRanges[getEnumFromName(str).ordinal()]) {
        }
        return true;
    }

    public static com.daon.dmds.models.DocTypeEnum isSecondRecognitionRequired(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        return isSecondRecognitionRequired(extractDocumentType(dMDSOptions.getDocumentTypes()));
    }

    public static boolean isUiThread() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper();
    }

    public static boolean listContainsDocType(java.util.List<com.daon.dmds.models.DocTypeEnum> list, com.daon.dmds.models.DocTypeEnum docTypeEnum) {
        if (list == null || docTypeEnum == null) {
            return false;
        }
        java.util.Iterator<com.daon.dmds.models.DocTypeEnum> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().name().contentEquals(docTypeEnum.name())) {
                return true;
            }
        }
        return false;
    }

    public static boolean listContainsEdgeDetection(java.util.List<com.daon.dmds.models.DocTypeEnum> list) {
        return list.contains(com.daon.dmds.models.DocTypeEnum.EdgeDetection) || list.contains(com.daon.dmds.models.DocTypeEnum.EdgeDetection_A4) || list.contains(com.daon.dmds.models.DocTypeEnum.EdgeDetection_A4_Landscape) || list.contains(com.daon.dmds.models.DocTypeEnum.EdgeDetection_A4_Portrait) || list.contains(com.daon.dmds.models.DocTypeEnum.EdgeDetection_ID1) || list.contains(com.daon.dmds.models.DocTypeEnum.EdgeDetection_ID2) || list.contains(com.daon.dmds.models.DocTypeEnum.EdgeDetection_ID3) || list.contains(com.daon.dmds.models.DocTypeEnum.EdgeDetection_Custom);
    }

    public static double logBitmapSize(android.graphics.Bitmap bitmap, java.lang.String str) {
        if (bitmap == null) {
            return 0.0d;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        if (byteArrayOutputStream.toByteArray() == null) {
            return 0.0d;
        }
        double length = r4.length / 1048576.0d;
        new java.text.DecimalFormat("#.##").format(length);
        return length;
    }

    public static android.graphics.Bitmap padImageForServerProcessing(android.graphics.Bitmap bitmap, com.daon.dmds.models.DMDSOptions dMDSOptions) {
        if (bitmap == null) {
            return null;
        }
        int documentBorderWidth = dMDSOptions.getDocumentBorderWidth();
        if (documentBorderWidth == 0) {
            return bitmap;
        }
        int i = documentBorderWidth * 2;
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap.getWidth() + i, bitmap.getHeight() + i, bitmap.getConfig());
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawARGB(255, 255, 255, 255);
        float f = documentBorderWidth;
        canvas.drawBitmap(bitmap, f, f, (android.graphics.Paint) null);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static void padProcessedBitmap(com.daon.dmds.models.DMDSResult dMDSResult, com.daon.dmds.models.DMDSOptions dMDSOptions) {
        android.graphics.Bitmap processedImage = dMDSResult.getDocument().getProcessedImage();
        if (processedImage != null) {
            dMDSResult.getDocument().setProcessedImage(padImageForServerProcessing(processedImage, dMDSOptions));
        }
        android.graphics.Bitmap processedBackImage = dMDSResult.getDocument().getProcessedBackImage();
        if (processedBackImage != null) {
            dMDSResult.getDocument().setProcessedBackImage(padImageForServerProcessing(processedBackImage, dMDSOptions));
        }
    }

    public static com.daon.dmds.models.DMDSDocumentResultQuality populateQualityData(java.util.Map<java.lang.String, java.lang.String> map) {
        com.daon.dmds.models.DMDSDocumentResultQuality.Builder builder = new com.daon.dmds.models.DMDSDocumentResultQuality.Builder();
        if (map.containsKey(ID_SUMMARY_PARAM) && isOldIdCaptureLibrary().booleanValue()) {
            builder.setSummary(java.lang.Double.parseDouble((java.lang.String) java.util.Objects.requireNonNull(map.get(ID_SUMMARY_PARAM))));
        }
        if (map.containsKey(ID_ASPECT_RATIO_PARAM)) {
            builder.setAspectRatio(java.lang.Double.parseDouble((java.lang.String) java.util.Objects.requireNonNull(map.get(ID_ASPECT_RATIO_PARAM))));
        }
        if (map.containsKey(ID_SIZE_PARAM)) {
            builder.setSize(java.lang.Double.parseDouble((java.lang.String) java.util.Objects.requireNonNull(map.get(ID_SIZE_PARAM))));
        }
        if (map.containsKey(ID_VERT_DISTORT_PARAM)) {
            builder.setVertDistort(java.lang.Double.parseDouble((java.lang.String) java.util.Objects.requireNonNull(map.get(ID_VERT_DISTORT_PARAM))));
        }
        if (map.containsKey(ID_HORIZ_DISTORT_PARAM)) {
            builder.setHorizDistort(java.lang.Double.parseDouble((java.lang.String) java.util.Objects.requireNonNull(map.get(ID_HORIZ_DISTORT_PARAM))));
        }
        if (map.containsKey(ID_MIN_INTERNAL_ANGLE_PARAM)) {
            builder.setMinInternalAngle(java.lang.Double.parseDouble((java.lang.String) java.util.Objects.requireNonNull(map.get(ID_MIN_INTERNAL_ANGLE_PARAM))));
        }
        if (map.containsKey(ID_MAX_INTERNAL_ANGLE_PARAM)) {
            builder.setMaxInternalAngle(java.lang.Double.parseDouble((java.lang.String) java.util.Objects.requireNonNull(map.get(ID_MAX_INTERNAL_ANGLE_PARAM))));
        }
        if (map.containsKey(ID_SUM_INTERNAL_ANGLE_PARAM)) {
            builder.setSumInternalAngle(java.lang.Double.parseDouble((java.lang.String) java.util.Objects.requireNonNull(map.get(ID_SUM_INTERNAL_ANGLE_PARAM))));
        }
        if (map.containsKey(ID_GLARE_FIXED_PARAM)) {
            builder.setGlareFixed(java.lang.Double.parseDouble((java.lang.String) java.util.Objects.requireNonNull(map.get(ID_GLARE_FIXED_PARAM))));
        }
        if (map.containsKey(ID_LOCAL_BLUR_PARAM)) {
            builder.setLocalBlur(java.lang.Double.parseDouble((java.lang.String) java.util.Objects.requireNonNull(map.get(ID_LOCAL_BLUR_PARAM))));
        }
        if (map.containsKey(ID_GLOBAL_BLUR_PARAM) && isOldIdCaptureLibrary().booleanValue()) {
            builder.setGlobalBlur(java.lang.Double.parseDouble((java.lang.String) java.util.Objects.requireNonNull(map.get(ID_GLOBAL_BLUR_PARAM))));
        }
        if (map.containsKey(ID_ID_SOURCE_WIDTH_PARAM)) {
            builder.setIDSourceWidth(java.lang.Integer.parseInt((java.lang.String) java.util.Objects.requireNonNull(map.get(ID_ID_SOURCE_WIDTH_PARAM))));
        }
        if (map.containsKey(ID_ID_SOURCE_HEIGHT_PARAM)) {
            builder.setIDSourceHeight(java.lang.Integer.parseInt((java.lang.String) java.util.Objects.requireNonNull(map.get(ID_ID_SOURCE_HEIGHT_PARAM))));
        }
        if (map.containsKey(ID_DPI_SOURCE_PARAM)) {
            builder.setDPISource(java.lang.Integer.parseInt((java.lang.String) java.util.Objects.requireNonNull(map.get(ID_DPI_SOURCE_PARAM))));
        }
        return builder.build();
    }

    public static com.daon.dmds.models.ResponseData processSecondStageResults(com.daon.dmds.models.ResponseData responseData, com.daon.dmds.models.ResponseData responseData2) {
        if (responseData == null) {
            return responseData2;
        }
        responseData.getResult().getDocument().setProcessedImage(responseData2.getResult().getDocument().getProcessedImage());
        responseData.getResult().getDocument().setUnprocessedImage(responseData2.getResult().getDocument().getUnprocessedImage());
        responseData.setImageOrientation(responseData2.getImageOrientation());
        return responseData;
    }

    public static android.graphics.Bitmap rotateImage(android.graphics.Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        if (i == 0) {
            return bitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        matrix.postRotate(i, rect.exactCenterX(), rect.exactCenterY());
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static android.graphics.Bitmap scaleBitmap(android.graphics.Bitmap bitmap) {
        int calculateScaleFactor;
        if (bitmap == null || (calculateScaleFactor = calculateScaleFactor(bitmap, 2000)) <= 1) {
            return bitmap;
        }
        java.lang.String str = getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Old size: ");
        sb.append(bitmap.getByteCount() / 1048576);
        sb.append(" Mb");
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb.toString());
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / calculateScaleFactor, bitmap.getHeight() / calculateScaleFactor, false);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("New size: ");
        sb2.append(createScaledBitmap.getByteCount() / 1048576);
        sb2.append(" Mb");
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb2.toString());
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createScaledBitmap;
    }

    public static void startSoundVibrateNotification(android.content.Context context) {
        new android.media.ToneGenerator(1, 70).startTone(25, 100);
        try {
            ((android.os.Vibrator) context.getSystemService("vibrator")).vibrate(200L);
        } catch (java.lang.SecurityException e) {
            com.daon.dmds.utils.DobsLogUtils.getStackTrace(e);
        }
    }

    public static com.daon.dmds.models.DocTypeEnum isSecondRecognitionRequired(com.daon.dmds.models.DocTypeEnum docTypeEnum) {
        if (java.util.Objects.requireNonNull(docTypeEnum) == com.daon.dmds.models.DocTypeEnum.IdBarcodeDocument) {
            return com.daon.dmds.models.DocTypeEnum.EdgeDetection_ID1;
        }
        return com.daon.dmds.models.DocTypeEnum.None;
    }

    public static java.lang.String dateToString(com.microblink.blinkid.results.date.Date date) {
        if (date == null) {
            return "";
        }
        return getHighSpeedVideoSizes(date.getDate());
    }

    public static java.lang.Float getMaxExtensionValue(com.daon.dmds.models.DMDSImageExtensionFactors dMDSImageExtensionFactors) {
        return (java.lang.Float) java.util.Collections.max(new java.util.ArrayList(java.util.Arrays.asList(java.lang.Float.valueOf(dMDSImageExtensionFactors.getTop()), java.lang.Float.valueOf(dMDSImageExtensionFactors.getBottom()), java.lang.Float.valueOf(dMDSImageExtensionFactors.getLeft()), java.lang.Float.valueOf(dMDSImageExtensionFactors.getRight()))));
    }

    private static java.lang.String getHighSpeedVideoSizes(com.microblink.blinkid.results.date.SimpleDate simpleDate) {
        if (simpleDate == null) {
            return "";
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(1, simpleDate.getYear());
        calendar.set(2, simpleDate.getMonth() - 1);
        calendar.set(5, simpleDate.getDay());
        return getHighSpeedVideoFpsRanges.format(calendar.getTime());
    }

    public static com.daon.dmds.models.DMDSOrientation getDeviceOrientation(android.content.Context context) {
        int rotation = ((android.view.WindowManager) context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME)).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return com.daon.dmds.models.DMDSOrientation.DMDS_ORIENTATION_LANDSCAPE_RIGHT;
        }
        if (rotation == 2) {
            return com.daon.dmds.models.DMDSOrientation.DMDS_ORIENTATION_PORTRAIT_UPSIDE;
        }
        if (rotation != 3) {
            return com.daon.dmds.models.DMDSOrientation.DMDS_ORIENTATION_PORTRAIT;
        }
        return com.daon.dmds.models.DMDSOrientation.DMDS_ORIENTATION_LANDSCAPE_LEFT;
    }

    public static com.daon.dmds.models.DMDSQuadrangle getDocumentDetectionPoints(android.content.Context context, com.daon.dmds.recognizers.DocumentRecognizer documentRecognizer, com.daon.dmds.models.ResponseData responseData, android.graphics.Bitmap bitmap, com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection displayableQuadDetection) {
        com.daon.dmds.models.DMDSDocumentRotation documentRotation = documentRecognizer instanceof com.daon.dmds.recognizers.documents.BlinkIDDocument ? ((com.daon.dmds.recognizers.documents.BlinkIDDocument) documentRecognizer).getDocumentRotation() : null;
        if (responseData.getResult().getDocument().getProcessedBackImage() != null) {
            if (documentRecognizer instanceof com.daon.dmds.recognizers.documents.BlinkIDCombinedDocument) {
                documentRotation = ((com.daon.dmds.recognizers.documents.BlinkIDCombinedDocument) documentRecognizer).getDocumentRotationBack();
            }
        } else if (documentRecognizer instanceof com.daon.dmds.recognizers.documents.BlinkIDCombinedDocument) {
            documentRotation = ((com.daon.dmds.recognizers.documents.BlinkIDCombinedDocument) documentRecognizer).getDocumentRotation();
        }
        if (documentRotation != null) {
            return com.daon.dmds.utils.DMDSPointParser.rotatePoints(displayableQuadDetection, documentRotation.toMBOrientation(), bitmap.getWidth(), bitmap.getHeight());
        }
        return com.daon.dmds.utils.DMDSPointParser.rotatePoints(displayableQuadDetection, com.daon.dmds.utils.MBUtils.getOrientation(context), bitmap.getWidth(), bitmap.getHeight());
    }
}
