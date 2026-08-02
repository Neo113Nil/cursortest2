package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class PushTokenizeExtraOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions> CREATOR = new com.google.android.gms.tapandpay.issuer.zzo();
    final boolean zza;
    final boolean zzb;
    final java.lang.String zzc;

    PushTokenizeExtraOptions(boolean z, boolean z2, java.lang.String str) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
    }

    public static com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions defaultOptions() {
        return new com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions(false, false, null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions)) {
            return false;
        }
        com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions pushTokenizeExtraOptions = (com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions) obj;
        return this.zza == pushTokenizeExtraOptions.zza && this.zzb == pushTokenizeExtraOptions.zzb && com.google.android.gms.common.internal.Objects.equal(this.zzc, pushTokenizeExtraOptions.zzc);
    }

    public final int hashCode() {
        boolean z = this.zza;
        boolean z2 = this.zzb;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), this.zzc);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("isBounceProvisioned", java.lang.Boolean.valueOf(this.zza)).add("enrollForVirtualCards", java.lang.Boolean.valueOf(this.zzb)).add("accountLinkingData", this.zzc).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        boolean z = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, z);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, getEnrollForVirtualCards());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getAccountLinkingData(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class Builder {
        private boolean zza;
        private boolean zzb;
        private java.lang.String zzc;

        public com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions build() {
            return new com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions(this.zza, this.zzb, this.zzc);
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions.Builder setIsBounceProvisioned(boolean z) {
            this.zza = z;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions.Builder setEnrollForVirtualCards(boolean z) {
            this.zzb = z;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions.Builder setAccountLinkingData(java.lang.String str) {
            this.zzc = str;
            return this;
        }

        /* synthetic */ Builder(byte[] bArr) {
        }

        private Builder() {
            throw null;
        }
    }

    public final boolean getisBounceProvisioned() {
        return this.zza;
    }

    public final boolean getEnrollForVirtualCards() {
        return this.zzb;
    }

    public final java.lang.String getAccountLinkingData() {
        return this.zzc;
    }

    public static com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions.Builder newBuilder() {
        return new com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions.Builder(null);
    }
}
