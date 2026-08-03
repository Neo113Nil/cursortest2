package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhnm implements com.google.android.gms.internal.ads.zzhns {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zziaz zzb;
    private final com.google.android.gms.internal.ads.zzida zzc;
    private final com.google.android.gms.internal.ads.zzhsp zzd;
    private final com.google.android.gms.internal.ads.zzhtm zze;

    @javax.annotation.Nullable
    private final java.lang.Integer zzf;

    private zzhnm(java.lang.String str, com.google.android.gms.internal.ads.zziaz zziazVar, com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzhsp zzhspVar, com.google.android.gms.internal.ads.zzhtm zzhtmVar, @javax.annotation.Nullable java.lang.Integer num) {
        this.zza = str;
        this.zzb = zziazVar;
        this.zzc = zzidaVar;
        this.zzd = zzhspVar;
        this.zze = zzhtmVar;
        this.zzf = num;
    }

    public static com.google.android.gms.internal.ads.zzhnm zza(java.lang.String str, com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzhsp zzhspVar, com.google.android.gms.internal.ads.zzhtm zzhtmVar, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (zzhtmVar == com.google.android.gms.internal.ads.zzhtm.RAW) {
            if (num != null) {
                throw new java.security.GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new java.security.GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new com.google.android.gms.internal.ads.zzhnm(str, com.google.android.gms.internal.ads.zzhnz.zzb(str), zzidaVar, zzhspVar, zzhtmVar, num);
    }

    public final com.google.android.gms.internal.ads.zzida zzb() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzhsp zzc() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzhtm zzd() {
        return this.zze;
    }

    @javax.annotation.Nullable
    public final java.lang.Integer zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhns
    public final com.google.android.gms.internal.ads.zziaz zzf() {
        return this.zzb;
    }

    public final java.lang.String zzg() {
        return this.zza;
    }
}
