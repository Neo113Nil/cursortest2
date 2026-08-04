package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzagk extends zzagf {
    public final String zza;
    public final zzfwh zzb;

    public zzagk(String str, String str2, List list) {
        super(str);
        zzcv.zzd(!list.isEmpty());
        this.zza = str2;
        zzfwh zzfwhVarZzl = zzfwh.zzl(list);
        this.zzb = zzfwhVarZzl;
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagk.class == obj.getClass()) {
            zzagk zzagkVar = (zzagk) obj;
            String str = this.zzf;
            String str2 = zzagkVar.zzf;
            int i7 = zzen.zza;
            if (Objects.equals(str, str2) && Objects.equals(this.zza, zzagkVar.zza) && this.zzb.equals(zzagkVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return this.zzb.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final String toString() {
        return this.zzf + ": description=" + this.zza + ": values=" + String.valueOf(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzagf, com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        switch (this.zzf) {
            case "TT2":
            case "TIT2":
                zzarVar.zzr((CharSequence) this.zzb.get(0));
                break;
            case "TP1":
            case "TPE1":
                zzarVar.zze((CharSequence) this.zzb.get(0));
                break;
            case "TP2":
            case "TPE2":
                zzarVar.zzc((CharSequence) this.zzb.get(0));
                break;
            case "TAL":
            case "TALB":
                zzarVar.zzd((CharSequence) this.zzb.get(0));
                break;
            case "TRK":
            case "TRCK":
                String str = (String) this.zzb.get(0);
                int i7 = zzen.zza;
                String[] strArrSplit = str.split("/", -1);
                try {
                    int i8 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    zzarVar.zzu(Integer.valueOf(i8));
                    zzarVar.zzt(numValueOf);
                    break;
                } catch (NumberFormatException unused) {
                    return;
                }
                break;
            case "TYE":
            case "TYER":
                try {
                    zzarVar.zzm(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
                    break;
                } catch (NumberFormatException unused2) {
                    return;
                }
                break;
            case "TDA":
            case "TDAT":
                try {
                    String str2 = (String) this.zzb.get(0);
                    int i9 = Integer.parseInt(str2.substring(2, 4));
                    int i10 = Integer.parseInt(str2.substring(0, 2));
                    zzarVar.zzl(Integer.valueOf(i9));
                    zzarVar.zzk(Integer.valueOf(i10));
                    break;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
                break;
            case "TDRC":
                List listZzb = zzb((String) this.zzb.get(0));
                int size = listZzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            zzarVar.zzk((Integer) listZzb.get(2));
                        }
                    }
                    zzarVar.zzl((Integer) listZzb.get(1));
                }
                zzarVar.zzm((Integer) listZzb.get(0));
                break;
            case "TDRL":
                List listZzb2 = zzb((String) this.zzb.get(0));
                int size2 = listZzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            zzarVar.zzn((Integer) listZzb2.get(2));
                        }
                    }
                    zzarVar.zzo((Integer) listZzb2.get(1));
                }
                zzarVar.zzp((Integer) listZzb2.get(0));
                break;
            case "TCM":
            case "TCOM":
                zzarVar.zzf((CharSequence) this.zzb.get(0));
                break;
            case "TP3":
            case "TPE3":
                zzarVar.zzg((CharSequence) this.zzb.get(0));
                break;
            case "TXT":
            case "TEXT":
                zzarVar.zzv((CharSequence) this.zzb.get(0));
                break;
            case "TCON":
                Integer numZzf = zzfzk.zzf((String) this.zzb.get(0), 10);
                if (numZzf == null) {
                    zzarVar.zzj((CharSequence) this.zzb.get(0));
                    break;
                } else {
                    String strZza = zzagg.zza(numZzf.intValue());
                    if (strZza != null) {
                        zzarVar.zzj(strZza);
                    }
                    break;
                }
                break;
        }
    }
}
