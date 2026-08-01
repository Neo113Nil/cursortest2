package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgab {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzgac zzc;
    private final zzfyi zzd;
    private final zzfyd zze;
    private final boolean zzf;
    private zzfzq zzg;
    private final Object zzh = new Object();

    public zzgab(Context context, zzgac zzgacVar, zzfyi zzfyiVar, zzfyd zzfydVar, boolean z) {
        this.zzb = context;
        this.zzc = zzgacVar;
        this.zzd = zzfyiVar;
        this.zze = zzfydVar;
        this.zzf = z;
    }

    private final synchronized Class zzd(zzfzr zzfzrVar) throws zzgaa {
        if (zzfzrVar.zza() == null) {
            throw new zzgaa(4010, "mc");
        }
        String zza2 = zzfzrVar.zza().zza();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zza2);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfzrVar.zzb())) {
                throw new zzgaa(2026, "VM did not pass signature verification");
            }
            try {
                File zzc = zzfzrVar.zzc();
                if (!zzc.exists()) {
                    zzc.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzfzrVar.zzb().getAbsolutePath(), zzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zza2, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzgaa(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzgaa(2026, e2);
        }
    }

    public final boolean zza(zzfzr zzfzrVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfzq zzfzqVar = new zzfzq(zzd(zzfzrVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfzrVar.zzd(), null, new Bundle(), 2), zzfzrVar, this.zzc, this.zzd, this.zzf);
                if (!zzfzqVar.zzf()) {
                    throw new zzgaa(4000, "init failed");
                }
                int zzh = zzfzqVar.zzh();
                if (zzh != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzh).length() + 4);
                    sb.append("ci: ");
                    sb.append(zzh);
                    throw new zzgaa(4001, sb.toString());
                }
                synchronized (this.zzh) {
                    zzfzq zzfzqVar2 = this.zzg;
                    if (zzfzqVar2 != null) {
                        try {
                            zzfzqVar2.zzg();
                        } catch (zzgaa e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                    }
                    this.zzg = zzfzqVar;
                }
                this.zzd.zzb(3000, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzgaa(2004, e2);
            }
        } catch (zzgaa e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }

    public final zzfyl zzb() {
        zzfzq zzfzqVar;
        synchronized (this.zzh) {
            zzfzqVar = this.zzg;
        }
        return zzfzqVar;
    }

    public final zzfzr zzc() {
        synchronized (this.zzh) {
            zzfzq zzfzqVar = this.zzg;
            if (zzfzqVar == null) {
                return null;
            }
            return zzfzqVar.zze();
        }
    }
}
