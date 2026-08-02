package com.microblink.blinkid.fragment.overlay.blinkid;

/* loaded from: classes10.dex */
class BlinkIdUploadManager implements com.microblink.blinkid.fragment.overlay.blinkid.ImageUploadManager {
    BlinkIdUploadManager() {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.ImageUploadManager
    public void setupUploadManager(com.microblink.blinkid.entities.recognizers.Recognizer<?>[] recognizerArr) {
        if (com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl(com.microblink.blinkid.recognition.Right.ALLOW_IMAGE_UPLOAD)) {
            for (com.microblink.blinkid.entities.recognizers.Recognizer<?> recognizer : recognizerArr) {
                if (recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer) {
                    ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer) recognizer).setSaveCameraFrames(true);
                }
                if (recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer) {
                    ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer) recognizer).setSaveCameraFrames(true);
                }
            }
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.ImageUploadManager
    public void uploadImages(android.content.Context context, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        if (com.microblink.blinkid.secured.lllIIlllII.llIIlIlIIl == null) {
            if (com.microblink.blinkid.settings.NativeLibraryInfo.isProtectionEnabled() && com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl(com.microblink.blinkid.recognition.Right.ALLOW_IMAGE_UPLOAD)) {
                com.microblink.blinkid.secured.lllIIlllII.llIIlIlIIl = new com.microblink.blinkid.secured.IIIlIIIllI(context);
            } else {
                com.microblink.blinkid.secured.lllIIlllII.llIIlIlIIl = new com.microblink.blinkid.secured.IlIlllllll();
            }
        }
        com.microblink.blinkid.secured.lllIIlllII.llIIlIlIIl.llIIlIlIIl(recognizerBundle);
    }
}
