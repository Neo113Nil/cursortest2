package com.microblink.blinkid.fragment.overlay;

/* loaded from: classes10.dex */
public class DocumentRecognizerManager {
    private com.microblink.blinkid.image.CurrentImageListener Camera2StreamConfigurationMap;
    private final java.util.HashMap getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
    private com.microblink.blinkid.entities.recognizers.RecognizerBundle getHighSpeedVideoFpsRanges;

    public interface ConcreteRecognizerExtractor {
        com.microblink.blinkid.entities.recognizers.Recognizer<?> getConcreteRecognizer(com.microblink.blinkid.entities.recognizers.Recognizer<?> recognizer);

        java.lang.Class<?> getWrapperRecognizerClass();
    }

    public void addConcreteRecognizerExtractor(com.microblink.blinkid.fragment.overlay.DocumentRecognizerManager.ConcreteRecognizerExtractor concreteRecognizerExtractor) {
        this.getHighResolutionOutputSizeshNQ4ISI.put(concreteRecognizerExtractor.getWrapperRecognizerClass(), concreteRecognizerExtractor);
    }

    public com.microblink.blinkid.entities.recognizers.RecognizerBundle buildRecognizerBundle(com.microblink.blinkid.fragment.overlay.DocumentSide documentSide) {
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(getRecognizersFor(documentSide));
        recognizerBundle.setNumMsBeforeTimeout(getTimeoutMs());
        recognizerBundle.setAllowMultipleScanResultsOnSingleImage(this.getHighSpeedVideoFpsRanges.shouldAllowMultipleScanResultsOnSingleImage());
        recognizerBundle.setFrameQualityEstimationMode(this.getHighSpeedVideoFpsRanges.getFrameQualityEstimationMode());
        recognizerBundle.setRecognitionDebugMode(this.getHighSpeedVideoFpsRanges.getRecognitionDebugMode());
        return recognizerBundle;
    }

    public boolean canScanDocument() {
        return this.getHighSpeedVideoFpsRanges != null;
    }

    public void clearBundleState() {
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = this.getHighSpeedVideoFpsRanges;
        if (recognizerBundle != null) {
            recognizerBundle.clearSavedState();
        }
    }

    public com.microblink.blinkid.entities.recognizers.Recognizer<?> getConcreteRecognizer(com.microblink.blinkid.entities.recognizers.Recognizer recognizer) {
        if (recognizer instanceof com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer) {
            return ((com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer) recognizer).getSlaveRecognizer();
        }
        com.microblink.blinkid.fragment.overlay.DocumentRecognizerManager.ConcreteRecognizerExtractor concreteRecognizerExtractor = (com.microblink.blinkid.fragment.overlay.DocumentRecognizerManager.ConcreteRecognizerExtractor) this.getHighResolutionOutputSizeshNQ4ISI.get(recognizer.getClass());
        return concreteRecognizerExtractor != null ? concreteRecognizerExtractor.getConcreteRecognizer(recognizer) : recognizer;
    }

    public com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode getRecognitionDebugMode() {
        return this.getHighSpeedVideoFpsRanges.getRecognitionDebugMode();
    }

    public java.util.List<com.microblink.blinkid.entities.recognizers.Recognizer> getRecognizersFor(com.microblink.blinkid.fragment.overlay.DocumentSide documentSide) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (documentSide == com.microblink.blinkid.fragment.overlay.DocumentSide.FIRST_SIDE) {
            java.util.Collections.addAll(arrayList, this.getHighSpeedVideoFpsRanges.getRecognizers());
        } else {
            com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result>[] recognizers = this.getHighSpeedVideoFpsRanges.getRecognizers();
            arrayList = new java.util.ArrayList();
            for (com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result> recognizer : recognizers) {
                android.os.Parcelable concreteRecognizer = getConcreteRecognizer(recognizer);
                if ((concreteRecognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.CombinedRecognizer) && ((com.microblink.blinkid.entities.recognizers.blinkid.CombinedRecognizer) concreteRecognizer).getCombinedResult().isScanningFirstSideDone()) {
                    arrayList.add(recognizer);
                }
            }
        }
        if (this.Camera2StreamConfigurationMap != null) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next() instanceof com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer) {
                    it.remove();
                    break;
                }
            }
            arrayList.add(new com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer(this.Camera2StreamConfigurationMap));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.microblink.blinkid.recognition.RecognitionSuccessType getScanSuccessType() {
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = this.getHighSpeedVideoFpsRanges;
        if (recognizerBundle == null) {
            return com.microblink.blinkid.recognition.RecognitionSuccessType.SUCCESSFUL;
        }
        boolean z = false;
        for (com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result> recognizer : recognizerBundle.getRecognizers()) {
            com.microblink.blinkid.entities.recognizers.Recognizer.Result.State resultState = ((com.microblink.blinkid.entities.recognizers.Recognizer.Result) recognizer.getResult()).getResultState();
            if (resultState == com.microblink.blinkid.entities.recognizers.Recognizer.Result.State.Valid) {
                return com.microblink.blinkid.recognition.RecognitionSuccessType.SUCCESSFUL;
            }
            if (resultState == com.microblink.blinkid.entities.recognizers.Recognizer.Result.State.StageValid) {
                z = true;
            }
        }
        return z ? com.microblink.blinkid.recognition.RecognitionSuccessType.STAGE_SUCCESSFUL : com.microblink.blinkid.recognition.RecognitionSuccessType.PARTIAL;
    }

    public int getTimeoutMs() {
        return this.getHighSpeedVideoFpsRanges.getNumMsBeforeTimeout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean hasInvalidDocumentDataMatch() {
        com.microblink.blinkid.entities.recognizers.blinkid.CombinedDataMatchResult combinedDataMatchResult = null;
        for (com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result> recognizer : this.getHighSpeedVideoFpsRanges.getRecognizers()) {
            com.microblink.blinkid.entities.recognizers.Recognizer.Result result = (com.microblink.blinkid.entities.recognizers.Recognizer.Result) getConcreteRecognizer(recognizer).getResult();
            com.microblink.blinkid.entities.recognizers.Recognizer.Result.State resultState = result.getResultState();
            if (resultState == com.microblink.blinkid.entities.recognizers.Recognizer.Result.State.Valid) {
                return (result instanceof com.microblink.blinkid.entities.recognizers.blinkid.CombinedDataMatchResult) && ((com.microblink.blinkid.entities.recognizers.blinkid.CombinedDataMatchResult) result).getDocumentDataMatch() == com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState.Failed;
            }
            if (resultState != com.microblink.blinkid.entities.recognizers.Recognizer.Result.State.Empty && (result instanceof com.microblink.blinkid.entities.recognizers.blinkid.CombinedDataMatchResult) && combinedDataMatchResult == null) {
                combinedDataMatchResult = (com.microblink.blinkid.entities.recognizers.blinkid.CombinedDataMatchResult) result;
            }
        }
        return combinedDataMatchResult != null && combinedDataMatchResult.getDocumentDataMatch() == com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState.Failed;
    }

    public void saveBundleState() {
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = this.getHighSpeedVideoFpsRanges;
        if (recognizerBundle != null) {
            recognizerBundle.saveState();
        }
    }

    public void setup(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle, com.microblink.blinkid.image.CurrentImageListener currentImageListener) {
        this.getHighSpeedVideoFpsRanges = recognizerBundle;
        this.Camera2StreamConfigurationMap = currentImageListener;
    }
}
