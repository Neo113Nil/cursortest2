package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzbq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzbq> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzbr();
    final int zza;
    final byte[] zzb;
    final java.lang.Integer zzc;
    final android.app.PendingIntent zzd;

    public zzbq(int i, byte[] bArr, java.lang.Integer num, android.app.PendingIntent pendingIntent) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = num;
        this.zzd = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
