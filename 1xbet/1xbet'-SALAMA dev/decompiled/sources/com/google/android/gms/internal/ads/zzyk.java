package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzyk extends zzyn {
    public abstract Pair zzd(zzyj zzyjVar, int[][][] iArr, int[] iArr2, zzuq zzuqVar, zzbn zzbnVar);

    @Override // com.google.android.gms.internal.ads.zzyn
    public final zzyo zzo(zzlp[] zzlpVarArr, zzwv zzwvVar, zzuq zzuqVar, zzbn zzbnVar) {
        boolean z4;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbo[][] zzboVarArr = new zzbo[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i7 = 0; i7 < 3; i7++) {
            int i8 = zzwvVar.zzb;
            zzboVarArr[i7] = new zzbo[i8];
            iArr3[i7] = new int[i8][];
        }
        int i9 = 2;
        int[] iArr4 = new int[2];
        for (int i10 = 0; i10 < 2; i10++) {
            iArr4[i10] = zzlpVarArr[i10].zze();
        }
        int i11 = 0;
        while (i11 < zzwvVar.zzb) {
            zzbo zzboVarZzb = zzwvVar.zzb(i11);
            int i12 = zzboVarZzb.zzc;
            int i13 = i9;
            int i14 = 0;
            int i15 = 0;
            boolean z7 = true;
            while (i14 < i9) {
                zzlp zzlpVar = zzlpVarArr[i14];
                int iMax = 0;
                for (int i16 = 0; i16 < zzboVarZzb.zza; i16++) {
                    iMax = Math.max(iMax, zzlpVar.zzY(zzboVarZzb.zzb(i16)) & 7);
                }
                boolean z8 = iArr2[i14] == 0;
                if (iMax > i15) {
                    z7 = z8;
                    i13 = i14;
                    i15 = iMax;
                } else if (iMax == i15 && i12 == 5 && !z7 && z8) {
                    i13 = i14;
                    i15 = iMax;
                    z7 = true;
                }
                i14++;
                i9 = 2;
            }
            if (i13 == i9) {
                iArr = new int[zzboVarZzb.zza];
            } else {
                zzlp zzlpVar2 = zzlpVarArr[i13];
                int[] iArr5 = new int[zzboVarZzb.zza];
                for (int i17 = 0; i17 < zzboVarZzb.zza; i17++) {
                    iArr5[i17] = zzlpVar2.zzY(zzboVarZzb.zzb(i17));
                }
                iArr = iArr5;
            }
            int i18 = iArr2[i13];
            zzboVarArr[i13][i18] = zzboVarZzb;
            iArr3[i13][i18] = iArr;
            iArr2[i13] = i18 + 1;
            i11++;
            i9 = 2;
        }
        int i19 = i9;
        boolean z9 = true;
        zzwv[] zzwvVarArr = new zzwv[i19];
        String[] strArr = new String[i19];
        int[] iArr6 = new int[i19];
        int i20 = 0;
        while (i20 < i19) {
            int i21 = iArr2[i20];
            zzwvVarArr[i20] = new zzwv((zzbo[]) zzen.zzP(zzboVarArr[i20], i21));
            iArr3[i20] = (int[][]) zzen.zzP(iArr3[i20], i21);
            strArr[i20] = zzlpVarArr[i20].zzU();
            iArr6[i20] = zzlpVarArr[i20].zzb();
            i20++;
            i19 = 2;
        }
        int i22 = i19;
        zzyj zzyjVar = new zzyj(strArr, iArr6, zzwvVarArr, iArr4, iArr3, new zzwv((zzbo[]) zzen.zzP(zzboVarArr[i22], iArr2[i22])));
        Pair pairZzd = zzd(zzyjVar, iArr3, iArr4, zzuqVar, zzbnVar);
        zzyl[] zzylVarArr = (zzyl[]) pairZzd.second;
        List[] listArr = new List[zzylVarArr.length];
        for (int i23 = 0; i23 < zzylVarArr.length; i23++) {
            zzyl zzylVar = zzylVarArr[i23];
            listArr[i23] = zzylVar != null ? zzfwh.zzo(zzylVar) : zzfwh.zzn();
        }
        zzfwe zzfweVar = new zzfwe();
        int i24 = 0;
        for (int i25 = 2; i24 < i25; i25 = 2) {
            zzwv zzwvVarZzd = zzyjVar.zzd(i24);
            List list = listArr[i24];
            int i26 = 0;
            while (i26 < zzwvVarZzd.zzb) {
                zzbo zzboVarZzb2 = zzwvVarZzd.zzb(i26);
                boolean z10 = zzyjVar.zza(i24, i26, false) != 0 ? z9 : false;
                int i27 = zzboVarZzb2.zza;
                int[] iArr7 = new int[i27];
                boolean[] zArr = new boolean[i27];
                for (int i28 = 0; i28 < zzboVarZzb2.zza; i28++) {
                    iArr7[i28] = zzyjVar.zzb(i24, i26, i28) & 7;
                    int i29 = 0;
                    while (true) {
                        if (i29 >= list.size()) {
                            z4 = false;
                            break;
                        }
                        zzyl zzylVar2 = (zzyl) list.get(i29);
                        if (zzylVar2.zzg().equals(zzboVarZzb2) && zzylVar2.zzc(i28) != -1) {
                            z4 = true;
                            break;
                        }
                        i29++;
                    }
                    zArr[i28] = z4;
                }
                zzfweVar.zzf(new zzbu(zzboVarZzb2, z10, iArr7, zArr));
                i26++;
                z9 = true;
            }
            i24++;
            z9 = true;
        }
        zzwv zzwvVarZze = zzyjVar.zze();
        for (int i30 = 0; i30 < zzwvVarZze.zzb; i30++) {
            zzbo zzboVarZzb3 = zzwvVarZze.zzb(i30);
            int[] iArr8 = new int[zzboVarZzb3.zza];
            Arrays.fill(iArr8, 0);
            zzfweVar.zzf(new zzbu(zzboVarZzb3, false, iArr8, new boolean[zzboVarZzb3.zza]));
        }
        return new zzyo((zzlq[]) pairZzd.first, (zzyh[]) pairZzd.second, new zzbv(zzfweVar.zzi()), zzyjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyn
    public final void zzp(Object obj) {
    }
}
