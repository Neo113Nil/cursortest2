package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzalt {
    public static void zza(int i, com.google.android.gms.internal.ads.zzap zzapVar, com.google.android.gms.internal.ads.zzt zztVar, com.google.android.gms.internal.ads.zzap zzapVar2, com.google.android.gms.internal.ads.zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, new com.google.android.gms.internal.ads.zzao[0]);
        }
        if (zzapVar != null) {
            com.google.android.gms.internal.ads.zzgwm zzd = zzapVar.zzd(com.google.android.gms.internal.ads.zzfv.class);
            int size = zzd.size();
            for (int i2 = 0; i2 < size; i2++) {
                com.google.android.gms.internal.ads.zzfv zzfvVar = (com.google.android.gms.internal.ads.zzfv) zzd.get(i2);
                if (!zzfvVar.zza.equals("com.android.capture.fps") || i == 2) {
                    zzapVar2 = zzapVar2.zzg(zzfvVar);
                }
            }
        }
        for (com.google.android.gms.internal.ads.zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.zzf(zzapVar3);
        }
        if (zzapVar2.zza() > 0) {
            zztVar.zzl(zzapVar2);
        }
    }

    public static void zzb(int i, com.google.android.gms.internal.ads.zzagr zzagrVar, com.google.android.gms.internal.ads.zzt zztVar) {
        if (i == 1 && zzagrVar.zzb()) {
            zztVar.zzJ(zzagrVar.zza);
            zztVar.zzK(zzagrVar.zzb);
        }
    }

    public static com.google.android.gms.internal.ads.zzao zzc(com.google.android.gms.internal.ads.zzet zzetVar) {
        java.lang.String str;
        com.google.android.gms.internal.ads.zzao zzajeVar;
        int zzg = zzetVar.zzg() + zzetVar.zzB();
        int zzB = zzetVar.zzB();
        int i = (zzB >> 24) & 255;
        com.google.android.gms.internal.ads.zzao zzaoVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = zzB & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
                if (i2 == 6516084) {
                    int zzB2 = zzetVar.zzB();
                    if (zzetVar.zzB() == 1684108385) {
                        zzetVar.zzk(8);
                        java.lang.String zzL = zzetVar.zzL(zzB2 - 16);
                        zzaoVar = new com.google.android.gms.internal.ads.zzaji("und", zzL, zzL);
                    } else {
                        com.google.android.gms.internal.ads.zzeg.zzc("MetadataUtil", "Failed to parse comment attribute: ".concat(com.google.android.gms.internal.ads.zzfz.zze(zzB)));
                    }
                } else {
                    if (i2 != 7233901 && i2 != 7631467) {
                        if (i2 != 6516589 && i2 != 7828084) {
                            if (i2 == 6578553) {
                                zzaoVar = zzd(zzB, "TDRC", zzetVar);
                            } else if (i2 == 4280916) {
                                zzaoVar = zzd(zzB, "TPE1", zzetVar);
                            } else if (i2 == 7630703) {
                                zzaoVar = zzd(zzB, "TSSE", zzetVar);
                            } else if (i2 == 6384738) {
                                zzaoVar = zzd(zzB, "TALB", zzetVar);
                            } else if (i2 == 7108978) {
                                zzaoVar = zzd(zzB, "USLT", zzetVar);
                            } else if (i2 == 6776174) {
                                zzaoVar = zzd(zzB, "TCON", zzetVar);
                            } else if (i2 == 6779504) {
                                zzaoVar = zzd(zzB, "TIT1", zzetVar);
                            } else if (i2 == 7173742) {
                                zzaoVar = zzd(zzB, "MVNM", zzetVar);
                            } else {
                                if (i2 == 7173737) {
                                    zzaoVar = zze(zzB, "MVIN", zzetVar, true, false);
                                }
                                java.lang.String zze = com.google.android.gms.internal.ads.zzfz.zze(zzB);
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(zze.length() + 32);
                                sb.append("Skipped unknown metadata entry: ");
                                sb.append(zze);
                                com.google.android.gms.internal.ads.zzeg.zza("MetadataUtil", sb.toString());
                            }
                        }
                        zzaoVar = zzd(zzB, "TCOM", zzetVar);
                    }
                    zzaoVar = zzd(zzB, "TIT2", zzetVar);
                }
            } else if (zzB == 1735291493) {
                java.lang.String zza = com.google.android.gms.internal.ads.zzajp.zza(zzf(zzetVar) - 1);
                if (zza != null) {
                    zzajeVar = new com.google.android.gms.internal.ads.zzajt("TCON", null, com.google.android.gms.internal.ads.zzgwm.zzj(zza));
                    zzaoVar = zzajeVar;
                } else {
                    com.google.android.gms.internal.ads.zzeg.zzc("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (zzB == 1684632427) {
                zzaoVar = zzg(1684632427, "TPOS", zzetVar);
            } else if (zzB == 1953655662) {
                zzaoVar = zzg(1953655662, "TRCK", zzetVar);
            } else if (zzB == 1953329263) {
                zzaoVar = zze(1953329263, "TBPM", zzetVar, true, false);
            } else if (zzB == 1668311404) {
                zzaoVar = zze(1668311404, "TCMP", zzetVar, true, true);
            } else if (zzB == 1668249202) {
                int zzB3 = zzetVar.zzB();
                if (zzetVar.zzB() == 1684108385) {
                    int zzB4 = zzetVar.zzB();
                    int i3 = com.google.android.gms.internal.ads.zzalj.zza;
                    int i4 = zzB4 & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
                    if (i4 == 13) {
                        str = "image/jpeg";
                    } else if (i4 == 14) {
                        str = androidx.media3.common.MimeTypes.IMAGE_PNG;
                        i4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i4).length() + 30);
                        sb2.append("Unrecognized cover art flags: ");
                        sb2.append(i4);
                        com.google.android.gms.internal.ads.zzeg.zzc("MetadataUtil", sb2.toString());
                    } else {
                        zzetVar.zzk(4);
                        int i5 = zzB3 - 16;
                        byte[] bArr = new byte[i5];
                        zzetVar.zzm(bArr, 0, i5);
                        zzajeVar = new com.google.android.gms.internal.ads.zzaje(str, null, 3, bArr);
                        zzaoVar = zzajeVar;
                    }
                } else {
                    com.google.android.gms.internal.ads.zzeg.zzc("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (zzB == 1631670868) {
                zzaoVar = zzd(1631670868, "TPE2", zzetVar);
            } else if (zzB == 1936682605) {
                zzaoVar = zzd(1936682605, "TSOT", zzetVar);
            } else if (zzB == 1936679276) {
                zzaoVar = zzd(1936679276, "TSOA", zzetVar);
            } else if (zzB == 1936679282) {
                zzaoVar = zzd(1936679282, "TSOP", zzetVar);
            } else if (zzB == 1936679265) {
                zzaoVar = zzd(1936679265, "TSO2", zzetVar);
            } else if (zzB == 1936679791) {
                zzaoVar = zzd(1936679791, "TSOC", zzetVar);
            } else if (zzB == 1920233063) {
                zzaoVar = zze(1920233063, "ITUNESADVISORY", zzetVar, false, false);
            } else if (zzB == 1885823344) {
                zzaoVar = zze(1885823344, "ITUNESGAPLESS", zzetVar, false, true);
            } else if (zzB == 1936683886) {
                zzaoVar = zzd(1936683886, "TVSHOWSORT", zzetVar);
            } else if (zzB == 1953919848) {
                zzaoVar = zzd(1953919848, "TVSHOW", zzetVar);
            } else {
                if (zzB == 757935405) {
                    java.lang.String str2 = null;
                    java.lang.String str3 = null;
                    int i6 = -1;
                    int i7 = -1;
                    while (zzetVar.zzg() < zzg) {
                        int zzg2 = zzetVar.zzg();
                        int zzB5 = zzetVar.zzB();
                        int zzB6 = zzetVar.zzB();
                        zzetVar.zzk(4);
                        if (zzB6 == 1835360622) {
                            str2 = zzetVar.zzL(zzB5 - 12);
                        } else {
                            int i8 = zzB5 - 12;
                            if (zzB6 == 1851878757) {
                                str3 = zzetVar.zzL(i8);
                            } else {
                                if (zzB6 == 1684108385) {
                                    i7 = zzB5;
                                }
                                if (zzB6 == 1684108385) {
                                    i6 = zzg2;
                                }
                                zzetVar.zzk(i8);
                            }
                        }
                    }
                    if (str2 != null && str3 != null && i6 != -1) {
                        zzetVar.zzh(i6);
                        zzetVar.zzk(16);
                        zzaoVar = new com.google.android.gms.internal.ads.zzajq(str2, str3, zzetVar.zzL(i7 - 16));
                    }
                }
                java.lang.String zze2 = com.google.android.gms.internal.ads.zzfz.zze(zzB);
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(zze2.length() + 32);
                sb3.append("Skipped unknown metadata entry: ");
                sb3.append(zze2);
                com.google.android.gms.internal.ads.zzeg.zza("MetadataUtil", sb3.toString());
            }
            return zzaoVar;
        } finally {
            zzetVar.zzh(zzg);
        }
    }

    private static com.google.android.gms.internal.ads.zzajt zzd(int i, java.lang.String str, com.google.android.gms.internal.ads.zzet zzetVar) {
        int zzB = zzetVar.zzB();
        if (zzetVar.zzB() == 1684108385) {
            zzetVar.zzk(8);
            return new com.google.android.gms.internal.ads.zzajt(str, null, com.google.android.gms.internal.ads.zzgwm.zzj(zzetVar.zzL(zzB - 16)));
        }
        com.google.android.gms.internal.ads.zzeg.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(com.google.android.gms.internal.ads.zzfz.zze(i)));
        return null;
    }

    private static com.google.android.gms.internal.ads.zzajo zze(int i, java.lang.String str, com.google.android.gms.internal.ads.zzet zzetVar, boolean z, boolean z2) {
        int zzf = zzf(zzetVar);
        if (z2) {
            zzf = java.lang.Math.min(1, zzf);
        }
        if (zzf >= 0) {
            return z ? new com.google.android.gms.internal.ads.zzajt(str, null, com.google.android.gms.internal.ads.zzgwm.zzj(java.lang.Integer.toString(zzf))) : new com.google.android.gms.internal.ads.zzaji("und", str, java.lang.Integer.toString(zzf));
        }
        com.google.android.gms.internal.ads.zzeg.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(com.google.android.gms.internal.ads.zzfz.zze(i)));
        return null;
    }

    private static int zzf(com.google.android.gms.internal.ads.zzet zzetVar) {
        int zzB = zzetVar.zzB();
        if (zzetVar.zzB() == 1684108385) {
            zzetVar.zzk(8);
            int i = zzB - 16;
            if (i == 1) {
                return zzetVar.zzs();
            }
            if (i == 2) {
                return zzetVar.zzt();
            }
            if (i == 3) {
                return zzetVar.zzx();
            }
            if (i == 4 && (zzetVar.zzn() & 128) == 0) {
                return zzetVar.zzH();
            }
        }
        com.google.android.gms.internal.ads.zzeg.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static com.google.android.gms.internal.ads.zzajt zzg(int i, java.lang.String str, com.google.android.gms.internal.ads.zzet zzetVar) {
        int zzB = zzetVar.zzB();
        if (zzetVar.zzB() == 1684108385 && zzB >= 22) {
            zzetVar.zzk(10);
            int zzt = zzetVar.zzt();
            if (zzt > 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzt).length());
                sb.append(zzt);
                java.lang.String sb2 = sb.toString();
                int zzt2 = zzetVar.zzt();
                if (zzt2 > 0) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(sb2.length() + 1 + java.lang.String.valueOf(zzt2).length());
                    sb3.append(sb2);
                    sb3.append(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING);
                    sb3.append(zzt2);
                    sb2 = sb3.toString();
                }
                return new com.google.android.gms.internal.ads.zzajt(str, null, com.google.android.gms.internal.ads.zzgwm.zzj(sb2));
            }
        }
        com.google.android.gms.internal.ads.zzeg.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(com.google.android.gms.internal.ads.zzfz.zze(i)));
        return null;
    }
}
