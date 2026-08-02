package com.daon.dmds.utils;

/* loaded from: classes7.dex */
public class DMDSValidator {
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = "DMDSValidator";

    private static boolean Camera2StreamConfigurationMap() {
        try {
            java.lang.Class.forName("com.microblink.blinkid.view.recognition.RecognizerRunnerView");
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            com.daon.dmds.utils.DobsLogUtils.logError(getHighSpeedVideoFpsRangesFor, "Missing dependency: com.microblink:blinkid");
            return false;
        }
    }

    private static boolean getHighSpeedVideoFpsRanges() {
        try {
            java.lang.Class.forName("com.daon.face.quality.DaonFaceQuality");
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            com.daon.dmds.utils.DobsLogUtils.logError(getHighSpeedVideoFpsRangesFor, "Missing dependency: com.daon.sdk.face.quality");
            return false;
        }
    }

    private static boolean getHighSpeedVideoFpsRangesFor() {
        try {
            java.lang.Class.forName("com.daon.idcapture.IDCapture");
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            com.daon.dmds.utils.DobsLogUtils.logError(getHighSpeedVideoFpsRangesFor, "Missing dependency: com.daon.idcapture");
            return false;
        }
    }

    private static boolean getHighSpeedVideoSizes() {
        try {
            java.lang.Class.forName("com.daon.sdk.face.DaonFace");
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            com.daon.dmds.utils.DobsLogUtils.logError(getHighSpeedVideoFpsRangesFor, "Missing dependency: com.daon.sdk.face");
            return false;
        }
    }

    public static boolean isBarcodeValid(java.lang.String str) {
        boolean matches = str.matches("[0-9]{13}");
        if (!matches) {
            return false;
        }
        boolean isValidDateFormat = isValidDateFormat(com.miteksystems.misnap.core.DateUtil.ICAO_DATE_FORMAT, str.substring(0, 6));
        boolean isValidGender = isValidGender(str.substring(6, 10));
        java.lang.String substring = str.substring(10, 11);
        return matches && isValidDateFormat && isValidGender && (java.lang.Integer.parseInt(substring) == 0 || java.lang.Integer.parseInt(substring) == 1) && isValidCheckSum(str);
    }

    public static boolean isRectValid(com.daon.dmds.models.DMDSRect dMDSRect) {
        return dMDSRect != null && dMDSRect.getWidth() > 0.0f && dMDSRect.getHeight() > 0.0f;
    }

    public static boolean isValidCheckSum(java.lang.String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("");
            sb.append(str.charAt(i2));
            int parseInt = java.lang.Integer.parseInt(sb.toString());
            int i3 = i2 % 2;
            i += (int) ((parseInt * java.lang.Math.pow(2.0d, i3)) % 10.0d);
            if (parseInt >= 5 && i3 == 1) {
                i++;
            }
        }
        return i % 10 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isValidDateFormat(java.lang.String str, java.lang.String str2) {
        java.text.ParseException e;
        java.util.Date date = null;
        try {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, java.util.Locale.US);
            java.util.Date parse = simpleDateFormat.parse(str2);
            try {
                if (str2.equals(simpleDateFormat.format(parse))) {
                    date = parse;
                }
            } catch (java.text.ParseException e2) {
                e = e2;
                date = parse;
                com.daon.dmds.utils.DobsLogUtils.getStackTrace(e);
                if (date == null) {
                }
            }
        } catch (java.text.ParseException e3) {
            e = e3;
        }
        return date == null;
    }

    public static boolean isValidGender(java.lang.String str) {
        int parseInt = java.lang.Integer.parseInt(str);
        if (parseInt < 0 || parseInt > 4999) {
            return parseInt >= 5000 && parseInt <= 9999;
        }
        return true;
    }

    public static boolean validateDependencies(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        boolean isFaceDetection = dMDSOptions.isFaceDetection();
        boolean isQualityFilterEnabled = dMDSOptions.isQualityFilterEnabled();
        if (!Camera2StreamConfigurationMap()) {
            return false;
        }
        if (!isFaceDetection || (getHighSpeedVideoSizes() && getHighSpeedVideoFpsRanges())) {
            return !isQualityFilterEnabled || validateFaceQualityDependencies();
        }
        return false;
    }

    public static boolean validateFaceQualityDependencies() {
        if (getHighSpeedVideoFpsRanges()) {
            return getHighSpeedVideoFpsRangesFor();
        }
        return false;
    }

    public static java.lang.String validateLicense(com.daon.dmds.models.DMDSOptions dMDSOptions, android.content.Context context) {
        for (com.daon.dmds.models.DocTypeEnum docTypeEnum : dMDSOptions.getDocumentTypes()) {
            try {
                com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(docTypeEnum).buildRecognizerBundle(dMDSOptions);
            } catch (java.lang.Exception unused) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(docTypeEnum.name());
                sb.append(" invalid license");
                return sb.toString();
            }
        }
        if (!dMDSOptions.isFaceDetection()) {
            return "";
        }
        try {
            new com.daon.dmds.utils.face.FaceFinderImpl(context, dMDSOptions.getFaceLicenceKey());
            return "";
        } catch (java.lang.Exception unused2) {
            return "Invalid license";
        }
    }

    public static com.daon.dmds.models.DMDSError validateOptions(com.daon.dmds.models.DMDSOptions dMDSOptions, android.content.Context context) {
        if (dMDSOptions == null) {
            return new com.daon.dmds.models.DMDSError(context.getString(com.daon.dmds.R.string.dmds_error_option_not_set), com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeEmptyOptions);
        }
        if (dMDSOptions.getDocumentTypes().isEmpty()) {
            return new com.daon.dmds.models.DMDSError(context.getString(com.daon.dmds.R.string.dmds_error_not_valid_prop_doc_type), com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeMissingDocumentType);
        }
        if (dMDSOptions.getDocumentTypes().size() > 1 && com.daon.dmds.utils.DMDSDocumentUtils.listContainsEdgeDetection(dMDSOptions.getDocumentTypes())) {
            return new com.daon.dmds.models.DMDSError(context.getString(com.daon.dmds.R.string.dmds_error_not_valid_prop_edge), com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeEdgeDetectionWithDocumentRecognition);
        }
        if (dMDSOptions.getScanningDuration() <= 0 || dMDSOptions.getScanningDuration() > 3600) {
            return new com.daon.dmds.models.DMDSError(context.getString(com.daon.dmds.R.string.dmds_error_not_valid_prop_timeout), com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeInvalidOptions);
        }
        if (com.daon.dmds.utils.DMDSDocumentUtils.extractDocumentType(dMDSOptions.getDocumentTypes()) == com.daon.dmds.models.DocTypeEnum.EdgeDetection_Custom) {
            int fullDocumentImageDpi = dMDSOptions.getFullDocumentImageDpi();
            double customEdgeDetectionPhysicalHeightInInches = dMDSOptions.getCustomEdgeDetectionPhysicalHeightInInches();
            double d = fullDocumentImageDpi;
            if (customEdgeDetectionPhysicalHeightInInches * d * dMDSOptions.getCustomEdgeDetectionAspectRatio() * customEdgeDetectionPhysicalHeightInInches * d > 4000000.0d) {
                return new com.daon.dmds.models.DMDSError(context.getString(com.daon.dmds.R.string.dmds_error_not_valid_prop_custom_edge), com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeInvalidOptions);
            }
        }
        if (dMDSOptions.getDocumentBorderWidth() < 0 || dMDSOptions.getDocumentBorderWidth() > 200) {
            return new com.daon.dmds.models.DMDSError(context.getString(com.daon.dmds.R.string.dmds_error_not_valid_prop_border_width), com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeInvalidOptions);
        }
        return null;
    }
}
