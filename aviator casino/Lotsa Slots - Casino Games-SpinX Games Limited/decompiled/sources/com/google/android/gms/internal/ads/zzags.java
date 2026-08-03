package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzags {
    public final java.util.List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;
    public final java.lang.String zzn;
    public final com.google.android.gms.internal.ads.zzgm zzo;

    private zzags(java.util.List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f, int i13, java.lang.String str, com.google.android.gms.internal.ads.zzgm zzgmVar) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = i9;
        this.zzi = i10;
        this.zzj = i11;
        this.zzk = i12;
        this.zzl = f;
        this.zzm = i13;
        this.zzn = str;
        this.zzo = zzgmVar;
    }

    public static com.google.android.gms.internal.ads.zzags zza(com.google.android.gms.internal.ads.zzet zzetVar) throws com.google.android.gms.internal.ads.zzat {
        return zzc(zzetVar, false, null);
    }

    public static com.google.android.gms.internal.ads.zzags zzb(com.google.android.gms.internal.ads.zzet zzetVar, com.google.android.gms.internal.ads.zzgm zzgmVar) throws com.google.android.gms.internal.ads.zzat {
        return zzc(zzetVar, true, zzgmVar);
    }

    private static com.google.android.gms.internal.ads.zzags zzc(com.google.android.gms.internal.ads.zzet zzetVar, boolean z, com.google.android.gms.internal.ads.zzgm zzgmVar) throws com.google.android.gms.internal.ads.zzat {
        int i;
        int i2;
        int i3;
        int i4;
        com.google.android.gms.internal.ads.zzgi zzgiVar;
        int max;
        boolean z2;
        int max2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 4;
        try {
            if (z) {
                zzetVar.zzk(4);
            } else {
                zzetVar.zzk(21);
            }
            int zzs = zzetVar.zzs() & 3;
            int zzs2 = zzetVar.zzs();
            int zzg = zzetVar.zzg();
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < zzs2; i12++) {
                zzetVar.zzk(1);
                int zzt = zzetVar.zzt();
                for (int i13 = 0; i13 < zzt; i13++) {
                    int zzt2 = zzetVar.zzt();
                    i11 += zzt2 + 4;
                    zzetVar.zzk(zzt2);
                }
            }
            zzetVar.zzh(zzg);
            byte[] bArr = new byte[i11];
            com.google.android.gms.internal.ads.zzgm zzgmVar2 = zzgmVar;
            int i14 = 0;
            int i15 = 0;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            float f = 1.0f;
            int i27 = -1;
            java.lang.String str = null;
            while (i14 < zzs2) {
                int zzs3 = zzetVar.zzs() & 63;
                int zzt3 = zzetVar.zzt();
                com.google.android.gms.internal.ads.zzgm zzgmVar3 = zzgmVar2;
                int i28 = 0;
                while (i28 < zzt3) {
                    int zzt4 = zzetVar.zzt();
                    int i29 = zzs2;
                    java.lang.System.arraycopy(com.google.android.gms.internal.ads.zzgp.zza, i10, bArr, i15, i9);
                    int i30 = i15 + 4;
                    java.lang.System.arraycopy(zzetVar.zzi(), zzetVar.zzg(), bArr, i30, zzt4);
                    int i31 = 32;
                    if (zzs3 != 32) {
                        i31 = zzs3;
                    } else if (i28 == 0) {
                        zzgmVar3 = com.google.android.gms.internal.ads.zzgp.zzf(bArr, i30, i30 + zzt4);
                        i = zzt3;
                        i2 = zzs3;
                        i28 = 0;
                        i15 = i30 + zzt4;
                        zzetVar.zzk(zzt4);
                        i28++;
                        zzs2 = i29;
                        zzt3 = i;
                        zzs3 = i2;
                        i9 = 4;
                        i10 = 0;
                    }
                    i = zzt3;
                    if (i31 != 33) {
                        i2 = zzs3;
                        if (i31 == 39 && i28 == 0) {
                            int i32 = i15 + 6;
                            int i33 = (i30 + zzt4) - 1;
                            while (true) {
                                byte b = bArr[i33];
                                if (b == 0) {
                                    if (i33 <= i32) {
                                        break;
                                    }
                                    i33--;
                                } else if (b != 0 && i33 > i32) {
                                    com.google.android.gms.internal.ads.zzgw zzgwVar = new com.google.android.gms.internal.ads.zzgw(bArr, i32, i33 + 1);
                                    while (zzgwVar.zzd(16)) {
                                        int zzf = zzgwVar.zzf(8);
                                        int i34 = 0;
                                        while (zzf == 255) {
                                            i34 += 255;
                                            zzf = zzgwVar.zzf(8);
                                        }
                                        int i35 = i34 + zzf;
                                        int zzf2 = zzgwVar.zzf(8);
                                        int i36 = 0;
                                        while (zzf2 == 255) {
                                            i36 += 255;
                                            zzf2 = zzgwVar.zzf(8);
                                        }
                                        int i37 = i36 + zzf2;
                                        if (i37 == 0 || !zzgwVar.zzd(i37)) {
                                            break;
                                        }
                                        if (i35 == 176) {
                                            int zzg2 = zzgwVar.zzg();
                                            boolean zze = zzgwVar.zze();
                                            int zzg3 = zze ? zzgwVar.zzg() : 0;
                                            int zzg4 = zzgwVar.zzg();
                                            int i38 = 0;
                                            int i39 = -1;
                                            int i40 = -1;
                                            int i41 = -1;
                                            int i42 = -1;
                                            int i43 = -1;
                                            int i44 = -1;
                                            while (i38 <= zzg4) {
                                                i39 = zzgwVar.zzg();
                                                i40 = zzgwVar.zzg();
                                                i3 = i28;
                                                int zzf3 = zzgwVar.zzf(6);
                                                if (zzf3 != 63) {
                                                    if (zzf3 == 0) {
                                                        i4 = i16;
                                                        max = java.lang.Math.max(0, zzg2 - 30);
                                                    } else {
                                                        i4 = i16;
                                                        max = java.lang.Math.max(0, (zzf3 + zzg2) - 31);
                                                    }
                                                    i42 = zzgwVar.zzf(max);
                                                    if (zze) {
                                                        int zzf4 = zzgwVar.zzf(6);
                                                        if (zzf4 != 63) {
                                                            if (zzf4 == 0) {
                                                                z2 = zze;
                                                                max2 = java.lang.Math.max(0, zzg3 - 30);
                                                            } else {
                                                                z2 = zze;
                                                                max2 = java.lang.Math.max(0, (zzf4 + zzg3) - 31);
                                                            }
                                                            i44 = zzgwVar.zzf(max2);
                                                            i43 = zzf4;
                                                        }
                                                    } else {
                                                        z2 = zze;
                                                    }
                                                    if (zzgwVar.zze()) {
                                                        zzgwVar.zzb(10);
                                                    }
                                                    i38++;
                                                    i41 = zzf3;
                                                    i28 = i3;
                                                    zze = z2;
                                                    i16 = i4;
                                                }
                                            }
                                            i3 = i28;
                                            i4 = i16;
                                            zzgiVar = new com.google.android.gms.internal.ads.zzgi(zzg2, zzg3, zzg4 + 1, i39, i40, i41, i42, i43, i44);
                                        } else {
                                            zzgwVar.zzb(i37 * 8);
                                            i28 = i28;
                                            i16 = i16;
                                        }
                                    }
                                }
                            }
                            i3 = i28;
                            i4 = i16;
                            zzgiVar = null;
                            if (zzgiVar != null && zzgmVar3 != null) {
                                if (zzgiVar.zza == ((com.google.android.gms.internal.ads.zzgc) zzgmVar3.zza.get(0)).zzb) {
                                    i28 = i3;
                                    i16 = i4;
                                    i26 = 4;
                                } else {
                                    i28 = i3;
                                    i16 = i4;
                                    i26 = 5;
                                }
                                i15 = i30 + zzt4;
                                zzetVar.zzk(zzt4);
                                i28++;
                                zzs2 = i29;
                                zzt3 = i;
                                zzs3 = i2;
                                i9 = 4;
                                i10 = 0;
                            }
                        }
                        i3 = i28;
                        i4 = i16;
                    } else if (i28 == 0) {
                        com.google.android.gms.internal.ads.zzgj zzg5 = com.google.android.gms.internal.ads.zzgp.zzg(bArr, i30, i30 + zzt4, zzgmVar3);
                        int i45 = zzg5.zza + 1;
                        int i46 = zzg5.zze;
                        int i47 = zzg5.zzf;
                        int i48 = zzg5.zzg;
                        int i49 = zzg5.zzh;
                        int i50 = zzg5.zzc + 8;
                        int i51 = zzg5.zzd + 8;
                        int i52 = zzg5.zzk;
                        int i53 = zzg5.zzl;
                        int i54 = zzg5.zzm;
                        float f2 = zzg5.zzi;
                        int i55 = zzg5.zzj;
                        com.google.android.gms.internal.ads.zzge zzgeVar = zzg5.zzb;
                        if (zzgeVar != null) {
                            i5 = i55;
                            i6 = i48;
                            i7 = i46;
                            i2 = zzs3;
                            i8 = i47;
                            str = com.google.android.gms.internal.ads.zzdq.zzc(zzgeVar.zza, zzgeVar.zzb, zzgeVar.zzc, zzgeVar.zzd, zzgeVar.zze, zzgeVar.zzf);
                        } else {
                            i5 = i55;
                            i6 = i48;
                            i7 = i46;
                            i2 = zzs3;
                            i8 = i47;
                        }
                        i16 = i45;
                        i17 = i7;
                        i27 = i5;
                        i25 = i54;
                        i23 = i52;
                        i21 = i50;
                        i20 = i49;
                        i18 = i8;
                        i22 = i51;
                        i19 = i6;
                        f = f2;
                        i24 = i53;
                        i15 = i30 + zzt4;
                        zzetVar.zzk(zzt4);
                        i28++;
                        zzs2 = i29;
                        zzt3 = i;
                        zzs3 = i2;
                        i9 = 4;
                        i10 = 0;
                    } else {
                        i2 = zzs3;
                        i3 = i28;
                        i4 = i16;
                    }
                    i28 = i3;
                    i16 = i4;
                    i15 = i30 + zzt4;
                    zzetVar.zzk(zzt4);
                    i28++;
                    zzs2 = i29;
                    zzt3 = i;
                    zzs3 = i2;
                    i9 = 4;
                    i10 = 0;
                }
                i14++;
                zzgmVar2 = zzgmVar3;
                i9 = 4;
                i10 = 0;
            }
            return new com.google.android.gms.internal.ads.zzags(i11 == 0 ? java.util.Collections.emptyList() : java.util.Collections.singletonList(bArr), zzs + 1, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, f, i27, str, zzgmVar2);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw com.google.android.gms.internal.ads.zzat.zzb("Error parsing".concat(true != z ? "HEVC config" : "L-HEVC config"), e);
        }
    }
}
