package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class PushTokenizeResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.PushTokenizeResult> CREATOR = new com.google.android.gms.tapandpay.issuer.zzq();
    final int zza;
    final int zzb;
    final java.util.List zzc;

    PushTokenizeResult(int i, int i2, java.util.List list) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int getVirtualCardsStatus() {
        return this.zzb;
    }

    public static class Builder {
        private int zza;
        private int zzb;
        private java.util.List zzc;

        public com.google.android.gms.tapandpay.issuer.PushTokenizeResult build() {
            return new com.google.android.gms.tapandpay.issuer.PushTokenizeResult(this.zza, this.zzb, this.zzc);
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeResult.Builder setVirtualCardsStatus(int i) {
            this.zzb = i;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeResult.Builder setTokenizationOutcomes(java.util.List<com.google.android.gms.tapandpay.issuer.TokenizationOutcome> list) {
            this.zzc = list;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeResult.Builder setCardStatus(int i) {
            this.zza = i;
            return this;
        }
    }

    public final boolean getVirtualCardsResult() {
        return this.zzb == 0;
    }

    public final java.util.List<com.google.android.gms.tapandpay.issuer.TokenizationOutcome> getTokenizationOutcomes() {
        return this.zzc;
    }

    public final int getCardStatus() {
        return this.zza;
    }

    public final boolean getCardResult() {
        return this.zza == 0;
    }
}
