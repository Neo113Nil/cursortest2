package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class PushProvisionSessionContext extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext> CREATOR = new com.google.android.gms.tapandpay.issuer.zzl();
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;

    public PushProvisionSessionContext(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("PushProvisionSessionContext{serverSessionId=%s, deviceId=%s, walletId=%s}", this.zza, this.zzb, this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getServerSessionId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getDeviceId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getWalletId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String getWalletId() {
        return this.zzc;
    }

    public final java.lang.String getServerSessionId() {
        return this.zza;
    }

    public final java.lang.String getDeviceId() {
        return this.zzb;
    }
}
