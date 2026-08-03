package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfcn {
    private final android.content.Context zza;
    private final java.util.Set zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.gms.internal.ads.zzfqg zzd;

    public zzfcn(android.content.Context context, java.util.concurrent.Executor executor, java.util.Set set, com.google.android.gms.internal.ads.zzfqg zzfqgVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfqgVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(final java.lang.Object obj, final android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.zzfpw zzn = com.google.android.gms.internal.ads.zzfpw.CC.zzn(this.zza, 8);
        zzn.zza();
        java.util.Set<com.google.android.gms.internal.ads.zzfck> set = this.zzb;
        final java.util.ArrayList arrayList = new java.util.ArrayList(set.size());
        java.util.List arrayList2 = new java.util.ArrayList();
        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzni;
        if (!((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).isEmpty()) {
            arrayList2 = java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).split(","));
        }
        final android.os.Bundle bundle2 = new android.os.Bundle();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcN)).booleanValue() && bundle != null) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (obj instanceof android.os.Bundle) {
                bundle.putLong(com.google.android.gms.internal.ads.zzdyu.CLIENT_SIGNALS_START.zza(), currentTimeMillis);
            } else {
                bundle.putLong(com.google.android.gms.internal.ads.zzdyu.GMS_SIGNALS_START.zza(), currentTimeMillis);
            }
        }
        for (final com.google.android.gms.internal.ads.zzfck zzfckVar : set) {
            if (!arrayList2.contains(java.lang.String.valueOf(zzfckVar.zzb()))) {
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                com.google.common.util.concurrent.ListenableFuture zza = zzfckVar.zza();
                zza.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfcl
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                        boolean booleanValue = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbks.zza.zze()).booleanValue();
                        android.os.Bundle bundle3 = bundle2;
                        com.google.android.gms.internal.ads.zzfck zzfckVar2 = zzfckVar;
                        if (booleanValue) {
                            java.lang.String zza2 = com.google.android.gms.internal.ads.zzgua.zza(zzfckVar2.getClass().getCanonicalName());
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(zza2.length() + 25 + java.lang.String.valueOf(elapsedRealtime2).length());
                            sb.append("Signal runtime (ms) : ");
                            sb.append(zza2);
                            sb.append(" = ");
                            sb.append(elapsedRealtime2);
                            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                        }
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcN)).booleanValue()) {
                            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcT)).booleanValue()) {
                                synchronized (com.google.android.gms.internal.ads.zzfcn.this) {
                                    int zzb = zzfckVar2.zzb();
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzb).length() + 3);
                                    sb2.append("sig");
                                    sb2.append(zzb);
                                    bundle3.putLong(sb2.toString(), elapsedRealtime2);
                                }
                            }
                        }
                    }
                }, com.google.android.gms.internal.ads.zzcfr.zzh);
                arrayList.add(zza);
            }
        }
        com.google.common.util.concurrent.ListenableFuture zza2 = com.google.android.gms.internal.ads.zzhbw.zzp(arrayList).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfcm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                java.lang.Object obj2;
                android.os.Bundle bundle3;
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    com.google.android.gms.internal.ads.zzfci zzfciVar = (com.google.android.gms.internal.ads.zzfci) ((com.google.common.util.concurrent.ListenableFuture) it.next()).get();
                    if (zzfciVar != null) {
                        zzfciVar.zza(obj2);
                    }
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcN)).booleanValue() && (bundle3 = bundle) != null) {
                    android.os.Bundle bundle4 = bundle2;
                    long currentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    if (obj2 instanceof android.os.Bundle) {
                        bundle3.putLong(com.google.android.gms.internal.ads.zzdyu.CLIENT_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                    } else {
                        bundle3.putLong(com.google.android.gms.internal.ads.zzdyu.GMS_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle3.putBundle("gms_sig_latency_key", bundle4);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (com.google.android.gms.internal.ads.zzfqj.zza()) {
            com.google.android.gms.internal.ads.zzfqf.zzd(zza2, this.zzd, zzn);
        }
        return zza2;
    }
}
