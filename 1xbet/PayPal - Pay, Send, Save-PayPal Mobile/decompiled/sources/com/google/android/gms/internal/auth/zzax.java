package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public final class zzax extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.auth.zzax> CREATOR = new com.google.android.gms.internal.auth.zzay();
    final int zza;
    public final java.lang.String zzb;

    zzax(int i, java.lang.String str) {
        this.zza = 1;
        this.zzb = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzax(java.lang.String str) {
        this(1, str);
    }
}
