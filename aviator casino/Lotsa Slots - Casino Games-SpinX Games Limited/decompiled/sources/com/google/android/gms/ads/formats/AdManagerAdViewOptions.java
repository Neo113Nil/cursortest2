package com.google.android.gms.ads.formats;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class AdManagerAdViewOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.formats.AdManagerAdViewOptions> CREATOR = new com.google.android.gms.ads.formats.zzb();
    private final boolean zza;

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
    public static final class Builder {
        private boolean zza = false;

        public com.google.android.gms.ads.formats.AdManagerAdViewOptions build() {
            return new com.google.android.gms.ads.formats.AdManagerAdViewOptions(this, null);
        }

        public com.google.android.gms.ads.formats.AdManagerAdViewOptions.Builder setManualImpressionsEnabled(boolean z) {
            this.zza = z;
            return this;
        }

        final /* synthetic */ boolean zza() {
            return this.zza;
        }
    }

    /* synthetic */ AdManagerAdViewOptions(com.google.android.gms.ads.formats.AdManagerAdViewOptions.Builder builder, byte[] bArr) {
        this.zza = builder.zza();
    }

    public boolean getManualImpressionsEnabled() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, getManualImpressionsEnabled());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    AdManagerAdViewOptions(boolean z) {
        this.zza = z;
    }
}
