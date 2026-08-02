package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzx extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzx> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzy();
    private boolean zza;

    private zzx() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.tapandpay.firstparty.zzx) {
            return com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zza), java.lang.Boolean.valueOf(((com.google.android.gms.tapandpay.firstparty.zzx) obj).zza));
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

    zzx(boolean z) {
        this.zza = z;
    }
}
