package com.microblink.blinkid.entities.util;

/* loaded from: classes10.dex */
public abstract class IntentTransferableEntity<E extends com.microblink.blinkid.entities.Entity> extends com.microblink.blinkid.intent.BaseIntentTransferable<com.microblink.blinkid.entities.util.IntentTransferableEntity<E>> {
    private com.microblink.blinkid.entities.Entity getHighSpeedVideoFpsRangesFor;

    public IntentTransferableEntity(E e) {
        if (e == null) {
            throw new java.lang.IllegalArgumentException("Entity must not be null!");
        }
        this.getHighSpeedVideoFpsRangesFor = e;
    }

    public final com.microblink.blinkid.entities.Entity IllIIIllII() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable, com.microblink.blinkid.intent.MBIntentTransferable
    public void saveToIntent(android.content.Intent intent) {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            throw new java.lang.IllegalStateException("Unable to save wrapper without entity!");
        }
        super.saveToIntent(intent);
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.microblink.blinkid.entities.Entity entity = this.getHighSpeedVideoFpsRangesFor;
        if (entity == null) {
            throw new java.lang.IllegalStateException("Unable to parcelize wrapper without entity!");
        }
        parcel.writeParcelable(entity, i);
        super.writeToParcel(parcel, i);
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable
    public void llIIlIlIIl(com.microblink.blinkid.entities.util.IntentTransferableEntity intentTransferableEntity) {
        com.microblink.blinkid.entities.Entity entity = this.getHighSpeedVideoFpsRangesFor;
        if (entity == null) {
            this.getHighSpeedVideoFpsRangesFor = intentTransferableEntity.getHighSpeedVideoFpsRangesFor;
        } else {
            entity.consumeResultFrom(intentTransferableEntity.getHighSpeedVideoFpsRangesFor);
        }
    }

    public IntentTransferableEntity() {
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable
    public void llIIlIlIIl(android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRangesFor = (com.microblink.blinkid.entities.Entity) parcel.readParcelable(com.microblink.blinkid.entities.util.IntentTransferableEntity.class.getClassLoader());
        super.llIIlIlIIl(parcel);
    }

    public IntentTransferableEntity(android.os.Parcel parcel) {
        llIIlIlIIl(parcel);
    }
}
