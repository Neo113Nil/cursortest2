package com.microblink.blinkid.entities.parsers.config.fieldbyfield;

/* loaded from: classes9.dex */
public final class FieldByFieldBundle extends com.microblink.blinkid.intent.BaseIntentTransferable<com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle>() { // from class: com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle[] newArray(int i) {
            return new com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle[i];
        }
    };
    private com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[] Camera2StreamConfigurationMap;

    public FieldByFieldBundle(com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement... fieldByFieldElementArr) {
        this.Camera2StreamConfigurationMap = fieldByFieldElementArr;
        for (com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement fieldByFieldElement : fieldByFieldElementArr) {
            if (fieldByFieldElement == null) {
                throw new java.lang.IllegalArgumentException("It is not allowed to pass null FieldByFieldElement to FieldByFieldBundle.");
            }
        }
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable
    public final java.lang.String IlIllIlIIl() {
        return "com.microblink.blinkid.intent.constants.FieldByFieldBundle.id";
    }

    public final com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[] getElements() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable
    public final void llIIlIlIIl(com.microblink.blinkid.intent.BaseIntentTransferable baseIntentTransferable) {
        com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle fieldByFieldBundle = (com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle) baseIntentTransferable;
        com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[] fieldByFieldElementArr = this.Camera2StreamConfigurationMap;
        int i = 0;
        if (fieldByFieldElementArr.length == 0) {
            int length = fieldByFieldBundle.Camera2StreamConfigurationMap.length;
            com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[] fieldByFieldElementArr2 = new com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[length];
            this.Camera2StreamConfigurationMap = fieldByFieldElementArr2;
            java.lang.System.arraycopy(fieldByFieldBundle.Camera2StreamConfigurationMap, 0, fieldByFieldElementArr2, 0, length);
            return;
        }
        if (fieldByFieldBundle.Camera2StreamConfigurationMap.length != fieldByFieldElementArr.length) {
            throw new java.lang.IllegalStateException("Incompatible FieldByFieldBundle loaded.");
        }
        while (true) {
            com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[] fieldByFieldElementArr3 = this.Camera2StreamConfigurationMap;
            if (i >= fieldByFieldElementArr3.length) {
                return;
            }
            fieldByFieldElementArr3[i].getHighResolutionOutputSizeshNQ4ISI.consumeResultFrom(fieldByFieldBundle.Camera2StreamConfigurationMap[i].getHighResolutionOutputSizeshNQ4ISI);
            i++;
        }
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable, com.microblink.blinkid.intent.MBIntentTransferable
    public final void saveToIntent(android.content.Intent intent) {
        com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[] fieldByFieldElementArr = this.Camera2StreamConfigurationMap;
        if (fieldByFieldElementArr == null || fieldByFieldElementArr.length == 0) {
            throw new java.lang.IllegalStateException("Unable to save bundle without scan configuration elements!");
        }
        super.saveToIntent(intent);
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[] fieldByFieldElementArr = this.Camera2StreamConfigurationMap;
        if (fieldByFieldElementArr == null || fieldByFieldElementArr.length <= 0) {
            throw new java.lang.IllegalStateException("Unable to parcelize bundle without elements!");
        }
        parcel.writeParcelableArray(fieldByFieldElementArr, i);
        super.writeToParcel(parcel, i);
    }

    FieldByFieldBundle(android.os.Parcel parcel) {
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement.class.getClassLoader());
        this.Camera2StreamConfigurationMap = new com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[readParcelableArray.length];
        int i = 0;
        while (true) {
            com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[] fieldByFieldElementArr = this.Camera2StreamConfigurationMap;
            if (i < fieldByFieldElementArr.length) {
                fieldByFieldElementArr[i] = (com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement) readParcelableArray[i];
                i++;
            } else {
                super.llIIlIlIIl(parcel);
                return;
            }
        }
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable
    public final android.os.Parcelable.Creator llIIlIlIIl() {
        return CREATOR;
    }
}
