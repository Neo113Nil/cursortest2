package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public final class zzbw extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.auth.zzbw> CREATOR = new com.google.android.gms.internal.auth.zzbx();
    final int zza;
    java.lang.String zzb;

    public zzbw() {
        this.zza = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzbw(int i, java.lang.String str) {
        this.zza = i;
        this.zzb = str;
    }

    public final com.google.android.gms.internal.auth.zzbw zza(java.lang.String str) {
        this.zzb = str;
        return this;
    }
}
