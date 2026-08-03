package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzim implements com.google.android.gms.internal.ads.zzhp {
    private final com.google.android.gms.internal.ads.zzhp zza;
    private long zzb;
    private android.net.Uri zzc = android.net.Uri.EMPTY;
    private java.util.Map zzd = java.util.Collections.emptyMap();

    public zzim(com.google.android.gms.internal.ads.zzhp zzhpVar) {
        this.zza = zzhpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        int zza = this.zza.zza(bArr, i, i2);
        if (zza != -1) {
            this.zzb += zza;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(com.google.android.gms.internal.ads.zzht zzhtVar) throws java.io.IOException {
        this.zzc = zzhtVar.zza;
        this.zzd = java.util.Collections.emptyMap();
        try {
            long zzb = this.zza.zzb(zzhtVar);
            android.net.Uri zzc = zzc();
            if (zzc != null) {
                this.zzc = zzc;
            }
            this.zzd = zzj();
            return zzb;
        } catch (java.lang.Throwable th) {
            android.net.Uri zzc2 = zzc();
            if (zzc2 != null) {
                this.zzc = zzc2;
            }
            this.zzd = zzj();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final android.net.Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() throws java.io.IOException {
        this.zza.zzd();
    }

    public final long zzf() {
        return this.zzb;
    }

    public final android.net.Uri zzg() {
        return this.zzc;
    }

    public final java.util.Map zzh() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final java.util.Map zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zze(com.google.android.gms.internal.ads.zzin zzinVar) {
        zzinVar.getClass();
        this.zza.zze(zzinVar);
    }
}
