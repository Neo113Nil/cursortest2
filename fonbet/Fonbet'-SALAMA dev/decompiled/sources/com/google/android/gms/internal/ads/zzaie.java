package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaie {
    public static zzau zza(zzed zzedVar) {
        String str;
        int zzg = zzedVar.zzg() + zzedVar.zzd();
        int zzg2 = zzedVar.zzg();
        int i7 = (zzg2 >> 24) & 255;
        zzau zzauVar = null;
        try {
            if (i7 == 169 || i7 == 253) {
                int i8 = zzg2 & 16777215;
                if (i8 == 6516084) {
                    int zzg3 = zzedVar.zzg();
                    if (zzedVar.zzg() == 1684108385) {
                        zzedVar.zzM(8);
                        String zzA = zzedVar.zzA(zzg3 - 16);
                        zzauVar = new zzaga("und", zzA, zzA);
                    } else {
                        zzdq.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzet.zze(zzg2)));
                    }
                } else {
                    if (i8 != 7233901 && i8 != 7631467) {
                        if (i8 != 6516589 && i8 != 7828084) {
                            if (i8 == 6578553) {
                                zzauVar = zze(zzg2, "TDRC", zzedVar);
                            } else if (i8 == 4280916) {
                                zzauVar = zze(zzg2, "TPE1", zzedVar);
                            } else if (i8 == 7630703) {
                                zzauVar = zze(zzg2, "TSSE", zzedVar);
                            } else if (i8 == 6384738) {
                                zzauVar = zze(zzg2, "TALB", zzedVar);
                            } else if (i8 == 7108978) {
                                zzauVar = zze(zzg2, "USLT", zzedVar);
                            } else if (i8 == 6776174) {
                                zzauVar = zze(zzg2, "TCON", zzedVar);
                            } else {
                                if (i8 == 6779504) {
                                    zzauVar = zze(zzg2, "TIT1", zzedVar);
                                }
                                zzdq.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzet.zze(zzg2));
                            }
                        }
                        zzauVar = zze(zzg2, "TCOM", zzedVar);
                    }
                    zzauVar = zze(zzg2, "TIT2", zzedVar);
                }
            } else if (zzg2 == 1735291493) {
                String zza = zzagg.zza(zzb(zzedVar) - 1);
                if (zza != null) {
                    zzauVar = new zzagk("TCON", null, zzfwh.zzo(zza));
                } else {
                    zzdq.zzf("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (zzg2 == 1684632427) {
                zzauVar = zzd(1684632427, "TPOS", zzedVar);
            } else if (zzg2 == 1953655662) {
                zzauVar = zzd(1953655662, "TRCK", zzedVar);
            } else if (zzg2 == 1953329263) {
                zzauVar = zzc(1953329263, "TBPM", zzedVar, true, false);
            } else if (zzg2 == 1668311404) {
                zzauVar = zzc(1668311404, "TCMP", zzedVar, true, true);
            } else if (zzg2 == 1668249202) {
                int zzg4 = zzedVar.zzg();
                if (zzedVar.zzg() == 1684108385) {
                    int zzg5 = zzedVar.zzg();
                    int i9 = zzahw.zza;
                    int i10 = zzg5 & 16777215;
                    if (i10 == 13) {
                        str = "image/jpeg";
                    } else if (i10 == 14) {
                        str = "image/png";
                        i10 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        zzdq.zzf("MetadataUtil", "Unrecognized cover art flags: " + i10);
                    } else {
                        zzedVar.zzM(4);
                        int i11 = zzg4 - 16;
                        byte[] bArr = new byte[i11];
                        zzedVar.zzH(bArr, 0, i11);
                        zzauVar = new zzafw(str, null, 3, bArr);
                    }
                } else {
                    zzdq.zzf("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (zzg2 == 1631670868) {
                zzauVar = zze(1631670868, "TPE2", zzedVar);
            } else if (zzg2 == 1936682605) {
                zzauVar = zze(1936682605, "TSOT", zzedVar);
            } else if (zzg2 == 1936679276) {
                zzauVar = zze(1936679276, "TSOA", zzedVar);
            } else if (zzg2 == 1936679282) {
                zzauVar = zze(1936679282, "TSOP", zzedVar);
            } else if (zzg2 == 1936679265) {
                zzauVar = zze(1936679265, "TSO2", zzedVar);
            } else if (zzg2 == 1936679791) {
                zzauVar = zze(1936679791, "TSOC", zzedVar);
            } else if (zzg2 == 1920233063) {
                zzauVar = zzc(1920233063, "ITUNESADVISORY", zzedVar, false, false);
            } else if (zzg2 == 1885823344) {
                zzauVar = zzc(1885823344, "ITUNESGAPLESS", zzedVar, false, true);
            } else if (zzg2 == 1936683886) {
                zzauVar = zze(1936683886, "TVSHOWSORT", zzedVar);
            } else if (zzg2 == 1953919848) {
                zzauVar = zze(1953919848, "TVSHOW", zzedVar);
            } else {
                if (zzg2 == 757935405) {
                    String str2 = null;
                    String str3 = null;
                    int i12 = -1;
                    int i13 = -1;
                    while (zzedVar.zzd() < zzg) {
                        int zzd = zzedVar.zzd();
                        int zzg6 = zzedVar.zzg();
                        int zzg7 = zzedVar.zzg();
                        zzedVar.zzM(4);
                        if (zzg7 == 1835360622) {
                            str2 = zzedVar.zzA(zzg6 - 12);
                        } else {
                            int i14 = zzg6 - 12;
                            if (zzg7 == 1851878757) {
                                str3 = zzedVar.zzA(i14);
                            } else {
                                if (zzg7 == 1684108385) {
                                    i13 = zzg6;
                                }
                                if (zzg7 == 1684108385) {
                                    i12 = zzd;
                                }
                                zzedVar.zzM(i14);
                            }
                        }
                    }
                    if (str2 != null && str3 != null && i12 != -1) {
                        zzedVar.zzL(i12);
                        zzedVar.zzM(16);
                        zzauVar = new zzagh(str2, str3, zzedVar.zzA(i13 - 16));
                    }
                }
                zzdq.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzet.zze(zzg2));
            }
            return zzauVar;
        } finally {
            zzedVar.zzL(zzg);
        }
    }

    private static int zzb(zzed zzedVar) {
        int zzg = zzedVar.zzg();
        if (zzedVar.zzg() == 1684108385) {
            zzedVar.zzM(8);
            int i7 = zzg - 16;
            if (i7 == 1) {
                return zzedVar.zzm();
            }
            if (i7 == 2) {
                return zzedVar.zzq();
            }
            if (i7 == 3) {
                return zzedVar.zzo();
            }
            if (i7 == 4 && (zzedVar.zzf() & 128) == 0) {
                return zzedVar.zzp();
            }
        }
        zzdq.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzagf zzc(int i7, String str, zzed zzedVar, boolean z4, boolean z7) {
        int zzb = zzb(zzedVar);
        if (z7) {
            zzb = Math.min(1, zzb);
        }
        if (zzb >= 0) {
            return z4 ? new zzagk(str, null, zzfwh.zzo(Integer.toString(zzb))) : new zzaga("und", str, Integer.toString(zzb));
        }
        zzdq.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzet.zze(i7)));
        return null;
    }

    private static zzagk zzd(int i7, String str, zzed zzedVar) {
        int zzg = zzedVar.zzg();
        if (zzedVar.zzg() == 1684108385 && zzg >= 22) {
            zzedVar.zzM(10);
            int zzq = zzedVar.zzq();
            if (zzq > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzq);
                String sb2 = sb.toString();
                int zzq2 = zzedVar.zzq();
                if (zzq2 > 0) {
                    sb2 = sb2 + "/" + zzq2;
                }
                return new zzagk(str, null, zzfwh.zzo(sb2));
            }
        }
        zzdq.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzet.zze(i7)));
        return null;
    }

    private static zzagk zze(int i7, String str, zzed zzedVar) {
        int zzg = zzedVar.zzg();
        if (zzedVar.zzg() == 1684108385) {
            zzedVar.zzM(8);
            return new zzagk(str, null, zzfwh.zzo(zzedVar.zzA(zzg - 16)));
        }
        zzdq.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzet.zze(i7)));
        return null;
    }
}
