package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzanb extends com.google.android.gms.internal.ads.zzamz {
    private com.google.android.gms.internal.ads.zzana zza;
    private int zzb;
    private boolean zzc;
    private com.google.android.gms.internal.ads.zzhd zzd;
    private com.google.android.gms.internal.ads.zzhb zze;

    zzanb() {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    protected final long zzb(com.google.android.gms.internal.ads.zzet zzetVar) {
        if ((zzetVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        com.google.android.gms.internal.ads.zzana zzanaVar = this.zza;
        zzanaVar.getClass();
        byte b = zzetVar.zzi()[0];
        com.google.android.gms.internal.ads.zzhd zzhdVar = zzanaVar.zza;
        com.google.android.gms.internal.ads.zzhc[] zzhcVarArr = zzanaVar.zzd;
        int i = zzhcVarArr[(b >> 1) & (255 >>> (8 - com.google.android.gms.internal.ads.zzhe.zza(zzhcVarArr.length + (-1))))].zza ? zzhdVar.zzf : zzhdVar.zze;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzetVar.zzj() < zzetVar.zze() + 4) {
            byte[] copyOf = java.util.Arrays.copyOf(zzetVar.zzi(), zzetVar.zze() + 4);
            zzetVar.zzb(copyOf, copyOf.length);
        } else {
            zzetVar.zzf(zzetVar.zze() + 4);
        }
        long j = i2;
        byte[] zzi = zzetVar.zzi();
        zzi[zzetVar.zze() - 4] = (byte) (j & 255);
        zzi[zzetVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        zzi[zzetVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        zzi[zzetVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    protected final void zzj(long j) {
        super.zzj(j);
        this.zzc = j != 0;
        com.google.android.gms.internal.ads.zzhd zzhdVar = this.zzd;
        this.zzb = zzhdVar != null ? zzhdVar.zze : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(com.google.android.gms.internal.ads.zzet zzetVar, long j, com.google.android.gms.internal.ads.zzamx zzamxVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzana zzanaVar;
        int i;
        int i2;
        int i3;
        int i4;
        com.google.android.gms.internal.ads.zzhd zzhdVar;
        long j2;
        if (this.zza != null) {
            zzamxVar.zza.getClass();
            return false;
        }
        com.google.android.gms.internal.ads.zzhd zzhdVar2 = this.zzd;
        int i5 = 4;
        if (zzhdVar2 == null) {
            com.google.android.gms.internal.ads.zzhe.zzc(1, zzetVar, false);
            int zzI = zzetVar.zzI();
            int zzs = zzetVar.zzs();
            int zzI2 = zzetVar.zzI();
            int zzC = zzetVar.zzC();
            int i6 = zzC <= 0 ? -1 : zzC;
            int zzC2 = zzetVar.zzC();
            int i7 = zzC2 <= 0 ? -1 : zzC2;
            int zzC3 = zzetVar.zzC();
            int i8 = zzC3 <= 0 ? -1 : zzC3;
            int zzs2 = zzetVar.zzs();
            this.zzd = new com.google.android.gms.internal.ads.zzhd(zzI, zzs, zzI2, i6, i7, i8, (int) java.lang.Math.pow(2.0d, zzs2 & 15), (int) java.lang.Math.pow(2.0d, (zzs2 & 240) >> 4), 1 == (zzetVar.zzs() & 1), java.util.Arrays.copyOf(zzetVar.zzi(), zzetVar.zze()));
        } else {
            com.google.android.gms.internal.ads.zzhb zzhbVar = this.zze;
            if (zzhbVar == null) {
                this.zze = com.google.android.gms.internal.ads.zzhe.zzb(zzetVar, true, true);
            } else {
                byte[] bArr = new byte[zzetVar.zze()];
                java.lang.System.arraycopy(zzetVar.zzi(), 0, bArr, 0, zzetVar.zze());
                int i9 = zzhdVar2.zza;
                int i10 = 5;
                com.google.android.gms.internal.ads.zzhe.zzc(5, zzetVar, false);
                int zzs3 = zzetVar.zzs() + 1;
                com.google.android.gms.internal.ads.zzha zzhaVar = new com.google.android.gms.internal.ads.zzha(zzetVar.zzi());
                zzhaVar.zzc(zzetVar.zzg() * 8);
                int i11 = 0;
                while (true) {
                    int i12 = 2;
                    int i13 = 16;
                    if (i11 >= zzs3) {
                        com.google.android.gms.internal.ads.zzhd zzhdVar3 = zzhdVar2;
                        int i14 = 6;
                        int zzb = zzhaVar.zzb(6) + 1;
                        for (int i15 = 0; i15 < zzb; i15++) {
                            if (zzhaVar.zzb(16) != 0) {
                                throw com.google.android.gms.internal.ads.zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i16 = 1;
                        int zzb2 = zzhaVar.zzb(6) + 1;
                        int i17 = 0;
                        while (true) {
                            int i18 = 3;
                            if (i17 < zzb2) {
                                int zzb3 = zzhaVar.zzb(i13);
                                if (zzb3 == 0) {
                                    i3 = zzb2;
                                    int i19 = 8;
                                    zzhaVar.zzc(8);
                                    zzhaVar.zzc(16);
                                    zzhaVar.zzc(16);
                                    zzhaVar.zzc(6);
                                    zzhaVar.zzc(8);
                                    int zzb4 = zzhaVar.zzb(4) + 1;
                                    int i20 = 0;
                                    while (i20 < zzb4) {
                                        zzhaVar.zzc(i19);
                                        i20++;
                                        i19 = 8;
                                    }
                                } else {
                                    if (zzb3 != i16) {
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzb3).length() + 41);
                                        sb.append("floor type greater than 1 not decodable: ");
                                        sb.append(zzb3);
                                        throw com.google.android.gms.internal.ads.zzat.zzb(sb.toString(), null);
                                    }
                                    int zzb5 = zzhaVar.zzb(i10);
                                    int[] iArr = new int[zzb5];
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < zzb5; i22++) {
                                        int zzb6 = zzhaVar.zzb(4);
                                        iArr[i22] = zzb6;
                                        if (zzb6 > i21) {
                                            i21 = zzb6;
                                        }
                                    }
                                    int i23 = i21 + 1;
                                    int[] iArr2 = new int[i23];
                                    int i24 = 0;
                                    while (i24 < i23) {
                                        iArr2[i24] = zzhaVar.zzb(i18) + 1;
                                        int zzb7 = zzhaVar.zzb(i12);
                                        if (zzb7 > 0) {
                                            i4 = 8;
                                            zzhaVar.zzc(8);
                                        } else {
                                            i4 = 8;
                                        }
                                        int i25 = zzb2;
                                        int i26 = 0;
                                        for (int i27 = 1; i26 < (i27 << zzb7); i27 = 1) {
                                            zzhaVar.zzc(i4);
                                            i26++;
                                            i4 = 8;
                                        }
                                        i24++;
                                        zzb2 = i25;
                                        i12 = 2;
                                        i18 = 3;
                                    }
                                    i3 = zzb2;
                                    zzhaVar.zzc(i12);
                                    int zzb8 = zzhaVar.zzb(4);
                                    int i28 = 0;
                                    int i29 = 0;
                                    for (int i30 = 0; i30 < zzb5; i30++) {
                                        i28 += iArr2[iArr[i30]];
                                        while (i29 < i28) {
                                            zzhaVar.zzc(zzb8);
                                            i29++;
                                        }
                                    }
                                }
                                i17++;
                                zzb2 = i3;
                                i14 = 6;
                                i12 = 2;
                                i13 = 16;
                                i16 = 1;
                                i10 = 5;
                            } else {
                                int i31 = 1;
                                int zzb9 = zzhaVar.zzb(i14) + 1;
                                int i32 = 0;
                                while (i32 < zzb9) {
                                    if (zzhaVar.zzb(16) > 2) {
                                        throw com.google.android.gms.internal.ads.zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzhaVar.zzc(24);
                                    zzhaVar.zzc(24);
                                    zzhaVar.zzc(24);
                                    int zzb10 = zzhaVar.zzb(i14) + i31;
                                    int i33 = 8;
                                    zzhaVar.zzc(8);
                                    int[] iArr3 = new int[zzb10];
                                    for (int i34 = 0; i34 < zzb10; i34++) {
                                        iArr3[i34] = ((zzhaVar.zza() ? zzhaVar.zzb(5) : 0) * 8) + zzhaVar.zzb(3);
                                    }
                                    int i35 = 0;
                                    while (i35 < zzb10) {
                                        int i36 = 0;
                                        while (i36 < i33) {
                                            if ((iArr3[i35] & (1 << i36)) != 0) {
                                                zzhaVar.zzc(i33);
                                            }
                                            i36++;
                                            i33 = 8;
                                        }
                                        i35++;
                                        i33 = 8;
                                    }
                                    i32++;
                                    i14 = 6;
                                    i31 = 1;
                                }
                                int zzb11 = zzhaVar.zzb(i14) + 1;
                                for (int i37 = 0; i37 < zzb11; i37++) {
                                    int zzb12 = zzhaVar.zzb(16);
                                    if (zzb12 != 0) {
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzb12).length() + 41);
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(zzb12);
                                        com.google.android.gms.internal.ads.zzeg.zze("VorbisUtil", sb2.toString());
                                    } else {
                                        if (zzhaVar.zza()) {
                                            i = 1;
                                            i2 = zzhaVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            i2 = 1;
                                        }
                                        if (zzhaVar.zza()) {
                                            int zzb13 = zzhaVar.zzb(8) + i;
                                            for (int i38 = 0; i38 < zzb13; i38++) {
                                                int i39 = i9 - 1;
                                                zzhaVar.zzc(com.google.android.gms.internal.ads.zzhe.zza(i39));
                                                zzhaVar.zzc(com.google.android.gms.internal.ads.zzhe.zza(i39));
                                            }
                                        }
                                        if (zzhaVar.zzb(2) != 0) {
                                            throw com.google.android.gms.internal.ads.zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i2 > 1) {
                                            for (int i40 = 0; i40 < i9; i40++) {
                                                zzhaVar.zzc(4);
                                            }
                                        }
                                        for (int i41 = 0; i41 < i2; i41++) {
                                            zzhaVar.zzc(8);
                                            zzhaVar.zzc(8);
                                            zzhaVar.zzc(8);
                                        }
                                    }
                                }
                                int zzb14 = zzhaVar.zzb(6);
                                int i42 = zzb14 + 1;
                                com.google.android.gms.internal.ads.zzhc[] zzhcVarArr = new com.google.android.gms.internal.ads.zzhc[i42];
                                for (int i43 = 0; i43 < i42; i43++) {
                                    zzhcVarArr[i43] = new com.google.android.gms.internal.ads.zzhc(zzhaVar.zza(), zzhaVar.zzb(16), zzhaVar.zzb(16), zzhaVar.zzb(8));
                                }
                                if (!zzhaVar.zza()) {
                                    throw com.google.android.gms.internal.ads.zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzanaVar = new com.google.android.gms.internal.ads.zzana(zzhdVar3, zzhbVar, bArr, zzhcVarArr, com.google.android.gms.internal.ads.zzhe.zza(zzb14));
                            }
                        }
                    } else {
                        if (zzhaVar.zzb(24) != 5653314) {
                            int zzd = zzhaVar.zzd();
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(zzd).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(zzd);
                            throw com.google.android.gms.internal.ads.zzat.zzb(sb3.toString(), null);
                        }
                        int zzb15 = zzhaVar.zzb(16);
                        int zzb16 = zzhaVar.zzb(24);
                        if (zzhaVar.zza()) {
                            zzhaVar.zzc(5);
                            for (int i44 = 0; i44 < zzb16; i44 += zzhaVar.zzb(com.google.android.gms.internal.ads.zzhe.zza(zzb16 - i44))) {
                            }
                        } else {
                            boolean zza = zzhaVar.zza();
                            for (int i45 = 0; i45 < zzb16; i45++) {
                                if (!zza) {
                                    zzhaVar.zzc(5);
                                } else if (zzhaVar.zza()) {
                                    zzhaVar.zzc(5);
                                }
                            }
                        }
                        int zzb17 = zzhaVar.zzb(i5);
                        if (zzb17 > 2) {
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(zzb17).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(zzb17);
                            throw com.google.android.gms.internal.ads.zzat.zzb(sb4.toString(), null);
                        }
                        if (zzb17 == 1) {
                            i12 = zzb17;
                        } else if (zzb17 != 2) {
                            zzhdVar = zzhdVar2;
                            i11++;
                            zzhdVar2 = zzhdVar;
                            i5 = 4;
                        }
                        zzhaVar.zzc(32);
                        zzhaVar.zzc(32);
                        int zzb18 = zzhaVar.zzb(i5) + 1;
                        zzhaVar.zzc(1);
                        if (i12 != 1) {
                            zzhdVar = zzhdVar2;
                            j2 = zzb15 * zzb16;
                        } else if (zzb15 != 0) {
                            zzhdVar = zzhdVar2;
                            j2 = (long) java.lang.Math.floor(java.lang.Math.pow(zzb16, 1.0d / zzb15));
                        } else {
                            zzhdVar = zzhdVar2;
                            j2 = 0;
                        }
                        zzhaVar.zzc((int) (j2 * zzb18));
                        i11++;
                        zzhdVar2 = zzhdVar;
                        i5 = 4;
                    }
                }
            }
        }
        zzanaVar = null;
        this.zza = zzanaVar;
        if (zzanaVar == null) {
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.gms.internal.ads.zzhd zzhdVar4 = zzanaVar.zza;
        arrayList.add(zzhdVar4.zzg);
        arrayList.add(zzanaVar.zzc);
        com.google.android.gms.internal.ads.zzap zzb19 = com.google.android.gms.internal.ads.zzahm.zzb(com.google.android.gms.internal.ads.zzgwm.zzr(zzanaVar.zzb.zza));
        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
        zztVar.zzn("audio/ogg");
        zztVar.zzo("audio/vorbis");
        zztVar.zzi(zzhdVar4.zzd);
        zztVar.zzj(zzhdVar4.zzc);
        zztVar.zzG(zzhdVar4.zza);
        zztVar.zzH(zzhdVar4.zzb);
        zztVar.zzr(arrayList);
        zztVar.zzl(zzb19);
        zzamxVar.zza = zztVar.zzO();
        return true;
    }
}
