package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzx {
    private final com.google.android.gms.measurement.internal.zzib zza;

    public zzx(com.google.android.gms.measurement.internal.zzib zzibVar) {
        this.zza = zzibVar;
    }

    final void zza() {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zza;
        zzibVar.zzaW().zzg();
        if (zze()) {
            if (zzd()) {
                zzibVar.zzd().zzr.zzb(null);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                zzibVar.zzj().zzF("auto", "_cmpx", bundle);
            } else {
                java.lang.String zza = zzibVar.zzd().zzr.zza();
                if (android.text.TextUtils.isEmpty(zza)) {
                    zzibVar.zzaV().zzc().zza("Cache still valid but referrer not found");
                } else {
                    long zza2 = zzibVar.zzd().zzs.zza() / 3600000;
                    android.net.Uri parse = android.net.Uri.parse(zza);
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    android.util.Pair pair = new android.util.Pair(parse.getPath(), bundle2);
                    for (java.lang.String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((android.os.Bundle) pair.second).putLong("_cc", (zza2 - 1) * 3600000);
                    zzibVar.zzj().zzF(pair.first == null ? "app" : (java.lang.String) pair.first, com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, (android.os.Bundle) pair.second);
                }
                zzibVar.zzd().zzr.zzb(null);
            }
            zzibVar.zzd().zzs.zzb(0L);
        }
    }

    final void zzb(java.lang.String str, android.os.Bundle bundle) {
        java.lang.String uri;
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zza;
        zzibVar.zzaW().zzg();
        if (zzibVar.zzB()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            android.net.Uri.Builder builder = new android.net.Uri.Builder();
            builder.path(str);
            for (java.lang.String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (android.text.TextUtils.isEmpty(uri)) {
            return;
        }
        zzibVar.zzd().zzr.zzb(uri);
        zzibVar.zzd().zzs.zzb(zzibVar.zzaZ().currentTimeMillis());
    }

    final void zzc() {
        if (zze() && zzd()) {
            this.zza.zzd().zzr.zzb(null);
        }
    }

    final boolean zzd() {
        if (!zze()) {
            return false;
        }
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zza;
        return zzibVar.zzaZ().currentTimeMillis() - zzibVar.zzd().zzs.zza() > zzibVar.zzc().zzl(null, com.google.android.gms.measurement.internal.zzfx.zzaj);
    }

    final boolean zze() {
        return this.zza.zzd().zzs.zza() > 0;
    }
}
