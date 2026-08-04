package com.google.android.gms.internal.ads;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
final class zzakv {
    private String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private float zzk;
    private String zzl;
    private Layout.Alignment zzo;
    private Layout.Alignment zzp;
    private zzako zzr;
    private String zzt;
    private String zzu;
    private int zzf = -1;
    private int zzg = -1;
    private int zzh = -1;
    private int zzi = -1;
    private int zzj = -1;
    private int zzm = -1;
    private int zzn = -1;
    private int zzq = -1;
    private float zzs = Float.MAX_VALUE;

    public final zzakv zzA(float f7) {
        this.zzs = f7;
        return this;
    }

    public final zzakv zzB(Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }

    public final zzakv zzC(boolean z4) {
        this.zzq = z4 ? 1 : 0;
        return this;
    }

    public final zzakv zzD(zzako zzakoVar) {
        this.zzr = zzakoVar;
        return this;
    }

    public final zzakv zzE(boolean z4) {
        this.zzg = z4 ? 1 : 0;
        return this;
    }

    public final String zzF() {
        return this.zzu;
    }

    public final String zzG() {
        return this.zza;
    }

    public final String zzH() {
        return this.zzl;
    }

    public final String zzI() {
        return this.zzt;
    }

    public final boolean zzJ() {
        return this.zzq == 1;
    }

    public final boolean zzK() {
        return this.zze;
    }

    public final boolean zzL() {
        return this.zzc;
    }

    public final boolean zzM() {
        return this.zzf == 1;
    }

    public final boolean zzN() {
        return this.zzg == 1;
    }

    public final float zza() {
        return this.zzk;
    }

    public final float zzb() {
        return this.zzs;
    }

    public final int zzc() {
        if (this.zze) {
            return this.zzd;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final int zzd() {
        if (this.zzc) {
            return this.zzb;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final int zze() {
        return this.zzj;
    }

    public final int zzf() {
        return this.zzn;
    }

    public final int zzg() {
        return this.zzm;
    }

    public final int zzh() {
        int i7 = this.zzh;
        if (i7 == -1 && this.zzi == -1) {
            return -1;
        }
        return (i7 == 1 ? 1 : 0) | (this.zzi == 1 ? 2 : 0);
    }

    public final Layout.Alignment zzi() {
        return this.zzp;
    }

    public final Layout.Alignment zzj() {
        return this.zzo;
    }

    public final zzako zzk() {
        return this.zzr;
    }

    public final zzakv zzl(zzakv zzakvVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzakvVar != null) {
            if (!this.zzc && zzakvVar.zzc) {
                zzp(zzakvVar.zzb);
            }
            if (this.zzh == -1) {
                this.zzh = zzakvVar.zzh;
            }
            if (this.zzi == -1) {
                this.zzi = zzakvVar.zzi;
            }
            if (this.zza == null && (str = zzakvVar.zza) != null) {
                this.zza = str;
            }
            if (this.zzf == -1) {
                this.zzf = zzakvVar.zzf;
            }
            if (this.zzg == -1) {
                this.zzg = zzakvVar.zzg;
            }
            if (this.zzn == -1) {
                this.zzn = zzakvVar.zzn;
            }
            if (this.zzo == null && (alignment2 = zzakvVar.zzo) != null) {
                this.zzo = alignment2;
            }
            if (this.zzp == null && (alignment = zzakvVar.zzp) != null) {
                this.zzp = alignment;
            }
            if (this.zzq == -1) {
                this.zzq = zzakvVar.zzq;
            }
            if (this.zzj == -1) {
                this.zzj = zzakvVar.zzj;
                this.zzk = zzakvVar.zzk;
            }
            if (this.zzr == null) {
                this.zzr = zzakvVar.zzr;
            }
            if (this.zzs == Float.MAX_VALUE) {
                this.zzs = zzakvVar.zzs;
            }
            if (this.zzt == null) {
                this.zzt = zzakvVar.zzt;
            }
            if (this.zzu == null) {
                this.zzu = zzakvVar.zzu;
            }
            if (!this.zze && zzakvVar.zze) {
                zzm(zzakvVar.zzd);
            }
            if (this.zzm == -1 && (i7 = zzakvVar.zzm) != -1) {
                this.zzm = i7;
            }
        }
        return this;
    }

    public final zzakv zzm(int i7) {
        this.zzd = i7;
        this.zze = true;
        return this;
    }

    public final zzakv zzn(boolean z4) {
        this.zzh = z4 ? 1 : 0;
        return this;
    }

    public final zzakv zzo(String str) {
        this.zzu = str;
        return this;
    }

    public final zzakv zzp(int i7) {
        this.zzb = i7;
        this.zzc = true;
        return this;
    }

    public final zzakv zzq(String str) {
        this.zza = str;
        return this;
    }

    public final zzakv zzr(float f7) {
        this.zzk = f7;
        return this;
    }

    public final zzakv zzs(int i7) {
        this.zzj = i7;
        return this;
    }

    public final zzakv zzt(String str) {
        this.zzl = str;
        return this;
    }

    public final zzakv zzu(boolean z4) {
        this.zzi = z4 ? 1 : 0;
        return this;
    }

    public final zzakv zzv(boolean z4) {
        this.zzf = z4 ? 1 : 0;
        return this;
    }

    public final zzakv zzw(Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final zzakv zzx(String str) {
        this.zzt = str;
        return this;
    }

    public final zzakv zzy(int i7) {
        this.zzn = i7;
        return this;
    }

    public final zzakv zzz(int i7) {
        this.zzm = i7;
        return this;
    }
}
