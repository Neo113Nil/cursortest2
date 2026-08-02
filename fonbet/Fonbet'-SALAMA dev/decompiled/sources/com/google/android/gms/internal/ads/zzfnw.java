package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;
import m3.c;

/* loaded from: classes.dex */
public final class zzfnw {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfnd zze;
    private boolean zzf;

    public zzfnw(Context context, int i7, zzfnd zzfndVar, boolean z4) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(i7 - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfndVar;
        this.zzf = z4;
    }

    private final File zze(String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(zzaxj zzaxjVar) {
        zzaxk zzd = zzaxm.zzd();
        zzd.zze(zzaxjVar.zzc().zzk());
        zzd.zza(zzaxjVar.zzc().zzj());
        zzd.zzb(zzaxjVar.zzc().zza());
        zzd.zzd(zzaxjVar.zzc().zzc());
        zzd.zzc(zzaxjVar.zzc().zzb());
        return c.b(((zzaxm) zzd.zzbr()).zzaV());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i7, long j) {
        this.zze.zza(i7, j);
    }

    private final void zzj(int i7, long j, String str) {
        this.zze.zzb(i7, j, str);
    }

    private final zzaxm zzk(int i7) {
        String string = i7 == 1 ? this.zzc.getString(zzh(), null) : this.zzc.getString(zzg(), null);
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] n2 = c.n(string);
            return zzaxm.zzi(zzgvy.zzv(n2, 0, n2.length), this.zzf ? zzgwq.zza() : zzgwq.zzb());
        } catch (zzgxv unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzaxj zzaxjVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                if (!zzfnq.zze(new File(zze(zzaxjVar.zzc().zzk()), "pcbc"), zzaxjVar.zzd().zzA())) {
                    zzi(4020, currentTimeMillis);
                    return false;
                }
                String zzf = zzf(zzaxjVar);
                SharedPreferences.Editor edit = this.zzc.edit();
                edit.putString(zzh(), zzf);
                boolean commit = edit.commit();
                if (commit) {
                    zzi(5015, currentTimeMillis);
                } else {
                    zzi(4021, currentTimeMillis);
                }
                return commit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(zzaxj zzaxjVar, zzfnv zzfnvVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzaxm zzk = zzk(1);
                String zzk2 = zzaxjVar.zzc().zzk();
                if (zzk != null && zzk.zzk().equals(zzk2)) {
                    zzi(4014, currentTimeMillis);
                    return false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                File zze = zze(zzk2);
                if (zze.exists()) {
                    zzj(4023, currentTimeMillis2, "d:" + (true != zze.isDirectory() ? "0" : "1") + ",f:" + (true != zze.isFile() ? "0" : "1"));
                    zzi(4015, currentTimeMillis2);
                } else if (!zze.mkdirs()) {
                    zzj(4024, currentTimeMillis2, "cw:".concat(true != zze.canWrite() ? "0" : "1"));
                    zzi(4015, currentTimeMillis2);
                    return false;
                }
                File zze2 = zze(zzk2);
                File file = new File(zze2, "pcam.jar");
                File file2 = new File(zze2, "pcbc");
                if (!zzfnq.zze(file, zzaxjVar.zzf().zzA())) {
                    zzi(4016, currentTimeMillis);
                    return false;
                }
                if (!zzfnq.zze(file2, zzaxjVar.zzd().zzA())) {
                    zzi(4017, currentTimeMillis);
                    return false;
                }
                if (zzfnvVar != null && !zzfnvVar.zza(file)) {
                    zzi(4018, currentTimeMillis);
                    zzfnq.zzd(zze2);
                    return false;
                }
                String zzf = zzf(zzaxjVar);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = this.zzc.getString(zzh(), null);
                SharedPreferences.Editor edit = this.zzc.edit();
                edit.putString(zzh(), zzf);
                if (string != null) {
                    edit.putString(zzg(), string);
                }
                if (!edit.commit()) {
                    zzi(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                zzaxm zzk3 = zzk(1);
                if (zzk3 != null) {
                    hashSet.add(zzk3.zzk());
                }
                zzaxm zzk4 = zzk(2);
                if (zzk4 != null) {
                    hashSet.add(zzk4.zzk());
                }
                for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zzfnq.zzd(file3);
                    }
                }
                zzi(5014, currentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzfno zzc(int i7) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzaxm zzk = zzk(1);
                if (zzk == null) {
                    zzi(4022, currentTimeMillis);
                    return null;
                }
                File zze = zze(zzk.zzk());
                File file = new File(zze, "pcam.jar");
                if (!file.exists()) {
                    file = new File(zze, "pcam");
                }
                File file2 = new File(zze, "pcbc");
                File file3 = new File(zze, "pcopt");
                zzi(5016, currentTimeMillis);
                return new zzfno(zzk, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(int i7) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzaxm zzk = zzk(1);
                if (zzk == null) {
                    zzi(4025, currentTimeMillis);
                    return false;
                }
                File zze = zze(zzk.zzk());
                if (!new File(zze, "pcam.jar").exists()) {
                    zzi(4026, currentTimeMillis);
                    return false;
                }
                if (new File(zze, "pcbc").exists()) {
                    zzi(5019, currentTimeMillis);
                    return true;
                }
                zzi(4027, currentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
