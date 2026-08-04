package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class zzafu implements zzau {
    public final String zza;
    public final String zzb;

    public zzafu(String str, String str2) {
        this.zza = zzfsn.zzb(str);
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafu zzafuVar = (zzafu) obj;
            if (this.zza.equals(zzafuVar.zza) && this.zzb.equals(zzafuVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        return this.zzb.hashCode() + (iHashCode * 31);
    }

    public final String toString() {
        return "VC: " + this.zza + "=" + this.zzb;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        switch (this.zza) {
            case "TITLE":
                zzarVar.zzr(this.zzb);
                break;
            case "ARTIST":
                zzarVar.zze(this.zzb);
                break;
            case "ALBUM":
                zzarVar.zzd(this.zzb);
                break;
            case "ALBUMARTIST":
                zzarVar.zzc(this.zzb);
                break;
            case "TRACKNUMBER":
                Integer numZzf = zzfzk.zzf(this.zzb, 10);
                if (numZzf != null) {
                    zzarVar.zzu(numZzf);
                    break;
                }
                break;
            case "TOTALTRACKS":
                Integer numZzf2 = zzfzk.zzf(this.zzb, 10);
                if (numZzf2 != null) {
                    zzarVar.zzt(numZzf2);
                    break;
                }
                break;
            case "DISCNUMBER":
                Integer numZzf3 = zzfzk.zzf(this.zzb, 10);
                if (numZzf3 != null) {
                    zzarVar.zzi(numZzf3);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numZzf4 = zzfzk.zzf(this.zzb, 10);
                if (numZzf4 != null) {
                    zzarVar.zzs(numZzf4);
                    break;
                }
                break;
            case "GENRE":
                zzarVar.zzj(this.zzb);
                break;
            case "DESCRIPTION":
                zzarVar.zzh(this.zzb);
                break;
        }
    }
}
