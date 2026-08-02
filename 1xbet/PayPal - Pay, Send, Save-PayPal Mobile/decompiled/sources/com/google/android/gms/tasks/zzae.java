package com.google.android.gms.tasks;

/* loaded from: classes8.dex */
final class zzae<T> implements com.google.android.gms.tasks.zzab<T> {
    private final java.lang.Object zza = new java.lang.Object();
    private final int zzb;
    private final com.google.android.gms.tasks.zzw zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private java.lang.Exception zzg;
    private boolean zzh;

    private final void zza() {
        int i = this.zzd;
        int i2 = this.zze;
        int i3 = this.zzf;
        int i4 = this.zzb;
        if (i + i2 + i3 == i4) {
            if (this.zzg == null) {
                if (this.zzh) {
                    this.zzc.zze();
                    return;
                } else {
                    this.zzc.zza(null);
                    return;
                }
            }
            com.google.android.gms.tasks.zzw zzwVar = this.zzc;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 8 + java.lang.String.valueOf(i4).length() + 24);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            zzwVar.zzc(new java.util.concurrent.ExecutionException(sb.toString(), this.zzg));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(java.lang.Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }

    public zzae(int i, com.google.android.gms.tasks.zzw zzwVar) {
        this.zzb = i;
        this.zzc = zzwVar;
    }
}
