package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzafc {
    public final java.util.List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzafc(java.util.List list, int i, int i2, int i3, int i4) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x017d, code lost:
    
        if (r2.zzj(1) > 0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004b A[Catch: ArrayIndexOutOfBoundsException -> 0x01ef, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01ef, blocks: (B:3:0x0004, B:9:0x0040, B:11:0x004b, B:14:0x005c, B:17:0x0068, B:19:0x0095, B:21:0x009b, B:23:0x00b1, B:25:0x00ba, B:27:0x00c2, B:29:0x00d8, B:31:0x00e5, B:33:0x00fb, B:35:0x0101, B:37:0x0117, B:39:0x011d, B:41:0x0133, B:44:0x013c, B:46:0x0145, B:48:0x0148, B:51:0x014d, B:53:0x0163, B:54:0x0166, B:56:0x016f, B:57:0x0172, B:60:0x017f, B:62:0x0185, B:64:0x018a, B:65:0x018d, B:68:0x0198, B:69:0x019f, B:72:0x01a6, B:74:0x01ac, B:80:0x01cb, B:83:0x01d3, B:84:0x01e4, B:88:0x01c7, B:94:0x0179), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[Catch: ArrayIndexOutOfBoundsException -> 0x01ef, TRY_LEAVE, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01ef, blocks: (B:3:0x0004, B:9:0x0040, B:11:0x004b, B:14:0x005c, B:17:0x0068, B:19:0x0095, B:21:0x009b, B:23:0x00b1, B:25:0x00ba, B:27:0x00c2, B:29:0x00d8, B:31:0x00e5, B:33:0x00fb, B:35:0x0101, B:37:0x0117, B:39:0x011d, B:41:0x0133, B:44:0x013c, B:46:0x0145, B:48:0x0148, B:51:0x014d, B:53:0x0163, B:54:0x0166, B:56:0x016f, B:57:0x0172, B:60:0x017f, B:62:0x0185, B:64:0x018a, B:65:0x018d, B:68:0x0198, B:69:0x019f, B:72:0x01a6, B:74:0x01ac, B:80:0x01cb, B:83:0x01d3, B:84:0x01e4, B:88:0x01c7, B:94:0x0179), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ac A[Catch: ArrayIndexOutOfBoundsException -> 0x01ef, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01ef, blocks: (B:3:0x0004, B:9:0x0040, B:11:0x004b, B:14:0x005c, B:17:0x0068, B:19:0x0095, B:21:0x009b, B:23:0x00b1, B:25:0x00ba, B:27:0x00c2, B:29:0x00d8, B:31:0x00e5, B:33:0x00fb, B:35:0x0101, B:37:0x0117, B:39:0x011d, B:41:0x0133, B:44:0x013c, B:46:0x0145, B:48:0x0148, B:51:0x014d, B:53:0x0163, B:54:0x0166, B:56:0x016f, B:57:0x0172, B:60:0x017f, B:62:0x0185, B:64:0x018a, B:65:0x018d, B:68:0x0198, B:69:0x019f, B:72:0x01a6, B:74:0x01ac, B:80:0x01cb, B:83:0x01d3, B:84:0x01e4, B:88:0x01c7, B:94:0x0179), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.ads.zzafc zza(byte[] bArr) throws com.google.android.gms.internal.ads.zzat {
        int i;
        int i2;
        int i3;
        int i4;
        int zzj;
        try {
            com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes(bArr, bArr.length);
            int i5 = 1;
            zzesVar.zzo(1);
            int zzj2 = zzesVar.zzj(3);
            zzesVar.zzh(6);
            boolean zzi = zzesVar.zzi();
            boolean zzi2 = zzesVar.zzi();
            int i6 = 12;
            boolean z = false;
            if (zzj2 == 2) {
                if (!zzi) {
                    zzj2 = 2;
                    zzi = false;
                } else {
                    if (true != zzi2) {
                        i = 10;
                        int i7 = 13;
                        zzesVar.zzh(13);
                        if (zzesVar.zzc() <= 0) {
                            return new com.google.android.gms.internal.ads.zzafc(com.google.android.gms.internal.ads.zzgwm.zzj(bArr), i, -1, -1, -1);
                        }
                        zzesVar.zzg();
                        int zzj3 = zzesVar.zzj(4);
                        if (zzj3 != 1) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzj3).length() + 22);
                            sb.append("Unsupported obu_type: ");
                            sb.append(zzj3);
                            com.google.android.gms.internal.ads.zzeg.zzb("Av1Config", sb.toString());
                            return new com.google.android.gms.internal.ads.zzafc(com.google.android.gms.internal.ads.zzgwm.zzj(bArr), i, -1, -1, -1);
                        }
                        if (zzesVar.zzi()) {
                            com.google.android.gms.internal.ads.zzeg.zzb("Av1Config", "Unsupported obu_extension_flag");
                            return new com.google.android.gms.internal.ads.zzafc(com.google.android.gms.internal.ads.zzgwm.zzj(bArr), i, -1, -1, -1);
                        }
                        boolean zzi3 = zzesVar.zzi();
                        zzesVar.zzg();
                        if (zzi3 && zzesVar.zzj(8) > 127) {
                            com.google.android.gms.internal.ads.zzeg.zzb("Av1Config", "Excessive obu_size");
                            return new com.google.android.gms.internal.ads.zzafc(com.google.android.gms.internal.ads.zzgwm.zzj(bArr), i, -1, -1, -1);
                        }
                        int zzj4 = zzesVar.zzj(3);
                        zzesVar.zzg();
                        if (zzesVar.zzi()) {
                            com.google.android.gms.internal.ads.zzeg.zzb("Av1Config", "Unsupported reduced_still_picture_header");
                            return new com.google.android.gms.internal.ads.zzafc(com.google.android.gms.internal.ads.zzgwm.zzj(bArr), i, -1, -1, -1);
                        }
                        if (zzesVar.zzi()) {
                            com.google.android.gms.internal.ads.zzeg.zzb("Av1Config", "Unsupported timing_info_present_flag");
                            return new com.google.android.gms.internal.ads.zzafc(com.google.android.gms.internal.ads.zzgwm.zzj(bArr), i, -1, -1, -1);
                        }
                        if (zzesVar.zzi()) {
                            com.google.android.gms.internal.ads.zzeg.zzb("Av1Config", "Unsupported initial_display_delay_present_flag");
                            return new com.google.android.gms.internal.ads.zzafc(com.google.android.gms.internal.ads.zzgwm.zzj(bArr), i, -1, -1, -1);
                        }
                        int zzj5 = zzesVar.zzj(5);
                        int i8 = 0;
                        while (i8 <= zzj5) {
                            zzesVar.zzh(i6);
                            if (zzesVar.zzj(5) > 7) {
                                zzesVar.zzg();
                            }
                            i8++;
                            i6 = 12;
                        }
                        int zzj6 = zzesVar.zzj(4);
                        int zzj7 = zzesVar.zzj(4);
                        zzesVar.zzh(zzj6 + 1);
                        zzesVar.zzh(zzj7 + 1);
                        if (zzesVar.zzi()) {
                            zzesVar.zzh(7);
                        }
                        zzesVar.zzh(7);
                        boolean zzi4 = zzesVar.zzi();
                        if (zzi4) {
                            zzesVar.zzh(2);
                        }
                        if (!zzesVar.zzi()) {
                        }
                        if (!zzesVar.zzi()) {
                            zzesVar.zzh(1);
                        }
                        if (zzi4) {
                            zzesVar.zzh(3);
                        }
                        zzesVar.zzh(3);
                        boolean zzi5 = zzesVar.zzi();
                        if (zzj4 == 2) {
                            if (zzi5) {
                                zzesVar.zzg();
                            }
                        } else if (zzj4 == 1) {
                            if (zzesVar.zzi()) {
                                i2 = -1;
                                i3 = -1;
                                i4 = -1;
                            } else {
                                int zzj8 = zzesVar.zzj(8);
                                int zzj9 = zzesVar.zzj(8);
                                int zzj10 = zzesVar.zzj(8);
                                if (z || zzj8 != 1) {
                                    i7 = zzj9;
                                } else {
                                    if (zzj9 != 13) {
                                        i7 = zzj9;
                                    } else if (zzj10 == 0) {
                                        zzj8 = 1;
                                        zzj = 1;
                                        int zzb = com.google.android.gms.internal.ads.zzi.zzb(zzj8);
                                        if (zzj == 1) {
                                            i5 = 2;
                                        }
                                        i4 = com.google.android.gms.internal.ads.zzi.zzc(i7);
                                        i3 = i5;
                                        i2 = zzb;
                                    }
                                    zzj8 = 1;
                                }
                                zzj = zzesVar.zzj(1);
                                int zzb2 = com.google.android.gms.internal.ads.zzi.zzb(zzj8);
                                if (zzj == 1) {
                                }
                                i4 = com.google.android.gms.internal.ads.zzi.zzc(i7);
                                i3 = i5;
                                i2 = zzb2;
                            }
                            return new com.google.android.gms.internal.ads.zzafc(com.google.android.gms.internal.ads.zzgwm.zzj(bArr), i, i2, i3, i4);
                        }
                        if (zzesVar.zzi()) {
                            z = true;
                        }
                        if (zzesVar.zzi()) {
                        }
                        return new com.google.android.gms.internal.ads.zzafc(com.google.android.gms.internal.ads.zzgwm.zzj(bArr), i, i2, i3, i4);
                    }
                    i = 12;
                    int i72 = 13;
                    zzesVar.zzh(13);
                    if (zzesVar.zzc() <= 0) {
                    }
                }
            }
            if (zzj2 <= 2) {
                if (true != zzi) {
                    i = 8;
                }
                i = 10;
            } else {
                i = -1;
            }
            int i722 = 13;
            zzesVar.zzh(13);
            if (zzesVar.zzc() <= 0) {
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw com.google.android.gms.internal.ads.zzat.zzb("Error parsing AV1 config", e);
        }
    }
}
