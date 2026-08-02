package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import e1.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzz {
    public static final /* synthetic */ int zzM = 0;
    public final byte[] zzA;
    public final int zzB;
    public final zzk zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    public final int zzI;
    public final int zzJ;
    public final int zzK;
    public final int zzL;
    private int zzN;
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final String zzk;
    public final zzav zzl;
    public final Object zzm;
    public final String zzn;
    public final String zzo;
    public final int zzp;
    public final int zzq;
    public final List zzr;
    public final zzs zzs;
    public final long zzt;
    public final boolean zzu;
    public final int zzv;
    public final int zzw;
    public final float zzx;
    public final int zzy;
    public final float zzz;

    static {
        new zzz(new zzx());
        int i7 = zzen.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
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
    }

    public final boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzz.class == obj.getClass()) {
            zzz zzzVar = (zzz) obj;
            int i8 = this.zzN;
            if ((i8 == 0 || (i7 = zzzVar.zzN) == 0 || i8 == i7) && this.zze == zzzVar.zze && this.zzf == zzzVar.zzf && this.zzg == zzzVar.zzg && this.zzh == zzzVar.zzh && this.zzi == zzzVar.zzi && this.zzp == zzzVar.zzp && this.zzt == zzzVar.zzt && this.zzv == zzzVar.zzv && this.zzw == zzzVar.zzw && this.zzy == zzzVar.zzy && this.zzB == zzzVar.zzB && this.zzD == zzzVar.zzD && this.zzE == zzzVar.zzE && this.zzF == zzzVar.zzF && this.zzG == zzzVar.zzG && this.zzH == zzzVar.zzH && this.zzI == zzzVar.zzI && this.zzJ == zzzVar.zzJ && this.zzL == zzzVar.zzL && Float.compare(this.zzx, zzzVar.zzx) == 0 && Float.compare(this.zzz, zzzVar.zzz) == 0 && Objects.equals(this.zza, zzzVar.zza) && Objects.equals(this.zzb, zzzVar.zzb) && this.zzc.equals(zzzVar.zzc) && Objects.equals(this.zzk, zzzVar.zzk) && Objects.equals(this.zzn, zzzVar.zzn) && Objects.equals(this.zzo, zzzVar.zzo) && Objects.equals(this.zzd, zzzVar.zzd) && Arrays.equals(this.zzA, zzzVar.zzA) && Objects.equals(this.zzl, zzzVar.zzl) && Objects.equals(this.zzC, zzzVar.zzC) && Objects.equals(this.zzs, zzzVar.zzs) && zzd(zzzVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzN;
        if (i7 != 0) {
            return i7;
        }
        String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        int hashCode2 = this.zzc.hashCode() + ((((hashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.zzd;
        int hashCode3 = ((((((((((((hashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + this.zzh) * 31) + this.zzi) * 31;
        String str4 = this.zzk;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzav zzavVar = this.zzl;
        int hashCode5 = hashCode4 + (zzavVar == null ? 0 : zzavVar.hashCode());
        String str5 = this.zzn;
        int hashCode6 = ((hashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        int floatToIntBits = this.zzL + ((((((((((((((((((((((Float.floatToIntBits(this.zzz) + ((((Float.floatToIntBits(this.zzx) + ((((((((((hashCode6 + (this.zzo != null ? r0.hashCode() : 0)) * 31) + this.zzp) * 31) + ((int) this.zzt)) * 31) + this.zzv) * 31) + this.zzw) * 31)) * 31) + this.zzy) * 31)) * 31) + this.zzB) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF) * 31) + this.zzG) * 31) + this.zzH) * 31) + this.zzI) * 31) + this.zzJ) * 31) - 1) * 31) - 1) * 31);
        this.zzN = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzC);
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.zza);
        sb.append(", ");
        sb.append(this.zzb);
        sb.append(", ");
        sb.append(this.zzn);
        sb.append(", ");
        sb.append(this.zzo);
        sb.append(", ");
        sb.append(this.zzk);
        sb.append(", ");
        sb.append(this.zzj);
        sb.append(", ");
        sb.append(this.zzd);
        sb.append(", [");
        sb.append(this.zzv);
        sb.append(", ");
        sb.append(this.zzw);
        sb.append(", ");
        sb.append(this.zzx);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("], [");
        sb.append(this.zzE);
        sb.append(", ");
        return k.g(sb, this.zzF, "])");
    }

    public final int zza() {
        int i7;
        int i8 = this.zzv;
        if (i8 == -1 || (i7 = this.zzw) == -1) {
            return -1;
        }
        return i8 * i7;
    }

    public final zzx zzb() {
        return new zzx(this, null);
    }

    public final zzz zzc(int i7) {
        zzx zzxVar = new zzx(this, null);
        zzxVar.zzF(i7);
        return new zzz(zzxVar);
    }

    public final boolean zzd(zzz zzzVar) {
        if (this.zzr.size() != zzzVar.zzr.size()) {
            return false;
        }
        for (int i7 = 0; i7 < this.zzr.size(); i7++) {
            if (!Arrays.equals((byte[]) this.zzr.get(i7), (byte[]) zzzVar.zzr.get(i7))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x008a, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Incorrect condition in loop: B:65:0x0097 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzz(zzx zzxVar) {
        String str;
        String str2;
        List list;
        List list2;
        List list3;
        List list4;
        boolean z4;
        List list5;
        String str3;
        List list6;
        String str4;
        String str5;
        String str6;
        List list7;
        List list8;
        String str7;
        int i7;
        int i8;
        boolean z7;
        int i9;
        int i10;
        int i11;
        int i12;
        String str8;
        zzav zzavVar;
        String str9;
        String str10;
        int i13;
        int i14;
        List list9;
        zzs zzsVar;
        long j;
        boolean z8;
        int i15;
        int i16;
        float f7;
        int i17;
        float f8;
        byte[] bArr;
        int i18;
        zzk zzkVar;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        String str11;
        String str12;
        String str13;
        str = zzxVar.zza;
        this.zza = str;
        str2 = zzxVar.zzd;
        String zzE = zzen.zzE(str2);
        this.zzd = zzE;
        list = zzxVar.zzc;
        if (list.isEmpty()) {
            str11 = zzxVar.zzb;
            if (str11 != null) {
                str12 = zzxVar.zzb;
                this.zzc = zzfwh.zzo(new zzab(zzE, str12));
                str13 = zzxVar.zzb;
                this.zzb = str13;
                i7 = zzxVar.zze;
                this.zze = i7;
                i8 = zzxVar.zzg;
                if (i8 != 0) {
                    i29 = zzxVar.zzf;
                    if ((i29 & 32768) == 0) {
                        z7 = false;
                        zzcv.zzg(z7, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
                        i9 = zzxVar.zzf;
                        this.zzf = i9;
                        i10 = zzxVar.zzg;
                        this.zzg = i10;
                        i11 = zzxVar.zzh;
                        this.zzh = i11;
                        i12 = zzxVar.zzi;
                        this.zzi = i12;
                        this.zzj = i12 != -1 ? i12 : i11;
                        str8 = zzxVar.zzj;
                        this.zzk = str8;
                        zzavVar = zzxVar.zzk;
                        this.zzl = zzavVar;
                        this.zzm = null;
                        str9 = zzxVar.zzl;
                        this.zzn = str9;
                        str10 = zzxVar.zzm;
                        this.zzo = str10;
                        i13 = zzxVar.zzn;
                        this.zzp = i13;
                        i14 = zzxVar.zzo;
                        this.zzq = i14;
                        list9 = zzxVar.zzp;
                        this.zzr = list9 != null ? Collections.emptyList() : zzxVar.zzp;
                        zzsVar = zzxVar.zzq;
                        this.zzs = zzsVar;
                        j = zzxVar.zzr;
                        this.zzt = j;
                        z8 = zzxVar.zzs;
                        this.zzu = z8;
                        i15 = zzxVar.zzt;
                        this.zzv = i15;
                        i16 = zzxVar.zzu;
                        this.zzw = i16;
                        f7 = zzxVar.zzv;
                        this.zzx = f7;
                        i17 = zzxVar.zzw;
                        this.zzy = i17 != -1 ? 0 : zzxVar.zzw;
                        f8 = zzxVar.zzx;
                        this.zzz = f8 != -1.0f ? 1.0f : zzxVar.zzx;
                        bArr = zzxVar.zzy;
                        this.zzA = bArr;
                        i18 = zzxVar.zzz;
                        this.zzB = i18;
                        zzkVar = zzxVar.zzA;
                        this.zzC = zzkVar;
                        i19 = zzxVar.zzB;
                        this.zzD = i19;
                        i20 = zzxVar.zzC;
                        this.zzE = i20;
                        i21 = zzxVar.zzD;
                        this.zzF = i21;
                        i22 = zzxVar.zzE;
                        this.zzG = i22;
                        i23 = zzxVar.zzF;
                        this.zzH = i23 != -1 ? 0 : zzxVar.zzF;
                        i24 = zzxVar.zzG;
                        this.zzI = i24 != -1 ? zzxVar.zzG : 0;
                        i25 = zzxVar.zzH;
                        this.zzJ = i25;
                        i26 = zzxVar.zzI;
                        this.zzK = i26;
                        i27 = zzxVar.zzJ;
                        if (i27 != 0 && zzsVar != null) {
                            this.zzL = 1;
                            return;
                        } else {
                            i28 = zzxVar.zzJ;
                            this.zzL = i28;
                        }
                    }
                }
                z7 = true;
                zzcv.zzg(z7, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
                i9 = zzxVar.zzf;
                this.zzf = i9;
                i10 = zzxVar.zzg;
                this.zzg = i10;
                i11 = zzxVar.zzh;
                this.zzh = i11;
                i12 = zzxVar.zzi;
                this.zzi = i12;
                this.zzj = i12 != -1 ? i12 : i11;
                str8 = zzxVar.zzj;
                this.zzk = str8;
                zzavVar = zzxVar.zzk;
                this.zzl = zzavVar;
                this.zzm = null;
                str9 = zzxVar.zzl;
                this.zzn = str9;
                str10 = zzxVar.zzm;
                this.zzo = str10;
                i13 = zzxVar.zzn;
                this.zzp = i13;
                i14 = zzxVar.zzo;
                this.zzq = i14;
                list9 = zzxVar.zzp;
                this.zzr = list9 != null ? Collections.emptyList() : zzxVar.zzp;
                zzsVar = zzxVar.zzq;
                this.zzs = zzsVar;
                j = zzxVar.zzr;
                this.zzt = j;
                z8 = zzxVar.zzs;
                this.zzu = z8;
                i15 = zzxVar.zzt;
                this.zzv = i15;
                i16 = zzxVar.zzu;
                this.zzw = i16;
                f7 = zzxVar.zzv;
                this.zzx = f7;
                i17 = zzxVar.zzw;
                this.zzy = i17 != -1 ? 0 : zzxVar.zzw;
                f8 = zzxVar.zzx;
                this.zzz = f8 != -1.0f ? 1.0f : zzxVar.zzx;
                bArr = zzxVar.zzy;
                this.zzA = bArr;
                i18 = zzxVar.zzz;
                this.zzB = i18;
                zzkVar = zzxVar.zzA;
                this.zzC = zzkVar;
                i19 = zzxVar.zzB;
                this.zzD = i19;
                i20 = zzxVar.zzC;
                this.zzE = i20;
                i21 = zzxVar.zzD;
                this.zzF = i21;
                i22 = zzxVar.zzE;
                this.zzG = i22;
                i23 = zzxVar.zzF;
                this.zzH = i23 != -1 ? 0 : zzxVar.zzF;
                i24 = zzxVar.zzG;
                this.zzI = i24 != -1 ? zzxVar.zzG : 0;
                i25 = zzxVar.zzH;
                this.zzJ = i25;
                i26 = zzxVar.zzI;
                this.zzK = i26;
                i27 = zzxVar.zzJ;
                if (i27 != 0) {
                }
                i28 = zzxVar.zzJ;
                this.zzL = i28;
            }
        }
        list2 = zzxVar.zzc;
        if (!list2.isEmpty()) {
            str6 = zzxVar.zzb;
            if (str6 == null) {
                list7 = zzxVar.zzc;
                this.zzc = list7;
                list8 = zzxVar.zzc;
                Iterator it = list8.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str7 = ((zzab) list8.get(0)).zzb;
                        break;
                    }
                    zzab zzabVar = (zzab) it.next();
                    if (TextUtils.equals(zzabVar.zza, zzE)) {
                        str7 = zzabVar.zzb;
                        break;
                    }
                }
                this.zzb = str7;
                i7 = zzxVar.zze;
                this.zze = i7;
                i8 = zzxVar.zzg;
                if (i8 != 0) {
                }
                z7 = true;
                zzcv.zzg(z7, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
                i9 = zzxVar.zzf;
                this.zzf = i9;
                i10 = zzxVar.zzg;
                this.zzg = i10;
                i11 = zzxVar.zzh;
                this.zzh = i11;
                i12 = zzxVar.zzi;
                this.zzi = i12;
                this.zzj = i12 != -1 ? i12 : i11;
                str8 = zzxVar.zzj;
                this.zzk = str8;
                zzavVar = zzxVar.zzk;
                this.zzl = zzavVar;
                this.zzm = null;
                str9 = zzxVar.zzl;
                this.zzn = str9;
                str10 = zzxVar.zzm;
                this.zzo = str10;
                i13 = zzxVar.zzn;
                this.zzp = i13;
                i14 = zzxVar.zzo;
                this.zzq = i14;
                list9 = zzxVar.zzp;
                this.zzr = list9 != null ? Collections.emptyList() : zzxVar.zzp;
                zzsVar = zzxVar.zzq;
                this.zzs = zzsVar;
                j = zzxVar.zzr;
                this.zzt = j;
                z8 = zzxVar.zzs;
                this.zzu = z8;
                i15 = zzxVar.zzt;
                this.zzv = i15;
                i16 = zzxVar.zzu;
                this.zzw = i16;
                f7 = zzxVar.zzv;
                this.zzx = f7;
                i17 = zzxVar.zzw;
                this.zzy = i17 != -1 ? 0 : zzxVar.zzw;
                f8 = zzxVar.zzx;
                this.zzz = f8 != -1.0f ? 1.0f : zzxVar.zzx;
                bArr = zzxVar.zzy;
                this.zzA = bArr;
                i18 = zzxVar.zzz;
                this.zzB = i18;
                zzkVar = zzxVar.zzA;
                this.zzC = zzkVar;
                i19 = zzxVar.zzB;
                this.zzD = i19;
                i20 = zzxVar.zzC;
                this.zzE = i20;
                i21 = zzxVar.zzD;
                this.zzF = i21;
                i22 = zzxVar.zzE;
                this.zzG = i22;
                i23 = zzxVar.zzF;
                this.zzH = i23 != -1 ? 0 : zzxVar.zzF;
                i24 = zzxVar.zzG;
                this.zzI = i24 != -1 ? zzxVar.zzG : 0;
                i25 = zzxVar.zzH;
                this.zzJ = i25;
                i26 = zzxVar.zzI;
                this.zzK = i26;
                i27 = zzxVar.zzJ;
                if (i27 != 0) {
                }
                i28 = zzxVar.zzJ;
                this.zzL = i28;
            }
        }
        list3 = zzxVar.zzc;
        if (list3.isEmpty()) {
            str5 = zzxVar.zzb;
        }
        for (int i30 = 0; i30 < list4.size(); i30++) {
            list5 = zzxVar.zzc;
            String str14 = ((zzab) list5.get(i30)).zzb;
            str3 = zzxVar.zzb;
            if (str14.equals(str3)) {
                z4 = true;
                break;
            }
        }
        z4 = false;
        zzcv.zzf(z4);
        list6 = zzxVar.zzc;
        this.zzc = list6;
        str4 = zzxVar.zzb;
        this.zzb = str4;
        i7 = zzxVar.zze;
        this.zze = i7;
        i8 = zzxVar.zzg;
        if (i8 != 0) {
        }
        z7 = true;
        zzcv.zzg(z7, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        i9 = zzxVar.zzf;
        this.zzf = i9;
        i10 = zzxVar.zzg;
        this.zzg = i10;
        i11 = zzxVar.zzh;
        this.zzh = i11;
        i12 = zzxVar.zzi;
        this.zzi = i12;
        this.zzj = i12 != -1 ? i12 : i11;
        str8 = zzxVar.zzj;
        this.zzk = str8;
        zzavVar = zzxVar.zzk;
        this.zzl = zzavVar;
        this.zzm = null;
        str9 = zzxVar.zzl;
        this.zzn = str9;
        str10 = zzxVar.zzm;
        this.zzo = str10;
        i13 = zzxVar.zzn;
        this.zzp = i13;
        i14 = zzxVar.zzo;
        this.zzq = i14;
        list9 = zzxVar.zzp;
        this.zzr = list9 != null ? Collections.emptyList() : zzxVar.zzp;
        zzsVar = zzxVar.zzq;
        this.zzs = zzsVar;
        j = zzxVar.zzr;
        this.zzt = j;
        z8 = zzxVar.zzs;
        this.zzu = z8;
        i15 = zzxVar.zzt;
        this.zzv = i15;
        i16 = zzxVar.zzu;
        this.zzw = i16;
        f7 = zzxVar.zzv;
        this.zzx = f7;
        i17 = zzxVar.zzw;
        this.zzy = i17 != -1 ? 0 : zzxVar.zzw;
        f8 = zzxVar.zzx;
        this.zzz = f8 != -1.0f ? 1.0f : zzxVar.zzx;
        bArr = zzxVar.zzy;
        this.zzA = bArr;
        i18 = zzxVar.zzz;
        this.zzB = i18;
        zzkVar = zzxVar.zzA;
        this.zzC = zzkVar;
        i19 = zzxVar.zzB;
        this.zzD = i19;
        i20 = zzxVar.zzC;
        this.zzE = i20;
        i21 = zzxVar.zzD;
        this.zzF = i21;
        i22 = zzxVar.zzE;
        this.zzG = i22;
        i23 = zzxVar.zzF;
        this.zzH = i23 != -1 ? 0 : zzxVar.zzF;
        i24 = zzxVar.zzG;
        this.zzI = i24 != -1 ? zzxVar.zzG : 0;
        i25 = zzxVar.zzH;
        this.zzJ = i25;
        i26 = zzxVar.zzI;
        this.zzK = i26;
        i27 = zzxVar.zzJ;
        if (i27 != 0) {
        }
        i28 = zzxVar.zzJ;
        this.zzL = i28;
    }
}
