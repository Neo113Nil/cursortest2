package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzabi extends zzabl {
    protected abstract Pair zzh(zzabh zzabhVar, int[][][] iArr, int[] iArr2, zzxo zzxoVar, zzbf zzbfVar) throws zzjn;

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzq(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final zzabm zzr(zzng[] zzngVarArr, zzzr zzzrVar, zzxo zzxoVar, zzbf zzbfVar) throws zzjn {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbg[][] zzbgVarArr = new zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzzrVar.zzb;
            zzbgVarArr[i] = new zzbg[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzngVarArr[i4].zzu();
        }
        int i5 = 0;
        while (i5 < zzzrVar.zzb) {
            zzbg zza = zzzrVar.zza(i5);
            int i6 = zza.zzc;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z = true;
            while (i8 < i3) {
                zzng zzngVar = zzngVarArr[i8];
                int i10 = 0;
                for (int i11 = 0; i11 < zza.zza; i11++) {
                    i10 = Math.max(i10, zzngVar.zzae(zza.zza(i11)) & 7);
                }
                boolean z2 = iArr2[i8] == 0;
                if (i10 > i9) {
                    z = z2;
                    i7 = i8;
                    i9 = i10;
                } else if (i10 == i9 && i6 == 5 && !z && z2) {
                    i7 = i8;
                    i9 = i10;
                    z = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[zza.zza];
            } else {
                zzng zzngVar2 = zzngVarArr[i7];
                int i12 = zza.zza;
                int[] iArr5 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr5[i13] = zzngVar2.zzae(zza.zza(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i7];
            zzbgVarArr[i7][i14] = zza;
            iArr3[i7][i14] = iArr;
            iArr2[i7] = i14 + 1;
            i5++;
            i3 = 2;
        }
        int i15 = i3;
        boolean z3 = true;
        zzzr[] zzzrVarArr = new zzzr[i15];
        String[] strArr = new String[i15];
        int[] iArr6 = new int[i15];
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr2[i16];
            zzzrVarArr[i16] = new zzzr((zzbg[]) zzfm.zzb(zzbgVarArr[i16], i17));
            iArr3[i16] = (int[][]) zzfm.zzb(iArr3[i16], i17);
            strArr[i16] = zzngVarArr[i16].zzV();
            iArr6[i16] = zzngVarArr[i16].zza();
            i16++;
            i15 = 2;
        }
        int i18 = i15;
        zzabh zzabhVar = new zzabh(strArr, iArr6, zzzrVarArr, iArr4, iArr3, new zzzr((zzbg[]) zzfm.zzb(zzbgVarArr[i18], iArr2[i18])));
        Pair zzh = zzh(zzabhVar, iArr3, iArr4, zzxoVar, zzbfVar);
        zzabj[] zzabjVarArr = (zzabj[]) zzh.second;
        int length = zzabjVarArr.length;
        List[] listArr = new List[length];
        for (int i19 = 0; i19 < zzabjVarArr.length; i19++) {
            zzabj zzabjVar = zzabjVarArr[i19];
            listArr[i19] = zzabjVar != null ? zzgxm.zzj(zzabjVar) : zzgxm.zzi();
        }
        zzgxj zzgxjVar = new zzgxj();
        int i20 = 0;
        while (i20 < 2) {
            zzzr zzb = zzabhVar.zzb(i20);
            int i21 = 0;
            while (i21 < zzb.zzb) {
                zzbg zza2 = zzb.zza(i21);
                boolean z4 = zzabhVar.zzd(i20, i21, false) != 0 ? z3 : false;
                int i22 = zza2.zza;
                int[] iArr7 = new int[i22];
                boolean[] zArr = new boolean[i22];
                for (int i23 = 0; i23 < i22; i23++) {
                    iArr7[i23] = zzabhVar.zzc(i20, i21, i23) & 7;
                    int i24 = 0;
                    boolean z5 = false;
                    while (i24 < length) {
                        List list = listArr[i24];
                        int i25 = length;
                        List[] listArr2 = listArr;
                        int i26 = 0;
                        while (true) {
                            if (i26 < list.size()) {
                                zzabj zzabjVar2 = (zzabj) list.get(i26);
                                List list2 = list;
                                if (zzabjVar2.zza().equals(zza2) && zzabjVar2.zzg(i23) != -1) {
                                    z5 = true;
                                    break;
                                }
                                i26++;
                                list = list2;
                            }
                        }
                        i24++;
                        length = i25;
                        listArr = listArr2;
                    }
                    zArr[i23] = z5;
                }
                zzgxjVar.zzf(new zzbm(zza2, z4, iArr7, zArr));
                i21++;
                z3 = true;
            }
            i20++;
            z3 = true;
        }
        zzzr zze = zzabhVar.zze();
        for (int i27 = 0; i27 < zze.zzb; i27++) {
            zzbg zza3 = zze.zza(i27);
            int i28 = zza3.zza;
            int[] iArr8 = new int[i28];
            Arrays.fill(iArr8, 0);
            zzgxjVar.zzf(new zzbm(zza3, false, iArr8, new boolean[i28]));
        }
        return new zzabm((zznh[]) zzh.first, (zzabe[]) zzh.second, new zzbn(zzgxjVar.zzi()), zzabhVar);
    }
}
