package com.google.android.gms.internal.ads;

import io.sentry.SentryReplayEvent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzaii implements zzacv, zzadu {
    private long zzA;
    private int zzB;
    private zzagm zzC;
    private final zzajq zza;
    private final int zzb;
    private final zzed zzc;
    private final zzed zzd;
    private final zzed zze;
    private final zzed zzf;
    private final ArrayDeque zzg;
    private final zzaim zzh;
    private final List zzi;
    private zzfwh zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;
    private zzed zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private long zzv;
    private zzacy zzw;
    private zzaih[] zzx;
    private long[][] zzy;
    private int zzz;

    @Deprecated
    public zzaii() {
        this(zzajq.zza, 16);
    }

    private static int zzj(int i7) {
        if (i7 != 1751476579) {
            return i7 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzk(zzair zzairVar, long j) {
        int iZza = zzairVar.zza(j);
        return iZza == -1 ? zzairVar.zzb(j) : iZza;
    }

    private static long zzl(zzair zzairVar, long j, long j3) {
        int iZzk = zzk(zzairVar, j);
        return iZzk == -1 ? j3 : Math.min(zzairVar.zzc[iZzk], j3);
    }

    private final void zzm() {
        this.zzk = 0;
        this.zzn = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzn(long j) {
        int i7;
        int i8;
        zzaii zzaiiVar;
        zzav zzavVar;
        long j3;
        ArrayList arrayList;
        int i9;
        int i10;
        zzav zzavVarZzc;
        int i11;
        zzaii zzaiiVar2 = this;
        int i12 = 0;
        int i13 = 1;
        while (!zzaiiVar2.zzg.isEmpty() && ((zzeq) zzaiiVar2.zzg.peek()).zza == j) {
            zzeq zzeqVar = (zzeq) zzaiiVar2.zzg.pop();
            if (zzeqVar.zzd == 1836019574) {
                zzeq zzeqVarZza = zzeqVar.zza(1835365473);
                new ArrayList();
                zzav zzavVarZzb = zzeqVarZza != null ? zzahw.zzb(zzeqVarZza) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z4 = zzaiiVar2.zzB == i13 ? i13 : i12;
                zzadj zzadjVar = new zzadj();
                zzer zzerVarZzb = zzeqVar.zzb(1969517665);
                if (zzerVarZzb != null) {
                    zzav zzavVarZzc2 = zzahw.zzc(zzerVarZzb);
                    zzadjVar.zzb(zzavVarZzc2);
                    zzavVar = zzavVarZzc2;
                } else {
                    zzavVar = null;
                }
                zzer zzerVarZzb2 = zzeqVar.zzb(1836476516);
                zzerVarZzb2.getClass();
                zzau[] zzauVarArr = new zzau[i13];
                zzauVarArr[i12] = zzahw.zzd(zzerVarZzb2.zza);
                zzav zzavVar2 = new zzav(-9223372036854775807L, zzauVarArr);
                int i14 = i13 != (zzaiiVar2.zzb & i13) ? i12 : i13;
                ArrayList arrayList3 = arrayList2;
                zzav zzavVar3 = zzavVar2;
                zzav zzavVar4 = zzavVar;
                List listZzf = zzahw.zzf(zzeqVar, zzadjVar, -9223372036854775807L, null, i14, z4, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzaig
                    @Override // com.google.android.gms.internal.ads.zzfsw
                    public final Object apply(Object obj) {
                        return (zzaio) obj;
                    }
                });
                String strZza = zzaif.zza(listZzf);
                long j7 = -9223372036854775807L;
                int i15 = 0;
                int i16 = 0;
                int size = -1;
                while (true) {
                    j3 = 0;
                    if (i15 >= listZzf.size()) {
                        break;
                    }
                    zzair zzairVar = (zzair) listZzf.get(i15);
                    if (zzairVar.zzb == 0) {
                        i9 = i13;
                        zzavVar4 = zzavVar4;
                        arrayList = arrayList3;
                    } else {
                        zzaio zzaioVar = zzairVar.zza;
                        int i17 = i16 + 1;
                        zzaih zzaihVar = new zzaih(zzaioVar, zzairVar, zzaiiVar2.zzw.zzw(i16, zzaioVar.zzb));
                        long j8 = zzaioVar.zze;
                        if (j8 == -9223372036854775807L) {
                            j8 = zzairVar.zzh;
                        }
                        zzaihVar.zzc.zzl(j8);
                        long jMax = Math.max(j7, j8);
                        int i18 = "audio/true-hd".equals(zzaioVar.zzg.zzo) ? zzairVar.zze * 16 : zzairVar.zze + 30;
                        zzx zzxVarZzb = zzaioVar.zzg.zzb();
                        zzxVarZzb.zzT(i18);
                        if (zzaioVar.zzb == 2) {
                            zzz zzzVar = zzaioVar.zzg;
                            int i19 = zzaiiVar2.zzb;
                            int i20 = zzzVar.zzf;
                            if ((i19 & 8) != 0) {
                                i20 |= size == -1 ? 1 : 2;
                            }
                            if (zzzVar.zzx == -1.0f && j8 > 0 && (i11 = zzairVar.zzb) > 0) {
                                zzxVarZzb.zzK(i11 / (j8 / 1000000.0f));
                            }
                            zzxVarZzb.zzab(i20);
                        }
                        if (zzaioVar.zzb == 1 && zzadjVar.zza()) {
                            zzxVarZzb.zzI(zzadjVar.zza);
                            zzxVarZzb.zzJ(zzadjVar.zzb);
                        }
                        int i21 = zzaioVar.zzb;
                        zzav[] zzavVarArr = {zzaiiVar2.zzi.isEmpty() ? null : new zzav(zzaiiVar2.zzi), zzavVar4, zzavVar3};
                        zzav zzavVar5 = new zzav(-9223372036854775807L, new zzau[0]);
                        if (zzavVarZzb != null) {
                            int i22 = 0;
                            while (i22 < zzavVarZzb.zza()) {
                                zzau zzauVarZzb = zzavVarZzb.zzb(i22);
                                if (zzauVarZzb instanceof zzep) {
                                    zzep zzepVar = (zzep) zzauVarZzb;
                                    if (!zzepVar.zza.equals("com.android.capture.fps")) {
                                        i10 = 1;
                                        zzavVarZzc = zzavVar5.zzc(zzepVar);
                                    } else if (i21 == 2) {
                                        i10 = 1;
                                        zzavVarZzc = zzavVar5.zzc(zzepVar);
                                    } else {
                                        i10 = 1;
                                    }
                                    zzavVar5 = zzavVarZzc;
                                } else {
                                    i10 = 1;
                                }
                                i22 += i10;
                            }
                        }
                        for (int i23 = 0; i23 < 3; i23++) {
                            zzavVar5 = zzavVar5.zzd(zzavVarArr[i23]);
                        }
                        if (zzavVar5.zza() > 0) {
                            zzxVarZzb.zzW(zzavVar5);
                        }
                        zzxVarZzb.zzE(strZza);
                        zzaihVar.zzc.zzm(zzxVarZzb.zzaj());
                        if (zzaioVar.zzb == 2 && size == -1) {
                            size = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzaihVar);
                        i16 = i17;
                        j7 = jMax;
                        i9 = 1;
                    }
                    i15++;
                    zzaiiVar2 = this;
                    arrayList3 = arrayList;
                    i13 = i9;
                    zzavVar3 = zzavVar3;
                    listZzf = listZzf;
                    zzavVar4 = zzavVar4;
                }
                zzaiiVar = zzaiiVar2;
                zzaiiVar.zzz = size;
                zzaiiVar.zzA = j7;
                zzaih[] zzaihVarArr = (zzaih[]) arrayList3.toArray(new zzaih[0]);
                zzaiiVar.zzx = zzaihVarArr;
                int length = zzaihVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i24 = 0; i24 < zzaihVarArr.length; i24++) {
                    jArr[i24] = new long[zzaihVarArr[i24].zzb.zzb];
                    jArr2[i24] = zzaihVarArr[i24].zzb.zzf[0];
                }
                i7 = 0;
                int i25 = 0;
                while (i25 < zzaihVarArr.length) {
                    long j9 = Long.MAX_VALUE;
                    int i26 = -1;
                    for (int i27 = 0; i27 < zzaihVarArr.length; i27++) {
                        if (!zArr[i27]) {
                            long j10 = jArr2[i27];
                            if (j10 <= j9) {
                                i26 = i27;
                                j9 = j10;
                            }
                        }
                    }
                    int i28 = iArr[i26];
                    long[] jArr3 = jArr[i26];
                    jArr3[i28] = j3;
                    zzair zzairVar2 = zzaihVarArr[i26].zzb;
                    j3 += (long) zzairVar2.zzd[i28];
                    int i29 = i28 + 1;
                    iArr[i26] = i29;
                    if (i29 < jArr3.length) {
                        jArr2[i26] = zzairVar2.zzf[i29];
                    } else {
                        zArr[i26] = true;
                        i25++;
                    }
                }
                i8 = 1;
                zzaiiVar.zzy = jArr;
                zzaiiVar.zzw.zzG();
                zzaiiVar.zzw.zzP(zzaiiVar);
                zzaiiVar.zzg.clear();
                zzaiiVar.zzk = 2;
            } else {
                i7 = i12;
                i8 = i13;
                zzaiiVar = zzaiiVar2;
                if (!zzaiiVar.zzg.isEmpty()) {
                    ((zzeq) zzaiiVar.zzg.peek()).zzc(zzeqVar);
                }
            }
            zzaiiVar2 = zzaiiVar;
            i12 = i7;
            i13 = i8;
        }
        if (zzaiiVar2.zzk != 2) {
            zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zzA;
    }

    /* JADX WARN: Code duplicated, block: B:268:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) throws zzaz {
        int i7;
        int i8;
        int iZzb;
        int i9;
        boolean z4;
        int i10;
        while (true) {
            int i11 = 1;
            while (true) {
                i7 = this.zzk;
                if (i7 != 0) {
                    break;
                }
                boolean z7 = i11;
                if (this.zzn == 0) {
                    if (!zzacwVar.zzn(this.zzf.zzN(), 0, 8, z7)) {
                        if (this.zzB != 2 || (this.zzb & 2) == 0) {
                            return -1;
                        }
                        zzaeb zzaebVarZzw = this.zzw.zzw(0, 4);
                        zzagm zzagmVar = this.zzC;
                        zzav zzavVar = zzagmVar == null ? null : new zzav(-9223372036854775807L, zzagmVar);
                        zzx zzxVar = new zzx();
                        zzxVar.zzW(zzavVar);
                        zzaebVarZzw.zzm(zzxVar.zzaj());
                        this.zzw.zzG();
                        this.zzw.zzP(new zzadt(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.zzn = 8;
                    this.zzf.zzL(0);
                    this.zzm = this.zzf.zzu();
                    this.zzl = this.zzf.zzg();
                }
                long j = this.zzm;
                if (j == 1) {
                    zzacwVar.zzi(this.zzf.zzN(), 8, 8);
                    this.zzn += 8;
                    this.zzm = this.zzf.zzw();
                } else if (j == 0) {
                    long jZzd = zzacwVar.zzd();
                    if (jZzd == -1) {
                        zzeq zzeqVar = (zzeq) this.zzg.peek();
                        jZzd = zzeqVar != null ? zzeqVar.zza : -1L;
                    }
                    if (jZzd != -1) {
                        this.zzm = (jZzd - zzacwVar.zzf()) + ((long) this.zzn);
                    }
                }
                long j3 = this.zzm;
                int i12 = this.zzn;
                if (j3 < i12) {
                    throw zzaz.zzc("Atom size less than header length (unsupported).");
                }
                int i13 = this.zzl;
                if (i13 == 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1701082227 || i13 == 1835365473 || i13 == 1635284069) {
                    i10 = 1;
                    long jZzf = zzacwVar.zzf();
                    long j7 = this.zzm;
                    long j8 = jZzf + j7;
                    long j9 = this.zzn;
                    if (j7 != j9 && this.zzl == 1835365473) {
                        this.zze.zzI(8);
                        zzacwVar.zzh(this.zze.zzN(), 0, 8);
                        zzahw.zzg(this.zze);
                        zzacwVar.zzk(this.zze.zzd());
                        zzacwVar.zzj();
                    }
                    long j10 = j8 - j9;
                    this.zzg.push(new zzeq(this.zzl, j10));
                    if (this.zzm == this.zzn) {
                        zzn(j10);
                    } else {
                        zzm();
                    }
                } else if (i13 == 1835296868 || i13 == 1836476516 || i13 == 1751411826 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1937011571 || i13 == 1668576371 || i13 == 1701606260 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1953196132 || i13 == 1718909296 || i13 == 1969517665 || i13 == 1801812339 || i13 == 1768715124) {
                    zzcv.zzf(i12 == 8);
                    zzcv.zzf(this.zzm <= 2147483647L);
                    zzed zzedVar = new zzed((int) this.zzm);
                    System.arraycopy(this.zzf.zzN(), 0, zzedVar.zzN(), 0, 8);
                    this.zzo = zzedVar;
                    i10 = 1;
                    this.zzk = 1;
                } else {
                    long jZzf2 = zzacwVar.zzf();
                    long j11 = this.zzn;
                    long j12 = jZzf2 - j11;
                    if (this.zzl == 1836086884) {
                        this.zzC = new zzagm(0L, j12, -9223372036854775807L, j12 + j11, this.zzm - j11);
                    }
                    this.zzo = null;
                    i10 = 1;
                    this.zzk = 1;
                }
                i11 = i10;
            }
            if (i7 != i11) {
                if (i7 != 2) {
                    this.zzh.zza(zzacwVar, zzadrVar, this.zzi);
                    if (zzadrVar.zza == 0) {
                        zzm();
                    }
                    return i11;
                }
                long jZzf3 = zzacwVar.zzf();
                int i14 = this.zzp;
                if (i14 == -1) {
                    int i15 = i11;
                    int i16 = i15;
                    int i17 = -1;
                    int i18 = -1;
                    long j13 = Long.MAX_VALUE;
                    long j14 = Long.MAX_VALUE;
                    long j15 = Long.MAX_VALUE;
                    int i19 = 0;
                    while (true) {
                        zzaih[] zzaihVarArr = this.zzx;
                        if (i19 >= zzaihVarArr.length) {
                            break;
                        }
                        zzaih zzaihVar = zzaihVarArr[i19];
                        int i20 = zzaihVar.zze;
                        zzair zzairVar = zzaihVar.zzb;
                        if (i20 != zzairVar.zzb) {
                            long j16 = zzairVar.zzc[i20];
                            long[][] jArr = this.zzy;
                            int i21 = zzen.zza;
                            long j17 = jArr[i19][i20];
                            long j18 = j16 - jZzf3;
                            int i22 = (j18 < 0 || j18 >= 262144) ? i11 : 0;
                            if (i22 == 0) {
                                if (i16 == 0) {
                                    i9 = 0;
                                } else {
                                    i16 = i22;
                                    i18 = i19;
                                    j15 = j18;
                                    j14 = j17;
                                }
                                if (j17 < j13) {
                                    i15 = i22;
                                    i17 = i19;
                                    j13 = j17;
                                }
                            } else {
                                i9 = i16;
                            }
                            if (i22 != i9 || j18 >= j15) {
                                i16 = i9;
                            } else {
                                i16 = i22;
                                i18 = i19;
                                j15 = j18;
                                j14 = j17;
                            }
                            if (j17 < j13) {
                                i15 = i22;
                                i17 = i19;
                                j13 = j17;
                            }
                        }
                        i19 += i11;
                    }
                    i14 = (j13 == Long.MAX_VALUE || i15 == 0 || j14 < j13 + SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE) ? i18 : i17;
                    this.zzp = i14;
                    if (i14 == -1) {
                        return -1;
                    }
                }
                zzaih zzaihVar2 = this.zzx[i14];
                zzaeb zzaebVar = zzaihVar2.zzc;
                int i23 = zzaihVar2.zze;
                zzair zzairVar2 = zzaihVar2.zzb;
                long j19 = zzairVar2.zzc[i23] + this.zzv;
                int i24 = zzairVar2.zzd[i23];
                zzaec zzaecVar = zzaihVar2.zzd;
                long j20 = (j19 - jZzf3) + ((long) this.zzq);
                if (j20 < 0 || j20 >= 262144) {
                    zzadrVar.zza = j19;
                    return 1;
                }
                if (zzaihVar2.zza.zzh == 1) {
                    j20 += 8;
                    i24 -= 8;
                }
                zzacwVar.zzk((int) j20);
                zzz zzzVar = zzaihVar2.zza.zzg;
                if (!Objects.equals(zzzVar.zzo, "video/avc")) {
                    Objects.equals(zzzVar.zzo, "video/hevc");
                }
                this.zzt = true;
                zzaio zzaioVar = zzaihVar2.zza;
                int i25 = zzaioVar.zzk;
                if (i25 == 0) {
                    if ("audio/ac4".equals(zzaioVar.zzg.zzo)) {
                        if (this.zzr == 0) {
                            zzaby.zzc(i24, this.zze);
                            i8 = 7;
                            zzaebVar.zzr(this.zze, 7);
                            this.zzr += 7;
                        } else {
                            i8 = 7;
                        }
                        i24 += i8;
                    } else if (zzaecVar != null) {
                        zzaecVar.zzd(zzacwVar);
                    }
                    while (true) {
                        int i26 = this.zzr;
                        if (i26 >= i24) {
                            break;
                        }
                        int iZzf = zzaebVar.zzf(zzacwVar, i24 - i26, false);
                        this.zzq += iZzf;
                        this.zzr += iZzf;
                        this.zzs -= iZzf;
                    }
                } else {
                    byte[] bArrZzN = this.zzd.zzN();
                    bArrZzN[0] = 0;
                    bArrZzN[1] = 0;
                    bArrZzN[2] = 0;
                    int i27 = 4 - i25;
                    i24 += i27;
                    while (this.zzr < i24) {
                        int i28 = this.zzs;
                        if (i28 == 0) {
                            zzaio zzaioVar2 = zzaihVar2.zza;
                            int i29 = zzaioVar2.zzk;
                            if (this.zzt || zzfj.zzb(zzaioVar2.zzg) + i29 > zzaihVar2.zzb.zzd[i23] - this.zzq) {
                                iZzb = 0;
                            } else {
                                iZzb = zzfj.zzb(zzaihVar2.zza.zzg);
                                i29 = zzaihVar2.zza.zzk + iZzb;
                            }
                            zzacwVar.zzi(bArrZzN, i27, i29);
                            this.zzq += i29;
                            this.zzd.zzL(0);
                            int iZzg = this.zzd.zzg();
                            if (iZzg < 0) {
                                throw zzaz.zza("Invalid NAL length", null);
                            }
                            this.zzs = iZzg - iZzb;
                            this.zzc.zzL(0);
                            zzaebVar.zzr(this.zzc, 4);
                            this.zzr += 4;
                            if (iZzb > 0) {
                                zzaebVar.zzr(this.zzd, iZzb);
                                this.zzr += iZzb;
                                if (zzfj.zzj(bArrZzN, 4, iZzb, zzaihVar2.zza.zzg)) {
                                    this.zzt = true;
                                }
                            }
                        } else {
                            int iZzf2 = zzaebVar.zzf(zzacwVar, i28, false);
                            this.zzq += iZzf2;
                            this.zzr += iZzf2;
                            this.zzs -= iZzf2;
                        }
                    }
                }
                zzair zzairVar3 = zzaihVar2.zzb;
                long j21 = zzairVar3.zzf[i23];
                int i30 = zzairVar3.zzg[i23];
                if (!this.zzt) {
                    i30 |= 67108864;
                }
                if (zzaecVar != null) {
                    zzaecVar.zzc(zzaebVar, j21, i30, i24, 0, null);
                    if (i23 + 1 == zzaihVar2.zzb.zzb) {
                        zzaecVar.zza(zzaebVar, null);
                    }
                } else {
                    zzaebVar.zzt(j21, i30, i24, 0, null);
                }
                zzaihVar2.zze++;
                this.zzp = -1;
                this.zzq = 0;
                this.zzr = 0;
                this.zzs = 0;
                this.zzt = false;
                return 0;
            }
            long j22 = this.zzm - ((long) this.zzn);
            long jZzf4 = zzacwVar.zzf() + j22;
            zzed zzedVar2 = this.zzo;
            if (zzedVar2 != null) {
                zzacwVar.zzi(zzedVar2.zzN(), this.zzn, (int) j22);
                if (this.zzl == 1718909296) {
                    this.zzu = true;
                    zzedVar2.zzL(8);
                    int iZzj = zzj(zzedVar2.zzg());
                    if (iZzj == 0) {
                        zzedVar2.zzM(4);
                        do {
                            if (zzedVar2.zzb() <= 0) {
                                iZzj = 0;
                                break;
                            }
                            iZzj = zzj(zzedVar2.zzg());
                        } while (iZzj == 0);
                    }
                    this.zzB = iZzj;
                } else if (!this.zzg.isEmpty()) {
                    ((zzeq) this.zzg.peek()).zzd(new zzer(this.zzl, zzedVar2));
                }
            } else {
                if (!this.zzu && this.zzl == 1835295092) {
                    this.zzB = 1;
                }
                if (j22 < 262144) {
                    zzacwVar.zzk((int) j22);
                } else {
                    zzadrVar.zza = zzacwVar.zzf() + j22;
                    z4 = true;
                }
                zzn(jZzf4);
                if (!z4 && this.zzk != 2) {
                    return 1;
                }
            }
            z4 = false;
            zzn(jZzf4);
            if (!z4) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ zzacv zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ List zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zze(zzacy zzacyVar) {
        if ((this.zzb & 16) == 0) {
            zzacyVar = new zzajt(zzacyVar, this.zza);
        }
        this.zzw = zzacyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        this.zzg.clear();
        this.zzn = 0;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = false;
        if (j == 0) {
            if (this.zzk != 3) {
                zzm();
                return;
            } else {
                this.zzh.zzb();
                this.zzi.clear();
                return;
            }
        }
        for (zzaih zzaihVar : this.zzx) {
            zzair zzairVar = zzaihVar.zzb;
            int iZza = zzairVar.zza(j3);
            if (iZza == -1) {
                iZza = zzairVar.zzb(j3);
            }
            zzaihVar.zze = iZza;
            zzaec zzaecVar = zzaihVar.zzd;
            if (zzaecVar != null) {
                zzaecVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        long j3;
        long j7;
        int iZzb;
        zzaih[] zzaihVarArr = this.zzx;
        if (zzaihVarArr.length == 0) {
            zzadv zzadvVar = zzadv.zza;
            return new zzads(zzadvVar, zzadvVar);
        }
        int i7 = this.zzz;
        long jZzl = -1;
        if (i7 != -1) {
            zzair zzairVar = zzaihVarArr[i7].zzb;
            int iZzk = zzk(zzairVar, j);
            if (iZzk == -1) {
                zzadv zzadvVar2 = zzadv.zza;
                return new zzads(zzadvVar2, zzadvVar2);
            }
            long j8 = zzairVar.zzf[iZzk];
            j3 = zzairVar.zzc[iZzk];
            if (j8 >= j || iZzk >= zzairVar.zzb - 1 || (iZzb = zzairVar.zzb(j)) == -1 || iZzb == iZzk) {
                j7 = -9223372036854775807L;
            } else {
                j7 = zzairVar.zzf[iZzb];
                jZzl = zzairVar.zzc[iZzb];
            }
            j = j8;
        } else {
            j3 = Long.MAX_VALUE;
            j7 = -9223372036854775807L;
        }
        int i8 = 0;
        while (true) {
            zzaih[] zzaihVarArr2 = this.zzx;
            if (i8 >= zzaihVarArr2.length) {
                break;
            }
            if (i8 != this.zzz) {
                zzair zzairVar2 = zzaihVarArr2[i8].zzb;
                long jZzl2 = zzl(zzairVar2, j, j3);
                if (j7 != -9223372036854775807L) {
                    jZzl = zzl(zzairVar2, j7, jZzl);
                }
                j3 = jZzl2;
            }
            i8++;
        }
        zzadv zzadvVar3 = new zzadv(j, j3);
        return j7 == -9223372036854775807L ? new zzads(zzadvVar3, zzadvVar3) : new zzads(zzadvVar3, new zzadv(j7, jZzl));
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) {
        zzady zzadyVarZzb = zzain.zzb(zzacwVar, (this.zzb & 2) != 0);
        this.zzj = zzadyVarZzb != null ? zzfwh.zzo(zzadyVarZzb) : zzfwh.zzn();
        return zzadyVarZzb == null;
    }

    public zzaii(zzajq zzajqVar, int i7) {
        this.zza = zzajqVar;
        this.zzb = i7;
        this.zzj = zzfwh.zzn();
        this.zzk = (i7 & 4) != 0 ? 3 : 0;
        this.zzh = new zzaim();
        this.zzi = new ArrayList();
        this.zzf = new zzed(16);
        this.zzg = new ArrayDeque();
        this.zzc = new zzed(zzfj.zza);
        this.zzd = new zzed(6);
        this.zze = new zzed();
        this.zzp = -1;
        this.zzw = zzacy.zza;
        this.zzx = new zzaih[0];
    }
}
