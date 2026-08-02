package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdg extends com.google.android.gms.internal.identity.zzs {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzdg(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.identity.zzt
    public final void zzb(int i, java.lang.String[] strArr) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(new com.google.android.gms.common.api.Status(com.google.android.gms.location.GeofenceStatusCodes.zza(i)), this.zza);
    }

    @Override // com.google.android.gms.internal.identity.zzt
    public final void zzc(int i, java.lang.String[] strArr) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(new com.google.android.gms.common.api.Status(com.google.android.gms.location.GeofenceStatusCodes.zza(i)), this.zza);
    }

    @Override // com.google.android.gms.internal.identity.zzt
    public final void zzd(int i, android.app.PendingIntent pendingIntent) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(new com.google.android.gms.common.api.Status(com.google.android.gms.location.GeofenceStatusCodes.zza(i)), this.zza);
    }
}
