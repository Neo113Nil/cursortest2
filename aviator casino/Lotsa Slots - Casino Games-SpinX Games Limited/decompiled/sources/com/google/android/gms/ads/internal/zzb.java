package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzb {
    private final android.content.Context zza;
    private boolean zzb;
    private final com.google.android.gms.internal.ads.zzcdn zzc;
    private final com.google.android.gms.internal.ads.zzcak zzd = new com.google.android.gms.internal.ads.zzcak(false, java.util.Collections.emptyList());

    public zzb(android.content.Context context, com.google.android.gms.internal.ads.zzcdn zzcdnVar, com.google.android.gms.internal.ads.zzcak zzcakVar) {
        this.zza = context;
        this.zzc = zzcdnVar;
    }

    private final boolean zzd() {
        com.google.android.gms.internal.ads.zzcdn zzcdnVar = this.zzc;
        return (zzcdnVar != null && zzcdnVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final boolean zzb() {
        return !zzd() || this.zzb;
    }

    public final void zzc(java.lang.String str) {
        java.util.List<java.lang.String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            com.google.android.gms.internal.ads.zzcdn zzcdnVar = this.zzc;
            if (zzcdnVar != null) {
                zzcdnVar.zze(str, null, 3);
                return;
            }
            com.google.android.gms.internal.ads.zzcak zzcakVar = this.zzd;
            if (!zzcakVar.zza || (list = zzcakVar.zzb) == null) {
                return;
            }
            for (java.lang.String str2 : list) {
                if (!android.text.TextUtils.isEmpty(str2)) {
                    java.lang.String replace = str2.replace("{NAVIGATION_URL}", android.net.Uri.encode(str));
                    android.content.Context context = this.zza;
                    com.google.android.gms.ads.internal.zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzO(context, "", replace);
                }
            }
        }
    }
}
