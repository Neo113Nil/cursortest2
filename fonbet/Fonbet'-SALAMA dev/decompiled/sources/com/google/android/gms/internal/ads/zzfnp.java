package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;
import m3.c;

/* loaded from: classes.dex */
public final class zzfnp {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfnp(Context context, int i7) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfnq.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfnq.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i7;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        StringBuilder sb = new StringBuilder("FBAMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    private final String zzf() {
        StringBuilder sb = new StringBuilder("LATMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzaxj zzaxjVar, zzfnv zzfnvVar) {
        boolean z4;
        zzaxm zzb;
        zzaxm zzb2;
        String zzk = zzaxjVar.zzc().zzk();
        byte[] zzA = zzaxjVar.zzf().zzA();
        byte[] zzA2 = zzaxjVar.zzd().zzA();
        if (!TextUtils.isEmpty(zzk) && zzA2 != null && zzA2.length != 0) {
            zzfnq.zzd(this.zza);
            this.zza.mkdirs();
            zzfnq.zzc(zzk, this.zza).mkdirs();
            File zzb3 = zzfnq.zzb(zzk, "pcam.jar", this.zza);
            if ((zzA == null || zzA.length <= 0 || zzfnq.zze(zzb3, zzA)) && zzfnq.zze(zzfnq.zzb(zzk, "pcbc", this.zza), zzA2)) {
                File zzb4 = zzfnq.zzb(zzaxjVar.zzc().zzk(), "pcam.jar", this.zza);
                if (zzb4.exists() && zzfnvVar != null && !zzfnvVar.zza(zzb4)) {
                    return false;
                }
                String zzk2 = zzaxjVar.zzc().zzk();
                if (!TextUtils.isEmpty(zzk2)) {
                    File zzb5 = zzfnq.zzb(zzk2, "pcam.jar", this.zza);
                    File zzb6 = zzfnq.zzb(zzk2, "pcbc", this.zza);
                    File zzb7 = zzfnq.zzb(zzk2, "pcam.jar", zzd());
                    File zzb8 = zzfnq.zzb(zzk2, "pcbc", zzd());
                    if ((!zzb5.exists() || zzb5.renameTo(zzb7)) && zzb6.exists() && zzb6.renameTo(zzb8)) {
                        zzaxk zzd = zzaxm.zzd();
                        zzd.zze(zzaxjVar.zzc().zzk());
                        zzd.zza(zzaxjVar.zzc().zzj());
                        zzd.zzb(zzaxjVar.zzc().zza());
                        zzd.zzd(zzaxjVar.zzc().zzc());
                        zzd.zzc(zzaxjVar.zzc().zzb());
                        zzaxm zzaxmVar = (zzaxm) zzd.zzbr();
                        zzaxm zzb9 = zzb(1);
                        SharedPreferences.Editor edit = this.zzc.edit();
                        if (zzb9 != null && !zzaxmVar.zzk().equals(zzb9.zzk())) {
                            edit.putString(zze(), c.b(zzb9.zzaV()));
                        }
                        edit.putString(zzf(), c.b(zzaxmVar.zzaV()));
                        if (edit.commit()) {
                            z4 = true;
                            HashSet hashSet = new HashSet();
                            zzb = zzb(1);
                            if (zzb != null) {
                                hashSet.add(zzb.zzk());
                            }
                            zzb2 = zzb(2);
                            if (zzb2 != null) {
                                hashSet.add(zzb2.zzk());
                            }
                            for (File file : zzd().listFiles()) {
                                String name = file.getName();
                                if (!hashSet.contains(name)) {
                                    zzfnq.zzd(zzfnq.zzc(name, zzd()));
                                }
                            }
                            return z4;
                        }
                    }
                }
                z4 = false;
                HashSet hashSet2 = new HashSet();
                zzb = zzb(1);
                if (zzb != null) {
                }
                zzb2 = zzb(2);
                if (zzb2 != null) {
                }
                while (r4 < r1) {
                }
                return z4;
            }
        }
        return false;
    }

    public final zzaxm zzb(int i7) {
        String string = i7 == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] n2 = c.n(string);
            zzaxm zzh = zzaxm.zzh(zzgvy.zzv(n2, 0, n2.length));
            String zzk = zzh.zzk();
            File zzb = zzfnq.zzb(zzk, "pcam.jar", zzd());
            if (!zzb.exists()) {
                zzb = zzfnq.zzb(zzk, "pcam", zzd());
            }
            File zzb2 = zzfnq.zzb(zzk, "pcbc", zzd());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzh;
                }
            }
        } catch (zzgxv unused) {
        }
        return null;
    }

    public final zzfno zzc(int i7) {
        zzaxm zzb = zzb(1);
        if (zzb == null) {
            return null;
        }
        String zzk = zzb.zzk();
        File zzb2 = zzfnq.zzb(zzk, "pcam.jar", zzd());
        if (!zzb2.exists()) {
            zzb2 = zzfnq.zzb(zzk, "pcam", zzd());
        }
        return new zzfno(zzb, zzb2, zzfnq.zzb(zzk, "pcbc", zzd()), zzfnq.zzb(zzk, "pcopt", zzd()));
    }
}
