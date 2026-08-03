package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfrt {
    private final com.google.android.gms.ads.internal.util.client.zzx zza;
    private final com.google.android.gms.ads.internal.util.client.zzu zzb;
    private final com.google.android.gms.internal.ads.zzhch zzc;
    private final com.google.android.gms.internal.ads.zzfru zzd;
    private final com.google.android.gms.internal.ads.zzcng zze;

    public zzfrt(com.google.android.gms.ads.internal.util.client.zzx zzxVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, com.google.android.gms.internal.ads.zzhch zzhchVar, com.google.android.gms.internal.ads.zzfru zzfruVar, com.google.android.gms.internal.ads.zzcng zzcngVar) {
        this.zza = zzxVar;
        this.zzb = zzuVar;
        this.zzc = zzhchVar;
        this.zzd = zzfruVar;
        this.zze = zzcngVar;
    }

    private final com.google.common.util.concurrent.ListenableFuture zze(final java.lang.String str, final long j, final int i) {
        final java.lang.String str2;
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        if (i > zzxVar.zza()) {
            com.google.android.gms.internal.ads.zzfru zzfruVar = this.zzd;
            if (zzfruVar == null || !zzxVar.zzd()) {
                return com.google.android.gms.internal.ads.zzhbw.zza(com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE);
            }
            zzfruVar.zza(str, "", 2);
            return com.google.android.gms.internal.ads.zzhbw.zza(com.google.android.gms.ads.internal.util.client.zzt.BUFFERED);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjQ)).booleanValue()) {
            android.net.Uri parse = android.net.Uri.parse(str);
            java.lang.String encodedQuery = parse.getEncodedQuery();
            android.net.Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", java.lang.Integer.toString(i));
            java.lang.String valueOf = java.lang.String.valueOf(clearQuery.build());
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 1 + java.lang.String.valueOf(encodedQuery).length());
            sb.append(valueOf);
            sb.append(com.ironsource.X3.j.c);
            sb.append(encodedQuery);
            str2 = sb.toString();
        } else {
            str2 = str;
        }
        com.google.android.gms.internal.ads.zzhbe zzhbeVar = new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzfrs
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzfrt.this.zzb(i, j, str, (com.google.android.gms.ads.internal.util.client.zzt) obj);
            }
        };
        if (j == 0) {
            com.google.android.gms.internal.ads.zzhch zzhchVar = this.zzc;
            return com.google.android.gms.internal.ads.zzhbw.zzj(zzhchVar.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfrr
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return com.google.android.gms.internal.ads.zzfrt.this.zzd(str2);
                }
            }), zzhbeVar, zzhchVar);
        }
        com.google.android.gms.internal.ads.zzhch zzhchVar2 = this.zzc;
        return com.google.android.gms.internal.ads.zzhbw.zzj(zzhchVar2.schedule(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfrq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzfrt.this.zzc(str2);
            }
        }, j, java.util.concurrent.TimeUnit.MILLISECONDS), zzhbeVar, zzhchVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.internal.util.client.zzt zzd(java.lang.String str) {
        com.google.android.gms.internal.ads.zzcng zzcngVar;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzki)).booleanValue() || (zzcngVar = this.zze) == null || (!com.google.android.gms.ads.internal.zzt.zzc().zzh(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzi(str))) {
            return this.zzb.zzc(str, null);
        }
        java.lang.String zzb = zzcngVar.zzb();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (zzb != null) {
            hashMap.put((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkj), zzb);
        }
        return this.zzb.zzc(str, hashMap);
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.String str) {
        if (str != null) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzg)).booleanValue() || !str.isEmpty()) {
                try {
                    return zze(str, 0L, 1);
                } catch (java.lang.NullPointerException | java.util.concurrent.RejectedExecutionException unused) {
                    return com.google.android.gms.internal.ads.zzhbw.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
                }
            }
        }
        return com.google.android.gms.internal.ads.zzhbw.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(int i, long j, java.lang.String str, com.google.android.gms.ads.internal.util.client.zzt zztVar) {
        if (zztVar != com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE) {
            return com.google.android.gms.internal.ads.zzhbw.zza(zztVar);
        }
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        long zzb = zzxVar.zzb();
        if (i != 1) {
            zzb = (long) (zzxVar.zzc() * j);
        }
        return zze(str, zzb, i + 1);
    }
}
