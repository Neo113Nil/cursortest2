package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzan {
    public static final zzan zza = new zzan(new zzam());
    public final CharSequence zzA;
    public final Integer zzB;
    public final zzgxm zzC;
    public final CharSequence zzb;
    public final CharSequence zzc;
    public final CharSequence zzd;
    public final CharSequence zze;
    public final CharSequence zzf;
    public final byte[] zzg;
    public final Integer zzh;
    public final Integer zzi;
    public final Integer zzj;

    @Deprecated
    public final Integer zzk;
    public final Boolean zzl;

    @Deprecated
    public final Integer zzm;
    public final Integer zzn;
    public final Integer zzo;
    public final Integer zzp;
    public final Integer zzq;
    public final Integer zzr;
    public final Integer zzs;
    public final CharSequence zzt;
    public final CharSequence zzu;
    public final CharSequence zzv;
    public final CharSequence zzw;
    public final Integer zzx;
    public final Integer zzy;
    public final CharSequence zzz;

    static {
        String str = zzfm.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(1000, 36);
    }

    private zzan(zzam zzamVar) {
        Boolean zzI = zzamVar.zzI();
        Integer zzX = zzamVar.zzX();
        Integer zzH = zzamVar.zzH();
        int i = 1;
        int i2 = 0;
        if (zzI != null) {
            if (!zzI.booleanValue()) {
                zzH = -1;
            } else if (zzH == null || zzH.intValue() == -1) {
                if (zzX != null) {
                    switch (zzX.intValue()) {
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    zzH = Integer.valueOf(i);
                }
                i = 0;
                zzH = Integer.valueOf(i);
            }
        } else if (zzH != null) {
            zzI = Boolean.valueOf(zzH.intValue() != -1);
            if (zzI.booleanValue() && zzX == null) {
                switch (zzH.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                zzX = Integer.valueOf(i2);
            }
        } else {
            zzH = null;
        }
        this.zzb = zzamVar.zzy();
        this.zzc = zzamVar.zzz();
        this.zzd = zzamVar.zzA();
        this.zze = zzamVar.zzB();
        this.zzf = zzamVar.zzC();
        this.zzg = zzamVar.zzD();
        this.zzh = zzamVar.zzE();
        this.zzi = zzamVar.zzF();
        this.zzj = zzamVar.zzG();
        this.zzk = zzH;
        this.zzl = zzI;
        this.zzm = zzamVar.zzJ();
        this.zzn = zzamVar.zzJ();
        this.zzo = zzamVar.zzK();
        this.zzp = zzamVar.zzL();
        this.zzq = zzamVar.zzM();
        this.zzr = zzamVar.zzN();
        this.zzs = zzamVar.zzO();
        this.zzt = zzamVar.zzP();
        this.zzu = zzamVar.zzQ();
        this.zzv = zzamVar.zzR();
        this.zzw = zzamVar.zzS();
        this.zzx = zzamVar.zzT();
        this.zzy = zzamVar.zzU();
        this.zzz = zzamVar.zzV();
        this.zzA = zzamVar.zzW();
        this.zzB = zzX;
        this.zzC = zzamVar.zzY();
    }

    /* synthetic */ zzan(zzam zzamVar, byte[] bArr) {
        this(zzamVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzan zzanVar = (zzan) obj;
            if (TextUtils.equals(this.zzb, zzanVar.zzb) && TextUtils.equals(this.zzc, zzanVar.zzc) && TextUtils.equals(this.zzd, zzanVar.zzd) && TextUtils.equals(this.zze, zzanVar.zze) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.zzf, zzanVar.zzf) && Objects.equals(null, null) && Objects.equals(null, null) && Objects.equals(null, null) && Arrays.equals(this.zzg, zzanVar.zzg) && Objects.equals(this.zzh, zzanVar.zzh) && Objects.equals(null, null) && Objects.equals(this.zzi, zzanVar.zzi) && Objects.equals(this.zzj, zzanVar.zzj) && Objects.equals(this.zzk, zzanVar.zzk) && Objects.equals(this.zzl, zzanVar.zzl) && Objects.equals(null, null) && Objects.equals(this.zzn, zzanVar.zzn) && Objects.equals(this.zzo, zzanVar.zzo) && Objects.equals(this.zzp, zzanVar.zzp) && Objects.equals(this.zzq, zzanVar.zzq) && Objects.equals(this.zzr, zzanVar.zzr) && Objects.equals(this.zzs, zzanVar.zzs) && TextUtils.equals(this.zzt, zzanVar.zzt) && TextUtils.equals(this.zzu, zzanVar.zzu) && TextUtils.equals(this.zzv, zzanVar.zzv) && TextUtils.equals(this.zzw, zzanVar.zzw) && Objects.equals(this.zzx, zzanVar.zzx) && Objects.equals(this.zzy, zzanVar.zzy) && TextUtils.equals(this.zzz, zzanVar.zzz) && TextUtils.equals(null, null) && TextUtils.equals(this.zzA, zzanVar.zzA) && Objects.equals(this.zzB, zzanVar.zzB) && Objects.equals(this.zzC, zzanVar.zzC)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, this.zzc, this.zzd, this.zze, null, null, this.zzf, null, null, null, Integer.valueOf(Arrays.hashCode(this.zzg)), this.zzh, null, this.zzi, this.zzj, this.zzk, this.zzl, null, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, null, this.zzA, this.zzB, true, this.zzC);
    }

    public final zzam zza() {
        return new zzam(this, null);
    }
}
