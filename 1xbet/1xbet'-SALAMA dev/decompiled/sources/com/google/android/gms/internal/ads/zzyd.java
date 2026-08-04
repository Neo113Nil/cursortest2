package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzyd extends zzya {
    private final boolean zze;
    private final zzxt zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final boolean zzs;
    private final boolean zzt;
    private final int zzu;

    /* JADX WARN: Code duplicated, block: B:120:0x0174  */
    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX WARN: Code duplicated, block: B:33:0x004d  */
    /* JADX WARN: Code duplicated, block: B:88:0x011a  */
    public zzyd(int i7, zzbo zzboVar, int i8, zzxt zzxtVar, int i9, String str, int i10, boolean z4) {
        boolean z7;
        boolean z8;
        int i11;
        int iZzc;
        int i12;
        byte b7;
        boolean z9;
        zzz zzzVar;
        int i13;
        int i14;
        int i15;
        zzz zzzVar2;
        int i16;
        int i17;
        int i18;
        super(i7, zzboVar, i8);
        this.zzf = zzxtVar;
        int i19 = 1;
        int i20 = true != zzxtVar.zzI ? 16 : 24;
        if (!z4 || (((i16 = (zzzVar2 = this.zzd).zzv) != -1 && i16 > zzxtVar.zza) || ((i17 = zzzVar2.zzw) != -1 && i17 > zzxtVar.zzb))) {
            z7 = false;
        } else {
            float f7 = zzzVar2.zzx;
            if ((f7 == -1.0f || f7 <= zzxtVar.zzc) && ((i18 = zzzVar2.zzj) == -1 || i18 <= zzxtVar.zzd)) {
                z7 = true;
            } else {
                z7 = false;
            }
        }
        this.zze = z7;
        if (!z4 || (((i13 = (zzzVar = this.zzd).zzv) != -1 && i13 < 0) || ((i14 = zzzVar.zzw) != -1 && i14 < 0))) {
            z8 = false;
        } else {
            float f8 = zzzVar.zzx;
            if ((f8 == -1.0f || f8 >= 0.0f) && ((i15 = zzzVar.zzj) == -1 || i15 >= 0)) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        this.zzg = z8;
        this.zzh = zzln.zza(i9, false);
        zzz zzzVar3 = this.zzd;
        float f9 = zzzVar3.zzx;
        this.zzi = f9 != -1.0f && f9 >= 10.0f;
        this.zzj = zzzVar3.zzj;
        this.zzk = zzzVar3.zza();
        int i21 = 0;
        while (true) {
            int size = zzxtVar.zzn.size();
            i11 = f.API_PRIORITY_OTHER;
            if (i21 >= size) {
                iZzc = 0;
                i21 = Integer.MAX_VALUE;
                break;
            } else {
                iZzc = zzyf.zzc(this.zzd, (String) zzxtVar.zzn.get(i21), false);
                if (iZzc > 0) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        this.zzm = i21;
        this.zzn = iZzc;
        this.zzo = zzyf.zzb(this.zzd.zzf, 0);
        int i22 = this.zzd.zzf;
        this.zzp = i22 == 0 || (i22 & 1) != 0;
        this.zzq = zzyf.zzc(this.zzd, str, zzyf.zzh(str) == null);
        for (int i23 = 0; i23 < zzxtVar.zzm.size(); i23++) {
            String str2 = this.zzd.zzo;
            if (str2 != null && str2.equals(zzxtVar.zzm.get(i23))) {
                i11 = i23;
                break;
            }
        }
        this.zzl = i11;
        this.zzs = (i9 & 384) == 128;
        this.zzt = (i9 & 64) == 64;
        zzz zzzVar4 = this.zzd;
        String str3 = zzzVar4.zzo;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    b7 = 0;
                    break;
                case "video/av01":
                    b7 = 1;
                    break;
                case "video/hevc":
                    b7 = 2;
                    break;
                case "video/avc":
                    b7 = 4;
                    break;
                case "video/x-vnd.on2.vp9":
                    b7 = 3;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            if (b7 == 0) {
                i12 = 5;
            } else if (b7 != 1) {
                if (b7 == 2) {
                    i12 = 3;
                } else if (b7 == 3) {
                    i12 = 2;
                } else if (b7 != 4) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
            }
        }
        this.zzu = i12;
        if ((zzzVar4.zzf & 16384) != 0) {
            i19 = 0;
        } else {
            zzxt zzxtVar2 = this.zzf;
            if (!zzln.zza(i9, zzxtVar2.zzR) || (!(z9 = this.zze) && !zzxtVar2.zzG)) {
                i19 = 0;
            } else if (zzln.zza(i9, false) && this.zzg && z9 && zzzVar4.zzj != -1 && (i20 & i9) != 0) {
                i19 = 2;
            }
        }
        this.zzr = i19;
    }

    public static /* synthetic */ int zza(zzyd zzydVar, zzyd zzydVar2) {
        zzfxs zzfxsVarZza = (zzydVar.zze && zzydVar.zzh) ? zzyf.zzc : zzyf.zzc.zza();
        zzfvw zzfvwVarZzj = zzfvw.zzj();
        boolean z4 = zzydVar.zzf.zzB;
        return zzfvwVarZzj.zzc(Integer.valueOf(zzydVar.zzk), Integer.valueOf(zzydVar2.zzk), zzfxsVarZza).zzc(Integer.valueOf(zzydVar.zzj), Integer.valueOf(zzydVar2.zzj), zzfxsVarZza).zza();
    }

    public static /* synthetic */ int zzd(zzyd zzydVar, zzyd zzydVar2) {
        zzfvw zzfvwVarZzd = zzfvw.zzj().zzd(zzydVar.zzh, zzydVar2.zzh).zzc(Integer.valueOf(zzydVar.zzm), Integer.valueOf(zzydVar2.zzm), zzfxs.zzc().zza()).zzb(zzydVar.zzn, zzydVar2.zzn).zzb(zzydVar.zzo, zzydVar2.zzo).zzd(zzydVar.zzp, zzydVar2.zzp).zzb(zzydVar.zzq, zzydVar2.zzq).zzd(zzydVar.zzi, zzydVar2.zzi).zzd(zzydVar.zze, zzydVar2.zze).zzd(zzydVar.zzg, zzydVar2.zzg).zzc(Integer.valueOf(zzydVar.zzl), Integer.valueOf(zzydVar2.zzl), zzfxs.zzc().zza()).zzd(zzydVar.zzs, zzydVar2.zzs).zzd(zzydVar.zzt, zzydVar2.zzt);
        if (zzydVar.zzs && zzydVar.zzt) {
            zzfvwVarZzd = zzfvwVarZzd.zzb(zzydVar.zzu, zzydVar2.zzu);
        }
        return zzfvwVarZzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final int zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final /* bridge */ /* synthetic */ boolean zzc(zzya zzyaVar) {
        zzyd zzydVar = (zzyd) zzyaVar;
        String str = this.zzd.zzo;
        String str2 = zzydVar.zzd.zzo;
        int i7 = zzen.zza;
        if (!Objects.equals(str, str2)) {
            return false;
        }
        boolean z4 = this.zzf.zzJ;
        return this.zzs == zzydVar.zzs && this.zzt == zzydVar.zzt;
    }
}
