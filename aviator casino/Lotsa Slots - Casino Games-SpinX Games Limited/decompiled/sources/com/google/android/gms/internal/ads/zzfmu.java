package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfmu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzfmu> CREATOR = new com.google.android.gms.internal.ads.zzfmv();

    @javax.annotation.Nullable
    public final android.content.Context zza;
    public final com.google.android.gms.internal.ads.zzfmr zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final java.lang.String zzf;
    public final int zzg;
    private final com.google.android.gms.internal.ads.zzfmr[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfmu(int i, int i2, int i3, int i4, java.lang.String str, int i5, int i6) {
        com.google.android.gms.internal.ads.zzfmr[] values = com.google.android.gms.internal.ads.zzfmr.values();
        this.zzh = values;
        int[] zza = com.google.android.gms.internal.ads.zzfms.zza();
        this.zzl = zza;
        int[] zza2 = com.google.android.gms.internal.ads.zzfmt.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = values[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = zza[i5];
        this.zzk = i6;
        int i7 = zza2[i6];
    }

    @javax.annotation.Nullable
    public static com.google.android.gms.internal.ads.zzfmu zza(com.google.android.gms.internal.ads.zzfmr zzfmrVar, android.content.Context context) {
        if (zzfmrVar == com.google.android.gms.internal.ads.zzfmr.Rewarded) {
            return new com.google.android.gms.internal.ads.zzfmu(context, zzfmrVar, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzho)).intValue(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhu)).intValue(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhw)).intValue(), (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhy), (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhq), (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhs));
        }
        if (zzfmrVar == com.google.android.gms.internal.ads.zzfmr.Interstitial) {
            return new com.google.android.gms.internal.ads.zzfmu(context, zzfmrVar, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhp)).intValue(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhv)).intValue(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhx)).intValue(), (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhz), (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhr), (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzht));
        }
        if (zzfmrVar != com.google.android.gms.internal.ads.zzfmr.AppOpen) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzfmu(context, zzfmrVar, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhC)).intValue(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhE)).intValue(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhF)).intValue(), (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhA), (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhB), (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhD));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zzi;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfmu(@javax.annotation.Nullable android.content.Context context, com.google.android.gms.internal.ads.zzfmr zzfmrVar, int i, int i2, int i3, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zzh = com.google.android.gms.internal.ads.zzfmr.values();
        this.zzl = com.google.android.gms.internal.ads.zzfms.zza();
        this.zzm = com.google.android.gms.internal.ads.zzfmt.zza();
        this.zza = context;
        this.zzi = zzfmrVar.ordinal();
        this.zzb = zzfmrVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i4;
        this.zzj = i4 - 1;
        this.zzk = 0;
    }
}
