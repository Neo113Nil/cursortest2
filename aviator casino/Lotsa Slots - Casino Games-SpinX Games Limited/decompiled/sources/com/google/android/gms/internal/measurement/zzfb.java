package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzfb {
    private static volatile com.google.android.gms.internal.measurement.zzfb zzc;
    protected final java.util.concurrent.ExecutorService zzb;
    private final com.google.android.gms.measurement.api.AppMeasurementSdk zze;
    private final java.util.List zzf;
    private int zzg;
    private boolean zzh;
    private final java.lang.String zzi;
    private volatile com.google.android.gms.internal.measurement.zzcr zzj;
    private final java.lang.String zzd = "FA";
    protected final com.google.android.gms.common.util.Clock zza = com.google.android.gms.common.util.DefaultClock.getInstance();

    protected zzfb(android.content.Context context, android.os.Bundle bundle) {
        com.google.android.gms.internal.measurement.zzcm.zza();
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.internal.measurement.zzed(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzb = java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zze = new com.google.android.gms.measurement.api.AppMeasurementSdk(this);
        this.zzf = new java.util.ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.zzls.zza(context, "google_app_id", com.google.android.gms.measurement.internal.zzht.zza(context)) != null) {
                try {
                    java.lang.Class.forName(com.unity3d.services.core.fid.Constants.FID_CLASS, false, getClass().getClassLoader());
                } catch (java.lang.ClassNotFoundException unused) {
                    this.zzi = null;
                    this.zzh = true;
                    android.util.Log.w(this.zzd, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (java.lang.IllegalStateException unused2) {
        }
        this.zzi = "fa";
        zzM(new com.google.android.gms.internal.measurement.zzdr(this, context, bundle));
        android.app.Application application = (android.app.Application) context.getApplicationContext();
        if (application == null) {
            android.util.Log.w(this.zzd, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new com.google.android.gms.internal.measurement.zzfa(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzS, reason: merged with bridge method [inline-methods] */
    public final void zzM(com.google.android.gms.internal.measurement.zzeq zzeqVar) {
        this.zzb.execute(zzeqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzT, reason: merged with bridge method [inline-methods] */
    public final void zzN(java.lang.Exception exc, boolean z, boolean z2) {
        this.zzh |= z;
        if (z) {
            android.util.Log.w(this.zzd, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            zzD(5, "Error with data collection. Data lost.", exc, null, null);
        }
        android.util.Log.w(this.zzd, "Error with data collection. Data lost.", exc);
    }

    private final void zzU(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, boolean z2, java.lang.Long l) {
        zzM(new com.google.android.gms.internal.measurement.zzep(this, l, str, str2, bundle, z, z2));
    }

    public static com.google.android.gms.internal.measurement.zzfb zza(android.content.Context context, android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        if (zzc == null) {
            synchronized (com.google.android.gms.internal.measurement.zzfb.class) {
                if (zzc == null) {
                    zzc = new com.google.android.gms.internal.measurement.zzfb(context, bundle);
                }
            }
        }
        return zzc;
    }

    public final java.lang.String zzA() {
        com.google.android.gms.internal.measurement.zzco zzcoVar = new com.google.android.gms.internal.measurement.zzco();
        zzM(new com.google.android.gms.internal.measurement.zzdz(this, zzcoVar));
        return zzcoVar.zzc(500L);
    }

    public final java.lang.String zzB() {
        com.google.android.gms.internal.measurement.zzco zzcoVar = new com.google.android.gms.internal.measurement.zzco();
        zzM(new com.google.android.gms.internal.measurement.zzea(this, zzcoVar));
        return zzcoVar.zzc(500L);
    }

    public final java.util.Map zzC(java.lang.String str, java.lang.String str2, boolean z) {
        com.google.android.gms.internal.measurement.zzco zzcoVar = new com.google.android.gms.internal.measurement.zzco();
        zzM(new com.google.android.gms.internal.measurement.zzeb(this, str, str2, z, zzcoVar));
        android.os.Bundle zze = zzcoVar.zze(5000L);
        if (zze == null || zze.size() == 0) {
            return java.util.Collections.emptyMap();
        }
        java.util.HashMap hashMap = new java.util.HashMap(zze.size());
        for (java.lang.String str3 : zze.keySet()) {
            java.lang.Object obj = zze.get(str3);
            if ((obj instanceof java.lang.Double) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void zzD(int i, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        zzM(new com.google.android.gms.internal.measurement.zzec(this, false, 5, str, obj, null, null));
    }

    public final android.os.Bundle zzE(android.os.Bundle bundle, boolean z) {
        com.google.android.gms.internal.measurement.zzco zzcoVar = new com.google.android.gms.internal.measurement.zzco();
        zzM(new com.google.android.gms.internal.measurement.zzee(this, bundle, zzcoVar));
        if (z) {
            return zzcoVar.zze(5000L);
        }
        return null;
    }

    public final int zzF(java.lang.String str) {
        com.google.android.gms.internal.measurement.zzco zzcoVar = new com.google.android.gms.internal.measurement.zzco();
        zzM(new com.google.android.gms.internal.measurement.zzef(this, str, zzcoVar));
        java.lang.Integer num = (java.lang.Integer) com.google.android.gms.internal.measurement.zzco.zzf(zzcoVar.zze(10000L), java.lang.Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final java.lang.String zzG() {
        com.google.android.gms.internal.measurement.zzco zzcoVar = new com.google.android.gms.internal.measurement.zzco();
        zzM(new com.google.android.gms.internal.measurement.zzeg(this, zzcoVar));
        return zzcoVar.zzc(com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }

    public final java.lang.Long zzH() {
        com.google.android.gms.internal.measurement.zzco zzcoVar = new com.google.android.gms.internal.measurement.zzco();
        zzM(new com.google.android.gms.internal.measurement.zzeh(this, zzcoVar));
        return zzcoVar.zzd(com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }

    public final java.lang.String zzI() {
        return this.zzi;
    }

    public final java.lang.Object zzJ(int i) {
        com.google.android.gms.internal.measurement.zzco zzcoVar = new com.google.android.gms.internal.measurement.zzco();
        zzM(new com.google.android.gms.internal.measurement.zzei(this, zzcoVar, i));
        return com.google.android.gms.internal.measurement.zzco.zzf(zzcoVar.zze(15000L), java.lang.Object.class);
    }

    public final void zzK(boolean z) {
        zzM(new com.google.android.gms.internal.measurement.zzej(this, z));
    }

    public final void zzL(android.os.Bundle bundle) {
        zzM(new com.google.android.gms.internal.measurement.zzek(this, bundle));
    }

    final /* synthetic */ java.lang.String zzO() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzP() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.gms.internal.measurement.zzcr zzQ() {
        return this.zzj;
    }

    final /* synthetic */ void zzR(com.google.android.gms.internal.measurement.zzcr zzcrVar) {
        this.zzj = zzcrVar;
    }

    public final com.google.android.gms.measurement.api.AppMeasurementSdk zzb() {
        return this.zze;
    }

    protected final com.google.android.gms.internal.measurement.zzcr zzc(android.content.Context context, boolean z) {
        try {
            return com.google.android.gms.internal.measurement.zzcq.asInterface(com.google.android.gms.dynamite.DynamiteModule.load(context, z ? com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION : com.google.android.gms.dynamite.DynamiteModule.PREFER_LOCAL, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
            zzN(e, true, false);
            return null;
        }
    }

    public final void zzd(com.google.android.gms.measurement.internal.zzjo zzjoVar) {
        com.google.android.gms.internal.measurement.zzer zzerVar = new com.google.android.gms.internal.measurement.zzer(zzjoVar);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzerVar);
                return;
            } catch (android.os.BadParcelableException | android.os.NetworkOnMainThreadException | android.os.RemoteException | java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.lang.NullPointerException | java.lang.SecurityException | java.lang.UnsupportedOperationException unused) {
                android.util.Log.w(this.zzd, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        zzM(new com.google.android.gms.internal.measurement.zzel(this, zzerVar));
    }

    public final void zze(android.content.Intent intent) {
        zzM(new com.google.android.gms.internal.measurement.zzem(this, intent));
    }

    public final void zzf(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjpVar);
        java.util.List list = this.zzf;
        synchronized (list) {
            for (int i = 0; i < list.size(); i++) {
                if (zzjpVar.equals(((android.util.Pair) list.get(i)).first)) {
                    android.util.Log.w(this.zzd, "OnEventListener already registered.");
                    return;
                }
            }
            com.google.android.gms.internal.measurement.zzes zzesVar = new com.google.android.gms.internal.measurement.zzes(zzjpVar);
            list.add(new android.util.Pair(zzjpVar, zzesVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzesVar);
                    return;
                } catch (android.os.BadParcelableException | android.os.NetworkOnMainThreadException | android.os.RemoteException | java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.lang.NullPointerException | java.lang.SecurityException | java.lang.UnsupportedOperationException unused) {
                    android.util.Log.w(this.zzd, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzM(new com.google.android.gms.internal.measurement.zzen(this, zzesVar));
        }
    }

    public final void zzg(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        android.util.Pair pair;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjpVar);
        java.util.List list = this.zzf;
        synchronized (list) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    pair = null;
                    break;
                } else {
                    if (zzjpVar.equals(((android.util.Pair) list.get(i)).first)) {
                        pair = (android.util.Pair) list.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (pair == null) {
                android.util.Log.w(this.zzd, "OnEventListener had not been registered.");
                return;
            }
            list.remove(pair);
            com.google.android.gms.internal.measurement.zzes zzesVar = (com.google.android.gms.internal.measurement.zzes) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzesVar);
                    return;
                } catch (android.os.BadParcelableException | android.os.NetworkOnMainThreadException | android.os.RemoteException | java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.lang.NullPointerException | java.lang.SecurityException | java.lang.UnsupportedOperationException unused) {
                    android.util.Log.w(this.zzd, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzM(new com.google.android.gms.internal.measurement.zzeo(this, zzesVar));
        }
    }

    public final void zzh(java.lang.String str, android.os.Bundle bundle) {
        zzU(null, str, bundle, false, true, null);
    }

    public final void zzi(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zzU(str, str2, bundle, true, true, null);
    }

    public final void zzj(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        zzU(str, str2, bundle, true, false, java.lang.Long.valueOf(j));
    }

    public final void zzk(java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z) {
        zzM(new com.google.android.gms.internal.measurement.zzdh(this, str, str2, obj, z));
    }

    public final void zzl(android.os.Bundle bundle) {
        zzM(new com.google.android.gms.internal.measurement.zzdi(this, bundle));
    }

    public final void zzm(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zzM(new com.google.android.gms.internal.measurement.zzdj(this, str, str2, bundle));
    }

    public final java.util.List zzn(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.measurement.zzco zzcoVar = new com.google.android.gms.internal.measurement.zzco();
        zzM(new com.google.android.gms.internal.measurement.zzdk(this, str, str2, zzcoVar));
        java.util.List list = (java.util.List) com.google.android.gms.internal.measurement.zzco.zzf(zzcoVar.zze(5000L), java.util.List.class);
        return list == null ? java.util.Collections.emptyList() : list;
    }

    public final void zzo(java.lang.String str) {
        zzM(new com.google.android.gms.internal.measurement.zzdl(this, str));
    }

    public final void zzp(com.google.android.gms.internal.measurement.zzdf zzdfVar, java.lang.String str, java.lang.String str2) {
        zzM(new com.google.android.gms.internal.measurement.zzdm(this, zzdfVar, str, str2));
    }

    public final void zzq(java.lang.Boolean bool) {
        zzM(new com.google.android.gms.internal.measurement.zzdn(this, bool));
    }

    public final void zzr(android.os.Bundle bundle) {
        zzM(new com.google.android.gms.internal.measurement.zzdo(this, bundle));
    }

    public final void zzs() {
        zzM(new com.google.android.gms.internal.measurement.zzdp(this));
    }

    public final void zzt(long j) {
        zzM(new com.google.android.gms.internal.measurement.zzdq(this, j));
    }

    public final void zzu(java.lang.String str) {
        zzM(new com.google.android.gms.internal.measurement.zzds(this, str));
    }

    public final void zzv(java.lang.String str) {
        zzM(new com.google.android.gms.internal.measurement.zzdt(this, str));
    }

    public final void zzw(java.lang.Runnable runnable) {
        zzM(new com.google.android.gms.internal.measurement.zzdv(this, runnable));
    }

    public final java.lang.String zzx() {
        com.google.android.gms.internal.measurement.zzco zzcoVar = new com.google.android.gms.internal.measurement.zzco();
        zzM(new com.google.android.gms.internal.measurement.zzdw(this, zzcoVar));
        return zzcoVar.zzc(500L);
    }

    public final java.lang.String zzy() {
        com.google.android.gms.internal.measurement.zzco zzcoVar = new com.google.android.gms.internal.measurement.zzco();
        zzM(new com.google.android.gms.internal.measurement.zzdx(this, zzcoVar));
        return zzcoVar.zzc(50L);
    }

    public final long zzz() {
        com.google.android.gms.internal.measurement.zzco zzcoVar = new com.google.android.gms.internal.measurement.zzco();
        zzM(new com.google.android.gms.internal.measurement.zzdy(this, zzcoVar));
        java.lang.Long zzd = zzcoVar.zzd(500L);
        if (zzd != null) {
            return zzd.longValue();
        }
        long nextLong = new java.util.Random(java.lang.System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
        int i = this.zzg + 1;
        this.zzg = i;
        return nextLong + i;
    }
}
