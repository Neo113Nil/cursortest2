package com.microblink.blinkid.fragment.overlay.components.statusmsg;

/* loaded from: classes10.dex */
public interface StatusMessageTranslator {
    public static final com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator EMPTY = new com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator() { // from class: com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator.1
        @Override // com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator
        public int getMessage(com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator.Event event) {
            return 0;
        }
    };

    /* renamed from: com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.microblink.blinkid.recognition.RecognitionSuccessType.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[com.microblink.blinkid.recognition.RecognitionSuccessType.UNSUCCESSFUL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[com.microblink.blinkid.recognition.RecognitionSuccessType.PARTIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[com.microblink.blinkid.recognition.RecognitionSuccessType.STAGE_SUCCESSFUL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.microblink.blinkid.view.recognition.DetectionStatus.values().length];
            getHighSpeedVideoFpsRangesFor = iArr2;
            try {
                iArr2[com.microblink.blinkid.view.recognition.DetectionStatus.FAILED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.view.recognition.DetectionStatus.CAMERA_TOO_FAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.view.recognition.DetectionStatus.FALLBACK_SUCCESS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.view.recognition.DetectionStatus.DOCUMENT_PARTIALLY_VISIBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.view.recognition.DetectionStatus.CAMERA_ANGLE_TOO_STEEP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.view.recognition.DetectionStatus.CAMERA_TOO_CLOSE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.view.recognition.DetectionStatus.SUCCESS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
        }
    }

    public enum Event {
        INITIAL,
        RECOGNITION_SUCCESS,
        RECOGNITION_STAGE_SUCCESS,
        RECOGNITION_PARTIAL,
        RECOGNITION_UNSUCCESSFUL,
        DETECTION_FAILED,
        DETECTION_SUCCESS,
        DETECTION_CAMERA_TOO_HIGH,
        DETECTION_FALLBACK_SUCCESS,
        DETECTION_PARTIAL_OBJECT,
        DETECTION_CAMERA_AT_ANGLE,
        DETECTION_CAMERA_TOO_NEAR,
        AUTOFOCUS_FAILED;

        public static com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator.Event fromDetectionStatus(com.microblink.blinkid.view.recognition.DetectionStatus detectionStatus) {
            switch (com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator.AnonymousClass2.getHighSpeedVideoFpsRangesFor[detectionStatus.ordinal()]) {
                case 1:
                    return DETECTION_FAILED;
                case 2:
                    return DETECTION_CAMERA_TOO_HIGH;
                case 3:
                    return DETECTION_FALLBACK_SUCCESS;
                case 4:
                    return DETECTION_PARTIAL_OBJECT;
                case 5:
                    return DETECTION_CAMERA_AT_ANGLE;
                case 6:
                    return DETECTION_CAMERA_TOO_NEAR;
                default:
                    return DETECTION_SUCCESS;
            }
        }

        public static com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator.Event fromRecognitionSuccessType(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
            int i = com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator.AnonymousClass2.getHighSpeedVideoSizes[recognitionSuccessType.ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? RECOGNITION_SUCCESS : RECOGNITION_STAGE_SUCCESS : RECOGNITION_PARTIAL : RECOGNITION_UNSUCCESSFUL;
        }
    }

    int getMessage(com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator.Event event);
}
