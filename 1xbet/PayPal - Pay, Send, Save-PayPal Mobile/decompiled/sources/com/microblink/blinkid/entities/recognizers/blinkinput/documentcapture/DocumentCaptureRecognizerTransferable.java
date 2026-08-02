package com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture;

/* loaded from: classes10.dex */
public class DocumentCaptureRecognizerTransferable extends com.microblink.blinkid.entities.util.IntentTransferableEntity<com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizer> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable>() { // from class: com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable[i];
        }
    };
    private com.microblink.blinkid.image.highres.HighResImageWrapper getHighResolutionOutputSizeshNQ4ISI;

    public DocumentCaptureRecognizerTransferable(com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizer documentCaptureRecognizer) {
        super(documentCaptureRecognizer);
    }

    public static com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable createFromIntent(android.content.Intent intent) {
        com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable documentCaptureRecognizerTransferable = new com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable();
        if (!documentCaptureRecognizerTransferable.existsInIntent(intent)) {
            return null;
        }
        documentCaptureRecognizerTransferable.loadFromIntent(intent);
        return documentCaptureRecognizerTransferable;
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable
    public final java.lang.String IlIllIlIIl() {
        return "com.microblink.blinkid.intent.constants.DocumentCaptureRecognizerTransferable";
    }

    public com.microblink.blinkid.image.highres.HighResImageWrapper getCapturedFullImage() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizer getDocumentCaptureRecognizer() {
        return (com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizer) IllIIIllII();
    }

    @Override // com.microblink.blinkid.entities.util.IntentTransferableEntity, com.microblink.blinkid.intent.BaseIntentTransferable
    public final void llIIlIlIIl(com.microblink.blinkid.intent.BaseIntentTransferable baseIntentTransferable) {
        com.microblink.blinkid.entities.util.IntentTransferableEntity intentTransferableEntity = (com.microblink.blinkid.entities.util.IntentTransferableEntity) baseIntentTransferable;
        super.llIIlIlIIl(intentTransferableEntity);
        this.getHighResolutionOutputSizeshNQ4ISI = ((com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable) intentTransferableEntity).getCapturedFullImage();
    }

    public void setCapturedFullImage(com.microblink.blinkid.image.highres.HighResImageWrapper highResImageWrapper) {
        this.getHighResolutionOutputSizeshNQ4ISI = highResImageWrapper;
    }

    @Override // com.microblink.blinkid.entities.util.IntentTransferableEntity, com.microblink.blinkid.intent.BaseIntentTransferable, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        com.microblink.blinkid.image.highres.HighResImageWrapper highResImageWrapper = this.getHighResolutionOutputSizeshNQ4ISI;
        if (highResImageWrapper != null) {
            highResImageWrapper.writeToParcel(parcel, i);
        }
    }

    private DocumentCaptureRecognizerTransferable() {
    }

    DocumentCaptureRecognizerTransferable(android.os.Parcel parcel) {
        super(parcel);
    }

    @Override // com.microblink.blinkid.entities.util.IntentTransferableEntity
    public final void llIIlIlIIl(com.microblink.blinkid.entities.util.IntentTransferableEntity intentTransferableEntity) {
        super.llIIlIlIIl(intentTransferableEntity);
        this.getHighResolutionOutputSizeshNQ4ISI = ((com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable) intentTransferableEntity).getCapturedFullImage();
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable
    public final android.os.Parcelable.Creator llIIlIlIIl() {
        return CREATOR;
    }

    @Override // com.microblink.blinkid.entities.util.IntentTransferableEntity, com.microblink.blinkid.intent.BaseIntentTransferable
    public final void llIIlIlIIl(android.os.Parcel parcel) {
        super.llIIlIlIIl(parcel);
        this.getHighResolutionOutputSizeshNQ4ISI = (com.microblink.blinkid.image.highres.HighResImageWrapper) parcel.readParcelable(com.microblink.blinkid.image.highres.HighResImageWrapper.class.getClassLoader());
    }
}
