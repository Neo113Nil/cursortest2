package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzq> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzr();
    private final long zza;
    private final byte[] zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    zzq(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.zza = j;
        this.zzb = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        this.zzc = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr2);
        this.zzd = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.zzq)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.zzq zzqVar = (com.google.android.gms.fido.fido2.api.common.zzq) obj;
        return this.zza == zzqVar.zza && java.util.Arrays.equals(this.zzb, zzqVar.zzb) && java.util.Arrays.equals(this.zzc, zzqVar.zzc) && java.util.Arrays.equals(this.zzd, zzqVar.zzd);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), this.zzb, this.zzc, this.zzd);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
