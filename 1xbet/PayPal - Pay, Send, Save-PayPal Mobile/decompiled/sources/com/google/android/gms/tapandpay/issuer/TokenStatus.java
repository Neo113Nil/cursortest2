package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class TokenStatus extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.TokenStatus> CREATOR = new com.google.android.gms.tapandpay.issuer.zzx();
    final java.lang.String zza;
    final int zzb;
    final boolean zzc;

    public TokenStatus(java.lang.String str, int i, boolean z) {
        this.zza = str;
        this.zzb = i;
        this.zzc = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean isSelected() {
        return this.zzc;
    }

    public final int getTokenState() {
        return this.zzb;
    }
}
