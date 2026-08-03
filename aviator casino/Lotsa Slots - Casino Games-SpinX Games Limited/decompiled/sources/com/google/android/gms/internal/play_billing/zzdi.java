package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public class zzdi {
    private static final com.google.android.gms.internal.play_billing.zzcd zzb = com.google.android.gms.internal.play_billing.zzcd.zza;
    protected volatile com.google.android.gms.internal.play_billing.zzec zza;
    private volatile com.google.android.gms.internal.play_billing.zzbq zzc;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzdi)) {
            return false;
        }
        com.google.android.gms.internal.play_billing.zzdi zzdiVar = (com.google.android.gms.internal.play_billing.zzdi) obj;
        com.google.android.gms.internal.play_billing.zzec zzecVar = this.zza;
        com.google.android.gms.internal.play_billing.zzec zzecVar2 = zzdiVar.zza;
        if (zzecVar == null && zzecVar2 == null) {
            return zzb().equals(zzdiVar.zzb());
        }
        if (zzecVar != null && zzecVar2 != null) {
            return zzecVar.equals(zzecVar2);
        }
        if (zzecVar != null) {
            zzdiVar.zzd(zzecVar.zzh());
            return zzecVar.equals(zzdiVar.zza);
        }
        zzd(zzecVar2.zzh());
        return this.zza.equals(zzecVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((com.google.android.gms.internal.play_billing.zzbn) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzf();
        }
        return 0;
    }

    public final com.google.android.gms.internal.play_billing.zzbq zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = com.google.android.gms.internal.play_billing.zzbq.zzb;
            } else {
                this.zzc = this.zza.zzb();
            }
            return this.zzc;
        }
    }

    public final com.google.android.gms.internal.play_billing.zzec zzc(com.google.android.gms.internal.play_billing.zzec zzecVar) {
        com.google.android.gms.internal.play_billing.zzec zzecVar2 = this.zza;
        this.zzc = null;
        this.zza = zzecVar;
        return zzecVar2;
    }

    protected final void zzd(com.google.android.gms.internal.play_billing.zzec zzecVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzecVar;
                this.zzc = com.google.android.gms.internal.play_billing.zzbq.zzb;
            } catch (com.google.android.gms.internal.play_billing.zzdc unused) {
                this.zza = zzecVar;
                this.zzc = com.google.android.gms.internal.play_billing.zzbq.zzb;
            }
        }
    }
}
