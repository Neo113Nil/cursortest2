package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhdu {
    private boolean zza;

    @javax.annotation.Nullable
    private final com.google.android.gms.internal.ads.zzheh zzc;
    private final com.google.android.gms.internal.ads.zzhds zzb = com.google.android.gms.internal.ads.zzhds.zza;
    private com.google.android.gms.internal.ads.zzhdv zzd = null;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzhdw zze = null;

    /* synthetic */ zzhdu(com.google.android.gms.internal.ads.zzheh zzhehVar, byte[] bArr) {
        this.zzc = zzhehVar;
    }

    public final com.google.android.gms.internal.ads.zzhdu zza() {
        com.google.android.gms.internal.ads.zzhdw zzhdwVar = this.zze;
        if (zzhdwVar != null) {
            zzhdwVar.zzc();
        }
        this.zza = true;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhdu zzb() {
        com.google.android.gms.internal.ads.zzhdv zzhdvVar;
        zzhdvVar = com.google.android.gms.internal.ads.zzhdv.zza;
        this.zzd = zzhdvVar;
        return this;
    }

    final /* synthetic */ boolean zzc() {
        return this.zza;
    }

    final /* synthetic */ void zzd(boolean z) {
        this.zza = false;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzhds zze() {
        return this.zzb;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzheh zzf() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzhdv zzg() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzhdw zzh() {
        return this.zze;
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzhdw zzhdwVar) {
        this.zze = zzhdwVar;
    }
}
