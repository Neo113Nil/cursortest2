package com.google.android.gms.internal.ads;

import E2.i;
import E2.o;
import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
public final class zzceo {
    public static final zzceb zza(final Context context, final zzcfv zzcfvVar, final String str, final boolean z4, final boolean z7, final zzauo zzauoVar, final zzbdf zzbdfVar, final VersionInfoParcel versionInfoParcel, zzbcn zzbcnVar, final i iVar, final E2.a aVar, final zzbaw zzbawVar, final zzfaf zzfafVar, final zzfai zzfaiVar, final zzeaq zzeaqVar, final zzfbe zzfbeVar, final zzdqq zzdqqVar) {
        zzbby.zza(context);
        try {
            final zzbcn zzbcnVar2 = null;
            zzftz zzftzVar = new zzftz(context, zzcfvVar, str, z4, z7, zzauoVar, zzbdfVar, versionInfoParcel, zzbcnVar2, iVar, aVar, zzbawVar, zzfafVar, zzfaiVar, zzfbeVar, zzdqqVar, zzeaqVar) { // from class: com.google.android.gms.internal.ads.zzcem
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcfv zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzauo zzf;
                public final /* synthetic */ zzbdf zzg;
                public final /* synthetic */ VersionInfoParcel zzh;
                public final /* synthetic */ i zzi;
                public final /* synthetic */ E2.a zzj;
                public final /* synthetic */ zzbaw zzk;
                public final /* synthetic */ zzfaf zzl;
                public final /* synthetic */ zzfai zzm;
                public final /* synthetic */ zzfbe zzn;
                public final /* synthetic */ zzdqq zzo;
                public final /* synthetic */ zzeaq zzp;

                {
                    this.zzi = iVar;
                    this.zzj = aVar;
                    this.zzk = zzbawVar;
                    this.zzl = zzfafVar;
                    this.zzm = zzfaiVar;
                    this.zzn = zzfbeVar;
                    this.zzo = zzdqqVar;
                    this.zzp = zzeaqVar;
                }

                @Override // com.google.android.gms.internal.ads.zzftz
                public final Object zza() {
                    zzcfv zzcfvVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z8 = this.zzd;
                    zzbaw zzbawVar2 = this.zzk;
                    boolean z9 = this.zze;
                    zzauo zzauoVar2 = this.zzf;
                    zzfaf zzfafVar2 = this.zzl;
                    zzbdf zzbdfVar2 = this.zzg;
                    i iVar2 = this.zzi;
                    zzfai zzfaiVar2 = this.zzm;
                    Context context2 = this.zza;
                    VersionInfoParcel versionInfoParcel2 = this.zzh;
                    E2.a aVar2 = this.zzj;
                    zzfbe zzfbeVar2 = this.zzn;
                    zzdqq zzdqqVar2 = this.zzo;
                    zzeaq zzeaqVar2 = this.zzp;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i7 = zzcfa.zza;
                        zzcet zzcetVar = new zzcet(new zzcfa(new zzcfu(context2), zzcfvVar2, str2, z8, z9, zzauoVar2, zzbdfVar2, versionInfoParcel2, null, iVar2, aVar2, zzbawVar2, zzfafVar2, zzfaiVar2, zzfbeVar2), zzdqqVar2);
                        o.f1952C.f1959e.getClass();
                        zzcetVar.setWebViewClient(new zzcfk(zzcetVar, zzbawVar2, z9, zzeaqVar2));
                        zzcetVar.setWebChromeClient(new zzcea(zzcetVar));
                        return zzcetVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object zza = zzftzVar.zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (zzceb) zza;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new zzcen("Webview initialization failed.", th2);
        }
    }
}
