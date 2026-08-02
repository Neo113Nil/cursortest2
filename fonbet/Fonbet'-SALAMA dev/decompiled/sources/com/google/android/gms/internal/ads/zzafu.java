package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes.dex */
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
        int hashCode = this.zza.hashCode() + 527;
        return this.zzb.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "VC: " + this.zza + "=" + this.zzb;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        char c3;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                zzarVar.zzr(this.zzb);
                break;
            case 1:
                zzarVar.zze(this.zzb);
                break;
            case 2:
                zzarVar.zzd(this.zzb);
                break;
            case 3:
                zzarVar.zzc(this.zzb);
                break;
            case 4:
                Integer zzf = zzfzk.zzf(this.zzb, 10);
                if (zzf != null) {
                    zzarVar.zzu(zzf);
                    break;
                }
                break;
            case 5:
                Integer zzf2 = zzfzk.zzf(this.zzb, 10);
                if (zzf2 != null) {
                    zzarVar.zzt(zzf2);
                    break;
                }
                break;
            case 6:
                Integer zzf3 = zzfzk.zzf(this.zzb, 10);
                if (zzf3 != null) {
                    zzarVar.zzi(zzf3);
                    break;
                }
                break;
            case 7:
                Integer zzf4 = zzfzk.zzf(this.zzb, 10);
                if (zzf4 != null) {
                    zzarVar.zzs(zzf4);
                    break;
                }
                break;
            case '\b':
                zzarVar.zzj(this.zzb);
                break;
            case '\t':
                zzarVar.zzh(this.zzb);
                break;
        }
    }
}
