package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzabe extends com.google.android.gms.internal.ads.zzabh {
    protected abstract android.util.Pair zzh(com.google.android.gms.internal.ads.zzabd zzabdVar, int[][][] iArr, int[] iArr2, com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzbf zzbfVar) throws com.google.android.gms.internal.ads.zzjk;

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzq(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final com.google.android.gms.internal.ads.zzabi zzr(com.google.android.gms.internal.ads.zznc[] zzncVarArr, com.google.android.gms.internal.ads.zzzn zzznVar, com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzbf zzbfVar) throws com.google.android.gms.internal.ads.zzjk {
        int[] iArr;
        int[] iArr2 = new int[3];
        com.google.android.gms.internal.ads.zzbg[][] zzbgVarArr = new com.google.android.gms.internal.ads.zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzznVar.zzb;
            zzbgVarArr[i] = new com.google.android.gms.internal.ads.zzbg[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzncVarArr[i4].zzu();
        }
        int i5 = 0;
        while (i5 < zzznVar.zzb) {
            com.google.android.gms.internal.ads.zzbg zza = zzznVar.zza(i5);
            int i6 = zza.zzc;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z = true;
            while (i7 < i3) {
                com.google.android.gms.internal.ads.zznc zzncVar = zzncVarArr[i7];
                int i10 = 0;
                for (int i11 = 0; i11 < zza.zza; i11++) {
                    i10 = java.lang.Math.max(i10, zzncVar.zzad(zza.zza(i11)) & 7);
                }
                boolean z2 = iArr2[i7] == 0;
                if (i10 > i9) {
                    z = z2;
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && i6 == 5 && !z && z2) {
                    i8 = i7;
                    i9 = i10;
                    z = true;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                iArr = new int[zza.zza];
            } else {
                com.google.android.gms.internal.ads.zznc zzncVar2 = zzncVarArr[i8];
                int i12 = zza.zza;
                int[] iArr5 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr5[i13] = zzncVar2.zzad(zza.zza(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i8];
            zzbgVarArr[i8][i14] = zza;
            iArr3[i8][i14] = iArr;
            iArr2[i8] = i14 + 1;
            i5++;
            i3 = 2;
        }
        com.google.android.gms.internal.ads.zzzn[] zzznVarArr = new com.google.android.gms.internal.ads.zzzn[2];
        java.lang.String[] strArr = new java.lang.String[2];
        int[] iArr6 = new int[2];
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            int i17 = iArr2[i15];
            zzznVarArr[i15] = new com.google.android.gms.internal.ads.zzzn((com.google.android.gms.internal.ads.zzbg[]) com.google.android.gms.internal.ads.zzfl.zzb(zzbgVarArr[i15], i17));
            iArr3[i15] = (int[][]) com.google.android.gms.internal.ads.zzfl.zzb(iArr3[i15], i17);
            strArr[i15] = zzncVarArr[i15].zzU();
            iArr6[i15] = zzncVarArr[i15].zza();
            i15++;
        }
        com.google.android.gms.internal.ads.zzabd zzabdVar = new com.google.android.gms.internal.ads.zzabd(strArr, iArr6, zzznVarArr, iArr4, iArr3, new com.google.android.gms.internal.ads.zzzn((com.google.android.gms.internal.ads.zzbg[]) com.google.android.gms.internal.ads.zzfl.zzb(zzbgVarArr[2], iArr2[2])));
        android.util.Pair zzh = zzh(zzabdVar, iArr3, iArr4, zzxkVar, zzbfVar);
        com.google.android.gms.internal.ads.zzabf[] zzabfVarArr = (com.google.android.gms.internal.ads.zzabf[]) zzh.second;
        int length = zzabfVarArr.length;
        java.util.List[] listArr = new java.util.List[length];
        for (int i18 = 0; i18 < zzabfVarArr.length; i18++) {
            com.google.android.gms.internal.ads.zzabf zzabfVar = zzabfVarArr[i18];
            listArr[i18] = zzabfVar != null ? com.google.android.gms.internal.ads.zzgwm.zzj(zzabfVar) : com.google.android.gms.internal.ads.zzgwm.zzi();
        }
        com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
        for (int i19 = 0; i19 < 2; i19++) {
            com.google.android.gms.internal.ads.zzzn zzb = zzabdVar.zzb(i19);
            for (int i20 = 0; i20 < zzb.zzb; i20++) {
                com.google.android.gms.internal.ads.zzbg zza2 = zzb.zza(i20);
                boolean z3 = zzabdVar.zzd(i19, i20, false) != 0;
                int i21 = zza2.zza;
                int[] iArr7 = new int[i21];
                boolean[] zArr = new boolean[i21];
                for (int i22 = 0; i22 < i21; i22++) {
                    iArr7[i22] = zzabdVar.zzc(i19, i20, i22) & 7;
                    int i23 = 0;
                    boolean z4 = false;
                    while (i23 < length) {
                        java.util.List list = listArr[i23];
                        int i24 = length;
                        java.util.List[] listArr2 = listArr;
                        int i25 = 0;
                        while (true) {
                            if (i25 < list.size()) {
                                com.google.android.gms.internal.ads.zzabf zzabfVar2 = (com.google.android.gms.internal.ads.zzabf) list.get(i25);
                                java.util.List list2 = list;
                                if (zzabfVar2.zza().equals(zza2) && zzabfVar2.zzg(i22) != -1) {
                                    z4 = true;
                                    break;
                                }
                                i25++;
                                list = list2;
                            }
                        }
                        i23++;
                        length = i24;
                        listArr = listArr2;
                    }
                    zArr[i22] = z4;
                }
                zzgwjVar.zzf(new com.google.android.gms.internal.ads.zzbm(zza2, z3, iArr7, zArr));
            }
        }
        com.google.android.gms.internal.ads.zzzn zze = zzabdVar.zze();
        for (int i26 = 0; i26 < zze.zzb; i26++) {
            com.google.android.gms.internal.ads.zzbg zza3 = zze.zza(i26);
            int i27 = zza3.zza;
            int[] iArr8 = new int[i27];
            java.util.Arrays.fill(iArr8, 0);
            zzgwjVar.zzf(new com.google.android.gms.internal.ads.zzbm(zza3, false, iArr8, new boolean[i27]));
        }
        return new com.google.android.gms.internal.ads.zzabi((com.google.android.gms.internal.ads.zznd[]) zzh.first, (com.google.android.gms.internal.ads.zzaba[]) zzh.second, new com.google.android.gms.internal.ads.zzbn(zzgwjVar.zzi()), zzabdVar);
    }
}
