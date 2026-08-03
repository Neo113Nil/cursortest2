package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgkz {
    final java.io.File zza;
    private final java.io.File zzb;
    private final android.content.SharedPreferences zzc;
    private final com.google.android.gms.internal.ads.zzimo zzd;
    private final com.google.android.gms.internal.ads.zzgqh zze;

    zzgkz(android.content.Context context, android.content.SharedPreferences sharedPreferences, com.google.android.gms.internal.ads.zzimo zzimoVar, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        this.zzc = sharedPreferences;
        java.io.File dir = context.getDir("pccache2", 0);
        com.google.android.gms.internal.ads.zzfyr.zzd(dir, false);
        this.zzb = dir;
        java.io.File dir2 = context.getDir("tmppccache2", 0);
        com.google.android.gms.internal.ads.zzfyr.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzimoVar;
        this.zze = zzgqhVar;
    }

    private final java.io.File zzd() {
        java.io.File file = new java.io.File(this.zzb, java.lang.Integer.toString(((com.google.android.gms.internal.ads.zzbds) this.zzd.zzb()).zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final java.lang.String zze() {
        int zza = ((com.google.android.gms.internal.ads.zzbds) this.zzd.zzb()).zza();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza).length() + 6);
        sb.append("FBAMTD");
        sb.append(zza);
        return sb.toString();
    }

    private final java.lang.String zzf() {
        int zza = ((com.google.android.gms.internal.ads.zzbds) this.zzd.zzb()).zza();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza).length() + 6);
        sb.append("LATMTD");
        sb.append(zza);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0140 A[LOOP:0: B:24:0x0140->B:30:0x0160, LOOP_START, PHI: r2
      0x0140: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:23:0x013e, B:30:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzgfq zzgfqVar, byte[] bArr, byte[] bArr2) {
        boolean z;
        com.google.android.gms.internal.ads.zzgfq zzc;
        com.google.android.gms.internal.ads.zzgfq zzc2;
        java.io.File[] listFiles;
        java.lang.String zza = zzgfqVar.zza().zza();
        if (!android.text.TextUtils.isEmpty(zza) && bArr2.length != 0) {
            java.io.File file = this.zza;
            com.google.android.gms.internal.ads.zzfyr.zze(file);
            file.mkdirs();
            java.io.File zzc3 = com.google.android.gms.internal.ads.zzfyr.zzc(zza, file);
            zzc3.getClass();
            zzc3.mkdirs();
            java.io.File zza2 = com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcam.jar", file);
            zza2.getClass();
            if (bArr == null || bArr.length <= 0 || com.google.android.gms.internal.ads.zzfyr.zzb(zza2, bArr)) {
                java.io.File zza3 = com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcbc", file);
                zza3.getClass();
                if (com.google.android.gms.internal.ads.zzfyr.zzb(zza3, bArr2)) {
                    java.lang.String zza4 = zzgfqVar.zza().zza();
                    if (!android.text.TextUtils.isEmpty(zza4)) {
                        java.io.File zza5 = com.google.android.gms.internal.ads.zzfyr.zza(zza4, "pcam.jar", file);
                        zza5.getClass();
                        java.io.File zza6 = com.google.android.gms.internal.ads.zzfyr.zza(zza4, "pcbc", file);
                        zza6.getClass();
                        java.io.File zza7 = com.google.android.gms.internal.ads.zzfyr.zza(zza4, "pcam.jar", zzd());
                        zza7.getClass();
                        java.io.File zza8 = com.google.android.gms.internal.ads.zzfyr.zza(zza4, "pcbc", zzd());
                        zza8.getClass();
                        if (zza5.exists() && !zza5.renameTo(zza7)) {
                            this.zze.zzb(15318);
                        } else if (zza6.exists() && zza6.renameTo(zza8)) {
                            com.google.android.gms.internal.ads.zzgfq zzc4 = zzc(1);
                            android.content.SharedPreferences.Editor edit = this.zzc.edit();
                            if (zzc4 != null && !zzgfqVar.zza().zza().equals(zzc4.zza().zza())) {
                                edit.putString(zze(), com.google.android.gms.common.util.Hex.bytesToStringLowercase(zzc4.zzaN()));
                            }
                            edit.putString(zzf(), com.google.android.gms.common.util.Hex.bytesToStringLowercase(zzgfqVar.zzaN()));
                            if (edit.commit()) {
                                z = true;
                                java.util.HashSet hashSet = new java.util.HashSet();
                                zzc = zzc(1);
                                if (zzc != null) {
                                    hashSet.add(zzc.zza().zza());
                                }
                                zzc2 = zzc(2);
                                if (zzc2 != null) {
                                    hashSet.add(zzc2.zza().zza());
                                }
                                listFiles = zzd().listFiles();
                                if (listFiles != null) {
                                    for (java.io.File file2 : listFiles) {
                                        java.lang.String name = file2.getName();
                                        if (!hashSet.contains(name)) {
                                            java.io.File zzc5 = com.google.android.gms.internal.ads.zzfyr.zzc(name, zzd());
                                            zzc5.getClass();
                                            com.google.android.gms.internal.ads.zzfyr.zze(zzc5);
                                        }
                                    }
                                }
                                return z;
                            }
                            this.zze.zzb(15320);
                        } else {
                            this.zze.zzb(15319);
                        }
                    }
                    z = false;
                    java.util.HashSet hashSet2 = new java.util.HashSet();
                    zzc = zzc(1);
                    if (zzc != null) {
                    }
                    zzc2 = zzc(2);
                    if (zzc2 != null) {
                    }
                    listFiles = zzd().listFiles();
                    if (listFiles != null) {
                    }
                    return z;
                }
            }
        }
        this.zze.zzb(15316);
        return false;
    }

    public final com.google.android.gms.internal.ads.zzfyp zzb(int i) {
        com.google.android.gms.internal.ads.zzgfq zzc = zzc(1);
        if (zzc == null) {
            this.zze.zzb(15315);
            return null;
        }
        java.lang.String zza = zzc.zza().zza();
        java.io.File zza2 = com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcam.jar", zzd());
        zza2.getClass();
        if (!zza2.exists()) {
            zza2 = com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcam", zzd());
            zza2.getClass();
        }
        java.io.File zza3 = com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcopt", zzd());
        zza3.getClass();
        java.io.File zza4 = com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcbc", zzd());
        zza4.getClass();
        return new com.google.android.gms.internal.ads.zzfyp(zzc.zza(), zza2, zza4, zza3);
    }

    public final com.google.android.gms.internal.ads.zzgfq zzc(int i) {
        java.lang.String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] stringToBytes = com.google.android.gms.common.util.Hex.stringToBytes(string);
            com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
            com.google.android.gms.internal.ads.zzgfq zze = com.google.android.gms.internal.ads.zzgfq.zze(com.google.android.gms.internal.ads.zzida.zzt(stringToBytes, 0, stringToBytes.length));
            java.lang.String zza = zze.zza().zza();
            java.io.File zza2 = com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcam.jar", zzd());
            zza2.getClass();
            java.io.File file = zza2;
            if (!zza2.exists()) {
                zza2 = com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcam", zzd());
                zza2.getClass();
                java.io.File file2 = zza2;
            }
            java.io.File zza3 = com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcbc", zzd());
            zza3.getClass();
            java.io.File file3 = zza3;
            if (zza2.exists()) {
                if (zza3.exists()) {
                    return zze;
                }
            }
        } catch (com.google.android.gms.internal.ads.zziet unused) {
            this.zze.zzb(15317);
        }
        return null;
    }
}
