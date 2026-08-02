package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIIlIIIllI implements com.microblink.blinkid.secured.lIIlIllIll {
    public final com.microblink.blinkid.secured.IlIIIIIllI IlIllIlIIl = new com.microblink.blinkid.secured.IlIIIIIllI();
    public final android.content.Context llIIlIlIIl;

    public IIIlIIIllI(android.content.Context context) {
        this.llIIlIlIIl = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.microblink.blinkid.secured.IIIIIIlIII IlIllIlIIl(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        for (com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result> recognizer : recognizerBundle.getRecognizers()) {
            if (recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer) {
                com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer blinkIdSingleSideRecognizer = (com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer) recognizer;
                android.content.Context context = this.llIIlIlIIl;
                com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result result = (com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) blinkIdSingleSideRecognizer.getResult();
                com.microblink.blinkid.image.Image cameraFrame = result.getCameraFrame();
                com.microblink.blinkid.image.Image barcodeCameraFrame = result.getBarcodeCameraFrame();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (cameraFrame != null) {
                    arrayList.add(com.microblink.blinkid.secured.lIIIIIlIlI.llIIlIlIIl(cameraFrame, 1));
                }
                if (barcodeCameraFrame != null) {
                    arrayList.add(com.microblink.blinkid.secured.lIIIIIlIlI.llIIlIlIIl(barcodeCameraFrame, 3));
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                com.microblink.blinkid.secured.IlIIIllIII ilIIIllIII = new com.microblink.blinkid.secured.IlIIIllIII(result.getClassInfo(), result.getResultState(), result.getProcessingStatus(), result.getRecognitionMode());
                java.lang.String payload = blinkIdSingleSideRecognizer.toSignedJson().getPayload();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                org.json.JSONObject llIIlIlIIl = com.microblink.blinkid.secured.IlIIllllll.llIIlIlIIl(context, ilIIIllIII);
                if (arrayList2.isEmpty()) {
                    throw new java.lang.NullPointerException("Bitmaps not set!");
                }
                return new com.microblink.blinkid.secured.IIIIIIlIII(llIIlIlIIl, arrayList2, payload);
            }
            if (recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer) {
                com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer blinkIdMultiSideRecognizer = (com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer) recognizer;
                android.content.Context context2 = this.llIIlIlIIl;
                com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result result2 = (com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) blinkIdMultiSideRecognizer.getResult();
                com.microblink.blinkid.image.Image frontCameraFrame = result2.getFrontCameraFrame();
                com.microblink.blinkid.image.Image backCameraFrame = result2.getBackCameraFrame();
                com.microblink.blinkid.image.Image barcodeCameraFrame2 = result2.getBarcodeCameraFrame();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                if (frontCameraFrame != null) {
                    arrayList3.add(com.microblink.blinkid.secured.lIIIIIlIlI.llIIlIlIIl(frontCameraFrame, 1));
                }
                if (backCameraFrame != null) {
                    arrayList3.add(com.microblink.blinkid.secured.lIIIIIlIlI.llIIlIlIIl(backCameraFrame, 2));
                }
                if (barcodeCameraFrame2 != null) {
                    arrayList3.add(com.microblink.blinkid.secured.lIIIIIlIlI.llIIlIlIIl(barcodeCameraFrame2, 3));
                }
                if (arrayList3.isEmpty()) {
                    return null;
                }
                com.microblink.blinkid.secured.IlIIIllIII ilIIIllIII2 = new com.microblink.blinkid.secured.IlIIIllIII(result2.getClassInfo(), result2.getResultState(), result2.getProcessingStatus(), result2.getRecognitionMode());
                java.lang.String payload2 = blinkIdMultiSideRecognizer.toSignedJson().getPayload();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                org.json.JSONObject llIIlIlIIl2 = com.microblink.blinkid.secured.IlIIllllll.llIIlIlIIl(context2, ilIIIllIII2);
                if (arrayList4.isEmpty()) {
                    throw new java.lang.NullPointerException("Bitmaps not set!");
                }
                return new com.microblink.blinkid.secured.IIIIIIlIII(llIIlIlIIl2, arrayList4, payload2);
            }
        }
        return null;
    }

    @Override // com.microblink.blinkid.secured.lIIlIllIll
    public final void llIIlIlIIl(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        try {
            com.microblink.blinkid.secured.lIIIIllllI liiiilllli = new com.microblink.blinkid.secured.lIIIIllllI(com.microblink.blinkid.secured.IlIIlIllll.llIIlIlIIl(this.llIIlIlIIl));
            com.microblink.blinkid.secured.IIIIIIlIII IlIllIlIIl = IlIllIlIIl(recognizerBundle);
            if (IlIllIlIIl != null) {
                new com.microblink.blinkid.secured.IllllIIlll(this.llIIlIlIIl, this.IlIllIlIIl, liiiilllli, this, IlIllIlIIl).execute(new java.lang.Void[0]);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
