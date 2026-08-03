package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfyz {
    private static final java.util.HashMap zza = new java.util.HashMap();
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzfza zzc;
    private final com.google.android.gms.internal.ads.zzfxg zzd;
    private final com.google.android.gms.internal.ads.zzfxb zze;
    private final boolean zzf;
    private com.google.android.gms.internal.ads.zzfyo zzg;
    private final java.lang.Object zzh = new java.lang.Object();

    public zzfyz(android.content.Context context, com.google.android.gms.internal.ads.zzfza zzfzaVar, com.google.android.gms.internal.ads.zzfxg zzfxgVar, com.google.android.gms.internal.ads.zzfxb zzfxbVar, boolean z) {
        this.zzb = context;
        this.zzc = zzfzaVar;
        this.zzd = zzfxgVar;
        this.zze = zzfxbVar;
        this.zzf = z;
    }

    private final synchronized java.lang.Class zzd(com.google.android.gms.internal.ads.zzfyp zzfypVar) throws com.google.android.gms.internal.ads.zzfyy {
        if (zzfypVar.zza() == null) {
            throw new com.google.android.gms.internal.ads.zzfyy(4010, "mc");
        }
        java.lang.String zza2 = zzfypVar.zza().zza();
        java.util.HashMap hashMap = zza;
        java.lang.Class cls = (java.lang.Class) hashMap.get(zza2);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfypVar.zzb())) {
                throw new com.google.android.gms.internal.ads.zzfyy(2026, "VM did not pass signature verification");
            }
            try {
                java.io.File zzc = zzfypVar.zzc();
                if (!zzc.exists()) {
                    zzc.mkdirs();
                }
                java.lang.Class loadClass = new dalvik.system.DexClassLoader(zzfypVar.zzb().getAbsolutePath(), zzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zza2, loadClass);
                return loadClass;
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalArgumentException | java.lang.SecurityException e) {
                throw new com.google.android.gms.internal.ads.zzfyy(2008, e);
            }
        } catch (java.security.GeneralSecurityException e2) {
            throw new com.google.android.gms.internal.ads.zzfyy(2026, e2);
        }
    }

    public final boolean zza(com.google.android.gms.internal.ads.zzfyp zzfypVar) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            try {
                com.google.android.gms.internal.ads.zzfyo zzfyoVar = new com.google.android.gms.internal.ads.zzfyo(zzd(zzfypVar).getDeclaredConstructor(android.content.Context.class, java.lang.String.class, byte[].class, java.lang.Object.class, android.os.Bundle.class, java.lang.Integer.TYPE).newInstance(this.zzb, "msa-r", zzfypVar.zzd(), null, new android.os.Bundle(), 2), zzfypVar, this.zzc, this.zzd, this.zzf);
                if (!zzfyoVar.zzf()) {
                    throw new com.google.android.gms.internal.ads.zzfyy(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE, "init failed");
                }
                int zzh = zzfyoVar.zzh();
                if (zzh != 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzh).length() + 4);
                    sb.append("ci: ");
                    sb.append(zzh);
                    throw new com.google.android.gms.internal.ads.zzfyy(4001, sb.toString());
                }
                synchronized (this.zzh) {
                    com.google.android.gms.internal.ads.zzfyo zzfyoVar2 = this.zzg;
                    if (zzfyoVar2 != null) {
                        try {
                            zzfyoVar2.zzg();
                        } catch (com.google.android.gms.internal.ads.zzfyy e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                    }
                    this.zzg = zzfyoVar;
                }
                this.zzd.zzb(3000, java.lang.System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (java.lang.Exception e2) {
                throw new com.google.android.gms.internal.ads.zzfyy(2004, e2);
            }
        } catch (com.google.android.gms.internal.ads.zzfyy e3) {
            this.zzd.zzc(e3.zza(), java.lang.System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (java.lang.Exception e4) {
            this.zzd.zzc(4010, java.lang.System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }

    public final com.google.android.gms.internal.ads.zzfxj zzb() {
        com.google.android.gms.internal.ads.zzfyo zzfyoVar;
        synchronized (this.zzh) {
            zzfyoVar = this.zzg;
        }
        return zzfyoVar;
    }

    public final com.google.android.gms.internal.ads.zzfyp zzc() {
        synchronized (this.zzh) {
            com.google.android.gms.internal.ads.zzfyo zzfyoVar = this.zzg;
            if (zzfyoVar == null) {
                return null;
            }
            return zzfyoVar.zze();
        }
    }
}
