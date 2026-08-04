package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;
import p090m3.c;

/* JADX INFO: loaded from: classes.dex */
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

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    public final boolean zza(zzaxj zzaxjVar, zzfnv zzfnvVar) {
        boolean z4;
        String strZzk = zzaxjVar.zzc().zzk();
        byte[] bArrZzA = zzaxjVar.zzf().zzA();
        byte[] bArrZzA2 = zzaxjVar.zzd().zzA();
        if (!TextUtils.isEmpty(strZzk) && bArrZzA2 != null && bArrZzA2.length != 0) {
            zzfnq.zzd(this.zza);
            this.zza.mkdirs();
            zzfnq.zzc(strZzk, this.zza).mkdirs();
            File fileZzb = zzfnq.zzb(strZzk, "pcam.jar", this.zza);
            if ((bArrZzA == null || bArrZzA.length <= 0 || zzfnq.zze(fileZzb, bArrZzA)) && zzfnq.zze(zzfnq.zzb(strZzk, "pcbc", this.zza), bArrZzA2)) {
                File fileZzb2 = zzfnq.zzb(zzaxjVar.zzc().zzk(), "pcam.jar", this.zza);
                if (fileZzb2.exists() && zzfnvVar != null && !zzfnvVar.zza(fileZzb2)) {
                    return false;
                }
                String strZzk2 = zzaxjVar.zzc().zzk();
                if (TextUtils.isEmpty(strZzk2)) {
                    z4 = false;
                } else {
                    File fileZzb3 = zzfnq.zzb(strZzk2, "pcam.jar", this.zza);
                    File fileZzb4 = zzfnq.zzb(strZzk2, "pcbc", this.zza);
                    File fileZzb5 = zzfnq.zzb(strZzk2, "pcam.jar", zzd());
                    File fileZzb6 = zzfnq.zzb(strZzk2, "pcbc", zzd());
                    if ((!fileZzb3.exists() || fileZzb3.renameTo(fileZzb5)) && fileZzb4.exists() && fileZzb4.renameTo(fileZzb6)) {
                        zzaxk zzaxkVarZzd = zzaxm.zzd();
                        zzaxkVarZzd.zze(zzaxjVar.zzc().zzk());
                        zzaxkVarZzd.zza(zzaxjVar.zzc().zzj());
                        zzaxkVarZzd.zzb(zzaxjVar.zzc().zza());
                        zzaxkVarZzd.zzd(zzaxjVar.zzc().zzc());
                        zzaxkVarZzd.zzc(zzaxjVar.zzc().zzb());
                        zzaxm zzaxmVar = (zzaxm) zzaxkVarZzd.zzbr();
                        zzaxm zzaxmVarZzb = zzb(1);
                        SharedPreferences.Editor editorEdit = this.zzc.edit();
                        if (zzaxmVarZzb != null && !zzaxmVar.zzk().equals(zzaxmVarZzb.zzk())) {
                            editorEdit.putString(zze(), c.b(zzaxmVarZzb.zzaV()));
                        }
                        editorEdit.putString(zzf(), c.b(zzaxmVar.zzaV()));
                        if (editorEdit.commit()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                }
                HashSet hashSet = new HashSet();
                zzaxm zzaxmVarZzb2 = zzb(1);
                if (zzaxmVarZzb2 != null) {
                    hashSet.add(zzaxmVarZzb2.zzk());
                }
                zzaxm zzaxmVarZzb3 = zzb(2);
                if (zzaxmVarZzb3 != null) {
                    hashSet.add(zzaxmVarZzb3.zzk());
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
        return false;
    }

    public final zzaxm zzb(int i7) {
        String string = i7 == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrN = c.n(string);
            zzaxm zzaxmVarZzh = zzaxm.zzh(zzgvy.zzv(bArrN, 0, bArrN.length));
            String strZzk = zzaxmVarZzh.zzk();
            File fileZzb = zzfnq.zzb(strZzk, "pcam.jar", zzd());
            if (!fileZzb.exists()) {
                fileZzb = zzfnq.zzb(strZzk, "pcam", zzd());
            }
            File fileZzb2 = zzfnq.zzb(strZzk, "pcbc", zzd());
            if (fileZzb.exists() && fileZzb2.exists()) {
                return zzaxmVarZzh;
            }
            return null;
        } catch (zzgxv unused) {
        }
    }

    public final zzfno zzc(int i7) {
        zzaxm zzaxmVarZzb = zzb(1);
        if (zzaxmVarZzb == null) {
            return null;
        }
        String strZzk = zzaxmVarZzb.zzk();
        File fileZzb = zzfnq.zzb(strZzk, "pcam.jar", zzd());
        if (!fileZzb.exists()) {
            fileZzb = zzfnq.zzb(strZzk, "pcam", zzd());
        }
        return new zzfno(zzaxmVarZzb, fileZzb, zzfnq.zzb(strZzk, "pcbc", zzd()), zzfnq.zzb(strZzk, "pcopt", zzd()));
    }
}
