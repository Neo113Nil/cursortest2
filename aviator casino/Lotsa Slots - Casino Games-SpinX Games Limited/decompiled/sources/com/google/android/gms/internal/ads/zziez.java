package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public class zziez {
    protected volatile com.google.android.gms.internal.ads.zzifp zza;
    private volatile com.google.android.gms.internal.ads.zzida zzb;
    private volatile boolean zzc;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zziez)) {
            return false;
        }
        com.google.android.gms.internal.ads.zziez zziezVar = (com.google.android.gms.internal.ads.zziez) obj;
        com.google.android.gms.internal.ads.zzifp zzifpVar = this.zza;
        com.google.android.gms.internal.ads.zzifp zzifpVar2 = zziezVar.zza;
        if (zzifpVar == null && zzifpVar2 == null) {
            return zzc().equals(zziezVar.zzc());
        }
        if (zzifpVar != null && zzifpVar2 != null) {
            return zzifpVar.equals(zzifpVar2);
        }
        if (zzifpVar != null) {
            zziezVar.zzd(zzifpVar.zzbw());
            return zzifpVar.equals(zziezVar.zza);
        }
        zzd(zzifpVar2.zzbw());
        return this.zza.equals(zzifpVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final com.google.android.gms.internal.ads.zzifp zza(com.google.android.gms.internal.ads.zzifp zzifpVar) {
        com.google.android.gms.internal.ads.zzifp zzifpVar2 = this.zza;
        this.zzb = null;
        this.zza = zzifpVar;
        return zzifpVar2;
    }

    public final int zzb() {
        if (this.zzb != null) {
            return this.zzb.zzb();
        }
        if (this.zza != null) {
            return this.zza.zzbr();
        }
        return 0;
    }

    public final com.google.android.gms.internal.ads.zzida zzc() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            if (this.zza == null) {
                this.zzb = com.google.android.gms.internal.ads.zzida.zza;
            } else {
                this.zzb = this.zza.zzaM();
            }
            return this.zzb;
        }
    }

    protected final void zzd(com.google.android.gms.internal.ads.zzifp zzifpVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzifpVar;
                this.zzb = com.google.android.gms.internal.ads.zzida.zza;
            } catch (com.google.android.gms.internal.ads.zziet unused) {
                this.zzc = true;
                this.zza = zzifpVar;
                this.zzb = com.google.android.gms.internal.ads.zzida.zza;
            }
        }
    }
}
