package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbd;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzagk extends zzagf {
    public final String zza;
    public final zzfwh zzb;

    public zzagk(String str, String str2, List list) {
        super(str);
        zzcv.zzd(!list.isEmpty());
        this.zza = str2;
        zzfwh zzl = zzfwh.zzl(list);
        this.zzb = zzl;
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
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return this.zzb.hashCode() + (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final String toString() {
        return this.zzf + ": description=" + this.zza + ": values=" + String.valueOf(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzagf, com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        char c3;
        String str = this.zzf;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c3 = 16;
                    break;
                }
                c3 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c3 = 18;
                    break;
                }
                c3 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c3 = 20;
                    break;
                }
                c3 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c3 = 17;
                    break;
                }
                c3 = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c3 = 22;
                    break;
                }
                c3 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c3 = 14;
                    break;
                }
                c3 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c3 = 15;
                    break;
                }
                c3 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c3 = 21;
                    break;
                }
                c3 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c3 = 19;
                    break;
                }
                c3 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c3 = 11;
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
            case 1:
                zzarVar.zzr((CharSequence) this.zzb.get(0));
                break;
            case 2:
            case 3:
                zzarVar.zze((CharSequence) this.zzb.get(0));
                break;
            case 4:
            case 5:
                zzarVar.zzc((CharSequence) this.zzb.get(0));
                break;
            case 6:
            case 7:
                zzarVar.zzd((CharSequence) this.zzb.get(0));
                break;
            case '\b':
            case '\t':
                String str2 = (String) this.zzb.get(0);
                int i7 = zzen.zza;
                String[] split = str2.split("/", -1);
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    zzarVar.zzu(Integer.valueOf(parseInt));
                    zzarVar.zzt(valueOf);
                    break;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    zzarVar.zzm(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
                    break;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    String str3 = (String) this.zzb.get(0);
                    int parseInt2 = Integer.parseInt(str3.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str3.substring(0, 2));
                    zzarVar.zzl(Integer.valueOf(parseInt2));
                    zzarVar.zzk(Integer.valueOf(parseInt3));
                    break;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List zzb = zzb((String) this.zzb.get(0));
                int size = zzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            zzarVar.zzk((Integer) zzb.get(2));
                        }
                    }
                    zzarVar.zzl((Integer) zzb.get(1));
                }
                zzarVar.zzm((Integer) zzb.get(0));
                break;
            case 15:
                List zzb2 = zzb((String) this.zzb.get(0));
                int size2 = zzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            zzarVar.zzn((Integer) zzb2.get(2));
                        }
                    }
                    zzarVar.zzo((Integer) zzb2.get(1));
                }
                zzarVar.zzp((Integer) zzb2.get(0));
                break;
            case 16:
            case 17:
                zzarVar.zzf((CharSequence) this.zzb.get(0));
                break;
            case 18:
            case 19:
                zzarVar.zzg((CharSequence) this.zzb.get(0));
                break;
            case 20:
            case zzbbd.zzt.zzm /* 21 */:
                zzarVar.zzv((CharSequence) this.zzb.get(0));
                break;
            case 22:
                Integer zzf = zzfzk.zzf((String) this.zzb.get(0), 10);
                if (zzf != null) {
                    String zza = zzagg.zza(zzf.intValue());
                    if (zza != null) {
                        zzarVar.zzj(zza);
                        break;
                    }
                } else {
                    zzarVar.zzj((CharSequence) this.zzb.get(0));
                    break;
                }
                break;
        }
    }
}
