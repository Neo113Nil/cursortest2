package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbtz {
    private final java.lang.Object zza = new java.lang.Object();
    private final java.lang.Object zzb = new java.lang.Object();
    private com.google.android.gms.internal.ads.zzbui zzc;
    private com.google.android.gms.internal.ads.zzbui zzd;

    private static final android.content.Context zzd(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final boolean zze(android.content.Context context) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkw.zzc.zze()).booleanValue()) {
            return false;
        }
        return com.google.android.gms.ads.internal.util.zzs.zzk(zzd(context)).zza().toLowerCase(java.util.Locale.ROOT).equals("ru");
    }

    public final com.google.android.gms.internal.ads.zzbui zza(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzfqj zzfqjVar) {
        com.google.android.gms.internal.ads.zzbui zzbuiVar;
        java.lang.String str;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                android.content.Context zzd = zzd(context);
                if (zze(context)) {
                    str = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzc);
                } else {
                    str = (java.lang.String) com.google.android.gms.internal.ads.zzbla.zza.zze();
                }
                this.zzd = new com.google.android.gms.internal.ads.zzbui(zzd, versionInfoParcel, str, zzfqjVar);
            }
            zzbuiVar = this.zzd;
        }
        return zzbuiVar;
    }

    public final com.google.android.gms.internal.ads.zzbui zzb(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzfqj zzfqjVar) {
        com.google.android.gms.internal.ads.zzbui zzbuiVar;
        java.lang.String str;
        synchronized (this.zza) {
            if (this.zzc == null) {
                if (zze(context)) {
                    str = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzc);
                } else if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkw.zzg.zze()).booleanValue()) {
                    str = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zza);
                } else {
                    str = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzb);
                }
                this.zzc = new com.google.android.gms.internal.ads.zzbui(zzd(context), versionInfoParcel, str, zzfqjVar);
            }
            zzbuiVar = this.zzc;
        }
        return zzbuiVar;
    }

    public final void zzc() {
        synchronized (this.zza) {
            com.google.android.gms.internal.ads.zzbui zzbuiVar = this.zzc;
            if (zzbuiVar != null) {
                zzbuiVar.zzc();
                this.zzc = null;
            }
        }
    }
}
