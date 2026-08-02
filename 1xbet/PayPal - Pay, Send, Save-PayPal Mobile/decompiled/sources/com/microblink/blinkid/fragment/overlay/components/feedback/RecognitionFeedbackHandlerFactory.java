package com.microblink.blinkid.fragment.overlay.components.feedback;

/* loaded from: classes10.dex */
public class RecognitionFeedbackHandlerFactory {

    /* renamed from: com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandlerFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.microblink.blinkid.uisettings.options.OcrResultDisplayMode.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.microblink.blinkid.uisettings.options.OcrResultDisplayMode.STATIC_CHARS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.uisettings.options.OcrResultDisplayMode.ANIMATED_DOTS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.uisettings.options.OcrResultDisplayMode.NOTHING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public static com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler create(com.microblink.blinkid.uisettings.options.OcrResultDisplayMode ocrResultDisplayMode) {
        int i = com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandlerFactory.AnonymousClass1.getHighSpeedVideoFpsRangesFor[ocrResultDisplayMode.ordinal()];
        return i != 1 ? i != 2 ? com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler.EMPTY : new com.microblink.blinkid.fragment.overlay.components.feedback.OcrDotsFeedbackHandler() : new com.microblink.blinkid.fragment.overlay.components.feedback.OcrCharsFeedbackHandler();
    }
}
