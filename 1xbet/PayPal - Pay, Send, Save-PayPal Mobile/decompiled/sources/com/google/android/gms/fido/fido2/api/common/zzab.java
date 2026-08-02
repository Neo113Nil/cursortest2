package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public final class zzab extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzab> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzac();
    private final long zza;

    public zzab(long j) {
        this.zza = ((java.lang.Long) com.google.android.gms.common.internal.Preconditions.checkNotNull(java.lang.Long.valueOf(j))).longValue();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.gms.fido.fido2.api.common.zzab) && this.zza == ((com.google.android.gms.fido.fido2.api.common.zzab) obj).zza;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        long j = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, j);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
