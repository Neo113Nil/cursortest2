package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzfny {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfnz zzc;
    private final zzfmc zzd;
    private final zzflx zze;
    private zzfnn zzf;
    private final Object zzg = new Object();

    public zzfny(Context context, zzfnz zzfnzVar, zzfmc zzfmcVar, zzflx zzflxVar) {
        this.zzb = context;
        this.zzc = zzfnzVar;
        this.zzd = zzfmcVar;
        this.zze = zzflxVar;
    }

    private final synchronized Class zzd(zzfno zzfnoVar) {
        try {
            String strZzk = zzfnoVar.zza().zzk();
            HashMap map = zza;
            Class cls = (Class) map.get(strZzk);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzfnoVar.zzc())) {
                    throw new zzfnx(2026, "VM did not pass signature verification");
                }
                try {
                    File fileZzb = zzfnoVar.zzb();
                    if (!fileZzb.exists()) {
                        fileZzb.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(zzfnoVar.zzc().getAbsolutePath(), fileZzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZzk, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e7) {
                    e = e7;
                    throw new zzfnx(2008, e);
                } catch (IllegalArgumentException e8) {
                    e = e8;
                    throw new zzfnx(2008, e);
                } catch (SecurityException e9) {
                    e = e9;
                    throw new zzfnx(2008, e);
                }
            } catch (GeneralSecurityException e10) {
                throw new zzfnx(2026, e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzfmf zza() {
        zzfnn zzfnnVar;
        synchronized (this.zzg) {
            zzfnnVar = this.zzf;
        }
        return zzfnnVar;
    }

    public final zzfno zzb() {
        synchronized (this.zzg) {
            try {
                zzfnn zzfnnVar = this.zzf;
                if (zzfnnVar == null) {
                    return null;
                }
                return zzfnnVar.zzf();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(zzfno zzfnoVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfnn zzfnnVar = new zzfnn(zzd(zzfnoVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfnoVar.zze(), null, new Bundle(), 2), zzfnoVar, this.zzc, this.zzd);
                if (!zzfnnVar.zzh()) {
                    throw new zzfnx(4000, "init failed");
                }
                int iZze = zzfnnVar.zze();
                if (iZze != 0) {
                    throw new zzfnx(4001, "ci: " + iZze);
                }
                synchronized (this.zzg) {
                    zzfnn zzfnnVar2 = this.zzf;
                    if (zzfnnVar2 != null) {
                        try {
                            zzfnnVar2.zzg();
                        } catch (zzfnx e7) {
                            this.zzd.zzc(e7.zza(), -1L, e7);
                        }
                        this.zzf = zzfnnVar;
                    } else {
                        this.zzf = zzfnnVar;
                    }
                    throw th;
                }
                this.zzd.zzd(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e8) {
                throw new zzfnx(2004, e8);
            }
        } catch (zzfnx e9) {
            this.zzd.zzc(e9.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e9);
            return false;
        } catch (Exception e10) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e10);
            return false;
        }
    }
}
