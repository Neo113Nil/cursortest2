package com.daon.dmds.recognizers.documents;

/* loaded from: classes7.dex */
public class EmptyDocument implements com.daon.dmds.recognizers.DocumentRecognizer {
    @Override // com.daon.dmds.recognizers.DocumentRecognizer
    public com.microblink.blinkid.entities.recognizers.RecognizerBundle buildRecognizerBundle(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        return new com.microblink.blinkid.entities.recognizers.RecognizerBundle(new com.microblink.blinkid.entities.recognizers.Recognizer[0]);
    }

    @Override // com.daon.dmds.recognizers.DocumentRecognizer
    public com.daon.dmds.models.ResponseData buildResponseData() {
        return null;
    }
}
