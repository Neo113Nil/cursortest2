package com.microblink.blinkid.entities.recognizers;

/* loaded from: classes.dex */
public class RecognizerBundle extends com.microblink.blinkid.intent.BaseIntentTransferable<com.microblink.blinkid.entities.recognizers.RecognizerBundle> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.RecognizerBundle> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.RecognizerBundle>() { // from class: com.microblink.blinkid.entities.recognizers.RecognizerBundle.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.RecognizerBundle createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.RecognizerBundle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.RecognizerBundle[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.RecognizerBundle[i];
        }
    };
    public static final int TIMEOUT_INFINITY = 0;
    private com.microblink.blinkid.entities.recognizers.Recognizer[] Camera2StreamConfigurationMap;
    private com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private com.microblink.blinkid.entities.recognizers.RecognizerBundle.FrameQualityEstimationMode getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    /* loaded from: classes9.dex */
    public enum FrameQualityEstimationMode {
        AUTOMATIC,
        ALWAYS_ON,
        ALWAYS_OFF
    }

    /* loaded from: classes9.dex */
    public enum RecognitionDebugMode {
        RECOGNITION,
        RECOGNITION_TEST,
        DETECTION_TEST
    }

    public RecognizerBundle(com.microblink.blinkid.entities.recognizers.Recognizer... recognizerArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode.RECOGNITION;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoSizes = 0;
        this.getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.entities.recognizers.RecognizerBundle.FrameQualityEstimationMode.AUTOMATIC;
        this.Camera2StreamConfigurationMap = recognizerArr;
        for (com.microblink.blinkid.entities.recognizers.Recognizer recognizer : recognizerArr) {
            if (recognizer == null) {
                throw new java.lang.IllegalArgumentException("It is not allowed to pass null recognizer to RecognizerBundle.");
            }
        }
    }

    public static final com.microblink.blinkid.entities.recognizers.RecognizerBundle createFromIntent(android.content.Intent intent) {
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(new com.microblink.blinkid.entities.recognizers.Recognizer[0]);
        if (!recognizerBundle.existsInIntent(intent)) {
            return null;
        }
        recognizerBundle.loadFromIntent(intent);
        return recognizerBundle;
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable
    public final java.lang.String IlIllIlIIl() {
        return "com.microblink.blinkid.intent.constants.RecognizerBundle.id";
    }

    public boolean equals(java.lang.Object obj) {
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle;
        return obj != null && (obj instanceof com.microblink.blinkid.entities.recognizers.RecognizerBundle) && this == (recognizerBundle = (com.microblink.blinkid.entities.recognizers.RecognizerBundle) obj) && this.Camera2StreamConfigurationMap == recognizerBundle.Camera2StreamConfigurationMap;
    }

    public com.microblink.blinkid.entities.recognizers.RecognizerBundle.FrameQualityEstimationMode getFrameQualityEstimationMode() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getNumMsBeforeTimeout() {
        return this.getHighSpeedVideoSizes;
    }

    public com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode getRecognitionDebugMode() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result>[] getRecognizers() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable
    public final void llIIlIlIIl(com.microblink.blinkid.intent.BaseIntentTransferable baseIntentTransferable) {
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = (com.microblink.blinkid.entities.recognizers.RecognizerBundle) baseIntentTransferable;
        this.getHighResolutionOutputSizeshNQ4ISI = recognizerBundle.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = recognizerBundle.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = recognizerBundle.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = recognizerBundle.getHighSpeedVideoFpsRangesFor;
        com.microblink.blinkid.entities.recognizers.Recognizer[] recognizerArr = this.Camera2StreamConfigurationMap;
        int i = 0;
        if (recognizerArr.length == 0) {
            this.Camera2StreamConfigurationMap = new com.microblink.blinkid.entities.recognizers.Recognizer[recognizerBundle.Camera2StreamConfigurationMap.length];
            while (true) {
                com.microblink.blinkid.entities.recognizers.Recognizer[] recognizerArr2 = this.Camera2StreamConfigurationMap;
                if (i >= recognizerArr2.length) {
                    return;
                }
                recognizerArr2[i] = recognizerBundle.Camera2StreamConfigurationMap[i];
                i++;
            }
        } else {
            if (recognizerBundle.Camera2StreamConfigurationMap.length != recognizerArr.length) {
                throw new java.lang.IllegalStateException("Incompatible RecognizerBundle loaded.");
            }
            while (true) {
                com.microblink.blinkid.entities.recognizers.Recognizer[] recognizerArr3 = this.Camera2StreamConfigurationMap;
                if (i >= recognizerArr3.length) {
                    return;
                }
                recognizerArr3[i].consumeResultFrom(recognizerBundle.Camera2StreamConfigurationMap[i]);
                i++;
            }
        }
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable, com.microblink.blinkid.intent.MBIntentTransferable
    public void saveToIntent(android.content.Intent intent) {
        com.microblink.blinkid.entities.recognizers.Recognizer[] recognizerArr = this.Camera2StreamConfigurationMap;
        if (recognizerArr == null || recognizerArr.length == 0) {
            throw new java.lang.IllegalStateException("Unable to save bundle without recognizers!");
        }
        super.saveToIntent(intent);
    }

    public void setAllowMultipleScanResultsOnSingleImage(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    public void setFrameQualityEstimationMode(com.microblink.blinkid.entities.recognizers.RecognizerBundle.FrameQualityEstimationMode frameQualityEstimationMode) {
        this.getHighSpeedVideoFpsRangesFor = frameQualityEstimationMode;
    }

    public void setNumMsBeforeTimeout(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public void setRecognitionDebugMode(com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode recognitionDebugMode) {
        this.getHighResolutionOutputSizeshNQ4ISI = recognitionDebugMode;
    }

    public boolean shouldAllowMultipleScanResultsOnSingleImage() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.microblink.blinkid.entities.recognizers.Recognizer[] recognizerArr = this.Camera2StreamConfigurationMap;
        if (recognizerArr == null || recognizerArr.length <= 0) {
            throw new java.lang.IllegalStateException("Unable to parcelize bundle without recognizers!");
        }
        parcel.writeParcelableArray(recognizerArr, 0);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.getHighResolutionOutputSizeshNQ4ISI.ordinal());
        parcel.writeByte(this.getHighSpeedVideoFpsRanges ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.getHighSpeedVideoSizes);
        parcel.writeInt(this.getHighSpeedVideoFpsRangesFor.ordinal());
    }

    public RecognizerBundle(java.util.List<com.microblink.blinkid.entities.recognizers.Recognizer> list) {
        this.getHighResolutionOutputSizeshNQ4ISI = com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode.RECOGNITION;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoSizes = 0;
        this.getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.entities.recognizers.RecognizerBundle.FrameQualityEstimationMode.AUTOMATIC;
        com.microblink.blinkid.entities.recognizers.Recognizer[] recognizerArr = (com.microblink.blinkid.entities.recognizers.Recognizer[]) list.toArray(new com.microblink.blinkid.entities.recognizers.Recognizer[list.size()]);
        this.Camera2StreamConfigurationMap = recognizerArr;
        for (com.microblink.blinkid.entities.recognizers.Recognizer recognizer : recognizerArr) {
            if (recognizer == null) {
                throw new java.lang.IllegalArgumentException("It is not allowed to pass null recognizer to RecognizerBundle.");
            }
        }
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable
    public final android.os.Parcelable.Creator llIIlIlIIl() {
        return CREATOR;
    }

    RecognizerBundle(android.os.Parcel parcel) {
        this.getHighResolutionOutputSizeshNQ4ISI = com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode.RECOGNITION;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoSizes = 0;
        this.getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.entities.recognizers.RecognizerBundle.FrameQualityEstimationMode.AUTOMATIC;
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.microblink.blinkid.entities.recognizers.RecognizerBundle.class.getClassLoader());
        this.Camera2StreamConfigurationMap = new com.microblink.blinkid.entities.recognizers.Recognizer[readParcelableArray.length];
        int i = 0;
        while (true) {
            com.microblink.blinkid.entities.recognizers.Recognizer[] recognizerArr = this.Camera2StreamConfigurationMap;
            if (i >= recognizerArr.length) {
                break;
            }
            recognizerArr[i] = (com.microblink.blinkid.entities.recognizers.Recognizer) readParcelableArray[i];
            i++;
        }
        super.llIIlIlIIl(parcel);
        this.getHighResolutionOutputSizeshNQ4ISI = com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode.values()[parcel.readInt()];
        this.getHighSpeedVideoFpsRanges = parcel.readByte() == 1;
        this.getHighSpeedVideoSizes = parcel.readInt();
        this.getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.entities.recognizers.RecognizerBundle.FrameQualityEstimationMode.values()[parcel.readInt()];
    }
}
