package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
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
            j = (j << 8) | (this.zza[i8] & 255);
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

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0092, code lost:
    
        if (r0 == 1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzacw zzacwVar) {
        String str;
        int zzb;
        int zzc;
        long j;
        int i7;
        zzcv.zzb(this.zzd);
        while (true) {
            zzagr zzagrVar = (zzagr) this.zzb.peek();
            if (zzagrVar != null) {
                long zzf = zzacwVar.zzf();
                j = zzagrVar.zzb;
                if (zzf >= j) {
                    zzagu zzaguVar = this.zzd;
                    i7 = ((zzagr) this.zzb.pop()).zza;
                    ((zzagv) zzaguVar).zza.zzj(i7);
                    return true;
                }
            }
            int i8 = this.zze;
            if (i8 == 0) {
                long zzd = this.zzc.zzd(zzacwVar, true, false, 4);
                if (zzd == -2) {
                    zzacwVar.zzj();
                    while (true) {
                        zzacwVar.zzh(this.zza, 0, 4);
                        zzb = zzaha.zzb(this.zza[0]);
                        if (zzb != -1 && zzb <= 4) {
                            zzc = (int) zzaha.zzc(this.zza, zzb, false);
                            zzagy zzagyVar = ((zzagv) this.zzd).zza;
                            if (zzc != 357149030 && zzc != 524531317 && zzc != 475249515) {
                                if (zzc == 374648427) {
                                    zzc = 374648427;
                                }
                            }
                        }
                        zzacwVar.zzk(1);
                    }
                    zzacwVar.zzk(zzb);
                    zzd = zzc;
                }
                if (zzd == -1) {
                    return false;
                }
                this.zzf = (int) zzd;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzd(zzacwVar, false, true, 8);
            this.zze = 2;
            zzagu zzaguVar2 = this.zzd;
            int i9 = this.zzf;
            zzagv zzagvVar = (zzagv) zzaguVar2;
            zzagy zzagyVar2 = zzagvVar.zza;
            switch (i9) {
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
                    long j3 = this.zzg;
                    if (j3 <= 8) {
                        zzagvVar.zza.zzl(i9, zzd(zzacwVar, (int) j3));
                        this.zze = 0;
                        return true;
                    }
                    throw zzaz.zza("Invalid integer size: " + j3, null);
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    long j7 = this.zzg;
                    if (j7 > 2147483647L) {
                        throw zzaz.zza("String element size: " + j7, null);
                    }
                    int i10 = (int) j7;
                    if (i10 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i10];
                        zzacwVar.zzi(bArr, 0, i10);
                        while (i10 > 0) {
                            int i11 = i10 - 1;
                            if (bArr[i11] == 0) {
                                i10 = i11;
                            } else {
                                str = new String(bArr, 0, i10);
                            }
                        }
                        str = new String(bArr, 0, i10);
                    }
                    zzagvVar.zza.zzn(i9, str);
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
                    long zzf2 = zzacwVar.zzf();
                    this.zzb.push(new zzagr(i9, this.zzg + zzf2, null));
                    ((zzagv) this.zzd).zza.zzm(this.zzf, zzf2, this.zzg);
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
                    zzagyVar2.zzh(i9, (int) this.zzg, zzacwVar);
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
                    long j8 = this.zzg;
                    if (j8 != 4 && j8 != 8) {
                        throw zzaz.zza("Invalid float size: " + j8, null);
                    }
                    int i12 = (int) j8;
                    zzagvVar.zza.zzk(i9, i12 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(zzd(zzacwVar, i12)));
                    this.zze = 0;
                    return true;
                default:
                    zzacwVar.zzk((int) this.zzg);
                    this.zze = 0;
            }
        }
    }
}
