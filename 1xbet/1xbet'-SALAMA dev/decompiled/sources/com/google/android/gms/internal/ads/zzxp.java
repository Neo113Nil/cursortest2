package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzxp extends zzya implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzxt zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final boolean zzw;

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    public zzxp(int i7, zzbo zzboVar, int i8, zzxt zzxtVar, int i9, boolean z4, zzfti zzftiVar, int i10) {
        int i11;
        int iZzc;
        byte b7;
        boolean z7;
        int iZzc2;
        boolean z8;
        super(i7, zzboVar, i8);
        this.zzh = zzxtVar;
        int i12 = 1;
        int i13 = true != zzxtVar.zzP ? 16 : 24;
        this.zzg = zzyf.zzh(this.zzd.zzd);
        this.zzi = zzln.zza(i9, false);
        int i14 = 0;
        while (true) {
            int size = zzxtVar.zzp.size();
            i11 = f.API_PRIORITY_OTHER;
            if (i14 >= size) {
                iZzc = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                iZzc = zzyf.zzc(this.zzd, (String) zzxtVar.zzp.get(i14), false);
                if (iZzc > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.zzk = i14;
        this.zzj = iZzc;
        this.zzl = zzyf.zzb(this.zzd.zzf, 0);
        zzz zzzVar = this.zzd;
        int i15 = zzzVar.zzf;
        this.zzm = i15 == 0 || (i15 & 1) != 0;
        this.zzp = 1 == (zzzVar.zze & 1);
        String str = zzzVar.zzo;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2123537834) {
                if (iHashCode != 187078297) {
                    if (iHashCode == 1504698186 && str.equals("audio/iamf")) {
                        b7 = 2;
                    } else {
                        b7 = -1;
                    }
                } else if (str.equals("audio/ac4")) {
                    b7 = 1;
                } else {
                    b7 = -1;
                }
            } else if (str.equals("audio/eac3-joc")) {
                b7 = 0;
            } else {
                b7 = -1;
            }
            if (b7 == 0 || b7 == 1 || b7 == 2) {
                z7 = true;
            } else {
                z7 = false;
            }
        } else {
            z7 = false;
        }
        this.zzw = z7;
        int i16 = zzzVar.zzE;
        this.zzq = i16;
        this.zzr = zzzVar.zzF;
        int i17 = zzzVar.zzj;
        this.zzs = i17;
        this.zzf = (i17 == -1 || i17 <= zzxtVar.zzs) && (i16 == -1 || i16 <= zzxtVar.zzr) && zzftiVar.zza(zzzVar);
        int i18 = zzen.zza;
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = zzen.zza >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i19 = 0; i19 < strArrSplit.length; i19++) {
            strArrSplit[i19] = zzen.zzE(strArrSplit[i19]);
        }
        int i20 = 0;
        while (true) {
            if (i20 >= strArrSplit.length) {
                iZzc2 = 0;
                i20 = Integer.MAX_VALUE;
                break;
            } else {
                iZzc2 = zzyf.zzc(this.zzd, strArrSplit[i20], false);
                if (iZzc2 > 0) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        this.zzn = i20;
        this.zzo = iZzc2;
        for (int i21 = 0; i21 < zzxtVar.zzt.size(); i21++) {
            String str2 = this.zzd.zzo;
            if (str2 != null && str2.equals(zzxtVar.zzt.get(i21))) {
                i11 = i21;
                break;
            }
        }
        this.zzt = i11;
        this.zzu = (i9 & 384) == 128;
        this.zzv = (i9 & 64) == 64;
        zzxt zzxtVar2 = this.zzh;
        if (zzln.zza(i9, zzxtVar2.zzR) && ((z8 = this.zzf) || zzxtVar2.zzK)) {
            int i22 = zzxtVar2.zzu.zzb;
            if (zzln.zza(i9, false) && z8 && this.zzd.zzj != -1 && ((zzxtVar2.zzT || !z4) && (i9 & i13) != 0)) {
                i12 = 2;
            }
        } else {
            i12 = 0;
        }
        this.zze = i12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxp zzxpVar) {
        zzfxs zzfxsVarZza = (this.zzf && this.zzi) ? zzyf.zzc : zzyf.zzc.zza();
        zzfvw zzfvwVarZzc = zzfvw.zzj().zzd(this.zzi, zzxpVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzxpVar.zzk), zzfxs.zzc().zza()).zzb(this.zzj, zzxpVar.zzj).zzb(this.zzl, zzxpVar.zzl).zzd(this.zzp, zzxpVar.zzp).zzd(this.zzm, zzxpVar.zzm).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzxpVar.zzn), zzfxs.zzc().zza()).zzb(this.zzo, zzxpVar.zzo).zzd(this.zzf, zzxpVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzxpVar.zzt), zzfxs.zzc().zza());
        boolean z4 = this.zzh.zzB;
        zzfvw zzfvwVarZzc2 = zzfvwVarZzc.zzd(this.zzu, zzxpVar.zzu).zzd(this.zzv, zzxpVar.zzv).zzd(this.zzw, zzxpVar.zzw).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzxpVar.zzq), zzfxsVarZza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzxpVar.zzr), zzfxsVarZza);
        String str = this.zzg;
        String str2 = zzxpVar.zzg;
        int i7 = zzen.zza;
        if (Objects.equals(str, str2)) {
            zzfvwVarZzc2 = zzfvwVarZzc2.zzc(Integer.valueOf(this.zzs), Integer.valueOf(zzxpVar.zzs), zzfxsVarZza);
        }
        return zzfvwVarZzc2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final /* bridge */ /* synthetic */ boolean zzc(zzya zzyaVar) {
        String str;
        zzxp zzxpVar = (zzxp) zzyaVar;
        boolean z4 = this.zzh.zzN;
        zzz zzzVar = this.zzd;
        int i7 = zzzVar.zzE;
        if (i7 == -1) {
            return false;
        }
        zzz zzzVar2 = zzxpVar.zzd;
        if (i7 != zzzVar2.zzE || (str = zzzVar.zzo) == null || !TextUtils.equals(str, zzzVar2.zzo)) {
            return false;
        }
        boolean z7 = this.zzh.zzM;
        int i8 = this.zzd.zzF;
        return i8 != -1 && i8 == zzxpVar.zzd.zzF && this.zzu == zzxpVar.zzu && this.zzv == zzxpVar.zzv;
    }
}
