package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
final class zzq extends com.google.android.gms.common.internal.GmsClientSupervisor {
    private final java.util.HashMap zzb = new java.util.HashMap();
    private final android.content.Context zzc;
    private volatile android.os.Handler zzd;
    private final com.google.android.gms.common.internal.zzp zze;
    private final com.google.android.gms.common.stats.ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;
    private volatile java.util.concurrent.Executor zzi;

    zzq(android.content.Context context, android.os.Looper looper, java.util.concurrent.Executor executor) {
        com.google.android.gms.common.internal.zzp zzpVar = new com.google.android.gms.common.internal.zzp(this, null);
        this.zze = zzpVar;
        this.zzc = context.getApplicationContext();
        this.zzd = new com.google.android.gms.internal.common.zzg(looper, zzpVar);
        this.zzf = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
        this.zzg = 5000L;
        this.zzh = 300000L;
        this.zzi = executor;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final com.google.android.gms.common.ConnectionResult zza(com.google.android.gms.common.internal.zzn zznVar, android.content.ServiceConnection serviceConnection, java.lang.String str, java.util.concurrent.Executor executor) {
        com.google.android.gms.common.ConnectionResult connectionResult;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        java.util.HashMap hashMap = this.zzb;
        synchronized (hashMap) {
            com.google.android.gms.common.internal.zzo zzoVar = (com.google.android.gms.common.internal.zzo) hashMap.get(zznVar);
            if (executor == null) {
                executor = this.zzi;
            }
            if (zzoVar == null) {
                zzoVar = new com.google.android.gms.common.internal.zzo(this, zznVar);
                zzoVar.zzb(serviceConnection, serviceConnection, str);
                android.os.UserHandle zze = zznVar.zze();
                connectionResult = (zze == null || android.os.Build.VERSION.SDK_INT < 33) ? zzoVar.zzj(str, executor) : zzoVar.zzk(str, zze);
                hashMap.put(zznVar, zzoVar);
            } else {
                this.zzd.removeMessages(0, zznVar);
                if (zzoVar.zzf(serviceConnection)) {
                    java.lang.String obj = zznVar.toString();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(obj);
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                zzoVar.zzb(serviceConnection, serviceConnection, str);
                int zze2 = zzoVar.zze();
                if (zze2 == 1) {
                    serviceConnection.onServiceConnected(zzoVar.zzi(), zzoVar.zzh());
                } else if (zze2 == 2) {
                    android.os.UserHandle zze3 = zznVar.zze();
                    connectionResult = (zze3 == null || android.os.Build.VERSION.SDK_INT < 33) ? zzoVar.zzj(str, executor) : zzoVar.zzk(str, zze3);
                }
                connectionResult = null;
            }
            if (zzoVar.zzd()) {
                return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
            }
            if (connectionResult == null) {
                connectionResult = new com.google.android.gms.common.ConnectionResult(-1);
            }
            return connectionResult;
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void zzc(com.google.android.gms.common.internal.zzn zznVar, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        java.util.HashMap hashMap = this.zzb;
        synchronized (hashMap) {
            com.google.android.gms.common.internal.zzo zzoVar = (com.google.android.gms.common.internal.zzo) hashMap.get(zznVar);
            if (zzoVar == null) {
                java.lang.String obj = zznVar.toString();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(obj);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            if (!zzoVar.zzf(serviceConnection)) {
                java.lang.String obj2 = zznVar.toString();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(obj2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(obj2);
                throw new java.lang.IllegalStateException(sb2.toString());
            }
            zzoVar.zzc(serviceConnection, str);
            if (zzoVar.zzg()) {
                this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, zznVar), this.zzg);
            }
        }
    }

    final void zzd(android.os.Looper looper) {
        synchronized (this.zzb) {
            this.zzd = new com.google.android.gms.internal.common.zzg(looper, this.zze);
        }
    }

    final void zze(java.util.concurrent.Executor executor) {
        synchronized (this.zzb) {
            this.zzi = executor;
        }
    }

    final /* synthetic */ long zzj() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.gms.common.stats.ConnectionTracker zzi() {
        return this.zzf;
    }

    final /* synthetic */ android.os.Handler zzh() {
        return this.zzd;
    }

    final /* synthetic */ android.content.Context zzg() {
        return this.zzc;
    }

    final /* synthetic */ java.util.HashMap zzf() {
        return this.zzb;
    }
}
