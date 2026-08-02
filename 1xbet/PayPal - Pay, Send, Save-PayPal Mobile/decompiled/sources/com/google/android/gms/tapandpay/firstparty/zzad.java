package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzad extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzad> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzae();
    private java.lang.String zza;
    private java.lang.String zzb;

    private zzad() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.zzad)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.zzad zzadVar = (com.google.android.gms.tapandpay.firstparty.zzad) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, zzadVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzadVar.zzb);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzad(java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
