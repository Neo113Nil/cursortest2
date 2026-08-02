package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzk extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzk> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzl();
    private boolean zza;
    private boolean zzb;

    private zzk() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.zzk)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.zzk zzkVar = (com.google.android.gms.tapandpay.firstparty.zzk) obj;
        return com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zza), java.lang.Boolean.valueOf(zzkVar.zza)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzb), java.lang.Boolean.valueOf(zzkVar.zzb));
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zza), java.lang.Boolean.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzk(boolean z, boolean z2) {
        this.zza = z;
        this.zzb = z2;
    }
}
