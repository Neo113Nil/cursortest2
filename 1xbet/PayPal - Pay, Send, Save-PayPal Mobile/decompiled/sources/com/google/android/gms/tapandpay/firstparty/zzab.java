package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzab extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzab> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzac();
    final com.google.android.gms.tapandpay.firstparty.zzaw zza;

    public zzab(com.google.android.gms.tapandpay.firstparty.zzaw zzawVar) {
        this.zza = zzawVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
