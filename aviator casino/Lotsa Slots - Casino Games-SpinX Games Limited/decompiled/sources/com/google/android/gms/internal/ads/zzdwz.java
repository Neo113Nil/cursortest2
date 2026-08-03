package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdwz {
    private final java.util.Map zza = new java.util.HashMap();

    zzdwz() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized void zza(java.lang.String str, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzflw zzflwVar) {
        com.google.android.gms.internal.ads.zzbxq zzB;
        if (this.zza.containsKey(str)) {
            return;
        }
        com.google.android.gms.internal.ads.zzbxq zzbxqVar = null;
        if (zzflwVar != null) {
            try {
                zzB = zzflwVar.zzB();
            } catch (com.google.android.gms.internal.ads.zzflf unused) {
            }
            if (zzflwVar != null) {
                try {
                    zzbxqVar = zzflwVar.zzC();
                } catch (com.google.android.gms.internal.ads.zzflf unused2) {
                }
            }
            boolean z = true;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkL)).booleanValue()) {
                if (zzflwVar != null) {
                    try {
                        zzflwVar.zzn();
                    } catch (com.google.android.gms.internal.ads.zzflf unused3) {
                    }
                }
                z = false;
            }
            this.zza.put(str, new com.google.android.gms.internal.ads.zzdwy(str, zzB, zzbxqVar, z));
        }
        zzB = null;
        if (zzflwVar != null) {
        }
        boolean z2 = true;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkL)).booleanValue()) {
        }
        this.zza.put(str, new com.google.android.gms.internal.ads.zzdwy(str, zzB, zzbxqVar, z2));
    }

    final synchronized void zzb(java.lang.String str, com.google.android.gms.internal.ads.zzbxb zzbxbVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new com.google.android.gms.internal.ads.zzdwy(str, zzbxbVar.zzf(), zzbxbVar.zzg(), true));
        } catch (java.lang.Throwable unused) {
        }
    }

    @javax.annotation.Nullable
    public final synchronized com.google.android.gms.internal.ads.zzdwy zzc(java.lang.String str) {
        return (com.google.android.gms.internal.ads.zzdwy) this.zza.get(str);
    }

    public final java.lang.String zzd(java.lang.String str) {
        com.google.android.gms.internal.ads.zzbxq zzbxqVar;
        com.google.android.gms.internal.ads.zzdwy zzc = zzc(str);
        return (zzc == null || (zzbxqVar = zzc.zzb) == null) ? "" : zzbxqVar.toString();
    }
}
