package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzaie {
    /* JADX WARN: Code duplicated, block: B:128:0x0260 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:9:0x003b, B:11:0x0046, B:14:0x0055, B:17:0x0061, B:20:0x006e, B:23:0x007d, B:26:0x008a, B:29:0x0098, B:31:0x00a2, B:39:0x00bf, B:40:0x00d0, B:41:0x00e3, B:44:0x00ef, B:47:0x00fc, B:50:0x0109, B:53:0x0116, B:56:0x0123, B:59:0x0130, B:62:0x013d, B:64:0x0147, B:66:0x0151, B:68:0x015b, B:72:0x016c, B:74:0x0172, B:76:0x0186, B:77:0x018d, B:79:0x0194, B:84:0x019f, B:90:0x01ac, B:128:0x0260, B:91:0x01c1, B:93:0x01c8, B:95:0x01d2, B:96:0x01e6, B:109:0x0212, B:112:0x021f, B:115:0x022b, B:118:0x0237, B:121:0x0243, B:124:0x024f, B:127:0x0259, B:129:0x0274, B:130:0x027b), top: B:135:0x002d }] */
    /* JADX WARN: Instruction removed from duplicated block: B:128:0x0260, please report this as an issue */
    public static zzau zza(zzed zzedVar) {
        String str;
        int iZzg = zzedVar.zzg() + zzedVar.zzd();
        int iZzg2 = zzedVar.zzg();
        int i7 = (iZzg2 >> 24) & 255;
        zzau zzauVarZze = null;
        try {
            if (i7 == 169 || i7 == 253) {
                int i8 = iZzg2 & 16777215;
                if (i8 == 6516084) {
                    int iZzg3 = zzedVar.zzg();
                    if (zzedVar.zzg() == 1684108385) {
                        zzedVar.zzM(8);
                        String strZzA = zzedVar.zzA(iZzg3 - 16);
                        zzauVarZze = new zzaga("und", strZzA, strZzA);
                    } else {
                        zzdq.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzet.zze(iZzg2)));
                    }
                } else if (i8 == 7233901 || i8 == 7631467) {
                    zzauVarZze = zze(iZzg2, "TIT2", zzedVar);
                } else if (i8 == 6516589 || i8 == 7828084) {
                    zzauVarZze = zze(iZzg2, "TCOM", zzedVar);
                } else if (i8 == 6578553) {
                    zzauVarZze = zze(iZzg2, "TDRC", zzedVar);
                } else if (i8 == 4280916) {
                    zzauVarZze = zze(iZzg2, "TPE1", zzedVar);
                } else if (i8 == 7630703) {
                    zzauVarZze = zze(iZzg2, "TSSE", zzedVar);
                } else if (i8 == 6384738) {
                    zzauVarZze = zze(iZzg2, "TALB", zzedVar);
                } else if (i8 == 7108978) {
                    zzauVarZze = zze(iZzg2, "USLT", zzedVar);
                } else if (i8 == 6776174) {
                    zzauVarZze = zze(iZzg2, "TCON", zzedVar);
                } else if (i8 == 6779504) {
                    zzauVarZze = zze(iZzg2, "TIT1", zzedVar);
                } else {
                    zzdq.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzet.zze(iZzg2));
                }
            } else if (iZzg2 == 1735291493) {
                String strZza = zzagg.zza(zzb(zzedVar) - 1);
                if (strZza != null) {
                    zzauVarZze = new zzagk("TCON", null, zzfwh.zzo(strZza));
                } else {
                    zzdq.zzf("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (iZzg2 == 1684632427) {
                zzauVarZze = zzd(1684632427, "TPOS", zzedVar);
            } else if (iZzg2 == 1953655662) {
                zzauVarZze = zzd(1953655662, "TRCK", zzedVar);
            } else if (iZzg2 == 1953329263) {
                zzauVarZze = zzc(1953329263, "TBPM", zzedVar, true, false);
            } else if (iZzg2 == 1668311404) {
                zzauVarZze = zzc(1668311404, "TCMP", zzedVar, true, true);
            } else if (iZzg2 == 1668249202) {
                int iZzg4 = zzedVar.zzg();
                if (zzedVar.zzg() == 1684108385) {
                    int iZzg5 = zzedVar.zzg();
                    int i9 = zzahw.zza;
                    int i10 = iZzg5 & 16777215;
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
                        int i11 = iZzg4 - 16;
                        byte[] bArr = new byte[i11];
                        zzedVar.zzH(bArr, 0, i11);
                        zzauVarZze = new zzafw(str, null, 3, bArr);
                    }
                } else {
                    zzdq.zzf("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (iZzg2 == 1631670868) {
                zzauVarZze = zze(1631670868, "TPE2", zzedVar);
            } else if (iZzg2 == 1936682605) {
                zzauVarZze = zze(1936682605, "TSOT", zzedVar);
            } else if (iZzg2 == 1936679276) {
                zzauVarZze = zze(1936679276, "TSOA", zzedVar);
            } else if (iZzg2 == 1936679282) {
                zzauVarZze = zze(1936679282, "TSOP", zzedVar);
            } else if (iZzg2 == 1936679265) {
                zzauVarZze = zze(1936679265, "TSO2", zzedVar);
            } else if (iZzg2 == 1936679791) {
                zzauVarZze = zze(1936679791, "TSOC", zzedVar);
            } else if (iZzg2 == 1920233063) {
                zzauVarZze = zzc(1920233063, "ITUNESADVISORY", zzedVar, false, false);
            } else if (iZzg2 == 1885823344) {
                zzauVarZze = zzc(1885823344, "ITUNESGAPLESS", zzedVar, false, true);
            } else if (iZzg2 == 1936683886) {
                zzauVarZze = zze(1936683886, "TVSHOWSORT", zzedVar);
            } else if (iZzg2 == 1953919848) {
                zzauVarZze = zze(1953919848, "TVSHOW", zzedVar);
            } else if (iZzg2 == 757935405) {
                String strZzA2 = null;
                String strZzA3 = null;
                int i12 = -1;
                int i13 = -1;
                while (zzedVar.zzd() < iZzg) {
                    int iZzd = zzedVar.zzd();
                    int iZzg6 = zzedVar.zzg();
                    int iZzg7 = zzedVar.zzg();
                    zzedVar.zzM(4);
                    if (iZzg7 == 1835360622) {
                        strZzA2 = zzedVar.zzA(iZzg6 - 12);
                    } else {
                        int i14 = iZzg6 - 12;
                        if (iZzg7 == 1851878757) {
                            strZzA3 = zzedVar.zzA(i14);
                        } else {
                            if (iZzg7 == 1684108385) {
                                i13 = iZzg6;
                            }
                            if (iZzg7 == 1684108385) {
                                i12 = iZzd;
                            }
                            zzedVar.zzM(i14);
                        }
                    }
                }
                if (strZzA2 != null && strZzA3 != null && i12 != -1) {
                    zzedVar.zzL(i12);
                    zzedVar.zzM(16);
                    zzauVarZze = new zzagh(strZzA2, strZzA3, zzedVar.zzA(i13 - 16));
                }
            } else {
                zzdq.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzet.zze(iZzg2));
            }
            zzedVar.zzL(iZzg);
            return zzauVarZze;
        } catch (Throwable th) {
            zzedVar.zzL(iZzg);
            throw th;
        }
    }

    private static int zzb(zzed zzedVar) {
        int iZzg = zzedVar.zzg();
        if (zzedVar.zzg() == 1684108385) {
            zzedVar.zzM(8);
            int i7 = iZzg - 16;
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
        int iZzb = zzb(zzedVar);
        if (z7) {
            iZzb = Math.min(1, iZzb);
        }
        if (iZzb >= 0) {
            return z4 ? new zzagk(str, null, zzfwh.zzo(Integer.toString(iZzb))) : new zzaga("und", str, Integer.toString(iZzb));
        }
        zzdq.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzet.zze(i7)));
        return null;
    }

    private static zzagk zzd(int i7, String str, zzed zzedVar) {
        int iZzg = zzedVar.zzg();
        if (zzedVar.zzg() == 1684108385 && iZzg >= 22) {
            zzedVar.zzM(10);
            int iZzq = zzedVar.zzq();
            if (iZzq > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iZzq);
                String string = sb.toString();
                int iZzq2 = zzedVar.zzq();
                if (iZzq2 > 0) {
                    string = string + "/" + iZzq2;
                }
                return new zzagk(str, null, zzfwh.zzo(string));
            }
        }
        zzdq.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzet.zze(i7)));
        return null;
    }

    private static zzagk zze(int i7, String str, zzed zzedVar) {
        int iZzg = zzedVar.zzg();
        if (zzedVar.zzg() == 1684108385) {
            zzedVar.zzM(8);
            return new zzagk(str, null, zzfwh.zzo(zzedVar.zzA(iZzg - 16)));
        }
        zzdq.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzet.zze(i7)));
        return null;
    }
}
