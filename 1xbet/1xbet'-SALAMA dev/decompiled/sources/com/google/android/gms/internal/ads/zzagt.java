package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
final class zzagt {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzaha zzc = new zzaha();
    private zzagu zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzacw zzacwVar, int i7) {
        zzacwVar.zzi(this.zza, 0, i7);
        long j = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j = (j << 8) | ((long) (this.zza[i8] & 255));
        }
        return j;
    }

    public final void zza(zzagu zzaguVar) {
        this.zzd = zzaguVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00af A[LOOP:0: B:3:0x0005->B:37:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x012e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Code duplicated, block: B:64:0x013b A[LOOP:2: B:61:0x0133->B:64:0x013b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x014a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0163  */
    /* JADX WARN: Code duplicated, block: B:74:0x0170  */
    /* JADX WARN: Code duplicated, block: B:78:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x013d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x014a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x0170, please report this as an issue */
    public final boolean zzc(zzacw zzacwVar) throws zzaz {
        int i7;
        zzagv zzagvVar;
        zzagy zzagyVar;
        long j;
        long j3;
        int i8;
        byte[] bArr;
        String str;
        int i9;
        long j7;
        int i10;
        long jZzd;
        double dLongBitsToDouble;
        int iZzb;
        int iZzc;
        zzcv.zzb(this.zzd);
        while (true) {
            zzagr zzagrVar = (zzagr) this.zzb.peek();
            if (zzagrVar != null && zzacwVar.zzf() >= zzagrVar.zzb) {
                ((zzagv) this.zzd).zza.zzj(((zzagr) this.zzb.pop()).zza);
                return true;
            }
            int i11 = this.zze;
            if (i11 != 0) {
                if (i11 == 1) {
                }
                zzagu zzaguVar = this.zzd;
                i7 = this.zzf;
                zzagvVar = (zzagv) zzaguVar;
                zzagyVar = zzagvVar.zza;
                switch (i7) {
                    case 131:
                    case 136:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case 215:
                    case 231:
                    case 238:
                    case 241:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21938:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        j = this.zzg;
                        if (j <= 8) {
                            throw zzaz.zza("Invalid integer size: " + j, null);
                        }
                        zzagvVar.zza.zzl(i7, zzd(zzacwVar, (int) j));
                        this.zze = 0;
                        return true;
                    case 134:
                    case 17026:
                    case 21358:
                    case 2274716:
                        j3 = this.zzg;
                        if (j3 <= 2147483647L) {
                            throw zzaz.zza("String element size: " + j3, null);
                        }
                        i8 = (int) j3;
                        if (i8 == 0) {
                            str = "";
                        } else {
                            bArr = new byte[i8];
                            zzacwVar.zzi(bArr, 0, i8);
                            while (i8 > 0) {
                                i9 = i8 - 1;
                                if (bArr[i9] == 0) {
                                    i8 = i9;
                                } else {
                                    str = new String(bArr, 0, i8);
                                }
                            }
                            str = new String(bArr, 0, i8);
                        }
                        zzagvVar.zza.zzn(i7, str);
                        this.zze = 0;
                        return true;
                    case 160:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        long jZzf = zzacwVar.zzf();
                        this.zzb.push(new zzagr(i7, this.zzg + jZzf, null));
                        ((zzagv) this.zzd).zza.zzm(this.zzf, jZzf, this.zzg);
                        this.zze = 0;
                        return true;
                    case 161:
                    case 163:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        zzagyVar.zzh(i7, (int) this.zzg, zzacwVar);
                        this.zze = 0;
                        return true;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        j7 = this.zzg;
                        if (j7 == 4 && j7 != 8) {
                            throw zzaz.zza("Invalid float size: " + j7, null);
                        }
                        i10 = (int) j7;
                        jZzd = zzd(zzacwVar, i10);
                        if (i10 == 4) {
                            dLongBitsToDouble = Float.intBitsToFloat((int) jZzd);
                        } else {
                            dLongBitsToDouble = Double.longBitsToDouble(jZzd);
                        }
                        zzagvVar.zza.zzk(i7, dLongBitsToDouble);
                        this.zze = 0;
                        return true;
                    default:
                        zzacwVar.zzk((int) this.zzg);
                        this.zze = 0;
                        break;
                }
            } else {
                long jZzd2 = this.zzc.zzd(zzacwVar, true, false, 4);
                if (jZzd2 == -2) {
                    zzacwVar.zzj();
                    while (true) {
                        zzacwVar.zzh(this.zza, 0, 4);
                        iZzb = zzaha.zzb(this.zza[0]);
                        if (iZzb != -1 && iZzb <= 4) {
                            iZzc = (int) zzaha.zzc(this.zza, iZzb, false);
                            zzagy zzagyVar2 = ((zzagv) this.zzd).zza;
                            if (iZzc != 357149030 && iZzc != 524531317 && iZzc != 475249515) {
                                if (iZzc == 374648427) {
                                    iZzc = 374648427;
                                }
                            }
                        }
                        zzacwVar.zzk(1);
                    }
                    zzacwVar.zzk(iZzb);
                    jZzd2 = iZzc;
                }
                if (jZzd2 == -1) {
                    return false;
                }
                this.zzf = (int) jZzd2;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzd(zzacwVar, false, true, 8);
            this.zze = 2;
            zzagu zzaguVar2 = this.zzd;
            i7 = this.zzf;
            zzagvVar = (zzagv) zzaguVar2;
            zzagyVar = zzagvVar.zza;
            switch (i7) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    j = this.zzg;
                    if (j <= 8) {
                        throw zzaz.zza("Invalid integer size: " + j, null);
                    }
                    zzagvVar.zza.zzl(i7, zzd(zzacwVar, (int) j));
                    this.zze = 0;
                    return true;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    j3 = this.zzg;
                    if (j3 <= 2147483647L) {
                        throw zzaz.zza("String element size: " + j3, null);
                    }
                    i8 = (int) j3;
                    if (i8 == 0) {
                        str = "";
                    } else {
                        bArr = new byte[i8];
                        zzacwVar.zzi(bArr, 0, i8);
                        while (i8 > 0) {
                            i9 = i8 - 1;
                            if (bArr[i9] == 0) {
                                i8 = i9;
                            } else {
                                str = new String(bArr, 0, i8);
                            }
                        }
                        str = new String(bArr, 0, i8);
                    }
                    zzagvVar.zza.zzn(i7, str);
                    this.zze = 0;
                    return true;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    long jZzf2 = zzacwVar.zzf();
                    this.zzb.push(new zzagr(i7, this.zzg + jZzf2, null));
                    ((zzagv) this.zzd).zza.zzm(this.zzf, jZzf2, this.zzg);
                    this.zze = 0;
                    return true;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    zzagyVar.zzh(i7, (int) this.zzg, zzacwVar);
                    this.zze = 0;
                    return true;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    j7 = this.zzg;
                    if (j7 == 4) {
                        break;
                    }
                    i10 = (int) j7;
                    jZzd = zzd(zzacwVar, i10);
                    if (i10 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jZzd);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jZzd);
                    }
                    zzagvVar.zza.zzk(i7, dLongBitsToDouble);
                    this.zze = 0;
                    return true;
                default:
                    zzacwVar.zzk((int) this.zzg);
                    this.zze = 0;
                    break;
            }
        }
    }
}
