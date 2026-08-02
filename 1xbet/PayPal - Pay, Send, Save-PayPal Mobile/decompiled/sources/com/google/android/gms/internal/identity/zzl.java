package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzl extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zzb;
    public static final com.google.android.gms.internal.identity.zzl zza = new com.google.android.gms.internal.identity.zzl(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.identity.zzl> CREATOR = new com.google.android.gms.internal.identity.zzm();

    public zzl(com.google.android.gms.common.api.Status status) {
        this.zzb = status;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzb;
    }
}
