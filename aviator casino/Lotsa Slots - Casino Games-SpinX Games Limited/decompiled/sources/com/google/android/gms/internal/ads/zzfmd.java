package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfmd {
    static com.google.android.gms.tasks.Task zza;
    public static com.google.android.gms.appset.AppSetIdClient zzb;
    private static final java.lang.Object zzc = new java.lang.Object();

    public static void zza(android.content.Context context, boolean z) {
        synchronized (zzc) {
            if (zzb == null) {
                zzb = com.google.android.gms.appset.AppSet.getClient(context);
            }
            com.google.android.gms.tasks.Task task = zza;
            if (task == null || ((task.isComplete() && !zza.isSuccessful()) || (z && zza.isComplete()))) {
                try {
                    zza = ((com.google.android.gms.appset.AppSetIdClient) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzb, "the appSetIdClient shouldn't be null")).getAppSetIdInfo();
                } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                    java.lang.String message = e.getMessage();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 31);
                    sb.append("Failed to get app set ID info: ");
                    sb.append(message);
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    zza = com.google.android.gms.tasks.Tasks.forException(e);
                }
            }
        }
    }

    public static com.google.android.gms.tasks.Task zzb(android.content.Context context) {
        com.google.android.gms.tasks.Task task;
        zza(context, false);
        synchronized (zzc) {
            task = zza;
        }
        return task;
    }
}
