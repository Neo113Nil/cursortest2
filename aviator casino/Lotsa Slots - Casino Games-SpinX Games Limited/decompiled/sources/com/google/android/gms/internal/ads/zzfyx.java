package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfyx {
    private static final java.lang.Object zzf = new java.lang.Object();
    private final android.content.Context zza;
    private final android.content.SharedPreferences zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzfye zzd;
    private boolean zze;

    public zzfyx(android.content.Context context, com.google.android.gms.internal.ads.zzbds zzbdsVar, com.google.android.gms.internal.ads.zzfye zzfyeVar, boolean z) {
        this.zze = false;
        this.zza = context;
        this.zzc = java.lang.Integer.toString(zzbdsVar.zza());
        this.zzb = context.getSharedPreferences("pcvmspf", 0);
        this.zzd = zzfyeVar;
        this.zze = z;
    }

    private final java.io.File zze(java.lang.String str) {
        return new java.io.File(new java.io.File(this.zza.getDir("pccache", 0), this.zzc), str);
    }

    private final java.lang.String zzf() {
        java.lang.String str = this.zzc;
        java.lang.String.valueOf(str);
        return "FBAMTD".concat(java.lang.String.valueOf(str));
    }

    private final java.lang.String zzg() {
        java.lang.String str = this.zzc;
        java.lang.String.valueOf(str);
        return "LATMTD".concat(java.lang.String.valueOf(str));
    }

    private static java.lang.String zzh(com.google.android.gms.internal.ads.zzbdu zzbduVar) {
        com.google.android.gms.internal.ads.zzbea zzi = com.google.android.gms.internal.ads.zzbeb.zzi();
        zzi.zza(zzbduVar.zza().zza());
        zzi.zzb(zzbduVar.zza().zzb());
        zzi.zzd(zzbduVar.zza().zzd());
        zzi.zze(zzbduVar.zza().zze());
        zzi.zzc(zzbduVar.zza().zzc());
        return com.google.android.gms.common.util.Hex.bytesToStringLowercase(((com.google.android.gms.internal.ads.zzbeb) zzi.zzbu()).zzaN());
    }

    private final void zzi(int i, long j) {
        this.zzd.zza(i, j);
    }

    private final void zzj(int i, long j, java.lang.String str) {
        this.zzd.zzb(i, j, str);
    }

    private final com.google.android.gms.internal.ads.zzbeb zzk(int i) {
        java.lang.String string = i == 1 ? this.zzb.getString(zzg(), null) : this.zzb.getString(zzf(), null);
        if (string == null) {
            return null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            byte[] stringToBytes = com.google.android.gms.common.util.Hex.stringToBytes(string);
            com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
            return com.google.android.gms.internal.ads.zzbeb.zzh(com.google.android.gms.internal.ads.zzida.zzt(stringToBytes, 0, stringToBytes.length), this.zze ? com.google.android.gms.internal.ads.zzido.zza() : com.google.android.gms.internal.ads.zzido.zzb());
        } catch (com.google.android.gms.internal.ads.zziet unused) {
            return null;
        } catch (java.lang.NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (java.lang.RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(com.google.android.gms.internal.ads.zzbdu zzbduVar, com.google.android.gms.internal.ads.zzfyw zzfywVar) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (zzf) {
            com.google.android.gms.internal.ads.zzbeb zzk = zzk(1);
            java.lang.String zza = zzbduVar.zza().zza();
            if (zzk != null && zzk.zza().equals(zza)) {
                zzi(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            java.io.File zze = zze(zza);
            if (zze.exists()) {
                java.lang.String str = true != zze.isDirectory() ? "0" : "1";
                java.lang.String str2 = true != zze.isFile() ? "0" : "1";
                java.lang.StringBuilder sb = new java.lang.StringBuilder(7);
                sb.append("d:");
                sb.append(str);
                sb.append(",f:");
                sb.append(str2);
                zzj(4023, currentTimeMillis2, sb.toString());
                zzi(4015, currentTimeMillis2);
            } else if (!zze.mkdirs()) {
                zzj(4024, currentTimeMillis2, "cw:".concat(true != zze.canWrite() ? "0" : "1"));
                zzi(4015, currentTimeMillis2);
                return false;
            }
            java.io.File zze2 = zze(zza);
            java.io.File file = new java.io.File(zze2, "pcam.jar");
            java.io.File file2 = new java.io.File(zze2, "pcbc");
            if (!com.google.android.gms.internal.ads.zzfyr.zzb(file, zzbduVar.zzb().zzA())) {
                zzi(4016, currentTimeMillis);
                return false;
            }
            if (!com.google.android.gms.internal.ads.zzfyr.zzb(file2, zzbduVar.zzc().zzA())) {
                zzi(4017, currentTimeMillis);
                return false;
            }
            if (zzfywVar != null && !zzfywVar.zza(file)) {
                zzi(4018, currentTimeMillis);
                com.google.android.gms.internal.ads.zzfyr.zze(zze2);
                return false;
            }
            java.lang.String zzh = zzh(zzbduVar);
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            android.content.SharedPreferences sharedPreferences = this.zzb;
            java.lang.String string = sharedPreferences.getString(zzg(), null);
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(zzg(), zzh);
            if (string != null) {
                edit.putString(zzf(), string);
            }
            if (!edit.commit()) {
                zzi(4019, currentTimeMillis3);
                return false;
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            com.google.android.gms.internal.ads.zzbeb zzk2 = zzk(1);
            if (zzk2 != null) {
                hashSet.add(zzk2.zza());
            }
            com.google.android.gms.internal.ads.zzbeb zzk3 = zzk(2);
            if (zzk3 != null) {
                hashSet.add(zzk3.zza());
            }
            for (java.io.File file3 : new java.io.File(this.zza.getDir("pccache", 0), this.zzc).listFiles()) {
                if (!hashSet.contains(file3.getName())) {
                    com.google.android.gms.internal.ads.zzfyr.zze(file3);
                }
            }
            zzi(5014, currentTimeMillis);
            return true;
        }
    }

    public final boolean zzb(com.google.android.gms.internal.ads.zzbdu zzbduVar) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (zzf) {
            if (!com.google.android.gms.internal.ads.zzfyr.zzb(new java.io.File(zze(zzbduVar.zza().zza()), "pcbc"), zzbduVar.zzc().zzA())) {
                zzi(4020, currentTimeMillis);
                return false;
            }
            java.lang.String zzh = zzh(zzbduVar);
            android.content.SharedPreferences.Editor edit = this.zzb.edit();
            edit.putString(zzg(), zzh);
            boolean commit = edit.commit();
            if (commit) {
                zzi(5015, currentTimeMillis);
            } else {
                zzi(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    public final com.google.android.gms.internal.ads.zzfyp zzc(int i) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (zzf) {
            com.google.android.gms.internal.ads.zzbeb zzk = zzk(1);
            if (zzk == null) {
                zzi(4022, currentTimeMillis);
                return null;
            }
            java.io.File zze = zze(zzk.zza());
            java.io.File file = new java.io.File(zze, "pcam.jar");
            if (!file.exists()) {
                file = new java.io.File(zze, "pcam");
            }
            java.io.File file2 = new java.io.File(zze, "pcbc");
            java.io.File file3 = new java.io.File(zze, "pcopt");
            zzi(5016, currentTimeMillis);
            return new com.google.android.gms.internal.ads.zzfyp(zzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (zzf) {
            com.google.android.gms.internal.ads.zzbeb zzk = zzk(1);
            if (zzk == null) {
                zzi(4025, currentTimeMillis);
                return false;
            }
            java.io.File zze = zze(zzk.zza());
            if (!new java.io.File(zze, "pcam.jar").exists()) {
                zzi(4026, currentTimeMillis);
                return false;
            }
            if (new java.io.File(zze, "pcbc").exists()) {
                zzi(5019, currentTimeMillis);
                return true;
            }
            zzi(4027, currentTimeMillis);
            return false;
        }
    }
}
