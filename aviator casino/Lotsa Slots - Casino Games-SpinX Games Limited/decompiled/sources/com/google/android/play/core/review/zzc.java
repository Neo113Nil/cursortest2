package com.google.android.play.core.review;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes4.dex */
final class zzc extends android.os.ResultReceiver {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzc(com.google.android.play.core.review.zzd zzdVar, android.os.Handler handler, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.zza = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, android.os.Bundle bundle) {
        this.zza.trySetResult(null);
    }
}
