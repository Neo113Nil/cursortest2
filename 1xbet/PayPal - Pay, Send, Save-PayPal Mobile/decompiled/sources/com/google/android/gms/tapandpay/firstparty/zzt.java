package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzt extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzt> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzu();
    final int[] zza;
    final com.google.android.gms.tapandpay.firstparty.zzd[] zzb;

    public zzt(int[] iArr, com.google.android.gms.tapandpay.firstparty.zzd[] zzdVarArr) {
        this.zza = iArr;
        this.zzb = zzdVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int[] iArr = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(parcel, 1, iArr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
