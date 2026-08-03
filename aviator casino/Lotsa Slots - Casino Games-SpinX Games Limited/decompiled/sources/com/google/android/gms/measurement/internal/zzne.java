package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzne implements android.content.ServiceConnection, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.measurement.internal.zznk zza;
    private volatile boolean zzb;
    private volatile com.google.android.gms.measurement.internal.zzgn zzc;

    protected zzne(com.google.android.gms.measurement.internal.zznk zznkVar) {
        java.util.Objects.requireNonNull(zznkVar);
        this.zza = zznkVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        this.zza.zzu.zzaW().zzd();
        synchronized (this) {
            try {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc);
                this.zza.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzmz(this, (com.google.android.gms.measurement.internal.zzga) this.zzc.getService()));
            } catch (android.os.DeadObjectException | java.lang.IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.measurement.internal.zznk zznkVar = this.zza;
        zznkVar.zzu.zzaW().zzd();
        com.google.android.gms.measurement.internal.zzgt zzf = zznkVar.zzu.zzf();
        if (zzf != null) {
            zzf.zzk().zzb("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zznd(this, connectionResult));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zza.zzu;
        zzibVar.zzaW().zzd();
        zzibVar.zzaV().zzj().zza("Service connection suspended");
        zzibVar.zzaW().zzj(new com.google.android.gms.measurement.internal.zzna(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.zza.zzu.zzaW().zzd();
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                this.zza.zzu.zzaV().zzb().zza("Service connected with null binder");
                return;
            }
            com.google.android.gms.measurement.internal.zzga zzgaVar = null;
            try {
                java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzgaVar = queryLocalInterface instanceof com.google.android.gms.measurement.internal.zzga ? (com.google.android.gms.measurement.internal.zzga) queryLocalInterface : new com.google.android.gms.measurement.internal.zzfy(iBinder);
                    this.zza.zzu.zzaV().zzk().zza("Bound to IMeasurementService interface");
                } else {
                    this.zza.zzu.zzaV().zzb().zzb("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (android.os.RemoteException unused) {
                this.zza.zzu.zzaV().zzb().zza("Service connect failed to get IMeasurementService");
            }
            if (zzgaVar == null) {
                this.zzb = false;
                try {
                    com.google.android.gms.common.stats.ConnectionTracker connectionTracker = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
                    com.google.android.gms.measurement.internal.zznk zznkVar = this.zza;
                    connectionTracker.unbindService(zznkVar.zzu.zzaY(), zznkVar.zzY());
                } catch (java.lang.IllegalArgumentException unused2) {
                }
            } else {
                this.zza.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzmx(this, zzgaVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zza.zzu;
        zzibVar.zzaW().zzd();
        zzibVar.zzaV().zzj().zza("Service disconnected");
        zzibVar.zzaW().zzj(new com.google.android.gms.measurement.internal.zzmy(this, componentName));
    }

    public final void zza(android.content.Intent intent) {
        com.google.android.gms.measurement.internal.zznk zznkVar = this.zza;
        zznkVar.zzg();
        android.content.Context zzaY = zznkVar.zzu.zzaY();
        com.google.android.gms.common.stats.ConnectionTracker connectionTracker = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzu.zzaV().zzk().zza("Connection attempt already in progress");
                return;
            }
            com.google.android.gms.measurement.internal.zznk zznkVar2 = this.zza;
            zznkVar2.zzu.zzaV().zzk().zza("Using local app measurement service");
            this.zzb = true;
            connectionTracker.bindService(zzaY, intent, zznkVar2.zzY(), 129);
        }
    }

    public final void zzb() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }

    public final void zzc() {
        com.google.android.gms.measurement.internal.zznk zznkVar = this.zza;
        zznkVar.zzg();
        android.content.Context zzaY = zznkVar.zzu.zzaY();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzu.zzaV().zzk().zza("Connection attempt already in progress");
                return;
            }
            if (this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                this.zza.zzu.zzaV().zzk().zza("Already awaiting connection attempt");
                return;
            }
            this.zzc = new com.google.android.gms.measurement.internal.zzgn(zzaY, android.os.Looper.getMainLooper(), this, this);
            this.zza.zzu.zzaV().zzk().zza("Connecting to remote service");
            this.zzb = true;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc);
            this.zzc.checkAvailabilityAndConnect();
        }
    }

    final /* synthetic */ void zzd(boolean z) {
        this.zzb = false;
    }
}
