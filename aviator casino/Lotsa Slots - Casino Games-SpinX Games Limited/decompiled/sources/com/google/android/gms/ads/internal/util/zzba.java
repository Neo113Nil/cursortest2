package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzba extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.util.zzba> CREATOR = new com.google.android.gms.ads.internal.util.zzbb();
    public final java.lang.String zza;
    public final int zzb;

    zzba(java.lang.String str, int i) {
        this.zza = str == null ? "" : str;
        this.zzb = i;
    }

    public static com.google.android.gms.ads.internal.util.zzba zza(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.client.zze zza = com.google.android.gms.internal.ads.zzfma.zza(th);
        return new com.google.android.gms.ads.internal.util.zzba(com.google.android.gms.internal.ads.zzgua.zzc(th.getMessage()) ? zza.zzb : th.getMessage(), zza.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.ads.internal.util.zzaz zzb() {
        return new com.google.android.gms.ads.internal.util.zzaz(this.zza, this.zzb);
    }
}
