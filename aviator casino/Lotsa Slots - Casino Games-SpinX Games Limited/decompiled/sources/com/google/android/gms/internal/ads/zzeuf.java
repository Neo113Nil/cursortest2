package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeuf implements com.google.android.gms.internal.ads.zzfci {
    public final android.content.Context zza;
    public final com.google.android.gms.ads.internal.client.zzr zzb;
    public final java.util.List zzc;

    public zzeuf(android.content.Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, java.util.List list) {
        this.zza = context;
        this.zzb = zzrVar;
        this.zzc = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks;
        android.app.ActivityManager.RunningTaskInfo runningTaskInfo;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkt.zza.zze()).booleanValue()) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            com.google.android.gms.ads.internal.zzt.zzc();
            java.lang.String str = null;
            try {
                android.app.ActivityManager activityManager = (android.app.ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    str = runningTaskInfo.topActivity.getClassName();
                }
            } catch (java.lang.Exception unused) {
            }
            bundle2.putString("activity", str);
            android.os.Bundle bundle3 = new android.os.Bundle();
            com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzb;
            bundle3.putInt("width", zzrVar.zze);
            bundle3.putInt("height", zzrVar.zzb);
            bundle2.putBundle("size", bundle3);
            java.util.List list = this.zzc;
            if (!list.isEmpty()) {
                bundle2.putParcelableArray("parents", (android.os.Parcelable[]) list.toArray(new android.os.Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
