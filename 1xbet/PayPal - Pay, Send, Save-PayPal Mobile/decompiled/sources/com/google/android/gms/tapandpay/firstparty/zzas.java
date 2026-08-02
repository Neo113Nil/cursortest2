package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzas extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzas> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzat();
    private boolean zza;

    private zzas() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.tapandpay.firstparty.zzas) {
            return com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zza), java.lang.Boolean.valueOf(((com.google.android.gms.tapandpay.firstparty.zzas) obj).zza));
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzas(boolean z) {
        this.zza = z;
    }
}
