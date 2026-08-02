package com.visa.cbp;

/* loaded from: classes5.dex */
public final class CardMetadataUpdate {
    public java.lang.String BuildConfig;
    public java.lang.String ReplenishAckRequest;

    public final int hashCode() {
        return 32;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.visa.cbp.CardMetadataUpdate)) {
            return false;
        }
        com.visa.cbp.CardMetadataUpdate cardMetadataUpdate = (com.visa.cbp.CardMetadataUpdate) obj;
        if (cardMetadataUpdate == this) {
            return true;
        }
        java.lang.String str = cardMetadataUpdate.ReplenishAckRequest;
        java.lang.String str2 = cardMetadataUpdate.BuildConfig;
        return true;
    }
}
