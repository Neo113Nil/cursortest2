package com.google.android.gms.ads.preload;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public class zzb {
    protected final com.google.android.gms.ads.internal.client.zzch zza;
    private final com.google.android.gms.ads.AdFormat zzb;
    private final android.content.Context zzc;

    protected zzb(android.content.Context context, com.google.android.gms.ads.AdFormat adFormat) {
        this.zza = com.google.android.gms.ads.zzb.zza(context);
        this.zzc = context.getApplicationContext();
        this.zzb = adFormat;
    }

    public final boolean zzb(java.lang.String str, com.google.android.gms.ads.preload.PreloadConfiguration preloadConfiguration, com.google.android.gms.ads.preload.PreloadCallbackV2 preloadCallbackV2) {
        if (str == null) {
            return false;
        }
        try {
            return this.zza.zzm(str, com.google.android.gms.ads.internal.util.client.zzf.zzu(this.zzc, preloadConfiguration, this.zzb), preloadCallbackV2 == null ? null : new com.google.android.gms.ads.preload.zza(this, preloadCallbackV2));
        } catch (android.os.RemoteException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 37);
            sb.append("Failed to preload ad for preload ID ");
            sb.append(str);
            sb.append(".");
            com.google.android.gms.ads.internal.util.client.zzo.zzj(sb.toString(), e);
            return false;
        }
    }

    public final boolean zzc(java.lang.String str, com.google.android.gms.ads.preload.PreloadConfiguration preloadConfiguration) {
        if (str == null) {
            return false;
        }
        try {
            return this.zza.zzm(str, com.google.android.gms.ads.internal.util.client.zzf.zzu(this.zzc, preloadConfiguration, this.zzb), null);
        } catch (android.os.RemoteException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 37);
            sb.append("Failed to preload ad for preload ID ");
            sb.append(str);
            sb.append(".");
            com.google.android.gms.ads.internal.util.client.zzo.zzj(sb.toString(), e);
            return false;
        }
    }

    public final boolean zzd(java.lang.String str) {
        try {
            return this.zza.zzn(this.zzb.getValue(), str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final int zze(java.lang.String str) {
        try {
            return this.zza.zzt(this.zzb.getValue(), str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return 0;
        }
    }

    public final boolean zzf(java.lang.String str) {
        try {
            return this.zza.zzu(this.zzb.getValue(), str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final void zzg() {
        try {
            this.zza.zzv(this.zzb.getValue());
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final java.util.Map zzh() {
        com.google.android.gms.ads.preload.PreloadConfiguration zzs;
        try {
            android.os.Bundle zzs2 = this.zza.zzs(this.zzb.getValue());
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.lang.String str : zzs2.keySet()) {
                byte[] byteArray = zzs2.getByteArray(str);
                if (byteArray != null && (zzs = com.google.android.gms.ads.internal.util.client.zzf.zzs((com.google.android.gms.ads.internal.client.zzfp) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(byteArray, com.google.android.gms.ads.internal.client.zzfp.CREATOR))) != null) {
                    hashMap.put(str, zzs);
                }
            }
            return hashMap;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return new java.util.HashMap();
        }
    }

    public final com.google.android.gms.ads.preload.PreloadConfiguration zzi(java.lang.String str) {
        try {
            com.google.android.gms.ads.internal.client.zzfp zzr = this.zza.zzr(this.zzb.getValue(), str);
            if (zzr == null) {
                return null;
            }
            return com.google.android.gms.ads.internal.util.client.zzf.zzs(zzr);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    protected final android.content.Context zzj() {
        return this.zzc;
    }
}
