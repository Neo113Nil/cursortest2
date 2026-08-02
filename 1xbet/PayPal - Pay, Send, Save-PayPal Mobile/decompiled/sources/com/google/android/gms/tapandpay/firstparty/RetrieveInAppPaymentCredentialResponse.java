package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public class RetrieveInAppPaymentCredentialResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzbc();
    final java.lang.String zza;
    final byte[] zzb;
    final int zzc;
    final int zzd;
    final java.lang.String zze;
    final java.lang.String zzf;

    public RetrieveInAppPaymentCredentialResponse(java.lang.String str, byte[] bArr, int i, int i2, java.lang.String str2, java.lang.String str3) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
        this.zze = str2;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
