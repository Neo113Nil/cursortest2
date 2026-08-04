package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;
import p090m3.c;

/* JADX INFO: loaded from: classes.dex */
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
        zzaxk zzaxkVarZzd = zzaxm.zzd();
        zzaxkVarZzd.zze(zzaxjVar.zzc().zzk());
        zzaxkVarZzd.zza(zzaxjVar.zzc().zzj());
        zzaxkVarZzd.zzb(zzaxjVar.zzc().zza());
        zzaxkVarZzd.zzd(zzaxjVar.zzc().zzc());
        zzaxkVarZzd.zzc(zzaxjVar.zzc().zzb());
        return c.b(((zzaxm) zzaxkVarZzd.zzbr()).zzaV());
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
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrN = c.n(string);
            return zzaxm.zzi(zzgvy.zzv(bArrN, 0, bArrN.length), this.zzf ? zzgwq.zza() : zzgwq.zzb());
        } catch (zzgxv unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzaxj zzaxjVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                if (!zzfnq.zze(new File(zze(zzaxjVar.zzc().zzk()), "pcbc"), zzaxjVar.zzd().zzA())) {
                    zzi(4020, jCurrentTimeMillis);
                    return false;
                }
                String strZzf = zzf(zzaxjVar);
                SharedPreferences.Editor editorEdit = this.zzc.edit();
                editorEdit.putString(zzh(), strZzf);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    zzi(5015, jCurrentTimeMillis);
                } else {
                    zzi(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(zzaxj zzaxjVar, zzfnv zzfnvVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzaxm zzaxmVarZzk = zzk(1);
                String strZzk = zzaxjVar.zzc().zzk();
                if (zzaxmVarZzk != null && zzaxmVarZzk.zzk().equals(strZzk)) {
                    zzi(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileZze = zze(strZzk);
                if (fileZze.exists()) {
                    zzj(4023, jCurrentTimeMillis2, "d:" + (true != fileZze.isDirectory() ? "0" : "1") + ",f:" + (true != fileZze.isFile() ? "0" : "1"));
                    zzi(4015, jCurrentTimeMillis2);
                } else if (!fileZze.mkdirs()) {
                    zzj(4024, jCurrentTimeMillis2, "cw:".concat(true != fileZze.canWrite() ? "0" : "1"));
                    zzi(4015, jCurrentTimeMillis2);
                    return false;
                }
                File fileZze2 = zze(strZzk);
                File file = new File(fileZze2, "pcam.jar");
                File file2 = new File(fileZze2, "pcbc");
                if (!zzfnq.zze(file, zzaxjVar.zzf().zzA())) {
                    zzi(4016, jCurrentTimeMillis);
                    return false;
                }
                if (!zzfnq.zze(file2, zzaxjVar.zzd().zzA())) {
                    zzi(4017, jCurrentTimeMillis);
                    return false;
                }
                if (zzfnvVar != null && !zzfnvVar.zza(file)) {
                    zzi(4018, jCurrentTimeMillis);
                    zzfnq.zzd(fileZze2);
                    return false;
                }
                String strZzf = zzf(zzaxjVar);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                String string = this.zzc.getString(zzh(), null);
                SharedPreferences.Editor editorEdit = this.zzc.edit();
                editorEdit.putString(zzh(), strZzf);
                if (string != null) {
                    editorEdit.putString(zzg(), string);
                }
                if (!editorEdit.commit()) {
                    zzi(4019, jCurrentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                zzaxm zzaxmVarZzk2 = zzk(1);
                if (zzaxmVarZzk2 != null) {
                    hashSet.add(zzaxmVarZzk2.zzk());
                }
                zzaxm zzaxmVarZzk3 = zzk(2);
                if (zzaxmVarZzk3 != null) {
                    hashSet.add(zzaxmVarZzk3.zzk());
                }
                for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zzfnq.zzd(file3);
                    }
                }
                zzi(5014, jCurrentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzfno zzc(int i7) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzaxm zzaxmVarZzk = zzk(1);
                if (zzaxmVarZzk == null) {
                    zzi(4022, jCurrentTimeMillis);
                    return null;
                }
                File fileZze = zze(zzaxmVarZzk.zzk());
                File file = new File(fileZze, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileZze, "pcam");
                }
                File file2 = new File(fileZze, "pcbc");
                File file3 = new File(fileZze, "pcopt");
                zzi(5016, jCurrentTimeMillis);
                return new zzfno(zzaxmVarZzk, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(int i7) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzaxm zzaxmVarZzk = zzk(1);
                if (zzaxmVarZzk == null) {
                    zzi(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileZze = zze(zzaxmVarZzk.zzk());
                if (!new File(fileZze, "pcam.jar").exists()) {
                    zzi(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileZze, "pcbc").exists()) {
                    zzi(5019, jCurrentTimeMillis);
                    return true;
                }
                zzi(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
