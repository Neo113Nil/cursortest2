package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzaab extends zzaau implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzaaq zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    /* JADX WARN: Removed duplicated region for block: B:100:0x00b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100 A[LOOP:1: B:28:0x00fd->B:30:0x0100, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143 A[EDGE_INSN: B:80:0x0143->B:48:0x0143 BREAK  A[LOOP:3: B:40:0x0124->B:78:0x0140], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaab(int i, zzbg zzbgVar, int i2, zzaaq zzaaqVar, int i3, boolean z, zzgul zzgulVar, int i4) {
        super(i, zzbgVar, i2);
        int i5;
        int i6;
        char c;
        boolean z2;
        int i7;
        String[] split;
        int i8;
        int i9;
        int i10;
        int i11;
        zzaaq zzaaqVar2;
        boolean z3;
        this.zzh = zzaaqVar;
        int i12 = 1;
        int i13 = true != zzaaqVar.zzT ? 16 : 24;
        boolean z4 = zzaaqVar.zzP;
        this.zzg = zzabc.zzi(this.zzd.zzd);
        this.zzi = zzng.zzad(i3, false);
        int i14 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i14 >= zzaaqVar.zzq.size()) {
                i6 = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = zzabc.zzj(this.zzd, (String) zzaaqVar.zzq.get(i14), false);
                if (i6 > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.zzk = i14;
        this.zzj = i6;
        int i15 = this.zzd.zzf;
        int i16 = zzaaqVar.zzs;
        this.zzl = zzabc.zzm(i15, 0);
        this.zzm = zzabc.zzn(this.zzd, zzaaqVar.zzr);
        zzv zzvVar = this.zzd;
        int i17 = zzvVar.zzf;
        this.zzn = i17 == 0 || (i17 & 1) != 0;
        this.zzq = 1 == (zzvVar.zze & 1);
        String str = zzvVar.zzp;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode == -2123537834) {
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            } else if (hashCode != 187078297) {
                if (hashCode == 1504698186 && str.equals("audio/iamf")) {
                    c = 2;
                    z2 = (c != 0 || c == 1 || c == 2) ? true : z2;
                }
                c = 65535;
                if (c != 0) {
                }
            } else {
                if (str.equals("audio/ac4")) {
                    c = 1;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            }
            this.zzx = z2;
            this.zzr = zzvVar.zzI;
            this.zzs = zzvVar.zzK;
            this.zzt = zzvVar.zzj;
            int i18 = zzvVar.zzj;
            this.zzf = (i18 != -1 || i18 <= zzaaqVar.zzu) && ((i7 = zzvVar.zzI) == -1 || i7 <= zzaaqVar.zzt) && zzgulVar.zza(zzvVar);
            String str2 = zzfm.zza;
            split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
            for (i8 = 0; i8 < split.length; i8++) {
                split[i8] = zzfm.zzi(split[i8]);
            }
            i9 = 0;
            while (true) {
                if (i9 < split.length) {
                    i10 = 0;
                    i9 = Integer.MAX_VALUE;
                    break;
                } else {
                    i10 = zzabc.zzj(this.zzd, split[i9], false);
                    if (i10 > 0) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.zzo = i9;
            this.zzp = i10;
            i11 = 0;
            while (true) {
                if (i11 >= zzaaqVar.zzv.size()) {
                    break;
                }
                String str3 = this.zzd.zzp;
                if (str3 != null && str3.equals(zzaaqVar.zzv.get(i11))) {
                    i5 = i11;
                    break;
                }
                i11++;
            }
            this.zzu = i5;
            this.zzv = (i3 & 384) != 128;
            this.zzw = (i3 & 64) != 64;
            zzaaqVar2 = this.zzh;
            if (zzng.zzad(i3, zzaaqVar2.zzV) && ((z3 = this.zzf) || zzaaqVar2.zzO)) {
                int i19 = zzaaqVar2.zzw.zzb;
                if (zzng.zzad(i3, false) && z3 && this.zzd.zzj != -1) {
                    boolean z5 = zzaaqVar2.zzG;
                    boolean z6 = zzaaqVar2.zzF;
                    if ((!zzaaqVar2.zzX || !z) && (i13 & i3) != 0) {
                        i12 = 2;
                    }
                }
            } else {
                i12 = 0;
            }
            this.zze = i12;
        }
        z2 = false;
        this.zzx = z2;
        this.zzr = zzvVar.zzI;
        this.zzs = zzvVar.zzK;
        this.zzt = zzvVar.zzj;
        int i182 = zzvVar.zzj;
        this.zzf = (i182 != -1 || i182 <= zzaaqVar.zzu) && ((i7 = zzvVar.zzI) == -1 || i7 <= zzaaqVar.zzt) && zzgulVar.zza(zzvVar);
        String str22 = zzfm.zza;
        split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        while (i8 < split.length) {
        }
        i9 = 0;
        while (true) {
            if (i9 < split.length) {
            }
            i9++;
        }
        this.zzo = i9;
        this.zzp = i10;
        i11 = 0;
        while (true) {
            if (i11 >= zzaaqVar.zzv.size()) {
            }
            i11++;
        }
        this.zzu = i5;
        this.zzv = (i3 & 384) != 128;
        this.zzw = (i3 & 64) != 64;
        zzaaqVar2 = this.zzh;
        if (zzng.zzad(i3, zzaaqVar2.zzV)) {
            int i192 = zzaaqVar2.zzw.zzb;
            if (zzng.zzad(i3, false)) {
                boolean z52 = zzaaqVar2.zzG;
                boolean z62 = zzaaqVar2.zzF;
                if (!zzaaqVar2.zzX) {
                }
                i12 = 2;
            }
            this.zze = i12;
        }
        i12 = 0;
        this.zze = i12;
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaab zzaabVar) {
        zzgzg zzgzgVar;
        zzgzg zza;
        boolean z = this.zzf;
        if (z && this.zzi) {
            zza = zzabc.zzc;
        } else {
            zzgzgVar = zzabc.zzc;
            zza = zzgzgVar.zza();
        }
        zzgwz zza2 = zzgwz.zzg().zzd(this.zzi, zzaabVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzaabVar.zzk), zzgzg.zzb().zza()).zzb(this.zzj, zzaabVar.zzj).zzb(this.zzl, zzaabVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzaabVar.zzm), zzgzg.zzb().zza()).zzd(this.zzq, zzaabVar.zzq).zzd(this.zzn, zzaabVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzaabVar.zzo), zzgzg.zzb().zza()).zzb(this.zzp, zzaabVar.zzp).zzd(z, zzaabVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzaabVar.zzu), zzgzg.zzb().zza());
        boolean z2 = this.zzh.zzF;
        zzgwz zza3 = zza2.zzd(this.zzv, zzaabVar.zzv).zzd(this.zzw, zzaabVar.zzw).zzd(this.zzx, zzaabVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzaabVar.zzr), zza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzaabVar.zzs), zza);
        if (Objects.equals(this.zzg, zzaabVar.zzg)) {
            zza3 = zza3.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzaabVar.zzt), zza);
        }
        return zza3.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final /* bridge */ /* synthetic */ boolean zzc(zzaau zzaauVar) {
        String str;
        zzaaq zzaaqVar = this.zzh;
        zzaab zzaabVar = (zzaab) zzaauVar;
        boolean z = zzaaqVar.zzR;
        zzv zzvVar = this.zzd;
        int i = zzvVar.zzI;
        if (i == -1) {
            return false;
        }
        zzv zzvVar2 = zzaabVar.zzd;
        if (i != zzvVar2.zzI || (str = zzvVar.zzp) == null || !TextUtils.equals(str, zzvVar2.zzp)) {
            return false;
        }
        boolean z2 = zzaaqVar.zzQ;
        int i2 = zzvVar.zzK;
        if (i2 == -1 || i2 != zzvVar2.zzK) {
            return false;
        }
        boolean z3 = zzaaqVar.zzS;
        return this.zzv == zzaabVar.zzv && this.zzw == zzaabVar.zzw;
    }
}
