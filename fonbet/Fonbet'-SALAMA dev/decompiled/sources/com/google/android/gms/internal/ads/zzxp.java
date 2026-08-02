package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import java.util.Objects;

/* loaded from: classes.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0105 A[LOOP:1: B:31:0x0102->B:33:0x0105, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145 A[EDGE_INSN: B:83:0x0145->B:51:0x0145 BREAK  A[LOOP:3: B:43:0x0127->B:81:0x0143], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzxp(int i7, zzbo zzboVar, int i8, zzxt zzxtVar, int i9, boolean z4, zzfti zzftiVar, int i10) {
        super(i7, zzboVar, i8);
        int i11;
        int i12;
        char c3;
        boolean z7;
        String[] split;
        int i13;
        int i14;
        int i15;
        int i16;
        zzxt zzxtVar2;
        boolean z8;
        this.zzh = zzxtVar;
        int i17 = 1;
        int i18 = true != zzxtVar.zzP ? 16 : 24;
        this.zzg = zzyf.zzh(this.zzd.zzd);
        this.zzi = zzln.zza(i9, false);
        int i19 = 0;
        while (true) {
            int size = zzxtVar.zzp.size();
            i11 = f.API_PRIORITY_OTHER;
            if (i19 >= size) {
                i12 = 0;
                i19 = Integer.MAX_VALUE;
                break;
            } else {
                i12 = zzyf.zzc(this.zzd, (String) zzxtVar.zzp.get(i19), false);
                if (i12 > 0) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        this.zzk = i19;
        this.zzj = i12;
        this.zzl = zzyf.zzb(this.zzd.zzf, 0);
        zzz zzzVar = this.zzd;
        int i20 = zzzVar.zzf;
        this.zzm = i20 == 0 || (i20 & 1) != 0;
        this.zzp = 1 == (zzzVar.zze & 1);
        String str = zzzVar.zzo;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode == -2123537834) {
                if (str.equals("audio/eac3-joc")) {
                    c3 = 0;
                    if (c3 != 0) {
                    }
                }
                c3 = 65535;
                if (c3 != 0) {
                }
            } else if (hashCode != 187078297) {
                if (hashCode == 1504698186 && str.equals("audio/iamf")) {
                    c3 = 2;
                    z7 = (c3 != 0 || c3 == 1 || c3 == 2) ? true : z7;
                }
                c3 = 65535;
                if (c3 != 0) {
                }
            } else {
                if (str.equals("audio/ac4")) {
                    c3 = 1;
                    if (c3 != 0) {
                    }
                }
                c3 = 65535;
                if (c3 != 0) {
                }
            }
            this.zzw = z7;
            int i21 = zzzVar.zzE;
            this.zzq = i21;
            this.zzr = zzzVar.zzF;
            int i22 = zzzVar.zzj;
            this.zzs = i22;
            this.zzf = (i22 != -1 || i22 <= zzxtVar.zzs) && (i21 == -1 || i21 <= zzxtVar.zzr) && zzftiVar.zza(zzzVar);
            int i23 = zzen.zza;
            Configuration configuration = Resources.getSystem().getConfiguration();
            split = zzen.zza < 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
            for (i13 = 0; i13 < split.length; i13++) {
                split[i13] = zzen.zzE(split[i13]);
            }
            i14 = 0;
            while (true) {
                if (i14 < split.length) {
                    i15 = 0;
                    i14 = Integer.MAX_VALUE;
                    break;
                } else {
                    i15 = zzyf.zzc(this.zzd, split[i14], false);
                    if (i15 > 0) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.zzn = i14;
            this.zzo = i15;
            i16 = 0;
            while (true) {
                if (i16 >= zzxtVar.zzt.size()) {
                    break;
                }
                String str2 = this.zzd.zzo;
                if (str2 != null && str2.equals(zzxtVar.zzt.get(i16))) {
                    i11 = i16;
                    break;
                }
                i16++;
            }
            this.zzt = i11;
            this.zzu = (i9 & 384) != 128;
            this.zzv = (i9 & 64) != 64;
            zzxtVar2 = this.zzh;
            if (zzln.zza(i9, zzxtVar2.zzR) && ((z8 = this.zzf) || zzxtVar2.zzK)) {
                int i24 = zzxtVar2.zzu.zzb;
                if (zzln.zza(i9, false) && z8 && this.zzd.zzj != -1 && ((zzxtVar2.zzT || !z4) && (i9 & i18) != 0)) {
                    i17 = 2;
                }
            } else {
                i17 = 0;
            }
            this.zze = i17;
        }
        z7 = false;
        this.zzw = z7;
        int i212 = zzzVar.zzE;
        this.zzq = i212;
        this.zzr = zzzVar.zzF;
        int i222 = zzzVar.zzj;
        this.zzs = i222;
        this.zzf = (i222 != -1 || i222 <= zzxtVar.zzs) && (i212 == -1 || i212 <= zzxtVar.zzr) && zzftiVar.zza(zzzVar);
        int i232 = zzen.zza;
        Configuration configuration2 = Resources.getSystem().getConfiguration();
        if (zzen.zza < 24) {
        }
        while (i13 < split.length) {
        }
        i14 = 0;
        while (true) {
            if (i14 < split.length) {
            }
            i14++;
        }
        this.zzn = i14;
        this.zzo = i15;
        i16 = 0;
        while (true) {
            if (i16 >= zzxtVar.zzt.size()) {
            }
            i16++;
        }
        this.zzt = i11;
        this.zzu = (i9 & 384) != 128;
        this.zzv = (i9 & 64) != 64;
        zzxtVar2 = this.zzh;
        if (zzln.zza(i9, zzxtVar2.zzR)) {
            int i242 = zzxtVar2.zzu.zzb;
            if (zzln.zza(i9, false)) {
                i17 = 2;
            }
            this.zze = i17;
        }
        i17 = 0;
        this.zze = i17;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxp zzxpVar) {
        zzfxs zzfxsVar;
        zzfxs zza;
        if (this.zzf && this.zzi) {
            zza = zzyf.zzc;
        } else {
            zzfxsVar = zzyf.zzc;
            zza = zzfxsVar.zza();
        }
        zzfvw zzc = zzfvw.zzj().zzd(this.zzi, zzxpVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzxpVar.zzk), zzfxs.zzc().zza()).zzb(this.zzj, zzxpVar.zzj).zzb(this.zzl, zzxpVar.zzl).zzd(this.zzp, zzxpVar.zzp).zzd(this.zzm, zzxpVar.zzm).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzxpVar.zzn), zzfxs.zzc().zza()).zzb(this.zzo, zzxpVar.zzo).zzd(this.zzf, zzxpVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzxpVar.zzt), zzfxs.zzc().zza());
        boolean z4 = this.zzh.zzB;
        zzfvw zzc2 = zzc.zzd(this.zzu, zzxpVar.zzu).zzd(this.zzv, zzxpVar.zzv).zzd(this.zzw, zzxpVar.zzw).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzxpVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzxpVar.zzr), zza);
        String str = this.zzg;
        String str2 = zzxpVar.zzg;
        int i7 = zzen.zza;
        if (Objects.equals(str, str2)) {
            zzc2 = zzc2.zzc(Integer.valueOf(this.zzs), Integer.valueOf(zzxpVar.zzs), zza);
        }
        return zzc2.zza();
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
