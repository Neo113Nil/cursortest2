package com.microblink.blinkid.entities.recognizers;

/* loaded from: classes9.dex */
public class RecognizerUtils {
    public static com.microblink.blinkid.entities.recognizers.Recognizer[] filterOutRecognizersThatRequireAutofocus(com.microblink.blinkid.entities.recognizers.Recognizer[] recognizerArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.microblink.blinkid.entities.recognizers.Recognizer recognizer : recognizerArr) {
            if (recognizer != null && !recognizer.requiresAutofocus()) {
                arrayList.add(recognizer);
            }
        }
        com.microblink.blinkid.entities.recognizers.Recognizer[] recognizerArr2 = new com.microblink.blinkid.entities.recognizers.Recognizer[arrayList.size()];
        arrayList.toArray(recognizerArr2);
        return recognizerArr2;
    }
}
