package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbaj {
    protected volatile java.lang.Boolean zzb;
    private final com.google.android.gms.internal.ads.zzbbs zzc;
    private static final android.os.ConditionVariable zzd = new android.os.ConditionVariable();
    protected static volatile com.google.android.gms.internal.ads.zzfzc zza = null;
    private static volatile java.util.Random zze = null;

    public zzbaj(com.google.android.gms.internal.ads.zzbbs zzbbsVar) {
        this.zzc = zzbbsVar;
        zzbbsVar.zzd().execute(new com.google.android.gms.internal.ads.zzbai(this));
    }

    public static final int zzd() {
        try {
            return java.util.concurrent.ThreadLocalRandom.current().nextInt();
        } catch (java.lang.RuntimeException unused) {
            if (zze == null) {
                synchronized (com.google.android.gms.internal.ads.zzbaj.class) {
                    if (zze == null) {
                        zze = new java.util.Random();
                    }
                }
            }
            return zze.nextInt();
        }
    }

    public final void zza(int i, int i2, long j, java.lang.String str, java.lang.Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            com.google.android.gms.internal.ads.zzaws zza2 = com.google.android.gms.internal.ads.zzaww.zza();
            zza2.zza(this.zzc.zza.getPackageName());
            zza2.zzb(j);
            if (str != null) {
                zza2.zze(str);
            }
            if (exc != null) {
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                exc.printStackTrace(new java.io.PrintWriter(stringWriter));
                zza2.zzc(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            com.google.android.gms.internal.ads.zzfzb zza3 = zza.zza(((com.google.android.gms.internal.ads.zzaww) zza2.zzbu()).zzaN());
            zza3.zzc(i);
            if (i2 != -1) {
                zza3.zzb(i2);
            }
            zza3.zza();
        } catch (java.lang.Exception unused) {
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbbs zzb() {
        return this.zzc;
    }
}
