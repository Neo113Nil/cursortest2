package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaoo {
    private java.lang.String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private float zzk;
    private java.lang.String zzl;
    private android.text.Layout.Alignment zzo;
    private android.text.Layout.Alignment zzp;
    private com.google.android.gms.internal.ads.zzaoh zzr;
    private java.lang.String zzt;
    private java.lang.String zzu;
    private int zzf = -1;
    private int zzg = -1;
    private int zzh = -1;
    private int zzi = -1;
    private int zzj = -1;
    private int zzm = -1;
    private int zzn = -1;
    private int zzq = -1;
    private float zzs = Float.MAX_VALUE;

    public final android.text.Layout.Alignment zzA() {
        return this.zzp;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzB(android.text.Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final boolean zzC() {
        return this.zzq == 1;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzD(boolean z) {
        this.zzq = z ? 1 : 0;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaoh zzE() {
        return this.zzr;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzF(com.google.android.gms.internal.ads.zzaoh zzaohVar) {
        this.zzr = zzaohVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzG(float f) {
        this.zzk = f;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzH(int i) {
        this.zzj = i;
        return this;
    }

    public final int zzI() {
        return this.zzj;
    }

    public final float zzJ() {
        return this.zzk;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzK(java.lang.String str) {
        this.zzt = str;
        return this;
    }

    public final java.lang.String zzL() {
        return this.zzt;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzM(java.lang.String str) {
        this.zzu = str;
        return this;
    }

    public final java.lang.String zzN() {
        return this.zzu;
    }

    public final int zza() {
        int i = this.zzh;
        if (i == -1 && this.zzi == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.zzi == 1 ? 2 : 0);
    }

    public final boolean zzb() {
        return this.zzf == 1;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzc(boolean z) {
        this.zzf = z ? 1 : 0;
        return this;
    }

    public final boolean zzd() {
        return this.zzg == 1;
    }

    public final com.google.android.gms.internal.ads.zzaoo zze(boolean z) {
        this.zzg = z ? 1 : 0;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzf(boolean z) {
        this.zzh = z ? 1 : 0;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzg(boolean z) {
        this.zzi = z ? 1 : 0;
        return this;
    }

    public final java.lang.String zzh() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzi(java.lang.String str) {
        this.zza = str;
        return this;
    }

    public final int zzj() {
        if (this.zzc) {
            return this.zzb;
        }
        throw new java.lang.IllegalStateException("Font color has not been defined.");
    }

    public final com.google.android.gms.internal.ads.zzaoo zzk(int i) {
        this.zzb = i;
        this.zzc = true;
        return this;
    }

    public final boolean zzl() {
        return this.zzc;
    }

    public final int zzm() {
        if (this.zze) {
            return this.zzd;
        }
        throw new java.lang.IllegalStateException("Background color has not been defined.");
    }

    public final com.google.android.gms.internal.ads.zzaoo zzn(int i) {
        this.zzd = i;
        this.zze = true;
        return this;
    }

    public final boolean zzo() {
        return this.zze;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzp(float f) {
        this.zzs = f;
        return this;
    }

    public final float zzq() {
        return this.zzs;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzr(com.google.android.gms.internal.ads.zzaoo zzaooVar) {
        int i;
        android.text.Layout.Alignment alignment;
        android.text.Layout.Alignment alignment2;
        java.lang.String str;
        if (zzaooVar != null) {
            if (!this.zzc && zzaooVar.zzc) {
                zzk(zzaooVar.zzb);
            }
            if (this.zzh == -1) {
                this.zzh = zzaooVar.zzh;
            }
            if (this.zzi == -1) {
                this.zzi = zzaooVar.zzi;
            }
            if (this.zza == null && (str = zzaooVar.zza) != null) {
                this.zza = str;
            }
            if (this.zzf == -1) {
                this.zzf = zzaooVar.zzf;
            }
            if (this.zzg == -1) {
                this.zzg = zzaooVar.zzg;
            }
            if (this.zzn == -1) {
                this.zzn = zzaooVar.zzn;
            }
            if (this.zzo == null && (alignment2 = zzaooVar.zzo) != null) {
                this.zzo = alignment2;
            }
            if (this.zzp == null && (alignment = zzaooVar.zzp) != null) {
                this.zzp = alignment;
            }
            if (this.zzq == -1) {
                this.zzq = zzaooVar.zzq;
            }
            if (this.zzj == -1) {
                this.zzj = zzaooVar.zzj;
                this.zzk = zzaooVar.zzk;
            }
            if (this.zzr == null) {
                this.zzr = zzaooVar.zzr;
            }
            if (this.zzs == Float.MAX_VALUE) {
                this.zzs = zzaooVar.zzs;
            }
            if (this.zzt == null) {
                this.zzt = zzaooVar.zzt;
            }
            if (this.zzu == null) {
                this.zzu = zzaooVar.zzu;
            }
            if (!this.zze && zzaooVar.zze) {
                zzn(zzaooVar.zzd);
            }
            if (this.zzm == -1 && (i = zzaooVar.zzm) != -1) {
                this.zzm = i;
            }
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzs(java.lang.String str) {
        this.zzl = str;
        return this;
    }

    public final java.lang.String zzt() {
        return this.zzl;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzu(int i) {
        this.zzm = i;
        return this;
    }

    public final int zzv() {
        return this.zzm;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzw(int i) {
        this.zzn = i;
        return this;
    }

    public final int zzx() {
        return this.zzn;
    }

    public final android.text.Layout.Alignment zzy() {
        return this.zzo;
    }

    public final com.google.android.gms.internal.ads.zzaoo zzz(android.text.Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }
}
