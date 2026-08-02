package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.internal.AbstractC0861c;
import com.google.android.gms.common.internal.C0875q;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zznf implements ServiceConnection, AbstractC0861c.a, AbstractC0861c.b {
    final /* synthetic */ zznl zza;
    private volatile boolean zzb;
    private volatile zzgo zzc;

    public zznf(zznl zznlVar) {
        Objects.requireNonNull(zznlVar);
        this.zza = zznlVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c.a
    @MainThread
    public final void onConnected(Bundle bundle) {
        this.zza.zzu.zzaW().zzd();
        synchronized (this) {
            try {
                C0875q.g(this.zzc);
                this.zza.zzu.zzaW().zzj(new zzna(this, (zzgb) this.zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c.b
    @MainThread
    public final void onConnectionFailed(@NonNull C0852b c0852b) {
        zznl zznlVar = this.zza;
        zznlVar.zzu.zzaW().zzd();
        zzgu zzf = zznlVar.zzu.zzf();
        if (zzf != null) {
            zzf.zzk().zzb("Service connection failed", c0852b);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzu.zzaW().zzj(new zzne(this, c0852b));
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c.a
    @MainThread
    public final void onConnectionSuspended(int i) {
        zzic zzicVar = this.zza.zzu;
        zzicVar.zzaW().zzd();
        zzicVar.zzaV().zzj().zza("Service connection suspended");
        zzicVar.zzaW().zzj(new zznb(this));
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zza.zzu.zzaW().zzd();
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                this.zza.zzu.zzaV().zzb().zza("Service connected with null binder");
                return;
            }
            zzgb zzgbVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzgbVar = queryLocalInterface instanceof zzgb ? (zzgb) queryLocalInterface : new zzfz(iBinder);
                    this.zza.zzu.zzaV().zzk().zza("Bound to IMeasurementService interface");
                } else {
                    this.zza.zzu.zzaV().zzb().zzb("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zza.zzu.zzaV().zzb().zza("Service connect failed to get IMeasurementService");
            }
            if (zzgbVar == null) {
                this.zzb = false;
                try {
                    com.google.android.gms.common.stats.a b = com.google.android.gms.common.stats.a.b();
                    zznl zznlVar = this.zza;
                    b.c(zznlVar.zzu.zzaY(), zznlVar.zzY());
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.zza.zzu.zzaW().zzj(new zzmy(this, zzgbVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        zzic zzicVar = this.zza.zzu;
        zzicVar.zzaW().zzd();
        zzicVar.zzaV().zzj().zza("Service disconnected");
        zzicVar.zzaW().zzj(new zzmz(this, componentName));
    }

    @WorkerThread
    public final void zza(Intent intent) {
        zznl zznlVar = this.zza;
        zznlVar.zzg();
        Context zzaY = zznlVar.zzu.zzaY();
        com.google.android.gms.common.stats.a b = com.google.android.gms.common.stats.a.b();
        synchronized (this) {
            try {
                if (this.zzb) {
                    this.zza.zzu.zzaV().zzk().zza("Connection attempt already in progress");
                    return;
                }
                zznl zznlVar2 = this.zza;
                zznlVar2.zzu.zzaV().zzk().zza("Using local app measurement service");
                this.zzb = true;
                b.a(zzaY, intent, zznlVar2.zzY(), 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    public final void zzb() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }

    @WorkerThread
    public final void zzc() {
        zznl zznlVar = this.zza;
        zznlVar.zzg();
        Context zzaY = zznlVar.zzu.zzaY();
        synchronized (this) {
            try {
                if (this.zzb) {
                    this.zza.zzu.zzaV().zzk().zza("Connection attempt already in progress");
                    return;
                }
                if (this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                    this.zza.zzu.zzaV().zzk().zza("Already awaiting connection attempt");
                    return;
                }
                this.zzc = new zzgo(zzaY, Looper.getMainLooper(), this, this);
                this.zza.zzu.zzaV().zzk().zza("Connecting to remote service");
                this.zzb = true;
                C0875q.g(this.zzc);
                this.zzc.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzd(boolean z) {
        this.zzb = false;
    }
}
