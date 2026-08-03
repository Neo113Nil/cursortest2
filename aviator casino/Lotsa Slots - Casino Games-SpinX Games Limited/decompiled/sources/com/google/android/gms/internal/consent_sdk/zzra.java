package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public class zzra {
    protected volatile com.google.android.gms.internal.consent_sdk.zzrq zza;
    private volatile com.google.android.gms.internal.consent_sdk.zzpm zzb;
    private volatile boolean zzc;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.consent_sdk.zzra)) {
            return false;
        }
        com.google.android.gms.internal.consent_sdk.zzra zzraVar = (com.google.android.gms.internal.consent_sdk.zzra) obj;
        com.google.android.gms.internal.consent_sdk.zzrq zzrqVar = this.zza;
        com.google.android.gms.internal.consent_sdk.zzrq zzrqVar2 = zzraVar.zza;
        if (zzrqVar == null && zzrqVar2 == null) {
            return zzb().equals(zzraVar.zzb());
        }
        if (zzrqVar != null && zzrqVar2 != null) {
            return zzrqVar.equals(zzrqVar2);
        }
        if (zzrqVar != null) {
            zzraVar.zzd(zzrqVar.zzl());
            return zzrqVar.equals(zzraVar.zza);
        }
        zzd(zzrqVar2.zzl());
        return this.zza.equals(zzrqVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((com.google.android.gms.internal.consent_sdk.zzpk) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzn();
        }
        return 0;
    }

    public final com.google.android.gms.internal.consent_sdk.zzpm zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            if (this.zza == null) {
                this.zzb = com.google.android.gms.internal.consent_sdk.zzpm.zzb;
            } else {
                this.zzb = this.zza.zzk();
            }
            return this.zzb;
        }
    }

    public final com.google.android.gms.internal.consent_sdk.zzrq zzc(com.google.android.gms.internal.consent_sdk.zzrq zzrqVar) {
        com.google.android.gms.internal.consent_sdk.zzrq zzrqVar2 = this.zza;
        this.zzb = null;
        this.zza = zzrqVar;
        return zzrqVar2;
    }

    protected final void zzd(com.google.android.gms.internal.consent_sdk.zzrq zzrqVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzrqVar;
                this.zzb = com.google.android.gms.internal.consent_sdk.zzpm.zzb;
            } catch (com.google.android.gms.internal.consent_sdk.zzqu unused) {
                this.zzc = true;
                this.zza = zzrqVar;
                this.zzb = com.google.android.gms.internal.consent_sdk.zzpm.zzb;
            }
        }
    }
}
