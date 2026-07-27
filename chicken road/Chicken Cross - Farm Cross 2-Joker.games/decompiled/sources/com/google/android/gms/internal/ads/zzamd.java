package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzamd implements zzagh {
    private static final byte[] zza;
    private static final zzv zzb;
    private long zzA;
    private long zzB;
    private zzamc zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzagk zzI;
    private zzaht[] zzJ;
    private zzaht[] zzK;
    private boolean zzL;
    private boolean zzM;
    private long zzN;
    private long zzO;
    private final zzanx zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzeu zzg;
    private final zzeu zzh;
    private final zzeu zzi;
    private final byte[] zzj;
    private final zzeu zzk;
    private final zzajm zzl;
    private final zzeu zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzhc zzp;
    private final zzafw zzq;
    private zzgxm zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzeu zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        int i = zzaly.zza;
        zza = new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        zzt zztVar = new zzt();
        zztVar.zzo("application/x-emsg");
        zzb = zztVar.zzQ();
    }

    @Deprecated
    public zzamd() {
        this(zzanx.zza, 32, null, null, zzgxm.zzi(), null);
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0401, code lost:
    
        if ((com.google.android.gms.internal.ads.zzfm.zzw(r4.zzc(0), 1000000, r11.zzd, java.math.RoundingMode.DOWN) + com.google.android.gms.internal.ads.zzfm.zzw(r0.zzc(0), 1000000, r11.zzc, java.math.RoundingMode.DOWN)) < r11.zze) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0814, code lost:
    
        zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0817, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0440  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzj(long j) throws zzat {
        zzap zzapVar;
        List list;
        int i;
        String str;
        zzaha zzahaVar;
        SparseArray sparseArray;
        int i2;
        zzfz zzfzVar;
        byte[] bArr;
        List list2;
        int i3;
        int i4;
        int i5;
        int i6;
        byte[] bArr2;
        byte[] bArr3;
        int i7;
        boolean z;
        int i8;
        SparseArray sparseArray2;
        int i9;
        zzfz zzfzVar2;
        byte[] bArr4;
        int i10;
        zzfz zzfzVar3;
        List list3;
        int i11;
        zzamc zzamcVar;
        int i12;
        zzeu zzeuVar;
        zzalw zzalwVar;
        long j2;
        int i13;
        zzalw zzalwVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z2;
        zzalw zzalwVar3;
        int i19;
        int i20;
        long j3;
        zzamc zzamcVar2;
        boolean z3;
        zzhbh zzhbhVar;
        final zzamd zzamdVar = this;
        while (true) {
            ArrayDeque arrayDeque = zzamdVar.zzn;
            if (arrayDeque.isEmpty() || ((zzfz) arrayDeque.peek()).zza != j) {
                break;
            }
            zzfz zzfzVar4 = (zzfz) arrayDeque.pop();
            int i21 = zzfzVar4.zzd;
            int i22 = 12;
            int i23 = 8;
            if (i21 == 1836019574) {
                zzq zzn = zzn(zzfzVar4.zzb);
                zzfz zzd = zzfzVar4.zzd(1836475768);
                zzd.getClass();
                SparseArray sparseArray3 = new SparseArray();
                List list4 = zzd.zzb;
                int size = list4.size();
                int i24 = 0;
                long j4 = -9223372036854775807L;
                while (i24 < size) {
                    zzga zzgaVar = (zzga) list4.get(i24);
                    int i25 = zzgaVar.zzd;
                    if (i25 == 1953654136) {
                        zzeu zzeuVar2 = zzgaVar.zza;
                        zzeuVar2.zzh(i22);
                        Pair create = Pair.create(Integer.valueOf(zzeuVar2.zzB()), new zzalw(zzeuVar2.zzB() - 1, zzeuVar2.zzB(), zzeuVar2.zzB(), zzeuVar2.zzB()));
                        sparseArray3.put(((Integer) create.first).intValue(), (zzalw) create.second);
                    } else if (i25 == 1835362404) {
                        zzeu zzeuVar3 = zzgaVar.zza;
                        zzeuVar3.zzh(8);
                        j4 = zzalv.zza(zzeuVar3.zzB()) == 0 ? zzeuVar3.zzz() : zzeuVar3.zzJ();
                    }
                    i24++;
                    i22 = 12;
                }
                zzfz zzd2 = zzfzVar4.zzd(1835365473);
                zzap zze = zzd2 != null ? zzalv.zze(zzd2) : null;
                zzaha zzahaVar2 = new zzaha();
                zzga zzc = zzfzVar4.zzc(1969517665);
                if (zzc != null) {
                    zzap zzc2 = zzalv.zzc(zzc);
                    zzahaVar2.zza(zzc2);
                    zzapVar = zzc2;
                } else {
                    zzapVar = null;
                }
                zzga zzc3 = zzfzVar4.zzc(1836476516);
                zzc3.getClass();
                zzap zzapVar2 = new zzap(-9223372036854775807L, zzalv.zzd(zzc3.zza));
                List zzb2 = zzalv.zzb(zzfzVar4, zzahaVar2, j4, zzn, (zzamdVar.zzd & 16) != 0, false, new zzgub(zzamdVar) { // from class: com.google.android.gms.internal.ads.zzalx
                    @Override // com.google.android.gms.internal.ads.zzgub
                    public final /* synthetic */ Object apply(Object obj) {
                        return (zzamw) obj;
                    }
                }, false);
                int size2 = zzb2.size();
                SparseArray sparseArray4 = zzamdVar.zzf;
                if (sparseArray4.size() == 0) {
                    String zza2 = zzamg.zza(zzb2);
                    int i26 = 0;
                    while (i26 < size2) {
                        zzamz zzamzVar = (zzamz) zzb2.get(i26);
                        zzamw zzamwVar = zzamzVar.zza;
                        if (zzamwVar.zzm) {
                            zzagk zzagkVar = zzamdVar.zzI;
                            int i27 = zzamwVar.zzb;
                            zzaht zzs = zzagkVar.zzs(i26, i27);
                            long j5 = zzamwVar.zze;
                            zzs.zzP(j5);
                            list = zzb2;
                            zzv zzvVar = zzamwVar.zzg;
                            i = size2;
                            zzt zza3 = zzvVar.zza();
                            zza3.zzn(zza2);
                            zzamf.zzb(i27, zzahaVar2, zza3);
                            str = zza2;
                            zzahaVar = zzahaVar2;
                            zzamf.zza(i27, zze, zza3, zzvVar.zzl, zzapVar, zzapVar2);
                            int i28 = zzamwVar.zza;
                            sparseArray4.put(i28, new zzamc(zzs, zzamzVar, zzp(sparseArray3, i28), zza3.zzQ()));
                            zzamdVar.zzA = Math.max(zzamdVar.zzA, j5);
                        } else {
                            list = zzb2;
                            i = size2;
                            str = zza2;
                            zzahaVar = zzahaVar2;
                        }
                        i26++;
                        zzb2 = list;
                        size2 = i;
                        zza2 = str;
                        zzahaVar2 = zzahaVar;
                    }
                    zzamdVar.zzI.zzv();
                } else {
                    List list5 = zzb2;
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < size2) {
                        List list6 = list5;
                        if (((zzamz) list6.get(i29)).zza.zzm) {
                            i30++;
                        }
                        i29++;
                        list5 = list6;
                    }
                    List list7 = list5;
                    zzguk.zzi(sparseArray4.size() == i30);
                    for (int i31 = 0; i31 < size2; i31++) {
                        zzamz zzamzVar2 = (zzamz) list7.get(i31);
                        zzamw zzamwVar2 = zzamzVar2.zza;
                        if (zzamwVar2.zzm) {
                            int i32 = zzamwVar2.zza;
                            ((zzamc) sparseArray4.get(i32)).zza(zzamzVar2, zzp(sparseArray3, i32));
                        }
                    }
                }
            } else if (i21 == 1836019558) {
                SparseArray sparseArray5 = zzamdVar.zzf;
                int i33 = zzamdVar.zzd;
                byte[] bArr5 = zzamdVar.zzj;
                List list8 = zzfzVar4.zzc;
                int size3 = list8.size();
                int i34 = 0;
                while (i34 < size3) {
                    zzfz zzfzVar5 = (zzfz) list8.get(i34);
                    if (zzfzVar5.zzd == 1953653094) {
                        zzga zzc4 = zzfzVar5.zzc(1952868452);
                        zzc4.getClass();
                        zzeu zzeuVar4 = zzc4.zza;
                        zzeuVar4.zzh(i23);
                        int zzB = zzeuVar4.zzB();
                        int i35 = zzalv.zza;
                        zzamc zzamcVar3 = (zzamc) sparseArray5.get(zzeuVar4.zzB());
                        if (zzamcVar3 == null) {
                            zzamcVar3 = null;
                        } else {
                            if ((zzB & 1) != 0) {
                                long zzJ = zzeuVar4.zzJ();
                                zzamy zzamyVar = zzamcVar3.zzb;
                                zzamyVar.zzb = zzJ;
                                zzamyVar.zzc = zzJ;
                            }
                            zzalw zzalwVar4 = zzamcVar3.zze;
                            zzamcVar3.zzb.zza = new zzalw((zzB & 2) != 0 ? zzeuVar4.zzB() - 1 : zzalwVar4.zza, (zzB & 8) != 0 ? zzeuVar4.zzB() : zzalwVar4.zzb, (zzB & 16) != 0 ? zzeuVar4.zzB() : zzalwVar4.zzc, (zzB & 32) != 0 ? zzeuVar4.zzB() : zzalwVar4.zzd);
                        }
                        if (zzamcVar3 == null) {
                            sparseArray = sparseArray5;
                            i2 = i33;
                            zzfzVar = zzfzVar4;
                            bArr = bArr5;
                            list2 = list8;
                            i3 = size3;
                            i4 = i34;
                        } else {
                            zzamy zzamyVar2 = zzamcVar3.zzb;
                            long j6 = zzamyVar2.zzp;
                            boolean z4 = zzamyVar2.zzq;
                            zzamcVar3.zzc();
                            zzamcVar3.zzp(true);
                            zzga zzc5 = zzfzVar5.zzc(1952867444);
                            if (zzc5 == null || (i33 & 2) != 0) {
                                zzamyVar2.zzp = j6;
                                zzamyVar2.zzq = z4;
                            } else {
                                zzeu zzeuVar5 = zzc5.zza;
                                zzeuVar5.zzh(8);
                                zzamyVar2.zzp = zzalv.zza(zzeuVar5.zzB()) == 1 ? zzeuVar5.zzJ() : zzeuVar5.zzz();
                                zzamyVar2.zzq = true;
                            }
                            List list9 = zzfzVar5.zzb;
                            int size4 = list9.size();
                            list2 = list8;
                            int i36 = 0;
                            int i37 = 0;
                            int i38 = 0;
                            while (true) {
                                i6 = 1953658222;
                                if (i36 >= size4) {
                                    break;
                                }
                                int i39 = size3;
                                zzga zzgaVar2 = (zzga) list9.get(i36);
                                if (zzgaVar2.zzd == 1953658222) {
                                    zzeu zzeuVar6 = zzgaVar2.zza;
                                    zzeuVar6.zzh(12);
                                    int zzH = zzeuVar6.zzH();
                                    if (zzH > 0) {
                                        i38 += zzH;
                                        i37++;
                                    }
                                }
                                i36++;
                                size3 = i39;
                            }
                            i3 = size3;
                            zzamcVar3.zzh = 0;
                            zzamcVar3.zzg = 0;
                            zzamcVar3.zzf = 0;
                            zzamyVar2.zzd = i37;
                            zzamyVar2.zze = i38;
                            if (zzamyVar2.zzg.length < i37) {
                                zzamyVar2.zzf = new long[i37];
                                zzamyVar2.zzg = new int[i37];
                            }
                            if (zzamyVar2.zzh.length < i38) {
                                int i40 = (i38 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
                                zzamyVar2.zzh = new int[i40];
                                zzamyVar2.zzi = new long[i40];
                                zzamyVar2.zzj = new boolean[i40];
                                zzamyVar2.zzl = new boolean[i40];
                            }
                            int i41 = 0;
                            int i42 = 0;
                            int i43 = 0;
                            while (i41 < size4) {
                                zzga zzgaVar3 = (zzga) list9.get(i41);
                                if (zzgaVar3.zzd == i6) {
                                    int i44 = i42 + 1;
                                    zzeu zzeuVar7 = zzgaVar3.zza;
                                    zzeuVar7.zzh(8);
                                    int zzB2 = zzeuVar7.zzB();
                                    i11 = size4;
                                    zzamw zzamwVar3 = zzamcVar3.zzd.zza;
                                    zzalw zzalwVar5 = zzamyVar2.zza;
                                    String str2 = zzfm.zza;
                                    sparseArray2 = sparseArray5;
                                    zzamyVar2.zzg[i42] = zzeuVar7.zzH();
                                    long[] jArr = zzamyVar2.zzf;
                                    zzfzVar2 = zzfzVar4;
                                    bArr4 = bArr5;
                                    long j7 = zzamyVar2.zzb;
                                    jArr[i42] = j7;
                                    if ((zzB2 & 1) != 0) {
                                        i10 = i34;
                                        zzfzVar3 = zzfzVar5;
                                        jArr[i42] = j7 + zzeuVar7.zzB();
                                    } else {
                                        i10 = i34;
                                        zzfzVar3 = zzfzVar5;
                                    }
                                    boolean z5 = (zzB2 & 4) != 0;
                                    int i45 = zzalwVar5.zzd;
                                    int zzB3 = z5 ? zzeuVar7.zzB() : i45;
                                    int i46 = zzB2 & 256;
                                    int i47 = zzB2 & 512;
                                    int i48 = zzB2 & 1024;
                                    int i49 = zzB2 & 2048;
                                    int i50 = zzB3;
                                    zzhbh zzhbhVar2 = zzamwVar3.zzi;
                                    if (zzhbhVar2 != null) {
                                        list3 = list9;
                                        i8 = i41;
                                        if (zzhbhVar2.zzb() != 1 || (zzhbhVar = zzamwVar3.zzj) == null) {
                                            i12 = i49;
                                        } else {
                                            if (zzhbhVar2.zzc(0) == 0) {
                                                i12 = i49;
                                                zzeuVar = zzeuVar7;
                                                zzalwVar = zzalwVar5;
                                            } else {
                                                i12 = i49;
                                                zzeuVar = zzeuVar7;
                                                zzalwVar = zzalwVar5;
                                            }
                                            j2 = zzhbhVar.zzc(0);
                                            int[] iArr = zzamyVar2.zzh;
                                            long[] jArr2 = zzamyVar2.zzi;
                                            boolean[] zArr = zzamyVar2.zzj;
                                            boolean z6 = (zzamwVar3.zzb == 2 || (i33 & 1) == 0) ? false : true;
                                            i13 = zzamyVar2.zzg[i42] + i43;
                                            zzamc zzamcVar4 = zzamcVar3;
                                            long j8 = zzamwVar3.zzc;
                                            long j9 = zzamyVar2.zzp;
                                            while (i43 < i13) {
                                                if (i46 != 0) {
                                                    zzalw zzalwVar6 = zzalwVar;
                                                    i14 = i33;
                                                    i15 = zzeuVar.zzB();
                                                    zzalwVar2 = zzalwVar6;
                                                } else {
                                                    zzalwVar2 = zzalwVar;
                                                    i14 = i33;
                                                    i15 = zzalwVar2.zzb;
                                                }
                                                zzk(i15);
                                                if (i47 != 0) {
                                                    i16 = i13;
                                                    i17 = zzeuVar.zzB();
                                                } else {
                                                    i16 = i13;
                                                    i17 = zzalwVar2.zzc;
                                                }
                                                zzk(i17);
                                                if (i48 != 0) {
                                                    i18 = zzeuVar.zzB();
                                                } else {
                                                    if (i43 == 0) {
                                                        if (z5) {
                                                            i18 = i50;
                                                            i43 = 0;
                                                        } else {
                                                            i43 = 0;
                                                        }
                                                    }
                                                    i18 = i45;
                                                }
                                                if (i12 != 0) {
                                                    z2 = z5;
                                                    zzalwVar3 = zzalwVar2;
                                                    i19 = i46;
                                                    i20 = zzeuVar.zzB();
                                                } else {
                                                    z2 = z5;
                                                    zzalwVar3 = zzalwVar2;
                                                    i19 = i46;
                                                    i20 = 0;
                                                }
                                                long zzw = zzfm.zzw((i20 + j9) - j2, 1000000L, j8, RoundingMode.DOWN);
                                                jArr2[i43] = zzw;
                                                int i51 = i48;
                                                if (zzamyVar2.zzq) {
                                                    j3 = j2;
                                                    zzamcVar2 = zzamcVar4;
                                                } else {
                                                    zzamcVar2 = zzamcVar4;
                                                    j3 = j2;
                                                    jArr2[i43] = zzw + zzamcVar2.zzd.zzi;
                                                }
                                                iArr[i43] = i17;
                                                if (((i18 >> 16) & 1) == 0) {
                                                    if (!z6) {
                                                        z3 = true;
                                                    } else if (i43 == 0) {
                                                        z3 = true;
                                                        i43 = 0;
                                                    }
                                                    zArr[i43] = z3;
                                                    j9 += i15;
                                                    i43++;
                                                    zzamcVar4 = zzamcVar2;
                                                    i48 = i51;
                                                    j2 = j3;
                                                    i33 = i14;
                                                    i13 = i16;
                                                    z5 = z2;
                                                    i46 = i19;
                                                    zzalwVar = zzalwVar3;
                                                }
                                                z3 = false;
                                                zArr[i43] = z3;
                                                j9 += i15;
                                                i43++;
                                                zzamcVar4 = zzamcVar2;
                                                i48 = i51;
                                                j2 = j3;
                                                i33 = i14;
                                                i13 = i16;
                                                z5 = z2;
                                                i46 = i19;
                                                zzalwVar = zzalwVar3;
                                            }
                                            i9 = i33;
                                            zzamcVar = zzamcVar4;
                                            zzamyVar2.zzp = j9;
                                            i42 = i44;
                                            i43 = i13;
                                        }
                                    } else {
                                        i8 = i41;
                                        i12 = i49;
                                        list3 = list9;
                                    }
                                    zzeuVar = zzeuVar7;
                                    zzalwVar = zzalwVar5;
                                    j2 = 0;
                                    int[] iArr2 = zzamyVar2.zzh;
                                    long[] jArr22 = zzamyVar2.zzi;
                                    boolean[] zArr2 = zzamyVar2.zzj;
                                    if (zzamwVar3.zzb == 2) {
                                    }
                                    i13 = zzamyVar2.zzg[i42] + i43;
                                    zzamc zzamcVar42 = zzamcVar3;
                                    long j82 = zzamwVar3.zzc;
                                    long j92 = zzamyVar2.zzp;
                                    while (i43 < i13) {
                                    }
                                    i9 = i33;
                                    zzamcVar = zzamcVar42;
                                    zzamyVar2.zzp = j92;
                                    i42 = i44;
                                    i43 = i13;
                                } else {
                                    i8 = i41;
                                    sparseArray2 = sparseArray5;
                                    i9 = i33;
                                    zzfzVar2 = zzfzVar4;
                                    bArr4 = bArr5;
                                    i10 = i34;
                                    zzfzVar3 = zzfzVar5;
                                    list3 = list9;
                                    i11 = size4;
                                    zzamcVar = zzamcVar3;
                                }
                                i41 = i8 + 1;
                                zzamcVar3 = zzamcVar;
                                size4 = i11;
                                sparseArray5 = sparseArray2;
                                zzfzVar4 = zzfzVar2;
                                bArr5 = bArr4;
                                i34 = i10;
                                zzfzVar5 = zzfzVar3;
                                list9 = list3;
                                i33 = i9;
                                i6 = 1953658222;
                            }
                            sparseArray = sparseArray5;
                            i2 = i33;
                            zzfzVar = zzfzVar4;
                            byte[] bArr6 = bArr5;
                            i4 = i34;
                            zzfz zzfzVar6 = zzfzVar5;
                            List list10 = list9;
                            zzamw zzamwVar4 = zzamcVar3.zzd.zza;
                            zzalw zzalwVar7 = zzamyVar2.zza;
                            zzalwVar7.getClass();
                            zzamx zza4 = zzamwVar4.zza(zzalwVar7.zza);
                            zzga zzc6 = zzfzVar6.zzc(1935763834);
                            if (zzc6 != null) {
                                zza4.getClass();
                                int i52 = zza4.zzd;
                                zzeu zzeuVar8 = zzc6.zza;
                                zzeuVar8.zzh(8);
                                if ((zzeuVar8.zzB() & 1) == 1) {
                                    zzeuVar8.zzk(8);
                                }
                                int zzs2 = zzeuVar8.zzs();
                                int zzH2 = zzeuVar8.zzH();
                                int i53 = zzamyVar2.zze;
                                if (zzH2 > i53) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(zzH2).length() + 56 + String.valueOf(i53).length());
                                    sb.append("Saiz sample count ");
                                    sb.append(zzH2);
                                    sb.append(" is greater than fragment sample count");
                                    sb.append(i53);
                                    throw zzat.zzb(sb.toString(), null);
                                }
                                if (zzs2 == 0) {
                                    boolean[] zArr3 = zzamyVar2.zzl;
                                    i7 = 0;
                                    for (int i54 = 0; i54 < zzH2; i54++) {
                                        int zzs3 = zzeuVar8.zzs();
                                        i7 += zzs3;
                                        zArr3[i54] = zzs3 > i52;
                                    }
                                    z = false;
                                } else {
                                    boolean z7 = zzs2 > i52;
                                    i7 = zzs2 * zzH2;
                                    z = false;
                                    Arrays.fill(zzamyVar2.zzl, 0, zzH2, z7);
                                }
                                Arrays.fill(zzamyVar2.zzl, zzH2, zzamyVar2.zze, z);
                                if (i7 > 0) {
                                    zzamyVar2.zza(i7);
                                }
                            }
                            zzga zzc7 = zzfzVar6.zzc(1935763823);
                            if (zzc7 != null) {
                                zzeu zzeuVar9 = zzc7.zza;
                                zzeuVar9.zzh(8);
                                int zzB4 = zzeuVar9.zzB();
                                if ((zzB4 & 1) == 1) {
                                    zzeuVar9.zzk(8);
                                }
                                int zzH3 = zzeuVar9.zzH();
                                if (zzH3 != 1) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzH3).length() + 29);
                                    sb2.append("Unexpected saio entry count: ");
                                    sb2.append(zzH3);
                                    throw zzat.zzb(sb2.toString(), null);
                                }
                                zzamyVar2.zzc += zzalv.zza(zzB4) == 0 ? zzeuVar9.zzz() : zzeuVar9.zzJ();
                            }
                            zzga zzc8 = zzfzVar6.zzc(1936027235);
                            if (zzc8 != null) {
                                zzl(zzc8.zza, 0, zzamyVar2);
                            }
                            String str3 = zza4 != null ? zza4.zzb : null;
                            zzeu zzeuVar10 = null;
                            zzeu zzeuVar11 = null;
                            int i55 = 0;
                            while (i55 < list10.size()) {
                                List list11 = list10;
                                zzga zzgaVar4 = (zzga) list11.get(i55);
                                zzeu zzeuVar12 = zzgaVar4.zza;
                                int i56 = zzgaVar4.zzd;
                                if (i56 == 1935828848) {
                                    zzeuVar12.zzh(12);
                                    if (zzeuVar12.zzB() == 1936025959) {
                                        zzeuVar10 = zzeuVar12;
                                    }
                                } else if (i56 == 1936158820) {
                                    zzeuVar12.zzh(12);
                                    if (zzeuVar12.zzB() == 1936025959) {
                                        zzeuVar11 = zzeuVar12;
                                    }
                                }
                                i55++;
                                list10 = list11;
                            }
                            List list12 = list10;
                            if (zzeuVar10 != null && zzeuVar11 != null) {
                                zzeuVar10.zzh(8);
                                int zza5 = zzalv.zza(zzeuVar10.zzB());
                                zzeuVar10.zzk(4);
                                if (zza5 == 1) {
                                    zzeuVar10.zzk(4);
                                }
                                if (zzeuVar10.zzB() != 1) {
                                    throw zzat.zzc("Entry count in sbgp != 1 (unsupported).");
                                }
                                zzeuVar11.zzh(8);
                                int zza6 = zzalv.zza(zzeuVar11.zzB());
                                zzeuVar11.zzk(4);
                                if (zza6 == 1) {
                                    if (zzeuVar11.zzz() == 0) {
                                        throw zzat.zzc("Variable length description in sgpd found (unsupported)");
                                    }
                                } else if (zza6 >= 2) {
                                    zzeuVar11.zzk(4);
                                }
                                if (zzeuVar11.zzz() != 1) {
                                    throw zzat.zzc("Entry count in sgpd != 1 (unsupported).");
                                }
                                zzeuVar11.zzk(1);
                                int zzs4 = zzeuVar11.zzs();
                                int i57 = (zzs4 & 240) >> 4;
                                int i58 = zzs4 & 15;
                                if (zzeuVar11.zzs() == 1) {
                                    int zzs5 = zzeuVar11.zzs();
                                    byte[] bArr7 = new byte[16];
                                    zzeuVar11.zzm(bArr7, 0, 16);
                                    if (zzs5 == 0) {
                                        int zzs6 = zzeuVar11.zzs();
                                        byte[] bArr8 = new byte[zzs6];
                                        zzeuVar11.zzm(bArr8, 0, zzs6);
                                        bArr3 = bArr8;
                                    } else {
                                        bArr3 = null;
                                    }
                                    zzamyVar2.zzk = true;
                                    zzamyVar2.zzm = new zzamx(true, str3, zzs5, bArr7, i57, i58, bArr3);
                                }
                            }
                            int size5 = list12.size();
                            int i59 = 0;
                            while (i59 < size5) {
                                zzga zzgaVar5 = (zzga) list12.get(i59);
                                if (zzgaVar5.zzd == 1970628964) {
                                    zzeu zzeuVar13 = zzgaVar5.zza;
                                    zzeuVar13.zzh(8);
                                    bArr2 = bArr6;
                                    zzeuVar13.zzm(bArr2, 0, 16);
                                    if (Arrays.equals(bArr2, zza)) {
                                        zzl(zzeuVar13, 16, zzamyVar2);
                                    }
                                } else {
                                    bArr2 = bArr6;
                                }
                                i59++;
                                bArr6 = bArr2;
                            }
                            bArr = bArr6;
                        }
                        i5 = 8;
                    } else {
                        sparseArray = sparseArray5;
                        i2 = i33;
                        zzfzVar = zzfzVar4;
                        bArr = bArr5;
                        list2 = list8;
                        i3 = size3;
                        i4 = i34;
                        i5 = i23;
                    }
                    i34 = i4 + 1;
                    i23 = i5;
                    bArr5 = bArr;
                    list8 = list2;
                    size3 = i3;
                    sparseArray5 = sparseArray;
                    zzfzVar4 = zzfzVar;
                    i33 = i2;
                }
                SparseArray sparseArray6 = sparseArray5;
                zzq zzn2 = zzn(zzfzVar4.zzb);
                if (zzn2 != null) {
                    int size6 = sparseArray6.size();
                    for (int i60 = 0; i60 < size6; i60++) {
                        ((zzamc) sparseArray6.valueAt(i60)).zzb(zzn2);
                    }
                }
                zzamdVar = this;
                if (zzamdVar.zzz != -9223372036854775807L) {
                    int size7 = sparseArray6.size();
                    for (int i61 = 0; i61 < size7; i61++) {
                        zzamc zzamcVar5 = (zzamc) sparseArray6.valueAt(i61);
                        long j10 = zzamdVar.zzz;
                        int i62 = zzamcVar5.zzf;
                        while (true) {
                            zzamy zzamyVar3 = zzamcVar5.zzb;
                            if (i62 < zzamyVar3.zze && zzamyVar3.zzi[i62] <= j10) {
                                if (zzamyVar3.zzj[i62]) {
                                    zzamcVar5.zzi = i62;
                                }
                                i62++;
                            }
                        }
                    }
                    zzamdVar.zzz = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((zzfz) arrayDeque.peek()).zzb(zzfzVar4);
            }
        }
    }

    private static int zzk(int i) throws zzat {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw zzat.zzb(sb.toString(), null);
    }

    private static void zzl(zzeu zzeuVar, int i, zzamy zzamyVar) throws zzat {
        zzeuVar.zzh(i + 8);
        int zzB = zzeuVar.zzB();
        int i2 = zzalv.zza;
        if ((zzB & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzB & 2) != 0;
        int zzH = zzeuVar.zzH();
        if (zzH == 0) {
            Arrays.fill(zzamyVar.zzl, 0, zzamyVar.zze, false);
            return;
        }
        int i3 = zzamyVar.zze;
        if (zzH != i3) {
            StringBuilder sb = new StringBuilder(String.valueOf(zzH).length() + 58 + String.valueOf(i3).length());
            sb.append("Senc sample count ");
            sb.append(zzH);
            sb.append(" is different from fragment sample count");
            sb.append(i3);
            throw zzat.zzb(sb.toString(), null);
        }
        Arrays.fill(zzamyVar.zzl, 0, zzH, z);
        zzamyVar.zza(zzeuVar.zzd());
        zzeu zzeuVar2 = zzamyVar.zzn;
        zzeuVar.zzm(zzeuVar2.zzi(), 0, zzeuVar2.zze());
        zzeuVar2.zzh(0);
        zzamyVar.zzo = false;
    }

    private static Pair zzm(zzeu zzeuVar, long j) throws zzat {
        long zzJ;
        long zzJ2;
        zzeuVar.zzh(8);
        int zza2 = zzalv.zza(zzeuVar.zzB());
        zzeuVar.zzk(4);
        long zzz = zzeuVar.zzz();
        if (zza2 == 0) {
            zzJ = zzeuVar.zzz();
            zzJ2 = zzeuVar.zzz();
        } else {
            zzJ = zzeuVar.zzJ();
            zzJ2 = zzeuVar.zzJ();
        }
        long j2 = zzJ;
        long j3 = j + zzJ2;
        long zzw = zzfm.zzw(j2, 1000000L, zzz, RoundingMode.DOWN);
        zzeuVar.zzk(2);
        int zzt = zzeuVar.zzt();
        int[] iArr = new int[zzt];
        long[] jArr = new long[zzt];
        long[] jArr2 = new long[zzt];
        long[] jArr3 = new long[zzt];
        long j4 = zzw;
        int i = 0;
        long j5 = j2;
        while (i < zzt) {
            int zzB = zzeuVar.zzB();
            if ((Integer.MIN_VALUE & zzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long zzz2 = zzeuVar.zzz();
            iArr[i] = zzB & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            long j6 = j5 + zzz2;
            long[] jArr4 = jArr3;
            long[] jArr5 = jArr2;
            int i2 = zzt;
            long zzw2 = zzfm.zzw(j6, 1000000L, zzz, RoundingMode.DOWN);
            jArr5[i] = zzw2 - jArr4[i];
            zzeuVar.zzk(4);
            j3 += r1[i];
            i++;
            iArr = iArr;
            jArr2 = jArr5;
            jArr = jArr;
            zzt = i2;
            jArr3 = jArr4;
            j5 = j6;
            j4 = zzw2;
        }
        return Pair.create(Long.valueOf(zzw), new zzafv(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzq zzn(List list) {
        int i;
        ArrayList arrayList;
        UUID[] uuidArr;
        zzamr zzamrVar;
        UUID uuid;
        int size = list.size();
        int i2 = 0;
        ArrayList arrayList2 = null;
        while (i2 < size) {
            zzga zzgaVar = (zzga) list.get(i2);
            if (zzgaVar.zzd == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] zzi = zzgaVar.zza.zzi();
                zzeu zzeuVar = new zzeu(zzi);
                if (zzeuVar.zze() >= 32) {
                    zzeuVar.zzh(0);
                    int zzd = zzeuVar.zzd();
                    int zzB = zzeuVar.zzB();
                    if (zzB != zzd) {
                        StringBuilder sb = new StringBuilder(String.valueOf(zzB).length() + 52 + String.valueOf(zzd).length());
                        sb.append("Advertised atom size (");
                        sb.append(zzB);
                        sb.append(") does not match buffer size: ");
                        sb.append(zzd);
                        zzeh.zzc("PsshAtomUtil", sb.toString());
                    } else {
                        int zzB2 = zzeuVar.zzB();
                        if (zzB2 != 1886614376) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(zzB2).length() + 23);
                            sb2.append("Atom type is not pssh: ");
                            sb2.append(zzB2);
                            zzeh.zzc("PsshAtomUtil", sb2.toString());
                        } else {
                            int zza2 = zzalv.zza(zzeuVar.zzB());
                            if (zza2 > 1) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(zza2).length() + 26);
                                sb3.append("Unsupported pssh version: ");
                                sb3.append(zza2);
                                zzeh.zzc("PsshAtomUtil", sb3.toString());
                            } else {
                                UUID uuid2 = new UUID(zzeuVar.zzD(), zzeuVar.zzD());
                                if (zza2 == 1) {
                                    int zzH = zzeuVar.zzH();
                                    uuidArr = new UUID[zzH];
                                    int i3 = 0;
                                    while (i3 < zzH) {
                                        uuidArr[i3] = new UUID(zzeuVar.zzD(), zzeuVar.zzD());
                                        i3++;
                                        i2 = i2;
                                        arrayList2 = arrayList2;
                                    }
                                    i = i2;
                                    arrayList = arrayList2;
                                } else {
                                    i = i2;
                                    arrayList = arrayList2;
                                    uuidArr = null;
                                }
                                int zzH2 = zzeuVar.zzH();
                                int zzd2 = zzeuVar.zzd();
                                if (zzH2 != zzd2) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(zzH2).length() + 49 + String.valueOf(zzd2).length());
                                    sb4.append("Atom data size (");
                                    sb4.append(zzH2);
                                    sb4.append(") does not match the bytes left: ");
                                    sb4.append(zzd2);
                                    zzeh.zzc("PsshAtomUtil", sb4.toString());
                                    zzamrVar = null;
                                    uuid = zzamrVar == null ? null : zzamrVar.zza;
                                    if (uuid == null) {
                                        zzeh.zzc("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                        arrayList2 = arrayList;
                                    } else {
                                        arrayList2 = arrayList;
                                        arrayList2.add(new zzp(uuid, null, "video/mp4", zzi));
                                        i2 = i + 1;
                                    }
                                } else {
                                    byte[] bArr = new byte[zzH2];
                                    zzeuVar.zzm(bArr, 0, zzH2);
                                    zzamrVar = new zzamr(uuid2, zza2, bArr, uuidArr);
                                    if (zzamrVar == null) {
                                    }
                                    if (uuid == null) {
                                    }
                                }
                            }
                        }
                    }
                }
                i = i2;
                arrayList = arrayList2;
                zzamrVar = null;
                if (zzamrVar == null) {
                }
                if (uuid == null) {
                }
            } else {
                i = i2;
            }
            i2 = i + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new zzq(arrayList2);
    }

    private final void zzo(zzahk zzahkVar, zzahh zzahhVar) {
        this.zzI.zzw(zzahkVar);
        this.zzL = true;
        zzahhVar.zza = this.zzO;
        zzi();
    }

    private static final zzalw zzp(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzalw) sparseArray.valueAt(0);
        }
        zzalw zzalwVar = (zzalw) sparseArray.get(i);
        zzalwVar.getClass();
        return zzalwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        zzaho zza2 = zzamu.zza(zzagiVar);
        this.zzr = zza2 != null ? zzgxm.zzj(zza2) : zzgxm.zzi();
        return zza2 == null;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        int i;
        int i2 = this.zzd;
        if ((i2 & 32) == 0) {
            zzagkVar = new zzaoa(zzagkVar, this.zzc);
        }
        this.zzI = zzagkVar;
        zzi();
        zzaht[] zzahtVarArr = new zzaht[2];
        this.zzJ = zzahtVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            zzahtVarArr[0] = this.zzI.zzs(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        zzaht[] zzahtVarArr2 = (zzaht[]) zzfm.zzb(this.zzJ, i);
        this.zzJ = zzahtVarArr2;
        for (zzaht zzahtVar : zzahtVarArr2) {
            zzahtVar.zzA(zzb);
        }
        List list = this.zze;
        this.zzK = new zzaht[list.size()];
        while (i4 < this.zzK.length) {
            zzaht zzs = this.zzI.zzs(i3, 3);
            zzs.zzA((zzv) list.get(i4));
            this.zzK[i4] = zzs;
            i4++;
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x0097, code lost:
    
        if (r0.zzs != 3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0099, code lost:
    
        r0.zzD = r3.zzf();
        r2 = r3.zzd.zza.zzg.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00ad, code lost:
    
        if (java.util.Objects.equals(r2, "video/avc") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x00b3, code lost:
    
        if ((r0.zzd & 64) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00b5, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00c7, code lost:
    
        r0.zzG = !r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x00ce, code lost:
    
        if (r3.zzf >= r3.zzi) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00d0, code lost:
    
        r1.zzf(r0.zzD);
        r1 = r3.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00d9, code lost:
    
        if (r1 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x00dc, code lost:
    
        r2 = r3.zzb;
        r4 = r2.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x00e2, code lost:
    
        if (r1 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x00e4, code lost:
    
        r4.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x00ed, code lost:
    
        if (r2.zzb(r3.zzf) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x00ef, code lost:
    
        r4.zzk(r4.zzt() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x00fb, code lost:
    
        if (r3.zzh() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x00fd, code lost:
    
        r0.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x00ff, code lost:
    
        r0.zzs = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0101, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x010a, code lost:
    
        if (r3.zzd.zza.zzh != 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x010c, code lost:
    
        r0.zzD -= 8;
        r1.zzf(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0123, code lost:
    
        if ("audio/ac4".equals(r3.zzd.zza.zzg.zzp) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0125, code lost:
    
        r0.zzE = r3.zzi(r0.zzD, 7);
        r2 = r0.zzD;
        r5 = r0.zzk;
        com.google.android.gms.internal.ads.zzafk.zzc(r2, r5);
        r3.zza.zzc(r5, 7);
        r2 = r0.zzE + 7;
        r0.zzE = r2;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x014a, code lost:
    
        r0.zzD += r2;
        r0.zzs = 4;
        r0.zzF = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0156, code lost:
    
        r2 = r3.zzd.zza;
        r5 = r3.zza;
        r6 = r3.zzd();
        r8 = r2.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0162, code lost:
    
        if (r8 == 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0164, code lost:
    
        r9 = r0.zzh;
        r12 = r9.zzi();
        r12[r4] = r4;
        r12[1] = r4;
        r12[2] = r4;
        r4 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0177, code lost:
    
        if (r0.zzE >= r0.zzD) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0179, code lost:
    
        r13 = r0.zzF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x017b, code lost:
    
        if (r13 != 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0180, code lost:
    
        if (r0.zzK.length > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0184, code lost:
    
        if (r0.zzG != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0195, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0196, code lost:
    
        r1.zzc(r12, r4, r8 + r13);
        r9.zzh(0);
        r14 = r9.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x01a3, code lost:
    
        if (r14 < 0) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x01a5, code lost:
    
        r0.zzF = r14 - r13;
        r14 = r0.zzg;
        r14.zzh(0);
        r5.zzc(r14, 4);
        r0.zzE += 4;
        r0.zzD += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x01be, code lost:
    
        if (r0.zzK.length <= 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x01c0, code lost:
    
        if (r13 <= 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x01c8, code lost:
    
        if (com.google.android.gms.internal.ads.zzgr.zzb(r2.zzg, r12, 4) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01ca, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01cd, code lost:
    
        r0.zzH = r11;
        r5.zzc(r9, r13);
        r0.zzE += r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01d7, code lost:
    
        if (r13 <= 0) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01db, code lost:
    
        if (r0.zzG != false) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01e4, code lost:
    
        if (com.google.android.gms.internal.ads.zzgr.zzd(r12, 4, r13, r2.zzg) == false) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01e6, code lost:
    
        r0.zzG = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01cc, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01f0, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0186, code lost:
    
        r13 = com.google.android.gms.internal.ads.zzgr.zzc(r2.zzg);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0193, code lost:
    
        if ((r8 + r13) <= (r0.zzD - r0.zzE)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x01f3, code lost:
    
        if (r0.zzH == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x01f5, code lost:
    
        r11 = r0.zzi;
        r11.zza(r13);
        r1.zzc(r11.zzi(), 0, r0.zzF);
        r5.zzc(r11, r0.zzF);
        r13 = r0.zzF;
        r10 = com.google.android.gms.internal.ads.zzgr.zza(r11.zzi(), r11.zze());
        r11.zzh(0);
        r11.zzf(r10);
        r10 = r2.zzg.zzr;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0222, code lost:
    
        if (r10 != (-1)) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0224, code lost:
    
        r10 = r0.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x022a, code lost:
    
        if (r10.zzb() == 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x022c, code lost:
    
        r10.zza(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x023b, code lost:
    
        r10 = r0.zzp;
        r10.zzc(r6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0246, code lost:
    
        if ((r3.zzg() & 4) == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0248, code lost:
    
        r10.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0251, code lost:
    
        r0.zzE += r13;
        r0.zzF -= r13;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0230, code lost:
    
        r14 = r0.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0236, code lost:
    
        if (r14.zzb() == r10) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0238, code lost:
    
        r14.zza(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x024c, code lost:
    
        r13 = r5.zza(r1, r13, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x02a8, code lost:
    
        r1 = r3.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x02ae, code lost:
    
        if (r0.zzG != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x02b0, code lost:
    
        r1 = r1 | androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x02b3, code lost:
    
        r19 = r1;
        r1 = r3.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x02b9, code lost:
    
        if (r1 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x02bb, code lost:
    
        r22 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x02c2, code lost:
    
        r5.zze(r6, r19, r0.zzD, 0, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x02cf, code lost:
    
        r1 = r0.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x02d5, code lost:
    
        if (r1.isEmpty() != false) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x02d7, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzama) r1.removeFirst();
        r2 = r0.zzy;
        r4 = r1.zzc;
        r0.zzy = r2 - r4;
        r8 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x02e8, code lost:
    
        if (r1.zzb == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x02ea, code lost:
    
        r8 = r8 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x02eb, code lost:
    
        r1 = r8;
        r5 = r0.zzJ;
        r15 = r5.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x02f0, code lost:
    
        if (r14 >= r15) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x02f2, code lost:
    
        r5[r14].zze(r1, 1, r4, r0.zzy, null);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0309, code lost:
    
        if (r3.zzh() != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x030b, code lost:
    
        r0.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x030e, code lost:
    
        r0.zzs = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x02c0, code lost:
    
        r22 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0260, code lost:
    
        r4 = r3.zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0264, code lost:
    
        if (r4 != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x026f, code lost:
    
        if (com.google.android.gms.internal.ads.zzagg.zza(r2.zzg.zzp) == false) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0271, code lost:
    
        r3.zzn(com.google.android.gms.internal.ads.zzagg.zzi(r1, r0.zzD, r3.zzm()));
        r2 = r3.zzm().zza();
        r2.zzs(r4.zzt);
        r5.zzA(r2.zzQ());
        r3.zzl(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0296, code lost:
    
        r2 = r0.zzE;
        r4 = r0.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x029a, code lost:
    
        if (r2 >= r4) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x029c, code lost:
    
        r0.zzE += r5.zza(r1, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0141, code lost:
    
        r4 = 0;
        r2 = r3.zzi(r0.zzD, 0);
        r0.zzE = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x00c6, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00bd, code lost:
    
        if (java.util.Objects.equals(r2, "video/hevc") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x00c3, code lost:
    
        if ((r0.zzd & 128) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0155, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x089c, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzc("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x051c A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        zzagi zzagiVar2;
        zzamd zzamdVar;
        long zzw;
        long zzw2;
        String str;
        String str2;
        long zzz;
        long j;
        int i;
        zzamd zzamdVar2;
        int i2;
        int i3;
        SparseArray sparseArray;
        long zzz2;
        int i4;
        int i5;
        zzamd zzamdVar3 = this;
        zzagi zzagiVar3 = zzagiVar;
        zzahh zzahhVar2 = zzahhVar;
        while (true) {
            int i6 = zzamdVar3.zzs;
            int i7 = 8;
            boolean z = true;
            if (i6 == 0) {
                zzagiVar2 = zzagiVar3;
                zzamdVar = zzamdVar3;
                if (zzamdVar.zzv == 0) {
                    zzeu zzeuVar = zzamdVar.zzm;
                    if (!zzagiVar2.zzb(zzeuVar.zzi(), 0, 8, true)) {
                        long j2 = zzamdVar.zzN;
                        if (j2 == -1) {
                            zzamdVar.zzp.zze();
                            return -1;
                        }
                        zzahhVar2.zza = j2;
                        zzamdVar.zzN = -1L;
                        zzamdVar.zzI.zzw(zzamdVar.zzq.zzb());
                        zzamdVar.zzM = true;
                        return 1;
                    }
                    zzamdVar.zzv = 8;
                    zzeuVar.zzh(0);
                    zzamdVar.zzu = zzeuVar.zzz();
                    zzamdVar.zzt = zzeuVar.zzB();
                }
                long j3 = zzamdVar.zzu;
                if (j3 == 1) {
                    zzeu zzeuVar2 = zzamdVar.zzm;
                    zzagiVar2.zzc(zzeuVar2.zzi(), 8, 8);
                    zzamdVar.zzv += 8;
                    zzamdVar.zzu = zzeuVar2.zzJ();
                } else if (j3 == 0) {
                    long zzo = zzagiVar.zzo();
                    if (zzo == -1) {
                        ArrayDeque arrayDeque = zzamdVar.zzn;
                        zzo = !arrayDeque.isEmpty() ? ((zzfz) arrayDeque.peek()).zza : -1L;
                    }
                    if (zzo != -1) {
                        zzamdVar.zzu = (zzo - zzagiVar.zzn()) + zzamdVar.zzv;
                    }
                }
                long j4 = zzamdVar.zzu;
                int i8 = zzamdVar.zzv;
                long j5 = i8;
                if (j4 < j5) {
                    if (zzamdVar.zzt != 1718773093 || i8 != 8) {
                        break;
                    }
                    zzamdVar.zzu = j5;
                    j4 = j5;
                }
                if (zzamdVar.zzN != -1) {
                    if (zzamdVar.zzt == 1936286840) {
                        zzeu zzeuVar3 = zzamdVar.zzk;
                        zzeuVar3.zza((int) j4);
                        System.arraycopy(zzamdVar.zzm.zzi(), 0, zzeuVar3.zzi(), 0, 8);
                        zzagiVar2.zzc(zzeuVar3.zzi(), 8, (int) (zzamdVar.zzu - zzamdVar.zzv));
                        zzamdVar.zzq.zza((zzafv) zzm(new zzga(1936286840, zzeuVar3).zza, zzagiVar.zzm()).second);
                    } else {
                        zzagiVar2.zze((int) (j4 - j5), true);
                    }
                    zzi();
                } else {
                    long zzn = zzagiVar.zzn() - j5;
                    int i9 = zzamdVar.zzt;
                    if ((i9 == 1836019558 || i9 == 1835295092) && !zzamdVar.zzL) {
                        if (zzagiVar.zzo() == -1 || zzamdVar.zzO != -1 || (zzamdVar.zzd & 512) == 0) {
                            zzamdVar.zzI.zzw(new zzahj(zzamdVar.zzA, zzn));
                            zzamdVar.zzL = true;
                        } else {
                            zzamdVar.zzO = zzn;
                            zzahhVar2.zza = zzagiVar.zzo() - 16;
                            zzamdVar.zzs = 5;
                        }
                    }
                    if (zzamdVar.zzt == 1836019558) {
                        SparseArray sparseArray2 = zzamdVar.zzf;
                        int size = sparseArray2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            zzamy zzamyVar = ((zzamc) sparseArray2.valueAt(i10)).zzb;
                            zzamyVar.zzc = zzn;
                            zzamyVar.zzb = zzn;
                        }
                    }
                    int i11 = zzamdVar.zzt;
                    if (i11 == 1835295092) {
                        zzamdVar.zzC = null;
                        zzamdVar.zzx = zzn + zzamdVar.zzu;
                        zzamdVar.zzs = 2;
                    } else if (i11 == 1836019574 || i11 == 1953653099 || i11 == 1835297121 || i11 == 1835626086 || i11 == 1937007212 || i11 == 1836019558 || i11 == 1953653094 || i11 == 1836475768 || i11 == 1701082227 || i11 == 1835365473) {
                        long zzn2 = zzagiVar.zzn();
                        long j6 = zzamdVar.zzu;
                        long j7 = zzn2 + j6;
                        if (j6 != zzamdVar.zzv && i11 == 1835365473) {
                            zzeu zzeuVar4 = zzamdVar.zzk;
                            zzeuVar4.zza(8);
                            zzagiVar2.zzi(zzeuVar4.zzi(), 0, 8);
                            zzalv.zzf(zzeuVar4);
                            zzagiVar2.zzf(zzeuVar4.zzg());
                            zzagiVar.zzl();
                        }
                        long j8 = j7 - 8;
                        zzamdVar.zzn.push(new zzfz(zzamdVar.zzt, j8));
                        if (zzamdVar.zzu == zzamdVar.zzv) {
                            zzamdVar.zzj(j8);
                        } else {
                            zzi();
                        }
                    } else if (i11 == 1751411826 || i11 == 1835296868 || i11 == 1836476516 || i11 == 1936286840 || i11 == 1937011556 || i11 == 1937011827 || i11 == 1668576371 || i11 == 1937011555 || i11 == 1937011578 || i11 == 1937013298 || i11 == 1937007471 || i11 == 1668232756 || i11 == 1937011571 || i11 == 1952867444 || i11 == 1952868452 || i11 == 1953196132 || i11 == 1953654136 || i11 == 1953658222 || i11 == 1886614376 || i11 == 1935763834 || i11 == 1935763823 || i11 == 1936027235 || i11 == 1970628964 || i11 == 1935828848 || i11 == 1936158820 || i11 == 1701606260 || i11 == 1835362404 || i11 == 1701671783 || i11 == 1969517665 || i11 == 1801812339 || i11 == 1768715124) {
                        if (zzamdVar.zzv != 8) {
                            throw zzat.zzc("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (zzamdVar.zzu > 2147483647L) {
                            throw zzat.zzc("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        zzeu zzeuVar5 = new zzeu((int) zzamdVar.zzu);
                        System.arraycopy(zzamdVar.zzm.zzi(), 0, zzeuVar5.zzi(), 0, 8);
                        zzamdVar.zzw = zzeuVar5;
                        zzamdVar.zzs = 1;
                    } else {
                        if (zzamdVar.zzu > 2147483647L) {
                            throw zzat.zzc("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        zzamdVar.zzw = null;
                        zzamdVar.zzs = 1;
                    }
                }
                if (zzamdVar.zzs == 5) {
                    return 1;
                }
            } else if (i6 != 1) {
                long j9 = Long.MAX_VALUE;
                if (i6 == 2) {
                    zzagiVar2 = zzagiVar3;
                    zzamdVar = zzamdVar3;
                    SparseArray sparseArray3 = zzamdVar.zzf;
                    int size2 = sparseArray3.size();
                    zzamc zzamcVar = null;
                    for (int i12 = 0; i12 < size2; i12++) {
                        zzamy zzamyVar2 = ((zzamc) sparseArray3.valueAt(i12)).zzb;
                        if (zzamyVar2.zzo) {
                            long j10 = zzamyVar2.zzc;
                            if (j10 < j9) {
                                zzamcVar = (zzamc) sparseArray3.valueAt(i12);
                                j9 = j10;
                            }
                        }
                    }
                    if (zzamcVar == null) {
                        zzamdVar.zzs = 3;
                    } else {
                        int zzn3 = (int) (j9 - zzagiVar.zzn());
                        if (zzn3 < 0) {
                            throw zzat.zzb("Offset to encryption data was negative.", null);
                        }
                        zzagiVar2.zzf(zzn3);
                        zzamy zzamyVar3 = zzamcVar.zzb;
                        zzeu zzeuVar6 = zzamyVar3.zzn;
                        zzagiVar2.zzc(zzeuVar6.zzi(), 0, zzeuVar6.zze());
                        zzeuVar6.zzh(0);
                        zzamyVar3.zzo = false;
                    }
                } else if (i6 == 5) {
                    zzamdVar = zzamdVar3;
                    zzeu zzeuVar7 = zzamdVar.zzk;
                    zzeuVar7.zza(16);
                    zzagiVar2 = zzagiVar;
                    if (zzagiVar2.zzb(zzeuVar7.zzi(), 0, 16, true)) {
                        zzeuVar7.zzh(0);
                        int zzB = zzeuVar7.zzB();
                        int zzB2 = zzeuVar7.zzB();
                        if (zzB == 16 && zzB2 == 1835430511) {
                            zzeuVar7.zzk(4);
                            long zzz3 = zzeuVar7.zzz();
                            long zzo2 = zzagiVar.zzo() - zzz3;
                            if (zzz3 <= 0 || zzz3 > 2147483647L || zzo2 < 0 || zzo2 < zzamdVar.zzO) {
                                zzamdVar.zzo(new zzahj(zzamdVar.zzA, zzamdVar.zzO), zzahhVar2);
                            } else {
                                zzahhVar2.zza = zzo2;
                                zzamdVar.zzs = 6;
                            }
                        } else {
                            zzamdVar.zzo(new zzahj(zzamdVar.zzA, zzamdVar.zzO), zzahhVar2);
                        }
                    } else {
                        zzamdVar.zzo(new zzahj(zzamdVar.zzA, zzamdVar.zzO), zzahhVar2);
                    }
                    int i13 = zzamdVar.zzs;
                    if (i13 == 6 || i13 == 0) {
                        return 1;
                    }
                } else if (i6 != 6) {
                    zzamc zzamcVar2 = zzamdVar3.zzC;
                    if (zzamcVar2 != null) {
                        break;
                    }
                    SparseArray sparseArray4 = zzamdVar3.zzf;
                    int size3 = sparseArray4.size();
                    zzamc zzamcVar3 = null;
                    for (int i14 = 0; i14 < size3; i14++) {
                        zzamc zzamcVar4 = (zzamc) sparseArray4.valueAt(i14);
                        if ((zzamcVar4.zzo() || zzamcVar4.zzf != zzamcVar4.zzd.zzb) && (!zzamcVar4.zzo() || zzamcVar4.zzh != zzamcVar4.zzb.zzd)) {
                            long zze = zzamcVar4.zze();
                            if (zze < j9) {
                                j9 = zze;
                                zzamcVar3 = zzamcVar4;
                            }
                        }
                    }
                    if (zzamcVar3 == null) {
                        int zzn4 = (int) (zzamdVar3.zzx - zzagiVar.zzn());
                        if (zzn4 < 0) {
                            throw zzat.zzb("Offset to end of mdat was negative.", null);
                        }
                        zzagiVar3.zzf(zzn4);
                        zzi();
                    } else {
                        int zze2 = (int) (zzamcVar3.zze() - zzagiVar.zzn());
                        if (zze2 < 0) {
                            zzeh.zzc("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            zze2 = 0;
                        }
                        zzagiVar3.zzf(zze2);
                        zzamdVar3.zzC = zzamcVar3;
                        zzamcVar2 = zzamcVar3;
                    }
                } else {
                    long zzo3 = zzagiVar.zzo() - zzagiVar.zzn();
                    zzeu zzeuVar8 = zzamdVar3.zzk;
                    zzeuVar8.zza(8);
                    if (zzagiVar3.zzh(zzeuVar8.zzi(), 0, 8, true)) {
                        zzeuVar8.zzh(0);
                        int zzB3 = zzeuVar8.zzB();
                        if (zzeuVar8.zzB() != 1835430497) {
                            zzamdVar3.zzo(new zzahj(zzamdVar3.zzA, zzamdVar3.zzO), zzahhVar2);
                        } else {
                            int i15 = (int) zzo3;
                            zzeu zzeuVar9 = new zzeu(i15);
                            zzagiVar3.zzc(zzeuVar9.zzi(), 0, i15);
                            zzeuVar9.zzh(zzB3 == 1 ? 16 : 8);
                            SparseArray sparseArray5 = new SparseArray();
                            SparseArray sparseArray6 = new SparseArray();
                            while (zzeuVar9.zzd() >= i7) {
                                int zzg = zzeuVar9.zzg();
                                long zzz4 = zzeuVar9.zzz();
                                int zzB4 = zzeuVar9.zzB();
                                if (zzz4 == 1) {
                                    if (zzeuVar9.zzd() < i7) {
                                        break;
                                    }
                                    zzz4 = zzeuVar9.zzD();
                                } else if (zzz4 == 0) {
                                    zzz4 = zzeuVar9.zze() - zzg;
                                }
                                if (zzz4 < (zzz4 == 1 ? 16 : i7)) {
                                    break;
                                }
                                long j11 = zzg;
                                if (zzz4 > zzeuVar9.zze() - j11) {
                                    break;
                                }
                                if (zzB4 == 1952871009) {
                                    if (zzz4 < r8 + 16) {
                                        zzeuVar9.zzh((int) (j11 + zzz4));
                                    } else {
                                        int zza2 = zzalv.zza(zzeuVar9.zzB());
                                        int zzB5 = zzeuVar9.zzB();
                                        zzamc zzamcVar5 = (zzamc) zzamdVar3.zzf.get(zzB5);
                                        if (zzamcVar5 == null) {
                                            zzeuVar9.zzh((int) (j11 + zzz4));
                                        } else {
                                            long j12 = zzamcVar5.zzd.zza.zzc;
                                            int zzB6 = zzeuVar9.zzB();
                                            int i16 = zzB6 >> 4;
                                            int i17 = zzB6 >> 2;
                                            int i18 = zzB6 & 3;
                                            long zzz5 = zzeuVar9.zzz();
                                            int i19 = (i16 & 3) + 1;
                                            SparseArray sparseArray7 = sparseArray6;
                                            int i20 = (i17 & 3) + 1;
                                            int i21 = i18 + 1;
                                            if (((zza2 == 1 ? 16L : 8L) + i19 + i20 + i21) * zzz5 > zzeuVar9.zzd()) {
                                                zzeuVar9.zzh((int) (j11 + zzz4));
                                                zzamdVar3 = this;
                                                sparseArray6 = sparseArray7;
                                            } else {
                                                int i22 = (int) zzz5;
                                                long[] jArr = new long[i22];
                                                long[] jArr2 = new long[i22];
                                                int i23 = 0;
                                                while (i23 < i22) {
                                                    if (zza2 == 1) {
                                                        zzz2 = zzeuVar9.zzJ();
                                                        i4 = i22;
                                                        i5 = 1;
                                                    } else {
                                                        zzz2 = zzeuVar9.zzz();
                                                        i4 = i22;
                                                        i5 = zza2;
                                                    }
                                                    long j13 = zzz2;
                                                    long zzJ = i5 == 1 ? zzeuVar9.zzJ() : zzeuVar9.zzz();
                                                    zzeuVar9.zzk(i19 + i20 + i21);
                                                    jArr[i23] = zzfm.zzw(j13, 1000000L, j12, RoundingMode.DOWN);
                                                    jArr2[i23] = zzJ;
                                                    i23++;
                                                    i22 = i4;
                                                }
                                                sparseArray5.put(zzB5, jArr);
                                                sparseArray = sparseArray7;
                                                sparseArray.put(zzB5, jArr2);
                                            }
                                        }
                                    }
                                    i7 = 8;
                                } else {
                                    sparseArray = sparseArray6;
                                }
                                zzeuVar9.zzh((int) (j11 + zzz4));
                                sparseArray6 = sparseArray;
                                i7 = 8;
                                zzamdVar3 = this;
                            }
                            SparseArray sparseArray8 = sparseArray6;
                            if (sparseArray5.size() == 0) {
                                zzamdVar2 = this;
                                zzahhVar2 = zzahhVar;
                                zzamdVar2.zzo(new zzahj(zzamdVar2.zzA, zzamdVar2.zzO), zzahhVar2);
                            } else {
                                zzamdVar2 = this;
                                zzahhVar2 = zzahhVar;
                                int i24 = -1;
                                int i25 = -1;
                                for (int i26 = 0; i26 < sparseArray5.size(); i26++) {
                                    int keyAt = sparseArray5.keyAt(i26);
                                    zzamc zzamcVar6 = (zzamc) zzamdVar2.zzf.get(keyAt);
                                    if (zzamcVar6 != null) {
                                        int i27 = zzamcVar6.zzd.zza.zzb;
                                        if (i24 != -1) {
                                            i3 = i24;
                                        } else if (i27 == 2) {
                                            i24 = keyAt;
                                        } else {
                                            i3 = -1;
                                        }
                                        if (i25 == -1) {
                                            i25 = i27 == 1 ? keyAt : -1;
                                        }
                                        i24 = i3;
                                    }
                                }
                                if (i24 == -1) {
                                    if (i25 != -1) {
                                        i2 = i25;
                                        zzamdVar2.zzo(new zzamb(sparseArray5, sparseArray8, zzamdVar2.zzA, zzamdVar2.zzO, i2, null), zzahhVar2);
                                    } else {
                                        i24 = sparseArray5.keyAt(0);
                                    }
                                }
                                i2 = i24;
                                zzamdVar2.zzo(new zzamb(sparseArray5, sparseArray8, zzamdVar2.zzA, zzamdVar2.zzO, i2, null), zzahhVar2);
                            }
                            if (zzamdVar2.zzs != 0) {
                                return 1;
                            }
                            zzamdVar3 = zzamdVar2;
                            zzagiVar3 = zzagiVar;
                        }
                    } else {
                        zzamdVar3.zzo(new zzahj(zzamdVar3.zzA, zzamdVar3.zzO), zzahhVar2);
                    }
                    zzamdVar2 = zzamdVar3;
                    if (zzamdVar2.zzs != 0) {
                    }
                }
            } else {
                zzagiVar2 = zzagiVar3;
                zzamdVar = zzamdVar3;
                long j14 = zzamdVar.zzu - zzamdVar.zzv;
                zzeu zzeuVar10 = zzamdVar.zzw;
                int i28 = (int) j14;
                if (zzeuVar10 != null) {
                    zzagiVar2.zzc(zzeuVar10.zzi(), 8, i28);
                    zzga zzgaVar = new zzga(zzamdVar.zzt, zzeuVar10);
                    ArrayDeque arrayDeque2 = zzamdVar.zzn;
                    if (arrayDeque2.isEmpty()) {
                        int i29 = zzgaVar.zzd;
                        if (i29 == 1936286840) {
                            Pair zzm = zzm(zzgaVar.zza, zzagiVar.zzn());
                            zzafw zzafwVar = zzamdVar.zzq;
                            zzafwVar.zza((zzafv) zzm.second);
                            zzamdVar.zzB = ((Long) zzm.first).longValue();
                            if (zzamdVar.zzM) {
                                i = 1;
                            } else {
                                i = 1;
                                zzamdVar.zzI.zzw(zzafwVar.zzc() == 1 ? (zzahk) zzm.second : zzafwVar.zzb());
                                zzamdVar.zzL = true;
                            }
                            if ((zzamdVar.zzd & 256) != 0 && !zzamdVar.zzM && zzafwVar.zzc() > i) {
                                zzamdVar.zzN = zzagiVar.zzn();
                            }
                        } else if (i29 == 1701671783) {
                            zzeu zzeuVar11 = zzgaVar.zza;
                            if (zzamdVar.zzJ.length != 0) {
                                zzeuVar11.zzh(8);
                                int zza3 = zzalv.zza(zzeuVar11.zzB());
                                if (zza3 == 0) {
                                    String zzM = zzeuVar11.zzM((char) 0);
                                    zzM.getClass();
                                    String zzM2 = zzeuVar11.zzM((char) 0);
                                    zzM2.getClass();
                                    long zzz6 = zzeuVar11.zzz();
                                    zzw = zzfm.zzw(zzeuVar11.zzz(), 1000000L, zzz6, RoundingMode.DOWN);
                                    long j15 = zzamdVar.zzB;
                                    long j16 = j15 != -9223372036854775807L ? j15 + zzw : -9223372036854775807L;
                                    zzw2 = zzfm.zzw(zzeuVar11.zzz(), 1000L, zzz6, RoundingMode.DOWN);
                                    str = zzM;
                                    str2 = zzM2;
                                    zzz = zzeuVar11.zzz();
                                    j = j16;
                                } else if (zza3 != 1) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(zza3).length() + 35);
                                    sb.append("Skipping unsupported emsg version: ");
                                    sb.append(zza3);
                                    zzeh.zzc("FragmentedMp4Extractor", sb.toString());
                                } else {
                                    long zzz7 = zzeuVar11.zzz();
                                    long zzw3 = zzfm.zzw(zzeuVar11.zzJ(), 1000000L, zzz7, RoundingMode.DOWN);
                                    long zzw4 = zzfm.zzw(zzeuVar11.zzz(), 1000L, zzz7, RoundingMode.DOWN);
                                    long zzz8 = zzeuVar11.zzz();
                                    String zzM3 = zzeuVar11.zzM((char) 0);
                                    zzM3.getClass();
                                    String zzM4 = zzeuVar11.zzM((char) 0);
                                    zzM4.getClass();
                                    zzw2 = zzw4;
                                    zzz = zzz8;
                                    str = zzM3;
                                    str2 = zzM4;
                                    j = zzw3;
                                    zzw = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzeuVar11.zzd()];
                                zzeuVar11.zzm(bArr, 0, zzeuVar11.zzd());
                                zzeu zzeuVar12 = new zzeu(zzamdVar.zzl.zza(new zzajl(str, str2, zzw2, zzz, bArr)));
                                int zzd = zzeuVar12.zzd();
                                for (zzaht zzahtVar : zzamdVar.zzJ) {
                                    zzeuVar12.zzh(0);
                                    zzahtVar.zzc(zzeuVar12, zzd);
                                }
                                if (j == -9223372036854775807L) {
                                    zzamdVar.zzo.addLast(new zzama(zzw, true, zzd));
                                    zzamdVar.zzy += zzd;
                                } else {
                                    ArrayDeque arrayDeque3 = zzamdVar.zzo;
                                    if (arrayDeque3.isEmpty()) {
                                        for (zzaht zzahtVar2 : zzamdVar.zzJ) {
                                            zzahtVar2.zze(j, 1, zzd, 0, null);
                                        }
                                    } else {
                                        arrayDeque3.addLast(new zzama(j, false, zzd));
                                        zzamdVar.zzy += zzd;
                                    }
                                }
                            }
                        }
                    } else {
                        ((zzfz) arrayDeque2.peek()).zza(zzgaVar);
                    }
                } else {
                    zzagiVar2.zzf(i28);
                }
                zzamdVar.zzj(zzagiVar.zzn());
            }
            zzamdVar3 = zzamdVar;
            zzagiVar3 = zzagiVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((zzamc) sparseArray.valueAt(i)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j2;
        this.zzn.clear();
        this.zzO = -1L;
        zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    final /* synthetic */ void zzh(long j, zzeu zzeuVar) {
        zzafu.zza(j, zzeuVar, this.zzK);
    }

    public zzamd(zzanx zzanxVar, int i, zzfj zzfjVar, zzamw zzamwVar, List list, zzaht zzahtVar) {
        this.zzc = zzanxVar;
        this.zzd = i;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzajm();
        this.zzm = new zzeu(16);
        this.zzg = new zzeu(zzgr.zza);
        this.zzh = new zzeu(6);
        this.zzi = new zzeu();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzeu(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzgxm.zzi();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzagk.zza;
        this.zzJ = new zzaht[0];
        this.zzK = new zzaht[0];
        this.zzp = new zzhc(new zzhb() { // from class: com.google.android.gms.internal.ads.zzalz
            @Override // com.google.android.gms.internal.ads.zzhb
            public final /* synthetic */ void zza(long j, zzeu zzeuVar) {
                zzamd.this.zzh(j, zzeuVar);
            }
        });
        this.zzq = new zzafw();
        this.zzN = -1L;
        this.zzO = -1L;
    }
}
