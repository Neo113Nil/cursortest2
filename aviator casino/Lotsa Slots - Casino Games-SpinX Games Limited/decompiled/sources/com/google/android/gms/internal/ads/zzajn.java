package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzajn {
    public static final com.google.android.gms.internal.ads.zzajk zza = com.google.android.gms.internal.ads.zzajl.zza;

    /* JADX WARN: Removed duplicated region for block: B:6:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.google.android.gms.internal.ads.zzap zza(byte[] bArr, int i, com.google.android.gms.internal.ads.zzajk zzajkVar, com.google.android.gms.internal.ads.zzaiy zzaiyVar) {
        com.google.android.gms.internal.ads.zzajm zzajmVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(bArr, i);
        boolean z = false;
        if (zzetVar.zzd() < 10) {
            com.google.android.gms.internal.ads.zzeg.zzc("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int zzx = zzetVar.zzx();
            if (zzx == 4801587) {
                int zzs = zzetVar.zzs();
                zzetVar.zzk(1);
                int zzs2 = zzetVar.zzs();
                int zzG = zzetVar.zzG();
                if (zzs == 2) {
                    if ((zzs2 & 64) != 0) {
                        com.google.android.gms.internal.ads.zzeg.zzc("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    zzajmVar = new com.google.android.gms.internal.ads.zzajm(zzs, zzs >= 4 && (zzs2 & 128) != 0, zzG);
                } else {
                    if (zzs == 3) {
                        if ((zzs2 & 64) != 0) {
                            int zzB = zzetVar.zzB();
                            zzetVar.zzk(zzB);
                            zzG -= zzB + 4;
                        }
                    } else if (zzs == 4) {
                        if ((zzs2 & 64) != 0) {
                            int zzG2 = zzetVar.zzG();
                            zzetVar.zzk(zzG2 - 4);
                            zzG -= zzG2;
                        }
                        if ((zzs2 & 16) != 0) {
                            zzG -= 10;
                        }
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzs).length() + 46);
                        sb.append("Skipped ID3 tag with unsupported majorVersion=");
                        sb.append(zzs);
                        com.google.android.gms.internal.ads.zzeg.zzc("Id3Decoder", sb.toString());
                    }
                    zzajmVar = new com.google.android.gms.internal.ads.zzajm(zzs, zzs >= 4 && (zzs2 & 128) != 0, zzG);
                }
                if (zzajmVar != null) {
                    return null;
                }
                int zzg = zzetVar.zzg();
                int i2 = zzajmVar.zza() == 2 ? 6 : 10;
                boolean zzb = zzajmVar.zzb();
                int zzc = zzajmVar.zzc();
                if (zzb) {
                    zzc = zze(zzetVar, zzajmVar.zzc());
                }
                zzetVar.zzf(zzg + zzc);
                if (!zzb(zzetVar, zzajmVar.zza(), i2, false)) {
                    if (zzajmVar.zza() != 4 || !zzb(zzetVar, 4, i2, true)) {
                        int zza2 = zzajmVar.zza();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 45);
                        sb2.append("Failed to validate ID3 tag with majorVersion=");
                        sb2.append(zza2);
                        com.google.android.gms.internal.ads.zzeg.zzc("Id3Decoder", sb2.toString());
                        return null;
                    }
                    z = true;
                }
                while (zzetVar.zzd() >= i2) {
                    com.google.android.gms.internal.ads.zzajo zzc2 = zzc(zzajmVar.zza(), zzetVar, z, i2, zzajkVar);
                    if (zzc2 != null) {
                        arrayList.add(zzc2);
                    }
                }
                return new com.google.android.gms.internal.ads.zzap(arrayList);
            }
            java.lang.String format = java.lang.String.format("%06X", java.lang.Integer.valueOf(zzx));
            java.lang.String.valueOf(format);
            com.google.android.gms.internal.ads.zzeg.zzc("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(java.lang.String.valueOf(format)));
        }
        zzajmVar = null;
        if (zzajmVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzb(com.google.android.gms.internal.ads.zzet zzetVar, int i, int i2, boolean z) {
        boolean z2;
        int zzx;
        long zzx2;
        int i3;
        int i4;
        int zzg = zzetVar.zzg();
        while (true) {
            try {
                z2 = true;
                z2 = true;
                int i5 = 1;
                int i6 = 1;
                if (zzetVar.zzd() >= i2) {
                    if (i >= 3) {
                        zzx = zzetVar.zzB();
                        zzx2 = zzetVar.zzz();
                        i3 = zzetVar.zzt();
                    } else {
                        zzx = zzetVar.zzx();
                        zzx2 = zzetVar.zzx();
                        i3 = 0;
                    }
                    if (zzx == 0 && zzx2 == 0 && i3 == 0) {
                        break;
                    }
                    if (i == 4 && !z) {
                        if ((8421504 & zzx2) != 0) {
                            break;
                        }
                        zzx2 = ((zzx2 >> 24) << 21) | (((zzx2 >> 16) & 255) << 14) | (zzx2 & 255) | (((zzx2 >> 8) & 255) << 7);
                    }
                    if (i == 4) {
                        if ((i3 & 64) == 0) {
                            i5 = 0;
                        }
                        int i7 = i5;
                        i6 = i3 & 1;
                        i4 = i7;
                    } else {
                        if (i == 3) {
                            i4 = (i3 & 32) != 0 ? 1 : 0;
                            if ((i3 & 128) != 0) {
                            }
                        } else {
                            i4 = 0;
                        }
                        i6 = 0;
                    }
                    if (i6 != 0) {
                        i4 += 4;
                    }
                    if (zzx2 >= i4 && zzetVar.zzd() >= zzx2) {
                        zzetVar.zzk((int) zzx2);
                    }
                } else {
                    break;
                }
            } finally {
                zzetVar.zzh(zzg);
            }
        }
        return z2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:79|(2:81|(1:87)(1:86))|88|(2:90|(1:117)(13:96|97|98|99|100|101|102|103|104|66|54|(0)|57))(1:320)|118|119|(6:173|174|(2:189|(2:(5:277|(2:279|(2:281|(5:285|286|(1:288)|289|290))(1:302))(1:303)|294|295|296)(13:223|224|(1:226)(1:274)|227|(10:229|230|231|232|233|234|235|236|237|238)|255|256|(4:259|(3:261|262|263)(1:265)|264|257)|266|267|(1:269)(1:273)|270|271)|139)(2:196|(3:198|185|64)(8:199|(1:201)|202|(1:204)|205|(4:208|(3:210|211|212)(1:214)|213|206)|215|216)))(2:182|(3:184|185|64)(3:186|187|188))|54|(0)|57)(7:126|127|128|(6:142|143|144|145|(1:147)|148)(4:130|131|132|(1:134)(3:141|136|137))|135|136|137)|138|139|54|(0)|57) */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x03c5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x03c8, code lost:
    
        r8 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x03c7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x03c0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x03c1, code lost:
    
        r8 = r36;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05e8  */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v62 */
    /* JADX WARN: Type inference failed for: r8v63 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.google.android.gms.internal.ads.zzajo zzc(int i, com.google.android.gms.internal.ads.zzet zzetVar, boolean z, int i2, com.google.android.gms.internal.ads.zzajk zzajkVar) {
        int zzH;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        boolean z4;
        com.google.android.gms.internal.ads.zzet zzetVar2;
        int i5;
        int i6;
        int i7;
        java.lang.String str;
        com.google.android.gms.internal.ads.zzet zzetVar3;
        java.lang.Throwable th;
        com.google.android.gms.internal.ads.zzet zzetVar4;
        java.lang.Throwable th2;
        com.google.android.gms.internal.ads.zzajo zzajoVar;
        int i8;
        com.google.android.gms.internal.ads.zzet zzetVar5;
        int i9;
        com.google.android.gms.internal.ads.zzet zzetVar6;
        com.google.android.gms.internal.ads.zzet zzetVar7;
        com.google.android.gms.internal.ads.zzajo zzajfVar;
        int i10;
        int i11;
        int i12;
        com.google.android.gms.internal.ads.zzet zzetVar8;
        com.google.android.gms.internal.ads.zzet zzetVar9;
        com.google.android.gms.internal.ads.zzet zzetVar10;
        com.google.android.gms.internal.ads.zzet zzetVar11;
        java.lang.String concat;
        int i13;
        com.google.android.gms.internal.ads.zzajo zzajjVar;
        com.google.android.gms.internal.ads.zzajo zzajsVar;
        com.google.android.gms.internal.ads.zzet zzetVar12;
        com.google.android.gms.internal.ads.zzet zzetVar13;
        int zzs = zzetVar.zzs();
        int zzs2 = zzetVar.zzs();
        int zzs3 = zzetVar.zzs();
        int zzs4 = i >= 3 ? zzetVar.zzs() : 0;
        if (i == 4) {
            zzH = zzetVar.zzH();
            if (!z) {
                zzH = ((zzH >> 24) << 21) | (zzH & 255) | (((zzH >> 8) & 255) << 7) | (((zzH >> 16) & 255) << 14);
            }
        } else {
            zzH = i == 3 ? zzetVar.zzH() : zzetVar.zzx();
        }
        int zzt = i >= 3 ? zzetVar.zzt() : 0;
        if (zzs == 0 && zzs2 == 0 && zzs3 == 0 && zzs4 == 0 && zzH == 0 && zzt == 0) {
            zzetVar.zzh(zzetVar.zze());
            return null;
        }
        int zzg = zzetVar.zzg() + zzH;
        if (zzg > zzetVar.zze()) {
            com.google.android.gms.internal.ads.zzeg.zzc("Id3Decoder", "Frame size exceeds remaining tag data");
            zzetVar.zzh(zzetVar.zze());
            return null;
        }
        if (zzajkVar != null) {
            zzetVar.zzh(zzg);
            return null;
        }
        if (i == 3) {
            int i14 = zzt & 64;
            i3 = (zzt & 128) != 0 ? 1 : 0;
            boolean z5 = i14 != 0;
            z2 = (zzt & 32) != 0;
            z3 = z5;
            z4 = false;
            i4 = i3;
        } else if (i == 4) {
            boolean z6 = (zzt & 64) != 0;
            i4 = (zzt & 8) != 0 ? 1 : 0;
            z3 = (zzt & 4) != 0;
            z4 = (zzt & 2) != 0;
            int i15 = zzt & 1;
            z2 = z6;
            i3 = i15;
        } else {
            i3 = 0;
            z2 = false;
            i4 = 0;
            z3 = false;
            z4 = false;
        }
        if (i4 != 0 || z3) {
            com.google.android.gms.internal.ads.zzeg.zzc("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            zzetVar.zzh(zzg);
            return null;
        }
        if (z2) {
            zzetVar.zzk(1);
            zzH--;
        }
        if (i3 != 0) {
            zzetVar.zzk(4);
            zzH -= 4;
        }
        if (z4) {
            zzH = zze(zzetVar, zzH);
        }
        ?? r8 = 2;
        ?? r82 = 2;
        r8 = 2;
        try {
            try {
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } catch (java.lang.Exception e) {
            e = e;
            zzetVar2 = zzetVar;
            i5 = zzs;
            i6 = zzs2;
            i7 = zzs3;
            str = "Id3Decoder";
            th2 = e;
            zzetVar4 = zzetVar2;
            zzetVar4.zzh(zzg);
            zzajoVar = null;
            if (zzajoVar == null) {
            }
            return zzajoVar;
        } catch (java.lang.OutOfMemoryError e2) {
            e = e2;
            zzetVar2 = zzetVar;
            i5 = zzs;
            i6 = zzs2;
            i7 = zzs3;
            str = "Id3Decoder";
            th2 = e;
            zzetVar4 = zzetVar2;
            zzetVar4.zzh(zzg);
            zzajoVar = null;
            if (zzajoVar == null) {
            }
            return zzajoVar;
        }
        if (zzs == 84 && zzs2 == 88 && zzs3 == 88 && (i == 2 || zzs4 == 88)) {
            if (zzH <= 0) {
                zzetVar12 = zzetVar;
                i5 = zzs;
                i6 = zzs2;
                i7 = zzs3;
                str = "Id3Decoder";
                zzajfVar = null;
                zzetVar12.zzh(zzg);
                zzajoVar = zzajfVar;
                th2 = null;
                if (zzajoVar == null) {
                }
                return zzajoVar;
            }
            int zzs5 = zzetVar.zzs();
            int i16 = zzH - 1;
            byte[] bArr = new byte[i16];
            zzetVar.zzm(bArr, 0, i16);
            int zzh = zzh(bArr, 0, zzs5);
            zzajsVar = new com.google.android.gms.internal.ads.zzajt("TXXX", new java.lang.String(bArr, 0, zzh, zzf(zzs5)), zzd(bArr, zzs5, zzh + zzj(zzs5)));
            zzetVar12 = zzetVar;
            zzajfVar = zzajsVar;
            i5 = zzs;
            i6 = zzs2;
            i7 = zzs3;
            str = "Id3Decoder";
            zzetVar12.zzh(zzg);
            zzajoVar = zzajfVar;
            th2 = null;
            if (zzajoVar == null) {
            }
            return zzajoVar;
        }
        if (zzs == 84) {
            java.lang.String zzg2 = zzg(i, 84, zzs2, zzs3, zzs4);
            if (zzH > 0) {
                int zzs6 = zzetVar.zzs();
                int i17 = zzH - 1;
                byte[] bArr2 = new byte[i17];
                zzetVar.zzm(bArr2, 0, i17);
                zzajjVar = new com.google.android.gms.internal.ads.zzajt(zzg2, null, zzd(bArr2, zzs6, 0));
                i5 = zzs;
                i6 = zzs2;
                i7 = zzs3;
                str = "Id3Decoder";
                com.google.android.gms.internal.ads.zzajo zzajoVar2 = zzajjVar;
                zzetVar12 = zzetVar;
                zzajfVar = zzajoVar2;
                zzetVar12.zzh(zzg);
                zzajoVar = zzajfVar;
                th2 = null;
                if (zzajoVar == null) {
                    java.lang.String zzg3 = zzg(i, i5, i6, i7, zzs4);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzg3).length() + 39 + java.lang.String.valueOf(zzH).length());
                    sb.append("Failed to decode frame: id=");
                    sb.append(zzg3);
                    sb.append(", frameSize=");
                    sb.append(zzH);
                    com.google.android.gms.internal.ads.zzeg.zzd(str, sb.toString(), th2);
                }
                return zzajoVar;
            }
            zzetVar13 = zzetVar;
            i5 = zzs;
            i6 = zzs2;
            i7 = zzs3;
            str = "Id3Decoder";
            zzajfVar = null;
            zzetVar12 = zzetVar13;
            zzetVar12.zzh(zzg);
            zzajoVar = zzajfVar;
            th2 = null;
            if (zzajoVar == null) {
            }
            return zzajoVar;
        }
        if (zzs != 87) {
            i8 = zzs;
        } else {
            if (zzs2 == 88 && zzs3 == 88 && (i == 2 || zzs4 == 88)) {
                if (zzH <= 0) {
                    zzetVar13 = zzetVar;
                    i5 = zzs;
                    i6 = zzs2;
                    i7 = zzs3;
                    str = "Id3Decoder";
                    zzajfVar = null;
                    zzetVar12 = zzetVar13;
                    zzetVar12.zzh(zzg);
                    zzajoVar = zzajfVar;
                    th2 = null;
                    if (zzajoVar == null) {
                    }
                    return zzajoVar;
                }
                int zzs7 = zzetVar.zzs();
                int i18 = zzH - 1;
                byte[] bArr3 = new byte[i18];
                zzetVar.zzm(bArr3, 0, i18);
                int zzh2 = zzh(bArr3, 0, zzs7);
                java.lang.String str2 = new java.lang.String(bArr3, 0, zzh2, zzf(zzs7));
                int zzj = zzh2 + zzj(zzs7);
                zzajsVar = new com.google.android.gms.internal.ads.zzaju("WXXX", str2, zzl(bArr3, zzj, zzi(bArr3, zzj), java.nio.charset.StandardCharsets.ISO_8859_1));
                zzetVar12 = zzetVar;
                zzajfVar = zzajsVar;
                i5 = zzs;
                i6 = zzs2;
                i7 = zzs3;
                str = "Id3Decoder";
                zzetVar12.zzh(zzg);
                zzajoVar = zzajfVar;
                th2 = null;
                if (zzajoVar == null) {
                }
                return zzajoVar;
            }
            i8 = 87;
        }
        if (i8 != 87) {
            if (i8 == 80) {
                if (zzs2 == 82 && zzs3 == 73 && zzs4 == 86) {
                    byte[] bArr4 = new byte[zzH];
                    zzetVar.zzm(bArr4, 0, zzH);
                    int zzi = zzi(bArr4, 0);
                    zzajsVar = new com.google.android.gms.internal.ads.zzajs(new java.lang.String(bArr4, 0, zzi, java.nio.charset.StandardCharsets.ISO_8859_1), zzk(bArr4, zzi + 1, zzH));
                } else {
                    i8 = 80;
                }
            }
            if (i8 != 71) {
                i5 = zzs;
                str = "Id3Decoder";
            } else {
                if (zzs2 == 69 && zzs3 == 79 && (zzs4 == 66 || i == 2)) {
                    try {
                        int zzs8 = zzetVar.zzs();
                        java.nio.charset.Charset zzf = zzf(zzs8);
                        int i19 = zzH - 1;
                        byte[] bArr5 = new byte[i19];
                        zzetVar.zzm(bArr5, 0, i19);
                        int zzi2 = zzi(bArr5, 0);
                        str = "Id3Decoder";
                        try {
                            i5 = zzs;
                            try {
                                java.lang.String zzh3 = com.google.android.gms.internal.ads.zzas.zzh(new java.lang.String(bArr5, 0, zzi2, java.nio.charset.StandardCharsets.ISO_8859_1));
                                int i20 = zzi2 + 1;
                                int zzh4 = zzh(bArr5, i20, zzs8);
                                java.lang.String zzl = zzl(bArr5, i20, zzh4, zzf);
                                int zzj2 = zzh4 + zzj(zzs8);
                                int zzh5 = zzh(bArr5, zzj2, zzs8);
                                zzajjVar = new com.google.android.gms.internal.ads.zzajj(zzh3, zzl, zzl(bArr5, zzj2, zzh5, zzf), zzk(bArr5, zzh5 + zzj(zzs8), i19));
                                i6 = zzs2;
                                i7 = zzs3;
                                com.google.android.gms.internal.ads.zzajo zzajoVar22 = zzajjVar;
                                zzetVar12 = zzetVar;
                                zzajfVar = zzajoVar22;
                                zzetVar12.zzh(zzg);
                                zzajoVar = zzajfVar;
                                th2 = null;
                            } catch (java.lang.Exception e3) {
                                e = e3;
                                zzetVar2 = zzetVar;
                                i6 = zzs2;
                                i7 = zzs3;
                                th2 = e;
                                zzetVar4 = zzetVar2;
                                zzetVar4.zzh(zzg);
                                zzajoVar = null;
                                if (zzajoVar == null) {
                                }
                                return zzajoVar;
                            } catch (java.lang.OutOfMemoryError e4) {
                                e = e4;
                                zzetVar2 = zzetVar;
                                i6 = zzs2;
                                i7 = zzs3;
                                th2 = e;
                                zzetVar4 = zzetVar2;
                                zzetVar4.zzh(zzg);
                                zzajoVar = null;
                                if (zzajoVar == null) {
                                }
                                return zzajoVar;
                            }
                        } catch (java.lang.Exception | java.lang.OutOfMemoryError e5) {
                            e = e5;
                            i5 = zzs;
                        }
                    } catch (java.lang.Exception | java.lang.OutOfMemoryError e6) {
                        e = e6;
                        i5 = zzs;
                        str = "Id3Decoder";
                    }
                    if (zzajoVar == null) {
                    }
                    return zzajoVar;
                }
                i5 = zzs;
                str = "Id3Decoder";
                i8 = 71;
            }
            if (i != 2 ? !(i8 == 65 && zzs2 == 80 && zzs3 == 73 && zzs4 == 67) : !(i8 == 80 && zzs2 == 73 && zzs3 == 67)) {
                i9 = zzg;
                try {
                    try {
                        if (i8 != 67 || zzs2 != 79 || zzs3 != 77 || (zzs4 != 77 && i != 2)) {
                            zzetVar7 = zzetVar;
                            if (i8 == 67 && zzs2 == 72 && zzs3 == 65 && zzs4 == 80) {
                                int zzg4 = zzetVar.zzg();
                                int zzi3 = zzi(zzetVar.zzi(), zzg4);
                                java.lang.String str3 = new java.lang.String(zzetVar.zzi(), zzg4, zzi3 - zzg4, java.nio.charset.StandardCharsets.ISO_8859_1);
                                zzetVar7.zzh(zzi3 + 1);
                                int zzB = zzetVar.zzB();
                                int zzB2 = zzetVar.zzB();
                                if (zzB > zzB2) {
                                    zzetVar8 = zzetVar7;
                                    i6 = zzs2;
                                    i7 = zzs3;
                                    zzg = i9;
                                    zzetVar13 = zzetVar8;
                                    zzajfVar = null;
                                    zzetVar12 = zzetVar13;
                                } else {
                                    long zzz = zzetVar.zzz();
                                    if (zzz == 4294967295L) {
                                        zzz = -1;
                                    }
                                    long j = zzz;
                                    long zzz2 = zzetVar.zzz();
                                    if (zzz2 == 4294967295L) {
                                        zzz2 = -1;
                                    }
                                    long j2 = zzz2;
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    int i21 = zzg4 + zzH;
                                    while (zzetVar.zzg() < i21) {
                                        com.google.android.gms.internal.ads.zzajo zzc = zzc(i, zzetVar7, z, i2, null);
                                        if (zzc != null) {
                                            arrayList.add(zzc);
                                        }
                                    }
                                    zzajfVar = new com.google.android.gms.internal.ads.zzajg(str3, zzB, zzB2, j, j2, (com.google.android.gms.internal.ads.zzajo[]) arrayList.toArray(new com.google.android.gms.internal.ads.zzajo[0]));
                                    zzetVar11 = zzetVar7;
                                }
                            } else {
                                if (i8 == 67 && zzs2 == 84 && zzs3 == 79 && zzs4 == 67) {
                                    try {
                                        int zzg5 = zzetVar.zzg();
                                        int zzi4 = zzi(zzetVar.zzi(), zzg5);
                                        java.lang.String str4 = new java.lang.String(zzetVar.zzi(), zzg5, zzi4 - zzg5, java.nio.charset.StandardCharsets.ISO_8859_1);
                                        zzetVar7.zzh(zzi4 + 1);
                                        int zzs9 = zzetVar.zzs();
                                        boolean z7 = (zzs9 & 2) != 0;
                                        int i22 = zzs9 & 1;
                                        int zzs10 = zzetVar.zzs();
                                        java.lang.String[] strArr = new java.lang.String[zzs10];
                                        int i23 = 0;
                                        while (i23 < zzs10) {
                                            int zzg6 = zzetVar.zzg();
                                            int i24 = zzs10;
                                            int zzi5 = zzi(zzetVar.zzi(), zzg6);
                                            i12 = zzs4;
                                            try {
                                                i11 = zzs3;
                                                try {
                                                    i10 = zzs2;
                                                    java.lang.String str5 = str4;
                                                    try {
                                                        strArr[i23] = new java.lang.String(zzetVar.zzi(), zzg6, zzi5 - zzg6, java.nio.charset.StandardCharsets.ISO_8859_1);
                                                        zzetVar7.zzh(zzi5 + 1);
                                                        i23++;
                                                        zzs10 = i24;
                                                        zzs4 = i12;
                                                        str4 = str5;
                                                        zzs3 = i11;
                                                        zzs2 = i10;
                                                    } catch (java.lang.Exception e7) {
                                                        e = e7;
                                                        th2 = e;
                                                        zzs4 = i12;
                                                        i7 = i11;
                                                        i6 = i10;
                                                        zzetVar5 = zzetVar7;
                                                        zzg = i9;
                                                        zzetVar4 = zzetVar5;
                                                        zzetVar4.zzh(zzg);
                                                        zzajoVar = null;
                                                        if (zzajoVar == null) {
                                                        }
                                                        return zzajoVar;
                                                    } catch (java.lang.OutOfMemoryError e8) {
                                                        e = e8;
                                                        th2 = e;
                                                        zzs4 = i12;
                                                        i7 = i11;
                                                        i6 = i10;
                                                        zzetVar5 = zzetVar7;
                                                        zzg = i9;
                                                        zzetVar4 = zzetVar5;
                                                        zzetVar4.zzh(zzg);
                                                        zzajoVar = null;
                                                        if (zzajoVar == null) {
                                                        }
                                                        return zzajoVar;
                                                    }
                                                } catch (java.lang.Exception e9) {
                                                    e = e9;
                                                    i10 = zzs2;
                                                    th2 = e;
                                                    zzs4 = i12;
                                                    i7 = i11;
                                                    i6 = i10;
                                                    zzetVar5 = zzetVar7;
                                                    zzg = i9;
                                                    zzetVar4 = zzetVar5;
                                                    zzetVar4.zzh(zzg);
                                                    zzajoVar = null;
                                                    if (zzajoVar == null) {
                                                    }
                                                    return zzajoVar;
                                                } catch (java.lang.OutOfMemoryError e10) {
                                                    e = e10;
                                                    i10 = zzs2;
                                                    th2 = e;
                                                    zzs4 = i12;
                                                    i7 = i11;
                                                    i6 = i10;
                                                    zzetVar5 = zzetVar7;
                                                    zzg = i9;
                                                    zzetVar4 = zzetVar5;
                                                    zzetVar4.zzh(zzg);
                                                    zzajoVar = null;
                                                    if (zzajoVar == null) {
                                                    }
                                                    return zzajoVar;
                                                }
                                            } catch (java.lang.Exception e11) {
                                                e = e11;
                                                i10 = zzs2;
                                                i11 = zzs3;
                                                th2 = e;
                                                zzs4 = i12;
                                                i7 = i11;
                                                i6 = i10;
                                                zzetVar5 = zzetVar7;
                                                zzg = i9;
                                                zzetVar4 = zzetVar5;
                                                zzetVar4.zzh(zzg);
                                                zzajoVar = null;
                                                if (zzajoVar == null) {
                                                }
                                                return zzajoVar;
                                            } catch (java.lang.OutOfMemoryError e12) {
                                                e = e12;
                                                i10 = zzs2;
                                                i11 = zzs3;
                                                th2 = e;
                                                zzs4 = i12;
                                                i7 = i11;
                                                i6 = i10;
                                                zzetVar5 = zzetVar7;
                                                zzg = i9;
                                                zzetVar4 = zzetVar5;
                                                zzetVar4.zzh(zzg);
                                                zzajoVar = null;
                                                if (zzajoVar == null) {
                                                }
                                                return zzajoVar;
                                            }
                                        }
                                        i10 = zzs2;
                                        i11 = zzs3;
                                        java.lang.String str6 = str4;
                                        i12 = zzs4;
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                        int i25 = zzg5 + zzH;
                                        while (zzetVar.zzg() < i25) {
                                            com.google.android.gms.internal.ads.zzajo zzc2 = zzc(i, zzetVar7, z, i2, null);
                                            if (zzc2 != null) {
                                                arrayList2.add(zzc2);
                                            }
                                        }
                                        zzajfVar = new com.google.android.gms.internal.ads.zzajh(str6, z7, 1 == i22, strArr, (com.google.android.gms.internal.ads.zzajo[]) arrayList2.toArray(new com.google.android.gms.internal.ads.zzajo[0]));
                                        zzs4 = i12;
                                        i7 = i11;
                                        i6 = i10;
                                        zzetVar10 = zzetVar7;
                                    } catch (java.lang.Exception | java.lang.OutOfMemoryError e13) {
                                        i10 = zzs2;
                                        i11 = zzs3;
                                        th2 = e13;
                                    }
                                } else {
                                    int i26 = zzs4;
                                    if (i8 == 77) {
                                        i6 = zzs2;
                                        if (i6 == 76) {
                                            i7 = zzs3;
                                            zzs4 = i26;
                                            if (i7 == 76 && zzs4 == 84) {
                                                try {
                                                    int zzt2 = zzetVar.zzt();
                                                    int zzx = zzetVar.zzx();
                                                    int zzx2 = zzetVar.zzx();
                                                    int zzs11 = zzetVar.zzs();
                                                    int zzs12 = zzetVar.zzs();
                                                    com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes();
                                                    zzesVar.zza(zzetVar7);
                                                    int i27 = ((zzH - 10) * 8) / (zzs11 + zzs12);
                                                    int[] iArr = new int[i27];
                                                    int[] iArr2 = new int[i27];
                                                    for (int i28 = 0; i28 < i27; i28++) {
                                                        int zzj3 = zzesVar.zzj(zzs11);
                                                        int zzj4 = zzesVar.zzj(zzs12);
                                                        iArr[i28] = zzj3;
                                                        iArr2[i28] = zzj4;
                                                    }
                                                    zzajfVar = new com.google.android.gms.internal.ads.zzajr(zzt2, zzx, zzx2, iArr, iArr2);
                                                    zzetVar10 = zzetVar7;
                                                } catch (java.lang.Exception | java.lang.OutOfMemoryError e14) {
                                                    th2 = e14;
                                                    zzetVar5 = zzetVar7;
                                                    zzg = i9;
                                                    zzetVar4 = zzetVar5;
                                                    zzetVar4.zzh(zzg);
                                                    zzajoVar = null;
                                                    if (zzajoVar == null) {
                                                    }
                                                    return zzajoVar;
                                                }
                                            }
                                        } else {
                                            zzs4 = i26;
                                            i7 = zzs3;
                                        }
                                    } else {
                                        zzs4 = i26;
                                        i7 = zzs3;
                                        i6 = zzs2;
                                    }
                                    try {
                                        java.lang.String zzg7 = zzg(i, i8, i6, i7, zzs4);
                                        byte[] bArr6 = new byte[zzH];
                                        zzetVar7.zzm(bArr6, 0, zzH);
                                        zzajfVar = new com.google.android.gms.internal.ads.zzajf(zzg7, bArr6);
                                        zzetVar10 = zzetVar7;
                                    } catch (java.lang.Exception e15) {
                                        e = e15;
                                        zzg = i9;
                                        zzetVar2 = zzetVar7;
                                        th2 = e;
                                        zzetVar4 = zzetVar2;
                                        zzetVar4.zzh(zzg);
                                        zzajoVar = null;
                                        if (zzajoVar == null) {
                                        }
                                        return zzajoVar;
                                    } catch (java.lang.OutOfMemoryError e16) {
                                        e = e16;
                                        zzg = i9;
                                        zzetVar2 = zzetVar7;
                                        th2 = e;
                                        zzetVar4 = zzetVar2;
                                        zzetVar4.zzh(zzg);
                                        zzajoVar = null;
                                        if (zzajoVar == null) {
                                        }
                                        return zzajoVar;
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                        zzg = i9;
                                        zzetVar9 = zzetVar7;
                                        th = th;
                                        zzetVar3 = zzetVar9;
                                        zzetVar3.zzh(zzg);
                                        throw th;
                                    }
                                }
                                zzg = i9;
                                zzetVar12 = zzetVar10;
                            }
                        } else if (zzH < 4) {
                            zzetVar8 = zzetVar;
                            i6 = zzs2;
                            i7 = zzs3;
                            zzg = i9;
                            zzetVar13 = zzetVar8;
                            zzajfVar = null;
                            zzetVar12 = zzetVar13;
                        } else {
                            int zzs13 = zzetVar.zzs();
                            java.nio.charset.Charset zzf2 = zzf(zzs13);
                            byte[] bArr7 = new byte[3];
                            com.google.android.gms.internal.ads.zzet zzetVar14 = zzetVar;
                            zzetVar14.zzm(bArr7, 0, 3);
                            java.lang.String str7 = new java.lang.String(bArr7, 0, 3);
                            int i29 = zzH - 4;
                            byte[] bArr8 = new byte[i29];
                            zzetVar14.zzm(bArr8, 0, i29);
                            int zzh6 = zzh(bArr8, 0, zzs13);
                            java.lang.String str8 = new java.lang.String(bArr8, 0, zzh6, zzf2);
                            int zzj5 = zzh6 + zzj(zzs13);
                            zzajfVar = new com.google.android.gms.internal.ads.zzaji(str7, str8, zzl(bArr8, zzj5, zzh(bArr8, zzj5, zzs13), zzf2));
                            zzetVar11 = zzetVar14;
                        }
                        zzetVar12.zzh(zzg);
                        zzajoVar = zzajfVar;
                        th2 = null;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        th = th;
                        zzetVar6 = r82;
                        zzg = i9;
                        zzetVar3 = zzetVar6;
                        zzetVar3.zzh(zzg);
                        throw th;
                    }
                } catch (java.lang.Exception e17) {
                    e = e17;
                    th2 = e;
                    i6 = zzs2;
                    i7 = zzs3;
                    zzetVar5 = r8;
                    zzg = i9;
                    zzetVar4 = zzetVar5;
                    zzetVar4.zzh(zzg);
                    zzajoVar = null;
                    if (zzajoVar == null) {
                    }
                    return zzajoVar;
                } catch (java.lang.OutOfMemoryError e18) {
                    e = e18;
                    th2 = e;
                    i6 = zzs2;
                    i7 = zzs3;
                    zzetVar5 = r8;
                    zzg = i9;
                    zzetVar4 = zzetVar5;
                    zzetVar4.zzh(zzg);
                    zzajoVar = null;
                    if (zzajoVar == null) {
                    }
                    return zzajoVar;
                }
                if (zzajoVar == null) {
                }
                return zzajoVar;
            }
            try {
                int zzs14 = zzetVar.zzs();
                java.nio.charset.Charset zzf3 = zzf(zzs14);
                int i30 = zzH - 1;
                byte[] bArr9 = new byte[i30];
                zzetVar.zzm(bArr9, 0, i30);
                try {
                    if (i == 2) {
                        try {
                            i9 = zzg;
                            java.lang.String zza2 = com.google.android.gms.internal.ads.zzgss.zza(new java.lang.String(bArr9, 0, 3, java.nio.charset.StandardCharsets.ISO_8859_1));
                            java.lang.String.valueOf(zza2);
                            concat = "image/".concat(java.lang.String.valueOf(zza2));
                            if ("image/jpg".equals(concat)) {
                                concat = "image/jpeg";
                            }
                            i13 = 2;
                        } catch (java.lang.Exception e19) {
                            e = e19;
                            zzetVar2 = zzetVar;
                            i6 = zzs2;
                            i7 = zzs3;
                            th2 = e;
                            zzetVar4 = zzetVar2;
                            zzetVar4.zzh(zzg);
                            zzajoVar = null;
                            if (zzajoVar == null) {
                            }
                            return zzajoVar;
                        } catch (java.lang.OutOfMemoryError e20) {
                            e = e20;
                            zzetVar2 = zzetVar;
                            i6 = zzs2;
                            i7 = zzs3;
                            th2 = e;
                            zzetVar4 = zzetVar2;
                            zzetVar4.zzh(zzg);
                            zzajoVar = null;
                            if (zzajoVar == null) {
                            }
                            return zzajoVar;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            th = th;
                            zzetVar3 = zzetVar;
                            zzetVar3.zzh(zzg);
                            throw th;
                        }
                    } else {
                        i9 = zzg;
                        i13 = zzi(bArr9, 0);
                        java.lang.String zza3 = com.google.android.gms.internal.ads.zzgss.zza(new java.lang.String(bArr9, 0, i13, java.nio.charset.StandardCharsets.ISO_8859_1));
                        if (zza3.indexOf(47) == -1) {
                            java.lang.String.valueOf(zza3);
                            concat = "image/".concat(java.lang.String.valueOf(zza3));
                        } else {
                            concat = zza3;
                            int i31 = bArr9[i13 + 1] & 255;
                            int i32 = i13 + 2;
                            int zzh7 = zzh(bArr9, i32, zzs14);
                            com.google.android.gms.internal.ads.zzaje zzajeVar = new com.google.android.gms.internal.ads.zzaje(concat, new java.lang.String(bArr9, i32, zzh7 - i32, zzf3), i31, zzk(bArr9, zzh7 + zzj(zzs14), i30));
                            zzetVar11 = zzetVar;
                            zzajfVar = zzajeVar;
                        }
                    }
                    int i312 = bArr9[i13 + 1] & 255;
                    int i322 = i13 + 2;
                    int zzh72 = zzh(bArr9, i322, zzs14);
                    com.google.android.gms.internal.ads.zzaje zzajeVar2 = new com.google.android.gms.internal.ads.zzaje(concat, new java.lang.String(bArr9, i322, zzh72 - i322, zzf3), i312, zzk(bArr9, zzh72 + zzj(zzs14), i30));
                    zzetVar11 = zzetVar;
                    zzajfVar = zzajeVar2;
                } catch (java.lang.Exception e21) {
                    e = e21;
                    zzetVar7 = zzetVar;
                    i6 = zzs2;
                    i7 = zzs3;
                    zzg = i9;
                    zzetVar2 = zzetVar7;
                    th2 = e;
                    zzetVar4 = zzetVar2;
                    zzetVar4.zzh(zzg);
                    zzajoVar = null;
                    if (zzajoVar == null) {
                    }
                    return zzajoVar;
                } catch (java.lang.OutOfMemoryError e22) {
                    e = e22;
                    zzetVar7 = zzetVar;
                    i6 = zzs2;
                    i7 = zzs3;
                    zzg = i9;
                    zzetVar2 = zzetVar7;
                    th2 = e;
                    zzetVar4 = zzetVar2;
                    zzetVar4.zzh(zzg);
                    zzajoVar = null;
                    if (zzajoVar == null) {
                    }
                    return zzajoVar;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    zzetVar6 = zzetVar;
                    zzg = i9;
                    zzetVar3 = zzetVar6;
                    zzetVar3.zzh(zzg);
                    throw th;
                }
            } catch (java.lang.Exception e23) {
                e = e23;
                zzetVar4 = zzetVar;
                th2 = e;
                i6 = zzs2;
                i7 = zzs3;
                zzetVar4.zzh(zzg);
                zzajoVar = null;
                if (zzajoVar == null) {
                }
                return zzajoVar;
            } catch (java.lang.OutOfMemoryError e24) {
                e = e24;
                zzetVar4 = zzetVar;
                th2 = e;
                i6 = zzs2;
                i7 = zzs3;
                zzetVar4.zzh(zzg);
                zzajoVar = null;
                if (zzajoVar == null) {
                }
                return zzajoVar;
            } catch (java.lang.Throwable th8) {
                th = th8;
                zzetVar9 = zzetVar;
                th = th;
                zzetVar3 = zzetVar9;
                zzetVar3.zzh(zzg);
                throw th;
            }
            i6 = zzs2;
            i7 = zzs3;
            zzetVar10 = zzetVar11;
            zzg = i9;
            zzetVar12 = zzetVar10;
            zzetVar12.zzh(zzg);
            zzajoVar = zzajfVar;
            th2 = null;
            if (zzajoVar == null) {
            }
            return zzajoVar;
        }
        java.lang.String zzg8 = zzg(i, 87, zzs2, zzs3, zzs4);
        byte[] bArr10 = new byte[zzH];
        zzetVar.zzm(bArr10, 0, zzH);
        zzajsVar = new com.google.android.gms.internal.ads.zzaju(zzg8, null, new java.lang.String(bArr10, 0, zzi(bArr10, 0), java.nio.charset.StandardCharsets.ISO_8859_1));
        zzetVar12 = zzetVar;
        zzajfVar = zzajsVar;
        i5 = zzs;
        i6 = zzs2;
        i7 = zzs3;
        str = "Id3Decoder";
        zzetVar12.zzh(zzg);
        zzajoVar = zzajfVar;
        th2 = null;
        if (zzajoVar == null) {
        }
        return zzajoVar;
    }

    private static com.google.android.gms.internal.ads.zzgwm zzd(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return com.google.android.gms.internal.ads.zzgwm.zzj("");
        }
        int i3 = com.google.android.gms.internal.ads.zzgwm.zzd;
        com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
        int zzh = zzh(bArr, i2, i);
        while (i2 < zzh) {
            zzgwjVar.zzf(new java.lang.String(bArr, i2, zzh - i2, zzf(i)));
            i2 = zzj(i) + zzh;
            zzh = zzh(bArr, i2, i);
        }
        com.google.android.gms.internal.ads.zzgwm zzi = zzgwjVar.zzi();
        return zzi.isEmpty() ? com.google.android.gms.internal.ads.zzgwm.zzj("") : zzi;
    }

    private static int zze(com.google.android.gms.internal.ads.zzet zzetVar, int i) {
        byte[] zzi = zzetVar.zzi();
        int zzg = zzetVar.zzg();
        int i2 = zzg;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= zzg + i) {
                return i;
            }
            if ((zzi[i2] & 255) == 255 && zzi[i3] == 0) {
                java.lang.System.arraycopy(zzi, i2 + 2, zzi, i3, (i - (i2 - zzg)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static java.lang.String zzg(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? java.lang.String.format(java.util.Locale.US, "%c%c%c", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4)) : java.lang.String.format(java.util.Locale.US, "%c%c%c%c", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5));
    }

    private static int zzh(byte[] bArr, int i, int i2) {
        int zzi = zzi(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzi;
        }
        while (true) {
            int length = bArr.length;
            if (zzi >= length - 1) {
                return length;
            }
            int i3 = zzi + 1;
            if ((zzi - i) % 2 == 0 && bArr[i3] == 0) {
                return zzi;
            }
            zzi = zzi(bArr, i3);
        }
    }

    private static int zzi(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zzj(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static byte[] zzk(byte[] bArr, int i, int i2) {
        return i2 <= i ? com.google.android.gms.internal.ads.zzfl.zzb : java.util.Arrays.copyOfRange(bArr, i, i2);
    }

    private static java.lang.String zzl(byte[] bArr, int i, int i2, java.nio.charset.Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new java.lang.String(bArr, i, i2 - i, charset);
    }

    private static java.nio.charset.Charset zzf(int i) {
        return i != 1 ? i != 2 ? i != 3 ? java.nio.charset.StandardCharsets.ISO_8859_1 : java.nio.charset.StandardCharsets.UTF_8 : java.nio.charset.StandardCharsets.UTF_16BE : java.nio.charset.StandardCharsets.UTF_16;
    }
}
