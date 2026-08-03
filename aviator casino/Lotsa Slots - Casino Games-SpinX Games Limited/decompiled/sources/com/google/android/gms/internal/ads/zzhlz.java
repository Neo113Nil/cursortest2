package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhlz extends com.google.android.gms.internal.ads.zzhdq {
    private final com.google.android.gms.internal.ads.zzhnm zza;

    public zzhlz(com.google.android.gms.internal.ads.zzhnm zzhnmVar, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzhel zzhelVar) throws java.security.GeneralSecurityException {
        zze(zzhnmVar, zzhelVar);
        this.zza = zzhnmVar;
    }

    private static void zze(com.google.android.gms.internal.ads.zzhnm zzhnmVar, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzhel zzhelVar) throws java.security.GeneralSecurityException {
        int i = com.google.android.gms.internal.ads.zzhlx.zzb[zzhnmVar.zzc().ordinal()];
    }

    @Override // com.google.android.gms.internal.ads.zzhdq
    public final com.google.android.gms.internal.ads.zzheh zza() {
        com.google.android.gms.internal.ads.zzhnm zzhnmVar = this.zza;
        return new com.google.android.gms.internal.ads.zzhly(zzhnmVar.zzg(), zzhnmVar.zzd(), null);
    }

    @Override // com.google.android.gms.internal.ads.zzhdq
    @javax.annotation.Nullable
    public final java.lang.Integer zzb() {
        return this.zza.zze();
    }

    public final com.google.android.gms.internal.ads.zzhnm zzc(@javax.annotation.Nullable com.google.android.gms.internal.ads.zzhel zzhelVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhnm zzhnmVar = this.zza;
        zze(zzhnmVar, zzhelVar);
        return zzhnmVar;
    }

    public final com.google.android.gms.internal.ads.zziaz zzd() throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhnm zzhnmVar = this.zza;
        if (zzhnmVar.zzd().equals(com.google.android.gms.internal.ads.zzhtm.RAW)) {
            return com.google.android.gms.internal.ads.zziaz.zza(new byte[0]);
        }
        if (zzhnmVar.zzd().equals(com.google.android.gms.internal.ads.zzhtm.TINK)) {
            return com.google.android.gms.internal.ads.zzhms.zzb(zzhnmVar.zze().intValue());
        }
        if (zzhnmVar.zzd().equals(com.google.android.gms.internal.ads.zzhtm.LEGACY) || zzhnmVar.zzd().equals(com.google.android.gms.internal.ads.zzhtm.CRUNCHY)) {
            return com.google.android.gms.internal.ads.zzhms.zza(zzhnmVar.zze().intValue());
        }
        throw new java.security.GeneralSecurityException("Unknown output prefix type");
    }
}
