package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfyq {
    final java.io.File zza;
    private final java.io.File zzb;
    private final android.content.SharedPreferences zzc;
    private final com.google.android.gms.internal.ads.zzbds zzd;

    public zzfyq(android.content.Context context, com.google.android.gms.internal.ads.zzbds zzbdsVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        java.io.File dir = context.getDir("pccache", 0);
        com.google.android.gms.internal.ads.zzfyr.zzd(dir, false);
        this.zzb = dir;
        java.io.File dir2 = context.getDir("tmppccache", 0);
        com.google.android.gms.internal.ads.zzfyr.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzbdsVar;
    }

    private final java.io.File zzd() {
        java.io.File file = new java.io.File(this.zzb, java.lang.Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final java.lang.String zze() {
        int zza = this.zzd.zza();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza).length() + 6);
        sb.append("FBAMTD");
        sb.append(zza);
        return sb.toString();
    }

    private final java.lang.String zzf() {
        int zza = this.zzd.zza();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza).length() + 6);
        sb.append("LATMTD");
        sb.append(zza);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzbdu zzbduVar, com.google.android.gms.internal.ads.zzfyw zzfywVar) {
        boolean z;
        com.google.android.gms.internal.ads.zzbeb zzc;
        com.google.android.gms.internal.ads.zzbeb zzc2;
        java.lang.String zza = zzbduVar.zza().zza();
        byte[] zzA = zzbduVar.zzb().zzA();
        byte[] zzA2 = zzbduVar.zzc().zzA();
        if (!android.text.TextUtils.isEmpty(zza) && zzA2.length != 0) {
            java.io.File file = this.zza;
            com.google.android.gms.internal.ads.zzfyr.zze(file);
            file.mkdirs();
            com.google.android.gms.internal.ads.zzfyr.zzc(zza, file).mkdirs();
            java.io.File zza2 = com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcam.jar", file);
            if ((zzA.length <= 0 || com.google.android.gms.internal.ads.zzfyr.zzb(zza2, zzA)) && com.google.android.gms.internal.ads.zzfyr.zzb(com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcbc", file), zzA2)) {
                java.io.File zza3 = com.google.android.gms.internal.ads.zzfyr.zza(zzbduVar.zza().zza(), "pcam.jar", file);
                if (zza3.exists() && zzfywVar != null && !zzfywVar.zza(zza3)) {
                    return false;
                }
                java.lang.String zza4 = zzbduVar.zza().zza();
                if (!android.text.TextUtils.isEmpty(zza4)) {
                    java.io.File zza5 = com.google.android.gms.internal.ads.zzfyr.zza(zza4, "pcam.jar", file);
                    java.io.File zza6 = com.google.android.gms.internal.ads.zzfyr.zza(zza4, "pcbc", file);
                    java.io.File zza7 = com.google.android.gms.internal.ads.zzfyr.zza(zza4, "pcam.jar", zzd());
                    java.io.File zza8 = com.google.android.gms.internal.ads.zzfyr.zza(zza4, "pcbc", zzd());
                    if ((!zza5.exists() || zza5.renameTo(zza7)) && zza6.exists() && zza6.renameTo(zza8)) {
                        com.google.android.gms.internal.ads.zzbea zzi = com.google.android.gms.internal.ads.zzbeb.zzi();
                        zzi.zza(zzbduVar.zza().zza());
                        zzi.zzb(zzbduVar.zza().zzb());
                        zzi.zzd(zzbduVar.zza().zzd());
                        zzi.zze(zzbduVar.zza().zze());
                        zzi.zzc(zzbduVar.zza().zzc());
                        com.google.android.gms.internal.ads.zzbeb zzbebVar = (com.google.android.gms.internal.ads.zzbeb) zzi.zzbu();
                        com.google.android.gms.internal.ads.zzbeb zzc3 = zzc(1);
                        android.content.SharedPreferences.Editor edit = this.zzc.edit();
                        if (zzc3 != null && !zzbebVar.zza().equals(zzc3.zza())) {
                            edit.putString(zze(), com.google.android.gms.common.util.Hex.bytesToStringLowercase(zzc3.zzaN()));
                        }
                        edit.putString(zzf(), com.google.android.gms.common.util.Hex.bytesToStringLowercase(zzbebVar.zzaN()));
                        if (edit.commit()) {
                            z = true;
                            java.util.HashSet hashSet = new java.util.HashSet();
                            zzc = zzc(1);
                            if (zzc != null) {
                                hashSet.add(zzc.zza());
                            }
                            zzc2 = zzc(2);
                            if (zzc2 != null) {
                                hashSet.add(zzc2.zza());
                            }
                            for (java.io.File file2 : zzd().listFiles()) {
                                java.lang.String name = file2.getName();
                                if (!hashSet.contains(name)) {
                                    com.google.android.gms.internal.ads.zzfyr.zze(com.google.android.gms.internal.ads.zzfyr.zzc(name, zzd()));
                                }
                            }
                            return z;
                        }
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
                while (r4 < r1) {
                }
                return z;
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.ads.zzfyp zzb(int i) {
        com.google.android.gms.internal.ads.zzbeb zzc = zzc(1);
        if (zzc == null) {
            return null;
        }
        java.lang.String zza = zzc.zza();
        java.io.File zza2 = com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcam.jar", zzd());
        if (!zza2.exists()) {
            zza2 = com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcam", zzd());
        }
        return new com.google.android.gms.internal.ads.zzfyp(zzc, zza2, com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcbc", zzd()), com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcopt", zzd()));
    }

    final com.google.android.gms.internal.ads.zzbeb zzc(int i) {
        java.lang.String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] stringToBytes = com.google.android.gms.common.util.Hex.stringToBytes(string);
            com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
            com.google.android.gms.internal.ads.zzbeb zzg = com.google.android.gms.internal.ads.zzbeb.zzg(com.google.android.gms.internal.ads.zzida.zzt(stringToBytes, 0, stringToBytes.length));
            java.lang.String zza = zzg.zza();
            java.io.File zza2 = com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcam.jar", zzd());
            if (!zza2.exists()) {
                zza2 = com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcam", zzd());
            }
            java.io.File zza3 = com.google.android.gms.internal.ads.zzfyr.zza(zza, "pcbc", zzd());
            if (zza2.exists()) {
                if (zza3.exists()) {
                    return zzg;
                }
            }
        } catch (com.google.android.gms.internal.ads.zziet unused) {
        }
        return null;
    }
}
