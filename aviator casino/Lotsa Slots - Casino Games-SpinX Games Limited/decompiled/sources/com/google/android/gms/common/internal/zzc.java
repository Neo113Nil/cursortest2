package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public abstract class zzc {
    private java.lang.Object zza;
    private boolean zzb;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzd;

    public zzc(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, java.lang.Object obj) {
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zzd = baseGmsClient;
        this.zza = obj;
        this.zzb = false;
    }

    protected abstract void zzc(java.lang.Object obj);

    public final void zzd() {
        java.lang.Object obj;
        synchronized (this) {
            obj = this.zza;
            if (this.zzb) {
                java.lang.String obj2 = toString();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(obj2.length() + 47);
                sb.append("Callback proxy ");
                sb.append(obj2);
                sb.append(" being reused. This is not safe.");
                android.util.Log.w("GmsClient", sb.toString());
            }
        }
        if (obj != null) {
            zzc(obj);
        }
        synchronized (this) {
            this.zzb = true;
        }
        zze();
    }

    public final void zze() {
        zzf();
        com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = this.zzd;
        synchronized (baseGmsClient.zzj()) {
            baseGmsClient.zzj().remove(this);
        }
    }

    public final void zzf() {
        synchronized (this) {
            this.zza = null;
        }
    }
}
