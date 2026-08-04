package com.google.android.gms.internal.ads;

import E2.o;
import I2.P;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzekg implements zzesg {
    public final Context zza;
    public final com.google.android.gms.ads.internal.client.zzr zzb;
    public final List zzc;

    public zzekg(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, List list) {
        this.zza = context;
        this.zzb = zzrVar;
        this.zzc = list;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final void zzb(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        zzcts zzctsVar = (zzcts) obj;
        if (((Boolean) zzbeb.zza.zze()).booleanValue()) {
            Bundle bundle = new Bundle();
            P p5 = o.f1952C.f1957c;
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    className = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle.putString("activity", className);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("width", this.zzb.f10775e);
            bundle2.putInt("height", this.zzb.f10772b);
            bundle.putBundle(RRWebVideoEvent.JsonKeys.SIZE, bundle2);
            if (!this.zzc.isEmpty()) {
                List list = this.zzc;
                bundle.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            zzctsVar.zza.putBundle("view_hierarchy", bundle);
        }
    }
}
