package com.daon.dmds.recognizers;

/* loaded from: classes7.dex */
public interface DocumentRecognizer {
    com.microblink.blinkid.entities.recognizers.RecognizerBundle buildRecognizerBundle(com.daon.dmds.models.DMDSOptions dMDSOptions);

    com.daon.dmds.models.ResponseData buildResponseData();
}
