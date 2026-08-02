package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.firebase.messaging.Constants;
import kotlin.time.DurationKt;

/* loaded from: classes4.dex */
public final class zzx {
    private final zzic zza;

    public zzx(zzic zzicVar) {
        this.zza = zzicVar;
    }

    @WorkerThread
    public final void zza() {
        zzic zzicVar = this.zza;
        zzicVar.zzaW().zzg();
        if (zze()) {
            if (zzd()) {
                zzicVar.zzd().zzr.zzb(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                zzicVar.zzj().zzF("auto", "_cmpx", bundle);
            } else {
                String zza = zzicVar.zzd().zzr.zza();
                if (TextUtils.isEmpty(zza)) {
                    zzicVar.zzaV().zzc().zza("Cache still valid but referrer not found");
                } else {
                    long zza2 = zzicVar.zzd().zzs.zza() / DurationKt.MILLIS_IN_HOUR;
                    Uri parse = Uri.parse(zza);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (zza2 - 1) * DurationKt.MILLIS_IN_HOUR);
                    Object obj = pair.first;
                    zzicVar.zzj().zzF(obj == null ? "app" : (String) obj, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, (Bundle) pair.second);
                }
                zzicVar.zzd().zzr.zzb(null);
            }
            zzicVar.zzd().zzs.zzb(0L);
        }
    }

    @WorkerThread
    public final void zzb(String str, Bundle bundle) {
        String uri;
        zzic zzicVar = this.zza;
        zzicVar.zzaW().zzg();
        if (zzicVar.zzB()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        zzicVar.zzd().zzr.zzb(uri);
        zzicVar.zzd().zzs.zzb(zzicVar.zzaZ().currentTimeMillis());
    }

    public final void zzc() {
        if (zze() && zzd()) {
            this.zza.zzd().zzr.zzb(null);
        }
    }

    public final boolean zzd() {
        if (!zze()) {
            return false;
        }
        zzic zzicVar = this.zza;
        return zzicVar.zzaZ().currentTimeMillis() - zzicVar.zzd().zzs.zza() > zzicVar.zzc().zzl(null, zzfy.zzaj);
    }

    public final boolean zze() {
        return this.zza.zzd().zzs.zza() > 0;
    }
}
