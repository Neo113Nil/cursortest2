package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class CobadgedTokenInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo> CREATOR = new com.google.android.gms.tapandpay.issuer.zza();
    final int zza;
    final int zzb;
    final boolean zzc;

    CobadgedTokenInfo(int i, int i2, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo)) {
            return false;
        }
        com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo cobadgedTokenInfo = (com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo) obj;
        return this.zza == cobadgedTokenInfo.zza && this.zzb == cobadgedTokenInfo.zzb && this.zzc == cobadgedTokenInfo.zzc;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Boolean.valueOf(this.zzc));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("auxiliaryTokenServiceProvider", java.lang.Integer.valueOf(this.zza)).add("auxiliaryNetwork", java.lang.Integer.valueOf(this.zzb)).add("presentAuxiliaryTokenFirst", java.lang.Boolean.valueOf(this.zzc)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class Builder {
        private int zza;
        private int zzb;
        private boolean zzc;

        public com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo build() {
            return new com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo(this.zza, this.zzb, this.zzc);
        }

        public com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo.Builder setPresentAuxiliaryTokenFirst(boolean z) {
            this.zzc = z;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo.Builder setAuxiliaryTokenServiceProvider(int i) {
            this.zza = i;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo.Builder setAuxiliaryNetwork(int i) {
            this.zzb = i;
            return this;
        }

        /* synthetic */ Builder(byte[] bArr) {
        }

        private Builder() {
            throw null;
        }
    }

    public final boolean getPresentAuxiliaryTokenFirst() {
        return this.zzc;
    }

    public final int getAuxiliaryTokenServiceProvider() {
        return this.zza;
    }

    public final int getAuxiliaryNetwork() {
        return this.zzb;
    }

    public static com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo.Builder newBuilder() {
        return new com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo.Builder(null);
    }
}
