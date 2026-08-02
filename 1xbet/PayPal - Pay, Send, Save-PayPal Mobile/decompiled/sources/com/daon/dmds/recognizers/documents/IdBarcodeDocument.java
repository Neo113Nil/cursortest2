package com.daon.dmds.recognizers.documents;

/* loaded from: classes7.dex */
public class IdBarcodeDocument implements com.daon.dmds.recognizers.DocumentRecognizer {
    private com.daon.dmds.models.DMDSOptions getHighResolutionOutputSizeshNQ4ISI;
    private com.microblink.blinkid.entities.recognizers.RecognizerBundle getHighSpeedVideoFpsRangesFor;
    private com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer getHighSpeedVideoSizes;

    @Override // com.daon.dmds.recognizers.DocumentRecognizer
    public com.microblink.blinkid.entities.recognizers.RecognizerBundle buildRecognizerBundle(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        this.getHighResolutionOutputSizeshNQ4ISI = dMDSOptions;
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = this.getHighSpeedVideoFpsRangesFor;
        if (recognizerBundle != null) {
            return recognizerBundle;
        }
        com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer idBarcodeRecognizer = new com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer();
        this.getHighSpeedVideoSizes = idBarcodeRecognizer;
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle2 = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(idBarcodeRecognizer);
        this.getHighSpeedVideoFpsRangesFor = recognizerBundle2;
        return recognizerBundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daon.dmds.recognizers.DocumentRecognizer
    public com.daon.dmds.models.ResponseData buildResponseData() {
        com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result result = (com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer.Result) this.getHighSpeedVideoSizes.getResult();
        if (result.getResultState() != com.microblink.blinkid.entities.recognizers.Recognizer.Result.State.Valid) {
            return null;
        }
        com.daon.dmds.models.DMDSDocument dMDSDocument = new com.daon.dmds.models.DMDSDocument();
        dMDSDocument.setDocumentType(com.daon.dmds.utils.DMDSDocumentUtils.extractDocumentType(this.getHighResolutionOutputSizeshNQ4ISI.getDocumentTypes()).name());
        dMDSDocument.setTextExtracted(com.daon.dmds.utils.BlinkIdExtractor.extractIdBarcodeResults(result));
        com.daon.dmds.models.DMDSResult dMDSResult = new com.daon.dmds.models.DMDSResult();
        dMDSResult.setDocument(dMDSDocument);
        return new com.daon.dmds.models.ResponseData(dMDSResult, null);
    }
}
