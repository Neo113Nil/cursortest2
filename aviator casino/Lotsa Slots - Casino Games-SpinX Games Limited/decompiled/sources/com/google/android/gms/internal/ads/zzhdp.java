package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhdp implements com.google.android.gms.internal.ads.zzhed {
    private static final java.nio.charset.Charset zza = java.nio.charset.Charset.forName("UTF-8");
    private final java.io.InputStream zzb;

    private zzhdp(java.io.InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static com.google.android.gms.internal.ads.zzhdp zza(java.lang.String str) {
        return new com.google.android.gms.internal.ads.zzhdp(new java.io.ByteArrayInputStream(str.getBytes(zza)));
    }

    private static int zzc(com.google.android.gms.internal.ads.zzibg zzibgVar) throws java.io.IOException {
        if (!(zzibgVar instanceof com.google.android.gms.internal.ads.zzibk)) {
            throw new java.io.IOException("invalid key id: not a JSON primitive");
        }
        if (!zzibgVar.zzg().zzc()) {
            throw new java.io.IOException("invalid key id: not a JSON number");
        }
        try {
            long zzc = com.google.android.gms.internal.ads.zzhlm.zzc(zzibgVar.zzg().zzh());
            if (zzc > 4294967295L || zzc < -2147483648L) {
                throw new java.io.IOException("invalid key id");
            }
            return (int) zzc;
        } catch (java.lang.NumberFormatException e) {
            throw new java.io.IOException(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzhed
    public final com.google.android.gms.internal.ads.zzhsz zzb() throws java.io.IOException {
        char c;
        int i;
        char c2;
        com.google.android.gms.internal.ads.zzhtm zzhtmVar;
        char c3;
        com.google.android.gms.internal.ads.zzhsp zzhspVar;
        java.lang.String str = "status";
        java.lang.String str2 = "keyData";
        try {
            try {
                java.io.InputStream inputStream = this.zzb;
                int i2 = com.google.android.gms.internal.ads.zzheo.zza;
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    java.io.InputStream inputStream2 = inputStream;
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                    inputStream = inputStream2;
                }
                com.google.android.gms.internal.ads.zzibi zze = com.google.android.gms.internal.ads.zzhlm.zzb(new java.lang.String(byteArrayOutputStream.toByteArray(), zza)).zze();
                if (!zze.zzc(com.ironsource.X3.i.W)) {
                    throw new com.google.android.gms.internal.ads.zzibj("invalid keyset: no key");
                }
                com.google.android.gms.internal.ads.zzibg zzh = zze.zzh(com.ironsource.X3.i.W);
                if (!(zzh instanceof com.google.android.gms.internal.ads.zzibf)) {
                    throw new com.google.android.gms.internal.ads.zzibj("invalid keyset: key must be an array");
                }
                com.google.android.gms.internal.ads.zzibf zzf = zzh.zzf();
                if (zzf.zzb() == 0) {
                    throw new com.google.android.gms.internal.ads.zzibj("invalid keyset: key is empty");
                }
                com.google.android.gms.internal.ads.zzhsw zzh2 = com.google.android.gms.internal.ads.zzhsz.zzh();
                if (zze.zzc("primaryKeyId")) {
                    zzh2.zza(zzc(zze.zzh("primaryKeyId")));
                }
                int i3 = 0;
                while (i3 < zzf.zzb()) {
                    com.google.android.gms.internal.ads.zzibi zze2 = zzf.zzc(i3).zze();
                    if (!zze2.zzc(str2) || !zze2.zzc(str) || !zze2.zzc("keyId") || !zze2.zzc("outputPrefixType")) {
                        throw new com.google.android.gms.internal.ads.zzibj("invalid key");
                    }
                    com.google.android.gms.internal.ads.zzibg zzh3 = zze2.zzh(str2);
                    if (!(zzh3 instanceof com.google.android.gms.internal.ads.zzibi)) {
                        throw new com.google.android.gms.internal.ads.zzibj("invalid key: keyData must be an object");
                    }
                    com.google.android.gms.internal.ads.zzhsx zze3 = com.google.android.gms.internal.ads.zzhsy.zze();
                    java.lang.String zzd = zze2.zzh(str).zzd();
                    java.lang.String str3 = str;
                    int hashCode = zzd.hashCode();
                    java.lang.String str4 = str2;
                    com.google.android.gms.internal.ads.zzibf zzibfVar = zzf;
                    if (hashCode == -891611359) {
                        if (zzd.equals("ENABLED")) {
                            c = 0;
                        }
                        c = 65535;
                    } else if (hashCode != 478389753) {
                        if (hashCode == 1053567612 && zzd.equals("DISABLED")) {
                            c = 1;
                        }
                        c = 65535;
                    } else {
                        if (zzd.equals("DESTROYED")) {
                            c = 2;
                        }
                        c = 65535;
                    }
                    if (c == 0) {
                        i = 3;
                    } else if (c == 1) {
                        i = 4;
                    } else {
                        if (c != 2) {
                            java.lang.String.valueOf(zzd);
                            throw new com.google.android.gms.internal.ads.zzibj("unknown status: ".concat(java.lang.String.valueOf(zzd)));
                        }
                        i = 5;
                    }
                    zze3.zze(i);
                    zze3.zzc(zzc(zze2.zzh("keyId")));
                    java.lang.String zzd2 = zze2.zzh("outputPrefixType").zzd();
                    switch (zzd2.hashCode()) {
                        case -2053249079:
                            if (zzd2.equals("LEGACY")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 80904:
                            if (zzd2.equals("RAW")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2575090:
                            if (zzd2.equals("TINK")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1761684556:
                            if (zzd2.equals("CRUNCHY")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 == 0) {
                        zzhtmVar = com.google.android.gms.internal.ads.zzhtm.TINK;
                    } else if (c2 == 1) {
                        zzhtmVar = com.google.android.gms.internal.ads.zzhtm.RAW;
                    } else if (c2 == 2) {
                        zzhtmVar = com.google.android.gms.internal.ads.zzhtm.LEGACY;
                    } else {
                        if (c2 != 3) {
                            java.lang.String.valueOf(zzd2);
                            throw new com.google.android.gms.internal.ads.zzibj("unknown output prefix type: ".concat(java.lang.String.valueOf(zzd2)));
                        }
                        zzhtmVar = com.google.android.gms.internal.ads.zzhtm.CRUNCHY;
                    }
                    zze3.zzd(zzhtmVar);
                    com.google.android.gms.internal.ads.zzibi zze4 = zzh3.zze();
                    if (!zze4.zzc("typeUrl") || !zze4.zzc("value") || !zze4.zzc("keyMaterialType")) {
                        throw new com.google.android.gms.internal.ads.zzibj("invalid keyData");
                    }
                    byte[] zza2 = com.google.android.gms.internal.ads.zzhzk.zza(zze4.zzh("value").zzd(), 2);
                    com.google.android.gms.internal.ads.zzhso zzd3 = com.google.android.gms.internal.ads.zzhsq.zzd();
                    zzd3.zza(zze4.zzh("typeUrl").zzd());
                    com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
                    zzd3.zzb(com.google.android.gms.internal.ads.zzida.zzt(zza2, 0, zza2.length));
                    java.lang.String zzd4 = zze4.zzh("keyMaterialType").zzd();
                    switch (zzd4.hashCode()) {
                        case -1881281466:
                            if (zzd4.equals("REMOTE")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1609477353:
                            if (zzd4.equals("SYMMETRIC")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 249237018:
                            if (zzd4.equals("ASYMMETRIC_PRIVATE")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1534613202:
                            if (zzd4.equals("ASYMMETRIC_PUBLIC")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    if (c3 == 0) {
                        zzhspVar = com.google.android.gms.internal.ads.zzhsp.SYMMETRIC;
                    } else if (c3 == 1) {
                        zzhspVar = com.google.android.gms.internal.ads.zzhsp.ASYMMETRIC_PRIVATE;
                    } else if (c3 == 2) {
                        zzhspVar = com.google.android.gms.internal.ads.zzhsp.ASYMMETRIC_PUBLIC;
                    } else {
                        if (c3 != 3) {
                            java.lang.String.valueOf(zzd4);
                            throw new com.google.android.gms.internal.ads.zzibj("unknown key material type: ".concat(java.lang.String.valueOf(zzd4)));
                        }
                        zzhspVar = com.google.android.gms.internal.ads.zzhsp.REMOTE;
                    }
                    zzd3.zzc(zzhspVar);
                    zze3.zza((com.google.android.gms.internal.ads.zzhsq) zzd3.zzbu());
                    zzh2.zzb((com.google.android.gms.internal.ads.zzhsy) zze3.zzbu());
                    i3++;
                    str = str3;
                    str2 = str4;
                    zzf = zzibfVar;
                }
                return (com.google.android.gms.internal.ads.zzhsz) zzh2.zzbu();
            } finally {
                this.zzb.close();
            }
        } catch (com.google.android.gms.internal.ads.zzibj | java.lang.IllegalStateException e) {
            throw new java.io.IOException(e);
        }
    }
}
