package com.google.android.gms.internal.p001authapiphone;

/* loaded from: classes8.dex */
public final class zzq extends com.google.android.gms.internal.p001authapiphone.zzf {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzq(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzg
    public final void zzb(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.logging.Logger logger;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        logger = com.google.android.gms.internal.p001authapiphone.zzr.zzb;
        logger.i("InternalMissedCallRetrieverClient#onStartUserConsentResult invoked with status: %s", java.lang.Integer.valueOf(status.getStatusCode()));
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, pendingIntent, this.zza);
    }
}
