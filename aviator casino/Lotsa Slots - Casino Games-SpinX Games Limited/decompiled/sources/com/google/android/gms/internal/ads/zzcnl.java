package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcnl {
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza;
    private final android.content.Context zzb;
    private final long zzc;
    private final java.lang.ref.WeakReference zzd;

    /* synthetic */ zzcnl(com.google.android.gms.internal.ads.zzcnk zzcnkVar, byte[] bArr) {
        this.zza = zzcnkVar.zzd();
        this.zzb = zzcnkVar.zze();
        this.zzd = zzcnkVar.zzg();
        this.zzc = zzcnkVar.zzf();
    }

    final android.content.Context zza() {
        return this.zzb;
    }

    final android.content.Context zzb() {
        return this.zzb;
    }

    final java.lang.ref.WeakReference zzc() {
        return this.zzd;
    }

    final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd() {
        return this.zza;
    }

    final java.lang.String zze() {
        return com.google.android.gms.ads.internal.zzt.zzc().zze(this.zzb, this.zza.afmaVersion);
    }

    final com.google.android.gms.internal.ads.zzcni zzf() {
        return new com.google.android.gms.internal.ads.zzcni(this.zzb, this.zza);
    }

    public final com.google.android.gms.ads.internal.zzk zzg() {
        return new com.google.android.gms.ads.internal.zzk(this.zzb, this.zza);
    }

    final com.google.android.gms.internal.ads.zzblk zzh() {
        return new com.google.android.gms.internal.ads.zzblk(this.zzb);
    }

    final long zzi() {
        return this.zzc;
    }
}
